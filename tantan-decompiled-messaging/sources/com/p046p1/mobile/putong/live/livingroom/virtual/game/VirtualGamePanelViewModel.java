package com.p046p1.mobile.putong.live.livingroom.virtual.game;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import p147v.VLinear;
import p149l.g5c0;
import p149l.grl0;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualGamePanelViewModel extends VLinear implements s7m<grl0> {

    /* JADX INFO: renamed from: c */
    public TouchSwallowView f52294c;

    /* JADX INFO: renamed from: d */
    public VirtualVoiceMembersView f52295d;

    /* JADX INFO: renamed from: e */
    public grl0 f52296e;

    public VirtualGamePanelViewModel(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(grl0 grl0Var) {
        this.f52296e = grl0Var;
    }

    /* JADX INFO: renamed from: Q */
    public void m76954Q() {
        this.f52294c.setLayoutParams(new LinearLayout.LayoutParams(xdl0.f192403e, xdl0.m208408w0() - t100.m186890d(351.0f)));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52294c = (TouchSwallowView) findViewById(g5c0.f100838W1);
        this.f52295d = (VirtualVoiceMembersView) findViewById(g5c0.f100831V3);
    }

    public void setSwallowTarget(LiveBaseFrag liveBaseFrag) {
        if (liveBaseFrag instanceof RoomFrag) {
            RoomFrag roomFrag = (RoomFrag) liveBaseFrag;
            this.f52294c.setSwallowTarget(roomFrag.f47738A.f142612b);
            this.f52295d.setSwallowTarget(roomFrag.f47738A.f142612b);
        }
    }

    public VirtualGamePanelViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualGamePanelViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
