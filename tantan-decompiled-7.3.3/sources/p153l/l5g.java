package p153l;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u001e\b\u0080\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b!\u00105R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u0010%\u001a\u0004\b'\u0010\u001aR%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b(\u00107\u001a\u0004\b/\u00108R\u001f\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b3\u00102R\u001f\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b6\u00102¨\u00069"}, m88121d2 = {"Ll/l5g;", "", "Landroid/view/ViewGroup;", "container", "", "fallbackUrl", "primaryUrl", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", "Lkotlin/Function0;", "", "isReleased", "Ll/m960;", "callbacks", "errorContext", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "onBitmapReady", "", "onSuccess", "onTotalFailure", "<init>", "(Landroid/view/ViewGroup;Ljava/lang/String;Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;Lkotlin/jvm/functions/Function0;Ll/m960;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/view/ViewGroup;", "b", "()Landroid/view/ViewGroup;", "Ljava/lang/String;", Constants.INAPP_DATA_TAG, "c", RXScreenCaptureService.KEY_INDEX, "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "j", "()Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "e", "Ljava/util/concurrent/ExecutorService;", "()Ljava/util/concurrent/ExecutorService;", "f", "Lkotlin/jvm/functions/Function0;", "k", "()Lkotlin/jvm/functions/Function0;", "g", "Ll/m960;", "()Ll/m960;", "h", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final /* data */ class l5g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final ViewGroup container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final String fallbackUrl;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final String primaryUrl;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final FileResourceProvider resourceProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final ExecutorService mediaExecutor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isReleased;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    private final m960 callbacks;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final String errorContext;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private final Function1<Bitmap, Boolean> onBitmapReady;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    private final Function0<Unit> onSuccess;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private final Function0<Unit> onTotalFailure;

    /* JADX WARN: Multi-variable type inference failed */
    public l5g(@NotNull ViewGroup viewGroup, @Nullable String str, @NotNull String str2, @NotNull FileResourceProvider fileResourceProvider, @NotNull ExecutorService executorService, @NotNull Function0<Boolean> function0, @Nullable m960 m960Var, @NotNull String str3, @Nullable Function1<? super Bitmap, Boolean> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3) {
        viewGroup.getClass();
        str2.getClass();
        fileResourceProvider.getClass();
        executorService.getClass();
        function0.getClass();
        str3.getClass();
        this.container = viewGroup;
        this.fallbackUrl = str;
        this.primaryUrl = str2;
        this.resourceProvider = fileResourceProvider;
        this.mediaExecutor = executorService;
        this.isReleased = function0;
        this.callbacks = m960Var;
        this.errorContext = str3;
        this.onBitmapReady = function1;
        this.onSuccess = function2;
        this.onTotalFailure = function3;
    }

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final m960 getCallbacks() {
        return this.callbacks;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final ViewGroup getContainer() {
        return this.container;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getErrorContext() {
        return this.errorContext;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getFallbackUrl() {
        return this.fallbackUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final ExecutorService getMediaExecutor() {
        return this.mediaExecutor;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof l5g)) {
            return false;
        }
        l5g l5gVar = (l5g) other;
        return Intrinsics.m88377d(this.container, l5gVar.container) && Intrinsics.m88377d(this.fallbackUrl, l5gVar.fallbackUrl) && Intrinsics.m88377d(this.primaryUrl, l5gVar.primaryUrl) && Intrinsics.m88377d(this.resourceProvider, l5gVar.resourceProvider) && Intrinsics.m88377d(this.mediaExecutor, l5gVar.mediaExecutor) && Intrinsics.m88377d(this.isReleased, l5gVar.isReleased) && Intrinsics.m88377d(this.callbacks, l5gVar.callbacks) && Intrinsics.m88377d(this.errorContext, l5gVar.errorContext) && Intrinsics.m88377d(this.onBitmapReady, l5gVar.onBitmapReady) && Intrinsics.m88377d(this.onSuccess, l5gVar.onSuccess) && Intrinsics.m88377d(this.onTotalFailure, l5gVar.onTotalFailure);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final Function1<Bitmap, Boolean> m152949f() {
        return this.onBitmapReady;
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final Function0<Unit> m152950g() {
        return this.onSuccess;
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Function0<Unit> m152951h() {
        return this.onTotalFailure;
    }

    public int hashCode() {
        int iHashCode = this.container.hashCode() * 31;
        String str = this.fallbackUrl;
        int iHashCode2 = (((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.primaryUrl.hashCode()) * 31) + this.resourceProvider.hashCode()) * 31) + this.mediaExecutor.hashCode()) * 31) + this.isReleased.hashCode()) * 31;
        m960 m960Var = this.callbacks;
        int iHashCode3 = (((iHashCode2 + (m960Var == null ? 0 : m960Var.hashCode())) * 31) + this.errorContext.hashCode()) * 31;
        Function1<Bitmap, Boolean> function1 = this.onBitmapReady;
        int iHashCode4 = (iHashCode3 + (function1 == null ? 0 : function1.hashCode())) * 31;
        Function0<Unit> function0 = this.onSuccess;
        int iHashCode5 = (iHashCode4 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function0<Unit> function2 = this.onTotalFailure;
        return iHashCode5 + (function2 != null ? function2.hashCode() : 0);
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getPrimaryUrl() {
        return this.primaryUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: j, reason: from getter */
    public final FileResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final Function0<Boolean> m152954k() {
        return this.isReleased;
    }

    @NotNull
    public String toString() {
        return "FallbackLoadRequest(container=" + this.container + ", fallbackUrl=" + this.fallbackUrl + ", primaryUrl=" + this.primaryUrl + ", resourceProvider=" + this.resourceProvider + ", mediaExecutor=" + this.mediaExecutor + ", isReleased=" + this.isReleased + ", callbacks=" + this.callbacks + ", errorContext=" + this.errorContext + ", onBitmapReady=" + this.onBitmapReady + ", onSuccess=" + this.onSuccess + ", onTotalFailure=" + this.onTotalFailure + ')';
    }

    public /* synthetic */ l5g(ViewGroup viewGroup, String str, String str2, FileResourceProvider fileResourceProvider, ExecutorService executorService, Function0 function0, m960 m960Var, String str3, Function1 function1, Function0 function2, Function0 function3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, str, str2, fileResourceProvider, executorService, function0, m960Var, str3, (i & 256) != 0 ? null : function1, (i & 512) != 0 ? null : function2, (i & 1024) != 0 ? null : function3);
    }
}
