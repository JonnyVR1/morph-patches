package p153l;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class bhw extends wgw<kzq, u3d0<?>> implements lpy {

    /* JADX INFO: renamed from: e */
    private lpy.InterfaceC18440a f76823e;

    public bhw(long j) {
        super(j);
    }

    @Override // p153l.lpy
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public void mo104370a(int i) {
        if (i >= 40) {
            m206266b();
        } else if (i >= 20 || i == 15) {
            m206271m(m206268h() / 2);
        }
    }

    @Override // p153l.lpy
    /* JADX INFO: renamed from: c */
    public void mo104371c(@NonNull lpy.InterfaceC18440a interfaceC18440a) {
        this.f76823e = interfaceC18440a;
    }

    @Override // p153l.lpy
    @Nullable
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ u3d0 mo104372d(@NonNull kzq kzqVar, @Nullable u3d0 u3d0Var) {
        return (u3d0) super.m206269k(kzqVar, u3d0Var);
    }

    @Override // p153l.lpy
    @Nullable
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ u3d0 mo104373e(@NonNull kzq kzqVar) {
        return (u3d0) super.m206270l(kzqVar);
    }

    @Override // p153l.wgw
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo104374i(@Nullable u3d0<?> u3d0Var) {
        return u3d0Var == null ? super.mo104374i(null) : u3d0Var.getSize();
    }

    @Override // p153l.wgw
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo104375j(@NonNull kzq kzqVar, @Nullable u3d0<?> u3d0Var) {
        lpy.InterfaceC18440a interfaceC18440a = this.f76823e;
        if (interfaceC18440a == null || u3d0Var == null) {
            return;
        }
        interfaceC18440a.mo5471c(u3d0Var);
    }
}
