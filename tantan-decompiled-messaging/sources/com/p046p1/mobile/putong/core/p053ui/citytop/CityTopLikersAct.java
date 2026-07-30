package com.p046p1.mobile.putong.core.p053ui.citytop;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import p149l.d75;
import p149l.l55;

/* JADX INFO: loaded from: classes10.dex */
public class CityTopLikersAct extends PutongMvpAct<C8299a, d75> {

    /* JADX INFO: renamed from: e */
    public l55 f28713e;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m44584Y1(Context context) {
        return new Intent(context, (Class<?>) CityTopLikersAct.class);
    }

    /* JADX INFO: renamed from: Z1 */
    public l55 m44585Z1() {
        if (this.f28713e == null) {
            this.f28713e = new l55((C8299a) this.f17172c);
        }
        return this.f28713e;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public C8299a mo28672V1() {
        return new C8299a(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public d75 mo28673X1() {
        return new d75(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_city_cover_received_greet";
    }
}
