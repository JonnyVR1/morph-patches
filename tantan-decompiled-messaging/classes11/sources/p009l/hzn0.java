package p009l;

import androidx.annotation.NonNull;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveVoice;
import com.p1.mobile.putong.live.livingroom.R;
import l.bsm;
import l.bwr;
import l.e30;
import l.ffw;
import l.nnn0;
import l.roj0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class hzn0 extends dyn0<nnn0, lzn0> {
    public hzn0(bsm bsmVar) {
        super(bsmVar);
        C(new lzn0(bsmVar.a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ c m16055b4(roj0 roj0Var) {
        return E2().S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m16056c4(lyn0 lyn0Var) {
        ((lzn0) ((bwr) this).viewModel).m18131l(lyn0Var.f16447a, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d4 */
    public /* synthetic */ void m16057d4(lyn0 lyn0Var) {
        ((lzn0) ((bwr) this).viewModel).m18127e();
    }

    /* JADX INFO: renamed from: e4 */
    private void m16058e4() {
        BLiveVoice bLiveVoiceV2 = E2().V2();
        if (bLiveVoiceV2 == null) {
            return;
        }
        E2().n2();
        E2().N1(((BLiveAbsData) bLiveVoiceV2).room.id);
    }

    private void init() {
        ((lzn0) ((bwr) this).viewModel).init();
        N3(E2().m2().onErrorReturn(new w9j() { // from class: l.czn0
            public final Object call(Object obj) {
                return roj0.a;
            }
        }).flatMap(new w9j() { // from class: l.dzn0
            public final Object call(Object obj) {
                return this.f12075a.m16055b4((roj0) obj);
            }
        })).filter(new w9j() { // from class: l.ezn0
            public final Object call(Object obj) {
                lyn0 lyn0Var = (lyn0) obj;
                return Boolean.valueOf((lyn0Var == null || vwb.J(lyn0Var.f16447a)) ? false : true);
            }
        }).subscribe(ffw.h(new e30() { // from class: l.fzn0
            public final void call(Object obj) {
                this.f13246a.m16056c4((lyn0) obj);
            }
        }));
        N3(E2().S3()).subscribe(ffw.h(new e30() { // from class: l.gzn0
            public final void call(Object obj) {
                this.f13822a.m16057d4((lyn0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: P3 */
    public void m16059P3() {
        super.P3();
        init();
    }

    @Override // p009l.dyn0
    @NonNull
    /* JADX INFO: renamed from: S3 */
    public qzn0 mo13523S3() {
        return new qzn0(ypv.f23200e.getString(R.string.fa), ((lzn0) ((bwr) this).viewModel).m18128f(), 2);
    }

    @Override // p009l.dyn0
    /* JADX INFO: renamed from: T3 */
    public int mo13524T3() {
        return 1;
    }

    @Override // p009l.dyn0
    /* JADX INFO: renamed from: U3 */
    public void mo13525U3() {
        super.mo13525U3();
        BLiveVoice bLiveVoiceV2 = E2().V2();
        if (bLiveVoiceV2 == null) {
            return;
        }
        E2().D3(((BLiveAbsData) bLiveVoiceV2).room.id);
    }

    @Override // p009l.dyn0
    /* JADX INFO: renamed from: V3 */
    public void mo13526V3() {
        m16058e4();
    }
}
