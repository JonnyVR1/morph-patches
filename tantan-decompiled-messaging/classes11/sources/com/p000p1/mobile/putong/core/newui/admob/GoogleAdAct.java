package com.p000p1.mobile.putong.core.newui.admob;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.q3k;
import l.xdl0;
import org.json.JSONObject;
import p009l.u0n;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final class GoogleAdAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f37c;

    /* JADX INFO: renamed from: d */
    public VImage f38d;

    /* JADX INFO: renamed from: e */
    public VFrame f39e;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m34Z1(PutongAct putongAct) {
        return new Intent((Context) putongAct, (Class<?>) GoogleAdAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public /* synthetic */ void m35a2(View view) {
        finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$1(Bundle bundle) {
        setTransparentStatusBar();
        xdl0.E0(this.f38d, new View.OnClickListener() { // from class: l.p3k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18372a.m35a2(view);
            }
        });
        if (NullChecker.a(CoreModule.c.D1.g3())) {
            u0n.m22726l().m22735j(3).h(this, this.f39e);
        } else {
            u0n.m22726l().m22735j(1).h(this, this.f39e);
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public View m36Y1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q3k.b(this, layoutInflater, viewGroup);
    }

    public Act act() {
        return this;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m36Y1(layoutInflater, viewGroup);
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.o3k
            public final void call(Object obj) {
                this.f17817a.lambda$initSubscription$1((Bundle) obj);
            }
        });
        try {
            JSONObject jSONObject = new JSONObject();
            if (NullChecker.a(CoreModule.c.D1.g3())) {
                jSONObject.put("ixxn_ad_channel", "tantan");
                jSONObject.put("ad_id", CoreModule.c.D1.g3().advertId);
            } else {
                jSONObject.put("ixxn_ad_channel", "other");
            }
            jSONObject.put("tooltips_trigger_mode", "active");
            ((PutongAct) this).pageHelper.o(jSONObject);
        } catch (Exception unused) {
        }
    }

    public String pageId() {
        return "p_messages_ad";
    }
}
