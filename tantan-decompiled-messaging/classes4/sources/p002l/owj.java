package p002l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p1.mobile.putong.live.base.data.BLiveGiftSetInfo;
import com.p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.c4g0;
import l.e30;
import l.ffw;
import l.hxs;
import l.jbu;
import l.jo0;
import l.t100;
import l.xdl0;
import l.ya5;
import l.ynj;
import rx.c;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class owj extends zi2<ho2, zvj> {

    /* JADX INFO: renamed from: k */
    public String f16813k;

    /* JADX INFO: renamed from: l */
    public c4g0 f16814l;

    public owj(bsm bsmVar) {
        super(bsmVar);
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m19769R3(e30 e30Var, Throwable th) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(th);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m19773V3(Integer num) {
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m19774W3(Throwable th) {
    }

    /* JADX INFO: renamed from: a4, reason: merged with bridge method [inline-methods] */
    public final void m19788k4(e30<Throwable> e30Var, Throwable th) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: b4 */
    public BLiveGiftItem m19779b4(int i) {
        return m25547E2().m14607w0(i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: c4 */
    public final void m19780c4(final e30<Throwable> e30Var) {
        m27393J3(zfv.m27197A0(this.f16813k, m25547E2().m17239o())).subscribe(ffw.e(new e30() { // from class: l.gwj
            public final void call(Object obj) {
                this.f11654a.m19784g4((BLiveGiftSetInfo) obj);
            }
        }, new e30() { // from class: l.hwj
            public final void call(Object obj) {
                owj.m19769R3(e30Var, (Throwable) obj);
            }
        }));
    }

    @Override // p002l.zi2
    /* JADX INFO: renamed from: d4, reason: merged with bridge method [inline-methods] */
    public zvj mo15345K3() {
        return new zvj();
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [l.ho2] */
    /* JADX INFO: renamed from: e4 */
    public void m19782e4(final int i, boolean z) {
        if (i == 0) {
            m19780c4(null);
            return;
        }
        m19793p4(i, 0L);
        if (z) {
            if (NullChecker.a(this.f16814l)) {
                this.f16814l.unsubscribe();
                this.f16814l = null;
            }
            this.f16814l = m27393J3(m14186H3(m25547E2().m14575i2(TimeUnit.SECONDS).take(i))).subscribe(ffw.d(new e30() { // from class: l.lwj
                public final void call(Object obj) {
                    this.f15097a.m19785h4(i, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m19783f4(Throwable th) {
        this.f22036e.f8332a.progressDismiss();
        if (NullChecker.a(th)) {
            ((zvj) ((bwr) this).viewModel).m27612B(true);
        }
        m27395N3();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m19784g4(BLiveGiftSetInfo bLiveGiftSetInfo) {
        ((zvj) ((bwr) this).viewModel).m27616z(bLiveGiftSetInfo);
        if (NullChecker.a(bLiveGiftSetInfo.displayAttribute)) {
            m19796s4(bLiveGiftSetInfo.displayAttribute.backgroundPicUrl, ((zvj) ((bwr) this).viewModel).f23456f, new e30() { // from class: l.iwj
                public final void call(Object obj) {
                    this.f13454a.m19783f4((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m19785h4(int i, Long l2) {
        long j = i;
        if (l2.longValue() < j) {
            m19793p4(j, l2.longValue());
        } else {
            m19780c4(null);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m19786i4(Throwable th) {
        this.f22036e.f8332a.progressDismiss();
        ((zvj) ((bwr) this).viewModel).m27612B(true);
        m27395N3();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m19787j4(View view, e30 e30Var, Bitmap bitmap) {
        if (bitmap == null) {
            m19788k4(e30Var, new Throwable());
        } else {
            view.setBackground(new BitmapDrawable(m19799u4(bitmap, view)));
            m19788k4(e30Var, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m19789l4(String str, BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (isShowing() && NullChecker.a(bLiveGivenGiftBrief.giftSetInfo)) {
            if (bLiveGivenGiftBrief.giftSetInfo.hasSuitSendFinished()) {
                m25548F2().GiftDialogEventGroup.dismissGiftDialog().j(8102);
                ((zvj) ((bwr) this).viewModel).mo5095j();
            } else {
                ((zvj) ((bwr) this).viewModel).m27616z(bLiveGivenGiftBrief.giftSetInfo);
            }
        }
        pwj.m20732a(str, m25552L2() ? "p_anchor_live_room" : "p_user_live_room", bLiveGiftItem, 1, ((DbObject) m25547E2().m14582l0()).id);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m19790m4(awj awjVar) {
        if (!awjVar.m10082c()) {
            ((zvj) ((bwr) this).viewModel).mo5095j();
            return;
        }
        m27394L3();
        this.f16813k = awjVar.m10081b();
        this.f22036e.f8332a.progress(R$string.f3506q, true);
        m19780c4(new e30() { // from class: l.fwj
            public final void call(Object obj) {
                this.f10663a.m19786i4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public void m19791n4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iM27614x = ((zvj) ((bwr) this).viewModel).m27614x() + t100.d(15.0f);
        if (iM27614x <= t100.d(15.0f)) {
            iM27614x = (int) (((double) xdl0.w0()) * 0.4d);
        }
        m25548F2().OpenH5Event.open().j(jp50.m16064c(8101).m16094B(str).m16099t(80).m16098s(t100.d(10.0f)).m16093A(xdl0.y0(), iM27614x).m16096q());
    }

    /* JADX INFO: renamed from: o4 */
    public final int m19792o4(String str) throws IllegalArgumentException {
        if ((!TextUtils.isEmpty(str)) & (!str.startsWith("#"))) {
            str = "#".concat(str);
        }
        return Color.parseColor(str);
    }

    /* JADX INFO: renamed from: p4 */
    public final void m19793p4(long j, long j2) {
        long j3 = j - j2;
        long j4 = j3 / 60;
        ((zvj) ((bwr) this).viewModel).m27611A(String.format("%1s:%2s", jbu.R(j4), jbu.R(j3 - (60 * j4))));
    }

    /* JADX INFO: renamed from: q4 */
    public void m19794q4(String str, VDraweeView vDraweeView) {
        hxs.s("context_livingAct", vDraweeView, str);
    }

    /* JADX INFO: renamed from: r4 */
    public void m19795r4(String str, View view) {
        m19796s4(str, view, null);
    }

    /* JADX INFO: renamed from: s4 */
    public void m19796s4(String str, final View view, final e30<Throwable> e30Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m27393J3(hxs.e("context_livingAct", str).observeOn(jo0.a())).subscribe(ffw.e(new e30() { // from class: l.jwj
            public final void call(Object obj) {
                this.f14092a.m19787j4(view, e30Var, (Bitmap) obj);
            }
        }, new e30() { // from class: l.kwj
            public final void call(Object obj) {
                this.f14562a.m19788k4(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t */
    public void m19797t() {
        super.t();
        duringCreated((c) m25548F2().GiftSuitEvent.showDialog().g()).subscribe(ffw.h(new e30() { // from class: l.dwj
            public final void call(Object obj) {
                this.f9464a.m19790m4((awj) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m19798t4(VText vText, String str) {
        try {
            vText.setTextColor(m19792o4(str));
        } catch (IllegalArgumentException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final Bitmap m19799u4(Bitmap bitmap, View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        return (width == 0 || height == 0 || width >= bitmap.getWidth() || height >= bitmap.getHeight()) ? bitmap : ya5.P(bitmap, width, height);
    }

    /* JADX INFO: renamed from: v4 */
    public void m19800v4(final BLiveGiftItem bLiveGiftItem) {
        final String strValueOf = String.valueOf(bLiveGiftItem.id);
        axj.m10094h(bLiveGiftItem, "gift_set", "NA", ((Boolean) m14184F3(new hnj(701).m14469e(bLiveGiftItem.getPrice()))).booleanValue(), mo21430R2(), 1, (String) m14184F3(new iuj(701)));
        Pair pair = (Pair) m14184F3(new ynj(0));
        m25548F2().SendGiftEventGroup.sendGift().j(new cfe0.C0512a().m10979B("liveGiftSuitClick").m10987y(pge0.m20240d(strValueOf, bLiveGiftItem, new e30() { // from class: l.mwj
            public final void call(Object obj) {
                this.f15726a.m19789l4(strValueOf, bLiveGiftItem, (BLiveGivenGiftBrief) obj);
            }
        }, new e30() { // from class: l.nwj
            public final void call(Object obj) {
                owj.m19774W3((Throwable) obj);
            }
        }, new e30() { // from class: l.ewj
            public final void call(Object obj) {
                owj.m19773V3((Integer) obj);
            }
        }, false, 1, pair != null ? (String) pair.first : null, pair != null ? (mnj) pair.second : null, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get("giftcombination")))));
    }
}
