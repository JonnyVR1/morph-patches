package com.p000p1.mobile.putong.core.newui.suggest;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.data.ActionPageFormat;
import java.io.Serializable;
import p009l.avg0;
import p009l.bvg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class SuggestersAct extends PutongMvpAct<avg0, bvg0> {

    /* JADX INFO: renamed from: e */
    public static String f5589e = "pageFormat";

    /* JADX INFO: renamed from: b2 */
    public static void m7838b2(Context context, ActionPageFormat actionPageFormat) {
        Intent intent = new Intent(context, (Class<?>) SuggestersAct.class);
        intent.putExtra(f5589e, (Serializable) actionPageFormat);
        context.startActivity(intent);
    }

    /* JADX INFO: renamed from: Y1, reason: merged with bridge method [inline-methods] */
    public avg0 m7839V1() {
        return new avg0(this);
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public bvg0 m7840X1() {
        return new bvg0(this);
    }

    /* JADX INFO: renamed from: a2 */
    public void m7843a2(boolean z) {
        ((avg0) ((PutongMvpAct) this).c).m11668n0(z);
    }
}
