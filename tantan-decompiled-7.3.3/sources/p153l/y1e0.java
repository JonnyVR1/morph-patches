package p153l;

import android.graphics.Rect;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.momo.mcamera.mask.BigEyeFilter;
import com.p051p1.mobile.putong.data.OMSSizeType;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes11.dex */
public class y1e0 extends kmq0<v1e0> {
    public y1e0(v1e0 v1e0Var) {
        this.f127530b = v1e0Var;
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
    @Override // p153l.kmq0
    /* JADX INFO: renamed from: a */
    public void mo138100a(String str, String[] strArr, boolean z) {
        byte b;
        if (z) {
            if (str.equals("model")) {
                ((v1e0) this.f127530b).m199006k(new xg60());
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
                ((v1e0) this.f127530b).f56513m = Integer.parseInt(strArr[0]);
                return;
            case 1:
                ((v1e0) this.f127530b).m199007m().f194148k = strArr[0];
                return;
            case 2:
                String[] strArr2 = ((v1e0) this.f127530b).m199007m().f194144g;
                strArr2[0] = strArr[0];
                strArr2[1] = strArr[1];
                return;
            case 3:
                ((v1e0) this.f127530b).m199007m().f194141d.mo150086i(Integer.valueOf(Integer.parseInt(strArr[0])), Integer.valueOf(Integer.parseInt(strArr[1])));
                return;
            case 4:
                xg60 xg60VarM199007m = ((v1e0) this.f127530b).m199007m();
                xg60VarM199007m.f194146i.mo150086i(Integer.valueOf(Integer.parseInt(strArr[0])), Integer.valueOf(Integer.parseInt(strArr[1])));
                if (strArr.length == 6) {
                    xg60VarM199007m.f194147j.mo150086i(Integer.valueOf(Integer.parseInt(strArr[2])), Integer.valueOf(Integer.parseInt(strArr[3])));
                    xg60VarM199007m.f194145h.f132192a = Float.valueOf(Float.parseFloat(strArr[4]));
                    xg60VarM199007m.f194145h.f132193b = Float.valueOf(Float.parseFloat(strArr[5]));
                    return;
                }
                xg60VarM199007m.f194147j = null;
                xg60VarM199007m.f194145h.f132192a = Float.valueOf(Float.parseFloat(strArr[2]));
                xg60VarM199007m.f194145h.f132193b = Float.valueOf(Float.parseFloat(strArr[3]));
                return;
            case 5:
                ((v1e0) this.f127530b).f56508h.f90384a = Integer.valueOf(Integer.parseInt(strArr[0]));
                ((v1e0) this.f127530b).f56508h.f90385b = Integer.valueOf(Integer.parseInt(strArr[1]));
                return;
            case 6:
                xg60 xg60VarM199007m2 = ((v1e0) this.f127530b).m199007m();
                xg60VarM199007m2.f194139b.left = Integer.parseInt(strArr[0]);
                xg60VarM199007m2.f194139b.top = Integer.parseInt(strArr[1]);
                xg60VarM199007m2.f194138a.f90384a = Integer.valueOf(Integer.parseInt(strArr[2]));
                Rect rect = xg60VarM199007m2.f194139b;
                rect.right = rect.left + xg60VarM199007m2.f194138a.f90384a.intValue();
                xg60VarM199007m2.f194138a.f90385b = Integer.valueOf(Integer.parseInt(strArr[3]));
                Rect rect2 = xg60VarM199007m2.f194139b;
                rect2.bottom = rect2.top + xg60VarM199007m2.f194138a.f90385b.intValue();
                String str2 = xg60VarM199007m2.f194154q;
                if (str2 != null) {
                    ((v1e0) this.f127530b).f56525y.put(str2, xg60VarM199007m2.f194139b);
                    return;
                }
                return;
            case 7:
                xg60 xg60VarM199007m3 = ((v1e0) this.f127530b).m199007m();
                xg60VarM199007m3.f194155r = strArr[0];
                Rect rect3 = xg60VarM199007m3.f194139b;
                rect3.left = 0;
                rect3.top = 0;
                xg60VarM199007m3.f194138a.f90384a = Integer.valueOf(Integer.parseInt(strArr[1]));
                Rect rect4 = xg60VarM199007m3.f194139b;
                rect4.right = rect4.left + xg60VarM199007m3.f194138a.f90384a.intValue();
                xg60VarM199007m3.f194138a.f90385b = Integer.valueOf(Integer.parseInt(strArr[2]));
                Rect rect5 = xg60VarM199007m3.f194139b;
                rect5.bottom = rect5.top + xg60VarM199007m3.f194138a.f90385b.intValue();
                return;
            case 8:
                ((v1e0) this.f127530b).m199007m().f194156s = strArr[0];
                return;
            case 9:
                ((v1e0) this.f127530b).m199008p(Integer.parseInt(strArr[0]));
                return;
            case 10:
                ((v1e0) this.f127530b).m199007m().f194154q = strArr[0];
                return;
            case 11:
                xg60 xg60VarM199007m4 = ((v1e0) this.f127530b).m199007m();
                xg60VarM199007m4.f194149l.mo150086i(Integer.valueOf(Integer.parseInt(strArr[0])), Integer.valueOf(Integer.parseInt(strArr[1])));
                if (strArr.length == 2) {
                    xg60VarM199007m4.f194150m = null;
                    return;
                } else {
                    xg60VarM199007m4.f194150m.mo150086i(Integer.valueOf(Integer.parseInt(strArr[2])), Integer.valueOf(Integer.parseInt(strArr[3])));
                    return;
                }
            case 12:
                xg60 xg60VarM199007m5 = ((v1e0) this.f127530b).m199007m();
                xg60VarM199007m5.f194152o.mo150086i(Float.valueOf(Float.parseFloat(strArr[0])), Float.valueOf(Float.parseFloat(strArr[1])));
                if (strArr.length == 4) {
                    xg60VarM199007m5.f194153p.mo150086i(Float.valueOf(Float.parseFloat(strArr[2])), Float.valueOf(Float.parseFloat(strArr[3])));
                    return;
                } else {
                    xg60VarM199007m5.f194153p = null;
                    return;
                }
            case 13:
                ((v1e0) this.f127530b).m199007m().f194143f.f101430a = true;
                break;
            case 14:
                xg60 xg60VarM199007m6 = ((v1e0) this.f127530b).m199007m();
                xg60VarM199007m6.f194142e.f101431b = Integer.parseInt(strArr[0]);
                xg60VarM199007m6.f194142e.f101433d = Integer.parseInt(strArr[1]);
                boolean zEquals = OMSSizeType.match_parent.equals(strArr[2]);
                fz0 fz0Var = xg60VarM199007m6.f194142e;
                if (zEquals) {
                    fz0Var.f101435f = -1;
                } else {
                    fz0Var.f101435f = Integer.parseInt(strArr[2]);
                }
                xg60VarM199007m6.f194142e.f101436g = Integer.parseInt(strArr[3]);
                return;
            case 15:
                ((v1e0) this.f127530b).m199007m().f194151n = strArr[0];
                return;
            case 16:
                break;
            case 17:
                ((v1e0) this.f127530b).m199007m().f194140c.mo150086i(Float.valueOf(Float.parseFloat(strArr[0])), Float.valueOf(Float.parseFloat(strArr[1])));
                return;
            case 18:
                ((v1e0) this.f127530b).f56511k = strArr[0];
                return;
            default:
                return;
        }
        xg60 xg60VarM199007m7 = ((v1e0) this.f127530b).m199007m();
        if (strArr[0].contains("offset:")) {
            xg60VarM199007m7.f194143f.f101432c = true;
            String strReplace = strArr[0].replace("offset:", "");
            strArr[0] = strReplace;
            xg60VarM199007m7.f194143f.f101431b = Integer.parseInt(strReplace);
        } else {
            fz0 fz0Var2 = xg60VarM199007m7.f194143f;
            fz0Var2.f101432c = false;
            fz0Var2.f101431b = Integer.parseInt(strArr[0]);
        }
        if (strArr[1].contains("offset:")) {
            xg60VarM199007m7.f194143f.f101434e = true;
            String strReplace2 = strArr[1].replace("offset:", "");
            strArr[1] = strReplace2;
            xg60VarM199007m7.f194143f.f101433d = Integer.parseInt(strReplace2);
        } else {
            fz0 fz0Var3 = xg60VarM199007m7.f194143f;
            fz0Var3.f101434e = false;
            fz0Var3.f101433d = Integer.parseInt(strArr[1]);
        }
        if (OMSSizeType.match_parent.equals(strArr[2])) {
            xg60VarM199007m7.f194143f.f101435f = -1;
        } else {
            xg60VarM199007m7.f194143f.f101435f = Integer.parseInt(strArr[2]);
        }
        xg60VarM199007m7.f194143f.f101436g = Integer.parseInt(strArr[3]);
    }
}
