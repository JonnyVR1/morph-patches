package p149l;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import androidx.loader.app.AbstractC0494a;
import com.clevertap.android.sdk.Constants;
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

/* JADX INFO: loaded from: classes9.dex */
public class fmx implements AbstractC0494a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f98379j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", BLiveOperationTitleShowType.duration};

    /* JADX INFO: renamed from: b */
    public final Context f98381b;

    /* JADX INFO: renamed from: c */
    public final boolean f98382c;

    /* JADX INFO: renamed from: d */
    public final boolean f98383d;

    /* JADX INFO: renamed from: e */
    public int f98384e;

    /* JADX INFO: renamed from: h */
    public boolean f98387h;

    /* JADX INFO: renamed from: a */
    public final C22392a<List<Media>> f98380a = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public int f98385f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f98386g = true;

    /* JADX INFO: renamed from: i */
    public boolean f98388i = false;

    public fmx(Context context, boolean z, boolean z2, boolean z3, int i) {
        this.f98381b = context;
        this.f98383d = z;
        this.f98382c = z2;
        this.f98384e = i;
        this.f98387h = z3;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ List m122274g(w9j w9jVar, List list) {
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
    public static /* synthetic */ Picture m122276i(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ Video m122278k(Media media) {
        return (Video) media;
    }

    /* JADX INFO: renamed from: n */
    public static <T, E extends Media> C22306c.d<List<E>, List<nuh0<T, E>>> m122281n(final w9j<E, T> w9jVar) {
        return new C22306c.d() { // from class: l.wkx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((C22306c) obj).map(new w9j() { // from class: l.ulx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return fmx.m122274g(w9jVar, (List) obj2);
                    }
                });
            }
        };
    }

    /* JADX INFO: renamed from: o */
    private trv m122282o(Uri uri) {
        boolean z = this.f98382c;
        if (z && this.f98383d) {
            Context context = this.f98381b;
            String[] strArr = f98379j;
            int i = this.f98384e;
            return new twm(context, uri, strArr, "media_type=1 OR media_type=3", null, "date_modified DESC", i, i * this.f98385f);
        }
        Context context2 = this.f98381b;
        if (z) {
            String[] strArr2 = f98379j;
            int i2 = this.f98384e;
            return new twm(context2, uri, strArr2, "media_type=3", null, "date_modified DESC", i2, i2 * this.f98385f);
        }
        String[] strArr3 = f98379j;
        int i3 = this.f98384e;
        return new twm(context2, uri, strArr3, "media_type=1", null, "date_modified DESC", i3, i3 * this.f98385f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m122283p(List list) {
        this.f98380a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m122284q(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f98379j;
                String string = cursor.getString(cursor.getColumnIndexOrThrow(strArr[1]));
                int i = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[4]));
                String string2 = cursor.getString(cursor.getColumnIndexOrThrow(strArr[5]));
                long j = cursor.getInt(cursor.getColumnIndexOrThrow(strArr[6]));
                if (string != null && (!NullChecker.m81303a(string2) || !string2.contains("gif"))) {
                    File file = new File(string);
                    if (file.canRead() && file.length() != 0) {
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
            }
            if (zqx.m219898k()) {
                this.f98388i = true;
                this.f98386g = false;
            } else if (arrayList.size() == 0 && this.f98385f != 0) {
                this.f98385f = 0;
                this.f98386g = false;
                return;
            } else {
                if (arrayList.size() == 0 && this.f98385f == 0) {
                    this.f98388i = true;
                }
                this.f98385f++;
            }
            e51.m114742G(new Runnable() { // from class: l.qlx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155264a.m122283p(arrayList);
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
        String str;
        Uri contentUri = MediaStore.Files.getContentUri("external");
        String str2 = "";
        if (this.f98387h) {
            str = " LIMIT " + (this.f98384e * this.f98385f) + Constants.SEPARATOR_COMMA + this.f98384e;
            if (this.f98385f == 0) {
                str = " LIMIT " + this.f98384e;
            }
        } else {
            str = "";
        }
        if (this.f98388i) {
            this.f98386g = false;
        } else {
            str2 = str;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            return m122282o(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f98382c;
        if (z && this.f98383d) {
            return new ixb(this.f98381b, contentUri, f98379j, "media_type=1 OR media_type=3", null, strConcat);
        }
        Context context = this.f98381b;
        return z ? new ixb(context, contentUri, f98379j, "media_type=3", null, strConcat) : new ixb(context, contentUri, f98379j, "media_type=1", null, strConcat);
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: c */
    public void mo3110c(trv<Cursor> trvVar) {
        this.f98380a.onNext(Collections.EMPTY_LIST);
        this.f98380a.onCompleted();
    }

    /* JADX INFO: renamed from: r */
    public C22306c<List<Media>> m122285r() {
        return this.f98380a;
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo3109b(trv<Cursor> trvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f98380a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            e51.m114774y(new Runnable() { // from class: l.elx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92146a.m122284q(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public C22306c<List<Picture>> m122287t() {
        return m122285r().map(new w9j() { // from class: l.alx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q(vwb.m200339n((List) obj, new w9j() { // from class: l.ilx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                }), new w9j() { // from class: l.mlx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return fmx.m122276i((Media) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public C22306c<List<Video>> m122288u() {
        return m122285r().map(new w9j() { // from class: l.rkx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q(vwb.m200339n((List) obj, new w9j() { // from class: l.ylx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                }), new w9j() { // from class: l.bmx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return fmx.m122278k((Media) obj2);
                    }
                });
            }
        });
    }
}
