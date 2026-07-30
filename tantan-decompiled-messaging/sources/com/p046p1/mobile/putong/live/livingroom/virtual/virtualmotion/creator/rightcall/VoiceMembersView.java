package com.p046p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall;

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
import androidx.recyclerview.widget.AbstractC0616v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView;
import com.p046p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p046p1.mobile.putong.live.livingroom.voice.chat.view.VoiceChatInputView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.bt0;
import p149l.d1q;
import p149l.d30;
import p149l.d8c0;
import p149l.dt0;
import p149l.e0o0;
import p149l.e51;
import p149l.hxn0;
import p149l.i3c0;
import p149l.i54;
import p149l.mqv;
import p149l.n0o0;
import p149l.qjm0;
import p149l.rbp0;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.uvr;
import p149l.vdt;
import p149l.vwb;
import p149l.w3o0;
import p149l.w8u;
import p149l.w9j;
import p149l.x8u;
import p149l.xdl0;
import p149l.y2o0;
import p149l.y3o0;
import p149l.ylf0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMembersView extends ConstraintLayout implements s7m<qjm0<?>> {

    /* JADX INFO: renamed from: d */
    public View f52827d;

    /* JADX INFO: renamed from: e */
    public VLinear f52828e;

    /* JADX INFO: renamed from: f */
    public VRecyclerView f52829f;

    /* JADX INFO: renamed from: g */
    public VText f52830g;

    /* JADX INFO: renamed from: h */
    public VText f52831h;

    /* JADX INFO: renamed from: i */
    public qjm0 f52832i;

    /* JADX INFO: renamed from: j */
    public final PopupWindow f52833j;

    /* JADX INFO: renamed from: k */
    public LinearLayoutManager f52834k;

    /* JADX INFO: renamed from: l */
    public Animator f52835l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.virtualmotion.creator.rightcall.VoiceMembersView$a */
    public class C12988a extends LinearLayoutManager {
        public C12988a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
        public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
            try {
                super.onLayoutChildren(c0584v, c0588z);
            } catch (Exception unused) {
            }
        }
    }

    public VoiceMembersView(Context context) {
        super(context);
        this.f52833j = new PopupWindow();
        this.f52834k = null;
        this.f52835l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B0 */
    public /* synthetic */ void m77607B0(View view) {
        qjm0 qjm0Var = this.f52832i;
        if (qjm0Var != null) {
            qjm0Var.m175020h4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D0 */
    public /* synthetic */ void m77608D0(View view) {
        qjm0 qjm0Var = this.f52832i;
        if (qjm0Var != null) {
            qjm0Var.m175019g4();
        }
    }

    /* JADX INFO: renamed from: r */
    private void m77616r() {
        this.f52829f.setHasFixedSize(true);
        C12988a c12988a = new C12988a(getContext());
        this.f52834k = c12988a;
        this.f52829f.setLayoutManager(c12988a);
        RecyclerView.AbstractC0574l itemAnimator = this.f52829f.getItemAnimator();
        itemAnimator.setAddDuration(0L);
        itemAnimator.setChangeDuration(0L);
        itemAnimator.setMoveDuration(0L);
        itemAnimator.setRemoveDuration(0L);
        if (itemAnimator instanceof AbstractC0616v) {
            ((AbstractC0616v) itemAnimator).setSupportsChangeAnimations(false);
        }
        ((AbstractC0616v) itemAnimator).setSupportsChangeAnimations(false);
        this.f52829f.addItemDecoration(new ylf0(0, 0, t100.m186890d(1.0f), 0));
        y2o0 y2o0Var = new y2o0();
        y2o0Var.setHasStableIds(true);
        this.f52829f.setAdapter(y2o0Var);
        xdl0.m208329E0(this.f52830g, new View.OnClickListener() { // from class: l.f0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93994a.m77607B0(view);
            }
        });
        xdl0.m208329E0(this.f52831h, new View.OnClickListener() { // from class: l.g0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100071a.m77608D0(view);
            }
        });
        this.f52833j.setOutsideTouchable(true);
        this.f52833j.setWidth(-2);
        this.f52833j.setHeight(-2);
        this.f52833j.setAnimationStyle(d8c0.f84858m);
        if (vdt.m198092b(3)) {
            this.f52831h.setText("邀请");
            this.f52831h.setCompoundDrawables(null, null, null, null);
            xdl0.m208325C0(this.f52831h, t100.m186890d(26.0f));
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    private void setAnchorUserMask(mqv<i54> mqvVar) {
        BLiveUserMask bLiveUserMask;
        hxn0 hxn0VarM133350c = hxn0.m133350c(mqvVar);
        if (!e0o0.m114328o(mqvVar.f135304a.f111520a, this.f52832i) || (bLiveUserMask = hxn0VarM133350c.f109896b) == null) {
            return;
        }
        this.f52832i.m206027E2().m132107X1(bLiveUserMask);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX WARN: Type inference failed for: r10v10, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r10v12, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r10v8, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m77618G0(String str, BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        int iM77631u0 = m77631u0(str);
        int iFindFirstVisibleItemPosition = this.f52834k.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = this.f52834k.findLastVisibleItemPosition();
        View viewM77632v0 = m77632v0(iM77631u0);
        if (viewM77632v0 == null || iFindFirstVisibleItemPosition > iM77631u0 || iM77631u0 > iFindLastVisibleItemPosition) {
            viewM77632v0 = this.f52830g;
        }
        SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) LayoutInflater.from(getContext()).inflate(t6c0.f168360ga, (ViewGroup) null);
        sayHiBubbleView.setBackgroundResource(i3c0.f110837Q9);
        int i = t100.f167260i;
        int i2 = t100.f167258g;
        sayHiBubbleView.setPadding(i, i2, t100.f167263l, i2);
        sayHiBubbleView.m76648f(bLiveVoiceTagBubble, this.f52832i.m206027E2().m149818o(), this.f52832i.m206027E2().m132140j0(), this.f52832i.m206027E2().m149814k(), new d30() { // from class: l.m0o0
            @Override // p149l.d30
            public final void call() {
                this.f130752a.m77617E0();
            }
        });
        this.f52833j.setContentView(sayHiBubbleView);
        sayHiBubbleView.measure(xdl0.m208412y0(), xdl0.m208408w0());
        this.f52833j.showAsDropDown(viewM77632v0, -sayHiBubbleView.getMeasuredWidth(), -(viewM77632v0.getMeasuredHeight() - ((viewM77632v0.getMeasuredHeight() - t100.m186890d(38.0f)) / 2)));
    }

    /* JADX INFO: renamed from: H0 */
    public void m77619H0() {
        dt0.m113503C(this.f52835l);
        Animator animatorM103739l = bt0.m103739l(this, View.ALPHA, 0L, 250L, bt0.f77154a, 1.0f, 0.0f);
        this.f52835l = animatorM103739l;
        animatorM103739l.start();
    }

    /* JADX INFO: renamed from: I0 */
    public void m77620I0(mqv<i54> mqvVar) {
        setAnchorUserMask(mqvVar);
        y3o0 y3o0VarM77629s0 = m77629s0(mqvVar.f135304a.f111520a);
        if (y3o0VarM77629s0 != null) {
            y3o0VarM77629s0.m212853O(mqvVar);
            getAdapter().m67360O(y3o0VarM77629s0);
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m77621J0(final String str, final BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        e51.m114743H(this.f52832i.act(), new Runnable() { // from class: l.j0o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f115695a.m77618G0(str, bLiveVoiceTagBubble);
            }
        }, 2000L);
        e51.m114743H(this.f52832i.act(), new Runnable() { // from class: l.k0o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f120507a.m77617E0();
            }
        }, 7000L);
    }

    /* JADX INFO: renamed from: K0 */
    public void m77622K0(BLiveVoiceCall bLiveVoiceCall) {
        y3o0 y3o0VarM77629s0 = m77629s0(bLiveVoiceCall.user);
        if (NullChecker.m81303a(y3o0VarM77629s0)) {
            y3o0VarM77629s0.m212851L(bLiveVoiceCall);
            getAdapter().m67360O(y3o0VarM77629s0);
        }
    }

    /* JADX INFO: renamed from: L0 */
    public void m77623L0(mqv<i54> mqvVar) {
        m77620I0(mqvVar);
    }

    /* JADX INFO: renamed from: N1 */
    public void m77624N1(BLiveVoiceCall bLiveVoiceCall) {
        y3o0 y3o0VarM77629s0 = m77629s0(bLiveVoiceCall.user);
        if (y3o0VarM77629s0 != null) {
            y3o0VarM77629s0.m212851L(bLiveVoiceCall);
            getAdapter().m67361P(y3o0VarM77629s0, new rbp0(bLiveVoiceCall));
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        xdl0.m208344M(this.f52830g, false);
        getAdapter().m67371Z(new ArrayList());
        m77617E0();
        dt0.m113503C(this.f52835l);
    }

    public y2o0 getAdapter() {
        return (y2o0) this.f52829f.getAdapter();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m77625o0(View view) {
        n0o0.m157285a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77625o0(this);
        m77616r();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(qjm0 qjm0Var) {
        this.f52832i = qjm0Var;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m77627q0(List<y3o0> list, final BLiveMember bLiveMember) {
        y3o0 y3o0Var = new y3o0(bLiveMember.getId(), this.f52832i);
        y3o0Var.mo109662A(new View.OnClickListener() { // from class: l.h0o0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105232a.m77635z0(bLiveMember, view);
            }
        });
        list.add(y3o0Var);
    }

    /* JADX INFO: renamed from: r0, reason: merged with bridge method [inline-methods] */
    public void m77617E0() {
        if (this.f52833j.isShowing()) {
            this.f52833j.dismiss();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final y3o0 m77629s0(final String str) {
        d1q d1qVar = (d1q) vwb.m200346r(getAdapter().m67355J(), new w9j() { // from class: l.i0o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((y3o0) ((d1q) obj)).f195832a.f135304a.f111520a, str));
            }
        });
        if (d1qVar == null) {
            return null;
        }
        return (y3o0) d1qVar;
    }

    public void setData(w3o0 w3o0Var) {
        long jM201357J = w3o0Var.m201357J();
        if (jM201357J > uvr.m196087d().m162676J1()) {
            VoiceChatInputView.f53019t = uvr.m196087d().m162674I1();
        } else {
            VoiceChatInputView.f53019t = 1000;
        }
        if (jM201357J > uvr.m196087d().m162678K1()) {
            CommonMaskAvatarView.setEnableMask(false);
            CommonMaskAvatarView.setEnableAnimMask(false);
        } else if (jM201357J < ((double) uvr.m196087d().m162678K1()) * 0.75d) {
            CommonMaskAvatarView.setEnableMask(true);
            CommonMaskAvatarView.setEnableAnimMask(true);
        }
        ArrayList arrayList = new ArrayList();
        for (BLiveMember bLiveMember : w3o0Var.m201355H()) {
            setAnchorUserMask(w3o0Var.m201359L(bLiveMember.getId()));
            m77627q0(arrayList, bLiveMember);
        }
        getAdapter().m67371Z(arrayList);
        xdl0.m208344M(this.f52830g, true);
        String strM202218u = w8u.m202218u(R$string.f47593vi, Long.valueOf(w3o0Var.m201357J()));
        if (x8u.m207441k()) {
            strM202218u = String.valueOf(w3o0Var.m201357J());
        }
        this.f52830g.setText(strM202218u);
        xdl0.m208344M(this.f52831h, true);
    }

    public void setMemberCount(long j) {
        if (NullChecker.m81303a(this.f52830g)) {
            this.f52830g.setText(String.valueOf(j));
        }
    }

    /* JADX INFO: renamed from: t0 */
    public boolean m77630t0() {
        return this.f52833j.isShowing();
    }

    /* JADX INFO: renamed from: u0 */
    public int m77631u0(final String str) {
        return vwb.m200293G(getAdapter().m67355J(), new w9j() { // from class: l.l0o0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((y3o0) ((d1q) obj)).f195832a.f135304a.f111520a, str));
            }
        });
    }

    /* JADX INFO: renamed from: v0 */
    public View m77632v0(int i) {
        if (i >= 0) {
            return this.f52829f.getChildAt(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: w0 */
    public View m77633w0(String str) {
        for (int i = 0; i < this.f52829f.getChildCount(); i++) {
            View childAt = this.f52829f.getChildAt(i);
            if ((childAt instanceof VoiceMemberItemView) && TextUtils.equals(((VoiceMemberItemView) childAt).getCallUser().f135304a.f111520a, str)) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y0 */
    public void m77634y0() {
        dt0.m113503C(this.f52835l);
        Animator animatorM103739l = bt0.m103739l(this, View.ALPHA, 0L, 250L, bt0.f77154a, 0.0f, 1.0f);
        this.f52835l = animatorM103739l;
        animatorM103739l.start();
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m77635z0(BLiveMember bLiveMember, View view) {
        qjm0 qjm0Var = this.f52832i;
        if (qjm0Var != null) {
            qjm0Var.m175018e4(bLiveMember.getId());
        }
    }

    public VoiceMembersView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52833j = new PopupWindow();
        this.f52834k = null;
        this.f52835l = null;
    }

    public VoiceMembersView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52833j = new PopupWindow();
        this.f52834k = null;
        this.f52835l = null;
    }
}
