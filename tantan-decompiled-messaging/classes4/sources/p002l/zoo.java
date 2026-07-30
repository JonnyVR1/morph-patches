package p002l;

import android.net.Uri;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.intl.game.api.IntlGameApiProvider;
import com.p1.mobile.putong.ui.webview.mk.CommonH5Builder;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.ffw;
import l.w9j;
import l.ygt;
import l.z2k;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class zoo extends kud0<ygt> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m27443c(c2e0 c2e0Var, String str) {
        c2e0Var.m25548F2().OpenH5Event.open().j(m27444d(str));
        c2e0Var.m25548F2().GiftWallDialogEvent.closeLocalGiftWallDialog().p();
    }

    /* JADX INFO: renamed from: d */
    public static jp50 m27444d(String str) {
        Uri uri = Uri.parse(str);
        String strM27446f = m27446f(uri, "gravity", "0");
        String strM27446f2 = m27446f(uri, "needCloseBtn", "1");
        String strM27446f3 = m27446f(uri, "transparent", "0");
        int iM27445e = m27445e(uri, "cornerRadius", "24");
        List<Double> listM27447g = TextUtils.equals(strM27446f, "1") ? m27447g(uri, "1.0", "0.75") : m27447g(uri, "0.86", "0.75");
        jp50.C0638a c0638aM16099t = jp50.m16064c(200).m16094B(str).m16095p(TextUtils.equals(strM27446f3, "1") ? CommonH5Builder.BgType.TRAN_BG : CommonH5Builder.BgType.DEFAULT_BG).m16100u(apo.m9994a(str)).m16105z(listM27447g.get(0).doubleValue(), listM27447g.get(1).doubleValue()).m16098s(iM27445e).m16102w(m27446f(uri, "needFullScreenMarginTop", "0")).m16099t(TextUtils.equals(strM27446f, "1") ? 80 : 17);
        if (Integer.parseInt(strM27446f2) == 1) {
            c0638aM16099t.m16103x();
        }
        return c0638aM16099t.m16096q();
    }

    /* JADX INFO: renamed from: e */
    public static int m27445e(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            str2 = queryParameter;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            return Integer.parseInt("24");
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m27446f(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: g */
    public static List<Double> m27447g(Uri uri, String str, String str2) {
        String strM27446f = m27446f(uri, "widthRatio", str);
        String strM27446f2 = m27446f(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM27446f)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM27446f2)));
        return arrayList;
    }

    @Override // p002l.kud0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo9496a(ygt ygtVar, final c2e0 c2e0Var, x1e0.C0892b c0892b) {
        String strG = ygtVar.g("h5Url");
        if (TextUtils.isEmpty(strG) || c2e0Var == null) {
            return;
        }
        c2e0Var.duringCreated(IntlGameApiProvider.getRealOctopusGameUrl(strG)).filter(new w9j() { // from class: l.xoo
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(ffw.e(new e30() { // from class: l.yoo
            public final void call(Object obj) {
                zoo.m27443c(c2e0Var, (String) obj);
            }
        }, new z2k()));
    }
}
