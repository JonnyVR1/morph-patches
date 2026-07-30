package p009l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import l.cfe0;
import l.e30;
import l.h4t;
import l.htl;
import l.zfv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class dpq implements htl {

    /* JADX INFO: renamed from: a */
    public String f11943a;

    /* JADX INFO: renamed from: b */
    public String f11944b;

    /* JADX INFO: renamed from: c */
    public e30<String> f11945c;

    /* JADX INFO: renamed from: l.dpq$a */
    public class C0855a implements zfv.a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zfv.a.a f11946a;

        public C0855a(zfv.a.a aVar) {
            this.f11946a = aVar;
        }

        /* JADX INFO: renamed from: a */
        public void m13435a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            this.f11946a.a(bLiveGivenGiftBrief);
        }

        /* JADX INFO: renamed from: b */
        public void m13436b() {
            this.f11946a.b();
        }

        /* JADX INFO: renamed from: c */
        public void m13437c() {
            this.f11946a.c();
        }
    }

    public dpq(String str, String str2, e30<String> e30Var) {
        this.f11943a = str;
        this.f11944b = str2;
        this.f11945c = e30Var;
    }

    /* JADX INFO: renamed from: a */
    public void m13433a(h4t h4tVar, String str, zfv.a.a aVar) {
        h4tVar.F2().SendGiftEventGroup.sendGift().j(new cfe0.a().u(str, new C0855a(aVar), 1, "fans_club", "join_club", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans"))).B("js").t());
    }

    /* JADX INFO: renamed from: b */
    public qnq m13434b() {
        if (TextUtils.equals(this.f11943a, "joinFanBase")) {
            return new qnq(this.f11944b, this.f11945c);
        }
        return null;
    }
}
