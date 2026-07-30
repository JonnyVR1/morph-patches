package kotlin.p122io.path;

import com.clevertap.android.sdk.Constants;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p153l.bj60;
import p153l.sj60;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ljava/nio/file/Path;", "path", "", "Ljava/nio/file/LinkOption;", "linkOptions", "", Constants.INAPP_DATA_TAG, "(Ljava/nio/file/Path;[Ljava/nio/file/LinkOption;)Ljava/lang/Object;", "Ll/bj60;", "", "c", "(Ll/bj60;)Z", "kotlin-stdlib-jdk7"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PathTreeWalkKt {
    /* JADX INFO: renamed from: c */
    public static final boolean m88329c(bj60 bj60Var) {
        for (bj60 parent = bj60Var.getParent(); parent != null; parent = parent.getParent()) {
            if (parent.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String() == null || bj60Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String() == null) {
                try {
                    if (Files.isSameFile(parent.getPath(), bj60Var.getPath())) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (Intrinsics.m88377d(parent.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String(), bj60Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static final Object m88330d(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) sj60.m186061a(), (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            attributes.getClass();
            return attributes.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }
}
