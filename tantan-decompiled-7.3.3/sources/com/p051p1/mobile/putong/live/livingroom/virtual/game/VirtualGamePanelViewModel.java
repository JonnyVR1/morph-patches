package com.p051p1.mobile.putong.live.livingroom.virtual.game;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import p151v.VLinear;
import p153l.bnl0;
import p153l.iam;
import p153l.k0m0;
import p153l.mdc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualGamePanelViewModel extends VLinear implements iam<k0m0> {

    /* JADX INFO: renamed from: c */
    public TouchSwallowView f53142c;

    /* JADX INFO: renamed from: d */
    public VirtualVoiceMembersView f53143d;

    /* JADX INFO: renamed from: e */
    public k0m0 f53144e;

    public VirtualGamePanelViewModel(Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(k0m0 k0m0Var) {
        this.f53144e = k0m0Var;
    }

    /* JADX INFO: renamed from: Q */
    public void m78137Q() {
        this.f53142c.setLayoutParams(new LinearLayout.LayoutParams(bnl0.f77544e, bnl0.m105588w0() - qa00.m175859d(351.0f)));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53142c = (TouchSwallowView) findViewById(mdc0.f136083W1);
        this.f53143d = (VirtualVoiceMembersView) findViewById(mdc0.f136076V3);
    }

    public void setSwallowTarget(LiveBaseFrag liveBaseFrag) {
        if (liveBaseFrag instanceof RoomFrag) {
            RoomFrag roomFrag = (RoomFrag) liveBaseFrag;
            this.f53142c.setSwallowTarget(roomFrag.f48586A.f162994b);
            this.f53143d.setSwallowTarget(roomFrag.f48586A.f162994b);
        }
    }

    public VirtualGamePanelViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualGamePanelViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
