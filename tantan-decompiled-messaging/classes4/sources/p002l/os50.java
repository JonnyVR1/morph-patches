package p002l;

import android.text.TextUtils;
import android.util.Pair;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationItemView;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemCountDown;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemTitle;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemTitleText;
import com.p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p1.mobile.putong.live.base.data.BLiveRoomCardInfo;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import l.bwr;
import l.c4g0;
import l.d30;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.mkd0;
import l.mqi0;
import l.qib0;
import l.s7m;
import l.w9j;
import l.xdl0;
import l.ypv;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class os50 extends wq50<ho2, OperationItemView> {

    /* JADX INFO: renamed from: k */
    public c4g0 f16768k;

    /* JADX INFO: renamed from: l */
    public final BLiveOperationItem f16769l;

    public os50(bsm bsmVar, BLiveOperationItem bLiveOperationItem) {
        super(bsmVar);
        this.f16769l = bLiveOperationItem;
    }

    /* JADX INFO: renamed from: D4 */
    private void m19697D4(long j, long j2) {
        long j3 = j - j2;
        s7m s7mVar = ((bwr) this).viewModel;
        if (j3 <= 300) {
            ((OperationItemView) s7mVar).setCountDownText(String.valueOf(j3));
            return;
        }
        long j4 = j3 / 60;
        ((OperationItemView) s7mVar).setCountDownText(m19711n4(j4) + ":" + m19711n4(j3 - (60 * j4)));
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m19702a4() {
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m19710i4() {
    }

    /* JADX INFO: renamed from: n4 */
    private String m19711n4(long j) {
        if (j >= 10) {
            return String.valueOf(j);
        }
        return "0" + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m19712x4(Boolean bool) {
        if (NullChecker.a(this.f21910i) && this.f21910i.isForPrepare) {
            ((OperationItemView) ((bwr) this).viewModel).setViewForReady(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m19713y4(String str) {
        if (TextUtils.equals(str, this.f16769l.type)) {
            ((OperationItemView) ((bwr) this).viewModel).m8668q(false);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m19714A4(long j, BLiveOperationItemCountDown bLiveOperationItemCountDown, d30 d30Var, Long l2) {
        if (l2.longValue() < j) {
            m19697D4(j, l2.longValue());
        } else {
            m19722j4(bLiveOperationItemCountDown);
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m19715B4() {
        ((OperationItemView) ((bwr) this).viewModel).m8661J(false);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [l.ho2] */
    /* JADX INFO: renamed from: C4 */
    public void m19716C4(@NotNull BLiveOperationItem bLiveOperationItem) {
        m19723k4(bLiveOperationItem);
        if (!NullChecker.a(this.f21910i)) {
            mu50.m18188f(m25552L2(), m25547E2(), bLiveOperationItem);
        }
        this.f21910i = bLiveOperationItem;
        if (NullChecker.a(bLiveOperationItem.title)) {
            String string = bLiveOperationItem.title.titleType.toString();
            string.getClass();
            switch (string) {
                case "none":
                    xdl0.M(((bwr) this).viewModel, false);
                    break;
                case "text":
                    m19718F4(bLiveOperationItem.title.text);
                    break;
                case "countdown":
                    if (!TextUtils.equals(LiveMessage.LiveMessageType.SHOOT_GAME, bLiveOperationItem.type)) {
                        m19717E4(bLiveOperationItem.title.countdown, new d30() { // from class: l.ds50
                            public final void call() {
                                os50.m19710i4();
                            }
                        });
                        break;
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX INFO: renamed from: E4 */
    public final void m19717E4(@NotNull final BLiveOperationItemCountDown bLiveOperationItemCountDown, final d30 d30Var) {
        final long j = (bLiveOperationItemCountDown.endTime - bLiveOperationItemCountDown.currentTime) / 1000;
        mkd0.z(this.f16768k);
        if (j <= 0) {
            m19722j4(bLiveOperationItemCountDown);
        } else {
            m19697D4(j, 0L);
            this.f16768k = m14186H3(m25547E2().m14575i2(TimeUnit.SECONDS).take((int) j)).subscribe(ffw.d(new e30() { // from class: l.cs50
                public final void call(Object obj) {
                    this.f8926a.m19714A4(j, bLiveOperationItemCountDown, d30Var, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m19718F4(@NotNull BLiveOperationItemTitleText bLiveOperationItemTitleText) {
        if (TextUtils.isEmpty(bLiveOperationItemTitleText.content)) {
            return;
        }
        ((OperationItemView) ((bwr) this).viewModel).setCountDownText(bLiveOperationItemTitleText.content);
        String string = bLiveOperationItemTitleText.showRules.showType.toString();
        string.getClass();
        switch (string) {
            case "duration":
                ((OperationItemView) ((bwr) this).viewModel).m8668q(true);
                m14180B3((int) bLiveOperationItemTitleText.showRules.fadingSeconds, TimeUnit.SECONDS, new Runnable() { // from class: l.es50
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9955a.m19715B4();
                    }
                });
                break;
            case "constant":
                ((OperationItemView) ((bwr) this).viewModel).m8668q(true);
                break;
            case "unknown_":
                ((OperationItemView) ((bwr) this).viewModel).m8668q(false);
                break;
            case "off":
                ((OperationItemView) ((bwr) this).viewModel).m8661J(false);
                break;
        }
    }

    /* JADX INFO: renamed from: G4 */
    public void m19719G4(boolean z) {
        if (NullChecker.a(this.f21910i)) {
            this.f21910i.isForPrepare = z;
        }
    }

    /* JADX INFO: renamed from: H4 */
    public void m19720H4() {
        m25548F2().OperationsEvent.showAllOperations().j(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: T */
    public void m19721T() {
        super.T();
        duringCreated((c) m25548F2().OperationsEvent.boostStartEnd().g()).filter(new w9j() { // from class: l.bs50
            public final Object call(Object obj) {
                return this.f8326a.m19729r4((ku50) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.fs50
            public final void call(Object obj) {
                this.f10621a.m19730s4((ku50) obj);
            }
        }));
        duringCreated((c) m25548F2().OperationsEvent.messageIconTrans().g()).filter(new w9j() { // from class: l.gs50
            public final Object call(Object obj) {
                return this.f11605a.m19732t4((ku50) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.hs50
            public final void call(Object obj) {
                this.f12258a.m19733u4((ku50) obj);
            }
        }));
        duringCreated((c) m25548F2().OperationsEvent.showOperationsItem().g()).filter(new w9j() { // from class: l.is50
            public final Object call(Object obj) {
                return this.f13387a.m19734v4((ku50) obj);
            }
        }).subscribe(ffw.d(new e30() { // from class: l.js50
            public final void call(Object obj) {
                this.f13999a.m19735w4((ku50) obj);
            }
        }));
        duringCreated((c) m25548F2().OperationsEvent.showAllOperations().g()).subscribe(ffw.d(new e30() { // from class: l.ks50
            public final void call(Object obj) {
                this.f14495a.m19712x4((Boolean) obj);
            }
        }));
        if (m19728q4()) {
            duringCreated((c) m25548F2().OperationsEvent.hideItem().g()).subscribe(ffw.d(new e30() { // from class: l.ls50
                public final void call(Object obj) {
                    this.f15014a.m19713y4((String) obj);
                }
            }));
            duringCreated((c) m25548F2().OperationsEvent.aloneCountDown().i(true)).subscribe(ffw.d(new e30() { // from class: l.ms50
                public final void call(Object obj) {
                    this.f15609a.m19736z4((Integer) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [l.ho2] */
    /* JADX INFO: renamed from: j4 */
    public void m19722j4(BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveOperationItemCountDown.endText);
        s7m s7mVar = ((bwr) this).viewModel;
        if (zIsEmpty) {
            ((OperationItemView) s7mVar).m8661J(false);
        } else {
            ((OperationItemView) s7mVar).m8661J(true);
            ((OperationItemView) ((bwr) this).viewModel).setCountDownText(bLiveOperationItemCountDown.endText);
        }
        String string = bLiveOperationItemCountDown.actionAfterCountdown.toString();
        string.getClass();
        switch (string) {
            case "h5Drawer":
                m25294N3(BLiveOperationPopupType.get("H5Drawer"));
                break;
            case "jumpToScheme":
                if (!TextUtils.isEmpty(bLiveOperationItemCountDown.jumpScheme)) {
                    m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(200).m25610e(bLiveOperationItemCountDown.jumpScheme).m25608c());
                    break;
                }
                break;
            case "close":
                ((OperationItemView) ((bwr) this).viewModel).m8668q(false);
                m25548F2().OperationsEvent.removeOperationItem().j(new ku50.C0652a(8100).m16802d(this.f21910i).m16799a());
                break;
            case "refresh":
                m25547E2().m14504H1(LongLinkSocketMessage.OperationUpdateNotice.newBuilder().setPosition(LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Element).setOperationType(this.f21910i.type).setRandomDelaySeconds(bLiveOperationItemCountDown.randomDelaySeconds).build());
                break;
            case "textDrawer":
                m25294N3(BLiveOperationPopupType.get("TextDrawer"));
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m19723k4(BLiveOperationItem bLiveOperationItem) {
        if (NullChecker.a(this.f21910i) || TextUtils.isEmpty(bLiveOperationItem.extraData) || !"turboCard".equals(bLiveOperationItem.type)) {
            return;
        }
        try {
            BLiveRoomCardInfo bLiveRoomCardInfo = (BLiveRoomCardInfo) BLiveRoomCardInfo.JSON_ADAPTER.parse(bLiveOperationItem.extraData);
            if (NullChecker.a(bLiveRoomCardInfo) && m25552L2() && qib0.b0.a.userId().equals(bLiveRoomCardInfo.userId)) {
                ((OperationItemView) ((bwr) this).viewModel).m8659H();
                m25548F2().OperationsEvent.boostStart().j(new ku50.C0652a(8100).m16802d(bLiveOperationItem).m16799a());
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: l4 */
    public void m19724l4() {
        if (NullChecker.a(this.f21910i)) {
            mu50.m18187e(m25552L2(), m25547E2(), this.f21910i);
            if (!NullChecker.a(this.f21910i.popup) || ((ggv) ypv.l(fld0.c)).i) {
                return;
            }
            String string = this.f21910i.popup.popupType.toString();
            switch (string.hashCode()) {
                case -1518548930:
                    if (!string.equals("H5Drawer")) {
                        return;
                    }
                    break;
                case -881413986:
                    if (!string.equals("TextDrawer")) {
                        return;
                    }
                    break;
                case -240132779:
                    string.equals("unknown_");
                    return;
                case 1070399455:
                    if (!string.equals("H5PopUp")) {
                        return;
                    }
                    break;
                default:
                    return;
            }
            m25294N3(BLiveOperationPopupType.get("unknown_"));
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m19725m4(BLiveOperationItem bLiveOperationItem) {
        return NullChecker.a(this.f21910i) && NullChecker.a(bLiveOperationItem) && this.f21910i.type.equals(bLiveOperationItem.type);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        mkd0.z(this.f16768k);
        ((OperationItemView) ((bwr) this).viewModel).m8658G();
    }

    @Nullable
    /* JADX INFO: renamed from: o4 */
    public Pair<Float, Float> m19726o4(@Nullable BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        if (bLiveOperationItemCountDown == null || bLiveOperationItemCountDown.getTheRemainingTime() <= 0) {
            return null;
        }
        float totalTime = bLiveOperationItemCountDown.getTotalTime();
        if (TEnum.equals(bLiveOperationItemCountDown.type, "darkToBright")) {
            return Pair.create(Float.valueOf(((bLiveOperationItemCountDown.endTime - mqi0.o()) / totalTime) * 360.0f), Float.valueOf(0.0f));
        }
        if (TEnum.equals(bLiveOperationItemCountDown.type, "brightToDark")) {
            return Pair.create(Float.valueOf(((mqi0.o() - bLiveOperationItemCountDown.startTime) / totalTime) * 360.0f), Float.valueOf(360.0f));
        }
        return null;
    }

    /* JADX INFO: renamed from: p4 */
    public BLiveOperationItem m19727p4() {
        return this.f21910i;
    }

    /* JADX INFO: renamed from: q4 */
    public final boolean m19728q4() {
        return TextUtils.equals(LiveMessage.LiveMessageType.SHOOT_GAME, this.f16769l.type);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m19729r4(ku50 ku50Var) {
        return Boolean.valueOf(m19725m4(ku50Var.m16790e()));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m19730s4(ku50 ku50Var) {
        ((OperationItemView) ((bwr) this).viewModel).setViewForReady(false);
    }

    /* JADX INFO: renamed from: t */
    public void m19731t() {
        super.t();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ Boolean m19732t4(ku50 ku50Var) {
        return Boolean.valueOf(m19725m4(ku50Var.m16790e()));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m19733u4(ku50 ku50Var) {
        boolean zM16787b = ku50Var.m16787b();
        s7m s7mVar = ((bwr) this).viewModel;
        if (zM16787b) {
            ((OperationItemView) s7mVar).m8660I(ku50Var.m16790e(), ku50Var.m16793h());
        } else {
            ((OperationItemView) s7mVar).m8665m(ku50Var.m16793h());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Boolean m19734v4(ku50 ku50Var) {
        return Boolean.valueOf(m19725m4(ku50Var.m16790e()));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m19735w4(ku50 ku50Var) {
        ((OperationItemView) ((bwr) this).viewModel).setViewForReady(true);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m19736z4(Integer num) {
        BLiveOperationItemTitle bLiveOperationItemTitle = this.f16769l.title;
        if (bLiveOperationItemTitle != null) {
            BLiveOperationItemCountDown bLiveOperationItemCountDown = bLiveOperationItemTitle.countdown;
            bLiveOperationItemCountDown.endTime = (bLiveOperationItemCountDown.currentTime + ((long) num.intValue())) * 1000;
            m19717E4(this.f16769l.title.countdown, new d30() { // from class: l.ns50
                public final void call() {
                    os50.m19702a4();
                }
            });
        }
    }
}
