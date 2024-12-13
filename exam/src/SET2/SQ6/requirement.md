#Write a program to calculate the profit/loss of N products based on their purchase costs, selling prices, and monthly sales.
##The program should:
###• Read the number of products N.
###• Use arrays of length N to store the following:
####  1. the product names
####  2. the number of purchases of each product
####  3. the number of sales made for each product
####  4. their purchase cost
####  5. their selling prices
####  6. the profit or loss incurred from each product
### • Calculate the product profit or loss percentage based on the purchase cost and the sales made:
 <Product profit/loss percentage> = 
 (<Product Profit or Loss> / <Total product purchase cost>) *100
where,
<Product Profit or Loss>
= <Total product sales> - <Total product purchase cost>
<Total product purchase cost>
= <purchase cost of each product> * <number of products purchased>
<Total product sales>
= <selling price of each product> * <number of products sold>
Also, calculate the net profit or loss percentage based on the net profit/loss and the net purchase cost.
• Keep track of the product profit/loss based on the three conditions:
o If the profit/loss percentage is greater than 0 then mark the product sales as “PROFIT”.
o If the profit/loss percentage is equal to 0 then mark the product sales as “BREAK-EVEN”.
o If the profit/loss percentage is less than 0 then mark the product sales as “LOSS”.
• Sort the products in descending order based on the profit/loss percentage of each product, starting with the
most profitable product to the least.
• For each product, print (in a tabular format): the product name, the number of purchases, the number of
sales, the purchase cost, the selling price, the total purchase cost, the total sales, the overall profit/loss
percentage, and the sales indicators.
• At the end, print the net purchase cost, the net sales, and the net profit/loss percentage and the profit/loss
indicator.