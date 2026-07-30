package p153l;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class sqq0 implements wc2 {

    /* JADX INFO: renamed from: a */
    private final Uri f170197a = Uri.parse("content://com.android.badge/badge");

    @Override // p153l.wc2
    /* JADX INFO: renamed from: a */
    public List<String> mo95770a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // p153l.wc2
    @TargetApi(11)
    /* JADX INFO: renamed from: b */
    public void mo95771b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f170197a, "setAppBadgeCount", (String) null, bundle);
    }
}
