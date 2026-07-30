package com.p000p1.mobile.putong.core.newui.appeal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.tantanapp.common.utils.CrashHelper;
import l.lva;
import l.o6j0;
import org.json.JSONException;
import org.json.JSONObject;
import p009l.ky0;
import p009l.my0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class AppealProgressAct extends PutongMvpAct<ky0, my0> {

    /* JADX INFO: renamed from: g */
    public static boolean f54g = true;

    /* JADX INFO: renamed from: e */
    public boolean f55e;

    /* JADX INFO: renamed from: f */
    public String f56f = "";

    /* JADX INFO: renamed from: Y1 */
    public static Intent m70Y1(Context context) {
        f54g = true;
        return new Intent(context, (Class<?>) AppealProgressAct.class);
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m71Z1(Context context, boolean z) {
        f54g = z;
        return new Intent(context, (Class<?>) AppealProgressAct.class);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ky0 m72V1() {
        return new ky0(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public my0 m73X1() {
        return new my0(this);
    }

    public void finish() {
        if (this.f55e) {
            Act act = ((Act) this).act;
            act.startActivity(lva.f(act));
        } else if (f54g) {
            Act act2 = ((Act) this).act;
            act2.startActivity(lva.q(act2));
        }
        super/*com.p1.mobile.android.app.Act*/.finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initPageHelper() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initPageHelper();
        this.f56f = getIntent().getStringExtra("project_type_extra");
        JSONObject jSONObject = new JSONObject();
        try {
            if (TextUtils.equals(this.f56f, "forbid_chat_appeal")) {
                jSONObject.put("appeal_type", "forbid_chat_appeal");
            } else {
                jSONObject.put("appeal_type", "fake-appeal");
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        ((PutongAct) this).pageHelper.o(jSONObject);
    }

    public void initSubscription() {
        super.initSubscription();
        ((ky0) ((PutongMvpAct) this).c).m17615a0();
    }

    public void onBackPressed() {
        super/*androidx.activity.ComponentActivity*/.onBackPressed();
        o6j0.c("e_p_appeal_submit_succeed_back", pageId(), new o6j0.a[0]);
    }

    public String pageId() {
        return "p_appeal_submit_succeed";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        this.f55e = getIntent().getBooleanExtra("needJumpNewMainCard", false);
        setSwipeBackEnable(false);
    }
}
