package p009l;

import android.content.Context;
import android.text.TextUtils;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.VoiceCallStatus;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Callable;
import l.d30;
import l.e30;
import l.ghd0;
import l.lsi0;
import l.mkd0;
import l.v9j;
import l.xhx;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class tqm0 {

    /* JADX INFO: renamed from: h */
    public static final String f20833h = "tqm0";

    /* JADX INFO: renamed from: b */
    public qsm0 f20835b;

    /* JADX INFO: renamed from: c */
    public final hum0 f20836c;

    /* JADX INFO: renamed from: d */
    public final bum0 f20837d;

    /* JADX INFO: renamed from: e */
    public final sgd0 f20838e;

    /* JADX INFO: renamed from: f */
    public final dtm0 f20839f;

    /* JADX INFO: renamed from: a */
    public HashSet<PushMessage> f20834a = new HashSet<>();

    /* JADX INFO: renamed from: g */
    public Integer f20840g = -1;

    /* JADX INFO: renamed from: l.tqm0$a */
    public class C1206a implements d30 {
        public C1206a() {
        }

        public void call() {
            tqm0.this.m22649o(false);
        }
    }

    /* JADX INFO: renamed from: l.tqm0$b */
    public static class C1207b {

        /* JADX INFO: renamed from: a */
        public static tqm0 f20842a = new tqm0();
    }

    public tqm0() {
        qsm0 qsm0Var = new qsm0();
        this.f20835b = qsm0Var;
        this.f20838e = new sgd0(qsm0Var);
        this.f20836c = new hum0(this.f20835b);
        this.f20837d = new bum0(this.f20835b);
        xhx.C().X(25L);
        this.f20839f = new btm0(this, this.f20835b);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m22633a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m22635c(c cVar) {
    }

    /* JADX INFO: renamed from: p */
    public static tqm0 m22637p() {
        return C1207b.f20842a;
    }

    /* JADX INFO: renamed from: A */
    public c<Integer> m22638A() {
        return this.f20839f.m13480i();
    }

    /* JADX INFO: renamed from: e */
    public void m22639e() {
        if (m22650q() || this.f20835b.m21248i() != 1 || this.f20835b.m21254o()) {
            return;
        }
        final bum0 bum0Var = this.f20837d;
        Objects.requireNonNull(bum0Var);
        ssm0.m22365a(new v9j() { // from class: l.pqm0
            public final Object call() {
                return Boolean.valueOf(bum0Var.m12258e());
            }
        }, new C1206a());
    }

    /* JADX INFO: renamed from: f */
    public void m22640f() {
        if (((Long) CoreModule.c.R0.R.get()).longValue() == -1) {
            CoreModule.c.R0.R.put(Long.valueOf(mqi0.m18550o()));
        }
        c.fromCallable(new Callable() { // from class: l.qqm0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ghd0.e();
            }
        }).compose(mkd0.R()).subscribe(mkd0.H(new e30() { // from class: l.rqm0
            public final void call(Object obj) {
                tqm0.m22635c((c) obj);
            }
        }, new e30() { // from class: l.sqm0
            public final void call(Object obj) {
                tqm0.m22633a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public void m22641g() {
        if (this.f20840g.intValue() == -1) {
            return;
        }
        CoreModule.P().i().u3(this.f20840g.intValue());
        this.f20840g = -1;
    }

    /* JADX INFO: renamed from: h */
    public void m22642h(final Context context, final String str, final String str2) {
        if (!m22650q()) {
            lsi0.w(R.string.a7);
        } else if (CoreModule.K().me_().isChatJailed() && (context instanceof Act)) {
            CoreModule.P().i().Z2((Act) context, false);
        } else {
            ssm0.m22365a(new v9j() { // from class: l.nqm0
                public final Object call() {
                    return this.f17611a.m22653t(context, str, str2);
                }
            }, new d30() { // from class: l.oqm0
                public final void call() {
                    this.f18212a.m22654u();
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public c<Integer> m22643i() {
        return this.f20835b.m21246g();
    }

    /* JADX INFO: renamed from: j */
    public String m22644j() {
        return this.f20835b.m21245f().f22266h;
    }

    /* JADX INFO: renamed from: k */
    public String m22645k() {
        return this.f20835b.m21247h();
    }

    /* JADX INFO: renamed from: l */
    public int m22646l() {
        return this.f20835b.m21248i();
    }

    /* JADX INFO: renamed from: m */
    public String m22647m() {
        return this.f20835b.m21251l();
    }

    /* JADX INFO: renamed from: n */
    public void m22648n() {
        m22649o(true);
    }

    /* JADX INFO: renamed from: o */
    public void m22649o(boolean z) {
        boolean zM22650q = m22650q();
        qsm0 qsm0Var = this.f20835b;
        if (zM22650q) {
            qsm0Var.m21257r();
            return;
        }
        int iM21248i = qsm0Var.m21248i();
        if (iM21248i == 1) {
            if (this.f20835b.m21254o()) {
                if (z) {
                    lsi0.w(R.string.b7);
                }
                this.f20835b.m21243d("canceled");
                return;
            } else {
                if (z) {
                    lsi0.w(R.string.Y1);
                }
                this.f20835b.m21243d("rejected");
                return;
            }
        }
        if (iM21248i == 2 || iM21248i == 3) {
            mqm0.m18567k(this.f20835b.m21251l(), this.f20835b.m21245f().f22266h);
            if (z) {
                lsi0.w(R.string.X6);
            }
            wpm0 wpm0Var = new wpm0();
            wpm0Var.f22277s = true;
            this.f20835b.m21255p(wpm0Var);
            this.f20835b.m21243d("finished");
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m22650q() {
        return this.f20835b.m21253n();
    }

    /* JADX INFO: renamed from: r */
    public boolean m22651r() {
        return this.f20835b.m21254o();
    }

    /* JADX INFO: renamed from: s */
    public boolean m22652s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m22653t(Context context, String str, String str2) {
        return Boolean.valueOf(this.f20836c.m15992g(context, str, str2));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m22654u() {
        m22649o(false);
    }

    /* JADX INFO: renamed from: v */
    public void m22655v(PushMessage pushMessage, boolean z) {
        if (nlm0.m18997c()) {
            if (z && this.f20834a.contains(pushMessage)) {
                return;
            }
            this.f20834a.add(pushMessage);
            String str = pushMessage.content.id;
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            VoiceCallStatus voiceCallStatus = VoiceCallStatus.get(pushMessageCustom.voiceStatus);
            if (TEnum.equals(voiceCallStatus, "unknown_")) {
                return;
            }
            boolean zEquals = TextUtils.equals(CoreModule.H().userId(), pushMessageCustom.caller);
            PushMessageContent pushMessageContent = pushMessage.content;
            if (zEquals) {
                String str2 = pushMessageContent.id;
                this.f20836c.m15995j(voiceCallStatus, pushMessageCustom);
            } else {
                String str3 = pushMessageContent.id;
                this.f20837d.m12260g(voiceCallStatus, pushMessageCustom);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m22656w(String str) {
        if (!m22650q() && TextUtils.equals(this.f20835b.m21251l(), str)) {
            m22649o(false);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m22657x(Integer num) {
        this.f20840g = num;
    }

    /* JADX INFO: renamed from: y */
    public void m22658y(Context context) {
        this.f20839f.mo12241g(context);
    }

    /* JADX INFO: renamed from: z */
    public void m22659z() {
        m22649o(false);
    }
}
