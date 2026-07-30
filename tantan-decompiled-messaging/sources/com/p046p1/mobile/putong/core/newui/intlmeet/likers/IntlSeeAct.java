package com.p046p1.mobile.putong.core.newui.intlmeet.likers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.k6c0;
import p149l.o2j;
import p149l.x4c0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlSeeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public IntlMeetLikersFrag f24214c;

    /* JADX INFO: renamed from: V1 */
    public static Intent m39383V1(Context context) {
        Fragment fragmentM162299b;
        String str = ((context instanceof FragmentActivity) && (fragmentM162299b = o2j.m162299b((FragmentActivity) context)) != null && "ConversationListFrag".equals(fragmentM162299b.getClass().getSimpleName())) ? "tabMessage" : "tabMe";
        Intent intent = new Intent(context, (Class<?>) IntlSeeAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121321O, viewGroup, false);
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        IntlMeetLikersFrag intlMeetLikersFrag = (IntlMeetLikersFrag) supportFragmentManager.m2557i0("intl_see_act");
        this.f24214c = intlMeetLikersFrag;
        if (intlMeetLikersFrag == null) {
            this.f24214c = new IntlMeetLikersFrag();
            this.f24214c.setArguments(new Bundle());
        }
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        abstractC0427kM2567m.m2812t(x4c0.f191001l, this.f24214c, "intl_see_act");
        abstractC0427kM2567m.mo2708j();
        supportFragmentManager.m2545e0();
        return viewInflate;
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
        if (this.f24214c.m39382T4(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_intl_plm";
    }
}
