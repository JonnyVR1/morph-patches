package p149l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftSetInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class owj extends zi2<ho2, zvj> {

    /* JADX INFO: renamed from: k */
    public String f146064k;

    /* JADX INFO: renamed from: l */
    public c4g0 f146065l;

    public owj(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m166390R3(e30 e30Var, Throwable th) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(th);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m166394V3(Integer num) {
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m166395W3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4, reason: merged with bridge method [inline-methods] */
    public final void m166409k4(e30<Throwable> e30Var, Throwable th) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: b4 */
    public BLiveGiftItem m166400b4(int i) {
        return m206027E2().m132171w0(i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c4 */
    public final void m166401c4(final e30<Throwable> e30Var) {
        m218909J3(zfv.m218494A0(this.f146064k, m206027E2().m149818o())).subscribe(ffw.m121194e(new e30() { // from class: l.gwj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104715a.m166405g4((BLiveGiftSetInfo) obj);
            }
        }, new e30() { // from class: l.hwj
            @Override // p149l.e30
            public final void call(Object obj) {
                owj.m166390R3(e30Var, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.zi2
    /* JADX INFO: renamed from: d4, reason: merged with bridge method [inline-methods] */
    public zvj mo75679K3() {
        return new zvj();
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [l.ho2] */
    /* JADX INFO: renamed from: e4 */
    public void m166403e4(final int i, boolean z) {
        if (i == 0) {
            m166401c4(null);
            return;
        }
        m166414p4(i, 0L);
        if (z) {
            if (NullChecker.m81303a(this.f146065l)) {
                this.f146065l.unsubscribe();
                this.f146065l = null;
            }
            this.f146065l = m218909J3(m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS).take(i))).subscribe(ffw.m121193d(new e30() { // from class: l.lwj
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130273a.m166406h4(i, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m166404f4(Throwable th) {
        this.f188512e.f77095a.progressDismiss();
        if (NullChecker.m81303a(th)) {
            ((zvj) this.viewModel).m220409B(true);
        }
        mo168244N3();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m166405g4(BLiveGiftSetInfo bLiveGiftSetInfo) {
        ((zvj) this.viewModel).m220413z(bLiveGiftSetInfo);
        if (NullChecker.m81303a(bLiveGiftSetInfo.displayAttribute)) {
            m166417s4(bLiveGiftSetInfo.displayAttribute.backgroundPicUrl, ((zvj) this.viewModel).f203466f, new e30() { // from class: l.iwj
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115279a.m166404f4((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m166406h4(int i, Long l2) {
        long j = i;
        if (l2.longValue() < j) {
            m166414p4(j, l2.longValue());
        } else {
            m166401c4(null);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m166407i4(Throwable th) {
        this.f188512e.f77095a.progressDismiss();
        ((zvj) this.viewModel).m220409B(true);
        mo168244N3();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m166408j4(View view, e30 e30Var, Bitmap bitmap) {
        if (bitmap == null) {
            m166409k4(e30Var, new Throwable());
        } else {
            view.setBackground(new BitmapDrawable(m166419u4(bitmap, view)));
            m166409k4(e30Var, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m166410l4(String str, BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (isShowing() && NullChecker.m81303a(bLiveGivenGiftBrief.giftSetInfo)) {
            if (bLiveGivenGiftBrief.giftSetInfo.hasSuitSendFinished()) {
                m206028F2().GiftDialogEventGroup.dismissGiftDialog().mo172463j(8102);
                ((zvj) this.viewModel).mo71727j();
            } else {
                ((zvj) this.viewModel).m220413z(bLiveGivenGiftBrief.giftSetInfo);
            }
        }
        pwj.m171752a(str, m206032L2() ? "p_anchor_live_room" : "p_user_live_room", bLiveGiftItem, 1, m206027E2().m132146l0().f56011id);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m166411m4(awj awjVar) {
        if (!awjVar.m99291c()) {
            ((zvj) this.viewModel).mo71727j();
            return;
        }
        m218910L3();
        this.f146064k = awjVar.m99290b();
        this.f188512e.f77095a.progress(R$string.f47464q, true);
        m166401c4(new e30() { // from class: l.fwj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99659a.m166407i4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public void m166412n4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iM220411x = ((zvj) this.viewModel).m220411x() + t100.m186890d(15.0f);
        if (iM220411x <= t100.m186890d(15.0f)) {
            iM220411x = (int) (((double) xdl0.m208408w0()) * 0.4d);
        }
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(8101).m142598B(str).m142603t(80).m142602s(t100.m186890d(10.0f)).m142597A(xdl0.m208412y0(), iM220411x).m142600q());
    }

    /* JADX INFO: renamed from: o4 */
    public final int m166413o4(String str) throws IllegalArgumentException {
        if ((!TextUtils.isEmpty(str)) & (!str.startsWith("#"))) {
            str = "#".concat(str);
        }
        return Color.parseColor(str);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m166414p4(long j, long j2) {
        long j3 = j - j2;
        long j4 = j3 / 60;
        ((zvj) this.viewModel).m220408A(String.format("%1s:%2s", jbu.m140810R(j4), jbu.m140810R(j3 - (60 * j4))));
    }

    /* JADX INFO: renamed from: q4 */
    public void m166415q4(String str, VDraweeView vDraweeView) {
        hxs.m133406s("context_livingAct", vDraweeView, str);
    }

    /* JADX INFO: renamed from: r4 */
    public void m166416r4(String str, View view) {
        m166417s4(str, view, null);
    }

    /* JADX INFO: renamed from: s4 */
    public void m166417s4(String str, final View view, final e30<Throwable> e30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m218909J3(hxs.m133392e("context_livingAct", str).observeOn(jo0.m142408a())).subscribe(ffw.m121194e(new e30() { // from class: l.jwj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120093a.m166408j4(view, e30Var, (Bitmap) obj);
            }
        }, new e30() { // from class: l.kwj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124987a.m166409k4(e30Var, (Throwable) obj);
            }
        }));
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().GiftSuitEvent.showDialog().m172460g()).subscribe(ffw.m121197h(new e30() { // from class: l.dwj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88183a.m166411m4((awj) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m166418t4(VText vText, String str) {
        try {
            vText.setTextColor(m166413o4(str));
        } catch (IllegalArgumentException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final Bitmap m166419u4(Bitmap bitmap, View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        return (width == 0 || height == 0 || width >= bitmap.getWidth() || height >= bitmap.getHeight()) ? bitmap : ya5.m213800P(bitmap, width, height);
    }

    /* JADX INFO: renamed from: v4 */
    public void m166420v4(final BLiveGiftItem bLiveGiftItem) {
        final String strValueOf = String.valueOf(bLiveGiftItem.f44377id);
        axj.m99434h(bLiveGiftItem, "gift_set", "NA", ((Boolean) m129297F3(new hnj(701).m131941e(bLiveGiftItem.getPrice()))).booleanValue(), mo77274R2(), 1, (String) m129297F3(new iuj(701)));
        Pair pair = (Pair) m129297F3(new ynj(0));
        m206028F2().SendGiftEventGroup.sendGift().mo172463j(new cfe0.C16123a().m106526B("liveGiftSuitClick").m106534y(pge0.m168675d(strValueOf, bLiveGiftItem, new e30() { // from class: l.mwj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136057a.m166410l4(strValueOf, bLiveGiftItem, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.nwj
            @Override // p149l.e30
            public final void call(Object obj) {
                owj.m166395W3((Throwable) obj);
            }
        }, new e30() { // from class: l.ewj
            @Override // p149l.e30
            public final void call(Object obj) {
                owj.m166394V3((Integer) obj);
            }
        }, false, 1, pair != null ? (String) pair.first : null, pair != null ? (mnj) pair.second : null, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.giftcombination)))));
    }
}
