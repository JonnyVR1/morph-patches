package com.p000p1.mobile.putong.core.p004ui.seepage.likers;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.intlmeet.likers.IntlSeeAct;
import l.j760;
import l.x4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class FakeLikersAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public FakeLikersFrag f5559c;

    /* JADX INFO: renamed from: V1 */
    public static Intent m8319V1(Context context, String str) {
        return IntlSeeAct.V1(context);
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m8320Y1(Act act, String str) {
        act.startActivity(IntlSeeAct.V1(act));
    }

    /* JADX INFO: renamed from: X1 */
    public String m8321X1() {
        return ((Act) this).act.getIntent().getStringExtra("from");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(x4c0.i);
        FragmentManager supportFragmentManager = ((Act) this).act.getSupportFragmentManager();
        FakeLikersFrag fakeLikersFragI0 = supportFragmentManager.i0("fake_likers_frag_root");
        if (fakeLikersFragI0 instanceof FakeLikersFrag) {
            this.f5559c = fakeLikersFragI0;
            return frameLayout;
        }
        this.f5559c = new FakeLikersFrag();
        k kVarM = supportFragmentManager.m();
        kVarM.c(x4c0.i, this.f5559c, "fake_likers_frag_root");
        kVarM.j();
        return frameLayout;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.pageHelper.p(new j760[]{j760.a("is_privileged", Boolean.valueOf(!CoreModule.m1854P().m11706a().m5426e2()))});
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f5559c.m8326Q4().m28499G0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        String stringExtra = ((Act) this).act.getIntent().getStringExtra("from");
        return ("p_navigation_view,e_see_banner,intl_click".equals(stringExtra) || "p_special_card,deeplink_intl,click".equals(stringExtra)) ? "p_intl_plm" : "p_see_who_likes_me_view";
    }

    public void setTitle(int i) {
        this.f5559c.m8327R4(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f5559c.m8328S4(charSequence);
    }
}
