package p153l;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes8.dex */
public class k3d0 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC18082a f123710a;

    /* JADX INFO: renamed from: l.k3d0$a */
    public interface InterfaceC18082a {
        /* JADX INFO: renamed from: a */
        String mo115603a(int i);

        /* JADX INFO: renamed from: b */
        int mo115604b(int i);

        /* JADX INFO: renamed from: c */
        Drawable mo115605c(int i);
    }

    /* JADX INFO: renamed from: a */
    public static int m148005a(int i) {
        try {
            return App.f16088e.getResources().getColor(i);
        } catch (Resources.NotFoundException e) {
            CrashHelper.m82479c(e);
            InterfaceC18082a interfaceC18082a = f123710a;
            if (interfaceC18082a != null) {
                return interfaceC18082a.mo115604b(i);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Drawable m148006b(int i) {
        try {
            return App.f16088e.getResources().getDrawable(i);
        } catch (Resources.NotFoundException e) {
            CrashHelper.m82479c(e);
            InterfaceC18082a interfaceC18082a = f123710a;
            if (interfaceC18082a != null) {
                return interfaceC18082a.mo115605c(i);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m148007c(int i) {
        try {
            return App.f16088e.getString(i);
        } catch (Resources.NotFoundException e) {
            CrashHelper.m82479c(e);
            InterfaceC18082a interfaceC18082a = f123710a;
            if (interfaceC18082a != null) {
                return interfaceC18082a.mo115603a(i);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m148008d(InterfaceC18082a interfaceC18082a) {
        f123710a = interfaceC18082a;
    }
}
