package p149l;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.data.ProfileLikeModuleType;
import com.p046p1.mobile.putong.data.AudioMedia;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tencent.could.huiyansdk.overseas.HuiYanOsConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes12.dex */
public class kuv {

    /* JADX INFO: renamed from: a */
    public static C22392a<List<Music>> f124720a = C22392a.m221513c(new ArrayList());

    /* JADX INFO: renamed from: b */
    public static long f124721b = 0;

    /* JADX INFO: renamed from: d */
    public static C22306c<String> m147320d(final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.juv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kuv.m147322f(str);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m147321e(String str, String[] strArr, String str2, int i) {
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
    public static String m147322f(String str) {
        Cursor cursorQuery;
        String[] strArr = {"album_art"};
        if (Build.VERSION.SDK_INT >= 30) {
            Bundle bundleM147321e = m147321e(null, null, "_id", 1);
            cursorQuery = FeedModule.f38852a.getContentResolver().query(Uri.parse("content://media/external/audio/albums/" + str), strArr, bundleM147321e, new CancellationSignal());
        } else {
            cursorQuery = FeedModule.f38852a.getContentResolver().query(Uri.parse("content://media/external/audio/albums/" + str), strArr, null, null, "_id LIMIT 1");
        }
        String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
        cursorQuery.close();
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static void m147323g() {
        m147327k();
        m147325i();
    }

    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: h */
    public static List<Music> m147324h() {
        Cursor cursorQuery;
        ContentResolver contentResolver = FeedModule.f38852a.getContentResolver();
        if (Build.VERSION.SDK_INT >= 30) {
            cursorQuery = contentResolver.query(MediaStore.Audio.Media.getContentUri("external"), null, m147321e("_id > " + f124721b, null, "_id", 20), new CancellationSignal());
        } else {
            cursorQuery = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, "_id > " + f124721b, null, "_id LIMIT 20");
        }
        List<Music> listM221515e = f124720a.m221515e();
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return listM221515e;
        }
        while (cursorQuery.getPosition() < cursorQuery.getCount()) {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("mime_type"));
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            if (TextUtils.isEmpty(string) || !string.startsWith("audio/")) {
                cursorQuery.moveToNext();
            } else {
                long j = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                f124721b = j;
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
                        music.f38781id = String.valueOf(j);
                        music.name = string3;
                        music.describe = string4;
                        AudioMedia audioMedia = new AudioMedia();
                        music.audio = audioMedia;
                        audioMedia.duration = j2 / 1000.0d;
                        audioMedia.size = String.valueOf(j3);
                        music.audio.url = string2;
                        music.cover = String.valueOf(j4);
                        music.type = "local";
                        listM221515e.add(music);
                    }
                    cursorQuery.moveToNext();
                } else {
                    cursorQuery.moveToNext();
                }
            }
        }
        cursorQuery.close();
        return listM221515e;
    }

    /* JADX INFO: renamed from: i */
    public static void m147325i() {
        C22306c.fromCallable(new Callable() { // from class: l.huv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kuv.m147324h();
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new e30() { // from class: l.iuv
            @Override // p149l.e30
            public final void call(Object obj) {
                kuv.f124720a.onNext((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static C22306c<List<Music>> m147326j() {
        return f124720a;
    }

    /* JADX INFO: renamed from: k */
    public static void m147327k() {
        f124720a.m221515e().clear();
        f124721b = 0L;
    }
}
