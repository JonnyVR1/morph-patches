package p007l;

import android.annotation.SuppressLint;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.p000p1.mobile.putong.data.AudioMedia;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.feed.FeedModule;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import l.e30;
import l.mkd0;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class kuv {

    /* JADX INFO: renamed from: a */
    public static a<List<Music>> f9802a = a.c(new ArrayList());

    /* JADX INFO: renamed from: b */
    public static long f9803b = 0;

    /* JADX INFO: renamed from: d */
    public static c<String> m11522d(final String str) {
        return c.fromCallable(new Callable() { // from class: l.juv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kuv.m11524f(str);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: e */
    public static Bundle m11523e(String str, String[] strArr, String str2, int i) {
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
    public static String m11524f(String str) {
        Cursor cursorQuery;
        String[] strArr = {"album_art"};
        if (Build.VERSION.SDK_INT >= 30) {
            Bundle bundleM11523e = m11523e(null, null, "_id", 1);
            cursorQuery = FeedModule.f313a.getContentResolver().query(Uri.parse("content://media/external/audio/albums/" + str), strArr, bundleM11523e, new CancellationSignal());
        } else {
            cursorQuery = FeedModule.f313a.getContentResolver().query(Uri.parse("content://media/external/audio/albums/" + str), strArr, null, null, "_id LIMIT 1");
        }
        String string = cursorQuery.moveToFirst() ? cursorQuery.getString(0) : null;
        cursorQuery.close();
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static void m11525g() {
        m11529k();
        m11527i();
    }

    @SuppressLint({"Range"})
    /* JADX INFO: renamed from: h */
    public static List<Music> m11526h() {
        Cursor cursorQuery;
        ContentResolver contentResolver = FeedModule.f313a.getContentResolver();
        if (Build.VERSION.SDK_INT >= 30) {
            cursorQuery = contentResolver.query(MediaStore.Audio.Media.getContentUri("external"), null, m11523e("_id > " + f9803b, null, "_id", 20), new CancellationSignal());
        } else {
            cursorQuery = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, null, "_id > " + f9803b, null, "_id LIMIT 20");
        }
        List<Music> list = (List) f9802a.e();
        if (!cursorQuery.moveToFirst()) {
            cursorQuery.close();
            return list;
        }
        while (cursorQuery.getPosition() < cursorQuery.getCount()) {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("mime_type"));
            String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("_data"));
            if (TextUtils.isEmpty(string) || !string.startsWith("audio/")) {
                cursorQuery.moveToNext();
            } else {
                long j = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                f9803b = j;
                String str = string.split("/")[1];
                if (TextUtils.equals(str, "mpeg") || TextUtils.equals(str, "mp4") || string.contains("aac")) {
                    String string3 = cursorQuery.getString(cursorQuery.getColumnIndex("title"));
                    String string4 = cursorQuery.getString(cursorQuery.getColumnIndex("artist"));
                    long j2 = cursorQuery.getLong(cursorQuery.getColumnIndex("duration"));
                    long j3 = cursorQuery.getLong(cursorQuery.getColumnIndex("_size"));
                    cursorQuery.getString(cursorQuery.getColumnIndex("album"));
                    long j4 = cursorQuery.getLong(cursorQuery.getColumnIndex("album_id"));
                    int i = cursorQuery.getInt(cursorQuery.getColumnIndex("is_music"));
                    Music music = new Music();
                    if (i != 0 && j2 / 30000 >= 1) {
                        music.f242id = String.valueOf(j);
                        music.name = string3;
                        music.describe = string4;
                        AudioMedia audioMedia = new AudioMedia();
                        music.audio = audioMedia;
                        audioMedia.duration = j2 / 1000.0d;
                        audioMedia.size = String.valueOf(j3);
                        music.audio.url = string2;
                        music.cover = String.valueOf(j4);
                        music.type = "local";
                        list.add(music);
                    }
                    cursorQuery.moveToNext();
                } else {
                    cursorQuery.moveToNext();
                }
            }
        }
        cursorQuery.close();
        return list;
    }

    /* JADX INFO: renamed from: i */
    public static void m11527i() {
        c.fromCallable(new Callable() { // from class: l.huv
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return kuv.m11526h();
            }
        }).compose(mkd0.C()).subscribe(mkd0.G(new e30() { // from class: l.iuv
            public final void call(Object obj) {
                kuv.f9802a.onNext((List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j */
    public static c<List<Music>> m11528j() {
        return f9802a;
    }

    /* JADX INFO: renamed from: k */
    public static void m11529k() {
        ((List) f9802a.e()).clear();
        f9803b = 0L;
    }
}
