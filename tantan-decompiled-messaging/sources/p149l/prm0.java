package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.longlink.msg.liveroom.VoiceLiveManager;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.call.api.VCallApiProvider;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes5.dex */
public class prm0 extends hem0<nnn0, erm0> {

    /* JADX INFO: renamed from: j */
    public zem0 f150935j;

    public prm0(bsm bsmVar, zem0 zem0Var) {
        super(bsmVar);
        mo51532C(new erm0(bsmVar.f77095a));
        this.f150935j = zem0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ C22306c m171048h4(roj0 roj0Var) {
        return ((nnn0) m206027E2()).m160255S3();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        ((erm0) this.viewModel).m117862j(this.f188512e.f77095a);
        m207199N3(((nnn0) m206027E2()).m132151m2().onErrorReturn(new w9j() { // from class: l.frm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.grm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f104076a.m171048h4((roj0) obj);
            }
        })).filter(new w9j() { // from class: l.hrm0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                lyn0 lyn0Var = (lyn0) obj;
                return Boolean.valueOf((lyn0Var == null || vwb.m200296J(lyn0Var.f130587a)) ? false : true);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.irm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114658a.m171053i4((lyn0) obj);
            }
        }));
        m207199N3(((nnn0) m206027E2()).m160255S3()).subscribe(ffw.m121197h(new e30() { // from class: l.jrm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119425a.m171049j4((lyn0) obj);
            }
        }));
        m207199N3(((nnn0) m206027E2()).m160251Q2()).filter(new krm0()).subscribe(ffw.m121193d(new e30() { // from class: l.lrm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129736a.m171054k4((bik0.C15867a) obj);
            }
        }));
        duringCreated(((nnn0) m206027E2()).m132160q1().f170434c0).subscribe(ffw.m121197h(new e30() { // from class: l.mrm0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135389a.m171055l4((VoiceLiveManager.VoiceManagerUpdate) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j4 */
    public /* synthetic */ void m171049j4(lyn0 lyn0Var) {
        ((erm0) this.viewModel).m117860f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o4 */
    private void m171050o4() {
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) m206027E2()).mo149813j();
        if (bLiveVoiceMo149813j == null) {
            return;
        }
        ((nnn0) m206027E2()).m132154n2();
        ((nnn0) m206027E2()).mo132080N1(bLiveVoiceMo149813j.room.f44419id);
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.hem0
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public bfm0 mo130654S3() {
        return new bfm0(ypv.f199497e.getString(R$string.f47026Vh), ((erm0) this.viewModel).m117861i(), 2);
    }

    @Override // p149l.hem0
    /* JADX INFO: renamed from: T3 */
    public int mo130655T3() {
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.hem0
    /* JADX INFO: renamed from: U3 */
    public void mo130656U3() {
        super.mo130656U3();
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) m206027E2()).mo149813j();
        if (bLiveVoiceMo149813j == null) {
            return;
        }
        ((nnn0) m206027E2()).m160233D3(bLiveVoiceMo149813j.room.f44419id);
    }

    @Override // p149l.hem0
    /* JADX INFO: renamed from: V3 */
    public void mo130657V3() {
        m171050o4();
    }

    /* JADX INFO: renamed from: f4, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m171057n4(String str, BLiveVoiceCallInvite bLiveVoiceCallInvite) {
        lsi0.m151595y(w8u.m202217t(R$string.f47546tf));
        ((erm0) this.viewModel).m117868s(str, bLiveVoiceCallInvite);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g4 */
    public void m171052g4(final String str) {
        zem0 zem0Var = this.f150935j;
        if (zem0Var == null || zem0Var.m218370h4() == -1) {
            m207199N3(VCallApiProvider.callInvite(((nnn0) m206027E2()).m149814k(), str)).subscribe(ffw.m121194e(new e30() { // from class: l.orm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145339a.m171057n4(str, (BLiveVoiceCallInvite) obj);
                }
            }, new ult()));
        } else {
            m207199N3(VCallApiProvider.callInvite(((nnn0) m206027E2()).m149814k(), str, this.f150935j.m218370h4())).subscribe(ffw.m121194e(new e30() { // from class: l.nrm0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f140205a.m171056m4(str, (BLiveVoiceCallInvite) obj);
                }
            }, new z2k()));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m171053i4(lyn0 lyn0Var) {
        ((erm0) this.viewModel).m117867q(lyn0Var.f130587a, null, ((nnn0) m206027E2()).mo149813j().liveMode);
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m171054k4(bik0.C15867a c15867a) {
        mo130657V3();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m171055l4(VoiceLiveManager.VoiceManagerUpdate voiceManagerUpdate) {
        mo130657V3();
    }
}
