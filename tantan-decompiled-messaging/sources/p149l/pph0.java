package p149l;

import com.momo.mcamera.mask.MaskModel;

/* JADX INFO: loaded from: classes13.dex */
public class pph0 {

    /* JADX INFO: renamed from: a */
    public MaskModel f150649a;

    public pph0(MaskModel maskModel) {
        if (maskModel != null) {
            this.f150649a = maskModel;
        } else {
            this.f150649a = new MaskModel();
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m170722a() {
        return 4;
    }

    /* JADX INFO: renamed from: b */
    public MaskModel m170723b() {
        return this.f150649a;
    }

    /* JADX INFO: renamed from: c */
    public MaskModel m170724c(int i) {
        this.f150649a.setModelType(i);
        return this.f150649a;
    }

    /* JADX INFO: renamed from: d */
    public String m170725d() {
        return this.f150649a.getXengineEsPath();
    }

    /* JADX INFO: renamed from: e */
    public void m170726e(long j) {
        this.f150649a.setDuration(j);
    }

    /* JADX INFO: renamed from: f */
    public void m170727f(int i) {
        this.f150649a.setModelType(i);
    }
}
