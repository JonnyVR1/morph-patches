package p153l;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Pair;
import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes11.dex */
public class kxd0 extends bzd0<Boolean> {
    public kxd0(Context context, String str, Boolean bool) {
        super(context, str, bool, true, hxd0.DEFAULT_FILE_NAME);
    }

    @Override // p153l.bzd0
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ boolean mo107146h(Boolean bool) {
        return super.mo107146h(bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.bzd0, p153l.ixd0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Boolean mo107144f() {
        boolean z = m142511d().getBoolean(this.f117382a, ((Boolean) this.f117384c).booleanValue());
        Boolean boolValueOf = Boolean.valueOf(z);
        boolean z2 = m142512e().getBoolean(this.f117383b, ((Boolean) this.f117384c).booleanValue());
        Boolean boolValueOf2 = Boolean.valueOf(z2);
        if (m142511d().contains(this.f117382a)) {
            if (!boolValueOf.equals(boolValueOf2)) {
                m142512e().edit().putBoolean(this.f117383b, z).apply();
                return boolValueOf;
            }
        } else if (!boolValueOf.equals(boolValueOf2)) {
            CrashHelper.m82479c(new RuntimeException("MMKV retrieveValue id=" + this.f117382a));
            m142511d().edit().putBoolean(this.f117382a, z2).apply();
            return boolValueOf2;
        }
        return boolValueOf;
    }

    @Override // p153l.bzd0, p153l.ixd0
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Pair<SharedPreferences.Editor, SharedPreferences.Editor> mo107145g(Boolean bool) {
        return new Pair<>(m142511d().edit().putBoolean(this.f117382a, bool.booleanValue()), m142512e().edit().putBoolean(this.f117383b, bool.booleanValue()));
    }
}
