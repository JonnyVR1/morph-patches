package p153l;

import com.clevertap.android.sdk.network.DownloadedBitmap;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Ll/mpl;", "", "Ljava/io/InputStream;", "inputStream", "Ljava/net/HttpURLConnection;", "connection", "", "downloadStartTimeInMilliseconds", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "a", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;J)Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public interface mpl {
    @NotNull
    /* JADX INFO: renamed from: a */
    DownloadedBitmap mo152557a(@NotNull InputStream inputStream, @NotNull HttpURLConnection connection, long downloadStartTimeInMilliseconds);
}
