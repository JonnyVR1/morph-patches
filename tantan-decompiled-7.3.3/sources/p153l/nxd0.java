package p153l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class nxd0 extends azd0<Float> {
    public nxd0(String str, float f) {
        super(str, Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float retrieveValue() {
        return Float.valueOf(Float.parseFloat(pref().getString(this.f111993id, ((Float) this.defaultValue).toString())));
    }

    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(Float f) {
        return pref().edit().putString(this.f111993id, f.toString());
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
}
