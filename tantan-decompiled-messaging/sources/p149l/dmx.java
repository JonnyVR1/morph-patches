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
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class dmx implements AbstractC0494a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f86995j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", BLiveOperationTitleShowType.duration};

    /* JADX INFO: renamed from: b */
    public final Context f86997b;

    /* JADX INFO: renamed from: c */
    public final boolean f86998c;

    /* JADX INFO: renamed from: d */
    public final boolean f86999d;

    /* JADX INFO: renamed from: e */
    public int f87000e;

    /* JADX INFO: renamed from: h */
    public boolean f87003h;

    /* JADX INFO: renamed from: a */
    public final C22392a<List<Media>> f86996a = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public int f87001f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f87002g = true;

    /* JADX INFO: renamed from: i */
    public boolean f87004i = false;

    public dmx(Context context, boolean z, boolean z2, boolean z3, int i) {
        this.f86997b = context;
        this.f86999d = z;
        this.f86998c = z2;
        this.f87000e = i;
        this.f87003h = z3;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ Picture m112533g(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ nuh0 m112535i(Object obj, List list) {
        return new nuh0(obj, list);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ Video m112538l(Media media) {
        return (Video) media;
    }

    /* JADX INFO: renamed from: o */
    public static <T, E> C22306c<List<nuh0<T, E>>> m112541o(C22306c<List<E>> c22306c, final w9j<? super E, T> w9jVar) {
        return (C22306c<List<nuh0<T, E>>>) c22306c.map(new w9j() { // from class: l.clx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200305S((List) obj, w9jVar, new x9j() { // from class: l.glx
                    @Override // p149l.x9j
                    public final Object call(Object obj2, Object obj3) {
                        return dmx.m112535i(obj2, (List) obj3);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static <T, E> C22306c.d<List<E>, List<nuh0<T, E>>> m112542p(final w9j<E, T> w9jVar) {
        return new C22306c.d() { // from class: l.pkx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return dmx.m112541o((C22306c) obj, w9jVar);
            }
        };
    }

    /* JADX INFO: renamed from: q */
    private trv m112543q(Uri uri) {
        boolean z = this.f86998c;
        if (z && this.f86999d) {
            Context context = this.f86997b;
            String[] strArr = f86995j;
            int i = this.f87000e;
            return new twm(context, uri, strArr, "media_type=1 OR media_type=3", null, "date_modified DESC", i, i * this.f87001f);
        }
        Context context2 = this.f86997b;
        if (z) {
            String[] strArr2 = f86995j;
            int i2 = this.f87000e;
            return new twm(context2, uri, strArr2, "media_type=3", null, "date_modified DESC", i2, i2 * this.f87001f);
        }
        String[] strArr3 = f86995j;
        int i3 = this.f87000e;
        return new twm(context2, uri, strArr3, "media_type=1", null, "date_modified DESC", i3, i3 * this.f87001f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m112544r(List list) {
        this.f86996a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m112545s(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f86995j;
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
            if (arrayList.size() == 0 && this.f87001f != 0) {
                this.f87001f = 0;
                this.f87002g = false;
                return;
            }
            if (arrayList.size() == 0 && this.f87001f == 0) {
                this.f87004i = true;
            }
            this.f87001f++;
            e51.m114742G(new Runnable() { // from class: l.ykx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f198843a.m112544r(arrayList);
                }
            });
        } catch (Exception e) {
            if (cursor.isClosed()) {
                return;
            }
            CrashHelper.m81297d(e, 10);
        }
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: a */
    public trv<Cursor> mo3108a(int i, Bundle bundle) {
        String str;
        String str2 = "";
        if (this.f87003h) {
            str = " LIMIT " + (this.f87000e * this.f87001f) + Constants.SEPARATOR_COMMA + this.f87000e;
            if (this.f87001f == 0) {
                str = " LIMIT " + this.f87000e;
            }
        } else {
            str = "";
        }
        if (this.f87004i) {
            this.f87002g = false;
        } else {
            str2 = str;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        if (Build.VERSION.SDK_INT >= 30) {
            return m112543q(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f86998c;
        if (z && this.f86999d) {
            return new ixb(this.f86997b, contentUri, f86995j, "media_type=1 OR media_type=3", null, strConcat);
        }
        Context context = this.f86997b;
        return z ? new ixb(context, contentUri, f86995j, "media_type=3", null, strConcat) : new ixb(context, contentUri, f86995j, "media_type=1", null, strConcat);
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: c */
    public void mo3110c(trv<Cursor> trvVar) {
        this.f86996a.onNext(Collections.EMPTY_LIST);
        this.f86996a.onCompleted();
    }

    /* JADX INFO: renamed from: t */
    public C22306c<List<Media>> m112546t() {
        return this.f86996a;
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo3109b(trv<Cursor> trvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f86996a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            e51.m114774y(new Runnable() { // from class: l.ukx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f176998a.m112545s(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: v */
    public C22306c<List<Picture>> m112548v() {
        return m112546t().map(new w9j() { // from class: l.klx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q(vwb.m200339n((List) obj, new w9j() { // from class: l.slx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                }), new w9j() { // from class: l.wlx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return dmx.m112533g((Media) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public C22306c<List<Video>> m112549w() {
        return m112546t().map(new w9j() { // from class: l.olx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q(vwb.m200339n((List) obj, new w9j() { // from class: l.amx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                }), new w9j() { // from class: l.skx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return dmx.m112538l((Media) obj2);
                    }
                });
            }
        });
    }

    public dmx(Context context, boolean z, boolean z2) {
        this.f86997b = context;
        this.f86999d = z;
        this.f86998c = z2;
    }
}
