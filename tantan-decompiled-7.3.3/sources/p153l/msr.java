package p153l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLive;
import com.p051p1.mobile.putong.live.base.data.BLiveCounter;
import com.p051p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveActivitiesEntry;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryView;
import java.util.HashMap;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class msr extends dvs<LiveActivitiesEntryView> {

    /* JADX INFO: renamed from: f */
    @NonNull
    public final egj0 f138513f;

    /* JADX INFO: renamed from: g */
    public final ft5 f138514g;

    public msr(ner nerVar, nus nusVar, @NonNull egj0 egj0Var) {
        super(nerVar, nusVar);
        this.f138514g = new ft5();
        this.f138513f = egj0Var;
    }

    /* JADX INFO: renamed from: C3 */
    public static boolean m159890C3() {
        return !pzi0.m174439D(((fm3) tbs.m190077m(itd0.f116823e)).m126174b());
    }

    /* JADX INFO: renamed from: D3 */
    public static boolean m159891D3() {
        return !pzi0.m174439D(((fm3) tbs.m190077m(itd0.f116823e)).m126173a());
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m159907e3(Throwable th) {
    }

    /* JADX INFO: renamed from: g3 */
    public static String m159908g3(int i) {
        if (i == 0) {
            return LimitTimePictureStatus.unread;
        }
        if (i != 1) {
            return i != 2 ? "" : "no";
        }
        return "read";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p3 */
    public /* synthetic */ void m159909p3(Boolean bool) {
        ((LiveActivitiesEntryView) this.viewModel).m72064x(bool.booleanValue());
    }

    /* JADX INFO: renamed from: B3 */
    public void m159910B3(LiveActivitiesEntry liveActivitiesEntry) {
        ((fm3) tbs.m190077m(itd0.f116823e)).m126177e();
        if (liveActivitiesEntry.needShowActivitiesRedDot()) {
            m159911E3().onNext(liveActivitiesEntry);
        } else if (liveActivitiesEntry.hasUnreadCount() || liveActivitiesEntry.getState() == 5) {
            this.f138514g.m127297a(LiveSquareApi.patchReddot("clearActivitySquareDetailUnread").subscribe(dhw.m115826e(new y20() { // from class: l.wrr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190545a.m159929w3((BLiveCounter) obj);
                }
            }, new y20() { // from class: l.dsr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90513a.m159930x3((Throwable) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final C22507a<LiveActivitiesEntry> m159911E3() {
        return ((gm3) tbs.m190077m(itd0.f116821c)).f104911a;
    }

    /* JADX INFO: renamed from: F3 */
    public void m159912F3(LiveActivitiesEntry liveActivitiesEntry) {
        if (liveActivitiesEntry.hasError()) {
            return;
        }
        String strM159908g3 = m159908g3(liveActivitiesEntry.getState());
        String str = liveActivitiesEntry.getState() == 5 ? "big" : "small";
        if (TextUtils.isEmpty(this.f138513f.mo70128v())) {
            return;
        }
        i4g0.m138523u("e_bubble_live_followed", this.f138513f.mo70128v(), pf60.m172085a("show_type", strM159908g3), pf60.m172085a("window_type", str));
    }

    /* JADX INFO: renamed from: G3 */
    public void m159913G3(LiveActivitiesEntry liveActivitiesEntry) {
        if (liveActivitiesEntry.hasError()) {
            return;
        }
        String strM159908g3 = m159908g3(liveActivitiesEntry.getState());
        String str = liveActivitiesEntry.getState() == 5 ? "big" : "small";
        if (TextUtils.isEmpty(this.f138513f.mo70128v())) {
            return;
        }
        i4g0.m138492A("e_bubble_live_followed", this.f138513f.mo70128v(), pf60.m172085a("show_type", strM159908g3), pf60.m172085a("window_type", str));
    }

    /* JADX INFO: renamed from: H3 */
    public void m159914H3(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("liveRecommendCategory", "sign");
        map.put("anchorId", str2);
        map.put("liveId", str3);
        bfu.m104073e(str, map);
    }

    @Override // p153l.mus
    /* JADX INFO: renamed from: I2 */
    public void mo70284I2() {
        duringCreated(m159911E3().asObservable()).subscribe(dhw.m115826e(new y20() { // from class: l.gsr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106325a.m159922o3((LiveActivitiesEntry) obj);
            }
        }, new y20() { // from class: l.hsr
            @Override // p153l.y20
            public final void call(Object obj) {
                msr.m159907e3((Throwable) obj);
            }
        }));
        duringCreated(t4u.m189320i()).map(new qcj() { // from class: l.isr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.jsr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122526a.m159909p3((Boolean) obj);
            }
        }));
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.ksr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.lsr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133443a.m159923q3((C4470c) obj);
            }
        }));
        duringCreated(ppi0.m173207l().m173229y()).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.xrr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f195954a.m159924r3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f3 */
    public void m159915f3(String str, boolean z) {
        getAct().startActivity(tbs.f172993f.m143704f(getAct(), AudienceStartData.getBuilder().m68777E(str).m68787O("live-activity-entrance").m68794u()));
        bfu.m104071c(kfd0.m149385x().m149414w("e_bubble_live_followed").m149409r(str).m149410s("basic").m149411t("common_live").m149398g("NA").m149412u("on").m149391D(z ? "big" : "small").m149390C("NA").m149392a(), m159916h3());
    }

    /* JADX INFO: renamed from: h3 */
    public String m159916h3() {
        return this.f138513f.mo70128v();
    }

    /* JADX INFO: renamed from: i3 */
    public void m159917i3(String str) {
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit.length <= 1 || !"tantanapp://live/audience/suggest".equals(strArrSplit[0])) {
            getAct().startActivity(LiveActivitiesAct.m70138g2(getAct()));
        } else {
            duringCreated(LiveSquareApi.getLiveActivitySignInRecommendRoom(strArrSplit[1])).subscribe(dhw.m115826e(new y20() { // from class: l.yrr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f201353a.m159920m3((BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.zrr
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f205788a.m159921n3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m159918j3() {
        LiveActivitiesEntry entryInfo = ((LiveActivitiesEntryView) this.viewModel).getEntryInfo();
        String scheme = ((LiveActivitiesEntryView) this.viewModel).getScheme();
        StringBuilder sb = new StringBuilder("clicked :,EntryInfo is null ");
        sb.append(entryInfo == null);
        nsh0.m164608j("[live]activityEntry", sb.toString());
        if (entryInfo == null) {
            return;
        }
        m159912F3(entryInfo);
        if (((LiveActivitiesEntryView) this.viewModel).getState() == 3) {
            ((fm3) tbs.m190077m(itd0.f116823e)).m126179g(pzi0.m174454o());
            m159917i3(scheme);
            m159932z3();
        } else if (((LiveActivitiesEntryView) this.viewModel).getState() == 4) {
            ((fm3) tbs.m190077m(itd0.f116823e)).m126178f(pzi0.m174454o());
            ujt.m196460b(getAct(), Uri.parse(scheme));
            m159932z3();
        } else {
            getAct().startActivity(LiveActivitiesAct.m70138g2(getAct()));
            if (((LiveActivitiesEntryView) this.viewModel).f47139s.m127535b()) {
                sft.m185667e(m159916h3(), true);
            } else if (((LiveActivitiesEntryView) this.viewModel).f47139s.m127536c()) {
                sft.m185667e(m159916h3(), false);
            }
            m159910B3(entryInfo);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public void m159919k3(LiveActivitiesEntry liveActivitiesEntry) {
        m159910B3(liveActivitiesEntry);
        sft.m185666d(m159916h3());
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m159920m3(BLiveEnvelope bLiveEnvelope) {
        if (jyb.m147479J(bLiveEnvelope.data.lives) || jyb.m147479J(bLiveEnvelope.data.rooms) || jyb.m147479J(bLiveEnvelope.data.users)) {
            getAct().startActivity(LiveActivitiesAct.m70138g2(getAct()));
            return;
        }
        final BLive bLive = bLiveEnvelope.data.lives.get(0);
        Intent intentM143704f = tbs.f172993f.m143704f(getAct(), AudienceStartData.getBuilder().m68776D(bLive).m68785M(true).m68787O("sign-in-suggested").m68794u());
        m159914H3(this.f138513f.mo70128v(), bLiveEnvelope.data.users.get(0).f56859id, bLive.f45171id);
        if (!jyb.m147479J(bLiveEnvelope.data.followships) && Followship.isFollowed((Followship) jyb.m147529r(bLiveEnvelope.data.followships, new qcj() { // from class: l.csr
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Followship) obj).otherUser, bLive.anchor.f45267id));
            }
        }))) {
            getAct().startActivity(LiveActivitiesAct.m70138g2(getAct()));
        }
        getAct().startActivity(intentM143704f);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f138514g.m127299c();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m159921n3(Throwable th) {
        getAct().startActivity(LiveActivitiesAct.m70138g2(getAct()));
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m159922o3(LiveActivitiesEntry liveActivitiesEntry) {
        ((LiveActivitiesEntryView) this.viewModel).m72054B(liveActivitiesEntry);
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m159923q3(C4470c c4470c) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveActivitiesEntryView) v2).m72055E();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m159924r3(Boolean bool) {
        if (!bool.booleanValue() && !bnl0.m105529O0((View) this.viewModel)) {
            m159932z3();
        }
        bnl0.m105525M0((View) this.viewModel, !bool.booleanValue());
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m159925s3(LiveActivitiesEntry liveActivitiesEntry, Throwable th) {
        m159911E3().onNext(liveActivitiesEntry);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m159926t3(LiveActivitiesEntry liveActivitiesEntry, BLiveEnvelope bLiveEnvelope) {
        if (!jyb.m147479J(bLiveEnvelope.data.squareEntranceSummary) && bLiveEnvelope.data.squareEntranceSummary.size() != 0) {
            BLiveEntranceSummary bLiveEntranceSummary = bLiveEnvelope.data.squareEntranceSummary.get(0);
            if (TextUtils.equals("sign-in", bLiveEntranceSummary.type) && m159890C3()) {
                liveActivitiesEntry.setEntranceSummary(bLiveEntranceSummary);
                liveActivitiesEntry.forceState(3);
            } else if (TextUtils.equals("start-live", bLiveEntranceSummary.type) && !TextUtils.isEmpty(bLiveEntranceSummary.title) && m159891D3()) {
                liveActivitiesEntry.setEntranceSummary(bLiveEntranceSummary);
                liveActivitiesEntry.forceState(4);
            }
        }
        m159911E3().onNext(liveActivitiesEntry);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ void m159927u3(BLiveEnvelope bLiveEnvelope) {
        LiveActivitiesEntry liveActivitiesEntry = new LiveActivitiesEntry(bLiveEnvelope);
        if (liveActivitiesEntry.showReddot()) {
            m159911E3().onNext(liveActivitiesEntry);
        } else {
            m159931y3(liveActivitiesEntry);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ void m159928v3(Throwable th) {
        m159911E3().onNext(new LiveActivitiesEntry(th));
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m159929w3(BLiveCounter bLiveCounter) {
        m159932z3();
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m159930x3(Throwable th) {
        m159911E3().onNext(new LiveActivitiesEntry(th));
    }

    /* JADX INFO: renamed from: y3 */
    public final void m159931y3(final LiveActivitiesEntry liveActivitiesEntry) {
        LiveSquareApi.getLiveActivityEntranceInfo().subscribe(dhw.m115826e(new y20() { // from class: l.asr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73166a.m159926t3(liveActivitiesEntry, (BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.bsr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78187a.m159925s3(liveActivitiesEntry, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z3 */
    public void m159932z3() {
        LiveSquareApi.getLiveActivitySummaryInSquare().subscribe(dhw.m115826e(new y20() { // from class: l.esr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95650a.m159927u3((BLiveEnvelope) obj);
            }
        }, new y20() { // from class: l.fsr
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100683a.m159928v3((Throwable) obj);
            }
        }));
    }
}
