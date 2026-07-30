package p009l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalCardStylePushView;
import com.p000p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c4g0;
import l.e30;
import l.f6c0;
import l.j2e0;
import l.j760;
import l.mkd0;
import l.v930;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class pym extends aym<LiveInternalCardStylePushView> {

    /* JADX INFO: renamed from: b */
    public c4g0 f18969b;

    public pym(zxm zxmVar) {
        super(zxmVar);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m20775n(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m20777q(View view, zxm zxmVar, TabName tabName) {
        m20779t(view, zxmVar);
    }

    /* JADX INFO: renamed from: r */
    public static void m20778r(zxm zxmVar) {
        if (TextUtils.isEmpty(zxmVar.f24025k.link) || zxmVar.f24027m == null) {
            return;
        }
        String str = zxmVar.f24025k.link;
        if (str != null && !str.contains("source=")) {
            zxmVar.f24025k.link = zxmVar.f24025k.link + "&source=start-push";
        }
        String str2 = zxmVar.f24025k.link;
        if (str2 != null && !str2.contains("from=")) {
            zxmVar.f24025k.link = zxmVar.f24025k.link + "&from=from_in_app_push";
        }
        j2e0.m(zxmVar.f24027m, Uri.parse(zxmVar.f24025k.link));
        j760 j760VarY = vwb.Y("liveId", zxmVar.f24024j.liveId);
        String str3 = zxmVar.f24024j.userId;
        if (str3 == null) {
            str3 = "NA";
        }
        zvf0.u("e_live_room_enter", "p_live_inner_broadcast", new j760[]{j760VarY, vwb.Y("anchorId", str3), vwb.Y("index", "NA"), vwb.Y("show_label", ""), vwb.Y("module", "page"), vwb.Y("right_recommend_type", ""), vwb.Y("live_status", "on"), vwb.Y("trace_id", ""), vwb.Y("broadcast_page_id", zxmVar.m26112K()), vwb.Y("liveRecommendCategory", TextUtils.isEmpty(zxmVar.f24024j.category) ? "NA" : zxmVar.f24024j.category)});
    }

    /* JADX INFO: renamed from: t */
    private void m20779t(View view, zxm zxmVar) {
        boolean zM20782u = m20782u(zxmVar);
        view.setVisibility(zM20782u ? 0 : 4);
        if (NullChecker.a(zxmVar.f24028n)) {
            zxmVar.f24028n.setTouchable(zM20782u);
            zxmVar.f24028n.update();
        }
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: b */
    public int mo11771b() {
        return 30000;
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo1854c(Act act) {
        return ((LiveInternalCardStylePushView) o7r.m19649a(act).inflate(f6c0.o6, (ViewGroup) null, false)).m1835l(this);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: f */
    public void mo1857f() {
        m20778r(this.f9776a);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: g */
    public void mo11772g(uys uysVar) {
        super.mo11772g(uysVar);
        mkd0.z(this.f18969b);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: h */
    public void mo1858h() {
        CoreModule.Q().m9015Ir("exposure", this.f9776a.f24024j.source);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: i */
    public void mo1859i(uys uysVar) {
        if (uysVar.isShowing()) {
            uysVar.dismiss();
        }
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo1861k() {
        return m20782u(this.f9776a);
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: l */
    public void mo1862l() {
        if (m20780p().isEmpty()) {
            j760 j760VarY = vwb.Y("liveId", this.f9776a.f24024j.liveId);
            String str = this.f9776a.f24024j.userId;
            if (str == null) {
                str = "NA";
            }
            zvf0.A("e_live_room_enter", "p_live_inner_broadcast", new j760[]{j760VarY, vwb.Y("anchorId", str), vwb.Y("index", "NA"), vwb.Y("show_label", ""), vwb.Y("module", "page"), vwb.Y("right_recommend_type", ""), vwb.Y("live_status", "on"), vwb.Y("trace_id", ""), vwb.Y("broadcast_page_id", this.f9776a.m26112K()), vwb.Y("liveRecommendCategory", TextUtils.isEmpty(this.f9776a.f24024j.category) ? "NA" : this.f9776a.f24024j.category)});
        }
    }

    /* JADX INFO: renamed from: p */
    public String m20780p() {
        return this.f9776a.f24025k.messageCustom.alertId;
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo1860j(LiveInternalCardStylePushView liveInternalCardStylePushView) {
        zxm zxmVar = this.f9776a;
        liveInternalCardStylePushView.mo1802b(zxmVar.f24025k, zxmVar.f24023i.act());
        xdl0.M(liveInternalCardStylePushView, m20782u(this.f9776a));
        this.f18969b = m20783v(liveInternalCardStylePushView, this.f9776a);
    }

    /* JADX INFO: renamed from: u */
    public boolean m20782u(zxm zxmVar) {
        String str = zxmVar.f24025k.messageCustom.tabId;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList = vwb.R(str.split(","), new w9j() { // from class: l.mym
                public final Object call(Object obj) {
                    return ((String) obj).replace("message", "msg");
                }
            });
        }
        return arrayList.contains(v930.h().toString());
    }

    /* JADX INFO: renamed from: v */
    public c4g0 m20783v(final View view, final zxm zxmVar) {
        return v930.k().distinctUntilChanged().skip(1).subscribe(mkd0.H(new e30() { // from class: l.nym
            public final void call(Object obj) {
                this.f17766a.m20777q(view, zxmVar, (TabName) obj);
            }
        }, new e30() { // from class: l.oym
            public final void call(Object obj) {
                pym.m20775n((Throwable) obj);
            }
        }));
    }

    @Override // p009l.aym
    /* JADX INFO: renamed from: e */
    public void mo1856e() {
    }
}
