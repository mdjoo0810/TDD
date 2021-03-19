package kr.jmd.tdd.refine;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RefineTest {

    @ParameterizedTest
    @ValueSource(strings = {"hello  world", "hello   world", "hello    world"})
    public void 공백_줄이기_테스트(String beforeText) {
        assertEquals(Refine.refineText(beforeText), "hello world");
    }

}
