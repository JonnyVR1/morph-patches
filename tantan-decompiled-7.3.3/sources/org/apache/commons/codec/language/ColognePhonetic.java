package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* JADX INFO: loaded from: classes2.dex */
public class ColognePhonetic implements StringEncoder {
    private static final char[][] PREPROCESS_MAP = {new char[]{196, 'A'}, new char[]{220, Matrix.MATRIX_TYPE_RANDOM_UT}, new char[]{214, 'O'}, new char[]{223, 'S'}};

    public class CologneInputBuffer extends CologneBuffer {
        public CologneInputBuffer(char[] cArr) {
            super(cArr);
        }

        public void addLeft(char c) {
            this.length++;
            this.data[getNextPos()] = c;
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i, int i2) {
            char[] cArr = new char[i2];
            char[] cArr2 = this.data;
            System.arraycopy(cArr2, (cArr2.length - this.length) + i, cArr, 0, i2);
            return cArr;
        }

        public char getNextChar() {
            return this.data[getNextPos()];
        }

        public int getNextPos() {
            return this.data.length - this.length;
        }

        public char removeNext() {
            char nextChar = getNextChar();
            this.length--;
            return nextChar;
        }
    }

    public class CologneOutputBuffer extends CologneBuffer {
        public CologneOutputBuffer(int i) {
            super(i);
        }

        public void addRight(char c) {
            char[] cArr = this.data;
            int i = this.length;
            cArr[i] = c;
            this.length = i + 1;
        }

        @Override // org.apache.commons.codec.language.ColognePhonetic.CologneBuffer
        public char[] copyData(int i, int i2) {
            char[] cArr = new char[i2];
            System.arraycopy(this.data, i, cArr, 0, i2);
            return cArr;
        }
    }

    private static boolean arrayContains(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }

    private String preprocess(String str) {
        char[] charArray = str.toUpperCase(Locale.GERMAN).toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] > 'Z') {
                for (char[] cArr : PREPROCESS_MAP) {
                    if (charArray[i] == cArr[0]) {
                        charArray[i] = cArr[1];
                        break;
                    }
                }
            }
        }
        return new String(charArray);
    }

    public String colognePhonetic(String str) {
        char c;
        if (str == null) {
            return null;
        }
        String strPreprocess = preprocess(str);
        CologneOutputBuffer cologneOutputBuffer = new CologneOutputBuffer(strPreprocess.length() * 2);
        CologneInputBuffer cologneInputBuffer = new CologneInputBuffer(strPreprocess.toCharArray());
        int length = cologneInputBuffer.length();
        char c2 = '/';
        char c3 = '-';
        while (length > 0) {
            char cRemoveNext = cologneInputBuffer.removeNext();
            int length2 = cologneInputBuffer.length();
            char nextChar = length2 > 0 ? cologneInputBuffer.getNextChar() : '-';
            if (arrayContains(new char[]{'A', 'E', 'I', 'J', 'O', Matrix.MATRIX_TYPE_RANDOM_UT, 'Y'}, cRemoveNext)) {
                c = '0';
            } else if (cRemoveNext == 'H' || cRemoveNext < 'A' || cRemoveNext > 'Z') {
                if (c2 != '/') {
                    c = '-';
                }
                length = length2;
            } else if (cRemoveNext == 'B' || (cRemoveNext == 'P' && nextChar != 'H')) {
                c = '1';
            } else if ((cRemoveNext == 'D' || cRemoveNext == 'T') && !arrayContains(new char[]{'S', 'C', Matrix.MATRIX_TYPE_ZERO}, nextChar)) {
                c = '2';
            } else if (arrayContains(new char[]{'W', 'F', 'P', 'V'}, cRemoveNext)) {
                c = '3';
            } else if (arrayContains(new char[]{'G', 'K', 'Q'}, cRemoveNext)) {
                c = '4';
            } else {
                if (cRemoveNext == 'X' && !arrayContains(new char[]{'C', 'K', 'Q'}, c3)) {
                    cologneInputBuffer.addLeft('S');
                    length2++;
                } else if (cRemoveNext == 'S' || cRemoveNext == 'Z') {
                    c = '8';
                } else {
                    if (cRemoveNext == 'C') {
                        if (c2 != '/' ? arrayContains(new char[]{'S', Matrix.MATRIX_TYPE_ZERO}, c3) || !arrayContains(new char[]{'A', 'H', 'O', Matrix.MATRIX_TYPE_RANDOM_UT, 'K', 'Q', 'X'}, nextChar) : !arrayContains(new char[]{'A', 'H', 'K', 'L', 'O', 'Q', Matrix.MATRIX_TYPE_RANDOM_REGULAR, Matrix.MATRIX_TYPE_RANDOM_UT, 'X'}, nextChar)) {
                        }
                    } else if (!arrayContains(new char[]{'T', 'D', 'X'}, cRemoveNext)) {
                        if (cRemoveNext == 'R') {
                            c = '7';
                        } else if (cRemoveNext == 'L') {
                            c = '5';
                        } else {
                            c = (cRemoveNext == 'M' || cRemoveNext == 'N') ? '6' : cRemoveNext;
                        }
                    }
                    c = '8';
                }
                c = '4';
            }
            if (c != '-' && ((c2 != c && (c != '0' || c2 == '/')) || c < '0' || c > '8')) {
                cologneOutputBuffer.addRight(c);
            }
            c2 = c;
            c3 = cRemoveNext;
            length = length2;
        }
        return cologneOutputBuffer.toString();
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return encode((String) obj);
        }
        throw new EncoderException("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + obj.getClass().getName() + ".");
    }

    public boolean isEncodeEqual(String str, String str2) {
        return colognePhonetic(str).equals(colognePhonetic(str2));
    }

    public abstract class CologneBuffer {
        protected final char[] data;
        protected int length;

        public CologneBuffer(int i) {
            this.length = 0;
            this.data = new char[i];
            this.length = 0;
        }

        public abstract char[] copyData(int i, int i2);

        public int length() {
            return this.length;
        }

        public String toString() {
            return new String(copyData(0, this.length));
        }

        public CologneBuffer(char[] cArr) {
            this.length = 0;
            this.data = cArr;
            this.length = cArr.length;
        }
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return colognePhonetic(str);
    }
}
