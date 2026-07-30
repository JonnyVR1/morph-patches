package p153l;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.Portrait;
import com.p051p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkDlgWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;

/* JADX INFO: loaded from: classes11.dex */
public class zof extends g1e {

    /* JADX INFO: renamed from: r */
    public static final String f205334r;

    /* JADX INFO: renamed from: s */
    public static long f205335s;

    /* JADX INFO: renamed from: j */
    public VImage f205336j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f205337k;

    /* JADX INFO: renamed from: l */
    public TextView f205338l;

    /* JADX INFO: renamed from: m */
    public TextView f205339m;

    /* JADX INFO: renamed from: n */
    public TextView f205340n;

    /* JADX INFO: renamed from: o */
    public final Act f205341o;

    /* JADX INFO: renamed from: p */
    public final String f205342p;

    /* JADX INFO: renamed from: q */
    public ExploreDialogData f205343q;

    static {
        f205334r = zwk.m221905e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com";
    }

    public zof(Act act, String str) {
        super(act, false, agc0.f71126l);
        this.f205341o = act;
        this.f205342p = str;
        if (NullChecker.m82486a(act)) {
            return;
        }
        dismiss();
    }

    /* JADX INFO: renamed from: M */
    public static void m220753M(Act act, String str, ExploreDialogData exploreDialogData, boolean z) {
        if (exploreDialogData == null) {
            o1j0.m165651y("当前用户状态异常，请更新状态后尝试");
            return;
        }
        if (SystemClock.uptimeMillis() - f205335s > 500) {
            f205335s = SystemClock.uptimeMillis();
            if ("tag".equals(exploreDialogData.skip)) {
                if (aw90.m100567V()) {
                    return;
                }
                Intent intentM81411Y1 = MkDlgWebViewAct.m81411Y1(act, "", f205334r + "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/explore/index.html?speed=true&_bid=1004854&tagType=" + str + "&hideNavigationBar=1&hideNotch=1#/label-select");
                intentM81411Y1.putExtra("hideNavigationBar", true);
                intentM81411Y1.putExtra("skipLoading", true);
                intentM81411Y1.putExtra("transparent_status_bar", true);
                intentM81411Y1.putExtra("webviewColor", "transparent");
                intentM81411Y1.putExtra("hideNotch", true);
                act.startActivity(intentM81411Y1);
                act.overridePendingTransition(0, 0);
                return;
            }
            zof zofVar = new zof(act, str);
            if (!z) {
                zofVar.m220758K(exploreDialogData);
                return;
            }
            Window window = zofVar.getWindow();
            if (NullChecker.m82486a(window)) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
                window.setDimAmount(0.3f);
                zofVar.show();
                zofVar.m220757J(exploreDialogData);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public View m220754G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return apf.m99316b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m220755H(ExploreDialogData exploreDialogData, View view) {
        if (aw90.m100567V()) {
            return;
        }
        if (Portrait.TYPE.equals(exploreDialogData.skip) || "new_portrait".equals(exploreDialogData.skip)) {
            we60.m205992b(this.f205341o, CoreStaticData.ProfileFromType.FROM_EXPLORE, exploreDialogData.exploreUploadPic);
            m220760N();
            dismiss();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m220756I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: J */
    public final void m220757J(ExploreDialogData exploreDialogData) {
        uqb0.f180374G.m127115L0(this.f205337k, exploreDialogData.pop_up_icon);
        bnl0.m105515H0(this.f205338l, exploreDialogData.pop_up_title);
        bnl0.m105515H0(this.f205339m, exploreDialogData.pop_up_sub_title);
        bnl0.m105515H0(this.f205340n, "上传照片");
        m220761O();
        m220759L(exploreDialogData);
    }

    /* JADX INFO: renamed from: K */
    public final void m220758K(ExploreDialogData exploreDialogData) {
        this.f205343q = exploreDialogData;
        if (NullChecker.m82486a(exploreDialogData)) {
            m220754G(this.f205341o.getLayoutInflater(), null);
            uqb0.f180374G.m127115L0(this.f205337k, exploreDialogData.pop_up_icon);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m220759L(final ExploreDialogData exploreDialogData) {
        bnl0.m105509E0(this.f205340n, new View.OnClickListener() { // from class: l.xof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195570a.m220755H(exploreDialogData, view);
            }
        });
        bnl0.m105509E0(this.f205336j, new View.OnClickListener() { // from class: l.yof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200970a.m220756I(view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m220760N() {
        i4g0.m138523u("e_tantanx_card_popup_confirm", "p_tantanx_card", jyb.m147494Y("tantanx_scene_name", this.f205342p));
    }

    /* JADX INFO: renamed from: O */
    public final void m220761O() {
        i4g0.m138492A("e_tantanx_card_popup", "p_tantanx_card", jyb.m147494Y("tantanx_scene_name", this.f205342p));
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m220754G(this.f205341o.getLayoutInflater(), null));
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }
}
