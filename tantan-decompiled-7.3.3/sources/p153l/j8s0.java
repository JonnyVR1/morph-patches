package p153l;

import android.util.Base64OutputStream;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class j8s0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public ByteArrayOutputStream f118813a = new ByteArrayOutputStream(4096);

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public Base64OutputStream f118814b = new Base64OutputStream(this.f118813a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        try {
            this.f118814b.close();
        } catch (IOException e) {
            dct0.m115296e("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.f118813a.close();
                string = this.f118813a.toString();
            } catch (IOException e2) {
                dct0.m115296e("HashManager: Unable to convert to Base64.", e2);
                string = "";
            }
            return string;
        } finally {
            this.f118813a = null;
            this.f118814b = null;
        }
    }
}
