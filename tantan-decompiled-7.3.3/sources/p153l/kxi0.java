package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.facebook.AuthenticationTokenClaims;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class kxi0 {

    /* JADX INFO: renamed from: a */
    public final Map<Long, rxi0> f129208a;

    /* JADX INFO: renamed from: b */
    public final Map<String, ayi0> f129209b;

    /* JADX INFO: renamed from: c */
    public StackTraceElement[] f129210c;

    /* JADX INFO: renamed from: l.kxi0$a */
    public class C18290a implements Comparator<Map.Entry<String, Integer>> {
        public C18290a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry2.getValue().compareTo(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: l.kxi0$b */
    public class C18291b implements Comparator<Map.Entry<String, Integer>> {
        public C18291b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry2.getValue().compareTo(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: l.kxi0$c */
    public static class C18292c {

        /* JADX INFO: renamed from: a */
        public static final kxi0 f129213a = new kxi0(null);
    }

    public kxi0() {
        this.f129208a = new ConcurrentHashMap();
        this.f129209b = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: b */
    public static kxi0 m151828b() {
        return C18292c.f129213a;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m151829a() {
        Integer numValueOf;
        Integer numValueOf2;
        JSONObject jSONObject = new JSONObject();
        Set<Thread> setKeySet = Thread.getAllStackTraces().keySet();
        HashSet hashSet = new HashSet(setKeySet.size());
        HashSet hashSet2 = new HashSet();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        for (Thread thread : setKeySet) {
            hashSet.add(Long.valueOf(thread.getId()));
            rxi0 rxi0VarM151831d = m151828b().m151831d(thread.getId());
            if (rxi0VarM151831d != null) {
                if (!TextUtils.isEmpty(rxi0VarM151831d.f165340d)) {
                    hashSet2.add(rxi0VarM151831d.f165340d);
                }
                rxi0VarM151831d.f165344h = thread.getState();
                String strM149980e = kiw.m149980e(rxi0VarM151831d.f165339c);
                rxi0VarM151831d.f165341e = strM149980e;
                Integer num = (Integer) map.get(strM149980e);
                if (num != null) {
                    numValueOf2 = Integer.valueOf(num.intValue() + 1);
                } else {
                    map3.put(rxi0VarM151831d.f165341e, rxi0VarM151831d);
                    numValueOf2 = 1;
                }
                map.put(rxi0VarM151831d.f165341e, numValueOf2);
            } else {
                map.put(String.valueOf(thread.getId()), 1);
                map3.put(String.valueOf(thread.getId()), new rxi0(thread.getId(), thread.toString(), null, "Untrack"));
            }
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new C18290a());
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            ayi0 ayi0VarM151832e = m151828b().m151832e((String) it.next());
            ArrayList arrayList2 = new ArrayList();
            for (Long l2 : new ArrayList(ayi0VarM151832e.f73974e)) {
                if (hashSet.contains(l2)) {
                    arrayList2.add(l2);
                }
            }
            ayi0VarM151832e.f73974e.clear();
            ayi0VarM151832e.f73974e.addAll(arrayList2);
            String strM149980e2 = kiw.m149980e(ayi0VarM151832e.f73971b);
            ayi0VarM151832e.f73972c = strM149980e2;
            Integer num2 = (Integer) map2.get(strM149980e2);
            if (num2 != null) {
                numValueOf = Integer.valueOf(num2.intValue() + 1);
            } else {
                map4.put(ayi0VarM151832e.f73972c, ayi0VarM151832e);
                numValueOf = 1;
            }
            map2.put(ayi0VarM151832e.f73972c, numValueOf);
        }
        ArrayList<Map.Entry> arrayList3 = new ArrayList(map2.entrySet());
        Collections.sort(arrayList3, new C18291b());
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : arrayList3) {
                ayi0 ayi0Var = (ayi0) map4.get(entry.getKey());
                if (ayi0Var != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    ayi0Var.f73973d = ((Integer) entry.getValue()).intValue();
                    jSONObject2.put("pool_Name", ayi0Var.f73970a);
                    jSONObject2.put("stack_trace", ayi0Var.f73971b);
                    jSONObject2.put("stack_md5", ayi0Var.f73972c);
                    jSONObject2.put("thread_ids", ayi0Var.f73974e);
                    jSONObject2.put("appearedTimes", ayi0Var.f73973d);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("thread_pool_info", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            boolean z = false;
            for (Map.Entry entry2 : arrayList) {
                rxi0 rxi0Var = (rxi0) map3.get(entry2.getKey());
                if (rxi0Var != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    int iIntValue = ((Integer) entry2.getValue()).intValue();
                    rxi0Var.f165343g = iIntValue;
                    if (iIntValue >= 10 && !z) {
                        jSONObject.put("most_threadCount_stack", rxi0Var.f165339c);
                        jSONObject.put("most_thread_count", rxi0Var.f165343g);
                        this.f129210c = rxi0Var.f165342f;
                        z = true;
                    }
                    jSONObject3.put("tid", rxi0Var.f165337a);
                    jSONObject3.put(AuthenticationTokenClaims.JSON_KEY_NAME, rxi0Var.f165338b);
                    jSONObject3.put("state", rxi0Var.f165344h);
                    jSONObject3.put("stack_trace", rxi0Var.f165339c);
                    jSONObject3.put("appearedTimes", rxi0Var.f165343g);
                    jSONObject3.put("stack_md5", rxi0Var.f165341e);
                    jSONObject3.put("owned_pool_name", rxi0Var.f165340d);
                    jSONArray2.put(jSONObject3);
                }
            }
            jSONObject.put("thread_info", jSONArray2);
            return jSONObject;
        } catch (JSONException e) {
            f610.m124264b("getAllJavaThread Exception:" + e.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    public StackTraceElement[] m151830c() {
        return this.f129210c;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public rxi0 m151831d(long j) {
        return this.f129208a.get(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: e */
    public ayi0 m151832e(String str) {
        return this.f129209b.get(str);
    }

    /* JADX INFO: renamed from: f */
    public void m151833f() {
        Set<Thread> setKeySet = Thread.getAllStackTraces().keySet();
        HashSet hashSet = new HashSet(setKeySet.size());
        Iterator<Thread> it = setKeySet.iterator();
        while (it.hasNext()) {
            hashSet.add(Long.valueOf(it.next().getId()));
        }
        Iterator<Map.Entry<Long, rxi0>> it2 = this.f129208a.entrySet().iterator();
        while (it2.hasNext()) {
            if (!hashSet.contains(it2.next().getKey())) {
                it2.remove();
            }
        }
    }

    public /* synthetic */ kxi0(C18290a c18290a) {
        this();
    }
}
