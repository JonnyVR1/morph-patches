package p149l;

import com.cosmos.photon.push.service.PushService;
import com.facebook.internal.C1657e;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\n \u0012*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0015¨\u0006\u0017"}, m87232d2 = {"Ll/x520;", "", "<init>", "()V", "Ljava/util/UUID;", "callId", "", "attachmentName", "Ljava/io/File;", "c", "(Ljava/util/UUID;Ljava/lang/String;)Ljava/io/File;", "", PushService.COMMAND_CREATE, "b", "(Ljava/util/UUID;Z)Ljava/io/File;", "createDirs", "a", "(Ljava/util/UUID;Ljava/lang/String;Z)Ljava/io/File;", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "TAG", "Ljava/io/File;", "attachmentsDirectory", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class x520 {

    @NotNull
    public static final x520 INSTANCE = new x520();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = x520.class.getName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static File attachmentsDirectory;

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final File m207066a(@NotNull UUID callId, @Nullable String attachmentName, boolean createDirs) throws IOException {
        callId.getClass();
        File fileM207067b = m207067b(callId, createDirs);
        if (fileM207067b == null) {
            return null;
        }
        try {
            return new File(fileM207067b, URLEncoder.encode(attachmentName, "UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final File m207067b(@NotNull UUID callId, boolean create) {
        callId.getClass();
        if (attachmentsDirectory == null) {
            return null;
        }
        File file = new File(attachmentsDirectory, callId.toString());
        if (create && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final File m207068c(@Nullable UUID callId, @Nullable String attachmentName) throws FileNotFoundException {
        if (C1657e.m8832c0(attachmentName) || callId == null) {
            throw new FileNotFoundException();
        }
        try {
            return m207066a(callId, attachmentName, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }
}
