package p009l;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.explore.data.ExploreDialogData;
import com.p000p1.mobile.putong.p004ui.webview.p007mk.MkDlgWebViewAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.lsi0;
import l.q660;
import l.qib0;
import l.szd;
import l.tnf;
import l.v7c0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class snf extends szd {

    /* JADX INFO: renamed from: r */
    public static final String f20376r;

    /* JADX INFO: renamed from: s */
    public static long f20377s;

    /* JADX INFO: renamed from: j */
    public VImage f20378j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f20379k;

    /* JADX INFO: renamed from: l */
    public TextView f20380l;

    /* JADX INFO: renamed from: m */
    public TextView f20381m;

    /* JADX INFO: renamed from: n */
    public TextView f20382n;

    /* JADX INFO: renamed from: o */
    public final Act f20383o;

    /* JADX INFO: renamed from: p */
    public final String f20384p;

    /* JADX INFO: renamed from: q */
    public ExploreDialogData f20385q;

    static {
        f20376r = juk.m17221e() ? "http://m.staging2.p1staff.com" : "https://m.tantanapp.com";
    }

    public snf(Act act, String str) {
        super(act, false, v7c0.l);
        this.f20383o = act;
        this.f20384p = str;
        if (NullChecker.a(act)) {
            return;
        }
        dismiss();
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [android.app.Dialog, l.snf, l.szd] */
    /* JADX INFO: renamed from: M */
    public static void m22306M(Act act, String str, ExploreDialogData exploreDialogData, boolean z) {
        if (exploreDialogData == null) {
            lsi0.y("当前用户状态异常，请更新状态后尝试");
            return;
        }
        if (SystemClock.uptimeMillis() - f20377s > 500) {
            f20377s = SystemClock.uptimeMillis();
            if ("tag".equals(exploreDialogData.skip)) {
                if (wn90.m24344V()) {
                    return;
                }
                Intent intentM10570X1 = MkDlgWebViewAct.m10570X1(act, "", f20376r + "/fep/tantan/frontend/tantan-frontend-app-pages-v2/src/pages/growth/explore/index.html?speed=true&_bid=1004854&tagType=" + str + "&hideNavigationBar=1&hideNotch=1#/label-select");
                intentM10570X1.putExtra("hideNavigationBar", true);
                intentM10570X1.putExtra("skipLoading", true);
                intentM10570X1.putExtra("transparent_status_bar", true);
                intentM10570X1.putExtra("webviewColor", "transparent");
                intentM10570X1.putExtra("hideNotch", true);
                act.startActivity(intentM10570X1);
                act.overridePendingTransition(0, 0);
                return;
            }
            ?? snfVar = new snf(act, str);
            if (!z) {
                snfVar.m22311K(exploreDialogData);
                return;
            }
            Window window = snfVar.getWindow();
            if (NullChecker.a(window)) {
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 80;
                attributes.width = -1;
                attributes.height = -2;
                window.setAttributes(attributes);
                window.setDimAmount(0.3f);
                snfVar.show();
                snfVar.m22310J(exploreDialogData);
            }
        }
    }

    /* JADX INFO: renamed from: G */
    public View m22307G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tnf.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m22308H(ExploreDialogData exploreDialogData, View view) {
        if (wn90.m24344V()) {
            return;
        }
        if ("portrait".equals(exploreDialogData.skip) || "new_portrait".equals(exploreDialogData.skip)) {
            q660.b(this.f20383o, "from_explore_card", exploreDialogData.exploreUploadPic);
            m22313N();
            dismiss();
        }
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m22309I(View view) {
        dismiss();
    }

    /* JADX INFO: renamed from: J */
    public final void m22310J(ExploreDialogData exploreDialogData) {
        qib0.G.L0(this.f20379k, exploreDialogData.pop_up_icon);
        xdl0.H0(this.f20380l, exploreDialogData.pop_up_title);
        xdl0.H0(this.f20381m, exploreDialogData.pop_up_sub_title);
        xdl0.H0(this.f20382n, "上传照片");
        m22314O();
        m22312L(exploreDialogData);
    }

    /* JADX INFO: renamed from: K */
    public final void m22311K(ExploreDialogData exploreDialogData) {
        this.f20385q = exploreDialogData;
        if (NullChecker.a(exploreDialogData)) {
            m22307G(this.f20383o.getLayoutInflater(), null);
            qib0.G.L0(this.f20379k, exploreDialogData.pop_up_icon);
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m22312L(final ExploreDialogData exploreDialogData) {
        xdl0.E0(this.f20382n, new View.OnClickListener() { // from class: l.qnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19390a.m22308H(exploreDialogData, view);
            }
        });
        xdl0.E0(this.f20378j, new View.OnClickListener() { // from class: l.rnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19919a.m22309I(view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final void m22313N() {
        zvf0.u("e_tantanx_card_popup_confirm", "p_tantanx_card", new j760[]{vwb.Y("tantanx_scene_name", this.f20384p)});
    }

    /* JADX INFO: renamed from: O */
    public final void m22314O() {
        zvf0.A("e_tantanx_card_popup", "p_tantanx_card", new j760[]{vwb.Y("tantanx_scene_name", this.f20384p)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        setContentView(m22307G(this.f20383o.getLayoutInflater(), null));
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }
}
