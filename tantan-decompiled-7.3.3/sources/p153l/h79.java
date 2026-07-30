package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.LiveDefaultTabData;
import com.p051p1.mobile.putong.core.data.LiveDefaultTabEnvelope;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes9.dex */
public class h79 extends dy6 {

    /* JADX INFO: renamed from: R */
    public wyd0 f108101R;

    /* JADX INFO: renamed from: S */
    public boolean f108102S;

    public h79(C4883c c4883c) {
        super(c4883c);
        this.f108101R = new wyd0("intl_default_tab" + CoreModule.m30929H().userId(), "");
        this.f108102S = false;
    }

    /* JADX INFO: renamed from: d3 */
    public TabName m133763d3(String str) {
        return "live".equals(str) ? TabName.Live : TabName.Card;
    }

    /* JADX INFO: renamed from: e3 */
    public C22421c<String> m133764e3() {
        return this.f91137Q.scheduled("get_live_default_tab_info", 0, new pcj() { // from class: l.e79
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176656c(new pcj() { // from class: l.g79
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/users/me/user-show-page/status")).m209032f().m209028b();
                    }
                }, LiveDefaultTabEnvelope.JSON_ADAPTER);
            }
        }).map(new qcj() { // from class: l.f79
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f97547a.m133766g3((LiveDefaultTabEnvelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: f3 */
    public boolean m133765f3() {
        if (this.f108102S) {
            return false;
        }
        return TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia);
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ String m133766g3(LiveDefaultTabEnvelope liveDefaultTabEnvelope) {
        LiveDefaultTabData liveDefaultTabData = liveDefaultTabEnvelope.data;
        String str = (liveDefaultTabData.visible && NullChecker.m82486a(liveDefaultTabData.dataInfo) && !TextUtils.isEmpty(liveDefaultTabData.dataInfo.firstTab)) ? liveDefaultTabData.dataInfo.firstTab : "default";
        this.f108101R.put(str);
        return str;
    }

    /* JADX INFO: renamed from: h3 */
    public void m133767h3(String str) {
        if (str == null) {
            return;
        }
        this.f108102S = true;
    }

    /* JADX INFO: renamed from: i3 */
    public void m133768i3() {
        this.f108102S = false;
    }
}
