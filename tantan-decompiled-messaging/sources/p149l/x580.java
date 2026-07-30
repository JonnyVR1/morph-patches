package p149l;

import android.app.Activity;
import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006JG\u0010\u0012\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u001a\u0010\u0011\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010\u0012\u0004\u0012\u00020\f0\u000e¢\u0006\u0004\b\u0012\u0010\u0013R!\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, m87232d2 = {"Ll/x580;", "", "<init>", "()V", "", "e", "()Z", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/Logger;", "logger", "Lkotlin/Function0;", "", "onCompleted", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "f", "(Landroid/content/Context;Lcom/clevertap/android/sdk/Logger;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "Ljava/lang/Class;", "a", "Lkotlin/Lazy;", Constants.INAPP_DATA_TAG, "()Ljava/lang/Class;", "reviewManagerFactoryClass", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class x580 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy reviewManagerFactoryClass = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.u580
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return x580.m207079c();
        }
    });

    /* JADX INFO: renamed from: b */
    public static void m207078b(Function0 function0, Task task) {
        function0.getClass();
        task.getClass();
        function0.invoke();
    }

    /* JADX INFO: renamed from: c */
    public static Class m207079c() {
        try {
            return Class.forName("com.google.android.play.core.review.ReviewManagerFactory");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    private final Class<?> m207080d() {
        return (Class) this.reviewManagerFactoryClass.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m207081g(ReviewManager reviewManager, Logger logger, Function1 function1, final Function0 function0, Task task) {
        reviewManager.getClass();
        logger.getClass();
        function1.getClass();
        function0.getClass();
        task.getClass();
        if (!task.mo15377p()) {
            logger.debug("Could not launch Play Store Review flow.", task.mo15372k());
            function1.invoke(task.mo15372k());
            return;
        }
        ReviewInfo reviewInfo = (ReviewInfo) task.mo15373l();
        Activity activityM176169i = qs9.m176169i();
        if (activityM176169i == null) {
            logger.debug("Could not launch Play Store Review flow: current Activity is null.");
            function1.invoke(null);
        } else {
            Task taskLaunchReviewFlow = reviewManager.launchReviewFlow(activityM176169i, reviewInfo);
            taskLaunchReviewFlow.getClass();
            taskLaunchReviewFlow.addOnCompleteListener(new OnCompleteListener() { // from class: l.w580
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task2) {
                    x580.m207078b(function0, task2);
                }
            });
        }
    }

    /* JADX INFO: renamed from: e */
    public final boolean m207082e() {
        return m207080d() != null;
    }

    /* JADX INFO: renamed from: f */
    public final void m207083f(@NotNull Context context, @NotNull final Logger logger, @NotNull final Function0<Unit> onCompleted, @NotNull final Function1<? super Exception, Unit> onError) {
        context.getClass();
        logger.getClass();
        onCompleted.getClass();
        onError.getClass();
        if (!m207082e()) {
            logger.debug("Could not launch Play Store Review flow: Play store review library not found.");
            onError.invoke(null);
            return;
        }
        final ReviewManager reviewManagerCreate = ReviewManagerFactory.create(context);
        reviewManagerCreate.getClass();
        Task taskRequestReviewFlow = reviewManagerCreate.requestReviewFlow();
        taskRequestReviewFlow.getClass();
        taskRequestReviewFlow.addOnCompleteListener(new OnCompleteListener() { // from class: l.v580
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                x580.m207081g(reviewManagerCreate, logger, onError, onCompleted, task);
            }
        });
    }
}
