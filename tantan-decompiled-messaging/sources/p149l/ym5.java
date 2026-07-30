package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import java.util.Objects;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class ym5 implements htl {

    /* JADX INFO: renamed from: a */
    public final String f198959a;

    /* JADX INFO: renamed from: b */
    public final String f198960b;

    /* JADX INFO: renamed from: c */
    public final e30<String> f198961c;

    public ym5(String str, String str2, e30<String> e30Var) {
        this.f198959a = str;
        this.f198960b = str2;
        this.f198961c = e30Var;
    }

    @Override // p149l.htl
    /* JADX INFO: renamed from: a */
    public void mo112922a(h4t h4tVar, String str, final zfv.C21687a.a aVar) {
        q2f.C19397d<cfe0, C22306c<cfe0>> c19397dSendGift = h4tVar.m206028F2().SendGiftEventGroup.sendGift();
        cfe0.C16123a c16123a = new cfe0.C16123a();
        BLiveGiftItem bLiveGiftItemM126027m = ((ggv) ypv.m215673l(fld0.f98148c)).m126027m(str);
        Objects.requireNonNull(aVar);
        c19397dSendGift.mo172463j(c16123a.m106532w(bLiveGiftItemM126027m, new vm5(aVar), new e30() { // from class: l.wm5
            @Override // p149l.e30
            public final void call(Object obj) {
                aVar.mo67168c();
            }
        }, new e30() { // from class: l.xm5
            @Override // p149l.e30
            public final void call(Object obj) {
                aVar.mo67168c();
            }
        }, true, 1, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans"))));
    }

    @Override // p149l.htl
    /* JADX INFO: renamed from: b */
    public qnq mo112923b() {
        return new qnq(this.f198960b, this.f198961c);
    }
}
