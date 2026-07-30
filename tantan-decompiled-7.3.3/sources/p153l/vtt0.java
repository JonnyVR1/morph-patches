package p153l;

import android.content.SharedPreferences;
import com.google.common.collect.Sets;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class vtt0 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a */
    public boolean f185747a;

    /* JADX INFO: renamed from: b */
    public Set<String> f185748b;

    /* JADX INFO: renamed from: c */
    public Map<String, Object> f185749c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ xpt0 f185750d;

    public vtt0(xpt0 xpt0Var) {
        this.f185750d = xpt0Var;
        this.f185747a = false;
        this.f185748b = new HashSet();
        this.f185749c = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m202766a(String str, Object obj) {
        if (obj != null) {
            this.f185749c.put(str, obj);
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
        this.f185747a = true;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f185747a) {
            this.f185750d.f195742a.clear();
        }
        this.f185750d.f195742a.keySet().removeAll(this.f185748b);
        for (Map.Entry<String, Object> entry : this.f185749c.entrySet()) {
            this.f185750d.f195742a.put(entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : this.f185750d.f195743b) {
            gyj0 gyj0VarMo16183a = Sets.m16181l(this.f185748b, this.f185749c.keySet()).iterator();
            while (gyj0VarMo16183a.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(this.f185750d, (String) gyj0VarMo16183a.next());
            }
        }
        return (!this.f185747a && this.f185748b.isEmpty() && this.f185749c.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        m202766a(str, Boolean.valueOf(z));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f) {
        m202766a(str, Float.valueOf(f));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i) {
        m202766a(str, Integer.valueOf(i));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j) {
        m202766a(str, Long.valueOf(j));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        m202766a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set<String> set) {
        m202766a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f185748b.add(str);
        return this;
    }
}
