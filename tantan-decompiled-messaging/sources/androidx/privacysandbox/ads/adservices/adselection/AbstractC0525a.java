package androidx.privacysandbox.ads.adservices.adselection;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RequiresPermission;
import com.google.android.exoplayer2.PlaybackException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.btc0;
import p149l.x70;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000 \r2\u00020\u0001:\u0002\u000b\u0006B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H§@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH§@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m87232d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/a;", "", "<init>", "()V", "Ll/x70;", "adSelectionConfig", "b", "(Ll/x70;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ll/btc0;", "reportImpressionRequest", "", "a", "(Ll/btc0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public abstract class AbstractC0525a {

    /* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.adselection.a$a */
    @Metadata(m87231d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m87232d2 = {"Landroidx/privacysandbox/ads/adservices/adselection/a$a;", "Landroidx/privacysandbox/ads/adservices/adselection/a;", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    @SuppressLint({"NewApi", "ClassVerificationFailure"})
    @RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4)
    @SourceDebugExtension
    public static final class a extends AbstractC0525a {
    }

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract Object m3195a(@NotNull btc0 btc0Var, @NotNull Continuation<? super Unit> continuation);

    @RequiresPermission("android.permission.ACCESS_ADSERVICES_CUSTOM_AUDIENCE")
    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract Object m3196b(@NotNull x70 x70Var, @NotNull Continuation<Object> continuation);
}
