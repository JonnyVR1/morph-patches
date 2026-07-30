package p149l;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class yz40 implements pc2 {

    /* JADX INFO: renamed from: a */
    private int f200848a = -1;

    /* JADX INFO: renamed from: c */
    private void m216592c(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        cf3.m106478c(context, intent);
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: d */
    private void m216593d(Context context, int i) throws ShortcutBadgeException {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new ShortcutBadgeException("Unable to execute Badge By Content Provider");
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m216594e(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        return cf3.m106476a(context, intent).size() != 0;
    }

    @Override // p149l.pc2
    /* JADX INFO: renamed from: a */
    public List<String> mo114456a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // p149l.pc2
    /* JADX INFO: renamed from: b */
    public void mo114457b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (this.f200848a == i) {
            return;
        }
        this.f200848a = i;
        if (m216594e(context, componentName, i)) {
            m216592c(context, componentName, i);
        } else {
            m216593d(context, i);
        }
    }
}
