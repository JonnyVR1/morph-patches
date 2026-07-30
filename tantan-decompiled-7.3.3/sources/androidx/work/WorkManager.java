package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.tencent.open.SocialConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p153l.xiq0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001c B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH&¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00110\tH&¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0018H&¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\rH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u001e\u0010\u001d¨\u0006!"}, m88121d2 = {"Landroidx/work/WorkManager;", "", "<init>", "()V", "Landroidx/work/h;", SocialConstants.TYPE_REQUEST, "Landroidx/work/d;", "c", "(Landroidx/work/h;)Landroidx/work/d;", "", "requests", Constants.INAPP_DATA_TAG, "(Ljava/util/List;)Landroidx/work/d;", "", "uniqueWorkName", "Landroidx/work/ExistingWorkPolicy;", "existingWorkPolicy", "Landroidx/work/c;", "f", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Landroidx/work/c;)Landroidx/work/d;", "g", "(Ljava/lang/String;Landroidx/work/ExistingWorkPolicy;Ljava/util/List;)Landroidx/work/d;", "Landroidx/work/ExistingPeriodicWorkPolicy;", "existingPeriodicWorkPolicy", "Landroidx/work/f;", "e", "(Ljava/lang/String;Landroidx/work/ExistingPeriodicWorkPolicy;Landroidx/work/f;)Landroidx/work/d;", "tag", "a", "(Ljava/lang/String;)Landroidx/work/d;", "b", "Companion", "UpdateResult", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SuppressLint({"AddedAbstractMethod"})
public abstract class WorkManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m88121d2 = {"Landroidx/work/WorkManager$UpdateResult;", "", "(Ljava/lang/String;I)V", "NOT_APPLIED", "APPLIED_IMMEDIATELY", "APPLIED_FOR_NEXT_RUN", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public enum UpdateResult {
        NOT_APPLIED,
        APPLIED_IMMEDIATELY,
        APPLIED_FOR_NEXT_RUN
    }

    /* JADX INFO: renamed from: androidx.work.WorkManager$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Landroidx/work/WorkManager$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/work/WorkManager;", "a", "(Landroid/content/Context;)Landroidx/work/WorkManager;", "Landroidx/work/a;", "configuration", "", "b", "(Landroid/content/Context;Landroidx/work/a;)V", "work-runtime_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public WorkManager m4358a(@NotNull Context context) {
            context.getClass();
            xiq0 xiq0VarM211153p = xiq0.m211153p(context);
            xiq0VarM211153p.getClass();
            return xiq0VarM211153p;
        }

        @JvmStatic
        /* JADX INFO: renamed from: b */
        public void m4359b(@NotNull Context context, @NotNull C0763a configuration) {
            context.getClass();
            configuration.getClass();
            xiq0.m211150i(context, configuration);
        }

        public Companion() {
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: h */
    public static WorkManager m4349h(@NotNull Context context) {
        return INSTANCE.m4358a(context);
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static void m4350i(@NotNull Context context, @NotNull C0763a c0763a) {
        INSTANCE.m4359b(context, c0763a);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public abstract InterfaceC0766d mo4351a(@NotNull String tag);

    @NotNull
    /* JADX INFO: renamed from: b */
    public abstract InterfaceC0766d mo4352b(@NotNull String uniqueWorkName);

    @NotNull
    /* JADX INFO: renamed from: c */
    public final InterfaceC0766d m4353c(@NotNull AbstractC0770h request) {
        request.getClass();
        return mo4354d(CollectionsKt.listOf(request));
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public abstract InterfaceC0766d mo4354d(@NotNull List<? extends AbstractC0770h> requests);

    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract InterfaceC0766d mo4355e(@NotNull String uniqueWorkName, @NotNull ExistingPeriodicWorkPolicy existingPeriodicWorkPolicy, @NotNull C0768f request);

    @NotNull
    /* JADX INFO: renamed from: f */
    public InterfaceC0766d m4356f(@NotNull String uniqueWorkName, @NotNull ExistingWorkPolicy existingWorkPolicy, @NotNull C0765c request) {
        uniqueWorkName.getClass();
        existingWorkPolicy.getClass();
        request.getClass();
        return mo4357g(uniqueWorkName, existingWorkPolicy, CollectionsKt.listOf(request));
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public abstract InterfaceC0766d mo4357g(@NotNull String uniqueWorkName, @NotNull ExistingWorkPolicy existingWorkPolicy, @NotNull List<C0765c> requests);
}
