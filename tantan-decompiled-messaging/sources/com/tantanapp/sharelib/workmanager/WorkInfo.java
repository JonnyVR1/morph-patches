package com.tantanapp.sharelib.workmanager;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Collections;
import java.util.Observable;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.eclipse.jetty.util.component.AbstractLifeCycle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u0000 B2\u00020\u0001:\u0002BCBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u001a\u0010\u0017J\u0017\u0010\u001d\u001a\u00020\u00122\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u00105\u001a\u0004\b0\u00106R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b7\u00106R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u00105\u001a\u0004\b8\u00106R\"\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u00109\u001a\u0004\b)\u0010:\"\u0004\b;\u0010<R$\u0010A\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010\u001e¨\u0006D"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "Ljava/util/Observable;", "Ljava/util/UUID;", "id", "", "", "tags", "Lcom/tantanapp/sharelib/workmanager/WorkInfo$State;", "state", "Lcom/tantanapp/sharelib/workmanager/Data;", "input", "output", "progress", "Lcom/tantanapp/sharelib/workmanager/Constraints;", "constraints", "<init>", "(Ljava/util/UUID;Ljava/util/Set;Lcom/tantanapp/sharelib/workmanager/WorkInfo$State;Lcom/tantanapp/sharelib/workmanager/Data;Lcom/tantanapp/sharelib/workmanager/Data;Lcom/tantanapp/sharelib/workmanager/Data;Lcom/tantanapp/sharelib/workmanager/Constraints;)V", "()V", "", "g", "j", "(Lcom/tantanapp/sharelib/workmanager/WorkInfo$State;)V", RXScreenCaptureService.KEY_INDEX, "(Lcom/tantanapp/sharelib/workmanager/Data;)V", LovePlanetStage.result, "h", "f", "", NotificationCompat.CATEGORY_ERROR, "e", "(Ljava/lang/Throwable;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/UUID;", "b", "()Ljava/util/UUID;", "Ljava/util/Set;", Constants.INAPP_DATA_TAG, "()Ljava/util/Set;", "c", "Lcom/tantanapp/sharelib/workmanager/WorkInfo$State;", "getState", "()Lcom/tantanapp/sharelib/workmanager/WorkInfo$State;", "setState", "Lcom/tantanapp/sharelib/workmanager/Data;", "()Lcom/tantanapp/sharelib/workmanager/Data;", "getOutput", "getProgress", "Lcom/tantanapp/sharelib/workmanager/Constraints;", "()Lcom/tantanapp/sharelib/workmanager/Constraints;", "setConstraints", "(Lcom/tantanapp/sharelib/workmanager/Constraints;)V", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "setException", "exception", "Companion", "State", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final /* data */ class WorkInfo extends Observable {

    /* JADX INFO: renamed from: i */
    @NotNull
    public static final WorkInfo f56224i = new WorkInfo();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final UUID id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Set<String> tags;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public State state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final Data input;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Data output;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public final Data progress;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public Constraints constraints;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public Throwable exception;

    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/WorkInfo$State;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "toString", "", "IDLE", "ENQUEUED", AbstractLifeCycle.RUNNING, "SUCCEEDED", "FAILED", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public enum State {
        IDLE(0),
        ENQUEUED(1),
        RUNNING(2),
        SUCCEEDED(3),
        FAILED(4);

        private final int value;

        State(int i) {
            this.value = i;
        }

        public final int getValue() {
            return this.value;
        }

        @Override // java.lang.Enum
        @NotNull
        public String toString() {
            return "State(value=" + name() + ')';
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public WorkInfo() {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        Set setSingleton = Collections.singleton("EMPTY");
        setSingleton.getClass();
        State state = State.IDLE;
        Data.Companion companion = Data.INSTANCE;
        this(uuidRandomUUID, setSingleton, state, companion.m81543a(), companion.m81543a(), companion.m81543a(), new Constraints(0));
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Constraints getConstraints() {
        return this.constraints;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Data getInput() {
        return this.input;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Set<String> m81553d() {
        return this.tags;
    }

    /* JADX INFO: renamed from: e */
    public final void m81554e(@Nullable Throwable err) {
        Throwable th = this.exception;
        if (th == null) {
            this.exception = err;
            return;
        }
        if (Intrinsics.m87488d(th, err)) {
            this.exception = err;
            return;
        }
        Throwable th2 = this.exception;
        if (th2 != null) {
            th2.initCause(err);
        }
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkInfo)) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) other;
        return Intrinsics.m87488d(this.id, workInfo.id) && Intrinsics.m87488d(this.tags, workInfo.tags) && this.state == workInfo.state && Intrinsics.m87488d(this.input, workInfo.input) && Intrinsics.m87488d(this.output, workInfo.output) && Intrinsics.m87488d(this.progress, workInfo.progress) && Intrinsics.m87488d(this.constraints, workInfo.constraints);
    }

    /* JADX INFO: renamed from: f */
    public final void m81555f(@NotNull Data input) {
        input.getClass();
        this.input.m81537e(input);
    }

    /* JADX INFO: renamed from: g */
    public final void m81556g() {
        setChanged();
        notifyObservers(this);
        clearChanged();
    }

    /* JADX INFO: renamed from: h */
    public final void m81557h(@NotNull Data result) {
        result.getClass();
        this.output.m81537e(result);
    }

    public int hashCode() {
        return (((((((((((this.id.hashCode() * 31) + this.tags.hashCode()) * 31) + this.state.hashCode()) * 31) + this.input.hashCode()) * 31) + this.output.hashCode()) * 31) + this.progress.hashCode()) * 31) + this.constraints.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final void m81558i(@NotNull Data progress) {
        progress.getClass();
        this.progress.m81537e(progress);
        m81556g();
    }

    /* JADX INFO: renamed from: j */
    public final void m81559j(@NotNull State state) {
        state.getClass();
        this.state = state;
        m81556g();
    }

    @NotNull
    public String toString() {
        return "WorkInfo(id=" + this.id + ", tags=" + this.tags + ", state=" + this.state + ", input=" + this.input + ", output=" + this.output + ", progress=" + this.progress + ", constraints=" + this.constraints + ')';
    }

    public WorkInfo(@NotNull UUID uuid, @NotNull Set<String> set, @NotNull State state, @NotNull Data data, @NotNull Data data2, @NotNull Data data3, @NotNull Constraints constraints) {
        uuid.getClass();
        set.getClass();
        state.getClass();
        data.getClass();
        data2.getClass();
        data3.getClass();
        constraints.getClass();
        this.id = uuid;
        this.tags = set;
        this.state = state;
        this.input = data;
        this.output = data2;
        this.progress = data3;
        this.constraints = constraints;
    }
}
