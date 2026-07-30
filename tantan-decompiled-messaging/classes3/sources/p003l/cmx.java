package p003l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
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
import l.vwb;
import p014rx.C1099c;
import p014rx.subjects.C1185a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cmx implements a.a<Cursor> {

    /* JADX INFO: renamed from: e */
    public static final String[] f2726e = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", "duration"};

    /* JADX INFO: renamed from: a */
    public final C1185a<List<Media>> f2727a = C1185a.m9969b();

    /* JADX INFO: renamed from: b */
    public final Context f2728b;

    /* JADX INFO: renamed from: c */
    public final boolean f2729c;

    /* JADX INFO: renamed from: d */
    public final boolean f2730d;

    public cmx(Context context, boolean z, boolean z2) {
        this.f2728b = context;
        this.f2730d = z;
        this.f2729c = z2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ List m3379f(w9j w9jVar, List list) {
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

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Picture m3383j(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Video m3384k(Media media) {
        return (Video) media;
    }

    /* JADX INFO: renamed from: n */
    public static <T, E extends Media> C1099c.d<List<E>, List<nuh0<T, E>>> m3387n(final w9j<E, T> w9jVar) {
        return new C1099c.d() { // from class: l.xkx
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ((C1099c) obj).map(new w9j() { // from class: l.flx
                    @Override // p003l.w9j
                    public final Object call(Object obj2) {
                        return cmx.m3379f(w9jVar, (List) obj2);
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m3388o(List list) {
        this.f2727a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m3389p(Cursor cursor) {
        Video picture;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f2726e;
                String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                int i = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[4]));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[5]));
                long j = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[6]));
                if (string != null && (!NullChecker.a(string2) || !string2.contains("gif"))) {
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
            e51.G(new Runnable() { // from class: l.zlx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9379a.m3388o(arrayList);
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
    public trv<Cursor> m3390a(int i, Bundle bundle) {
        Uri contentUri = MediaStore.Files.getContentUri("external");
        boolean z = this.f2729c;
        if (z && this.f2730d) {
            return new ixb(this.f2728b, contentUri, f2726e, "media_type=1 OR media_type=3", (String[]) null, "date_modified DESC");
        }
        Context context = this.f2728b;
        return z ? new ixb(context, contentUri, f2726e, "media_type=3", (String[]) null, "date_modified DESC") : new ixb(context, contentUri, f2726e, "media_type=1", (String[]) null, "date_modified DESC");
    }

    /* JADX INFO: renamed from: c */
    public void m3392c(trv<Cursor> trvVar) {
        this.f2727a.onNext(Collections.EMPTY_LIST);
        this.f2727a.onCompleted();
    }

    /* JADX INFO: renamed from: q */
    public C1099c<List<Media>> m3393q() {
        return this.f2727a;
    }

    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void m3391b(trv<Cursor> trvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f2727a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            e51.y(new Runnable() { // from class: l.okx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f6180a.m3389p(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public C1099c<List<Picture>> m3395s() {
        return m3393q().map(new w9j() { // from class: l.blx
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return vwb.Q(vwb.n((List) obj, new w9j() { // from class: l.jlx
                    @Override // p003l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                }), new w9j() { // from class: l.nlx
                    @Override // p003l.w9j
                    public final Object call(Object obj2) {
                        return cmx.m3383j((Media) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public C1099c<List<Video>> m3396t() {
        return m3393q().map(new w9j() { // from class: l.tkx
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return vwb.Q(vwb.n((List) obj, new w9j() { // from class: l.rlx
                    @Override // p003l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                }), new w9j() { // from class: l.vlx
                    @Override // p003l.w9j
                    public final Object call(Object obj2) {
                        return cmx.m3384k((Media) obj2);
                    }
                });
            }
        });
    }
}
