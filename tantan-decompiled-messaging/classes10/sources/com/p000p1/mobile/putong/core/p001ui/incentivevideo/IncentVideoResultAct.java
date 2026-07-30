package com.p000p1.mobile.putong.core.p001ui.incentivevideo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.data.Active;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import l.e30;
import org.json.JSONException;
import org.json.JSONObject;
import p003l.hrm;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IncentVideoResultAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public TextView f2157c;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m3508a2(Bundle bundle) {
        this.f2157c.setOnClickListener(new View.OnClickListener() { // from class: l.grm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4718a.m3510Z1(view);
            }
        });
    }

    /* JADX INFO: renamed from: Y1 */
    public View m3509Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hrm.m7069b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m3510Z1(View view) {
        finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3509Y1(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.frm
            public final void call(Object obj) {
                this.f4509a.m3508a2((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
    }

    public String pageId() {
        return "p_suggest_swipe_limit_reward";
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        setTransparentStatusBar();
        PutongAct.setLightStatusBar(((Act) this).act.getWindow(), 1024);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
        } catch (JSONException unused) {
        }
        ((PutongAct) this).pageHelper.o(jSONObject);
    }
}
