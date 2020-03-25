CREATE TABLE `sku_data` (
	`SKU` INT NOT NULL AUTO_INCREMENT,
	`NAME` VARCHAR(100) NOT NULL,
	`LOCATION` VARCHAR(100) NOT NULL,
	`DEPARTMENT` VARCHAR(100) NOT NULL,
	`CATEGORY` VARCHAR(100) NOT NULL,
	`SubCategory` VARCHAR(150) NOT NULL,
	PRIMARY KEY (`SKU`)
);

CREATE TABLE `meta_data` (
	`Location` VARCHAR(100) NOT NULL,
	`Department` VARCHAR(100) NOT NULL,
	`Category` VARCHAR(100) NOT NULL,
	`SubCategory` VARCHAR(150) NOT NULL
);

insert into meta_data values ('Perimeter','Bakery','BakeryBread','Bagels');
insert into meta_data values ('Perimeter','Bakery','BakeryBread','Baking or Breading Products');
insert into meta_data values ('Perimeter','Bakery','BakeryBread','English Muffins or Biscuits');
insert into meta_data values ('Perimeter','Bakery','BakeryBread','Flatbreads');
insert into meta_data values ('Perimeter','Bakery','In Store Bakery','Breakfast Cake or Sweet Roll');
insert into meta_data values ('Perimeter','Bakery','In Store Bakery','Cakes');
insert into meta_data values ('Perimeter','Bakery','In Store Bakery','Pies');
insert into meta_data values ('Perimeter','Bakery','In Store Bakery','Seasonal');
insert into meta_data values ('Center','Dairy','Cheese',' Cheese Sauce');
insert into meta_data values ('Center','Dairy','Cheese','Specialty Cheese');
insert into meta_data values ('Center','Dairy','Cream or Creamer','Dairy Alternative Creamer');
insert into meta_data values ('Center','Dairy','Cream or Creamer','Whipping Creams');
insert into meta_data values ('Center','Dairy','Cultured','Cottage Cheese');
insert into meta_data values ('Center','Dairy','RefrigeratedBaking','Refrigerated Breads');
insert into meta_data values ('Center','Dairy','RefrigeratedBaking','Refrigerated English Muffins and Biscuits');
insert into meta_data values ('Center','Dairy','RefrigeratedBaking','Refrigerated Hand Held Sweets');
insert into meta_data values ('Center','Dairy','RefrigeratedBaking','Refrigerated Pie Crust');
insert into meta_data values ('Center','Dairy','RefrigeratedBaking','Refrigerated Sweet Breakfast Baked Goods');
insert into meta_data values ('Perimeter','Deli and Foodservice','Self Service Deli Cold','Beverages');
insert into meta_data values ('Perimeter','Deli and Foodservice','ServiceDeli','Cheese All Other');
insert into meta_data values ('Perimeter','Deli and Foodservice','ServiceDeli','Cheese American');
insert into meta_data values ('Perimeter','Floral','Bouquets and Cut Flowers','Bouquets and Cut Flowers');
insert into meta_data values ('Perimeter','Floral','Gifts','Gifts');
insert into meta_data values ('Perimeter','Floral','Plants','Plants');
insert into meta_data values ('Center','Frozen','FrozenBake','Bread or Dough Products Frozen');
insert into meta_data values ('Center','Frozen','FrozenBake','Breakfast Cake or Sweet Roll Frozen');
insert into meta_data values ('Center','Frozen','FrozenBreakfast','Frozen Breakfast Entrees');
insert into meta_data values ('Center','Frozen','FrozenBreakfast','Frozen Breakfast Sandwich');
insert into meta_data values ('Center','Frozen','FrozenBreakfast','Frozen Egg Substitutes');
insert into meta_data values ('Center','Frozen','FrozenBreakfast','Frozen Syrup Carriers');
insert into meta_data values ('Center','Frozen','Frozen Desserts or Fruit and Toppings','Pies Frozen');
insert into meta_data values ('Center','Frozen','FrozenJuice','Frozen Apple Juice');
insert into meta_data values ('Center','Frozen','FrozenJuice','Frozen Fruit Drink Mixers');
insert into meta_data values ('Center','Frozen','FrozenJuice','Frozen Fruit Juice All Other');
insert into meta_data values ('Center','GM','AudioVideo','Audio');
insert into meta_data values ('Center','GM','AudioVideo','Video DVD');
insert into meta_data values ('Center','GM','AudioVideo','Video VHS');
insert into meta_data values ('Center','GM','Housewares','Bedding');
insert into meta_data values ('Center','GM','Housewares','Candles');
insert into meta_data values ('Center','GM','Housewares','Collectibles and Gifts');
insert into meta_data values ('Center','GM','Housewares','Flashlights');
insert into meta_data values ('Center','GM','Housewares','Frames');
insert into meta_data values ('Center','GM','Insect and Rodent','Indoor Repellants or Traps');
insert into meta_data values ('Center','GM','Insect and Rodent','Outdoor Repellants or Traps');
insert into meta_data values ('Center','GM','KitchenAccessories','Kitchen Accessories');
insert into meta_data values ('Center','GM','Laundry','Bleach Liquid');
insert into meta_data values ('Center','GM','Laundry','Bleach Powder');
insert into meta_data values ('Center','GM','Laundry','Fabric Softener Liquid');
insert into meta_data values ('Center','GM','Laundry','Fabric Softener Sheets');
insert into meta_data values ('Center','Grocery','BakingIngredients','Dry or Canned Milk');
insert into meta_data values ('Center','Grocery','BakingIngredients','Food Coloring');
insert into meta_data values ('Center','Grocery','Spices','Salt Cooking or Edible or Seasoned');
insert into meta_data values ('Center','Grocery','Spices','Salt Substitute');
insert into meta_data values ('Center','Grocery','Spices','Seasoning Dry');
insert into meta_data values ('Center','Grocery','StuffingProducts','Stuffing Products');
insert into meta_data values ('Perimeter','Seafood','FrozenShellfish','Frozen Shellfish');
insert into meta_data values ('Perimeter','Seafood','OtherSeafood','All OtherSeafood');
insert into meta_data values ('Perimeter','Seafood','OtherSeafood','Prepared Seafood Entrees');
insert into meta_data values ('Perimeter','Seafood','OtherSeafood','Seafood Salads');
insert into meta_data values ('Perimeter','Seafood','OtherSeafood','Smoked Fish');
insert into meta_data values ('Perimeter','Seafood','OtherSeafood','Seafood Breading Sauces Dips');



