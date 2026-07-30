package p153l;

import android.content.Context;
import com.tantanapp.android.injecter.core.AutowiredServiceImpl;
import com.tantanapp.android.injecter.exception.HandlerException;
import com.tantanapp.android.injecter.exception.NoRouteFoundException;
import com.tantanapp.android.injecter.facade.Postcard;
import com.tantanapp.android.injecter.facade.template.ILogger;

/* JADX INFO: loaded from: classes11.dex */
public class mum {

    /* JADX INFO: renamed from: a */
    public static volatile mum f138824a = null;

    /* JADX INFO: renamed from: b */
    public static boolean f138825b = false;

    /* JADX INFO: renamed from: c */
    public static ILogger f138826c = null;

    /* JADX INFO: renamed from: d */
    public static boolean f138827d = false;

    /* JADX INFO: renamed from: b */
    public static boolean m160227b() {
        return f138827d;
    }

    /* JADX INFO: renamed from: d */
    public static mum m160228d() {
        if (!f138825b) {
            azk0.m101074a("Injecter::Init::Invoke init(context) first!");
            return null;
        }
        if (f138824a == null) {
            synchronized (mum.class) {
                try {
                    if (f138824a == null) {
                        f138824a = new mum();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f138824a;
    }

    /* JADX INFO: renamed from: e */
    public static synchronized boolean m160229e(Context context, String str) {
        f138826c = new zpd("Injecter::");
        d1w.m113648b(context, str);
        f138825b = true;
        return true;
    }

    /* JADX INFO: renamed from: a */
    public Postcard m160230a(String str) {
        String strM160231c = m160231c(str);
        if (jsi0.m146843b(str) || jsi0.m146843b(strM160231c)) {
            throw new HandlerException("Injecter::Parameter is invalid!");
        }
        return new Postcard(str, strM160231c);
    }

    /* JADX INFO: renamed from: c */
    public final String m160231c(String str) {
        if (jsi0.m146843b(str) || !str.startsWith("/")) {
            throw new HandlerException("Injecter::Extract the default group failed, the path must be start with '/' and contain more than 2 '/'!");
        }
        try {
            String strSubstring = str.substring(1, str.indexOf("/", 1));
            if (jsi0.m146843b(strSubstring)) {
                throw new HandlerException("Injecter::Extract the default group failed! There's nothing between 2 '/'!");
            }
            return strSubstring;
        } catch (Exception e) {
            f138826c.warning("Injecter::", "Failed to extract default group! " + e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: f */
    public <T> T m160232f(Postcard postcard) {
        if (postcard == null) {
            return null;
        }
        try {
            d1w.m113647a(postcard);
            return (T) postcard.getProvider();
        } catch (NoRouteFoundException e) {
            f138826c.warning("Injecter::", e.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m160233g(Object obj) {
        AutowiredServiceImpl autowiredServiceImpl = new AutowiredServiceImpl();
        autowiredServiceImpl.init(null);
        autowiredServiceImpl.autowire(obj);
    }
}
