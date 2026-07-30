package com.p046p1.mobile.putong.live.external.internal.vchat;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongAct;
import p149l.dnk0;

/* JADX INFO: loaded from: classes13.dex */
public class IntentBridgeAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public static String f45044c = "intent";

    /* JADX INFO: renamed from: V1 */
    public static Intent m69160V1(Context context, String str) {
        Intent intent = new Intent();
        intent.putExtra(f45044c, str);
        intent.setClass(context, IntentBridgeAct.class);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        if ("video.chat.notify.push".equals(getIntent().getStringExtra(f45044c))) {
            dnk0.m112643b(this.act);
            lambda$debugItems$19();
        }
    }
}
