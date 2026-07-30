package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.external.R$string;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.fragmentnew2.LiveEmptyErrorView;
import com.p051p1.mobile.putong.live.external.internal.virtualVoice.square.p066me.LiveMyVoiceRoomPageFrag;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VPullDownRefreshLayout;
import p151v.VRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class kbv implements iam<fbv> {

    /* JADX INFO: renamed from: a */
    public final LiveMyVoiceRoomPageFrag f124980a;

    /* JADX INFO: renamed from: b */
    public fbv f124981b;

    /* JADX INFO: renamed from: c */
    public r0u f124982c;

    /* JADX INFO: renamed from: d */
    public h2u f124983d;

    /* JADX INFO: renamed from: e */
    public View f124984e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f124985f;

    /* JADX INFO: renamed from: g */
    public LiveEmptyErrorView f124986g;

    /* JADX INFO: renamed from: h */
    public GridLayoutManager f124987h;

    /* JADX INFO: renamed from: i */
    public VNavigationBar f124988i;

    /* JADX INFO: renamed from: j */
    public AnimEffectPlayer f124989j;

    /* JADX INFO: renamed from: k */
    public View f124990k;

    /* JADX INFO: renamed from: l */
    public VPullDownRefreshLayout f124991l;

    /* JADX INFO: renamed from: l.kbv$a */
    public class C18131a extends GridLayoutManager.AbstractC0554c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ r0u f124992a;

        public C18131a(r0u r0uVar) {
            this.f124992a = r0uVar;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return this.f124992a.m68539K(i);
        }
    }

    public kbv(LiveMyVoiceRoomPageFrag liveMyVoiceRoomPageFrag) {
        this.f124980a = liveMyVoiceRoomPageFrag;
    }

    /* JADX INFO: renamed from: j */
    private void m149082j(List<? extends d3q<?>> list, boolean z, boolean z2) {
        this.f124982c.m68551W(this.f124983d);
        h2u h2uVar = new h2u(6, z, (z2 || list.size() == 0) ? false : true);
        this.f124983d = h2uVar;
        h2uVar.m133403I(this.f124985f.getResources().getColor(m9c0.f135401z));
        this.f124983d.m133404J(xau.m209910t(R$string.f45769q));
        this.f124982c.m68534E(this.f124983d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public /* synthetic */ void m149083m(View view) {
        this.f124980a.act().lambda$debugItems$19();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m149084n(mvc0 mvc0Var) {
        this.f124981b.m124952F2();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f124980a.act();
    }

    /* JADX INFO: renamed from: e */
    public void m149085e(List<uxr<?>> list, boolean z, boolean z2) {
        if (this.f124982c == null) {
            return;
        }
        jyb.m147537z(list, new y20() { // from class: l.jbv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119995a.m149088k((uxr) obj);
            }
        });
        m149082j(this.f124982c.m68538J(), z, z2);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(fbv fbvVar) {
        this.f124981b = fbvVar;
    }

    /* JADX INFO: renamed from: i */
    public r0u m149087i() {
        final r0u r0uVarM179247J0 = r0u.m179247J0();
        GridLayoutManager gridLayoutManager = new GridLayoutManager((Context) getAct(), 6, 1, false);
        this.f124987h = gridLayoutManager;
        gridLayoutManager.m3327v(new C18131a(r0uVarM179247J0));
        this.f124985f.setLayoutManager(this.f124987h);
        this.f124985f.setAdapter(r0uVarM179247J0);
        this.f124985f.setItemAnimator(null);
        r0uVarM179247J0.m200146l0(this.f124980a);
        r0uVarM179247J0.m68552X(false);
        r0uVarM179247J0.m68558c0(new y20() { // from class: l.ibv
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114255a.m149089l(r0uVarM179247J0, (Integer) obj);
            }
        });
        return r0uVarM179247J0;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(xec0.f193837Y1, viewGroup, false);
        this.f124984e = viewInflate;
        this.f124985f = (VRecyclerView) viewInflate.findViewById(ldc0.f131567k1);
        this.f124990k = this.f124984e.findViewById(ldc0.f131486N);
        this.f124986g = (LiveEmptyErrorView) this.f124984e.findViewById(ldc0.f131542e0);
        this.f124988i = (VNavigationBar) this.f124984e.findViewById(ldc0.f131547f1);
        this.f124989j = (AnimEffectPlayer) this.f124984e.findViewById(ldc0.f131452E1);
        this.f124991l = (VPullDownRefreshLayout) this.f124984e.findViewById(ldc0.f131456F1);
        m149092r();
        return this.f124984e;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m149088k(uxr uxrVar) {
        r0u r0uVar = this.f124982c;
        r0uVar.m68542N(r0uVar.m68538J().size(), uxrVar);
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m149089l(r0u r0uVar, Integer num) {
        if (num.intValue() >= r0uVar.getItemCount() - 2) {
            this.f124981b.m124951E2();
        }
    }

    /* JADX INFO: renamed from: p */
    public void m149090p(List<uxr<?>> list, boolean z, boolean z2) {
        this.f124991l.m225021t();
        if (this.f124982c == null) {
            this.f124982c = m149087i();
        }
        if (list.size() != 0 || this.f124982c.getItemCount() <= 1) {
            this.f124982c.m68554Z(list);
            this.f124986g.m71057a(list.size());
            m149082j(list, z, z2);
            this.f124982c.m200145k0();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m149091q() {
        this.f124991l.m225021t();
        r0u r0uVar = this.f124982c;
        if (r0uVar != null) {
            r0uVar.m68554Z(new ArrayList());
        }
        this.f124986g.m71058b();
    }

    /* JADX INFO: renamed from: r */
    public void m149092r() {
        this.f124986g.setEmptyText(xau.m209910t(R$string.f45712C0));
        VText vText = new VText(this.f124980a.getContext());
        vText.setText("我的");
        vText.setTextSize(21.0f);
        vText.setTextColor(this.f124980a.act().getResources().getColor(m9c0.f135369C));
        vText.setTypeface(null, 1);
        vText.setMaxLines(1);
        vText.setEllipsize(TextUtils.TruncateAt.END);
        vText.setPadding(0, qa00.f156316c, 0, 0);
        this.f124988i.setTitleView(vText);
        this.f124988i.setLeftIconAsBack(this.f124980a.act());
        this.f124988i.setBackgroundResource(m9c0.f135374H);
        VImage vImage = new VImage(this.f124980a.getContext());
        vImage.setImageDrawable(this.f124980a.act().getDrawable(nbc0.f141180m1));
        this.f124988i.setLeftIconView(vImage);
        this.f124988i.setLeftIconOnClick(new View.OnClickListener() { // from class: l.gbv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103499a.m149083m(view);
            }
        });
        this.f124980a.act().setStatusBarColor(this.f124980a.act().color(m9c0.f135378c));
        getAct().setNavigationBarColor(this.f124980a.act().color(m9c0.f135378c));
        this.f124989j.m69683j("https://auto.tancdn.com/v1/raw/bd5067f0-fa5a-4faf-bd72-06636f0c4d5610.pdf", -1);
        if (this.f124980a.act() instanceof PutongAct) {
            ((PutongAct) this.f124980a.act()).setTransparentStatusBar();
            int i = bnl0.f77544e;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i);
            layoutParams.topMargin = bnl0.m105511F0();
            this.f124990k.setLayoutParams(layoutParams);
            this.f124989j.setLayoutParams(new FrameLayout.LayoutParams(bnl0.f77544e, qa00.m175859d(92.0f) + bnl0.m105511F0()));
        }
        this.f124991l.mo224405O(new jn50() { // from class: l.hbv
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                this.f108654a.m149084n(mvc0Var);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
