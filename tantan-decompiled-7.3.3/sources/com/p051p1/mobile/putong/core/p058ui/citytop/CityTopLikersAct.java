package com.p051p1.mobile.putong.core.p058ui.citytop;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import p153l.e85;
import p153l.m65;

/* JADX INFO: loaded from: classes9.dex */
public class CityTopLikersAct extends PutongMvpAct<C8462a, e85> {

    /* JADX INFO: renamed from: e */
    public m65 f29561e;

    /* JADX INFO: renamed from: Z1 */
    public static Intent m45767Z1(Context context) {
        return new Intent(context, (Class<?>) CityTopLikersAct.class);
    }

    /* JADX INFO: renamed from: a2 */
    public m65 m45768a2() {
        if (this.f29561e == null) {
            this.f29561e = new m65((C8462a) this.f17891c);
        }
        return this.f29561e;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public C8462a mo29671X1() {
        return new C8462a(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public e85 mo29672Y1() {
        return new e85(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_city_cover_received_greet";
    }
}
