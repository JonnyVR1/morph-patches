package p153l;

import android.content.Context;
import android.content.Intent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.tantanapp.common.utils.CrashHelper;
import io.requery.android.database.sqlite.SQLiteDatabase;

/* JADX INFO: loaded from: classes10.dex */
public class mgy extends ix2 {
    @Override // p153l.m2m
    /* JADX INFO: renamed from: a */
    public boolean mo156866a(Context context) {
        try {
            Intent intent = new Intent("com.meizu.safe.security.SHOW_APPSEC");
            intent.setClassName("com.meizu.safe", "com.meizu.safe.security.AppSecActivity");
            intent.putExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context.getPackageName());
            intent.setFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
            if (ive0.m142294h(context, intent)) {
                context.startActivity(intent);
                return true;
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        return nti.m164729c(context);
    }

    @Override // p153l.m2m
    public boolean isSupported() {
        return true;
    }
}
