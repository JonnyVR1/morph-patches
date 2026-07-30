package com.p000p1.mobile.putong.core.p001ui.messages.redpacket;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.tantanapp.common.utils.CrashHelper;
import l.a1c0;
import l.c3c0;
import l.cwf0;
import org.json.JSONException;
import org.json.JSONObject;
import p002l.jhe0;
import p002l.phe0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SendRedPacketAct extends PutongCoreMvpAct<jhe0, phe0> {

    /* JADX INFO: renamed from: f */
    public String f108f;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m169Z1(Act act, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) SendRedPacketAct.class);
        intent.putExtra("group_id", str);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public jhe0 m170X1() {
        return new jhe0(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public phe0 m171Y1() {
        return new phe0(this);
    }

    public void checkGradientColors() {
        super/*com.p1.mobile.putong.app.PutongAct*/.checkGradientColors();
        toolbar().setBackgroundColor(((Act) this).act.getResources().getColor(a1c0.r));
        setStatusBarColorResId(a1c0.r);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        this.f108f = getIntent().getStringExtra("group_id");
        super.initDataOnCreate();
    }

    public void initPageHelper() {
        ((PutongAct) this).pageHelper = new cwf0("p_red_packet", SendRedPacketAct.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("groupchat_id", this.f108f);
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        ((PutongAct) this).pageHelper.o(jSONObject);
    }

    public void setTheme() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTheme();
        getSupportActionBar().B(c3c0.Q7);
        toolbar().setTitleTextColor(Color.parseColor("#212121"));
    }

    public boolean shouldShowGradientStatusBar() {
        if (CoreModule.P().i().G1()) {
            return false;
        }
        return super/*com.p1.mobile.putong.app.PutongAct*/.shouldShowGradientStatusBar();
    }
}
