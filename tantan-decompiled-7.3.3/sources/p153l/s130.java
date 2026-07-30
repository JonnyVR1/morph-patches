package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class s130 implements wc2 {
    @Override // p153l.wc2
    /* JADX INFO: renamed from: a */
    public List<String> mo95770a() {
        return Arrays.asList("com.htc.launcher");
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: b */
    public void mo95771b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        boolean z;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        boolean z2 = false;
        try {
            qf3.m176285c(context, intent);
            z = true;
        } catch (ShortcutBadgeException unused) {
            z = false;
        }
        try {
            qf3.m176285c(context, intent2);
            z2 = true;
        } catch (ShortcutBadgeException unused2) {
        }
        if (z || z2) {
            return;
        }
        throw new ShortcutBadgeException("unable to resolve intent: " + intent2.toString());
    }
}
