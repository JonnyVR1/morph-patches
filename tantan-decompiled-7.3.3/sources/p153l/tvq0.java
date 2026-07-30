package p153l;

import android.content.ContentValues;
import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.xiaomi.push.C14892gj;
import com.xiaomi.push.C14936m;

/* JADX INFO: loaded from: classes2.dex */
public class tvq0 extends vvq0.C20943d {

    /* JADX INFO: renamed from: i */
    private String f176289i;

    public tvq0(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.f176289i = str2;
    }

    /* JADX INFO: renamed from: i */
    public static tvq0 m192831i(Context context, String str, C14892gj c14892gj) {
        byte[] bArrM87448e = C14936m.m87448e(c14892gj);
        if (bArrM87448e == null || bArrM87448e.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(NotificationCompat.CATEGORY_STATUS, (Integer) 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", c14892gj.m86804d());
        contentValues.put(NavigationIntent.messageItem, bArrM87448e);
        contentValues.put(RemoteConfigConstants.RequestFieldKey.APP_ID, nvq0.m164913d(context).m164924l());
        contentValues.put(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, nvq0.m164913d(context).m164919b());
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", (Integer) 0);
        return new tvq0(str, contentValues, "a job build to insert message to db");
    }
}
