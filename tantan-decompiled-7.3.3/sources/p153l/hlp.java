package p153l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.CounterLikeLimit;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class hlp extends ufp {

    /* JADX INFO: renamed from: l.hlp$a */
    public class RunnableC17494a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f110519a;

        /* JADX INFO: renamed from: b */
        public TextView f110520b;

        /* JADX INFO: renamed from: c */
        public kcg0 f110521c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f110522d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ rfh0.C19824a f110523e;

        public RunnableC17494a(CounterLikeLimit counterLikeLimit, rfh0.C19824a c19824a) {
            this.f110522d = counterLikeLimit;
            this.f110523e = c19824a;
            this.f110521c = c19824a.f162787a.duringCreated(C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.elp
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f94572a.m135766d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m135766d(Long l2) {
            m135769g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m135767e() {
            this.f110521c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m135768f(DialogInterface dialogInterface) {
            this.f110521c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m135769g() {
            long jResetNowMillis = this.f110522d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m82486a(this.f110519a)) {
                this.f110519a.cancel();
            }
            String strM193664b = tzi0.m193664b(jResetNowMillis);
            if (NullChecker.m82486a(this.f110520b)) {
                this.f110520b.setText(strM193664b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM21567z0 = this.f110523e.f162788b.getAct().dialog().m21506G0(this.f110523e.f162788b.getAct().getString(R$string.f18630L3, Integer.valueOf(this.f110522d.total))).m21503F(this.f110523e.f162788b.getAct().getString(R$string.f18599K3, Integer.valueOf(this.f110522d.total))).m21556u().m21552s().m21532c0(dbc0.f87133ju).m21559v0("", new Runnable() { // from class: l.flp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f99681a.m135767e();
                }
            }).m21561w0(this.f110523e.f162788b.getAct().getResources().getDrawable(dbc0.f87166ku)).m21493A(new DialogInterface.OnCancelListener() { // from class: l.glp
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f104875a.m135768f(dialogInterface);
                }
            }).m21567z0();
            this.f110519a = dialogM21567z0;
            TextView textViewM105519J0 = bnl0.m105519J0(dialogM21567z0.m21464Z());
            this.f110520b = textViewM105519J0;
            textViewM105519J0.setTextSize(0, textViewM105519J0.getTextSize() * 1.1f);
            m135769g();
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(rfh0.C19824a c19824a) {
        CounterLikeLimit counterLikeLimit = m195852e() != null ? m195852e().likeLimit : null;
        if (qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nmp.m163832a()) {
            new RunnableC17494a(counterLikeLimit, c19824a).run();
        } else {
            C8927c.m54595M1(c19824a.f162788b.getAct(), "p_intl_tribe_swipe_view,e_intl_tribe_card_like_click,click", Privilege.vip_unlimited_likes, null, null, false, c19824a.f162789c.m140259d());
        }
        c19824a.f162787a.m135496x2(c19824a.f162792f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(rfh0.C19824a c19824a) {
        Counter counterM195852e = m195852e();
        CounterLikeLimit counterLikeLimit = counterM195852e == null ? null : counterM195852e.likeLimit;
        if (counterLikeLimit == null || counterLikeLimit.tribeTotalCount == -1 || counterLikeLimit.total == -1) {
            return false;
        }
        return (counterLikeLimit.remaining == 0 || CoreModule.f18264c.f20381e0.f89103Q0.get().longValue() >= ((long) counterLikeLimit.tribeTotalCount)) && counterLikeLimit.resetNowMillis() > 0 && m195854g(c19824a);
    }
}
