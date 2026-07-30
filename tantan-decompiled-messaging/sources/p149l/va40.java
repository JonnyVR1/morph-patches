package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.newui.home.marrymode.MarryModeTabFrag;
import com.p046p1.mobile.putong.core.newui.home.themeslide.HomeThemeSlideFrag;
import com.p046p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag;
import com.p046p1.mobile.putong.core.p053ui.toppicks.TopPicksTabFrag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes11.dex */
public class va40 {

    /* JADX INFO: renamed from: a */
    public static NewTanFragTag f180701a = NewTanFragTag.HOME;

    /* JADX INFO: renamed from: b */
    public static int f180702b = 0;

    /* JADX INFO: renamed from: c */
    public static C22392a<NewTanFragTag> f180703c = C22392a.m221512b();

    /* JADX INFO: renamed from: d */
    public static C22392a<Integer> f180704d = C22392a.m221512b();

    /* JADX INFO: renamed from: e */
    public static List<ua40> f180705e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static Set<NewTanFragTag> f180706f = new HashSet();

    /* JADX INFO: renamed from: l.va40$a */
    public static /* synthetic */ class C20604a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f180707a;

        static {
            int[] iArr = new int[NewTanFragTag.values().length];
            f180707a = iArr;
            try {
                iArr[NewTanFragTag.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f180707a[NewTanFragTag.ALREADY_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f180707a[NewTanFragTag.MOMENT_THEME_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f180707a[NewTanFragTag.TOP_PICKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f180707a[NewTanFragTag.WEBVIEW_CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f180707a[NewTanFragTag.MARRY_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f180707a[NewTanFragTag.SUPREME_PARTNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f180707a[NewTanFragTag.YOUTH_VIP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f180707a[NewTanFragTag.PRIVATE_CUSTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m197619a(NewTanFragTag newTanFragTag) {
        if (newTanFragTag == null) {
            return false;
        }
        return TextUtils.equals(f180701a.getTag(), newTanFragTag.getTag());
    }

    /* JADX INFO: renamed from: b */
    public static ua40 m197620b(NewTanFragTag newTanFragTag) {
        for (int i = 0; i < f180705e.size(); i++) {
            ua40 ua40Var = f180705e.get(i);
            if (ua40Var.f175550a.getTag().equals(newTanFragTag.getTag())) {
                return ua40Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m197621c() {
        return f180702b;
    }

    /* JADX INFO: renamed from: d */
    public static List<ua40> m197622d() {
        f180705e.clear();
        if (upa.m194745e2() && CoreModule.f17545c.f19639e0.m169468a8()) {
            f180705e.add(ua40.m192726a().m192728b(NewTanFragTag.MARRY_MODE).m192729c("理想伴侣").m192727a());
            return f180705e;
        }
        f180705e.add(ua40.m192726a().m192728b(NewTanFragTag.HOME).m192730d(w0c0.f183773I).m192731e(w0c0.f183764F).m192729c(CoreModule.f17544b.getResources().getString(R$string.f18700lf)).m192727a());
        if (upa.m194723Z2()) {
            if (ogl0.m164223B()) {
                f180705e.add(ua40.m192726a().m192728b(NewTanFragTag.YOUTH_VIP).m192729c("青春").m192727a());
            } else {
                ogl0.m164222A();
            }
            return f180705e;
        }
        if (g6a.m124577z()) {
            f180705e.add(ua40.m192726a().m192728b(NewTanFragTag.YOUTH_VIP).m192729c("青春专区").m192727a());
            return f180705e;
        }
        if (upa.m194647I0().enabled || e900.m115330b().m115334f()) {
            f180705e.add(ua40.m192726a().m192728b(NewTanFragTag.MOMENT_THEME_CARD).m192729c(e900.m115330b().m115334f() ? e900.m115330b().m115332d() : upa.m194647I0().tabTitle).m192727a());
        }
        if (nwi0.INSTANCE.m161873f()) {
            f180705e.add(ua40.m192726a().m192728b(NewTanFragTag.TOP_PICKS).m192729c("TOP PICKS").m192727a());
        }
        if (upa.m194758h0().enable && !TextUtils.isEmpty(upa.m194758h0().title)) {
            f180705e.add(ua40.m192726a().m192728b(NewTanFragTag.WEBVIEW_CONFIG).m192729c(upa.m194758h0().title).m192727a());
        }
        if (upa.m194655J3()) {
            f180705e.add(ua40.m192726a().m192728b(NewTanFragTag.ALREADY_AUTH).m192729c("已认证").m192727a());
        }
        return f180705e;
    }

    /* JADX INFO: renamed from: e */
    public static NewTanFragTag m197623e() {
        return f180701a;
    }

    /* JADX INFO: renamed from: f */
    public static int m197624f() {
        return f180705e.size();
    }

    /* JADX INFO: renamed from: g */
    public static Frag m197625g(NewTanFragTag newTanFragTag, Bundle bundle) {
        switch (C20604a.f180707a[newTanFragTag.ordinal()]) {
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
                return CoreModule.m29935P().m94654e().mo34984lg();
            case 8:
                return CoreModule.m29935P().m94654e().mo34968Hn();
            case 9:
                return CoreModule.m29935P().m94654e().mo34971Pp();
            default:
                qkq0.m175383a("should add your own Frag");
                return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m197626h(int i) {
        if (f180702b != i && i != 0) {
            f180704d.m132487l(Integer.valueOf(i));
        }
        f180702b = i;
    }

    /* JADX INFO: renamed from: i */
    public static void m197627i(NewTanFragTag newTanFragTag) {
        f180701a = newTanFragTag;
        f180703c.m132487l(newTanFragTag);
    }
}
