package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveVoice;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class dom0 extends lnm0<rwn0, qnm0> {

    /* JADX INFO: renamed from: j */
    public int f89970j;

    /* JADX INFO: renamed from: k */
    public int f89971k;

    public dom0(dum dumVar) {
        super(dumVar);
        this.f89971k = -1;
        mo52715C(new qnm0(dumVar.f90815a, this));
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m117310W3(List list, uwl uwlVar) {
        if (uwlVar instanceof lnm0) {
            list.add(((lnm0) uwlVar).mo154984S3());
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m117311X3(int i, uwl uwlVar) {
        if (uwlVar instanceof lnm0) {
            lnm0 lnm0Var = (lnm0) uwlVar;
            if (lnm0Var.mo154985T3() == i) {
                lnm0Var.mo154987V3();
            }
        }
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ int m117316c4(fom0 fom0Var, fom0 fom0Var2) {
        return fom0Var2.m126476a() - fom0Var.m126476a();
    }

    /* JADX INFO: renamed from: p4 */
    private void m117320p4(final int i) {
        HashMap<String, uwl> map = this.f130285b;
        if (map == null) {
            return;
        }
        jyb.m147537z(map.values(), new y20() { // from class: l.aom0
            @Override // p153l.y20
            public final void call(Object obj) {
                dom0.m117311X3(i, (uwl) obj);
            }
        });
    }

    @Override // p153l.y8s
    /* JADX INFO: renamed from: R3 */
    public void mo103124R3() {
        super.mo103124R3();
        m153103z2(new t0n0(this.f196918e, this));
        m153103z2(new wvm0(this.f196918e));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().VoiceApplyManagerEvent.show().m199270g()).map(new qcj() { // from class: l.tnm0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f175297a.m117325k4((snm0) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.unm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f179749a.m117326l4((snm0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m117321g4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) m213810E2()).mo183435j();
        if (wft.m206159b(3) || !((qnm0) this.viewModel).isShowing() || !TextUtils.equals(bLiveVoiceMo183435j.onCallView, BLiveVoice.NINE_DEPUTY_STRATEGY) || voiceManagerUpdate == null || voiceManagerUpdate.getType() == null || !zrv.f205799a.m207631D0().equals(voiceManagerUpdate.getUserId())) {
            return;
        }
        ((qnm0) this.viewModel).m177246S(voiceManagerUpdate.getType() != VoiceLiveManager.VoiceManagerUpdate.UpdateType.Remove);
    }

    /* JADX INFO: renamed from: h4 */
    public int m117322h4() {
        return this.f89971k;
    }

    /* JADX INFO: renamed from: i4 */
    public List<fom0> m117323i4() {
        final ArrayList arrayList = new ArrayList();
        jyb.m147537z(this.f130285b.values(), new y20() { // from class: l.ynm0
            @Override // p153l.y20
            public final void call(Object obj) {
                dom0.m117310W3(arrayList, (uwl) obj);
            }
        });
        Collections.sort(arrayList, new Comparator() { // from class: l.znm0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return dom0.m117316c4((fom0) obj, (fom0) obj2);
            }
        });
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public boolean m117324j4() {
        BLiveVoice bLiveVoiceMo183435j = ((rwn0) m213810E2()).mo183435j();
        if (wft.m206159b(3) || !TextUtils.equals(bLiveVoiceMo183435j.onCallView, BLiveVoice.NINE_DEPUTY_STRATEGY)) {
            return false;
        }
        return ((rwn0) m213810E2()).mo118373p() || i9o0.m139137h(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ snm0 m117325k4(snm0 snm0Var) {
        this.f89971k = snm0Var.f169742b;
        return snm0Var;
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m117326l4(snm0 snm0Var) {
        m117331r4(snm0Var.f169741a);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m117327m4(BLiveEnvelope bLiveEnvelope) {
        ((qnm0) this.viewModel).mo73021p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m117328n4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        ((rwn0) m213810E2()).mo183440n().freeCall = voiceFreeCallUpdate.getFreeCall();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m117329o4(jsv jsvVar) {
        if (((qnm0) this.viewModel).isShowing() && jsvVar.m146875a() == 4) {
            ((qnm0) this.viewModel).mo73021p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m117330q4() {
        duringCreated(VoiceRoomApiProvider.resetPopularity(((rwn0) m213810E2()).m202191k())).subscribe(dhw.m115826e(new y20() { // from class: l.bom0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f77695a.m117327m4((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.com0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165634h(R$string.f47829Te);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public void m117331r4(int i) {
        ((qnm0) this.viewModel).m177248U(i);
        m117332s4(i);
    }

    /* JADX INFO: renamed from: s4 */
    public void m117332s4(int i) {
        this.f89970j = i;
        m117320p4(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((rwn0) m213810E2()).m168545q1().m98270a1()).subscribe(dhw.m115825d(new y20() { // from class: l.vnm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184901a.m117328n4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m168545q1().f71701c0).subscribe(dhw.m115829h(new y20() { // from class: l.wnm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f189967a.m117321g4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        duringCreated(((rwn0) m213810E2()).m202192l()).subscribe(dhw.m115825d(new y20() { // from class: l.xnm0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195422a.m117329o4((jsv) obj);
            }
        }));
    }
}
