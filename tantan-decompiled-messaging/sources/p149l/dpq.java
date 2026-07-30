package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;

/* JADX INFO: loaded from: classes11.dex */
public class dpq implements htl {

    /* JADX INFO: renamed from: a */
    public String f87304a;

    /* JADX INFO: renamed from: b */
    public String f87305b;

    /* JADX INFO: renamed from: c */
    public e30<String> f87306c;

    /* JADX INFO: renamed from: l.dpq$a */
    public class C16425a implements zfv.C21687a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zfv.C21687a.a f87307a;

        public C16425a(zfv.C21687a.a aVar) {
            this.f87307a = aVar;
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: a */
        public void mo67166a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            this.f87307a.mo67166a(bLiveGivenGiftBrief);
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: b */
        public void mo67167b() {
            this.f87307a.mo67167b();
        }

        @Override // p149l.zfv.C21687a.a
        /* JADX INFO: renamed from: c */
        public void mo67168c() {
            this.f87307a.mo67168c();
        }
    }

    public dpq(String str, String str2, e30<String> e30Var) {
        this.f87304a = str;
        this.f87305b = str2;
        this.f87306c = e30Var;
    }

    @Override // p149l.htl
    /* JADX INFO: renamed from: a */
    public void mo112922a(h4t h4tVar, String str, zfv.C21687a.a aVar) {
        h4tVar.m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106530u(str, new C16425a(aVar), 1, "fans_club", "join_club", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans"))).m106526B("js").m106529t());
    }

    @Override // p149l.htl
    /* JADX INFO: renamed from: b */
    public qnq mo112923b() {
        if (TextUtils.equals(this.f87304a, "joinFanBase")) {
            return new qnq(this.f87305b, this.f87306c);
        }
        return null;
    }
}
