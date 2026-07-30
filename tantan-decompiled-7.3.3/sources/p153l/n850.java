package p153l;

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
public class n850 implements wc2 {

    /* JADX INFO: renamed from: a */
    private int f140652a = -1;

    /* JADX INFO: renamed from: c */
    private void m161895c(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (i == 0) {
            i = -1;
        }
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        qf3.m176285c(context, intent);
    }

    @TargetApi(11)
    /* JADX INFO: renamed from: d */
    private void m161896d(Context context, int i) throws ShortcutBadgeException {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new ShortcutBadgeException("Unable to execute Badge By Content Provider");
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m161897e(Context context, ComponentName componentName, int i) {
        Intent intent = new Intent("com.oppo.unsettledevent");
        intent.putExtra("pakeageName", componentName.getPackageName());
        intent.putExtra("number", i);
        intent.putExtra("upgradeNumber", i);
        return qf3.m176283a(context, intent).size() != 0;
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: a */
    public List<String> mo95770a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: b */
    public void mo95771b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        if (this.f140652a == i) {
            return;
        }
        this.f140652a = i;
        if (m161897e(context, componentName, i)) {
            m161895c(context, componentName, i);
        } else {
            m161896d(context, i);
        }
    }
}
