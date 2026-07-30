package org.apache.commons.codec.language;

import org.apache.commons.codec.EncoderException;
import org.apache.commons.codec.StringEncoder;
import p153l.tr3;

/* JADX INFO: loaded from: classes2.dex */
public class Soundex implements StringEncoder {
    private int maxLength;
    private final char[] soundexMapping;
    public static final String US_ENGLISH_MAPPING_STRING = "01230120022455012623010202";
    private static final char[] US_ENGLISH_MAPPING = US_ENGLISH_MAPPING_STRING.toCharArray();
    public static final Soundex US_ENGLISH = new Soundex();

    public Soundex(char[] cArr) {
        this.maxLength = 4;
        char[] cArr2 = new char[cArr.length];
        this.soundexMapping = cArr2;
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
    }

    private char getMappingCode(String str, int i) {
        char cCharAt;
        char map = map(str.charAt(i));
        if (i > 1 && map != '0' && ('H' == (cCharAt = str.charAt(i - 1)) || 'W' == cCharAt)) {
            char cCharAt2 = str.charAt(i - 2);
            if (map(cCharAt2) == map || 'H' == cCharAt2 || 'W' == cCharAt2) {
                return (char) 0;
            }
        }
        return map;
    }

    private char[] getSoundexMapping() {
        return this.soundexMapping;
    }

    private char map(char c) {
        int i = c - 'A';
        if (i >= 0 && i < getSoundexMapping().length) {
            return getSoundexMapping()[i];
        }
        tr3.m192404a("The character is not mapped: ", c);
        return (char) 0;
    }

    public int difference(String str, String str2) throws EncoderException {
        return SoundexUtils.difference(this, str, str2);
    }

    @Override // org.apache.commons.codec.Encoder
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return soundex((String) obj);
        }
        throw new EncoderException("Parameter supplied to Soundex encode is not of type java.lang.String");
    }

    public int getMaxLength() {
        return this.maxLength;
    }

    public void setMaxLength(int i) {
        this.maxLength = i;
    }

    public String soundex(String str) {
        if (str == null) {
            return null;
        }
        String strClean = SoundexUtils.clean(str);
        if (strClean.length() == 0) {
            return strClean;
        }
        int i = 1;
        char[] cArr = {'0', '0', '0', '0'};
        cArr[0] = strClean.charAt(0);
        char mappingCode = getMappingCode(strClean, 0);
        int i2 = 1;
        while (i < strClean.length() && i2 < 4) {
            int i3 = i + 1;
            char mappingCode2 = getMappingCode(strClean, i);
            if (mappingCode2 != 0) {
                if (mappingCode2 != '0' && mappingCode2 != mappingCode) {
                    cArr[i2] = mappingCode2;
                    i2++;
                }
                mappingCode = mappingCode2;
            }
            i = i3;
        }
        return new String(cArr);
    }

    public Soundex() {
        this.maxLength = 4;
        this.soundexMapping = US_ENGLISH_MAPPING;
    }

    @Override // org.apache.commons.codec.StringEncoder
    public String encode(String str) {
        return soundex(str);
    }

    public Soundex(String str) {
        this.maxLength = 4;
        this.soundexMapping = str.toCharArray();
    }
}
