package p149l;

import com.p046p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import java.util.Objects;
import p133rx.C22306c;
import p149l.ho2;

/* JADX INFO: loaded from: classes4.dex */
public class tqe<T extends ho2> extends h4t<T, xqe> {

    /* JADX INFO: renamed from: i */
    public iyf0<? extends T> f171574i;

    /* JADX INFO: renamed from: j */
    public jyf0<? extends T> f171575j;

    /* JADX INFO: renamed from: k */
    public zqe f171576k;

    /* JADX INFO: renamed from: l.tqe$a */
    public static /* synthetic */ class C20247a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f171577a;

        static {
            int[] iArr = new int[EffectsDanmakuEvent$Page.values().length];
            f171577a = iArr;
            try {
                iArr[EffectsDanmakuEvent$Page.STORM_RULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f171577a[EffectsDanmakuEvent$Page.STORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public tqe(bsm<T> bsmVar) {
        super(bsmVar);
        mo51532C(new xqe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m190096L3(soj0 soj0Var) {
        ((xqe) this.viewModel).m210574i();
    }

    /* JADX INFO: renamed from: M3 */
    public void m190097M3() {
        zqe zqeVar = this.f171576k;
        if (zqeVar != null ? zqeVar.mo138975V() : false) {
            return;
        }
        ((xqe) this.viewModel).m210574i();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m190098N3(oqe oqeVar) {
        if (!((xqe) this.viewModel).m210575j()) {
            ((xqe) this.viewModel).m210579n();
        }
        m190099O3(oqeVar);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m190099O3(oqe oqeVar) {
        if (C20247a.f171577a[oqeVar.f145128a.ordinal()] != 1) {
            if (this.f171574i == null) {
                this.f171574i = (iyf0) m144512z2(new iyf0(this.f188512e));
            }
            ((xqe) this.viewModel).m210580p(this.f171574i, oqeVar);
            this.f171576k = this.f171574i;
            return;
        }
        if (this.f171575j == null) {
            this.f171575j = (jyf0) m144512z2(new jyf0(this.f188512e));
        }
        ((xqe) this.viewModel).m210580p(this.f171575j, oqeVar);
        this.f171576k = this.f171575j;
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated((C22306c<T>) m206028F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.qqe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155884a.m190098N3((oqe) obj);
            }
        }));
        duringCreated((C22306c<T>) m206028F2().EffectsDanmakuEvent.dismissEffectsDanmakuDialog().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.rqe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160618a.m190096L3((soj0) obj);
            }
        }));
        C22306c<T> c22306cDuringCreated = duringCreated((C22306c<T>) m206028F2().EffectsDanmakuEvent.verticalTranslateDialogContent().m172460g());
        final xqe xqeVar = (xqe) this.viewModel;
        Objects.requireNonNull(xqeVar);
        c22306cDuringCreated.subscribe(ffw.m121193d(new e30() { // from class: l.sqe
            @Override // p149l.e30
            public final void call(Object obj) {
                xqeVar.m210581q(((Integer) obj).intValue());
            }
        }));
    }
}
