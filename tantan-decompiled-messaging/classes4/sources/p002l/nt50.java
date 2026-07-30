package p002l;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationMessageView;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Objects;
import l.ac20;
import l.bii0;
import l.bt0;
import l.bwr;
import l.d30;
import l.dt0;
import l.e30;
import l.e51;
import l.ffw;
import l.fld0;
import l.ggv;
import l.hxs;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nt50 extends wq50<ho2, OperationMessageView> {

    /* JADX INFO: renamed from: k */
    public final int f16185k;

    /* JADX INFO: renamed from: l */
    public final int f16186l;

    /* JADX INFO: renamed from: m */
    public final int f16187m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f16188n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f16189o;

    public nt50(bsm bsmVar, OperationMessageView operationMessageView) {
        super(bsmVar);
        this.f16185k = t100.d(42.0f);
        this.f16186l = t100.d(148.0f);
        this.f16187m = 150;
        C(operationMessageView);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m18981Y3(ac20 ac20Var, d30 d30Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ac20Var.e(bitmap.copy(bitmap.getConfig(), false));
        }
        Objects.requireNonNull(d30Var);
        e51.M(new bii0(d30Var));
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m18988f4(final d30 d30Var, final ac20 ac20Var) {
        if (ac20Var.d()) {
            return;
        }
        hxs.g("context_livingAct", ac20Var.c().trim(), new e30() { // from class: l.dt50
            public final void call(Object obj) {
                nt50.m18981Y3(ac20Var, d30Var, (Bitmap) obj);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m18990T() {
        super.T();
        duringCreated((c) m25548F2().OperationsEvent.messageOpen().g()).subscribe(ffw.d(new e30() { // from class: l.et50
            public final void call(Object obj) {
                this.f9959a.m18994k4((ku50) obj);
            }
        }));
    }

    @Override // p002l.wq50
    /* JADX INFO: renamed from: T3 */
    public void mo16243T3(Drawable drawable) {
        super.mo16243T3(drawable);
        ((OperationMessageView) ((bwr) this).viewModel).setBackground(drawable);
    }

    /* JADX INFO: renamed from: h4 */
    public final void m18991h4() {
        ((OperationMessageView) ((bwr) this).viewModel).f4099e.m7876b();
        xdl0.M0(((bwr) this).viewModel, false);
        m19006v4(true);
        if (NullChecker.a(this.f21910i)) {
            if (((Boolean) ((Pair) m14184F3(new tt50(8100).m23169f(this.f21910i.type))).first).booleanValue()) {
                m25548F2().OperationsEvent.messageIconTrans().j(new ku50.C0652a(8100).m16802d(this.f21910i).m16805g(((OperationMessageView) ((bwr) this).viewModel).getOperationIconPos()).m16800b(false).m16799a());
            } else {
                m25548F2().OperationsEvent.refreshOperationMessage().j(new ku50.C0652a(8100).m16799a());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: i4 */
    public void m18992i4() {
        if (NullChecker.a(this.f21910i) && NullChecker.a(this.f21910i.popup) && NullChecker.a(this.f21910i.popup.textDrawer)) {
            mu50.m18185c(m25552L2(), m25547E2(), this.f21910i.type, BLiveOperationPopupType.get("TextDrawer"));
            String string = this.f21910i.popup.textDrawer.actionAfterClick.toString();
            int iHashCode = string.hashCode();
            if (iHashCode == -1583193058) {
                if (string.equals("h5Drawer")) {
                    if (NullChecker.a(this.f16189o)) {
                        dt0.A(this.f16189o);
                        ((OperationMessageView) ((bwr) this).viewModel).m8679e();
                        m18993j4(0, ((OperationMessageView) ((bwr) this).viewModel).getWidth());
                    }
                    m25294N3(BLiveOperationPopupType.get("H5Drawer"));
                    return;
                }
                return;
            }
            if (iHashCode != -1236897202) {
                if (iHashCode != -240132779) {
                    return;
                }
                string.equals("unknown_");
            } else {
                if (!string.equals("jumpToScheme") || TextUtils.isEmpty(this.f21910i.popup.textDrawer.jumpScheme)) {
                    return;
                }
                m25548F2().SchemeHandleEvent.handleScheme().j(new x1e0.C0891a(200).m25610e(this.f21910i.popup.textDrawer.jumpScheme).m25608c());
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public ValueAnimator m18993j4(int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, this.f16185k);
        this.f16188n = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ft50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f10629a.m18995l4(valueAnimator);
            }
        });
        if (i > 1) {
            this.f16188n.setStartDelay(1200L);
        }
        this.f16188n.setDuration(i);
        bt0.f(this.f16188n, new Runnable() { // from class: l.gt50
            @Override // java.lang.Runnable
            public final void run() {
                this.f11623a.m18991h4();
            }
        });
        this.f16188n.start();
        return this.f16188n;
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m18994k4(ku50 ku50Var) {
        m19001r4();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m18995l4(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((OperationMessageView) ((bwr) this).viewModel).getLayoutParams();
        layoutParams.width = iIntValue;
        ((OperationMessageView) ((bwr) this).viewModel).setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m18996m4(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((OperationMessageView) ((bwr) this).viewModel).getLayoutParams();
        layoutParams.width = iIntValue;
        ((OperationMessageView) ((bwr) this).viewModel).setLayoutParams(layoutParams);
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        dt0.A(this.f16188n);
        dt0.A(this.f16189o);
        ((OperationMessageView) ((bwr) this).viewModel).m8686p();
        m18993j4(1, this.f16186l);
        xdl0.M(((bwr) this).viewModel, false);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m18997n4() {
        m18993j4(150, this.f16186l);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m18998o4() {
        ((OperationMessageView) ((bwr) this).viewModel).m8680f(new Runnable() { // from class: l.lt50
            @Override // java.lang.Runnable
            public final void run() {
                this.f15050a.m18997n4();
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m18999p4(BLiveOperationItem bLiveOperationItem, Integer num) {
        ((OperationMessageView) ((bwr) this).viewModel).m8684m(bLiveOperationItem);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m19000q4(ku50 ku50Var) {
        m19005u4(ku50Var.m16790e(), ku50Var.m16789d());
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public void m19001r4() {
        if (NullChecker.a(this.f21910i)) {
            mu50.m18186d(m25552L2(), m25547E2(), this.f21910i.type, BLiveOperationPopupType.get("TextDrawer"));
        }
        xdl0.M0(((bwr) this).viewModel, true);
        m19006v4(false);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f16185k, this.f16186l);
        this.f16189o = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jt50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14009a.m18996m4(valueAnimator);
            }
        });
        bt0.f(this.f16189o, new Runnable() { // from class: l.kt50
            @Override // java.lang.Runnable
            public final void run() {
                this.f14506a.m18998o4();
            }
        });
        this.f16189o.setDuration(150L);
        this.f16189o.start();
    }

    /* JADX INFO: renamed from: s4 */
    public void m19002s4(SpannableStringBuilder spannableStringBuilder, final d30 d30Var) {
        vwb.z(Arrays.asList((ac20[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ac20.class)), new e30() { // from class: l.mt50
            public final void call(Object obj) {
                nt50.m18988f4(d30Var, (ac20) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m19003t() {
        super.t();
        duringCreated((c) m25548F2().OperationsEvent.openOperationMessage().g()).subscribe(ffw.d(new e30() { // from class: l.ct50
            public final void call(Object obj) {
                this.f8933a.m19000q4((ku50) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m19004t4(BLiveOperationItem bLiveOperationItem) {
        this.f21910i = bLiveOperationItem;
    }

    /* JADX INFO: renamed from: u4 */
    public void m19005u4(final BLiveOperationItem bLiveOperationItem, LiveMessage liveMessage) {
        if (liveMessage != null && NullChecker.a(bLiveOperationItem.popup) && NullChecker.a(bLiveOperationItem.popup.textDrawer)) {
            ((OperationMessageView) ((bwr) this).viewModel).m8682k(bLiveOperationItem, liveMessage);
            Pair pair = (Pair) m14184F3(new tt50(8100).m23169f(bLiveOperationItem.type));
            ((ggv) ypv.l(fld0.c)).i = true;
            boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
            View view = ((bwr) this).viewModel;
            if (zBooleanValue) {
                duringCreated(xdl0.K(view)).onBackpressureLatest().filter(new w9j() { // from class: l.ht50
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() > 0);
                    }
                }).first().subscribe(ffw.d(new e30() { // from class: l.it50
                    public final void call(Object obj) {
                        this.f13405a.m18999p4(bLiveOperationItem, (Integer) obj);
                    }
                }));
            } else {
                ((OperationMessageView) view).m8685n(bLiveOperationItem);
            }
        }
    }

    /* JADX INFO: renamed from: v4 */
    public void m19006v4(boolean z) {
        m25548F2().OperationsEvent.showOperationsRoot().j(new ku50.C0652a(8100).m16807i(z).m16799a());
    }
}
