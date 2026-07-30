package com.tantanapp.sharedlibrary.loader;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.nxc0;

/* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.a */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u001a(Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00130\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u0019J\r\u0010\u001b\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u0019J\r\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001c\u0010\u0019J\u000f\u0010\u001d\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010#\u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001eR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u0010+\u001a\u0004\b6\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b.\u00108R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\b2\u0010:R)\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00130\u00118\u0006¢\u0006\f\n\u0004\b0\u0010;\u001a\u0004\b5\u0010<¨\u0006="}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/a;", "", "Landroid/content/Context;", "context", "Lcom/tantanapp/sharedlibrary/loader/Abi;", "abi", "", "useObb", "", "obbSalt", "", "obbPublicKey", "mockObb", "Lcom/tantanapp/sharedlibrary/loader/a$a;", "downloader", "Lcom/tantanapp/sharedlibrary/loader/a$b;", "errorReporter", "Lkotlin/Function1;", "Lkotlin/Function0;", "", "installNativeLibraryPathSynchronizer", "<init>", "(Landroid/content/Context;Lcom/tantanapp/sharedlibrary/loader/Abi;Z[BLjava/lang/String;ZLcom/tantanapp/sharedlibrary/loader/a$a;Lcom/tantanapp/sharedlibrary/loader/a$b;Lkotlin/jvm/functions/Function1;)V", "Ljava/io/File;", "k", "()Ljava/io/File;", "a", BLiveStormDanmakuGiftResourceType.f44444l, "m", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "c", "()Landroid/content/Context;", "b", "Lcom/tantanapp/sharedlibrary/loader/Abi;", "()Lcom/tantanapp/sharedlibrary/loader/Abi;", "Z", "j", "()Z", Constants.INAPP_DATA_TAG, "[B", RXScreenCaptureService.KEY_INDEX, "()[B", "e", "Ljava/lang/String;", "h", "f", "g", "Lcom/tantanapp/sharedlibrary/loader/a$a;", "()Lcom/tantanapp/sharedlibrary/loader/a$a;", "Lcom/tantanapp/sharedlibrary/loader/a$b;", "()Lcom/tantanapp/sharedlibrary/loader/a$b;", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final /* data */ class C13683a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Abi abi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean useObb;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public final byte[] obbSalt;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata and from toString */
    @NotNull
    public final String obbPublicKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public final boolean mockObb;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final a downloader;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final b errorReporter;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Function1<Function0<Unit>, Unit> installNativeLibraryPathSynchronizer;

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.a$a */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JA\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\b0\u0006H&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/a$a;", "", "", "url", "path", "fileName", "Lkotlin/Function1;", "Ll/nxc0;", "", "callback", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo81488a(@NotNull String url, @NotNull String path, @NotNull String fileName, @NotNull Function1<? super nxc0<Unit>, Unit> callback);
    }

    /* JADX INFO: renamed from: com.tantanapp.sharedlibrary.loader.a$b */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Lcom/tantanapp/sharedlibrary/loader/a$b;", "", "", "business", "module", "", "throwable", "", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "loader_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo81489a(@NotNull String business, @NotNull String module, @NotNull Throwable throwable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C13683a(@NotNull Context context, @NotNull Abi abi, boolean z, @NotNull byte[] bArr, @NotNull String str, boolean z2, @NotNull a aVar, @Nullable b bVar, @NotNull Function1<? super Function0<Unit>, Unit> function1) {
        context.getClass();
        abi.getClass();
        bArr.getClass();
        str.getClass();
        aVar.getClass();
        function1.getClass();
        this.context = context;
        this.abi = abi;
        this.useObb = z;
        this.obbSalt = bArr;
        this.obbPublicKey = str;
        this.mockObb = z2;
        this.downloader = aVar;
        this.errorReporter = bVar;
        this.installNativeLibraryPathSynchronizer = function1;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final File m81475a() {
        if (this.useObb && !this.mockObb) {
            File obbDir = this.context.getApplicationContext().getObbDir();
            obbDir.getClass();
            return obbDir;
        }
        return new File(m81485k(), this.abi.getId() + "-download");
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Abi getAbi() {
        return this.abi;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getDownloader() {
        return this.downloader;
    }

    @Nullable
    /* JADX INFO: renamed from: e, reason: from getter */
    public final b getErrorReporter() {
        return this.errorReporter;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C13683a)) {
            return false;
        }
        C13683a c13683a = (C13683a) other;
        return Intrinsics.m87488d(this.context, c13683a.context) && this.abi == c13683a.abi && this.useObb == c13683a.useObb && Intrinsics.m87488d(this.obbSalt, c13683a.obbSalt) && Intrinsics.m87488d(this.obbPublicKey, c13683a.obbPublicKey) && this.mockObb == c13683a.mockObb && Intrinsics.m87488d(this.downloader, c13683a.downloader) && Intrinsics.m87488d(this.errorReporter, c13683a.errorReporter) && Intrinsics.m87488d(this.installNativeLibraryPathSynchronizer, c13683a.installNativeLibraryPathSynchronizer);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public final Function1<Function0<Unit>, Unit> m81480f() {
        return this.installNativeLibraryPathSynchronizer;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getMockObb() {
        return this.mockObb;
    }

    @NotNull
    /* JADX INFO: renamed from: h, reason: from getter */
    public final String getObbPublicKey() {
        return this.obbPublicKey;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.context.hashCode() * 31) + this.abi.hashCode()) * 31;
        boolean z = this.useObb;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int iHashCode2 = (((((iHashCode + r1) * 31) + Arrays.hashCode(this.obbSalt)) * 31) + this.obbPublicKey.hashCode()) * 31;
        boolean z2 = this.mockObb;
        int iHashCode3 = (((iHashCode2 + (z2 ? 1 : z2)) * 31) + this.downloader.hashCode()) * 31;
        b bVar = this.errorReporter;
        return ((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.installNativeLibraryPathSynchronizer.hashCode();
    }

    @NotNull
    /* JADX INFO: renamed from: i, reason: from getter */
    public final byte[] getObbSalt() {
        return this.obbSalt;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getUseObb() {
        return this.useObb;
    }

    @NotNull
    /* JADX INFO: renamed from: k */
    public final File m81485k() {
        return new File(this.context.getApplicationInfo().dataDir, "so");
    }

    @NotNull
    /* JADX INFO: renamed from: l */
    public final File m81486l() {
        return new File(m81485k(), this.abi.getId());
    }

    @NotNull
    /* JADX INFO: renamed from: m */
    public final File m81487m() {
        return new File(m81485k(), this.abi.getId() + "-unzip");
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder("Config(abi=");
        sb.append(this.abi.getId());
        sb.append(", useObb=");
        sb.append(this.useObb);
        sb.append(", obbSalt=");
        String string = Arrays.toString(this.obbSalt);
        string.getClass();
        sb.append(string);
        sb.append(", obbPublicKey='");
        sb.append(this.obbPublicKey);
        sb.append("', mockObb=");
        sb.append(this.mockObb);
        sb.append(')');
        return sb.toString();
    }
}
