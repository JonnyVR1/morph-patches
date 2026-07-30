package p153l;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.cryption.CryptHandler;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.cryption.InterfaceC1199c;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Ll/j1c;", "", "Lcom/clevertap/android/sdk/cryption/c;", "crypt", "Ll/axl;", "logger", "Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", CleverTapInstanceConfig.KEY_ENCRYPTION_LEVEL, "<init>", "(Lcom/clevertap/android/sdk/cryption/c;Ll/axl;Lcom/clevertap/android/sdk/cryption/EncryptionLevel;)V", "", "data", "b", "(Ljava/lang/String;)Ljava/lang/String;", "c", "", "a", "(Ljava/lang/String;)Z", "Lcom/clevertap/android/sdk/cryption/c;", "Ll/axl;", "Lcom/clevertap/android/sdk/cryption/EncryptionLevel;", "Companion", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class j1c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC1199c crypt;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final axl logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final EncryptionLevel encryptionLevel;

    /* JADX INFO: renamed from: l.j1c$b */
    @Metadata(m88122k = 3, m88123mv = {2, 0, 0}, m88125xi = 48)
    public /* synthetic */ class C17847b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f117950a;

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
            f117950a = iArr;
        }
    }

    public j1c(@NotNull InterfaceC1199c interfaceC1199c, @NotNull axl axlVar, @NotNull EncryptionLevel encryptionLevel) {
        interfaceC1199c.getClass();
        axlVar.getClass();
        encryptionLevel.getClass();
        this.crypt = interfaceC1199c;
        this.logger = axlVar;
        this.encryptionLevel = encryptionLevel;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m143112a(@NotNull String data) {
        data.getClass();
        int i = C17847b.f117950a[this.encryptionLevel.ordinal()];
        if (i == 1 || i == 2) {
            return !CryptHandler.INSTANCE.m6010c(data);
        }
        if (i == 3) {
            return CryptHandler.INSTANCE.m6009b(data);
        }
        nbr.m162172a();
        return false;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final String m143113b(@Nullable String data) {
        System.currentTimeMillis();
        if (data != null) {
            String strMo6005d = this.crypt.mo6005d(data);
            if (strMo6005d == null) {
                this.logger.verbose("DBEncryptionHandler", "unwrapDbData: Decryption failed for ".concat(data));
            }
            data = strMo6005d;
        }
        System.currentTimeMillis();
        return data;
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m143114c(@NotNull String data) {
        data.getClass();
        System.currentTimeMillis();
        if (this.encryptionLevel == EncryptionLevel.FULL_DATA) {
            String strMo6004c = this.crypt.mo6004c(data);
            if (strMo6004c == null) {
                this.logger.verbose("DBEncryptionHandler", "wrapDbData: Encryption failed for " + data);
            }
            if (strMo6004c != null) {
                data = strMo6004c;
            }
        }
        System.currentTimeMillis();
        return data;
    }
}
