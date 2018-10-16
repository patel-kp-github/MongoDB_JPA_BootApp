#install mongoDB
#set env file
#run mongo DB by command
mongod
#connect mongoDB by command
mongo
#put some data by below commands:
1) use test
2)db.createCollection("snippet");
3)db.snippet.insertMany([
  {
    "name" : "Spot",
    "species" : "dog",
    "breed" : "pitbull"
  },
  {
    "name" : "Daisy",
    "species" : "cat",
    "breed" : "calico"
  },
  {
    "name" : "Bella",
    "species" : "dog",
    "breed" : "australian shepard"
  }
]);

#run boot application
#Hit URL localhost:8090/snippet 