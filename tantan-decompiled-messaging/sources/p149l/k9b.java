package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.data.TickleEnterInfo;
import com.p046p1.mobile.putong.core.data.TickleEnterUser;
import com.p046p1.mobile.putong.data.OMSConfigEnvelope;
import com.p046p1.mobile.putong.data.OMSConstraint;
import com.p046p1.mobile.putong.data.OMSCounterInfo;
import com.p046p1.mobile.putong.data.OMSData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class k9b extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f121926R;

    /* JADX INFO: renamed from: S */
    public hpd0 f121927S;

    /* JADX INFO: renamed from: T */
    public hpd0 f121928T;

    /* JADX INFO: renamed from: U */
    public uqd0 f121929U;

    /* JADX INFO: renamed from: V */
    public uqd0 f121930V;

    /* JADX INFO: renamed from: W */
    public TickleEnterInfo f121931W;

    public k9b(C4732c c4732c) {
        super(c4732c);
        String str = "tickle_set_history_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        this.f121926R = new hpd0(str, bool);
        this.f121927S = new hpd0("tickle_guide_shown_" + CoreModule.m29931H().userId(), bool);
        this.f121928T = new hpd0("tickle_notify_insert_" + CoreModule.m29931H().userId(), bool);
        this.f121929U = new uqd0("tickle_notify_insert_user_id_" + CoreModule.m29931H().userId(), "");
        this.f121930V = new uqd0("tickle_enter_user_info_" + CoreModule.m29931H().userId(), "");
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m145031a3(Throwable th) {
    }

    /* JADX INFO: renamed from: c3 */
    public final void m145033c3() {
        if (this.f121931W == null) {
            this.f121931W = TickleEnterInfo.new_();
            String str = this.f121930V.get();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                this.f121931W = TickleEnterInfo.JSON_ADAPTER.parse(str, "");
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final void m145038h3(OMSConfigEnvelope oMSConfigEnvelope) {
        if (vwb.m200296J(oMSConfigEnvelope.data.counters)) {
            return;
        }
        for (OMSCounterInfo oMSCounterInfo : oMSConfigEnvelope.data.counters) {
            if (oMSCounterInfo != null && TextUtils.equals(oMSCounterInfo.f38784id, "p_chat_view_tickle_animation_tip") && NullChecker.m81303a(oMSCounterInfo.constraint) && oMSCounterInfo.constraint.count > 0) {
                this.f121927S.put(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m145035e3(String str) {
        if (this.f121927S.get().booleanValue() || this.f121926R.get().booleanValue()) {
            return false;
        }
        m145033c3();
        return m145037g3(str).times >= 2;
    }

    /* JADX INFO: renamed from: f3 */
    public void m145036f3(String str) {
        if (this.f121927S.get().booleanValue()) {
            return;
        }
        m145033c3();
        TickleEnterUser tickleEnterUserM145037g3 = m145037g3(str);
        tickleEnterUserM145037g3.times = Math.min(2, tickleEnterUserM145037g3.times + 1);
        this.f121930V.put(this.f121931W.toJson());
    }

    /* JADX INFO: renamed from: g3 */
    public final TickleEnterUser m145037g3(String str) {
        for (TickleEnterUser tickleEnterUser : this.f121931W.enterList) {
            if (TextUtils.equals(tickleEnterUser.userId, str)) {
                return tickleEnterUser;
            }
        }
        TickleEnterUser tickleEnterUserNew_ = TickleEnterUser.new_();
        tickleEnterUserNew_.userId = str;
        tickleEnterUserNew_.times = 0;
        this.f121931W.enterList.add(tickleEnterUserNew_);
        return tickleEnterUserNew_;
    }

    /* JADX INFO: renamed from: i3 */
    public void m145039i3() {
        if (this.f121927S.get().booleanValue()) {
            return;
        }
        OMSData oMSData = new OMSData();
        ArrayList arrayList = new ArrayList();
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.f38784id = "p_chat_view_tickle_animation_tip";
        oMSData.counters = arrayList;
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.latestMs = mqi0.m155944o();
        oMSConstraint.count = 1L;
        oMSCounterInfo.constraint = oMSConstraint;
        arrayList.add(oMSCounterInfo);
        ic50.m135327j().m135330c().m202374P(oMSData).subscribe(mkd0.m154956H(new e30() { // from class: l.i9b
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112131a.m145038h3((OMSConfigEnvelope) obj);
            }
        }, new e30() { // from class: l.j9b
            @Override // p149l.e30
            public final void call(Object obj) {
                k9b.m145031a3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j3 */
    public void m145040j3() {
        m145039i3();
        this.f121927S.put(Boolean.TRUE);
    }
}
