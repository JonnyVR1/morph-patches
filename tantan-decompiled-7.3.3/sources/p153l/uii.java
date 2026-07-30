package p153l;

import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Ll/uii;", "", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMeta", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Lkotlin/Pair;)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface uii {
    @NotNull
    /* JADX INFO: renamed from: a */
    DownloadedBitmap mo191334a(@NotNull Pair<String, ? extends CtCacheType> urlMeta);
}
