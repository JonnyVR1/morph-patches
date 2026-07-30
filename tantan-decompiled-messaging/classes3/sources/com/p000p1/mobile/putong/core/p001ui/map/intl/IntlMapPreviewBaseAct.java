package com.p000p1.mobile.putong.core.p001ui.map.intl;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.map.IntlMapPreviewAct;
import com.p1.mobile.putong.data.MessageLocation;
import java.io.Serializable;
import p003l.bbo;
import p003l.ebo;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class IntlMapPreviewBaseAct extends PutongMvpAct<bbo, ebo> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m434Y1(Context context, MessageLocation messageLocation) {
        Intent intent = new Intent(context, (Class<?>) IntlMapPreviewAct.class);
        intent.putExtra("location", (Serializable) messageLocation);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public abstract void m437Z1(MessageLocation messageLocation, double d, double d2);

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bbo m435V1() {
        return new bbo(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ebo m436X1() {
        return new ebo(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((bbo) ((PutongMvpAct) this).c).m2940h0((MessageLocation) getIntent().getSerializableExtra("location"));
    }
}
