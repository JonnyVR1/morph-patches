package p149l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import com.clevertap.android.sdk.Constants;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R2\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u001aj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010(\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m87232d2 = {"Ll/cri;", "", "<init>", "()V", "Ll/yaj;", "helper", "Ll/vrl;", "f", "(Ll/yaj;)Ll/vrl;", "", "tag", "c", "(Ljava/lang/String;)Ll/vrl;", "", "Ll/xaj;", "e", "()Ljava/util/Map;", "control", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ll/xaj;)V", "Landroid/app/Activity;", "activity", "a", "(Landroid/app/Activity;)V", "g", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "fxs", "Ll/ebj;", "b", "Ll/ebj;", "fxLifecycleCallback", "Landroid/app/Application;", "Landroid/app/Application;", Constants.INAPP_DATA_TAG, "()Landroid/app/Application;", "h", "(Landroid/app/Application;)V", "context", "putong-common_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension
public final class cri {

    @NotNull
    public static final cri INSTANCE = new cri();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static HashMap<String, xaj> fxs = new HashMap<>(3);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static ebj fxLifecycleCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static /* synthetic */ Application context;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m108368b(cri criVar, Activity activity, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = null;
        }
        criVar.m108371a(activity);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final vrl m108369c(@NotNull String tag) {
        tag.getClass();
        return fxs.get(tag);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final vrl m108370f(@NotNull yaj helper) {
        xaj xajVar;
        helper.getClass();
        if (context == null) {
            jfd0.m141176a("context == null, please call AppHelper.setContext(context) to set context");
            return null;
        }
        if (!fxs.isEmpty() && (xajVar = fxs.get(helper.getTag())) != null) {
            xajVar.cancel();
        }
        xaj xajVar2 = new xaj(helper, new hbj());
        fxs.put(helper.getTag(), xajVar2);
        if (helper.enableFx) {
            m108368b(INSTANCE, null, 1, null);
        }
        return xajVar2;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m108371a(Activity activity) {
        if (fxLifecycleCallback != null) {
            return;
        }
        ebj.INSTANCE.m115480d(activity);
        ebj ebjVar = new ebj();
        fxLifecycleCallback = ebjVar;
        Application application = context;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(ebjVar);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Application m108372d() {
        return context;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Map m108373e() {
        return fxs;
    }

    /* JADX INFO: renamed from: g */
    public final void m108374g() {
        if (fxLifecycleCallback == null && ebj.INSTANCE.m115477a() == null) {
            return;
        }
        Application application = context;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(fxLifecycleCallback);
        }
        ebj.INSTANCE.m115478b();
        fxLifecycleCallback = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m108375h(@Nullable Application application) {
        context = application;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m108376i(String tag, xaj control) {
        tag.getClass();
        control.getClass();
        if (fxs.values().contains(control)) {
            fxs.remove(tag);
        }
        if (fxs.isEmpty()) {
            m108374g();
        }
    }
}
