package com.bytedance.hume.readapk.p013a;

import java.io.DataInput;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.bytedance.hume.readapk.a.a */
/* JADX INFO: loaded from: classes.dex */
public class C1134a {

    /* JADX INFO: renamed from: a */
    static final byte[] f4757a = {108, 116, 108, 111, 118, 101, 122, 104};

    /* JADX WARN: Code duplicated, block: B:64:0x0071 A[EXC_TOP_SPLITTER, PHI: r1
      0x0071: PHI (r1v8 java.io.RandomAccessFile) = 
      (r1v5 java.io.RandomAccessFile)
      (r1v6 java.io.RandomAccessFile)
      (r1v7 java.io.RandomAccessFile)
      (r1v9 java.io.RandomAccessFile)
     binds: [B:43:0x006f, B:50:0x007f, B:55:0x0089, B:53:0x0085] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x008f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static String m5731a(File file) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        try {
            try {
                randomAccessFile = new RandomAccessFile(file, "r");
                try {
                    long length = randomAccessFile.length();
                    byte[] bArr = f4757a;
                    byte[] bArr2 = new byte[bArr.length];
                    long length2 = length - ((long) bArr.length);
                    randomAccessFile.seek(length2);
                    randomAccessFile.readFully(bArr2);
                    if (m5733a(bArr2)) {
                        long j = length2 - 2;
                        randomAccessFile.seek(j);
                        int iM5732a = m5732a(randomAccessFile);
                        if (iM5732a > 0) {
                            randomAccessFile.seek(j - ((long) iM5732a));
                            byte[] bArr3 = new byte[iM5732a];
                            randomAccessFile.readFully(bArr3);
                            String str2 = new String(bArr3, "UTF-8");
                            try {
                                randomAccessFile.close();
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            str = str2;
                        }
                        return str;
                    }
                    try {
                        randomAccessFile.close();
                        return "";
                    } catch (IOException e2) {
                        e2.printStackTrace();
                        return "";
                    }
                } catch (FileNotFoundException e3) {
                    e = e3;
                    e.printStackTrace();
                    if (randomAccessFile != null) {
                        try {
                            randomAccessFile.close();
                        } catch (IOException e4) {
                            e4.printStackTrace();
                        }
                    }
                } catch (UnsupportedEncodingException e5) {
                    e = e5;
                    e.printStackTrace();
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (IOException e6) {
                    e = e6;
                    e.printStackTrace();
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                } catch (Exception e7) {
                    e = e7;
                    e.printStackTrace();
                    if (randomAccessFile != null) {
                        randomAccessFile.close();
                    }
                }
            } catch (Throwable th) {
                th = th;
                randomAccessFile2 = randomAccessFile;
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e8) {
                        e8.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException e9) {
            e = e9;
            randomAccessFile = null;
        } catch (UnsupportedEncodingException e10) {
            e = e10;
            randomAccessFile = null;
        } catch (IOException e11) {
            e = e11;
            randomAccessFile = null;
        } catch (Exception e12) {
            e = e12;
            randomAccessFile = null;
        } catch (Throwable th2) {
            th = th2;
            if (randomAccessFile2 != null) {
                randomAccessFile2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private static short m5732a(DataInput dataInput) throws IOException {
        byte[] bArr = new byte[2];
        dataInput.readFully(bArr);
        return ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).getShort(0);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m5733a(byte[] bArr) {
        if (bArr.length != f4757a.length) {
            return false;
        }
        int i = 0;
        while (true) {
            byte[] bArr2 = f4757a;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }
}
