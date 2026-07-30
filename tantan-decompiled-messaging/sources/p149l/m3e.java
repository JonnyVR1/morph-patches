package p149l;

import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000  2\u00020\u0001:\u0001\u0014BH\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012#\b\u0002\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0011J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001bR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR5\u0010\r\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"Ll/m3e;", "", "Ljava/io/File;", "directory", "", "maxFileSizeKb", "Ll/nul;", "logger", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", AuthenticationTokenClaims.JSON_KEY_NAME, Constants.KEY_KEY, "hashFunction", "<init>", "(Ljava/io/File;ILl/nul;Lkotlin/jvm/functions/Function1;)V", "b", "(Ljava/lang/String;)Ljava/io/File;", "", "value", "a", "(Ljava/lang/String;[B)Ljava/io/File;", "c", "", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", "Ljava/io/File;", "I", "Ll/nul;", "Lkotlin/jvm/functions/Function1;", "getHashFunction$clevertap_core_release", "()Lkotlin/jvm/functions/Function1;", "Companion", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class m3e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final File directory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int maxFileSizeKb;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final nul logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function1<String, String> hashFunction;

    public /* synthetic */ m3e(File file, int i, nul nulVar, Function1 function1, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i, (i2 & 4) != 0 ? null : nulVar, (i2 & 8) != 0 ? lvj0.INSTANCE.m151899b() : function1);
    }

    /* JADX INFO: renamed from: b */
    private final File m152835b(String key) {
        return new File(this.directory + "/CT_FILE_" + this.hashFunction.invoke(key));
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final File m152836a(@NotNull String key, @NotNull byte[] value) throws IOException {
        key.getClass();
        value.getClass();
        if (fx3.m123618a(value) > this.maxFileSizeKb) {
            m152838d(key);
            bub.m103905a("File size exceeds the maximum limit of ", this.maxFileSizeKb);
            return null;
        }
        File fileM152835b = m152835b(key);
        if (fileM152835b.exists()) {
            fileM152835b.delete();
        }
        File fileM152835b2 = m152835b(key);
        nul nulVar = this.logger;
        if (nulVar != null) {
            nulVar.verbose("FileDownload", "mapped file path - " + fileM152835b2.getAbsoluteFile() + " to key - " + key);
        }
        FileOutputStream fileOutputStream = new FileOutputStream(fileM152835b2);
        fileOutputStream.write(value);
        fileOutputStream.close();
        return fileM152835b2;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public final File m152837c(@NotNull String key) {
        key.getClass();
        File fileM152835b = m152835b(key);
        if (fileM152835b.exists()) {
            return fileM152835b;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m152838d(@NotNull String key) {
        key.getClass();
        File fileM152835b = m152835b(key);
        if (!fileM152835b.exists()) {
            return false;
        }
        fileM152835b.delete();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m3e(@NotNull File file, int i, @Nullable nul nulVar, @NotNull Function1<? super String, String> function1) {
        file.getClass();
        function1.getClass();
        this.directory = file;
        this.maxFileSizeKb = i;
        this.logger = nulVar;
        this.hashFunction = function1;
    }
}
