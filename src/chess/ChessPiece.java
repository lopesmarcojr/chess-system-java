package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

 private Color color;
 private int moveCount;
 
public ChessPiece(Board board, Color color, int moveCount) {
	super(board);
	this.color = color;
	this.moveCount = moveCount;
}
 
 
}
