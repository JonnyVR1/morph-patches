package com.p051p1.mobile.putong.live.external.page.rights.manage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import p153l.fhw;

/* JADX INFO: loaded from: classes9.dex */
public class LiveRightAct extends LiveBaseAct {
    /* JADX INFO: renamed from: X1 */
    public static Intent m71834X1(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        fhw.m125605a("LiveRightAct", "liveType:" + str5);
        Intent intent = new Intent(context, (Class<?>) LiveRightAct.class);
        Bundle bundle = new Bundle();
        if (!TextUtils.isEmpty(str)) {
            bundle.putString("liveId", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            bundle.putString("roomId", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            bundle.putString("anchor_name", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            bundle.putString("anchor_id", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            bundle.putString("live_type", str5);
        }
        if (!TextUtils.isEmpty(str6)) {
            bundle.putString("live_mode", str6);
        }
        intent.putExtras(bundle);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m71835Y1(Context context) {
        m71836Z1(context, "", "", "", "", "live", "");
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m71836Z1(Context context, String str, String str2, String str3, String str4, String str5, String str6) {
        context.startActivity(m71834X1(context, str, str2, str3, str4, str5, str6));
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle extras = getIntent().getExtras();
        if (fragmentManager().m2555h0(R.id.content) != null) {
            return null;
        }
        fragmentManager().m2568m().m2812s(R.id.content, LiveRightFrag.m71837M4(extras)).mo2708i();
        fragmentManager().m2546e0();
        return null;
    }
}
