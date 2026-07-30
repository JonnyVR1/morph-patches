package p149l;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.UiThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.appevents.C1554f;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$¨\u0006'"}, m87232d2 = {"Ll/p100;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/view/View;", "oldView", "newView", "", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "g", "()V", OMSTemplateModeType.view, Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "e", "Ljava/lang/Runnable;", "runnable", "f", "(Ljava/lang/Runnable;)V", "", "", "a", "Ljava/util/Set;", "processedText", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class p100 implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<Integer, p100> f146635e = new HashMap();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Set<String> processedText;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final WeakReference<Activity> activityWeakReference;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final AtomicBoolean isTracking;

    public p100(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static void m166995a(View view, p100 p100Var) {
        if (lsb.m151554d(p100.class)) {
            return;
        }
        try {
            view.getClass();
            p100Var.getClass();
            if (view instanceof EditText) {
                p100Var.m166999e(view);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, p100.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ Map m166996b() {
        if (lsb.m151554d(p100.class)) {
            return null;
        }
        try {
            return f146635e;
        } catch (Throwable th) {
            lsb.m151552b(th, p100.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m166997c(p100 p100Var) {
        if (lsb.m151554d(p100.class)) {
            return;
        }
        try {
            p100Var.m167001g();
        } catch (Throwable th) {
            lsb.m151552b(th, p100.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m166998d(final View view) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            m167000f(new Runnable() { // from class: l.o100
                @Override // java.lang.Runnable
                public final void run() {
                    p100.m166995a(view, this);
                }
            });
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m166999e(View view) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            view.getClass();
            String lowerCase = StringsKt.m93433Z0(((EditText) view).getText().toString()).toString().toLowerCase();
            lowerCase.getClass();
            if (lowerCase.length() != 0 && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                this.processedText.add(lowerCase);
                HashMap map = new HashMap();
                List<String> listM133944b = i100.m133944b(view);
                List<String> listM133943a = null;
                for (m100 m100Var : m100.INSTANCE.m152554c()) {
                    Companion companion = INSTANCE;
                    String strM167004c = companion.m167004c(m100Var.m152550c(), lowerCase);
                    if (m100Var.m152551d().length() <= 0 || i100.m133946f(strM167004c, m100Var.m152551d())) {
                        if (i100.m133945e(listM133944b, m100Var.m152549b())) {
                            companion.m167005d(map, m100Var.m152550c(), strM167004c);
                        } else {
                            if (listM133943a == null) {
                                listM133943a = i100.m133943a(view);
                            }
                            if (i100.m133945e(listM133943a, m100Var.m152549b())) {
                                companion.m167005d(map, m100Var.m152550c(), strM167004c);
                            }
                        }
                    }
                }
                C1554f.INSTANCE.m7786f(map);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m167000f(Runnable runnable) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m167001g() {
        View viewM161521d;
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (!this.isTracking.getAndSet(true) && (viewM161521d = nv0.m161521d(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewM161521d.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View oldView, @Nullable View newView) {
        if (lsb.m151554d(this)) {
            return;
        }
        if (oldView != null) {
            try {
                m166998d(oldView);
            } catch (Throwable th) {
                lsb.m151552b(th, this);
                return;
            }
        }
        if (newView != null) {
            m166998d(newView);
        }
    }

    /* JADX INFO: renamed from: l.p100$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m87232d2 = {"Ll/p100$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "e", "(Landroid/app/Activity;)V", "", Constants.KEY_KEY, "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "userData", Constants.INAPP_DATA_TAG, "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "MAX_TEXT_LENGTH", "I", "Ll/p100;", "observers", "Ljava/util/Map;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final String m167004c(String key, String value) {
            return Intrinsics.m87488d("r2", key) ? new Regex("[^\\d.]").replace(value, "") : value;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: d */
        public final void m167005d(Map<String, String> userData, String key, String value) {
            switch (key.hashCode()) {
                case 3585:
                    if (key.equals("r3")) {
                        String str = "m";
                        if (!C15386d.m93483J(value, "m", false, 2, null) && !C15386d.m93483J(value, "b", false, 2, null) && !C15386d.m93483J(value, "ge", false, 2, null)) {
                            str = "f";
                        }
                        value = str;
                    }
                    break;
                case 3586:
                    if (key.equals("r4")) {
                        value = new Regex("[^a-z]+").replace(value, "");
                    }
                    break;
                case 3587:
                    if (key.equals("r5")) {
                        value = new Regex("[^a-z]+").replace(value, "");
                    }
                    break;
                case 3588:
                    if (key.equals("r6") && StringsKt.m93412P(value, "-", false, 2, null)) {
                        value = ((String[]) new Regex("-").split(value, 0).toArray(new String[0]))[0];
                    }
                    break;
            }
            userData.put(key, value);
        }

        @JvmStatic
        @UiThread
        /* JADX INFO: renamed from: e */
        public final void m167006e(@NotNull Activity activity) {
            activity.getClass();
            int iHashCode = activity.hashCode();
            Map mapM166996b = p100.m166996b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object p100Var = mapM166996b.get(numValueOf);
            if (p100Var == null) {
                p100Var = new p100(activity, null);
                mapM166996b.put(numValueOf, p100Var);
            }
            p100.m166997c((p100) p100Var);
        }

        public Companion() {
        }
    }

    public /* synthetic */ p100(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }
}
