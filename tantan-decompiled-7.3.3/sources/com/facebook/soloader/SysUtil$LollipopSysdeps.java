package com.facebook.soloader;

import android.annotation.TargetApi;
import android.os.Build;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.FileDescriptor;
import java.io.IOException;
import p153l.v6e;

/* JADX INFO: loaded from: classes6.dex */
@v6e
@TargetApi(21)
final class SysUtil$LollipopSysdeps {
    private SysUtil$LollipopSysdeps() {
    }

    @v6e
    public static void fallocateIfSupported(FileDescriptor fileDescriptor, long j) throws IOException {
        int i;
        try {
            Os.posix_fallocate(fileDescriptor, 0L, j);
        } catch (ErrnoException e) {
            if (e.errno != OsConstants.EOPNOTSUPP && (i = e.errno) != OsConstants.ENOSYS && i != OsConstants.EINVAL) {
                throw new IOException(e.toString(), e);
            }
        }
    }

    @v6e
    public static String[] getSupportedAbis() {
        return Build.SUPPORTED_ABIS;
    }
}
