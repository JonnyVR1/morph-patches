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
import java.util.List;
import l.e51;
import l.ixb;
import l.rhi;
import l.trv;
import l.twm;
import rx.c;

/* JADX INFO: renamed from: l.ct */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0617ct implements a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f9822j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", "duration"};

    /* JADX INFO: renamed from: b */
    public final Context f9824b;

    /* JADX INFO: renamed from: c */
    public final boolean f9825c;

    /* JADX INFO: renamed from: d */
    public final boolean f9826d;

    /* JADX INFO: renamed from: e */
    public int f9827e;

    /* JADX INFO: renamed from: h */
    public boolean f9830h;

    /* JADX INFO: renamed from: a */
    public final rx.subjects.a<List<Media>> f9823a = rx.subjects.a.b();

    /* JADX INFO: renamed from: f */
    public int f9828f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f9829g = true;

    /* JADX INFO: renamed from: i */
    public boolean f9831i = false;

    public C0617ct(Context context, boolean z, boolean z2) {
        this.f9824b = context;
        this.f9826d = z;
        this.f9825c = z2;
    }

    /* JADX INFO: renamed from: a */
    public trv<Cursor> m13621a(int i, Bundle bundle) {
        String str;
        String str2 = "";
        if (this.f9830h) {
            str = " LIMIT " + (this.f9827e * this.f9828f) + "," + this.f9827e;
            if (this.f9828f == 0) {
                str = " LIMIT " + this.f9827e;
            }
        } else {
            str = "";
        }
        if (this.f9831i) {
            this.f9829g = false;
        } else {
            str2 = str;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        if (Build.VERSION.SDK_INT >= 30) {
            return m13624f(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f9825c;
        if (z && this.f9826d) {
            return new ixb(this.f9824b, contentUri, f9822j, "media_type=1 OR media_type=3", (String[]) null, strConcat);
        }
        Context context = this.f9824b;
        return z ? new ixb(context, contentUri, f9822j, "media_type=3", (String[]) null, strConcat) : new ixb(context, contentUri, f9822j, "media_type=1", (String[]) null, strConcat);
    }

    /* JADX INFO: renamed from: c */
    public void m13623c(trv<Cursor> trvVar) {
        this.f9823a.onNext(Collections.EMPTY_LIST);
        this.f9823a.onCompleted();
    }

    /* JADX INFO: renamed from: f */
    public final trv m13624f(Uri uri) {
        boolean z = this.f9825c;
        if (z && this.f9826d) {
            Context context = this.f9824b;
            String[] strArr = f9822j;
            int i = this.f9827e;
            return new twm(context, uri, strArr, "media_type=1 OR media_type=3", (String[]) null, "date_modified DESC", i, i * this.f9828f);
        }
        Context context2 = this.f9824b;
        if (z) {
            String[] strArr2 = f9822j;
            int i2 = this.f9827e;
            return new twm(context2, uri, strArr2, "media_type=3", (String[]) null, "date_modified DESC", i2, i2 * this.f9828f);
        }
        String[] strArr3 = f9822j;
        int i3 = this.f9827e;
        return new twm(context2, uri, strArr3, "media_type=1", (String[]) null, "date_modified DESC", i3, i3 * this.f9828f);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m13625g(List list) {
        this.f9823a.onNext(list);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m13626h(Cursor cursor) {
        Video picture;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f9822j;
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
            if (arrayList.size() == 0 && this.f9828f != 0) {
                this.f9828f = 0;
                this.f9829g = false;
                return;
            }
            if (arrayList.size() == 0 && this.f9828f == 0) {
                this.f9831i = true;
            }
            this.f9828f++;
            e51.G(new Runnable() { // from class: l.bt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9072a.m13625g(arrayList);
                }
            });
        } catch (Exception e) {
            if (cursor.isClosed()) {
                return;
            }
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public c<List<Media>> m13627i() {
        return this.f9823a;
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m13622b(trv<Cursor> trvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f9823a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            e51.y(new Runnable() { // from class: l.at
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8479a.m13626h(cursor);
                }
            });
        }
    }
}
