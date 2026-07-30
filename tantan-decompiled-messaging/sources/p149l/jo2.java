package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.live.base.data.BLiveSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEndSparkProgress;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class jo2 implements s7m<won0> {

    /* JADX INFO: renamed from: a */
    public won0 f118914a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m142409a(String str, String str2, List list, LivingUsers livingUsers, fon0 fon0Var) {
        if (fon0Var.m122472m() == 1) {
            fon0Var.m122477r(str, str2, list, livingUsers);
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f118914a.act();
    }

    /* JADX INFO: renamed from: d */
    public void m142410d(final String str, final String str2, final List<BLiveVoiceEndSparkRanking> list, final LivingUsers<User> livingUsers) {
        vwb.m200354z(this.f118914a.m204850u0(), new e30() { // from class: l.io2
            @Override // p149l.e30
            public final void call(Object obj) {
                jo2.m142409a(str, str2, list, livingUsers, (fon0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m142411i(Act act, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        act.dialog().m20504F(str).m20558u0(act.getString(R$string.f47423o2)).m20568z0();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m142412j(String str, String str2, mqv<User> mqvVar) {
        if (this.f118914a.m204853z0()) {
            zvf0.m220368A("e_audio_anonymous_follow", "p_anchor_live_end", vwb.m200311Y("anchorId", str2), vwb.m200311Y("liveId", str), vwb.m200311Y("liveFollow_from", "live_audio_end"), vwb.m200311Y("liveStatus", BLiveOperationTitleShowType.off), vwb.m200311Y("receiver_user_id", mqvVar.f135304a.f56011id));
        } else {
            zvf0.m220368A(MatchScData.ModuleId.mid_e_follow, "p_anchor_live_end", vwb.m200311Y("anchorId", str2), vwb.m200311Y("liveId", str), vwb.m200311Y("liveFollow_from", "live_audio_end"), vwb.m200311Y("liveStatus", "endLive"), vwb.m200311Y("receiver_user_id", mqvVar.f135304a.f56011id));
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(won0 won0Var) {
    }

    /* JADX INFO: renamed from: c */
    public void mo98542c() {
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void mo98544f() {
    }

    /* JADX INFO: renamed from: e */
    public void mo98543e(BLiveVoiceRoom bLiveVoiceRoom, User user, BLiveVoice bLiveVoice, BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress, List<BLiveVoiceEndSparkRanking> list, BLiveSummary bLiveSummary, LivingUsers<User> livingUsers) {
    }
}
