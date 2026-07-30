package com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.util.C13067a;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import p133rx.subjects.C22392a;
import p149l.e30;
import p149l.k9j;
import p149l.lsi0;
import p149l.rhi;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.a */
/* JADX INFO: loaded from: classes11.dex */
public class C13067a {

    /* JADX INFO: renamed from: a */
    public static C22392a<MediaWrapper> f54052a = C22392a.m221512b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m79015a(Map map, ArrayList arrayList, Media media) {
        if (TextUtils.isEmpty(media.originUrl)) {
            media.originUrl = media.url;
        }
        String strM79017c = m79017c(map, media.url);
        media.url = strM79017c;
        MediaWrapper.C13066a c13066a = (MediaWrapper.C13066a) map.get(strM79017c);
        media.mediaType = "image/*";
        if (NullChecker.m81303a(c13066a)) {
            if (c13066a.f54051b == (arrayList.size() != 1)) {
                media.status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
                media.url = m79017c(map, media.url);
                return;
            }
        }
        media.status = MediaLocalStatus.get("raw");
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab A[Catch: IOException -> 0x0088, PHI: r2 r3 r5
      0x00ab: PHI (r2v6 java.io.FileOutputStream) = (r2v15 java.io.FileOutputStream), (r2v16 java.io.FileOutputStream) binds: [B:44:0x00a9, B:52:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r3v8 com.p1.mobile.putong.data.Picture) = (r3v18 com.p1.mobile.putong.data.Picture), (r3v19 com.p1.mobile.putong.data.Picture) binds: [B:44:0x00a9, B:52:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x00ab: PHI (r5v10 boolean) = (r5v13 boolean), (r5v14 boolean) binds: [B:44:0x00a9, B:52:0x00bf] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TRY_LEAVE, TryCatch #1 {IOException -> 0x0088, blocks: (B:25:0x0084, B:45:0x00ab), top: B:70:0x0031 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.FileOutputStream, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [com.p1.mobile.putong.data.Media] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.graphics.Bitmap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0089 -> B:66:0x00c2). Please report as a decompilation issue!!! */
    /* JADX INFO: renamed from: b */
    public static Media m79016b(String str) throws Throwable {
        Picture picture;
        Picture picture2;
        boolean zM81303a;
        boolean z;
        Picture picture3;
        FileOutputStream fileOutputStream;
        boolean zM81303a2;
        Picture picture4;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        String strM179377u = rhi.m179377u(str);
        BitmapFactory.decodeFile(strM179377u, options);
        options.inJustDecodeBounds = false;
        int i = options.outWidth;
        ?? r2 = 0;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        r2 = 0;
        if (i <= 0 || options.outHeight * 9 < i * 16) {
            return null;
        }
        int iM208412y0 = xdl0.m208412y0();
        ?? M208408w0 = xdl0.m208408w0();
        options.inSampleSize = rhi.m179357a(options, iM208412y0, M208408w0);
        ?? DecodeFile = BitmapFactory.decodeFile(strM179377u, options);
        try {
            try {
                try {
                    File fileM145083O = k9j.m145083O("jpg");
                    FileOutputStream fileOutputStream4 = new FileOutputStream(fileM145083O);
                    if (DecodeFile == 0) {
                        try {
                            try {
                                lsi0.m151578h(R$string.f17485q);
                            } catch (Throwable th) {
                                th = th;
                                r2 = fileOutputStream4;
                                if (NullChecker.m81303a(DecodeFile)) {
                                    DecodeFile.recycle();
                                }
                                if (NullChecker.m81303a(r2)) {
                                    try {
                                        r2.close();
                                    } catch (IOException e) {
                                        CrashHelper.m81296c(e);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            picture4 = null;
                            fileOutputStream2 = fileOutputStream4;
                            picture2 = picture4;
                            CrashHelper.m81296c(e);
                            if (NullChecker.m81303a(DecodeFile)) {
                                DecodeFile.recycle();
                            }
                            zM81303a2 = NullChecker.m81303a(fileOutputStream2);
                            fileOutputStream = fileOutputStream2;
                            picture3 = picture2;
                            z = zM81303a2;
                            r2 = fileOutputStream2;
                            M208408w0 = picture2;
                            DecodeFile = zM81303a2;
                            if (zM81303a2) {
                                fileOutputStream.close();
                                r2 = fileOutputStream;
                                M208408w0 = picture3;
                                DecodeFile = z;
                            }
                            return M208408w0;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            picture4 = null;
                            fileOutputStream3 = fileOutputStream4;
                            picture = picture4;
                            CrashHelper.m81296c(e);
                            if (NullChecker.m81303a(DecodeFile)) {
                                DecodeFile.recycle();
                            }
                            zM81303a = NullChecker.m81303a(fileOutputStream3);
                            fileOutputStream = fileOutputStream3;
                            picture3 = picture;
                            z = zM81303a;
                            r2 = fileOutputStream3;
                            M208408w0 = picture;
                            DecodeFile = zM81303a;
                            if (zM81303a) {
                                fileOutputStream.close();
                                r2 = fileOutputStream;
                                M208408w0 = picture3;
                                DecodeFile = z;
                            }
                            return M208408w0;
                        }
                    }
                    DecodeFile.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream4);
                    fileOutputStream4.flush();
                    picture4 = new Picture();
                    try {
                        String str2 = "image/*";
                        picture4.mediaType = "image/*";
                        picture4.url = rhi.m179355B(fileM145083O.getPath());
                        picture4.status = MediaLocalStatus.get("raw");
                        if (NullChecker.m81303a(DecodeFile)) {
                            DecodeFile.recycle();
                        }
                        boolean zM81303a3 = NullChecker.m81303a(fileOutputStream4);
                        r2 = str2;
                        M208408w0 = picture4;
                        DecodeFile = zM81303a3;
                        if (zM81303a3) {
                            fileOutputStream4.close();
                            r2 = str2;
                            M208408w0 = picture4;
                            DecodeFile = zM81303a3;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        fileOutputStream2 = fileOutputStream4;
                        picture2 = picture4;
                        CrashHelper.m81296c(e);
                        if (NullChecker.m81303a(DecodeFile)) {
                            DecodeFile.recycle();
                        }
                        zM81303a2 = NullChecker.m81303a(fileOutputStream2);
                        fileOutputStream = fileOutputStream2;
                        picture3 = picture2;
                        z = zM81303a2;
                        r2 = fileOutputStream2;
                        M208408w0 = picture2;
                        DecodeFile = zM81303a2;
                        if (zM81303a2) {
                            fileOutputStream.close();
                            r2 = fileOutputStream;
                            M208408w0 = picture3;
                            DecodeFile = z;
                        }
                    } catch (OutOfMemoryError e5) {
                        e = e5;
                        fileOutputStream3 = fileOutputStream4;
                        picture = picture4;
                        CrashHelper.m81296c(e);
                        if (NullChecker.m81303a(DecodeFile)) {
                            DecodeFile.recycle();
                        }
                        zM81303a = NullChecker.m81303a(fileOutputStream3);
                        fileOutputStream = fileOutputStream3;
                        picture3 = picture;
                        z = zM81303a;
                        r2 = fileOutputStream3;
                        M208408w0 = picture;
                        DecodeFile = zM81303a;
                        if (zM81303a) {
                            fileOutputStream.close();
                            r2 = fileOutputStream;
                            M208408w0 = picture3;
                            DecodeFile = z;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e6) {
                e = e6;
                picture2 = null;
            } catch (OutOfMemoryError e7) {
                e = e7;
                picture = null;
            }
        } catch (IOException e8) {
            CrashHelper.m81296c(e8);
            r2 = r2;
            M208408w0 = M208408w0;
            DecodeFile = e8;
        }
        return M208408w0;
    }

    /* JADX INFO: renamed from: c */
    public static String m79017c(Map<String, MediaWrapper.C13066a> map, String str) {
        return map.containsKey(str) ? map.get(str).m79014a() : str;
    }

    /* JADX INFO: renamed from: d */
    public static long m79018d(Act act, String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        long j = -1;
        try {
            mediaMetadataRetriever.setDataSource(act, Uri.fromFile(new File(rhi.m179382z(str))));
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (!TextUtils.isEmpty(strExtractMetadata)) {
                j = Long.parseLong(strExtractMetadata);
            }
        } catch (Throwable th) {
            try {
                CrashHelper.m81296c(th);
            } finally {
                try {
                    mediaMetadataRetriever.release();
                } catch (Exception unused) {
                }
            }
        }
        return j;
    }

    /* JADX INFO: renamed from: e */
    public static Dimension m79019e(Act act, String str) {
        Dimension dimensionNew_ = Dimension.new_();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource(act, Uri.fromFile(new File(rhi.m179382z(str))));
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                String strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                if (TextUtils.equals(strExtractMetadata3, "90") || TextUtils.equals(strExtractMetadata3, "270")) {
                    if (!TextUtils.isEmpty(strExtractMetadata)) {
                        dimensionNew_.height = Integer.parseInt(strExtractMetadata);
                    }
                    if (!TextUtils.isEmpty(strExtractMetadata2)) {
                        dimensionNew_.width = Integer.parseInt(strExtractMetadata2);
                    }
                } else {
                    if (!TextUtils.isEmpty(strExtractMetadata)) {
                        dimensionNew_.width = Integer.parseInt(strExtractMetadata);
                    }
                    if (!TextUtils.isEmpty(strExtractMetadata2)) {
                        dimensionNew_.height = Integer.parseInt(strExtractMetadata2);
                    }
                }
                mediaMetadataRetriever.release();
                return dimensionNew_;
            } catch (Throwable th) {
                try {
                    CrashHelper.m81296c(th);
                    mediaMetadataRetriever.release();
                    return dimensionNew_;
                } catch (Throwable th2) {
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Exception unused) {
                    }
                    throw th2;
                }
            }
        } catch (Exception unused2) {
            return dimensionNew_;
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m79020f(Dimension dimension) {
        if (NullChecker.m81304b(dimension)) {
            return dimension.height >= 4000 || dimension.width >= 7000;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static void m79021g(final ArrayList<Media> arrayList, final Map<String, MediaWrapper.C13066a> map) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        vwb.m200354z(arrayList, new e30() { // from class: l.vf20
            @Override // p149l.e30
            public final void call(Object obj) {
                C13067a.m79015a(map, arrayList, (Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static void m79022h(MediaWrapper mediaWrapper) {
        f54052a.onNext(mediaWrapper);
    }
}
