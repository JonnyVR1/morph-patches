package p149l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes13.dex */
public class tpd0 extends yqd0<Integer> {
    public tpd0(String str, int i, boolean z) {
        super(str, Integer.valueOf(i), z, fpd0.DEFAULT_FILE_NAME);
    }

    /* JADX INFO: renamed from: a */
    public void m189988a(int i) {
        put(Integer.valueOf(get().intValue() + i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Integer retrieveValue() {
        return Integer.valueOf(pref().getInt(this.f98687id, ((Integer) this.defaultValue).intValue()));
    }

    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(Integer num) {
        return pref().edit().putInt(this.f98687id, num.intValue());
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

    public tpd0(String str, int i, boolean z, String str2) {
        super(str, Integer.valueOf(i), z, str2);
    }

    public tpd0(String str, int i) {
        super(str, Integer.valueOf(i));
    }
}
