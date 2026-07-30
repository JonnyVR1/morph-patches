package p153l;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class xpt0 implements SharedPreferences {

    /* JADX INFO: renamed from: a */
    public final Map<String, Object> f195742a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Set<SharedPreferences.OnSharedPreferenceChangeListener> f195743b = new HashSet();

    /* JADX INFO: renamed from: a */
    public final <T> T m212682a(String str, T t) {
        T t2 = (T) this.f195742a.get(str);
        return t2 != null ? t2 : t;
    }

    @Override // android.content.SharedPreferences
    public final boolean contains(String str) {
        return this.f195742a.containsKey(str);
    }

    @Override // android.content.SharedPreferences
    public final SharedPreferences.Editor edit() {
        return new vtt0(this);
    }

    @Override // android.content.SharedPreferences
    public final Map<String, ?> getAll() {
        return this.f195742a;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((Boolean) m212682a(str, Boolean.valueOf(z))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return ((Float) m212682a(str, Float.valueOf(f))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return ((Integer) m212682a(str, Integer.valueOf(i))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return ((Long) m212682a(str, Long.valueOf(j))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) m212682a(str, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set<String> getStringSet(String str, Set<String> set) {
        return (Set) m212682a(str, set);
    }

    @Override // android.content.SharedPreferences
    public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f195743b.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f195743b.remove(onSharedPreferenceChangeListener);
    }
}
