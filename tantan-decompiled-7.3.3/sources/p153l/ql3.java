package p153l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;

/* JADX INFO: loaded from: classes13.dex */
public class ql3 {

    /* JADX INFO: renamed from: a */
    public static int f158197a = qa00.m175859d(2.0f);

    /* JADX INFO: renamed from: b */
    public static String f158198b = "#639BFF";

    /* JADX INFO: renamed from: c */
    public static String f158199c = "#FF84BA";

    /* JADX INFO: renamed from: a */
    public static void m176983a(SimpleDraweeView simpleDraweeView, BLiveUserMask bLiveUserMask, int i, boolean z) {
        if (bLiveUserMask == null) {
            return;
        }
        bLiveUserMask.toString();
        m176987e(simpleDraweeView, bLiveUserMask, z);
        if (!TextUtils.isEmpty(bLiveUserMask.avatar) || i == 0) {
            izs.m142864o("context_single_room", simpleDraweeView, bLiveUserMask.avatar);
        } else {
            simpleDraweeView.setImageResource(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m176984b(SimpleDraweeView simpleDraweeView, BLiveUserMask bLiveUserMask, boolean z) {
        m176983a(simpleDraweeView, bLiveUserMask, mbc0.f135660T, z);
    }

    /* JADX INFO: renamed from: c */
    public static <T> void m176985c(SimpleDraweeView simpleDraweeView, nsv<T> nsvVar, qcj<T, String> qcjVar) {
        m176986d(simpleDraweeView, nsvVar, false, qcjVar);
    }

    /* JADX INFO: renamed from: d */
    public static <T> void m176986d(SimpleDraweeView simpleDraweeView, nsv<T> nsvVar, boolean z, qcj<T, String> qcjVar) {
        if (nsvVar == null) {
            simpleDraweeView.setImageResource(mbc0.f135660T);
            return;
        }
        simpleDraweeView.setBackground(null);
        if (l6o0.m153068c(nsvVar).m153072e()) {
            m176984b(simpleDraweeView, l6o0.m153068c(nsvVar).f130275b, z);
        } else {
            izs.m142870u("context_single_room", simpleDraweeView, qcjVar.call(nsvVar.f143542a), qa00.m175859d(40.0f), qa00.m175859d(40.0f));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m176987e(SimpleDraweeView simpleDraweeView, BLiveUserMask bLiveUserMask, boolean z) {
        m176988f(simpleDraweeView, bLiveUserMask, z, false, false);
    }

    /* JADX INFO: renamed from: f */
    public static void m176988f(SimpleDraweeView simpleDraweeView, BLiveUserMask bLiveUserMask, boolean z, boolean z2, boolean z3) {
        if (bLiveUserMask == null) {
            return;
        }
        wlj wljVar = (wlj) simpleDraweeView.getHierarchy();
        RoundingParams roundingParamsM207055p = wljVar.m207055p();
        if (roundingParamsM207055p == null && !z2) {
            roundingParamsM207055p = RoundingParams.m8301a();
            wljVar.m207045H(roundingParamsM207055p);
        }
        if (!z3) {
            wljVar.m207041D(mbc0.f135660T);
        }
        GradientDrawable gradientDrawableM124978h = fc2.m124978h(0);
        if (z) {
            int color = Color.parseColor(bLiveUserMask.isFemale() ? f158199c : f158198b);
            roundingParamsM207055p.m8321u(f158197a);
            gradientDrawableM124978h.setStroke(f158197a, color);
        }
        if (!TextUtils.isEmpty(bLiveUserMask.color)) {
            gradientDrawableM124978h.setColor(Color.parseColor(bLiveUserMask.color));
        }
        simpleDraweeView.setBackground(gradientDrawableM124978h);
    }
}
