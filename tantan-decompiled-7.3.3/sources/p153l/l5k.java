package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.live.base.data.BLiveSchema;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;

/* JADX INFO: loaded from: classes9.dex */
public class l5k extends owl {
    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m152956r(Act act, BLiveSchema bLiveSchema) {
        if (mbs.m157849e().signedIn_() && act != null) {
            if (!TextUtils.isEmpty(bLiveSchema.tip)) {
                o1j0.m165651y(bLiveSchema.tip);
            }
            if (TextUtils.isEmpty(bLiveSchema.schema)) {
                return;
            }
            nae0.m162083m(act, Uri.parse(bLiveSchema.schema));
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: e */
    public void mo96234e(final Act act, String str, abe0 abe0Var) {
        super.mo96234e(act, str, abe0Var);
        if (mbs.m157849e().signedIn_()) {
            LiveSquareApi.getLiveSchema("{\"search\":\"" + v5k0.m199898j(abe0Var, "extra") + "\"}").subscribe(dhw.m115826e(new y20() { // from class: l.j5k
                @Override // p153l.y20
                public final void call(Object obj) {
                    l5k.m152956r(act, (BLiveSchema) obj);
                }
            }, new y20() { // from class: l.k5k
                @Override // p153l.y20
                public final void call(Object obj) {
                    fhw.m125605a("[live]dynamic_schema", "error:" + ((Throwable) obj).getMessage());
                }
            }));
        }
    }

    @Override // p153l.mwl
    /* JADX INFO: renamed from: l */
    public boolean mo96235l(String str) {
        return SchemeKey.liveDynamic.equals(str);
    }
}
