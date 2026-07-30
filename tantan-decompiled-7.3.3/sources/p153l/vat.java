package p153l;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationAnimation;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationAnimationEnterType;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationPlaceType;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.LiveOperationScrollView;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class vat extends i6t<oo2, LiveOperationScrollView> {

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap<String, BLiveOperationItem> f183165i;

    /* JADX INFO: renamed from: j */
    public Point f183166j;

    /* JADX INFO: renamed from: k */
    public final int f183167k;

    /* JADX INFO: renamed from: l */
    public Random f183168l;

    /* JADX INFO: renamed from: l.vat$a */
    public static /* synthetic */ class C20799a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f183169a;

        static {
            int[] iArr = new int[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.values().length];
            f183169a = iArr;
            try {
                iArr[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.List.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f183169a[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Element.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f183169a[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Data.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public vat(dum dumVar, LiveOperationScrollView liveOperationScrollView) {
        super(dumVar);
        this.f183165i = new LinkedHashMap<>();
        this.f183167k = qa00.m175859d(154.0f);
        mo52715C(liveOperationScrollView);
    }

    /* JADX INFO: renamed from: b4 */
    private int m200607b4() {
        if (NullChecker.m82486a(this.f183166j)) {
            int i = this.f183166j.x;
            int i2 = this.f183167k;
            if (i < (i2 * 3) / 10) {
                return 3;
            }
            if (i < (i2 * 3) / 5) {
                return 17;
            }
            if (i < i2) {
                return 5;
            }
        }
        return 3;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: d4 */
    private String m200608d4() {
        return m213810E2().mo183435j().isNormalLive() ? "video" : "";
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        m138860d3(f060.class, new qcj() { // from class: l.sat
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f167069a.m200614g4((f060) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: Z3 */
    public View m200609Z3(BLiveOperationItem bLiveOperationItem) {
        return b260.m102114c().m102115a(this, this.f196918e, bLiveOperationItem);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: a4 */
    public final String m200610a4() {
        return m213810E2().mo183435j().anchor.f45267id;
    }

    /* JADX INFO: renamed from: c4 */
    public final long m200611c4(int i) {
        if (!NullChecker.m82486a(this.f183168l)) {
            this.f183168l = new Random();
        }
        return (long) (this.f183168l.nextFloat() * i * 1000.0f);
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m200612e4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        return operationUpdateNotice.getOperationType().equals(BLiveOperationPlaceType.lotteryGiftRedPacket) && operationUpdateNotice.getPosition() == LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Data && !TextUtils.isEmpty(operationUpdateNotice.getData());
    }

    /* JADX INFO: renamed from: f4 */
    public final boolean m200613f4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        return operationUpdateNotice.getOperationType().equals(BLiveOperationPlaceType.turboCoupon) && operationUpdateNotice.getPosition() == LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Data && !TextUtils.isEmpty(operationUpdateNotice.getData());
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ Integer m200614g4(f060 f060Var) {
        return Integer.valueOf(m200607b4());
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ Boolean m200615h4(String str) {
        return Boolean.valueOf(!this.f183165i.containsKey(str));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m200616i4(final String str, boolean z, LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice, BLiveOperation bLiveOperation) {
        if (TextUtils.isEmpty(str)) {
            this.f183165i.clear();
        } else if (!NullChecker.m82486a((BLiveOperationItem) jyb.m147529r(bLiveOperation.operations, new qcj() { // from class: l.kat
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveOperationItem) obj).type));
            }
        }))) {
            ((LiveOperationScrollView) this.viewModel).m76199i(new qcj() { // from class: l.lat
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals((String) obj));
                }
            });
        }
        bLiveOperation.isInit = z;
        if (NullChecker.m82486a(operationUpdateNotice)) {
            bLiveOperation.extraData = operationUpdateNotice.getData();
            if (NullChecker.m82486a(operationUpdateNotice.getAnimation()) && bLiveOperation.operations.size() > 0) {
                bLiveOperation.operations.get(0).animation = m200622o4(operationUpdateNotice.getAnimation());
            }
        }
        m213810E2().m168453F1(bLiveOperation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m200617j4(final String str, final boolean z, final LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        aiv.m98034D0(str, m200610a4(), m213810E2().mo183440n().f45172id, m200608d4(), m213810E2().mo183435j().liveMode, "").subscribe(dhw.m115829h(new y20() { // from class: l.jat
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f119015a.m200616i4(str, z, operationUpdateNotice, (BLiveOperation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m200618k4(fat fatVar) {
        m200625r4(jyb.m147522n(fatVar.f98008a.operations, new qcj() { // from class: l.hat
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(((BLiveOperationItem) obj).title));
            }
        }), fatVar.f98008a.extraData);
        m200624q4(fatVar.f98008a);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m200619l4(q260 q260Var) {
        ((LiveOperationScrollView) this.viewModel).m76200j(q260Var.m174997i().booleanValue());
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m200620m4(final q260 q260Var) {
        ((LiveOperationScrollView) this.viewModel).m76199i(new qcj() { // from class: l.uat
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(q260Var.m174993e().type));
            }
        });
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        ((LiveOperationScrollView) this.viewModel).m76198f();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Pair m200621n4(z160 z160Var) {
        return ((LiveOperationScrollView) this.viewModel).m76197e(z160Var.m218280e());
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: o4 */
    public final BLiveOperationAnimation m200622o4(@NonNull LongLinkSocketMessage.OperationAnimation operationAnimation) {
        BLiveOperationAnimation bLiveOperationAnimationNew_ = BLiveOperationAnimation.new_();
        bLiveOperationAnimationNew_.enter.animationType = BLiveOperationAnimationEnterType.get(operationAnimation.getEnter().getAnimationType());
        bLiveOperationAnimationNew_.enter.imageUrl = operationAnimation.getEnter().getImageUrl();
        bLiveOperationAnimationNew_.enter.isTop = operationAnimation.getEnter().getIsTop();
        return bLiveOperationAnimationNew_;
    }

    /* JADX INFO: renamed from: p4 */
    public final void m200623p4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        int i = C20799a.f183169a[operationUpdateNotice.getPosition().ordinal()];
        if (i == 1) {
            m200626s4(null, m200611c4((int) operationUpdateNotice.getRandomDelaySeconds()), null);
            return;
        }
        if ((i == 2 || i == 3) && !TextUtils.isEmpty(operationUpdateNotice.getOperationType())) {
            if (m200612e4(operationUpdateNotice)) {
                m200629v4(operationUpdateNotice);
                return;
            }
            if (m200613f4(operationUpdateNotice)) {
                m200630w4(operationUpdateNotice);
            }
            m200626s4(operationUpdateNotice.getOperationType(), m200611c4((int) operationUpdateNotice.getRandomDelaySeconds()), operationUpdateNotice);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final void m200624q4(BLiveOperation bLiveOperation) {
        if (bLiveOperation.operations.size() > 0) {
            for (int size = bLiveOperation.operations.size() - 1; size >= 0; size--) {
                BLiveOperationItem bLiveOperationItem = bLiveOperation.operations.get(size);
                if (bLiveOperationItem.enableEntranceAnim()) {
                    m213811F2().OperationsEvent.showEntranceAnim().mo199273j(new q260.C19505a(8100).m175005d(bLiveOperationItem).m175009h(false).m175002a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m200625r4(List<BLiveOperationItem> list, String str) {
        for (BLiveOperationItem bLiveOperationItem : list) {
            bLiveOperationItem.extraData = str;
            this.f183165i.put(bLiveOperationItem.type, bLiveOperationItem);
            Pair<Integer, View> pairM76196d = ((LiveOperationScrollView) this.viewModel).m76196d(bLiveOperationItem.type);
            if (NullChecker.m82486a(pairM76196d)) {
                Object obj = pairM76196d.second;
                if (obj instanceof v1m) {
                    ((v1m) ((View) obj)).mo76234a(bLiveOperationItem);
                }
            }
            View viewM200609Z3 = m200609Z3(bLiveOperationItem);
            if (NullChecker.m82486a(viewM200609Z3)) {
                viewM200609Z3.setTag(bLiveOperationItem.type);
                if (bLiveOperationItem.enableEntranceAnim() || bLiveOperationItem.enableOperationTop()) {
                    ((LiveOperationScrollView) this.viewModel).m76194b(viewM200609Z3, 0);
                } else {
                    ((LiveOperationScrollView) this.viewModel).m76193a(viewM200609Z3);
                }
                bnl0.m105539W(viewM200609Z3, qa00.m175859d(2.0f));
            }
        }
        ((LiveOperationScrollView) this.viewModel).m76199i(new qcj() { // from class: l.iat
            @Override // p153l.qcj
            public final Object call(Object obj2) {
                return this.f113617a.m200615h4((String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final void m200626s4(@Nullable String str, long j, LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        m200627t4(str, j, operationUpdateNotice, false);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r6v5, types: [l.oo2] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        m200627t4(null, 0L, null, true);
        duringCreated(m213810E2().m168545q1().m98226F()).subscribe(dhw.m115829h(new y20() { // from class: l.gat
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f103024a.m200623p4((LongLinkSocketMessage.OperationUpdateNotice) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98224E().filter(new qcj() { // from class: l.mat
            @Override // p153l.qcj
            public final Object call(Object obj) {
                fat fatVar = (fat) obj;
                return Boolean.valueOf((BLiveOperation.REFRESH_UNIT.equals(fatVar.f98008a) || fatVar.f98008a.showOperationDrawer) ? false : true);
            }
        })).subscribe(dhw.m115829h(new y20() { // from class: l.nat
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141042a.m200618k4((fat) obj);
            }
        }));
        duringCreated(m213811F2().OperationsEvent.showOperationsRoot().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.oat
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f145755a.m200619l4((q260) obj);
            }
        }));
        duringCreated(m213811F2().OperationsEvent.removeOperationItem().m199270g()).filter(new qcj() { // from class: l.pat
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(((q260) obj).m174993e()));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.qat
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156417a.m200620m4((q260) obj);
            }
        }));
        m138860d3(z160.class, new qcj() { // from class: l.rat
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f161944a.m200621n4((z160) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final void m200627t4(final String str, long j, @Nullable final LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice, final boolean z) {
        m138879z3(j, new Runnable() { // from class: l.tat
            @Override // java.lang.Runnable
            public final void run() {
                this.f172800a.m200617j4(str, z, operationUpdateNotice);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public void m200628u4(Point point) {
        this.f183166j = point;
    }

    /* JADX INFO: renamed from: v4 */
    public final void m200629v4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        String data = operationUpdateNotice.getData();
        BLiveOperationItem bLiveOperationItemNew_ = BLiveOperationItem.new_();
        bLiveOperationItemNew_.type = BLiveOperationPlaceType.lotteryGiftRedPacket;
        bLiveOperationItemNew_.extraData = data;
        m213811F2().OperationsEvent.boostStart().mo199273j(new q260.C19505a(8100).m175005d(bLiveOperationItemNew_).m175002a());
    }

    /* JADX INFO: renamed from: w4 */
    public final void m200630w4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        String data = operationUpdateNotice.getData();
        BLiveOperationItem bLiveOperationItemNew_ = BLiveOperationItem.new_();
        bLiveOperationItemNew_.type = BLiveOperationPlaceType.turboCoupon;
        bLiveOperationItemNew_.extraData = data;
        m213811F2().OperationsEvent.boostStart().mo199273j(new q260.C19505a(8100).m175005d(bLiveOperationItemNew_).m175002a());
    }
}
