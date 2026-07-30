package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.data.TickleEnterInfo;
import com.p051p1.mobile.putong.core.data.TickleEnterUser;
import com.p051p1.mobile.putong.data.OMSConfigEnvelope;
import com.p051p1.mobile.putong.data.OMSConstraint;
import com.p051p1.mobile.putong.data.OMSCounterInfo;
import com.p051p1.mobile.putong.data.OMSData;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class xab extends dy6 {

    /* JADX INFO: renamed from: R */
    public jxd0 f193004R;

    /* JADX INFO: renamed from: S */
    public jxd0 f193005S;

    /* JADX INFO: renamed from: T */
    public jxd0 f193006T;

    /* JADX INFO: renamed from: U */
    public wyd0 f193007U;

    /* JADX INFO: renamed from: V */
    public wyd0 f193008V;

    /* JADX INFO: renamed from: W */
    public TickleEnterInfo f193009W;

    public xab(C4883c c4883c) {
        super(c4883c);
        String str = "tickle_set_history_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        this.f193004R = new jxd0(str, bool);
        this.f193005S = new jxd0("tickle_guide_shown_" + CoreModule.m30929H().userId(), bool);
        this.f193006T = new jxd0("tickle_notify_insert_" + CoreModule.m30929H().userId(), bool);
        this.f193007U = new wyd0("tickle_notify_insert_user_id_" + CoreModule.m30929H().userId(), "");
        this.f193008V = new wyd0("tickle_enter_user_info_" + CoreModule.m30929H().userId(), "");
    }

    /* JADX INFO: renamed from: a3 */
    public static /* synthetic */ void m209834a3(Throwable th) {
    }

    /* JADX INFO: renamed from: c3 */
    public final void m209836c3() {
        if (this.f193009W == null) {
            this.f193009W = TickleEnterInfo.new_();
            String str = this.f193008V.get();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                this.f193009W = TickleEnterInfo.JSON_ADAPTER.parse(str, "");
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: d3, reason: merged with bridge method [inline-methods] */
    public final void m209841h3(OMSConfigEnvelope oMSConfigEnvelope) {
        if (jyb.m147479J(oMSConfigEnvelope.data.counters)) {
            return;
        }
        for (OMSCounterInfo oMSCounterInfo : oMSConfigEnvelope.data.counters) {
            if (oMSCounterInfo != null && TextUtils.equals(oMSCounterInfo.f39632id, "p_chat_view_tickle_animation_tip") && NullChecker.m82486a(oMSCounterInfo.constraint) && oMSCounterInfo.constraint.count > 0) {
                this.f193005S.put(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: e3 */
    public boolean m209838e3(String str) {
        if (this.f193005S.get().booleanValue() || this.f193004R.get().booleanValue()) {
            return false;
        }
        m209836c3();
        return m209840g3(str).times >= 2;
    }

    /* JADX INFO: renamed from: f3 */
    public void m209839f3(String str) {
        if (this.f193005S.get().booleanValue()) {
            return;
        }
        m209836c3();
        TickleEnterUser tickleEnterUserM209840g3 = m209840g3(str);
        tickleEnterUserM209840g3.times = Math.min(2, tickleEnterUserM209840g3.times + 1);
        this.f193008V.put(this.f193009W.toJson());
    }

    /* JADX INFO: renamed from: g3 */
    public final TickleEnterUser m209840g3(String str) {
        for (TickleEnterUser tickleEnterUser : this.f193009W.enterList) {
            if (TextUtils.equals(tickleEnterUser.userId, str)) {
                return tickleEnterUser;
            }
        }
        TickleEnterUser tickleEnterUserNew_ = TickleEnterUser.new_();
        tickleEnterUserNew_.userId = str;
        tickleEnterUserNew_.times = 0;
        this.f193009W.enterList.add(tickleEnterUserNew_);
        return tickleEnterUserNew_;
    }

    /* JADX INFO: renamed from: i3 */
    public void m209842i3() {
        if (this.f193005S.get().booleanValue()) {
            return;
        }
        OMSData oMSData = new OMSData();
        ArrayList arrayList = new ArrayList();
        OMSCounterInfo oMSCounterInfo = new OMSCounterInfo();
        oMSCounterInfo.f39632id = "p_chat_view_tickle_animation_tip";
        oMSData.counters = arrayList;
        OMSConstraint oMSConstraint = new OMSConstraint();
        oMSConstraint.latestMs = pzi0.m174454o();
        oMSConstraint.count = 1L;
        oMSCounterInfo.constraint = oMSConstraint;
        arrayList.add(oMSCounterInfo);
        pk50.m172568j().m172571c().m116054P(oMSData).subscribe(psd0.m173597H(new y20() { // from class: l.vab
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183077a.m209841h3((OMSConfigEnvelope) obj);
            }
        }, new y20() { // from class: l.wab
            @Override // p153l.y20
            public final void call(Object obj) {
                xab.m209834a3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j3 */
    public void m209843j3() {
        m209842i3();
        this.f193005S.put(Boolean.TRUE);
    }
}
