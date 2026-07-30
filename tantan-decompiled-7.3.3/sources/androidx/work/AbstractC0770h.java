package androidx.work;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15497h;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p153l.l06;
import p153l.mjq0;
import p153l.wg3;

/* JADX INFO: renamed from: androidx.work.h */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0011\b&\u0018\u0000 \u00172\u00020\u0001:\u0002\u000b\u000eB'\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0011\u0010\u0016\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0018"}, m88121d2 = {"Landroidx/work/h;", "", "Ljava/util/UUID;", "id", "Ll/mjq0;", "workSpec", "", "", "tags", "<init>", "(Ljava/util/UUID;Ll/mjq0;Ljava/util/Set;)V", "a", "Ljava/util/UUID;", "()Ljava/util/UUID;", "b", "Ll/mjq0;", Constants.INAPP_DATA_TAG, "()Ll/mjq0;", "c", "Ljava/util/Set;", "()Ljava/util/Set;", "()Ljava/lang/String;", "stringId", "Companion", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public abstract class AbstractC0770h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final UUID id;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final mjq0 workSpec;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<String> tags;

    /* JADX INFO: renamed from: androidx.work.h$a */
    @Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\b\b&\u0018\u0000*\u0012\b\u0000\u0010\u0001*\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030\u0000*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B\u0019\b\u0000\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00028\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00028\u0001H ¢\u0006\u0004\b\u001c\u0010\u001bR\"\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010&\u001a\u00020 8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00102\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R \u00107\u001a\b\u0012\u0004\u0012\u00020\u0016038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b5\u00106R\u0014\u0010:\u001a\u00028\u00008 X \u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, m88121d2 = {"Landroidx/work/h$a;", "B", "Landroidx/work/h;", "W", "", "Ljava/lang/Class;", "Landroidx/work/b;", "workerClass", "<init>", "(Ljava/lang/Class;)V", "Ljava/util/UUID;", "id", "j", "(Ljava/util/UUID;)Landroidx/work/h$a;", "Ll/l06;", "constraints", RXScreenCaptureService.KEY_INDEX, "(Ll/l06;)Landroidx/work/h$a;", "Landroidx/work/Data;", "inputData", "k", "(Landroidx/work/Data;)Landroidx/work/h$a;", "", "tag", "a", "(Ljava/lang/String;)Landroidx/work/h$a;", "b", "()Landroidx/work/h;", "c", "Ljava/lang/Class;", "getWorkerClass$work_runtime_release", "()Ljava/lang/Class;", "", "Z", Constants.INAPP_DATA_TAG, "()Z", "setBackoffCriteriaSet$work_runtime_release", "(Z)V", "backoffCriteriaSet", "Ljava/util/UUID;", "e", "()Ljava/util/UUID;", "setId$work_runtime_release", "(Ljava/util/UUID;)V", "Ll/mjq0;", "Ll/mjq0;", "h", "()Ll/mjq0;", "setWorkSpec$work_runtime_release", "(Ll/mjq0;)V", "workSpec", "", "Ljava/util/Set;", "f", "()Ljava/util/Set;", "tags", "g", "()Landroidx/work/h$a;", "thisObject", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static abstract class a<B extends a<B, ?>, W extends AbstractC0770h> {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Class<? extends AbstractC0764b> workerClass;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public boolean backoffCriteriaSet;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public UUID id;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public mjq0 workSpec;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final Set<String> tags;

        public a(@NotNull Class<? extends AbstractC0764b> cls) {
            cls.getClass();
            this.workerClass = cls;
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            this.id = uuidRandomUUID;
            String string = this.id.toString();
            string.getClass();
            this.workSpec = new mjq0(string, cls.getName());
            this.tags = SetsKt.mutableSetOf(cls.getName());
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final B m4437a(@NotNull String tag) {
            tag.getClass();
            this.tags.add(tag);
            return (B) mo4423g();
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final W m4438b() {
            W w = (W) mo4422c();
            l06 l06Var = this.workSpec.constraints;
            boolean z = l06Var.m152313g() || l06Var.getRequiresBatteryNotLow() || l06Var.getRequiresCharging() || l06Var.getRequiresDeviceIdle();
            mjq0 mjq0Var = this.workSpec;
            if (mjq0Var.expedited) {
                if (z) {
                    wg3.m206174a("Expedited jobs only support network and storage constraints");
                    return null;
                }
                if (mjq0Var.initialDelay > 0) {
                    wg3.m206174a("Expedited jobs cannot be delayed");
                    return null;
                }
            }
            if (mjq0Var.getTraceTag() == null) {
                mjq0 mjq0Var2 = this.workSpec;
                mjq0Var2.m158613q(AbstractC0770h.INSTANCE.m4447b(mjq0Var2.workerClassName));
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            uuidRandomUUID.getClass();
            m4444j(uuidRandomUUID);
            return w;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public abstract W mo4422c();

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getBackoffCriteriaSet() {
            return this.backoffCriteriaSet;
        }

        @NotNull
        /* JADX INFO: renamed from: e, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final Set<String> m4441f() {
            return this.tags;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public abstract B mo4423g();

        @NotNull
        /* JADX INFO: renamed from: h, reason: from getter */
        public final mjq0 getWorkSpec() {
            return this.workSpec;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final B m4443i(@NotNull l06 constraints) {
            constraints.getClass();
            this.workSpec.constraints = constraints;
            return (B) mo4423g();
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final B m4444j(@NotNull UUID id) {
            id.getClass();
            this.id = id;
            String string = id.toString();
            string.getClass();
            this.workSpec = new mjq0(string, this.workSpec);
            return (B) mo4423g();
        }

        @NotNull
        /* JADX INFO: renamed from: k */
        public final B m4445k(@NotNull Data inputData) {
            inputData.getClass();
            this.workSpec.input = inputData;
            return (B) mo4423g();
        }
    }

    /* JADX INFO: renamed from: androidx.work.h$b, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\n¨\u0006\u0010"}, m88121d2 = {"Landroidx/work/h$b;", "", "<init>", "()V", "", "workerClassName", "b", "(Ljava/lang/String;)Ljava/lang/String;", "", "DEFAULT_BACKOFF_DELAY_MILLIS", "J", "MAX_BACKOFF_MILLIS", "", "MAX_TRACE_SPAN_LENGTH", "I", "MIN_BACKOFF_MILLIS", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public final String m4447b(String workerClassName) {
            List listSplit$default = StringsKt.split$default(workerClassName, new String[]{"."}, false, 0, 6, null);
            String str = listSplit$default.size() == 1 ? (String) listSplit$default.get(0) : (String) CollectionsKt.last(listSplit$default);
            return str.length() <= 127 ? str : C15497h.m94388e1(str, 127);
        }

        public Companion() {
        }
    }

    public AbstractC0770h(@NotNull UUID uuid, @NotNull mjq0 mjq0Var, @NotNull Set<String> set) {
        uuid.getClass();
        mjq0Var.getClass();
        set.getClass();
        this.id = uuid;
        this.workSpec = mjq0Var;
        this.tags = set;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public UUID getId() {
        return this.id;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m4434b() {
        String string = getId().toString();
        string.getClass();
        return string;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: c */
    public final Set<String> m4435c() {
        return this.tags;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final mjq0 getWorkSpec() {
        return this.workSpec;
    }
}
