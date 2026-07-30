package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p051p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p051p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class b8o {

    /* JADX INFO: renamed from: j */
    public static final List<String> f75448j = jyb.m147507f0("square-nearby", "square-suggested", "square-anchor-suggested", "square-following", "square-ongoing", "square-teen-mode", BLiveAbsData.VOICE_LIVE, "square-multi-call", "square-newcomer", "square-intlFollowing", "square-intlGame");

    /* JADX INFO: renamed from: a */
    public final Act f75449a;

    /* JADX INFO: renamed from: b */
    public final LiveHomeEventBus f75450b;

    /* JADX INFO: renamed from: e */
    public final ner f75453e;

    /* JADX INFO: renamed from: h */
    public String f75456h;

    /* JADX INFO: renamed from: i */
    public String f75457i;

    /* JADX INFO: renamed from: c */
    public final C22507a<List<BLiveSquareTab>> f75451c = C22507a.m222759c(Collections.EMPTY_LIST);

    /* JADX INFO: renamed from: d */
    public String f75452d = null;

    /* JADX INFO: renamed from: f */
    public final wyd0 f75454f = new wyd0("intl_live_square_act_record_tab_id" + mbs.m157870o0(), "");

    /* JADX INFO: renamed from: g */
    public boolean f75455g = true;

    public b8o(ner nerVar, Act act, LiveHomeEventBus liveHomeEventBus) {
        this.f75453e = nerVar;
        this.f75449a = act;
        this.f75450b = liveHomeEventBus;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m103006o(BLiveSquareTab bLiveSquareTab) {
        if ("square-following".equals(bLiveSquareTab.name)) {
            return false;
        }
        return f75448j.contains(bLiveSquareTab.name);
    }

    /* JADX INFO: renamed from: A */
    public final void m103007A(List<BLiveSquareTab> list) {
        this.f75451c.m137019l(jyb.m147522n(list, new qcj() { // from class: l.w7o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(b8o.m103006o((BLiveSquareTab) obj));
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public List<BLiveSquareTab> m103008h() {
        return new ArrayList(this.f75451c.m222761e());
    }

    /* JADX INFO: renamed from: i */
    public int m103009i(final String str) {
        List<BLiveSquareTab> listM222761e = this.f75451c.m222761e();
        if (listM222761e.isEmpty()) {
            return -1;
        }
        return jyb.m147476G(listM222761e, new qcj() { // from class: l.z7o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveSquareTab) obj).name));
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public String m103010j() {
        String str = this.f75452d;
        if (str == null || !this.f75455g) {
            return null;
        }
        this.f75455g = false;
        return str;
    }

    /* JADX INFO: renamed from: k */
    public C22421c<List<BLiveSquareTab>> m103011k() {
        return this.f75451c.asObservable().skipWhile(new h4z());
    }

    /* JADX INFO: renamed from: l */
    public C22421c<List<BLiveSquareTab>> m103012l() {
        return this.f75451c.asObservable();
    }

    /* JADX INFO: renamed from: m */
    public String m103013m(int i) {
        List<BLiveSquareTab> listM222761e = this.f75451c.m222761e();
        return (listM222761e.isEmpty() || i >= listM222761e.size()) ? "" : listM222761e.get(i).name;
    }

    /* JADX INFO: renamed from: n */
    public void m103014n() {
        m103020u();
        m103021v();
        m103022w();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Boolean m103015p(BLiveSquareTab bLiveSquareTab) {
        return Boolean.valueOf(TextUtils.equals(bLiveSquareTab.f45289id, this.f75454f.get()));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m103016q(LiveSquareSummaryInfo liveSquareSummaryInfo) {
        BLiveSquareSummary firstLiveSquareSummary = liveSquareSummaryInfo.getFirstLiveSquareSummary();
        ArrayList arrayList = new ArrayList();
        if (firstLiveSquareSummary != null && !TextUtils.isEmpty(firstLiveSquareSummary.extTabId)) {
            m103025z(firstLiveSquareSummary.extTabId);
            return;
        }
        String strValueOf = firstLiveSquareSummary != null ? String.valueOf(firstLiveSquareSummary.defaultTabId) : null;
        this.f75452d = strValueOf;
        m103020u();
        if (tbs.f172989b.m203665kb()) {
            BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) jyb.m147529r(arrayList, new qcj() { // from class: l.a8o
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f68935a.m103015p((BLiveSquareTab) obj);
                }
            });
            if (bLiveSquareTab != null) {
                strValueOf = bLiveSquareTab.f45289id;
            }
            this.f75452d = strValueOf;
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m103017r(Throwable th) {
        m103020u();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m103018s(BLiveSettings bLiveSettings) {
        m103007A(bLiveSettings.liveSquareTabs);
    }

    /* JADX INFO: renamed from: t */
    public final void m103019t() {
        if (!TextUtils.isEmpty(this.f75457i)) {
            m103025z(this.f75457i);
        } else {
            this.f75452d = this.f75456h;
            m103020u();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m103020u() {
        BLiveSettings bLiveSettingsM203370A3 = tbs.f172989b.m203370A3();
        if (bLiveSettingsM203370A3 != null) {
            m103007A(bLiveSettingsM203370A3.liveSquareTabs);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m103021v() {
        this.f75449a.duringCreated(IntlLiveSquareApi.getLiveSquareSummaryInfo("live-tab")).subscribe(dhw.m115826e(new y20() { // from class: l.t7o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172458a.m103016q((LiveSquareSummaryInfo) obj);
            }
        }, new y20() { // from class: l.u7o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177927a.m103017r((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public void m103022w() {
        this.f75453e.duringCreated(tbs.f172989b.m159274k()).distinctUntilChanged().filter(new qcj() { // from class: l.x7o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveSettings) obj) != null);
            }
        }).subscribe(dhw.m115829h(new y20() { // from class: l.y7o
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197812a.m103018s((BLiveSettings) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m103023x(Bundle bundle) {
        if (bundle == null) {
            CrashHelper.m82479c(new NullPointerException("LiveSquareAct start intent lost data"));
            return;
        }
        if (n4u.m161598j(bundle, this.f75449a)) {
            return;
        }
        this.f75456h = bundle.getString("default_tab_id", null);
        int i = bundle.getInt("from", 0);
        this.f75457i = bundle.getString("extra_tab_id", null);
        n4u.m161595g(bundle, i, this.f75449a);
        this.f75455g = true;
        m103019t();
    }

    /* JADX INFO: renamed from: y */
    public void m103024y(int i) {
        List<BLiveSquareTab> listM103008h = m103008h();
        if (listM103008h.size() <= 1 || !tbs.f172989b.m203665kb() || i < 0 || i >= listM103008h.size()) {
            return;
        }
        this.f75454f.put(listM103008h.get(i).f45289id);
    }

    /* JADX INFO: renamed from: z */
    public final void m103025z(final String str) {
        BLiveSquareTab bLiveSquareTab;
        BLiveSettings bLiveSettingsM203370A3 = tbs.f172989b.m203370A3();
        ArrayList arrayList = new ArrayList();
        if (bLiveSettingsM203370A3 != null && (bLiveSquareTab = (BLiveSquareTab) jyb.m147529r(bLiveSettingsM203370A3.liveSquareExtTabs, new qcj() { // from class: l.v7o
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveSquareTab) obj).f45289id.equals(str));
            }
        })) != null) {
            arrayList.add(bLiveSquareTab);
        }
        if (arrayList.isEmpty()) {
            m103020u();
        } else {
            m103007A(arrayList);
        }
    }
}
