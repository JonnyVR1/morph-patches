package p149l;

import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.facebook.AuthenticationTokenClaims;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001Jí\u0001\u0010\u0013\u001a\u00020\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022/\b\u0002\u0010\f\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00072/\b\u0002\u0010\r\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00072/\b\u0002\u0010\u000e\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u00072/\b\u0002\u0010\u0012\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u00020\u000b0\u0007H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Ll/igi;", "", "", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMetas", "Lkotlin/Function1;", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, "urlMeta", "", "successBlock", "failureBlock", "startedBlock", "", "", "urlDownloadStatus", "preloadFinished", "a", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface igi {
    /* JADX INFO: renamed from: a */
    void mo6509a(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMetas, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> startedBlock, @NotNull Function1<? super Map<String, Boolean>, Unit> preloadFinished);
}
