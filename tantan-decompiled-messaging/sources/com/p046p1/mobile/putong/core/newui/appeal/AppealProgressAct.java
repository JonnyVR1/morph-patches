package com.p046p1.mobile.putong.core.newui.appeal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.CrashHelper;
import org.json.JSONException;
import org.json.JSONObject;
import p149l.ky0;
import p149l.lva;
import p149l.my0;
import p149l.o6j0;

/* JADX INFO: loaded from: classes11.dex */
public class AppealProgressAct extends PutongMvpAct<ky0, my0> {

    /* JADX INFO: renamed from: g */
    public static boolean f21276g = true;

    /* JADX INFO: renamed from: e */
    public boolean f21277e;

    /* JADX INFO: renamed from: f */
    public String f21278f = "";

    /* JADX INFO: renamed from: Y1 */
    public static Intent m36171Y1(Context context) {
        f21276g = true;
        return new Intent(context, (Class<?>) AppealProgressAct.class);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m36172Z1(Context context, boolean z) {
        f21276g = z;
        return new Intent(context, (Class<?>) AppealProgressAct.class);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ky0 mo28672V1() {
        return new ky0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public my0 mo28673X1() {
        return new my0(this);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        if (this.f21277e) {
            Act act = this.act;
            act.startActivity(lva.m151850f(act));
        } else if (f21276g) {
            Act act2 = this.act;
            act2.startActivity(lva.m151861q(act2));
        }
        super.m66873d2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void initPageHelper() {
        super.initPageHelper();
        this.f21278f = getIntent().getStringExtra("project_type_extra");
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.equals(this.f21278f, "forbid_chat_appeal")) {
                jSONObject.put("appeal_type", "forbid_chat_appeal");
            } else {
                jSONObject.put("appeal_type", "fake-appeal");
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        this.pageHelper.m109039o(jSONObject);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        ((ky0) this.f17172c).mo39470a0();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        o6j0.m162859c("e_p_appeal_submit_succeed_back", pageId(), new o6j0.C18854a[0]);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_appeal_submit_succeed";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f21277e = getIntent().getBooleanExtra("needJumpNewMainCard", false);
        setSwipeBackEnable(false);
    }
}
