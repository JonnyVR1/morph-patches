package com.tencent.youtu.ytagreflectlivecheck.jni.model;

import android.util.Base64;
import com.tencent.youtu.ytagreflectlivecheck.data.YTActReflectImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class YTImageInfo {
    public String checksum;
    public ArrayList<Float> five_points;
    public String image;

    public YTImageInfo(YTActReflectImage yTActReflectImage) {
        this.image = new String(Base64.encode(yTActReflectImage.image, 2));
        this.checksum = yTActReflectImage.checksum;
        ArrayList<Float> arrayList = new ArrayList<>();
        this.five_points = arrayList;
        float[] fArr = yTActReflectImage.xys;
        if (fArr != null) {
            arrayList.add(Float.valueOf(fArr[176]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[177]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[178]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[179]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[64]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[65]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[90]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[91]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[102]));
            this.five_points.add(Float.valueOf(yTActReflectImage.xys[103]));
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x005b -> B:58:0x005e). Please report as a decompilation issue!!! */
    private void createFileWithByte(String str, byte[] bArr) throws Throwable {
        ?? r4;
        Throwable th;
        ?? r5;
        FileOutputStream fileOutputStream;
        Exception e;
        ?? e2 = new File(str);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                try {
                    if (e2.exists()) {
                        e2.delete();
                    }
                    e2.createNewFile();
                    fileOutputStream = new FileOutputStream((File) e2);
                    try {
                        e2 = new BufferedOutputStream(fileOutputStream);
                        try {
                            e2.write(bArr);
                            e2.flush();
                            try {
                                fileOutputStream.close();
                            } catch (IOException e3) {
                                e3.printStackTrace();
                            }
                            e2.close();
                        } catch (Exception e4) {
                            e = e4;
                            e.printStackTrace();
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            if (e2 != 0) {
                                e2.close();
                            }
                        }
                    } catch (Exception e6) {
                        e = e6;
                        e2 = 0;
                    } catch (Throwable th2) {
                        th = th2;
                        r4 = 0;
                        fileOutputStream2 = fileOutputStream;
                        r5 = r4;
                        if (fileOutputStream2 != null) {
                            try {
                                fileOutputStream2.close();
                            } catch (IOException e7) {
                                e7.printStackTrace();
                            }
                        }
                        if (r5 != 0) {
                            throw th;
                        }
                        try {
                            r5.close();
                            throw th;
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            throw th;
                        }
                    }
                } catch (Throwable th3) {
                    r4 = e2;
                    th = th3;
                }
            } catch (Exception e9) {
                fileOutputStream = null;
                e = e9;
                e2 = 0;
            } catch (Throwable th4) {
                th = th4;
                r5 = 0;
                if (fileOutputStream2 != null) {
                    fileOutputStream2.close();
                }
                if (r5 != 0) {
                    throw th;
                }
                r5.close();
                throw th;
            }
        } catch (Exception e10) {
            e2 = e10;
            e2.printStackTrace();
        }
    }
}
