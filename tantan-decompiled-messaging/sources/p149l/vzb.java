package p149l;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.cryption.InterfaceC1176c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Ll/vzb;", "", "Lcom/clevertap/android/sdk/cryption/c;", "crypt", "Ll/nul;", "logger", "Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", CleverTapInstanceConfig.KEY_ENCRYPTION_LEVEL, "<init>", "(Lcom/clevertap/android/sdk/cryption/c;Ll/nul;Lcom/clevertap/android/sdk/cryption/EncryptionLevel;)V", "", "data", "b", "(Ljava/lang/String;)Ljava/lang/String;", "c", "", "a", "(Ljava/lang/String;)Z", "Lcom/clevertap/android/sdk/cryption/c;", "Ll/nul;", "Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class vzb {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC1176c crypt;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final nul logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final EncryptionLevel encryptionLevel;

    /* JADX INFO: renamed from: l.vzb$b */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public /* synthetic */ class C20770b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f183606a;

        static {
            int[] iArr = new int[EncryptionLevel.values().length];
            try {
                iArr[EncryptionLevel.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EncryptionLevel.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EncryptionLevel.FULL_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f183606a = iArr;
        }
    }

    public vzb(@NotNull InterfaceC1176c interfaceC1176c, @NotNull nul nulVar, @NotNull EncryptionLevel encryptionLevel) {
        interfaceC1176c.getClass();
        nulVar.getClass();
        encryptionLevel.getClass();
        this.crypt = interfaceC1176c;
        this.logger = nulVar;
        this.encryptionLevel = encryptionLevel;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m200736a(@NotNull String data) {
        data.getClass();
        int i = C20770b.f183606a[this.encryptionLevel.ordinal()];
        if (i == 1 || i == 2) {
            return !CryptHandler.INSTANCE.m5956c(data);
        }
        if (i == 3) {
            return CryptHandler.INSTANCE.m5955b(data);
        }
        l9r.m149037a();
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m200737b(@Nullable String data) {
        System.currentTimeMillis();
        if (data != null) {
            String strMo5951d = this.crypt.mo5951d(data);
            if (strMo5951d == null) {
                this.logger.verbose("DBEncryptionHandler", "unwrapDbData: Decryption failed for ".concat(data));
            }
            data = strMo5951d;
        }
        System.currentTimeMillis();
        return data;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m200738c(@NotNull String data) {
        data.getClass();
        System.currentTimeMillis();
        if (this.encryptionLevel == EncryptionLevel.FULL_DATA) {
            String strMo5950c = this.crypt.mo5950c(data);
            if (strMo5950c == null) {
                this.logger.verbose("DBEncryptionHandler", "wrapDbData: Encryption failed for " + data);
            }
            if (strMo5950c != null) {
                data = strMo5950c;
            }
        }
        System.currentTimeMillis();
        return data;
    }
}
