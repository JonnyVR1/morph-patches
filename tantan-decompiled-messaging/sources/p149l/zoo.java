package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.livingroom.intl.game.api.IntlGameApiProvider;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.CommonH5Builder;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zoo extends kud0<ygt> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m219572c(c2e0 c2e0Var, String str) {
        c2e0Var.m206028F2().OpenH5Event.open().mo172463j(m219573d(str));
        c2e0Var.m206028F2().GiftWallDialogEvent.closeLocalGiftWallDialog().m172467p();
    }

    /* JADX INFO: renamed from: d */
    public static jp50 m219573d(String str) {
        Uri uri = Uri.parse(str);
        String strM219575f = m219575f(uri, "gravity", "0");
        String strM219575f2 = m219575f(uri, "needCloseBtn", "1");
        String strM219575f3 = m219575f(uri, "transparent", "0");
        int iM219574e = m219574e(uri, "cornerRadius", Constants.VIA_REPORT_TYPE_CHAT_AIO);
        List<Double> listM219576g = TextUtils.equals(strM219575f, "1") ? m219576g(uri, "1.0", "0.75") : m219576g(uri, "0.86", "0.75");
        jp50.C17834a c17834aM142603t = jp50.m142568c(200).m142598B(str).m142599p(TextUtils.equals(strM219575f3, "1") ? CommonH5Builder.BgType.TRAN_BG : CommonH5Builder.BgType.DEFAULT_BG).m142604u(apo.m98164a(str)).m142609z(listM219576g.get(0).doubleValue(), listM219576g.get(1).doubleValue()).m142602s(iM219574e).m142606w(m219575f(uri, "needFullScreenMarginTop", "0")).m142603t(TextUtils.equals(strM219575f, "1") ? 80 : 17);
        if (Integer.parseInt(strM219575f2) == 1) {
            c17834aM142603t.m142607x();
        }
        return c17834aM142603t.m142600q();
    }

    /* JADX INFO: renamed from: e */
    public static int m219574e(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        if (queryParameter != null) {
            str2 = queryParameter;
        }
        try {
            return Integer.parseInt(str2);
        } catch (NumberFormatException unused) {
            return Integer.parseInt(Constants.VIA_REPORT_TYPE_CHAT_AIO);
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m219575f(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: g */
    public static List<Double> m219576g(Uri uri, String str, String str2) {
        String strM219575f = m219575f(uri, "widthRatio", str);
        String strM219575f2 = m219575f(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM219575f)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM219575f2)));
        return arrayList;
    }

    @Override // p149l.kud0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo95830a(ygt ygtVar, final c2e0 c2e0Var, x1e0.C21019b c21019b) {
        String strM214763g = ygtVar.m214763g("h5Url");
        if (TextUtils.isEmpty(strM214763g) || c2e0Var == null) {
            return;
        }
        c2e0Var.duringCreated(IntlGameApiProvider.getRealOctopusGameUrl(strM214763g)).filter(new w9j() { // from class: l.xoo
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.yoo
            @Override // p149l.e30
            public final void call(Object obj) {
                zoo.m219572c(c2e0Var, (String) obj);
            }
        }, new z2k()));
    }
}
