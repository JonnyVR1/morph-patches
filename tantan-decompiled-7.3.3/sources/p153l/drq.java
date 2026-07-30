package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;

/* JADX INFO: loaded from: classes10.dex */
public class drq implements vvl {

    /* JADX INFO: renamed from: a */
    public String f90411a;

    /* JADX INFO: renamed from: b */
    public String f90412b;

    /* JADX INFO: renamed from: c */
    public y20<String> f90413c;

    /* JADX INFO: renamed from: l.drq$a */
    public class C16612a implements aiv.C15716a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ aiv.C15716a.a f90414a;

        public C16612a(aiv.C15716a.a aVar) {
            this.f90414a = aVar;
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: a */
        public void mo68349a(BLiveGivenGiftBrief bLiveGivenGiftBrief) {
            this.f90414a.mo68349a(bLiveGivenGiftBrief);
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: b */
        public void mo68350b() {
            this.f90414a.mo68350b();
        }

        @Override // p153l.aiv.C15716a.a
        /* JADX INFO: renamed from: c */
        public void mo68351c() {
            this.f90414a.mo68351c();
        }
    }

    public drq(String str, String str2, y20<String> y20Var) {
        this.f90411a = str;
        this.f90412b = str2;
        this.f90413c = y20Var;
    }

    @Override // p153l.vvl
    /* JADX INFO: renamed from: a */
    public void mo111569a(i6t i6tVar, String str, aiv.C15716a.a aVar) {
        i6tVar.m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136084u(str, new C16612a(aVar), 1, "fans_club", "join_club", BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("fans"))).m136080B("js").m136083t());
    }

    @Override // p153l.vvl
    /* JADX INFO: renamed from: b */
    public ppq mo111570b() {
        if (TextUtils.equals(this.f90411a, "joinFanBase")) {
            return new ppq(this.f90412b, this.f90413c);
        }
        return null;
    }
}
