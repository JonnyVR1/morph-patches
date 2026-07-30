package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.p051p1.mobile.putong.live.livingroom.intl.game.api.IntlGameApiProvider;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.CommonH5Builder;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class zqo extends o2e0<zit> {
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m221018c(gae0 gae0Var, String str) {
        gae0Var.m213811F2().OpenH5Event.open().mo199273j(m221019d(str));
        gae0Var.m213811F2().GiftWallDialogEvent.closeLocalGiftWallDialog().m199277p();
    }

    /* JADX INFO: renamed from: d */
    public static px50 m221019d(String str) {
        Uri uri = Uri.parse(str);
        String strM221021f = m221021f(uri, "gravity", "0");
        String strM221021f2 = m221021f(uri, "needCloseBtn", "1");
        String strM221021f3 = m221021f(uri, "transparent", "0");
        int iM221020e = m221020e(uri, "cornerRadius", Constants.VIA_REPORT_TYPE_CHAT_AIO);
        List<Double> listM221022g = TextUtils.equals(strM221021f, "1") ? m221022g(uri, "1.0", "0.75") : m221022g(uri, "0.86", "0.75");
        px50.C19461a c19461aM174146t = px50.m174112c(200).m174141B(str).m174142p(TextUtils.equals(strM221021f3, "1") ? CommonH5Builder.BgType.TRAN_BG : CommonH5Builder.BgType.DEFAULT_BG).m174147u(aro.m99761a(str)).m174152z(listM221022g.get(0).doubleValue(), listM221022g.get(1).doubleValue()).m174145s(iM221020e).m174149w(m221021f(uri, "needFullScreenMarginTop", "0")).m174146t(TextUtils.equals(strM221021f, "1") ? 80 : 17);
        if (Integer.parseInt(strM221021f2) == 1) {
            c19461aM174146t.m174150x();
        }
        return c19461aM174146t.m174143q();
    }

    /* JADX INFO: renamed from: e */
    public static int m221020e(Uri uri, String str, String str2) {
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
    public static String m221021f(Uri uri, String str, String str2) {
        String queryParameter = uri.getQueryParameter(str);
        return queryParameter == null ? str2 : queryParameter;
    }

    /* JADX INFO: renamed from: g */
    public static List<Double> m221022g(Uri uri, String str, String str2) {
        String strM221021f = m221021f(uri, "widthRatio", str);
        String strM221021f2 = m221021f(uri, "heightRatio", str2);
        ArrayList arrayList = new ArrayList();
        arrayList.add(Double.valueOf(Double.parseDouble(strM221021f)));
        arrayList.add(Double.valueOf(Double.parseDouble(strM221021f2)));
        return arrayList;
    }

    @Override // p153l.o2e0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void mo97254a(zit zitVar, final gae0 gae0Var, bae0.C15954b c15954b) {
        String strM219937g = zitVar.m219937g("h5Url");
        if (TextUtils.isEmpty(strM219937g) || gae0Var == null) {
            return;
        }
        gae0Var.duringCreated(IntlGameApiProvider.getRealOctopusGameUrl(strM219937g)).filter(new qcj() { // from class: l.xqo
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.yqo
            @Override // p153l.y20
            public final void call(Object obj) {
                zqo.m221018c(gae0Var, (String) obj);
            }
        }, new r5k()));
    }
}
