package p149l;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(28)
@Metadata(m87231d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"Ll/mc20;", "", "<init>", "()V", "", "capabilities", "transports", "Landroid/net/NetworkRequest;", "a", "([I[I)Landroid/net/NetworkRequest;", SocialConstants.TYPE_REQUEST, "", "capability", "", "c", "(Landroid/net/NetworkRequest;I)Z", NotificationCompat.CATEGORY_TRANSPORT, Constants.INAPP_DATA_TAG, "Ll/qc20;", "b", "([I[I)Ll/qc20;", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@SourceDebugExtension
public final class mc20 {

    @NotNull
    public static final mc20 INSTANCE = new mc20();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final NetworkRequest m153979a(@NotNull int[] capabilities, @NotNull int[] transports) {
        capabilities.getClass();
        transports.getClass();
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : capabilities) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                txv.m190976e().mo190987l(qc20.INSTANCE.m173863a(), "Ignoring adding capability '" + i + '\'', e);
            }
        }
        for (int i2 : rc20.f158711a) {
            if (!ArraysKt.contains(capabilities, i2)) {
                try {
                    builder.removeCapability(i2);
                } catch (IllegalArgumentException e2) {
                    txv.m190976e().mo190987l(qc20.INSTANCE.m173863a(), "Ignoring removing default capability '" + i2 + '\'', e2);
                }
            }
        }
        for (int i3 : transports) {
            builder.addTransportType(i3);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return networkRequestBuild;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final qc20 m153980b(@NotNull int[] capabilities, @NotNull int[] transports) {
        capabilities.getClass();
        transports.getClass();
        return new qc20(m153979a(capabilities, transports));
    }

    /* JADX INFO: renamed from: c */
    public final boolean m153981c(@NotNull NetworkRequest request, int capability) {
        request.getClass();
        return request.hasCapability(capability);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m153982d(@NotNull NetworkRequest request, int transport) {
        request.getClass();
        return request.hasTransport(transport);
    }
}
