package p003l;

import com.p1.mobile.putong.core.ui.lovebuzz.media.BuzzMediaCallManager;
import kotlin.Metadata;
import l.jq2;
import l.mcr;
import l.qa2;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Ll/ilm0;", "Ll/jq2;", "Ll/llm0;", "Ll/mcr;", "lifecycleProvider", "<init>", "(Ll/mcr;)V", "", "e0", "()V", "destroy", "buzz_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ilm0 extends jq2<llm0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ilm0(@NotNull mcr mcrVar) {
        super(mcrVar);
        mcrVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m5157e0() {
        qa2.INSTANCE.a("VoiceBuzzPresenter", "startFloatMgr");
        BuzzMediaCallManager.INSTANCE.j0();
    }

    public void destroy() {
    }
}
