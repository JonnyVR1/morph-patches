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
public class oui0 extends cui0 {

    /* JADX INFO: renamed from: l.oui0$a */
    public class RunnableC19220a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f149165a;

        /* JADX INFO: renamed from: b */
        public TextView f149166b;

        /* JADX INFO: renamed from: c */
        public kcg0 f149167c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f149168d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ sfh0.C20031a f149169e;

        public RunnableC19220a(CounterLikeLimit counterLikeLimit, sfh0.C20031a c20031a) {
            this.f149168d = counterLikeLimit;
            this.f149169e = c20031a;
            this.f149167c = c20031a.f167702a.duringCreated(C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.lui0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133633a.m169308d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m169308d(Long l2) {
            m169311g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m169309e() {
            this.f149167c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m169310f(DialogInterface dialogInterface) {
            this.f149167c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m169311g() {
            long jResetNowMillis = this.f149168d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m82486a(this.f149165a)) {
                this.f149165a.cancel();
            }
            String strM193664b = tzi0.m193664b(jResetNowMillis);
            if (NullChecker.m82486a(this.f149166b)) {
                this.f149166b.setText(strM193664b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM21567z0 = this.f149169e.f167703b.act().dialog().m21506G0(this.f149169e.f167703b.act().getString(R$string.f18630L3, Integer.valueOf(this.f149168d.total))).m21503F(this.f149169e.f167703b.act().getString(R$string.f18599K3, Integer.valueOf(this.f149168d.total))).m21556u().m21552s().m21532c0(dbc0.f87133ju).m21559v0("", new Runnable() { // from class: l.mui0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f138821a.m169309e();
                }
            }).m21561w0(this.f149169e.f167703b.act().getResources().getDrawable(dbc0.f87166ku)).m21493A(new DialogInterface.OnCancelListener() { // from class: l.nui0
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f143717a.m169310f(dialogInterface);
                }
            }).m21567z0();
            this.f149165a = dialogM21567z0;
            TextView textViewM105519J0 = bnl0.m105519J0(dialogM21567z0.m21464Z());
            this.f149166b = textViewM105519J0;
            textViewM105519J0.setTextSize(0, textViewM105519J0.getTextSize() * 1.1f);
            m169311g();
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(sfh0.C20031a c20031a) {
        CounterLikeLimit counterLikeLimit = m112688e() != null ? m112688e().likeLimit : null;
        if (qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nmp.m163832a()) {
            new RunnableC19220a(counterLikeLimit, c20031a).run();
        } else {
            C8927c.m54595M1(c20031a.f167703b.act(), "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, c20031a.f167704c.m140259d());
        }
        c20031a.f167702a.m190786I2(c20031a.f167707f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(sfh0.C20031a c20031a) {
        Counter counterM112688e = m112688e();
        CounterLikeLimit counterLikeLimit = counterM112688e == null ? null : counterM112688e.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m112690g(c20031a);
    }
}
