package p149l;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.Portrait;
import com.p046p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class snf extends szd {

    /* JADX INFO: renamed from: r */
    public static final String f165437r;

    /* JADX INFO: renamed from: s */
    public static long f165438s;

    /* JADX INFO: renamed from: j */
    public VImage f165439j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f165440k;

    /* JADX INFO: renamed from: l */
    public TextView f165441l;

    /* JADX INFO: renamed from: m */
    public TextView f165442m;

    /* JADX INFO: renamed from: n */
    public TextView f165443n;

    /* JADX INFO: renamed from: o */
    public final Act f165444o;

    /* JADX INFO: renamed from: p */
    public final String f165445p;

    /* JADX INFO: renamed from: q */
    public ExploreDialogData f165446q;

    static {
        f165437r = juk.m143323e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com";
    }

    public snf(Act act, String str) {
        super(act, false, v7c0.f180365l);
        this.f165444o = act;
        this.f165445p = str;
        if (NullChecker.m81303a(act)) {
            return;
        }
        dismiss();
    }

    /* JADX INFO: renamed from: M */
    public static void m185058M(Act act, String str, ExploreDialogData exploreDialogData, boolean z) {
        if (exploreDialogData == null) {
            lsi0.m151595y("当前用户状态异常，请更新状态后尝试");
            return;
        }
        if (SystemClock.uptimeMillis() - f165438s > 500) {
            f165438s = SystemClock.uptimeMillis();
            if ("tag".equals(exploreDialogData.skip)) {
                if (wn90.m204607V()) {
                    return;
                }
                Intent intentM80228X1 = MkDlgWebViewAct.m80228X1(act, "", f165437r + "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/explore/index.html?speed=true&_bid=1004854&tagType=" + str + "&hideNavigationBar=1&hideNotch=1#/label-select");
                intentM80228X1.putExtra("hideNavigationBar", true);
                intentM80228X1.putExtra("skipLoading", true);
                intentM80228X1.putExtra("transparent_status_bar", true);
                intentM80228X1.putExtra("webviewColor", "transparent");
                intentM80228X1.putExtra("hideNotch", true);
                act.startActivity(intentM80228X1);
                act.overridePendingTransition(0, 0);
                return;
            }
            snf snfVar = new snf(act, str);
            if (!z) {
                snfVar.m185063K(exploreDialogData);
                return;
            }
            Window window = snfVar.getWindow();
            if (NullChecker.m81303a(window)) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
                window.setDimAmount(0.3f);
                snfVar.show();
                snfVar.m185062J(exploreDialogData);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public View m185059G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tnf.m189774b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m185060H(ExploreDialogData exploreDialogData, View view) {
        if (wn90.m204607V()) {
            return;
        }
        if (Portrait.TYPE.equals(exploreDialogData.skip) || "new_portrait".equals(exploreDialogData.skip)) {
            q660.m173126b(this.f165444o, CoreStaticData.ProfileFromType.FROM_EXPLORE, exploreDialogData.exploreUploadPic);
            m185065N();
            dismiss();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m185061I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: J */
    public final void m185062J(ExploreDialogData exploreDialogData) {
        qib0.f154691G.m102331L0(this.f165440k, exploreDialogData.pop_up_icon);
        xdl0.m208335H0(this.f165441l, exploreDialogData.pop_up_title);
        xdl0.m208335H0(this.f165442m, exploreDialogData.pop_up_sub_title);
        xdl0.m208335H0(this.f165443n, "上传照片");
        m185066O();
        m185064L(exploreDialogData);
    }

    /* JADX INFO: renamed from: K */
    public final void m185063K(ExploreDialogData exploreDialogData) {
        this.f165446q = exploreDialogData;
        if (NullChecker.m81303a(exploreDialogData)) {
            m185059G(this.f165444o.getLayoutInflater(), null);
            qib0.f154691G.m102331L0(this.f165440k, exploreDialogData.pop_up_icon);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m185064L(final ExploreDialogData exploreDialogData) {
        xdl0.m208329E0(this.f165443n, new View.OnClickListener() { // from class: l.qnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155430a.m185060H(exploreDialogData, view);
            }
        });
        xdl0.m208329E0(this.f165439j, new View.OnClickListener() { // from class: l.rnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160265a.m185061I(view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m185065N() {
        zvf0.m220399u("e_tantanx_card_popup_confirm", "p_tantanx_card", vwb.m200311Y("tantanx_scene_name", this.f165445p));
    }

    /* JADX INFO: renamed from: O */
    public final void m185066O() {
        zvf0.m220368A("e_tantanx_card_popup", "p_tantanx_card", vwb.m200311Y("tantanx_scene_name", this.f165445p));
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m185059G(this.f165444o.getLayoutInflater(), null));
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }
}
