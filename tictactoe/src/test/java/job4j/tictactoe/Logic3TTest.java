package job4j.tictactoe;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Logic3TTest {

    @Test
    public void whenHasXDiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(true), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(true), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(true)},
        };
        Logic3T logic = new Logic3T(table);
        assertThat(logic.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(true), new Figure3T(true), new Figure3T(true)},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T logic = new Logic3T(table);
        assertThat(logic.isWinnerX(), is(true));
    }

    @Test
    public void whenHasXVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(true), new Figure3T()},
                {new Figure3T(), new Figure3T(true), new Figure3T()},
                {new Figure3T(), new Figure3T(true), new Figure3T()},
        };
        Logic3T logic = new Logic3T(table);
        assertThat(logic.isWinnerX(), is(true));
    }


    @Test
    public void whenHasODiagonalWinner() {
        Figure3T[][] table = {
                {new Figure3T(false), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(false), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T(false)},
        };
        Logic3T logic = new Logic3T(table);
        assertThat(logic.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOHorizontalWinner() {
        Figure3T[][] table = {
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(false), new Figure3T(false), new Figure3T(false)},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T logic = new Logic3T(table);
        assertThat(logic.isWinnerO(), is(true));
    }

    @Test
    public void whenHasOVerticalWinner() {
        Figure3T[][] table = {
                {new Figure3T(false), new Figure3T(), new Figure3T()},
                {new Figure3T(false), new Figure3T(true), new Figure3T()},
                {new Figure3T(false), new Figure3T(), new Figure3T(true)},
        };
        Logic3T logic = new Logic3T(table);
        assertThat(logic.isWinnerO(), is(true));
    }

    @Test
    public void whenHasGap() {
        Figure3T[][] table = {
                {new Figure3T(true), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
                {new Figure3T(), new Figure3T(), new Figure3T()},
        };
        Logic3T logic = new Logic3T(table);
        assertThat(logic.hasGap(), is(true));
    }

    @Test
    public void whenHasNotGap() {
        Figure3T[][] table = {
                {new Figure3T(true), new Figure3T(false), new Figure3T(true)},
                {new Figure3T(false), new Figure3T(false), new Figure3T(false)},
                {new Figure3T(false), new Figure3T(true), new Figure3T(true)},
        };
        Logic3T logic = new Logic3T(table);
        assertThat(logic.hasGap(), is(false));
    }
}
