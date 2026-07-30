package com.p051p1.mobile.putong.core.newui.suggest;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.data.ActionPageFormat;
import p153l.i3h0;
import p153l.j3h0;

/* JADX INFO: loaded from: classes11.dex */
public class SuggestersAct extends PutongMvpAct<i3h0, j3h0> {

    /* JADX INFO: renamed from: e */
    public static String f27659e = "pageFormat";

    /* JADX INFO: renamed from: c2 */
    public static void m44778c2(Context context, ActionPageFormat actionPageFormat) {
        Intent intent = new Intent(context, (Class<?>) SuggestersAct.class);
        intent.putExtra(f27659e, actionPageFormat);
        context.startActivity(intent);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public i3h0 mo29671X1() {
        return new i3h0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public j3h0 mo29672Y1() {
        return new j3h0(this);
    }

    /* JADX INFO: renamed from: b2 */
    public void m44781b2(boolean z) {
        ((i3h0) this.f17891c).m138296n0(z);
    }
}
