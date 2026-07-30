package p149l;

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

/* JADX INFO: loaded from: classes13.dex */
public class joi0 {

    /* JADX INFO: renamed from: a */
    public final Map<Long, poi0> f118983a;

    /* JADX INFO: renamed from: b */
    public final Map<String, yoi0> f118984b;

    /* JADX INFO: renamed from: c */
    public StackTraceElement[] f118985c;

    /* JADX INFO: renamed from: l.joi0$a */
    public class C17830a implements Comparator<Map.Entry<String, Integer>> {
        public C17830a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry2.getValue().compareTo(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: l.joi0$b */
    public class C17831b implements Comparator<Map.Entry<String, Integer>> {
        public C17831b() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<String, Integer> entry, Map.Entry<String, Integer> entry2) {
            return entry2.getValue().compareTo(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: l.joi0$c */
    public static class C17832c {

        /* JADX INFO: renamed from: a */
        public static final joi0 f118988a = new joi0(null);
    }

    public joi0() {
        this.f118983a = new ConcurrentHashMap();
        this.f118984b = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: b */
    public static joi0 m142513b() {
        return C17832c.f118988a;
    }

    /* JADX INFO: renamed from: a */
    public JSONObject m142514a() {
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
            poi0 poi0VarM142516d = m142513b().m142516d(thread.getId());
            if (poi0VarM142516d != null) {
                if (!TextUtils.isEmpty(poi0VarM142516d.f150517d)) {
                    hashSet2.add(poi0VarM142516d.f150517d);
                }
                poi0VarM142516d.f150521h = thread.getState();
                String strM154580e = mgw.m154580e(poi0VarM142516d.f150516c);
                poi0VarM142516d.f150518e = strM154580e;
                Integer num = (Integer) map.get(strM154580e);
                if (num != null) {
                    numValueOf2 = Integer.valueOf(num.intValue() + 1);
                } else {
                    map3.put(poi0VarM142516d.f150518e, poi0VarM142516d);
                    numValueOf2 = 1;
                }
                map.put(poi0VarM142516d.f150518e, numValueOf2);
            } else {
                map.put(String.valueOf(thread.getId()), 1);
                map3.put(String.valueOf(thread.getId()), new poi0(thread.getId(), thread.toString(), null, "Untrack"));
            }
        }
        ArrayList<Map.Entry> arrayList = new ArrayList(map.entrySet());
        Collections.sort(arrayList, new C17830a());
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            yoi0 yoi0VarM142517e = m142513b().m142517e((String) it.next());
            ArrayList arrayList2 = new ArrayList();
            for (Long l2 : new ArrayList(yoi0VarM142517e.f199299e)) {
                if (hashSet.contains(l2)) {
                    arrayList2.add(l2);
                }
            }
            yoi0VarM142517e.f199299e.clear();
            yoi0VarM142517e.f199299e.addAll(arrayList2);
            String strM154580e2 = mgw.m154580e(yoi0VarM142517e.f199296b);
            yoi0VarM142517e.f199297c = strM154580e2;
            Integer num2 = (Integer) map2.get(strM154580e2);
            if (num2 != null) {
                numValueOf = Integer.valueOf(num2.intValue() + 1);
            } else {
                map4.put(yoi0VarM142517e.f199297c, yoi0VarM142517e);
                numValueOf = 1;
            }
            map2.put(yoi0VarM142517e.f199297c, numValueOf);
        }
        ArrayList<Map.Entry> arrayList3 = new ArrayList(map2.entrySet());
        Collections.sort(arrayList3, new C17831b());
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry entry : arrayList3) {
                yoi0 yoi0Var = (yoi0) map4.get(entry.getKey());
                if (yoi0Var != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    yoi0Var.f199298d = ((Integer) entry.getValue()).intValue();
                    jSONObject2.put("pool_Name", yoi0Var.f199295a);
                    jSONObject2.put("stack_trace", yoi0Var.f199296b);
                    jSONObject2.put("stack_md5", yoi0Var.f199297c);
                    jSONObject2.put("thread_ids", yoi0Var.f199299e);
                    jSONObject2.put("appearedTimes", yoi0Var.f199298d);
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("thread_pool_info", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            boolean z = false;
            for (Map.Entry entry2 : arrayList) {
                poi0 poi0Var = (poi0) map3.get(entry2.getKey());
                if (poi0Var != null) {
                    JSONObject jSONObject3 = new JSONObject();
                    int iIntValue = ((Integer) entry2.getValue()).intValue();
                    poi0Var.f150520g = iIntValue;
                    if (iIntValue >= 10 && !z) {
                        jSONObject.put("most_threadCount_stack", poi0Var.f150516c);
                        jSONObject.put("most_thread_count", poi0Var.f150520g);
                        this.f118985c = poi0Var.f150519f;
                        z = true;
                    }
                    jSONObject3.put("tid", poi0Var.f150514a);
                    jSONObject3.put(AuthenticationTokenClaims.JSON_KEY_NAME, poi0Var.f150515b);
                    jSONObject3.put("state", poi0Var.f150521h);
                    jSONObject3.put("stack_trace", poi0Var.f150516c);
                    jSONObject3.put("appearedTimes", poi0Var.f150520g);
                    jSONObject3.put("stack_md5", poi0Var.f150518e);
                    jSONObject3.put("owned_pool_name", poi0Var.f150517d);
                    jSONArray2.put(jSONObject3);
                }
            }
            jSONObject.put("thread_info", jSONArray2);
            return jSONObject;
        } catch (JSONException e) {
            vx00.m200472b("getAllJavaThread Exception:" + e.getMessage(), new Object[0]);
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: c */
    public StackTraceElement[] m142515c() {
        return this.f118985c;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public poi0 m142516d(long j) {
        return this.f118983a.get(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: e */
    public yoi0 m142517e(String str) {
        return this.f118984b.get(str);
    }

    /* JADX INFO: renamed from: f */
    public void m142518f() {
        Set<Thread> setKeySet = Thread.getAllStackTraces().keySet();
        HashSet hashSet = new HashSet(setKeySet.size());
        Iterator<Thread> it = setKeySet.iterator();
        while (it.hasNext()) {
            hashSet.add(Long.valueOf(it.next().getId()));
        }
        Iterator<Map.Entry<Long, poi0>> it2 = this.f118983a.entrySet().iterator();
        while (it2.hasNext()) {
            if (!hashSet.contains(it2.next().getKey())) {
                it2.remove();
            }
        }
    }

    public /* synthetic */ joi0(C17830a c17830a) {
        this();
    }
}
