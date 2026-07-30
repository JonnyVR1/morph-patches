package p153l;

import android.graphics.Rect;
import com.immomo.components.interfaces.IProcessOutput;

/* JADX INFO: loaded from: classes7.dex */
public class cvf {

    /* JADX INFO: renamed from: d */
    private boolean f83998d;

    /* JADX INFO: renamed from: e */
    private final ypl.InterfaceC21657b f83999e;

    /* JADX INFO: renamed from: f */
    private boolean f84000f = true;

    /* JADX INFO: renamed from: g */
    private Rect f84001g = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: h */
    private Rect f84002h = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    private dvf f83996b = new dvf();

    /* JADX INFO: renamed from: c */
    private avf f83997c = new avf();

    /* JADX INFO: renamed from: a */
    private jtl[] f83995a = {this.f83996b, this.f83997c, new bvf()};

    public cvf(ypl.InterfaceC21657b interfaceC21657b) {
        this.f83999e = interfaceC21657b;
    }

    /* JADX INFO: renamed from: a */
    public void m112806a(IProcessOutput iProcessOutput) {
        if (iProcessOutput == null || iProcessOutput.getHeight() <= 0 || iProcessOutput.getWidth() <= 0) {
            return;
        }
        jtl[] jtlVarArr = this.f83995a;
        if (jtlVarArr != null) {
            for (jtl jtlVar : jtlVarArr) {
                if (jtlVar.mo100462a(iProcessOutput)) {
                    return;
                }
            }
        }
        if (iProcessOutput.m19367a() > 0) {
            if (this.f83999e != null) {
                iProcessOutput.m19368b(0);
            }
        } else {
            if (!this.f83998d || this.f83999e == null) {
                return;
            }
            int height = iProcessOutput.getHeight() >> 1;
            int width = iProcessOutput.getWidth() >> 1;
            int iMin = Math.min(height, width) / 4;
            Rect rect = new Rect(Math.max(height - iMin, 0), Math.max(width - iMin, 0), Math.min(height + iMin, iProcessOutput.getHeight()), Math.min(width + iMin, iProcessOutput.getWidth()));
            if (bd4.m103591a(this.f84001g, rect, 100)) {
                this.f84001g = rect;
                this.f83999e.mo139164f(iProcessOutput.getHeight(), iProcessOutput.getWidth(), rect, true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m112807b(boolean z) {
        this.f83998d = z;
        this.f84000f = true;
        this.f84001g.set(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m112808c(boolean z) {
        dvf dvfVar = this.f83996b;
        if (dvfVar != null) {
            dvfVar.m118281b(z);
        }
    }
}
