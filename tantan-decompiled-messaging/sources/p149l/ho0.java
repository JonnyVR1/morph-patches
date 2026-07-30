package p149l;

import android.content.Context;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class ho0 implements kxq {

    /* JADX INFO: renamed from: b */
    private final int f108736b;

    /* JADX INFO: renamed from: c */
    private final kxq f108737c;

    private ho0(int i, kxq kxqVar) {
        this.f108736b = i;
        this.f108737c = kxqVar;
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static kxq m132034c(@NonNull Context context) {
        return new ho0(context.getResources().getConfiguration().uiMode & 48, ty0.m190992c(context));
    }

    @Override // p149l.kxq
    /* JADX INFO: renamed from: a */
    public void mo5409a(@NonNull MessageDigest messageDigest) {
        this.f108737c.mo5409a(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f108736b).array());
    }

    @Override // p149l.kxq
    public boolean equals(Object obj) {
        if (obj instanceof ho0) {
            ho0 ho0Var = (ho0) obj;
            if (this.f108736b == ho0Var.f108736b && this.f108737c.equals(ho0Var.f108737c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p149l.kxq
    public int hashCode() {
        return sck0.m183414n(this.f108737c, this.f108736b);
    }
}
