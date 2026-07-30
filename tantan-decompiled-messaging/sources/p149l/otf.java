package p149l;

import android.graphics.Rect;
import com.immomo.components.interfaces.IProcessOutput;

/* JADX INFO: loaded from: classes7.dex */
public class otf {

    /* JADX INFO: renamed from: d */
    private boolean f145583d;

    /* JADX INFO: renamed from: e */
    private final nnl.InterfaceC18737b f145584e;

    /* JADX INFO: renamed from: f */
    private boolean f145585f = true;

    /* JADX INFO: renamed from: g */
    private Rect f145586g = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: h */
    private Rect f145587h = new Rect(0, 0, 0, 0);

    /* JADX INFO: renamed from: b */
    private ptf f145581b = new ptf();

    /* JADX INFO: renamed from: c */
    private mtf f145582c = new mtf();

    /* JADX INFO: renamed from: a */
    private wql[] f145580a = {this.f145581b, this.f145582c, new ntf()};

    public otf(nnl.InterfaceC18737b interfaceC18737b) {
        this.f145584e = interfaceC18737b;
    }

    /* JADX INFO: renamed from: a */
    public void m165942a(IProcessOutput iProcessOutput) {
        if (iProcessOutput == null || iProcessOutput.getHeight() <= 0 || iProcessOutput.getWidth() <= 0) {
            return;
        }
        wql[] wqlVarArr = this.f145580a;
        if (wqlVarArr != null) {
            for (wql wqlVar : wqlVarArr) {
                if (wqlVar.mo156218a(iProcessOutput)) {
                    return;
                }
            }
        }
        if (iProcessOutput.m18290a() > 0) {
            if (this.f145584e != null) {
                iProcessOutput.m18291b(0);
            }
        } else {
            if (!this.f145583d || this.f145584e == null) {
                return;
            }
            int height = iProcessOutput.getHeight() >> 1;
            int width = iProcessOutput.getWidth() >> 1;
            int iMin = Math.min(height, width) / 4;
            Rect rect = new Rect(Math.max(height - iMin, 0), Math.max(width - iMin, 0), Math.min(height + iMin, iProcessOutput.getHeight()), Math.min(width + iMin, iProcessOutput.getWidth()));
            if (cc4.m106036a(this.f145586g, rect, 100)) {
                this.f145586g = rect;
                this.f145584e.mo140505f(iProcessOutput.getHeight(), iProcessOutput.getWidth(), rect, true);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m165943b(boolean z) {
        this.f145583d = z;
        this.f145585f = true;
        this.f145586g.set(0, 0, 0, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m165944c(boolean z) {
        ptf ptfVar = this.f145581b;
        if (ptfVar != null) {
            ptfVar.m171310b(z);
        }
    }
}
