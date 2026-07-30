package p153l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.loader.app.AbstractC0495a;
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

/* JADX INFO: loaded from: classes3.dex */
public class zux implements AbstractC0495a.a<Cursor> {

    /* JADX INFO: renamed from: e */
    public static final String[] f206170e = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", BLiveOperationTitleShowType.duration};

    /* JADX INFO: renamed from: a */
    public final C22507a<List<Media>> f206171a = C22507a.m222758b();

    /* JADX INFO: renamed from: b */
    public final Context f206172b;

    /* JADX INFO: renamed from: c */
    public final boolean f206173c;

    /* JADX INFO: renamed from: d */
    public final boolean f206174d;

    public zux(Context context, boolean z, boolean z2) {
        this.f206172b = context;
        this.f206174d = z;
        this.f206173c = z2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ List m221734f(qcj qcjVar, List list) {
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

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Picture m221738j(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Video m221739k(Media media) {
        return (Video) media;
    }

    /* JADX INFO: renamed from: n */
    public static <T, E extends Media> C22421c.d<List<E>, List<v2i0<T, E>>> m221742n(final qcj<E, T> qcjVar) {
        return new C22421c.d() { // from class: l.utx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((C22421c) obj).map(new qcj() { // from class: l.cux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return zux.m221734f(qcjVar, (List) obj2);
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m221743o(List list) {
        this.f206171a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m221744p(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f206170e;
                String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                int i = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[4]));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[5]));
                long j = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[6]));
                if (string != null && (!NullChecker.m82486a(string2) || !string2.contains("gif"))) {
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
            l51.m152887G(new Runnable() { // from class: l.wux
                @Override // java.lang.Runnable
                public final void run() {
                    this.f190892a.m221743o(arrayList);
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
        Uri contentUri = MediaStore.Files.getContentUri("external");
        boolean z = this.f206173c;
        if (z && this.f206174d) {
            return new wyb(this.f206172b, contentUri, f206170e, "media_type=1 OR media_type=3", null, "date_modified DESC");
        }
        Context context = this.f206172b;
        return z ? new wyb(context, contentUri, f206170e, "media_type=3", null, "date_modified DESC") : new wyb(context, contentUri, f206170e, "media_type=1", null, "date_modified DESC");
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: c */
    public void mo3111c(utv<Cursor> utvVar) {
        this.f206171a.onNext(Collections.EMPTY_LIST);
        this.f206171a.onCompleted();
    }

    /* JADX INFO: renamed from: q */
    public C22421c<List<Media>> m221745q() {
        return this.f206171a;
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo3110b(utv<Cursor> utvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f206171a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            l51.m152919y(new Runnable() { // from class: l.ltx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133580a.m221744p(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public C22421c<List<Picture>> m221747s() {
        return m221745q().map(new qcj() { // from class: l.ytx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q(jyb.m147522n((List) obj, new qcj() { // from class: l.gux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                }), new qcj() { // from class: l.kux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return zux.m221738j((Media) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public C22421c<List<Video>> m221748t() {
        return m221745q().map(new qcj() { // from class: l.qtx
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q(jyb.m147522n((List) obj, new qcj() { // from class: l.oux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                }), new qcj() { // from class: l.sux
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return zux.m221739k((Media) obj2);
                    }
                });
            }
        });
    }
}
