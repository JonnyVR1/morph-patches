package p149l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class bwe0 implements SharedPreferences {

    /* JADX INFO: renamed from: a */
    public final boolean f77615a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f77616b;

    public bwe0(@NonNull SharedPreferences sharedPreferences, boolean z) {
        this.f77616b = sharedPreferences;
        this.f77615a = z;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.f77616b.contains(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this.f77616b.edit();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return this.f77616b.getAll();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return this.f77616b.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return this.f77616b.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return this.f77616b.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return this.f77616b.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(String str, @Nullable String str2) {
        String string = this.f77616b.getString(str, str2);
        if (this.f77615a && !TextUtils.isEmpty(string)) {
            int length = string.length();
            if (string.startsWith("\n    ", length - 5)) {
                return string.substring(0, length - 4);
            }
        }
        return string;
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public Set<String> getStringSet(String str, @Nullable Set<String> set) {
        return this.f77616b.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f77616b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f77616b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
