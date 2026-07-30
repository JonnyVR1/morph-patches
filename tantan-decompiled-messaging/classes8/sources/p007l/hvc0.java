package p007l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.p003p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class hvc0 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC0563a f2858a;

    /* JADX INFO: renamed from: l.hvc0$a */
    public interface InterfaceC0563a {
        /* JADX INFO: renamed from: a */
        String m9355a(int i);

        /* JADX INFO: renamed from: b */
        int m9356b(int i);

        /* JADX INFO: renamed from: c */
        Drawable m9357c(int i);
    }

    /* JADX INFO: renamed from: a */
    public static int m9351a(int i) {
        try {
            return App.f1068e.getResources().getColor(i);
        } catch (Resources.NotFoundException e) {
            CrashHelper.c(e);
            InterfaceC0563a interfaceC0563a = f2858a;
            if (interfaceC0563a != null) {
                return interfaceC0563a.m9356b(i);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m9352b(int i) {
        try {
            return App.f1068e.getResources().getDrawable(i);
        } catch (Resources.NotFoundException e) {
            CrashHelper.c(e);
            InterfaceC0563a interfaceC0563a = f2858a;
            if (interfaceC0563a != null) {
                return interfaceC0563a.m9357c(i);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m9353c(int i) {
        try {
            return App.f1068e.getString(i);
        } catch (Resources.NotFoundException e) {
            CrashHelper.c(e);
            InterfaceC0563a interfaceC0563a = f2858a;
            if (interfaceC0563a != null) {
                return interfaceC0563a.m9355a(i);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m9354d(InterfaceC0563a interfaceC0563a) {
        f2858a = interfaceC0563a;
    }
}
