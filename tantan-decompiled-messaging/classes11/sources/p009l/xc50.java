package p009l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.web.WebViewX;
import com.p1.mobile.putong.data.OMSDialogInfo;
import com.p1.mobile.putong.data.OMSImageScaleType;
import com.p1.mobile.putong.data.OMSLocationType;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.Map;
import l.e6c0;
import l.ftd0;
import l.j760;
import l.s4c0;
import l.vwb;
import l.w2c0;
import l.xdl0;
import l.xh5;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class xc50 {

    /* JADX INFO: renamed from: l.xc50$a */
    public class C1299a extends sw3 {
        final /* synthetic */ PutongAct val$act;
        final /* synthetic */ Dialog val$dialog;
        final /* synthetic */ OMSDialogInfo val$dialogInfo;
        final /* synthetic */ boolean val$needRecoding;
        final /* synthetic */ int val$width;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1299a(Context context, Dialog dialog, PutongAct putongAct, boolean z, OMSDialogInfo oMSDialogInfo, int i) {
            super(context);
            this.val$dialog = dialog;
            this.val$act = putongAct;
            this.val$needRecoding = z;
            this.val$dialogInfo = oMSDialogInfo;
            this.val$width = i;
        }

        @Override // p009l.sw3
        public void onPageFinishedX(WebViewX webViewX, String str) {
            super.onPageFinishedX(webViewX, str);
            if (this.val$dialog.isShowing() || this.val$act.isFinishing()) {
                return;
            }
            if (this.val$needRecoding) {
                kb50 kb50VarM16322f = ic50.m16316j().m16322f();
                OMSDialogInfo oMSDialogInfo = this.val$dialogInfo;
                kb50VarM16322f.m17407b0(oMSDialogInfo.identifier, 0, !oMSDialogInfo.constraint.userDimension);
            }
            this.val$dialog.show();
            Window window = this.val$dialog.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            window.setGravity(17);
            attributes.width = this.val$width;
            window.setBackgroundDrawableResource(w2c0.b);
            window.setAttributes(attributes);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m24768b(List<OMSLocationType> list) {
        int iM24769c = -1;
        if (vwb.J(list)) {
            return -1;
        }
        int i = 0;
        while (i < list.size()) {
            iM24769c = i == 0 ? m24769c(list.get(0)) : iM24769c | m24769c(list.get(i));
            i++;
        }
        return iM24769c;
    }

    /* JADX INFO: renamed from: c */
    public static int m24769c(OMSLocationType oMSLocationType) {
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
    public static ftd0 m24770d(OMSImageScaleType oMSImageScaleType) {
        String string = oMSImageScaleType.toString();
        string.getClass();
        switch (string) {
            case "fit_center":
                return ftd0.e;
            case "center":
                return ftd0.g;
            case "fit_xy":
                return ftd0.a;
            case "focus_crop":
                return ftd0.j;
            case "fit_end":
                return ftd0.f;
            case "center_inside":
                return ftd0.h;
            case "fit_bottom_start":
                return ftd0.k;
            case "fit_start":
                return ftd0.d;
            case "center_crop":
                return ftd0.i;
            default:
                return ftd0.i;
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m24771e(OMSLocationType oMSLocationType) {
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
    public static String m24772f(String str, Map<String, String> map) {
        StringBuilder sb = new StringBuilder(xh5.i("/oms/me/resources/" + str));
        if (NullChecker.a(map)) {
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
    public static void m24773g(String str, String str2, Map<String, String> map) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        if (!NullChecker.a(map) || map.size() <= 0) {
            zvf0.r(str, str2);
            return;
        }
        j760[] j760VarArr = new j760[map.size()];
        int i = 0;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            j760VarArr[i] = new j760(entry.getKey(), dji0.m13360g(entry.getValue()));
            i++;
        }
        zvf0.u(str, str2, j760VarArr);
    }

    /* JADX INFO: renamed from: h */
    public static void m24774h(PutongAct putongAct, OMSDialogInfo oMSDialogInfo, String str, boolean z) {
        View viewInflate = LayoutInflater.from(putongAct.getBaseContext()).inflate(e6c0.v, (ViewGroup) null, false);
        WebViewX webViewXFindViewById = viewInflate.findViewById(s4c0.H0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) webViewXFindViewById.getLayoutParams();
        layoutParams.width = TEnum.equals(oMSDialogInfo.content.web.width.type, "absolute") ? xdl0.w((float) oMSDialogInfo.content.web.width.value) : (int) (((double) xdl0.y0()) * oMSDialogInfo.content.web.width.value);
        layoutParams.height = TEnum.equals(oMSDialogInfo.content.web.height.type, "absolute") ? xdl0.w((float) oMSDialogInfo.content.web.height.value) : (int) (((double) xdl0.w0()) * oMSDialogInfo.content.web.height.value);
        int i = layoutParams.width;
        webViewXFindViewById.setLayoutParams(layoutParams);
        final aoq aoqVar = new aoq(putongAct, str, webViewXFindViewById);
        Dialog dialogZ = putongAct.dialog().u().O(viewInflate).B(oMSDialogInfo.cancelAble).V(new DialogInterface.OnDismissListener() { // from class: l.wc50
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                aoqVar.m11546k();
            }
        }).z();
        webViewXFindViewById.setTag(s4c0.I0, dialogZ);
        webViewXFindViewById.addJavascriptInterface(aoqVar, "tantan");
        webViewXFindViewById.loadUrl(oMSDialogInfo.content.web.url);
        webViewXFindViewById.setWebViewClientX(new C1299a(putongAct, dialogZ, putongAct, z, oMSDialogInfo, i));
    }
}
