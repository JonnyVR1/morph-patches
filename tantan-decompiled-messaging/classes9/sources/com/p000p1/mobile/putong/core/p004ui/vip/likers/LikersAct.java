package com.p000p1.mobile.putong.core.p004ui.vip.likers;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.newui.intlmeet.likers.IntlSeeAct;
import com.p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import l.j760;
import l.vwb;
import l.x4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LikersAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LikersFrag f7026c;

    /* JADX INFO: renamed from: V1 */
    public static Intent m9985V1(Context context, BusinessEntranceStyle businessEntranceStyle) {
        return IntlSeeAct.V1(context);
    }

    /* JADX INFO: renamed from: X1 */
    public static Intent m9986X1(Context context, String str) {
        return IntlSeeAct.V1(context);
    }

    /* JADX INFO: renamed from: Y1 */
    public static Intent m9987Y1(Context context, String str, boolean z) {
        return IntlSeeAct.V1(context);
    }

    public void finish() {
        this.f7026c.m10020O4();
        super.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(x4c0.o);
        FragmentManager supportFragmentManager = ((Act) this).act.getSupportFragmentManager();
        LikersFrag likersFragI0 = supportFragmentManager.i0("likers_frag_root");
        if (likersFragI0 instanceof LikersFrag) {
            this.f7026c = likersFragI0;
            return frameLayout;
        }
        this.f7026c = new LikersFrag();
        k kVarM = supportFragmentManager.m();
        kVarM.c(x4c0.o, this.f7026c, "likers_frag_root");
        kVarM.j();
        return frameLayout;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean needRefreshPrivilege() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f7026c.m10024S4().m10132D1(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        if (this.f7026c.m10033o()) {
            return;
        }
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        return this.f7026c.m10025T4(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onStartLifecycle() {
        super.onStartLifecycle();
        if (CoreModule.m1854P().m11706a().m5466k()) {
            this.pageHelper.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(!CoreModule.m1854P().m11706a().m5426e2()))});
        }
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_see_who_likes_me_view";
    }

    public void setTitle(int i) {
        this.f7026c.m10026U4(i);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7026c.m10027V4(charSequence);
    }
}
