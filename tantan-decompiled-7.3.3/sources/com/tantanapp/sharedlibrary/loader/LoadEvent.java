package com.tantanapp.sharedlibrary.loader;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.live.base.data.LovePlanetStage;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0003\u0019!\"B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001f¨\u0006#"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", "", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "step", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Event;", NotificationCompat.CATEGORY_EVENT, "data", "<init>", "(Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Event;Ljava/lang/Object;)V", "", "c", "()Z", Constants.INAPP_DATA_TAG, "", "e", "()Ljava/lang/Throwable;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "b", "()Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Event;", "()Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Event;", "Ljava/lang/Object;", "Companion", "Event", "Step", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final /* data */ class LoadEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Step step;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Event event;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final Object data;

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Event;", "", "(Ljava/lang/String;I)V", "Start", "Success", "Failure", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum Event {
        Start,
        Success,
        Failure
    }

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "", "(Ljava/lang/String;I)V", "Init", "CheckNeedLoad", "FetchObbInfoIfNeeded", "Download", "Unzip", "CopySo", "VerifySo", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum Step {
        Init,
        CheckNeedLoad,
        FetchObbInfoIfNeeded,
        Download,
        Unzip,
        CopySo,
        VerifySo
    }

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.LoadEvent$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"Lcom/tantanapp/sharedlibrary/loader/LoadEvent$a;", "", "<init>", "()V", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;", "step", "Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", "b", "(Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;)Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", LovePlanetStage.result, "c", "(Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;Ljava/lang/Object;)Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", "", "throwable", "a", "(Lcom/tantanapp/sharedlibrary/loader/LoadEvent$Step;Ljava/lang/Throwable;)Lcom/tantanapp/sharedlibrary/loader/LoadEvent;", "loader_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ LoadEvent m82624d(Companion companion, Step step, Object obj, int i, Object obj2) {
            if ((i & 2) != 0) {
                obj = null;
            }
            return companion.m82627c(step, obj);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final LoadEvent m82625a(@NotNull Step step, @NotNull Throwable throwable) {
            step.getClass();
            throwable.getClass();
            return new LoadEvent(step, Event.Failure, throwable);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final LoadEvent m82626b(@NotNull Step step) {
            step.getClass();
            return new LoadEvent(step, Event.Start, null, 4, null);
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final LoadEvent m82627c(@NotNull Step step, @Nullable Object result) {
            step.getClass();
            return new LoadEvent(step, Event.Success, result);
        }

        public Companion() {
        }
    }

    public LoadEvent(@NotNull Step step, @NotNull Event event, @Nullable Object obj) {
        step.getClass();
        event.getClass();
        this.step = step;
        this.event = event;
        this.data = obj;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Event getEvent() {
        return this.event;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Step getStep() {
        return this.step;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m82621c() {
        return this.step == ArraysKt.last(Step.values()) && this.event == Event.Success;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m82622d() {
        return this.event == Event.Failure;
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public final Throwable m82623e() {
        Object obj = this.data;
        obj.getClass();
        return (Throwable) obj;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LoadEvent)) {
            return false;
        }
        LoadEvent loadEvent = (LoadEvent) other;
        return this.step == loadEvent.step && this.event == loadEvent.event && Intrinsics.m88377d(this.data, loadEvent.data);
    }

    public int hashCode() {
        int iHashCode = ((this.step.hashCode() * 31) + this.event.hashCode()) * 31;
        Object obj = this.data;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    @NotNull
    public String toString() {
        return "LoadEvent(step=" + this.step + ", event=" + this.event + ", data=" + this.data + ')';
    }

    public /* synthetic */ LoadEvent(Step step, Event event, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(step, event, (i & 4) != 0 ? null : obj);
    }
}
