package com.p000p1.mobile.putong.core.newui.intlmeet.likers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import l.k6c0;
import l.o2j;
import l.x4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlSeeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public IntlMeetLikersFrag f2992c;

    /* JADX INFO: renamed from: V1 */
    public static Intent m3430V1(Context context) {
        Fragment fragmentB;
        String str = ((context instanceof FragmentActivity) && (fragmentB = o2j.b((FragmentActivity) context)) != null && "ConversationListFrag".equals(fragmentB.getClass().getSimpleName())) ? "tabMessage" : "tabMe";
        Intent intent = new Intent(context, (Class<?>) IntlSeeAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    public boolean disableAutoPV() {
        return true;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.O, viewGroup, false);
        FragmentManager supportFragmentManager = ((Act) this).act.getSupportFragmentManager();
        IntlMeetLikersFrag intlMeetLikersFragI0 = supportFragmentManager.i0("intl_see_act");
        this.f2992c = intlMeetLikersFragI0;
        if (intlMeetLikersFragI0 == null) {
            this.f2992c = new IntlMeetLikersFrag();
            this.f2992c.setArguments(new Bundle());
        }
        k kVarM = supportFragmentManager.m();
        kVarM.t(x4c0.l, this.f2992c, "intl_see_act");
        kVarM.j();
        supportFragmentManager.e0();
        return viewInflate;
    }

    public boolean isAnonymousMode() {
        return false;
    }

    public boolean needBindBillingService() {
        return true;
    }

    public boolean needRefreshPrivilege() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f2992c.m3427T4(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super/*com.p1.mobile.android.app.Act*/.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public String pageId() {
        return "p_intl_plm";
    }
}
