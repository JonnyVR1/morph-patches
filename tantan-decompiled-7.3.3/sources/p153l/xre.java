package p153l;

import com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import java.util.Objects;
import p137rx.C22421c;
import p153l.oo2;

/* JADX INFO: loaded from: classes4.dex */
public class xre<T extends oo2> extends i6t<T, bse> {

    /* JADX INFO: renamed from: i */
    public p6g0<? extends T> f195900i;

    /* JADX INFO: renamed from: j */
    public q6g0<? extends T> f195901j;

    /* JADX INFO: renamed from: k */
    public dse f195902k;

    /* JADX INFO: renamed from: l.xre$a */
    public static /* synthetic */ class C21429a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f195903a;

        static {
            int[] iArr = new int[EffectsDanmakuEvent$Page.values().length];
            f195903a = iArr;
            try {
                iArr[EffectsDanmakuEvent$Page.STORM_RULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f195903a[EffectsDanmakuEvent$Page.STORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public xre(dum<T> dumVar) {
        super(dumVar);
        mo52715C(new bse());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m212814L3(vxj0 vxj0Var) {
        ((bse) this.viewModel).m106226i();
    }

    /* JADX INFO: renamed from: M3 */
    public void m212815M3() {
        dse dseVar = this.f195902k;
        if (dseVar != null ? dseVar.mo117725V() : false) {
            return;
        }
        ((bse) this.viewModel).m106226i();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m212816N3(sre sreVar) {
        if (!((bse) this.viewModel).m106227j()) {
            ((bse) this.viewModel).m106231n();
        }
        m212817O3(sreVar);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m212817O3(sre sreVar) {
        if (C21429a.f195903a[sreVar.f170320a.ordinal()] != 1) {
            if (this.f195900i == null) {
                this.f195900i = (p6g0) m153103z2(new p6g0(this.f196918e));
            }
            ((bse) this.viewModel).m106232p(this.f195900i, sreVar);
            this.f195902k = this.f195900i;
            return;
        }
        if (this.f195901j == null) {
            this.f195901j = (q6g0) m153103z2(new q6g0(this.f196918e));
        }
        ((bse) this.viewModel).m106232p(this.f195901j, sreVar);
        this.f195902k = this.f195901j;
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated((C22421c<T>) m213811F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ure
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180608a.m212816N3((sre) obj);
            }
        }));
        duringCreated((C22421c<T>) m213811F2().EffectsDanmakuEvent.dismissEffectsDanmakuDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.vre
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185458a.m212814L3((vxj0) obj);
            }
        }));
        C22421c<T> c22421cDuringCreated = duringCreated((C22421c<T>) m213811F2().EffectsDanmakuEvent.verticalTranslateDialogContent().m199270g());
        final bse bseVar = (bse) this.viewModel;
        Objects.requireNonNull(bseVar);
        c22421cDuringCreated.subscribe(dhw.m115825d(new y20() { // from class: l.wre
            @Override // p153l.y20
            public final void call(Object obj) {
                bseVar.m106233q(((Integer) obj).intValue());
            }
        }));
    }
}
