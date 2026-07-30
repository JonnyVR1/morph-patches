package p003l;

import android.os.Bundle;
import com.p000p1.mobile.putong.core.data.QuickChatCardWrapper;
import kotlin.Metadata;
import l.d30;
import l.e30;
import l.mcr;
import l.v9j;
import org.jetbrains.annotations.NotNull;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\f2\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0013J)\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\"\u0004\b\u0000\u0010\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0015J%\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001bH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\"\u0010!R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Ll/pmn;", "Ll/mcr;", "Ll/dmn;", "greetingPresenter", "<init>", "(Ll/dmn;)V", "Lrx/c;", "Lcom/p1/mobile/android/app/c;", "lifecycle", "()Lrx/c;", "lifecycle_", "()Lcom/p1/mobile/android/app/c;", "T", "Ll/v9j;", "func0", "", "delayOnStop", "duringCreated", "(Ll/v9j;Z)Lrx/c;", "(Ll/v9j;)Lrx/c;", "org", "(Lrx/c;)Lrx/c;", "Ll/e30;", "Landroid/os/Bundle;", "onCreate", "Ll/d30;", "onDestroy", "", "creates", "(Ll/e30;Ll/d30;)V", "action", "(Ll/e30;)V", "a", "()V", "b", "Ll/dmn;", "getGreetingPresenter", "()Ll/dmn;", "message_intlGmsRelease"}, k = 1, mv = {QuickChatCardWrapper.QuickChatCardType.PASSIVE, QuickChatCardWrapper.QuickChatCardType.PASSIVE, 0}, xi = 48)
public abstract class pmn implements mcr {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final dmn<?> greetingPresenter;

    public pmn(@NotNull dmn<?> dmnVar) {
        dmnVar.getClass();
        this.greetingPresenter = dmnVar;
    }

    public void creates(@NotNull e30<Bundle> onCreate, @NotNull d30 onDestroy) {
        onCreate.getClass();
        onDestroy.getClass();
        this.greetingPresenter.creates(onCreate, onDestroy);
    }

    @NotNull
    public <T> c<T> duringCreated(@NotNull v9j<c<T>> func0, boolean delayOnStop) {
        func0.getClass();
        c<T> cVarDuringCreated = this.greetingPresenter.duringCreated(func0, delayOnStop);
        cVarDuringCreated.getClass();
        return cVarDuringCreated;
    }

    @NotNull
    public c<com.p1.mobile.android.app.c> lifecycle() {
        c<com.p1.mobile.android.app.c> cVarLifecycle = this.greetingPresenter.lifecycle();
        cVarLifecycle.getClass();
        return cVarLifecycle;
    }

    @NotNull
    public com.p1.mobile.android.app.c lifecycle_() {
        com.p1.mobile.android.app.c cVarLifecycle_ = this.greetingPresenter.lifecycle_();
        cVarLifecycle_.getClass();
        return cVarLifecycle_;
    }

    public void creates(@NotNull e30<Bundle> action) {
        action.getClass();
        this.greetingPresenter.creates(action);
    }

    @NotNull
    public <T> c<T> duringCreated(@NotNull v9j<c<T>> func0) {
        func0.getClass();
        c<T> cVarDuringCreated = this.greetingPresenter.duringCreated(func0);
        cVarDuringCreated.getClass();
        return cVarDuringCreated;
    }

    @NotNull
    public <T> c<T> duringCreated(@NotNull c<T> org) {
        org.getClass();
        c<T> cVarDuringCreated = this.greetingPresenter.duringCreated(org);
        cVarDuringCreated.getClass();
        return cVarDuringCreated;
    }

    /* JADX INFO: renamed from: a */
    public void m8767a() {
    }

    /* JADX INFO: renamed from: b */
    public void m8768b() {
    }
}
