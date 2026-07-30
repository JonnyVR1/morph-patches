package p149l;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class dfw extends yew<kxq, rvc0<?>> implements ogy {

    /* JADX INFO: renamed from: e */
    private ogy.InterfaceC18933a f85982e;

    public dfw(long j) {
        super(j);
    }

    @Override // p149l.ogy
    @SuppressLint({"InlinedApi"})
    /* JADX INFO: renamed from: a */
    public void mo111502a(int i) {
        if (i >= 40) {
            m214440b();
        } else if (i >= 20 || i == 15) {
            m214445m(m214442h() / 2);
        }
    }

    @Override // p149l.ogy
    /* JADX INFO: renamed from: c */
    public void mo111503c(@NonNull ogy.InterfaceC18933a interfaceC18933a) {
        this.f85982e = interfaceC18933a;
    }

    @Override // p149l.ogy
    @Nullable
    /* JADX INFO: renamed from: d */
    public /* bridge */ /* synthetic */ rvc0 mo111504d(@NonNull kxq kxqVar, @Nullable rvc0 rvc0Var) {
        return (rvc0) super.m214443k(kxqVar, rvc0Var);
    }

    @Override // p149l.ogy
    @Nullable
    /* JADX INFO: renamed from: e */
    public /* bridge */ /* synthetic */ rvc0 mo111505e(@NonNull kxq kxqVar) {
        return (rvc0) super.m214444l(kxqVar);
    }

    @Override // p149l.yew
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public int mo111506i(@Nullable rvc0<?> rvc0Var) {
        return rvc0Var == null ? super.mo111506i(null) : rvc0Var.getSize();
    }

    @Override // p149l.yew
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo110110j(@NonNull kxq kxqVar, @Nullable rvc0<?> rvc0Var) {
        ogy.InterfaceC18933a interfaceC18933a = this.f85982e;
        if (interfaceC18933a == null || rvc0Var == null) {
            return;
        }
        interfaceC18933a.mo5445c(rvc0Var);
    }
}
