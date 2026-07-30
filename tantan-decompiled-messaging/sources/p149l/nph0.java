package p149l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveStreamUrl;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class nph0 {

    /* JADX INFO: renamed from: a */
    public cul f139968a;

    /* JADX INFO: renamed from: b */
    public l6t f139969b;

    /* JADX INFO: renamed from: c */
    public boolean f139970c = true;

    /* JADX INFO: renamed from: l.nph0$a */
    public class C18746a extends nt10 {
        public C18746a() {
        }

        @Override // p149l.nt10
        /* JADX INFO: renamed from: a */
        public void mo160504a(boolean z) {
            nph0.this.m160497t(z);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m160482e(String str) {
        l6t l6tVar = new l6t(new C18746a());
        this.f139969b = l6tVar;
        l6tVar.m148769m(str);
    }

    /* JADX INFO: renamed from: f */
    public void m160483f() {
        this.f139968a = null;
    }

    /* JADX INFO: renamed from: g */
    public cul m160484g() {
        return this.f139968a;
    }

    /* JADX INFO: renamed from: h */
    public float m160485h() {
        if (m160486i()) {
            return this.f139968a.mo108799k();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m160486i() {
        return this.f139968a != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m160487j() {
        cul culVar = this.f139968a;
        return culVar != null && culVar.isPlaying();
    }

    /* JADX INFO: renamed from: k */
    public boolean m160488k() {
        cul culVar = this.f139968a;
        return culVar != null && culVar.mo108793e();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m160489l(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f139970c));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m160490m(int i, Map map) {
        map.put("error_msg", "errorMsg" + i);
        map.put("is_first_try", Boolean.valueOf(this.f139970c));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m160491n(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f139970c));
    }

    /* JADX INFO: renamed from: o */
    public int m160492o(BLiveAbsData bLiveAbsData, FrameLayout frameLayout, bul bulVar, String str, String str2) {
        cul culVar = this.f139968a;
        if (culVar == null) {
            return -1;
        }
        if (frameLayout != null) {
            culVar.mo108794f(frameLayout);
        }
        this.f139968a.mo108791c(bulVar);
        if (TextUtils.equals(this.f139968a.mo108797i(), bLiveAbsData.streamUrl.pullFlv) && this.f139968a.mo108793e()) {
            if (this.f139968a.isPlaying()) {
                bulVar.mo103941p0();
            }
            return 0;
        }
        if (this.f139968a.isPlaying()) {
            m160498u(true);
        }
        m160495r(bLiveAbsData, str, str2);
        this.f139968a.mo108800l(str, str2, bLiveAbsData);
        cul culVar2 = this.f139968a;
        BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
        culVar2.mo108798j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLiveAbsData.room.f44419id, String.valueOf(bLiveAbsData.streamCdnInfo.provider), String.valueOf(bLiveAbsData.streamCdnInfo.businessType));
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void m160493p(c880 c880Var) {
        eet.m116003b(c880Var, "audience_player_success", new e30() { // from class: l.jph0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119188a.m160489l((Map) obj);
            }
        });
        this.f139970c = true;
        final long jM155944o = mqi0.m155944o() - r9d0.f158355l;
        eet.m116004c(c880Var, "audience_first_frame_loaded", new e30() { // from class: l.kph0
            @Override // p149l.e30
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jM155944o));
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m160494q(c880 c880Var, final int i) {
        eet.m116003b(c880Var, "audience_player_error", new e30() { // from class: l.mph0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135047a.m160490m(i, (Map) obj);
            }
        });
        this.f139970c = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m160495r(BLiveAbsData bLiveAbsData, String str, String str2) {
        eet.m116002a("audience_player_start", false, str, str2, bLiveAbsData, new e30() { // from class: l.lph0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129216a.m160491n((Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m160496s() {
        this.f139970c = true;
    }

    /* JADX INFO: renamed from: t */
    public void m160497t(boolean z) {
        cul culVar = this.f139968a;
        if (culVar == null) {
            return;
        }
        culVar.setMute(z);
    }

    /* JADX INFO: renamed from: u */
    public void m160498u(boolean z) {
        cul culVar = this.f139968a;
        if (culVar != null) {
            culVar.mo108790b(z);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m160499v() {
        cul culVar = this.f139968a;
        if (culVar != null) {
            culVar.mo108790b(true);
            this.f139968a.reset();
        }
    }

    /* JADX INFO: renamed from: w */
    public cul m160500w() {
        cul culVar = this.f139968a;
        if (culVar == null) {
            return null;
        }
        this.f139968a = null;
        return culVar;
    }

    /* JADX INFO: renamed from: x */
    public void m160501x() {
        l6t l6tVar = this.f139969b;
        if (l6tVar != null) {
            l6tVar.m148760d();
            this.f139969b = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m160502y(cul culVar) {
        this.f139968a = culVar;
    }

    /* JADX INFO: renamed from: z */
    public void m160503z(FrameLayout frameLayout) {
        cul culVar = this.f139968a;
        if (culVar != null) {
            culVar.mo108795g(false);
            this.f139968a.mo108792d(frameLayout);
        }
    }
}
