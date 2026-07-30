package com.p051p1.mobile.putong.core.newui.admob;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p151v.VFrame;
import p151v.VImage;
import p153l.bnl0;
import p153l.i6k;
import p153l.u2n;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public final class GoogleAdAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public ConstraintLayout f22001c;

    /* JADX INFO: renamed from: d */
    public VImage f22002d;

    /* JADX INFO: renamed from: e */
    public VFrame f22003e;

    /* JADX INFO: renamed from: a2 */
    public static Intent m37140a2(PutongAct putongAct) {
        return new Intent(putongAct, (Class<?>) GoogleAdAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m37141b2(View view) {
        m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$1(Bundle bundle) {
        setTransparentStatusBar();
        bnl0.m105509E0(this.f22002d, new View.OnClickListener() { // from class: l.h6k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108034a.m37141b2(view);
            }
        });
        if (NullChecker.m82486a(CoreModule.f18264c.f20301D1.getAdvertData())) {
            u2n.m194285l().m194294j(3).mo125406h(this, this.f22003e);
        } else {
            u2n.m194285l().m194294j(1).mo125406h(this, this.f22003e);
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public View m37142Z1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i6k.m138826b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public Act act() {
        return this;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m37142Z1(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.g6k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102465a.lambda$initSubscription$1((Bundle) obj);
            }
        });
        try {
            JSONObject jSONObject = new JSONObject();
            if (NullChecker.m82486a(CoreModule.f18264c.f20301D1.getAdvertData())) {
                jSONObject.put("ixxn_ad_channel", "tantan");
                jSONObject.put("ad_id", CoreModule.f18264c.f20301D1.getAdvertData().advertId);
            } else {
                jSONObject.put("ixxn_ad_channel", "other");
            }
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            this.pageHelper.m152780o(jSONObject);
        } catch (Exception unused) {
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_messages_ad";
    }
}
