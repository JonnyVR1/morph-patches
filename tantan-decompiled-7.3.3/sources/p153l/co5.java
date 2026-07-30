package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import java.util.Objects;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class co5 implements vvl {

    /* JADX INFO: renamed from: a */
    public final String f82807a;

    /* JADX INFO: renamed from: b */
    public final String f82808b;

    /* JADX INFO: renamed from: c */
    public final y20<String> f82809c;

    public co5(String str, String str2, y20<String> y20Var) {
        this.f82807a = str;
        this.f82808b = str2;
        this.f82809c = y20Var;
    }

    @Override // p153l.vvl
    /* JADX INFO: renamed from: a */
    public void mo111569a(i6t i6tVar, String str, final aiv.C15716a.a aVar) {
        v3f.C20736d<hne0, C22421c<hne0>> c20736dSendGift = i6tVar.m213811F2().SendGiftEventGroup.sendGift();
        hne0.C17513a c17513a = new hne0.C17513a();
        BLiveGiftItem bLiveGiftItemM135161m = ((hiv) zrv.m221194l(htd0.f111521c)).m135161m(str);
        Objects.requireNonNull(aVar);
        c20736dSendGift.mo199273j(c17513a.m136086w(bLiveGiftItemM135161m, new zn5(aVar), new y20() { // from class: l.ao5
            @Override // p153l.y20
            public final void call(Object obj) {
                aVar.mo68351c();
            }
        }, new y20() { // from class: l.bo5
            @Override // p153l.y20
            public final void call(Object obj) {
                aVar.mo68351c();
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans"))));
    }

    @Override // p153l.vvl
    /* JADX INFO: renamed from: b */
    public ppq mo111570b() {
        return new ppq(this.f82808b, this.f82809c);
    }
}
