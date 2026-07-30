package com.p046p1.mobile.putong.core.newui.suggest;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.data.ActionPageFormat;
import p149l.avg0;
import p149l.bvg0;

/* JADX INFO: loaded from: classes11.dex */
public class SuggestersAct extends PutongMvpAct<avg0, bvg0> {

    /* JADX INFO: renamed from: e */
    public static String f26811e = "pageFormat";

    /* JADX INFO: renamed from: b2 */
    public static void m43592b2(Context context, ActionPageFormat actionPageFormat) {
        Intent intent = new Intent(context, (Class<?>) SuggestersAct.class);
        intent.putExtra(f26811e, actionPageFormat);
        context.startActivity(intent);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public avg0 mo28672V1() {
        return new avg0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public bvg0 mo28673X1() {
        return new bvg0(this);
    }

    /* JADX INFO: renamed from: a2 */
    public void m43595a2(boolean z) {
        ((avg0) this.f17172c).m99187n0(z);
    }
}
