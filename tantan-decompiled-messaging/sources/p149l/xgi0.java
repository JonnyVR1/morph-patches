package p149l;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/xgi0;", "", "<init>", "()V", "Ljava/io/File;", "targetFile", "", "match", "", "a", "(Ljava/io/File;Ljava/lang/String;)Z", "", "targetFiles", "readOne", "", "b", "(Ljava/util/List;Z)I", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class xgi0 {
    public static final xgi0 INSTANCE = new xgi0();

    private xgi0() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m208677c(xgi0 xgi0Var, List list, boolean z, int i, Object obj) throws Exception {
        if ((i & 2) != 0) {
            z = false;
        }
        return xgi0Var.m208679b(list, z);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m208678a(@NotNull File targetFile, @NotNull String match) {
        targetFile.getClass();
        match.getClass();
        if (targetFile.exists()) {
            try {
                String strM218807j = zhi.m218807j(targetFile, null, 1, null);
                if (strM218807j != null) {
                    return C15386d.m93483J(StringsKt.m93433Z0(strM218807j).toString(), match, false, 2, null);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final int m208679b(@NotNull List<File> targetFiles, boolean readOne) throws Exception {
        targetFiles.getClass();
        int i = 0;
        int i2 = 0;
        for (File file : targetFiles) {
            if (file.exists()) {
                if (readOne) {
                    return Integer.parseInt(zhi.m218807j(file, null, 1, null)) / 1000;
                }
                String strM218807j = zhi.m218807j(file, null, 1, null);
                if (strM218807j == null) {
                    ox50.m166495a("null cannot be cast to non-null type kotlin.CharSequence");
                    return 0;
                }
                i2 += Integer.parseInt(StringsKt.m93433Z0(strM218807j).toString()) / 1000;
                i++;
            }
        }
        if (i > 0) {
            return i2 / i;
        }
        return 0;
    }
}
