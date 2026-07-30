package p149l;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.gson.SafeJsonUtil;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class tp10 {

    /* JADX INFO: renamed from: a */
    public uqd0 f171427a;

    /* JADX INFO: renamed from: b */
    public String f171428b = "";

    /* JADX INFO: renamed from: l.tp10$a */
    public class C20231a extends TypeToken<List<IntlMusicBean>> {
        public C20231a() {
        }
    }

    /* JADX INFO: renamed from: l.tp10$b */
    public static class C20232b {

        /* JADX INFO: renamed from: a */
        public static final tp10 f171430a = new tp10();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m189944a(ArrayList arrayList, IntlMusicBean intlMusicBean) {
        if (new File(intlMusicBean.filePath).exists()) {
            arrayList.add(intlMusicBean);
        }
    }

    /* JADX INFO: renamed from: e */
    public static tp10 m189947e() {
        return C20232b.f171430a;
    }

    /* JADX INFO: renamed from: d */
    public Uri m189948d(ContentResolver contentResolver, long j) {
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
    public void m189949f(String str) {
        if (!TextUtils.equals(this.f171428b, str) || this.f171427a == null) {
            this.f171428b = str;
            this.f171427a = new uqd0("intl_music_scanning_result" + str, "");
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m189950g(z3g0 z3g0Var) {
        List list = (List) SafeJsonUtil.getInstance().fromJson(this.f171427a.get(), new C20231a().getType());
        final ArrayList arrayList = new ArrayList();
        if (list != null) {
            vwb.m200354z(list, new e30() { // from class: l.rp10
                @Override // p149l.e30
                public final void call(Object obj) {
                    tp10.m189944a(arrayList, (IntlMusicBean) obj);
                }
            });
        }
        z3g0Var.m132487l(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m189951h(Act act, z3g0 z3g0Var) {
        List<IntlMusicBean> listM189954k = m189954k(act);
        this.f171427a.put(SafeJsonUtil.getInstance().toJson(listM189954k));
        z3g0Var.m132487l(listM189954k);
    }

    /* JADX INFO: renamed from: i */
    public C22306c<List<IntlMusicBean>> m189952i() {
        return C22306c.create(new C22306c.a() { // from class: l.qp10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155663a.m189950g((z3g0) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: j */
    public C22306c<List<IntlMusicBean>> m189953j(final Act act) {
        return C22306c.create(new C22306c.a() { // from class: l.sp10
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165741a.m189951h(act, (z3g0) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: k */
    public final List<IntlMusicBean> m189954k(Act act) {
        String[] strArr = {"_id", "title", "artist", BLiveOperationTitleShowType.duration, "_data", "album_id"};
        ContentResolver contentResolver = act.getContentResolver();
        Cursor cursorQuery = contentResolver.query(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, strArr, "is_music!= 0 AND mime_type != 'audio/flac'", null, null);
        ArrayList arrayList = new ArrayList();
        if (cursorQuery == null || !cursorQuery.moveToFirst()) {
            return arrayList;
        }
        try {
            int columnIndexOrThrow = cursorQuery.getColumnIndexOrThrow("_id");
            int columnIndexOrThrow2 = cursorQuery.getColumnIndexOrThrow("title");
            int columnIndexOrThrow3 = cursorQuery.getColumnIndexOrThrow("artist");
            int columnIndexOrThrow4 = cursorQuery.getColumnIndexOrThrow(BLiveOperationTitleShowType.duration);
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
                Uri uriM189948d = m189948d(contentResolver, j);
                if (uriM189948d != null) {
                    intlMusicBean.cover = uriM189948d.toString();
                }
                arrayList.add(intlMusicBean);
                intlMusicBean.toString();
            } while (cursorQuery.moveToNext());
            return arrayList;
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            e.getMessage();
            return arrayList;
        } finally {
            cursorQuery.close();
        }
    }
}
