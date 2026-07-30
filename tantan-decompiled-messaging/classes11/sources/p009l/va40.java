package p009l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.core.newui.home.marrymode.MarryModeTabFrag;
import com.p000p1.mobile.putong.core.newui.home.themeslide.HomeThemeSlideFrag;
import com.p000p1.mobile.putong.core.newui.home.topitemweb.TopItemWebFrag;
import com.p000p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.ui.toppicks.TopPicksTabFrag;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.e900;
import l.g6a;
import l.nwi0;
import l.ogl0;
import l.qkq0;
import l.upa;
import l.w0c0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class va40 {

    /* JADX INFO: renamed from: a */
    public static NewTanFragTag f21500a = NewTanFragTag.HOME;

    /* JADX INFO: renamed from: b */
    public static int f21501b = 0;

    /* JADX INFO: renamed from: c */
    public static a<NewTanFragTag> f21502c = a.b();

    /* JADX INFO: renamed from: d */
    public static a<Integer> f21503d = a.b();

    /* JADX INFO: renamed from: e */
    public static List<ua40> f21504e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public static Set<NewTanFragTag> f21505f = new HashSet();

    /* JADX INFO: renamed from: l.va40$a */
    public static /* synthetic */ class C1229a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f21506a;

        static {
            int[] iArr = new int[NewTanFragTag.values().length];
            f21506a = iArr;
            try {
                iArr[NewTanFragTag.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21506a[NewTanFragTag.ALREADY_AUTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21506a[NewTanFragTag.MOMENT_THEME_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21506a[NewTanFragTag.TOP_PICKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21506a[NewTanFragTag.WEBVIEW_CONFIG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21506a[NewTanFragTag.MARRY_MODE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21506a[NewTanFragTag.SUPREME_PARTNER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21506a[NewTanFragTag.YOUTH_VIP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21506a[NewTanFragTag.PRIVATE_CUSTOM.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m23330a(NewTanFragTag newTanFragTag) {
        if (newTanFragTag == null) {
            return false;
        }
        return TextUtils.equals(f21500a.getTag(), newTanFragTag.getTag());
    }

    /* JADX INFO: renamed from: b */
    public static ua40 m23331b(NewTanFragTag newTanFragTag) {
        for (int i = 0; i < f21504e.size(); i++) {
            ua40 ua40Var = f21504e.get(i);
            if (ua40Var.f21026a.getTag().equals(newTanFragTag.getTag())) {
                return ua40Var;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m23332c() {
        return f21501b;
    }

    /* JADX INFO: renamed from: d */
    public static List<ua40> m23333d() {
        f21504e.clear();
        if (upa.e2() && CoreModule.c.e0.a8()) {
            f21504e.add(ua40.m22762a().m22764b(NewTanFragTag.MARRY_MODE).m22765c("理想伴侣").m22763a());
            return f21504e;
        }
        f21504e.add(ua40.m22762a().m22764b(NewTanFragTag.HOME).m22766d(w0c0.I).m22767e(w0c0.F).m22765c(CoreModule.b.getResources().getString(R.string.lf)).m22763a());
        if (upa.Z2()) {
            if (ogl0.B()) {
                f21504e.add(ua40.m22762a().m22764b(NewTanFragTag.YOUTH_VIP).m22765c("青春").m22763a());
            } else {
                ogl0.A();
            }
            return f21504e;
        }
        if (g6a.z()) {
            f21504e.add(ua40.m22762a().m22764b(NewTanFragTag.YOUTH_VIP).m22765c("青春专区").m22763a());
            return f21504e;
        }
        if (upa.I0().enabled || e900.b().f()) {
            f21504e.add(ua40.m22762a().m22764b(NewTanFragTag.MOMENT_THEME_CARD).m22765c(e900.b().f() ? e900.b().d() : upa.I0().tabTitle).m22763a());
        }
        if (nwi0.INSTANCE.f()) {
            f21504e.add(ua40.m22762a().m22764b(NewTanFragTag.TOP_PICKS).m22765c("TOP PICKS").m22763a());
        }
        if (upa.h0().enable && !TextUtils.isEmpty(upa.h0().title)) {
            f21504e.add(ua40.m22762a().m22764b(NewTanFragTag.WEBVIEW_CONFIG).m22765c(upa.h0().title).m22763a());
        }
        if (upa.J3()) {
            f21504e.add(ua40.m22762a().m22764b(NewTanFragTag.ALREADY_AUTH).m22765c("已认证").m22763a());
        }
        return f21504e;
    }

    /* JADX INFO: renamed from: e */
    public static NewTanFragTag m23334e() {
        return f21500a;
    }

    /* JADX INFO: renamed from: f */
    public static int m23335f() {
        return f21504e.size();
    }

    /* JADX INFO: renamed from: g */
    public static Frag m23336g(NewTanFragTag newTanFragTag, Bundle bundle) {
        switch (C1229a.f21506a[newTanFragTag.ordinal()]) {
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
                return CoreModule.P().e().lg();
            case 8:
                return CoreModule.P().e().Hn();
            case MediaPickerParamsObject.FROM_JS_BRIDGE_SWIPE_CARD /* 9 */:
                return CoreModule.P().e().Pp();
            default:
                qkq0.a("should add your own Frag");
                return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m23337h(int i) {
        if (f21501b != i && i != 0) {
            f21503d.onNext(Integer.valueOf(i));
        }
        f21501b = i;
    }

    /* JADX INFO: renamed from: i */
    public static void m23338i(NewTanFragTag newTanFragTag) {
        f21500a = newTanFragTag;
        f21502c.onNext(newTanFragTag);
    }
}
