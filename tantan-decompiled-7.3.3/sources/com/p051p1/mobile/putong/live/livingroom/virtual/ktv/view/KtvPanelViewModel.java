package com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LiveBaseFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomFrag;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.member.VirtualVoiceMembersView;
import p151v.VLinear;
import p153l.a5r;
import p153l.iam;
import p153l.mdc0;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class KtvPanelViewModel extends VLinear implements iam<a5r> {

    /* JADX INFO: renamed from: c */
    public KtvNewStageView f53290c;

    /* JADX INFO: renamed from: d */
    public VirtualVoiceMembersView f53291d;

    public KtvPanelViewModel(Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return layoutInflater.inflate(yec0.f199208p9, viewGroup);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53290c = (KtvNewStageView) findViewById(mdc0.f136093X2);
        this.f53291d = (VirtualVoiceMembersView) findViewById(mdc0.f136076V3);
    }

    public void setMemberSwallow(@org.jetbrains.annotations.Nullable LiveBaseFrag liveBaseFrag) {
        VirtualVoiceMembersView virtualVoiceMembersView = this.f53291d;
        if (virtualVoiceMembersView == null || !(liveBaseFrag instanceof RoomFrag)) {
            return;
        }
        virtualVoiceMembersView.setSwallowTarget(((RoomFrag) liveBaseFrag).f48586A.f162994b);
    }

    public KtvPanelViewModel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public KtvPanelViewModel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(a5r a5rVar) {
    }
}
