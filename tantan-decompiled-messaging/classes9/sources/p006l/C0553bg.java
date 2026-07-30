package p006l;

import com.p000p1.mobile.putong.account.data.AccountAssetsSettings;
import com.tantanapp.common.data.JsonAdapter;
import l.w9j;

/* JADX INFO: renamed from: l.bg */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0553bg extends a700<AccountAssetsSettings> {
    @Override // p006l.a700
    /* JADX INFO: renamed from: i */
    public JsonAdapter<AccountAssetsSettings> mo11769i() {
        return AccountAssetsSettings.JSON_ADAPTER;
    }

    /* JADX INFO: renamed from: m */
    public boolean m12622m(final String str) {
        return ((Boolean) m11766f(new w9j() { // from class: l.ag
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountAssetsSettings) obj).intlOnlyPasswordCountryWhiteList.contains(str));
            }
        }, Boolean.TRUE)).booleanValue();
    }
}
