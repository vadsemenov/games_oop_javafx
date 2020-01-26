package ru.job4j.chess;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.black.BishopBlack;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class LogicTest {

    @Test
    public void whenFigureOnWayTryMove() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        logic.add(new BishopBlack(Cell.E3));
        assertThat(logic.move(Cell.C1, Cell.F4), is(false));
    }

    @Test
    public void whenNoFigureOnWayTryMove() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        assertThat(logic.move(Cell.C1, Cell.F4), is(true));
    }

    @Test
    public void whenTryNotDiagonalMove() {
        Logic logic = new Logic();
        logic.add(new BishopBlack(Cell.C1));
        assertThat(logic.move(Cell.C1, Cell.F5), is(false));
    }
}