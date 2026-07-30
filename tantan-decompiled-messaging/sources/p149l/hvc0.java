package p149l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes8.dex */
public class hvc0 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC17411a f109637a;

    /* JADX INFO: renamed from: l.hvc0$a */
    public interface InterfaceC17411a {
        /* JADX INFO: renamed from: a */
        String mo133158a(int i);

        /* JADX INFO: renamed from: b */
        int mo133159b(int i);

        /* JADX INFO: renamed from: c */
        Drawable mo133160c(int i);
    }

    /* JADX INFO: renamed from: a */
    public static int m133154a(int i) {
        try {
            return App.f15369e.getResources().getColor(i);
        } catch (Resources.NotFoundException e) {
            CrashHelper.m81296c(e);
            InterfaceC17411a interfaceC17411a = f109637a;
            if (interfaceC17411a != null) {
                return interfaceC17411a.mo133159b(i);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m133155b(int i) {
        try {
            return App.f15369e.getResources().getDrawable(i);
        } catch (Resources.NotFoundException e) {
            CrashHelper.m81296c(e);
            InterfaceC17411a interfaceC17411a = f109637a;
            if (interfaceC17411a != null) {
                return interfaceC17411a.mo133160c(i);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m133156c(int i) {
        try {
            return App.f15369e.getString(i);
        } catch (Resources.NotFoundException e) {
            CrashHelper.m81296c(e);
            InterfaceC17411a interfaceC17411a = f109637a;
            if (interfaceC17411a != null) {
                return interfaceC17411a.mo133158a(i);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m133157d(InterfaceC17411a interfaceC17411a) {
        f109637a = interfaceC17411a;
    }
}
