package p153l;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.annotation.UiThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1600c;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.internal.C1679d;
import com.facebook.internal.C1680e;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSWebPerimeterType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
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
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 #2\u00020\u0001:\u0003\u000e\u0012\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cRF\u0010\"\u001a4\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u001ej\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006$"}, m88121d2 = {"Ll/vc5;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "e", "(Landroid/app/Activity;)V", "h", "f", RXScreenCaptureService.KEY_INDEX, "g", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "uiThreadHandler", "", "b", "Ljava/util/Set;", "activitiesSet", "Ll/vc5$c;", "c", "viewMatchers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", Constants.INAPP_DATA_TAG, "Ljava/util/HashSet;", "listenerSet", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "activityToListenerMap", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
@SourceDebugExtension
public final class vc5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final String f183319f = vc5.class.getCanonicalName();

    /* JADX INFO: renamed from: g */
    @Nullable
    public static vc5 f183320g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Set<Activity> activitiesSet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<ViewTreeObserverOnGlobalLayoutListenerC20808c> viewMatchers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public HashSet<String> listenerSet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final HashMap<Integer, HashSet<String>> activityToListenerMap;

    /* JADX INFO: renamed from: l.vc5$b */
    @Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/vc5$b;", "", "Landroid/view/View;", OMSTemplateModeType.view, "", "viewMapKey", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "a", "()Landroid/view/View;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C20807b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final WeakReference<View> view;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String viewMapKey;

        public C20807b(@NotNull View view, @NotNull String str) {
            view.getClass();
            str.getClass();
            this.view = new WeakReference<>(view);
            this.viewMapKey = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final View m200774a() {
            WeakReference<View> weakReference = this.view;
            if (weakReference != null) {
                return weakReference.get();
            }
            return null;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getViewMapKey() {
            return this.viewMapKey;
        }
    }

    public vc5() {
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        setNewSetFromMap.getClass();
        this.activitiesSet = setNewSetFromMap;
        this.viewMatchers = new LinkedHashSet();
        this.listenerSet = new HashSet<>();
        this.activityToListenerMap = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static void m200763a(vc5 vc5Var) {
        if (ztb.m221490d(vc5.class)) {
            return;
        }
        try {
            vc5Var.getClass();
            vc5Var.m200769g();
        } catch (Throwable th) {
            ztb.m221488b(th, vc5.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ vc5 m200764b() {
        if (ztb.m221490d(vc5.class)) {
            return null;
        }
        try {
            return f183320g;
        } catch (Throwable th) {
            ztb.m221488b(th, vc5.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ String m200765c() {
        if (ztb.m221490d(vc5.class)) {
            return null;
        }
        try {
            return f183319f;
        } catch (Throwable th) {
            ztb.m221488b(th, vc5.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m200766d(vc5 vc5Var) {
        if (ztb.m221490d(vc5.class)) {
            return;
        }
        try {
            f183320g = vc5Var;
        } catch (Throwable th) {
            ztb.m221488b(th, vc5.class);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: e */
    public final void m200767e(@NotNull Activity activity) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            activity.getClass();
            if (c1n.m107628b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.add(activity);
            this.listenerSet.clear();
            HashSet<String> hashSet = this.activityToListenerMap.get(Integer.valueOf(activity.hashCode()));
            if (hashSet != null) {
                this.listenerSet = hashSet;
            }
            m200771i();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: f */
    public final void m200768f(@NotNull Activity activity) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            activity.getClass();
            this.activityToListenerMap.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m200769g() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            for (Activity activity : this.activitiesSet) {
                if (activity != null) {
                    this.viewMatchers.add(new ViewTreeObserverOnGlobalLayoutListenerC20808c(uv0.m198220d(activity), this.uiThreadHandler, this.listenerSet, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: h */
    public final void m200770h(@NotNull Activity activity) {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            activity.getClass();
            if (c1n.m107628b()) {
                return;
            }
            if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
            }
            this.activitiesSet.remove(activity);
            this.viewMatchers.clear();
            HashMap<Integer, HashSet<String>> map = this.activityToListenerMap;
            Integer numValueOf = Integer.valueOf(activity.hashCode());
            Object objClone = this.listenerSet.clone();
            objClone.getClass();
            map.put(numValueOf, (HashSet) objClone);
            this.listenerSet.clear();
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m200771i() {
        if (ztb.m221490d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                m200769g();
            } else {
                this.uiThreadHandler.post(new Runnable() { // from class: l.uc5
                    @Override // java.lang.Runnable
                    public final void run() {
                        vc5.m200763a(this.f178406a);
                    }
                });
            }
        } catch (Throwable th) {
            ztb.m221488b(th, this);
        }
    }

    /* JADX INFO: renamed from: l.vc5$c */
    @Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB9\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ'\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u001cR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'¨\u0006)"}, m88121d2 = {"Ll/vc5$c;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Ljava/lang/Runnable;", "Landroid/view/View;", "rootView", "Landroid/os/Handler;", "handler", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "listenerSet", "activityName", "<init>", "(Landroid/view/View;Landroid/os/Handler;Ljava/util/HashSet;Ljava/lang/String;)V", "", "run", "()V", "onGlobalLayout", "onScrollChanged", "f", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "e", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;)V", "Ll/vc5$b;", "matchedView", "a", "(Ll/vc5$b;Landroid/view/View;Lcom/facebook/appevents/codeless/internal/EventBinding;)V", "b", "c", Constants.INAPP_DATA_TAG, "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "Ljava/util/List;", "eventBindings", "Landroid/os/Handler;", "Ljava/util/HashSet;", "Ljava/lang/String;", "Companion", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    @UiThread
    public static final class ViewTreeObserverOnGlobalLayoutListenerC20808c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final WeakReference<View> rootView;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @Nullable
        public List<EventBinding> eventBindings;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public final Handler handler;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @NotNull
        public final HashSet<String> listenerSet;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @NotNull
        public final String activityName;

        public ViewTreeObserverOnGlobalLayoutListenerC20808c(@Nullable View view, @NotNull Handler handler, @NotNull HashSet<String> hashSet, @NotNull String str) {
            handler.getClass();
            hashSet.getClass();
            str.getClass();
            this.rootView = new WeakReference<>(view);
            this.handler = handler;
            this.listenerSet = hashSet;
            this.activityName = str;
            handler.postDelayed(this, 200L);
        }

        /* JADX INFO: renamed from: a */
        public final void m200776a(C20807b matchedView, View rootView, EventBinding mapping) {
            if (mapping == null) {
                return;
            }
            try {
                View viewM200774a = matchedView.m200774a();
                if (viewM200774a == null) {
                    return;
                }
                View viewM130677a = gll0.m130677a(viewM200774a);
                if (viewM130677a != null && gll0.INSTANCE.m130694p(viewM200774a, viewM130677a)) {
                    m200779d(matchedView, rootView, mapping);
                    return;
                }
                if (C15493d.m94374J(viewM200774a.getClass().getName(), "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(viewM200774a instanceof AdapterView)) {
                    m200777b(matchedView, rootView, mapping);
                } else if (viewM200774a instanceof ListView) {
                    m200778c(matchedView, rootView, mapping);
                }
            } catch (Exception e) {
                C1680e.m8896i0(vc5.m200765c(), e);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m200777b(C20807b matchedView, View rootView, EventBinding mapping) {
            View viewM200774a = matchedView.m200774a();
            if (viewM200774a == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            View.OnClickListener onClickListenerM130681g = gll0.m130681g(viewM200774a);
            boolean z = (onClickListenerM130681g instanceof qc5.ViewOnClickListenerC19549a) && ((qc5.ViewOnClickListenerC19549a) onClickListenerM130681g).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z) {
                return;
            }
            viewM200774a.setOnClickListener(qc5.m176109b(mapping, rootView, viewM200774a));
            this.listenerSet.add(viewMapKey);
        }

        /* JADX INFO: renamed from: c */
        public final void m200778c(C20807b matchedView, View rootView, EventBinding mapping) {
            AdapterView adapterView = (AdapterView) matchedView.m200774a();
            if (adapterView == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            boolean z = (onItemClickListener instanceof qc5.C19550b) && ((qc5.C19550b) onItemClickListener).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z) {
                return;
            }
            adapterView.setOnItemClickListener(qc5.m176110c(mapping, rootView, adapterView));
            this.listenerSet.add(viewMapKey);
        }

        /* JADX INFO: renamed from: d */
        public final void m200779d(C20807b matchedView, View rootView, EventBinding mapping) {
            View viewM200774a = matchedView.m200774a();
            if (viewM200774a == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            View.OnTouchListener onTouchListenerM130682h = gll0.m130682h(viewM200774a);
            boolean z = (onTouchListenerM130682h instanceof nic0.ViewOnTouchListenerC18879a) && ((nic0.ViewOnTouchListenerC18879a) onTouchListenerM130682h).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z) {
                return;
            }
            viewM200774a.setOnTouchListener(nic0.m163271a(mapping, rootView, viewM200774a));
            this.listenerSet.add(viewMapKey);
        }

        /* JADX INFO: renamed from: e */
        public final void m200780e(EventBinding mapping, View rootView) {
            if (mapping == null || rootView == null) {
                return;
            }
            String activityName = mapping.getActivityName();
            if (activityName == null || activityName.length() == 0 || Intrinsics.m88377d(mapping.getActivityName(), this.activityName)) {
                List<PathComponent> listM7760d = mapping.m7760d();
                if (listM7760d.size() > 25) {
                    return;
                }
                Iterator<C20807b> it = INSTANCE.m200782a(mapping, rootView, listM7760d, 0, -1, this.activityName).iterator();
                while (it.hasNext()) {
                    m200776a(it.next(), rootView, mapping);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m200781f() {
            List<EventBinding> list = this.eventBindings;
            if (list == null || this.rootView.get() == null) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m200780e(list.get(i), this.rootView.get());
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m200781f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            m200781f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (ztb.m221490d(this)) {
                return;
            }
            try {
                C1679d c1679dM8743f = FetchedAppSettingsManager.m8743f(C1600c.m8102m());
                if (c1679dM8743f != null && c1679dM8743f.getCodelessEventsEnabled()) {
                    List<EventBinding> listM7762b = EventBinding.INSTANCE.m7762b(c1679dM8743f.getEventBindings());
                    this.eventBindings = listM7762b;
                    if (listM7762b != null && (view = this.rootView.get()) != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        m200781f();
                    }
                }
            } catch (Throwable th) {
                ztb.m221488b(th, this);
            }
        }

        /* JADX INFO: renamed from: l.vc5$c$a, reason: from kotlin metadata */
        @Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m88121d2 = {"Ll/vc5$c$a;", "", "<init>", "()V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", OMSTemplateModeType.view, "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "path", "", FirebaseAnalytics.Param.LEVEL, FirebaseAnalytics.Param.INDEX, "", "mapKey", "Ll/vc5$b;", "a", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Ljava/util/List;IILjava/lang/String;)Ljava/util/List;", "targetView", "pathElement", "", "c", "(Landroid/view/View;Lcom/facebook/appevents/codeless/internal/PathComponent;I)Z", "Landroid/view/ViewGroup;", "viewGroup", "b", "(Landroid/view/ViewGroup;)Ljava/util/List;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: a */
            public final List<C20807b> m200782a(@Nullable EventBinding mapping, @Nullable View view, @NotNull List<PathComponent> path, int level, int index, @NotNull String mapKey) {
                EventBinding eventBinding;
                List<PathComponent> list;
                Companion companion;
                path.getClass();
                mapKey.getClass();
                String str = mapKey + '.' + index;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (level >= path.size()) {
                        arrayList.add(new C20807b(view, str));
                        eventBinding = mapping;
                        list = path;
                        companion = this;
                    } else {
                        PathComponent pathComponent = path.get(level);
                        if (Intrinsics.m88377d(pathComponent.getCom.vivo.push.PushClientConstants.TAG_CLASS_NAME java.lang.String(), "..")) {
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                List<View> listM200783b = m200783b((ViewGroup) parent);
                                int size = listM200783b.size();
                                int i = 0;
                                while (i < size) {
                                    Companion companion2 = this;
                                    EventBinding eventBinding2 = mapping;
                                    arrayList.addAll(companion2.m200782a(eventBinding2, listM200783b.get(i), path, level + 1, i, str));
                                    i++;
                                    this = companion2;
                                    mapping = eventBinding2;
                                }
                            }
                        } else {
                            eventBinding = mapping;
                            list = path;
                            companion = this;
                            if (Intrinsics.m88377d(pathComponent.getCom.vivo.push.PushClientConstants.TAG_CLASS_NAME java.lang.String(), ".")) {
                                arrayList.add(new C20807b(view, str));
                                return arrayList;
                            }
                            if (companion.m200784c(view, pathComponent, index)) {
                                if (level == list.size() - 1) {
                                    arrayList.add(new C20807b(view, str));
                                }
                            }
                        }
                    }
                    if (view instanceof ViewGroup) {
                        List<View> listM200783b2 = companion.m200783b((ViewGroup) view);
                        int size2 = listM200783b2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Companion companion3 = companion;
                            arrayList.addAll(companion3.m200782a(eventBinding, listM200783b2.get(i2), list, level + 1, i2, str));
                            i2++;
                            companion = companion3;
                        }
                    }
                }
                return arrayList;
            }

            /* JADX INFO: renamed from: b */
            public final List<View> m200783b(ViewGroup viewGroup) {
                ArrayList arrayList = new ArrayList();
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    if (childAt.getVisibility() == 0) {
                        arrayList.add(childAt);
                    }
                }
                return arrayList;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
            
                if (kotlin.jvm.internal.Intrinsics.m88377d(r9.getClass().getSimpleName(), (java.lang.String) r8.get(r8.size() - 1)) == false) goto L15;
             */
            /* JADX INFO: renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final boolean m200784c(View targetView, PathComponent pathElement, int index) {
                if (pathElement.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() != -1 && index != pathElement.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) {
                    return false;
                }
                if (!Intrinsics.m88377d(targetView.getClass().getCanonicalName(), pathElement.getCom.vivo.push.PushClientConstants.TAG_CLASS_NAME java.lang.String())) {
                    if (new Regex(".*android\\..*").matches(pathElement.getCom.vivo.push.PushClientConstants.TAG_CLASS_NAME java.lang.String())) {
                        List listSplit$default = StringsKt.split$default(pathElement.getCom.vivo.push.PushClientConstants.TAG_CLASS_NAME java.lang.String(), new String[]{"."}, false, 0, 6, null);
                        if (!listSplit$default.isEmpty()) {
                        }
                    }
                    return false;
                }
                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.ID.getValue()) > 0 && pathElement.getId() != targetView.getId()) {
                    return false;
                }
                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TEXT.getValue()) > 0) {
                    String text = pathElement.getText();
                    String strM130685k = gll0.m130685k(targetView);
                    String strM8899k = C1680e.m8899k(C1680e.m8866E0(strM130685k), "");
                    if (!Intrinsics.m88377d(text, strM130685k) && !Intrinsics.m88377d(text, strM8899k)) {
                        return false;
                    }
                }
                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.DESCRIPTION.getValue()) > 0) {
                    String description = pathElement.getDescription();
                    String string = targetView.getContentDescription() == null ? "" : targetView.getContentDescription().toString();
                    String strM8899k2 = C1680e.m8899k(C1680e.m8866E0(string), "");
                    if (!Intrinsics.m88377d(description, string) && !Intrinsics.m88377d(description, strM8899k2)) {
                        return false;
                    }
                }
                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.HINT.getValue()) > 0) {
                    String str = pathElement.getCom.coremedia.iso.boxes.TrackReferenceTypeBox.TYPE1 java.lang.String();
                    String strM130683i = gll0.m130683i(targetView);
                    String strM8899k3 = C1680e.m8899k(C1680e.m8866E0(strM130683i), "");
                    if (!Intrinsics.m88377d(str, strM130683i) && !Intrinsics.m88377d(str, strM8899k3)) {
                        return false;
                    }
                }
                if ((pathElement.getMatchBitmask() & PathComponent.MatchBitmaskType.TAG.getValue()) > 0) {
                    String tag = pathElement.getTag();
                    String string2 = targetView.getTag() == null ? "" : targetView.getTag().toString();
                    String strM8899k4 = C1680e.m8899k(C1680e.m8866E0(string2), "");
                    if (!Intrinsics.m88377d(tag, string2) && !Intrinsics.m88377d(tag, strM8899k4)) {
                        return false;
                    }
                }
                return true;
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: l.vc5$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m88121d2 = {"Ll/vc5$a;", "", "<init>", "()V", "Ll/vc5;", "a", "()Ll/vc5;", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Landroid/os/Bundle;", "b", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)Landroid/os/Bundle;", "", "CURRENT_CLASS_NAME", "Ljava/lang/String;", "PARENT_CLASS_NAME", "kotlin.jvm.PlatformType", "TAG", "codelessMatcher", "Ll/vc5;", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final synchronized vc5 m200772a() {
            vc5 vc5VarM200764b;
            try {
                if (vc5.m200764b() == null) {
                    vc5.m200766d(new vc5(null));
                }
                vc5VarM200764b = vc5.m200764b();
                vc5VarM200764b.getClass();
            } catch (Throwable th) {
                throw th;
            }
            return vc5VarM200764b;
        }

        @JvmStatic
        @UiThread
        @NotNull
        /* JADX INFO: renamed from: b */
        public final Bundle m200773b(@Nullable EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
            List<zf60> listM7759c;
            EventBinding eventBinding;
            View view;
            List<C20807b> listM200782a;
            rootView.getClass();
            hostView.getClass();
            Bundle bundle = new Bundle();
            if (mapping != null && (listM7759c = mapping.m7759c()) != null) {
                for (zf60 zf60Var : listM7759c) {
                    if (zf60Var.getValue() != null && zf60Var.getValue().length() > 0) {
                        bundle.putString(zf60Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), zf60Var.getValue());
                    } else if (zf60Var.m219531b().size() > 0) {
                        if (Intrinsics.m88377d(zf60Var.getPathType(), OMSWebPerimeterType.relative)) {
                            EventBinding eventBinding2 = mapping;
                            listM200782a = ViewTreeObserverOnGlobalLayoutListenerC20808c.INSTANCE.m200782a(eventBinding2, hostView, zf60Var.m219531b(), 0, -1, hostView.getClass().getSimpleName());
                            eventBinding = eventBinding2;
                            view = rootView;
                        } else {
                            eventBinding = mapping;
                            view = rootView;
                            listM200782a = ViewTreeObserverOnGlobalLayoutListenerC20808c.INSTANCE.m200782a(eventBinding, view, zf60Var.m219531b(), 0, -1, rootView.getClass().getSimpleName());
                        }
                        for (C20807b c20807b : listM200782a) {
                            if (c20807b.m200774a() != null) {
                                String strM130685k = gll0.m130685k(c20807b.m200774a());
                                if (strM130685k.length() > 0) {
                                    bundle.putString(zf60Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), strM130685k);
                                    break;
                                }
                            }
                        }
                        mapping = eventBinding;
                        rootView = view;
                    }
                }
            }
            return bundle;
        }

        public Companion() {
        }
    }

    public /* synthetic */ vc5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
