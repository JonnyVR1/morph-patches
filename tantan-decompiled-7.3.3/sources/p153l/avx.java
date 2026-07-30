package p153l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.loader.app.AbstractC0495a;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class avx implements AbstractC0495a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f73668j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", BLiveOperationTitleShowType.duration};

    /* JADX INFO: renamed from: b */
    public final Context f73670b;

    /* JADX INFO: renamed from: c */
    public final boolean f73671c;

    /* JADX INFO: renamed from: d */
    public final boolean f73672d;

    /* JADX INFO: renamed from: e */
    public int f73673e;

    /* JADX INFO: renamed from: h */
    public boolean f73676h;

    /* JADX INFO: renamed from: a */
    public final C22507a<List<Media>> f73669a = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public int f73674f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f73675g = true;

    /* JADX INFO: renamed from: i */
    public boolean f73677i = false;

    public avx(Context context, boolean z, boolean z2, boolean z3, int i) {
        this.f73670b = context;
        this.f73672d = z;
        this.f73671c = z2;
        this.f73673e = i;
        this.f73676h = z3;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Picture m100529g(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ v2i0 m100531i(Object obj, List list) {
        return new v2i0(obj, list);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Video m100534l(Media media) {
        return (Video) media;
    }

    /* JADX INFO: renamed from: o */
    public static <T, E> C22421c<List<v2i0<T, E>>> m100537o(C22421c<List<E>> c22421c, final qcj<? super E, T> qcjVar) {
        return (C22421c<List<v2i0<T, E>>>) c22421c.map(new qcj() { // from class: l.ztx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147488S((List) obj, qcjVar, new rcj() { // from class: l.dux
                    @Override // p153l.rcj
                    public final Object call(Object obj2, Object obj3) {
                        return avx.m100531i(obj2, (List) obj3);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static <T, E> C22421c.d<List<E>, List<v2i0<T, E>>> m100538p(final qcj<E, T> qcjVar) {
        return new C22421c.d() { // from class: l.mtx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return avx.m100537o((C22421c) obj, qcjVar);
            }
        };
    }

    /* JADX INFO: renamed from: q */
    private utv m100539q(Uri uri) {
        boolean z = this.f73671c;
        if (z && this.f73672d) {
            Context context = this.f73670b;
            String[] strArr = f73668j;
            int i = this.f73673e;
            return new uym(context, uri, strArr, "media_type=1 OR media_type=3", null, "date_modified DESC", i, i * this.f73674f);
        }
        Context context2 = this.f73670b;
        if (z) {
            String[] strArr2 = f73668j;
            int i2 = this.f73673e;
            return new uym(context2, uri, strArr2, "media_type=3", null, "date_modified DESC", i2, i2 * this.f73674f);
        }
        String[] strArr3 = f73668j;
        int i3 = this.f73673e;
        return new uym(context2, uri, strArr3, "media_type=1", null, "date_modified DESC", i3, i3 * this.f73674f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m100540r(List list) {
        this.f73669a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m100541s(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f73668j;
                String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                int i = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[4]));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[5]));
                long j = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[6]));
                if (string != null && (!NullChecker.m82486a(string2) || !string2.contains("gif"))) {
                    File file = new File(string);
                    if (file.canRead() && file.length() != 0) {
                        if (i == 1) {
                            Picture picture = new Picture();
                            picture.mediaType = "image/*";
                            picture.url = oki.m168011B(string);
                            media = picture;
                        } else if (NullChecker.m82486a(string2) && string2.contains("mp4")) {
                            Video video = new Video();
                            video.duration = j;
                            video.mediaType = "video/*";
                            video.url = oki.m168011B(string);
                            media = video;
                        } else if (NullChecker.m82486a(string2) && string2.contains("3gp")) {
                            Video video2 = new Video();
                            video2.duration = j;
                            video2.mediaType = "video/*";
                            video2.url = oki.m168011B(string);
                            media = video2;
                        }
                        media.status = MediaLocalStatus.get("raw");
                        arrayList.add(media);
                    }
                }
            }
            if (arrayList.size() == 0 && this.f73674f != 0) {
                this.f73674f = 0;
                this.f73675g = false;
                return;
            }
            if (arrayList.size() == 0 && this.f73674f == 0) {
                this.f73677i = true;
            }
            this.f73674f++;
            l51.m152887G(new Runnable() { // from class: l.vtx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185757a.m100540r(arrayList);
                }
            });
        } catch (Exception e) {
            if (cursor.isClosed()) {
                return;
            }
            CrashHelper.m82480d(e, 10);
        }
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: a */
    public utv<Cursor> mo3109a(int i, Bundle bundle) {
        String str;
        String str2 = "";
        if (this.f73676h) {
            str = " LIMIT " + (this.f73673e * this.f73674f) + Constants.SEPARATOR_COMMA + this.f73673e;
            if (this.f73674f == 0) {
                str = " LIMIT " + this.f73673e;
            }
        } else {
            str = "";
        }
        if (this.f73677i) {
            this.f73675g = false;
        } else {
            str2 = str;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        if (Build.VERSION.SDK_INT >= 30) {
            return m100539q(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f73671c;
        if (z && this.f73672d) {
            return new wyb(this.f73670b, contentUri, f73668j, "media_type=1 OR media_type=3", null, strConcat);
        }
        Context context = this.f73670b;
        return z ? new wyb(context, contentUri, f73668j, "media_type=3", null, strConcat) : new wyb(context, contentUri, f73668j, "media_type=1", null, strConcat);
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: c */
    public void mo3111c(utv<Cursor> utvVar) {
        this.f73669a.onNext(Collections.EMPTY_LIST);
        this.f73669a.onCompleted();
    }

    /* JADX INFO: renamed from: t */
    public C22421c<List<Media>> m100542t() {
        return this.f73669a;
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo3110b(utv<Cursor> utvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f73669a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            l51.m152919y(new Runnable() { // from class: l.rtx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164874a.m100541s(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public C22421c<List<Picture>> m100544v() {
        return m100542t().map(new qcj() { // from class: l.hux
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q(jyb.m147522n((List) obj, new qcj() { // from class: l.pux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                }), new qcj() { // from class: l.tux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return avx.m100529g((Media) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public C22421c<List<Video>> m100545w() {
        return m100542t().map(new qcj() { // from class: l.lux
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q(jyb.m147522n((List) obj, new qcj() { // from class: l.xux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                }), new qcj() { // from class: l.ptx
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return avx.m100534l((Media) obj2);
                    }
                });
            }
        });
    }

    public avx(Context context, boolean z, boolean z2) {
        this.f73670b = context;
        this.f73672d = z;
        this.f73671c = z2;
    }
}
