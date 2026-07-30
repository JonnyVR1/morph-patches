package p149l;

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
public class esk0 {

    /* JADX INFO: renamed from: d */
    private final Context f93027d;

    /* JADX INFO: renamed from: e */
    private final ygi f93028e;

    /* JADX INFO: renamed from: f */
    private final CleverTapInstanceConfig f93029f;

    /* JADX INFO: renamed from: g */
    private final isk0 f93030g;

    /* JADX INFO: renamed from: a */
    private final Map<String, Object> f93024a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map<String, yrk0<?>> f93025b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    private final Map<String, String> f93026c = new HashMap();

    /* JADX INFO: renamed from: h */
    public Object f93031h = null;

    /* JADX INFO: renamed from: i */
    private Runnable f93032i = null;

    /* JADX INFO: renamed from: j */
    private Map<String, Object> f93033j = new HashMap();

    /* JADX INFO: renamed from: k */
    @NonNull
    private List<Map<String, Object>> f93034k = new ArrayList();

    public esk0(CleverTapInstanceConfig cleverTapInstanceConfig, Context context, ygi ygiVar, isk0 isk0Var) {
        this.f93027d = context;
        this.f93029f = cleverTapInstanceConfig;
        this.f93028e = ygiVar;
        this.f93030g = isk0Var;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Unit m117915a(yrk0 yrk0Var, Map map) {
        yrk0Var.m215846g();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m117916b(esk0 esk0Var, final yrk0 yrk0Var, String str, Boolean bool) {
        esk0Var.getClass();
        if (bool.booleanValue()) {
            yrk0Var.m215846g();
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(str, CtCacheType.FILES));
        esk0Var.f93028e.m214723o(arrayList, new Function1() { // from class: l.dsk0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return esk0.m117915a(yrk0Var, (Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Void m117917c(esk0 esk0Var) {
        esk0Var.m117926s();
        esk0Var.m117925r();
        return null;
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Unit m117918d(Function0 function0, Map map) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Boolean m117919e(esk0 esk0Var, String str) {
        boolean z;
        if (str != null) {
            if (!FileResourceProvider.m6489q(esk0Var.f93027d, esk0Var.f93029f.getLogger()).m6501r(str)) {
                z = false;
            }
            return Boolean.valueOf(z);
        }
        esk0Var.getClass();
        z = true;
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: f */
    private void m117920f(Map<String, Object> map, HashMap<String, yrk0<?>> map2) {
        m117923p("applyVariableDiffs() called with: diffs = [" + map + Constants.AES_SUFFIX);
        if (map != null) {
            this.f93033j = map;
            this.f93031h = aw3.m99231c(this.f93024a, map);
            m117923p("applyVariableDiffs: updated value of merged=[" + this.f93031h + Constants.AES_SUFFIX);
            Iterator<Map.Entry<String, yrk0<?>>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                yrk0<?> yrk0Var = this.f93025b.get(it.next().getKey());
                if (yrk0Var != null) {
                    yrk0Var.m215847i();
                }
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m117921l() {
        try {
            String strM138036b = this.f93030g.m138036b();
            List<Map<String, Object>> listM199282b = vpq.m199282b(strM138036b == null ? new JSONArray() : new JSONArray(strM138036b));
            Objects.requireNonNull(listM199282b);
            this.f93034k = listM199282b;
        } catch (Exception e) {
            m117924q("Could not load variants", e);
        }
    }

    /* JADX INFO: renamed from: m */
    private void m117922m(Function0<Unit> function0) {
        try {
            Map<String, Object> mapM199281a = vpq.m199281a(this.f93030g.m138035a());
            HashMap<String, yrk0<?>> map = new HashMap<>(this.f93025b);
            m117920f(mapM199281a, map);
            m117928v(map, function0);
        } catch (Exception e) {
            m117924q("Could not load variable diffs.\n", e);
        }
    }

    /* JADX INFO: renamed from: p */
    private static void m117923p(String str) {
        Logger.m5866d("variables", str);
    }

    /* JADX INFO: renamed from: q */
    private static void m117924q(String str, Throwable th) {
        Logger.m5867d("variables", str, th);
    }

    @WorkerThread
    /* JADX INFO: renamed from: r */
    private void m117925r() {
        m117923p("saveAbVariables() called");
        String strM199288h = vpq.m199288h(this.f93034k);
        if (strM199288h != null) {
            this.f93030g.m138038d(strM199288h);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    private void m117926s() {
        m117923p("saveDiffs() called");
        String strM199289i = vpq.m199289i(this.f93033j);
        if (strM199289i != null) {
            this.f93030g.m138037c(strM199289i);
        }
    }

    /* JADX INFO: renamed from: t */
    private void m117927t() {
        st3.m185849c(this.f93029f).m190592d().m6946g("VarCache#saveDiffsAsync", new Callable() { // from class: l.bsk0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return esk0.m117917c(this.f77093a);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    private void m117928v(HashMap<String, yrk0<?>> map, final Function0<Unit> function0) {
        if (map.isEmpty()) {
            m117923p("There are no variables registered by the client. Not downloading files & posting global callbacks");
            return;
        }
        StringBuilder sb = new StringBuilder("Skipped these file vars cause urls are not present :\n");
        StringBuilder sb2 = new StringBuilder("Adding these files to download :\n");
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<String, yrk0<?>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            yrk0<?> yrk0Var = this.f93025b.get(key);
            if (yrk0Var != null && yrk0Var.m215844c().equals("file")) {
                String strM215845f = yrk0Var.m215845f();
                if (strM215845f == null) {
                    sb.append(key);
                    sb.append(SignParameters.NEW_LINE);
                } else if (!FileResourceProvider.m6489q(this.f93027d, this.f93029f.getLogger()).m6501r(strM215845f)) {
                    arrayList.add(new Pair(strM215845f, CtCacheType.FILES));
                    sb2.append(key);
                    sb2.append(" : ");
                    sb2.append(strM215845f);
                    sb2.append(SignParameters.NEW_LINE);
                }
            }
        }
        m117923p(sb.toString());
        m117923p(sb2.toString());
        if (arrayList.isEmpty()) {
            function0.invoke();
        } else {
            this.f93028e.m214723o(arrayList, new Function1() { // from class: l.csk0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return esk0.m117918d(function0, (Map) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: w */
    private synchronized void m117929w() {
        Runnable runnable = this.f93032i;
        if (runnable != null) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: g */
    public synchronized void m117930g() {
        try {
            m117923p("Clear user content in VarCache");
            HashMap<String, yrk0<?>> map = new HashMap<>(this.f93025b);
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                yrk0<?> yrk0Var = this.f93025b.get(it.next());
                if (yrk0Var != null) {
                    yrk0Var.m215843b();
                }
            }
            m117920f(new HashMap(), map);
            this.f93034k = new ArrayList();
            m117927t();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public String m117931h(String str) {
        return FileResourceProvider.m6489q(this.f93027d, this.f93029f.getLogger()).m6494g(str);
    }

    /* JADX INFO: renamed from: i */
    public void m117932i(final yrk0<String> yrk0Var) {
        final String strM215845f = yrk0Var.m215845f();
        Task taskM190589a = st3.m185849c(this.f93029f).m190589a();
        taskM190589a.m6945f(new pg50() { // from class: l.zrk0
            @Override // p149l.pg50
            public final void onSuccess(Object obj) {
                esk0.m117916b(this.f204526a, yrk0Var, strM215845f, (Boolean) obj);
            }
        });
        taskM190589a.m6946g("isFileCached", new Callable() { // from class: l.ask0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return esk0.m117919e(this.f71459a, strM215845f);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public synchronized <T> T m117933j(Object[] objArr) {
        Object obj;
        obj = this.f93031h;
        if (obj == null) {
            obj = this.f93024a;
        }
        return (T) m117934k(objArr, obj);
    }

    /* JADX INFO: renamed from: k */
    public synchronized <T> T m117934k(Object[] objArr, Object obj) {
        try {
            for (Object obj2 : objArr) {
                obj = aw3.m99232d(obj, obj2, false);
            }
        } catch (Throwable th) {
            throw th;
        }
        return (T) vpq.m199290j(obj);
    }

    /* JADX INFO: renamed from: n */
    public synchronized void m117935n(Function0<Unit> function0) {
        m117922m(function0);
        m117921l();
    }

    /* JADX INFO: renamed from: o */
    public synchronized void m117936o(Function0<Unit> function0) {
        m117935n(function0);
        m117929w();
    }

    /* JADX INFO: renamed from: u */
    public synchronized void m117937u(Runnable runnable) {
        this.f93032i = runnable;
    }

    /* JADX INFO: renamed from: x */
    public synchronized void m117938x(@NonNull List<Map<String, Object>> list) {
        this.f93034k = list;
    }

    /* JADX INFO: renamed from: y */
    public synchronized void m117939y(Map<String, Object> map, Function0<Unit> function0) {
        HashMap<String, yrk0<?>> map2 = new HashMap<>(this.f93025b);
        m117920f(map, map2);
        m117928v(map2, function0);
        m117927t();
        m117929w();
    }
}
