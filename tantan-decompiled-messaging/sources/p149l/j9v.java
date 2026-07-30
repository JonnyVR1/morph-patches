package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.external.R$string;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import com.p046p1.mobile.putong.live.external.internal.virtualVoice.square.p061me.LiveMyVoiceRoomPageFrag;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VPullDownRefreshLayout;
import p147v.VRecyclerView;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class j9v implements s7m<e9v> {

    /* JADX INFO: renamed from: a */
    public final LiveMyVoiceRoomPageFrag f116964a;

    /* JADX INFO: renamed from: b */
    public e9v f116965b;

    /* JADX INFO: renamed from: c */
    public qyt f116966c;

    /* JADX INFO: renamed from: d */
    public g0u f116967d;

    /* JADX INFO: renamed from: e */
    public View f116968e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f116969f;

    /* JADX INFO: renamed from: g */
    public LiveEmptyErrorView f116970g;

    /* JADX INFO: renamed from: h */
    public GridLayoutManager f116971h;

    /* JADX INFO: renamed from: i */
    public VNavigationBar f116972i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f116973j;

    /* JADX INFO: renamed from: k */
    public View f116974k;

    /* JADX INFO: renamed from: l */
    public VPullDownRefreshLayout f116975l;

    /* JADX INFO: renamed from: l.j9v$a */
    public class C17721a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qyt f116976a;

        public C17721a(qyt qytVar) {
            this.f116976a = qytVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return this.f116976a.m67356K(i);
        }
    }

    public j9v(LiveMyVoiceRoomPageFrag liveMyVoiceRoomPageFrag) {
        this.f116964a = liveMyVoiceRoomPageFrag;
    }

    /* JADX INFO: renamed from: j */
    private void m140591j(List<? extends d1q<?>> list, boolean z, boolean z2) {
        this.f116966c.m67368W(this.f116967d);
        g0u g0uVar = new g0u(6, z, (z2 || list.size() == 0) ? false : true);
        this.f116967d = g0uVar;
        g0uVar.m124005I(this.f116969f.getResources().getColor(g1c0.f100171z));
        this.f116967d.m124006J(w8u.m202217t(R$string.f44921q));
        this.f116966c.m67351E(this.f116967d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m140592m(View view) {
        this.f116964a.act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m140593n(hnc0 hnc0Var) {
        this.f116965b.m115398F2();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f116964a.act();
    }

    /* JADX INFO: renamed from: e */
    public void m140594e(List<tvr<?>> list, boolean z, boolean z2) {
        if (this.f116966c == null) {
            return;
        }
        vwb.m200354z(list, new e30() { // from class: l.i9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112258a.m140597k((tvr) obj);
            }
        });
        m140591j(this.f116966c.m67355J(), z, z2);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(e9v e9vVar) {
        this.f116965b = e9vVar;
    }

    /* JADX INFO: renamed from: i */
    public qyt m140596i() {
        final qyt qytVarM177065J0 = qyt.m177065J0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getAct(), 6, 1, false);
        this.f116971h = gridLayoutManager;
        gridLayoutManager.m3326v(new C17721a(qytVarM177065J0));
        this.f116969f.setLayoutManager(this.f116971h);
        this.f116969f.setAdapter(qytVarM177065J0);
        this.f116969f.setItemAnimator(null);
        qytVarM177065J0.m191778l0(this.f116964a);
        qytVarM177065J0.m67369X(false);
        qytVarM177065J0.m67375c0(new e30() { // from class: l.h9v
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f106638a.m140598l(qytVarM177065J0, (Integer) obj);
            }
        });
        return qytVarM177065J0;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(s6c0.f162723Y1, viewGroup, false);
        this.f116968e = viewInflate;
        this.f116969f = (VRecyclerView) viewInflate.findViewById(f5c0.f95110k1);
        this.f116974k = this.f116968e.findViewById(f5c0.f95029N);
        this.f116970g = (LiveEmptyErrorView) this.f116968e.findViewById(f5c0.f95085e0);
        this.f116972i = (VNavigationBar) this.f116968e.findViewById(f5c0.f95090f1);
        this.f116973j = (AnimEffectPlayer) this.f116968e.findViewById(f5c0.f94995E1);
        this.f116975l = (VPullDownRefreshLayout) this.f116968e.findViewById(f5c0.f94999F1);
        m140601r();
        return this.f116968e;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m140597k(tvr tvrVar) {
        qyt qytVar = this.f116966c;
        qytVar.m67359N(qytVar.m67355J().size(), tvrVar);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m140598l(qyt qytVar, Integer num) {
        if (num.intValue() >= qytVar.getItemCount() - 2) {
            this.f116965b.m115397E2();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m140599p(List<tvr<?>> list, boolean z, boolean z2) {
        this.f116975l.m223775t();
        if (this.f116966c == null) {
            this.f116966c = m140596i();
        }
        if (list.size() != 0 || this.f116966c.getItemCount() <= 1) {
            this.f116966c.m67371Z(list);
            this.f116970g.m69874a(list.size());
            m140591j(list, z, z2);
            this.f116966c.m191777k0();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m140600q() {
        this.f116975l.m223775t();
        qyt qytVar = this.f116966c;
        if (qytVar != null) {
            qytVar.m67371Z(new ArrayList());
        }
        this.f116970g.m69875b();
    }

    /* JADX INFO: renamed from: r */
    public void m140601r() {
        this.f116970g.setEmptyText(w8u.m202217t(R$string.f44864C0));
        VText vText = new VText(this.f116964a.getContext());
        vText.setText("我的");
        vText.setTextSize(21.0f);
        vText.setTextColor(this.f116964a.act().getResources().getColor(g1c0.f100139C));
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, t100.f167254c, 0, 0);
        this.f116972i.setTitleView(vText);
        this.f116972i.setLeftIconAsBack(this.f116964a.act());
        this.f116972i.setBackgroundResource(g1c0.f100144H);
        VImage vImage = new VImage(this.f116964a.getContext());
        vImage.setImageDrawable(this.f116964a.act().getDrawable(h3c0.f105689m1));
        this.f116972i.setLeftIconView(vImage);
        this.f116972i.setLeftIconOnClick(new View.OnClickListener() { // from class: l.f9v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96527a.m140592m(view);
            }
        });
        this.f116964a.act().setStatusBarColor(this.f116964a.act().color(g1c0.f100148c));
        getAct().setNavigationBarColor(this.f116964a.act().color(g1c0.f100148c));
        this.f116973j.m68500j("https://auto.tancdn.com/v1/raw/bd5067f0-fa5a-4faf-bd72-06636f0c4d5610.pdf", -1);
        if (this.f116964a.act() instanceof PutongAct) {
            ((PutongAct) this.f116964a.act()).setTransparentStatusBar();
            int i = xdl0.f192403e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = xdl0.m208331F0();
            this.f116974k.setLayoutParams(layoutParams);
            this.f116973j.setLayoutParams(new FrameLayout.LayoutParams(xdl0.f192403e, t100.m186890d(92.0f) + xdl0.m208331F0()));
        }
        this.f116975l.mo223159O(new df50() { // from class: l.g9v
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                this.f101595a.m140593n(hnc0Var);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
