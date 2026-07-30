package p149l;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class dkw0 implements FilenameFilter {

    /* JADX INFO: renamed from: a */
    public final Pattern f86715a;

    public dkw0(Pattern pattern) {
        pattern.getClass();
        this.f86715a = pattern;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f86715a.matcher(str).matches();
    }
}
