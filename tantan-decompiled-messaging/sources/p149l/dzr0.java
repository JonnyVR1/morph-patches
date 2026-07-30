package p149l;

import android.util.Base64OutputStream;
import androidx.annotation.VisibleForTesting;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@VisibleForTesting
public final class dzr0 {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public ByteArrayOutputStream f88504a = new ByteArrayOutputStream(4096);

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public Base64OutputStream f88505b = new Base64OutputStream(this.f88504a, 10);

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        try {
            this.f88505b.close();
        } catch (IOException e) {
            x2t0.m206867e("HashManager: Unable to convert to Base64.", e);
        }
        try {
            try {
                this.f88504a.close();
                string = this.f88504a.toString();
            } catch (IOException e2) {
                x2t0.m206867e("HashManager: Unable to convert to Base64.", e2);
                string = "";
            }
            return string;
        } finally {
            this.f88504a = null;
            this.f88505b = null;
        }
    }
}
