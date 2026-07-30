package p149l;

import android.net.NetworkRequest;
import androidx.annotation.RequiresApi;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(31)
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m87232d2 = {"Ll/pc20;", "", "<init>", "()V", "Landroid/net/NetworkRequest;", SocialConstants.TYPE_REQUEST, "", "a", "(Landroid/net/NetworkRequest;)[I", "b", "work-runtime_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class pc20 {

    @NotNull
    public static final pc20 INSTANCE = new pc20();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final int[] m168306a(@NotNull NetworkRequest request) {
        request.getClass();
        int[] capabilities = request.getCapabilities();
        capabilities.getClass();
        return capabilities;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final int[] m168307b(@NotNull NetworkRequest request) {
        request.getClass();
        int[] transportTypes = request.getTransportTypes();
        transportTypes.getClass();
        return transportTypes;
    }
}
