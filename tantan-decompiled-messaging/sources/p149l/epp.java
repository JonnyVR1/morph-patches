package p149l;

import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceBackGroundPics;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoom;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class epp extends h4t<nnn0, hpp> {
    public epp(bsm<? extends nnn0> bsmVar, hpp hppVar) {
        super(bsmVar);
        mo51532C(hppVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M3 */
    public void m117665M3(final BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics) {
        duringCreated(q9o.m173658i(((nnn0) m206027E2()).m149818o(), bLiveVoiceBackGroundPics.f44483id)).subscribe(ffw.m121194e(new e30() { // from class: l.cpp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81978a.m117666N3(bLiveVoiceBackGroundPics, (BLiveVoiceRoom) obj);
            }
        }, new e30() { // from class: l.dpp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87302a.m117667O3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m117666N3(BLiveVoiceBackGroundPics bLiveVoiceBackGroundPics, BLiveVoiceRoom bLiveVoiceRoom) {
        ((hpp) this.viewModel).m132377i(bLiveVoiceBackGroundPics);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m117667O3(Throwable th) {
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 43140) {
            m117669R3();
        }
        s25.m182058c(th);
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m117668P3(List list) {
        ((hpp) this.viewModel).m132376f(list);
    }

    /* JADX INFO: renamed from: R3 */
    public void m117669R3() {
        duringCreated(q9o.m173656g()).subscribe(ffw.m121194e(new e30() { // from class: l.bpp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76661a.m117668P3((List) obj);
            }
        }, new z2k()));
    }
}
