package p002l;

import com.p000p1.mobile.putong.live.livingroom.common.chat.danmaku.input.effects.EffectsDanmakuEvent$Page;
import java.util.Objects;
import l.bwr;
import l.e30;
import l.ffw;
import l.soj0;
import p002l.ho2;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tqe<T extends ho2> extends h4t<T, xqe> {

    /* JADX INFO: renamed from: i */
    public iyf0<? extends T> f20339i;

    /* JADX INFO: renamed from: j */
    public jyf0<? extends T> f20340j;

    /* JADX INFO: renamed from: k */
    public zqe f20341k;

    /* JADX INFO: renamed from: l.tqe$a */
    public static /* synthetic */ class C0837a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f20342a;

        static {
            int[] iArr = new int[EffectsDanmakuEvent$Page.values().length];
            f20342a = iArr;
            try {
                iArr[EffectsDanmakuEvent$Page.STORM_RULE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f20342a[EffectsDanmakuEvent$Page.STORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public tqe(bsm<T> bsmVar) {
        super(bsmVar);
        C(new xqe());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L3 */
    public /* synthetic */ void m23109L3(soj0 soj0Var) {
        ((xqe) ((bwr) this).viewModel).m26058i();
    }

    /* JADX INFO: renamed from: M3 */
    public void m23110M3() {
        zqe zqeVar = this.f20341k;
        if (zqeVar != null ? zqeVar.mo15518V() : false) {
            return;
        }
        ((xqe) ((bwr) this).viewModel).m26058i();
    }

    /* JADX INFO: renamed from: N3 */
    public final void m23111N3(oqe oqeVar) {
        if (!((xqe) ((bwr) this).viewModel).m26060j()) {
            ((xqe) ((bwr) this).viewModel).m26064n();
        }
        m23112O3(oqeVar);
    }

    /* JADX INFO: renamed from: O3 */
    public final void m23112O3(oqe oqeVar) {
        if (C0837a.f20342a[oqeVar.f16746a.ordinal()] != 1) {
            if (this.f20339i == null) {
                this.f20339i = (iyf0) z2(new iyf0(this.f22036e));
            }
            ((xqe) ((bwr) this).viewModel).m26065p(this.f20339i, oqeVar);
            this.f20341k = this.f20339i;
            return;
        }
        if (this.f20340j == null) {
            this.f20340j = (jyf0) z2(new jyf0(this.f22036e));
        }
        ((xqe) ((bwr) this).viewModel).m26065p(this.f20340j, oqeVar);
        this.f20341k = this.f20340j;
    }

    /* JADX INFO: renamed from: t */
    public void m23113t() {
        super.t();
        duringCreated((c) m25548F2().EffectsDanmakuEvent.showEffectsDanmakuDialog().g()).subscribe(ffw.d(new e30() { // from class: l.qqe
            public final void call(Object obj) {
                this.f18181a.m23111N3((oqe) obj);
            }
        }));
        duringCreated((c) m25548F2().EffectsDanmakuEvent.dismissEffectsDanmakuDialog().g()).subscribe(ffw.d(new e30() { // from class: l.rqe
            public final void call(Object obj) {
                this.f18645a.m23109L3((soj0) obj);
            }
        }));
        c cVarDuringCreated = duringCreated((c) m25548F2().EffectsDanmakuEvent.verticalTranslateDialogContent().g());
        final xqe xqeVar = (xqe) ((bwr) this).viewModel;
        Objects.requireNonNull(xqeVar);
        cVarDuringCreated.subscribe(ffw.d(new e30() { // from class: l.sqe
            public final void call(Object obj) {
                xqeVar.m26066q(((Integer) obj).intValue());
            }
        }));
    }
}
