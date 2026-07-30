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
public class aqh extends pph {

    /* JADX INFO: renamed from: l.aqh$a */
    public class RunnableC15693a implements Runnable {

        /* JADX INFO: renamed from: a */
        public Dialog f71155a;

        /* JADX INFO: renamed from: b */
        public TextView f71156b;

        /* JADX INFO: renamed from: c */
        public c4g0 f71157c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ CounterLikeLimit f71158d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ qph.C19553a f71159e;

        public RunnableC15693a(CounterLikeLimit counterLikeLimit, qph.C19553a c19553a) {
            this.f71158d = counterLikeLimit;
            this.f71159e = c19553a;
            this.f71157c = c19553a.f155757a.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS).onBackpressureLatest().observeOn(jo0.m142408a())).subscribe(mkd0.m154955G(new e30() { // from class: l.zph
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204251a.m98295d((Long) obj);
                }
            }));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m98295d(Long l2) {
            m98298g();
        }

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ void m98296e() {
            this.f71157c.unsubscribe();
        }

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ void m98297f(DialogInterface dialogInterface) {
            this.f71157c.unsubscribe();
        }

        /* JADX INFO: renamed from: g */
        public void m98298g() {
            long jResetNowMillis = this.f71158d.resetNowMillis();
            if (jResetNowMillis <= 0 && NullChecker.m81303a(this.f71155a)) {
                this.f71155a.cancel();
            }
            String strM175934b = qqi0.m175934b(jResetNowMillis);
            if (NullChecker.m81303a(this.f71156b)) {
                this.f71156b.setText(strM175934b);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Dialog dialogM20568z0 = this.f71159e.f155757a.dialog().m20507G0(this.f71159e.f155757a.getString(R$string.f17840J3, Integer.valueOf(this.f71158d.total))).m20504F(this.f71159e.f155757a.getString(R$string.f17810I3, Integer.valueOf(this.f71158d.total))).m20557u().m20553s().m20533c0(x2c0.f190664vt).m20560v0("", new Runnable() { // from class: l.xph
                @Override // java.lang.Runnable
                public final void run() {
                    this.f193919a.m98296e();
                }
            }).m20562w0(this.f71159e.f155757a.getResources().getDrawable(x2c0.f190696wt)).m20494A(new DialogInterface.OnCancelListener() { // from class: l.yph
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f199445a.m98297f(dialogInterface);
                }
            }).m20568z0();
            this.f71155a = dialogM20568z0;
            TextView textViewM208339J0 = xdl0.m208339J0(dialogM20568z0.m20465Z());
            this.f71156b = textViewM208339J0;
            textViewM208339J0.setTextSize(0, textViewM208339J0.getTextSize() * 1.1f);
            m98298g();
        }
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public VSwipeStack.OnCardSwipeResult mo37497a(qph.C19553a c19553a) {
        CounterLikeLimit counterLikeLimit = m170719e() != null ? m170719e().likeLimit : null;
        if (mb90.m153866b(PurchaseType.TYPE_LIKENOLIMIT_PKG) || !nkp.m159982a()) {
            new RunnableC15693a(counterLikeLimit, c19553a).run();
        } else {
            C8764c.m53412M1(c19553a.f155757a, "p_home,likelimit", Privilege.vip_unlimited_likes, null, null, false, c19553a.f155759c);
        }
        c19553a.f155763g.mo43130k2(c19553a.f155762f, "failExhaustSwipe");
        return VSwipeStack.OnCardSwipeResult.back;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(qph.C19553a c19553a) {
        Counter counterM170719e = m170719e();
        CounterLikeLimit counterLikeLimit = counterM170719e == null ? null : counterM170719e.likeLimit;
        return counterLikeLimit != null && counterLikeLimit.remaining == 0 && counterLikeLimit.resetNowMillis() > 0 && m170721g(c19553a);
    }
}
