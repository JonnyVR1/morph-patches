package com.p051p1.mobile.putong.feed.newui.photoalbum.momentdetail;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.RawFeed;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.bkj0;
import p153l.hj00;
import p153l.nk00;
import p153l.pf60;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class MomentDetailFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public nk00 f42942A;

    /* JADX INFO: renamed from: B */
    public Links f42943B;

    /* JADX INFO: renamed from: C */
    public y20<Moment> f42944C;

    /* JADX INFO: renamed from: z */
    public hj00 f42945z;

    /* JADX INFO: renamed from: N4 */
    public static MomentDetailFrag m66039N4(String str, String str2, String str3, boolean z, int i, boolean z2, String str4, boolean z3, boolean z4, String str5, String str6, boolean z5, RawFeed rawFeed, String str7) {
        MomentDetailFrag momentDetailFrag = new MomentDetailFrag();
        Bundle bundle = new Bundle();
        bundle.putString("momentId", str2);
        bundle.putString("from", str);
        bundle.putString("momentOwner", str3);
        bundle.putBoolean("autoPlay", z);
        bundle.putBoolean("isHideComment", z2);
        bundle.putInt("initMediaIndex", i);
        bundle.putString("momentValue", str4);
        bundle.putBoolean("canGreeting", z3);
        bundle.putBoolean("start_home_card", z4);
        bundle.putString("msg_id", str5);
        bundle.putString("enterPage", str6);
        bundle.putBoolean("showInput", z5);
        bundle.putSerializable("rawFeed", rawFeed);
        if (!TextUtils.isEmpty(str7)) {
            bundle.putString("clickedMsgId", str7);
        }
        momentDetailFrag.setArguments(bundle);
        return momentDetailFrag;
    }

    /* JADX INFO: renamed from: O4 */
    private void m66040O4() {
        this.f42945z = new hj00(this);
        nk00 nk00Var = new nk00(this);
        this.f42942A = nk00Var;
        this.f42945z.mo52715C(nk00Var);
    }

    /* JADX INFO: renamed from: M4 */
    public void m66041M4(y20<Boolean> y20Var) {
        this.f42945z.m135284G0(y20Var);
    }

    /* JADX INFO: renamed from: P4 */
    public void m66042P4() {
        this.f42942A.m163562d0();
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m66043Q4() {
        return this.f42945z.m135293S0();
    }

    /* JADX INFO: renamed from: R4 */
    public void m66044R4() {
        if (this.f42945z == null) {
            m66040O4();
        }
        this.f42945z.f110139u = true;
    }

    /* JADX INFO: renamed from: S4 */
    public void m66045S4() {
        this.f42945z.m135308n1();
    }

    /* JADX INFO: renamed from: T4 */
    public void m66046T4(MomentMessage momentMessage) {
        this.f42945z.m135309o1(momentMessage);
    }

    /* JADX INFO: renamed from: U4 */
    public void m66047U4(MomentMessage momentMessage) {
        this.f42945z.m135310p1(momentMessage);
    }

    /* JADX INFO: renamed from: V4 */
    public void m66048V4(bkj0<Links, List<MomentMessage>, List<StickerInfo>> bkj0Var) {
        this.f42942A.m163541Q0(bkj0Var.f77081a);
        this.f42945z.m135311q1(bkj0Var);
        this.f42943B = this.f42945z.f110127i;
    }

    /* JADX INFO: renamed from: W4 */
    public void m66049W4(pf60<List<StickerInfo>, List<MomentMessage>> pf60Var) {
        this.f42945z.m135312r1(pf60Var);
    }

    /* JADX INFO: renamed from: X4 */
    public void m66050X4() {
        this.f42942A.m163547T0();
    }

    /* JADX INFO: renamed from: Y4 */
    public void m66051Y4(bkj0<Moment, pf60<List<StickerInfo>, List<MomentMessage>>, pf60<Music, RawFeed>> bkj0Var) {
        this.f42945z.m135313s1(bkj0Var);
        this.f42943B = this.f42945z.f110127i;
        if (NullChecker.m82486a(this.f42944C)) {
            this.f42944C.call(bkj0Var.f77081a);
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public void m66052Z4(Throwable th) {
        this.f42942A.m163551V0(th);
    }

    /* JADX INFO: renamed from: a5 */
    public void m66053a5() {
        this.f42945z.m135314u1();
    }

    /* JADX INFO: renamed from: b5 */
    public void m66054b5(MomentMessage momentMessage, String str) {
        this.f42942A.m163569h1(momentMessage, str);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m66040O4();
        this.f42945z.mo40473a0();
        this.f42942A.m163558a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        this.f42942A.m163560b0(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42942A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public void m66055o() {
        this.f42942A.m163536N0(false);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f42942A.m163550V();
    }
}
