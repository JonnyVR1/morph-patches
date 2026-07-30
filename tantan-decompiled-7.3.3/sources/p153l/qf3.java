package p153l;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class qf3 {
    /* JADX INFO: renamed from: a */
    public static List<ResolveInfo> m176283a(Context context, Intent intent) {
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return listQueryBroadcastReceivers != null ? listQueryBroadcastReceivers : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: b */
    public static void m176284b(Context context, Intent intent) throws ShortcutBadgeException {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                m176285c(context, intent2);
                return;
            } catch (ShortcutBadgeException unused) {
            }
        }
        m176285c(context, intent);
    }

    /* JADX INFO: renamed from: c */
    public static void m176285c(Context context, Intent intent) throws ShortcutBadgeException {
        List<ResolveInfo> listM176283a = m176283a(context, intent);
        if (listM176283a.size() == 0) {
            throw new ShortcutBadgeException("unable to resolve intent: " + intent.toString());
        }
        for (ResolveInfo resolveInfo : listM176283a) {
            Intent intent2 = new Intent(intent);
            if (resolveInfo != null) {
                intent2.setPackage(resolveInfo.resolvePackageName);
                context.sendBroadcast(intent2);
            }
        }
    }
}
