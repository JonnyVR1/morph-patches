package p149l;

import android.content.DialogInterface;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.CounterLikeLimit;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class tof extends kof {

    /* JADX INFO: renamed from: l.tof$a */
    public class RunnableC20222a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f171358a;

        /* JADX INFO: renamed from: b */
        public TextView f171359b;

        /* JADX INFO: renamed from: c */
        public c4g0 f171360c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f171361d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ lof.C18270a f171362e;

        public RunnableC20222a(CounterLikeLimit counterLikeLimit, lof.C18270a c18270a) {
            this.f171361d = counterLikeLimit;
            this.f171362e = c18270a;
            this.f171360c = c18270a.f129091a.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.sof
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165673a.m189881d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m189881d(Long l2) {
            m189884g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m189882e() {
            this.f171360c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m189883f(DialogInterface dialogInterface) {
            this.f171360c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m189884g() {
            long jResetNowMillis = this.f171361d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m81303a(this.f171358a)) {
                this.f171358a.cancel();
            }
            String strM175934b = qqi0.m175934b(jResetNowMillis);
            if (NullChecker.m81303a(this.f171359b)) {
                this.f171359b.setText(strM175934b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM20568z0 = this.f171362e.f129091a.dialog().m20507G0(this.f171362e.f129091a.getString(R$string.f17840J3, Integer.valueOf(this.f171361d.total))).m20504F(this.f171362e.f129091a.getString(R$string.f17810I3, Integer.valueOf(this.f171361d.total))).m20557u().m20553s().m20533c0(x2c0.f190664vt).m20560v0("", new Runnable() { // from class: l.qof
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155563a.m189882e();
                }
            }).m20562w0(this.f171362e.f129091a.getResources().getDrawable(x2c0.f190696wt)).m20526V(new DialogInterface.OnDismissListener() { // from class: l.rof
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f160381a.m189883f(dialogInterface);
                }
            }).m20568z0();
            this.f171358a = dialogM20568z0;
            TextView textViewM208339J0 = xdl0.m208339J0(dialogM20568z0.m20465Z());
            this.f171359b = textViewM208339J0;
            textViewM208339J0.setTextSize(0, textViewM208339J0.getTextSize() * 1.1f);
            m189884g();
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(lof.C18270a c18270a) {
        Counter counterM146701e = m146701e();
        CounterLikeLimit counterLikeLimit = counterM146701e == null ? null : counterM146701e.likeLimit;
        if (counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m146703g(c18270a)) {
            c18270a.f129101k.mo36354M3(c18270a.m150772a(), "other");
        }
        CounterLikeLimit counterLikeLimit2 = m146701e() != null ? m146701e().likeLimit : null;
        if (mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nkp.m159982a()) {
            new RunnableC20222a(counterLikeLimit2, c18270a).run();
        } else {
            C8764c.m53412M1(c18270a.f129091a, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, c18270a.f129093c);
        }
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(lof.C18270a c18270a) {
        Counter counterM146701e = m146701e();
        CounterLikeLimit counterLikeLimit = counterM146701e == null ? null : counterM146701e.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m146703g(c18270a);
    }
}
