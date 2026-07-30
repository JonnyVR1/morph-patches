package com.tantanapp.sharelib.workmanager;

import android.content.Context;
import android.util.Log;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import com.tantanapp.sharelib.workmanager.utils.SettableResult;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p149l.j6f;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000 *2\u00020\u0001:\u0002)*B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H&J\u0006\u0010\u0013\u001a\u00020\u0014J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001eJ\u0006\u0010\u001f\u001a\u00020\fJ\u0010\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\"H\u0002J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020'H\u0002J\u0010\u0010(\u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u0012H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006+"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Worker;", "Ljava/util/Observable;", "appContext", "Landroid/content/Context;", BaseSei.INFO, "Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "(Landroid/content/Context;Lcom/tantanapp/sharelib/workmanager/WorkInfo;)V", "getAppContext", "()Landroid/content/Context;", "getInfo", "()Lcom/tantanapp/sharelib/workmanager/WorkInfo;", "settableResult", "Lcom/tantanapp/sharelib/workmanager/utils/SettableResult;", "getSettableResult", "()Lcom/tantanapp/sharelib/workmanager/utils/SettableResult;", "setSettableResult", "(Lcom/tantanapp/sharelib/workmanager/utils/SettableResult;)V", "doWork", "Lcom/tantanapp/sharelib/workmanager/Result;", "getConstraints", "Lcom/tantanapp/sharelib/workmanager/Constraints;", "getInput", "Lcom/tantanapp/sharelib/workmanager/Data;", "getTryAttemptCount", "", "getTryLimit", "markEnqueue", "", "observe", "o", "Ljava/util/Observer;", "startWork", "updateFailed", LovePlanetStage.result, "Lcom/tantanapp/sharelib/workmanager/Result$Failure;", "updateProgress", "data", "updateState", "state", "Lcom/tantanapp/sharelib/workmanager/WorkInfo$State;", "updateSuccess", "Builder", "Companion", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public abstract class Worker extends Observable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String TAG = "Worker";

    @NotNull
    private final Context appContext;

    @NotNull
    private final WorkInfo info;
    public SettableResult settableResult;

    @Metadata(m87231d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\nJ\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\rJ#\u0010\u0013\u001a\u0002H\u0014\"\b\b\u0000\u0010\u0014*\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0017¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Worker$Builder;", "", "appContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "constraints", "Lcom/tantanapp/sharelib/workmanager/Constraints;", "id", "Ljava/util/UUID;", "inputData", "Lcom/tantanapp/sharelib/workmanager/Data;", "tags", "", "", "addConstraints", "addInputData", "data", "addTag", "tag", "from", j6f.GPS_DIRECTION_TRUE, "Lcom/tantanapp/sharelib/workmanager/Worker;", "kClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/tantanapp/sharelib/workmanager/Worker;", "setID", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Builder {

        @NotNull
        private final Context appContext;

        @NotNull
        private Constraints constraints;

        @NotNull
        private UUID id;

        @NotNull
        private Data inputData;

        @NotNull
        private Set<String> tags;

        public Builder(@NotNull Context context) {
            context.getClass();
            this.appContext = context;
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.id = uuidRandomUUID;
            this.inputData = Data.INSTANCE.m81543a();
            this.tags = new LinkedHashSet();
            this.constraints = new Constraints(0);
        }

        @NotNull
        public final Builder addConstraints(@NotNull Constraints constraints) {
            constraints.getClass();
            this.constraints = constraints;
            return this;
        }

        @NotNull
        public final Builder addInputData(@NotNull Data data) {
            data.getClass();
            this.inputData.m81537e(data);
            return this;
        }

        @NotNull
        public final Builder addTag(@NotNull String tag) {
            tag.getClass();
            this.tags.add(tag);
            return this;
        }

        @NotNull
        public final <T extends Worker> T from(@NotNull Class<T> kClass) throws IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {
            kClass.getClass();
            Constructor<T> constructor = kClass.getConstructor(Context.class, WorkInfo.class);
            Context context = this.appContext;
            UUID uuid = this.id;
            Set<String> set = this.tags;
            WorkInfo.State state = WorkInfo.State.IDLE;
            Data data = this.inputData;
            Data.Companion companion = Data.INSTANCE;
            T tNewInstance = constructor.newInstance(context, new WorkInfo(uuid, set, state, data, companion.m81543a(), companion.m81543a(), this.constraints));
            tNewInstance.getClass();
            return tNewInstance;
        }

        @NotNull
        public final Builder setID(@NotNull UUID id) {
            id.getClass();
            this.id = id;
            return this;
        }
    }

    @Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m87232d2 = {"Lcom/tantanapp/sharelib/workmanager/Worker$Companion;", "", "()V", "TAG", "", "log", "msg", "workmanager_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Companion log(@NotNull String msg) {
            msg.getClass();
            if (WorkManager.INSTANCE.m81561a()) {
                Log.e(Worker.TAG, msg);
            }
            return this;
        }

        private Companion() {
        }
    }

    public Worker(@NotNull Context context, @NotNull WorkInfo workInfo) {
        context.getClass();
        workInfo.getClass();
        this.appContext = context;
        this.info = workInfo;
    }

    private final void updateFailed(Result.Failure result) {
        getSettableResult().m81576d(result);
        getSettableResult().m81575c(result.getThrowable());
        this.info.m81554e(result.getThrowable());
        updateState(WorkInfo.State.FAILED);
    }

    private final void updateState(WorkInfo.State state) {
        this.info.m81559j(state);
    }

    private final void updateSuccess(Result result) {
        getSettableResult().m81576d(result);
        this.info.m81557h(result.getOutput());
        updateState(WorkInfo.State.SUCCEEDED);
    }

    @NotNull
    public abstract Result doWork();

    @NotNull
    public final Context getAppContext() {
        return this.appContext;
    }

    @NotNull
    public final Constraints getConstraints() {
        return this.info.getConstraints();
    }

    @NotNull
    public final WorkInfo getInfo() {
        return this.info;
    }

    @NotNull
    public final Data getInput() {
        return this.info.getInput();
    }

    @NotNull
    public final SettableResult getSettableResult() {
        SettableResult settableResult = this.settableResult;
        if (settableResult != null) {
            return settableResult;
        }
        Intrinsics.m87502r("settableResult");
        return null;
    }

    public final int getTryAttemptCount() {
        return this.info.getConstraints().getTryAttemptCount();
    }

    public final int getTryLimit() {
        return this.info.getConstraints().getTryLimit();
    }

    public final void markEnqueue() {
        updateState(WorkInfo.State.ENQUEUED);
    }

    @NotNull
    public final Worker observe(@NotNull Observer o) {
        o.getClass();
        this.info.addObserver(o);
        return this;
    }

    public final void setSettableResult(@NotNull SettableResult settableResult) {
        settableResult.getClass();
        this.settableResult = settableResult;
    }

    @NotNull
    public final SettableResult startWork() {
        setSettableResult(SettableResult.INSTANCE.m81577a());
        try {
            try {
                getConstraints().m81531e();
                updateState(WorkInfo.State.RUNNING);
                Result resultDoWork = doWork();
                if (resultDoWork instanceof Result.Failure) {
                    updateFailed((Result.Failure) resultDoWork);
                    return getSettableResult();
                }
                updateSuccess(resultDoWork);
                return getSettableResult();
            } catch (Exception e) {
                updateFailed(Result.INSTANCE.m81546b(e));
            }
        } finally {
            this.info.deleteObservers();
        }
    }

    public final void updateProgress(@NotNull Data data) {
        data.getClass();
        this.info.m81558i(data);
    }
}
