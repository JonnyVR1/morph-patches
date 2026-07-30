package p149l;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes13.dex */
public class zpd0 extends yqd0<Long> {
    public zpd0(String str, Long l2, boolean z) {
        super(str, l2, z, fpd0.DEFAULT_FILE_NAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Long retrieveValue() {
        return Long.valueOf(pref().getLong(this.f98687id, ((Long) this.defaultValue).longValue()));
    }

    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(Long l2) {
        return pref().edit().putLong(this.f98687id, l2.longValue());
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

    public zpd0(String str, Long l2, boolean z, String str2) {
        super(str, l2, z, str2);
    }

    public zpd0(String str, Long l2) {
        super(str, l2);
    }
}
