package com.p051p1.mobile.putong.core.newui.appeal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p153l.ry0;
import p153l.sfj0;
import p153l.ty0;
import p153l.xwa;

/* JADX INFO: loaded from: classes11.dex */
public class AppealProgressAct extends PutongMvpAct<ry0, ty0> {

    /* JADX INFO: renamed from: g */
    public static boolean f22018g = true;

    /* JADX INFO: renamed from: e */
    public boolean f22019e;

    /* JADX INFO: renamed from: f */
    public String f22020f = "";

    /* JADX INFO: renamed from: Z1 */
    public static Intent m37174Z1(Context context) {
        f22018g = true;
        return new Intent(context, (Class<?>) AppealProgressAct.class);
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m37175a2(Context context, boolean z) {
        f22018g = z;
        return new Intent(context, (Class<?>) AppealProgressAct.class);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ry0 mo29671X1() {
        return new ry0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public ty0 mo29672Y1() {
        return new ty0(this);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        if (this.f22019e) {
            Act act = this.act;
            act.startActivity(xwa.m213311f(act));
        } else if (f22018g) {
            Act act2 = this.act;
            act2.startActivity(xwa.m213322q(act2));
        }
        super.m68056e2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.f22020f = getIntent().getStringExtra("project_type_extra");
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.equals(this.f22020f, "forbid_chat_appeal")) {
                jSONObject.put("appeal_type", "forbid_chat_appeal");
            } else {
                jSONObject.put("appeal_type", "fake-appeal");
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        this.pageHelper.m152780o(jSONObject);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        ((ry0) this.f17891c).mo40473a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        sfj0.m185596c("e_p_appeal_submit_succeed_back", pageId(), new sfj0.C20032a[0]);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_appeal_submit_succeed";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f22019e = getIntent().getBooleanExtra("needJumpNewMainCard", false);
        setSwipeBackEnable(false);
    }
}
