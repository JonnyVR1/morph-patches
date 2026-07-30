package p153l;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class jtw0 implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final Pattern f122630a;

    public jtw0(Pattern pattern) {
        pattern.getClass();
        this.f122630a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f122630a.matcher(str).matches();
    }
}
