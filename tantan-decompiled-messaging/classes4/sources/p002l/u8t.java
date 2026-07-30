package p002l;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.LiveOperationScrollView;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.putong.live.base.data.BLiveOperation;
import com.p1.mobile.putong.live.base.data.BLiveOperationAnimation;
import com.p1.mobile.putong.live.base.data.BLiveOperationAnimationEnterType;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;
import l.bwr;
import l.e30;
import l.ffw;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class u8t extends h4t<ho2, LiveOperationScrollView> {

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap<String, BLiveOperationItem> f20542i;

    /* JADX INFO: renamed from: j */
    public Point f20543j;

    /* JADX INFO: renamed from: k */
    public final int f20544k;

    /* JADX INFO: renamed from: l */
    public Random f20545l;

    /* JADX INFO: renamed from: l.u8t$a */
    public static /* synthetic */ class C0852a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20546a;

        static {
            int[] iArr = new int[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.values().length];
            f20546a = iArr;
            try {
                iArr[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.List.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20546a[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Element.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f20546a[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Data.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public u8t(bsm bsmVar, LiveOperationScrollView liveOperationScrollView) {
        super(bsmVar);
        this.f20542i = new LinkedHashMap<>();
        this.f20544k = t100.d(154.0f);
        C(liveOperationScrollView);
    }

    /* JADX INFO: renamed from: b4 */
    private int m23356b4() {
        if (NullChecker.a(this.f20543j)) {
            int i = this.f20543j.x;
            int i2 = this.f20544k;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: d4 */
    private String m23357d4() {
        return m25547E2().m17234j().isNormalLive() ? "video" : "";
    }

    /* JADX INFO: renamed from: T */
    public void m23358T() {
        super.T();
        m14188d3(zr50.class, new w9j() { // from class: l.r8t
            public final Object call(Object obj) {
                return this.f18414a.m23364g4((zr50) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: Z3 */
    public View m23359Z3(BLiveOperationItem bLiveOperationItem) {
        return vt50.m24121c().m24122a(this, this.f22036e, bLiveOperationItem);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: a4 */
    public final String m23360a4() {
        return m25547E2().m17234j().anchor.id;
    }

    /* JADX INFO: renamed from: c4 */
    public final long m23361c4(int i) {
        if (!NullChecker.a(this.f20545l)) {
            this.f20545l = new Random();
        }
        return (long) (this.f20545l.nextFloat() * i * 1000.0f);
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m23362e4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        return operationUpdateNotice.getOperationType().equals("lotteryGiftRedPacket") && operationUpdateNotice.getPosition() == LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Data && !TextUtils.isEmpty(operationUpdateNotice.getData());
    }

    /* JADX INFO: renamed from: f4 */
    public final boolean m23363f4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        return operationUpdateNotice.getOperationType().equals("turboCoupon") && operationUpdateNotice.getPosition() == LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Data && !TextUtils.isEmpty(operationUpdateNotice.getData());
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ Integer m23364g4(zr50 zr50Var) {
        return Integer.valueOf(m23356b4());
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ Boolean m23365h4(String str) {
        return Boolean.valueOf(!this.f20542i.containsKey(str));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m23366i4(final String str, boolean z, LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice, BLiveOperation bLiveOperation) {
        if (TextUtils.isEmpty(str)) {
            this.f20542i.clear();
        } else if (!NullChecker.a((BLiveOperationItem) vwb.r(bLiveOperation.operations, new w9j() { // from class: l.j8t
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveOperationItem) obj).type));
            }
        }))) {
            ((LiveOperationScrollView) ((bwr) this).viewModel).m8625i(new w9j() { // from class: l.k8t
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals((String) obj));
                }
            });
        }
        bLiveOperation.isInit = z;
        if (NullChecker.a(operationUpdateNotice)) {
            bLiveOperation.extraData = operationUpdateNotice.getData();
            if (NullChecker.a(operationUpdateNotice.getAnimation()) && bLiveOperation.operations.size() > 0) {
                ((BLiveOperationItem) bLiveOperation.operations.get(0)).animation = m23372o4(operationUpdateNotice.getAnimation());
            }
        }
        m25547E2().m14500F1(bLiveOperation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m23367j4(final String str, final boolean z, final LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        zfv.m27203D0(str, m23360a4(), m25547E2().m17238n().id, m23357d4(), m25547E2().m17234j().liveMode, "").subscribe(ffw.h(new e30() { // from class: l.i8t
            public final void call(Object obj) {
                this.f13108a.m23366i4(str, z, operationUpdateNotice, (BLiveOperation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m23368k4(e8t e8tVar) {
        m23375r4(vwb.n(e8tVar.f9634a.operations, new w9j() { // from class: l.g8t
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(((BLiveOperationItem) obj).title));
            }
        }), e8tVar.f9634a.extraData);
        m23374q4(e8tVar.f9634a);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m23369l4(ku50 ku50Var) {
        ((LiveOperationScrollView) ((bwr) this).viewModel).m8627j(ku50Var.m16794i().booleanValue());
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m23370m4(final ku50 ku50Var) {
        ((LiveOperationScrollView) ((bwr) this).viewModel).m8625i(new w9j() { // from class: l.t8t
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(ku50Var.m16790e().type));
            }
        });
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        ((LiveOperationScrollView) ((bwr) this).viewModel).m8624f();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Pair m23371n4(tt50 tt50Var) {
        return ((LiveOperationScrollView) ((bwr) this).viewModel).m8623e(tt50Var.m23168e());
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: o4 */
    public final BLiveOperationAnimation m23372o4(@NonNull LongLinkSocketMessage.OperationAnimation operationAnimation) {
        BLiveOperationAnimation bLiveOperationAnimationNew_ = BLiveOperationAnimation.new_();
        bLiveOperationAnimationNew_.enter.animationType = BLiveOperationAnimationEnterType.get(operationAnimation.getEnter().getAnimationType());
        bLiveOperationAnimationNew_.enter.imageUrl = operationAnimation.getEnter().getImageUrl();
        bLiveOperationAnimationNew_.enter.isTop = operationAnimation.getEnter().getIsTop();
        return bLiveOperationAnimationNew_;
    }

    /* JADX INFO: renamed from: p4 */
    public final void m23373p4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        int i = C0852a.f20546a[operationUpdateNotice.getPosition().ordinal()];
        if (i == 1) {
            m23376s4(null, m23361c4((int) operationUpdateNotice.getRandomDelaySeconds()), null);
            return;
        }
        if ((i == 2 || i == 3) && !TextUtils.isEmpty(operationUpdateNotice.getOperationType())) {
            if (m23362e4(operationUpdateNotice)) {
                m23380v4(operationUpdateNotice);
                return;
            }
            if (m23363f4(operationUpdateNotice)) {
                m23381w4(operationUpdateNotice);
            }
            m23376s4(operationUpdateNotice.getOperationType(), m23361c4((int) operationUpdateNotice.getRandomDelaySeconds()), operationUpdateNotice);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final void m23374q4(BLiveOperation bLiveOperation) {
        if (bLiveOperation.operations.size() > 0) {
            for (int size = bLiveOperation.operations.size() - 1; size >= 0; size--) {
                BLiveOperationItem bLiveOperationItem = (BLiveOperationItem) bLiveOperation.operations.get(size);
                if (bLiveOperationItem.enableEntranceAnim()) {
                    m25548F2().OperationsEvent.showEntranceAnim().j(new ku50.C0652a(8100).m16802d(bLiveOperationItem).m16806h(false).m16799a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m23375r4(List<BLiveOperationItem> list, String str) {
        for (BLiveOperationItem bLiveOperationItem : list) {
            bLiveOperationItem.extraData = str;
            this.f20542i.put(bLiveOperationItem.type, bLiveOperationItem);
            Pair<Integer, View> pairM8622d = ((LiveOperationScrollView) ((bwr) this).viewModel).m8622d(bLiveOperationItem.type);
            if (NullChecker.a(pairM8622d)) {
                Object obj = pairM8622d.second;
                if (obj instanceof azl) {
                    ((azl) ((View) obj)).mo8662a(bLiveOperationItem);
                }
            }
            View viewM23359Z3 = m23359Z3(bLiveOperationItem);
            if (NullChecker.a(viewM23359Z3)) {
                viewM23359Z3.setTag(bLiveOperationItem.type);
                if (bLiveOperationItem.enableEntranceAnim() || bLiveOperationItem.enableOperationTop()) {
                    ((LiveOperationScrollView) ((bwr) this).viewModel).m8620b(viewM23359Z3, 0);
                } else {
                    ((LiveOperationScrollView) ((bwr) this).viewModel).m8619a(viewM23359Z3);
                }
                xdl0.W(viewM23359Z3, t100.d(2.0f));
            }
        }
        ((LiveOperationScrollView) ((bwr) this).viewModel).m8625i(new w9j() { // from class: l.h8t
            public final Object call(Object obj2) {
                return this.f11943a.m23365h4((String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final void m23376s4(@Nullable String str, long j, LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        m23378t4(str, j, operationUpdateNotice, false);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v5, types: [l.ho2] */
    /* JADX INFO: renamed from: t */
    public void m23377t() {
        super.t();
        m23378t4(null, 0L, null, true);
        duringCreated(m25547E2().m14596q1().F()).subscribe(ffw.h(new e30() { // from class: l.f8t
            public final void call(Object obj) {
                this.f10193a.m23373p4((LongLinkSocketMessage.OperationUpdateNotice) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().E().filter(new w9j() { // from class: l.l8t
            public final Object call(Object obj) {
                e8t e8tVar = (e8t) obj;
                return Boolean.valueOf((BLiveOperation.REFRESH_UNIT.equals(e8tVar.f9634a) || e8tVar.f9634a.showOperationDrawer) ? false : true);
            }
        })).subscribe(ffw.h(new e30() { // from class: l.m8t
            public final void call(Object obj) {
                this.f15287a.m23368k4((e8t) obj);
            }
        }));
        duringCreated((c) m25548F2().OperationsEvent.showOperationsRoot().g()).subscribe(ffw.d(new e30() { // from class: l.n8t
            public final void call(Object obj) {
                this.f15865a.m23369l4((ku50) obj);
            }
        }));
        duringCreated((c) m25548F2().OperationsEvent.removeOperationItem().g()).filter(new w9j() { // from class: l.o8t
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(((ku50) obj).m16790e()));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.p8t
            public final void call(Object obj) {
                this.f17066a.m23370m4((ku50) obj);
            }
        }));
        m14188d3(tt50.class, new w9j() { // from class: l.q8t
            public final Object call(Object obj) {
                return this.f17860a.m23371n4((tt50) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final void m23378t4(final String str, long j, @Nullable final LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice, final boolean z) {
        m14207z3(j, new Runnable() { // from class: l.s8t
            @Override // java.lang.Runnable
            public final void run() {
                this.f18841a.m23367j4(str, z, operationUpdateNotice);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public void m23379u4(Point point) {
        this.f20543j = point;
    }

    /* JADX INFO: renamed from: v4 */
    public final void m23380v4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        String data = operationUpdateNotice.getData();
        BLiveOperationItem bLiveOperationItemNew_ = BLiveOperationItem.new_();
        bLiveOperationItemNew_.type = "lotteryGiftRedPacket";
        bLiveOperationItemNew_.extraData = data;
        m25548F2().OperationsEvent.boostStart().j(new ku50.C0652a(8100).m16802d(bLiveOperationItemNew_).m16799a());
    }

    /* JADX INFO: renamed from: w4 */
    public final void m23381w4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        String data = operationUpdateNotice.getData();
        BLiveOperationItem bLiveOperationItemNew_ = BLiveOperationItem.new_();
        bLiveOperationItemNew_.type = "turboCoupon";
        bLiveOperationItemNew_.extraData = data;
        m25548F2().OperationsEvent.boostStart().j(new ku50.C0652a(8100).m16802d(bLiveOperationItemNew_).m16799a());
    }
}
