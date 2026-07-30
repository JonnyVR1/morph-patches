package p149l;

import android.os.Bundle;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.p046p1.mobile.android.app.C4319c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0013J)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J%\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010!R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, m87232d2 = {"Ll/pmn;", "Ll/mcr;", "Ll/dmn;", "greetingPresenter", "<init>", "(Ll/dmn;)V", "Lrx/c;", "Lcom/p1/mobile/android/app/c;", RequestParameters.SUBRESOURCE_LIFECYCLE, "()Lrx/c;", "lifecycle_", "()Lcom/p1/mobile/android/app/c;", j6f.GPS_DIRECTION_TRUE, "Ll/v9j;", "func0", "", "delayOnStop", "duringCreated", "(Ll/v9j;Z)Lrx/c;", "(Ll/v9j;)Lrx/c;", "org", "(Lrx/c;)Lrx/c;", "Ll/e30;", "Landroid/os/Bundle;", "onCreate", "Ll/d30;", "onDestroy", "", "creates", "(Ll/e30;Ll/d30;)V", "action", "(Ll/e30;)V", "a", "()V", "b", "Ll/dmn;", "getGreetingPresenter", "()Ll/dmn;", "message_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class pmn implements mcr {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final dmn<?> greetingPresenter;

    public pmn(@NotNull dmn<?> dmnVar) {
        dmnVar.getClass();
        this.greetingPresenter = dmnVar;
    }

    @Override // p149l.mcr
    public void creates(@NotNull e30<Bundle> onCreate, @NotNull d30 onDestroy) {
        onCreate.getClass();
        onDestroy.getClass();
        this.greetingPresenter.creates(onCreate, onDestroy);
    }

    @Override // p149l.mcr
    @NotNull
    public <T> C22306c<T> duringCreated(@NotNull v9j<C22306c<T>> func0, boolean delayOnStop) {
        func0.getClass();
        C22306c<T> c22306cDuringCreated = this.greetingPresenter.duringCreated(func0, delayOnStop);
        c22306cDuringCreated.getClass();
        return c22306cDuringCreated;
    }

    @Override // p149l.mcr, p149l.d0e
    @NotNull
    public C22306c<C4319c> lifecycle() {
        C22306c<C4319c> c22306cLifecycle = this.greetingPresenter.lifecycle();
        c22306cLifecycle.getClass();
        return c22306cLifecycle;
    }

    @Override // p149l.mcr
    @NotNull
    public C4319c lifecycle_() {
        C4319c c4319cLifecycle_ = this.greetingPresenter.lifecycle_();
        c4319cLifecycle_.getClass();
        return c4319cLifecycle_;
    }

    @Override // p149l.mcr
    public void creates(@NotNull e30<Bundle> action) {
        action.getClass();
        this.greetingPresenter.creates(action);
    }

    @Override // p149l.mcr
    @NotNull
    public <T> C22306c<T> duringCreated(@NotNull v9j<C22306c<T>> func0) {
        func0.getClass();
        C22306c<T> c22306cDuringCreated = this.greetingPresenter.duringCreated(func0);
        c22306cDuringCreated.getClass();
        return c22306cDuringCreated;
    }

    @Override // p149l.mcr
    @NotNull
    public <T> C22306c<T> duringCreated(@NotNull C22306c<T> org2) {
        org2.getClass();
        C22306c<T> c22306cDuringCreated = this.greetingPresenter.duringCreated(org2);
        c22306cDuringCreated.getClass();
        return c22306cDuringCreated;
    }

    /* JADX INFO: renamed from: a */
    public void m170343a() {
    }

    /* JADX INFO: renamed from: b */
    public void m170344b() {
    }
}
