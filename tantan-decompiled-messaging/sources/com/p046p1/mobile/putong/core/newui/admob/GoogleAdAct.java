package com.p046p1.mobile.putong.core.newui.admob;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p147v.VFrame;
import p147v.VImage;
import p149l.e30;
import p149l.q3k;
import p149l.u0n;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public final class GoogleAdAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f21259c;

    /* JADX INFO: renamed from: d */
    public VImage f21260d;

    /* JADX INFO: renamed from: e */
    public VFrame f21261e;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m36137Z1(PutongAct putongAct) {
        return new Intent(putongAct, (Class<?>) GoogleAdAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m36138a2(View view) {
        m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$1(Bundle bundle) {
        setTransparentStatusBar();
        xdl0.m208329E0(this.f21260d, new View.OnClickListener() { // from class: l.p3k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146989a.m36138a2(view);
            }
        });
        if (NullChecker.m81303a(CoreModule.f17545c.f19559D1.getAdvertData())) {
            u0n.m191353l().m191362j(3).mo100438h(this, this.f21261e);
        } else {
            u0n.m191353l().m191362j(1).mo100438h(this, this.f21261e);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public View m36139Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q3k.m172881b(this, layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public Act act() {
        return this;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m36139Y1(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.o3k
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141671a.lambda$initSubscription$1((Bundle) obj);
            }
        });
        try {
            JSONObject jSONObject = new JSONObject();
            if (NullChecker.m81303a(CoreModule.f17545c.f19559D1.getAdvertData())) {
                jSONObject.put("ixxn_ad_channel", "tantan");
                jSONObject.put("ad_id", CoreModule.f17545c.f19559D1.getAdvertData().advertId);
            } else {
                jSONObject.put("ixxn_ad_channel", "other");
            }
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            this.pageHelper.m109039o(jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_messages_ad";
    }
}
