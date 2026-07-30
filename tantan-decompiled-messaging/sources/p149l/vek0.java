package p149l;

import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87231d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a!\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a!\u0010\u000f\u001a\u00020\f*\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0013\u001a\u00020\f*\u00020\f2\u0006\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0010\u001a\u0011\u0010\u0015\u001a\u00020\u0002*\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0011\u0010\u0018\u001a\u00020\u0002*\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019\"\"\u0010 \u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, m87232d2 = {"", "msg", "", "c", "(Ljava/lang/String;)V", "error", "", NotificationCompat.CATEGORY_ERROR, "a", "(Ljava/lang/String;Ljava/lang/Throwable;)V", "g", "(Ljava/lang/String;)Ljava/lang/String;", "", "min", Constants.PRIORITY_MAX, Constants.INAPP_DATA_TAG, "(FFF)F", "edge0", "edge1", "h", "Ljava/io/InputStream;", "e", "(Ljava/io/InputStream;)V", "Ljava/io/OutputStream;", "f", "(Ljava/io/OutputStream;)V", "", "Z", "getDEBUG_LOG", "()Z", "setDEBUG_LOG", "(Z)V", "DEBUG_LOG", "android_release"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class vek0 {

    /* JADX INFO: renamed from: a */
    public static boolean f181210a = true;

    /* JADX INFO: renamed from: a */
    public static final void m198201a(@NotNull String str, @Nullable Throwable th) {
        str.getClass();
        if (f181210a) {
            if (th != null) {
                th.getMessage();
            }
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m198202b(String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        m198201a(str, th);
    }

    /* JADX INFO: renamed from: c */
    public static final void m198203c(@NotNull String str) {
        str.getClass();
    }

    /* JADX INFO: renamed from: d */
    public static final float m198204d(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    /* JADX INFO: renamed from: e */
    public static final void m198205e(@NotNull InputStream inputStream) {
        inputStream.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            inputStream.close();
            Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m198206f(@NotNull OutputStream outputStream) {
        outputStream.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            outputStream.close();
            Result.m223820constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m223820constructorimpl(ResultKt.m87238a(th));
        }
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m198207g(@NotNull String str) throws NoSuchAlgorithmException {
        str.getClass();
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        bytes.getClass();
        String string = new BigInteger(1, messageDigest.digest(bytes)).toString(16);
        string.getClass();
        return StringsKt.m93448o0(string, 32, '0');
    }

    /* JADX INFO: renamed from: h */
    public static final float m198208h(float f, float f2, float f3) {
        float fM198204d = m198204d((f - f2) / (f3 - f2), 0.0f, 1.0f);
        return fM198204d * fM198204d * (3.0f - (fM198204d * 2.0f));
    }
}
