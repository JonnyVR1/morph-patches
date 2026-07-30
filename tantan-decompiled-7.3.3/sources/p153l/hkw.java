package p153l;

import android.widget.ImageView;

/* JADX INFO: loaded from: classes7.dex */
public class hkw {

    /* JADX INFO: renamed from: b */
    private static hkw f110458b;

    /* JADX INFO: renamed from: a */
    private nvl f110459a;

    private hkw() {
    }

    /* JADX INFO: renamed from: a */
    public static hkw m135646a() {
        if (f110458b == null) {
            f110458b = new hkw();
        }
        return f110458b;
    }

    /* JADX INFO: renamed from: b */
    public void m135647b(nvl nvlVar) {
        this.f110459a = nvlVar;
    }

    /* JADX INFO: renamed from: c */
    public void m135648c(String str, ImageView imageView, int i) {
        nvl nvlVar = this.f110459a;
        if (nvlVar == null) {
            return;
        }
        nvlVar.mo134606a(str, imageView, i);
    }

    /* JADX INFO: renamed from: d */
    public void m135649d(String str, vim vimVar) {
        nvl nvlVar = this.f110459a;
        if (nvlVar == null) {
            return;
        }
        nvlVar.mo134607b(str, vimVar);
    }
}
