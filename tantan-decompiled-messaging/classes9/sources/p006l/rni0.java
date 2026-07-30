package p006l;

import kotlin.Metadata;
import l.jq2;
import l.mcr;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ll/rni0;", "Ll/jq2;", "Ll/aoi0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "destroy", "()V", "e0", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class rni0 extends jq2<aoi0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rni0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    public void destroy() {
        ((aoi0) ((jq2) this).viewModel).destroy();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m22865e0() {
        ((aoi0) ((jq2) this).viewModel).m12151r();
    }
}
