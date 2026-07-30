package com.p000p1.mobile.putong.feed.newui.photoalbum.momentdetail;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p000p1.mobile.putong.feed.data.RawFeed;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.e30;
import l.j760;
import l.xaj0;
import p007l.ec00;
import p007l.ya00;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentDetailFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public ec00 f3555A;

    /* JADX INFO: renamed from: B */
    public Links f3556B;

    /* JADX INFO: renamed from: C */
    public e30<Moment> f3557C;

    /* JADX INFO: renamed from: z */
    public ya00 f3558z;

    /* JADX INFO: renamed from: N4 */
    public static MomentDetailFrag m5953N4(String str, String str2, String str3, boolean z, int i, boolean z2, String str4, boolean z3, boolean z4, String str5, String str6, boolean z5, RawFeed rawFeed, String str7) {
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
    private void m5954O4() {
        this.f3558z = new ya00(this);
        ec00 ec00Var = new ec00(this);
        this.f3555A = ec00Var;
        this.f3558z.C(ec00Var);
    }

    /* JADX INFO: renamed from: M4 */
    public void m5955M4(e30<Boolean> e30Var) {
        this.f3558z.m17041G0(e30Var);
    }

    /* JADX INFO: renamed from: P4 */
    public void m5956P4() {
        this.f3555A.m9782d0();
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m5957Q4() {
        return this.f3558z.m17050S0();
    }

    /* JADX INFO: renamed from: R4 */
    public void m5958R4() {
        if (this.f3558z == null) {
            m5954O4();
        }
        this.f3558z.f15363u = true;
    }

    /* JADX INFO: renamed from: S4 */
    public void m5959S4() {
        this.f3558z.m17066n1();
    }

    /* JADX INFO: renamed from: T4 */
    public void m5960T4(MomentMessage momentMessage) {
        this.f3558z.m17067o1(momentMessage);
    }

    /* JADX INFO: renamed from: U4 */
    public void m5961U4(MomentMessage momentMessage) {
        this.f3558z.m17068p1(momentMessage);
    }

    /* JADX INFO: renamed from: V4 */
    public void m5962V4(xaj0<Links, List<MomentMessage>, List<StickerInfo>> xaj0Var) {
        this.f3555A.m9761Q0((Links) xaj0Var.a);
        this.f3558z.m17069q1(xaj0Var);
        this.f3556B = this.f3558z.f15351i;
    }

    /* JADX INFO: renamed from: W4 */
    public void m5963W4(j760<List<StickerInfo>, List<MomentMessage>> j760Var) {
        this.f3558z.m17070r1(j760Var);
    }

    /* JADX INFO: renamed from: X4 */
    public void m5964X4() {
        this.f3555A.m9767T0();
    }

    /* JADX INFO: renamed from: Y4 */
    public void m5965Y4(xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>> xaj0Var) {
        this.f3558z.m17071s1(xaj0Var);
        this.f3556B = this.f3558z.f15351i;
        if (NullChecker.a(this.f3557C)) {
            this.f3557C.call((Moment) xaj0Var.a);
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public void m5966Z4(Throwable th) {
        this.f3555A.m9771V0(th);
    }

    /* JADX INFO: renamed from: a5 */
    public void m5967a5() {
        this.f3558z.m17072u1();
    }

    /* JADX INFO: renamed from: b5 */
    public void m5968b5(MomentMessage momentMessage, String str) {
        this.f3555A.m9789h1(momentMessage, str);
    }

    /* JADX INFO: renamed from: f4 */
    public void m5969f4() {
        super.f4();
        m5954O4();
        this.f3558z.m17053a0();
        this.f3555A.m9778a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m5970g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        this.f3555A.m9780b0(bundle);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f3555A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public void m5971o() {
        this.f3555A.m9756N0(false);
    }

    public void onStop() {
        super/*com.p1.mobile.android.app.Frag*/.onStop();
        this.f3555A.m9770V();
    }
}
