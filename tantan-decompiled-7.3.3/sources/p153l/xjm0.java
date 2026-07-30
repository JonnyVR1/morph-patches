package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.vivo.push.PushClientConstants;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class xjm0 implements wc2 {
    /* JADX INFO: renamed from: c */
    public static int m211237c(String str, String str2, int i) {
        try {
            try {
                Class<?> cls = Class.forName(str);
                return ((Integer) cls.getField(str2).get(cls)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
                return i;
            }
        } catch (Throwable unused) {
            return i;
        }
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: a */
    public List<String> mo95770a() {
        return Arrays.asList("com.vivo.launcher");
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: b */
    public void mo95771b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra(RemoteConfigConstants.RequestFieldKey.PACKAGE_NAME, context.getPackageName());
        intent.putExtra(PushClientConstants.TAG_CLASS_NAME, componentName.getClassName());
        intent.putExtra("notificationNum", i);
        intent.addFlags(m211237c(Intent.class.getCanonicalName(), "FLAG_RECEIVER_INCLUDE_BACKGROUND", 0));
        context.sendBroadcast(intent);
    }
}
