package org.apache.commons.codec.language;

import java.util.Locale;
import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import org.spongycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes2.dex */
public class Metaphone implements StringEncoder {
    private static final String FRONTV = "EIY";
    private static final String VARSON = "CSPTG";
    private static final String VOWELS = "AEIOU";
    private int maxCodeLen = 4;

    private boolean isLastChar(int i, int i2) {
        return i2 + 1 == i;
    }

    private boolean isNextChar(StringBuffer stringBuffer, int i, char c) {
        return i >= 0 && i < stringBuffer.length() - 1 && stringBuffer.charAt(i + 1) == c;
    }

    private boolean isPreviousChar(StringBuffer stringBuffer, int i, char c) {
        return i > 0 && i < stringBuffer.length() && stringBuffer.charAt(i - 1) == c;
    }

    private boolean isVowel(StringBuffer stringBuffer, int i) {
        return VOWELS.indexOf(stringBuffer.charAt(i)) >= 0;
    }

    private boolean regionMatch(StringBuffer stringBuffer, int i, String str) {
        if (i < 0 || (str.length() + i) - 1 >= stringBuffer.length()) {
            return false;
        }
        return stringBuffer.substring(i, str.length() + i).equals(str);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return metaphone((String) obj);
        }
        throw new EncoderException("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }

    public int getMaxCodeLen() {
        return this.maxCodeLen;
    }

    public boolean isMetaphoneEqual(String str, String str2) {
        return metaphone(str).equals(metaphone(str2));
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0213  */
    public String metaphone(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        boolean z = true;
        if (str.length() == 1) {
            return str.toUpperCase(Locale.ENGLISH);
        }
        char[] charArray = str.toUpperCase(Locale.ENGLISH).toCharArray();
        StringBuffer stringBuffer = new StringBuffer(40);
        StringBuffer stringBuffer2 = new StringBuffer(10);
        int i = 0;
        char c = charArray[0];
        if (c != 'A') {
            if (c == 'G' || c == 'K' || c == 'P') {
                if (charArray[1] == 'N') {
                    stringBuffer.append(charArray, 1, charArray.length - 1);
                } else {
                    stringBuffer.append(charArray);
                }
            } else if (c == 'W') {
                char c2 = charArray[1];
                if (c2 == 'R') {
                    stringBuffer.append(charArray, 1, charArray.length - 1);
                } else if (c2 == 'H') {
                    stringBuffer.append(charArray, 1, charArray.length - 1);
                    stringBuffer.setCharAt(0, 'W');
                } else {
                    stringBuffer.append(charArray);
                }
            } else if (c != 'X') {
                stringBuffer.append(charArray);
            } else {
                charArray[0] = 'S';
                stringBuffer.append(charArray);
            }
        } else if (charArray[1] == 'E') {
            stringBuffer.append(charArray, 1, charArray.length - 1);
        } else {
            stringBuffer.append(charArray);
        }
        int length = stringBuffer.length();
        while (stringBuffer2.length() < getMaxCodeLen() && i < length) {
            char cCharAt = stringBuffer.charAt(i);
            if (cCharAt == 'C' || !isPreviousChar(stringBuffer, i, cCharAt)) {
                switch (cCharAt) {
                    case 'A':
                    case 'E':
                    case EACTags.CARDHOLDER_PUBLIC_KEY_TEMPLATE /* 73 */:
                    case 'O':
                    case 'U':
                        if (i == 0) {
                            stringBuffer2.append(cCharAt);
                        }
                        break;
                    case 'B':
                        if (!isPreviousChar(stringBuffer, i, 'M') || !isLastChar(length, i)) {
                            stringBuffer2.append(cCharAt);
                        }
                        break;
                    case 'C':
                        if (!isPreviousChar(stringBuffer, i, 'S') || isLastChar(length, i) || FRONTV.indexOf(stringBuffer.charAt(i + 1)) < 0) {
                            if (regionMatch(stringBuffer, i, "CIA")) {
                                stringBuffer2.append('X');
                            } else if (!isLastChar(length, i) && FRONTV.indexOf(stringBuffer.charAt(i + 1)) >= 0) {
                                stringBuffer2.append('S');
                            } else if ((isPreviousChar(stringBuffer, i, 'S') && isNextChar(stringBuffer, i, 'H')) || !isNextChar(stringBuffer, i, 'H')) {
                                stringBuffer2.append('K');
                            } else if (i == 0 && length >= 3 && isVowel(stringBuffer, 2)) {
                                stringBuffer2.append('K');
                            } else {
                                stringBuffer2.append('X');
                            }
                        }
                        break;
                    case 'D':
                        if (!isLastChar(length, i + 1) && isNextChar(stringBuffer, i, 'G')) {
                            int i2 = i + 2;
                            if (FRONTV.indexOf(stringBuffer.charAt(i2)) < 0) {
                                stringBuffer2.append('T');
                            } else {
                                stringBuffer2.append('J');
                                i = i2;
                            }
                        } else {
                            stringBuffer2.append('T');
                        }
                        break;
                    case 'F':
                    case 'J':
                    case 'L':
                    case 'M':
                    case 'N':
                    case EACTags.COMMAND_TO_PERFORM /* 82 */:
                        stringBuffer2.append(cCharAt);
                        break;
                    case 'G':
                        int i3 = i + 1;
                        if ((!isLastChar(length, i3) || !isNextChar(stringBuffer, i, 'H')) && ((isLastChar(length, i3) || !isNextChar(stringBuffer, i, 'H') || isVowel(stringBuffer, i + 2)) && (i <= 0 || (!regionMatch(stringBuffer, i, "GN") && !regionMatch(stringBuffer, i, "GNED"))))) {
                            boolean zIsPreviousChar = isPreviousChar(stringBuffer, i, 'G');
                            if (isLastChar(length, i) || FRONTV.indexOf(stringBuffer.charAt(i3)) < 0 || zIsPreviousChar) {
                                stringBuffer2.append('K');
                            } else {
                                stringBuffer2.append('J');
                            }
                        }
                        break;
                    case 'H':
                        if (!isLastChar(length, i) && ((i <= 0 || VARSON.indexOf(stringBuffer.charAt(i - 1)) < 0) && isVowel(stringBuffer, i + 1))) {
                            stringBuffer2.append('H');
                        }
                        break;
                    case 'K':
                        if (i <= 0 || !isPreviousChar(stringBuffer, i, 'C')) {
                            stringBuffer2.append(cCharAt);
                        }
                        break;
                    case 'P':
                        if (!isNextChar(stringBuffer, i, 'H')) {
                            stringBuffer2.append(cCharAt);
                        } else {
                            stringBuffer2.append('F');
                        }
                        break;
                    case EACTags.FILE_REFERENCE /* 81 */:
                        stringBuffer2.append('K');
                        break;
                    case EACTags.DISCRETIONARY_DATA /* 83 */:
                        if (regionMatch(stringBuffer, i, "SH") || regionMatch(stringBuffer, i, "SIO") || regionMatch(stringBuffer, i, "SIA")) {
                            stringBuffer2.append('X');
                        } else {
                            stringBuffer2.append('S');
                        }
                        break;
                    case EACTags.OFFSET_DATA_OBJECT /* 84 */:
                        if (regionMatch(stringBuffer, i, "TIA") || regionMatch(stringBuffer, i, "TIO")) {
                            stringBuffer2.append('X');
                        } else if (!regionMatch(stringBuffer, i, "TCH")) {
                            if (!regionMatch(stringBuffer, i, "TH")) {
                                stringBuffer2.append('T');
                            } else {
                                stringBuffer2.append('0');
                            }
                        }
                        break;
                    case EACTags.TRACK1_APPLICATION /* 86 */:
                        stringBuffer2.append('F');
                        break;
                    case 'W':
                    case 'Y':
                        if (!isLastChar(length, i) && isVowel(stringBuffer, i + 1)) {
                            stringBuffer2.append(cCharAt);
                        }
                        break;
                    case 'X':
                        stringBuffer2.append('K');
                        stringBuffer2.append('S');
                        break;
                    case 'Z':
                        stringBuffer2.append('S');
                        break;
                }
                i++;
            } else {
                i++;
            }
            if (stringBuffer2.length() > getMaxCodeLen()) {
                stringBuffer2.setLength(getMaxCodeLen());
            }
            z = z;
        }
        return stringBuffer2.toString();
    }

    public void setMaxCodeLen(int i) {
        this.maxCodeLen = i;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return metaphone(str);
    }
}
