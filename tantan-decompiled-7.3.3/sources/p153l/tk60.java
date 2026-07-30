package p153l;

import com.meituan.android.walle.SignatureNotFoundException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class tk60 {
    /* JADX INFO: renamed from: a */
    public static byte[] m191540a(File file, int i) {
        ByteBuffer byteBuffer;
        Map<Integer, ByteBuffer> mapM191541b = m191541b(file);
        if (mapM191541b == null || (byteBuffer = mapM191541b.get(Integer.valueOf(i))) == null) {
            return null;
        }
        return m191542c(byteBuffer);
    }

    /* JADX INFO: renamed from: b */
    private static Map<Integer, ByteBuffer> m191541b(File file) {
        FileChannel channel;
        RandomAccessFile randomAccessFile;
        Map<Integer, ByteBuffer> mapM207807f = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile.getChannel();
                    try {
                        mapM207807f = wt0.m207807f(wt0.m207803b(channel).m167407a());
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused) {
                            }
                        }
                    } catch (IOException unused2) {
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused3) {
                            }
                        }
                        if (randomAccessFile != null) {
                        }
                        return mapM207807f;
                    } catch (Throwable th) {
                        th = th;
                        if (channel != null) {
                            try {
                                channel.close();
                            } catch (IOException unused4) {
                            }
                        }
                        if (randomAccessFile == null) {
                            throw th;
                        }
                        try {
                            randomAccessFile.close();
                            throw th;
                        } catch (IOException unused5) {
                            throw th;
                        }
                    }
                } catch (IOException unused6) {
                    channel = null;
                } catch (Throwable th2) {
                    th = th2;
                    channel = null;
                }
            } catch (SignatureNotFoundException | IOException unused7) {
            }
        } catch (IOException unused8) {
            channel = null;
            randomAccessFile = null;
        } catch (Throwable th3) {
            th = th3;
            channel = null;
            randomAccessFile = null;
        }
        randomAccessFile.close();
        return mapM207807f;
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m191542c(ByteBuffer byteBuffer) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        return Arrays.copyOfRange(bArrArray, byteBuffer.position() + iArrayOffset, iArrayOffset + byteBuffer.limit());
    }

    /* JADX INFO: renamed from: d */
    public static String m191543d(File file, int i) {
        byte[] bArrM191540a = m191540a(file, i);
        if (bArrM191540a == null) {
            return null;
        }
        try {
            return new String(bArrM191540a, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
