package com.p051p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p051p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.ado0;
import p153l.bnl0;
import p153l.cco0;
import p153l.cdo0;
import p153l.d3q;
import p153l.gt0;
import p153l.h64;
import p153l.huf0;
import p153l.i9o0;
import p153l.iam;
import p153l.it0;
import p153l.jgc0;
import p153l.jyb;
import p153l.l51;
import p153l.l6o0;
import p153l.nsv;
import p153l.obc0;
import p153l.qa00;
import p153l.qcj;
import p153l.r9o0;
import p153l.usm0;
import p153l.vkp0;
import p153l.vxr;
import p153l.wft;
import p153l.x20;
import p153l.xau;
import p153l.yau;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMembersView extends ConstraintLayout implements iam<usm0<?>> {

    /* JADX INFO: renamed from: d */
    public View f53675d;

    /* JADX INFO: renamed from: e */
    public VLinear f53676e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f53677f;

    /* JADX INFO: renamed from: g */
    public VText f53678g;

    /* JADX INFO: renamed from: h */
    public VText f53679h;

    /* JADX INFO: renamed from: i */
    public usm0 f53680i;

    /* JADX INFO: renamed from: j */
    public final PopupWindow f53681j;

    /* JADX INFO: renamed from: k */
    public LinearLayoutManager f53682k;

    /* JADX INFO: renamed from: l */
    public Animator f53683l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView$a */
    public class C13151a extends LinearLayoutManager {
        public C13151a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0579o
        public void onLayoutChildren(RecyclerView.C0586v c0586v, RecyclerView.C0561a0 c0561a0) {
            try {
                super.onLayoutChildren(c0586v, c0561a0);
            } catch (Exception unused) {
            }
        }
    }

    public VoiceMembersView(Context context) {
        super(context);
        this.f53681j = new PopupWindow();
        this.f53682k = null;
        this.f53683l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m78790B0(View view) {
        usm0 usm0Var = this.f53680i;
        if (usm0Var != null) {
            usm0Var.m197946h4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m78791D0(View view) {
        usm0 usm0Var = this.f53680i;
        if (usm0Var != null) {
            usm0Var.m197945g4();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m78799r() {
        this.f53677f.setHasFixedSize(true);
        C13151a c13151a = new C13151a(getContext());
        this.f53682k = c13151a;
        this.f53677f.setLayoutManager(c13151a);
        RecyclerView.AbstractC0576l itemAnimator = this.f53677f.getItemAnimator();
        itemAnimator.setAddDuration(0L);
        itemAnimator.setChangeDuration(0L);
        itemAnimator.setMoveDuration(0L);
        itemAnimator.setRemoveDuration(0L);
        if (itemAnimator instanceof AbstractC0618v) {
            ((AbstractC0618v) itemAnimator).setSupportsChangeAnimations(false);
        }
        ((AbstractC0618v) itemAnimator).setSupportsChangeAnimations(false);
        this.f53677f.addItemDecoration(new huf0(0, 0, qa00.m175859d(1.0f), 0));
        cco0 cco0Var = new cco0();
        cco0Var.setHasStableIds(true);
        this.f53677f.setAdapter(cco0Var);
        bnl0.m105509E0(this.f53678g, new View.OnClickListener() { // from class: l.j9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f118893a.m78790B0(view);
            }
        });
        bnl0.m105509E0(this.f53679h, new View.OnClickListener() { // from class: l.k9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124567a.m78791D0(view);
            }
        });
        this.f53681j.setOutsideTouchable(true);
        this.f53681j.setWidth(-2);
        this.f53681j.setHeight(-2);
        this.f53681j.setAnimationStyle(jgc0.f120706m);
        if (wft.m206159b(3)) {
            this.f53679h.setText("邀请");
            this.f53679h.setCompoundDrawables(null, null, null, null);
            bnl0.m105505C0(this.f53679h, qa00.m175859d(26.0f));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    private void setAnchorUserMask(nsv<h64> nsvVar) {
        BLiveUserMask bLiveUserMask;
        l6o0 l6o0VarM153068c = l6o0.m153068c(nsvVar);
        if (!i9o0.m139143o(nsvVar.f143542a.f107997a, this.f53680i) || (bLiveUserMask = l6o0VarM153068c.f130275b) == null) {
            return;
        }
        this.f53680i.m213810E2().m168493X1(bLiveUserMask);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r10v12, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r10v8, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m78801G0(String str, BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        int iM78814u0 = m78814u0(str);
        int iFindFirstVisibleItemPosition = this.f53682k.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.f53682k.findLastVisibleItemPosition();
        View viewM78815v0 = m78815v0(iM78814u0);
        if (viewM78815v0 == null || iFindFirstVisibleItemPosition > iM78814u0 || iM78814u0 > iFindLastVisibleItemPosition) {
            viewM78815v0 = this.f53678g;
        }
        SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) LayoutInflater.from(getContext()).inflate(yec0.f199092ga, (ViewGroup) null);
        sayHiBubbleView.setBackgroundResource(obc0.f146165Q9);
        int i = qa00.f156322i;
        int i2 = qa00.f156320g;
        sayHiBubbleView.setPadding(i, i2, qa00.f156325l, i2);
        sayHiBubbleView.m77831f(bLiveVoiceTagBubble, this.f53680i.m213810E2().m202194o(), this.f53680i.m213810E2().m168526j0(), this.f53680i.m213810E2().m202191k(), new x20() { // from class: l.q9o0
            @Override // p153l.x20
            public final void call() {
                this.f156250a.m78800E0();
            }
        });
        this.f53681j.setContentView(sayHiBubbleView);
        sayHiBubbleView.measure(bnl0.m105592y0(), bnl0.m105588w0());
        this.f53681j.showAsDropDown(viewM78815v0, -sayHiBubbleView.getMeasuredWidth(), -(viewM78815v0.getMeasuredHeight() - ((viewM78815v0.getMeasuredHeight() - qa00.m175859d(38.0f)) / 2)));
    }

    /* JADX INFO: renamed from: H0 */
    public void m78802H0() {
        it0.m142009C(this.f53683l);
        Animator animatorM132166l = gt0.m132166l(this, View.ALPHA, 0L, 250L, gt0.f106346a, 1.0f, 0.0f);
        this.f53683l = animatorM132166l;
        animatorM132166l.start();
    }

    /* JADX INFO: renamed from: I0 */
    public void m78803I0(nsv<h64> nsvVar) {
        setAnchorUserMask(nsvVar);
        cdo0 cdo0VarM78812s0 = m78812s0(nsvVar.f143542a.f107997a);
        if (cdo0VarM78812s0 != null) {
            cdo0VarM78812s0.m109232O(nsvVar);
            getAdapter().m68543O(cdo0VarM78812s0);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m78804J0(final String str, final BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        l51.m152888H(this.f53680i.act(), new Runnable() { // from class: l.n9o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f140928a.m78801G0(str, bLiveVoiceTagBubble);
            }
        }, 2000L);
        l51.m152888H(this.f53680i.act(), new Runnable() { // from class: l.o9o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f145617a.m78800E0();
            }
        }, 7000L);
    }

    /* JADX INFO: renamed from: K0 */
    public void m78805K0(BLiveVoiceCall bLiveVoiceCall) {
        cdo0 cdo0VarM78812s0 = m78812s0(bLiveVoiceCall.user);
        if (NullChecker.m82486a(cdo0VarM78812s0)) {
            cdo0VarM78812s0.m109230L(bLiveVoiceCall);
            getAdapter().m68543O(cdo0VarM78812s0);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m78806L0(nsv<h64> nsvVar) {
        m78803I0(nsvVar);
    }

    /* JADX INFO: renamed from: N1 */
    public void m78807N1(BLiveVoiceCall bLiveVoiceCall) {
        cdo0 cdo0VarM78812s0 = m78812s0(bLiveVoiceCall.user);
        if (cdo0VarM78812s0 != null) {
            cdo0VarM78812s0.m109230L(bLiveVoiceCall);
            getAdapter().m68544P(cdo0VarM78812s0, new vkp0(bLiveVoiceCall));
        }
    }

    @Override // p153l.iam
    public void destroy() {
        bnl0.m105524M(this.f53678g, false);
        getAdapter().m68554Z(new ArrayList());
        m78800E0();
        it0.m142009C(this.f53683l);
    }

    public cco0 getAdapter() {
        return (cco0) this.f53677f.getAdapter();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m78808o0(View view) {
        r9o0.m180622a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78808o0(this);
        m78799r();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(usm0 usm0Var) {
        this.f53680i = usm0Var;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m78810q0(List<cdo0> list, final BLiveMember bLiveMember) {
        cdo0 cdo0Var = new cdo0(bLiveMember.getId(), this.f53680i);
        cdo0Var.mo113881A(new View.OnClickListener() { // from class: l.l9o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130619a.m78818z0(bLiveMember, view);
            }
        });
        list.add(cdo0Var);
    }

    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void m78800E0() {
        if (this.f53681j.isShowing()) {
            this.f53681j.dismiss();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final cdo0 m78812s0(final String str) {
        d3q d3qVar = (d3q) jyb.m147529r(getAdapter().m68538J(), new qcj() { // from class: l.m9o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((cdo0) ((d3q) obj)).f81249a.f143542a.f107997a, str));
            }
        });
        if (d3qVar == null) {
            return null;
        }
        return (cdo0) d3qVar;
    }

    public void setData(ado0 ado0Var) {
        long jM97114J = ado0Var.m97114J();
        if (jM97114J > vxr.m203876d().m170983J1()) {
            VoiceChatInputView.f53867t = vxr.m203876d().m170981I1();
        } else {
            VoiceChatInputView.f53867t = 1000;
        }
        if (jM97114J > vxr.m203876d().m170985K1()) {
            CommonMaskAvatarView.setEnableMask(false);
            CommonMaskAvatarView.setEnableAnimMask(false);
        } else if (jM97114J < ((double) vxr.m203876d().m170985K1()) * 0.75d) {
            CommonMaskAvatarView.setEnableMask(true);
            CommonMaskAvatarView.setEnableAnimMask(true);
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveMember bLiveMember : ado0Var.m97112H()) {
            setAnchorUserMask(ado0Var.m97116L(bLiveMember.getId()));
            m78810q0(arrayList, bLiveMember);
        }
        getAdapter().m68554Z(arrayList);
        bnl0.m105524M(this.f53678g, true);
        String strM209911u = xau.m209911u(R$string.f48441vi, Long.valueOf(ado0Var.m97114J()));
        if (yau.m214943k()) {
            strM209911u = String.valueOf(ado0Var.m97114J());
        }
        this.f53678g.setText(strM209911u);
        bnl0.m105524M(this.f53679h, true);
    }

    public void setMemberCount(long j) {
        if (NullChecker.m82486a(this.f53678g)) {
            this.f53678g.setText(String.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m78813t0() {
        return this.f53681j.isShowing();
    }

    /* JADX INFO: renamed from: u0 */
    public int m78814u0(final String str) {
        return jyb.m147476G(getAdapter().m68538J(), new qcj() { // from class: l.p9o0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((cdo0) ((d3q) obj)).f81249a.f143542a.f107997a, str));
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public View m78815v0(int i) {
        if (i >= 0) {
            return this.f53677f.getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public View m78816w0(String str) {
        for (int i = 0; i < this.f53677f.getChildCount(); i++) {
            View childAt = this.f53677f.getChildAt(i);
            if ((childAt instanceof VoiceMemberItemView) && TextUtils.equals(((VoiceMemberItemView) childAt).getCallUser().f143542a.f107997a, str)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public void m78817y0() {
        it0.m142009C(this.f53683l);
        Animator animatorM132166l = gt0.m132166l(this, View.ALPHA, 0L, 250L, gt0.f106346a, 0.0f, 1.0f);
        this.f53683l = animatorM132166l;
        animatorM132166l.start();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m78818z0(BLiveMember bLiveMember, View view) {
        usm0 usm0Var = this.f53680i;
        if (usm0Var != null) {
            usm0Var.m197944e4(bLiveMember.getId());
        }
    }

    public VoiceMembersView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53681j = new PopupWindow();
        this.f53682k = null;
        this.f53683l = null;
    }

    public VoiceMembersView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53681j = new PopupWindow();
        this.f53682k = null;
        this.f53683l = null;
    }
}
