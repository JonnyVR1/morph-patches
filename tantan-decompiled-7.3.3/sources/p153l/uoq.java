package p153l;

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
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, m88121d2 = {"Ll/uoq;", "", "<init>", "()V", "", Constants.KEY_ORIENTATION, "a", "(I)I", "Ljava/io/InputStream;", "inputStream", "b", "(Ljava/io/InputStream;)I", "markerToFind", "", "e", "(Ljava/io/InputStream;I)Z", RequestParameters.MARKER, "c", "(I)Z", Constants.INAPP_DATA_TAG, "imagepipeline-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class uoq {

    @NotNull
    public static final uoq INSTANCE = new uoq();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final int m197016a(int orientation) {
        return ozi0.m169963a(orientation);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final int m197017b(@NotNull InputStream inputStream) {
        inputStream.getClass();
        try {
            int iM197020d = INSTANCE.m197020d(inputStream);
            if (iM197020d == 0) {
                return 0;
            }
            return ozi0.m169964d(inputStream, iM197020d);
        } catch (IOException unused) {
            return 0;
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: e */
    public static final boolean m197018e(@NotNull InputStream inputStream, int markerToFind) throws IOException {
        inputStream.getClass();
        while (u7g0.m194855a(inputStream, 1, false) == 255) {
            int iM194855a = 255;
            while (iM194855a == 255) {
                iM194855a = u7g0.m194855a(inputStream, 1, false);
            }
            if ((markerToFind == 192 && INSTANCE.m197019c(iM194855a)) || iM194855a == markerToFind) {
                return true;
            }
            if (iM194855a != 1 && iM194855a != 216) {
                if (iM194855a == 217 || iM194855a == 218) {
                    break;
                }
                inputStream.skip(u7g0.m194855a(inputStream, 2, false) - 2);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m197019c(int marker) {
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
    public final int m197020d(InputStream inputStream) throws IOException {
        if (m197018e(inputStream, 225)) {
            int iM194855a = u7g0.m194855a(inputStream, 2, false);
            if (iM194855a - 2 > 6) {
                int iM194855a2 = u7g0.m194855a(inputStream, 4, false);
                int iM194855a3 = u7g0.m194855a(inputStream, 2, false);
                int i = iM194855a - 8;
                if (iM194855a2 == 1165519206 && iM194855a3 == 0) {
                    return i;
                }
            }
        }
        return 0;
    }
}
