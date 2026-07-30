package com.p000p1.mobile.putong.core.p001ui.messages.redpacket;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.core.data.Message;
import java.io.Serializable;
import l.szb0;
import p002l.elc0;
import p002l.slc0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RedPacketRecordAct extends PutongCoreMvpAct<elc0, slc0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m159Z1(Context context, Message message, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) RedPacketRecordAct.class);
        intent.putExtra("msg", (Serializable) message);
        intent.putExtra("red_packet_id", str);
        intent.putExtra("group_id", str2);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public elc0 m160X1() {
        return new elc0(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public slc0 m161Y1() {
        return new slc0(this);
    }

    public boolean disableAutoPV() {
        return true;
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (((slc0) ((PutongCoreMvpAct) this).e).m22533A()) {
            act().overridePendingTransition(szb0.f, szb0.h);
        } else {
            act().overridePendingTransition(szb0.c, szb0.d);
        }
    }

    public void onBackPressed() {
        if (((slc0) ((PutongCoreMvpAct) this).e).m22533A()) {
            super/*androidx.activity.ComponentActivity*/.onBackPressed();
        } else {
            ((slc0) ((PutongCoreMvpAct) this).e).m22553U();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        setSwipeBackEnable(false);
        ((elc0) ((PutongCoreMvpAct) this).d).m12594q0(getIntent().getSerializableExtra("msg"), getIntent().getStringExtra("red_packet_id"), getIntent().getStringExtra("group_id"));
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
    }
}
