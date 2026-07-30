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

/* JADX INFO: renamed from: l.ct */
/* JADX INFO: loaded from: classes9.dex */
public class C16239ct implements AbstractC0494a.a<Cursor> {

    /* JADX INFO: renamed from: j */
    public static final String[] f82437j = {"_id", "_data", "date_added", "_display_name", "media_type", "mime_type", BLiveOperationTitleShowType.duration};

    /* JADX INFO: renamed from: b */
    public final Context f82439b;

    /* JADX INFO: renamed from: c */
    public final boolean f82440c;

    /* JADX INFO: renamed from: d */
    public final boolean f82441d;

    /* JADX INFO: renamed from: e */
    public int f82442e;

    /* JADX INFO: renamed from: h */
    public boolean f82445h;

    /* JADX INFO: renamed from: a */
    public final C22392a<List<Media>> f82438a = C22392a.m221512b();

    /* JADX INFO: renamed from: f */
    public int f82443f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f82444g = true;

    /* JADX INFO: renamed from: i */
    public boolean f82446i = false;

    public C16239ct(Context context, boolean z, boolean z2) {
        this.f82439b = context;
        this.f82441d = z;
        this.f82440c = z2;
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: a */
    public trv<Cursor> mo3108a(int i, Bundle bundle) {
        String str;
        String str2 = "";
        if (this.f82445h) {
            str = " LIMIT " + (this.f82442e * this.f82443f) + Constants.SEPARATOR_COMMA + this.f82442e;
            if (this.f82443f == 0) {
                str = " LIMIT " + this.f82442e;
            }
        } else {
            str = "";
        }
        if (this.f82446i) {
            this.f82444g = false;
        } else {
            str2 = str;
        }
        Uri contentUri = MediaStore.Files.getContentUri("external");
        if (Build.VERSION.SDK_INT >= 30) {
            return m108645f(contentUri);
        }
        String strConcat = "date_modified DESC".concat(str2);
        boolean z = this.f82440c;
        if (z && this.f82441d) {
            return new ixb(this.f82439b, contentUri, f82437j, "media_type=1 OR media_type=3", null, strConcat);
        }
        Context context = this.f82439b;
        return z ? new ixb(context, contentUri, f82437j, "media_type=3", null, strConcat) : new ixb(context, contentUri, f82437j, "media_type=1", null, strConcat);
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: c */
    public void mo3110c(trv<Cursor> trvVar) {
        this.f82438a.onNext(Collections.EMPTY_LIST);
        this.f82438a.onCompleted();
    }

    /* JADX INFO: renamed from: f */
    public final trv m108645f(Uri uri) {
        boolean z = this.f82440c;
        if (z && this.f82441d) {
            Context context = this.f82439b;
            String[] strArr = f82437j;
            int i = this.f82442e;
            return new twm(context, uri, strArr, "media_type=1 OR media_type=3", null, "date_modified DESC", i, i * this.f82443f);
        }
        Context context2 = this.f82439b;
        if (z) {
            String[] strArr2 = f82437j;
            int i2 = this.f82442e;
            return new twm(context2, uri, strArr2, "media_type=3", null, "date_modified DESC", i2, i2 * this.f82443f);
        }
        String[] strArr3 = f82437j;
        int i3 = this.f82442e;
        return new twm(context2, uri, strArr3, "media_type=1", null, "date_modified DESC", i3, i3 * this.f82443f);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m108646g(List list) {
        this.f82438a.onNext(list);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m108647h(Cursor cursor) {
        Media media;
        if (cursor.isClosed()) {
            return;
        }
        try {
            final ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String[] strArr = f82437j;
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
            if (arrayList.size() == 0 && this.f82443f != 0) {
                this.f82443f = 0;
                this.f82444g = false;
                return;
            }
            if (arrayList.size() == 0 && this.f82443f == 0) {
                this.f82446i = true;
            }
            this.f82443f++;
            e51.m114742G(new Runnable() { // from class: l.bt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f77152a.m108646g(arrayList);
                }
            });
        } catch (Exception e) {
            if (cursor.isClosed()) {
                return;
            }
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: i */
    public C22306c<List<Media>> m108648i() {
        return this.f82438a;
    }

    @Override // androidx.loader.app.AbstractC0494a.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo3109b(trv<Cursor> trvVar, final Cursor cursor) {
        if (cursor == null) {
            this.f82438a.onNext(new ArrayList());
        } else {
            if (cursor.isClosed()) {
                return;
            }
            cursor.moveToPosition(-1);
            e51.m114774y(new Runnable() { // from class: l.at
                @Override // java.lang.Runnable
                public final void run() {
                    this.f71514a.m108647h(cursor);
                }
            });
        }
    }
}
