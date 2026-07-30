package p149l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.loader.app.AbstractC0494a;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class cmx implements AbstractC0494a.a<Cursor> {

    /* JADX INFO: renamed from: e */
    public static final String[] f81619e = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", BLiveOperationTitleShowType.duration};

    /* JADX INFO: renamed from: a */
    public final C22392a<List<Media>> f81620a = C22392a.m221512b();

    /* JADX INFO: renamed from: b */
    public final Context f81621b;

    /* JADX INFO: renamed from: c */
    public final boolean f81622c;

    /* JADX INFO: renamed from: d */
    public final boolean f81623d;

    public cmx(Context context, boolean z, boolean z2) {
        this.f81621b = context;
        this.f81623d = z;
        this.f81622c = z2;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ List m107703f(w9j w9jVar, List list) {
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
    public static /* synthetic */ Picture m107707j(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Video m107708k(Media media) {
        return (Video) media;
    }

    /* JADX INFO: renamed from: n */
    public static <T, E extends Media> C22306c.d<List<E>, List<nuh0<T, E>>> m107711n(final w9j<E, T> w9jVar) {
        return new C22306c.d() { // from class: l.xkx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((C22306c) obj).map(new w9j() { // from class: l.flx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return cmx.m107703f(w9jVar, (List) obj2);
                    }
                });
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public /* synthetic */ void m107712o(List list) {
        this.f81620a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m107713p(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f81619e;
                String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                int i = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[4]));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[5]));
                long j = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[6]));
                if (string != null && (!NullChecker.m81303a(string2) || !string2.contains("gif"))) {
                    if (i == 1) {
                        Picture picture = new Picture();
                        picture.mediaType = "image/*";
                        picture.url = rhi.m179355B(string);
                        media = picture;
                    } else if (NullChecker.m81303a(string2) && string2.contains("mp4")) {
                        Video video = new Video();
                        video.duration = j;
                        video.mediaType = "video/*";
                        video.url = rhi.m179355B(string);
                        media = video;
                    } else if (NullChecker.m81303a(string2) && string2.contains("3gp")) {
                        Video video2 = new Video();
                        video2.duration = j;
                        video2.mediaType = "video/*";
                        video2.url = rhi.m179355B(string);
                        media = video2;
                    }
                    media.status = MediaLocalStatus.get("raw");
                    arrayList.add(media);
                }
            }
            e51.m114742G(new Runnable() { // from class: l.zlx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203671a.m107712o(arrayList);
                }
            });
        } catch (Exception e) {
            if (cursor.isClosed()) {
                return;
            }
            CrashHelper.m81296c(e);
        }
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: a */
    public trv<Cursor> mo3108a(int i, Bundle bundle) {
        Uri contentUri = MediaStore.Files.getContentUri("external");
        boolean z = this.f81622c;
        if (z && this.f81623d) {
            return new ixb(this.f81621b, contentUri, f81619e, "media_type=1 OR media_type=3", null, "date_modified DESC");
        }
        Context context = this.f81621b;
        return z ? new ixb(context, contentUri, f81619e, "media_type=3", null, "date_modified DESC") : new ixb(context, contentUri, f81619e, "media_type=1", null, "date_modified DESC");
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: c */
    public void mo3110c(trv<Cursor> trvVar) {
        this.f81620a.onNext(Collections.EMPTY_LIST);
        this.f81620a.onCompleted();
    }

    /* JADX INFO: renamed from: q */
    public C22306c<List<Media>> m107714q() {
        return this.f81620a;
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo3109b(trv<Cursor> trvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f81620a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            e51.m114774y(new Runnable() { // from class: l.okx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144466a.m107713p(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public C22306c<List<Picture>> m107716s() {
        return m107714q().map(new w9j() { // from class: l.blx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q(vwb.m200339n((List) obj, new w9j() { // from class: l.jlx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                }), new w9j() { // from class: l.nlx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return cmx.m107707j((Media) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public C22306c<List<Video>> m107717t() {
        return m107714q().map(new w9j() { // from class: l.tkx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q(vwb.m200339n((List) obj, new w9j() { // from class: l.rlx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                }), new w9j() { // from class: l.vlx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return cmx.m107708k((Media) obj2);
                    }
                });
            }
        });
    }
}
