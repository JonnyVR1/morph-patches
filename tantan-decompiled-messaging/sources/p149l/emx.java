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

/* JADX INFO: loaded from: classes11.dex */
public class emx implements AbstractC0494a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f92256j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", BLiveOperationTitleShowType.duration};

    /* JADX INFO: renamed from: b */
    public final Context f92258b;

    /* JADX INFO: renamed from: c */
    public final boolean f92259c;

    /* JADX INFO: renamed from: d */
    public final boolean f92260d;

    /* JADX INFO: renamed from: e */
    public int f92261e;

    /* JADX INFO: renamed from: h */
    public boolean f92264h;

    /* JADX INFO: renamed from: a */
    public final C22392a<List<Media>> f92257a = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public int f92262f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f92263g = true;

    /* JADX INFO: renamed from: i */
    public boolean f92265i = false;

    public emx(Context context, boolean z, boolean z2, boolean z3, int i) {
        this.f92258b = context;
        this.f92260d = z;
        this.f92259c = z2;
        this.f92261e = i;
        this.f92264h = z3;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ nuh0 m117230h(Object obj, List list) {
        return new nuh0(obj, list);
    }

    /* JADX INFO: renamed from: m */
    public static <T, E> C22306c<List<nuh0<T, E>>> m117235m(C22306c<List<E>> c22306c, final w9j<? super E, T> w9jVar) {
        return (C22306c<List<nuh0<T, E>>>) c22306c.map(new w9j() { // from class: l.dlx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200305S((List) obj, w9jVar, new x9j() { // from class: l.plx
                    @Override // p149l.x9j
                    public final Object call(Object obj2, Object obj3) {
                        return emx.m117230h(obj2, (List) obj3);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: n */
    public static <T, E> C22306c.d<List<E>, List<nuh0<T, E>>> m117236n(final w9j<E, T> w9jVar) {
        return new C22306c.d() { // from class: l.qkx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return emx.m117235m((C22306c) obj, w9jVar);
            }
        };
    }

    /* JADX INFO: renamed from: o */
    private trv m117237o(Uri uri) {
        boolean z = this.f92259c;
        if (z && this.f92260d) {
            Context context = this.f92258b;
            String[] strArr = f92256j;
            int i = this.f92261e;
            return new twm(context, uri, strArr, "media_type=1 OR media_type=3", null, "date_modified DESC", i, i * this.f92262f);
        }
        Context context2 = this.f92258b;
        if (z) {
            String[] strArr2 = f92256j;
            int i2 = this.f92261e;
            return new twm(context2, uri, strArr2, "media_type=3", null, "date_modified DESC", i2, i2 * this.f92262f);
        }
        String[] strArr3 = f92256j;
        int i3 = this.f92261e;
        return new twm(context2, uri, strArr3, "media_type=1", null, "date_modified DESC", i3, i3 * this.f92262f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m117238p(List list) {
        this.f92257a.onNext(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m117239q(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f92256j;
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
            if (arrayList.size() == 0 && this.f92262f != 0) {
                this.f92262f = 0;
                this.f92263g = false;
                return;
            }
            if (arrayList.size() == 0 && this.f92262f == 0) {
                this.f92265i = true;
            }
            this.f92262f++;
            e51.m114742G(new Runnable() { // from class: l.zkx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203577a.m117238p(arrayList);
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
        String str2 = "";
        if (this.f92264h) {
            str = " LIMIT " + (this.f92261e * this.f92262f) + Constants.SEPARATOR_COMMA + this.f92261e;
            if (this.f92262f == 0) {
                str = " LIMIT " + this.f92261e;
            }
        } else {
            str = "";
        }
        if (this.f92265i) {
            this.f92263g = false;
        } else {
            str2 = str;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        if (Build.VERSION.SDK_INT >= 30) {
            return m117237o(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f92259c;
        if (z && this.f92260d) {
            return new ixb(this.f92258b, contentUri, f92256j, "media_type=1 OR media_type=3", null, strConcat);
        }
        Context context = this.f92258b;
        return z ? new ixb(context, contentUri, f92256j, "media_type=3", null, strConcat) : new ixb(context, contentUri, f92256j, "media_type=1", null, strConcat);
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: c */
    public void mo3110c(trv<Cursor> trvVar) {
        this.f92257a.onNext(Collections.EMPTY_LIST);
        this.f92257a.onCompleted();
    }

    /* JADX INFO: renamed from: r */
    public C22306c<List<Media>> m117240r() {
        return this.f92257a;
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo3109b(trv<Cursor> trvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f92257a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            e51.m114774y(new Runnable() { // from class: l.vkx
                @Override // java.lang.Runnable
                public final void run() {
                    this.f181857a.m117239q(cursor);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t */
    public C22306c<List<Media>> m117242t() {
        return m117240r().map(new w9j() { // from class: l.llx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200339n((List) obj, new w9j() { // from class: l.tlx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("image/"));
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public C22306c<List<Media>> m117243u() {
        return m117240r().map(new w9j() { // from class: l.hlx
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200339n((List) obj, new w9j() { // from class: l.xlx
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return Boolean.valueOf(((Media) obj2).mediaType.startsWith("video/"));
                    }
                });
            }
        });
    }

    public emx(Context context, boolean z, boolean z2) {
        this.f92258b = context;
        this.f92260d = z;
        this.f92259c = z2;
    }
}
