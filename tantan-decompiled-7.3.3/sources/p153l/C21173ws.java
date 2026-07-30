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
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: renamed from: l.ws */
/* JADX INFO: loaded from: classes9.dex */
public class C21173ws implements AbstractC0495a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f190578j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", BLiveOperationTitleShowType.duration};

    /* JADX INFO: renamed from: b */
    public final Context f190580b;

    /* JADX INFO: renamed from: c */
    public final boolean f190581c;

    /* JADX INFO: renamed from: d */
    public final boolean f190582d;

    /* JADX INFO: renamed from: e */
    public int f190583e;

    /* JADX INFO: renamed from: h */
    public boolean f190586h;

    /* JADX INFO: renamed from: a */
    public final C22507a<List<Media>> f190579a = C22507a.m222758b();

    /* JADX INFO: renamed from: f */
    public int f190584f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f190585g = true;

    /* JADX INFO: renamed from: i */
    public boolean f190587i = false;

    public C21173ws(Context context, boolean z, boolean z2) {
        this.f190580b = context;
        this.f190582d = z;
        this.f190581c = z2;
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: a */
    public utv<Cursor> mo3109a(int i, Bundle bundle) {
        String str;
        String str2 = "";
        if (this.f190586h) {
            str = " LIMIT " + (this.f190583e * this.f190584f) + Constants.SEPARATOR_COMMA + this.f190583e;
            if (this.f190584f == 0) {
                str = " LIMIT " + this.f190583e;
            }
        } else {
            str = "";
        }
        if (this.f190587i) {
            this.f190585g = false;
        } else {
            str2 = str;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        if (Build.VERSION.SDK_INT >= 30) {
            return m207715f(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f190581c;
        if (z && this.f190582d) {
            return new wyb(this.f190580b, contentUri, f190578j, "media_type=1 OR media_type=3", null, strConcat);
        }
        Context context = this.f190580b;
        return z ? new wyb(context, contentUri, f190578j, "media_type=3", null, strConcat) : new wyb(context, contentUri, f190578j, "media_type=1", null, strConcat);
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: c */
    public void mo3111c(utv<Cursor> utvVar) {
        this.f190579a.onNext(Collections.EMPTY_LIST);
        this.f190579a.onCompleted();
    }

    /* JADX INFO: renamed from: f */
    public final utv m207715f(Uri uri) {
        boolean z = this.f190581c;
        if (z && this.f190582d) {
            Context context = this.f190580b;
            String[] strArr = f190578j;
            int i = this.f190583e;
            return new uym(context, uri, strArr, "media_type=1 OR media_type=3", null, "date_modified DESC", i, i * this.f190584f);
        }
        Context context2 = this.f190580b;
        if (z) {
            String[] strArr2 = f190578j;
            int i2 = this.f190583e;
            return new uym(context2, uri, strArr2, "media_type=3", null, "date_modified DESC", i2, i2 * this.f190584f);
        }
        String[] strArr3 = f190578j;
        int i3 = this.f190583e;
        return new uym(context2, uri, strArr3, "media_type=1", null, "date_modified DESC", i3, i3 * this.f190584f);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m207716g(List list) {
        this.f190579a.onNext(list);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m207717h(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f190578j;
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
            if (arrayList.size() == 0 && this.f190584f != 0) {
                this.f190584f = 0;
                this.f190585g = false;
                return;
            }
            if (arrayList.size() == 0 && this.f190584f == 0) {
                this.f190587i = true;
            }
            this.f190584f++;
            l51.m152887G(new Runnable() { // from class: l.vs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185546a.m207716g(arrayList);
                }
            });
        } catch (Exception e) {
            if (cursor.isClosed()) {
                return;
            }
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public C22421c<List<Media>> m207718i() {
        return this.f190579a;
    }

    @Override // androidx.loader.app.AbstractC0495a.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo3110b(utv<Cursor> utvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f190579a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            l51.m152919y(new Runnable() { // from class: l.us
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180720a.m207717h(cursor);
                }
            });
        }
    }
}
