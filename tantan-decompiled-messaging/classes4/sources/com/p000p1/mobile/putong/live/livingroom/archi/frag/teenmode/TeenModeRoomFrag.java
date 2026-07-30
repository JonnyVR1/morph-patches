package com.p000p1.mobile.putong.live.livingroom.archi.frag.teenmode;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p1.mobile.putong.live.base.view.LiveSquareMediaView;
import l.e30;
import l.s7m;
import l.xdl0;
import p002l.sgi0;
import p002l.tgi0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TeenModeRoomFrag extends PutongFrag implements s7m<tgi0> {

    /* JADX INFO: renamed from: A */
    public VImage f3790A;

    /* JADX INFO: renamed from: B */
    public tgi0 f3791B;

    /* JADX INFO: renamed from: z */
    public LiveSquareMediaView f3792z;

    /* JADX INFO: renamed from: P4 */
    public static PutongFrag m5189P4(AudienceStartData audienceStartData) {
        TeenModeRoomFrag teenModeRoomFrag = new TeenModeRoomFrag();
        Bundle bundle = new Bundle();
        bundle.putSerializable("LIVE_AUDIENCE_START_DATA", audienceStartData);
        teenModeRoomFrag.setArguments(bundle);
        return teenModeRoomFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R4 */
    public void m5190R4(Bundle bundle) {
        this.f3792z.o(getArguments().getSerializable("LIVE_AUDIENCE_START_DATA").live.streamUrl.pullFlv, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S4 */
    public /* synthetic */ void m5191S4(View view) {
        act().finish();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5192C0() {
        return act();
    }

    /* JADX INFO: renamed from: O4 */
    public View m5193O4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sgi0.m22467b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d4 */
    public void m5195d4() {
        super.d4();
        tgi0 tgi0Var = new tgi0(this);
        this.f3791B = tgi0Var;
        tgi0Var.C(this);
        this.f3791B.m22957Z();
    }

    public void destroy() {
        this.f3792z.q();
    }

    /* JADX INFO: renamed from: f4 */
    public void m5196f4() {
        super.f4();
        this.f3791B.a0();
        creates(new e30() { // from class: l.rgi0
            public final void call(Object obj) {
                this.f18510a.m5190R4((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public void m5197g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        xdl0.E0(this.f3790A, new View.OnClickListener() { // from class: l.qgi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17982a.m5191S4(view);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM5193O4 = m5193O4(layoutInflater, viewGroup);
        this.f3792z.setNeedAdjustUI(true);
        return viewM5193O4;
    }

    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public void m5198i1(tgi0 tgi0Var) {
    }
}
