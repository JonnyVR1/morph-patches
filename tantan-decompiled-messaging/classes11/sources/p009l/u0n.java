package p009l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import l.d43;
import l.ge5;
import l.hmb;
import l.jo0;
import l.k760;
import l.n3b0;
import l.o0n;
import l.qqi0;
import l.u59;
import l.vwb;
import l.w9j;
import l.xaj0;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class u0n {

    /* JADX INFO: renamed from: b */
    public static float f20953b = 0.0f;

    /* JADX INFO: renamed from: c */
    public static boolean f20954c = false;

    /* JADX INFO: renamed from: d */
    public static u0n f20955d;

    /* JADX INFO: renamed from: a */
    public o0n f20956a = new o0n();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ xaj0 m22719d(String str, int i, boolean z, Bitmap bitmap) {
        int iG = k760.b(bitmap).a().g(Color.parseColor(str));
        return new xaj0(d43.b(m22725k(bitmap, 0.25f, 0.25f), i, z), Integer.valueOf(ge5.o(iG, 0)), Integer.valueOf(iG));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m22721f(int i) {
        User userP9 = CoreModule.c.e0.p9();
        if (userP9 == null || TEnum.equals(userP9.gender, "female") || userP9.isVIP() || !n3b0.q()) {
            return false;
        }
        return qqi0.h(mqi0.m18550o(), (long) userP9.createdTime, i);
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m22722g(boolean z) {
        return m22723h(z, false);
    }

    /* JADX INFO: renamed from: h */
    public static List<String> m22723h(boolean z, boolean z2) {
        String str;
        ArrayList arrayList = new ArrayList();
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            str = "&lookForGender=" + userP9.settings.getLookingFor();
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder("https://intlaffiliate.tantanapp.com/crawler?language=");
        sb.append(i0g0.m16153y());
        sb.append(str);
        sb.append(z ? "&imgBlur=true" : "");
        String string = sb.toString();
        arrayList.add(string.concat("&index=preContentUrl"));
        arrayList.add(string.concat("&index=nextContentUrl"));
        if (z2) {
            arrayList.add(string.concat("&scene=live"));
        }
        arrayList.toString();
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public static GradientDrawable m22724i(int[] iArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m22725k(Bitmap bitmap, float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.postScale(f, f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: l */
    public static u0n m22726l() {
        if (f20955d == null) {
            f20955d = new u0n();
        }
        return f20955d;
    }

    /* JADX INFO: renamed from: m */
    public static void m22727m() {
        List list = ((PartialListOpt) CoreModule.c.m0.a0.e()).loaded;
        if (!vwb.J(list) && list.size() > 5) {
            CoreModule.c.m0.f2.onNext(Boolean.TRUE);
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.id = "VirtualCard";
            userInfo.virtualCardType = VirtualCardType.NativeAdViewCard;
            list.add(3, userInfo);
        }
        ((PartialListOpt) CoreModule.c.m0.a0.e()).setRefreshValue(true);
        a aVar = CoreModule.c.m0.a0;
        aVar.onNext(((PartialListOpt) aVar.e()).setReasonStr("加载广告卡"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m22728n() {
        User userP9 = CoreModule.c.e0.p9();
        return (userP9 == null || TEnum.equals(userP9.gender, "female") || userP9.isVIP() || !n3b0.q() || !u59.u || IntlCountryCodeController.k()) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m22729o() {
        User userP9 = CoreModule.c.e0.p9();
        return (userP9 == null || TEnum.equals(userP9.gender, "female") || userP9.isVIP() || !n3b0.q() || !u59.s || IntlCountryCodeController.k()) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public static void m22730p(Act act) {
        com.p1.mobile.putong.core.admob.a.k(act);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m22731q() {
        if (u59.k()) {
            return m22721f(2);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static c<xaj0<Bitmap, Integer, Integer>> m22732r(final Drawable drawable, final int i, final boolean z, final String str) {
        return c.fromCallable(new Callable() { // from class: l.p0n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hmb.k1(drawable);
            }
        }).observeOn(Schedulers.io()).map(new w9j() { // from class: l.q0n
            public final Object call(Object obj) {
                return u0n.m22719d(str, i, z, (Bitmap) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: s */
    public static c<Bitmap> m22733s(final Drawable drawable, final int i, final boolean z) {
        return c.fromCallable(new Callable() { // from class: l.r0n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hmb.k1(drawable);
            }
        }).map(new w9j() { // from class: l.s0n
            public final Object call(Object obj) {
                return u0n.m22725k((Bitmap) obj, 0.25f, 0.25f);
            }
        }).observeOn(Schedulers.io()).map(new w9j() { // from class: l.t0n
            public final Object call(Object obj) {
                return d43.b((Bitmap) obj, i, z);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: t */
    public static boolean m22734t() {
        if (u59.l()) {
            return m22721f(2);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public o0n m22735j(int i) {
        return this.f20956a.g(i);
    }
}
