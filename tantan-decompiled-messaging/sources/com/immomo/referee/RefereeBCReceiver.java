package com.immomo.referee;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Process;
import android.text.TextUtils;
import org.json.JSONObject;
import p149l.cmc0;
import p149l.dmc0;

/* JADX INFO: loaded from: classes7.dex */
public class RefereeBCReceiver extends BroadcastReceiver {
    public static final String KEY_REFEREE_STRING = "referee_key_referee_string";
    public static final String KEY_SWITCH = "key_switch";
    public static final String SET_REFEREE_SWITCH_ACTION = "set_switch_referee_broadcast";
    public static final String SWITCH_REFEREE_ACTION = "switch_referee_broadcast";
    public static final String URL_SET_ACTION = "referee_url_set_broadcast";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        int intExtra;
        cmc0.m107607b("jarek referee broadcast in process:" + Process.myPid());
        if (intent == null) {
            return;
        }
        if (!URL_SET_ACTION.equals(intent.getAction())) {
            if (SWITCH_REFEREE_ACTION.equals(intent.getAction())) {
                cmc0.m107607b("referee stop bc got");
                dmc0.m112455e().m112463j(!dmc0.m112455e().m112462i());
                return;
            } else {
                if (!SET_REFEREE_SWITCH_ACTION.equals(intent.getAction()) || (intExtra = intent.getIntExtra(KEY_SWITCH, -1)) == -1) {
                    return;
                }
                dmc0.m112455e().m112463j(intExtra == 1);
                return;
            }
        }
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra(KEY_REFEREE_STRING));
            String strOptString = jSONObject.optString("refereeKey");
            int iOptInt = jSONObject.optInt("refereeFailCount", 0);
            TextUtils.isEmpty(strOptString);
            if (TextUtils.isEmpty(strOptString) || iOptInt <= 0) {
                String strOptString2 = jSONObject.optString("refereeUrl");
                if (!TextUtils.isEmpty(strOptString2)) {
                    dmc0.m112455e().m112464k(strOptString2);
                }
                dmc0.m112455e().m112457a(true, null);
            }
        } catch (Exception unused) {
        }
    }
}
