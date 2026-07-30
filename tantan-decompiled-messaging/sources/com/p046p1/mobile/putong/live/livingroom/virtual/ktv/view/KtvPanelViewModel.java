package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import p147v.VLinear;
import p149l.g5c0;
import p149l.s7m;
import p149l.t6c0;
import p149l.z2r;

/* JADX INFO: loaded from: classes5.dex */
public class KtvPanelViewModel extends VLinear implements s7m<z2r> {

    /* JADX INFO: renamed from: c */
    public KtvNewStageView f52442c;

    /* JADX INFO: renamed from: d */
    public VirtualVoiceMembersView f52443d;

    public KtvPanelViewModel(Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(t6c0.f168476p9, viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f52442c = (KtvNewStageView) findViewById(g5c0.f100848X2);
        this.f52443d = (VirtualVoiceMembersView) findViewById(g5c0.f100831V3);
    }

    public void setMemberSwallow(@org.jetbrains.annotations.Nullable LiveBaseFrag liveBaseFrag) {
        VirtualVoiceMembersView virtualVoiceMembersView = this.f52443d;
        if (virtualVoiceMembersView == null || !(liveBaseFrag instanceof RoomFrag)) {
            return;
        }
        virtualVoiceMembersView.setSwallowTarget(((RoomFrag) liveBaseFrag).f47738A.f142612b);
    }

    public KtvPanelViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KtvPanelViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(z2r z2rVar) {
    }
}
