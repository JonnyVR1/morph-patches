package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;
import org.seamless.xhtml.XHTML;

/* JADX INFO: loaded from: classes2.dex */
public class tll implements pc2 {
    @Override // p149l.pc2
    /* JADX INFO: renamed from: a */
    public List<String> mo114456a() {
        return Arrays.asList("com.huawei.android.launcher", "com.hihonor.android.launcher");
    }

    @Override // p149l.pc2
    /* JADX INFO: renamed from: b */
    public void mo114457b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Bundle bundle = new Bundle();
        bundle.putString("package", context.getPackageName());
        bundle.putString(XHTML.ATTR.CLASS, componentName.getClassName());
        bundle.putInt("badgenumber", i);
        context.getContentResolver().call(Uri.parse("content://com.huawei.android.launcher.settings/badge/"), "change_badge", (String) null, bundle);
    }
}
