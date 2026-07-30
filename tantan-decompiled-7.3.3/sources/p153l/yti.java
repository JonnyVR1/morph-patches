package p153l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00122\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u0003R2\u0010\u001d\u001a\u001e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\u001aj\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R$\u0010(\u001a\u0004\u0018\u00010\"8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006)"}, m88121d2 = {"Ll/yti;", "", "<init>", "()V", "Ll/sdj;", "helper", "Ll/jul;", "f", "(Ll/sdj;)Ll/jul;", "", "tag", "c", "(Ljava/lang/String;)Ll/jul;", "", "Ll/rdj;", "e", "()Ljava/util/Map;", "control", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ll/rdj;)V", "Landroid/app/Activity;", "activity", "a", "(Landroid/app/Activity;)V", "g", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "Ljava/util/HashMap;", "fxs", "Ll/ydj;", "b", "Ll/ydj;", "fxLifecycleCallback", "Landroid/app/Application;", "Landroid/app/Application;", Constants.INAPP_DATA_TAG, "()Landroid/app/Application;", "h", "(Landroid/app/Application;)V", "context", "putong-common_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SuppressLint({"StaticFieldLeak"})
@SourceDebugExtension
public final class yti {

    @NotNull
    public static final yti INSTANCE = new yti();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static HashMap<String, rdj> fxs = new HashMap<>(3);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static ydj fxLifecycleCallback;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public static /* synthetic */ Application context;

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m217313b(yti ytiVar, Activity activity, int i, Object obj) {
        if ((i & 1) != 0) {
            activity = null;
        }
        ytiVar.m217316a(activity);
    }

    @JvmStatic
    @JvmOverloads
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final jul m217314c(@NotNull String tag) {
        tag.getClass();
        return fxs.get(tag);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final jul m217315f(@NotNull sdj helper) {
        rdj rdjVar;
        helper.getClass();
        if (context == null) {
            mnd0.m159157a("context == null, please call AppHelper.setContext(context) to set context");
            return null;
        }
        if (!fxs.isEmpty() && (rdjVar = fxs.get(helper.getTag())) != null) {
            rdjVar.cancel();
        }
        rdj rdjVar2 = new rdj(helper, new bej());
        fxs.put(helper.getTag(), rdjVar2);
        if (helper.enableFx) {
            m217313b(INSTANCE, null, 1, null);
        }
        return rdjVar2;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m217316a(Activity activity) {
        if (fxLifecycleCallback != null) {
            return;
        }
        ydj.INSTANCE.m215244d(activity);
        ydj ydjVar = new ydj();
        fxLifecycleCallback = ydjVar;
        Application application = context;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(ydjVar);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Application m217317d() {
        return context;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Map m217318e() {
        return fxs;
    }

    /* JADX INFO: renamed from: g */
    public final void m217319g() {
        if (fxLifecycleCallback == null && ydj.INSTANCE.m215241a() == null) {
            return;
        }
        Application application = context;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(fxLifecycleCallback);
        }
        ydj.INSTANCE.m215242b();
        fxLifecycleCallback = null;
    }

    /* JADX INFO: renamed from: h */
    public final void m217320h(@Nullable Application application) {
        context = application;
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m217321i(String tag, rdj control) {
        tag.getClass();
        control.getClass();
        if (fxs.values().contains(control)) {
            fxs.remove(tag);
        }
        if (fxs.isEmpty()) {
            m217319g();
        }
    }
}
