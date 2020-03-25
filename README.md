sku-retail_store





Fullstack Developer Coding Test

HR: Please send this questionnaire to the candidate a week before the interviewer and interviewee can discuss the solutions in a conference call

General: The solutions to the below questions will be discussed on a conference call through a desktop sharing session. The interviewee will display the execution of code on his/her machine during the conference call.

Interviewer: The interviewer may choose to ask other similar questions during the interview process

Interviewee: You may search online and find solutions to the below. Answer as many questions as you can in the time provided. You may use the programming language of your choice. Create a repository (preferably git) and share the solutions with us at least a day before actual discussion. You will have to share your desktop while explaining the solution. You are expected to set up, configure and have the environment (infrastructure, runtime and libraries etc.) ready to solve the below questions on your personal desktop/laptop/cloud.

Exercise:
The hierarchical meta-data below helps uniquely identifying an SKU in a retail store. 
Hierarchical data because Department is contained within the location, Category is contained within Department and so on.
1.	Develop a REST API for representing Meta-Data with end points (GET, POST, PUT ,DELETE etc.). For example GET on /api/v1/location returns all location objects
a.	/api/v1/location, 
b.	/api/v1/location/{location_id}/department
c.	/api/v1/location/{location_id}/department/{department_id}/category
d.	/api/v1/location/{location_id}/department/{department_id}/category/{category_id}/subcategory
e.	/api/v1/location/{location_id}/department/{department_id}/category/{category_id}/subcategory/{subcategory_id}

2.	Implement an authentication mechanism for the UI (username/password) and API (Basic Auth) - Bonus points if you can demonstrate OpenIDConnect, JWT, OAuth2

3.	Persist the data in your favorite DB - relational or non-relational (You are expected to install, configure, populate the DB). You may feel free to qualify object representations with additional attributes to enhance modeling (For e.g. Location object attributes = locationid, location description)
4.	In your chosen web front-end framework, develop a web-based UI, that the user can interact with and perform CRUD (create, read, update, delete) operations on the data (The calls should go through API layer built in step 1).

5.	Write a api endpoint that takes input meta-data and returns all the SKU rows in the "Data" that matches with the input meta-data. 
a.	For example, for input meta-data (Perimeter, Bakery, Bakery Bread, Bagels) , return the rows with SKUs 1 & 14 (The actual data given to you might contain more rows)
6.	Develop test scripts to verify the application functionality (Optional)
7.	Meta Data

