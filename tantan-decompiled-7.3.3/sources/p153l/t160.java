package p153l;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationMessageView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class t160 extends cz50<oo2, OperationMessageView> {

    /* JADX INFO: renamed from: k */
    public final int f171600k;

    /* JADX INFO: renamed from: l */
    public final int f171601l;

    /* JADX INFO: renamed from: m */
    public final int f171602m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f171603n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f171604o;

    public t160(dum dumVar, OperationMessageView operationMessageView) {
        super(dumVar);
        this.f171600k = qa00.m175859d(42.0f);
        this.f171601l = qa00.m175859d(148.0f);
        this.f171602m = 150;
        mo52715C(operationMessageView);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m188849Y3(jk20 jk20Var, x20 x20Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            jk20Var.m145151e(bitmap.copy(bitmap.getConfig(), false));
        }
        Objects.requireNonNull(x20Var);
        l51.m152893M(new bri0(x20Var));
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m188856f4(final x20 x20Var, final jk20 jk20Var) {
        if (jk20Var.m145150d()) {
            return;
        }
        izs.m142856g("context_livingAct", jk20Var.m145149c().trim(), new y20() { // from class: l.j160
            @Override // p153l.y20
            public final void call(Object obj) {
                t160.m188849Y3(jk20Var, x20Var, (Bitmap) obj);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        duringCreated(m213811F2().OperationsEvent.messageOpen().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.k160
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f123451a.m188861k4((q260) obj);
            }
        }));
    }

    @Override // p153l.cz50
    /* JADX INFO: renamed from: T3 */
    public void mo113266T3(Drawable drawable) {
        super.mo113266T3(drawable);
        ((OperationMessageView) this.viewModel).setBackground(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m188858h4() {
        ((OperationMessageView) this.viewModel).f48905e.m75478b();
        bnl0.m105525M0((View) this.viewModel, false);
        m188872v4(true);
        if (NullChecker.m82486a(this.f84425i)) {
            if (((Boolean) ((Pair) m138856F3(new z160(8100).m218281f(this.f84425i.type))).first).booleanValue()) {
                m213811F2().OperationsEvent.messageIconTrans().mo199273j(new q260.C19505a(8100).m175005d(this.f84425i).m175008g(((OperationMessageView) this.viewModel).getOperationIconPos()).m175003b(false).m175002a());
            } else {
                m213811F2().OperationsEvent.refreshOperationMessage().mo199273j(new q260.C19505a(8100).m175002a());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.oo2] */
    /* JADX INFO: renamed from: i4 */
    public void m188859i4() {
        if (NullChecker.m82486a(this.f84425i) && NullChecker.m82486a(this.f84425i.popup) && NullChecker.m82486a(this.f84425i.popup.textDrawer)) {
            s260.m184111c(m213815L2(), m213810E2(), this.f84425i.type, BLiveOperationPopupType.get(BLiveOperationPopupType.TextDrawer));
            String string = this.f84425i.popup.textDrawer.actionAfterClick.toString();
            int iHashCode = string.hashCode();
            if (iHashCode == -1583193058) {
                if (string.equals("h5Drawer")) {
                    if (NullChecker.m82486a(this.f171604o)) {
                        it0.m142007A(this.f171604o);
                        ((OperationMessageView) this.viewModel).m76250e();
                        m188860j4(0, ((OperationMessageView) this.viewModel).getWidth());
                    }
                    m113261N3(BLiveOperationPopupType.get(BLiveOperationPopupType.H5Drawer));
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
                if (!string.equals("jumpToScheme") || TextUtils.isEmpty(this.f84425i.popup.textDrawer.jumpScheme)) {
                    return;
                }
                m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(200).m103154e(this.f84425i.popup.textDrawer.jumpScheme).m103152c());
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public ValueAnimator m188860j4(int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, this.f171600k);
        this.f171603n = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.l160
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f129653a.m188862l4(valueAnimator);
            }
        });
        if (i > 1) {
            this.f171603n.setStartDelay(1200L);
        }
        this.f171603n.setDuration(i);
        gt0.m132160f(this.f171603n, new Runnable() { // from class: l.m160
            @Override // java.lang.Runnable
            public final void run() {
                this.f134389a.m188858h4();
            }
        });
        this.f171603n.start();
        return this.f171603n;
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m188861k4(q260 q260Var) {
        m188868r4();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m188862l4(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((OperationMessageView) this.viewModel).getLayoutParams();
        layoutParams.width = iIntValue;
        ((OperationMessageView) this.viewModel).setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m188863m4(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((OperationMessageView) this.viewModel).getLayoutParams();
        layoutParams.width = iIntValue;
        ((OperationMessageView) this.viewModel).setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        it0.m142007A(this.f171603n);
        it0.m142007A(this.f171604o);
        ((OperationMessageView) this.viewModel).m76257p();
        m188860j4(1, this.f171601l);
        bnl0.m105524M((View) this.viewModel, false);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m188864n4() {
        m188860j4(150, this.f171601l);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m188865o4() {
        ((OperationMessageView) this.viewModel).m76251f(new Runnable() { // from class: l.r160
            @Override // java.lang.Runnable
            public final void run() {
                this.f160778a.m188864n4();
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m188866p4(BLiveOperationItem bLiveOperationItem, Integer num) {
        ((OperationMessageView) this.viewModel).m76255m(bLiveOperationItem);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m188867q4(q260 q260Var) {
        m188871u4(q260Var.m174993e(), q260Var.m174992d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.oo2] */
    /* JADX INFO: renamed from: r4 */
    public void m188868r4() {
        if (NullChecker.m82486a(this.f84425i)) {
            s260.m184112d(m213815L2(), m213810E2(), this.f84425i.type, BLiveOperationPopupType.get(BLiveOperationPopupType.TextDrawer));
        }
        bnl0.m105525M0((View) this.viewModel, true);
        m188872v4(false);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f171600k, this.f171601l);
        this.f171604o = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.p160
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f150133a.m188863m4(valueAnimator);
            }
        });
        gt0.m132160f(this.f171604o, new Runnable() { // from class: l.q160
            @Override // java.lang.Runnable
            public final void run() {
                this.f155155a.m188865o4();
            }
        });
        this.f171604o.setDuration(150L);
        this.f171604o.start();
    }

    /* JADX INFO: renamed from: s4 */
    public void m188869s4(SpannableStringBuilder spannableStringBuilder, final x20 x20Var) {
        jyb.m147537z(Arrays.asList((jk20[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), jk20.class)), new y20() { // from class: l.s160
            @Override // p153l.y20
            public final void call(Object obj) {
                t160.m188856f4(x20Var, (jk20) obj);
            }
        });
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().OperationsEvent.openOperationMessage().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.i160
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112492a.m188867q4((q260) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m188870t4(BLiveOperationItem bLiveOperationItem) {
        this.f84425i = bLiveOperationItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m188871u4(final BLiveOperationItem bLiveOperationItem, LiveMessage liveMessage) {
        if (liveMessage != null && NullChecker.m82486a(bLiveOperationItem.popup) && NullChecker.m82486a(bLiveOperationItem.popup.textDrawer)) {
            ((OperationMessageView) this.viewModel).m76253k(bLiveOperationItem, liveMessage);
            Pair pair = (Pair) m138856F3(new z160(8100).m218281f(bLiveOperationItem.type));
            ((hiv) zrv.m221194l(htd0.f111521c)).f110078i = true;
            boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
            V v2 = this.viewModel;
            if (zBooleanValue) {
                duringCreated(bnl0.m105520K((View) v2)).onBackpressureLatest().filter(new qcj() { // from class: l.n160
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() > 0);
                    }
                }).first().subscribe(dhw.m115825d(new y20() { // from class: l.o160
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f144625a.m188866p4(bLiveOperationItem, (Integer) obj);
                    }
                }));
            } else {
                ((OperationMessageView) v2).m76256n(bLiveOperationItem);
            }
        }
    }

    /* JADX INFO: renamed from: v4 */
    public void m188872v4(boolean z) {
        m213811F2().OperationsEvent.showOperationsRoot().mo199273j(new q260.C19505a(8100).m175010i(z).m175002a());
    }
}
