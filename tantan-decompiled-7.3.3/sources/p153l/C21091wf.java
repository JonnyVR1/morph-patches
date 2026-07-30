package p153l;

import com.p051p1.mobile.putong.account.data.AccountAssetsSettings;
import com.tantanapp.common.data.JsonAdapter;

/* JADX INFO: renamed from: l.wf */
/* JADX INFO: loaded from: classes9.dex */
public class C21091wf extends jf00<AccountAssetsSettings> {
    @Override // p153l.jf00
    /* JADX INFO: renamed from: i */
    public JsonAdapter<AccountAssetsSettings> mo135323i() {
        return AccountAssetsSettings.JSON_ADAPTER;
    }

    /* JADX INFO: renamed from: m */
    public boolean m206042m(final String str) {
        return ((Boolean) m144644f(new qcj() { // from class: l.vf
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountAssetsSettings) obj).intlOnlyPasswordCountryWhiteList.contains(str));
            }
        }, Boolean.TRUE)).booleanValue();
    }
}
