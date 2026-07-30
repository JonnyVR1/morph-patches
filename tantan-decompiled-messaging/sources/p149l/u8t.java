package p149l;

import android.annotation.SuppressLint;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveOperation;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationAnimation;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationAnimationEnterType;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationPlaceType;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.LiveOperationScrollView;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public class u8t extends h4t<ho2, LiveOperationScrollView> {

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap<String, BLiveOperationItem> f175159i;

    /* JADX INFO: renamed from: j */
    public Point f175160j;

    /* JADX INFO: renamed from: k */
    public final int f175161k;

    /* JADX INFO: renamed from: l */
    public Random f175162l;

    /* JADX INFO: renamed from: l.u8t$a */
    public static /* synthetic */ class C20379a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f175163a;

        static {
            int[] iArr = new int[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.values().length];
            f175163a = iArr;
            try {
                iArr[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.List.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f175163a[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Element.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f175163a[LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Data.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public u8t(bsm bsmVar, LiveOperationScrollView liveOperationScrollView) {
        super(bsmVar);
        this.f175159i = new LinkedHashMap<>();
        this.f175161k = t100.m186890d(154.0f);
        mo51532C(liveOperationScrollView);
    }

    /* JADX INFO: renamed from: b4 */
    private int m192232b4() {
        if (NullChecker.m81303a(this.f175160j)) {
            int i = this.f175160j.x;
            int i2 = this.f175161k;
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
    private String m192233d4() {
        return m206027E2().mo149813j().isNormalLive() ? "video" : "";
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        m129301d3(zr50.class, new w9j() { // from class: l.r8t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f158250a.m192239g4((zr50) obj);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: Z3 */
    public View m192234Z3(BLiveOperationItem bLiveOperationItem) {
        return vt50.m199915c().m199916a(this, this.f188512e, bLiveOperationItem);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: a4 */
    public final String m192235a4() {
        return m206027E2().mo149813j().anchor.f44419id;
    }

    /* JADX INFO: renamed from: c4 */
    public final long m192236c4(int i) {
        if (!NullChecker.m81303a(this.f175162l)) {
            this.f175162l = new Random();
        }
        return (long) (this.f175162l.nextFloat() * i * 1000.0f);
    }

    /* JADX INFO: renamed from: e4 */
    public final boolean m192237e4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        return operationUpdateNotice.getOperationType().equals(BLiveOperationPlaceType.lotteryGiftRedPacket) && operationUpdateNotice.getPosition() == LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Data && !TextUtils.isEmpty(operationUpdateNotice.getData());
    }

    /* JADX INFO: renamed from: f4 */
    public final boolean m192238f4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        return operationUpdateNotice.getOperationType().equals(BLiveOperationPlaceType.turboCoupon) && operationUpdateNotice.getPosition() == LongLinkSocketMessage.OperationUpdateNotice.OperationUpdatePosition.Data && !TextUtils.isEmpty(operationUpdateNotice.getData());
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ Integer m192239g4(zr50 zr50Var) {
        return Integer.valueOf(m192232b4());
    }

    /* JADX INFO: renamed from: h4 */
    public final /* synthetic */ Boolean m192240h4(String str) {
        return Boolean.valueOf(!this.f175159i.containsKey(str));
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ void m192241i4(final String str, boolean z, LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice, BLiveOperation bLiveOperation) {
        if (TextUtils.isEmpty(str)) {
            this.f175159i.clear();
        } else if (!NullChecker.m81303a((BLiveOperationItem) vwb.m200346r(bLiveOperation.operations, new w9j() { // from class: l.j8t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(str.equals(((BLiveOperationItem) obj).type));
            }
        }))) {
            ((LiveOperationScrollView) this.viewModel).m75016i(new w9j() { // from class: l.k8t
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(str.equals((String) obj));
                }
            });
        }
        bLiveOperation.isInit = z;
        if (NullChecker.m81303a(operationUpdateNotice)) {
            bLiveOperation.extraData = operationUpdateNotice.getData();
            if (NullChecker.m81303a(operationUpdateNotice.getAnimation()) && bLiveOperation.operations.size() > 0) {
                bLiveOperation.operations.get(0).animation = m192247o4(operationUpdateNotice.getAnimation());
            }
        }
        m206027E2().m132064F1(bLiveOperation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r0v2, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: j4 */
    public final /* synthetic */ void m192242j4(final String str, final boolean z, final LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        zfv.m218500D0(str, m192235a4(), m206027E2().mo149817n().f44324id, m192233d4(), m206027E2().mo149813j().liveMode, "").subscribe(ffw.m121197h(new e30() { // from class: l.i8t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f112065a.m192241i4(str, z, operationUpdateNotice, (BLiveOperation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m192243k4(e8t e8tVar) {
        m192250r4(vwb.m200339n(e8tVar.f89863a.operations, new w9j() { // from class: l.g8t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(((BLiveOperationItem) obj).title));
            }
        }), e8tVar.f89863a.extraData);
        m192249q4(e8tVar.f89863a);
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m192244l4(ku50 ku50Var) {
        ((LiveOperationScrollView) this.viewModel).m75017j(ku50Var.m147251i().booleanValue());
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m192245m4(final ku50 ku50Var) {
        ((LiveOperationScrollView) this.viewModel).m75016i(new w9j() { // from class: l.t8t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((String) obj).equals(ku50Var.m147247e().type));
            }
        });
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        ((LiveOperationScrollView) this.viewModel).m75015f();
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ Pair m192246n4(tt50 tt50Var) {
        return ((LiveOperationScrollView) this.viewModel).m75014e(tt50Var.m190597e());
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: o4 */
    public final BLiveOperationAnimation m192247o4(@NonNull LongLinkSocketMessage.OperationAnimation operationAnimation) {
        BLiveOperationAnimation bLiveOperationAnimationNew_ = BLiveOperationAnimation.new_();
        bLiveOperationAnimationNew_.enter.animationType = BLiveOperationAnimationEnterType.get(operationAnimation.getEnter().getAnimationType());
        bLiveOperationAnimationNew_.enter.imageUrl = operationAnimation.getEnter().getImageUrl();
        bLiveOperationAnimationNew_.enter.isTop = operationAnimation.getEnter().getIsTop();
        return bLiveOperationAnimationNew_;
    }

    /* JADX INFO: renamed from: p4 */
    public final void m192248p4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        int i = C20379a.f175163a[operationUpdateNotice.getPosition().ordinal()];
        if (i == 1) {
            m192251s4(null, m192236c4((int) operationUpdateNotice.getRandomDelaySeconds()), null);
            return;
        }
        if ((i == 2 || i == 3) && !TextUtils.isEmpty(operationUpdateNotice.getOperationType())) {
            if (m192237e4(operationUpdateNotice)) {
                m192254v4(operationUpdateNotice);
                return;
            }
            if (m192238f4(operationUpdateNotice)) {
                m192255w4(operationUpdateNotice);
            }
            m192251s4(operationUpdateNotice.getOperationType(), m192236c4((int) operationUpdateNotice.getRandomDelaySeconds()), operationUpdateNotice);
        }
    }

    /* JADX INFO: renamed from: q4 */
    public final void m192249q4(BLiveOperation bLiveOperation) {
        if (bLiveOperation.operations.size() > 0) {
            for (int size = bLiveOperation.operations.size() - 1; size >= 0; size--) {
                BLiveOperationItem bLiveOperationItem = bLiveOperation.operations.get(size);
                if (bLiveOperationItem.enableEntranceAnim()) {
                    m206028F2().OperationsEvent.showEntranceAnim().mo172463j(new ku50.C18083a(8100).m147259d(bLiveOperationItem).m147263h(false).m147256a());
                }
            }
        }
    }

    /* JADX INFO: renamed from: r4 */
    public final void m192250r4(List<BLiveOperationItem> list, String str) {
        for (BLiveOperationItem bLiveOperationItem : list) {
            bLiveOperationItem.extraData = str;
            this.f175159i.put(bLiveOperationItem.type, bLiveOperationItem);
            Pair<Integer, View> pairM75013d = ((LiveOperationScrollView) this.viewModel).m75013d(bLiveOperationItem.type);
            if (NullChecker.m81303a(pairM75013d)) {
                Object obj = pairM75013d.second;
                if (obj instanceof azl) {
                    ((azl) ((View) obj)).mo75051a(bLiveOperationItem);
                }
            }
            View viewM192234Z3 = m192234Z3(bLiveOperationItem);
            if (NullChecker.m81303a(viewM192234Z3)) {
                viewM192234Z3.setTag(bLiveOperationItem.type);
                if (bLiveOperationItem.enableEntranceAnim() || bLiveOperationItem.enableOperationTop()) {
                    ((LiveOperationScrollView) this.viewModel).m75011b(viewM192234Z3, 0);
                } else {
                    ((LiveOperationScrollView) this.viewModel).m75010a(viewM192234Z3);
                }
                xdl0.m208359W(viewM192234Z3, t100.m186890d(2.0f));
            }
        }
        ((LiveOperationScrollView) this.viewModel).m75016i(new w9j() { // from class: l.h8t
            @Override // p149l.w9j
            public final Object call(Object obj2) {
                return this.f106463a.m192240h4((String) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public final void m192251s4(@Nullable String str, long j, LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        m192252t4(str, j, operationUpdateNotice, false);
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r6v5, types: [l.ho2] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        m192252t4(null, 0L, null, true);
        duringCreated(m206027E2().m132160q1().m189044F()).subscribe(ffw.m121197h(new e30() { // from class: l.f8t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f96404a.m192248p4((LongLinkSocketMessage.OperationUpdateNotice) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189042E().filter(new w9j() { // from class: l.l8t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                e8t e8tVar = (e8t) obj;
                return Boolean.valueOf((BLiveOperation.REFRESH_UNIT.equals(e8tVar.f89863a) || e8tVar.f89863a.showOperationDrawer) ? false : true);
            }
        })).subscribe(ffw.m121197h(new e30() { // from class: l.m8t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132615a.m192243k4((e8t) obj);
            }
        }));
        duringCreated(m206028F2().OperationsEvent.showOperationsRoot().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.n8t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137685a.m192244l4((ku50) obj);
            }
        }));
        duringCreated(m206028F2().OperationsEvent.removeOperationItem().m172460g()).filter(new w9j() { // from class: l.o8t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(((ku50) obj).m147247e()));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.p8t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147633a.m192245m4((ku50) obj);
            }
        }));
        m129301d3(tt50.class, new w9j() { // from class: l.q8t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f153333a.m192246n4((tt50) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public final void m192252t4(final String str, long j, @Nullable final LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice, final boolean z) {
        m129320z3(j, new Runnable() { // from class: l.s8t
            @Override // java.lang.Runnable
            public final void run() {
                this.f163106a.m192242j4(str, z, operationUpdateNotice);
            }
        });
    }

    /* JADX INFO: renamed from: u4 */
    public void m192253u4(Point point) {
        this.f175160j = point;
    }

    /* JADX INFO: renamed from: v4 */
    public final void m192254v4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        String data = operationUpdateNotice.getData();
        BLiveOperationItem bLiveOperationItemNew_ = BLiveOperationItem.new_();
        bLiveOperationItemNew_.type = BLiveOperationPlaceType.lotteryGiftRedPacket;
        bLiveOperationItemNew_.extraData = data;
        m206028F2().OperationsEvent.boostStart().mo172463j(new ku50.C18083a(8100).m147259d(bLiveOperationItemNew_).m147256a());
    }

    /* JADX INFO: renamed from: w4 */
    public final void m192255w4(LongLinkSocketMessage.OperationUpdateNotice operationUpdateNotice) {
        String data = operationUpdateNotice.getData();
        BLiveOperationItem bLiveOperationItemNew_ = BLiveOperationItem.new_();
        bLiveOperationItemNew_.type = BLiveOperationPlaceType.turboCoupon;
        bLiveOperationItemNew_.extraData = data;
        m206028F2().OperationsEvent.boostStart().mo172463j(new ku50.C18083a(8100).m147259d(bLiveOperationItemNew_).m147256a());
    }
}
