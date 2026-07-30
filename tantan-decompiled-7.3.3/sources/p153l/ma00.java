package p153l;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import androidx.annotation.UiThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.appevents.C1577f;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
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
import kotlin.text.C15493d;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 &2\u00020\u0001:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$¨\u0006'"}, m88121d2 = {"Ll/ma00;", "Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroid/view/View;", "oldView", "newView", "", "onGlobalFocusChanged", "(Landroid/view/View;Landroid/view/View;)V", "g", "()V", OMSTemplateModeType.view, Constants.INAPP_DATA_TAG, "(Landroid/view/View;)V", "e", "Ljava/lang/Runnable;", "runnable", "f", "(Ljava/lang/Runnable;)V", "", "", "a", "Ljava/util/Set;", "processedText", "Landroid/os/Handler;", "b", "Landroid/os/Handler;", "uiThreadHandler", "Ljava/lang/ref/WeakReference;", "c", "Ljava/lang/ref/WeakReference;", "activityWeakReference", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTracking", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class ma00 implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    @NotNull
    public static final Map<Integer, ma00> f135454e = new HashMap();

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

    public ma00(Activity activity) {
        this.processedText = new LinkedHashSet();
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        this.activityWeakReference = new WeakReference<>(activity);
        this.isTracking = new AtomicBoolean(false);
    }

    /* JADX INFO: renamed from: a */
    public static void m157602a(View view, ma00 ma00Var) {
        if (ztb.m221490d(ma00.class)) {
            return;
        }
        try {
            view.getClass();
            ma00Var.getClass();
            if (view instanceof EditText) {
                ma00Var.m157606e(view);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, ma00.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ Map m157603b() {
        if (ztb.m221490d(ma00.class)) {
            return null;
        }
        try {
            return f135454e;
        } catch (Throwable th) {
            ztb.m221488b(th, ma00.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ void m157604c(ma00 ma00Var) {
        if (ztb.m221490d(ma00.class)) {
            return;
        }
        try {
            ma00Var.m157608g();
        } catch (Throwable th) {
            ztb.m221488b(th, ma00.class);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m157605d(final View view) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            m157607f(new Runnable() { // from class: l.la00
                @Override // java.lang.Runnable
                public final void run() {
                    ma00.m157602a(view, this);
                }
            });
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m157606e(View view) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            view.getClass();
            String lowerCase = StringsKt.m94324Z0(((EditText) view).getText().toString()).toString().toLowerCase();
            lowerCase.getClass();
            if (lowerCase.length() != 0 && !this.processedText.contains(lowerCase) && lowerCase.length() <= 100) {
                this.processedText.add(lowerCase);
                HashMap map = new HashMap();
                List<String> listM124695b = fa00.m124695b(view);
                List<String> listM124694a = null;
                for (ja00 ja00Var : ja00.INSTANCE.m143959c()) {
                    Companion companion = INSTANCE;
                    String strM157611c = companion.m157611c(ja00Var.m143955c(), lowerCase);
                    if (ja00Var.m143956d().length() <= 0 || fa00.m124697f(strM157611c, ja00Var.m143956d())) {
                        if (fa00.m124696e(listM124695b, ja00Var.m143954b())) {
                            companion.m157612d(map, ja00Var.m143955c(), strM157611c);
                        } else {
                            if (listM124694a == null) {
                                listM124694a = fa00.m124694a(view);
                            }
                            if (fa00.m124696e(listM124694a, ja00Var.m143954b())) {
                                companion.m157612d(map, ja00Var.m143955c(), strM157611c);
                            }
                        }
                    }
                }
                C1577f.INSTANCE.m7840f(map);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m157607f(Runnable runnable) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                runnable.run();
            } else {
                this.uiThreadHandler.post(runnable);
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m157608g() {
        View viewM198220d;
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (!this.isTracking.getAndSet(true) && (viewM198220d = uv0.m198220d(this.activityWeakReference.get())) != null) {
                ViewTreeObserver viewTreeObserver = viewM198220d.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnGlobalFocusChangeListener(this);
                }
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public void onGlobalFocusChanged(@Nullable View oldView, @Nullable View newView) {
        if (ztb.m221490d(this)) {
            return;
        }
        if (oldView != null) {
            try {
                m157605d(oldView);
            } catch (Throwable th) {
                ztb.m221488b(th, this);
                return;
            }
        }
        if (newView != null) {
            m157605d(newView);
        }
    }

    /* JADX INFO: renamed from: l.ma00$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0010\u001a\u00020\u00062\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00150\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m88121d2 = {"Ll/ma00$a;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "e", "(Landroid/app/Activity;)V", "", Constants.KEY_KEY, "value", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "userData", Constants.INAPP_DATA_TAG, "(Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "", "MAX_TEXT_LENGTH", "I", "Ll/ma00;", "observers", "Ljava/util/Map;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: c */
        public final String m157611c(String key, String value) {
            return Intrinsics.m88377d("r2", key) ? new Regex("[^\\d.]").replace(value, "") : value;
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0045  */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        /* JADX INFO: renamed from: d */
        public final void m157612d(Map<String, String> userData, String key, String value) {
            switch (key.hashCode()) {
                case 3585:
                    if (key.equals("r3")) {
                        String str = "m";
                        if (!C15493d.m94374J(value, "m", false, 2, null) && !C15493d.m94374J(value, "b", false, 2, null) && !C15493d.m94374J(value, "ge", false, 2, null)) {
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
                    if (key.equals("r6") && StringsKt.m94303P(value, "-", false, 2, null)) {
                        value = ((String[]) new Regex("-").split(value, 0).toArray(new String[0]))[0];
                    }
                    break;
            }
            userData.put(key, value);
        }

        @JvmStatic
        @UiThread
        /* JADX INFO: renamed from: e */
        public final void m157613e(@NotNull Activity activity) {
            activity.getClass();
            int iHashCode = activity.hashCode();
            Map mapM157603b = ma00.m157603b();
            Integer numValueOf = Integer.valueOf(iHashCode);
            Object ma00Var = mapM157603b.get(numValueOf);
            if (ma00Var == null) {
                ma00Var = new ma00(activity, null);
                mapM157603b.put(numValueOf, ma00Var);
            }
            ma00.m157604c((ma00) ma00Var);
        }

        public Companion() {
        }
    }

    public /* synthetic */ ma00(Activity activity, DefaultConstructorMarker defaultConstructorMarker) {
        this(activity);
    }
}
