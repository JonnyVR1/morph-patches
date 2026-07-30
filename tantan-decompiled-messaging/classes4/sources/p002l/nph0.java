package p002l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.base.data.BLiveStreamUrl;
import java.util.Map;
import l.bul;
import l.cul;
import l.e30;
import l.mqi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nph0 {

    /* JADX INFO: renamed from: a */
    public cul f16144a;

    /* JADX INFO: renamed from: b */
    public l6t f16145b;

    /* JADX INFO: renamed from: c */
    public boolean f16146c = true;

    /* JADX INFO: renamed from: l.nph0$a */
    public class C0707a extends nt10 {
        public C0707a() {
        }

        @Override // p002l.nt10
        /* JADX INFO: renamed from: a */
        public void mo18909a(boolean z) {
            nph0.this.m18902t(z);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m18887e(String str) {
        l6t l6tVar = new l6t(new C0707a());
        this.f16145b = l6tVar;
        l6tVar.m17031m(str);
    }

    /* JADX INFO: renamed from: f */
    public void m18888f() {
        this.f16144a = null;
    }

    /* JADX INFO: renamed from: g */
    public cul m18889g() {
        return this.f16144a;
    }

    /* JADX INFO: renamed from: h */
    public float m18890h() {
        if (m18891i()) {
            return this.f16144a.k();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m18891i() {
        return this.f16144a != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m18892j() {
        cul culVar = this.f16144a;
        return culVar != null && culVar.isPlaying();
    }

    /* JADX INFO: renamed from: k */
    public boolean m18893k() {
        cul culVar = this.f16144a;
        return culVar != null && culVar.e();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m18894l(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f16146c));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m18895m(int i, Map map) {
        map.put("error_msg", "errorMsg" + i);
        map.put("is_first_try", Boolean.valueOf(this.f16146c));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m18896n(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f16146c));
    }

    /* JADX INFO: renamed from: o */
    public int m18897o(BLiveAbsData bLiveAbsData, FrameLayout frameLayout, bul bulVar, String str, String str2) {
        cul culVar = this.f16144a;
        if (culVar == null) {
            return -1;
        }
        if (frameLayout != null) {
            culVar.f(frameLayout);
        }
        this.f16144a.c(bulVar);
        if (TextUtils.equals(this.f16144a.i(), bLiveAbsData.streamUrl.pullFlv) && this.f16144a.e()) {
            if (this.f16144a.isPlaying()) {
                bulVar.p0();
            }
            return 0;
        }
        if (this.f16144a.isPlaying()) {
            m18903u(true);
        }
        m18900r(bLiveAbsData, str, str2);
        this.f16144a.l(str, str2, bLiveAbsData);
        cul culVar2 = this.f16144a;
        BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
        culVar2.j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLiveAbsData.room.id, String.valueOf(bLiveAbsData.streamCdnInfo.provider), String.valueOf(bLiveAbsData.streamCdnInfo.businessType));
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void m18898p(c880 c880Var) {
        eet.m12448b(c880Var, "audience_player_success", new e30() { // from class: l.jph0
            public final void call(Object obj) {
                this.f13977a.m18894l((Map) obj);
            }
        });
        this.f16146c = true;
        final long jO = mqi0.o() - r9d0.f18419l;
        eet.m12449c(c880Var, "audience_first_frame_loaded", new e30() { // from class: l.kph0
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jO));
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m18899q(c880 c880Var, final int i) {
        eet.m12448b(c880Var, "audience_player_error", new e30() { // from class: l.mph0
            public final void call(Object obj) {
                this.f15517a.m18895m(i, (Map) obj);
            }
        });
        this.f16146c = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m18900r(BLiveAbsData bLiveAbsData, String str, String str2) {
        eet.m12447a("audience_player_start", false, str, str2, bLiveAbsData, new e30() { // from class: l.lph0
            public final void call(Object obj) {
                this.f14979a.m18896n((Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m18901s() {
        this.f16146c = true;
    }

    /* JADX INFO: renamed from: t */
    public void m18902t(boolean z) {
        cul culVar = this.f16144a;
        if (culVar == null) {
            return;
        }
        culVar.setMute(z);
    }

    /* JADX INFO: renamed from: u */
    public void m18903u(boolean z) {
        cul culVar = this.f16144a;
        if (culVar != null) {
            culVar.b(z);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m18904v() {
        cul culVar = this.f16144a;
        if (culVar != null) {
            culVar.b(true);
            this.f16144a.reset();
        }
    }

    /* JADX INFO: renamed from: w */
    public cul m18905w() {
        cul culVar = this.f16144a;
        if (culVar == null) {
            return null;
        }
        this.f16144a = null;
        return culVar;
    }

    /* JADX INFO: renamed from: x */
    public void m18906x() {
        l6t l6tVar = this.f16145b;
        if (l6tVar != null) {
            l6tVar.m17022d();
            this.f16145b = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m18907y(cul culVar) {
        this.f16144a = culVar;
    }

    /* JADX INFO: renamed from: z */
    public void m18908z(FrameLayout frameLayout) {
        cul culVar = this.f16144a;
        if (culVar != null) {
            culVar.g(false);
            this.f16144a.d(frameLayout);
        }
    }
}
