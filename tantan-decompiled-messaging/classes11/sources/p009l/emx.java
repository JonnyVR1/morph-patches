package p009l;

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
import java.util.List;
import l.e51;
import l.ixb;
import l.nuh0;
import l.rhi;
import l.trv;
import l.vwb;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class emx implements a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f12607j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", "duration"};

    /* JADX INFO: renamed from: b */
    public final Context f12609b;

    /* JADX INFO: renamed from: c */
    public final boolean f12610c;

    /* JADX INFO: renamed from: d */
    public final boolean f12611d;

    /* JADX INFO: renamed from: e */
    public int f12612e;

    /* JADX INFO: renamed from: h */
    public boolean f12615h;

    /* JADX INFO: renamed from: a */
    public final rx.subjects.a<List<Media>> f12608a = rx.subjects.a.b();

    /* JADX INFO: renamed from: f */
    public int f12613f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f12614g = true;

    /* JADX INFO: renamed from: i */
    public boolean f12616i = false;

    public emx(Context context, boolean z, boolean z2, boolean z3, int i) {
        this.f12609b = context;
        this.f12611d = z;
        this.f12610c = z2;
        this.f12612e = i;
        this.f12615h = z3;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ nuh0 m13984h(Object obj, List list) {
        return new nuh0(obj, list);
    }

    /* JADX INFO: renamed from: m */
    public static <T, E> c<List<nuh0<T, E>>> m13989m(c<List<E>> cVar, final w9j<? super E, T> w9jVar) {
        return cVar.map(new w9j() { // from class: l.dlx
            public final Object call(Object obj) {
                return vwb.S((List) obj, w9jVar, new x9j() { // from class: l.plx
                    public final Object call(Object obj2, Object obj3) {
                        return emx.m13984h(obj2, (List) obj3);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static <T, E> c.d<List<E>, List<nuh0<T, E>>> m13990n(final w9j<E, T> w9jVar) {
        return new c.d() { // from class: l.qkx
            public final Object call(Object obj) {
                return emx.m13989m((c) obj, w9jVar);
            }
        };
    }

    /* JADX INFO: renamed from: o */
    private trv m13991o(Uri uri) {
        boolean z = this.f12610c;
        if (z && this.f12611d) {
            Context context = this.f12609b;
            String[] strArr = f12607j;
            int i = this.f12612e;
            return new twm(context, uri, strArr, "media_type=1 OR media_type=3", null, "date_modified DESC", i, i * this.f12613f);
        }
        Context context2 = this.f12609b;
        if (z) {
            String[] strArr2 = f12607j;
            int i2 = this.f12612e;
            return new twm(context2, uri, strArr2, "media_type=3", null, "date_modified DESC", i2, i2 * this.f12613f);
        }
        String[] strArr3 = f12607j;
        int i3 = this.f12612e;
        return new twm(context2, uri, strArr3, "media_type=1", null, "date_modified DESC", i3, i3 * this.f12613f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m13992p(List list) {
        this.f12608a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m13993q(Cursor cursor) {
        Video picture;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f12607j;
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
            if (arrayList.size() == 0 && this.f12613f != 0) {
                this.f12613f = 0;
                this.f12614g = false;
                return;
            }
            if (arrayList.size() == 0 && this.f12613f == 0) {
                this.f12616i = true;
            }
            this.f12613f++;
            e51.G(new Runnable() { // from class: l.zkx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23724a.m13992p(arrayList);
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
    public trv<Cursor> m13994a(int i, Bundle bundle) {
        String str;
        String str2 = "";
        if (this.f12615h) {
            str = " LIMIT " + (this.f12612e * this.f12613f) + "," + this.f12612e;
            if (this.f12613f == 0) {
                str = " LIMIT " + this.f12612e;
            }
        } else {
            str = "";
        }
        if (this.f12616i) {
            this.f12614g = false;
        } else {
            str2 = str;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        if (Build.VERSION.SDK_INT >= 30) {
            return m13991o(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f12610c;
        if (z && this.f12611d) {
            return new ixb(this.f12609b, contentUri, f12607j, "media_type=1 OR media_type=3", (String[]) null, strConcat);
        }
        Context context = this.f12609b;
        return z ? new ixb(context, contentUri, f12607j, "media_type=3", (String[]) null, strConcat) : new ixb(context, contentUri, f12607j, "media_type=1", (String[]) null, strConcat);
    }

    /* JADX INFO: renamed from: c */
    public void m13996c(trv<Cursor> trvVar) {
        this.f12608a.onNext(Collections.EMPTY_LIST);
        this.f12608a.onCompleted();
    }

    /* JADX INFO: renamed from: r */
    public c<List<Media>> m13997r() {
        return this.f12608a;
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void m13995b(trv<Cursor> trvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f12608a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            e51.y(new Runnable() { // from class: l.vkx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21633a.m13993q(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public c<List<Media>> m13999t() {
        return m13997r().map(new w9j() { // from class: l.llx
            public final Object call(Object obj) {
                return vwb.n((List) obj, new w9j() { // from class: l.tlx
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public c<List<Media>> m14000u() {
        return m13997r().map(new w9j() { // from class: l.hlx
            public final Object call(Object obj) {
                return vwb.n((List) obj, new w9j() { // from class: l.xlx
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                });
            }
        });
    }

    public emx(Context context, boolean z, boolean z2) {
        this.f12609b = context;
        this.f12611d = z;
        this.f12610c = z2;
    }
}
