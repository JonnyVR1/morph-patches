package com.p051p1.mobile.putong.live.external.internal.vchat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongAct;
import p153l.jwk0;

/* JADX INFO: loaded from: classes9.dex */
public class IntentBridgeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public static String f45892c = "intent";

    /* JADX INFO: renamed from: X1 */
    public static Intent m70343X1(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra(f45892c, str);
        intent.setClass(context, IntentBridgeAct.class);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if ("video.chat.notify.push".equals(getIntent().getStringExtra(f45892c))) {
            jwk0.m147168b(this.act);
            lambda$debugItems$19();
        }
    }
}