Location,Department,Category,SubCategory
Perimeter,Bakery,BakeryBread,Bagels
Perimeter,Bakery,BakeryBread,Baking or Breading Products
Perimeter,Bakery,BakeryBread,English Muffins or Biscuits
Perimeter,Bakery,BakeryBread,Flatbreads
Perimeter,Bakery,In Store Bakery,Breakfast Cake or Sweet Roll
Perimeter,Bakery,In Store Bakery,Cakes
Perimeter,Bakery,In Store Bakery,Pies
Perimeter,Bakery,In Store Bakery,Seasonal
Center,Dairy,Cheese, Cheese Sauce
Center,Dairy,Cheese,Specialty Cheese
Center,Dairy,Cream or Creamer,Dairy Alternative Creamer
Center,Dairy,Cream or Creamer,Whipping Creams
Center,Dairy,Cultured,Cottage Cheese
Center,Dairy,RefrigeratedBaking,Refrigerated Breads
Center,Dairy,RefrigeratedBaking,Refrigerated English Muffins and Biscuits
Center,Dairy,RefrigeratedBaking,Refrigerated Hand Held Sweets
Center,Dairy,RefrigeratedBaking,Refrigerated Pie Crust
Center,Dairy,RefrigeratedBaking,Refrigerated Sweet Breakfast Baked Goods
Perimeter,Deli and Foodservice,Self Service Deli Cold,Beverages
Perimeter,Deli and Foodservice,ServiceDeli,Cheese All Other
Perimeter,Deli and Foodservice,ServiceDeli,Cheese American
Perimeter,Floral,Bouquets and Cut Flowers,Bouquets and Cut Flowers
Perimeter,Floral,Gifts,Gifts
Perimeter,Floral,Plants,Plants
Center,Frozen,FrozenBake,Bread or Dough Products Frozen
Center,Frozen,FrozenBake,Breakfast Cake or Sweet Roll Frozen
Center,Frozen,FrozenBreakfast,Frozen Breakfast Entrees
Center,Frozen,FrozenBreakfast,Frozen Breakfast Sandwich
Center,Frozen,FrozenBreakfast,Frozen Egg Substitutes
Center,Frozen,FrozenBreakfast,Frozen Syrup Carriers
Center,Frozen,Frozen Desserts or Fruit and Toppings,Pies Frozen
Center,Frozen,FrozenJuice,Frozen Apple Juice
Center,Frozen,FrozenJuice,Frozen Fruit Drink Mixers
Center,Frozen,FrozenJuice,Frozen Fruit Juice All Other
Center,GM,AudioVideo,Audio
Center,GM,AudioVideo,Video DVD
Center,GM,AudioVideo,Video VHS
Center,GM,Housewares,Bedding
Center,GM,Housewares,Candles
Center,GM,Housewares,Collectibles and Gifts
Center,GM,Housewares,Flashlights
Center,GM,Housewares,Frames
Center,GM,Insect and Rodent,Indoor Repellants or Traps
Center,GM,Insect and Rodent,Outdoor Repellants or Traps
Center,GM,KitchenAccessories,Kitchen Accessories
Center,GM,Laundry,Bleach Liquid
Center,GM,Laundry,Bleach Powder
Center,GM,Laundry,Fabric Softener Liquid
Center,GM,Laundry,Fabric Softener Sheets
Center,Grocery,BakingIngredients,Dry or Canned Milk
Center,Grocery,BakingIngredients,Food Coloring
Center,Grocery,Spices,Salt Cooking or Edible or Seasoned
Center,Grocery,Spices,Salt Substitute
Center,Grocery,Spices,Seasoning Dry
Center,Grocery,StuffingProducts,Stuffing Products
Perimeter,Seafood,FrozenShellfish,Frozen Shellfish
Perimeter,Seafood,OtherSeafood,All Other Seafood
Perimeter,Seafood,OtherSeafood,Prepared Seafood Entrees
Perimeter,Seafood,OtherSeafood,Seafood Salads
Perimeter,Seafood,OtherSeafood,Smoked Fish
Perimeter,Seafood,OtherSeafood,Seafood Breading Sauces Dips


8.	SKU Data

SKU,NAME,LOCATION,DEPARTMENT,CATEGORY,SUBCATEGORY
1,SKUDESC1,Permiter,Bakery,Bakery Bread,Bagels
2,SKUDESC2,Permiter,Deli and Foodservice,Self Service Deli Cold,Beverages
3,SKUDESC3,Permiter,Floral,Bouquets and Cut Flowers,Bouquets and Cut Flowers
4,SKUDESC4,Permiter,Deli and Foodservice,ServiceDeli,All Other
5,SKUDESC5,Center,Frozen,Frozen Bake,Bread or Dough Products Frozen
6,SKUDESC6,Center,Grocery,Crackers,Rice Cakes
7,SKUDESC7,Center,GM,Audio Video,Audio
8,SKUDESC8,Center,GM,Audio Video,Video DVD
9,SKUDESC9,Permiter,GM,Housewares,Beeding
10,SKUDESC10,Permiter,Seafood,Frozen Shellfish,Frozen Shellfish
11,SKUDESC11,Permiter,Seafood,Other Seafood,All Other Seafood
12,SKUDESC12,Permiter,Seafood,Other Seafood,Prepared Seafood Entrees
13,SKUDESC13,Permiter,Seafood,Other Seafood,Salads
14,SKUDESC14,Permiter,Bakery,Bakery Bread,Bagels
15,SKUDESC15,Permiter,Deli and Foodservice,Self Service Deli Cold,Beverages
16,SKUDESC16,Permiter,Floral,Bouquets and Cut Flowers,Bouquets and Cut Flowers
17,SKUDESC17,Permiter,Deli and Foodservice,ServiceDeli,All Other
18, SKUDESC18, Center, Frozen, Frozen Bake, Bread or Dough Products Frozen



Evaluation Criteria (not limited to):
●	Provide justification on the choice of Language, DB, and front end Libraries
●	Architecture Layout / Layers, Design, Comments
●	Addressing of Security Concerns
●	Identification of Patterns and their usage in the given scenarios
●	Coding conventions, Test Scripts and Build Scripts
●	Ability to Set up and demonstrate the working version of the Code


