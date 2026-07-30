package p149l;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"Ll/prb;", "Ljava/io/FilenameFilter;", "", "matchStr", "<init>", "(Ljava/lang/String;)V", "Ljava/io/File;", "file", "str", "", "accept", "(Ljava/io/File;Ljava/lang/String;)Z", "a", "Ljava/lang/String;", "apm-tracer_release"}, m87233k = 1, m87234mv = {1, 4, 0})
public final class prb implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String matchStr;

    public prb(@NotNull String str) {
        str.getClass();
        this.matchStr = str;
    }

    @Override // java.io.FilenameFilter
    public boolean accept(@NotNull File file, @NotNull String str) {
        file.getClass();
        str.getClass();
        return Pattern.matches(this.matchStr, str);
    }
}
