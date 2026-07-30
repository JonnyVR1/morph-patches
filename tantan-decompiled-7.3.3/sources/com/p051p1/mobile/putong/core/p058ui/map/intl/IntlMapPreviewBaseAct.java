package com.p051p1.mobile.putong.core.p058ui.map.intl;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.map.IntlMapPreviewAct;
import com.p051p1.mobile.putong.data.MessageLocation;
import p153l.bdo;
import p153l.edo;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IntlMapPreviewBaseAct extends PutongMvpAct<bdo, edo> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m48581Z1(Context context, MessageLocation messageLocation) {
        Intent intent = new Intent(context, (Class<?>) IntlMapPreviewAct.class);
        intent.putExtra("location", messageLocation);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public abstract void mo36968a2(MessageLocation messageLocation, double d, double d2);

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public bdo mo29671X1() {
        return new bdo(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public edo mo29672Y1() {
        return new edo(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((bdo) this.f17891c).m103618h0((MessageLocation) getIntent().getSerializableExtra("location"));
    }
}
