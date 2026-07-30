package p149l;

import android.text.TextUtils;
import com.core.glcore.p023cv.MMCVBoxes;
import com.momo.mcamera.mask.ActionInfo;
import com.momocv.MMBox;
import com.momocv.MMJoint;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import com.momocv.express.ExpressInfo;
import com.momocv.express.SingleExpressInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class h40 implements cml {

    /* JADX INFO: renamed from: a */
    private pjw f105778a;

    /* JADX INFO: renamed from: b */
    private MMCVBoxes f105779b;

    /* JADX INFO: renamed from: c */
    private ExpressInfo f105780c;

    /* JADX INFO: renamed from: d */
    private BodyLandmarkPostInfo f105781d;

    /* JADX INFO: renamed from: e */
    private krl f105782e;

    /* JADX INFO: renamed from: i */
    private ActionInfo f105786i;

    /* JADX INFO: renamed from: j */
    private final Map<String, Integer> f105787j = new HashMap();

    /* JADX INFO: renamed from: k */
    private int[] f105788k = {3, 4, 5, 0, 1, 2, 9, 10, 11, 6, 7, 8, 12, 13};

    /* JADX INFO: renamed from: f */
    private final MMBox f105783f = new MMBox();

    /* JADX INFO: renamed from: g */
    private final SingleExpressInfo f105784g = new SingleExpressInfo();

    /* JADX INFO: renamed from: h */
    private final MMJoint[] f105785h = new MMJoint[14];

    public h40() {
        int i = 0;
        while (true) {
            MMJoint[] mMJointArr = this.f105785h;
            if (i >= mMJointArr.length) {
                this.f105787j.put("du", 1);
                this.f105787j.put("smile", 2);
                this.f105787j.put("open_mouth", 3);
                this.f105787j.put("left_head", 1);
                this.f105787j.put("right_head", 2);
                this.f105787j.put("bow_head", 3);
                return;
            }
            mMJointArr[i] = new MMJoint();
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    private MMJoint[] m129200g() {
        MMJoint[][] mMJointArr;
        BodyLandmarkPostInfo bodyLandmarkPostInfo = this.f105781d;
        return (bodyLandmarkPostInfo == null || (mMJointArr = bodyLandmarkPostInfo.multi_person_) == null || mMJointArr.length <= 0) ? this.f105785h : mMJointArr[0];
    }

    /* JADX INFO: renamed from: h */
    private SingleExpressInfo m129201h() {
        SingleExpressInfo[] singleExpressInfoArr;
        ExpressInfo expressInfo = this.f105780c;
        return (expressInfo == null || (singleExpressInfoArr = expressInfo.express_infos_) == null || singleExpressInfoArr.length <= 0) ? this.f105784g : singleExpressInfoArr[0];
    }

    /* JADX INFO: renamed from: i */
    private MMBox m129202i() {
        MMCVBoxes mMCVBoxes = this.f105779b;
        return (mMCVBoxes == null || mMCVBoxes.getDetectResult() == null || this.f105779b.getDetectResult().length <= 0) ? this.f105783f : this.f105779b.getDetectResult()[0];
    }

    /* JADX INFO: renamed from: j */
    private int m129203j(pjw pjwVar, int i) {
        return (pjwVar == null || pjwVar.f149894a) ? this.f105788k[i] : i;
    }

    /* JADX INFO: renamed from: k */
    private boolean m129204k(MMJoint[] mMJointArr, List<ActionInfo.BodyBean> list) {
        boolean z = list == null || list.isEmpty();
        if (!z) {
            for (ActionInfo.BodyBean bodyBean : list) {
                if (bodyBean.getFirst() >= 0 && bodyBean.getFirst() < mMJointArr.length && bodyBean.getSecond() >= 0 && bodyBean.getSecond() < mMJointArr.length) {
                    MMJoint mMJoint = mMJointArr[m129203j(this.f105778a, bodyBean.getFirst())];
                    if (mMJoint.score_ >= bodyBean.getScore()) {
                        MMJoint mMJoint2 = mMJointArr[m129203j(this.f105778a, bodyBean.getSecond())];
                        if (mMJoint2.score_ >= bodyBean.getScore() && bodyBean.getOffsetX() != null && bodyBean.getOffsetX().size() == 2) {
                            float fFloatValue = bodyBean.getOffsetX().get(0).floatValue();
                            float fFloatValue2 = bodyBean.getOffsetX().get(1).floatValue();
                            if (bodyBean.getOffsetY() != null && bodyBean.getOffsetY().size() == 2) {
                                float fFloatValue3 = bodyBean.getOffsetY().get(0).floatValue();
                                float fFloatValue4 = bodyBean.getOffsetY().get(1).floatValue();
                                pjw pjwVar = this.f105778a;
                                int i = pjwVar.f149899f;
                                int i2 = pjwVar.f149898e;
                                float f = i;
                                float f2 = (mMJoint.f14759x_ * 1.0f) / f;
                                float f3 = i2;
                                float f4 = (mMJoint.f14760y_ * 1.0f) / f3;
                                float f5 = (mMJoint2.f14759x_ * 1.0f) / f;
                                float f6 = (mMJoint2.f14760y_ * 1.0f) / f3;
                                float f7 = f2 - f5;
                                if (f7 >= fFloatValue && f7 <= fFloatValue2) {
                                    float f8 = f4 - f6;
                                    if (f8 >= fFloatValue3 && f8 <= fFloatValue4) {
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    /* JADX WARN: Code duplicated, block: B:25:0x004e  */
    /* JADX INFO: renamed from: l */
    private boolean m129205l(SingleExpressInfo singleExpressInfo, String str, String str2, String str3) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (!zIsEmpty) {
            Integer num = this.f105787j.get(str);
            zIsEmpty = num != null && num.intValue() == singleExpressInfo.mouth_;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty2) {
            Integer num2 = this.f105787j.get(str2);
            zIsEmpty2 = num2 != null && num2.intValue() == singleExpressInfo.head_;
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(str3);
        if (!zIsEmpty3) {
            if (TextUtils.equals(str3, "single_eye")) {
                if (singleExpressInfo.lefteye_ != singleExpressInfo.righteye_) {
                    zIsEmpty3 = true;
                } else {
                    zIsEmpty3 = false;
                }
            } else if (TextUtils.equals(str3, "close_eye")) {
                if (singleExpressInfo.lefteye_ == 0 && singleExpressInfo.righteye_ == 0) {
                    zIsEmpty3 = true;
                } else {
                    zIsEmpty3 = false;
                }
            } else if (TextUtils.equals(str3, "open_eye")) {
                if (singleExpressInfo.lefteye_ == 1 && singleExpressInfo.righteye_ == 1) {
                    zIsEmpty3 = true;
                } else {
                    zIsEmpty3 = false;
                }
            } else if (TextUtils.equals(str3, "left_open_right_close")) {
                if (singleExpressInfo.lefteye_ == 0 && singleExpressInfo.righteye_ == 1) {
                    zIsEmpty3 = true;
                } else {
                    zIsEmpty3 = false;
                }
            } else if (TextUtils.equals(str3, "left_close_right_open")) {
                if (singleExpressInfo.lefteye_ == 1 && singleExpressInfo.righteye_ == 0) {
                    zIsEmpty3 = true;
                } else {
                    zIsEmpty3 = false;
                }
            }
        }
        return zIsEmpty && zIsEmpty2 && zIsEmpty3;
    }

    /* JADX INFO: renamed from: m */
    private boolean m129206m(MMBox mMBox, String str) {
        return TextUtils.isEmpty(str) || TextUtils.equals(mMBox.class_name_, str);
    }

    @Override // p149l.cml
    /* JADX INFO: renamed from: a */
    public void mo107666a(BodyLandmarkPostInfo bodyLandmarkPostInfo) {
        this.f105781d = bodyLandmarkPostInfo;
    }

    @Override // p149l.cml
    /* JADX INFO: renamed from: b */
    public void mo107667b(ExpressInfo expressInfo) {
        this.f105780c = expressInfo;
    }

    @Override // p149l.cml
    /* JADX INFO: renamed from: c */
    public void mo107668c(ActionInfo actionInfo) {
        this.f105786i = actionInfo;
    }

    @Override // p149l.cml
    /* JADX INFO: renamed from: d */
    public void mo107669d(krl krlVar) {
        this.f105782e = krlVar;
    }

    @Override // p149l.cml
    /* JADX INFO: renamed from: e */
    public void mo107670e() {
        if (this.f105782e == null || this.f105786i == null) {
            return;
        }
        boolean zM129206m = m129206m(m129202i(), this.f105786i.getHand());
        boolean zM129205l = m129205l(m129201h(), this.f105786i.getMouth(), this.f105786i.getHead(), this.f105786i.getEye());
        boolean zM129204k = m129204k(m129200g(), this.f105786i.getBody());
        if (zM129206m && zM129205l && zM129204k) {
            this.f105782e.mo147003a();
        }
    }

    @Override // p149l.cml
    /* JADX INFO: renamed from: f */
    public void mo107671f(MMCVBoxes mMCVBoxes) {
        this.f105779b = mMCVBoxes;
    }

    @Override // p149l.cml
    public void setMMCVInfo(pjw pjwVar) {
        this.f105778a = pjwVar;
    }
}
