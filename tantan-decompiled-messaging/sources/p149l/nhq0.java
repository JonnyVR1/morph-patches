package p149l;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class nhq0 implements pc2 {

    /* JADX INFO: renamed from: a */
    private final Uri f139014a = Uri.parse("content://com.android.badge/badge");

    @Override // p149l.pc2
    /* JADX INFO: renamed from: a */
    public List<String> mo114456a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // p149l.pc2
    @TargetApi(11)
    /* JADX INFO: renamed from: b */
    public void mo114457b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i);
        context.getContentResolver().call(this.f139014a, "setAppBadgeCount", (String) null, bundle);
    }
}
