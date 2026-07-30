package p007l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.loader.app.a;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
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
import l.twm;
import l.vwb;
import l.w9j;
import l.x9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dmx implements a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f6996j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", "duration"};

    /* JADX INFO: renamed from: b */
    public final Context f6998b;

    /* JADX INFO: renamed from: c */
    public final boolean f6999c;

    /* JADX INFO: renamed from: d */
    public final boolean f7000d;

    /* JADX INFO: renamed from: e */
    public int f7001e;

    /* JADX INFO: renamed from: h */
    public boolean f7004h;

    /* JADX INFO: renamed from: a */
    public final rx.subjects.a<List<Media>> f6997a = rx.subjects.a.b();

    /* JADX INFO: renamed from: f */
    public int f7002f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f7003g = true;

    /* JADX INFO: renamed from: i */
    public boolean f7005i = false;

    public dmx(Context context, boolean z, boolean z2, boolean z3, int i) {
        this.f6998b = context;
        this.f7000d = z;
        this.f6999c = z2;
        this.f7001e = i;
        this.f7004h = z3;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Picture m9500g(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ nuh0 m9502i(Object obj, List list) {
        return new nuh0(obj, list);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Video m9505l(Media media) {
        return (Video) media;
    }

    /* JADX INFO: renamed from: o */
    public static <T, E> c<List<nuh0<T, E>>> m9508o(c<List<E>> cVar, final w9j<? super E, T> w9jVar) {
        return cVar.map(new w9j() { // from class: l.clx
            public final Object call(Object obj) {
                return vwb.S((List) obj, w9jVar, new x9j() { // from class: l.glx
                    public final Object call(Object obj2, Object obj3) {
                        return dmx.m9502i(obj2, (List) obj3);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static <T, E> c.d<List<E>, List<nuh0<T, E>>> m9509p(final w9j<E, T> w9jVar) {
        return new c.d() { // from class: l.pkx
            public final Object call(Object obj) {
                return dmx.m9508o((c) obj, w9jVar);
            }
        };
    }

    /* JADX INFO: renamed from: q */
    private trv m9510q(Uri uri) {
        boolean z = this.f6999c;
        if (z && this.f7000d) {
            Context context = this.f6998b;
            String[] strArr = f6996j;
            int i = this.f7001e;
            return new twm(context, uri, strArr, "media_type=1 OR media_type=3", (String[]) null, "date_modified DESC", i, i * this.f7002f);
        }
        Context context2 = this.f6998b;
        if (z) {
            String[] strArr2 = f6996j;
            int i2 = this.f7001e;
            return new twm(context2, uri, strArr2, "media_type=3", (String[]) null, "date_modified DESC", i2, i2 * this.f7002f);
        }
        String[] strArr3 = f6996j;
        int i3 = this.f7001e;
        return new twm(context2, uri, strArr3, "media_type=1", (String[]) null, "date_modified DESC", i3, i3 * this.f7002f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m9511r(List list) {
        this.f6997a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m9512s(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f6996j;
                String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                int i = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[4]));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[5]));
                long j = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[6]));
                if (string != null && (!NullChecker.a(string2) || !string2.contains("gif"))) {
                    File file = new File(string);
                    if (file.canRead() && file.length() != 0) {
                        if (i == 1) {
                            Picture picture = new Picture();
                            picture.mediaType = "image/*";
                            picture.url = rhi.B(string);
                            media = picture;
                        } else if (NullChecker.a(string2) && string2.contains("mp4")) {
                            Video video = new Video();
                            video.duration = j;
                            video.mediaType = "video/*";
                            video.url = rhi.B(string);
                            media = video;
                        } else if (NullChecker.a(string2) && string2.contains("3gp")) {
                            Video video2 = new Video();
                            video2.duration = j;
                            video2.mediaType = "video/*";
                            video2.url = rhi.B(string);
                            media = video2;
                        }
                        media.status = MediaLocalStatus.get(MediaLocalStatus.raw);
                        arrayList.add(media);
                    }
                }
            }
            if (arrayList.size() == 0 && this.f7002f != 0) {
                this.f7002f = 0;
                this.f7003g = false;
                return;
            }
            if (arrayList.size() == 0 && this.f7002f == 0) {
                this.f7005i = true;
            }
            this.f7002f++;
            e51.G(new Runnable() { // from class: l.ykx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15465a.m9511r(arrayList);
                }
            });
        } catch (Exception e) {
            if (cursor.isClosed()) {
                return;
            }
            CrashHelper.d(e, 10);
        }
    }

    /* JADX INFO: renamed from: a */
    public trv<Cursor> m9513a(int i, Bundle bundle) {
        String str;
        String str2 = "";
        if (this.f7004h) {
            str = " LIMIT " + (this.f7001e * this.f7002f) + "," + this.f7001e;
            if (this.f7002f == 0) {
                str = " LIMIT " + this.f7001e;
            }
        } else {
            str = "";
        }
        if (this.f7005i) {
            this.f7003g = false;
        } else {
            str2 = str;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        if (Build.VERSION.SDK_INT >= 30) {
            return m9510q(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f6999c;
        if (z && this.f7000d) {
            return new ixb(this.f6998b, contentUri, f6996j, "media_type=1 OR media_type=3", (String[]) null, strConcat);
        }
        Context context = this.f6998b;
        return z ? new ixb(context, contentUri, f6996j, "media_type=3", (String[]) null, strConcat) : new ixb(context, contentUri, f6996j, "media_type=1", (String[]) null, strConcat);
    }

    /* JADX INFO: renamed from: c */
    public void m9515c(trv<Cursor> trvVar) {
        this.f6997a.onNext(Collections.EMPTY_LIST);
        this.f6997a.onCompleted();
    }

    /* JADX INFO: renamed from: t */
    public c<List<Media>> m9516t() {
        return this.f6997a;
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void m9514b(trv<Cursor> trvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f6997a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            e51.y(new Runnable() { // from class: l.ukx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13851a.m9512s(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public c<List<Picture>> m9518v() {
        return m9516t().map(new w9j() { // from class: l.klx
            public final Object call(Object obj) {
                return vwb.Q(vwb.n((List) obj, new w9j() { // from class: l.slx
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                }), new w9j() { // from class: l.wlx
                    public final Object call(Object obj2) {
                        return dmx.m9500g((Media) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public c<List<Video>> m9519w() {
        return m9516t().map(new w9j() { // from class: l.olx
            public final Object call(Object obj) {
                return vwb.Q(vwb.n((List) obj, new w9j() { // from class: l.amx
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                }), new w9j() { // from class: l.skx
                    public final Object call(Object obj2) {
                        return dmx.m9505l((Media) obj2);
                    }
                });
            }
        });
    }

    public dmx(Context context, boolean z, boolean z2) {
        this.f6998b = context;
        this.f7000d = z;
        this.f6999c = z2;
    }
}
