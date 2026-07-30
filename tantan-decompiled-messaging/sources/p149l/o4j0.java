package p149l;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.RequiresExtension;
import androidx.annotation.RestrictTo;
import androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon;
import com.google.android.exoplayer2.PlaybackException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"Ll/o4j0;", "Landroidx/privacysandbox/ads/adservices/topics/TopicsManagerImplCommon;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "ads-adservices_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SuppressLint({"NewApi", "ClassVerificationFailure"})
@RequiresExtension(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE, version = 4)
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o4j0 extends TopicsManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public o4j0(@NotNull Context context) {
        context.getClass();
        Object systemService = context.getSystemService((Class<Object>) n4j0.class);
        systemService.getClass();
        super((n4j0) systemService);
    }
}
