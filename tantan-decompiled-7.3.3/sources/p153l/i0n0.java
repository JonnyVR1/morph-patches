package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.bean.LivingUsers;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VRecyclerView;
import p151v.smart_refresh.SmartRefreshLayout;
import p151v.smart_refresh.footer.TTRefreshFooter;
import p151v.smart_refresh.header.TTRefreshHeader;

/* JADX INFO: loaded from: classes5.dex */
public class i0n0 implements iam<t0n0> {

    /* JADX INFO: renamed from: a */
    public final VRecyclerView f112423a;

    /* JADX INFO: renamed from: b */
    public d0n0 f112424b;

    /* JADX INFO: renamed from: c */
    public t0n0 f112425c;

    /* JADX INFO: renamed from: d */
    public SmartRefreshLayout f112426d;

    /* JADX INFO: renamed from: l.i0n0$a */
    public class C17613a extends RecyclerView.AbstractC0584t {
        public C17613a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0 && !recyclerView.canScrollVertically(1) && i0n0.this.f112425c != null && recyclerView.getAdapter().getItemCount() == ((rwn0) i0n0.this.f112425c.m213810E2()).f148277u && ((rwn0) i0n0.this.f112425c.m213810E2()).mo183435j().isNormalLive()) {
                o1j0.m165636j(zrv.f205803e.getString(R$string.f48276o7, Integer.valueOf(((rwn0) i0n0.this.f112425c.m213810E2()).f148277u)));
            }
        }
    }

    public i0n0(Act act) {
        VRecyclerView vRecyclerView = new VRecyclerView(act);
        this.f112423a = vRecyclerView;
        vRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        vRecyclerView.addOnScrollListener(new C17613a());
        SmartRefreshLayout smartRefreshLayout = new SmartRefreshLayout(act);
        this.f112426d = smartRefreshLayout;
        smartRefreshLayout.mo224409S(new TTRefreshHeader(act));
        this.f112426d.mo224407Q(new TTRefreshFooter(act));
        this.f112426d.mo224405O(new jn50() { // from class: l.e0n0
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                this.f91509a.m138031n(mvc0Var);
            }
        });
        this.f112426d.mo224404M(new tm50() { // from class: l.f0n0
            @Override // p153l.tm50
            /* JADX INFO: renamed from: a */
            public final void mo79018a(mvc0 mvc0Var) {
                this.f96700a.m138032p(mvc0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m138024l(String str) {
        t0n0 t0n0Var = this.f112425c;
        ydn0.m215258k(t0n0Var, ((rwn0) t0n0Var.m213810E2()).m168532l0().f56859id, str);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(t0n0 t0n0Var) {
        this.f112425c = t0n0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m138026f() {
        this.f112426d.m225021t();
        this.f112426d.m225016o();
    }

    /* JADX INFO: renamed from: i */
    public View m138027i() {
        bnl0.m105507D0(-1, this.f112423a);
        bnl0.m105505C0(this.f112423a, -1);
        this.f112426d.addView(this.f112423a);
        return this.f112426d;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public void m138028j(Act act) {
        d0n0 d0n0Var = new d0n0(act, new y20() { // from class: l.g0n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101663a.m138024l((String) obj);
            }
        }, new y20() { // from class: l.h0n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107314a.m138030m((nsv) obj);
            }
        });
        this.f112424b = d0n0Var;
        this.f112423a.setAdapter(d0n0Var);
        this.f112424b.m113417H(new LivingUsers<>(), null, ((rwn0) this.f112425c.m213810E2()).mo183435j().liveMode);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public boolean m138029k() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        String str = ((rwn0) this.f112425c.m213810E2()).m168532l0().f56859id;
        if (TextUtils.isEmpty(strM207631D0)) {
            return false;
        }
        return strM207631D0.equals(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m138030m(nsv nsvVar) {
        BLiveVoiceCall bLiveVoiceCallM164644i = nsvVar.m164644i();
        if (guk0.m132329h(bLiveVoiceCallM164644i)) {
            ydn0.m215254g(this.f112425c, bLiveVoiceCallM164644i, "voice-manager");
            if (m138029k()) {
                v1n0.m199042t();
                return;
            } else {
                v1n0.m199043u();
                return;
            }
        }
        if (BLiveMember.STATUS_INVITE_CAN_INVITE.equals(((BLiveMember) nsvVar.f143542a).inviteStatus)) {
            if (NullChecker.m82486a(bLiveVoiceCallM164644i)) {
                this.f112425c.m188817g4(bLiveVoiceCallM164644i.user);
            } else {
                User userM164643h = nsvVar.m164643h();
                if (userM164643h == null) {
                    return;
                } else {
                    this.f112425c.m188817g4(userM164643h.f56859id);
                }
            }
            if (m138029k()) {
                v1n0.m199044v();
            } else {
                v1n0.m199045w();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m138031n(mvc0 mvc0Var) {
        this.f112425c.mo154987V3();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m138032p(mvc0 mvc0Var) {
        this.f112425c.mo154986U3();
    }

    /* JADX INFO: renamed from: q */
    public void m138033q(LivingUsers<BLiveMember> livingUsers, cm0 cm0Var, String str) {
        this.f112424b.m113417H(livingUsers, cm0Var, str);
    }

    /* JADX INFO: renamed from: s */
    public void m138034s(String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        this.f112424b.m113418I(str, bLiveVoiceCallInvite);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
