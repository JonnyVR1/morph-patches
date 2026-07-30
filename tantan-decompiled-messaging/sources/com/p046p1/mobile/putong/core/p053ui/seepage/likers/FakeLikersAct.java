package com.p046p1.mobile.putong.core.p053ui.seepage.likers;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.IntlSeeAct;
import p149l.j760;
import p149l.x4c0;

/* JADX INFO: loaded from: classes9.dex */
public class FakeLikersAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FakeLikersFrag f35778c;

    /* JADX INFO: renamed from: V1 */
    public static Intent m54955V1(Context context, String str) {
        return IntlSeeAct.m39383V1(context);
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m54956Y1(Act act, String str) {
        act.startActivity(IntlSeeAct.m39383V1(act));
    }

    /* JADX INFO: renamed from: X1 */
    public String m54957X1() {
        return this.act.getIntent().getStringExtra("from");
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(x4c0.f190998i);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        Fragment fragmentM2557i0 = supportFragmentManager.m2557i0("fake_likers_frag_root");
        if (fragmentM2557i0 instanceof FakeLikersFrag) {
            this.f35778c = (FakeLikersFrag) fragmentM2557i0;
            return frameLayout;
        }
        this.f35778c = new FakeLikersFrag();
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        abstractC0427kM2567m.m2804c(x4c0.f190998i, this.f35778c, "fake_likers_frag_root");
        abstractC0427kM2567m.mo2708j();
        return frameLayout;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.m109040p(j760.m140076a("is_privileged", Boolean.valueOf(!CoreModule.m29935P().m94651a().mo33489e2())));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f35778c.m54962Q4().m216663G0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        String stringExtra = this.act.getIntent().getStringExtra("from");
        return ("p_navigation_view,e_see_banner,intl_click".equals(stringExtra) || "p_special_card,deeplink_intl,click".equals(stringExtra)) ? "p_intl_plm" : "p_see_who_likes_me_view";
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public void setTitle(int i) {
        this.f35778c.m54963R4(i);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public void setTitle(CharSequence charSequence) {
        this.f35778c.m54964S4(charSequence);
    }
}
