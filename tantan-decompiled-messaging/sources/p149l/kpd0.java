package p149l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes13.dex */
public class kpd0 extends yqd0<Double> {
    public kpd0(String str, double d, boolean z) {
        super(str, Double.valueOf(d), z, fpd0.DEFAULT_FILE_NAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Double retrieveValue() {
        return Double.valueOf(Double.parseDouble(pref().getString(this.f98687id, ((Double) this.defaultValue).toString())));
    }

    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(Double d) {
        return pref().edit().putString(this.f98687id, d.toString());
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

    public kpd0(String str, double d) {
        super(str, Double.valueOf(d));
    }
}
