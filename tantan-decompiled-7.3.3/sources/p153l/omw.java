package p153l;

import androidx.annotation.NonNull;
import com.core.glcore.util.ArrayUtils;
import com.core.glcore.util.BodyLandData;
import com.core.glcore.util.MMCvInfoHelper;
import com.momocv.BaseParams;
import com.momocv.LiquefyInfo;
import com.momocv.SingleFaceInfo;
import com.momocv.ardetect.ArDetectInfo;
import com.momocv.beauty.BodyWarpInfo;
import com.momocv.cartoonface.CartoonfaceInfo;
import com.momocv.objectdetect.ObjectDetectInfo;
import com.momocv.stylizeface.StylizefaceInfo;
import com.momocv.videoprocessor.FaceAttribute;
import com.momocv.videoprocessor.VideoInfo;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class omw implements Cloneable {

    /* JADX INFO: renamed from: G */
    public ObjectDetectInfo f148009G;

    /* JADX INFO: renamed from: H */
    public CartoonfaceInfo f148010H;

    /* JADX INFO: renamed from: I */
    public StylizefaceInfo f148011I;

    /* JADX INFO: renamed from: J */
    public ArDetectInfo f148012J;

    /* JADX INFO: renamed from: g */
    public byte[] f148020g;

    /* JADX INFO: renamed from: h */
    private byte[] f148021h;

    /* JADX INFO: renamed from: j */
    public evf f148023j;

    /* JADX INFO: renamed from: l */
    public BodyLandData f148025l;

    /* JADX INFO: renamed from: m */
    public BodyWarpInfo f148026m;

    /* JADX INFO: renamed from: o */
    float[][] f148028o;

    /* JADX INFO: renamed from: p */
    float[][] f148029p;

    /* JADX INFO: renamed from: q */
    public float[][] f148030q;

    /* JADX INFO: renamed from: r */
    public float[][] f148031r;

    /* JADX INFO: renamed from: s */
    float[][] f148032s;

    /* JADX INFO: renamed from: t */
    float[][] f148033t;

    /* JADX INFO: renamed from: u */
    float[][] f148034u;

    /* JADX INFO: renamed from: v */
    float[][] f148035v;

    /* JADX INFO: renamed from: w */
    byte[][] f148036w;

    /* JADX INFO: renamed from: x */
    public LiquefyInfo[][] f148037x;

    /* JADX INFO: renamed from: y */
    public int f148038y;

    /* JADX INFO: renamed from: a */
    public boolean f148014a = false;

    /* JADX INFO: renamed from: b */
    public int f148015b = 0;

    /* JADX INFO: renamed from: c */
    public int f148016c = 0;

    /* JADX INFO: renamed from: d */
    public int f148017d = 0;

    /* JADX INFO: renamed from: e */
    public int f148018e = 0;

    /* JADX INFO: renamed from: f */
    public int f148019f = 0;

    /* JADX INFO: renamed from: i */
    private int f148022i = 17;

    /* JADX INFO: renamed from: n */
    private List<nuf> f148027n = new ArrayList();

    /* JADX INFO: renamed from: z */
    public boolean f148039z = true;

    /* JADX INFO: renamed from: A */
    public float f148003A = -1.0f;

    /* JADX INFO: renamed from: B */
    public boolean f148004B = false;

    /* JADX INFO: renamed from: C */
    public int f148005C = -1;

    /* JADX INFO: renamed from: D */
    public int f148006D = -1;

    /* JADX INFO: renamed from: E */
    public int f148007E = -1;

    /* JADX INFO: renamed from: F */
    public int f148008F = -1;

    /* JADX INFO: renamed from: K */
    public String f148013K = "default";

    /* JADX INFO: renamed from: k */
    public VideoInfo f148024k = new VideoInfo();

    /* JADX INFO: renamed from: A */
    public void m168284A(int i) {
        this.f148019f = i;
    }

    /* JADX INFO: renamed from: B */
    public void m168285B(BaseParams baseParams) {
        int i;
        int i2 = this.f148005C;
        if (i2 < 0 || (i = this.f148006D) < 0) {
            return;
        }
        if (baseParams.crop_rect == null) {
            baseParams.crop_rect = new int[4];
        }
        int[] iArr = baseParams.crop_rect;
        iArr[0] = i2;
        iArr[1] = i;
        iArr[2] = this.f148007E;
        iArr[3] = this.f148008F;
    }

    /* JADX INFO: renamed from: C */
    public void m168286C(int i) {
        this.f148016c = i;
    }

    /* JADX INFO: renamed from: D */
    public void m168287D(evf evfVar) {
        VideoInfo videoInfo;
        this.f148023j = evfVar;
        if (evfVar == null || (videoInfo = evfVar.f96001b) == null) {
            return;
        }
        this.f148024k = videoInfo;
        m168289a();
    }

    /* JADX INFO: renamed from: E */
    public void m168288E(int i) {
        this.f148018e = i;
    }

    /* JADX INFO: renamed from: a */
    public void m168289a() {
        m168290b(0);
    }

    /* JADX INFO: renamed from: b */
    public void m168290b(int i) {
        SingleFaceInfo[] singleFaceInfoArr;
        byte[] bArr;
        float[] fArr;
        this.f148027n.clear();
        VideoInfo videoInfo = this.f148024k;
        if (videoInfo == null || (singleFaceInfoArr = videoInfo.facesinfo_) == null) {
            return;
        }
        int length = singleFaceInfoArr.length;
        Class cls = Float.TYPE;
        this.f148028o = (float[][]) Array.newInstance((Class<?>) cls, length, 16);
        this.f148029p = (float[][]) Array.newInstance((Class<?>) cls, length, 16);
        this.f148032s = (float[][]) Array.newInstance((Class<?>) cls, length, 4);
        this.f148033t = (float[][]) Array.newInstance((Class<?>) cls, length, 4);
        this.f148034u = (float[][]) Array.newInstance((Class<?>) cls, length, 4);
        this.f148035v = (float[][]) Array.newInstance((Class<?>) cls, length, 4);
        VideoInfo videoInfo2 = this.f148024k;
        float[] fArr2 = videoInfo2.src_warp_points_;
        if (fArr2 != null && fArr2.length > 0 && (fArr = videoInfo2.dst_warp_points_) != null && fArr.length > 0) {
            float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, length, fArr2.length);
            this.f148030q = fArr3;
            VideoInfo videoInfo3 = this.f148024k;
            fArr3[0] = videoInfo3.src_warp_points_;
            float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) cls, length, videoInfo3.dst_warp_points_.length);
            this.f148031r = fArr4;
            fArr4[0] = this.f148024k.dst_warp_points_;
        }
        for (int i2 = 0; i2 < length; i2++) {
            nuf nufVar = new nuf();
            SingleFaceInfo singleFaceInfo = this.f148024k.facesinfo_[i2];
            nufVar.m164772D(singleFaceInfo);
            FaceAttribute[] faceAttributeArr = this.f148024k.faces_attributes_;
            if (faceAttributeArr != null && faceAttributeArr.length > 0) {
                nufVar.m164771C(faceAttributeArr[i2]);
            }
            this.f148027n.add(i2, nufVar);
            this.f148028o[i2] = singleFaceInfo.modelview_matrix_;
            this.f148029p[i2] = singleFaceInfo.projection_matrix_opengl_;
            this.f148032s[i2] = singleFaceInfo.face_rect_;
            this.f148033t[i2] = singleFaceInfo.orig_landmarks_96_;
            this.f148035v[i2] = singleFaceInfo.orig_face_rect_;
            singleFaceInfo.orig_landmarks_104_ = singleFaceInfo.landmarks_104_;
            if (i != 0) {
                FaceAttribute faceAttribute = this.f148024k.faces_attributes_[i2];
                float[] fArr5 = faceAttribute.warped_landmarks68_;
                if (fArr5 != null) {
                    singleFaceInfo.landmarks_68_ = fArr5;
                }
                float[] fArr6 = faceAttribute.warped_landmarks96_;
                if (fArr6 != null) {
                    singleFaceInfo.landmarks_96_ = fArr6;
                }
                float[] fArr7 = faceAttribute.warped_landmarks104_;
                if (fArr7 != null) {
                    singleFaceInfo.landmarks_104_ = fArr7;
                }
            }
            this.f148034u[i2] = singleFaceInfo.landmarks_96_;
            if (singleFaceInfo.features_quality_ == 1 && (bArr = singleFaceInfo.features_) != null && bArr.length > 0) {
                if (this.f148036w == null) {
                    this.f148036w = new byte[length][];
                }
                this.f148036w[i2] = bArr;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public omw clone() {
        SingleFaceInfo[] singleFaceInfoArr;
        omw omwVar = new omw();
        omwVar.f148014a = this.f148014a;
        omwVar.f148015b = this.f148015b;
        omwVar.f148016c = this.f148016c;
        omwVar.f148017d = this.f148017d;
        omwVar.f148018e = this.f148018e;
        omwVar.f148019f = this.f148019f;
        omwVar.f148020g = ArrayUtils.bunshin(this.f148020g);
        omwVar.f148021h = ArrayUtils.bunshin(this.f148021h);
        evf evfVar = this.f148023j;
        if (evfVar != null) {
            omwVar.f148023j = evfVar.clone();
        }
        omwVar.f148024k = MMCvInfoHelper.clone(this.f148024k);
        omwVar.f148025l = this.f148025l;
        if (this.f148026m != null) {
            BodyWarpInfo bodyWarpInfo = new BodyWarpInfo();
            omwVar.f148026m = bodyWarpInfo;
            bodyWarpInfo.dst_warp_points_ = ArrayUtils.bunshin(this.f148026m.dst_warp_points_);
            omwVar.f148026m.src_warp_points_ = ArrayUtils.bunshin(this.f148026m.src_warp_points_);
        }
        if (this.f148027n != null) {
            omwVar.f148027n = new ArrayList(this.f148027n.size());
            if (this.f148027n.size() != 0) {
                Iterator<nuf> it = this.f148027n.iterator();
                while (it.hasNext()) {
                    omwVar.f148027n.add(it.next().clone());
                }
            }
        }
        omwVar.f148028o = ArrayUtils.bunshin(this.f148028o, 16);
        omwVar.f148029p = ArrayUtils.bunshin(this.f148029p, 16);
        omwVar.f148030q = ArrayUtils.bunshin(this.f148030q);
        omwVar.f148031r = ArrayUtils.bunshin(this.f148031r);
        omwVar.f148032s = ArrayUtils.bunshin(this.f148032s, 4);
        omwVar.f148033t = ArrayUtils.bunshin(this.f148033t, 4);
        omwVar.f148034u = ArrayUtils.bunshin(this.f148034u, 4);
        omwVar.f148035v = ArrayUtils.bunshin(this.f148035v, 4);
        VideoInfo videoInfo = this.f148024k;
        if (videoInfo != null && (singleFaceInfoArr = videoInfo.facesinfo_) != null) {
            int length = singleFaceInfoArr.length;
            omwVar.f148036w = new byte[length][];
            for (int i = 0; i < length; i++) {
                omwVar.f148036w[i] = ArrayUtils.bunshin(this.f148024k.facesinfo_[i].features_);
            }
        }
        omwVar.f148039z = this.f148039z;
        omwVar.f148003A = this.f148003A;
        omwVar.f148037x = this.f148037x;
        omwVar.f148038y = this.f148038y;
        return omwVar;
    }

    /* JADX INFO: renamed from: d */
    public BodyWarpInfo m168292d() {
        return this.f148026m;
    }

    /* JADX INFO: renamed from: e */
    public int m168293e() {
        return this.f148022i;
    }

    /* JADX INFO: renamed from: f */
    public float[][] m168294f() {
        return this.f148031r;
    }

    /* JADX INFO: renamed from: j */
    public nuf m168295j(int i) {
        if (i > this.f148027n.size()) {
            i = 0;
        }
        if (this.f148027n.size() > 0) {
            return this.f148027n.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public float[][] m168296k() {
        return this.f148032s;
    }

    /* JADX INFO: renamed from: l */
    public byte[][] m168297l() {
        return this.f148036w;
    }

    /* JADX INFO: renamed from: m */
    public int m168298m() {
        return this.f148019f;
    }

    /* JADX INFO: renamed from: n */
    public int m168299n() {
        SingleFaceInfo[] singleFaceInfoArr = this.f148024k.facesinfo_;
        if (singleFaceInfoArr != null) {
            return singleFaceInfoArr.length;
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public float[][] m168300o() {
        return this.f148035v;
    }

    /* JADX INFO: renamed from: p */
    public float[][] m168301p() {
        return this.f148033t;
    }

    /* JADX INFO: renamed from: q */
    public evf m168302q() {
        return this.f148023j;
    }

    /* JADX INFO: renamed from: r */
    public float[][] m168303r() {
        return this.f148030q;
    }

    /* JADX INFO: renamed from: s */
    public VideoInfo m168304s() {
        return this.f148024k;
    }

    /* JADX INFO: renamed from: t */
    public int m168305t() {
        return this.f148018e;
    }

    /* JADX INFO: renamed from: u */
    public boolean m168306u() {
        BodyWarpInfo bodyWarpInfo = this.f148026m;
        return (bodyWarpInfo == null || bodyWarpInfo.src_warp_points_ == null || bodyWarpInfo.dst_warp_points_ == null) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public boolean m168307v() {
        return this.f148039z;
    }

    /* JADX INFO: renamed from: w */
    public void m168308w(int i) {
        this.f148015b = i;
    }

    /* JADX INFO: renamed from: x */
    public void m168309x(int i) {
        this.f148017d = i;
    }

    /* JADX INFO: renamed from: y */
    public void m168310y(byte[] bArr) {
        this.f148020g = bArr;
    }

    /* JADX INFO: renamed from: z */
    public void m168311z(boolean z) {
        this.f148014a = z;
    }
}
