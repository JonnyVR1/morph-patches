package com.p000p1.mobile.putong.core.p001ui.citytop;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.app.PutongMvpAct;
import p003l.d75;
import p003l.l55;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CityTopLikersAct extends PutongMvpAct<C3074a, d75> {

    /* JADX INFO: renamed from: e */
    public l55 f1107e;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m1886Y1(Context context) {
        return new Intent(context, (Class<?>) CityTopLikersAct.class);
    }

    /* JADX INFO: renamed from: Z1 */
    public l55 m1889Z1() {
        if (this.f1107e == null) {
            this.f1107e = new l55((C3074a) ((PutongMvpAct) this).c);
        }
        return this.f1107e;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public C3074a m1887V1() {
        return new C3074a(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public d75 m1888X1() {
        return new d75(this);
    }

    public String pageId() {
        return "p_city_cover_received_greet";
    }
}
