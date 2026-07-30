package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.newui.home.marrymode.MarryModeTabFrag;
import com.p051p1.mobile.putong.core.newui.home.themeslide.HomeThemeSlideFrag;
import com.p051p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksTabFrag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes11.dex */
public class jj40 {

    /* JADX INFO: renamed from: a */
    public static NewTanFragTag f121138a = NewTanFragTag.HOME;

    /* JADX INFO: renamed from: b */
    public static int f121139b = 0;

    /* JADX INFO: renamed from: c */
    public static C22507a<NewTanFragTag> f121140c = C22507a.m222758b();

    /* JADX INFO: renamed from: d */
    public static C22507a<Integer> f121141d = C22507a.m222758b();

    /* JADX INFO: renamed from: e */
    public static List<ij40> f121142e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static Set<NewTanFragTag> f121143f = new HashSet();

    /* JADX INFO: renamed from: l.jj40$a */
    public static /* synthetic */ class C17960a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f121144a;

        static {
            int[] iArr = new int[NewTanFragTag.values().length];
            f121144a = iArr;
            try {
                iArr[NewTanFragTag.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f121144a[NewTanFragTag.ALREADY_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f121144a[NewTanFragTag.MOMENT_THEME_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f121144a[NewTanFragTag.TOP_PICKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f121144a[NewTanFragTag.WEBVIEW_CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f121144a[NewTanFragTag.MARRY_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f121144a[NewTanFragTag.SUPREME_PARTNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f121144a[NewTanFragTag.YOUTH_VIP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f121144a[NewTanFragTag.PRIVATE_CUSTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m144998a(NewTanFragTag newTanFragTag) {
        if (newTanFragTag == null) {
            return false;
        }
        return TextUtils.equals(f121138a.getTag(), newTanFragTag.getTag());
    }

    /* JADX INFO: renamed from: b */
    public static ij40 m144999b(NewTanFragTag newTanFragTag) {
        for (int i = 0; i < f121142e.size(); i++) {
            ij40 ij40Var = f121142e.get(i);
            if (ij40Var.f115172a.getTag().equals(newTanFragTag.getTag())) {
                return ij40Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m145000c() {
        return f121139b;
    }

    /* JADX INFO: renamed from: d */
    public static List<ij40> m145001d() {
        f121142e.clear();
        if (gra.m131676e2() && CoreModule.f18264c.f20381e0.m116541a8()) {
            f121142e.add(ij40.m140180a().m140182b(NewTanFragTag.MARRY_MODE).m140183c("理想伴侣").m140181a());
            return f121142e;
        }
        f121142e.add(ij40.m140180a().m140182b(NewTanFragTag.HOME).m140184d(c9c0.f80342I).m140185e(c9c0.f80333F).m140183c(CoreModule.f18263b.getResources().getString(R$string.f18394Df)).m140181a());
        if (gra.m131654Z2()) {
            if (spl0.m187350B()) {
                f121142e.add(ij40.m140180a().m140182b(NewTanFragTag.YOUTH_VIP).m140183c("青春").m140181a());
            } else {
                spl0.m187349A();
            }
            return f121142e;
        }
        if (s7a.m184997z()) {
            f121142e.add(ij40.m140180a().m140182b(NewTanFragTag.YOUTH_VIP).m140183c("青春专区").m140181a());
            return f121142e;
        }
        if (gra.m131578I0().enabled || nh00.m163018b().m163022f()) {
            f121142e.add(ij40.m140180a().m140182b(NewTanFragTag.MOMENT_THEME_CARD).m140183c(nh00.m163018b().m163022f() ? nh00.m163018b().m163020d() : gra.m131578I0().tabTitle).m140181a());
        }
        if (r5j0.INSTANCE.m179869f()) {
            f121142e.add(ij40.m140180a().m140182b(NewTanFragTag.TOP_PICKS).m140183c("TOP PICKS").m140181a());
        }
        if (gra.m131689h0().enable && !TextUtils.isEmpty(gra.m131689h0().title)) {
            f121142e.add(ij40.m140180a().m140182b(NewTanFragTag.WEBVIEW_CONFIG).m140183c(gra.m131689h0().title).m140181a());
        }
        if (gra.m131586J3()) {
            f121142e.add(ij40.m140180a().m140182b(NewTanFragTag.ALREADY_AUTH).m140183c("已认证").m140181a());
        }
        return f121142e;
    }

    /* JADX INFO: renamed from: e */
    public static NewTanFragTag m145002e() {
        return f121138a;
    }

    /* JADX INFO: renamed from: f */
    public static int m145003f() {
        return f121142e.size();
    }

    /* JADX INFO: renamed from: g */
    public static Frag m145004g(NewTanFragTag newTanFragTag, Bundle bundle) {
        switch (C17960a.f121144a[newTanFragTag.ordinal()]) {
            case 1:
            case 2:
                return new NewNewHomeFrag();
            case 3:
                return new HomeThemeSlideFrag();
            case 4:
                return new TopPicksTabFrag();
            case 5:
                return new TopItemWebFrag();
            case 6:
                return new MarryModeTabFrag();
            case 7:
                return CoreModule.m30933P().m143408e().mo35987lg();
            case 8:
                return CoreModule.m30933P().m143408e().mo35971Hn();
            case 9:
                return CoreModule.m30933P().m143408e().mo35974Pp();
            default:
                wtq0.m207906a("should add your own Frag");
                return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m145005h(int i) {
        if (f121139b != i && i != 0) {
            f121141d.m137019l(Integer.valueOf(i));
        }
        f121139b = i;
    }

    /* JADX INFO: renamed from: i */
    public static void m145006i(NewTanFragTag newTanFragTag) {
        f121138a = newTanFragTag;
        f121140c.m137019l(newTanFragTag);
    }
}
