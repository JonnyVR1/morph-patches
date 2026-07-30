package p149l;

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
public class pjw implements Cloneable {

    /* JADX INFO: renamed from: G */
    public ObjectDetectInfo f149889G;

    /* JADX INFO: renamed from: H */
    public CartoonfaceInfo f149890H;

    /* JADX INFO: renamed from: I */
    public StylizefaceInfo f149891I;

    /* JADX INFO: renamed from: J */
    public ArDetectInfo f149892J;

    /* JADX INFO: renamed from: g */
    public byte[] f149900g;

    /* JADX INFO: renamed from: h */
    private byte[] f149901h;

    /* JADX INFO: renamed from: j */
    public qtf f149903j;

    /* JADX INFO: renamed from: l */
    public BodyLandData f149905l;

    /* JADX INFO: renamed from: m */
    public BodyWarpInfo f149906m;

    /* JADX INFO: renamed from: o */
    float[][] f149908o;

    /* JADX INFO: renamed from: p */
    float[][] f149909p;

    /* JADX INFO: renamed from: q */
    public float[][] f149910q;

    /* JADX INFO: renamed from: r */
    public float[][] f149911r;

    /* JADX INFO: renamed from: s */
    float[][] f149912s;

    /* JADX INFO: renamed from: t */
    float[][] f149913t;

    /* JADX INFO: renamed from: u */
    float[][] f149914u;

    /* JADX INFO: renamed from: v */
    float[][] f149915v;

    /* JADX INFO: renamed from: w */
    byte[][] f149916w;

    /* JADX INFO: renamed from: x */
    public LiquefyInfo[][] f149917x;

    /* JADX INFO: renamed from: y */
    public int f149918y;

    /* JADX INFO: renamed from: a */
    public boolean f149894a = false;

    /* JADX INFO: renamed from: b */
    public int f149895b = 0;

    /* JADX INFO: renamed from: c */
    public int f149896c = 0;

    /* JADX INFO: renamed from: d */
    public int f149897d = 0;

    /* JADX INFO: renamed from: e */
    public int f149898e = 0;

    /* JADX INFO: renamed from: f */
    public int f149899f = 0;

    /* JADX INFO: renamed from: i */
    private int f149902i = 17;

    /* JADX INFO: renamed from: n */
    private List<zsf> f149907n = new ArrayList();

    /* JADX INFO: renamed from: z */
    public boolean f149919z = true;

    /* JADX INFO: renamed from: A */
    public float f149883A = -1.0f;

    /* JADX INFO: renamed from: B */
    public boolean f149884B = false;

    /* JADX INFO: renamed from: C */
    public int f149885C = -1;

    /* JADX INFO: renamed from: D */
    public int f149886D = -1;

    /* JADX INFO: renamed from: E */
    public int f149887E = -1;

    /* JADX INFO: renamed from: F */
    public int f149888F = -1;

    /* JADX INFO: renamed from: K */
    public String f149893K = "default";

    /* JADX INFO: renamed from: k */
    public VideoInfo f149904k = new VideoInfo();

    /* JADX INFO: renamed from: A */
    public void m169935A(int i) {
        this.f149899f = i;
    }

    /* JADX INFO: renamed from: B */
    public void m169936B(BaseParams baseParams) {
        int i;
        int i2 = this.f149885C;
        if (i2 < 0 || (i = this.f149886D) < 0) {
            return;
        }
        if (baseParams.crop_rect == null) {
            baseParams.crop_rect = new int[4];
        }
        int[] iArr = baseParams.crop_rect;
        iArr[0] = i2;
        iArr[1] = i;
        iArr[2] = this.f149887E;
        iArr[3] = this.f149888F;
    }

    /* JADX INFO: renamed from: C */
    public void m169937C(int i) {
        this.f149896c = i;
    }

    /* JADX INFO: renamed from: D */
    public void m169938D(qtf qtfVar) {
        VideoInfo videoInfo;
        this.f149903j = qtfVar;
        if (qtfVar == null || (videoInfo = qtfVar.f156324b) == null) {
            return;
        }
        this.f149904k = videoInfo;
        m169940a();
    }

    /* JADX INFO: renamed from: E */
    public void m169939E(int i) {
        this.f149898e = i;
    }

    /* JADX INFO: renamed from: a */
    public void m169940a() {
        m169941b(0);
    }

