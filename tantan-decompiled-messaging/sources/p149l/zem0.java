package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class zem0 extends hem0<nnn0, mem0> {

    /* JADX INFO: renamed from: j */
    public int f202850j;

    /* JADX INFO: renamed from: k */
    public int f202851k;

    public zem0(bsm bsmVar) {
        super(bsmVar);
        this.f202851k = -1;
        mo51532C(new mem0(bsmVar.f77095a, this));
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m218358W3(List list, gul gulVar) {
        if (gulVar instanceof hem0) {
            list.add(((hem0) gulVar).mo130654S3());
        }
    }

    /* JADX INFO: renamed from: X3 */
    public static /* synthetic */ void m218359X3(int i, gul gulVar) {
        if (gulVar instanceof hem0) {
            hem0 hem0Var = (hem0) gulVar;
            if (hem0Var.mo130655T3() == i) {
                hem0Var.mo130657V3();
            }
        }
    }

    /* JADX INFO: renamed from: c4 */
    public static /* synthetic */ int m218364c4(bfm0 bfm0Var, bfm0 bfm0Var2) {
        return bfm0Var2.m101547a() - bfm0Var.m101547a();
    }

    /* JADX INFO: renamed from: p4 */
    private void m218368p4(final int i) {
        HashMap<String, gul> map = this.f121122b;
        if (map == null) {
            return;
        }
        vwb.m200354z(map.values(), new e30() { // from class: l.wem0
            @Override // p149l.e30
            public final void call(Object obj) {
                zem0.m218359X3(i, (gul) obj);
            }
        });
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: R3 */
    public void mo96985R3() {
        super.mo96985R3();
        m144512z2(new prm0(this.f188512e, this));
        m144512z2(new smm0(this.f188512e));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().VoiceApplyManagerEvent.show().m172460g()).map(new w9j() { // from class: l.pem0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f148460a.m218373k4((oem0) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.qem0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f154044a.m218374l4((oem0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public final void m218369g4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) m206027E2()).mo149813j();
        if (vdt.m198092b(3) || !((mem0) this.viewModel).isShowing() || !TextUtils.equals(bLiveVoiceMo149813j.onCallView, BLiveVoice.NINE_DEPUTY_STRATEGY) || voiceManagerUpdate == null || voiceManagerUpdate.getType() == null || !ypv.f199493a.m199309D0().equals(voiceManagerUpdate.getUserId())) {
            return;
        }
        ((mem0) this.viewModel).m154270S(voiceManagerUpdate.getType() != VoiceLiveManager.VoiceManagerUpdate.UpdateType.Remove);
    }

    /* JADX INFO: renamed from: h4 */
    public int m218370h4() {
        return this.f202851k;
    }

    /* JADX INFO: renamed from: i4 */
    public List<bfm0> m218371i4() {
        final ArrayList arrayList = new ArrayList();
        vwb.m200354z(this.f121122b.values(), new e30() { // from class: l.uem0
            @Override // p149l.e30
            public final void call(Object obj) {
                zem0.m218358W3(arrayList, (gul) obj);
            }
        });
        Collections.sort(arrayList, new Comparator() { // from class: l.vem0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return zem0.m218364c4((bfm0) obj, (bfm0) obj2);
            }
        });
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j4 */
    public boolean m218372j4() {
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) m206027E2()).mo149813j();
        if (vdt.m198092b(3) || !TextUtils.equals(bLiveVoiceMo149813j.onCallView, BLiveVoice.NINE_DEPUTY_STRATEGY)) {
            return false;
        }
        return ((nnn0) m206027E2()).mo97490p() || e0o0.m114322h(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ oem0 m218373k4(oem0 oem0Var) {
        this.f202851k = oem0Var.f143350b;
        return oem0Var;
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m218374l4(oem0 oem0Var) {
        m218379r4(oem0Var.f143349a);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m218375m4(BLiveEnvelope bLiveEnvelope) {
        ((mem0) this.viewModel).mo71838p();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m218376n4(VoiceLiveManager.VoiceFreeCallUpdate voiceFreeCallUpdate) {
        ((nnn0) m206027E2()).mo149817n().freeCall = voiceFreeCallUpdate.getFreeCall();
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m218377o4(iqv iqvVar) {
        if (((mem0) this.viewModel).isShowing() && iqvVar.m137794a() == 4) {
            ((mem0) this.viewModel).mo71838p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q4 */
    public void m218378q4() {
        duringCreated(VoiceRoomApiProvider.resetPopularity(((nnn0) m206027E2()).m149814k())).subscribe(ffw.m121194e(new e30() { // from class: l.xem0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f192612a.m218375m4((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.yem0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151578h(R$string.f46981Te);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public void m218379r4(int i) {
        ((mem0) this.viewModel).m154272U(i);
        m218380s4(i);
    }

    /* JADX INFO: renamed from: s4 */
    public void m218380s4(int i) {
        this.f202850j = i;
        m218368p4(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((nnn0) m206027E2()).m132160q1().m189088a1()).subscribe(ffw.m121193d(new e30() { // from class: l.rem0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159072a.m218376n4((VoiceLiveManager.VoiceFreeCallUpdate) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().f170434c0).subscribe(ffw.m121197h(new e30() { // from class: l.sem0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164022a.m218369g4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m149815l()).subscribe(ffw.m121193d(new e30() { // from class: l.tem0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169859a.m218377o4((iqv) obj);
            }
        }));
    }
}
