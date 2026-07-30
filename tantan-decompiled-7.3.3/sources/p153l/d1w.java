package p153l;

import android.content.Context;
import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.tantanapp.android.injecter.exception.HandlerException;
import com.tantanapp.android.injecter.exception.NoRouteFoundException;
import com.tantanapp.android.injecter.facade.Postcard;
import com.tantanapp.android.injecter.facade.enums.RouteType;
import com.tantanapp.android.injecter.facade.model.RouteMeta;
import com.tantanapp.android.injecter.facade.template.ILogger;
import com.tantanapp.android.injecter.facade.template.IProvider;
import com.tantanapp.android.injecter.facade.template.IProviderGroup;
import com.tantanapp.android.injecter.facade.template.IRouteGroup;
import com.tantanapp.android.injecter.facade.template.IRouteRoot;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class d1w {

    /* JADX INFO: renamed from: a */
    public static Context f84731a;

    /* JADX INFO: renamed from: b */
    public static boolean f84732b;

    /* JADX INFO: renamed from: l.d1w$a */
    public static /* synthetic */ class C16420a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f84733a;

        static {
            int[] iArr = new int[RouteType.values().length];
            f84733a = iArr;
            try {
                iArr[RouteType.PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m113647a(Postcard postcard) {
        try {
            if (postcard == null) {
                throw new RuntimeException("Injecter::No postcard!");
            }
            RouteMeta routeMeta = bpp0.f77799b.get(postcard.getPath());
            if (routeMeta == null) {
                Class<? extends IRouteGroup> cls = bpp0.f77798a.get(postcard.getGroup());
                if (cls == null) {
                    throw new NoRouteFoundException("Injecter::There is no route match the path [" + postcard.getPath() + "], in group [" + postcard.getGroup() + Constants.AES_SUFFIX);
                }
                try {
                    if (mum.m160227b()) {
                        mum.f138826c.debug("Injecter::", String.format(Locale.getDefault(), "The group [%s] starts loading, trigger by [%s]", postcard.getGroup(), postcard.getPath()));
                    }
                    cls.getConstructor(null).newInstance(null).loadInto(bpp0.f77799b);
                    bpp0.f77798a.remove(postcard.getGroup());
                    if (mum.m160227b()) {
                        mum.f138826c.debug("Injecter::", String.format(Locale.getDefault(), "The group [%s] has already been loaded, trigger by [%s]", postcard.getGroup(), postcard.getPath()));
                    }
                    m113647a(postcard);
                } catch (Exception e) {
                    throw new HandlerException("Injecter::Fatal exception when loading group meta. [" + e.getMessage() + Constants.AES_SUFFIX, e);
                }
            } else {
                postcard.setDestination(routeMeta.getDestination());
                postcard.setType(routeMeta.getType());
                postcard.setPriority(routeMeta.getPriority());
                postcard.setExtra(routeMeta.getExtra());
                Uri uri = postcard.getUri();
                if (uri != null) {
                    postcard.withString("NTeRQWvye18AkPd6G", uri.toString());
                }
                if (C16420a.f84733a[routeMeta.getType().ordinal()] == 1) {
                    Class<?> destination = routeMeta.getDestination();
                    IProvider iProvider = bpp0.f77800c.get(destination);
                    if (iProvider == null) {
                        try {
                            iProvider = (IProvider) destination.getConstructor(null).newInstance(null);
                            iProvider.init(f84731a);
                            bpp0.f77800c.put(destination, iProvider);
                        } catch (Exception e2) {
                            throw new HandlerException("Init provider failed! " + e2.getMessage(), e2);
                        }
                    }
                    postcard.setProvider(iProvider);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public static synchronized void m113648b(Context context, String str) throws HandlerException {
        ILogger iLogger;
        String str2;
        StringBuilder sb;
        String string;
        ArrayList arrayList = new ArrayList();
        try {
            if (!jsi0.m146843b(str)) {
                try {
                    Class<?> cls = Class.forName("com.tantanapp.android.injecter.routes.Injecter$$Intermediate$$" + str);
                    ArrayList arrayList2 = (ArrayList) cls.getDeclaredField("list").get(cls);
                    mum.f138826c.info("Injecter::", "init with classes: " + arrayList2);
                    arrayList = arrayList2;
                } catch (ClassNotFoundException unused) {
                    mum.f138826c.error("Injecter::", "No intermediate class was found!");
                    iLogger = mum.f138826c;
                    str2 = "Injecter::";
                    string = "init with classes: " + arrayList;
                    iLogger.info(str2, string);
                } catch (IllegalAccessException unused2) {
                    mum.f138826c.error("Injecter::", "Intermediate field is not accessible!");
                    iLogger = mum.f138826c;
                    str2 = "Injecter::";
                    sb = new StringBuilder("init with classes: ");
                    sb.append(arrayList);
                    string = sb.toString();
                    iLogger.info(str2, string);
                } catch (NoSuchFieldException unused3) {
                    mum.f138826c.error("Injecter::", "No intermediate field was found!");
                    iLogger = mum.f138826c;
                    str2 = "Injecter::";
                    sb = new StringBuilder("init with classes: ");
                    sb.append(arrayList);
                    string = sb.toString();
                    iLogger.info(str2, string);
                }
            }
            m113649c(context, arrayList);
        } catch (Throwable th) {
            mum.f138826c.info("Injecter::", "init with classes: " + arrayList);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m113649c(Context context, List<String> list) throws HandlerException {
        Set<String> setM143823a;
        try {
            f84731a = context;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                m113650d(list);
                if (f84732b) {
                    mum.f138826c.info("Injecter::", "Load router map by arouter-auto-register plugin.");
                } else {
                    if (mum.m160227b() || wc60.m205794b(context)) {
                        mum.f138826c.info("Injecter::", "Run with debug mode or new install, rebuild router map.");
                        setM143823a = j85.m143823a(f84731a, "com.tantanapp.android.injecter.routes");
                        if (!setM143823a.isEmpty()) {
                            context.getSharedPreferences("SP_INJECTER_CACHE", 0).edit().putStringSet("INJECTER_MAP", setM143823a).apply();
                        }
                        wc60.m205795c(context);
                    } else {
                        mum.f138826c.info("Injecter::", "Load router map from cache.");
                        setM143823a = new HashSet<>(context.getSharedPreferences("SP_INJECTER_CACHE", 0).getStringSet("INJECTER_MAP", new HashSet()));
                    }
                    mum.f138826c.info("Injecter::", "Find router map finished, map size = " + setM143823a.size() + ", cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms.");
                    jCurrentTimeMillis = System.currentTimeMillis();
                    for (String str : setM143823a) {
                        if (str.startsWith("com.tantanapp.android.injecter.routes.Injecter$$Root")) {
                            ((IRouteRoot) Class.forName(str).getConstructor(null).newInstance(null)).loadInto(bpp0.f77798a);
                        } else if (str.startsWith("com.tantanapp.android.injecter.routes.Injecter$$Providers")) {
                            ((IProviderGroup) Class.forName(str).getConstructor(null).newInstance(null)).loadInto(bpp0.f77801d);
                        }
                    }
                }
                mum.f138826c.info("Injecter::", "Load root element finished, cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms.");
                if (bpp0.f77798a.size() == 0) {
                    mum.f138826c.error("Injecter::", "No mapping files were found, check your configuration please!");
                }
                if (mum.m160227b()) {
                    mum.f138826c.debug("Injecter::", String.format(Locale.getDefault(), "LogisticsCenter has already been loaded, GroupIndex[%d], InterceptorIndex[%d], ProviderIndex[%d]", Integer.valueOf(bpp0.f77798a.size()), 0, Integer.valueOf(bpp0.f77801d.size())));
                }
            } catch (Exception e) {
                throw new HandlerException("Injecter::Injecter init logistics center exception! [" + e.getMessage() + Constants.AES_SUFFIX, e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m113650d(List<String> list) {
        f84732b = false;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                m113652f(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m113651e() {
        if (f84732b) {
            return;
        }
        f84732b = true;
    }

    /* JADX INFO: renamed from: f */
    public static void m113652f(String str) {
        if (jsi0.m146843b(str)) {
            return;
        }
        try {
            Object objNewInstance = Class.forName(str).getConstructor(null).newInstance(null);
            if (objNewInstance instanceof IRouteRoot) {
                m113654h((IRouteRoot) objNewInstance);
                return;
            }
            if (objNewInstance instanceof IProviderGroup) {
                m113653g((IProviderGroup) objNewInstance);
                return;
            }
            mum.f138826c.info("Injecter::", "register failed, class name: " + str + " should implements one of IRouteRoot/IProviderGroup/IInterceptorGroup.");
        } catch (Exception unused) {
            mum.f138826c.error("Injecter::", "register class error:" + str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m113653g(IProviderGroup iProviderGroup) {
        m113651e();
        if (iProviderGroup != null) {
            iProviderGroup.loadInto(bpp0.f77801d);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m113654h(IRouteRoot iRouteRoot) {
        m113651e();
        if (iRouteRoot != null) {
            iRouteRoot.loadInto(bpp0.f77798a);
        }
    }
}
