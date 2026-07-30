package p149l;

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
public final class oc60 {
    /* JADX INFO: renamed from: a */
    public static byte[] m163478a(File file, int i) {
        ByteBuffer byteBuffer;
        Map<Integer, ByteBuffer> mapM163479b = m163479b(file);
        if (mapM163479b == null || (byteBuffer = mapM163479b.get(Integer.valueOf(i))) == null) {
            return null;
        }
        return m163480c(byteBuffer);
    }

    /* JADX INFO: renamed from: b */
    private static Map<Integer, ByteBuffer> m163479b(File file) {
        FileChannel channel;
        RandomAccessFile randomAccessFile;
        Map<Integer, ByteBuffer> mapM176384f = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile.getChannel();
                    try {
                        mapM176384f = qt0.m176384f(qt0.m176380b(channel).m134745a());
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
                        return mapM176384f;
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
        return mapM176384f;
    }

    /* JADX INFO: renamed from: c */
    private static byte[] m163480c(ByteBuffer byteBuffer) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        return Arrays.copyOfRange(bArrArray, byteBuffer.position() + iArrayOffset, iArrayOffset + byteBuffer.limit());
    }

    /* JADX INFO: renamed from: d */
    public static String m163481d(File file, int i) {
        byte[] bArrM163478a = m163478a(file, i);
        if (bArrM163478a == null) {
            return null;
        }
        try {
            return new String(bArrM163478a, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return null;
        }
    }
}
