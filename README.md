# Assessment 1

**READ THIS DOCUMENT COMPLETELY BEFORE STARTING THE ASSESSMENT**

## Overview
Cognizant has been engaged to help build a site for **Ali Snobba** - a snobby online store where customers purchase high-end merchandise like Louis Vuitton handbags and Rolex watches.

We need to model a Shopping Cart that stores lineItems while customers are going through the checkout process.  This basic cart will work like all basic carts you’ve ever used while shopping online.

## Your Task
- Create the model classes for Cart, LineItem, and Product, that meet the requirements below, and thoroughly unit-test them.

## Time to Complete
- You have 1 hour and 15 minutes to complete this assessment.  (Ends at 10:15am)
- Once you are done, take a break and be back in the room at 10:30am sharp for assessment 2.

## Stories
- As a customer, if I haven’t put anything into my cart, the cart is empty. 
- As a customer, I can add a product to the cart, and the cart will display a quantity of 1 of that product, in that line item.
- As a customer, I can increase the quantity of a line item by 1.
- As a customer, I can decrease the quantity of a line item by 1. If I decrease it to 0, the line item disappears.
- As a customer, I can see the discounted price of each line item in my cart (product price X quantity of that product).
- As a customer, I can see the un-discounted price of each line item in my cart, so I can see how much I’m saving.
- As a customer, I can see the total, discounted price of all line lineItems in my cart.
- As a customer, I can see the total, un-discounted price of all line lineItems in my cart.

## Technical Requirements
- Use plain old Java, NO frameworks such as Spring, and NO ORM libraries.
- Create a package structure using best practices for the model classes.
- Demonstrate the use of Java functional programming style.  (Use interfaces where it makes sense to do so.)
- Use Gradle to build.
- Write clean, modularized code.
- Make small, meaningful git commits.  (Commit often!) 
- Write unit tests with JUnit.

## Notes
- Right now we only need to create the models, no UI. 
- We are also NOT creating a complete running service in this exercise -- ONLY CREATE THE MODELS.
- ONLY implement what is specified above. Points are taken off for extraneous work.
- If you're not sure whether something is in scope, ask for clarification!

## How to Submit Your Work
- **Fork** this repo to your own github account.
- Check out your new repo into your IDE.
- Commit your code often and when you're done with the assessment.
- Don't change the name of the repo.

## Grading Rubric
- 5% - Project completed.
- 10% - Code compiles, builds and runs.
- 10% - Unit tests passed.
- 15% - Followed instructions fully.
- 20% - Unit tests written.
- 20% - Coding best practices used.
- 20% - Implemented all stories.
