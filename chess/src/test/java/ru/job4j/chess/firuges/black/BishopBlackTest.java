package ru.job4j.chess.firuges.black;

import org.junit.Test;
import ru.job4j.chess.firuges.Cell;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class BishopBlackTest {

    @Test
    public void whenCheckPositionByPosition() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        assertThat(bishopBlack.position(), is(Cell.C1));
    }

    @Test
    public void whenCheckNewFigureByCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        BishopBlack bishopBlack1 = (BishopBlack) bishopBlack.copy(Cell.G5);
        assertThat(bishopBlack1.position(), is(Cell.G5));
    }

    @Test
    public void whenCheckTheWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] way = {Cell.D2, Cell.E3, Cell.F4, Cell.G5}; //D2, E3, F4, G5
        assertThat(bishopBlack.way(Cell.C1, Cell.G5), is(way));
    }
}