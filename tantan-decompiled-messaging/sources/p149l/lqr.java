package p149l;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.data.LimitTimePictureStatus;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLive;
import com.p046p1.mobile.putong.live.base.data.BLiveCounter;
import com.p046p1.mobile.putong.live.base.data.BLiveEntranceSummary;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.external.internal.live.square.activities.LiveActivitiesAct;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveActivitiesEntry;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.view.widgets.LiveActivitiesEntryView;
import java.util.HashMap;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class lqr extends cts<LiveActivitiesEntryView> {

    /* JADX INFO: renamed from: f */
    @NonNull
    public final a7j0 f129374f;

    /* JADX INFO: renamed from: g */
    public final bs5 f129375g;

    public lqr(mcr mcrVar, mss mssVar, @NonNull a7j0 a7j0Var) {
        super(mcrVar, mssVar);
        this.f129375g = new bs5();
        this.f129374f = a7j0Var;
    }

    /* JADX INFO: renamed from: C3 */
    public static boolean m151048C3() {
        return !mqi0.m155929D(((gl3) s9s.m182763m(gld0.f103315e)).m126739b());
    }

    /* JADX INFO: renamed from: D3 */
    public static boolean m151049D3() {
        return !mqi0.m155929D(((gl3) s9s.m182763m(gld0.f103315e)).m126738a());
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ void m151065e3(Throwable th) {
    }

    /* JADX INFO: renamed from: g3 */
    public static String m151066g3(int i) {
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
    public /* synthetic */ void m151067p3(Boolean bool) {
        ((LiveActivitiesEntryView) this.viewModel).m70881x(bool.booleanValue());
    }

    /* JADX INFO: renamed from: B3 */
    public void m151068B3(LiveActivitiesEntry liveActivitiesEntry) {
        ((gl3) s9s.m182763m(gld0.f103315e)).m126742e();
        if (liveActivitiesEntry.needShowActivitiesRedDot()) {
            m151069E3().onNext(liveActivitiesEntry);
        } else if (liveActivitiesEntry.hasUnreadCount() || liveActivitiesEntry.getState() == 5) {
            this.f129375g.m103655a(LiveSquareApi.patchReddot("clearActivitySquareDetailUnread").subscribe(ffw.m121194e(new e30() { // from class: l.vpr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f182520a.m151087w3((BLiveCounter) obj);
                }
            }, new e30() { // from class: l.cqr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82112a.m151088x3((Throwable) obj);
                }
            })));
        }
    }

    /* JADX INFO: renamed from: E3 */
    public final C22392a<LiveActivitiesEntry> m151069E3() {
        return ((hl3) s9s.m182763m(gld0.f103313c)).f108308a;
    }

    /* JADX INFO: renamed from: F3 */
    public void m151070F3(LiveActivitiesEntry liveActivitiesEntry) {
        if (liveActivitiesEntry.hasError()) {
            return;
        }
        String strM151066g3 = m151066g3(liveActivitiesEntry.getState());
        String str = liveActivitiesEntry.getState() == 5 ? "big" : "small";
        if (TextUtils.isEmpty(this.f129374f.mo68945v())) {
            return;
        }
        zvf0.m220399u("e_bubble_live_followed", this.f129374f.mo68945v(), j760.m140076a("show_type", strM151066g3), j760.m140076a("window_type", str));
    }

    /* JADX INFO: renamed from: G3 */
    public void m151071G3(LiveActivitiesEntry liveActivitiesEntry) {
        if (liveActivitiesEntry.hasError()) {
            return;
        }
        String strM151066g3 = m151066g3(liveActivitiesEntry.getState());
        String str = liveActivitiesEntry.getState() == 5 ? "big" : "small";
        if (TextUtils.isEmpty(this.f129374f.mo68945v())) {
            return;
        }
        zvf0.m220368A("e_bubble_live_followed", this.f129374f.mo68945v(), j760.m140076a("show_type", strM151066g3), j760.m140076a("window_type", str));
    }

    /* JADX INFO: renamed from: H3 */
    public void m151072H3(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("liveRecommendCategory", "sign");
        map.put("anchorId", str2);
        map.put("liveId", str3);
        adu.m96009e(str, map);
    }

    @Override // p149l.lss
    /* JADX INFO: renamed from: I2 */
    public void mo69101I2() {
        duringCreated(m151069E3().asObservable()).subscribe(ffw.m121194e(new e30() { // from class: l.fqr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98840a.m151080o3((LiveActivitiesEntry) obj);
            }
        }, new e30() { // from class: l.gqr
            @Override // p149l.e30
            public final void call(Object obj) {
                lqr.m151065e3((Throwable) obj);
            }
        }));
        duringCreated(s2u.m182077i()).map(new w9j() { // from class: l.hqr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.iqr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f114544a.m151067p3((Boolean) obj);
            }
        }));
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.jqr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.kqr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124288a.m151081q3((C4319c) obj);
            }
        }));
        duringCreated(pgi0.m168730l().m168752y()).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.wpr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187573a.m151082r3((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f3 */
    public void m151073f3(String str, boolean z) {
        getAct().startActivity(s9s.f163232f.m134373f(getAct(), AudienceStartData.getBuilder().m67594E(str).m67604O("live-activity-entrance").m67611u()));
        adu.m96007c(h7d0.m129655x().m129684w("e_bubble_live_followed").m129679r(str).m129680s("basic").m129681t("common_live").m129668g("NA").m129682u("on").m129661D(z ? "big" : "small").m129660C("NA").m129662a(), m151074h3());
    }

    /* JADX INFO: renamed from: h3 */
    public String m151074h3() {
        return this.f129374f.mo68945v();
    }

    /* JADX INFO: renamed from: i3 */
    public void m151075i3(String str) {
        String[] strArrSplit = str.split("\\?");
        if (strArrSplit.length <= 1 || !"tantanapp://live/audience/suggest".equals(strArrSplit[0])) {
            getAct().startActivity(LiveActivitiesAct.m68954e2(getAct()));
        } else {
            duringCreated(LiveSquareApi.getLiveActivitySignInRecommendRoom(strArrSplit[1])).subscribe(ffw.m121194e(new e30() { // from class: l.xpr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f193954a.m151078m3((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.ypr
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199486a.m151079n3((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: j3 */
    public void m151076j3() {
        LiveActivitiesEntry entryInfo = ((LiveActivitiesEntryView) this.viewModel).getEntryInfo();
        String scheme = ((LiveActivitiesEntryView) this.viewModel).getScheme();
        StringBuilder sb = new StringBuilder("clicked :,EntryInfo is null ");
        sb.append(entryInfo == null);
        gkh0.m126627j("[live]activityEntry", sb.toString());
        if (entryInfo == null) {
            return;
        }
        m151070F3(entryInfo);
        if (((LiveActivitiesEntryView) this.viewModel).getState() == 3) {
            ((gl3) s9s.m182763m(gld0.f103315e)).m126744g(mqi0.m155944o());
            m151075i3(scheme);
            m151090z3();
        } else if (((LiveActivitiesEntryView) this.viewModel).getState() == 4) {
            ((gl3) s9s.m182763m(gld0.f103315e)).m126743f(mqi0.m155944o());
            tht.m188929b(getAct(), Uri.parse(scheme));
            m151090z3();
        } else {
            getAct().startActivity(LiveActivitiesAct.m68954e2(getAct()));
            if (((LiveActivitiesEntryView) this.viewModel).f46291s.m117951b()) {
                rdt.m179010e(m151074h3(), true);
            } else if (((LiveActivitiesEntryView) this.viewModel).f46291s.m117952c()) {
                rdt.m179010e(m151074h3(), false);
            }
            m151068B3(entryInfo);
        }
    }

    /* JADX INFO: renamed from: k3 */
    public void m151077k3(LiveActivitiesEntry liveActivitiesEntry) {
        m151068B3(liveActivitiesEntry);
        rdt.m179009d(m151074h3());
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m151078m3(BLiveEnvelope bLiveEnvelope) {
        if (vwb.m200296J(bLiveEnvelope.data.lives) || vwb.m200296J(bLiveEnvelope.data.rooms) || vwb.m200296J(bLiveEnvelope.data.users)) {
            getAct().startActivity(LiveActivitiesAct.m68954e2(getAct()));
            return;
        }
        final BLive bLive = bLiveEnvelope.data.lives.get(0);
        Intent intentM134373f = s9s.f163232f.m134373f(getAct(), AudienceStartData.getBuilder().m67593D(bLive).m67602M(true).m67604O("sign-in-suggested").m67611u());
        m151072H3(this.f129374f.mo68945v(), bLiveEnvelope.data.users.get(0).f56011id, bLive.f44323id);
        if (!vwb.m200296J(bLiveEnvelope.data.followships) && Followship.isFollowed((Followship) vwb.m200346r(bLiveEnvelope.data.followships, new w9j() { // from class: l.bqr
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((Followship) obj).otherUser, bLive.anchor.f44419id));
            }
        }))) {
            getAct().startActivity(LiveActivitiesAct.m68954e2(getAct()));
        }
        getAct().startActivity(intentM134373f);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        this.f129375g.m103657c();
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m151079n3(Throwable th) {
        getAct().startActivity(LiveActivitiesAct.m68954e2(getAct()));
    }

    /* JADX INFO: renamed from: o3 */
    public final /* synthetic */ void m151080o3(LiveActivitiesEntry liveActivitiesEntry) {
        ((LiveActivitiesEntryView) this.viewModel).m70871B(liveActivitiesEntry);
    }

    /* JADX INFO: renamed from: q3 */
    public final /* synthetic */ void m151081q3(C4319c c4319c) {
        V v2 = this.viewModel;
        if (v2 != 0) {
            ((LiveActivitiesEntryView) v2).m70872E();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r3 */
    public final /* synthetic */ void m151082r3(Boolean bool) {
        if (!bool.booleanValue() && !xdl0.m208349O0((View) this.viewModel)) {
            m151090z3();
        }
        xdl0.m208345M0((View) this.viewModel, !bool.booleanValue());
    }

    /* JADX INFO: renamed from: s3 */
    public final /* synthetic */ void m151083s3(LiveActivitiesEntry liveActivitiesEntry, Throwable th) {
        m151069E3().onNext(liveActivitiesEntry);
    }

    /* JADX INFO: renamed from: t3 */
    public final /* synthetic */ void m151084t3(LiveActivitiesEntry liveActivitiesEntry, BLiveEnvelope bLiveEnvelope) {
        if (!vwb.m200296J(bLiveEnvelope.data.squareEntranceSummary) && bLiveEnvelope.data.squareEntranceSummary.size() != 0) {
            BLiveEntranceSummary bLiveEntranceSummary = bLiveEnvelope.data.squareEntranceSummary.get(0);
            if (TextUtils.equals("sign-in", bLiveEntranceSummary.type) && m151048C3()) {
                liveActivitiesEntry.setEntranceSummary(bLiveEntranceSummary);
                liveActivitiesEntry.forceState(3);
            } else if (TextUtils.equals("start-live", bLiveEntranceSummary.type) && !TextUtils.isEmpty(bLiveEntranceSummary.title) && m151049D3()) {
                liveActivitiesEntry.setEntranceSummary(bLiveEntranceSummary);
                liveActivitiesEntry.forceState(4);
            }
        }
        m151069E3().onNext(liveActivitiesEntry);
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ void m151085u3(BLiveEnvelope bLiveEnvelope) {
        LiveActivitiesEntry liveActivitiesEntry = new LiveActivitiesEntry(bLiveEnvelope);
        if (liveActivitiesEntry.showReddot()) {
            m151069E3().onNext(liveActivitiesEntry);
        } else {
            m151089y3(liveActivitiesEntry);
        }
    }

    /* JADX INFO: renamed from: v3 */
    public final /* synthetic */ void m151086v3(Throwable th) {
        m151069E3().onNext(new LiveActivitiesEntry(th));
    }

    /* JADX INFO: renamed from: w3 */
    public final /* synthetic */ void m151087w3(BLiveCounter bLiveCounter) {
        m151090z3();
    }

    /* JADX INFO: renamed from: x3 */
    public final /* synthetic */ void m151088x3(Throwable th) {
        m151069E3().onNext(new LiveActivitiesEntry(th));
    }

    /* JADX INFO: renamed from: y3 */
    public final void m151089y3(final LiveActivitiesEntry liveActivitiesEntry) {
        LiveSquareApi.getLiveActivityEntranceInfo().subscribe(ffw.m121194e(new e30() { // from class: l.zpr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204301a.m151084t3(liveActivitiesEntry, (BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.aqr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71199a.m151083s3(liveActivitiesEntry, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: z3 */
    public void m151090z3() {
        LiveSquareApi.getLiveActivitySummaryInSquare().subscribe(ffw.m121194e(new e30() { // from class: l.dqr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87496a.m151085u3((BLiveEnvelope) obj);
            }
        }, new e30() { // from class: l.eqr
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92840a.m151086v3((Throwable) obj);
            }
        }));
    }
}
