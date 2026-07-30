package p149l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.ShortcutBadgeException;

/* JADX INFO: loaded from: classes2.dex */
public final class uye0 {

    /* JADX INFO: renamed from: a */
    private static final List<Class<? extends pc2>> f178857a;

    /* JADX INFO: renamed from: b */
    private static final Object f178858b;

    /* JADX INFO: renamed from: c */
    private static pc2 f178859c;

    /* JADX INFO: renamed from: d */
    private static ComponentName f178860d;

    static {
        LinkedList linkedList = new LinkedList();
        f178857a = linkedList;
        f178858b = new Object();
        linkedList.add(kb0.class);
        linkedList.add(ft0.class);
        linkedList.add(hld.class);
        linkedList.add(it20.class);
        linkedList.add(lu40.class);
        linkedList.add(olf0.class);
        linkedList.add(e21.class);
        linkedList.add(tll.class);
        linkedList.add(yz40.class);
        linkedList.add(yod0.class);
        linkedList.add(nhq0.class);
        linkedList.add(tam0.class);
        linkedList.add(zfq0.class);
        linkedList.add(y4f.class);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m196286a(Context context, int i) {
        try {
            m196287b(context, i);
            return true;
        } catch (ShortcutBadgeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m196287b(Context context, int i) throws ShortcutBadgeException {
        if (f178859c == null && !m196289d(context)) {
            throw new ShortcutBadgeException("No default launcher available");
        }
        try {
            f178859c.mo114457b(context, f178860d, i);
        } catch (Exception e) {
            throw new ShortcutBadgeException("Unable to execute badge", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Intent m196288c(@NonNull Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m196289d(Context context) {
        pc2 pc2VarNewInstance;
        Intent intentM196288c = m196288c(context, context.getPackageName());
        if (intentM196288c == null) {
            return false;
        }
        f178860d = intentM196288c.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            Iterator<Class<? extends pc2>> it2 = f178857a.iterator();
            while (it2.hasNext()) {
                try {
                    pc2VarNewInstance = it2.next().newInstance();
                } catch (Exception unused) {
                    pc2VarNewInstance = null;
                }
                if (pc2VarNewInstance != null && pc2VarNewInstance.mo114456a().contains(str)) {
                    f178859c = pc2VarNewInstance;
                    break;
                }
            }
            if (f178859c != null) {
                break;
            }
        }
        if (f178859c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f178859c = new nhq0();
            return true;
        }
        if (bne0.m102783l() || bne0.m102782k()) {
            f178859c = new yz40();
            return true;
        }
        if (!bne0.m102784m()) {
            if (str2.equalsIgnoreCase("ZTE")) {
                f178859c = new zfq0();
                return true;
            }
            f178859c = new hld();
            return true;
        }
        try {
            if (vam0.m197644c()) {
                f178859c = new vam0();
            } else {
                f178859c = new tam0();
            }
            return true;
        } catch (Exception unused2) {
            f178859c = new tam0();
            return true;
        }
    }
}
