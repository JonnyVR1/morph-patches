package com.p046p1.mobile.putong.live.livingroom.archi.frag.teenmode;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.view.LiveSquareMediaView;
import p147v.VImage;
import p149l.e30;
import p149l.s7m;
import p149l.sgi0;
import p149l.tgi0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class TeenModeRoomFrag extends PutongFrag implements s7m<tgi0> {

    /* JADX INFO: renamed from: A */
    public VImage f47748A;

    /* JADX INFO: renamed from: B */
    public tgi0 f47749B;

    /* JADX INFO: renamed from: z */
    public LiveSquareMediaView f47750z;

    /* JADX INFO: renamed from: P4 */
    public static PutongFrag m71818P4(AudienceStartData audienceStartData) {
        TeenModeRoomFrag teenModeRoomFrag = new TeenModeRoomFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable(AudienceStartData.LIVE_AUDIENCE_START_DATA, audienceStartData);
        teenModeRoomFrag.setArguments(bundle);
        return teenModeRoomFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public void m71819R4(Bundle bundle) {
        this.f47750z.m68769k(((AudienceStartData) getArguments().getSerializable(AudienceStartData.LIVE_AUDIENCE_START_DATA)).live.streamUrl.pullFlv, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m71820S4(View view) {
        act().lambda$debugItems$19();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return act();
    }

    /* JADX INFO: renamed from: O4 */
    public View m71821O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sgi0.m184087b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        tgi0 tgi0Var = new tgi0(this);
        this.f47749B = tgi0Var;
        tgi0Var.mo51532C(this);
        this.f47749B.mo39469Z();
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f47750z.m68775q();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f47749B.mo39470a0();
        creates(new e30() { // from class: l.rgi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159255a.m71819R4((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        xdl0.m208329E0(this.f47748A, new View.OnClickListener() { // from class: l.qgi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154339a.m71820S4(view);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM71821O4 = m71821O4(layoutInflater, viewGroup);
        this.f47750z.setNeedAdjustUI(true);
        return viewM71821O4;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tgi0 tgi0Var) {
    }
}
