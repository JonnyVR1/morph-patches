package com.p051p1.mobile.putong.core.p058ui.messages.redpacket;

import android.content.Intent;
import android.graphics.Color;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.g9c0;
import p153l.ibc0;
import p153l.l4g0;
import p153l.ope0;
import p153l.upe0;

/* JADX INFO: loaded from: classes4.dex */
public class SendRedPacketAct extends PutongCoreMvpAct<ope0, upe0> {

    /* JADX INFO: renamed from: f */
    public String f33134f;

    /* JADX INFO: renamed from: a2 */
    public static Intent m50936a2(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) SendRedPacketAct.class);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ope0 mo30949Y1() {
        return new ope0(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public upe0 mo30950Z1() {
        return new upe0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        toolbar().setBackgroundColor(this.act.getResources().getColor(g9c0.f102828r));
        setStatusBarColorResId(g9c0.f102828r);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f33134f = getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        this.pageHelper = new l4g0("p_red_packet", SendRedPacketAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("groupchat_id", this.f33134f);
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.pageHelper.m152780o(jSONObject);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        getSupportActionBar().mo102169B(ibc0.f113894Q7);
        toolbar().setTitleTextColor(Color.parseColor("#212121"));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            return false;
        }
        return super.shouldShowGradientStatusBar();
    }
}
