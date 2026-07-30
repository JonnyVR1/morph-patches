package p153l;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.intl.api.IntlLivingNormalApiProvider;

/* JADX INFO: loaded from: classes4.dex */
public class fje extends o2e0<zit> {
    @Override // p153l.o2e0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, final gae0 gae0Var, @Nullable bae0.C15954b c15954b) {
        gae0Var.duringCreated(IntlLivingNormalApiProvider.fetchRealJumpUrl(zitVar.f112155b)).subscribe(dhw.m115829h(new y20() { // from class: l.eje
            @Override // p153l.y20
            public final void call(Object obj) {
                gae0Var.mo138869p3(1300, (String) obj);
            }
        }));
    }
}
