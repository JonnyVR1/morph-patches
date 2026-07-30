package com.p046p1.mobile.putong.core.p053ui.messages.redpacket;

import android.content.Intent;
import android.graphics.Color;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.a1c0;
import p149l.c3c0;
import p149l.cwf0;
import p149l.jhe0;
import p149l.phe0;

/* JADX INFO: loaded from: classes4.dex */
public class SendRedPacketAct extends PutongCoreMvpAct<jhe0, phe0> {

    /* JADX INFO: renamed from: f */
    public String f32286f;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m49753Z1(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) SendRedPacketAct.class);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jhe0 mo29951X1() {
        return new jhe0(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public phe0 mo29952Y1() {
        return new phe0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        toolbar().setBackgroundColor(this.act.getResources().getColor(a1c0.f67164r));
        setStatusBarColorResId(a1c0.f67164r);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f32286f = getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        this.pageHelper = new cwf0("p_red_packet", SendRedPacketAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("groupchat_id", this.f32286f);
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.pageHelper.m109039o(jSONObject);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        super.setTheme();
        getSupportActionBar().mo134112B(c3c0.f78619Q7);
        toolbar().setTitleTextColor(Color.parseColor("#212121"));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            return false;
        }
        return super.shouldShowGradientStatusBar();
    }
}
