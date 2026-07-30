package com.p046p1.mobile.putong.core.p053ui.vip.likers;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.intlmeet.likers.IntlSeeAct;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import p149l.vwb;
import p149l.x4c0;

/* JADX INFO: loaded from: classes9.dex */
public class LikersAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LikersFrag f37245c;

    /* JADX INFO: renamed from: V1 */
    public static Intent m56543V1(Context context, BusinessEntranceStyle businessEntranceStyle) {
        return IntlSeeAct.m39383V1(context);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m56544X1(Context context, String str) {
        return IntlSeeAct.m39383V1(context);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m56545Y1(Context context, String str, boolean z) {
        return IntlSeeAct.m39383V1(context);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        this.f37245c.m56578O4();
        super.lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(x4c0.f191004o);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        Fragment fragmentM2557i0 = supportFragmentManager.m2557i0("likers_frag_root");
        if (fragmentM2557i0 instanceof LikersFrag) {
            this.f37245c = (LikersFrag) fragmentM2557i0;
            return frameLayout;
        }
        this.f37245c = new LikersFrag();
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        abstractC0427kM2567m.m2804c(x4c0.f191004o, this.f37245c, "likers_frag_root");
        abstractC0427kM2567m.mo2708j();
        return frameLayout;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needRefreshPrivilege() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f37245c.m56582S4().m56675D1(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f37245c.m56590o()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f37245c.m56583T4(menu);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public void onStartLifecycle() {
        super.onStartLifecycle();
        if (CoreModule.m29935P().m94651a().mo33529k()) {
            this.pageHelper.m109040p(vwb.m200311Y("is_privileged", Boolean.valueOf(!CoreModule.m29935P().m94651a().mo33489e2())));
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_see_who_likes_me_view";
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public void setTitle(int i) {
        this.f37245c.m56584U4(i);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public void setTitle(CharSequence charSequence) {
        this.f37245c.m56585V4(charSequence);
    }
}
