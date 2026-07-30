package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Callable;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class tqm0 {

    /* JADX INFO: renamed from: h */
    public static final String f171604h = "tqm0";

    /* JADX INFO: renamed from: b */
    public qsm0 f171606b;

    /* JADX INFO: renamed from: c */
    public final hum0 f171607c;

    /* JADX INFO: renamed from: d */
    public final bum0 f171608d;

    /* JADX INFO: renamed from: e */
    public final sgd0 f171609e;

    /* JADX INFO: renamed from: f */
    public final dtm0 f171610f;

    /* JADX INFO: renamed from: a */
    public HashSet<PushMessage> f171605a = new HashSet<>();

    /* JADX INFO: renamed from: g */
    public Integer f171611g = -1;

    /* JADX INFO: renamed from: l.tqm0$a */
    public class C20251a implements d30 {
        public C20251a() {
        }

        @Override // p149l.d30
        public void call() {
            tqm0.this.m190143o(false);
        }
    }

    /* JADX INFO: renamed from: l.tqm0$b */
    public static class C20252b {

        /* JADX INFO: renamed from: a */
        public static tqm0 f171613a = new tqm0();
    }

    public tqm0() {
        qsm0 qsm0Var = new qsm0();
        this.f171606b = qsm0Var;
        this.f171609e = new sgd0(qsm0Var);
        this.f171607c = new hum0(this.f171606b);
        this.f171608d = new bum0(this.f171606b);
        xhx.m208850C().m208895X(25L);
        this.f171610f = new btm0(this, this.f171606b);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m190127a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m190129c(C22306c c22306c) {
    }

    /* JADX INFO: renamed from: p */
    public static tqm0 m190131p() {
        return C20252b.f171613a;
    }

    /* JADX INFO: renamed from: A */
    public C22306c<Integer> m190132A() {
        return this.f171610f.m113579i();
    }

    /* JADX INFO: renamed from: e */
    public void m190133e() {
        if (m190144q() || this.f171606b.m176315i() != 1 || this.f171606b.m176321o()) {
            return;
        }
        final bum0 bum0Var = this.f171608d;
        Objects.requireNonNull(bum0Var);
        ssm0.m185757a(new v9j() { // from class: l.pqm0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(bum0Var.m103959e());
            }
        }, new C20251a());
    }

    /* JADX INFO: renamed from: f */
    public void m190134f() {
        if (CoreModule.f17545c.f19601R0.f86912R.get().longValue() == -1) {
            CoreModule.f17545c.f19601R0.f86912R.put(Long.valueOf(mqi0.m155944o()));
        }
        C22306c.fromCallable(new Callable() { // from class: l.qqm0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return ghd0.m126181e();
            }
        }).compose(mkd0.m154966R()).subscribe(mkd0.m154956H(new e30() { // from class: l.rqm0
            @Override // p149l.e30
            public final void call(Object obj) {
                tqm0.m190129c((C22306c) obj);
            }
        }, new e30() { // from class: l.sqm0
            @Override // p149l.e30
            public final void call(Object obj) {
                tqm0.m190127a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public void m190135g() {
        if (this.f171611g.intValue() == -1) {
            return;
        }
        CoreModule.m29935P().m94658i().mo158453u3(this.f171611g.intValue());
        this.f171611g = -1;
    }

    /* JADX INFO: renamed from: h */
    public void m190136h(final Context context, final String str, final String str2) {
        if (!m190144q()) {
            lsi0.m151593w(R$string.f20924a7);
        } else if (CoreModule.m29932K().me_().isChatJailed() && (context instanceof Act)) {
            CoreModule.m29935P().m94658i().mo158341Z2((Act) context, false);
        } else {
            ssm0.m185757a(new v9j() { // from class: l.nqm0
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f140081a.m190147t(context, str, str2);
                }
            }, new d30() { // from class: l.oqm0
                @Override // p149l.d30
                public final void call() {
                    this.f145168a.m190148u();
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public C22306c<Integer> m190137i() {
        return this.f171606b.m176313g();
    }

    /* JADX INFO: renamed from: j */
    public String m190138j() {
        return this.f171606b.m176312f().f187551h;
    }

    /* JADX INFO: renamed from: k */
    public String m190139k() {
        return this.f171606b.m176314h();
    }

    /* JADX INFO: renamed from: l */
    public int m190140l() {
        return this.f171606b.m176315i();
    }

    /* JADX INFO: renamed from: m */
    public String m190141m() {
        return this.f171606b.m176318l();
    }

    /* JADX INFO: renamed from: n */
    public void m190142n() {
        m190143o(true);
    }

    /* JADX INFO: renamed from: o */
    public void m190143o(boolean z) {
        boolean zM190144q = m190144q();
        qsm0 qsm0Var = this.f171606b;
        if (zM190144q) {
            qsm0Var.m176324r();
            return;
        }
        int iM176315i = qsm0Var.m176315i();
        if (iM176315i == 1) {
            if (this.f171606b.m176321o()) {
                if (z) {
                    lsi0.m151593w(R$string.f20933b7);
                }
                this.f171606b.m176310d("canceled");
                return;
            } else {
                if (z) {
                    lsi0.m151593w(R$string.f20902Y1);
                }
                this.f171606b.m176310d("rejected");
                return;
            }
        }
        if (iM176315i == 2 || iM176315i == 3) {
            mqm0.m155967k(this.f171606b.m176318l(), this.f171606b.m176312f().f187551h);
            if (z) {
                lsi0.m151593w(R$string.f20899X6);
            }
            wpm0 wpm0Var = new wpm0();
            wpm0Var.f187562s = true;
            this.f171606b.m176322p(wpm0Var);
            this.f171606b.m176310d("finished");
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m190144q() {
        return this.f171606b.m176320n();
    }

    /* JADX INFO: renamed from: r */
    public boolean m190145r() {
        return this.f171606b.m176321o();
    }

    /* JADX INFO: renamed from: s */
    public boolean m190146s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m190147t(Context context, String str, String str2) {
        return Boolean.valueOf(this.f171607c.m133128g(context, str, str2));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m190148u() {
        m190143o(false);
    }

    /* JADX INFO: renamed from: v */
    public void m190149v(PushMessage pushMessage, boolean z) {
        if (nlm0.m160070c()) {
            if (z && this.f171605a.contains(pushMessage)) {
                return;
            }
            this.f171605a.add(pushMessage);
            String str = pushMessage.content.f38804id;
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            VoiceCallStatus voiceCallStatus = VoiceCallStatus.get(pushMessageCustom.voiceStatus);
            if (TEnum.equals(voiceCallStatus, "unknown_")) {
                return;
            }
            boolean zEquals = TextUtils.equals(CoreModule.m29931H().userId(), pushMessageCustom.caller);
            PushMessageContent pushMessageContent = pushMessage.content;
            if (zEquals) {
                String str2 = pushMessageContent.f38804id;
                this.f171607c.m133131j(voiceCallStatus, pushMessageCustom);
            } else {
                String str3 = pushMessageContent.f38804id;
                this.f171608d.m103961g(voiceCallStatus, pushMessageCustom);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m190150w(String str) {
        if (!m190144q() && TextUtils.equals(this.f171606b.m176318l(), str)) {
            m190143o(false);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m190151x(Integer num) {
        this.f171611g = num;
    }

    /* JADX INFO: renamed from: y */
    public void m190152y(Context context) {
        this.f171610f.mo103876g(context);
    }

    /* JADX INFO: renamed from: z */
    public void m190153z() {
        m190143o(false);
    }
}
