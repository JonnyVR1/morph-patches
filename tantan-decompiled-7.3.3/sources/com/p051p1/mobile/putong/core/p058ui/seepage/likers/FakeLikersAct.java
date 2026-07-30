package com.p051p1.mobile.putong.core.p058ui.seepage.likers;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlSeeAct;
import p153l.ddc0;
import p153l.pf60;

/* JADX INFO: loaded from: classes12.dex */
public class FakeLikersAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FakeLikersFrag f36626c;

    /* JADX INFO: renamed from: X1 */
    public static Intent m56138X1(Context context, String str) {
        return IntlSeeAct.m40386X1(context);
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m56139Z1(Act act, String str) {
        act.startActivity(IntlSeeAct.m40386X1(act));
    }

    /* JADX INFO: renamed from: Y1 */
    public String m56140Y1() {
        return this.act.getIntent().getStringExtra("from");
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(ddc0.f87903i);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        Fragment fragmentM2558i0 = supportFragmentManager.m2558i0("fake_likers_frag_root");
        if (fragmentM2558i0 instanceof FakeLikersFrag) {
            this.f36626c = (FakeLikersFrag) fragmentM2558i0;
            return frameLayout;
        }
        this.f36626c = new FakeLikersFrag();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.m2805c(ddc0.f87903i, this.f36626c, "fake_likers_frag_root");
        abstractC0428kM2568m.mo2709j();
        return frameLayout;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m152781p(pf60.m172085a("is_privileged", Boolean.valueOf(!CoreModule.m30933P().m143405a().mo34492e2())));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f36626c.m56145Q4().m156659G0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        String stringExtra = this.act.getIntent().getStringExtra("from");
        return ("p_navigation_view,e_see_banner,intl_click".equals(stringExtra) || "p_special_card,deeplink_intl,click".equals(stringExtra)) ? "p_intl_plm" : "p_see_who_likes_me_view";
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public void setTitle(int i) {
        this.f36626c.m56146R4(i);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public void setTitle(CharSequence charSequence) {
        this.f36626c.m56147S4(charSequence);
    }
}
