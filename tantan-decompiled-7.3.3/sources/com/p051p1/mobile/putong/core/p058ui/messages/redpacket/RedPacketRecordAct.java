package com.p051p1.mobile.putong.core.p058ui.messages.redpacket;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.core.data.Message;
import p153l.ltc0;
import p153l.y7c0;
import p153l.ztc0;

/* JADX INFO: loaded from: classes4.dex */
public class RedPacketRecordAct extends PutongCoreMvpAct<ltc0, ztc0> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50928a2(Context context, Message message, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) RedPacketRecordAct.class);
        intent.putExtra("msg", message);
        intent.putExtra("red_packet_id", str);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ltc0 mo30949Y1() {
        return new ltc0(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public ztc0 mo30950Z1() {
        return new ztc0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        if (((ztc0) this.f18284e).m221507A()) {
            act().overridePendingTransition(y7c0.f197768f, y7c0.f197770h);
        } else {
            act().overridePendingTransition(y7c0.f197765c, y7c0.f197766d);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((ztc0) this.f18284e).m221507A()) {
            super.onBackPressed();
        } else {
            ((ztc0) this.f18284e).m221526U();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        ((ltc0) this.f18283d).m155765q0((Message) getIntent().getSerializableExtra("msg"), getIntent().getStringExtra("red_packet_id"), getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID));
        super.preCreateView(bundle);
    }
}
