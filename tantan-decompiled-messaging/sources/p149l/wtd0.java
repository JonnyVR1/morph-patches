package p149l;

import android.graphics.Rect;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p046p1.mobile.putong.data.OMSSizeType;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p131ec.Tnaf;

/* JADX INFO: loaded from: classes13.dex */
public class wtd0 extends fdq0<ttd0> {
    public wtd0(ttd0 ttd0Var) {
        this.f97068b = ttd0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r0v10, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r10v72, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r10v77, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r10v83, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v11, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r11v6, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v27, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r12v33, types: [T, java.lang.Float] */
    /* JADX WARN: Type inference failed for: r12v36, types: [T, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v46, types: [T, java.lang.Integer] */
    @Override // p149l.fdq0
    /* JADX INFO: renamed from: a */
    public void mo121004a(String str, String[] strArr, boolean z) {
        byte b;
        if (z) {
            if (str.equals("model")) {
                ((ttd0) this.f97068b).m190603k(new s860());
                return;
            }
            return;
        }
        str.getClass();
        switch (str.hashCode()) {
            case -1992012396:
                b = !str.equals(BLiveOperationTitleShowType.duration) ? (byte) -1 : (byte) 0;
                break;
            case -1445158613:
                b = !str.equals("rotate_interpolator") ? (byte) -1 : (byte) 1;
                break;
            case -1379405195:
                b = !str.equals("move_interpolator") ? (byte) -1 : (byte) 2;
                break;
            case -1051328410:
                b = !str.equals("active_time") ? (byte) -1 : (byte) 3;
                break;
            case -925180581:
                b = !str.equals("rotate") ? (byte) -1 : (byte) 4;
                break;
            case -852068928:
                b = !str.equals("width_height") ? (byte) -1 : (byte) 5;
                break;
            case -418716716:
                b = !str.equals("src_ltwh") ? (byte) -1 : (byte) 6;
                break;
            case -98586022:
                b = !str.equals("src_id_wh") ? (byte) -1 : (byte) 7;
                break;
            case -64908900:
                b = !str.equals("scale_interpolator") ? (byte) -1 : (byte) 8;
                break;
            case 107876:
                b = !str.equals(Constants.PRIORITY_MAX) ? (byte) -1 : (byte) 9;
                break;
            case 3373707:
                b = !str.equals(AuthenticationTokenClaims.JSON_KEY_NAME) ? (byte) -1 : (byte) 10;
                break;
            case 92909918:
                b = !str.equals("alpha") ? (byte) -1 : (byte) 11;
                break;
            case 109250890:
                b = !str.equals(BigEyeFilter.UNIFORM_SCALE) ? (byte) -1 : (byte) 12;
                break;
            case 1025718513:
                b = !str.equals("move_rotate_to") ? (byte) -1 : HttpTokens.CARRIAGE_RETURN;
                break;
            case 1068060504:
                b = !str.equals("move_from") ? (byte) -1 : (byte) 14;
                break;
            case 1216326152:
                b = !str.equals("alpha_interpolator") ? (byte) -1 : (byte) 15;
                break;
            case 1243568553:
                b = !str.equals("move_to") ? (byte) -1 : Tnaf.POW_2_WIDTH;
                break;
            case 1867610226:
                b = !str.equals("chance_range") ? (byte) -1 : (byte) 17;
                break;
            case 2011608879:
                b = !str.equals("layout_type") ? (byte) -1 : (byte) 18;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                ((ttd0) this.f97068b).f55665m = Integer.parseInt(strArr[0]);
                return;
            case 1:
                ((ttd0) this.f97068b).m190604m().f163006k = strArr[0];
                return;
            case 2:
                String[] strArr2 = ((ttd0) this.f97068b).m190604m().f163002g;
                strArr2[0] = strArr[0];
                strArr2[1] = strArr[1];
                return;
            case 3:
                ((ttd0) this.f97068b).m190604m().f162999d.mo125467i(Integer.valueOf(Integer.parseInt(strArr[0])), Integer.valueOf(Integer.parseInt(strArr[1])));
                return;
            case 4:
                s860 s860VarM190604m = ((ttd0) this.f97068b).m190604m();
                s860VarM190604m.f163004i.mo125467i(Integer.valueOf(Integer.parseInt(strArr[0])), Integer.valueOf(Integer.parseInt(strArr[1])));
                if (strArr.length == 6) {
                    s860VarM190604m.f163005j.mo125467i(Integer.valueOf(Integer.parseInt(strArr[2])), Integer.valueOf(Integer.parseInt(strArr[3])));
                    s860VarM190604m.f163003h.f96575a = Float.valueOf(Float.parseFloat(strArr[4]));
                    s860VarM190604m.f163003h.f96576b = Float.valueOf(Float.parseFloat(strArr[5]));
                    return;
                }
                s860VarM190604m.f163005j = null;
                s860VarM190604m.f163003h.f96575a = Float.valueOf(Float.parseFloat(strArr[2]));
                s860VarM190604m.f163003h.f96576b = Float.valueOf(Float.parseFloat(strArr[3]));
                return;
            case 5:
                ((ttd0) this.f97068b).f55660h.f176651a = Integer.valueOf(Integer.parseInt(strArr[0]));
                ((ttd0) this.f97068b).f55660h.f176652b = Integer.valueOf(Integer.parseInt(strArr[1]));
                return;
            case 6:
                s860 s860VarM190604m2 = ((ttd0) this.f97068b).m190604m();
                s860VarM190604m2.f162997b.left = Integer.parseInt(strArr[0]);
                s860VarM190604m2.f162997b.top = Integer.parseInt(strArr[1]);
                s860VarM190604m2.f162996a.f176651a = Integer.valueOf(Integer.parseInt(strArr[2]));
                Rect rect = s860VarM190604m2.f162997b;
                rect.right = rect.left + s860VarM190604m2.f162996a.f176651a.intValue();
                s860VarM190604m2.f162996a.f176652b = Integer.valueOf(Integer.parseInt(strArr[3]));
                Rect rect2 = s860VarM190604m2.f162997b;
                rect2.bottom = rect2.top + s860VarM190604m2.f162996a.f176652b.intValue();
                String str2 = s860VarM190604m2.f163012q;
                if (str2 != null) {
                    ((ttd0) this.f97068b).f55677y.put(str2, s860VarM190604m2.f162997b);
                    return;
                }
                return;
            case 7:
                s860 s860VarM190604m3 = ((ttd0) this.f97068b).m190604m();
                s860VarM190604m3.f163013r = strArr[0];
                Rect rect3 = s860VarM190604m3.f162997b;
                rect3.left = 0;
                rect3.top = 0;
                s860VarM190604m3.f162996a.f176651a = Integer.valueOf(Integer.parseInt(strArr[1]));
                Rect rect4 = s860VarM190604m3.f162997b;
                rect4.right = rect4.left + s860VarM190604m3.f162996a.f176651a.intValue();
                s860VarM190604m3.f162996a.f176652b = Integer.valueOf(Integer.parseInt(strArr[2]));
                Rect rect5 = s860VarM190604m3.f162997b;
                rect5.bottom = rect5.top + s860VarM190604m3.f162996a.f176652b.intValue();
                return;
            case 8:
                ((ttd0) this.f97068b).m190604m().f163014s = strArr[0];
                return;
            case 9:
                ((ttd0) this.f97068b).m190605p(Integer.parseInt(strArr[0]));
                return;
            case 10:
                ((ttd0) this.f97068b).m190604m().f163012q = strArr[0];
                return;
            case 11:
                s860 s860VarM190604m4 = ((ttd0) this.f97068b).m190604m();
                s860VarM190604m4.f163007l.mo125467i(Integer.valueOf(Integer.parseInt(strArr[0])), Integer.valueOf(Integer.parseInt(strArr[1])));
                if (strArr.length == 2) {
                    s860VarM190604m4.f163008m = null;
                    return;
                } else {
                    s860VarM190604m4.f163008m.mo125467i(Integer.valueOf(Integer.parseInt(strArr[2])), Integer.valueOf(Integer.parseInt(strArr[3])));
                    return;
                }
            case 12:
                s860 s860VarM190604m5 = ((ttd0) this.f97068b).m190604m();
                s860VarM190604m5.f163010o.mo125467i(Float.valueOf(Float.parseFloat(strArr[0])), Float.valueOf(Float.parseFloat(strArr[1])));
                if (strArr.length == 4) {
                    s860VarM190604m5.f163011p.mo125467i(Float.valueOf(Float.parseFloat(strArr[2])), Float.valueOf(Float.parseFloat(strArr[3])));
                    return;
                } else {
                    s860VarM190604m5.f163011p = null;
                    return;
                }
            case 13:
                ((ttd0) this.f97068b).m190604m().f163001f.f200684a = true;
                break;
            case 14:
                s860 s860VarM190604m6 = ((ttd0) this.f97068b).m190604m();
                s860VarM190604m6.f163000e.f200685b = Integer.parseInt(strArr[0]);
                s860VarM190604m6.f163000e.f200687d = Integer.parseInt(strArr[1]);
                boolean zEquals = OMSSizeType.match_parent.equals(strArr[2]);
                yy0 yy0Var = s860VarM190604m6.f163000e;
                if (zEquals) {
                    yy0Var.f200689f = -1;
                } else {
                    yy0Var.f200689f = Integer.parseInt(strArr[2]);
                }
                s860VarM190604m6.f163000e.f200690g = Integer.parseInt(strArr[3]);
                return;
            case 15:
                ((ttd0) this.f97068b).m190604m().f163009n = strArr[0];
                return;
            case 16:
                break;
            case 17:
                ((ttd0) this.f97068b).m190604m().f162998c.mo125467i(Float.valueOf(Float.parseFloat(strArr[0])), Float.valueOf(Float.parseFloat(strArr[1])));
                return;
            case 18:
                ((ttd0) this.f97068b).f55663k = strArr[0];
                return;
            default:
                return;
        }
        s860 s860VarM190604m7 = ((ttd0) this.f97068b).m190604m();
        if (strArr[0].contains("offset:")) {
            s860VarM190604m7.f163001f.f200686c = true;
            String strReplace = strArr[0].replace("offset:", "");
            strArr[0] = strReplace;
            s860VarM190604m7.f163001f.f200685b = Integer.parseInt(strReplace);
        } else {
            yy0 yy0Var2 = s860VarM190604m7.f163001f;
            yy0Var2.f200686c = false;
            yy0Var2.f200685b = Integer.parseInt(strArr[0]);
        }
        if (strArr[1].contains("offset:")) {
            s860VarM190604m7.f163001f.f200688e = true;
            String strReplace2 = strArr[1].replace("offset:", "");
            strArr[1] = strReplace2;
            s860VarM190604m7.f163001f.f200687d = Integer.parseInt(strReplace2);
        } else {
            yy0 yy0Var3 = s860VarM190604m7.f163001f;
            yy0Var3.f200688e = false;
            yy0Var3.f200687d = Integer.parseInt(strArr[1]);
        }
        if (OMSSizeType.match_parent.equals(strArr[2])) {
            s860VarM190604m7.f163001f.f200689f = -1;
        } else {
            s860VarM190604m7.f163001f.f200689f = Integer.parseInt(strArr[2]);
        }
        s860VarM190604m7.f163001f.f200690g = Integer.parseInt(strArr[3]);
    }
}
