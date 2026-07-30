package com.clevertap.android.sdk.inapp;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.C1214b;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.task.Task;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p149l.aom;
import p149l.chi0;
import p149l.dhi;
import p149l.t5l0;
import p149l.tt3;
import p149l.ygi;
import p149l.zxf0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0001#B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J%\u0010\u001a\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010!\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u001b\u0010\n\u001a\u00020\t8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b'\u0010+¨\u0006,"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/b;", "", "Ll/zxf0;", "storeRegistry", "Ll/chi0;", "templatesManager", "Ll/tt3;", "executors", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "", "isVideoSupported", "<init>", "(Ll/zxf0;Ll/chi0;Ll/tt3;Lkotlin/jvm/functions/Function0;Z)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inApp", "Ljava/lang/ref/WeakReference;", "Lcom/clevertap/android/sdk/inapp/b$a;", "listenerWeakReference", "", "f", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ljava/lang/ref/WeakReference;)V", "g", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "h", "e", "(Ljava/lang/ref/WeakReference;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "Lorg/json/JSONObject;", "inAppJson", "", "taskLogTag", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/b$a;)V", "a", "Ll/zxf0;", "b", "Ll/chi0;", "c", "Ll/tt3;", "Z", "Lkotlin/Lazy;", "()Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class C1214b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final zxf0 storeRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final chi0 templatesManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final tt3 executors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isVideoSupported;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy fileResourceProvider;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.b$a */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Lcom/clevertap/android/sdk/inapp/b$a;", "", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "notification", "", "b", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo6274b(@NotNull CTInAppNotification notification);
    }

    public C1214b(@NotNull zxf0 zxf0Var, @NotNull chi0 chi0Var, @NotNull tt3 tt3Var, @NotNull Function0<FileResourceProvider> function0, boolean z) {
        zxf0Var.getClass();
        chi0Var.getClass();
        tt3Var.getClass();
        function0.getClass();
        this.storeRegistry = zxf0Var;
        this.templatesManager = chi0Var;
        this.executors = tt3Var;
        this.isVideoSupported = z;
        this.fileResourceProvider = LazyKt__LazyJVMKt.m87229b(function0);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m6286a(a aVar, CTInAppNotification cTInAppNotification) {
        cTInAppNotification.getClass();
        aVar.mo6274b(cTInAppNotification);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6287b(JSONObject jSONObject, C1214b c1214b, WeakReference weakReference) {
        jSONObject.getClass();
        c1214b.getClass();
        weakReference.getClass();
        CTInAppNotification cTInAppNotification = new CTInAppNotification(jSONObject, c1214b.isVideoSupported);
        if (cTInAppNotification.getError() != null) {
            c1214b.m6289e(weakReference, cTInAppNotification);
            return Unit.INSTANCE;
        }
        c1214b.m6290f(cTInAppNotification, weakReference);
        return Unit.INSTANCE;
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    private final FileResourceProvider m6288c() {
        return (FileResourceProvider) this.fileResourceProvider.getValue();
    }

    /* JADX INFO: renamed from: e */
    private final void m6289e(WeakReference<a> listenerWeakReference, final CTInAppNotification inApp) {
        final a aVar = listenerWeakReference.get();
        if (aVar != null) {
            this.executors.m190591c().m6946g("InAppNotificationInflater:onNotificationReady", new Callable() { // from class: l.kpm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C1214b.m6286a(aVar, inApp);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m6290f(CTInAppNotification inApp, WeakReference<a> listenerWeakReference) {
        if (CTInAppType.CTInAppTypeCustomCodeTemplate == inApp.getInAppType()) {
            m6291g(inApp);
        } else {
            m6292h(inApp);
        }
        m6289e(listenerWeakReference, inApp);
    }

    /* JADX INFO: renamed from: g */
    private final void m6291g(CTInAppNotification inApp) {
        List<String> listEmptyList;
        CustomTemplateInAppData customTemplateData = inApp.getCustomTemplateData();
        if (customTemplateData == null || (listEmptyList = customTemplateData.m6303c(this.templatesManager)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Pair<dhi, aom> pair = new Pair<>(this.storeRegistry.getFilesStore(), this.storeRegistry.getInAppAssetsStore());
        for (String str : listEmptyList) {
            byte[] bArrM6498n = m6288c().m6498n(str);
            if (bArrM6498n != null) {
                if (!(bArrM6498n.length == 0)) {
                    ygi.INSTANCE.m214724a(new Pair<>(str, CtCacheType.FILES), pair);
                }
            }
            inApp.m6158W("Error processing the custom code in-app template: file download failed.");
            return;
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m6292h(CTInAppNotification inApp) {
        for (CTInAppNotificationMedia cTInAppNotificationMedia : inApp.m6177u()) {
            if (cTInAppNotificationMedia.m6199f()) {
                byte[] bArrM6499o = m6288c().m6499o(cTInAppNotificationMedia.getMediaUrl());
                if (bArrM6499o == null || bArrM6499o.length == 0) {
                    inApp.m6158W("Error processing GIF");
                    return;
                }
            } else if (cTInAppNotificationMedia.m6200g()) {
                if (m6288c().m6500p(cTInAppNotificationMedia.getMediaUrl()) == null) {
                    inApp.m6158W("Error processing image as bitmap was NULL");
                    return;
                }
            } else if (cTInAppNotificationMedia.m6201h() || cTInAppNotificationMedia.m6198e()) {
                if (!this.isVideoSupported) {
                    inApp.m6158W("InApp Video/Audio is not supported");
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6293d(@NotNull final JSONObject inAppJson, @NotNull String taskLogTag, @NotNull a listener) {
        inAppJson.getClass();
        taskLogTag.getClass();
        listener.getClass();
        final WeakReference weakReference = new WeakReference(listener);
        Task taskM190593e = this.executors.m190593e(Constants.TAG_FEATURE_IN_APPS);
        taskM190593e.getClass();
        taskM190593e.m6946g(taskLogTag, new Callable() { // from class: l.jpm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1214b.m6287b(inAppJson, this, weakReference);
            }
        });
    }

    public /* synthetic */ C1214b(zxf0 zxf0Var, chi0 chi0Var, tt3 tt3Var, Function0 function0, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(zxf0Var, chi0Var, tt3Var, function0, (i & 16) != 0 ? t5l0.haveVideoPlayerSupport : z);
    }
}
