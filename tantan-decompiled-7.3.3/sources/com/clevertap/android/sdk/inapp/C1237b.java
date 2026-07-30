package com.clevertap.android.sdk.inapp;

import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.C1237b;
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
import p153l.aki;
import p153l.cqi0;
import p153l.cqm;
import p153l.h6g0;
import p153l.su3;
import p153l.vji;
import p153l.xel0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001:\u0001#B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J%\u0010\u001a\u001a\u00020\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ%\u0010!\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0012¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010)R\u001b\u0010\n\u001a\u00020\t8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b'\u0010+¨\u0006,"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/b;", "", "Ll/h6g0;", "storeRegistry", "Ll/cqi0;", "templatesManager", "Ll/su3;", "executors", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "", "isVideoSupported", "<init>", "(Ll/h6g0;Ll/cqi0;Ll/su3;Lkotlin/jvm/functions/Function0;Z)V", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "inApp", "Ljava/lang/ref/WeakReference;", "Lcom/clevertap/android/sdk/inapp/b$a;", "listenerWeakReference", "", "f", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Ljava/lang/ref/WeakReference;)V", "g", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "h", "e", "(Ljava/lang/ref/WeakReference;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "Lorg/json/JSONObject;", "inAppJson", "", "taskLogTag", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, Constants.INAPP_DATA_TAG, "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/b$a;)V", "a", "Ll/h6g0;", "b", "Ll/cqi0;", "c", "Ll/su3;", "Z", "Lkotlin/Lazy;", "()Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class C1237b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final h6g0 storeRegistry;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final cqi0 templatesManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final su3 executors;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isVideoSupported;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy fileResourceProvider;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inapp.b$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/b$a;", "", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "notification", "", "b", "(Lcom/clevertap/android/sdk/inapp/CTInAppNotification;)V", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo6328b(@NotNull CTInAppNotification notification);
    }

    public C1237b(@NotNull h6g0 h6g0Var, @NotNull cqi0 cqi0Var, @NotNull su3 su3Var, @NotNull Function0<FileResourceProvider> function0, boolean z) {
        h6g0Var.getClass();
        cqi0Var.getClass();
        su3Var.getClass();
        function0.getClass();
        this.storeRegistry = h6g0Var;
        this.templatesManager = cqi0Var;
        this.executors = su3Var;
        this.isVideoSupported = z;
        this.fileResourceProvider = LazyKt__LazyJVMKt.m88118b(function0);
    }

    /* JADX INFO: renamed from: a */
    public static Unit m6340a(a aVar, CTInAppNotification cTInAppNotification) {
        cTInAppNotification.getClass();
        aVar.mo6328b(cTInAppNotification);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: b */
    public static Unit m6341b(JSONObject jSONObject, C1237b c1237b, WeakReference weakReference) {
        jSONObject.getClass();
        c1237b.getClass();
        weakReference.getClass();
        CTInAppNotification cTInAppNotification = new CTInAppNotification(jSONObject, c1237b.isVideoSupported);
        if (cTInAppNotification.getError() != null) {
            c1237b.m6343e(weakReference, cTInAppNotification);
            return Unit.INSTANCE;
        }
        c1237b.m6344f(cTInAppNotification, weakReference);
        return Unit.INSTANCE;
    }

    @WorkerThread
    /* JADX INFO: renamed from: c */
    private final FileResourceProvider m6342c() {
        return (FileResourceProvider) this.fileResourceProvider.getValue();
    }

    /* JADX INFO: renamed from: e */
    private final void m6343e(WeakReference<a> listenerWeakReference, final CTInAppNotification inApp) {
        final a aVar = listenerWeakReference.get();
        if (aVar != null) {
            this.executors.m187989c().m7000g("InAppNotificationInflater:onNotificationReady", new Callable() { // from class: l.mrm
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return C1237b.m6340a(aVar, inApp);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f */
    private final void m6344f(CTInAppNotification inApp, WeakReference<a> listenerWeakReference) {
        if (CTInAppType.CTInAppTypeCustomCodeTemplate == inApp.getInAppType()) {
            m6345g(inApp);
        } else {
            m6346h(inApp);
        }
        m6343e(listenerWeakReference, inApp);
    }

    /* JADX INFO: renamed from: g */
    private final void m6345g(CTInAppNotification inApp) {
        List<String> listEmptyList;
        CustomTemplateInAppData customTemplateData = inApp.getCustomTemplateData();
        if (customTemplateData == null || (listEmptyList = customTemplateData.m6357c(this.templatesManager)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Pair<aki, cqm> pair = new Pair<>(this.storeRegistry.getFilesStore(), this.storeRegistry.getInAppAssetsStore());
        for (String str : listEmptyList) {
            byte[] bArrM6552n = m6342c().m6552n(str);
            if (bArrM6552n != null) {
                if (!(bArrM6552n.length == 0)) {
                    vji.INSTANCE.m201521a(new Pair<>(str, CtCacheType.FILES), pair);
                }
            }
            inApp.m6212W("Error processing the custom code in-app template: file download failed.");
            return;
        }
    }

    /* JADX INFO: renamed from: h */
    private final void m6346h(CTInAppNotification inApp) {
        for (CTInAppNotificationMedia cTInAppNotificationMedia : inApp.m6231u()) {
            if (cTInAppNotificationMedia.m6253f()) {
                byte[] bArrM6553o = m6342c().m6553o(cTInAppNotificationMedia.getMediaUrl());
                if (bArrM6553o == null || bArrM6553o.length == 0) {
                    inApp.m6212W("Error processing GIF");
                    return;
                }
            } else if (cTInAppNotificationMedia.m6254g()) {
                if (m6342c().m6554p(cTInAppNotificationMedia.getMediaUrl()) == null) {
                    inApp.m6212W("Error processing image as bitmap was NULL");
                    return;
                }
            } else if (cTInAppNotificationMedia.m6255h() || cTInAppNotificationMedia.m6252e()) {
                if (!this.isVideoSupported) {
                    inApp.m6212W("InApp Video/Audio is not supported");
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m6347d(@NotNull final JSONObject inAppJson, @NotNull String taskLogTag, @NotNull a listener) {
        inAppJson.getClass();
        taskLogTag.getClass();
        listener.getClass();
        final WeakReference weakReference = new WeakReference(listener);
        Task taskM187991e = this.executors.m187991e(Constants.TAG_FEATURE_IN_APPS);
        taskM187991e.getClass();
        taskM187991e.m7000g(taskLogTag, new Callable() { // from class: l.lrm
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C1237b.m6341b(inAppJson, this, weakReference);
            }
        });
    }

    public /* synthetic */ C1237b(h6g0 h6g0Var, cqi0 cqi0Var, su3 su3Var, Function0 function0, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(h6g0Var, cqi0Var, su3Var, function0, (i & 16) != 0 ? xel0.haveVideoPlayerSupport : z);
    }
}
