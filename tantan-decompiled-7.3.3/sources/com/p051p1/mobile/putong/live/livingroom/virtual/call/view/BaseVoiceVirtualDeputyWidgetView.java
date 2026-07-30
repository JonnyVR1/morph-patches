package com.p051p1.mobile.putong.live.livingroom.virtual.call.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.live.base.data.BLiveCallConnection;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceTagBubble;
import com.p051p1.mobile.putong.live.livingroom.view.SayHiBubbleView;
import com.p051p1.mobile.putong.live.livingroom.virtual.call.view.BaseVoiceVirtualDeputyWidgetView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.fhw;
import p153l.h64;
import p153l.hrk0;
import p153l.iam;
import p153l.jyb;
import p153l.n3d0;
import p153l.n9c0;
import p153l.nsv;
import p153l.qa00;
import p153l.qcj;
import p153l.scp0;
import p153l.vdp0;
import p153l.x20;
import p153l.y20;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BaseVoiceVirtualDeputyWidgetView<V extends vdp0> extends ConstraintLayout implements iam<scp0<?>> {

    /* JADX INFO: renamed from: d */
    public scp0 f53093d;

    /* JADX INFO: renamed from: e */
    public final List<V> f53094e;

    public BaseVoiceVirtualDeputyWidgetView(Context context) {
        super(context);
        this.f53094e = new ArrayList();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ Boolean m78063h0(hrk0 hrk0Var, BLiveVoiceCall bLiveVoiceCall, BLiveCallConnection bLiveCallConnection) {
        BLiveVoiceCall bLiveVoiceCallM136873l = hrk0Var.m136873l(bLiveCallConnection.userId);
        int i = bLiveVoiceCall.position;
        return Boolean.valueOf(i != 1 && i != 5 && NullChecker.m82486a(bLiveVoiceCallM136873l) && bLiveVoiceCall.position - bLiveVoiceCallM136873l.position == 1);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: N1 */
    public void m78066N1(BLiveVoiceCall bLiveVoiceCall) {
        if (bLiveVoiceCall.position < this.f53094e.size()) {
            this.f53094e.get(bLiveVoiceCall.position).mo78081a(bLiveVoiceCall);
        }
    }

    /* JADX INFO: renamed from: Q3 */
    public void m78067Q3(int i, boolean z) {
        if (i < this.f53094e.size()) {
            this.f53094e.get(i).mo78082b(i + 1, z, this.f53093d);
        }
    }

    @Override // p153l.iam
    public void destroy() {
        m78069l0();
        setVisible(false);
    }

    public abstract List<V> getDeputyViewList();

    public scp0 getPresenter() {
        return this.f53093d;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(scp0 scp0Var) {
        this.f53093d = scp0Var;
    }

    /* JADX INFO: renamed from: l0 */
    public final void m78069l0() {
        for (int i = 0; i < this.f53094e.size(); i++) {
            m78070m0(i);
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m78070m0(int i) {
        if (i < this.f53094e.size()) {
            this.f53094e.get(i).mo78086f(i + 1, this.f53093d);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m78071n0() {
        List<V> deputyViewList = getDeputyViewList();
        if (jyb.m147479J(deputyViewList)) {
            return;
        }
        this.f53094e.clear();
        this.f53094e.addAll(deputyViewList);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x009c  */
    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v6, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v8, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: o0 */
    public void m78072o0(String str, int i, BLiveVoiceTagBubble bLiveVoiceTagBubble) {
        V v2;
        if (i < 0 || i >= this.f53094e.size() || (v2 = this.f53094e.get(i)) == null) {
            return;
        }
        SayHiBubbleView sayHiBubbleView = (SayHiBubbleView) LayoutInflater.from(getContext()).inflate(yec0.f199092ga, (ViewGroup) null);
        sayHiBubbleView.m77831f(bLiveVoiceTagBubble, this.f53093d.m213810E2().m202194o(), this.f53093d.m213810E2().m168526j0(), this.f53093d.m213810E2().m202191k(), new x20() { // from class: l.dt2
            @Override // p153l.x20
            public final void call() {
                C4499d.m21895l().m21899k(SayHiBubbleView.getGreetViewTag());
            }
        });
        C4496a c4496a = new C4496a(getContext());
        c4496a.m21846B(qa00.f156316c).m21876s(sayHiBubbleView).m21873p(75).m21881x(-qa00.f156339z).m21869k(n3d0.m161277a(n9c0.f140823e1)).m21874q(C4496a.f16399N).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS);
        if (i == 1) {
            c4496a.m21879v(qa00.f156322i);
        } else if (i == 8 || i == 4) {
            c4496a.m21880w(qa00.f156322i);
        } else if (i == 5) {
            c4496a.m21879v(qa00.f156322i);
        }
        C4499d.m21895l().m21908u(c4496a, (View) v2, SayHiBubbleView.getGreetViewTag());
    }

    /* JADX INFO: renamed from: p0 */
    public void m78073p0(BLiveVoiceCall bLiveVoiceCall, String str) {
        this.f53094e.get(bLiveVoiceCall.position).mo78084d(str);
    }

    /* JADX INFO: renamed from: r */
    public void m78074r() {
        for (int i = 0; i < this.f53094e.size(); i++) {
            m78070m0(i);
            this.f53094e.get(i).mo78085e(i, this.f53093d);
        }
    }

    public void setData(hrk0 hrk0Var) {
        List<BLiveVoiceCall> listM136877p = hrk0Var.m136877p();
        if (jyb.m147479J(listM136877p)) {
            return;
        }
        m78069l0();
        for (int i = 0; i < listM136877p.size(); i++) {
            m78076t2(hrk0Var, listM136877p.get(i));
        }
    }

    public void setItemPlaceRes(final int i) {
        jyb.m147537z(this.f53094e, new y20() { // from class: l.bt2
            @Override // p153l.y20
            public final void call(Object obj) {
                ((vdp0) obj).setItemPlaceRes(i);
            }
        });
    }

    public void setVisible(boolean z) {
        bnl0.m105525M0(this, z);
    }

    /* JADX INFO: renamed from: t */
    public void m78075t() {
        setVisible(true);
        m78074r();
    }

    /* JADX INFO: renamed from: t2 */
    public void m78076t2(final hrk0 hrk0Var, final BLiveVoiceCall bLiveVoiceCall) {
        nsv<h64> nsvVarM136874m = hrk0Var.m136874m(bLiveVoiceCall.user);
        BLiveMember bLiveMemberM97111G = hrk0Var.m136879r().m97111G(bLiveVoiceCall.user);
        int i = bLiveVoiceCall.position;
        if (i < 0 || i >= this.f53094e.size()) {
            fhw.m125605a("[voice][call]", "illegal call,id=" + bLiveVoiceCall.f45333id + ",position:" + bLiveVoiceCall.position);
            return;
        }
        if (nsvVarM136874m != null) {
            this.f53094e.get(bLiveVoiceCall.position).mo78083c(bLiveVoiceCall, bLiveMemberM97111G, nsvVarM136874m, this.f53093d);
            BLiveCallConnection bLiveCallConnection = (BLiveCallConnection) jyb.m147529r(bLiveMemberM97111G.callConnections, new qcj() { // from class: l.ct2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return BaseVoiceVirtualDeputyWidgetView.m78063h0(hrk0Var, bLiveVoiceCall, (BLiveCallConnection) obj);
                }
            });
            m78073p0(bLiveVoiceCall, bLiveCallConnection != null ? bLiveCallConnection.horizontalEffectSvga : "");
        }
    }

    public BaseVoiceVirtualDeputyWidgetView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53094e = new ArrayList();
    }

    public BaseVoiceVirtualDeputyWidgetView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53094e = new ArrayList();
    }
}
