package com.p051p1.mobile.putong.core.p058ui.incentivevideo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.data.Active;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.jtm;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class IncentVideoResultAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public TextView f30611c;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m47326b2(Bundle bundle) {
        this.f30611c.setOnClickListener(new View.OnClickListener() { // from class: l.itm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116852a.m47328a2(view);
            }
        });
    }

    /* JADX INFO: renamed from: Z1 */
    public View m47327Z1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jtm.m146909b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m47328a2(View view) {
        lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m47327Z1(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.htm
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111564a.m47326b2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_suggest_swipe_limit_reward";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        PutongAct.setLightStatusBar(this.act.getWindow(), 1024);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        } catch (JSONException unused) {
        }
        this.pageHelper.m152780o(jSONObject);
    }
}
