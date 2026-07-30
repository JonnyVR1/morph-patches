package com.p000p1.mobile.putong.core.newui.intlmeet;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import l.j760;
import l.vwb;
import l.xma;
import p009l.who;
import p009l.xgo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlMeetAct extends PutongMvpAct<xgo, who> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m3385Y1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) IntlMeetAct.class);
        intent.putExtra("from", str);
        intent.putExtra("select_tab", str2);
        return intent;
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public xgo m3386V1() {
        return new xgo(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public who m3387X1() {
        return new who(this);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((who) ((PutongMvpAct) this).d).inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("is_privileged", Boolean.valueOf(xma.C3()))});
    }

    public boolean needBindBillingService() {
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (((xgo) ((PutongMvpAct) this).c).m24893k0(i, i2, intent)) {
            return;
        }
        super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
    }

    public String pageId() {
        return "p_intl_meet_view";
    }
}
