package p149l;

import android.content.Context;
import com.tantanapp.android.injecter.core.AutowiredServiceImpl;
import com.tantanapp.android.injecter.exception.HandlerException;
import com.tantanapp.android.injecter.exception.NoRouteFoundException;
import com.tantanapp.android.injecter.facade.Postcard;
import com.tantanapp.android.injecter.facade.template.ILogger;

/* JADX INFO: loaded from: classes13.dex */
public class ksm {

    /* JADX INFO: renamed from: a */
    public static volatile ksm f124488a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f124489b = false;

    /* JADX INFO: renamed from: c */
    public static ILogger f124490c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f124491d = false;

    /* JADX INFO: renamed from: b */
    public static boolean m147095b() {
        return f124491d;
    }

    /* JADX INFO: renamed from: d */
    public static ksm m147096d() {
        if (!f124489b) {
            upk0.m194883a("Injecter::Init::Invoke init(context) first!");
            return null;
        }
        if (f124488a == null) {
            synchronized (ksm.class) {
                try {
                    if (f124488a == null) {
                        f124488a = new ksm();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f124488a;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized boolean m147097e(Context context, String str) {
        f124490c = new uod("Injecter::");
        fzv.m123921b(context, str);
        f124489b = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public Postcard m147098a(String str) {
        String strM147099c = m147099c(str);
        if (jji0.m141806b(str) || jji0.m141806b(strM147099c)) {
            throw new HandlerException("Injecter::Parameter is invalid!");
        }
        return new Postcard(str, strM147099c);
    }

    /* JADX INFO: renamed from: c */
    public final String m147099c(String str) {
        if (jji0.m141806b(str) || !str.startsWith("/")) {
            throw new HandlerException("Injecter::Extract the default group failed, the path must be start with '/' and contain more than 2 '/'!");
        }
        try {
            String strSubstring = str.substring(1, str.indexOf("/", 1));
            if (jji0.m141806b(strSubstring)) {
                throw new HandlerException("Injecter::Extract the default group failed! There's nothing between 2 '/'!");
            }
            return strSubstring;
        } catch (Exception e) {
            f124490c.warning("Injecter::", "Failed to extract default group! " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public <T> T m147100f(Postcard postcard) {
        if (postcard == null) {
            return null;
        }
        try {
            fzv.m123920a(postcard);
            return (T) postcard.getProvider();
        } catch (NoRouteFoundException e) {
            f124490c.warning("Injecter::", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m147101g(Object obj) {
        AutowiredServiceImpl autowiredServiceImpl = new AutowiredServiceImpl();
        autowiredServiceImpl.init(null);
        autowiredServiceImpl.autowire(obj);
    }
}
