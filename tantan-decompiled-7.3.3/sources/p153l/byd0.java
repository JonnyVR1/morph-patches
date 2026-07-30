package p153l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class byd0 extends azd0<Long> {
    public byd0(String str, Long l2, boolean z) {
        super(str, l2, z, hxd0.DEFAULT_FILE_NAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long retrieveValue() {
        return Long.valueOf(pref().getLong(this.f111993id, ((Long) this.defaultValue).longValue()));
    }

    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(Long l2) {
        return pref().edit().putLong(this.f111993id, l2.longValue());
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

    public byd0(String str, Long l2, boolean z, String str2) {
        super(str, l2, z, str2);
    }

    public byd0(String str, Long l2) {
        super(str, l2);
    }
}
