package p149l;

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

/* JADX INFO: loaded from: classes13.dex */
public class fzv {

    /* JADX INFO: renamed from: a */
    public static Context f100001a;

    /* JADX INFO: renamed from: b */
    public static boolean f100002b;

    /* JADX INFO: renamed from: l.fzv$a */
    public static /* synthetic */ class C16966a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f100003a;

        static {
            int[] iArr = new int[RouteType.values().length];
            f100003a = iArr;
            try {
                iArr[RouteType.PROVIDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized void m123920a(Postcard postcard) {
        try {
            if (postcard == null) {
                throw new RuntimeException("Injecter::No postcard!");
            }
            RouteMeta routeMeta = xfp0.f192706b.get(postcard.getPath());
            if (routeMeta == null) {
                Class<? extends IRouteGroup> cls = xfp0.f192705a.get(postcard.getGroup());
                if (cls == null) {
                    throw new NoRouteFoundException("Injecter::There is no route match the path [" + postcard.getPath() + "], in group [" + postcard.getGroup() + Constants.AES_SUFFIX);
                }
                try {
                    if (ksm.m147095b()) {
                        ksm.f124490c.debug("Injecter::", String.format(Locale.getDefault(), "The group [%s] starts loading, trigger by [%s]", postcard.getGroup(), postcard.getPath()));
                    }
                    cls.getConstructor(null).newInstance(null).loadInto(xfp0.f192706b);
                    xfp0.f192705a.remove(postcard.getGroup());
                    if (ksm.m147095b()) {
                        ksm.f124490c.debug("Injecter::", String.format(Locale.getDefault(), "The group [%s] has already been loaded, trigger by [%s]", postcard.getGroup(), postcard.getPath()));
                    }
                    m123920a(postcard);
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
                if (C16966a.f100003a[routeMeta.getType().ordinal()] == 1) {
                    Class<?> destination = routeMeta.getDestination();
                    IProvider iProvider = xfp0.f192707c.get(destination);
                    if (iProvider == null) {
                        try {
                            iProvider = (IProvider) destination.getConstructor(null).newInstance(null);
                            iProvider.init(f100001a);
                            xfp0.f192707c.put(destination, iProvider);
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
    public static synchronized void m123921b(Context context, String str) throws HandlerException {
        ILogger iLogger;
        String str2;
        StringBuilder sb;
        String string;
        ArrayList arrayList = new ArrayList();
        try {
            if (!jji0.m141806b(str)) {
                try {
                    Class<?> cls = Class.forName("com.tantanapp.android.injecter.routes.Injecter$$Intermediate$$" + str);
                    ArrayList arrayList2 = (ArrayList) cls.getDeclaredField("list").get(cls);
                    ksm.f124490c.info("Injecter::", "init with classes: " + arrayList2);
                    arrayList = arrayList2;
                } catch (ClassNotFoundException unused) {
                    ksm.f124490c.error("Injecter::", "No intermediate class was found!");
                    iLogger = ksm.f124490c;
                    str2 = "Injecter::";
                    string = "init with classes: " + arrayList;
                    iLogger.info(str2, string);
                } catch (IllegalAccessException unused2) {
                    ksm.f124490c.error("Injecter::", "Intermediate field is not accessible!");
                    iLogger = ksm.f124490c;
                    str2 = "Injecter::";
                    sb = new StringBuilder("init with classes: ");
                    sb.append(arrayList);
                    string = sb.toString();
                    iLogger.info(str2, string);
                } catch (NoSuchFieldException unused3) {
                    ksm.f124490c.error("Injecter::", "No intermediate field was found!");
                    iLogger = ksm.f124490c;
                    str2 = "Injecter::";
                    sb = new StringBuilder("init with classes: ");
                    sb.append(arrayList);
                    string = sb.toString();
                    iLogger.info(str2, string);
                }
            }
            m123922c(context, arrayList);
        } catch (Throwable th) {
            ksm.f124490c.info("Injecter::", "init with classes: " + arrayList);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static synchronized void m123922c(Context context, List<String> list) throws HandlerException {
        Set<String> setM134739a;
        try {
            f100001a = context;
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                m123923d(list);
                if (f100002b) {
                    ksm.f124490c.info("Injecter::", "Load router map by arouter-auto-register plugin.");
                } else {
                    if (ksm.m147095b() || q460.m172927b(context)) {
                        ksm.f124490c.info("Injecter::", "Run with debug mode or new install, rebuild router map.");
                        setM134739a = i75.m134739a(f100001a, "com.tantanapp.android.injecter.routes");
                        if (!setM134739a.isEmpty()) {
                            context.getSharedPreferences("SP_INJECTER_CACHE", 0).edit().putStringSet("INJECTER_MAP", setM134739a).apply();
                        }
                        q460.m172928c(context);
                    } else {
                        ksm.f124490c.info("Injecter::", "Load router map from cache.");
                        setM134739a = new HashSet<>(context.getSharedPreferences("SP_INJECTER_CACHE", 0).getStringSet("INJECTER_MAP", new HashSet()));
                    }
                    ksm.f124490c.info("Injecter::", "Find router map finished, map size = " + setM134739a.size() + ", cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms.");
                    jCurrentTimeMillis = System.currentTimeMillis();
                    for (String str : setM134739a) {
                        if (str.startsWith("com.tantanapp.android.injecter.routes.Injecter$$Root")) {
                            ((IRouteRoot) Class.forName(str).getConstructor(null).newInstance(null)).loadInto(xfp0.f192705a);
                        } else if (str.startsWith("com.tantanapp.android.injecter.routes.Injecter$$Providers")) {
                            ((IProviderGroup) Class.forName(str).getConstructor(null).newInstance(null)).loadInto(xfp0.f192708d);
                        }
                    }
                }
                ksm.f124490c.info("Injecter::", "Load root element finished, cost " + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms.");
                if (xfp0.f192705a.size() == 0) {
                    ksm.f124490c.error("Injecter::", "No mapping files were found, check your configuration please!");
                }
                if (ksm.m147095b()) {
                    ksm.f124490c.debug("Injecter::", String.format(Locale.getDefault(), "LogisticsCenter has already been loaded, GroupIndex[%d], InterceptorIndex[%d], ProviderIndex[%d]", Integer.valueOf(xfp0.f192705a.size()), 0, Integer.valueOf(xfp0.f192708d.size())));
                }
            } catch (Exception e) {
                throw new HandlerException("Injecter::Injecter init logistics center exception! [" + e.getMessage() + Constants.AES_SUFFIX, e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m123923d(List<String> list) {
        f100002b = false;
        if (list != null) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                m123925f(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m123924e() {
        if (f100002b) {
            return;
        }
        f100002b = true;
    }

    /* JADX INFO: renamed from: f */
    public static void m123925f(String str) {
        if (jji0.m141806b(str)) {
            return;
        }
        try {
            Object objNewInstance = Class.forName(str).getConstructor(null).newInstance(null);
            if (objNewInstance instanceof IRouteRoot) {
                m123927h((IRouteRoot) objNewInstance);
                return;
            }
            if (objNewInstance instanceof IProviderGroup) {
                m123926g((IProviderGroup) objNewInstance);
                return;
            }
            ksm.f124490c.info("Injecter::", "register failed, class name: " + str + " should implements one of IRouteRoot/IProviderGroup/IInterceptorGroup.");
        } catch (Exception unused) {
            ksm.f124490c.error("Injecter::", "register class error:" + str);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m123926g(IProviderGroup iProviderGroup) {
        m123924e();
        if (iProviderGroup != null) {
            iProviderGroup.loadInto(xfp0.f192708d);
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m123927h(IRouteRoot iRouteRoot) {
        m123924e();
        if (iRouteRoot != null) {
            iRouteRoot.loadInto(xfp0.f192705a);
        }
    }
}
