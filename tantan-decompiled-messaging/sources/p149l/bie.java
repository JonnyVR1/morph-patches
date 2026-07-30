package p149l;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class bie extends kud0<ygt> {
    @Override // p149l.kud0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, final c2e0 c2e0Var, @Nullable x1e0.C21019b c21019b) {
        c2e0Var.duringCreated(IntlLivingNormalApiProvider.fetchRealJumpUrl(ygtVar.f104770b)).subscribe(ffw.m121197h(new e30() { // from class: l.aie
            @Override // p149l.e30
            public final void call(Object obj) {
                c2e0Var.mo129310p3(1300, (String) obj);
            }
        }));
    }
}
