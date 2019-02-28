package app.tk.mongo;

import com.mongodb.*;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.internal.MongoClientImpl;
import org.bson.BsonDocument;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
import org.bson.conversions.Bson;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.function.Consumer;

import static com.mongodb.client.model.Filters.eq;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;

public class ConnectToMongoDB {

    public static void main(String[] args) {


        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));

        MongoCredential credential = MongoCredential.createCredential("m001-student", "test", "m001-mongodb-basics".toCharArray());

       // String connString = "mongodb://mongodb-shard-00-00-lrbup.mongodb.net:27017,mongodb-shard-00-01-lrbup.mongodb.net:27017,mongodb-shard-00-02-lrbup.mongodb.net:27017/?replicaSet=MONGODB-shard-0 --ssl --authenticationDatabase  admin --username m001-student --password m001-mongodb-basics";
        String connString = "mongodb+srv://m001-student:m001-mongodb-basics@mongodb-lrbup.mongodb.net/test?retryWrites=true";
//        String connString = "mongodb://mongodb-lrbup.mongodb.net:27017/test?retryWrites=true";
        ConnectionString connectionString = new ConnectionString(connString);

        MongoClientSettings settings = MongoClientSettings.builder()
                .codecRegistry(pojoCodecRegistry)
                //.applyToClusterSettings(builder ->
                //                        builder.hosts(Arrays.asList(new ServerAddress("mongodb-shard-00-00-lrbup.mongodb.net", 27017))))
                .applyConnectionString(connectionString)
                //.credential(credential)
                .build();


        MongoClient mongoClient = MongoClients.create(settings);

        MongoDatabase db = mongoClient.getDatabase("video");
        MongoCollection<MovieDetail> collection = db.getCollection("movieDetails", MovieDetail.class);


        //collection.find().forEach(consume);

       /* Consumer<MovieDetail> consume = new Consumer<MovieDetail>() {
            @Override
            public void accept(MovieDetail movieDetail) {
                System.out.println(movieDetail);
            }
        };*/
        Consumer<MovieDetail> consume = movieDetail -> System.out.println(movieDetail);

        MovieDetail movie = collection.find(eq("year",1968)).first();

        System.out.println(movie);

        //collection.insertOne(new MovieDetail());

    }
}
