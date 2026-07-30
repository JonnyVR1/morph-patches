package p149l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class jkj implements kkj.InterfaceC18040a {

    /* JADX INFO: renamed from: a */
    private final g23 f118387a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private final h01 f118388b;

    public jkj(g23 g23Var, @Nullable h01 h01Var) {
        this.f118387a = g23Var;
        this.f118388b = h01Var;
    }

    @Override // p149l.kkj.InterfaceC18040a
    @NonNull
    /* JADX INFO: renamed from: a */
    public byte[] mo141878a(int i) {
        h01 h01Var = this.f118388b;
        return h01Var == null ? new byte[i] : (byte[]) h01Var.mo128942c(i, byte[].class);
    }

    @Override // p149l.kkj.InterfaceC18040a
    @NonNull
    /* JADX INFO: renamed from: b */
    public Bitmap mo141879b(int i, int i2, @NonNull Bitmap.Config config) {
        return this.f118387a.mo124144e(i, i2, config);
    }

    @Override // p149l.kkj.InterfaceC18040a
    @NonNull
    /* JADX INFO: renamed from: c */
    public int[] mo141880c(int i) {
        h01 h01Var = this.f118388b;
        return h01Var == null ? new int[i] : (int[]) h01Var.mo128942c(i, int[].class);
    }

    @Override // p149l.kkj.InterfaceC18040a
    /* JADX INFO: renamed from: d */
    public void mo141881d(@NonNull Bitmap bitmap) {
        this.f118387a.mo124142c(bitmap);
    }

    @Override // p149l.kkj.InterfaceC18040a
    /* JADX INFO: renamed from: e */
    public void mo141882e(@NonNull byte[] bArr) {
        h01 h01Var = this.f118388b;
        if (h01Var == null) {
            return;
        }
        h01Var.put(bArr);
    }

    @Override // p149l.kkj.InterfaceC18040a
    /* JADX INFO: renamed from: f */
    public void mo141883f(@NonNull int[] iArr) {
        h01 h01Var = this.f118388b;
        if (h01Var == null) {
            return;
        }
        h01Var.put(iArr);
    }
}
