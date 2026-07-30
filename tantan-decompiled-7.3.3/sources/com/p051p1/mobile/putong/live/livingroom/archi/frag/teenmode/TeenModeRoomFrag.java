package com.p051p1.mobile.putong.live.livingroom.archi.frag.teenmode;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p151v.VImage;
import p153l.bnl0;
import p153l.iam;
import p153l.spi0;
import p153l.tpi0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class TeenModeRoomFrag extends PutongFrag implements iam<tpi0> {

    /* JADX INFO: renamed from: A */
    public VImage f48596A;

    /* JADX INFO: renamed from: B */
    public tpi0 f48597B;

    /* JADX INFO: renamed from: z */
    public LiveSquareMediaView f48598z;

    /* JADX INFO: renamed from: P4 */
    public static PutongFrag m73001P4(AudienceStartData audienceStartData) {
        TeenModeRoomFrag teenModeRoomFrag = new TeenModeRoomFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable(AudienceStartData.LIVE_AUDIENCE_START_DATA, audienceStartData);
        teenModeRoomFrag.setArguments(bundle);
        return teenModeRoomFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public void m73002R4(Bundle bundle) {
        this.f48598z.m69952k(((AudienceStartData) getArguments().getSerializable(AudienceStartData.LIVE_AUDIENCE_START_DATA)).live.streamUrl.pullFlv, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m73003S4(View view) {
        act().lambda$debugItems$19();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    /* JADX INFO: renamed from: O4 */
    public View m73004O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return spi0.m187345b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        tpi0 tpi0Var = new tpi0(this);
        this.f48597B = tpi0Var;
        tpi0Var.mo52715C(this);
        this.f48597B.mo40472Z();
    }

    @Override // p153l.iam
    public void destroy() {
        this.f48598z.m69958q();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f48597B.mo40473a0();
        creates(new y20() { // from class: l.rpi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164372a.m73002R4((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        bnl0.m105509E0(this.f48596A, new View.OnClickListener() { // from class: l.qpi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158874a.m73003S4(view);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM73004O4 = m73004O4(layoutInflater, viewGroup);
        this.f48598z.setNeedAdjustUI(true);
        return viewM73004O4;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(tpi0 tpi0Var) {
    }
}
