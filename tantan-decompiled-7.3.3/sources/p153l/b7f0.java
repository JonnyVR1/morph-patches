package p153l;

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
public final class b7f0 {

    /* JADX INFO: renamed from: a */
    private static final List<Class<? extends wc2>> f75296a;

    /* JADX INFO: renamed from: b */
    private static final Object f75297b;

    /* JADX INFO: renamed from: c */
    private static wc2 f75298c;

    /* JADX INFO: renamed from: d */
    private static ComponentName f75299d;

    static {
        LinkedList linkedList = new LinkedList();
        f75296a = linkedList;
        f75297b = new Object();
        linkedList.add(gb0.class);
        linkedList.add(lt0.class);
        linkedList.add(nmd.class);
        linkedList.add(s130.class);
        linkedList.add(a350.class);
        linkedList.add(xtf0.class);
        linkedList.add(l21.class);
        linkedList.add(fol.class);
        linkedList.add(n850.class);
        linkedList.add(axd0.class);
        linkedList.add(sqq0.class);
        linkedList.add(xjm0.class);
        linkedList.add(epq0.class);
        linkedList.add(c6f.class);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m102838a(Context context, int i) {
        try {
            m102839b(context, i);
            return true;
        } catch (ShortcutBadgeException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m102839b(Context context, int i) throws ShortcutBadgeException {
        if (f75298c == null && !m102841d(context)) {
            throw new ShortcutBadgeException("No default launcher available");
        }
        try {
            f75298c.mo95771b(context, f75299d, i);
        } catch (Exception e) {
            throw new ShortcutBadgeException("Unable to execute badge", e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static Intent m102840c(@NonNull Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private static boolean m102841d(Context context) {
        wc2 wc2VarNewInstance;
        Intent intentM102840c = m102840c(context, context.getPackageName());
        if (intentM102840c == null) {
            return false;
        }
        f75299d = intentM102840c.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            Iterator<Class<? extends wc2>> it2 = f75296a.iterator();
            while (it2.hasNext()) {
                try {
                    wc2VarNewInstance = it2.next().newInstance();
                } catch (Exception unused) {
                    wc2VarNewInstance = null;
                }
                if (wc2VarNewInstance != null && wc2VarNewInstance.mo95770a().contains(str)) {
                    f75298c = wc2VarNewInstance;
                    break;
                }
            }
            if (f75298c != null) {
                break;
            }
        }
        if (f75298c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f75298c = new sqq0();
            return true;
        }
        if (ive0.m142298l() || ive0.m142297k()) {
            f75298c = new n850();
            return true;
        }
        if (!ive0.m142299m()) {
            if (str2.equalsIgnoreCase("ZTE")) {
                f75298c = new epq0();
                return true;
            }
            f75298c = new nmd();
            return true;
        }
        try {
            if (zjm0.m219979c()) {
                f75298c = new zjm0();
            } else {
                f75298c = new xjm0();
            }
            return true;
        } catch (Exception unused2) {
            f75298c = new xjm0();
            return true;
        }
    }
}
