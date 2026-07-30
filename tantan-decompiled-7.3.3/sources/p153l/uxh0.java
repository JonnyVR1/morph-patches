package p153l;

import android.text.TextUtils;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveStreamUrl;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class uxh0 {

    /* JADX INFO: renamed from: a */
    public qwl f181450a;

    /* JADX INFO: renamed from: b */
    public m8t f181451b;

    /* JADX INFO: renamed from: c */
    public boolean f181452c = true;

    /* JADX INFO: renamed from: l.uxh0$a */
    public class C20692a extends v120 {
        public C20692a() {
        }

        @Override // p153l.v120
        /* JADX INFO: renamed from: a */
        public void mo174618a(boolean z) {
            uxh0.this.m198476t(z);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m198461e(String str) {
        m8t m8tVar = new m8t(new C20692a());
        this.f181451b = m8tVar;
        m8tVar.m157511m(str);
    }

    /* JADX INFO: renamed from: f */
    public void m198462f() {
        this.f181450a = null;
    }

    /* JADX INFO: renamed from: g */
    public qwl m198463g() {
        return this.f181450a;
    }

    /* JADX INFO: renamed from: h */
    public float m198464h() {
        if (m198465i()) {
            return this.f181450a.mo178531k();
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: i */
    public boolean m198465i() {
        return this.f181450a != null;
    }

    /* JADX INFO: renamed from: j */
    public boolean m198466j() {
        qwl qwlVar = this.f181450a;
        return qwlVar != null && qwlVar.isPlaying();
    }

    /* JADX INFO: renamed from: k */
    public boolean m198467k() {
        qwl qwlVar = this.f181450a;
        return qwlVar != null && qwlVar.mo178525e();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m198468l(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f181452c));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m198469m(int i, Map map) {
        map.put("error_msg", "errorMsg" + i);
        map.put("is_first_try", Boolean.valueOf(this.f181452c));
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m198470n(Map map) {
        map.put("is_first_try", Boolean.valueOf(this.f181452c));
    }

    /* JADX INFO: renamed from: o */
    public int m198471o(BLiveAbsData bLiveAbsData, FrameLayout frameLayout, pwl pwlVar, String str, String str2) {
        qwl qwlVar = this.f181450a;
        if (qwlVar == null) {
            return -1;
        }
        if (frameLayout != null) {
            qwlVar.mo178526f(frameLayout);
        }
        this.f181450a.mo178523c(pwlVar);
        if (TextUtils.equals(this.f181450a.mo178529i(), bLiveAbsData.streamUrl.pullFlv) && this.f181450a.mo178525e()) {
            if (this.f181450a.isPlaying()) {
                pwlVar.mo139898p0();
            }
            return 0;
        }
        if (this.f181450a.isPlaying()) {
            m198477u(true);
        }
        m198474r(bLiveAbsData, str, str2);
        this.f181450a.mo178532l(str, str2, bLiveAbsData);
        qwl qwlVar2 = this.f181450a;
        BLiveStreamUrl bLiveStreamUrl = bLiveAbsData.streamUrl;
        qwlVar2.mo178530j(bLiveStreamUrl.pullFlv, bLiveStreamUrl.pullFlvIpv6, bLiveAbsData.room.f45267id, String.valueOf(bLiveAbsData.streamCdnInfo.provider), String.valueOf(bLiveAbsData.streamCdnInfo.businessType));
        return 0;
    }

    /* JADX INFO: renamed from: p */
    public void m198472p(ig80 ig80Var) {
        fgt.m125530b(ig80Var, "audience_player_success", new y20() { // from class: l.qxh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160047a.m198468l((Map) obj);
            }
        });
        this.f181452c = true;
        final long jM174454o = pzi0.m174454o() - uhd0.f179016l;
        fgt.m125531c(ig80Var, "audience_first_frame_loaded", new y20() { // from class: l.rxh0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((Map) obj).put("watch_duration", Long.valueOf(jM174454o));
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public void m198473q(ig80 ig80Var, final int i) {
        fgt.m125530b(ig80Var, "audience_player_error", new y20() { // from class: l.txh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176560a.m198469m(i, (Map) obj);
            }
        });
        this.f181452c = false;
    }

    /* JADX INFO: renamed from: r */
    public final void m198474r(BLiveAbsData bLiveAbsData, String str, String str2) {
        fgt.m125529a("audience_player_start", false, str, str2, bLiveAbsData, new y20() { // from class: l.sxh0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171138a.m198470n((Map) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s */
    public void m198475s() {
        this.f181452c = true;
    }

    /* JADX INFO: renamed from: t */
    public void m198476t(boolean z) {
        qwl qwlVar = this.f181450a;
        if (qwlVar == null) {
            return;
        }
        qwlVar.setMute(z);
    }

    /* JADX INFO: renamed from: u */
    public void m198477u(boolean z) {
        qwl qwlVar = this.f181450a;
        if (qwlVar != null) {
            qwlVar.mo178522b(z);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m198478v() {
        qwl qwlVar = this.f181450a;
        if (qwlVar != null) {
            qwlVar.mo178522b(true);
            this.f181450a.reset();
        }
    }

    /* JADX INFO: renamed from: w */
    public qwl m198479w() {
        qwl qwlVar = this.f181450a;
        if (qwlVar == null) {
            return null;
        }
        this.f181450a = null;
        return qwlVar;
    }

    /* JADX INFO: renamed from: x */
    public void m198480x() {
        m8t m8tVar = this.f181451b;
        if (m8tVar != null) {
            m8tVar.m157502d();
            this.f181451b = null;
        }
    }

    /* JADX INFO: renamed from: y */
    public void m198481y(qwl qwlVar) {
        this.f181450a = qwlVar;
    }

    /* JADX INFO: renamed from: z */
    public void m198482z(FrameLayout frameLayout) {
        qwl qwlVar = this.f181450a;
        if (qwlVar != null) {
            qwlVar.mo178527g(false);
            this.f181450a.mo178524d(frameLayout);
        }
    }
}
