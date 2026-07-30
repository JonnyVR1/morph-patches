package p149l;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationMessageView;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class nt50 extends wq50<ho2, OperationMessageView> {

    /* JADX INFO: renamed from: k */
    public final int f140433k;

    /* JADX INFO: renamed from: l */
    public final int f140434l;

    /* JADX INFO: renamed from: m */
    public final int f140435m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f140436n;

    /* JADX INFO: renamed from: o */
    public ValueAnimator f140437o;

    public nt50(bsm bsmVar, OperationMessageView operationMessageView) {
        super(bsmVar);
        this.f140433k = t100.m186890d(42.0f);
        this.f140434l = t100.m186890d(148.0f);
        this.f140435m = 150;
        mo51532C(operationMessageView);
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m161333Y3(ac20 ac20Var, d30 d30Var, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            ac20Var.m95712e(bitmap.copy(bitmap.getConfig(), false));
        }
        Objects.requireNonNull(d30Var);
        e51.m114748M(new bii0(d30Var));
    }

    /* JADX INFO: renamed from: f4 */
    public static /* synthetic */ void m161340f4(final d30 d30Var, final ac20 ac20Var) {
        if (ac20Var.m95711d()) {
            return;
        }
        hxs.m133394g("context_livingAct", ac20Var.m95710c().trim(), new e30() { // from class: l.dt50
            @Override // p149l.e30
            public final void call(Object obj) {
                nt50.m161333Y3(ac20Var, d30Var, (Bitmap) obj);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        duringCreated(m206028F2().OperationsEvent.messageOpen().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.et50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f93084a.m161345k4((ku50) obj);
            }
        }));
    }

    @Override // p149l.wq50
    /* JADX INFO: renamed from: T3 */
    public void mo143250T3(Drawable drawable) {
        super.mo143250T3(drawable);
        ((OperationMessageView) this.viewModel).setBackground(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h4 */
    public final void m161342h4() {
        ((OperationMessageView) this.viewModel).f48057e.m74295b();
        xdl0.m208345M0((View) this.viewModel, false);
        m161356v4(true);
        if (NullChecker.m81303a(this.f187644i)) {
            if (((Boolean) ((Pair) m129297F3(new tt50(8100).m190598f(this.f187644i.type))).first).booleanValue()) {
                m206028F2().OperationsEvent.messageIconTrans().mo172463j(new ku50.C18083a(8100).m147259d(this.f187644i).m147262g(((OperationMessageView) this.viewModel).getOperationIconPos()).m147257b(false).m147256a());
            } else {
                m206028F2().OperationsEvent.refreshOperationMessage().mo172463j(new ku50.C18083a(8100).m147256a());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [l.ho2] */
    /* JADX INFO: renamed from: i4 */
    public void m161343i4() {
        if (NullChecker.m81303a(this.f187644i) && NullChecker.m81303a(this.f187644i.popup) && NullChecker.m81303a(this.f187644i.popup.textDrawer)) {
            mu50.m156383c(m206032L2(), m206027E2(), this.f187644i.type, BLiveOperationPopupType.get(BLiveOperationPopupType.TextDrawer));
            String string = this.f187644i.popup.textDrawer.actionAfterClick.toString();
            int iHashCode = string.hashCode();
            if (iHashCode == -1583193058) {
                if (string.equals("h5Drawer")) {
                    if (NullChecker.m81303a(this.f140437o)) {
                        dt0.m113501A(this.f140437o);
                        ((OperationMessageView) this.viewModel).m75067e();
                        m161344j4(0, ((OperationMessageView) this.viewModel).getWidth());
                    }
                    m205019N3(BLiveOperationPopupType.get(BLiveOperationPopupType.H5Drawer));
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
                if (!string.equals("jumpToScheme") || TextUtils.isEmpty(this.f187644i.popup.textDrawer.jumpScheme)) {
                    return;
                }
                m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(200).m206701e(this.f187644i.popup.textDrawer.jumpScheme).m206699c());
            }
        }
    }

    /* JADX INFO: renamed from: j4 */
    public ValueAnimator m161344j4(int i, int i2) {
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i2, this.f140433k);
        this.f140436n = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ft50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f99144a.m161346l4(valueAnimator);
            }
        });
        if (i > 1) {
            this.f140436n.setStartDelay(1200L);
        }
        this.f140436n.setDuration(i);
        bt0.m103733f(this.f140436n, new Runnable() { // from class: l.gt50
            @Override // java.lang.Runnable
            public final void run() {
                this.f104246a.m161342h4();
            }
        });
        this.f140436n.start();
        return this.f140436n;
    }

    /* JADX INFO: renamed from: k4 */
    public final /* synthetic */ void m161345k4(ku50 ku50Var) {
        m161352r4();
    }

    /* JADX INFO: renamed from: l4 */
    public final /* synthetic */ void m161346l4(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((OperationMessageView) this.viewModel).getLayoutParams();
        layoutParams.width = iIntValue;
        ((OperationMessageView) this.viewModel).setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: m4 */
    public final /* synthetic */ void m161347m4(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = ((OperationMessageView) this.viewModel).getLayoutParams();
        layoutParams.width = iIntValue;
        ((OperationMessageView) this.viewModel).setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        dt0.m113501A(this.f140436n);
        dt0.m113501A(this.f140437o);
        ((OperationMessageView) this.viewModel).m75074p();
        m161344j4(1, this.f140434l);
        xdl0.m208344M((View) this.viewModel, false);
    }

    /* JADX INFO: renamed from: n4 */
    public final /* synthetic */ void m161348n4() {
        m161344j4(150, this.f140434l);
    }

    /* JADX INFO: renamed from: o4 */
    public final /* synthetic */ void m161349o4() {
        ((OperationMessageView) this.viewModel).m75068f(new Runnable() { // from class: l.lt50
            @Override // java.lang.Runnable
            public final void run() {
                this.f129935a.m161348n4();
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public final /* synthetic */ void m161350p4(BLiveOperationItem bLiveOperationItem, Integer num) {
        ((OperationMessageView) this.viewModel).m75072m(bLiveOperationItem);
    }

    /* JADX INFO: renamed from: q4 */
    public final /* synthetic */ void m161351q4(ku50 ku50Var) {
        m161355u4(ku50Var.m147247e(), ku50Var.m147246d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [l.ho2] */
    /* JADX INFO: renamed from: r4 */
    public void m161352r4() {
        if (NullChecker.m81303a(this.f187644i)) {
            mu50.m156384d(m206032L2(), m206027E2(), this.f187644i.type, BLiveOperationPopupType.get(BLiveOperationPopupType.TextDrawer));
        }
        xdl0.m208345M0((View) this.viewModel, true);
        m161356v4(false);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.f140433k, this.f140434l);
        this.f140437o = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.jt50
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f119572a.m161347m4(valueAnimator);
            }
        });
        bt0.m103733f(this.f140437o, new Runnable() { // from class: l.kt50
            @Override // java.lang.Runnable
            public final void run() {
                this.f124564a.m161349o4();
            }
        });
        this.f140437o.setDuration(150L);
        this.f140437o.start();
    }

    /* JADX INFO: renamed from: s4 */
    public void m161353s4(SpannableStringBuilder spannableStringBuilder, final d30 d30Var) {
        vwb.m200354z(Arrays.asList((ac20[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), ac20.class)), new e30() { // from class: l.mt50
            @Override // p149l.e30
            public final void call(Object obj) {
                nt50.m161340f4(d30Var, (ac20) obj);
            }
        });
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(m206028F2().OperationsEvent.openOperationMessage().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.ct50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82454a.m161351q4((ku50) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t4 */
    public void m161354t4(BLiveOperationItem bLiveOperationItem) {
        this.f187644i = bLiveOperationItem;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u4 */
    public void m161355u4(final BLiveOperationItem bLiveOperationItem, LiveMessage liveMessage) {
        if (liveMessage != null && NullChecker.m81303a(bLiveOperationItem.popup) && NullChecker.m81303a(bLiveOperationItem.popup.textDrawer)) {
            ((OperationMessageView) this.viewModel).m75070k(bLiveOperationItem, liveMessage);
            Pair pair = (Pair) m129297F3(new tt50(8100).m190598f(bLiveOperationItem.type));
            ((ggv) ypv.m215673l(fld0.f98148c)).f102548i = true;
            boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
            V v2 = this.viewModel;
            if (zBooleanValue) {
                duringCreated(xdl0.m208340K((View) v2)).onBackpressureLatest().filter(new w9j() { // from class: l.ht50
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((Integer) obj).intValue() > 0);
                    }
                }).first().subscribe(ffw.m121193d(new e30() { // from class: l.it50
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f114859a.m161350p4(bLiveOperationItem, (Integer) obj);
                    }
                }));
            } else {
                ((OperationMessageView) v2).m75073n(bLiveOperationItem);
            }
        }
    }

    /* JADX INFO: renamed from: v4 */
    public void m161356v4(boolean z) {
        m206028F2().OperationsEvent.showOperationsRoot().mo172463j(new ku50.C18083a(8100).m147264i(z).m147256a());
    }
}
