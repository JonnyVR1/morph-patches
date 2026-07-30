package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.LiveDefaultTabData;
import com.p046p1.mobile.putong.core.data.LiveDefaultTabEnvelope;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes9.dex */
public class y59 extends ax6 {

    /* JADX INFO: renamed from: R */
    public uqd0 f196389R;

    /* JADX INFO: renamed from: S */
    public boolean f196390S;

    public y59(C4732c c4732c) {
        super(c4732c);
        this.f196389R = new uqd0("intl_default_tab" + CoreModule.m29931H().userId(), "");
        this.f196390S = false;
    }

    /* JADX INFO: renamed from: d3 */
    public TabName m212959d3(String str) {
        return "live".equals(str) ? TabName.Live : TabName.Card;
    }

    /* JADX INFO: renamed from: e3 */
    public C22306c<String> m212960e3() {
        return this.f72126Q.scheduled("get_live_default_tab_info", 0, new v9j() { // from class: l.v59
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135119c(new v9j() { // from class: l.x59
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/users/me/user-show-page/status")).m185887f().m185883b();
                    }
                }, LiveDefaultTabEnvelope.JSON_ADAPTER);
            }
        }).map(new w9j() { // from class: l.w59
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f184653a.m212962g3((LiveDefaultTabEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public boolean m212961f3() {
        if (this.f196390S) {
            return false;
        }
        return TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ String m212962g3(LiveDefaultTabEnvelope liveDefaultTabEnvelope) {
        LiveDefaultTabData liveDefaultTabData = liveDefaultTabEnvelope.data;
        String str = (liveDefaultTabData.visible && NullChecker.m81303a(liveDefaultTabData.dataInfo) && !TextUtils.isEmpty(liveDefaultTabData.dataInfo.firstTab)) ? liveDefaultTabData.dataInfo.firstTab : "default";
        this.f196389R.put(str);
        return str;
    }

    /* JADX INFO: renamed from: h3 */
    public void m212963h3(String str) {
        if (str == null) {
            return;
        }
        this.f196390S = true;
    }

    /* JADX INFO: renamed from: i3 */
    public void m212964i3() {
        this.f196390S = false;
    }
}
