package com.p051p1.mobile.putong.core.newui.intlmeet.likers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.ddc0;
import p153l.j5j;
import p153l.pec0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlSeeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public IntlMeetLikersFrag f24956c;

    /* JADX INFO: renamed from: X1 */
    public static Intent m40386X1(Context context) {
        Fragment fragmentM143527b;
        String str = ((context instanceof FragmentActivity) && (fragmentM143527b = j5j.m143527b((FragmentActivity) context)) != null && "ConversationListFrag".equals(fragmentM143527b.getClass().getSimpleName())) ? "tabMessage" : "tabMe";
        Intent intent = new Intent(context, (Class<?>) IntlSeeAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151929O, viewGroup, false);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        IntlMeetLikersFrag intlMeetLikersFrag = (IntlMeetLikersFrag) supportFragmentManager.m2558i0("intl_see_act");
        this.f24956c = intlMeetLikersFrag;
        if (intlMeetLikersFrag == null) {
            this.f24956c = new IntlMeetLikersFrag();
            this.f24956c.setArguments(new Bundle());
        }
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.m2813t(ddc0.f87906l, this.f24956c, "intl_see_act");
        abstractC0428kM2568m.mo2709j();
        supportFragmentManager.m2546e0();
        return viewInflate;
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
        if (this.f24956c.m40385T4(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_plm";
    }
}
