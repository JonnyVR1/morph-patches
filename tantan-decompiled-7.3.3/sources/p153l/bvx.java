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

/* JADX INFO: loaded from: classes10.dex */
public class bvx implements AbstractC0495a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f78659j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", BLiveOperationTitleShowType.duration};

    /* JADX INFO: renamed from: b */
    public final Context f78661b;

    /* JADX INFO: renamed from: c */
    public final boolean f78662c;

    /* JADX INFO: renamed from: d */
    public final boolean f78663d;

    /* JADX INFO: renamed from: e */
    public int f78664e;

    /* JADX INFO: renamed from: h */
    public boolean f78667h;

    /* JADX INFO: renamed from: a */
    public final C22507a<List<Media>> f78660a = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public int f78665f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f78666g = true;

    /* JADX INFO: renamed from: i */
    public boolean f78668i = false;

    public bvx(Context context, boolean z, boolean z2, boolean z3, int i) {
        this.f78661b = context;
        this.f78663d = z;
        this.f78662c = z2;
        this.f78664e = i;
        this.f78667h = z3;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ v2i0 m106616h(Object obj, List list) {
        return new v2i0(obj, list);
    }

    /* JADX INFO: renamed from: m */
    public static <T, E> C22421c<List<v2i0<T, E>>> m106621m(C22421c<List<E>> c22421c, final qcj<? super E, T> qcjVar) {
        return (C22421c<List<v2i0<T, E>>>) c22421c.map(new qcj() { // from class: l.aux
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147488S((List) obj, qcjVar, new rcj() { // from class: l.mux
                    @Override // p153l.rcj
                    public final Object call(Object obj2, Object obj3) {
                        return bvx.m106616h(obj2, (List) obj3);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static <T, E> C22421c.d<List<E>, List<v2i0<T, E>>> m106622n(final qcj<E, T> qcjVar) {
        return new C22421c.d() { // from class: l.ntx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return bvx.m106621m((C22421c) obj, qcjVar);
            }
        };
    }

    /* JADX INFO: renamed from: o */
    private utv m106623o(Uri uri) {
        boolean z = this.f78662c;
        if (z && this.f78663d) {
            Context context = this.f78661b;
            String[] strArr = f78659j;
            int i = this.f78664e;
            return new uym(context, uri, strArr, "media_type=1 OR media_type=3", null, "date_modified DESC", i, i * this.f78665f);
        }
        Context context2 = this.f78661b;
        if (z) {
            String[] strArr2 = f78659j;
            int i2 = this.f78664e;
            return new uym(context2, uri, strArr2, "media_type=3", null, "date_modified DESC", i2, i2 * this.f78665f);
        }
        String[] strArr3 = f78659j;
        int i3 = this.f78664e;
        return new uym(context2, uri, strArr3, "media_type=1", null, "date_modified DESC", i3, i3 * this.f78665f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m106624p(List list) {
        this.f78660a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m106625q(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f78659j;
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
            if (arrayList.size() == 0 && this.f78665f != 0) {
                this.f78665f = 0;
                this.f78666g = false;
                return;
            }
            if (arrayList.size() == 0 && this.f78665f == 0) {
                this.f78668i = true;
            }
            this.f78665f++;
            l51.m152887G(new Runnable() { // from class: l.wtx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f190821a.m106624p(arrayList);
                }
            });
        } catch (Exception e) {
            if (cursor.isClosed()) {
                return;
            }
            CrashHelper.m82479c(e);
        }
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: a */
    public utv<Cursor> mo3109a(int i, Bundle bundle) {
        String str;
        String str2 = "";
        if (this.f78667h) {
            str = " LIMIT " + (this.f78664e * this.f78665f) + Constants.SEPARATOR_COMMA + this.f78664e;
            if (this.f78665f == 0) {
                str = " LIMIT " + this.f78664e;
            }
        } else {
            str = "";
        }
        if (this.f78668i) {
            this.f78666g = false;
        } else {
            str2 = str;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        if (Build.VERSION.SDK_INT >= 30) {
            return m106623o(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f78662c;
        if (z && this.f78663d) {
            return new wyb(this.f78661b, contentUri, f78659j, "media_type=1 OR media_type=3", null, strConcat);
        }
        Context context = this.f78661b;
        return z ? new wyb(context, contentUri, f78659j, "media_type=3", null, strConcat) : new wyb(context, contentUri, f78659j, "media_type=1", null, strConcat);
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: c */
    public void mo3111c(utv<Cursor> utvVar) {
        this.f78660a.onNext(Collections.EMPTY_LIST);
        this.f78660a.onCompleted();
    }

    /* JADX INFO: renamed from: r */
    public C22421c<List<Media>> m106626r() {
        return this.f78660a;
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo3110b(utv<Cursor> utvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f78660a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            l51.m152919y(new Runnable() { // from class: l.stx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170626a.m106625q(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public C22421c<List<Media>> m106628t() {
        return m106626r().map(new qcj() { // from class: l.iux
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147522n((List) obj, new qcj() { // from class: l.qux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public C22421c<List<Media>> m106629u() {
        return m106626r().map(new qcj() { // from class: l.eux
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147522n((List) obj, new qcj() { // from class: l.uux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                });
            }
        });
    }

    public bvx(Context context, boolean z, boolean z2) {
        this.f78661b = context;
        this.f78663d = z;
        this.f78662c = z2;
    }
}
