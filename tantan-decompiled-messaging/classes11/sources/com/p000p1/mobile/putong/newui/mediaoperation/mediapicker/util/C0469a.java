package com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.util.C0469a;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import l.e30;
import l.k9j;
import l.lsi0;
import l.rhi;
import l.vwb;
import l.xdl0;
import rx.subjects.a;

/* JADX INFO: renamed from: com.p1.mobile.putong.newui.mediaoperation.mediapicker.util.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0469a {

    /* JADX INFO: renamed from: a */
    public static a<MediaWrapper> f7658a = a.b();

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m9323a(Map map, ArrayList arrayList, Media media) {
        if (TextUtils.isEmpty(media.originUrl)) {
            media.originUrl = media.url;
        }
        String strM9325c = m9325c(map, media.url);
        media.url = strM9325c;
        MediaWrapper.C0468a c0468a = (MediaWrapper.C0468a) map.get(strM9325c);
        media.mediaType = "image/*";
        if (NullChecker.a(c0468a)) {
            if (c0468a.f7657b == (arrayList.size() != 1)) {
                media.status = MediaLocalStatus.get("preprocessed");
                media.url = m9325c(map, media.url);
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
    public static Media m9324b(String str) throws Throwable {
        Picture picture;
        Picture picture2;
        boolean zA;
        boolean z;
        Picture picture3;
        FileOutputStream fileOutputStream;
        boolean zA2;
        Picture picture4;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        String strU = rhi.u(str);
        BitmapFactory.decodeFile(strU, options);
        options.inJustDecodeBounds = false;
        int i = options.outWidth;
        ?? r2 = 0;
        FileOutputStream fileOutputStream2 = null;
        FileOutputStream fileOutputStream3 = null;
        r2 = 0;
        if (i <= 0 || options.outHeight * 9 < i * 16) {
            return null;
        }
        int iY0 = xdl0.y0();
        ?? W0 = xdl0.w0();
        options.inSampleSize = rhi.a(options, iY0, (int) W0);
        ?? DecodeFile = BitmapFactory.decodeFile(strU, options);
        try {
            try {
                try {
                    File fileO = k9j.O("jpg");
                    FileOutputStream fileOutputStream4 = new FileOutputStream(fileO);
                    if (DecodeFile == 0) {
                        try {
                            try {
                                lsi0.h(R.string.q);
                            } catch (Throwable th) {
                                th = th;
                                r2 = fileOutputStream4;
                                if (NullChecker.a((Object) DecodeFile)) {
                                    DecodeFile.recycle();
                                }
                                if (NullChecker.a((Object) r2)) {
                                    try {
                                        r2.close();
                                    } catch (IOException e) {
                                        CrashHelper.c(e);
                                    }
                                }
                                throw th;
                            }
                        } catch (IOException e2) {
                            e = e2;
                            picture4 = null;
                            fileOutputStream2 = fileOutputStream4;
                            picture2 = picture4;
                            CrashHelper.c(e);
                            if (NullChecker.a((Object) DecodeFile)) {
                                DecodeFile.recycle();
                            }
                            zA2 = NullChecker.a(fileOutputStream2);
                            fileOutputStream = fileOutputStream2;
                            picture3 = picture2;
                            z = zA2;
                            r2 = fileOutputStream2;
                            W0 = picture2;
                            DecodeFile = zA2;
                            if (zA2) {
                                fileOutputStream.close();
                                r2 = fileOutputStream;
                                W0 = picture3;
                                DecodeFile = z;
                            }
                            return W0;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            picture4 = null;
                            fileOutputStream3 = fileOutputStream4;
                            picture = picture4;
                            CrashHelper.c(e);
                            if (NullChecker.a((Object) DecodeFile)) {
                                DecodeFile.recycle();
                            }
                            zA = NullChecker.a(fileOutputStream3);
                            fileOutputStream = fileOutputStream3;
                            picture3 = picture;
                            z = zA;
                            r2 = fileOutputStream3;
                            W0 = picture;
                            DecodeFile = zA;
                            if (zA) {
                                fileOutputStream.close();
                                r2 = fileOutputStream;
                                W0 = picture3;
                                DecodeFile = z;
                            }
                            return W0;
                        }
                    }
                    DecodeFile.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream4);
                    fileOutputStream4.flush();
                    picture4 = new Picture();
                    try {
                        String str2 = "image/*";
                        ((Media) picture4).mediaType = "image/*";
                        ((Media) picture4).url = rhi.B(fileO.getPath());
                        ((Media) picture4).status = MediaLocalStatus.get("raw");
                        if (NullChecker.a((Object) DecodeFile)) {
                            DecodeFile.recycle();
                        }
                        boolean zA3 = NullChecker.a(fileOutputStream4);
                        r2 = str2;
                        W0 = picture4;
                        DecodeFile = zA3;
                        if (zA3) {
                            fileOutputStream4.close();
                            r2 = str2;
                            W0 = picture4;
                            DecodeFile = zA3;
                        }
                    } catch (IOException e4) {
                        e = e4;
                        fileOutputStream2 = fileOutputStream4;
                        picture2 = picture4;
                        CrashHelper.c(e);
                        if (NullChecker.a((Object) DecodeFile)) {
                            DecodeFile.recycle();
                        }
                        zA2 = NullChecker.a(fileOutputStream2);
                        fileOutputStream = fileOutputStream2;
                        picture3 = picture2;
                        z = zA2;
                        r2 = fileOutputStream2;
                        W0 = picture2;
                        DecodeFile = zA2;
                        if (zA2) {
                            fileOutputStream.close();
                            r2 = fileOutputStream;
                            W0 = picture3;
                            DecodeFile = z;
                        }
                    } catch (OutOfMemoryError e5) {
                        e = e5;
                        fileOutputStream3 = fileOutputStream4;
                        picture = picture4;
                        CrashHelper.c(e);
                        if (NullChecker.a((Object) DecodeFile)) {
                            DecodeFile.recycle();
                        }
                        zA = NullChecker.a(fileOutputStream3);
                        fileOutputStream = fileOutputStream3;
                        picture3 = picture;
                        z = zA;
                        r2 = fileOutputStream3;
                        W0 = picture;
                        DecodeFile = zA;
                        if (zA) {
                            fileOutputStream.close();
                            r2 = fileOutputStream;
                            W0 = picture3;
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
            CrashHelper.c(e8);
            r2 = r2;
            W0 = W0;
            DecodeFile = e8;
        }
        return W0;
    }

    /* JADX INFO: renamed from: c */
    public static String m9325c(Map<String, MediaWrapper.C0468a> map, String str) {
        return map.containsKey(str) ? map.get(str).m9322a() : str;
    }

    /* JADX INFO: renamed from: d */
    public static long m9326d(Act act, String str) {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        long j = -1;
        try {
            mediaMetadataRetriever.setDataSource((Context) act, Uri.fromFile(new File(rhi.z(str))));
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (!TextUtils.isEmpty(strExtractMetadata)) {
                j = Long.parseLong(strExtractMetadata);
            }
        } catch (Throwable th) {
            try {
                CrashHelper.c(th);
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
    public static Dimension m9327e(Act act, String str) {
        Dimension dimensionNew_ = Dimension.new_();
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                mediaMetadataRetriever.setDataSource((Context) act, Uri.fromFile(new File(rhi.z(str))));
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
                    CrashHelper.c(th);
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
    public static boolean m9328f(Dimension dimension) {
        if (NullChecker.b(dimension)) {
            return dimension.height >= 4000 || dimension.width >= 7000;
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static void m9329g(final ArrayList<Media> arrayList, final Map<String, MediaWrapper.C0468a> map) {
        if (vwb.J(arrayList)) {
            return;
        }
        vwb.z(arrayList, new e30() { // from class: l.vf20
            public final void call(Object obj) {
                C0469a.m9323a(map, arrayList, (Media) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static void m9330h(MediaWrapper mediaWrapper) {
        f7658a.onNext(mediaWrapper);
    }
}
