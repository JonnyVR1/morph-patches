package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class it20 implements pc2 {
    @Override // p149l.pc2
    /* JADX INFO: renamed from: a */
    public List<String> mo114456a() {
        return Arrays.asList("com.htc.launcher");
    }

    @Override // p149l.pc2
    /* JADX INFO: renamed from: b */
    public void mo114457b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        boolean z;
        Intent intent = new Intent("com.htc.launcher.action.SET_NOTIFICATION");
        intent.putExtra("com.htc.launcher.extra.COMPONENT", componentName.flattenToShortString());
        intent.putExtra("com.htc.launcher.extra.COUNT", i);
        Intent intent2 = new Intent("com.htc.launcher.action.UPDATE_SHORTCUT");
        intent2.putExtra("packagename", componentName.getPackageName());
        intent2.putExtra("count", i);
        boolean z2 = false;
        try {
            cf3.m106478c(context, intent);
            z = true;
        } catch (ShortcutBadgeException unused) {
            z = false;
        }
        try {
            cf3.m106478c(context, intent2);
            z2 = true;
        } catch (ShortcutBadgeException unused2) {
        }
        if (z || z2) {
            return;
        }
        throw new ShortcutBadgeException("unable to resolve intent: " + intent2.toString());
    }
}
