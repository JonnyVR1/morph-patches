package p153l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Dialog;
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
public class prh extends erh {

    /* JADX INFO: renamed from: l.prh$a */
    public class RunnableC19426a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f153783a;

        /* JADX INFO: renamed from: b */
        public TextView f153784b;

        /* JADX INFO: renamed from: c */
        public kcg0 f153785c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f153786d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ frh.C17047a f153787e;

        public RunnableC19426a(CounterLikeLimit counterLikeLimit, frh.C17047a c17047a) {
            this.f153786d = counterLikeLimit;
            this.f153787e = c17047a;
            this.f153785c = c17047a.f100420a.duringCreated(C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.orh
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f148702a.m173489d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m173489d(Long l2) {
            m173492g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m173490e() {
            this.f153785c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m173491f(DialogInterface dialogInterface) {
            this.f153785c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m173492g() {
            long jResetNowMillis = this.f153786d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m82486a(this.f153783a)) {
                this.f153783a.cancel();
            }
            String strM193664b = tzi0.m193664b(jResetNowMillis);
            if (NullChecker.m82486a(this.f153784b)) {
                this.f153784b.setText(strM193664b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM21567z0 = this.f153787e.f100420a.dialog().m21506G0(this.f153787e.f100420a.getString(R$string.f18630L3, Integer.valueOf(this.f153786d.total))).m21503F(this.f153787e.f100420a.getString(R$string.f18599K3, Integer.valueOf(this.f153786d.total))).m21556u().m21552s().m21532c0(dbc0.f87133ju).m21559v0("", new Runnable() { // from class: l.mrh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f138370a.m173490e();
                }
            }).m21561w0(this.f153787e.f100420a.getResources().getDrawable(dbc0.f87166ku)).m21493A(new DialogInterface.OnCancelListener() { // from class: l.nrh
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f143403a.m173491f(dialogInterface);
                }
            }).m21567z0();
            this.f153783a = dialogM21567z0;
            TextView textViewM105519J0 = bnl0.m105519J0(dialogM21567z0.m21464Z());
            this.f153784b = textViewM105519J0;
            textViewM105519J0.setTextSize(0, textViewM105519J0.getTextSize() * 1.1f);
            m173492g();
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(frh.C17047a c17047a) {
        CounterLikeLimit counterLikeLimit = m122185e() != null ? m122185e().likeLimit : null;
        if (qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nmp.m163832a()) {
            new RunnableC19426a(counterLikeLimit, c17047a).run();
        } else {
            C8927c.m54595M1(c17047a.f100420a, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, c17047a.f100422c);
        }
        c17047a.f100426g.mo44141k2(c17047a.f100425f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(frh.C17047a c17047a) {
        Counter counterM122185e = m122185e();
        CounterLikeLimit counterLikeLimit = counterM122185e == null ? null : counterM122185e.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m122187g(c17047a);
    }
}
