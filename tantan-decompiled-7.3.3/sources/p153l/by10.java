package p153l;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import android.text.TextUtils;
import com.google.gson.reflect.TypeToken;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.gson.SafeJsonUtil;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.play.IntlMusicBean;
import com.tantanapp.common.utils.CrashHelper;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes10.dex */
public class by10 {

    /* JADX INFO: renamed from: a */
    public wyd0 f78961a;

    /* JADX INFO: renamed from: b */
    public String f78962b = "";

    /* JADX INFO: renamed from: l.by10$a */
    public class C16131a extends TypeToken<List<IntlMusicBean>> {
        public C16131a() {
        }
    }

    /* JADX INFO: renamed from: l.by10$b */
    public static class C16132b {

        /* JADX INFO: renamed from: a */
        public static final by10 f78964a = new by10();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m106943a(ArrayList arrayList, IntlMusicBean intlMusicBean) {
        if (new File(intlMusicBean.filePath).exists()) {
            arrayList.add(intlMusicBean);
        }
    }

    /* JADX INFO: renamed from: e */
    public static by10 m106946e() {
        return C16132b.f78964a;
    }

    /* JADX INFO: renamed from: d */
    public Uri m106947d(ContentResolver contentResolver, long j) {
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
    public void m106948f(String str) {
        if (!TextUtils.equals(this.f78962b, str) || this.f78961a == null) {
            this.f78962b = str;
            this.f78961a = new wyd0("intl_music_scanning_result" + str, "");
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m106949g(gcg0 gcg0Var) {
        List list = (List) SafeJsonUtil.getInstance().fromJson(this.f78961a.get(), new C16131a().getType());
        final ArrayList arrayList = new ArrayList();
        if (list != null) {
            jyb.m147537z(list, new y20() { // from class: l.zx10
                @Override // p153l.y20
                public final void call(Object obj) {
                    by10.m106943a(arrayList, (IntlMusicBean) obj);
                }
            });
        }
        gcg0Var.m137019l(arrayList);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m106950h(Act act, gcg0 gcg0Var) {
        List<IntlMusicBean> listM106953k = m106953k(act);
        this.f78961a.put(SafeJsonUtil.getInstance().toJson(listM106953k));
        gcg0Var.m137019l(listM106953k);
    }

    /* JADX INFO: renamed from: i */
    public C22421c<List<IntlMusicBean>> m106951i() {
        return C22421c.create(new C22421c.a() { // from class: l.yx10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201901a.m106949g((gcg0) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: j */
    public C22421c<List<IntlMusicBean>> m106952j(final Act act) {
        return C22421c.create(new C22421c.a() { // from class: l.ay10
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73934a.m106950h(act, (gcg0) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: k */
    public final List<IntlMusicBean> m106953k(Act act) {
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
                Uri uriM106947d = m106947d(contentResolver, j);
                if (uriM106947d != null) {
                    intlMusicBean.cover = uriM106947d.toString();
                }
                arrayList.add(intlMusicBean);
                intlMusicBean.toString();
            } while (cursorQuery.moveToNext());
            return arrayList;
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            e.getMessage();
            return arrayList;
        } finally {
            cursorQuery.close();
        }
    }
}
