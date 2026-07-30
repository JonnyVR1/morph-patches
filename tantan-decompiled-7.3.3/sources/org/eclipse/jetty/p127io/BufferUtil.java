package org.eclipse.jetty.p127io;

import com.google.android.exoplayer2.PlaybackException;
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import io.requery.android.database.sqlite.SQLiteDatabase;
import org.eclipse.jetty.http.HttpTokens;
import org.eclipse.jetty.util.StringUtil;

/* JADX INFO: loaded from: classes2.dex */
public class BufferUtil {
    static final byte MINUS = 45;
    static final byte SPACE = 32;
    static final byte[] DIGIT = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
    private static final int[] decDivisors = {1000000000, 100000000, 10000000, PlaybackException.CUSTOM_ERROR_CODE_BASE, LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY, 10000, 1000, 100, 10, 1};
    private static final int[] hexDivisors = {SQLiteDatabase.CREATE_IF_NECESSARY, 16777216, 1048576, 65536, 4096, 256, 16, 1};
    private static final long[] decDivisorsL = {1000000000000000000L, 100000000000000000L, 10000000000000000L, 1000000000000000L, 100000000000000L, 10000000000000L, 1000000000000L, 100000000000L, 10000000000L, 1000000000, 100000000, 10000000, 1000000, 100000, 10000, 1000, 100, 10, 1};

    public static boolean isPrefix(Buffer buffer, Buffer buffer2) {
        if (buffer.length() > buffer2.length()) {
            return false;
        }
        int index = buffer2.getIndex();
        int index2 = buffer.getIndex();
        while (index2 < buffer.putIndex()) {
            int i = index + 1;
            if (buffer.peek(index2) != buffer2.peek(index)) {
                return false;
            }
            index2++;
            index = i;
        }
        return true;
    }

    public static void prependHexInt(Buffer buffer, int i) {
        boolean z;
        if (i == 0) {
            int index = buffer.getIndex() - 1;
            buffer.poke(index, (byte) 48);
            buffer.setGetIndex(index);
            return;
        }
        if (i < 0) {
            i = -i;
            z = true;
        } else {
            z = false;
        }
        int index2 = buffer.getIndex();
        while (i > 0) {
            int i2 = i & 15;
            i >>= 4;
            index2--;
            buffer.poke(index2, DIGIT[i2]);
        }
        if (z) {
            index2--;
            buffer.poke(index2, MINUS);
        }
        buffer.setGetIndex(index2);
    }

    public static void putCRLF(Buffer buffer) {
        buffer.put(HttpTokens.CARRIAGE_RETURN);
        buffer.put((byte) 10);
    }

    public static void putDecInt(Buffer buffer, int i) {
        if (i < 0) {
            buffer.put(MINUS);
            if (i == Integer.MIN_VALUE) {
                buffer.put((byte) 50);
                i = 147483648;
            } else {
                i = -i;
            }
        }
        if (i < 10) {
            buffer.put(DIGIT[i]);
            return;
        }
        int i2 = 0;
        boolean z = false;
        while (true) {
            int[] iArr = decDivisors;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            if (i >= i3) {
                int i4 = i / i3;
                buffer.put(DIGIT[i4]);
                i -= i4 * iArr[i2];
                z = true;
            } else if (z) {
                buffer.put((byte) 48);
            }
            i2++;
        }
    }

    public static void putDecLong(Buffer buffer, long j) {
        if (j < 0) {
            buffer.put(MINUS);
            if (j == Long.MIN_VALUE) {
                buffer.put((byte) 57);
                j = 223372036854775808L;
            } else {
                j = -j;
            }
        }
        if (j < 10) {
            buffer.put(DIGIT[(int) j]);
            return;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long[] jArr = decDivisorsL;
            if (i >= jArr.length) {
                return;
            }
            long j2 = jArr[i];
            if (j >= j2) {
                long j3 = j / j2;
                buffer.put(DIGIT[(int) j3]);
                j -= j3 * jArr[i];
                z = true;
            } else if (z) {
                buffer.put((byte) 48);
            }
            i++;
        }
    }

    public static void putHexInt(Buffer buffer, int i) {
        if (i < 0) {
            buffer.put(MINUS);
            if (i == Integer.MIN_VALUE) {
                buffer.put((byte) 56);
                buffer.put((byte) 48);
                buffer.put((byte) 48);
                buffer.put((byte) 48);
                buffer.put((byte) 48);
                buffer.put((byte) 48);
                buffer.put((byte) 48);
                buffer.put((byte) 48);
                return;
            }
            i = -i;
        }
        if (i < 16) {
            buffer.put(DIGIT[i]);
            return;
        }
        int i2 = 0;
        boolean z = false;
        while (true) {
            int[] iArr = hexDivisors;
            if (i2 >= iArr.length) {
                return;
            }
            int i3 = iArr[i2];
            if (i >= i3) {
                int i4 = i / i3;
                buffer.put(DIGIT[i4]);
                i -= i4 * iArr[i2];
                z = true;
            } else if (z) {
                buffer.put((byte) 48);
            }
            i2++;
        }
    }

    public static String to8859_1_String(Buffer buffer) {
        return buffer instanceof BufferCache.CachedBuffer ? buffer.toString() : buffer.toString(StringUtil.__ISO_8859_1_CHARSET);
    }

    public static Buffer toBuffer(long j) {
        ByteArrayBuffer byteArrayBuffer = new ByteArrayBuffer(32);
        putDecLong(byteArrayBuffer, j);
        return byteArrayBuffer;
    }

    public static int toInt(Buffer buffer) {
        boolean z = false;
        int i = 0;
        boolean z2 = false;
        for (int index = buffer.getIndex(); index < buffer.putIndex(); index++) {
            byte bPeek = buffer.peek(index);
            if (bPeek > 32) {
                if (bPeek >= 48 && bPeek <= 57) {
                    i = (i * 10) + (bPeek - 48);
                    z = true;
                } else {
                    if (bPeek != 45 || z) {
                        break;
                    }
                    z2 = true;
                }
            } else {
                if (z) {
                    break;
                }
            }
        }
        if (z) {
            return z2 ? -i : i;
        }
        throw new NumberFormatException(buffer.toString());
    }

    public static long toLong(Buffer buffer) {
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        for (int index = buffer.getIndex(); index < buffer.putIndex(); index++) {
            byte bPeek = buffer.peek(index);
            if (bPeek > 32) {
                if (bPeek >= 48 && bPeek <= 57) {
                    j = (j * 10) + ((long) (bPeek - 48));
                    z = true;
                } else {
                    if (bPeek != 45 || z) {
                        break;
                    }
                    z2 = true;
                }
            } else {
                if (z) {
                    break;
                }
            }
        }
        if (z) {
            return z2 ? -j : j;
        }
        throw new NumberFormatException(buffer.toString());
    }
}
