package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p1.mobile.putong.live.livingroom.R;
import com.p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import com.tantanapp.common.data.DbObject;
import l.bik0;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.krm0;
import l.lsi0;
import l.nnn0;
import l.ult;
import l.vwb;
import l.w8u;
import l.w9j;
import p009l.fcy;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ecy<D extends nnn0, VM extends fcy> extends gay<D, VM> {
    public ecy(bsm<D> bsmVar, VM vm) {
        super(bsmVar);
        C(vm);
    }

    /* JADX INFO: renamed from: i4 */
    private void m13816i4() {
        BLiveVoice bLiveVoiceV2 = E2().V2();
        if (bLiveVoiceV2 == null) {
            return;
        }
        E2().N1(((BLiveAbsData) bLiveVoiceV2).room.id);
    }

    /* JADX INFO: renamed from: O3 */
    public void m13817O3() {
        super.O3();
    }

    /* JADX INFO: renamed from: P3 */
    public void m13818P3() {
        super.P3();
        init();
    }

    @Override // p009l.gay
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public vay mo13819S3() {
        return new vay("在线", ((fcy) ((bwr) this).viewModel).m14378b(), 0);
    }

    @Override // p009l.gay
    /* JADX INFO: renamed from: T3 */
    public int mo13820T3() {
        return 0;
    }

    @Override // p009l.gay
    /* JADX INFO: renamed from: U3 */
    public void mo13821U3() {
        super.mo13821U3();
        BLiveVoice bLiveVoiceV2 = E2().V2();
        if (bLiveVoiceV2 == null) {
            return;
        }
        E2().D3(((BLiveAbsData) bLiveVoiceV2).room.id);
    }

    @Override // p009l.gay
    /* JADX INFO: renamed from: V3 */
    public void mo13822V3() {
        m13816i4();
    }

    /* JADX INFO: renamed from: c4, reason: merged with bridge method [inline-methods] */
    public final void m13828h4(String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        lsi0.y(w8u.t(R.string.tf));
        ((fcy) ((bwr) this).viewModel).m14380d(str, bLiveVoiceCallInvite);
    }

    /* JADX INFO: renamed from: d4 */
    public void m13824d4(final String str) {
        hby.m15516b(E2().p(), ((DbObject) E2().l0()).id, E2().k(), "management_host");
        N3(VCallApiProvider.callInvite(E2().k(), str)).subscribe(ffw.e(new e30() { // from class: l.dcy
            public final void call(Object obj) {
                this.f11769a.m13828h4(str, (BLiveVoiceCallInvite) obj);
            }
        }, new ult()));
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m13825e4(lyn0 lyn0Var) {
        ((fcy) ((bwr) this).viewModel).m14379c(lyn0Var);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m13826f4(bik0.a aVar) {
        mo13822V3();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m13827g4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        mo13822V3();
    }

    public void init() {
        ((fcy) ((bwr) this).viewModel).init();
        N3(E2().S3()).filter(new w9j() { // from class: l.zby
            public final Object call(Object obj) {
                lyn0 lyn0Var = (lyn0) obj;
                return Boolean.valueOf((lyn0Var == null || vwb.J(lyn0Var.f16447a)) ? false : true);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.acy
            public final void call(Object obj) {
                this.f9407a.m13825e4((lyn0) obj);
            }
        }));
        N3(E2().Q2()).filter(new krm0()).subscribe(ffw.d(new e30() { // from class: l.bcy
            public final void call(Object obj) {
                this.f10018a.m13826f4((bik0.a) obj);
            }
        }));
        duringCreated(E2().q1().c0).subscribe(ffw.h(new e30() { // from class: l.ccy
            public final void call(Object obj) {
                this.f10541a.m13827g4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        m13816i4();
    }
}
