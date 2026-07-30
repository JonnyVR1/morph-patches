package p153l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class wyd0 extends azd0<String> {
    public wyd0(Context context, String str, String str2) {
        super(context, str, str2, true, hxd0.DEFAULT_FILE_NAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String retrieveValue() {
        return pref().getString(this.f111993id, (String) this.defaultValue);
    }

    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(String str) {
        return pref().edit().putString(this.f111993id, str);
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

    public wyd0(String str, String str2, boolean z) {
        super(str, str2, z, hxd0.DEFAULT_FILE_NAME);
    }

    public wyd0(String str, String str2, boolean z, String str3) {
        super(str, str2, z, str3);
    }

    public wyd0(String str, String str2) {
        super(str, str2);
    }
}
