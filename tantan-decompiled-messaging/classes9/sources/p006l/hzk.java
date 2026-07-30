package p006l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.WebSubscriptionLandPageConfig;
import com.p1.mobile.putong.core.data.WebSubscriptionLandPageEnvelope;
import kotlin.Metadata;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ll/hzk;", "Ll/jq2;", "Ll/mzk;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "a0", "()V", "destroy", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class hzk extends jq2<mzk> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzk(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m16401e0(hzk hzkVar, Bundle bundle) {
        ((mzk) ((jq2) hzkVar).viewModel).m19620r();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m16402f0(hzk hzkVar, WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope) {
        mzk mzkVar = (mzk) ((jq2) hzkVar).viewModel;
        WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = webSubscriptionLandPageEnvelope.data;
        webSubscriptionLandPageConfig.getClass();
        mzkVar.m19619q(webSubscriptionLandPageConfig);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m16403g0(Throwable th) {
    }

    /* JADX INFO: renamed from: a0 */
    public void m16404a0() {
        super.a0();
        creates(new e30() { // from class: l.ezk
            public final void call(Object obj) {
                hzk.m16401e0(this.f11541a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f1534c.f3609X1.m14463l3()).subscribe(mkd0.H(new e30() { // from class: l.fzk
            public final void call(Object obj) {
                hzk.m16402f0(this.f13005a, (WebSubscriptionLandPageEnvelope) obj);
            }
        }, new e30() { // from class: l.gzk
            public final void call(Object obj) {
                hzk.m16403g0((Throwable) obj);
            }
        }));
    }

    public void destroy() {
    }
}
