package p153l;

import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.BloodType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/pud;", "I", BloodType.f39576O, "Ll/ji2;", "Ll/z06;", "consumer", "<init>", "(Ll/z06;)V", "", Constants.KEY_T, "", "g", "(Ljava/lang/Throwable;)V", "f", "()V", "", "progress", RXScreenCaptureService.KEY_INDEX, "(F)V", "b", "Ll/z06;", "o", "()Ll/z06;", "imagepipeline_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public abstract class pud<I, O> extends ji2<I> {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final z06<O> consumer;

    public pud(@NotNull z06<O> z06Var) {
        z06Var.getClass();
        this.consumer = z06Var;
    }

    @Override // p153l.ji2
    /* JADX INFO: renamed from: f */
    public void mo8575f() {
        this.consumer.mo144953a();
    }

    @Override // p153l.ji2
    /* JADX INFO: renamed from: g */
    public void mo8576g(@NotNull Throwable t) {
        t.getClass();
        this.consumer.onFailure(t);
    }

    @Override // p153l.ji2
    /* JADX INFO: renamed from: i */
    public void mo8578i(float progress) {
        this.consumer.mo144955c(progress);
    }

    @NotNull
    /* JADX INFO: renamed from: o */
    public final z06<O> m173861o() {
        return this.consumer;
    }
}
