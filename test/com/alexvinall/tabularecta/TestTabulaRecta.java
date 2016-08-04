package com.alexvinall.tabularecta;

import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;

import java.io.PrintStream;

import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InOrder;
import org.mockito.Mock;


/**
 * Test class for {@link TabulaRecta}.
 */
public class TestTabulaRecta {

  @Captor
  ArgumentCaptor<String> log = ArgumentCaptor.forClass(String.class);

  @Mock
  PrintStream printStream = mock(PrintStream.class);

  @Before
  public void before() {
    System.setOut(printStream);
  }


  /**
   * Ensures that the output is as expected.
   */
  @Test
  public void testTabulaRectaOutput() {
    // When
    TabulaRecta.main(new String[]{});

    // Then
    InOrder inOrder = inOrder(printStream);
    inOrder.verify(printStream).println("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
    inOrder.verify(printStream).println("BCDEFGHIJKLMNOPQRSTUVWXYZA");
    inOrder.verify(printStream).println("CDEFGHIJKLMNOPQRSTUVWXYZAB");
    inOrder.verify(printStream).println("DEFGHIJKLMNOPQRSTUVWXYZABC");
    inOrder.verify(printStream).println("EFGHIJKLMNOPQRSTUVWXYZABCD");
    inOrder.verify(printStream).println("FGHIJKLMNOPQRSTUVWXYZABCDE");
    inOrder.verify(printStream).println("GHIJKLMNOPQRSTUVWXYZABCDEF");
    inOrder.verify(printStream).println("HIJKLMNOPQRSTUVWXYZABCDEFG");
    inOrder.verify(printStream).println("IJKLMNOPQRSTUVWXYZABCDEFGH");
    inOrder.verify(printStream).println("JKLMNOPQRSTUVWXYZABCDEFGHI");
    inOrder.verify(printStream).println("KLMNOPQRSTUVWXYZABCDEFGHIJ");
    inOrder.verify(printStream).println("LMNOPQRSTUVWXYZABCDEFGHIJK");
    inOrder.verify(printStream).println("MNOPQRSTUVWXYZABCDEFGHIJKL");
    inOrder.verify(printStream).println("NOPQRSTUVWXYZABCDEFGHIJKLM");
    inOrder.verify(printStream).println("OPQRSTUVWXYZABCDEFGHIJKLMN");
    inOrder.verify(printStream).println("PQRSTUVWXYZABCDEFGHIJKLMNO");
    inOrder.verify(printStream).println("QRSTUVWXYZABCDEFGHIJKLMNOP");
    inOrder.verify(printStream).println("RSTUVWXYZABCDEFGHIJKLMNOPQ");
    inOrder.verify(printStream).println("STUVWXYZABCDEFGHIJKLMNOPQR");
    inOrder.verify(printStream).println("TUVWXYZABCDEFGHIJKLMNOPQRS");
    inOrder.verify(printStream).println("UVWXYZABCDEFGHIJKLMNOPQRST");
    inOrder.verify(printStream).println("VWXYZABCDEFGHIJKLMNOPQRSTU");
    inOrder.verify(printStream).println("WXYZABCDEFGHIJKLMNOPQRSTUV");
    inOrder.verify(printStream).println("XYZABCDEFGHIJKLMNOPQRSTUVW");
    inOrder.verify(printStream).println("YZABCDEFGHIJKLMNOPQRSTUVWX");
    inOrder.verify(printStream).println("ZABCDEFGHIJKLMNOPQRSTUVWXY");
  }
}