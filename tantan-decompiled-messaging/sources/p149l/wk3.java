package p149l;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;

/* JADX INFO: loaded from: classes13.dex */
public class wk3 {

    /* JADX INFO: renamed from: a */
    public static int f186721a = t100.m186890d(2.0f);

    /* JADX INFO: renamed from: b */
    public static String f186722b = "#639BFF";

    /* JADX INFO: renamed from: c */
    public static String f186723c = "#FF84BA";

    /* JADX INFO: renamed from: a */
    public static void m203642a(SimpleDraweeView simpleDraweeView, BLiveUserMask bLiveUserMask, int i, boolean z) {
        if (bLiveUserMask == null) {
            return;
        }
        bLiveUserMask.toString();
        m203646e(simpleDraweeView, bLiveUserMask, z);
        if (!TextUtils.isEmpty(bLiveUserMask.avatar) || i == 0) {
            hxs.m133402o("context_single_room", simpleDraweeView, bLiveUserMask.avatar);
        } else {
            simpleDraweeView.setImageResource(i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m203643b(SimpleDraweeView simpleDraweeView, BLiveUserMask bLiveUserMask, boolean z) {
        m203642a(simpleDraweeView, bLiveUserMask, g3c0.f100398T, z);
    }

    /* JADX INFO: renamed from: c */
    public static <T> void m203644c(SimpleDraweeView simpleDraweeView, mqv<T> mqvVar, w9j<T, String> w9jVar) {
        m203645d(simpleDraweeView, mqvVar, false, w9jVar);
    }

    /* JADX INFO: renamed from: d */
    public static <T> void m203645d(SimpleDraweeView simpleDraweeView, mqv<T> mqvVar, boolean z, w9j<T, String> w9jVar) {
        if (mqvVar == null) {
            simpleDraweeView.setImageResource(g3c0.f100398T);
            return;
        }
        simpleDraweeView.setBackground(null);
        if (hxn0.m133350c(mqvVar).m133354e()) {
            m203643b(simpleDraweeView, hxn0.m133350c(mqvVar).f109896b, z);
        } else {
            hxs.m133408u("context_single_room", simpleDraweeView, w9jVar.call(mqvVar.f135304a), t100.m186890d(40.0f), t100.m186890d(40.0f));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m203646e(SimpleDraweeView simpleDraweeView, BLiveUserMask bLiveUserMask, boolean z) {
        m203647f(simpleDraweeView, bLiveUserMask, z, false, false);
    }

    /* JADX INFO: renamed from: f */
    public static void m203647f(SimpleDraweeView simpleDraweeView, BLiveUserMask bLiveUserMask, boolean z, boolean z2, boolean z3) {
        if (bLiveUserMask == null) {
            return;
        }
        djj djjVar = (djj) simpleDraweeView.getHierarchy();
        RoundingParams roundingParamsM112069p = djjVar.m112069p();
        if (roundingParamsM112069p == null && !z2) {
            roundingParamsM112069p = RoundingParams.m8247a();
            djjVar.m112053H(roundingParamsM112069p);
        }
        if (!z3) {
            djjVar.m112049D(g3c0.f100398T);
        }
        GradientDrawable gradientDrawableM213883h = yb2.m213883h(0);
        if (z) {
            int color = Color.parseColor(bLiveUserMask.isFemale() ? f186723c : f186722b);
            roundingParamsM112069p.m8267u(f186721a);
            gradientDrawableM213883h.setStroke(f186721a, color);
        }
        if (!TextUtils.isEmpty(bLiveUserMask.color)) {
            gradientDrawableM213883h.setColor(Color.parseColor(bLiveUserMask.color));
        }
        simpleDraweeView.setBackground(gradientDrawableM213883h);
    }
}
