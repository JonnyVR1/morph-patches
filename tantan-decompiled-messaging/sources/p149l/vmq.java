package p149l;

import com.alibaba.fastjson.asm.Opcodes;
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.spongycastle.crypto.tls.CipherSuite;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m87232d2 = {"Ll/vmq;", "", "<init>", "()V", "", Constants.KEY_ORIENTATION, "a", "(I)I", "Ljava/io/InputStream;", "inputStream", "b", "(Ljava/io/InputStream;)I", "markerToFind", "", "e", "(Ljava/io/InputStream;I)Z", RequestParameters.MARKER, "c", "(I)Z", Constants.INAPP_DATA_TAG, "imagepipeline-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class vmq {

    @NotNull
    public static final vmq INSTANCE = new vmq();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m198968a(int orientation) {
        return lqi0.m151029a(orientation);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m198969b(@NotNull InputStream inputStream) {
        inputStream.getClass();
        try {
            int iM198972d = INSTANCE.m198972d(inputStream);
            if (iM198972d == 0) {
                return 0;
            }
            return lqi0.m151030d(inputStream, iM198972d);
        } catch (IOException unused) {
            return 0;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m198970e(@NotNull InputStream inputStream, int markerToFind) throws IOException {
        inputStream.getClass();
        while (nzf0.m162039a(inputStream, 1, false) == 255) {
            int iM162039a = 255;
            while (iM162039a == 255) {
                iM162039a = nzf0.m162039a(inputStream, 1, false);
            }
            if ((markerToFind == 192 && INSTANCE.m198971c(iM162039a)) || iM162039a == markerToFind) {
                return true;
            }
            if (iM162039a != 1 && iM162039a != 216) {
                if (iM162039a == 217 || iM162039a == 218) {
                    break;
                }
                inputStream.skip(nzf0.m162039a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m198971c(int marker) {
        switch (marker) {
            case 192:
            case 193:
            case CipherSuite.TLS_DH_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 194 */:
            case CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256 /* 195 */:
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256 /* 197 */:
            case Opcodes.IFNULL /* 198 */:
            case Opcodes.IFNONNULL /* 199 */:
            case 201:
            case 202:
            case 203:
            case 205:
            case 206:
            case 207:
                return true;
            case CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256 /* 196 */:
            case 200:
            case 204:
            default:
                return false;
        }
    }

    /* JADX INFO: renamed from: d */
    public final int m198972d(InputStream inputStream) throws IOException {
        if (m198970e(inputStream, 225)) {
            int iM162039a = nzf0.m162039a(inputStream, 2, false);
            if (iM162039a - 2 > 6) {
                int iM162039a2 = nzf0.m162039a(inputStream, 4, false);
                int iM162039a3 = nzf0.m162039a(inputStream, 2, false);
                int i = iM162039a - 8;
                if (iM162039a2 == 1165519206 && iM162039a3 == 0) {
                    return i;
                }
            }
        }
        return 0;
    }
}
