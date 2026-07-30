package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveSquareTab;
import com.p046p1.mobile.putong.live.external.intl.module.api.IntlLiveSquareApi;
import com.p046p1.mobile.putong.live.external.square.LiveSquareSummaryInfo;
import com.tantan.live.home.eventbus.LiveHomeEventBus;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class b6o {

    /* JADX INFO: renamed from: j */
    public static final List<String> f73854j = vwb.m200324f0("square-nearby", "square-suggested", "square-anchor-suggested", "square-following", "square-ongoing", "square-teen-mode", BLiveAbsData.VOICE_LIVE, "square-multi-call", "square-newcomer", "square-intlFollowing", "square-intlGame");

    /* JADX INFO: renamed from: a */
    public final Act f73855a;

    /* JADX INFO: renamed from: b */
    public final LiveHomeEventBus f73856b;

    /* JADX INFO: renamed from: e */
    public final mcr f73859e;

    /* JADX INFO: renamed from: h */
    public String f73862h;

    /* JADX INFO: renamed from: i */
    public String f73863i;

    /* JADX INFO: renamed from: c */
    public final C22392a<List<BLiveSquareTab>> f73857c = C22392a.m221513c(Collections.EMPTY_LIST);

    /* JADX INFO: renamed from: d */
    public String f73858d = null;

    /* JADX INFO: renamed from: f */
    public final uqd0 f73860f = new uqd0("intl_live_square_act_record_tab_id" + l9s.m149093o0(), "");

    /* JADX INFO: renamed from: g */
    public boolean f73861g = true;

    public b6o(mcr mcrVar, Act act, LiveHomeEventBus liveHomeEventBus) {
        this.f73859e = mcrVar;
        this.f73855a = act;
        this.f73856b = liveHomeEventBus;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m100448o(BLiveSquareTab bLiveSquareTab) {
        if ("square-following".equals(bLiveSquareTab.name)) {
            return false;
        }
        return f73854j.contains(bLiveSquareTab.name);
    }

    /* JADX INFO: renamed from: A */
    public final void m100449A(List<BLiveSquareTab> list) {
        this.f73857c.m132487l(vwb.m200339n(list, new w9j() { // from class: l.w5o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(b6o.m100448o((BLiveSquareTab) obj));
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public List<BLiveSquareTab> m100450h() {
        return new ArrayList(this.f73857c.m221515e());
    }

    /* JADX INFO: renamed from: i */
    public int m100451i(final String str) {
        List<BLiveSquareTab> listM221515e = this.f73857c.m221515e();
        if (listM221515e.isEmpty()) {
            return -1;
        }
        return vwb.m200293G(listM221515e, new w9j() { // from class: l.z5o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveSquareTab) obj).name));
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public String m100452j() {
        String str = this.f73858d;
        if (str == null || !this.f73861g) {
            return null;
        }
        this.f73861g = false;
        return str;
    }

    /* JADX INFO: renamed from: k */
    public C22306c<List<BLiveSquareTab>> m100453k() {
        return this.f73857c.asObservable().skipWhile(new kvy());
    }

    /* JADX INFO: renamed from: l */
    public C22306c<List<BLiveSquareTab>> m100454l() {
        return this.f73857c.asObservable();
    }

    /* JADX INFO: renamed from: m */
    public String m100455m(int i) {
        List<BLiveSquareTab> listM221515e = this.f73857c.m221515e();
        return (listM221515e.isEmpty() || i >= listM221515e.size()) ? "" : listM221515e.get(i).name;
    }

    /* JADX INFO: renamed from: n */
    public void m100456n() {
        m100462u();
        m100463v();
        m100464w();
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Boolean m100457p(BLiveSquareTab bLiveSquareTab) {
        return Boolean.valueOf(TextUtils.equals(bLiveSquareTab.f44441id, this.f73860f.get()));
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m100458q(LiveSquareSummaryInfo liveSquareSummaryInfo) {
        BLiveSquareSummary firstLiveSquareSummary = liveSquareSummaryInfo.getFirstLiveSquareSummary();
        ArrayList arrayList = new ArrayList();
        if (firstLiveSquareSummary != null && !TextUtils.isEmpty(firstLiveSquareSummary.extTabId)) {
            m100467z(firstLiveSquareSummary.extTabId);
            return;
        }
        String strValueOf = firstLiveSquareSummary != null ? String.valueOf(firstLiveSquareSummary.defaultTabId) : null;
        this.f73858d = strValueOf;
        m100462u();
        if (s9s.f163228b.m195878kb()) {
            BLiveSquareTab bLiveSquareTab = (BLiveSquareTab) vwb.m200346r(arrayList, new w9j() { // from class: l.a6o
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f67784a.m100457p((BLiveSquareTab) obj);
                }
            });
            if (bLiveSquareTab != null) {
                strValueOf = bLiveSquareTab.f44441id;
            }
            this.f73858d = strValueOf;
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m100459r(Throwable th) {
        m100462u();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m100460s(BLiveSettings bLiveSettings) {
        m100449A(bLiveSettings.liveSquareTabs);
    }

    /* JADX INFO: renamed from: t */
    public final void m100461t() {
        if (!TextUtils.isEmpty(this.f73863i)) {
            m100467z(this.f73863i);
        } else {
            this.f73858d = this.f73862h;
            m100462u();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m100462u() {
        BLiveSettings bLiveSettingsM195583A3 = s9s.f163228b.m195583A3();
        if (bLiveSettingsM195583A3 != null) {
            m100449A(bLiveSettingsM195583A3.liveSquareTabs);
        }
    }

    /* JADX INFO: renamed from: v */
    public void m100463v() {
        this.f73855a.duringCreated(IntlLiveSquareApi.getLiveSquareSummaryInfo("live-tab")).subscribe(ffw.m121194e(new e30() { // from class: l.t5o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167841a.m100458q((LiveSquareSummaryInfo) obj);
            }
        }, new e30() { // from class: l.u5o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174742a.m100459r((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w */
    public void m100464w() {
        this.f73859e.duringCreated(s9s.f163228b.m121230k()).distinctUntilChanged().filter(new w9j() { // from class: l.x5o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveSettings) obj) != null);
            }
        }).subscribe(ffw.m121197h(new e30() { // from class: l.y5o
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196466a.m100460s((BLiveSettings) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x */
    public void m100465x(Bundle bundle) {
        if (bundle == null) {
            CrashHelper.m81296c(new NullPointerException("LiveSquareAct start intent lost data"));
            return;
        }
        if (m2u.m152713j(bundle, this.f73855a)) {
            return;
        }
        this.f73862h = bundle.getString("default_tab_id", null);
        int i = bundle.getInt("from", 0);
        this.f73863i = bundle.getString("extra_tab_id", null);
        m2u.m152710g(bundle, i, this.f73855a);
        this.f73861g = true;
        m100461t();
    }

    /* JADX INFO: renamed from: y */
    public void m100466y(int i) {
        List<BLiveSquareTab> listM100450h = m100450h();
        if (listM100450h.size() <= 1 || !s9s.f163228b.m195878kb() || i < 0 || i >= listM100450h.size()) {
            return;
        }
        this.f73860f.put(listM100450h.get(i).f44441id);
    }

    /* JADX INFO: renamed from: z */
    public final void m100467z(final String str) {
        BLiveSquareTab bLiveSquareTab;
        BLiveSettings bLiveSettingsM195583A3 = s9s.f163228b.m195583A3();
        ArrayList arrayList = new ArrayList();
        if (bLiveSettingsM195583A3 != null && (bLiveSquareTab = (BLiveSquareTab) vwb.m200346r(bLiveSettingsM195583A3.liveSquareExtTabs, new w9j() { // from class: l.v5o
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveSquareTab) obj).f44441id.equals(str));
            }
        })) != null) {
            arrayList.add(bLiveSquareTab);
        }
        if (arrayList.isEmpty()) {
            m100462u();
        } else {
            m100449A(arrayList);
        }
    }
}
