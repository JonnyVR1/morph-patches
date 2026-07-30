package p153l;

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
public final class qng0 implements ojg0 {

    /* JADX INFO: renamed from: a */
    public final FileChannel f158483a;

    /* JADX INFO: renamed from: b */
    public final ParcelFileDescriptor f158484b;

    /* JADX INFO: renamed from: c */
    public final BufferedOutputStream f158485c;

    /* JADX INFO: renamed from: d */
    public final FileOutputStream f158486d;

    public qng0(Context context, Uri uri, int i) throws FileNotFoundException {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "rw");
        if (parcelFileDescriptorOpenFileDescriptor == null) {
            throw new FileNotFoundException("result of " + uri + " is null!");
        }
        this.f158484b = parcelFileDescriptorOpenFileDescriptor;
        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
        this.f158486d = fileOutputStream;
        this.f158483a = fileOutputStream.getChannel();
        this.f158485c = new BufferedOutputStream(fileOutputStream, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m177214a(long j) {
        try {
            Os.posix_fallocate(this.f158484b.getFileDescriptor(), 0L, j);
        } catch (Throwable th) {
            if (!(th instanceof ErrnoException)) {
                th.toString();
                return;
            }
            int i = th.errno;
            if (i == OsConstants.ENOSYS || i == OsConstants.ENOTSUP) {
                try {
                    Os.ftruncate(this.f158484b.getFileDescriptor(), j);
                } catch (Throwable th2) {
                    th2.toString();
                }
            }
        }
    }
}
