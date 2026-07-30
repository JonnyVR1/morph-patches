package p153l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class jxd0 extends azd0<Boolean> {
    public jxd0(Context context, String str, Boolean bool) {
        super(context, str, bool, true, hxd0.DEFAULT_FILE_NAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean retrieveValue() {
        return Boolean.valueOf(pref().getBoolean(this.f111993id, ((Boolean) this.defaultValue).booleanValue()));
    }

    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(Boolean bool) {
        return pref().edit().putBoolean(this.f111993id, bool.booleanValue());
    }

    @Override // p153l.azd0, p153l.hxd0
    public /* bridge */ /* synthetic */ boolean clear() {
        return super.clear();
    }

    @Override // p153l.azd0, p153l.hxd0
    public /* bridge */ /* synthetic */ Object defaultValue() {
        return super.defaultValue();
    }

    @Override // p153l.azd0, p153l.hxd0
    public /* bridge */ /* synthetic */ boolean put(Object obj) {
        return super.put(obj);
    }

    public jxd0(String str, Boolean bool, boolean z) {
        super(str, bool, z, hxd0.DEFAULT_FILE_NAME);
    }

    public jxd0(String str, Boolean bool) {
        super(str, bool);
    }
}
