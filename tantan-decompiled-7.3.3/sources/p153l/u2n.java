package p153l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.admob.C4866a;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class u2n {

    /* JADX INFO: renamed from: b */
    public static float f177227b = 0.0f;

    /* JADX INFO: renamed from: c */
    public static boolean f177228c = false;

    /* JADX INFO: renamed from: d */
    public static u2n f177229d;

    /* JADX INFO: renamed from: a */
    public o2n f177230a = new o2n();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ bkj0 m194278d(String str, int i, boolean z, Bitmap bitmap) {
        int iM176330g = qf60.m176324b(bitmap).m176339a().m176330g(Color.parseColor(str));
        return new bkj0(t43.m189144b(m194284k(bitmap, 0.25f, 0.25f), i, z), Integer.valueOf(gf5.m130052o(iM176330g, 0)), Integer.valueOf(iM176330g));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m194280f(int i) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (userM116600p9 == null || TEnum.equals(userM116600p9.gender, "female") || userM116600p9.isVIP() || !rbb0.m180744q()) {
            return false;
        }
        return tzi0.m193670h(pzi0.m174454o(), (long) userM116600p9.createdTime, i);
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m194281g(boolean z) {
        return m194282h(z, false);
    }

    /* JADX INFO: renamed from: h */
    public static List<String> m194282h(boolean z, boolean z2) {
        String str;
        ArrayList arrayList = new ArrayList();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            str = "&lookForGender=" + userM116600p9.settings.getLookingFor();
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder("https://intlaffiliate.tantanapp.com/crawler?language=");
        sb.append(q8g0.m175820y());
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
    public static GradientDrawable m194283i(int[] iArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m194284k(Bitmap bitmap, float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.postScale(f, f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: l */
    public static u2n m194285l() {
        if (f177229d == null) {
            f177229d = new u2n();
        }
        return f177229d;
    }

    /* JADX INFO: renamed from: m */
    public static void m194286m() {
        List<CoreSuggested.UserInfo> list = CoreModule.f18264c.f20405m0.f20136a0.m222761e().loaded;
        if (!jyb.m147479J(list) && list.size() > 5) {
            CoreModule.f18264c.f20405m0.f20153f2.m137019l(Boolean.TRUE);
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f20214id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.virtualCardType = VirtualCardType.NativeAdViewCard;
            list.add(3, userInfo);
        }
        CoreModule.f18264c.f20405m0.f20136a0.m222761e().setRefreshValue(true);
        C22507a<PartialListOpt<CoreSuggested.UserInfo>> c22507a = CoreModule.f18264c.f20405m0.f20136a0;
        c22507a.m137019l(c22507a.m222761e().setReasonStr("加载广告卡"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m194287n() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return (userM116600p9 == null || TEnum.equals(userM116600p9.gender, "female") || userM116600p9.isVIP() || !rbb0.m180744q() || !d79.f85488u || IntlCountryCodeController.m29114k()) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m194288o() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return (userM116600p9 == null || TEnum.equals(userM116600p9.gender, "female") || userM116600p9.isVIP() || !rbb0.m180744q() || !d79.f85486s || IntlCountryCodeController.m29114k()) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public static void m194289p(Act act) {
        C4866a.m31006k(act);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m194290q() {
        if (d79.m114686k()) {
            return m194280f(2);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static C22421c<bkj0<Bitmap, Integer, Integer>> m194291r(final Drawable drawable, final int i, final boolean z, final String str) {
        return C22421c.fromCallable(new Callable() { // from class: l.p2n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return vnb.m201951k1(drawable);
            }
        }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.q2n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return u2n.m194278d(str, i, z, (Bitmap) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: s */
    public static C22421c<Bitmap> m194292s(final Drawable drawable, final int i, final boolean z) {
        return C22421c.fromCallable(new Callable() { // from class: l.r2n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return vnb.m201951k1(drawable);
            }
        }).map(new qcj() { // from class: l.s2n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return u2n.m194284k((Bitmap) obj, 0.25f, 0.25f);
            }
        }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.t2n
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return t43.m189144b((Bitmap) obj, i, z);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: t */
    public static boolean m194293t() {
        if (d79.m114688l()) {
            return m194280f(2);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public o2n m194294j(int i) {
        return this.f177230a.m165739g(i);
    }
}
