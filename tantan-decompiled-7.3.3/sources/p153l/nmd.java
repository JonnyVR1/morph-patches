package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class nmd implements wc2 {
    @Override // p153l.wc2
    /* JADX INFO: renamed from: a */
    public List<String> mo95770a() {
        return Arrays.asList("fr.neamar.kiss", "com.quaap.launchtime", "com.quaap.launchtime_official");
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: b */
    public void mo95771b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("android.intent.action.BADGE_COUNT_UPDATE");
        intent.putExtra("badge_count", i);
        intent.putExtra("badge_count_package_name", componentName.getPackageName());
        intent.putExtra("badge_count_class_name", componentName.getClassName());
        qf3.m176284b(context, intent);
    }

    /* JADX INFO: renamed from: c */
    public boolean m163810c(Context context) {
        if (qf3.m176283a(context, new Intent("android.intent.action.BADGE_COUNT_UPDATE")).size() <= 0) {
            return Build.VERSION.SDK_INT >= 26 && qf3.m176283a(context, new Intent("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE")).size() > 0;
        }
        return true;
    }
}
