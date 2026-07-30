package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.web.WebViewX;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.OMSImageScaleType;
import com.p046p1.mobile.putong.data.OMSLocationType;
import com.p046p1.mobile.putong.data.OMSWebPerimeterType;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class xc50 {

    /* JADX INFO: renamed from: l.xc50$a */
    public class C21082a extends sw3 {
        final /* synthetic */ PutongAct val$act;
        final /* synthetic */ Dialog val$dialog;
        final /* synthetic */ OMSDialogInfo val$dialogInfo;
        final /* synthetic */ boolean val$needRecoding;
        final /* synthetic */ int val$width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21082a(Context context, Dialog dialog, PutongAct putongAct, boolean z, OMSDialogInfo oMSDialogInfo, int i) {
            super(context);
            this.val$dialog = dialog;
            this.val$act = putongAct;
            this.val$needRecoding = z;
            this.val$dialogInfo = oMSDialogInfo;
            this.val$width = i;
        }

        @Override // p149l.sw3, com.p046p1.mobile.putong.app.web.WebViewClientX
        public void onPageFinishedX(WebViewX webViewX, String str) {
            super.onPageFinishedX(webViewX, str);
            if (this.val$dialog.isShowing() || this.val$act.isFinishing()) {
                return;
            }
            if (this.val$needRecoding) {
                kb50 kb50VarM135333f = ic50.m135327j().m135333f();
                OMSDialogInfo oMSDialogInfo = this.val$dialogInfo;
                kb50VarM135333f.m145241b0(oMSDialogInfo.identifier, 0, !oMSDialogInfo.constraint.userDimension);
            }
            this.val$dialog.show();
            Window window = this.val$dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.setGravity(17);
            attributes.width = this.val$width;
            window.setBackgroundDrawableResource(w2c0.f184164b);
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m208072b(List<OMSLocationType> list) {
        int iM208073c = -1;
        if (vwb.m200296J(list)) {
            return -1;
        }
        int i = 0;
        while (i < list.size()) {
            iM208073c = i == 0 ? m208073c(list.get(0)) : iM208073c | m208073c(list.get(i));
            i++;
        }
        return iM208073c;
    }

    /* JADX INFO: renamed from: c */
    public static int m208073c(OMSLocationType oMSLocationType) {
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
    public static ftd0 m208074d(OMSImageScaleType oMSImageScaleType) {
        String string = oMSImageScaleType.toString();
        string.getClass();
        switch (string) {
            case "fit_center":
                return ftd0.f99181e;
            case "center":
                return ftd0.f99183g;
            case "fit_xy":
                return ftd0.f99177a;
            case "focus_crop":
                return ftd0.f99186j;
            case "fit_end":
                return ftd0.f99182f;
            case "center_inside":
                return ftd0.f99184h;
            case "fit_bottom_start":
                return ftd0.f99187k;
            case "fit_start":
                return ftd0.f99180d;
            case "center_crop":
                return ftd0.f99185i;
            default:
                return ftd0.f99185i;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m208075e(OMSLocationType oMSLocationType) {
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
    public static String m208076f(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(xh5.m208761i("/oms/me/resources/" + str));
        if (NullChecker.m81303a(map)) {
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
    public static void m208077g(String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!NullChecker.m81303a(map) || map.size() <= 0) {
            zvf0.m220396r(str, str2);
            return;
        }
        j760[] j760VarArr = new j760[map.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            j760VarArr[i] = new j760(entry.getKey(), dji0.m112044g(entry.getValue()));
            i++;
        }
        zvf0.m220399u(str, str2, j760VarArr);
    }

    /* JADX INFO: renamed from: h */
    public static void m208078h(PutongAct putongAct, OMSDialogInfo oMSDialogInfo, String str, boolean z) {
        View viewInflate = LayoutInflater.from(putongAct.getBaseContext()).inflate(e6c0.f89563v, (ViewGroup) null, false);
        WebViewX webViewX = (WebViewX) viewInflate.findViewById(s4c0.f162298H0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webViewX.getLayoutParams();
        layoutParams.width = TEnum.equals(oMSDialogInfo.content.web.width.type, OMSWebPerimeterType.absolute) ? xdl0.m208407w((float) oMSDialogInfo.content.web.width.value) : (int) (((double) xdl0.m208412y0()) * oMSDialogInfo.content.web.width.value);
        layoutParams.height = TEnum.equals(oMSDialogInfo.content.web.height.type, OMSWebPerimeterType.absolute) ? xdl0.m208407w((float) oMSDialogInfo.content.web.height.value) : (int) (((double) xdl0.m208408w0()) * oMSDialogInfo.content.web.height.value);
        int i = layoutParams.width;
        webViewX.setLayoutParams(layoutParams);
        final aoq aoqVar = new aoq(putongAct, str, webViewX);
        Dialog dialogM20567z = putongAct.dialog().m20557u().m20519O(viewInflate).m20496B(oMSDialogInfo.cancelAble).m20526V(new DialogInterface.OnDismissListener() { // from class: l.wc50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                aoqVar.m97931k();
            }
        }).m20567z();
        webViewX.setTag(s4c0.f162300I0, dialogM20567z);
        webViewX.addJavascriptInterface(aoqVar, "tantan");
        webViewX.loadUrl(oMSDialogInfo.content.web.url);
        webViewX.setWebViewClientX(new C21082a(putongAct, dialogM20567z, putongAct, z, oMSDialogInfo, i));
    }
}
