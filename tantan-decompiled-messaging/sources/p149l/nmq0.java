package p149l;

import android.content.ContentValues;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.xiaomi.push.C14744gj;
import com.xiaomi.push.C14788m;

/* JADX INFO: loaded from: classes2.dex */
public class nmq0 extends pmq0.C19286d {

    /* JADX INFO: renamed from: i */
    private String f139655i;

    public nmq0(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.f139655i = str2;
    }

    /* JADX INFO: renamed from: i */
    public static nmq0 m160154i(Context context, String str, C14744gj c14744gj) {
        byte[] bArrM86277e = C14788m.m86277e(c14744gj);
        if (bArrM86277e == null || bArrM86277e.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationCompat.CATEGORY_STATUS, (Integer) 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", c14744gj.m85633d());
        contentValues.put(NavigationIntent.messageItem, bArrM86277e);
        contentValues.put(RemoteConfigConstants.RequestFieldKey.APP_ID, hmq0.m131742d(context).m131753l());
        contentValues.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, hmq0.m131742d(context).m131748b());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", (Integer) 0);
        return new nmq0(str, contentValues, "a job build to insert message to db");
    }
}