insert into sku_data values (1,'SKUDESC1','Perimeter','Bakery','BakeryBread','Bagels');
insert into sku_data values (2,'SKUDESC2','Perimeter','Deli and Foodservice','Self Service Deli Cold','Beverages');
insert into sku_data values (3,'SKUDESC3','Perimeter','Floral','Bouquets and Cut Flowers','Bouquets and Cut Flowers');
insert into sku_data values (4,'SKUDESC4','Perimeter','Deli and Foodservice','ServiceDeli','All Other');
insert into sku_data values (5,'SKUDESC5','Center','Frozen','Frozen Bake','Bread or Dough Products Frozen');
insert into sku_data values (6,'SKUDESC6','Center','Grocery','Crackers','Rice Cakes');
insert into sku_data values (7,'SKUDESC7','Center','GM','AudioVideo','Audio');
insert into sku_data values (8,'SKUDESC8','Center','GM','AudioVideo','Video DVD');
insert into sku_data values (9,'SKUDESC9','Perimeter','GM','Housewares','Beeding');
insert into sku_data values (10,'SKUDESC10','Perimeter','Seafood','Frozen Shellfish','Frozen Shellfish');
insert into sku_data values (11,'SKUDESC11','Perimeter','Seafood','OtherSeafood','All Other Seafood');
insert into sku_data values (12,'SKUDESC12','Perimeter','Seafood','OtherSeafood','Prepared Seafood Entrees');
insert into sku_data values (13,'SKUDESC13','Perimeter','Seafood','OtherSeafood','Salads');
insert into sku_data values (14,'SKUDESC14','Perimeter','Bakery','Bakery Bread','Bagels');
insert into sku_data values (15,'SKUDESC15','Perimeter','Deli and Foodservice','Self Service Deli Cold','Beverages');
insert into sku_data values (16,'SKUDESC16','Perimeter','Floral','Bouquets and Cut Flowers','Bouquets and Cut Flowers');
insert into sku_data values (17,'SKUDESC17','Perimeter','Deli and Foodservice','ServiceDeli','All Other');
insert into sku_data values (18,' SKUDESC18',' Center',' Frozen',' Frozen Bake',' Bread or Dough Products Frozen');
