package p149l;

import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemCountDown;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemTitle;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemTitleText;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationPlaceType;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomCardInfo;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationItemView;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class os50 extends wq50<ho2, OperationItemView> {

    /* JADX INFO: renamed from: k */
    public c4g0 f145374k;

    /* JADX INFO: renamed from: l */
    public final BLiveOperationItem f145375l;

    public os50(bsm bsmVar, BLiveOperationItem bLiveOperationItem) {
        super(bsmVar);
        this.f145375l = bLiveOperationItem;
    }

    /* JADX INFO: renamed from: D4 */
    private void m165699D4(long j, long j2) {
        long j3 = j - j2;
        V v2 = this.viewModel;
        if (j3 <= 300) {
            ((OperationItemView) v2).setCountDownText(String.valueOf(j3));
            return;
        }
        long j4 = j3 / 60;
        ((OperationItemView) v2).setCountDownText(m165713n4(j4) + ":" + m165713n4(j3 - (60 * j4)));
    }

    /* JADX INFO: renamed from: a4 */
    public static /* synthetic */ void m165704a4() {
    }

    /* JADX INFO: renamed from: i4 */
    public static /* synthetic */ void m165712i4() {
    }

    /* JADX INFO: renamed from: n4 */
    private String m165713n4(long j) {
        if (j >= 10) {
            return String.valueOf(j);
        }
        return "0" + j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x4 */
    public /* synthetic */ void m165714x4(Boolean bool) {
        if (NullChecker.m81303a(this.f187644i) && this.f187644i.isForPrepare) {
            ((OperationItemView) this.viewModel).setViewForReady(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y4 */
    public /* synthetic */ void m165715y4(String str) {
        if (TextUtils.equals(str, this.f145375l.type)) {
            ((OperationItemView) this.viewModel).m75056q(false);
        }
    }

    /* JADX INFO: renamed from: A4 */
    public final /* synthetic */ void m165716A4(long j, BLiveOperationItemCountDown bLiveOperationItemCountDown, d30 d30Var, Long l2) {
        if (l2.longValue() < j) {
            m165699D4(j, l2.longValue());
        } else {
            m165723j4(bLiveOperationItemCountDown);
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: B4 */
    public final /* synthetic */ void m165717B4() {
        ((OperationItemView) this.viewModel).m75050J(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ho2] */
    /* JADX INFO: renamed from: C4 */
    public void m165718C4(@NotNull BLiveOperationItem bLiveOperationItem) {
        m165724k4(bLiveOperationItem);
        if (!NullChecker.m81303a(this.f187644i)) {
            mu50.m156386f(m206032L2(), m206027E2(), bLiveOperationItem);
        }
        this.f187644i = bLiveOperationItem;
        if (NullChecker.m81303a(bLiveOperationItem.title)) {
            String string = bLiveOperationItem.title.titleType.toString();
            string.getClass();
            switch (string) {
                case "none":
                    xdl0.m208344M((View) this.viewModel, false);
                    break;
                case "text":
                    m165720F4(bLiveOperationItem.title.text);
                    break;
                case "countdown":
                    if (!TextUtils.equals("shootGame", bLiveOperationItem.type)) {
                        m165719E4(bLiveOperationItem.title.countdown, new d30() { // from class: l.ds50
                            @Override // p149l.d30
                            public final void call() {
                                os50.m165712i4();
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
    public final void m165719E4(@NotNull final BLiveOperationItemCountDown bLiveOperationItemCountDown, final d30 d30Var) {
        final long j = (bLiveOperationItemCountDown.endTime - bLiveOperationItemCountDown.currentTime) / 1000;
        mkd0.m154992z(this.f145374k);
        if (j <= 0) {
            m165723j4(bLiveOperationItemCountDown);
        } else {
            m165699D4(j, 0L);
            this.f145374k = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS).take((int) j)).subscribe(ffw.m121193d(new e30() { // from class: l.cs50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82323a.m165716A4(j, bLiveOperationItemCountDown, d30Var, (Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: F4 */
    public final void m165720F4(@NotNull BLiveOperationItemTitleText bLiveOperationItemTitleText) {
        if (TextUtils.isEmpty(bLiveOperationItemTitleText.content)) {
            return;
        }
        ((OperationItemView) this.viewModel).setCountDownText(bLiveOperationItemTitleText.content);
        String string = bLiveOperationItemTitleText.showRules.showType.toString();
        string.getClass();
        switch (string) {
            case "duration":
                ((OperationItemView) this.viewModel).m75056q(true);
                m129293B3((int) bLiveOperationItemTitleText.showRules.fadingSeconds, TimeUnit.SECONDS, new Runnable() { // from class: l.es50
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f92992a.m165717B4();
                    }
                });
                break;
            case "constant":
                ((OperationItemView) this.viewModel).m75056q(true);
                break;
            case "unknown_":
                ((OperationItemView) this.viewModel).m75056q(false);
                break;
            case "off":
                ((OperationItemView) this.viewModel).m75050J(false);
                break;
        }
    }

    /* JADX INFO: renamed from: G4 */
    public void m165721G4(boolean z) {
        if (NullChecker.m81303a(this.f187644i)) {
            this.f187644i.isForPrepare = z;
        }
    }

    /* JADX INFO: renamed from: H4 */
    public void m165722H4() {
        m206028F2().OperationsEvent.showAllOperations().mo172463j(Boolean.TRUE);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().OperationsEvent.boostStartEnd().m172460g()).filter(new w9j() { // from class: l.bs50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f77007a.m165730r4((ku50) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.fs50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99041a.m165731s4((ku50) obj);
            }
        }));
        duringCreated(m206028F2().OperationsEvent.messageIconTrans().m172460g()).filter(new w9j() { // from class: l.gs50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f104147a.m165732t4((ku50) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.hs50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f109303a.m165733u4((ku50) obj);
            }
        }));
        duringCreated(m206028F2().OperationsEvent.showOperationsItem().m172460g()).filter(new w9j() { // from class: l.is50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f114734a.m165734v4((ku50) obj);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.js50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119475a.m165735w4((ku50) obj);
            }
        }));
        duringCreated(m206028F2().OperationsEvent.showAllOperations().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ks50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124419a.m165714x4((Boolean) obj);
            }
        }));
        if (m165729q4()) {
            duringCreated(m206028F2().OperationsEvent.hideItem().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ls50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f129807a.m165715y4((String) obj);
                }
            }));
            duringCreated(m206028F2().OperationsEvent.aloneCountDown().m172462i(true)).subscribe(ffw.m121193d(new e30() { // from class: l.ms50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f135445a.m165736z4((Integer) obj);
                }
            }));
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [l.ho2] */
    /* JADX INFO: renamed from: j4 */
    public void m165723j4(BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        boolean zIsEmpty = TextUtils.isEmpty(bLiveOperationItemCountDown.endText);
        V v2 = this.viewModel;
        if (zIsEmpty) {
            ((OperationItemView) v2).m75050J(false);
        } else {
            ((OperationItemView) v2).m75050J(true);
            ((OperationItemView) this.viewModel).setCountDownText(bLiveOperationItemCountDown.endText);
        }
        String string = bLiveOperationItemCountDown.actionAfterCountdown.toString();
        string.getClass();
        switch (string) {
            case "h5Drawer":
                m205019N3(BLiveOperationPopupType.get(BLiveOperationPopupType.H5Drawer));
                break;
            case "jumpToScheme":
                if (!TextUtils.isEmpty(bLiveOperationItemCountDown.jumpScheme)) {
                    m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(bLiveOperationItemCountDown.jumpScheme).m206699c());
                    break;
                }
                break;
            case "close":
                ((OperationItemView) this.viewModel).m75056q(false);
                m206028F2().OperationsEvent.removeOperationItem().mo172463j(new ku50.C18083a(8100).m147259d(this.f187644i).m147256a());
                break;
            case "refresh":
                m206027E2().m132068H1(LongLinkSocketMessage.OperationUpdateNotice.newBuilder().setPosition(LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Element).setOperationType(this.f187644i.type).setRandomDelaySeconds(bLiveOperationItemCountDown.randomDelaySeconds).build());
                break;
            case "textDrawer":
                m205019N3(BLiveOperationPopupType.get(BLiveOperationPopupType.TextDrawer));
                break;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m165724k4(BLiveOperationItem bLiveOperationItem) {
        if (NullChecker.m81303a(this.f187644i) || TextUtils.isEmpty(bLiveOperationItem.extraData) || !BLiveOperationPlaceType.turboCard.equals(bLiveOperationItem.type)) {
            return;
        }
        try {
            BLiveRoomCardInfo bLiveRoomCardInfo = BLiveRoomCardInfo.JSON_ADAPTER.parse(bLiveOperationItem.extraData);
            if (NullChecker.m81303a(bLiveRoomCardInfo) && m206032L2() && qib0.f154713b0.f139230a.userId().equals(bLiveRoomCardInfo.userId)) {
                ((OperationItemView) this.viewModel).m75048H();
                m206028F2().OperationsEvent.boostStart().mo172463j(new ku50.C18083a(8100).m147259d(bLiveOperationItem).m147256a());
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: l4 */
    public void m165725l4() {
        if (NullChecker.m81303a(this.f187644i)) {
            mu50.m156385e(m206032L2(), m206027E2(), this.f187644i);
            if (!NullChecker.m81303a(this.f187644i.popup) || ((ggv) ypv.m215673l(fld0.f98148c)).f102548i) {
                return;
            }
            String string = this.f187644i.popup.popupType.toString();
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
            m205019N3(BLiveOperationPopupType.get("unknown_"));
        }
    }

    /* JADX INFO: renamed from: m4 */
    public final boolean m165726m4(BLiveOperationItem bLiveOperationItem) {
        return NullChecker.m81303a(this.f187644i) && NullChecker.m81303a(bLiveOperationItem) && this.f187644i.type.equals(bLiveOperationItem.type);
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        mkd0.m154992z(this.f145374k);
        ((OperationItemView) this.viewModel).m75047G();
    }

    @Nullable
    /* JADX INFO: renamed from: o4 */
    public Pair<Float, Float> m165727o4(@Nullable BLiveOperationItemCountDown bLiveOperationItemCountDown) {
        if (bLiveOperationItemCountDown == null || bLiveOperationItemCountDown.getTheRemainingTime() <= 0) {
            return null;
        }
        float totalTime = bLiveOperationItemCountDown.getTotalTime();
        if (TEnum.equals(bLiveOperationItemCountDown.type, "darkToBright")) {
            return Pair.create(Float.valueOf(((bLiveOperationItemCountDown.endTime - mqi0.m155944o()) / totalTime) * 360.0f), Float.valueOf(0.0f));
        }
        if (TEnum.equals(bLiveOperationItemCountDown.type, "brightToDark")) {
            return Pair.create(Float.valueOf(((mqi0.m155944o() - bLiveOperationItemCountDown.startTime) / totalTime) * 360.0f), Float.valueOf(360.0f));
        }
        return null;
    }

    /* JADX INFO: renamed from: p4 */
    public BLiveOperationItem m165728p4() {
        return this.f187644i;
    }

    /* JADX INFO: renamed from: q4 */
    public final boolean m165729q4() {
        return TextUtils.equals("shootGame", this.f145375l.type);
    }

    /* JADX INFO: renamed from: r4 */
    public final /* synthetic */ Boolean m165730r4(ku50 ku50Var) {
        return Boolean.valueOf(m165726m4(ku50Var.m147247e()));
    }

    /* JADX INFO: renamed from: s4 */
    public final /* synthetic */ void m165731s4(ku50 ku50Var) {
        ((OperationItemView) this.viewModel).setViewForReady(false);
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
    }

    /* JADX INFO: renamed from: t4 */
    public final /* synthetic */ Boolean m165732t4(ku50 ku50Var) {
        return Boolean.valueOf(m165726m4(ku50Var.m147247e()));
    }

    /* JADX INFO: renamed from: u4 */
    public final /* synthetic */ void m165733u4(ku50 ku50Var) {
        boolean zM147244b = ku50Var.m147244b();
        V v2 = this.viewModel;
        if (zM147244b) {
            ((OperationItemView) v2).m75049I(ku50Var.m147247e(), ku50Var.m147250h());
        } else {
            ((OperationItemView) v2).m75053m(ku50Var.m147250h());
        }
    }

    /* JADX INFO: renamed from: v4 */
    public final /* synthetic */ Boolean m165734v4(ku50 ku50Var) {
        return Boolean.valueOf(m165726m4(ku50Var.m147247e()));
    }

    /* JADX INFO: renamed from: w4 */
    public final /* synthetic */ void m165735w4(ku50 ku50Var) {
        ((OperationItemView) this.viewModel).setViewForReady(true);
    }

    /* JADX INFO: renamed from: z4 */
    public final /* synthetic */ void m165736z4(Integer num) {
        BLiveOperationItemTitle bLiveOperationItemTitle = this.f145375l.title;
        if (bLiveOperationItemTitle != null) {
            BLiveOperationItemCountDown bLiveOperationItemCountDown = bLiveOperationItemTitle.countdown;
            bLiveOperationItemCountDown.endTime = (bLiveOperationItemCountDown.currentTime + ((long) num.intValue())) * 1000;
            m165719E4(this.f145375l.title.countdown, new d30() { // from class: l.ns50
                @Override // p149l.d30
                public final void call() {
                    os50.m165704a4();
                }
            });
        }
    }
}