    /* JADX INFO: renamed from: b */
    public void m169941b(int i) {
        SingleFaceInfo[] singleFaceInfoArr;
        byte[] bArr;
        float[] fArr;
        this.f149907n.clear();
        VideoInfo videoInfo = this.f149904k;
        if (videoInfo == null || (singleFaceInfoArr = videoInfo.facesinfo_) == null) {
            return;
        }
        int length = singleFaceInfoArr.length;
        Class cls = Float.TYPE;
        this.f149908o = (float[][]) Array.newInstance((Class<?>) cls, length, 16);
        this.f149909p = (float[][]) Array.newInstance((Class<?>) cls, length, 16);
        this.f149912s = (float[][]) Array.newInstance((Class<?>) cls, length, 4);
        this.f149913t = (float[][]) Array.newInstance((Class<?>) cls, length, 4);
        this.f149914u = (float[][]) Array.newInstance((Class<?>) cls, length, 4);
        this.f149915v = (float[][]) Array.newInstance((Class<?>) cls, length, 4);
        VideoInfo videoInfo2 = this.f149904k;
        float[] fArr2 = videoInfo2.src_warp_points_;
        if (fArr2 != null && fArr2.length > 0 && (fArr = videoInfo2.dst_warp_points_) != null && fArr.length > 0) {
            float[][] fArr3 = (float[][]) Array.newInstance((Class<?>) cls, length, fArr2.length);
            this.f149910q = fArr3;
            VideoInfo videoInfo3 = this.f149904k;
            fArr3[0] = videoInfo3.src_warp_points_;
            float[][] fArr4 = (float[][]) Array.newInstance((Class<?>) cls, length, videoInfo3.dst_warp_points_.length);
            this.f149911r = fArr4;
            fArr4[0] = this.f149904k.dst_warp_points_;
        }
        for (int i2 = 0; i2 < length; i2++) {
            zsf zsfVar = new zsf();
            SingleFaceInfo singleFaceInfo = this.f149904k.facesinfo_[i2];
            zsfVar.m220009D(singleFaceInfo);
            FaceAttribute[] faceAttributeArr = this.f149904k.faces_attributes_;
            if (faceAttributeArr != null && faceAttributeArr.length > 0) {
                zsfVar.m220008C(faceAttributeArr[i2]);
            }
            this.f149907n.add(i2, zsfVar);
            this.f149908o[i2] = singleFaceInfo.modelview_matrix_;
            this.f149909p[i2] = singleFaceInfo.projection_matrix_opengl_;
            this.f149912s[i2] = singleFaceInfo.face_rect_;
            this.f149913t[i2] = singleFaceInfo.orig_landmarks_96_;
            this.f149915v[i2] = singleFaceInfo.orig_face_rect_;
            singleFaceInfo.orig_landmarks_104_ = singleFaceInfo.landmarks_104_;
            if (i != 0) {
                FaceAttribute faceAttribute = this.f149904k.faces_attributes_[i2];
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
            this.f149914u[i2] = singleFaceInfo.landmarks_96_;
            if (singleFaceInfo.features_quality_ == 1 && (bArr = singleFaceInfo.features_) != null && bArr.length > 0) {
                if (this.f149916w == null) {
                    this.f149916w = new byte[length][];
                }
                this.f149916w[i2] = bArr;
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public pjw clone() {
        SingleFaceInfo[] singleFaceInfoArr;
        pjw pjwVar = new pjw();
        pjwVar.f149894a = this.f149894a;
        pjwVar.f149895b = this.f149895b;
        pjwVar.f149896c = this.f149896c;
        pjwVar.f149897d = this.f149897d;
        pjwVar.f149898e = this.f149898e;
        pjwVar.f149899f = this.f149899f;
        pjwVar.f149900g = ArrayUtils.bunshin(this.f149900g);
        pjwVar.f149901h = ArrayUtils.bunshin(this.f149901h);
        qtf qtfVar = this.f149903j;
        if (qtfVar != null) {
            pjwVar.f149903j = qtfVar.clone();
        }
        pjwVar.f149904k = MMCvInfoHelper.clone(this.f149904k);
        pjwVar.f149905l = this.f149905l;
        if (this.f149906m != null) {
            BodyWarpInfo bodyWarpInfo = new BodyWarpInfo();
            pjwVar.f149906m = bodyWarpInfo;
            bodyWarpInfo.dst_warp_points_ = ArrayUtils.bunshin(this.f149906m.dst_warp_points_);
            pjwVar.f149906m.src_warp_points_ = ArrayUtils.bunshin(this.f149906m.src_warp_points_);
        }
        if (this.f149907n != null) {
            pjwVar.f149907n = new ArrayList(this.f149907n.size());
            if (this.f149907n.size() != 0) {
                Iterator<zsf> it = this.f149907n.iterator();
                while (it.hasNext()) {
                    pjwVar.f149907n.add(it.next().clone());
                }
            }
        }
        pjwVar.f149908o = ArrayUtils.bunshin(this.f149908o, 16);
        pjwVar.f149909p = ArrayUtils.bunshin(this.f149909p, 16);
        pjwVar.f149910q = ArrayUtils.bunshin(this.f149910q);
        pjwVar.f149911r = ArrayUtils.bunshin(this.f149911r);
        pjwVar.f149912s = ArrayUtils.bunshin(this.f149912s, 4);
        pjwVar.f149913t = ArrayUtils.bunshin(this.f149913t, 4);
        pjwVar.f149914u = ArrayUtils.bunshin(this.f149914u, 4);
        pjwVar.f149915v = ArrayUtils.bunshin(this.f149915v, 4);
        VideoInfo videoInfo = this.f149904k;
        if (videoInfo != null && (singleFaceInfoArr = videoInfo.facesinfo_) != null) {
            int length = singleFaceInfoArr.length;
            pjwVar.f149916w = new byte[length][];
            for (int i = 0; i < length; i++) {
                pjwVar.f149916w[i] = ArrayUtils.bunshin(this.f149904k.facesinfo_[i].features_);
            }
        }
        pjwVar.f149919z = this.f149919z;
        pjwVar.f149883A = this.f149883A;
        pjwVar.f149917x = this.f149917x;
        pjwVar.f149918y = this.f149918y;
        return pjwVar;
    }

    /* JADX INFO: renamed from: d */
    public BodyWarpInfo m169943d() {
        return this.f149906m;
    }

    /* JADX INFO: renamed from: e */
    public int m169944e() {
        return this.f149902i;
    }

    /* JADX INFO: renamed from: f */
    public float[][] m169945f() {
        return this.f149911r;
    }

    /* JADX INFO: renamed from: j */
    public zsf m169946j(int i) {
        if (i > this.f149907n.size()) {
            i = 0;
        }
        if (this.f149907n.size() > 0) {
            return this.f149907n.get(i);
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public float[][] m169947k() {
        return this.f149912s;
    }

    /* JADX INFO: renamed from: l */
    public byte[][] m169948l() {
        return this.f149916w;
    }

    /* JADX INFO: renamed from: m */
    public int m169949m() {
        return this.f149899f;
    }

    /* JADX INFO: renamed from: n */
    public int m169950n() {
        SingleFaceInfo[] singleFaceInfoArr = this.f149904k.facesinfo_;
        if (singleFaceInfoArr != null) {
            return singleFaceInfoArr.length;
        }
        return 0;
    }

    /* JADX INFO: renamed from: o */
    public float[][] m169951o() {
        return this.f149915v;
    }

    /* JADX INFO: renamed from: p */
    public float[][] m169952p() {
        return this.f149913t;
    }

    /* JADX INFO: renamed from: q */
    public qtf m169953q() {
        return this.f149903j;
    }

    /* JADX INFO: renamed from: r */
    public float[][] m169954r() {
        return this.f149910q;
    }

    /* JADX INFO: renamed from: s */
    public VideoInfo m169955s() {
        return this.f149904k;
    }

    /* JADX INFO: renamed from: t */
    public int m169956t() {
        return this.f149898e;
    }

    /* JADX INFO: renamed from: u */
    public boolean m169957u() {
        BodyWarpInfo bodyWarpInfo = this.f149906m;
        return (bodyWarpInfo == null || bodyWarpInfo.src_warp_points_ == null || bodyWarpInfo.dst_warp_points_ == null) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public boolean m169958v() {
        return this.f149919z;
    }

    /* JADX INFO: renamed from: w */
    public void m169959w(int i) {
        this.f149895b = i;
    }

    /* JADX INFO: renamed from: x */
    public void m169960x(int i) {
        this.f149897d = i;
    }

    /* JADX INFO: renamed from: y */
    public void m169961y(byte[] bArr) {
        this.f149900g = bArr;
    }

    /* JADX INFO: renamed from: z */
    public void m169962z(boolean z) {
        this.f149894a = z;
    }
}
