package org.apache.commons.codec.net;

import org.apache.commons.codec.DecoderException;

/* JADX INFO: loaded from: classes2.dex */
class Utils {
    public static int digit16(byte b) throws DecoderException {
        int iDigit = Character.digit((char) b, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new DecoderException("Invalid URL encoding: not a valid digit (radix 16): " + ((int) b));
    }
}
