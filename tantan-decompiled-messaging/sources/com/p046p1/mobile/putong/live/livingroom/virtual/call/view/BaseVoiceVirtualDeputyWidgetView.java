package com.p046p1.mobile.putong.live.livingroom.virtual.call.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.live.base.data.BLiveCallConnection;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p046p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p046p1.mobile.putong.live.livingroom.virtual.call.view.BaseVoiceVirtualDeputyWidgetView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.bik0;
import p149l.d30;
import p149l.e30;
import p149l.h1c0;
import p149l.hfw;
import p149l.i54;
import p149l.kvc0;
import p149l.mqv;
import p149l.o3p0;
import p149l.r4p0;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseVoiceVirtualDeputyWidgetView<V extends r4p0> extends ConstraintLayout implements s7m<o3p0<?>> {

    /* JADX INFO: renamed from: d */
    public o3p0 f52245d;

    /* JADX INFO: renamed from: e */
    public final List<V> f52246e;

    public BaseVoiceVirtualDeputyWidgetView(Context context) {
        super(context);
        this.f52246e = new ArrayList();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Boolean m76880h0(bik0 bik0Var, BLiveVoiceCall bLiveVoiceCall, BLiveCallConnection bLiveCallConnection) {
        BLiveVoiceCall bLiveVoiceCallM102063l = bik0Var.m102063l(bLiveCallConnection.userId);
        int i = bLiveVoiceCall.position;
        return Boolean.valueOf(i != 1 && i != 5 && NullChecker.m81303a(bLiveVoiceCallM102063l) && bLiveVoiceCall.position - bLiveVoiceCallM102063l.position == 1);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: N1 */
    public void m76883N1(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.position < this.f52246e.size()) {
            this.f52246e.get(bLiveVoiceCall.position).mo76898a(bLiveVoiceCall);
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public void m76884Q3(int i, boolean z) {
        if (i < this.f52246e.size()) {
            this.f52246e.get(i).mo76899b(i + 1, z, this.f52245d);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        m76886l0();
        setVisible(false);
    }

    public abstract List<V> getDeputyViewList();

    public o3p0 getPresenter() {
        return this.f52245d;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(o3p0 o3p0Var) {
        this.f52245d = o3p0Var;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m76886l0() {
        for (int i = 0; i < this.f52246e.size(); i++) {
            m76887m0(i);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m76887m0(int i) {
        if (i < this.f52246e.size()) {
            this.f52246e.get(i).mo76903f(i + 1, this.f52245d);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m76888n0() {
        List<V> deputyViewList = getDeputyViewList();
        if (vwb.m200296J(deputyViewList)) {
            return;
        }
        this.f52246e.clear();
        this.f52246e.addAll(deputyViewList);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: o0 */
    public void m76889o0(String str, int i, BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        V v2;
        if (i < 0 || i >= this.f52246e.size() || (v2 = this.f52246e.get(i)) == null) {
            return;
        }
        SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) LayoutInflater.from(getContext()).inflate(t6c0.f168360ga, (ViewGroup) null);
        sayHiBubbleView.m76648f(bLiveVoiceTagBubble, this.f52245d.m206027E2().m149818o(), this.f52245d.m206027E2().m132140j0(), this.f52245d.m206027E2().m149814k(), new d30() { // from class: l.ns2
            @Override // p149l.d30
            public final void call() {
                C4348d.m20896l().m20900k(SayHiBubbleView.getGreetViewTag());
            }
        });
        C4345a c4345a = new C4345a(getContext());
        c4345a.m20847B(t100.f167254c).m20877s(sayHiBubbleView).m20874p(75).m20882x(-t100.f167277z).m20870k(kvc0.m147352a(h1c0.f105362e1)).m20875q(C4345a.f15680N).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        if (i == 1) {
            c4345a.m20880v(t100.f167260i);
        } else if (i == 8 || i == 4) {
            c4345a.m20881w(t100.f167260i);
        } else if (i == 5) {
            c4345a.m20880v(t100.f167260i);
        }
        C4348d.m20896l().m20909u(c4345a, (View) v2, SayHiBubbleView.getGreetViewTag());
    }

    /* JADX INFO: renamed from: p0 */
    public void m76890p0(BLiveVoiceCall bLiveVoiceCall, String str) {
        this.f52246e.get(bLiveVoiceCall.position).mo76901d(str);
    }

    /* JADX INFO: renamed from: r */
    public void m76891r() {
        for (int i = 0; i < this.f52246e.size(); i++) {
            m76887m0(i);
            this.f52246e.get(i).mo76902e(i, this.f52245d);
        }
    }

    public void setData(bik0 bik0Var) {
        List<BLiveVoiceCall> listM102067p = bik0Var.m102067p();
        if (vwb.m200296J(listM102067p)) {
            return;
        }
        m76886l0();
        for (int i = 0; i < listM102067p.size(); i++) {
            m76893t2(bik0Var, listM102067p.get(i));
        }
    }

    public void setItemPlaceRes(final int i) {
        vwb.m200354z(this.f52246e, new e30() { // from class: l.ls2
            @Override // p149l.e30
            public final void call(Object obj) {
                ((r4p0) obj).setItemPlaceRes(i);
            }
        });
    }

    public void setVisible(boolean z) {
        xdl0.m208345M0(this, z);
    }

    /* JADX INFO: renamed from: t */
    public void m76892t() {
        setVisible(true);
        m76891r();
    }

    /* JADX INFO: renamed from: t2 */
    public void m76893t2(final bik0 bik0Var, final BLiveVoiceCall bLiveVoiceCall) {
        mqv<i54> mqvVarM102064m = bik0Var.m102064m(bLiveVoiceCall.user);
        BLiveMember bLiveMemberM201354G = bik0Var.m102069r().m201354G(bLiveVoiceCall.user);
        int i = bLiveVoiceCall.position;
        if (i < 0 || i >= this.f52246e.size()) {
            hfw.m130790a("[voice][call]", "illegal call,id=" + bLiveVoiceCall.f44485id + ",position:" + bLiveVoiceCall.position);
            return;
        }
        if (mqvVarM102064m != null) {
            this.f52246e.get(bLiveVoiceCall.position).mo76900c(bLiveVoiceCall, bLiveMemberM201354G, mqvVarM102064m, this.f52245d);
            BLiveCallConnection bLiveCallConnection = (BLiveCallConnection) vwb.m200346r(bLiveMemberM201354G.callConnections, new w9j() { // from class: l.ms2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return BaseVoiceVirtualDeputyWidgetView.m76880h0(bik0Var, bLiveVoiceCall, (BLiveCallConnection) obj);
                }
            });
            m76890p0(bLiveVoiceCall, bLiveCallConnection != null ? bLiveCallConnection.horizontalEffectSvga : "");
        }
    }

    public BaseVoiceVirtualDeputyWidgetView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52246e = new ArrayList();
    }

    public BaseVoiceVirtualDeputyWidgetView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52246e = new ArrayList();
    }
}
