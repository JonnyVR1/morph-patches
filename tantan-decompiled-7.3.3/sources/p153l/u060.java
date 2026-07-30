package p153l;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemCountDown;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemTitle;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemTitleText;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationPlaceType;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomCardInfo;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationItemView;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class u060 extends cz50<oo2, OperationItemView> {

    /* JADX INFO: renamed from: k */
    public kcg0 f176850k;

    /* JADX INFO: renamed from: l */
    public final BLiveOperationItem f176851l;

    public u060(dum dumVar, BLiveOperationItem bLiveOperationItem) {
        super(dumVar);
        this.f176851l = bLiveOperationItem;
    }

    /* JADX INFO: renamed from: D4 */
    private void m193754D4(long j, long j2) {
        long j3 = j - j2;
        V v2 = this.viewModel;
        if (j3 <= 300) {
            ((OperationItemView) v2).setCountDownText(String.valueOf(j3));
            return;
        }
        long j4 = j3 / 60;
        ((OperationItemView) v2).setCountDownText(m193768n4(j4) + ":" + m193768n4(j3 - (60 * j4)));
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m193759a4() {
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m193767i4() {
    }

    /* JADX INFO: renamed from: n4 */
    private String m193768n4(long j) {
        if (j >= 10) {
            return String.valueOf(j);
        }
        return "0" + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m193769x4(Boolean bool) {
        if (NullChecker.m82486a(this.f84425i) && this.f84425i.isForPrepare) {
            ((OperationItemView) this.viewModel).setViewForReady(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m193770y4(String str) {
        if (TextUtils.equals(str, this.f176851l.type)) {
            ((OperationItemView) this.viewModel).m76239q(false);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m193771A4(long j, BLiveOperationItemCountDown bLiveOperationItemCountDown, x20 x20Var, Long l2) {
        if (l2.longValue() < j) {
            m193754D4(j, l2.longValue());
        } else {
            m193778j4(bLiveOperationItemCountDown);
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m193772B4() {
        ((OperationItemView) this.viewModel).m76233J(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.oo2] */
    /* JADX INFO: renamed from: C4 */
    public void m193773C4(@NotNull BLiveOperationItem bLiveOperationItem) {
        m193779k4(bLiveOperationItem);
        if (!NullChecker.m82486a(this.f84425i)) {
            s260.m184114f(m213815L2(), m213810E2(), bLiveOperationItem);
        }
        this.f84425i = bLiveOperationItem;
        if (NullChecker.m82486a(bLiveOperationItem.title)) {
            String string = bLiveOperationItem.title.titleType.toString();
            string.getClass();
            switch (string) {
                case "none":
                    bnl0.m105524M((View) this.viewModel, false);
                    break;
                case "text":
                    m193775F4(bLiveOperationItem.title.text);
                    break;
                case "countdown":
                    if (!TextUtils.equals("shootGame", bLiveOperationItem.type)) {
                        m193774E4(bLiveOperationItem.title.countdown, new x20() { // from class: l.j060
                            @Override // p153l.x20
                            public final void call() {
                                u060.m193767i4();
                            }
                        });
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX INFO: renamed from: E4 */
    public final void m193774E4(@NotNull final BLiveOperationItemCountDown bLiveOperationItemCountDown, final x20 x20Var) {
        final long j = (bLiveOperationItemCountDown.endTime - bLiveOperationItemCountDown.currentTime) / 1000;
        psd0.m173633z(this.f176850k);
        if (j <= 0) {
            m193778j4(bLiveOperationItemCountDown);
        } else {
            m193754D4(j, 0L);
            this.f176850k = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS).take((int) j)).subscribe(dhw.m115825d(new y20() { // from class: l.i060
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112333a.m193771A4(j, bLiveOperationItemCountDown, x20Var, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m193775F4(@NotNull BLiveOperationItemTitleText bLiveOperationItemTitleText) {
        if (TextUtils.isEmpty(bLiveOperationItemTitleText.content)) {
            return;
        }
        ((OperationItemView) this.viewModel).setCountDownText(bLiveOperationItemTitleText.content);
        String string = bLiveOperationItemTitleText.showRules.showType.toString();
        string.getClass();
        switch (string) {
            case "duration":
                ((OperationItemView) this.viewModel).m76239q(true);
                m138852B3((int) bLiveOperationItemTitleText.showRules.fadingSeconds, TimeUnit.SECONDS, new Runnable() { // from class: l.k060
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f123369a.m193772B4();
                    }
                });
                break;
            case "constant":
                ((OperationItemView) this.viewModel).m76239q(true);
                break;
            case "unknown_":
                ((OperationItemView) this.viewModel).m76239q(false);
                break;
            case "off":
                ((OperationItemView) this.viewModel).m76233J(false);
                break;
        }
    }

    /* JADX INFO: renamed from: G4 */
    public void m193776G4(boolean z) {
        if (NullChecker.m82486a(this.f84425i)) {
            this.f84425i.isForPrepare = z;
        }
    }

    /* JADX INFO: renamed from: H4 */
    public void m193777H4() {
        m213811F2().OperationsEvent.showAllOperations().mo199273j(Boolean.TRUE);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().OperationsEvent.boostStartEnd().m199270g()).filter(new qcj() { // from class: l.h060
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f107272a.m193785r4((q260) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.l060
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129543a.m193786s4((q260) obj);
            }
        }));
        duringCreated(m213811F2().OperationsEvent.messageIconTrans().m199270g()).filter(new qcj() { // from class: l.m060
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f134296a.m193787t4((q260) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.n060
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f139591a.m193788u4((q260) obj);
            }
        }));
        duringCreated(m213811F2().OperationsEvent.showOperationsItem().m199270g()).filter(new qcj() { // from class: l.o060
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144499a.m193789v4((q260) obj);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.p060
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150011a.m193790w4((q260) obj);
            }
        }));
        duringCreated(m213811F2().OperationsEvent.showAllOperations().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.q060
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155029a.m193769x4((Boolean) obj);
            }
        }));
        if (m193784q4()) {
            duringCreated(m213811F2().OperationsEvent.hideItem().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.r060
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f160587a.m193770y4((String) obj);
                }
            }));
            duringCreated(m213811F2().OperationsEvent.aloneCountDown().m199272i(true)).subscribe(dhw.m115825d(new y20() { // from class: l.s060
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f165663a.m193791z4((Integer) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [l.oo2] */
    /* JADX INFO: renamed from: j4 */
    public void m193778j4(BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveOperationItemCountDown.endText);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((OperationItemView) v2).m76233J(false);
        } else {
            ((OperationItemView) v2).m76233J(true);
            ((OperationItemView) this.viewModel).setCountDownText(bLiveOperationItemCountDown.endText);
        }
        String string = bLiveOperationItemCountDown.actionAfterCountdown.toString();
        string.getClass();
        switch (string) {
            case "h5Drawer":
                m113261N3(BLiveOperationPopupType.get(BLiveOperationPopupType.H5Drawer));
                break;
            case "jumpToScheme":
                if (!TextUtils.isEmpty(bLiveOperationItemCountDown.jumpScheme)) {
                    m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(bLiveOperationItemCountDown.jumpScheme).m103152c());
                    break;
                }
                break;
            case "close":
                ((OperationItemView) this.viewModel).m76239q(false);
                m213811F2().OperationsEvent.removeOperationItem().mo199273j(new q260.C19505a(8100).m175005d(this.f84425i).m175002a());
                break;
            case "refresh":
                m213810E2().m168457H1(LongLinkSocketMessage.OperationUpdateNotice.newBuilder().setPosition(LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Element).setOperationType(this.f84425i.type).setRandomDelaySeconds(bLiveOperationItemCountDown.randomDelaySeconds).build());
                break;
            case "textDrawer":
                m113261N3(BLiveOperationPopupType.get(BLiveOperationPopupType.TextDrawer));
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m193779k4(BLiveOperationItem bLiveOperationItem) {
        if (NullChecker.m82486a(this.f84425i) || TextUtils.isEmpty(bLiveOperationItem.extraData) || !BLiveOperationPlaceType.turboCard.equals(bLiveOperationItem.type)) {
            return;
        }
        try {
            BLiveRoomCardInfo bLiveRoomCardInfo = BLiveRoomCardInfo.JSON_ADAPTER.parse(bLiveOperationItem.extraData);
            if (NullChecker.m82486a(bLiveRoomCardInfo) && m213815L2() && uqb0.f180396b0.f170324a.userId().equals(bLiveRoomCardInfo.userId)) {
                ((OperationItemView) this.viewModel).m76231H();
                m213811F2().OperationsEvent.boostStart().mo199273j(new q260.C19505a(8100).m175005d(bLiveOperationItem).m175002a());
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: l4 */
    public void m193780l4() {
        if (NullChecker.m82486a(this.f84425i)) {
            s260.m184113e(m213815L2(), m213810E2(), this.f84425i);
            if (!NullChecker.m82486a(this.f84425i.popup) || ((hiv) zrv.m221194l(htd0.f111521c)).f110078i) {
                return;
            }
            String string = this.f84425i.popup.popupType.toString();
            switch (string.hashCode()) {
                case -1518548930:
                    if (!string.equals(BLiveOperationPopupType.H5Drawer)) {
                        return;
                    }
                    break;
                case -881413986:
                    if (!string.equals(BLiveOperationPopupType.TextDrawer)) {
                        return;
                    }
                    break;
                case -240132779:
                    string.equals("unknown_");
                    return;
                case 1070399455:
                    if (!string.equals(BLiveOperationPopupType.H5PopUp)) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            m113261N3(BLiveOperationPopupType.get("unknown_"));
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m193781m4(BLiveOperationItem bLiveOperationItem) {
        return NullChecker.m82486a(this.f84425i) && NullChecker.m82486a(bLiveOperationItem) && this.f84425i.type.equals(bLiveOperationItem.type);
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        psd0.m173633z(this.f176850k);
        ((OperationItemView) this.viewModel).m76230G();
    }

    @Nullable
    /* JADX INFO: renamed from: o4 */
    public Pair<Float, Float> m193782o4(@Nullable BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        if (bLiveOperationItemCountDown == null || bLiveOperationItemCountDown.getTheRemainingTime() <= 0) {
            return null;
        }
        float totalTime = bLiveOperationItemCountDown.getTotalTime();
        if (TEnum.equals(bLiveOperationItemCountDown.type, "darkToBright")) {
            return Pair.create(Float.valueOf(((bLiveOperationItemCountDown.endTime - pzi0.m174454o()) / totalTime) * 360.0f), Float.valueOf(0.0f));
        }
        if (TEnum.equals(bLiveOperationItemCountDown.type, "brightToDark")) {
            return Pair.create(Float.valueOf(((pzi0.m174454o() - bLiveOperationItemCountDown.startTime) / totalTime) * 360.0f), Float.valueOf(360.0f));
        }
        return null;
    }

    /* JADX INFO: renamed from: p4 */
    public BLiveOperationItem m193783p4() {
        return this.f84425i;
    }

    /* JADX INFO: renamed from: q4 */
    public final boolean m193784q4() {
        return TextUtils.equals("shootGame", this.f176851l.type);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m193785r4(q260 q260Var) {
        return Boolean.valueOf(m193781m4(q260Var.m174993e()));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m193786s4(q260 q260Var) {
        ((OperationItemView) this.viewModel).setViewForReady(false);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ Boolean m193787t4(q260 q260Var) {
        return Boolean.valueOf(m193781m4(q260Var.m174993e()));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m193788u4(q260 q260Var) {
        boolean zM174990b = q260Var.m174990b();
        V v2 = this.viewModel;
        if (zM174990b) {
            ((OperationItemView) v2).m76232I(q260Var.m174993e(), q260Var.m174996h());
        } else {
            ((OperationItemView) v2).m76236m(q260Var.m174996h());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Boolean m193789v4(q260 q260Var) {
        return Boolean.valueOf(m193781m4(q260Var.m174993e()));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m193790w4(q260 q260Var) {
        ((OperationItemView) this.viewModel).setViewForReady(true);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m193791z4(Integer num) {
        BLiveOperationItemTitle bLiveOperationItemTitle = this.f176851l.title;
        if (bLiveOperationItemTitle != null) {
            BLiveOperationItemCountDown bLiveOperationItemCountDown = bLiveOperationItemTitle.countdown;
            bLiveOperationItemCountDown.endTime = (bLiveOperationItemCountDown.currentTime + ((long) num.intValue())) * 1000;
            m193774E4(this.f176851l.title.countdown, new x20() { // from class: l.t060
                @Override // p153l.x20
                public final void call() {
                    u060.m193759a4();
                }
            });
        }
    }
}
