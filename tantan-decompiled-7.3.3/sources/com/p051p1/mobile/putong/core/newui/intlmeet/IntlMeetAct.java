package com.p051p1.mobile.putong.core.newui.intlmeet;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.joa;
import p153l.jyb;
import p153l.wjo;
import p153l.xio;

/* JADX INFO: loaded from: classes11.dex */
public class IntlMeetAct extends PutongMvpAct<xio, wjo> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m40356Z1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) IntlMeetAct.class);
        intent.putExtra("from", str);
        intent.putExtra("select_tab", str2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public xio mo29671X1() {
        return new xio(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public wjo mo29672Y1() {
        return new wjo(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((wjo) this.f17892d).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.pageHelper.m152781p(jyb.m147494Y("is_privileged", Boolean.valueOf(joa.m146354D3())));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (((xio) this.f17891c).m211149k0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_intl_meet_view";
    }
}
