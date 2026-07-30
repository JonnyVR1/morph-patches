package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.LiveDefaultTabData;
import com.p1.mobile.putong.core.data.LiveDefaultTabEnvelope;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import l.uqd0;
import l.v9j;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class y59 extends ax6 {

    /* JADX INFO: renamed from: R */
    public uqd0 f28006R;

    /* JADX INFO: renamed from: S */
    public boolean f28007S;

    public y59(C0158c c0158c) {
        super(c0158c);
        this.f28006R = new uqd0("intl_default_tab" + CoreModule.m1850H().userId(), "");
        this.f28007S = false;
    }

    /* JADX INFO: renamed from: d3 */
    public TabName m28060d3(String str) {
        return "live".equals(str) ? TabName.Live : TabName.Card;
    }

    /* JADX INFO: renamed from: e3 */
    public c<String> m28061e3() {
        return this.f8580Q.scheduled("get_live_default_tab_info", 0, new v9j() { // from class: l.v59
            public final Object call() {
                return ia20.m16569c(new v9j() { // from class: l.x59
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/users/me/user-show-page/status")).f().b();
                    }
                }, LiveDefaultTabEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.w59
            public final Object call(Object obj) {
                return this.f24980a.m28063g3((LiveDefaultTabEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public boolean m28062f3() {
        if (this.f28007S) {
            return false;
        }
        return TEnum.equals(qib0.f19810h0, "indonesia");
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ String m28063g3(LiveDefaultTabEnvelope liveDefaultTabEnvelope) {
        LiveDefaultTabData liveDefaultTabData = liveDefaultTabEnvelope.data;
        String str = (liveDefaultTabData.visible && NullChecker.a(liveDefaultTabData.dataInfo) && !TextUtils.isEmpty(liveDefaultTabData.dataInfo.firstTab)) ? liveDefaultTabData.dataInfo.firstTab : CameraSticker.CATEGORY_DEFAULT_FILTER;
        this.f28006R.put(str);
        return str;
    }

    /* JADX INFO: renamed from: h3 */
    public void m28064h3(String str) {
        if (str == null) {
            return;
        }
        this.f28007S = true;
    }

    /* JADX INFO: renamed from: i3 */
    public void m28065i3() {
        this.f28007S = false;
    }
}
