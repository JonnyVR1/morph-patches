package com.p046p1.mobile.putong.core.p053ui.messages.redpacket;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.core.data.Message;
import p149l.elc0;
import p149l.slc0;
import p149l.szb0;

/* JADX INFO: loaded from: classes4.dex */
public class RedPacketRecordAct extends PutongCoreMvpAct<elc0, slc0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49745Z1(Context context, Message message, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) RedPacketRecordAct.class);
        intent.putExtra("msg", message);
        intent.putExtra("red_packet_id", str);
        intent.putExtra(FirebaseAnalytics.Param.GROUP_ID, str2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public elc0 mo29951X1() {
        return new elc0(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public slc0 mo29952Y1() {
        return new slc0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        if (((slc0) this.f17565e).m184772A()) {
            act().overridePendingTransition(szb0.f167031f, szb0.f167033h);
        } else {
            act().overridePendingTransition(szb0.f167028c, szb0.f167029d);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (((slc0) this.f17565e).m184772A()) {
            super.onBackPressed();
        } else {
            ((slc0) this.f17565e).m184791U();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        ((elc0) this.f17564d).m117108q0((Message) getIntent().getSerializableExtra("msg"), getIntent().getStringExtra("red_packet_id"), getIntent().getStringExtra(FirebaseAnalytics.Param.GROUP_ID));
        super.preCreateView(bundle);
    }
}
