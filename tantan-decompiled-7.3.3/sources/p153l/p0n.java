package p153l;

import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.LiveInternalCardStylePushView;
import com.p051p1.mobile.putong.core.newui.home.bubble.internalpush.base.LiveInternalPushBaseView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class p0n extends a0n<LiveInternalCardStylePushView> {

    /* JADX INFO: renamed from: b */
    public kcg0 f150078b;

    public p0n(zzm zzmVar) {
        super(zzmVar);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m170170n(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m170172q(View view, zzm zzmVar, TabName tabName) {
        m170174t(view, zzmVar);
    }

    /* JADX INFO: renamed from: r */
    public static void m170173r(zzm zzmVar) {
        if (TextUtils.isEmpty(zzmVar.f206719k.link) || zzmVar.f206721m == null) {
            return;
        }
        String str = zzmVar.f206719k.link;
        if (str != null && !str.contains("source=")) {
            zzmVar.f206719k.link = zzmVar.f206719k.link + "&source=start-push";
        }
        String str2 = zzmVar.f206719k.link;
        if (str2 != null && !str2.contains("from=")) {
            zzmVar.f206719k.link = zzmVar.f206719k.link + "&from=from_in_app_push";
        }
        nae0.m162083m(zzmVar.f206721m, Uri.parse(zzmVar.f206719k.link));
        pf60 pf60VarM147494Y = jyb.m147494Y("liveId", zzmVar.f206718j.liveId);
        String str3 = zzmVar.f206718j.userId;
        if (str3 == null) {
            str3 = "NA";
        }
        i4g0.m138523u("e_live_room_enter", "p_live_inner_broadcast", pf60VarM147494Y, jyb.m147494Y("anchorId", str3), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("show_label", ""), jyb.m147494Y("module", OMSTemplateModeType.page), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("live_status", "on"), jyb.m147494Y("trace_id", ""), jyb.m147494Y("broadcast_page_id", zzmVar.m222273K()), jyb.m147494Y("liveRecommendCategory", TextUtils.isEmpty(zzmVar.f206718j.category) ? "NA" : zzmVar.f206718j.category));
    }

    /* JADX INFO: renamed from: t */
    private void m170174t(View view, zzm zzmVar) {
        boolean zM170177u = m170177u(zzmVar);
        view.setVisibility(zM170177u ? 0 : 4);
        if (NullChecker.m82486a(zzmVar.f206722n)) {
            zzmVar.f206722n.setTouchable(zM170177u);
            zzmVar.f206722n.update();
        }
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: b */
    public int mo95407b() {
        return 30000;
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: c */
    public LiveInternalPushBaseView mo38886c(Act act) {
        return ((LiveInternalCardStylePushView) p9r.m171370a(act).inflate(kec0.f125997p6, (ViewGroup) null, false)).m38867l(this);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: f */
    public void mo38889f() {
        m170173r(this.f67729a);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: g */
    public void mo95408g(v0t v0tVar) {
        super.mo95408g(v0tVar);
        psd0.m173633z(this.f150078b);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: h */
    public void mo38890h() {
        CoreModule.m30934Q().mo68408Ir("exposure", this.f67729a.f206718j.source);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: i */
    public void mo38891i(v0t v0tVar) {
        if (v0tVar.isShowing()) {
            v0tVar.dismiss();
        }
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: k */
    public boolean mo38893k() {
        return m170177u(this.f67729a);
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: l */
    public void mo38894l() {
        if (m170175p().isEmpty()) {
            pf60 pf60VarM147494Y = jyb.m147494Y("liveId", this.f67729a.f206718j.liveId);
            String str = this.f67729a.f206718j.userId;
            if (str == null) {
                str = "NA";
            }
            i4g0.m138492A("e_live_room_enter", "p_live_inner_broadcast", pf60VarM147494Y, jyb.m147494Y("anchorId", str), jyb.m147494Y(FirebaseAnalytics.Param.INDEX, "NA"), jyb.m147494Y("show_label", ""), jyb.m147494Y("module", OMSTemplateModeType.page), jyb.m147494Y("right_recommend_type", ""), jyb.m147494Y("live_status", "on"), jyb.m147494Y("trace_id", ""), jyb.m147494Y("broadcast_page_id", this.f67729a.m222273K()), jyb.m147494Y("liveRecommendCategory", TextUtils.isEmpty(this.f67729a.f206718j.category) ? "NA" : this.f67729a.f206718j.category));
        }
    }

    /* JADX INFO: renamed from: p */
    public String m170175p() {
        return this.f67729a.f206719k.messageCustom.alertId;
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo38892j(LiveInternalCardStylePushView liveInternalCardStylePushView) {
        zzm zzmVar = this.f67729a;
        liveInternalCardStylePushView.mo38834b(zzmVar.f206719k, zzmVar.f206717i.getAct());
        bnl0.m105524M(liveInternalCardStylePushView, m170177u(this.f67729a));
        this.f150078b = m170178v(liveInternalCardStylePushView, this.f67729a);
    }

    /* JADX INFO: renamed from: u */
    public boolean m170177u(zzm zzmVar) {
        String str = zzmVar.f206719k.messageCustom.tabId;
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList = jyb.m147487R(str.split(Constants.SEPARATOR_COMMA), new qcj() { // from class: l.m0n
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((String) obj).replace("message", "msg");
                }
            });
        }
        return arrayList.contains(ji30.m144964h().toString());
    }

    /* JADX INFO: renamed from: v */
    public kcg0 m170178v(final View view, final zzm zzmVar) {
        return ji30.m144967k().distinctUntilChanged().skip(1).subscribe(psd0.m173597H(new y20() { // from class: l.n0n
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139636a.m170172q(view, zzmVar, (TabName) obj);
            }
        }, new y20() { // from class: l.o0n
            @Override // p153l.y20
            public final void call(Object obj) {
                p0n.m170170n((Throwable) obj);
            }
        }));
    }

    @Override // p153l.a0n
    /* JADX INFO: renamed from: e */
    public void mo38888e() {
    }
}
