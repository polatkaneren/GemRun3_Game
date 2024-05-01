# Outlier Odyssey v3.0

Outlier Odyssey v3.0 is a console-based game developed in Java. In this version, you navigate through different cells on the game board while encountering animals and other objects.

## Game Rules

- The game board is created by specifying the number of rows and columns. By default, a 10x10 board is used.
- The player starts in one cell of the board and tries to reach the cell at the other end.
- Each time the player moves, their health may increase or decrease based on the content of the cell.
- The game ends when the player's health reaches 0 or when the target cell is reached.

## How to Play

1. To start the game, run the `OutlierOdyssey` class.
2. When it's the player's turn, press a key to move in a direction (up, down, left, or right).
3. The game continues until the player's health reaches 0 or the target cell is reached.

## Game Classes

- `OutlierOdyssey`: The main class that initializes and starts the game.
- `Game`: Manages the game logic, including the game board and the player.
- `GameBoard`: Represents the game board and manages its cells and visual state.
- `Player`: Represents the player, storing information about health and position.
- `Cell`: Represents each cell on the game board, including its content and visit status.
- `CellItem`: Base class for objects in a cell, storing properties like name and cost.
- `Animal`: Represents an animal object, including properties like name and base cost.

## Requirements

- Requires Java Runtime Environment.

## How to Install and Run

1. Clone the project to a directory or download the ZIP file.
2. Navigate to the cloned directory or unzip the downloaded file.
3. Open a terminal and navigate to the project directory.
4. Compile the project by entering the following command:
javac OutlierOdyssey.java
5. Then, to start the game, enter the following command:
java OutlierOdyssey

6. Enjoy the game!

## Contributing

This game is open source and can be found on GitHub [here](https://github.com/yourusername/outlier-odyssey). Contributions are welcome!

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for more information.
