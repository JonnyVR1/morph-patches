package p153l;

import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes6.dex */
public final class u8w0 {
    /* JADX INFO: renamed from: a */
    public static ParcelFileDescriptor m195070a(final InputStream inputStream) throws IOException {
        ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
        ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArrCreatePipe[0];
        final ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptorArrCreatePipe[1];
        oct0.f146733a.execute(new Runnable() { // from class: l.t8w0
            @Override // java.lang.Runnable
            public final void run() {
                InputStream inputStream2 = inputStream;
                try {
                    try {
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(parcelFileDescriptor2);
                        try {
                            IOUtils.copyStream(inputStream2, autoCloseOutputStream);
                            autoCloseOutputStream.close();
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } catch (Throwable th) {
                            try {
                                autoCloseOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        if (inputStream2 != null) {
                            try {
                                inputStream2.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                } catch (IOException unused) {
                }
            }
        });
        return parcelFileDescriptor;
    }
}
