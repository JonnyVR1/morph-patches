package p006l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.loader.app.a;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e51;
import l.ixb;
import l.nuh0;
import l.rhi;
import l.trv;
import l.twm;
import l.vwb;
import l.w9j;
import l.zqx;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class fmx implements a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f12780j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", "duration"};

    /* JADX INFO: renamed from: b */
    public final Context f12782b;

    /* JADX INFO: renamed from: c */
    public final boolean f12783c;

    /* JADX INFO: renamed from: d */
    public final boolean f12784d;

    /* JADX INFO: renamed from: e */
    public int f12785e;

    /* JADX INFO: renamed from: h */
    public boolean f12788h;

    /* JADX INFO: renamed from: a */
    public final rx.subjects.a<List<Media>> f12781a = rx.subjects.a.b();

    /* JADX INFO: renamed from: f */
    public int f12786f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f12787g = true;

    /* JADX INFO: renamed from: i */
    public boolean f12789i = false;

    public fmx(Context context, boolean z, boolean z2, boolean z3, int i) {
        this.f12782b = context;
        this.f12784d = z;
        this.f12783c = z2;
        this.f12785e = i;
        this.f12788h = z3;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ List m15356g(w9j w9jVar, List list) {
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
            arrayList2.add(new nuh0(w9jVar.call((Media) list2.get(0)), list2));
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Picture m15358i(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Video m15360k(Media media) {
        return (Video) media;
    }

    /* JADX INFO: renamed from: n */
    public static <T, E extends Media> c.d<List<E>, List<nuh0<T, E>>> m15363n(final w9j<E, T> w9jVar) {
        return new c.d() { // from class: l.wkx
            public final Object call(Object obj) {
                return ((c) obj).map(new w9j() { // from class: l.ulx
                    public final Object call(Object obj2) {
                        return fmx.m15356g(w9jVar, (List) obj2);
                    }
                });
            }
        };
    }

    /* JADX INFO: renamed from: o */
    private trv m15364o(Uri uri) {
        boolean z = this.f12783c;
        if (z && this.f12784d) {
            Context context = this.f12782b;
            String[] strArr = f12780j;
            int i = this.f12785e;
            return new twm(context, uri, strArr, "media_type=1 OR media_type=3", (String[]) null, "date_modified DESC", i, i * this.f12786f);
        }
        Context context2 = this.f12782b;
        if (z) {
            String[] strArr2 = f12780j;
            int i2 = this.f12785e;
            return new twm(context2, uri, strArr2, "media_type=3", (String[]) null, "date_modified DESC", i2, i2 * this.f12786f);
        }
        String[] strArr3 = f12780j;
        int i3 = this.f12785e;
        return new twm(context2, uri, strArr3, "media_type=1", (String[]) null, "date_modified DESC", i3, i3 * this.f12786f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m15365p(List list) {
        this.f12781a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m15366q(Cursor cursor) {
        Video picture;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f12780j;
                String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                int i = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[4]));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[5]));
                long j = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[6]));
                if (string != null && (!NullChecker.a(string2) || !string2.contains("gif"))) {
                    File file = new File(string);
                    if (file.canRead() && file.length() != 0) {
                        if (i == 1) {
                            picture = new Picture();
                            ((Media) picture).mediaType = "image/*";
                            ((Media) picture).url = rhi.B(string);
                        } else if (NullChecker.a(string2) && string2.contains("mp4")) {
                            picture = new Video();
                            picture.duration = j;
                            ((Media) picture).mediaType = "video/*";
                            ((Media) picture).url = rhi.B(string);
                        } else if (NullChecker.a(string2) && string2.contains("3gp")) {
                            picture = new Video();
                            picture.duration = j;
                            ((Media) picture).mediaType = "video/*";
                            ((Media) picture).url = rhi.B(string);
                        }
                        ((Media) picture).status = MediaLocalStatus.get("raw");
                        arrayList.add(picture);
                    }
                }
            }
            if (zqx.k()) {
                this.f12789i = true;
                this.f12787g = false;
            } else if (arrayList.size() == 0 && this.f12786f != 0) {
                this.f12786f = 0;
                this.f12787g = false;
                return;
            } else {
                if (arrayList.size() == 0 && this.f12786f == 0) {
                    this.f12789i = true;
                }
                this.f12786f++;
            }
            e51.G(new Runnable() { // from class: l.qlx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19904a.m15365p(arrayList);
                }
            });
        } catch (Exception e) {
            if (cursor.isClosed()) {
                return;
            }
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public trv<Cursor> m15367a(int i, Bundle bundle) {
        String str;
        Uri contentUri = MediaStore.Files.getContentUri("external");
        String str2 = "";
        if (this.f12788h) {
            str = " LIMIT " + (this.f12785e * this.f12786f) + "," + this.f12785e;
            if (this.f12786f == 0) {
                str = " LIMIT " + this.f12785e;
            }
        } else {
            str = "";
        }
        if (this.f12789i) {
            this.f12787g = false;
        } else {
            str2 = str;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return m15364o(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f12783c;
        if (z && this.f12784d) {
            return new ixb(this.f12782b, contentUri, f12780j, "media_type=1 OR media_type=3", (String[]) null, strConcat);
        }
        Context context = this.f12782b;
        return z ? new ixb(context, contentUri, f12780j, "media_type=3", (String[]) null, strConcat) : new ixb(context, contentUri, f12780j, "media_type=1", (String[]) null, strConcat);
    }

    /* JADX INFO: renamed from: c */
    public void m15369c(trv<Cursor> trvVar) {
        this.f12781a.onNext(Collections.EMPTY_LIST);
        this.f12781a.onCompleted();
    }

    /* JADX INFO: renamed from: r */
    public c<List<Media>> m15370r() {
        return this.f12781a;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m15368b(trv<Cursor> trvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f12781a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            e51.y(new Runnable() { // from class: l.elx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11244a.m15366q(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public c<List<Picture>> m15372t() {
        return m15370r().map(new w9j() { // from class: l.alx
            public final Object call(Object obj) {
                return vwb.Q(vwb.n((List) obj, new w9j() { // from class: l.ilx
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                }), new w9j() { // from class: l.mlx
                    public final Object call(Object obj2) {
                        return fmx.m15358i((Media) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public c<List<Video>> m15373u() {
        return m15370r().map(new w9j() { // from class: l.rkx
            public final Object call(Object obj) {
                return vwb.Q(vwb.n((List) obj, new w9j() { // from class: l.ylx
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                }), new w9j() { // from class: l.bmx
                    public final Object call(Object obj2) {
                        return fmx.m15360k((Media) obj2);
                    }
                });
            }
        });
    }
}
