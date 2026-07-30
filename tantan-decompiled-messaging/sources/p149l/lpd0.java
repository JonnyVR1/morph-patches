package p149l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes13.dex */
public class lpd0 extends yqd0<Float> {
    public lpd0(String str, float f) {
        super(str, Float.valueOf(f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float retrieveValue() {
        return Float.valueOf(Float.parseFloat(pref().getString(this.f98687id, ((Float) this.defaultValue).toString())));
    }

    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(Float f) {
        return pref().edit().putString(this.f98687id, f.toString());
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
}
