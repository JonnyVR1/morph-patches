package com.tencent.could.component.common.p084ai.utils;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class GZipUtils {
    public static final String TAG = "GZipUtils";

    /* JADX WARN: Code duplicated, block: B:52:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x0048: MOVE (r3 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:73), block:B:17:0x0048 */
    public static byte[] compress(String str) throws Throwable {
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        if (str != null) {
            try {
                if (str.length() != 0) {
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                                try {
                                    gZIPOutputStream.write(str.getBytes("UTF-8"));
                                    gZIPOutputStream.close();
                                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    try {
                                        gZIPOutputStream.close();
                                        return byteArray;
                                    } catch (IOException e) {
                                        Log.e(TAG, " gzip.close(): " + e.getLocalizedMessage());
                                        return byteArray;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th3) {
                                            th.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            Log.e(TAG, "compress Exception e: " + e.getLocalizedMessage());
                            if (0 != 0) {
                                try {
                                    outputStream2.close();
                                } catch (IOException e3) {
                                    Log.e(TAG, " gzip.close(): " + e3.getLocalizedMessage());
                                }
                            }
                            return null;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        Log.e(TAG, "compress Exception e: " + e.getLocalizedMessage());
                        if (0 != 0) {
                            outputStream2.close();
                        }
                        return null;
                    } catch (Throwable th5) {
                        th = th5;
                        if (outputStream2 != null) {
                            try {
                                outputStream2.close();
                            } catch (IOException e5) {
                                Log.e(TAG, " gzip.close(): " + e5.getLocalizedMessage());
                            }
                        }
                        throw th;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                outputStream2 = outputStream;
            }
        }
        return null;
    }

    public static boolean isGzip(byte[] bArr) {
        return ((bArr[1] & 255) | (bArr[0] << 8)) == 8075;
    }

    public static String uncompressToString(byte[] bArr) {
        String string = null;
        if (bArr != null && bArr.length != 0) {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                    try {
                        GZIPInputStream gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
                        try {
                            byte[] bArr2 = new byte[256];
                            while (true) {
                                int i = gZIPInputStream.read(bArr2);
                                if (i < 0) {
                                    string = byteArrayOutputStream.toString("UTF-8");
                                    gZIPInputStream.close();
                                    byteArrayInputStream.close();
                                    byteArrayOutputStream.close();
                                    return string;
                                }
                                byteArrayOutputStream.write(bArr2, 0, i);
                                try {
                                    throw th;
                                } catch (Throwable th) {
                                    try {
                                        byteArrayInputStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                try {
                                    gZIPInputStream.close();
                                } catch (Throwable th5) {
                                    th3.addSuppressed(th5);
                                }
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        throw th6;
                    }
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        try {
                            byteArrayOutputStream.close();
                        } catch (Throwable th9) {
                            th7.addSuppressed(th9);
                        }
                        throw th8;
                    }
                }
            } catch (IOException e) {
                Log.e(TAG, "uncompressToString Exception e: " + e.getLocalizedMessage());
            }
        }
        return string;
    }
}
