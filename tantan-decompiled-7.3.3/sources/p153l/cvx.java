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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class cvx implements AbstractC0495a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f84071j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", BLiveOperationTitleShowType.duration};

    /* JADX INFO: renamed from: b */
    public final Context f84073b;

    /* JADX INFO: renamed from: c */
    public final boolean f84074c;

    /* JADX INFO: renamed from: d */
    public final boolean f84075d;

    /* JADX INFO: renamed from: e */
    public int f84076e;

    /* JADX INFO: renamed from: h */
    public boolean f84079h;

    /* JADX INFO: renamed from: a */
    public final C22507a<List<Media>> f84072a = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public int f84077f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f84078g = true;

    /* JADX INFO: renamed from: i */
    public boolean f84080i = false;

    public cvx(Context context, boolean z, boolean z2, boolean z3, int i) {
        this.f84073b = context;
        this.f84075d = z;
        this.f84074c = z2;
        this.f84076e = i;
        this.f84079h = z3;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ List m112877g(qcj qcjVar, List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Media media = (Media) it.next();
            String str = media.url;
            String strSubstring = str.substring(0, str.lastIndexOf(File.separatorChar));
            List arrayList = (List) map.get(strSubstring);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(strSubstring, arrayList);
            }
            arrayList.add(media);
        }
        ArrayList arrayList2 = new ArrayList(map.size());
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            List list2 = (List) ((Map.Entry) it2.next()).getValue();
            arrayList2.add(new v2i0(qcjVar.call((Media) list2.get(0)), list2));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Picture m112879i(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Video m112881k(Media media) {
        return (Video) media;
    }

    /* JADX INFO: renamed from: n */
    public static <T, E extends Media> C22421c.d<List<E>, List<v2i0<T, E>>> m112884n(final qcj<E, T> qcjVar) {
        return new C22421c.d() { // from class: l.ttx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((C22421c) obj).map(new qcj() { // from class: l.rux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return cvx.m112877g(qcjVar, (List) obj2);
                    }
                });
            }
        };
    }

    /* JADX INFO: renamed from: o */
    private utv m112885o(Uri uri) {
        boolean z = this.f84074c;
        if (z && this.f84075d) {
            Context context = this.f84073b;
            String[] strArr = f84071j;
            int i = this.f84076e;
            return new uym(context, uri, strArr, "media_type=1 OR media_type=3", null, "date_modified DESC", i, i * this.f84077f);
        }
        Context context2 = this.f84073b;
        if (z) {
            String[] strArr2 = f84071j;
            int i2 = this.f84076e;
            return new uym(context2, uri, strArr2, "media_type=3", null, "date_modified DESC", i2, i2 * this.f84077f);
        }
        String[] strArr3 = f84071j;
        int i3 = this.f84076e;
        return new uym(context2, uri, strArr3, "media_type=1", null, "date_modified DESC", i3, i3 * this.f84077f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m112886p(List list) {
        this.f84072a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m112887q(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f84071j;
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
            if (wzx.m208784k()) {
                this.f84080i = true;
                this.f84078g = false;
            } else if (arrayList.size() == 0 && this.f84077f != 0) {
                this.f84077f = 0;
                this.f84078g = false;
                return;
            } else {
                if (arrayList.size() == 0 && this.f84077f == 0) {
                    this.f84080i = true;
                }
                this.f84077f++;
            }
            l51.m152887G(new Runnable() { // from class: l.nux
                @Override // java.lang.Runnable
                public final void run() {
                    this.f143751a.m112886p(arrayList);
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
        Uri contentUri = MediaStore.Files.getContentUri("external");
        String str2 = "";
        if (this.f84079h) {
            str = " LIMIT " + (this.f84076e * this.f84077f) + Constants.SEPARATOR_COMMA + this.f84076e;
            if (this.f84077f == 0) {
                str = " LIMIT " + this.f84076e;
            }
        } else {
            str = "";
        }
        if (this.f84080i) {
            this.f84078g = false;
        } else {
            str2 = str;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return m112885o(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f84074c;
        if (z && this.f84075d) {
            return new wyb(this.f84073b, contentUri, f84071j, "media_type=1 OR media_type=3", null, strConcat);
        }
        Context context = this.f84073b;
        return z ? new wyb(context, contentUri, f84071j, "media_type=3", null, strConcat) : new wyb(context, contentUri, f84071j, "media_type=1", null, strConcat);
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: c */
    public void mo3111c(utv<Cursor> utvVar) {
        this.f84072a.onNext(Collections.EMPTY_LIST);
        this.f84072a.onCompleted();
    }

    /* JADX INFO: renamed from: r */
    public C22421c<List<Media>> m112888r() {
        return this.f84072a;
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo3110b(utv<Cursor> utvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f84072a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            l51.m152919y(new Runnable() { // from class: l.bux
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78557a.m112887q(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public C22421c<List<Picture>> m112890t() {
        return m112888r().map(new qcj() { // from class: l.xtx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q(jyb.m147522n((List) obj, new qcj() { // from class: l.fux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                }), new qcj() { // from class: l.jux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return cvx.m112879i((Media) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public C22421c<List<Video>> m112891u() {
        return m112888r().map(new qcj() { // from class: l.otx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q(jyb.m147522n((List) obj, new qcj() { // from class: l.vux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                }), new qcj() { // from class: l.yux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return cvx.m112881k((Media) obj2);
                    }
                });
            }
        });
    }
}
