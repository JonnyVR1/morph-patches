package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.live.base.data.BLiveSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEndSparkProgress;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceEndSparkRanking;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class qo2 implements iam<ayn0> {

    /* JADX INFO: renamed from: a */
    public ayn0 f158692a;

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m177281a(String str, String str2, List list, LivingUsers livingUsers, jxn0 jxn0Var) {
        if (jxn0Var.m147380m() == 1) {
            jxn0Var.m147385r(str, str2, list, livingUsers);
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f158692a.act();
    }

    /* JADX INFO: renamed from: d */
    public void m177282d(final String str, final String str2, final List<BLiveVoiceEndSparkRanking> list, final LivingUsers<User> livingUsers) {
        jyb.m147537z(this.f158692a.m100908u0(), new y20() { // from class: l.po2
            @Override // p153l.y20
            public final void call(Object obj) {
                qo2.m177281a(str, str2, list, livingUsers, (jxn0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m177283i(Act act, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        act.dialog().m21503F(str).m21557u0(act.getString(R$string.f48271o2)).m21567z0();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m177284j(String str, String str2, nsv<User> nsvVar) {
        if (this.f158692a.m100911z0()) {
            i4g0.m138492A("e_audio_anonymous_follow", "p_anchor_live_end", jyb.m147494Y("anchorId", str2), jyb.m147494Y("liveId", str), jyb.m147494Y("liveFollow_from", "live_audio_end"), jyb.m147494Y("liveStatus", BLiveOperationTitleShowType.off), jyb.m147494Y("receiver_user_id", nsvVar.f143542a.f56859id));
        } else {
            i4g0.m138492A(MatchScData.ModuleId.mid_e_follow, "p_anchor_live_end", jyb.m147494Y("anchorId", str2), jyb.m147494Y("liveId", str), jyb.m147494Y("liveFollow_from", "live_audio_end"), jyb.m147494Y("liveStatus", "endLive"), jyb.m147494Y("receiver_user_id", nsvVar.f143542a.f56859id));
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ayn0 ayn0Var) {
    }

    /* JADX INFO: renamed from: c */
    public void mo118909c() {
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: f */
    public void mo118911f() {
    }

    /* JADX INFO: renamed from: e */
    public void mo118910e(BLiveVoiceRoom bLiveVoiceRoom, User user, BLiveVoice bLiveVoice, BLiveVoiceEndSparkProgress bLiveVoiceEndSparkProgress, List<BLiveVoiceEndSparkRanking> list, BLiveSummary bLiveSummary, LivingUsers<User> livingUsers) {
    }
}
