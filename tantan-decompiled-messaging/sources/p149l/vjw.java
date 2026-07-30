package p149l;

import com.core.glcore.util.ImageFrame;
import com.momocv.MMFrame;

/* JADX INFO: loaded from: classes.dex */
public class vjw {

    /* JADX INFO: renamed from: b */
    ImageFrame f181755b = null;

    /* JADX INFO: renamed from: a */
    MMFrame f181754a = new MMFrame();

    /* JADX INFO: renamed from: a */
    public byte[] m198688a() {
        ImageFrame imageFrame = this.f181755b;
        return imageFrame != null ? imageFrame.getImageByteData() : this.f181754a.data_ptr_;
    }

    /* JADX INFO: renamed from: b */
    public MMFrame m198689b() {
        return this.f181754a;
    }

    /* JADX INFO: renamed from: c */
    public int m198690c() {
        return this.f181754a.height_;
    }

    /* JADX INFO: renamed from: d */
    public ImageFrame m198691d() {
        return this.f181755b;
    }

    /* JADX INFO: renamed from: e */
    public int m198692e() {
        return this.f181754a.width_;
    }

    /* JADX INFO: renamed from: f */
    public void m198693f(int i) {
        this.f181754a.data_len_ = i;
    }

    /* JADX INFO: renamed from: g */
    public void m198694g(byte[] bArr) {
        this.f181754a.data_ptr_ = bArr;
    }

    /* JADX INFO: renamed from: h */
    public void m198695h(int i) {
        this.f181754a.format_ = i;
    }

    /* JADX INFO: renamed from: i */
    public void m198696i(MMFrame mMFrame) {
        this.f181754a = mMFrame;
    }

    /* JADX INFO: renamed from: j */
    public void m198697j(int i) {
        this.f181754a.height_ = i;
    }

    /* JADX INFO: renamed from: k */
    public void m198698k(ImageFrame imageFrame) {
        this.f181755b = imageFrame;
    }

    /* JADX INFO: renamed from: l */
    public void m198699l(int i) {
        this.f181754a.step_ = i;
    }

    /* JADX INFO: renamed from: m */
    public void m198700m(int i) {
        this.f181754a.width_ = i;
    }
}
