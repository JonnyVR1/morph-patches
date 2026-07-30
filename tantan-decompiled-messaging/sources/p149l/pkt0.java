package p149l;

import android.content.SharedPreferences;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class pkt0 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a */
    public boolean f150030a;

    /* JADX INFO: renamed from: b */
    public Set<String> f150031b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f150032c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ rgt0 f150033d;

    public pkt0(rgt0 rgt0Var) {
        this.f150033d = rgt0Var;
        this.f150030a = false;
        this.f150031b = new HashSet();
        this.f150032c = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m170059a(String str, Object obj) {
        if (obj != null) {
            this.f150032c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f150030a = true;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f150030a) {
            this.f150033d.f159288a.clear();
        }
        this.f150033d.f159288a.keySet().removeAll(this.f150031b);
        for (Map.Entry<String, Object> entry : this.f150032c.entrySet()) {
            this.f150033d.f159288a.put(entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f150033d.f159289b) {
            dpj0 dpj0VarMo16129a = Sets.m16127l(this.f150031b, this.f150032c.keySet()).iterator();
            while (dpj0VarMo16129a.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f150033d, (String) dpj0VarMo16129a.next());
            }
        }
        return (!this.f150030a && this.f150031b.isEmpty() && this.f150032c.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        m170059a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        m170059a(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        m170059a(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        m170059a(str, Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        m170059a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        m170059a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f150031b.add(str);
        return this;
    }
}
