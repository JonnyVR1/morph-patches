package p153l;

import com.core.glcore.util.ImageFrame;
import com.momocv.MMFrame;

/* JADX INFO: loaded from: classes.dex */
public class umw {

    /* JADX INFO: renamed from: b */
    ImageFrame f179681b = null;

    /* JADX INFO: renamed from: a */
    MMFrame f179680a = new MMFrame();

    /* JADX INFO: renamed from: a */
    public byte[] m196795a() {
        ImageFrame imageFrame = this.f179681b;
        return imageFrame != null ? imageFrame.getImageByteData() : this.f179680a.data_ptr_;
    }

    /* JADX INFO: renamed from: b */
    public MMFrame m196796b() {
        return this.f179680a;
    }

    /* JADX INFO: renamed from: c */
    public int m196797c() {
        return this.f179680a.height_;
    }

    /* JADX INFO: renamed from: d */
    public ImageFrame m196798d() {
        return this.f179681b;
    }

    /* JADX INFO: renamed from: e */
    public int m196799e() {
        return this.f179680a.width_;
    }

    /* JADX INFO: renamed from: f */
    public void m196800f(int i) {
        this.f179680a.data_len_ = i;
    }

    /* JADX INFO: renamed from: g */
    public void m196801g(byte[] bArr) {
        this.f179680a.data_ptr_ = bArr;
    }

    /* JADX INFO: renamed from: h */
    public void m196802h(int i) {
        this.f179680a.format_ = i;
    }

    /* JADX INFO: renamed from: i */
    public void m196803i(MMFrame mMFrame) {
        this.f179680a = mMFrame;
    }

    /* JADX INFO: renamed from: j */
    public void m196804j(int i) {
        this.f179680a.height_ = i;
    }

    /* JADX INFO: renamed from: k */
    public void m196805k(ImageFrame imageFrame) {
        this.f179681b = imageFrame;
    }

    /* JADX INFO: renamed from: l */
    public void m196806l(int i) {
        this.f179680a.step_ = i;
    }

    /* JADX INFO: renamed from: m */
    public void m196807m(int i) {
        this.f179680a.width_ = i;
    }
}
