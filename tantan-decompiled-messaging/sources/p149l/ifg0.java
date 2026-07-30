package p149l;

import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes.dex */
public final class ifg0 implements gbg0 {

    /* JADX INFO: renamed from: a */
    public final FileChannel f113015a;

    /* JADX INFO: renamed from: b */
    public final ParcelFileDescriptor f113016b;

    /* JADX INFO: renamed from: c */
    public final BufferedOutputStream f113017c;

    /* JADX INFO: renamed from: d */
    public final FileOutputStream f113018d;

    public ifg0(Context context, Uri uri, int i) throws FileNotFoundException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            throw new FileNotFoundException("result of " + uri + " is null!");
        }
        this.f113016b = parcelFileDescriptorOpenFileDescriptor;
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
        this.f113018d = fileOutputStream;
        this.f113015a = fileOutputStream.getChannel();
        this.f113017c = new BufferedOutputStream(fileOutputStream, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m135922a(long j) {
        try {
            Os.posix_fallocate(this.f113016b.getFileDescriptor(), 0L, j);
        } catch (Throwable th) {
            if (!(th instanceof ErrnoException)) {
                th.toString();
                return;
            }
            int i = th.errno;
            if (i == OsConstants.ENOSYS || i == OsConstants.ENOTSUP) {
                try {
                    Os.ftruncate(this.f113016b.getFileDescriptor(), j);
                } catch (Throwable th2) {
                    th2.toString();
                }
            }
        }
    }
}
