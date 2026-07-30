package p153l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class vxd0 extends azd0<Integer> {
    public vxd0(String str, int i, boolean z) {
        super(str, Integer.valueOf(i), z, hxd0.DEFAULT_FILE_NAME);
    }

    /* JADX INFO: renamed from: a */
    public void m203841a(int i) {
        put(Integer.valueOf(get().intValue() + i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer retrieveValue() {
        return Integer.valueOf(pref().getInt(this.f111993id, ((Integer) this.defaultValue).intValue()));
    }

    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(Integer num) {
        return pref().edit().putInt(this.f111993id, num.intValue());
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

    public vxd0(String str, int i, boolean z, String str2) {
        super(str, Integer.valueOf(i), z, str2);
    }

    public vxd0(String str, int i) {
        super(str, Integer.valueOf(i));
    }
}
