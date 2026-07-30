package p149l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalCardStylePushView;
import com.p046p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class pym extends aym<LiveInternalCardStylePushView> {

    /* JADX INFO: renamed from: b */
    public c4g0 f151863b;

    public pym(zxm zxmVar) {
        super(zxmVar);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m172134n(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m172136q(View view, zxm zxmVar, TabName tabName) {
        m172138t(view, zxmVar);
    }

    /* JADX INFO: renamed from: r */
    public static void m172137r(zxm zxmVar) {
        if (TextUtils.isEmpty(zxmVar.f205467k.link) || zxmVar.f205469m == null) {
            return;
        }
        String str = zxmVar.f205467k.link;
        if (str != null && !str.contains("source=")) {
            zxmVar.f205467k.link = zxmVar.f205467k.link + "&source=start-push";
        }
        String str2 = zxmVar.f205467k.link;
        if (str2 != null && !str2.contains("from=")) {
            zxmVar.f205467k.link = zxmVar.f205467k.link + "&from=from_in_app_push";
        }
        j2e0.m139446m(zxmVar.f205469m, Uri.parse(zxmVar.f205467k.link));
        j760 j760VarM200311Y = vwb.m200311Y("liveId", zxmVar.f205466j.liveId);
        String str3 = zxmVar.f205466j.userId;
        if (str3 == null) {
            str3 = "NA";
        }
        zvf0.m220399u("e_live_room_enter", "p_live_inner_broadcast", j760VarM200311Y, vwb.m200311Y("anchorId", str3), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("show_label", ""), vwb.m200311Y("module", OMSTemplateModeType.page), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("live_status", "on"), vwb.m200311Y("trace_id", ""), vwb.m200311Y("broadcast_page_id", zxmVar.m220845K()), vwb.m200311Y("liveRecommendCategory", TextUtils.isEmpty(zxmVar.f205466j.category) ? "NA" : zxmVar.f205466j.category));
    }

    /* JADX INFO: renamed from: t */
    private void m172138t(View view, zxm zxmVar) {
        boolean zM172141u = m172141u(zxmVar);
        view.setVisibility(zM172141u ? 0 : 4);
        if (NullChecker.m81303a(zxmVar.f205470n)) {
            zxmVar.f205470n.setTouchable(zM172141u);
            zxmVar.f205470n.update();
        }
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: b */
    public int mo99571b() {
        return 30000;
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo37883c(Act act) {
        return ((LiveInternalCardStylePushView) o7r.m163037a(act).inflate(f6c0.f95926o6, (ViewGroup) null, false)).m37864l(this);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: f */
    public void mo37886f() {
        m172137r(this.f72298a);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: g */
    public void mo99572g(uys uysVar) {
        super.mo99572g(uysVar);
        mkd0.m154992z(this.f151863b);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: h */
    public void mo37887h() {
        CoreModule.m29936Q().mo67225Ir("exposure", this.f72298a.f205466j.source);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: i */
    public void mo37888i(uys uysVar) {
        if (uysVar.isShowing()) {
            uysVar.dismiss();
        }
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: k */
    public boolean mo37890k() {
        return m172141u(this.f72298a);
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: l */
    public void mo37891l() {
        if (m172139p().isEmpty()) {
            j760 j760VarM200311Y = vwb.m200311Y("liveId", this.f72298a.f205466j.liveId);
            String str = this.f72298a.f205466j.userId;
            if (str == null) {
                str = "NA";
            }
            zvf0.m220368A("e_live_room_enter", "p_live_inner_broadcast", j760VarM200311Y, vwb.m200311Y("anchorId", str), vwb.m200311Y(FirebaseAnalytics.Param.INDEX, "NA"), vwb.m200311Y("show_label", ""), vwb.m200311Y("module", OMSTemplateModeType.page), vwb.m200311Y("right_recommend_type", ""), vwb.m200311Y("live_status", "on"), vwb.m200311Y("trace_id", ""), vwb.m200311Y("broadcast_page_id", this.f72298a.m220845K()), vwb.m200311Y("liveRecommendCategory", TextUtils.isEmpty(this.f72298a.f205466j.category) ? "NA" : this.f72298a.f205466j.category));
        }
    }

    /* JADX INFO: renamed from: p */
    public String m172139p() {
        return this.f72298a.f205467k.messageCustom.alertId;
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo37889j(LiveInternalCardStylePushView liveInternalCardStylePushView) {
        zxm zxmVar = this.f72298a;
        liveInternalCardStylePushView.mo37831b(zxmVar.f205467k, zxmVar.f205465i.getAct());
        xdl0.m208344M(liveInternalCardStylePushView, m172141u(this.f72298a));
        this.f151863b = m172142v(liveInternalCardStylePushView, this.f72298a);
    }

    /* JADX INFO: renamed from: u */
    public boolean m172141u(zxm zxmVar) {
        String str = zxmVar.f205467k.messageCustom.tabId;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList = vwb.m200304R(str.split(Constants.SEPARATOR_COMMA), new w9j() { // from class: l.mym
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((String) obj).replace("message", "msg");
                }
            });
        }
        return arrayList.contains(v930.m197534h().toString());
    }

    /* JADX INFO: renamed from: v */
    public c4g0 m172142v(final View view, final zxm zxmVar) {
        return v930.m197537k().distinctUntilChanged().skip(1).subscribe(mkd0.m154956H(new e30() { // from class: l.nym
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141136a.m172136q(view, zxmVar, (TabName) obj);
            }
        }, new e30() { // from class: l.oym
            @Override // p149l.e30
            public final void call(Object obj) {
                pym.m172134n((Throwable) obj);
            }
        }));
    }

    @Override // p149l.aym
    /* JADX INFO: renamed from: e */
    public void mo37885e() {
    }
}
