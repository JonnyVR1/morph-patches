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
public class aqf extends rpf {

    /* JADX INFO: renamed from: l.aqf$a */
    public class RunnableC15800a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f72806a;

        /* JADX INFO: renamed from: b */
        public TextView f72807b;

        /* JADX INFO: renamed from: c */
        public kcg0 f72808c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f72809d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ spf.C20128a f72810e;

        public RunnableC15800a(CounterLikeLimit counterLikeLimit, spf.C20128a c20128a) {
            this.f72809d = counterLikeLimit;
            this.f72810e = c20128a;
            this.f72808c = c20128a.f170039a.duringCreated(C22421c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(fo0.m126432a())).subscribe(psd0.m173596G(new y20() { // from class: l.zpf
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f205459a.m99472d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m99472d(Long l2) {
            m99475g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m99473e() {
            this.f72808c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m99474f(DialogInterface dialogInterface) {
            this.f72808c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m99475g() {
            long jResetNowMillis = this.f72809d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m82486a(this.f72806a)) {
                this.f72806a.cancel();
            }
            String strM193664b = tzi0.m193664b(jResetNowMillis);
            if (NullChecker.m82486a(this.f72807b)) {
                this.f72807b.setText(strM193664b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM21567z0 = this.f72810e.f170039a.dialog().m21506G0(this.f72810e.f170039a.getString(R$string.f18630L3, Integer.valueOf(this.f72809d.total))).m21503F(this.f72810e.f170039a.getString(R$string.f18599K3, Integer.valueOf(this.f72809d.total))).m21556u().m21552s().m21532c0(dbc0.f87133ju).m21559v0("", new Runnable() { // from class: l.xpf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f195706a.m99473e();
                }
            }).m21561w0(this.f72810e.f170039a.getResources().getDrawable(dbc0.f87166ku)).m21525V(new DialogInterface.OnDismissListener() { // from class: l.ypf
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f201064a.m99474f(dialogInterface);
                }
            }).m21567z0();
            this.f72806a = dialogM21567z0;
            TextView textViewM105519J0 = bnl0.m105519J0(dialogM21567z0.m21464Z());
            this.f72807b = textViewM105519J0;
            textViewM105519J0.setTextSize(0, textViewM105519J0.getTextSize() * 1.1f);
            m99475g();
        }
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo38500a(spf.C20128a c20128a) {
        Counter counterM182526e = m182526e();
        CounterLikeLimit counterLikeLimit = counterM182526e == null ? null : counterM182526e.likeLimit;
        if (counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m182528g(c20128a)) {
            c20128a.f170049k.mo37357M3(c20128a.m187342a(), "other");
        }
        CounterLikeLimit counterLikeLimit2 = m182526e() != null ? m182526e().likeLimit : null;
        if (qj90.m176830b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nmp.m163832a()) {
            new RunnableC15800a(counterLikeLimit2, c20128a).run();
        } else {
            C8927c.m54595M1(c20128a.f170039a, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, c20128a.f170041c);
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(spf.C20128a c20128a) {
        Counter counterM182526e = m182526e();
        CounterLikeLimit counterLikeLimit = counterM182526e == null ? null : counterM182526e.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m182528g(c20128a);
    }
}
