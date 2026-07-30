package com.p046p1.mobile.putong.core.p053ui.map.intl;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.map.IntlMapPreviewAct;
import com.p046p1.mobile.putong.data.MessageLocation;
import p149l.bbo;
import p149l.ebo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IntlMapPreviewBaseAct extends PutongMvpAct<bbo, ebo> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m47398Y1(Context context, MessageLocation messageLocation) {
        Intent intent = new Intent(context, (Class<?>) IntlMapPreviewAct.class);
        intent.putExtra("location", messageLocation);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public abstract void mo35965Z1(MessageLocation messageLocation, double d, double d2);

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public bbo mo28672V1() {
        return new bbo(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ebo mo28673X1() {
        return new ebo(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((bbo) this.f17172c).m100993h0((MessageLocation) getIntent().getSerializableExtra("location"));
    }
}
