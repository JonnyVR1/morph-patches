package p153l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class mxd0 extends azd0<Double> {
    public mxd0(String str, double d, boolean z) {
        super(str, Double.valueOf(d), z, hxd0.DEFAULT_FILE_NAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double retrieveValue() {
        return Double.valueOf(Double.parseDouble(pref().getString(this.f111993id, ((Double) this.defaultValue).toString())));
    }

    @Override // p153l.azd0, p153l.hxd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(Double d) {
        return pref().edit().putString(this.f111993id, d.toString());
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

    public mxd0(String str, double d) {
        super(str, Double.valueOf(d));
    }
}
