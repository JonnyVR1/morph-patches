package p153l;

import com.p051p1.mobile.putong.core.p058ui.lovebuzz.media.BuzzMediaCallManager;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m88121d2 = {"Ll/mum0;", "Ll/ar2;", "Ll/pum0;", "Ll/ner;", "lifecycleProvider", "<init>", "(Ll/ner;)V", "", "e0", "()V", "destroy", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class mum0 extends ar2<pum0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mum0(@NotNull ner nerVar) {
        super(nerVar);
        nerVar.getClass();
    }

    /* JADX INFO: renamed from: e0 */
    public final void m160234e0() {
        xa2.INSTANCE.m209830a("VoiceBuzzPresenter", "startFloatMgr");
        BuzzMediaCallManager.INSTANCE.m48155j0();
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
