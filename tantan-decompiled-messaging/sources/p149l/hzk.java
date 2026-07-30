package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.WebSubscriptionLandPageConfig;
import com.p046p1.mobile.putong.core.data.WebSubscriptionLandPageEnvelope;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m87232d2 = {"Ll/hzk;", "Ll/jq2;", "Ll/mzk;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "a0", "()V", "destroy", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class hzk extends jq2<mzk> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hzk(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m133694e0(hzk hzkVar, Bundle bundle) {
        ((mzk) hzkVar.viewModel).m157159r();
    }

    /* JADX INFO: renamed from: f0 */
    public static void m133695f0(hzk hzkVar, WebSubscriptionLandPageEnvelope webSubscriptionLandPageEnvelope) {
        mzk mzkVar = (mzk) hzkVar.viewModel;
        WebSubscriptionLandPageConfig webSubscriptionLandPageConfig = webSubscriptionLandPageEnvelope.data;
        webSubscriptionLandPageConfig.getClass();
        mzkVar.m157158q(webSubscriptionLandPageConfig);
    }

    /* JADX INFO: renamed from: g0 */
    public static void m133696g0(Throwable th) {
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        creates(new e30() { // from class: l.ezk
            @Override // p149l.e30
            public final void call(Object obj) {
                hzk.m133694e0(this.f93903a, (Bundle) obj);
            }
        });
        duringCreated(CoreModule.f17545c.f19620X1.m115671l3()).subscribe(mkd0.m154956H(new e30() { // from class: l.fzk
            @Override // p149l.e30
            public final void call(Object obj) {
                hzk.m133695f0(this.f99975a, (WebSubscriptionLandPageEnvelope) obj);
            }
        }, new e30() { // from class: l.gzk
            @Override // p149l.e30
            public final void call(Object obj) {
                hzk.m133696g0((Throwable) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
