package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.web.WebViewX;
import com.p051p1.mobile.putong.data.OMSDialogInfo;
import com.p051p1.mobile.putong.data.OMSImageScaleType;
import com.p051p1.mobile.putong.data.OMSLocationType;
import com.p051p1.mobile.putong.data.OMSWebPerimeterType;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class el50 {

    /* JADX INFO: renamed from: l.el50$a */
    public class C16792a extends rx3 {
        final /* synthetic */ PutongAct val$act;
        final /* synthetic */ Dialog val$dialog;
        final /* synthetic */ OMSDialogInfo val$dialogInfo;
        final /* synthetic */ boolean val$needRecoding;
        final /* synthetic */ int val$width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C16792a(Context context, Dialog dialog, PutongAct putongAct, boolean z, OMSDialogInfo oMSDialogInfo, int i) {
            super(context);
            this.val$dialog = dialog;
            this.val$act = putongAct;
            this.val$needRecoding = z;
            this.val$dialogInfo = oMSDialogInfo;
            this.val$width = i;
        }

        @Override // p153l.rx3, com.p051p1.mobile.putong.app.web.WebViewClientX
        public void onPageFinishedX(WebViewX webViewX, String str) {
            super.onPageFinishedX(webViewX, str);
            if (this.val$dialog.isShowing() || this.val$act.isFinishing()) {
                return;
            }
            if (this.val$needRecoding) {
                rj50 rj50VarM172574f = pk50.m172568j().m172574f();
                OMSDialogInfo oMSDialogInfo = this.val$dialogInfo;
                rj50VarM172574f.m181664b0(oMSDialogInfo.identifier, 0, !oMSDialogInfo.constraint.userDimension);
            }
            this.val$dialog.show();
            Window window = this.val$dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.setGravity(17);
            attributes.width = this.val$width;
            window.setBackgroundDrawableResource(cbc0.f80760b);
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m121099b(List<OMSLocationType> list) {
        int iM121100c = -1;
        if (jyb.m147479J(list)) {
            return -1;
        }
        int i = 0;
        while (i < list.size()) {
            iM121100c = i == 0 ? m121100c(list.get(0)) : iM121100c | m121100c(list.get(i));
            i++;
        }
        return iM121100c;
    }

    /* JADX INFO: renamed from: c */
    public static int m121100c(OMSLocationType oMSLocationType) {
        String string = oMSLocationType.toString();
        string.getClass();
        switch (string) {
            case "g_center_horizontal":
                return 1;
            case "g_start":
                return 8388611;
            case "g_end":
                return 8388613;
            case "g_top":
                return 48;
            case "g_center_vertical":
                return 16;
            case "g_bottom":
                return 80;
            case "g_center":
                return 17;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static h1e0 m121101d(OMSImageScaleType oMSImageScaleType) {
        String string = oMSImageScaleType.toString();
        string.getClass();
        switch (string) {
            case "fit_center":
                return h1e0.f107448e;
            case "center":
                return h1e0.f107450g;
            case "fit_xy":
                return h1e0.f107444a;
            case "focus_crop":
                return h1e0.f107453j;
            case "fit_end":
                return h1e0.f107449f;
            case "center_inside":
                return h1e0.f107451h;
            case "fit_bottom_start":
                return h1e0.f107454k;
            case "fit_start":
                return h1e0.f107447d;
            case "center_crop":
                return h1e0.f107452i;
            default:
                return h1e0.f107452i;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m121102e(OMSLocationType oMSLocationType) {
        String string = oMSLocationType.toString();
        string.getClass();
        switch (string) {
            case "r_align_right":
                return 7;
            case "r_align_start":
                return 18;
            case "r_align_parent_right":
                return 11;
            case "r_align_parent_start":
                return 20;
            case "r_center_vertical":
                return 15;
            case "r_align_parent_left":
                return 9;
            case "r_end_of":
                return 17;
            case "r_left_of":
                return 0;
            case "r_align_bottom":
                return 8;
            case "r_align_baseline":
                return 4;
            case "r_align_parent_bottom":
                return 12;
            case "r_center_horizontal":
                return 14;
            case "r_align_parent_end":
                return 21;
            case "r_align_parent_top":
                return 10;
            case "r_start_of":
                return 16;
            case "r_center_in_parent":
                return 13;
            case "r_above":
                return 2;
            case "r_below":
                return 3;
            case "r_align_end":
                return 19;
            case "r_align_top":
                return 6;
            case "r_align_left":
                return 5;
            case "r_right_of":
                return 1;
            default:
                return -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public static String m121103f(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(xi5.m211107i("/oms/me/resources/" + str));
        if (NullChecker.m82486a(map)) {
            boolean z = true;
            for (String str2 : map.keySet()) {
                sb.append(z ? "?" : "&");
                sb.append(str2);
                sb.append("=");
                sb.append(map.get(str2));
                z = false;
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: g */
    public static void m121104g(String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!NullChecker.m82486a(map) || map.size() <= 0) {
            i4g0.m138520r(str, str2);
            return;
        }
        pf60[] pf60VarArr = new pf60[map.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            pf60VarArr[i] = new pf60(entry.getKey(), dsi0.m117767g(entry.getValue()));
            i++;
        }
        i4g0.m138523u(str, str2, pf60VarArr);
    }

    /* JADX INFO: renamed from: h */
    public static void m121105h(PutongAct putongAct, OMSDialogInfo oMSDialogInfo, String str, boolean z) {
        View viewInflate = LayoutInflater.from(putongAct.getBaseContext()).inflate(jec0.f120476v, (ViewGroup) null, false);
        WebViewX webViewX = (WebViewX) viewInflate.findViewById(ycc0.f198419H0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webViewX.getLayoutParams();
        layoutParams.width = TEnum.equals(oMSDialogInfo.content.web.width.type, OMSWebPerimeterType.absolute) ? bnl0.m105587w((float) oMSDialogInfo.content.web.width.value) : (int) (((double) bnl0.m105592y0()) * oMSDialogInfo.content.web.width.value);
        layoutParams.height = TEnum.equals(oMSDialogInfo.content.web.height.type, OMSWebPerimeterType.absolute) ? bnl0.m105587w((float) oMSDialogInfo.content.web.height.value) : (int) (((double) bnl0.m105588w0()) * oMSDialogInfo.content.web.height.value);
        int i = layoutParams.width;
        webViewX.setLayoutParams(layoutParams);
        final zpq zpqVar = new zpq(putongAct, str, webViewX);
        Dialog dialogM21566z = putongAct.dialog().m21556u().m21518O(viewInflate).m21495B(oMSDialogInfo.cancelAble).m21525V(new DialogInterface.OnDismissListener() { // from class: l.dl50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                zpqVar.m220926k();
            }
        }).m21566z();
        webViewX.setTag(ycc0.f198421I0, dialogM21566z);
        webViewX.addJavascriptInterface(zpqVar, "tantan");
        webViewX.loadUrl(oMSDialogInfo.content.web.url);
        webViewX.setWebViewClientX(new C16792a(putongAct, dialogM21566z, putongAct, z, oMSDialogInfo, i));
    }
}
