package tech.sud.logger;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class Sudtry implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        int i = LogUtils.f208454V;
        return str.matches("^" + LogUtils.Sudfor.Sudfor + "_[0-9]{4}_[0-9]{2}_[0-9]{2}_.*$");
    }
}
