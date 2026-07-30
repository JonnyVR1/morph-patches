package kotlin.p118io;

import com.p046p1.mobile.putong.core.data.Reason;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a+\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"Ljava/io/File;", "file", "other", "", Reason.TYPE, "b", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)Ljava/lang/String;", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class ExceptionsKt {
    /* JADX INFO: renamed from: b */
    public static final String m87406b(File file, File file2, String str) {
        StringBuilder sb = new StringBuilder(file.toString());
        if (file2 != null) {
            sb.append(" -> " + file2);
        }
        if (str != null) {
            sb.append(": ".concat(str));
        }
        return sb.toString();
    }
}
