package p153l;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.task.Task;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes.dex */
public class k1l0 {

    /* JADX INFO: renamed from: d */
    private final Context f123509d;

    /* JADX INFO: renamed from: e */
    private final vji f123510e;

    /* JADX INFO: renamed from: f */
    private final CleverTapInstanceConfig f123511f;

    /* JADX INFO: renamed from: g */
    private final o1l0 f123512g;

    /* JADX INFO: renamed from: a */
    private final Map<String, Object> f123506a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map<String, e1l0<?>> f123507b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f123508c = new HashMap();

    /* JADX INFO: renamed from: h */
    public Object f123513h = null;

    /* JADX INFO: renamed from: i */
    private Runnable f123514i = null;

    /* JADX INFO: renamed from: j */
    private Map<String, Object> f123515j = new HashMap();

    /* JADX INFO: renamed from: k */
    @NonNull
    private List<Map<String, Object>> f123516k = new ArrayList();

    public k1l0(CleverTapInstanceConfig cleverTapInstanceConfig, Context context, vji vjiVar, o1l0 o1l0Var) {
        this.f123509d = context;
        this.f123511f = cleverTapInstanceConfig;
        this.f123510e = vjiVar;
        this.f123512g = o1l0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m147867a(e1l0 e1l0Var, Map map) {
        e1l0Var.m118991g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m147868b(k1l0 k1l0Var, final e1l0 e1l0Var, String str, Boolean bool) {
        k1l0Var.getClass();
        if (bool.booleanValue()) {
            e1l0Var.m118991g();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(str, CtCacheType.FILES));
        k1l0Var.f123510e.m201520o(arrayList, new Function1() { // from class: l.j1l0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k1l0.m147867a(e1l0Var, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Void m147869c(k1l0 k1l0Var) {
        k1l0Var.m147878s();
        k1l0Var.m147877r();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Unit m147870d(Function0 function0, Map map) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m147871e(k1l0 k1l0Var, String str) {
        boolean z;
        if (str != null) {
            if (!FileResourceProvider.m6543q(k1l0Var.f123509d, k1l0Var.f123511f.getLogger()).m6555r(str)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        k1l0Var.getClass();
        z = true;
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: f */
    private void m147872f(Map<String, Object> map, HashMap<String, e1l0<?>> map2) {
        m147875p("applyVariableDiffs() called with: diffs = [" + map + Constants.AES_SUFFIX);
        if (map != null) {
            this.f123515j = map;
            this.f123513h = zw3.m221853c(this.f123506a, map);
            m147875p("applyVariableDiffs: updated value of merged=[" + this.f123513h + Constants.AES_SUFFIX);
            Iterator<Map.Entry<String, e1l0<?>>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                e1l0<?> e1l0Var = this.f123507b.get(it.next().getKey());
                if (e1l0Var != null) {
                    e1l0Var.m118992i();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m147873l() {
        try {
            String strM165654b = this.f123512g.m165654b();
            List<Map<String, Object>> listM207615b = wrq.m207615b(strM165654b == null ? new JSONArray() : new JSONArray(strM165654b));
            Objects.requireNonNull(listM207615b);
            this.f123516k = listM207615b;
        } catch (Exception e) {
            m147876q("Could not load variants", e);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m147874m(Function0<Unit> function0) {
        try {
            Map<String, Object> mapM207614a = wrq.m207614a(this.f123512g.m165653a());
            HashMap<String, e1l0<?>> map = new HashMap<>(this.f123507b);
            m147872f(mapM207614a, map);
            m147880v(map, function0);
        } catch (Exception e) {
            m147876q("Could not load variable diffs.\n", e);
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m147875p(String str) {
        Logger.m5920d("variables", str);
    }

    /* JADX INFO: renamed from: q */
    private static void m147876q(String str, Throwable th) {
        Logger.m5921d("variables", str, th);
    }

    @WorkerThread
    /* JADX INFO: renamed from: r */
    private void m147877r() {
        m147875p("saveAbVariables() called");
        String strM207621h = wrq.m207621h(this.f123516k);
        if (strM207621h != null) {
            this.f123512g.m165656d(strM207621h);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    private void m147878s() {
        m147875p("saveDiffs() called");
        String strM207622i = wrq.m207622i(this.f123515j);
        if (strM207622i != null) {
            this.f123512g.m165655c(strM207622i);
        }
    }

    /* JADX INFO: renamed from: t */
    private void m147879t() {
        ru3.m183186c(this.f123511f).m187990d().m7000g("VarCache#saveDiffsAsync", new Callable() { // from class: l.h1l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k1l0.m147869c(this.f107469a);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    private void m147880v(HashMap<String, e1l0<?>> map, final Function0<Unit> function0) {
        if (map.isEmpty()) {
            m147875p("There are no variables registered by the client. Not downloading files & posting global callbacks");
            return;
        }
        StringBuilder sb = new StringBuilder("Skipped these file vars cause urls are not present :\n");
        StringBuilder sb2 = new StringBuilder("Adding these files to download :\n");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, e1l0<?>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            e1l0<?> e1l0Var = this.f123507b.get(key);
            if (e1l0Var != null && e1l0Var.m118989c().equals("file")) {
                String strM118990f = e1l0Var.m118990f();
                if (strM118990f == null) {
                    sb.append(key);
                    sb.append(SignParameters.NEW_LINE);
                } else if (!FileResourceProvider.m6543q(this.f123509d, this.f123511f.getLogger()).m6555r(strM118990f)) {
                    arrayList.add(new Pair(strM118990f, CtCacheType.FILES));
                    sb2.append(key);
                    sb2.append(" : ");
                    sb2.append(strM118990f);
                    sb2.append(SignParameters.NEW_LINE);
                }
            }
        }
        m147875p(sb.toString());
        m147875p(sb2.toString());
        if (arrayList.isEmpty()) {
            function0.invoke();
        } else {
            this.f123510e.m201520o(arrayList, new Function1() { // from class: l.i1l0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return k1l0.m147870d(function0, (Map) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    private synchronized void m147881w() {
        Runnable runnable = this.f123514i;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m147882g() {
        try {
            m147875p("Clear user content in VarCache");
            HashMap<String, e1l0<?>> map = new HashMap<>(this.f123507b);
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                e1l0<?> e1l0Var = this.f123507b.get(it.next());
                if (e1l0Var != null) {
                    e1l0Var.m118988b();
                }
            }
            m147872f(new HashMap(), map);
            this.f123516k = new ArrayList();
            m147879t();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public String m147883h(String str) {
        return FileResourceProvider.m6543q(this.f123509d, this.f123511f.getLogger()).m6548g(str);
    }

    /* JADX INFO: renamed from: i */
    public void m147884i(final e1l0<String> e1l0Var) {
        final String strM118990f = e1l0Var.m118990f();
        Task taskM187987a = ru3.m183186c(this.f123511f).m187987a();
        taskM187987a.m6999f(new vo50() { // from class: l.f1l0
            @Override // p153l.vo50
            public final void onSuccess(Object obj) {
                k1l0.m147868b(this.f96804a, e1l0Var, strM118990f, (Boolean) obj);
            }
        });
        taskM187987a.m7000g("isFileCached", new Callable() { // from class: l.g1l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k1l0.m147871e(this.f101765a, strM118990f);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public synchronized <T> T m147885j(Object[] objArr) {
        Object obj;
        obj = this.f123513h;
        if (obj == null) {
            obj = this.f123506a;
        }
        return (T) m147886k(objArr, obj);
    }

    /* JADX INFO: renamed from: k */
    public synchronized <T> T m147886k(Object[] objArr, Object obj) {
        try {
            for (Object obj2 : objArr) {
                obj = zw3.m221854d(obj, obj2, false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T) wrq.m207623j(obj);
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m147887n(Function0<Unit> function0) {
        m147874m(function0);
        m147873l();
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m147888o(Function0<Unit> function0) {
        m147887n(function0);
        m147881w();
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m147889u(Runnable runnable) {
        this.f123514i = runnable;
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m147890x(@NonNull List<Map<String, Object>> list) {
        this.f123516k = list;
    }

    /* JADX INFO: renamed from: y */
    public synchronized void m147891y(Map<String, Object> map, Function0<Unit> function0) {
        HashMap<String, e1l0<?>> map2 = new HashMap<>(this.f123507b);
        m147872f(map, map2);
        m147880v(map2, function0);
        m147879t();
        m147881w();
    }
}
