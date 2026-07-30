package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes13.dex */
public class ipd0 extends zqd0<Boolean> {
    public ipd0(Context context, String str, Boolean bool) {
        super(context, str, bool, true, fpd0.DEFAULT_FILE_NAME);
    }

    @Override // p149l.zqd0
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo137472h(Boolean bool) {
        return super.mo137472h(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.zqd0, p149l.gpd0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo117618f() {
        boolean z = m127349d().getBoolean(this.f103783a, ((Boolean) this.f103785c).booleanValue());
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean z2 = m127350e().getBoolean(this.f103784b, ((Boolean) this.f103785c).booleanValue());
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        if (m127349d().contains(this.f103783a)) {
            if (!boolValueOf.equals(boolValueOf2)) {
                m127350e().edit().putBoolean(this.f103784b, z).apply();
                return boolValueOf;
            }
        } else if (!boolValueOf.equals(boolValueOf2)) {
            CrashHelper.m81296c(new RuntimeException("MMKV retrieveValue id=" + this.f103783a));
            m127349d().edit().putBoolean(this.f103783a, z2).apply();
            return boolValueOf2;
        }
        return boolValueOf;
    }

    @Override // p149l.zqd0, p149l.gpd0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Pair<SharedPreferences.Editor, SharedPreferences.Editor> mo117619g(Boolean bool) {
        return new Pair<>(m127349d().edit().putBoolean(this.f103783a, bool.booleanValue()), m127350e().edit().putBoolean(this.f103784b, bool.booleanValue()));
    }
}
