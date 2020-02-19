CREATE TABLE "myfirstmodule$data" (
	"myfirstmodule$helperid" BIGINT NOT NULL,
	"myfirstmodule$entityid" BIGINT NOT NULL,
	PRIMARY KEY("myfirstmodule$helperid","myfirstmodule$entityid"),
	CONSTRAINT "uniq_myfirstmodule$data_myfirstmodule$helperid" UNIQUE ("myfirstmodule$helperid"));
CREATE INDEX "idx_myfirstmodule$data_myfirstmodule$entity_myfirstmodule$helper" ON "myfirstmodule$data" ("myfirstmodule$entityid" ASC,"myfirstmodule$helperid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('4b49dfee-23f4-47a6-8cba-a04f7fa4e9b8', 
'MyFirstModule.data', 
'myfirstmodule$data', 
'0bbadc17-99cc-4f9c-9b55-5344f12c60fe', 
'e860facb-ed58-4f7a-84bd-f0d5972e7b07', 
'myfirstmodule$helperid', 
'myfirstmodule$entityid', 
'idx_myfirstmodule$data_myfirstmodule$entity_myfirstmodule$helper');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_myfirstmodule$data_myfirstmodule$helperid', 
'4b49dfee-23f4-47a6-8cba-a04f7fa4e9b8', 
'e1b4454d-4304-3f59-bdf8-b1ca801e74b9');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20200218 12:15:18';
