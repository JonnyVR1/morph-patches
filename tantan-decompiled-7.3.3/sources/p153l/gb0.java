package p153l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public class gb0 implements wc2 {
    @Override // p153l.wc2
    /* JADX INFO: renamed from: a */
    public List<String> mo95770a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // p153l.wc2
    /* JADX INFO: renamed from: b */
    public void mo95771b(Context context, ComponentName componentName, int i) throws ShortcutBadgeException {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i);
        qf3.m176285c(context, intent);
    }
}
