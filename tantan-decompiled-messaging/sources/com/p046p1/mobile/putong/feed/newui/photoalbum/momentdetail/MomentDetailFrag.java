package com.p046p1.mobile.putong.feed.newui.photoalbum.momentdetail;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.RawFeed;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.e30;
import p149l.ec00;
import p149l.j760;
import p149l.xaj0;
import p149l.ya00;

/* JADX INFO: loaded from: classes12.dex */
public class MomentDetailFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public ec00 f42094A;

    /* JADX INFO: renamed from: B */
    public Links f42095B;

    /* JADX INFO: renamed from: C */
    public e30<Moment> f42096C;

    /* JADX INFO: renamed from: z */
    public ya00 f42097z;

    /* JADX INFO: renamed from: N4 */
    public static MomentDetailFrag m64856N4(String str, String str2, String str3, boolean z, int i, boolean z2, String str4, boolean z3, boolean z4, String str5, String str6, boolean z5, RawFeed rawFeed, String str7) {
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
    private void m64857O4() {
        this.f42097z = new ya00(this);
        ec00 ec00Var = new ec00(this);
        this.f42094A = ec00Var;
        this.f42097z.mo51532C(ec00Var);
    }

    /* JADX INFO: renamed from: M4 */
    public void m64858M4(e30<Boolean> e30Var) {
        this.f42097z.m213751G0(e30Var);
    }

    /* JADX INFO: renamed from: P4 */
    public void m64859P4() {
        this.f42094A.m115613d0();
    }

    /* JADX INFO: renamed from: Q4 */
    public boolean m64860Q4() {
        return this.f42097z.m213760S0();
    }

    /* JADX INFO: renamed from: R4 */
    public void m64861R4() {
        if (this.f42097z == null) {
            m64857O4();
        }
        this.f42097z.f197129u = true;
    }

    /* JADX INFO: renamed from: S4 */
    public void m64862S4() {
        this.f42097z.m213775n1();
    }

    /* JADX INFO: renamed from: T4 */
    public void m64863T4(MomentMessage momentMessage) {
        this.f42097z.m213776o1(momentMessage);
    }

    /* JADX INFO: renamed from: U4 */
    public void m64864U4(MomentMessage momentMessage) {
        this.f42097z.m213777p1(momentMessage);
    }

    /* JADX INFO: renamed from: V4 */
    public void m64865V4(xaj0<Links, List<MomentMessage>, List<StickerInfo>> xaj0Var) {
        this.f42094A.m115592Q0(xaj0Var.f191751a);
        this.f42097z.m213778q1(xaj0Var);
        this.f42095B = this.f42097z.f197117i;
    }

    /* JADX INFO: renamed from: W4 */
    public void m64866W4(j760<List<StickerInfo>, List<MomentMessage>> j760Var) {
        this.f42097z.m213779r1(j760Var);
    }

    /* JADX INFO: renamed from: X4 */
    public void m64867X4() {
        this.f42094A.m115598T0();
    }

    /* JADX INFO: renamed from: Y4 */
    public void m64868Y4(xaj0<Moment, j760<List<StickerInfo>, List<MomentMessage>>, j760<Music, RawFeed>> xaj0Var) {
        this.f42097z.m213780s1(xaj0Var);
        this.f42095B = this.f42097z.f197117i;
        if (NullChecker.m81303a(this.f42096C)) {
            this.f42096C.call(xaj0Var.f191751a);
        }
    }

    /* JADX INFO: renamed from: Z4 */
    public void m64869Z4(Throwable th) {
        this.f42094A.m115602V0(th);
    }

    /* JADX INFO: renamed from: a5 */
    public void m64870a5() {
        this.f42097z.m213781u1();
    }

    /* JADX INFO: renamed from: b5 */
    public void m64871b5(MomentMessage momentMessage, String str) {
        this.f42094A.m115620h1(momentMessage, str);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m64857O4();
        this.f42097z.mo39470a0();
        this.f42094A.m115609a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        this.f42094A.m115611b0(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42094A.inflateView(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public void m64872o() {
        this.f42094A.m115587N0(false);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.f42094A.m115601V();
    }
}
