package com.bytedance.hume.readapk;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.hume.readapk.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1114d {
    private C1114d() {
    }

    /* JADX INFO: renamed from: a */
    private static Map<Integer, ByteBuffer> m5683a(File file) {
        FileChannel channel;
        RandomAccessFile randomAccessFile;
        Map<Integer, ByteBuffer> mapM5672a = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    channel = randomAccessFile.getChannel();
                    try {
                        mapM5672a = C1110a.m5672a(C1110a.m5676c(channel).m5681a());
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
                        return mapM5672a;
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
            } catch (C1115e | IOException unused7) {
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
        return mapM5672a;
    }

    /* JADX INFO: renamed from: b */
    public static byte[][] m5686b(File file, int[] iArr) {
        Map<Integer, ByteBuffer> mapM5683a = m5683a(file);
        if (mapM5683a == null || iArr.length <= 0) {
            return null;
        }
        byte[][] bArr = new byte[iArr.length][];
        for (int i = 0; i < iArr.length; i++) {
            ByteBuffer byteBuffer = mapM5683a.get(Integer.valueOf(iArr[i]));
            if (byteBuffer != null) {
                bArr[i] = m5684a(byteBuffer);
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m5684a(ByteBuffer byteBuffer) {
        byte[] bArrArray = byteBuffer.array();
        int iArrayOffset = byteBuffer.arrayOffset();
        return Arrays.copyOfRange(bArrArray, byteBuffer.position() + iArrayOffset, iArrayOffset + byteBuffer.limit());
    }

    /* JADX INFO: renamed from: a */
    public static String[] m5685a(File file, int[] iArr) {
        byte[][] bArrM5686b = m5686b(file, iArr);
        if (bArrM5686b == null) {
            return null;
        }
        String[] strArr = new String[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            try {
                byte[] bArr = bArrM5686b[i];
                if (bArr != null) {
                    strArr[i] = new String(bArr, "UTF-8");
                } else {
                    strArr[i] = "";
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                return strArr;
            }
        }
        return strArr;
    }
}
