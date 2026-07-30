package org.eclipse.jetty.util;

import java.io.IOException;
import okio.Utf8;
import p153l.iig0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Utf8Appendable {
    public static final char REPLACEMENT = 65533;
    private static final int UTF8_ACCEPT = 0;
    private static final int UTF8_REJECT = 12;
    protected final Appendable _appendable;
    private int _codep;
    protected int _state = 0;
    private static final byte[] BYTE_TABLE = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 10, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 3, 11, 6, 6, 6, 5, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8};
    private static final byte[] TRANS_TABLE = {0, 12, 24, 36, 60, 96, 84, 12, 12, 12, 48, 72, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 0, 12, 12, 12, 12, 12, 0, 12, 0, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 24, 12, 12, 12, 12, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 36, 12, 36, 12, 12, 12, 36, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    public static class NotUtf8Exception extends IllegalArgumentException {
        public NotUtf8Exception(String str) {
            super("Not valid UTF8! " + str);
        }
    }

    public Utf8Appendable(Appendable appendable) {
        this._appendable = appendable;
    }

    public boolean append(byte[] bArr, int i, int i2, int i3) {
        int i4 = i2 + i;
        while (i < i4) {
            try {
                if (length() > i3) {
                    return false;
                }
                appendByte(bArr[i]);
                i++;
            } catch (IOException e) {
                iig0.m140070a(e);
                return false;
            }
        }
        return true;
    }

    public void appendByte(byte b) throws IOException {
        if (b > 0 && this._state == 0) {
            this._appendable.append((char) (b & 255));
            return;
        }
        int i = b & 255;
        byte b2 = BYTE_TABLE[i];
        int i2 = this._state;
        int i3 = i2 == 0 ? (255 >> b2) & i : (b & Utf8.REPLACEMENT_BYTE) | (this._codep << 6);
        this._codep = i3;
        byte b3 = TRANS_TABLE[i2 + b2];
        if (b3 == 0) {
            this._state = b3;
            if (i3 < 55296) {
                this._appendable.append((char) i3);
                return;
            }
            for (char c : Character.toChars(i3)) {
                this._appendable.append(c);
            }
            return;
        }
        if (b3 != 12) {
            this._state = b3;
            return;
        }
        String str = "byte " + TypeUtil.toHexString(b) + " in state " + (this._state / 12);
        this._codep = 0;
        this._state = 0;
        this._appendable.append((char) 65533);
        throw new NotUtf8Exception(str);
    }

    public boolean isUtf8SequenceComplete() {
        return this._state == 0;
    }

    public abstract int length();

    public void reset() {
        this._state = 0;
    }

    public void append(byte[] bArr, int i, int i2) {
        int i3 = i2 + i;
        while (i < i3) {
            try {
                appendByte(bArr[i]);
                i++;
            } catch (IOException e) {
                iig0.m140070a(e);
                return;
            }
        }
    }

    public void append(byte b) {
        try {
            appendByte(b);
        } catch (IOException e) {
            iig0.m140070a(e);
        }
    }
}
