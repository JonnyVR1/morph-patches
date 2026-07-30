package p153l;

import com.momo.mcamera.mask.MaskModel;

/* JADX INFO: loaded from: classes13.dex */
public class wxh0 {

    /* JADX INFO: renamed from: a */
    public MaskModel f191493a;

    public wxh0(MaskModel maskModel) {
        if (maskModel != null) {
            this.f191493a = maskModel;
        } else {
            this.f191493a = new MaskModel();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m208414a() {
        return 4;
    }

    /* JADX INFO: renamed from: b */
    public MaskModel m208415b() {
        return this.f191493a;
    }

    /* JADX INFO: renamed from: c */
    public MaskModel m208416c(int i) {
        this.f191493a.setModelType(i);
        return this.f191493a;
    }

    /* JADX INFO: renamed from: d */
    public String m208417d() {
        return this.f191493a.getXengineEsPath();
    }

    /* JADX INFO: renamed from: e */
    public void m208418e(long j) {
        this.f191493a.setDuration(j);
    }

    /* JADX INFO: renamed from: f */
    public void m208419f(int i) {
        this.f191493a.setModelType(i);
    }
}
