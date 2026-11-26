# Exercise: Arrays and Loops

Exercise code for the lesson **Exercise: Arrays and Loops** in the Java Full-Stack Bootcamp on [ask-codey.com](https://www.ask-codey.com).

Twenty-one small problems with arrays, loops and grids, in five classes in `src/main/java`:

- `Week.java`: days of the week and months of the year
- `NumberLists.java`: filling arrays with numbers, adding them up in different ways, and reversing them
- `Names.java`: searching and counting names
- `Prices.java`: average and highest prices, and a day's sales that skip refunds and stop at the end of the day
- `Grids.java`: two-dimensional arrays: totals, column totals, counting, and a multiplication table

Every method returns an empty array, `0`, `""` or `false` for now. The comment above each method says what it should return, with examples. Replace the `return` line with your own code.

## Run it

`src/main/java/Main.java` calls a few of your methods, so you can try them out. In IntelliJ IDEA, open this folder as a project (choose the `pom.xml` file if it asks), then click the green **Run** arrow beside `main` in `Main.java`.

## Check your work

```bash
./mvnw test
```

On Windows in PowerShell, write `.\mvnw test` instead. The first run downloads Maven, so it takes a minute.

In IntelliJ IDEA, right-click `ArrayTests` in `src/test/java` and choose **Run 'ArrayTests'**.

At first almost every test fails: that is expected. Each method you finish turns its tests green. A failing test's name says which values it used and what it expected.

## Tips

- Decide first: do you need the index (`for`), or each element (for-each)? Do you know how many times to loop?
- Indexes go from `0` to `length - 1`. Check your loop's condition for an off-by-one mistake.
- For a total, start at 0 and add each element. For a highest, start with the first element and replace it when you find a bigger one.
- `break` stops a loop as soon as you have the answer; `continue` skips the elements that don't count.
- For a grid, put a loop over the columns inside a loop over the rows. `grid.length` counts the rows and `grid[row].length` the columns in that row.

## Hand it in

When it works, push your solution to a public repo of your own on GitHub, then paste that repo's address into **Submit your exercise** on the lesson page at [ask-codey.com](https://www.ask-codey.com). That's what completes the lesson. The lesson page shows the Git commands, step by step.
