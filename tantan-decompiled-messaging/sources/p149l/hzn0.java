package p149l;

import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveVoice;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class hzn0 extends dyn0<nnn0, lzn0> {
    public hzn0(bsm bsmVar) {
        super(bsmVar);
        mo51532C(new lzn0(bsmVar.f77095a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ C22306c m133713b4(roj0 roj0Var) {
        return ((nnn0) m206027E2()).m160255S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m133714c4(lyn0 lyn0Var) {
        ((lzn0) this.viewModel).m152361l(lyn0Var.f130587a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m133715d4(lyn0 lyn0Var) {
        ((lzn0) this.viewModel).m152358e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e4 */
    private void m133716e4() {
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) m206027E2()).mo149813j();
        if (bLiveVoiceMo149813j == null) {
            return;
        }
        ((nnn0) m206027E2()).m132154n2();
        ((nnn0) m206027E2()).mo132080N1(bLiveVoiceMo149813j.room.f44419id);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        ((lzn0) this.viewModel).init();
        m207199N3(((nnn0) m206027E2()).m132151m2().onErrorReturn(new w9j() { // from class: l.czn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        }).flatMap(new w9j() { // from class: l.dzn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f88497a.m133713b4((roj0) obj);
            }
        })).filter(new w9j() { // from class: l.ezn0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                lyn0 lyn0Var = (lyn0) obj;
                return Boolean.valueOf((lyn0Var == null || vwb.m200296J(lyn0Var.f130587a)) ? false : true);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.fzn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99982a.m133714c4((lyn0) obj);
            }
        }));
        m207199N3(((nnn0) m206027E2()).m160255S3()).subscribe(ffw.m121197h(new e30() { // from class: l.gzn0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105160a.m133715d4((lyn0) obj);
            }
        }));
    }

    @Override // p149l.x6s
    /* JADX INFO: renamed from: P3 */
    public void mo99576P3() {
        super.mo99576P3();
        init();
    }

    @Override // p149l.dyn0
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public qzn0 mo114083S3() {
        return new qzn0(ypv.f199497e.getString(R$string.f47234fa), ((lzn0) this.viewModel).m152359f(), 2);
    }

    @Override // p149l.dyn0
    /* JADX INFO: renamed from: T3 */
    public int mo114084T3() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.dyn0
    /* JADX INFO: renamed from: U3 */
    public void mo114085U3() {
        super.mo114085U3();
        BLiveVoice bLiveVoiceMo149813j = ((nnn0) m206027E2()).mo149813j();
        if (bLiveVoiceMo149813j == null) {
            return;
        }
        ((nnn0) m206027E2()).m160233D3(bLiveVoiceMo149813j.room.f44419id);
    }

    @Override // p149l.dyn0
    /* JADX INFO: renamed from: V3 */
    public void mo114086V3() {
        m133716e4();
    }
}
