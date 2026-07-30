package p153l;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p051p1.mobile.putong.data.AudioMedia;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes13.dex */
public class lwv {

    /* JADX INFO: renamed from: a */
    public static C22507a<List<Music>> f133865a = C22507a.m222759c(new ArrayList());

    /* JADX INFO: renamed from: b */
    public static long f133866b = 0;

    /* JADX INFO: renamed from: d */
    public static C22421c<String> m156118d(final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.kwv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lwv.m156120f(str);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m156119e(String str, String[] strArr, String str2, int i) {
        if (str == null && strArr == null && str2 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        if (str != null) {
            bundle.putString("android:query-arg-sql-selection", str);
        }
        if (strArr != null) {
            bundle.putStringArray("android:query-arg-sql-selection-args", strArr);
        }
        if (str2 != null) {
            bundle.putString("android:query-arg-sql-sort-order", str2);
        }
        if (i != 0) {
            bundle.putInt("android:query-arg-limit", i);
        }
        return bundle;
    }

    /* JADX INFO: renamed from: f */
    public static String m156120f(String str) {
        Cursor cursorQuery;
        String[] strArr = {"album_art"};
        if (Build.VERSION.SDK_INT >= 30) {
            Bundle bundleM156119e = m156119e(null, null, "_id", 1);
            cursorQuery = FeedModule.f39700a.getContentResolver().query(Uri.parse("content://media/external/audio/albums/" + str), strArr, bundleM156119e, new CancellationSignal());
        } else {
            cursorQuery = FeedModule.f39700a.getContentResolver().query(Uri.parse("content://media/external/audio/albums/" + str), strArr, null, null, "_id LIMIT 1");
        }
        String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
        cursorQuery.close();
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static void m156121g() {
        m156125k();
        m156123i();
    }

    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: h */
    public static List<Music> m156122h() {
        Cursor cursorQuery;
        ContentResolver contentResolver = FeedModule.f39700a.getContentResolver();
        if (Build.VERSION.SDK_INT >= 30) {
            cursorQuery = contentResolver.query(MediaStore.Audio.Media.getContentUri("external"), null, m156119e("_id > " + f133866b, null, "_id", 20), new CancellationSignal());
        } else {
            cursorQuery = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, "_id > " + f133866b, null, "_id LIMIT 20");
        }
        List<Music> listM222761e = f133865a.m222761e();
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return listM222761e;
        }
        while (cursorQuery.getPosition() < cursorQuery.getCount()) {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("mime_type"));
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            if (TextUtils.isEmpty(string) || !string.startsWith("audio/")) {
                cursorQuery.moveToNext();
            } else {
                long j = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                f133866b = j;
                String str = string.split("/")[1];
                if (TextUtils.equals(str, "mpeg") || TextUtils.equals(str, "mp4") || string.contains("aac")) {
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("title"));
                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("artist"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndex(BLiveOperationTitleShowType.duration));
                    long j3 = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                    cursorQuery.getString(cursorQuery.getColumnIndex(ProfileLikeModuleType.album));
                    long j4 = cursorQuery.getLong(cursorQuery.getColumnIndex("album_id"));
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndex("is_music"));
                    Music music = new Music();
                    if (i != 0 && j2 / HuiYanOsConfig.LONG_CHECK_OVERSEAS_DEFAULT_TIME_OUT >= 1) {
                        music.f39629id = String.valueOf(j);
                        music.name = string3;
                        music.describe = string4;
                        AudioMedia audioMedia = new AudioMedia();
                        music.audio = audioMedia;
                        audioMedia.duration = j2 / 1000.0d;
                        audioMedia.size = String.valueOf(j3);
                        music.audio.url = string2;
                        music.cover = String.valueOf(j4);
                        music.type = "local";
                        listM222761e.add(music);
                    }
                    cursorQuery.moveToNext();
                } else {
                    cursorQuery.moveToNext();
                }
            }
        }
        cursorQuery.close();
        return listM222761e;
    }

    /* JADX INFO: renamed from: i */
    public static void m156123i() {
        C22421c.fromCallable(new Callable() { // from class: l.iwv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return lwv.m156122h();
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173596G(new y20() { // from class: l.jwv
            @Override // p153l.y20
            public final void call(Object obj) {
                lwv.f133865a.onNext((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static C22421c<List<Music>> m156124j() {
        return f133865a;
    }

    /* JADX INFO: renamed from: k */
    public static void m156125k() {
        f133865a.m222761e().clear();
        f133866b = 0L;
    }
}
