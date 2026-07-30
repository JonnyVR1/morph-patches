package p153l;

import android.text.TextUtils;
import com.core.glcore.p024cv.MMCVBoxes;
import com.momo.mcamera.mask.ActionInfo;
import com.momo.mcamera.mask.detect.IPatternDetect;
import com.momo.mcamera.mask.express.ExpressDetector;
import com.momo.mcamera.mask.gesture.CVDetector;
import com.momo.mcamera.mask.gesture.GestureDetector;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import com.momocv.express.ExpressInfo;

/* JADX INFO: loaded from: classes7.dex */
public class l30 implements CVDetector.GestureDetectorListener, IPatternDetect.ExpressDetectListener, ppl, suf, xtl {

    /* JADX INFO: renamed from: a */
    private GestureDetector f129827a;

    /* JADX INFO: renamed from: b */
    private ExpressDetector f129828b;

    /* JADX INFO: renamed from: c */
    private a53 f129829c;

    /* JADX INFO: renamed from: d */
    private ool f129830d;

    /* JADX INFO: renamed from: e */
    private boolean f129831e = false;

    /* JADX INFO: renamed from: f */
    private boolean f129832f = false;

    /* JADX INFO: renamed from: g */
    private boolean f129833g = false;

    /* JADX INFO: renamed from: h */
    private xtl f129834h;

    public l30() {
        GestureDetector gestureDetector = new GestureDetector(null);
        this.f129827a = gestureDetector;
        gestureDetector.setGestureDetectorListener(this);
        this.f129827a.startDetect();
        ExpressDetector expressDetector = new ExpressDetector();
        this.f129828b = expressDetector;
        expressDetector.setExpressDetectListener(this);
        this.f129828b.startDetect();
        a53 a53Var = new a53();
        this.f129829c = a53Var;
        a53Var.m96021i(this);
        this.f129829c.m96024l();
        b40 b40Var = new b40();
        this.f129830d = b40Var;
        b40Var.mo102394d(this);
    }

    @Override // p153l.xtl
    /* JADX INFO: renamed from: a */
    public void mo152657a() {
        this.f129833g = false;
        this.f129831e = false;
        this.f129832f = false;
        xtl xtlVar = this.f129834h;
        if (xtlVar != null) {
            xtlVar.mo152657a();
        }
    }

    @Override // p153l.ppl
    /* JADX INFO: renamed from: b */
    public void mo152658b(BodyLandmarkPostInfo bodyLandmarkPostInfo) {
        ool oolVar = this.f129830d;
        if (oolVar != null) {
            oolVar.mo102391a(bodyLandmarkPostInfo);
            this.f129830d.mo102395e();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m152659c(String str) {
        a53 a53Var = this.f129829c;
        if (a53Var != null) {
            a53Var.m96023k(str);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m152660d(String str) {
        ExpressDetector expressDetector = this.f129828b;
        if (expressDetector != null) {
            expressDetector.setModelPath(str);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m152661e(String str) {
        c950.m108407b().m108410d(str);
    }

    /* JADX INFO: renamed from: f */
    public void m152662f(ActionInfo actionInfo, boolean z) {
        if (actionInfo == null) {
            return;
        }
        ool oolVar = this.f129830d;
        if (oolVar != null) {
            oolVar.mo102393c(actionInfo);
        }
        this.f129831e = !TextUtils.isEmpty(actionInfo.getHand());
        this.f129832f = (TextUtils.isEmpty(actionInfo.getMouth()) && TextUtils.isEmpty(actionInfo.getHead()) && (actionInfo.getEye() == null || actionInfo.getEye().isEmpty())) ? false : true;
        this.f129833g = (actionInfo.getBody() == null || actionInfo.getBody().isEmpty()) ? false : true;
    }

    @Override // com.momo.mcamera.mask.gesture.CVDetector.GestureDetectorListener
    public void gestureDetect(MMCVBoxes mMCVBoxes) {
        ool oolVar = this.f129830d;
        if (oolVar != null) {
            oolVar.mo102396f(mMCVBoxes);
            this.f129830d.mo102395e();
        }
    }

    @Override // com.momo.mcamera.mask.detect.IPatternDetect.ExpressDetectListener
    public void onExpressDetect(ExpressInfo expressInfo) {
        ool oolVar = this.f129830d;
        if (oolVar != null) {
            oolVar.mo102392b(expressInfo);
            this.f129830d.mo102395e();
        }
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        GestureDetector gestureDetector = this.f129827a;
        if (gestureDetector != null && this.f129831e) {
            gestureDetector.setMMCVInfo(omwVar);
        }
        ExpressDetector expressDetector = this.f129828b;
        if (expressDetector != null && this.f129832f) {
            expressDetector.setMMCVInfo(omwVar);
        }
        a53 a53Var = this.f129829c;
        if (a53Var != null && this.f129833g) {
            a53Var.m96022j(omwVar);
        }
        ool oolVar = this.f129830d;
        if (oolVar != null) {
            oolVar.setMMCVInfo(omwVar);
        }
    }
}
