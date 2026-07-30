package p153l;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000e2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b2\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m88121d2 = {"Ll/xpi0;", "", "<init>", "()V", "Ljava/io/File;", "targetFile", "", "match", "", "a", "(Ljava/io/File;Ljava/lang/String;)Z", "", "targetFiles", "readOne", "", "b", "(Ljava/util/List;Z)I", "apm-tracer_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class xpi0 {
    public static final xpi0 INSTANCE = new xpi0();

    private xpi0() {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m212650c(xpi0 xpi0Var, List list, boolean z, int i, Object obj) throws Exception {
        if ((i & 2) != 0) {
            z = false;
        }
        return xpi0Var.m212652b(list, z);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m212651a(@NotNull File targetFile, @NotNull String match) {
        targetFile.getClass();
        match.getClass();
        if (targetFile.exists()) {
            try {
                String strM206830j = wki.m206830j(targetFile, null, 1, null);
                if (strM206830j != null) {
                    return C15493d.m94374J(StringsKt.m94324Z0(strM206830j).toString(), match, false, 2, null);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final int m212652b(@NotNull List<File> targetFiles, boolean readOne) throws Exception {
        targetFiles.getClass();
        int i = 0;
        int i2 = 0;
        for (File file : targetFiles) {
            if (file.exists()) {
                if (readOne) {
                    return Integer.parseInt(wki.m206830j(file, null, 1, null)) / 1000;
                }
                String strM206830j = wki.m206830j(file, null, 1, null);
                if (strM206830j == null) {
                    C0799b.m4641a("null cannot be cast to non-null type kotlin.CharSequence");
                    return 0;
                }
                i2 += Integer.parseInt(StringsKt.m94324Z0(strM206830j).toString()) / 1000;
                i++;
            }
        }
        if (i > 0) {
            return i2 / i;
        }
        return 0;
    }
}
