package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.bean.LivingUsers;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VRecyclerView;
import p147v.smart_refresh.SmartRefreshLayout;
import p147v.smart_refresh.footer.TTRefreshFooter;
import p147v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes5.dex */
public class erm0 implements s7m<prm0> {

    /* JADX INFO: renamed from: a */
    public final VRecyclerView f92941a;

    /* JADX INFO: renamed from: b */
    public zqm0 f92942b;

    /* JADX INFO: renamed from: c */
    public prm0 f92943c;

    /* JADX INFO: renamed from: d */
    public SmartRefreshLayout f92944d;

    /* JADX INFO: renamed from: l.erm0$a */
    public class C16671a extends RecyclerView.AbstractC0582t {
        public C16671a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && !recyclerView.canScrollVertically(1) && erm0.this.f92943c != null && recyclerView.getAdapter().getItemCount() == ((nnn0) erm0.this.f92943c.m206027E2()).f108764u && ((nnn0) erm0.this.f92943c.m206027E2()).mo149813j().isNormalLive()) {
                lsi0.m151580j(ypv.f199497e.getString(R$string.f47428o7, Integer.valueOf(((nnn0) erm0.this.f92943c.m206027E2()).f108764u)));
            }
        }
    }

    public erm0(Act act) {
        VRecyclerView vRecyclerView = new VRecyclerView(act);
        this.f92941a = vRecyclerView;
        vRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        vRecyclerView.addOnScrollListener(new C16671a());
        SmartRefreshLayout smartRefreshLayout = new SmartRefreshLayout(act);
        this.f92944d = smartRefreshLayout;
        smartRefreshLayout.mo223163S(new TTRefreshHeader(act));
        this.f92944d.mo223161Q(new TTRefreshFooter(act));
        this.f92944d.mo223159O(new df50() { // from class: l.arm0
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                this.f71301a.m117865n(hnc0Var);
            }
        });
        this.f92944d.mo223158M(new me50() { // from class: l.brm0
            @Override // p149l.me50
            /* JADX INFO: renamed from: a */
            public final void mo77835a(hnc0 hnc0Var) {
                this.f76912a.m117866p(hnc0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m117858l(String str) {
        prm0 prm0Var = this.f92943c;
        u4n0.m191752k(prm0Var, ((nnn0) prm0Var.m206027E2()).m132146l0().f56011id, str);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(prm0 prm0Var) {
        this.f92943c = prm0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m117860f() {
        this.f92944d.m223775t();
        this.f92944d.m223770o();
    }

    /* JADX INFO: renamed from: i */
    public View m117861i() {
        xdl0.m208327D0(-1, this.f92941a);
        xdl0.m208325C0(this.f92941a, -1);
        this.f92944d.addView(this.f92941a);
        return this.f92944d;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public void m117862j(Act act) {
        zqm0 zqm0Var = new zqm0(act, new e30() { // from class: l.crm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82261a.m117858l((String) obj);
            }
        }, new e30() { // from class: l.drm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87652a.m117864m((mqv) obj);
            }
        });
        this.f92942b = zqm0Var;
        this.f92941a.setAdapter(zqm0Var);
        this.f92942b.m219860H(new LivingUsers<>(), null, ((nnn0) this.f92943c.m206027E2()).mo149813j().liveMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public boolean m117863k() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        String str = ((nnn0) this.f92943c.m206027E2()).m132146l0().f56011id;
        if (TextUtils.isEmpty(strM199309D0)) {
            return false;
        }
        return strM199309D0.equals(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m117864m(mqv mqvVar) {
        BLiveVoiceCall bLiveVoiceCallM156006i = mqvVar.m156006i();
        if (alk0.m97309h(bLiveVoiceCallM156006i)) {
            u4n0.m191748g(this.f92943c, bLiveVoiceCallM156006i, "voice-manager");
            if (m117863k()) {
                rsm0.m180712t();
                return;
            } else {
                rsm0.m180713u();
                return;
            }
        }
        if (BLiveMember.STATUS_INVITE_CAN_INVITE.equals(((BLiveMember) mqvVar.f135304a).inviteStatus)) {
            if (NullChecker.m81303a(bLiveVoiceCallM156006i)) {
                this.f92943c.m171052g4(bLiveVoiceCallM156006i.user);
            } else {
                User userM156005h = mqvVar.m156005h();
                if (userM156005h == null) {
                    return;
                } else {
                    this.f92943c.m171052g4(userM156005h.f56011id);
                }
            }
            if (m117863k()) {
                rsm0.m180714v();
            } else {
                rsm0.m180715w();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m117865n(hnc0 hnc0Var) {
        this.f92943c.mo130657V3();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m117866p(hnc0 hnc0Var) {
        this.f92943c.mo130656U3();
    }

    /* JADX INFO: renamed from: q */
    public void m117867q(LivingUsers<BLiveMember> livingUsers, gm0 gm0Var, String str) {
        this.f92942b.m219860H(livingUsers, gm0Var, str);
    }

    /* JADX INFO: renamed from: s */
    public void m117868s(String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        this.f92942b.m219861I(str, bLiveVoiceCallInvite);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
