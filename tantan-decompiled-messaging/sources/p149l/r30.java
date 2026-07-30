package p149l;

import android.text.TextUtils;
import com.core.glcore.p023cv.MMCVBoxes;
import com.momo.mcamera.mask.ActionInfo;
import com.momo.mcamera.mask.detect.IPatternDetect;
import com.momo.mcamera.mask.express.ExpressDetector;
import com.momo.mcamera.mask.gesture.CVDetector;
import com.momo.mcamera.mask.gesture.GestureDetector;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import com.momocv.express.ExpressInfo;

/* JADX INFO: loaded from: classes7.dex */
public class r30 implements CVDetector.GestureDetectorListener, IPatternDetect.ExpressDetectListener, enl, etf, krl {

    /* JADX INFO: renamed from: a */
    private GestureDetector f157467a;

    /* JADX INFO: renamed from: b */
    private ExpressDetector f157468b;

    /* JADX INFO: renamed from: c */
    private k43 f157469c;

    /* JADX INFO: renamed from: d */
    private cml f157470d;

    /* JADX INFO: renamed from: e */
    private boolean f157471e = false;

    /* JADX INFO: renamed from: f */
    private boolean f157472f = false;

    /* JADX INFO: renamed from: g */
    private boolean f157473g = false;

    /* JADX INFO: renamed from: h */
    private krl f157474h;

    public r30() {
        GestureDetector gestureDetector = new GestureDetector(null);
        this.f157467a = gestureDetector;
        gestureDetector.setGestureDetectorListener(this);
        this.f157467a.startDetect();
        ExpressDetector expressDetector = new ExpressDetector();
        this.f157468b = expressDetector;
        expressDetector.setExpressDetectListener(this);
        this.f157468b.startDetect();
        k43 k43Var = new k43();
        this.f157469c = k43Var;
        k43Var.m144472i(this);
        this.f157469c.m144475l();
        h40 h40Var = new h40();
        this.f157470d = h40Var;
        h40Var.mo107669d(this);
    }

    @Override // p149l.krl
    /* JADX INFO: renamed from: a */
    public void mo147003a() {
        this.f157473g = false;
        this.f157471e = false;
        this.f157472f = false;
        krl krlVar = this.f157474h;
        if (krlVar != null) {
            krlVar.mo147003a();
        }
    }

    @Override // p149l.enl
    /* JADX INFO: renamed from: b */
    public void mo117284b(BodyLandmarkPostInfo bodyLandmarkPostInfo) {
        cml cmlVar = this.f157470d;
        if (cmlVar != null) {
            cmlVar.mo107666a(bodyLandmarkPostInfo);
            this.f157470d.mo107670e();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m177630c(String str) {
        k43 k43Var = this.f157469c;
        if (k43Var != null) {
            k43Var.m144474k(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m177631d(String str) {
        ExpressDetector expressDetector = this.f157468b;
        if (expressDetector != null) {
            expressDetector.setModelPath(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m177632e(String str) {
        n050.m157240b().m157243d(str);
    }

    /* JADX INFO: renamed from: f */
    public void m177633f(ActionInfo actionInfo, boolean z) {
        if (actionInfo == null) {
            return;
        }
        cml cmlVar = this.f157470d;
        if (cmlVar != null) {
            cmlVar.mo107668c(actionInfo);
        }
        this.f157471e = !TextUtils.isEmpty(actionInfo.getHand());
        this.f157472f = (TextUtils.isEmpty(actionInfo.getMouth()) && TextUtils.isEmpty(actionInfo.getHead()) && (actionInfo.getEye() == null || actionInfo.getEye().isEmpty())) ? false : true;
        this.f157473g = (actionInfo.getBody() == null || actionInfo.getBody().isEmpty()) ? false : true;
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector.GestureDetectorListener
    public void gestureDetect(MMCVBoxes mMCVBoxes) {
        cml cmlVar = this.f157470d;
        if (cmlVar != null) {
            cmlVar.mo107671f(mMCVBoxes);
            this.f157470d.mo107670e();
        }
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect.ExpressDetectListener
    public void onExpressDetect(ExpressInfo expressInfo) {
        cml cmlVar = this.f157470d;
        if (cmlVar != null) {
            cmlVar.mo107667b(expressInfo);
            this.f157470d.mo107670e();
        }
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        GestureDetector gestureDetector = this.f157467a;
        if (gestureDetector != null && this.f157471e) {
            gestureDetector.setMMCVInfo(pjwVar);
        }
        ExpressDetector expressDetector = this.f157468b;
        if (expressDetector != null && this.f157472f) {
            expressDetector.setMMCVInfo(pjwVar);
        }
        k43 k43Var = this.f157469c;
        if (k43Var != null && this.f157473g) {
            k43Var.m144473j(pjwVar);
        }
        cml cmlVar = this.f157470d;
        if (cmlVar != null) {
            cmlVar.setMMCVInfo(pjwVar);
        }
    }
}
