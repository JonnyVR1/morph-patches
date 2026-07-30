package com.p046p1.mobile.putong.core.p053ui.messages.sogou;

import android.net.Uri;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import p149l.j5e;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.sogou.b */
/* JADX INFO: loaded from: classes4.dex */
public class C8585b {

    /* JADX INFO: renamed from: a */
    public static ImageHeaderParser f32288a = new C8584a();

    /* JADX INFO: renamed from: a */
    public static File m49760a(Uri uri, String str) throws Throwable {
        File file;
        InputStream inputStream = null;
        try {
            try {
                String strMo139841b = j5e.m139840a(zvf0.m220383e(), uri).mo139841b();
                InputStream inputStreamOpenInputStream = zvf0.m220383e().getContentResolver().openInputStream(uri);
                try {
                    try {
                        file = new File(str, strMo139841b);
                        try {
                            File file2 = new File(str);
                            if (!file.exists()) {
                                if (!file2.exists()) {
                                    file2.mkdirs();
                                }
                                FileOutputStream fileOutputStream = new FileOutputStream(file);
                                byte[] bArr = new byte[2048];
                                while (true) {
                                    int i = inputStreamOpenInputStream.read(bArr);
                                    if (i <= 0) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, i);
                                }
                                fileOutputStream.close();
                            }
                            if (NullChecker.m81303a(inputStreamOpenInputStream)) {
                                inputStreamOpenInputStream.close();
                            }
                        } catch (Exception unused) {
                            inputStream = inputStreamOpenInputStream;
                            if (NullChecker.m81303a(inputStream)) {
                                inputStream.close();
                            }
                            return file;
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamOpenInputStream;
                        if (NullChecker.m81303a(inputStream)) {
                            try {
                                inputStream.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Exception unused3) {
                    file = null;
                }
            } catch (IOException unused4) {
            }
        } catch (Exception unused5) {
            file = null;
        } catch (Throwable th2) {
            th = th2;
        }
        return file;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x001b A[DONT_GENERATE, EXC_TOP_SPLITTER, PHI: r0 r1
      0x001b: PHI (r0v3 com.p1.mobile.putong.core.ui.messages.sogou.ImageHeaderParser$ImageType) = 
      (r0v0 com.p1.mobile.putong.core.ui.messages.sogou.ImageHeaderParser$ImageType)
      (r0v5 com.p1.mobile.putong.core.ui.messages.sogou.ImageHeaderParser$ImageType)
     binds: [B:14:0x002e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]
      0x001b: PHI (r1v3 java.io.InputStream) = (r1v2 java.io.InputStream), (r1v4 java.io.InputStream) binds: [B:14:0x002e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static ImageHeaderParser.ImageType m49761b(Uri uri) {
        ImageHeaderParser.ImageType imageTypeMo49756a = ImageHeaderParser.ImageType.UNKNOWN;
        InputStream inputStreamOpenInputStream = null;
        try {
            inputStreamOpenInputStream = zvf0.m220383e().getContentResolver().openInputStream(uri);
            imageTypeMo49756a = f32288a.mo49756a(inputStreamOpenInputStream);
        } catch (Exception unused) {
        } finally {
            if (NullChecker.m81303a(inputStreamOpenInputStream)) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException unused2) {
                }
            }
        }
        return imageTypeMo49756a;
    }

    /* JADX INFO: renamed from: c */
    public static ImageHeaderParser.ImageType m49762c(File file) throws Throwable {
        ImageHeaderParser.ImageType imageTypeMo49756a = ImageHeaderParser.ImageType.UNKNOWN;
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    imageTypeMo49756a = f32288a.mo49756a(fileInputStream2);
                    if (NullChecker.m81303a(fileInputStream2)) {
                        fileInputStream2.close();
                    }
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    if (NullChecker.m81303a(fileInputStream)) {
                        fileInputStream.close();
                    }
                    return imageTypeMo49756a;
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    if (NullChecker.m81303a(fileInputStream)) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused3) {
            }
        } catch (Exception unused4) {
        } catch (Throwable th2) {
            th = th2;
        }
        return imageTypeMo49756a;
    }
}
