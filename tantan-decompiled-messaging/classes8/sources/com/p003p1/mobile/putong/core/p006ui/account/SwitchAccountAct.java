package com.p003p1.mobile.putong.core.p006ui.account;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import l.leh0;
import l.seh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class SwitchAccountAct extends PutongAct {

    /* JADX INFO: renamed from: e */
    public static String f1828e = "switch_account";

    /* JADX INFO: renamed from: c */
    public seh0 f1829c;

    /* JADX INFO: renamed from: d */
    public leh0 f1830d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m8548V1(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SwitchAccountAct.class);
        intent.putExtra(f1828e, str);
        return intent;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f1829c.inflateView(layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f1830d = new leh0(this);
        seh0 seh0Var = new seh0(this);
        this.f1829c = seh0Var;
        this.f1830d.mo8556C(seh0Var);
    }

    public void initSubscription() {
        super.initSubscription();
        this.f1830d.a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onBackPressed() {
        if (CoreModule.H().signedIn_()) {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        } else {
            moveTaskToBack(true);
        }
    }

    public String pageId() {
        return "p_switch_account_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f1830d.y0(getIntent().getStringExtra(f1828e));
    }
}
