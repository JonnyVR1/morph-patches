package com.p046p1.mobile.putong.core.p053ui.incentivevideo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.data.Active;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.e30;
import p149l.hrm;

/* JADX INFO: loaded from: classes10.dex */
public class IncentVideoResultAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public TextView f29763c;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m46143a2(Bundle bundle) {
        this.f29763c.setOnClickListener(new View.OnClickListener() { // from class: l.grm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104075a.m46145Z1(view);
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public View m46144Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hrm.m132691b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m46145Z1(View view) {
        lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m46144Y1(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.frm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98981a.m46143a2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_suggest_swipe_limit_reward";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        PutongAct.setLightStatusBar(this.act.getWindow(), 1024);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        } catch (JSONException unused) {
        }
        this.pageHelper.m109039o(jSONObject);
    }
}
