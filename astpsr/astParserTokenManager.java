/* Generated By:JavaCC: Do not edit this line. astParserTokenManager.java */
package astpsr;
import ast.*;

/** Token Manager. */
public class astParserTokenManager implements astParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x7ffffffffffc0L) != 0L)
         {
            jjmatchedKind = 55;
            return 5;
         }
         return -1;
      case 1:
         if ((active0 & 0x7fffff9ffffc0L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 1;
            return 5;
         }
         if ((active0 & 0x6000000L) != 0L)
            return 5;
         return -1;
      case 2:
         if ((active0 & 0x7fffff1e7ffc0L) != 0L)
         {
            if (jjmatchedPos != 2)
            {
               jjmatchedKind = 55;
               jjmatchedPos = 2;
            }
            return 5;
         }
         if ((active0 & 0x8180000L) != 0L)
            return 5;
         return -1;
      case 3:
         if ((active0 & 0x7e13ff1f67fc0L) != 0L)
         {
            if (jjmatchedPos != 3)
            {
               jjmatchedKind = 55;
               jjmatchedPos = 3;
            }
            return 5;
         }
         if ((active0 & 0x1ec000018000L) != 0L)
            return 5;
         return -1;
      case 4:
         if ((active0 & 0x761abf19767c0L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 4;
            return 5;
         }
         if ((active0 & 0x801400601800L) != 0L)
            return 5;
         return -1;
      case 5:
         if ((active0 & 0x7608ae01765c0L) != 0L)
         {
            if (jjmatchedPos != 5)
            {
               jjmatchedKind = 55;
               jjmatchedPos = 5;
            }
            return 5;
         }
         if ((active0 & 0x12111800200L) != 0L)
            return 5;
         return -1;
      case 6:
         if ((active0 & 0x4600a00106000L) != 0L)
            return 5;
         if ((active0 & 0x30080e10705c0L) != 0L)
         {
            if (jjmatchedPos != 6)
            {
               jjmatchedKind = 55;
               jjmatchedPos = 6;
            }
            return 5;
         }
         return -1;
      case 7:
         if ((active0 & 0x30080800100c0L) != 0L)
            return 5;
         if ((active0 & 0x400061060500L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 7;
            return 5;
         }
         return -1;
      case 8:
         if ((active0 & 0x60500L) != 0L)
            return 5;
         if ((active0 & 0x400061000000L) != 0L)
         {
            if (jjmatchedPos != 8)
            {
               jjmatchedKind = 55;
               jjmatchedPos = 8;
            }
            return 5;
         }
         return -1;
      case 9:
         if ((active0 & 0x400000040000L) != 0L)
         {
            if (jjmatchedPos != 9)
            {
               jjmatchedKind = 55;
               jjmatchedPos = 9;
            }
            return 5;
         }
         if ((active0 & 0x61000000L) != 0L)
            return 5;
         return -1;
      case 10:
         if ((active0 & 0x40040000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 10;
            return 5;
         }
         if ((active0 & 0x400000000000L) != 0L)
            return 5;
         return -1;
      case 11:
         if ((active0 & 0x40040000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 11;
            return 5;
         }
         return -1;
      case 12:
         if ((active0 & 0x40000000L) != 0L)
         {
            jjmatchedKind = 55;
            jjmatchedPos = 12;
            return 5;
         }
         if ((active0 & 0x40000L) != 0L)
            return 5;
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 70;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x2L);
      case 38:
         return jjMoveStringLiteralDfa1_0(0x4000000000000000L, 0x0L);
      case 40:
         return jjStopAtPos(0, 56);
      case 41:
         return jjStopAtPos(0, 57);
      case 42:
         return jjStopAtPos(0, 60);
      case 43:
         return jjStopAtPos(0, 58);
      case 45:
         return jjStopAtPos(0, 59);
      case 47:
         return jjStopAtPos(0, 61);
      case 60:
         jjmatchedKind = 66;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x8L);
      case 61:
         return jjMoveStringLiteralDfa1_0(0x0L, 0x1L);
      case 62:
         jjmatchedKind = 68;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x20L);
      case 65:
         return jjMoveStringLiteralDfa1_0(0x3c0L, 0x0L);
      case 66:
         return jjMoveStringLiteralDfa1_0(0x5c00L, 0x0L);
      case 67:
         return jjMoveStringLiteralDfa1_0(0x78000L, 0x0L);
      case 69:
         return jjMoveStringLiteralDfa1_0(0x180000L, 0x0L);
      case 70:
         return jjMoveStringLiteralDfa1_0(0x1c00000L, 0x0L);
      case 73:
         return jjMoveStringLiteralDfa1_0(0x16000000L, 0x0L);
      case 77:
         return jjMoveStringLiteralDfa1_0(0x60000000L, 0x0L);
      case 78:
         return jjMoveStringLiteralDfa1_0(0x7000180000000L, 0x0L);
      case 79:
         return jjMoveStringLiteralDfa1_0(0x200000000L, 0x0L);
      case 80:
         return jjMoveStringLiteralDfa1_0(0xc00000000L, 0x0L);
      case 82:
         return jjMoveStringLiteralDfa1_0(0x3000000000L, 0x0L);
      case 83:
         return jjMoveStringLiteralDfa1_0(0x1c000000000L, 0x0L);
      case 84:
         return jjMoveStringLiteralDfa1_0(0xa0000000000L, 0x0L);
      case 85:
         return jjMoveStringLiteralDfa1_0(0x100000000000L, 0x0L);
      case 86:
         return jjMoveStringLiteralDfa1_0(0x600000000000L, 0x0L);
      case 87:
         return jjMoveStringLiteralDfa1_0(0x800000000000L, 0x0L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x2000L, 0x0L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x200000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x8000000L, 0x0L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x40000000000L, 0x0L);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x8000000000000000L, 0x0L);
      default :
         return jjMoveNfa_0(1, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active0 & 0x4000000000000000L) != 0L)
            return jjStopAtPos(1, 62);
         break;
      case 61:
         if ((active1 & 0x1L) != 0L)
            return jjStopAtPos(1, 64);
         else if ((active1 & 0x2L) != 0L)
            return jjStopAtPos(1, 65);
         else if ((active1 & 0x8L) != 0L)
            return jjStopAtPos(1, 67);
         else if ((active1 & 0x20L) != 0L)
            return jjStopAtPos(1, 69);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x600000218400L, active1, 0L);
      case 98:
         return jjMoveStringLiteralDfa2_0(active0, 0x200000000L, active1, 0L);
      case 100:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(1, 25, 5);
         break;
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x31e0000000L, active1, 0L);
      case 102:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(1, 26, 5);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x820000000000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x400800L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x61000L, active1, 0L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x100018000000L, active1, 0L);
      case 111:
         return jjMoveStringLiteralDfa2_0(active0, 0x1806000L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x40c000001c0L, active1, 0L);
      case 115:
         return jjMoveStringLiteralDfa2_0(active0, 0x200L, active1, 0L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x1c000000000L, active1, 0L);
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x7000000000000L, active1, 0L);
      case 120:
         return jjMoveStringLiteralDfa2_0(active0, 0x180000L, active1, 0L);
      case 121:
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000L, active1, 0L);
      case 124:
         if ((active0 & 0x8000000000000000L) != 0L)
            return jjStopAtPos(1, 63);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x60000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x820400000000L);
      case 106:
         return jjMoveStringLiteralDfa3_0(active0, 0x200000000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x7001000218000L);
      case 109:
         return jjMoveStringLiteralDfa3_0(active0, 0xc000000000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x100800007000L);
      case 112:
         if ((active0 & 0x80000L) != 0L)
         {
            jjmatchedKind = 19;
            jjmatchedPos = 2;
         }
         return jjMoveStringLiteralDfa3_0(active0, 0x80000100000L);
      case 114:
         return jjMoveStringLiteralDfa3_0(active0, 0x6100018001c0L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x600L);
      case 116:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(2, 27, 5);
         return jjMoveStringLiteralDfa3_0(active0, 0x2070000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x40000000000L);
      case 119:
         return jjMoveStringLiteralDfa3_0(active0, 0x180000000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 65:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 68:
         return jjMoveStringLiteralDfa4_0(active0, 0x600000000000L);
      case 76:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000L);
      case 79:
         return jjMoveStringLiteralDfa4_0(active0, 0x100000000L);
      case 84:
         return jjMoveStringLiteralDfa4_0(active0, 0x200000000L);
      case 86:
         return jjMoveStringLiteralDfa4_0(active0, 0x10010000000L);
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x1c0L);
      case 99:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000L);
      case 101:
         if ((active0 & 0x40000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 42, 5);
         else if ((active0 & 0x80000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 43, 5);
         break;
      case 103:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000000L);
      case 104:
         return jjMoveStringLiteralDfa4_0(active0, 0x60000000L);
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x600L);
      case 108:
         if ((active0 & 0x8000L) != 0L)
         {
            jjmatchedKind = 15;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x7800000416000L);
      case 109:
         return jjMoveStringLiteralDfa4_0(active0, 0x1800000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000000L);
      case 111:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000800L);
      case 112:
         if ((active0 & 0x100000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 44, 5);
         break;
      case 115:
         if ((active0 & 0x20000000000L) != 0L)
            return jjStartNfaWithStates_0(3, 41, 5);
         return jjMoveStringLiteralDfa4_0(active0, 0x260000L);
      case 116:
         if ((active0 & 0x4000000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 3;
         }
         return jjMoveStringLiteralDfa4_0(active0, 0x8000000000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 69:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000000000000L);
      case 76:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000000L);
      case 83:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000010000L);
      case 84:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000000000L);
      case 86:
         return jjMoveStringLiteralDfa5_0(active0, 0x4000L);
      case 97:
         return jjMoveStringLiteralDfa5_0(active0, 0x10011800000L);
      case 98:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000000L);
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x400L);
      case 100:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(4, 22, 5);
         break;
      case 101:
         if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 5);
         else if ((active0 & 0x800000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 47, 5);
         return jjMoveStringLiteralDfa5_0(active0, 0x600000002000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x200L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x100000L);
      case 107:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(4, 12, 5);
         break;
      case 111:
         return jjMoveStringLiteralDfa5_0(active0, 0x60000000L);
      case 112:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(4, 11, 5);
         else if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 36, 5);
         break;
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x2880000000L);
      case 115:
         return jjMoveStringLiteralDfa5_0(active0, 0x60000L);
      case 116:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(4, 34, 5);
         break;
      case 121:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000001c0L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 68:
         return jjMoveStringLiteralDfa6_0(active0, 0x60000L);
      case 69:
         return jjMoveStringLiteralDfa6_0(active0, 0x40L);
      case 76:
         return jjMoveStringLiteralDfa6_0(active0, 0x80L);
      case 84:
         return jjMoveStringLiteralDfa6_0(active0, 0x500L);
      case 97:
         return jjMoveStringLiteralDfa6_0(active0, 0x800006000L);
      case 99:
         return jjMoveStringLiteralDfa6_0(active0, 0x600000000000L);
      case 100:
         return jjMoveStringLiteralDfa6_0(active0, 0x60000000L);
      case 105:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000000L);
      case 106:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(5, 32, 5);
         break;
      case 108:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 23;
            jjmatchedPos = 5;
         }
         else if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(5, 28, 5);
         else if ((active0 & 0x10000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 40, 5);
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000L);
      case 110:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(5, 9, 5);
         else if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 37, 5);
         break;
      case 112:
         return jjMoveStringLiteralDfa6_0(active0, 0x200000000L);
      case 114:
         return jjMoveStringLiteralDfa6_0(active0, 0x80000000L);
      case 115:
         return jjMoveStringLiteralDfa6_0(active0, 0x100000L);
      case 116:
         return jjMoveStringLiteralDfa6_0(active0, 0x2000000010000L);
      case 120:
         return jjMoveStringLiteralDfa6_0(active0, 0x4000000000000L);
      case 121:
         return jjMoveStringLiteralDfa6_0(active0, 0x1000000000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 68:
         return jjMoveStringLiteralDfa7_0(active0, 0x60000000L);
      case 76:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      case 97:
         return jjMoveStringLiteralDfa7_0(active0, 0x80000000L);
      case 101:
         if ((active0 & 0x200000000L) != 0L)
            return jjStartNfaWithStates_0(6, 33, 5);
         return jjMoveStringLiteralDfa7_0(active0, 0x60080L);
      case 108:
         if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(6, 14, 5);
         else if ((active0 & 0x200000000000L) != 0L)
         {
            jjmatchedKind = 45;
            jjmatchedPos = 6;
         }
         return jjMoveStringLiteralDfa7_0(active0, 0x400000000040L);
      case 109:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(6, 35, 5);
         return jjMoveStringLiteralDfa7_0(active0, 0x2000000010000L);
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(6, 13, 5);
         break;
      case 112:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStartNfaWithStates_0(6, 50, 5);
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000000000L);
      case 115:
         return jjMoveStringLiteralDfa7_0(active0, 0x8000000000L);
      case 116:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(6, 20, 5);
         break;
      case 121:
         return jjMoveStringLiteralDfa7_0(active0, 0x500L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa8_0(active0, 0x400000000000L);
      case 99:
         return jjMoveStringLiteralDfa8_0(active0, 0x60000L);
      case 101:
         if ((active0 & 0x1000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 48, 5);
         return jjMoveStringLiteralDfa8_0(active0, 0x60000000L);
      case 105:
         return jjMoveStringLiteralDfa8_0(active0, 0x1000000L);
      case 109:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(7, 6, 5);
         break;
      case 110:
         if ((active0 & 0x80L) != 0L)
            return jjStartNfaWithStates_0(7, 7, 5);
         break;
      case 112:
         return jjMoveStringLiteralDfa8_0(active0, 0x500L);
      case 116:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(7, 16, 5);
         else if ((active0 & 0x8000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 39, 5);
         else if ((active0 & 0x2000000000000L) != 0L)
            return jjStartNfaWithStates_0(7, 49, 5);
         break;
      case 121:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(7, 31, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0, 0L);
      return 8;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa9_0(active0, 0x60000000L);
      case 101:
         if ((active0 & 0x100L) != 0L)
            return jjStartNfaWithStates_0(8, 8, 5);
         else if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(8, 10, 5);
         break;
      case 105:
         return jjMoveStringLiteralDfa9_0(active0, 0x400000000000L);
      case 108:
         if ((active0 & 0x20000L) != 0L)
         {
            jjmatchedKind = 17;
            jjmatchedPos = 8;
         }
         return jjMoveStringLiteralDfa9_0(active0, 0x40000L);
      case 115:
         return jjMoveStringLiteralDfa9_0(active0, 0x1000000L);
      default :
         break;
   }
   return jjStartNfa_0(7, active0, 0L);
}
static private int jjMoveStringLiteralDfa9_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(7, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(8, active0, 0L);
      return 9;
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa10_0(active0, 0x40000L);
      case 108:
         if ((active0 & 0x20000000L) != 0L)
         {
            jjmatchedKind = 29;
            jjmatchedPos = 9;
         }
         return jjMoveStringLiteralDfa10_0(active0, 0x40000000L);
      case 115:
         return jjMoveStringLiteralDfa10_0(active0, 0x400000000000L);
      case 116:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(9, 24, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(8, active0, 0L);
}
static private int jjMoveStringLiteralDfa10_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(8, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(9, active0, 0L);
      return 10;
   }
   switch(curChar)
   {
      case 76:
         return jjMoveStringLiteralDfa11_0(active0, 0x40000000L);
      case 105:
         return jjMoveStringLiteralDfa11_0(active0, 0x40000L);
      case 116:
         if ((active0 & 0x400000000000L) != 0L)
            return jjStartNfaWithStates_0(10, 46, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(9, active0, 0L);
}
static private int jjMoveStringLiteralDfa11_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(9, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(10, active0, 0L);
      return 11;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa12_0(active0, 0x40000000L);
      case 115:
         return jjMoveStringLiteralDfa12_0(active0, 0x40000L);
      default :
         break;
   }
   return jjStartNfa_0(10, active0, 0L);
}
static private int jjMoveStringLiteralDfa12_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(10, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(11, active0, 0L);
      return 12;
   }
   switch(curChar)
   {
      case 115:
         return jjMoveStringLiteralDfa13_0(active0, 0x40000000L);
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(12, 18, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(11, active0, 0L);
}
static private int jjMoveStringLiteralDfa13_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(11, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(12, active0, 0L);
      return 13;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(13, 30, 5);
         break;
      default :
         break;
   }
   return jjStartNfa_0(12, active0, 0L);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 6;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 53)
                        kind = 53;
                     jjCheckNAdd(0);
                  }
                  else if (curChar == 34)
                     jjCheckNAdd(2);
                  break;
               case 0:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 53)
                     kind = 53;
                  jjCheckNAdd(0);
                  break;
               case 2:
                  if ((0xfffffffbfffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(2, 3);
                  break;
               case 3:
                  if (curChar == 34 && kind > 54)
                     kind = 54;
                  break;
               case 5:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjstateSet[jjnewStateCnt++] = 5;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((0x7fffffe07fffffeL & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(5);
                  break;
               case 2:
                  jjAddStates(0, 1);
                  break;
               case 5:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 55)
                     kind = 55;
                  jjCheckNAdd(5);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 2:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(0, 1);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 6 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   2, 3, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\101\162\162\141\171\105\154\155", 
"\101\162\162\141\171\114\145\156", "\101\162\162\141\171\124\171\160\145", "\101\163\163\151\147\156", 
"\102\141\163\151\143\124\171\160\145", "\102\151\156\157\160", "\102\154\157\143\153", 
"\142\157\157\154\145\141\156", "\102\157\157\154\126\141\154", "\103\141\154\154", 
"\103\141\154\154\123\164\155\164", "\103\154\141\163\163\104\145\143\154", 
"\103\154\141\163\163\104\145\143\154\114\151\163\164", "\105\170\160", "\105\170\160\114\151\163\164", "\146\141\154\163\145", 
"\106\151\145\154\144", "\106\157\162\155\141\154", "\106\157\162\155\141\154\114\151\163\164", 
"\111\144", "\111\146", "\151\156\164", "\111\156\164\126\141\154", 
"\115\145\164\150\157\144\104\145\143\154", "\115\145\164\150\157\144\104\145\143\154\114\151\163\164", 
"\116\145\167\101\162\162\141\171", "\116\145\167\117\142\152", "\117\142\152\124\171\160\145", 
"\120\162\151\156\164", "\120\162\157\147\162\141\155", "\122\145\154\157\160", 
"\122\145\164\165\162\156", "\123\164\155\164", "\123\164\155\164\114\151\163\164", 
"\123\164\162\126\141\154", "\124\150\151\163", "\164\162\165\145", "\124\171\160\145", 
"\125\156\157\160", "\126\141\162\104\145\143\154", 
"\126\141\162\104\145\143\154\114\151\163\164", "\127\150\151\154\145", "\116\165\154\154\124\171\160\145", 
"\116\165\154\154\123\164\155\164", "\116\165\154\154\105\170\160", null, null, null, null, null, "\50", "\51", 
"\53", "\55", "\52", "\57", "\46\46", "\174\174", "\75\75", "\41\75", "\74", 
"\74\75", "\76", "\76\75", "\41", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffe7ffffffffffc1L, 0x7fL, 
};
static final long[] jjtoSkip = {
   0x3eL, 0x0L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[6];
static private final int[] jjstateSet = new int[12];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public astParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public astParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 6; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100003600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         TokenLexicalActions(matchedToken);
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void TokenLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 53 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    try {
      Integer.parseInt(matchedToken.image);
    } catch (Exception e) {
      throw new TokenMgrError("Lexical error at line "
        + matchedToken.beginLine + ", column " + matchedToken.beginColumn +
        ".  Integer value over 2^31-1", 0);
    }
         break;
      case 54 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    if (matchedToken.image.length() > 257)
      throw new TokenMgrError("Lexical error at line "
        + matchedToken.beginLine + ", column " + matchedToken.beginColumn +
        ".  String length over 255", 0);
         break;
      case 55 :
        image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
    if (matchedToken.image.length() > 255)
      throw new TokenMgrError("Lexical error at line "
        + matchedToken.beginLine + ", column " + matchedToken.beginColumn +
        ".  Id length over 255", 0);
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}