package p149l;

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
import com.facebook.C1577c;
import com.facebook.FacebookException;
import com.facebook.appevents.codeless.internal.EventBinding;
import com.facebook.appevents.codeless.internal.PathComponent;
import com.facebook.internal.C1656d;
import com.facebook.internal.C1657e;
import com.facebook.internal.FetchedAppSettingsManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSWebPerimeterType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 #2\u00020\u0001:\u0003\u000e\u0012\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\u0003R\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R&\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cRF\u0010\"\u001a4\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u001ej\u001e\u0012\u0004\u0012\u00020\u001f\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001a` 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!¨\u0006$"}, m87232d2 = {"Ll/vb5;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "", "e", "(Landroid/app/Activity;)V", "h", "f", RXScreenCaptureService.KEY_INDEX, "g", "Landroid/os/Handler;", "a", "Landroid/os/Handler;", "uiThreadHandler", "", "b", "Ljava/util/Set;", "activitiesSet", "Ll/vb5$c;", "c", "viewMatchers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", Constants.INAPP_DATA_TAG, "Ljava/util/HashSet;", "listenerSet", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "activityToListenerMap", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class vb5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f */
    public static final String f180805f = vb5.class.getCanonicalName();

    /* JADX INFO: renamed from: g */
    @Nullable
    public static vb5 f180806g;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Handler uiThreadHandler;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Set<Activity> activitiesSet;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Set<ViewTreeObserverOnGlobalLayoutListenerC20609c> viewMatchers;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public HashSet<String> listenerSet;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final HashMap<Integer, HashSet<String>> activityToListenerMap;

    /* JADX INFO: renamed from: l.vb5$b */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tR\u001c\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, m87232d2 = {"Ll/vb5$b;", "", "Landroid/view/View;", OMSTemplateModeType.view, "", "viewMapKey", "<init>", "(Landroid/view/View;Ljava/lang/String;)V", "a", "()Landroid/view/View;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C20608b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @Nullable
        public final WeakReference<View> view;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final String viewMapKey;

        public C20608b(@NotNull View view, @NotNull String str) {
            view.getClass();
            str.getClass();
            this.view = new WeakReference<>(view);
            this.viewMapKey = str;
        }

        @Nullable
        /* JADX INFO: renamed from: a */
        public final View m197694a() {
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

    public vb5() {
        this.uiThreadHandler = new Handler(Looper.getMainLooper());
        Set<Activity> setNewSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        setNewSetFromMap.getClass();
        this.activitiesSet = setNewSetFromMap;
        this.viewMatchers = new LinkedHashSet();
        this.listenerSet = new HashSet<>();
        this.activityToListenerMap = new HashMap<>();
    }

    /* JADX INFO: renamed from: a */
    public static void m197683a(vb5 vb5Var) {
        if (lsb.m151554d(vb5.class)) {
            return;
        }
        try {
            vb5Var.getClass();
            vb5Var.m197689g();
        } catch (Throwable th) {
            lsb.m151552b(th, vb5.class);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ vb5 m197684b() {
        if (lsb.m151554d(vb5.class)) {
            return null;
        }
        try {
            return f180806g;
        } catch (Throwable th) {
            lsb.m151552b(th, vb5.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ String m197685c() {
        if (lsb.m151554d(vb5.class)) {
            return null;
        }
        try {
            return f180805f;
        } catch (Throwable th) {
            lsb.m151552b(th, vb5.class);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ void m197686d(vb5 vb5Var) {
        if (lsb.m151554d(vb5.class)) {
            return;
        }
        try {
            f180806g = vb5Var;
        } catch (Throwable th) {
            lsb.m151552b(th, vb5.class);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: e */
    public final void m197687e(@NotNull Activity activity) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            activity.getClass();
            if (czm.m109428b()) {
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
            m197691i();
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: f */
    public final void m197688f(@NotNull Activity activity) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            activity.getClass();
            this.activityToListenerMap.remove(Integer.valueOf(activity.hashCode()));
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m197689g() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            for (Activity activity : this.activitiesSet) {
                if (activity != null) {
                    this.viewMatchers.add(new ViewTreeObserverOnGlobalLayoutListenerC20609c(nv0.m161521d(activity), this.uiThreadHandler, this.listenerSet, activity.getClass().getSimpleName()));
                }
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    @UiThread
    /* JADX INFO: renamed from: h */
    public final void m197690h(@NotNull Activity activity) {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            activity.getClass();
            if (czm.m109428b()) {
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
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m197691i() {
        if (lsb.m151554d(this)) {
            return;
        }
        try {
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                m197689g();
            } else {
                this.uiThreadHandler.post(new Runnable() { // from class: l.ub5
                    @Override // java.lang.Runnable
                    public final void run() {
                        vb5.m197683a(this.f175673a);
                    }
                });
            }
        } catch (Throwable th) {
            lsb.m151552b(th, this);
        }
    }

    /* JADX INFO: renamed from: l.vb5$c */
    @Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 (2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001bB9\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0011J#\u0010\u0017\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001cJ'\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001f\u0010\u001cR\u001c\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010%R$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010&R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'¨\u0006)"}, m87232d2 = {"Ll/vb5$c;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroid/view/ViewTreeObserver$OnScrollChangedListener;", "Ljava/lang/Runnable;", "Landroid/view/View;", "rootView", "Landroid/os/Handler;", "handler", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "listenerSet", "activityName", "<init>", "(Landroid/view/View;Landroid/os/Handler;Ljava/util/HashSet;Ljava/lang/String;)V", "", "run", "()V", "onGlobalLayout", "onScrollChanged", "f", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "e", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;)V", "Ll/vb5$b;", "matchedView", "a", "(Ll/vb5$b;Landroid/view/View;Lcom/facebook/appevents/codeless/internal/EventBinding;)V", "b", "c", Constants.INAPP_DATA_TAG, "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "", "Ljava/util/List;", "eventBindings", "Landroid/os/Handler;", "Ljava/util/HashSet;", "Ljava/lang/String;", "Companion", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @UiThread
    public static final class ViewTreeObserverOnGlobalLayoutListenerC20609c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

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

        public ViewTreeObserverOnGlobalLayoutListenerC20609c(@Nullable View view, @NotNull Handler handler, @NotNull HashSet<String> hashSet, @NotNull String str) {
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
        public final void m197696a(C20608b matchedView, View rootView, EventBinding mapping) {
            if (mapping == null) {
                return;
            }
            try {
                View viewM197694a = matchedView.m197694a();
                if (viewM197694a == null) {
                    return;
                }
                View viewM106065a = ccl0.m106065a(viewM197694a);
                if (viewM106065a != null && ccl0.INSTANCE.m106082p(viewM197694a, viewM106065a)) {
                    m197699d(matchedView, rootView, mapping);
                    return;
                }
                if (C15386d.m93483J(viewM197694a.getClass().getName(), "com.facebook.react", false, 2, null)) {
                    return;
                }
                if (!(viewM197694a instanceof AdapterView)) {
                    m197697b(matchedView, rootView, mapping);
                } else if (viewM197694a instanceof ListView) {
                    m197698c(matchedView, rootView, mapping);
                }
            } catch (Exception e) {
                C1657e.m8842i0(vb5.m197685c(), e);
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m197697b(C20608b matchedView, View rootView, EventBinding mapping) {
            View viewM197694a = matchedView.m197694a();
            if (viewM197694a == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            View.OnClickListener onClickListenerM106069g = ccl0.m106069g(viewM197694a);
            boolean z = (onClickListenerM106069g instanceof qb5.ViewOnClickListenerC19456a) && ((qb5.ViewOnClickListenerC19456a) onClickListenerM106069g).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z) {
                return;
            }
            viewM197694a.setOnClickListener(qb5.m173814b(mapping, rootView, viewM197694a));
            this.listenerSet.add(viewMapKey);
        }

        /* JADX INFO: renamed from: c */
        public final void m197698c(C20608b matchedView, View rootView, EventBinding mapping) {
            AdapterView adapterView = (AdapterView) matchedView.m197694a();
            if (adapterView == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
            boolean z = (onItemClickListener instanceof qb5.C19457b) && ((qb5.C19457b) onItemClickListener).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z) {
                return;
            }
            adapterView.setOnItemClickListener(qb5.m173815c(mapping, rootView, adapterView));
            this.listenerSet.add(viewMapKey);
        }

        /* JADX INFO: renamed from: d */
        public final void m197699d(C20608b matchedView, View rootView, EventBinding mapping) {
            View viewM197694a = matchedView.m197694a();
            if (viewM197694a == null) {
                return;
            }
            String viewMapKey = matchedView.getViewMapKey();
            View.OnTouchListener onTouchListenerM106070h = ccl0.m106070h(viewM197694a);
            boolean z = (onTouchListenerM106070h instanceof hac0.ViewOnTouchListenerC17253a) && ((hac0.ViewOnTouchListenerC17253a) onTouchListenerM106070h).getSupportCodelessLogging();
            if (this.listenerSet.contains(viewMapKey) || z) {
                return;
            }
            viewM197694a.setOnTouchListener(hac0.m130134a(mapping, rootView, viewM197694a));
            this.listenerSet.add(viewMapKey);
        }

        /* JADX INFO: renamed from: e */
        public final void m197700e(EventBinding mapping, View rootView) {
            if (mapping == null || rootView == null) {
                return;
            }
            String activityName = mapping.getActivityName();
            if (activityName == null || activityName.length() == 0 || Intrinsics.m87488d(mapping.getActivityName(), this.activityName)) {
                List<PathComponent> listM7706d = mapping.m7706d();
                if (listM7706d.size() > 25) {
                    return;
                }
                Iterator<C20608b> it = INSTANCE.m197702a(mapping, rootView, listM7706d, 0, -1, this.activityName).iterator();
                while (it.hasNext()) {
                    m197696a(it.next(), rootView, mapping);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public final void m197701f() {
            List<EventBinding> list = this.eventBindings;
            if (list == null || this.rootView.get() == null) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                m197700e(list.get(i), this.rootView.get());
            }
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            m197701f();
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            m197701f();
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (lsb.m151554d(this)) {
                return;
            }
            try {
                C1656d c1656dM8689f = FetchedAppSettingsManager.m8689f(C1577c.m8048m());
                if (c1656dM8689f != null && c1656dM8689f.getCodelessEventsEnabled()) {
                    List<EventBinding> listM7708b = EventBinding.INSTANCE.m7708b(c1656dM8689f.getEventBindings());
                    this.eventBindings = listM7708b;
                    if (listM7708b != null && (view = this.rootView.get()) != null) {
                        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                        if (viewTreeObserver.isAlive()) {
                            viewTreeObserver.addOnGlobalLayoutListener(this);
                            viewTreeObserver.addOnScrollChangedListener(this);
                        }
                        m197701f();
                    }
                }
            } catch (Throwable th) {
                lsb.m151552b(th, this);
            }
        }

        /* JADX INFO: renamed from: l.vb5$c$a, reason: from kotlin metadata */
        @Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00060\b2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, m87232d2 = {"Ll/vb5$c$a;", "", "<init>", "()V", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", OMSTemplateModeType.view, "", "Lcom/facebook/appevents/codeless/internal/PathComponent;", "path", "", FirebaseAnalytics.Param.LEVEL, FirebaseAnalytics.Param.INDEX, "", "mapKey", "Ll/vb5$b;", "a", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Ljava/util/List;IILjava/lang/String;)Ljava/util/List;", "targetView", "pathElement", "", "c", "(Landroid/view/View;Lcom/facebook/appevents/codeless/internal/PathComponent;I)Z", "Landroid/view/ViewGroup;", "viewGroup", "b", "(Landroid/view/ViewGroup;)Ljava/util/List;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            @NotNull
            /* JADX INFO: renamed from: a */
            public final List<C20608b> m197702a(@Nullable EventBinding mapping, @Nullable View view, @NotNull List<PathComponent> path, int level, int index, @NotNull String mapKey) {
                EventBinding eventBinding;
                List<PathComponent> list;
                Companion companion;
                path.getClass();
                mapKey.getClass();
                String str = mapKey + '.' + index;
                ArrayList arrayList = new ArrayList();
                if (view != null) {
                    if (level >= path.size()) {
                        arrayList.add(new C20608b(view, str));
                        eventBinding = mapping;
                        list = path;
                        companion = this;
                    } else {
                        PathComponent pathComponent = path.get(level);
                        if (Intrinsics.m87488d(pathComponent.getCom.vivo.push.PushClientConstants.TAG_CLASS_NAME java.lang.String(), "..")) {
                            ViewParent parent = view.getParent();
                            if (parent instanceof ViewGroup) {
                                List<View> listM197703b = m197703b((ViewGroup) parent);
                                int size = listM197703b.size();
                                int i = 0;
                                while (i < size) {
                                    Companion companion2 = this;
                                    EventBinding eventBinding2 = mapping;
                                    arrayList.addAll(companion2.m197702a(eventBinding2, listM197703b.get(i), path, level + 1, i, str));
                                    i++;
                                    this = companion2;
                                    mapping = eventBinding2;
                                }
                            }
                        } else {
                            eventBinding = mapping;
                            list = path;
                            companion = this;
                            if (Intrinsics.m87488d(pathComponent.getCom.vivo.push.PushClientConstants.TAG_CLASS_NAME java.lang.String(), ".")) {
                                arrayList.add(new C20608b(view, str));
                                return arrayList;
                            }
                            if (companion.m197704c(view, pathComponent, index)) {
                                if (level == list.size() - 1) {
                                    arrayList.add(new C20608b(view, str));
                                }
                            }
                        }
                    }
                    if (view instanceof ViewGroup) {
                        List<View> listM197703b2 = companion.m197703b((ViewGroup) view);
                        int size2 = listM197703b2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Companion companion3 = companion;
                            arrayList.addAll(companion3.m197702a(eventBinding, listM197703b2.get(i2), list, level + 1, i2, str));
                            i2++;
                            companion = companion3;
                        }
                    }
                }
                return arrayList;
            }

            /* JADX INFO: renamed from: b */
            public final List<View> m197703b(ViewGroup viewGroup) {
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
            
                if (kotlin.jvm.internal.Intrinsics.m87488d(r9.getClass().getSimpleName(), (java.lang.String) r8.get(r8.size() - 1)) == false) goto L15;
             */
            /* JADX INFO: renamed from: c */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final boolean m197704c(android.view.View r9, com.facebook.appevents.codeless.internal.PathComponent r10, int r11) {
                /*
                    Method dump skipped, instruction units count: 323
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p149l.vb5.ViewTreeObserverOnGlobalLayoutListenerC20609c.Companion.m197704c(android.view.View, com.facebook.appevents.codeless.internal.PathComponent, int):boolean");
            }

            public Companion() {
            }
        }
    }

    /* JADX INFO: renamed from: l.vb5$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u000f0\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"Ll/vb5$a;", "", "<init>", "()V", "Ll/vb5;", "a", "()Ll/vb5;", "Lcom/facebook/appevents/codeless/internal/EventBinding;", "mapping", "Landroid/view/View;", "rootView", "hostView", "Landroid/os/Bundle;", "b", "(Lcom/facebook/appevents/codeless/internal/EventBinding;Landroid/view/View;Landroid/view/View;)Landroid/os/Bundle;", "", "CURRENT_CLASS_NAME", "Ljava/lang/String;", "PARENT_CLASS_NAME", "kotlin.jvm.PlatformType", "TAG", "codelessMatcher", "Ll/vb5;", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final synchronized vb5 m197692a() {
            vb5 vb5VarM197684b;
            try {
                if (vb5.m197684b() == null) {
                    vb5.m197686d(new vb5(null));
                }
                vb5VarM197684b = vb5.m197684b();
                vb5VarM197684b.getClass();
            } catch (Throwable th) {
                throw th;
            }
            return vb5VarM197684b;
        }

        @JvmStatic
        @UiThread
        @NotNull
        /* JADX INFO: renamed from: b */
        public final Bundle m197693b(@Nullable EventBinding mapping, @NotNull View rootView, @NotNull View hostView) {
            List<t760> listM7705c;
            EventBinding eventBinding;
            View view;
            List<C20608b> listM197702a;
            rootView.getClass();
            hostView.getClass();
            Bundle bundle = new Bundle();
            if (mapping != null && (listM7705c = mapping.m7705c()) != null) {
                for (t760 t760Var : listM7705c) {
                    if (t760Var.getValue() != null && t760Var.getValue().length() > 0) {
                        bundle.putString(t760Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), t760Var.getValue());
                    } else if (t760Var.m187418b().size() > 0) {
                        if (Intrinsics.m87488d(t760Var.getPathType(), OMSWebPerimeterType.relative)) {
                            EventBinding eventBinding2 = mapping;
                            listM197702a = ViewTreeObserverOnGlobalLayoutListenerC20609c.INSTANCE.m197702a(eventBinding2, hostView, t760Var.m187418b(), 0, -1, hostView.getClass().getSimpleName());
                            eventBinding = eventBinding2;
                            view = rootView;
                        } else {
                            eventBinding = mapping;
                            view = rootView;
                            listM197702a = ViewTreeObserverOnGlobalLayoutListenerC20609c.INSTANCE.m197702a(eventBinding, view, t760Var.m187418b(), 0, -1, rootView.getClass().getSimpleName());
                        }
                        for (C20608b c20608b : listM197702a) {
                            if (c20608b.m197694a() != null) {
                                String strM106073k = ccl0.m106073k(c20608b.m197694a());
                                if (strM106073k.length() > 0) {
                                    bundle.putString(t760Var.getCom.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String(), strM106073k);
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

    public /* synthetic */ vb5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
