package p006l;

import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0158c;
import com.p1.mobile.putong.core.data.TickleEnterInfo;
import com.p1.mobile.putong.core.data.TickleEnterUser;
import com.p1.mobile.putong.data.OMSConfigEnvelope;
import com.p1.mobile.putong.data.OMSConstraint;
import com.p1.mobile.putong.data.OMSCounterInfo;
import com.p1.mobile.putong.data.OMSData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.hpd0;
import l.ic50;
import l.mkd0;
import l.mqi0;
import l.uqd0;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class k9b extends ax6 {

    /* JADX INFO: renamed from: R */
    public hpd0 f15661R;

    /* JADX INFO: renamed from: S */
    public hpd0 f15662S;

    /* JADX INFO: renamed from: T */
    public hpd0 f15663T;

    /* JADX INFO: renamed from: U */
    public uqd0 f15664U;

    /* JADX INFO: renamed from: V */
    public uqd0 f15665V;

    /* JADX INFO: renamed from: W */
    public TickleEnterInfo f15666W;

    public k9b(C0158c c0158c) {
        super(c0158c);
        String str = "tickle_set_history_" + CoreModule.m1850H().userId();
        Boolean bool = Boolean.FALSE;
        this.f15661R = new hpd0(str, bool);
        this.f15662S = new hpd0("tickle_guide_shown_" + CoreModule.m1850H().userId(), bool);
        this.f15663T = new hpd0("tickle_notify_insert_" + CoreModule.m1850H().userId(), bool);
        this.f15664U = new uqd0("tickle_notify_insert_user_id_" + CoreModule.m1850H().userId(), "");
        this.f15665V = new uqd0("tickle_enter_user_info_" + CoreModule.m1850H().userId(), "");
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m17995a3(Throwable th) {
    }

    /* JADX INFO: renamed from: c3 */
    public final void m17997c3() {
        if (this.f15666W == null) {
            this.f15666W = TickleEnterInfo.new_();
            String str = (String) this.f15665V.get();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                this.f15666W = (TickleEnterInfo) TickleEnterInfo.JSON_ADAPTER.parse(str, "");
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final void m18002h3(OMSConfigEnvelope oMSConfigEnvelope) {
        if (vwb.J(oMSConfigEnvelope.data.counters)) {
            return;
        }
        for (OMSCounterInfo oMSCounterInfo : oMSConfigEnvelope.data.counters) {
            if (oMSCounterInfo != null && TextUtils.equals(oMSCounterInfo.id, "p_chat_view_tickle_animation_tip") && NullChecker.a(oMSCounterInfo.constraint) && oMSCounterInfo.constraint.count > 0) {
                this.f15662S.put(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m17999e3(String str) {
        if (((Boolean) this.f15662S.get()).booleanValue() || ((Boolean) this.f15661R.get()).booleanValue()) {
            return false;
        }
        m17997c3();
        return m18001g3(str).times >= 2;
    }

    /* JADX INFO: renamed from: f3 */
    public void m18000f3(String str) {
        if (((Boolean) this.f15662S.get()).booleanValue()) {
            return;
        }
        m17997c3();
        TickleEnterUser tickleEnterUserM18001g3 = m18001g3(str);
        tickleEnterUserM18001g3.times = Math.min(2, tickleEnterUserM18001g3.times + 1);
        this.f15665V.put(this.f15666W.toJson());
    }

    /* JADX INFO: renamed from: g3 */
    public final TickleEnterUser m18001g3(String str) {
        for (TickleEnterUser tickleEnterUser : this.f15666W.enterList) {
            if (TextUtils.equals(tickleEnterUser.userId, str)) {
                return tickleEnterUser;
            }
        }
        TickleEnterUser tickleEnterUserNew_ = TickleEnterUser.new_();
        tickleEnterUserNew_.userId = str;
        tickleEnterUserNew_.times = 0;
        this.f15666W.enterList.add(tickleEnterUserNew_);
        return tickleEnterUserNew_;
    }

    /* JADX INFO: renamed from: i3 */
    public void m18003i3() {
        if (((Boolean) this.f15662S.get()).booleanValue()) {
            return;
        }
        OMSData oMSData = new OMSData();
        ArrayList arrayList = new ArrayList();
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.id = "p_chat_view_tickle_animation_tip";
        oMSData.counters = arrayList;
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.latestMs = mqi0.o();
        oMSConstraint.count = 1L;
        oMSCounterInfo.constraint = oMSConstraint;
        arrayList.add(oMSCounterInfo);
        ic50.j().c().P(oMSData).subscribe(mkd0.H(new e30() { // from class: l.i9b
            public final void call(Object obj) {
                this.f14321a.m18002h3((OMSConfigEnvelope) obj);
            }
        }, new e30() { // from class: l.j9b
            public final void call(Object obj) {
                k9b.m17995a3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j3 */
    public void m18004j3() {
        m18003i3();
        this.f15662S.put(Boolean.TRUE);
    }
}
