package p153l;

import android.text.TextUtils;
import com.core.glcore.p024cv.MMCVBoxes;
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
public class b40 implements ool {

    /* JADX INFO: renamed from: a */
    private omw f74842a;

    /* JADX INFO: renamed from: b */
    private MMCVBoxes f74843b;

    /* JADX INFO: renamed from: c */
    private ExpressInfo f74844c;

    /* JADX INFO: renamed from: d */
    private BodyLandmarkPostInfo f74845d;

    /* JADX INFO: renamed from: e */
    private xtl f74846e;

    /* JADX INFO: renamed from: i */
    private ActionInfo f74850i;

    /* JADX INFO: renamed from: j */
    private final Map<String, Integer> f74851j = new HashMap();

    /* JADX INFO: renamed from: k */
    private int[] f74852k = {3, 4, 5, 0, 1, 2, 9, 10, 11, 6, 7, 8, 12, 13};

    /* JADX INFO: renamed from: f */
    private final MMBox f74847f = new MMBox();

    /* JADX INFO: renamed from: g */
    private final SingleExpressInfo f74848g = new SingleExpressInfo();

    /* JADX INFO: renamed from: h */
    private final MMJoint[] f74849h = new MMJoint[14];

    public b40() {
        int i = 0;
        while (true) {
            MMJoint[] mMJointArr = this.f74849h;
            if (i >= mMJointArr.length) {
                this.f74851j.put("du", 1);
                this.f74851j.put("smile", 2);
                this.f74851j.put("open_mouth", 3);
                this.f74851j.put("left_head", 1);
                this.f74851j.put("right_head", 2);
                this.f74851j.put("bow_head", 3);
                return;
            }
            mMJointArr[i] = new MMJoint();
            i++;
        }
    }

    /* JADX INFO: renamed from: g */
    private MMJoint[] m102384g() {
        MMJoint[][] mMJointArr;
        BodyLandmarkPostInfo bodyLandmarkPostInfo = this.f74845d;
        return (bodyLandmarkPostInfo == null || (mMJointArr = bodyLandmarkPostInfo.multi_person_) == null || mMJointArr.length <= 0) ? this.f74849h : mMJointArr[0];
    }

    /* JADX INFO: renamed from: h */
    private SingleExpressInfo m102385h() {
        SingleExpressInfo[] singleExpressInfoArr;
        ExpressInfo expressInfo = this.f74844c;
        return (expressInfo == null || (singleExpressInfoArr = expressInfo.express_infos_) == null || singleExpressInfoArr.length <= 0) ? this.f74848g : singleExpressInfoArr[0];
    }

    /* JADX INFO: renamed from: i */
    private MMBox m102386i() {
        MMCVBoxes mMCVBoxes = this.f74843b;
        return (mMCVBoxes == null || mMCVBoxes.getDetectResult() == null || this.f74843b.getDetectResult().length <= 0) ? this.f74847f : this.f74843b.getDetectResult()[0];
    }

    /* JADX INFO: renamed from: j */
    private int m102387j(omw omwVar, int i) {
        return (omwVar == null || omwVar.f148014a) ? this.f74852k[i] : i;
    }

    /* JADX INFO: renamed from: k */
    private boolean m102388k(MMJoint[] mMJointArr, List<ActionInfo.BodyBean> list) {
        boolean z = list == null || list.isEmpty();
        if (!z) {
            for (ActionInfo.BodyBean bodyBean : list) {
                if (bodyBean.getFirst() >= 0 && bodyBean.getFirst() < mMJointArr.length && bodyBean.getSecond() >= 0 && bodyBean.getSecond() < mMJointArr.length) {
                    MMJoint mMJoint = mMJointArr[m102387j(this.f74842a, bodyBean.getFirst())];
                    if (mMJoint.score_ >= bodyBean.getScore()) {
                        MMJoint mMJoint2 = mMJointArr[m102387j(this.f74842a, bodyBean.getSecond())];
                        if (mMJoint2.score_ >= bodyBean.getScore() && bodyBean.getOffsetX() != null && bodyBean.getOffsetX().size() == 2) {
                            float fFloatValue = bodyBean.getOffsetX().get(0).floatValue();
                            float fFloatValue2 = bodyBean.getOffsetX().get(1).floatValue();
                            if (bodyBean.getOffsetY() != null && bodyBean.getOffsetY().size() == 2) {
                                float fFloatValue3 = bodyBean.getOffsetY().get(0).floatValue();
                                float fFloatValue4 = bodyBean.getOffsetY().get(1).floatValue();
                                omw omwVar = this.f74842a;
                                int i = omwVar.f148019f;
                                int i2 = omwVar.f148018e;
                                float f = i;
                                float f2 = (mMJoint.f15478x_ * 1.0f) / f;
                                float f3 = i2;
                                float f4 = (mMJoint.f15479y_ * 1.0f) / f3;
                                float f5 = (mMJoint2.f15478x_ * 1.0f) / f;
                                float f6 = (mMJoint2.f15479y_ * 1.0f) / f3;
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
    private boolean m102389l(SingleExpressInfo singleExpressInfo, String str, String str2, String str3) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        if (!zIsEmpty) {
            Integer num = this.f74851j.get(str);
            zIsEmpty = num != null && num.intValue() == singleExpressInfo.mouth_;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(str2);
        if (!zIsEmpty2) {
            Integer num2 = this.f74851j.get(str2);
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
    private boolean m102390m(MMBox mMBox, String str) {
        return TextUtils.isEmpty(str) || TextUtils.equals(mMBox.class_name_, str);
    }

    @Override // p153l.ool
    /* JADX INFO: renamed from: a */
    public void mo102391a(BodyLandmarkPostInfo bodyLandmarkPostInfo) {
        this.f74845d = bodyLandmarkPostInfo;
    }

    @Override // p153l.ool
    /* JADX INFO: renamed from: b */
    public void mo102392b(ExpressInfo expressInfo) {
        this.f74844c = expressInfo;
    }

    @Override // p153l.ool
    /* JADX INFO: renamed from: c */
    public void mo102393c(ActionInfo actionInfo) {
        this.f74850i = actionInfo;
    }

    @Override // p153l.ool
    /* JADX INFO: renamed from: d */
    public void mo102394d(xtl xtlVar) {
        this.f74846e = xtlVar;
    }

    @Override // p153l.ool
    /* JADX INFO: renamed from: e */
    public void mo102395e() {
        if (this.f74846e == null || this.f74850i == null) {
            return;
        }
        boolean zM102390m = m102390m(m102386i(), this.f74850i.getHand());
        boolean zM102389l = m102389l(m102385h(), this.f74850i.getMouth(), this.f74850i.getHead(), this.f74850i.getEye());
        boolean zM102388k = m102388k(m102384g(), this.f74850i.getBody());
        if (zM102390m && zM102389l && zM102388k) {
            this.f74846e.mo152657a();
        }
    }

    @Override // p153l.ool
    /* JADX INFO: renamed from: f */
    public void mo102396f(MMCVBoxes mMCVBoxes) {
        this.f74843b = mMCVBoxes;
    }

    @Override // p153l.ool
    public void setMMCVInfo(omw omwVar) {
        this.f74842a = omwVar;
    }
}
