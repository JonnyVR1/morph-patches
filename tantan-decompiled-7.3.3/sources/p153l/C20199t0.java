package p153l;

import android.os.Bundle;
import com.p051p1.mobile.putong.core.CoreModule;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: l.t0 */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\t¨\u0006\u0011"}, m88121d2 = {"Ll/t0;", "Ll/ar2;", "Ll/x0;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "a0", "()V", "destroy", "", "langKey", "langName", "h0", "(Ljava/lang/String;Ljava/lang/String;)V", "g0", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C20199t0 extends ar2<C21220x0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20199t0(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public static void m188694e0(C20199t0 c20199t0, String str, List list) {
        ((C21220x0) c20199t0.viewModel).m208801k(list, str);
    }

    /* JADX INFO: renamed from: f0 */
    public static void m188695f0(C20199t0 c20199t0, Bundle bundle) {
        c20199t0.m188696g0();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        creates(new y20() { // from class: l.r0
            @Override // p153l.y20
            public final void call(Object obj) {
                C20199t0.m188695f0(this.f160442a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final void m188696g0() {
        final String strM137951e = C17607i0.m137951e();
        ((C21220x0) this.viewModel).m208801k(null, strM137951e);
        CoreModule.f18264c.f20426t0.m31025k3().subscribe(psd0.m173596G(new y20() { // from class: l.s0
            @Override // p153l.y20
            public final void call(Object obj) {
                C20199t0.m188694e0(this.f165647a, strM137951e, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public final void m188697h0(@NotNull String langKey, @NotNull String langName) {
        langKey.getClass();
        langName.getClass();
        ((C21220x0) this.viewModel).m208803m(langName);
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
