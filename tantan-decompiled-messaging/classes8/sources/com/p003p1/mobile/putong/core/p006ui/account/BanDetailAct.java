package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import l.j760;
import l.vwb;
import l.zvf0;
import p007l.wc2;
import p007l.yc2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class BanDetailAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public yc2 f1782c;

    /* JADX INFO: renamed from: d */
    public wc2 f1783d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m8459V1(Context context) {
        return new Intent(context, (Class<?>) BanDetailAct.class);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1782c.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1783d = new wc2(this);
        yc2 yc2Var = new yc2(this);
        this.f1782c = yc2Var;
        this.f1783d.mo8556C(yc2Var);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1783d.mo8872a0();
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        zvf0.u("e_ban_detail", pageId(), new j760[]{vwb.Y("ban_detail_button", "back")});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super/*com.p1.mobile.android.app.Act*/.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public String pageId() {
        return "p_ban_detail";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
