package p149l;

import com.p046p1.mobile.putong.account.data.AccountAssetsSettings;
import com.tantanapp.common.data.JsonAdapter;

/* JADX INFO: renamed from: l.bg */
/* JADX INFO: loaded from: classes9.dex */
public class C15852bg extends a700<AccountAssetsSettings> {
    @Override // p149l.a700
    /* JADX INFO: renamed from: i */
    public JsonAdapter<AccountAssetsSettings> mo95179i() {
        return AccountAssetsSettings.JSON_ADAPTER;
    }

    /* JADX INFO: renamed from: m */
    public boolean m101619m(final String str) {
        return ((Boolean) m95176f(new w9j() { // from class: l.ag
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((AccountAssetsSettings) obj).intlOnlyPasswordCountryWhiteList.contains(str));
            }
        }, Boolean.TRUE)).booleanValue();
    }
}
