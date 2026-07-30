package com.p051p1.mobile.putong.core.p058ui.vip.likers;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.IntlSeeAct;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import p153l.ddc0;
import p153l.jyb;

/* JADX INFO: loaded from: classes12.dex */
public class LikersAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LikersFrag f38093c;

    /* JADX INFO: renamed from: X1 */
    public static Intent m57726X1(Context context, BusinessEntranceStyle businessEntranceStyle) {
        return IntlSeeAct.m40386X1(context);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m57727Y1(Context context, String str) {
        return IntlSeeAct.m40386X1(context);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m57728Z1(Context context, String str, boolean z) {
        return IntlSeeAct.m40386X1(context);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        this.f38093c.m57761O4();
        super.lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(ddc0.f87909o);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        Fragment fragmentM2558i0 = supportFragmentManager.m2558i0("likers_frag_root");
        if (fragmentM2558i0 instanceof LikersFrag) {
            this.f38093c = (LikersFrag) fragmentM2558i0;
            return frameLayout;
        }
        this.f38093c = new LikersFrag();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.m2805c(ddc0.f87909o, this.f38093c, "likers_frag_root");
        abstractC0428kM2568m.mo2709j();
        return frameLayout;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needRefreshPrivilege() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f38093c.m57765S4().m57858D1(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f38093c.m57773o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f38093c.m57766T4(menu);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public void onStartLifecycle() {
        super.onStartLifecycle();
        if (CoreModule.m30933P().m143405a().mo34532k()) {
            this.pageHelper.m152781p(jyb.m147494Y("is_privileged", Boolean.valueOf(!CoreModule.m30933P().m143405a().mo34492e2())));
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_see_who_likes_me_view";
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public void setTitle(int i) {
        this.f38093c.m57767U4(i);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public void setTitle(CharSequence charSequence) {
        this.f38093c.m57768V4(charSequence);
    }
}
