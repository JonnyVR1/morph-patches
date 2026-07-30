package p153l;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftSetInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveGivenGiftBrief;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerBiz;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerData;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ezj extends hj2<oo2, pyj> {

    /* JADX INFO: renamed from: k */
    public String f96601k;

    /* JADX INFO: renamed from: l */
    public kcg0 f96602l;

    public ezj(dum dumVar) {
        super(dumVar);
    }

    /* JADX INFO: renamed from: R3 */
    public static /* synthetic */ void m123354R3(y20 y20Var, Throwable th) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(th);
        }
    }

    /* JADX INFO: renamed from: V3 */
    public static /* synthetic */ void m123358V3(Integer num) {
    }

    /* JADX INFO: renamed from: W3 */
    public static /* synthetic */ void m123359W3(Throwable th) {
    }

    /* JADX INFO: renamed from: o4 */
    private int m123363o4(String str) throws IllegalArgumentException {
        if ((!TextUtils.isEmpty(str)) & (!str.startsWith("#"))) {
            str = "#".concat(str);
        }
        return Color.parseColor(str);
    }

    /* JADX INFO: renamed from: a4, reason: merged with bridge method [inline-methods] */
    public final void m123374k4(y20<Throwable> y20Var, Throwable th) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(th);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: b4 */
    public BLiveGiftItem m123365b4(int i) {
        return m213810E2().m168555w0(i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: c4 */
    public final void m123366c4(final y20<Throwable> y20Var) {
        m135318J3(aiv.m98028A0(this.f96601k, m213810E2().m202194o())).subscribe(dhw.m115826e(new y20() { // from class: l.wyj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191657a.m123370g4((BLiveGiftSetInfo) obj);
            }
        }, new y20() { // from class: l.xyj
            @Override // p153l.y20
            public final void call(Object obj) {
                ezj.m123354R3(y20Var, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.hj2
    /* JADX INFO: renamed from: d4, reason: merged with bridge method [inline-methods] */
    public pyj mo76862K3() {
        return new pyj();
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [l.oo2] */
    /* JADX INFO: renamed from: e4 */
    public void m123368e4(final int i, boolean z) {
        if (i == 0) {
            m123366c4(null);
            return;
        }
        m123378p4(i, 0L);
        if (z) {
            if (NullChecker.m82486a(this.f96602l)) {
                this.f96602l.unsubscribe();
                this.f96602l = null;
            }
            this.f96602l = m135318J3(m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS).take(i))).subscribe(dhw.m115825d(new y20() { // from class: l.bzj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f79136a.m123371h4(i, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m123369f4(Throwable th) {
        this.f196918e.f90815a.progressDismiss();
        if (NullChecker.m82486a(th)) {
            ((pyj) this.viewModel).m174292B(true);
        }
        mo135321N3();
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m123370g4(BLiveGiftSetInfo bLiveGiftSetInfo) {
        ((pyj) this.viewModel).m174296z(bLiveGiftSetInfo);
        if (NullChecker.m82486a(bLiveGiftSetInfo.displayAttribute)) {
            m123381s4(bLiveGiftSetInfo.displayAttribute.backgroundPicUrl, ((pyj) this.viewModel).f72259f, new y20() { // from class: l.yyj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202113a.m123369f4((Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ void m123371h4(int i, Long l2) {
        long j = i;
        if (l2.longValue() < j) {
            m123378p4(j, l2.longValue());
        } else {
            m123366c4(null);
        }
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m123372i4(Throwable th) {
        this.f196918e.f90815a.progressDismiss();
        ((pyj) this.viewModel).m174292B(true);
        mo135321N3();
    }

    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m123373j4(View view, y20 y20Var, Bitmap bitmap) {
        if (bitmap == null) {
            m123374k4(y20Var, new Throwable());
        } else {
            view.setBackground(new BitmapDrawable(m123383u4(bitmap, view)));
            m123374k4(y20Var, null);
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m123375l4(String str, BLiveGiftItem bLiveGiftItem, BLiveGivenGiftBrief bLiveGivenGiftBrief) {
        if (isShowing() && NullChecker.m82486a(bLiveGivenGiftBrief.giftSetInfo)) {
            if (bLiveGivenGiftBrief.giftSetInfo.hasSuitSendFinished()) {
                m213811F2().GiftDialogEventGroup.dismissGiftDialog().mo199273j(8102);
                ((pyj) this.viewModel).mo72910j();
            } else {
                ((pyj) this.viewModel).m174296z(bLiveGivenGiftBrief.giftSetInfo);
            }
        }
        fzj.m128191a(str, m213815L2() ? "p_anchor_live_room" : "p_user_live_room", bLiveGiftItem, 1, m213810E2().m168532l0().f56859id);
    }

    /* JADX INFO: renamed from: m4 */
    public final void m123376m4(qyj qyjVar) {
        if (!qyjVar.m178652c()) {
            ((pyj) this.viewModel).mo72910j();
            return;
        }
        m135319L3();
        this.f96601k = qyjVar.m178651b();
        this.f196918e.f90815a.progress(R$string.f48312q, true);
        m123366c4(new y20() { // from class: l.vyj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186381a.m123372i4((Throwable) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public void m123377n4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iM174294x = ((pyj) this.viewModel).m174294x() + qa00.m175859d(15.0f);
        if (iM174294x <= qa00.m175859d(15.0f)) {
            iM174294x = (int) (((double) bnl0.m105588w0()) * 0.4d);
        }
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(8101).m174141B(str).m174146t(80).m174145s(qa00.m175859d(10.0f)).m174140A(bnl0.m105592y0(), iM174294x).m174143q());
    }

    /* JADX INFO: renamed from: p4 */
    public final void m123378p4(long j, long j2) {
        long j3 = j - j2;
        long j4 = j3 / 60;
        ((pyj) this.viewModel).m174291A(String.format("%1s:%2s", kdu.m149273R(j4), kdu.m149273R(j3 - (60 * j4))));
    }

    /* JADX INFO: renamed from: q4 */
    public void m123379q4(String str, VDraweeView vDraweeView) {
        izs.m142868s("context_livingAct", vDraweeView, str);
    }

    /* JADX INFO: renamed from: r4 */
    public void m123380r4(String str, View view) {
        m123381s4(str, view, null);
    }

    /* JADX INFO: renamed from: s4 */
    public void m123381s4(String str, final View view, final y20<Throwable> y20Var) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m135318J3(izs.m142854e("context_livingAct", str).observeOn(fo0.m126432a())).subscribe(dhw.m115826e(new y20() { // from class: l.zyj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206609a.m123373j4(view, y20Var, (Bitmap) obj);
            }
        }, new y20() { // from class: l.azj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74151a.m123374k4(y20Var, (Throwable) obj);
            }
        }));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().GiftSuitEvent.showDialog().m199270g()).subscribe(dhw.m115829h(new y20() { // from class: l.tyj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176684a.m123376m4((qyj) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m123382t4(VText vText, String str) {
        try {
            vText.setTextColor(m123363o4(str));
        } catch (IllegalArgumentException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: u4 */
    public final Bitmap m123383u4(Bitmap bitmap, View view) {
        int width = view.getWidth();
        int height = view.getHeight();
        return (width == 0 || height == 0 || width >= bitmap.getWidth() || height >= bitmap.getHeight()) ? bitmap : yb5.m214987P(bitmap, width, height);
    }

    /* JADX INFO: renamed from: v4 */
    public void m123384v4(final BLiveGiftItem bLiveGiftItem) {
        final String strValueOf = String.valueOf(bLiveGiftItem.f45225id);
        qzj.m178791h(bLiveGiftItem, "gift_set", "NA", ((Boolean) m138856F3(new xpj(701).m212654e(bLiveGiftItem.getPrice()))).booleanValue(), mo78457R2(), 1, (String) m138856F3(new ywj(701)));
        Pair pair = (Pair) m138856F3(new oqj(0));
        m213811F2().SendGiftEventGroup.sendGift().mo199273j(new hne0.C17513a().m136080B("liveGiftSuitClick").m136088y(uoe0.m196974d(strValueOf, bLiveGiftItem, new y20() { // from class: l.czj
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84476a.m123375l4(strValueOf, bLiveGiftItem, (BLiveGivenGiftBrief) obj);
            }
        }, new y20() { // from class: l.dzj
            @Override // p153l.y20
            public final void call(Object obj) {
                ezj.m123359W3((Throwable) obj);
            }
        }, new y20() { // from class: l.uyj
            @Override // p153l.y20
            public final void call(Object obj) {
                ezj.m123358V3((Integer) obj);
            }
        }, false, 1, pair != null ? (String) pair.first : null, pair != null ? (cqj) pair.second : null, BLiveTraceServerData.getNativeTraceServerData(BLiveTraceServerBiz.get(BLiveTraceServerBiz.giftcombination)))));
    }
}
