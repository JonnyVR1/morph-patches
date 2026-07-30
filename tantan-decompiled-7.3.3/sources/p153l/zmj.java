package p153l;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class zmj implements anj.InterfaceC15750a {

    /* JADX INFO: renamed from: a */
    private final w23 f205080a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private final o01 f205081b;

    public zmj(w23 w23Var, @Nullable o01 o01Var) {
        this.f205080a = w23Var;
        this.f205081b = o01Var;
    }

    @Override // p153l.anj.InterfaceC15750a
    @NonNull
    /* JADX INFO: renamed from: a */
    public byte[] mo98989a(int i) {
        o01 o01Var = this.f205081b;
        return o01Var == null ? new byte[i] : (byte[]) o01Var.mo165411c(i, byte[].class);
    }

    @Override // p153l.anj.InterfaceC15750a
    @NonNull
    /* JADX INFO: renamed from: b */
    public Bitmap mo98990b(int i, int i2, @NonNull Bitmap.Config config) {
        return this.f205080a.mo191128e(i, i2, config);
    }

    @Override // p153l.anj.InterfaceC15750a
    @NonNull
    /* JADX INFO: renamed from: c */
    public int[] mo98991c(int i) {
        o01 o01Var = this.f205081b;
        return o01Var == null ? new int[i] : (int[]) o01Var.mo165411c(i, int[].class);
    }

    @Override // p153l.anj.InterfaceC15750a
    /* JADX INFO: renamed from: d */
    public void mo98992d(@NonNull Bitmap bitmap) {
        this.f205080a.mo191126c(bitmap);
    }

    @Override // p153l.anj.InterfaceC15750a
    /* JADX INFO: renamed from: e */
    public void mo98993e(@NonNull byte[] bArr) {
        o01 o01Var = this.f205081b;
        if (o01Var == null) {
            return;
        }
        o01Var.put(bArr);
    }

    @Override // p153l.anj.InterfaceC15750a
    /* JADX INFO: renamed from: f */
    public void mo98994f(@NonNull int[] iArr) {
        o01 o01Var = this.f205081b;
        if (o01Var == null) {
            return;
        }
        o01Var.put(iArr);
    }
}
