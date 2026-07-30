package p149l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.admob.C4715a;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class u0n {

    /* JADX INFO: renamed from: b */
    public static float f172926b = 0.0f;

    /* JADX INFO: renamed from: c */
    public static boolean f172927c = false;

    /* JADX INFO: renamed from: d */
    public static u0n f172928d;

    /* JADX INFO: renamed from: a */
    public o0n f172929a = new o0n();

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ xaj0 m191346d(String str, int i, boolean z, Bitmap bitmap) {
        int iM144655g = k760.m144649b(bitmap).m144664a().m144655g(Color.parseColor(str));
        return new xaj0(d43.m109970b(m191352k(bitmap, 0.25f, 0.25f), i, z), Integer.valueOf(ge5.m125678o(iM144655g, 0)), Integer.valueOf(iM144655g));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m191348f(int i) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (userM169527p9 == null || TEnum.equals(userM169527p9.gender, "female") || userM169527p9.isVIP() || !n3b0.m157742q()) {
            return false;
        }
        return qqi0.m175940h(mqi0.m155944o(), (long) userM169527p9.createdTime, i);
    }

    /* JADX INFO: renamed from: g */
    public static List<String> m191349g(boolean z) {
        return m191350h(z, false);
    }

    /* JADX INFO: renamed from: h */
    public static List<String> m191350h(boolean z, boolean z2) {
        String str;
        ArrayList arrayList = new ArrayList();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            str = "&lookForGender=" + userM169527p9.settings.getLookingFor();
        } else {
            str = "";
        }
        StringBuilder sb = new StringBuilder("https://intlaffiliate.tantanapp.com/crawler?language=");
        sb.append(i0g0.m133885y());
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
    public static GradientDrawable m191351i(int[] iArr) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColors(iArr);
        gradientDrawable.setGradientType(0);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m191352k(Bitmap bitmap, float f, float f2) {
        Matrix matrix = new Matrix();
        matrix.postScale(f, f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmap.recycle();
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: l */
    public static u0n m191353l() {
        if (f172928d == null) {
            f172928d = new u0n();
        }
        return f172928d;
    }

    /* JADX INFO: renamed from: m */
    public static void m191354m() {
        List<CoreSuggested.UserInfo> list = CoreModule.f17545c.f19663m0.f19394a0.m221515e().loaded;
        if (!vwb.m200296J(list) && list.size() > 5) {
            CoreModule.f17545c.f19663m0.f19411f2.m132487l(Boolean.TRUE);
            CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
            userInfo.f19472id = CoreSuggested.UserInfo.VIRTUAL_CARD;
            userInfo.virtualCardType = VirtualCardType.NativeAdViewCard;
            list.add(3, userInfo);
        }
        CoreModule.f17545c.f19663m0.f19394a0.m221515e().setRefreshValue(true);
        C22392a<PartialListOpt<CoreSuggested.UserInfo>> c22392a = CoreModule.f17545c.f19663m0.f19394a0;
        c22392a.m132487l(c22392a.m221515e().setReasonStr("加载广告卡"));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m191355n() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return (userM169527p9 == null || TEnum.equals(userM169527p9.gender, "female") || userM169527p9.isVIP() || !n3b0.m157742q() || !u59.f174681u || IntlCountryCodeController.m28115k()) ? false : true;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m191356o() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return (userM169527p9 == null || TEnum.equals(userM169527p9.gender, "female") || userM169527p9.isVIP() || !n3b0.m157742q() || !u59.f174679s || IntlCountryCodeController.m28115k()) ? false : true;
    }

    /* JADX INFO: renamed from: p */
    public static void m191357p(Act act) {
        C4715a.m30008k(act);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m191358q() {
        if (u59.m191836k()) {
            return m191348f(2);
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static C22306c<xaj0<Bitmap, Integer, Integer>> m191359r(final Drawable drawable, final int i, final boolean z, final String str) {
        return C22306c.fromCallable(new Callable() { // from class: l.p0n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hmb.m131706k1(drawable);
            }
        }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.q0n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return u0n.m191346d(str, i, z, (Bitmap) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: s */
    public static C22306c<Bitmap> m191360s(final Drawable drawable, final int i, final boolean z) {
        return C22306c.fromCallable(new Callable() { // from class: l.r0n
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return hmb.m131706k1(drawable);
            }
        }).map(new w9j() { // from class: l.s0n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return u0n.m191352k((Bitmap) obj, 0.25f, 0.25f);
            }
        }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.t0n
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return d43.m109970b((Bitmap) obj, i, z);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: t */
    public static boolean m191361t() {
        if (u59.m191838l()) {
            return m191348f(2);
        }
        return false;
    }

    /* JADX INFO: renamed from: j */
    public o0n m191362j(int i) {
        return this.f172929a.m162161g(i);
    }
}
