package p009l;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.p000p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.gson.SafeJsonUtil;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.uqd0;
import l.vwb;
import l.z3g0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tp10 {

    /* JADX INFO: renamed from: a */
    public uqd0 f20809a;

    /* JADX INFO: renamed from: b */
    public String f20810b = "";

    /* JADX INFO: renamed from: l.tp10$a */
    public class C1203a extends TypeToken<List<IntlMusicBean>> {
        public C1203a() {
        }
    }

    /* JADX INFO: renamed from: l.tp10$b */
    public static class C1204b {

        /* JADX INFO: renamed from: a */
        public static final tp10 f20812a = new tp10();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m22604a(ArrayList arrayList, IntlMusicBean intlMusicBean) {
        if (new File(intlMusicBean.filePath).exists()) {
            arrayList.add(intlMusicBean);
        }
    }

    /* JADX INFO: renamed from: e */
    public static tp10 m22607e() {
        return C1204b.f20812a;
    }

    /* JADX INFO: renamed from: d */
    public Uri m22608d(ContentResolver contentResolver, long j) {
        Cursor cursorQuery = contentResolver.query(MediaStore.Audio.Albums.EXTERNAL_CONTENT_URI, new String[]{"album_art"}, "_id=?", new String[]{String.valueOf(j)}, null);
        Uri uriFromFile = null;
        if (cursorQuery != null && cursorQuery.moveToFirst()) {
            String string = cursorQuery.getString(cursorQuery.getColumnIndex("album_art"));
            uriFromFile = string != null ? Uri.fromFile(new File(string)) : null;
            cursorQuery.close();
        }
        return uriFromFile;
    }

    /* JADX INFO: renamed from: f */
    public void m22609f(String str) {
        if (!TextUtils.equals(this.f20810b, str) || this.f20809a == null) {
            this.f20810b = str;
            this.f20809a = new uqd0("intl_music_scanning_result" + str, "");
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m22610g(z3g0 z3g0Var) {
        List list = (List) SafeJsonUtil.getInstance().fromJson((String) this.f20809a.get(), new C1203a().getType());
        final ArrayList arrayList = new ArrayList();
        if (list != null) {
            vwb.z(list, new e30() { // from class: l.rp10
                public final void call(Object obj) {
                    tp10.m22604a(arrayList, (IntlMusicBean) obj);
                }
            });
        }
        z3g0Var.onNext(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m22611h(Act act, z3g0 z3g0Var) {
        List<IntlMusicBean> listM22614k = m22614k(act);
        this.f20809a.put(SafeJsonUtil.getInstance().toJson(listM22614k));
        z3g0Var.onNext(listM22614k);
    }

    /* JADX INFO: renamed from: i */
    public c<List<IntlMusicBean>> m22612i() {
        return c.create(new c.a() { // from class: l.qp10
            public final void call(Object obj) {
                this.f19420a.m22610g((z3g0) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: j */
    public c<List<IntlMusicBean>> m22613j(final Act act) {
        return c.create(new c.a() { // from class: l.sp10
            public final void call(Object obj) {
                this.f20406a.m22611h(act, (z3g0) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: k */
    public final List<IntlMusicBean> m22614k(Act act) {
        ContentResolver contentResolver = act.getContentResolver();
        Cursor cursorQuery = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, new String[]{"_id", "title", "artist", "duration", "_data", "album_id"}, "is_music!= 0 AND mime_type != 'audio/flac'", null, null);
        ArrayList arrayList = new ArrayList();
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return arrayList;
        }
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("title");
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("artist");
            int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow("duration");
            int columnIndexOrThrow5 = cursorQuery.getColumnIndexOrThrow("_data");
            int columnIndexOrThrow6 = cursorQuery.getColumnIndexOrThrow("album_id");
            do {
                IntlMusicBean intlMusicBean = new IntlMusicBean();
                cursorQuery.getLong(columnIndexOrThrow);
                intlMusicBean.title = cursorQuery.getString(columnIndexOrThrow2);
                intlMusicBean.author = cursorQuery.getString(columnIndexOrThrow3);
                intlMusicBean.duration = cursorQuery.getInt(columnIndexOrThrow4);
                intlMusicBean.filePath = cursorQuery.getString(columnIndexOrThrow5);
                long j = cursorQuery.getLong(columnIndexOrThrow6);
                ContentUris.withAppendedId(Uri.parse("content://media/external/audio/albumart"), j);
                Uri uriM22608d = m22608d(contentResolver, j);
                if (uriM22608d != null) {
                    intlMusicBean.cover = uriM22608d.toString();
                }
                arrayList.add(intlMusicBean);
                intlMusicBean.toString();
            } while (cursorQuery.moveToNext());
            return arrayList;
        } catch (Exception e) {
            CrashHelper.c(e);
            e.getMessage();
            return arrayList;
        } finally {
            cursorQuery.close();
        }
    }
}
