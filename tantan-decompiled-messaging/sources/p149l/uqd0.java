package p149l;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes13.dex */
public class uqd0 extends yqd0<String> {
    public uqd0(Context context, String str, String str2) {
        super(context, str, str2, true, fpd0.DEFAULT_FILE_NAME);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String retrieveValue() {
        return pref().getString(this.f98687id, (String) this.defaultValue);
    }

    @Override // p149l.yqd0, p149l.fpd0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences.Editor saveValue(String str) {
        return pref().edit().putString(this.f98687id, str);
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

    public uqd0(String str, String str2, boolean z) {
        super(str, str2, z, fpd0.DEFAULT_FILE_NAME);
    }

    public uqd0(String str, String str2, boolean z, String str3) {
        super(str, str2, z, str3);
    }

    public uqd0(String str, String str2) {
        super(str, str2);
    }
}
