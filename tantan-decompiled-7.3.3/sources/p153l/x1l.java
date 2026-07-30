package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.WebSubscriptionLandPageConfig;
import com.p051p1.mobile.putong.core.data.WebSubscriptionLandPageEnvelope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m88121d2 = {"Ll/x1l;", "Ll/ar2;", "Ll/c2l;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "a0", "()V", "destroy", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class x1l extends ar2<c2l> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1l(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m209092e0(x1l x1lVar, Bundle bundle) {
        ((c2l) x1lVar.viewModel).m107719r();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m209093f0(x1l x1lVar, WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope) {
        c2l c2lVar = (c2l) x1lVar.viewModel;
        WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = webSubscriptionLandPageEnvelope.data;
        webSubscriptionLandPageConfig.getClass();
        c2lVar.m107718q(webSubscriptionLandPageConfig);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m209094g0(Throwable th) {
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.u1l
            @Override // p153l.y20
            public final void call(Object obj) {
                x1l.m209092e0(this.f177011a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f18264c.f20362X1.m162653l3()).subscribe(psd0.m173597H(new y20() { // from class: l.v1l
            @Override // p153l.y20
            public final void call(Object obj) {
                x1l.m209093f0(this.f181985a, (WebSubscriptionLandPageEnvelope) obj);
            }
        }, new y20() { // from class: l.w1l
            @Override // p153l.y20
            public final void call(Object obj) {
                x1l.m209094g0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
