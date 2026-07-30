package p149l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes13.dex */
public class hpd0 extends yqd0<Boolean> {
    public hpd0(Context context, String str, Boolean bool) {
        super(context, str, bool, true, fpd0.DEFAULT_FILE_NAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Boolean retrieveValue() {
        return Boolean.valueOf(pref().getBoolean(this.f98687id, ((Boolean) this.defaultValue).booleanValue()));
    }

    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(Boolean bool) {
        return pref().edit().putBoolean(this.f98687id, bool.booleanValue());
    }

    @Override // p149l.yqd0, p149l.fpd0
    public /* bridge */ /* synthetic */ boolean clear() {
        return super.clear();
    }

    @Override // p149l.yqd0, p149l.fpd0
    public /* bridge */ /* synthetic */ Object defaultValue() {
        return super.defaultValue();
    }

    @Override // p149l.yqd0, p149l.fpd0
    public /* bridge */ /* synthetic */ boolean put(Object obj) {
        return super.put(obj);
    }

    public hpd0(String str, Boolean bool, boolean z) {
        super(str, bool, z, fpd0.DEFAULT_FILE_NAME);
    }

    public hpd0(String str, Boolean bool) {
        super(str, bool);
    }
}
