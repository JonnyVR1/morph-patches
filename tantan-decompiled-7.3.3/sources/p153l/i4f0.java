package p153l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class i4f0 implements SharedPreferences {

    /* JADX INFO: renamed from: a */
    public final boolean f112897a;

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f112898b;

    public i4f0(@NonNull SharedPreferences sharedPreferences, boolean z) {
        this.f112898b = sharedPreferences;
        this.f112897a = z;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return this.f112898b.contains(str);
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return this.f112898b.edit();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        return this.f112898b.getAll();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return this.f112898b.getBoolean(str, z);
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return this.f112898b.getFloat(str, f);
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return this.f112898b.getInt(str, i);
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j) {
        return this.f112898b.getLong(str, j);
    }

    @Override // android.content.SharedPreferences
    @Nullable
    public String getString(String str, @Nullable String str2) {
        String string = this.f112898b.getString(str, str2);
        if (this.f112897a && !TextUtils.isEmpty(string)) {
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
        return this.f112898b.getStringSet(str, set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f112898b.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.f112898b.unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }
}
