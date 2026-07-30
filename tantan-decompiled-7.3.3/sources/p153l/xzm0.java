package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.HashSet;
import java.util.Objects;
import java.util.concurrent.Callable;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class xzm0 {

    /* JADX INFO: renamed from: h */
    public static final String f196892h = "xzm0";

    /* JADX INFO: renamed from: b */
    public u1n0 f196894b;

    /* JADX INFO: renamed from: c */
    public final l3n0 f196895c;

    /* JADX INFO: renamed from: d */
    public final f3n0 f196896d;

    /* JADX INFO: renamed from: e */
    public final vod0 f196897e;

    /* JADX INFO: renamed from: f */
    public final h2n0 f196898f;

    /* JADX INFO: renamed from: a */
    public HashSet<PushMessage> f196893a = new HashSet<>();

    /* JADX INFO: renamed from: g */
    public Integer f196899g = -1;

    /* JADX INFO: renamed from: l.xzm0$a */
    public class C21484a implements x20 {
        public C21484a() {
        }

        @Override // p153l.x20
        public void call() {
            xzm0.this.m213772o(false);
        }
    }

    /* JADX INFO: renamed from: l.xzm0$b */
    public static class C21485b {

        /* JADX INFO: renamed from: a */
        public static xzm0 f196901a = new xzm0();
    }

    public xzm0() {
        u1n0 u1n0Var = new u1n0();
        this.f196894b = u1n0Var;
        this.f196897e = new vod0(u1n0Var);
        this.f196895c = new l3n0(this.f196894b);
        this.f196896d = new f3n0(this.f196894b);
        uqx.m197379C().m197424X(25L);
        this.f196898f = new f2n0(this, this.f196894b);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m213756a(Throwable th) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m213758c(C22421c c22421c) {
    }

    /* JADX INFO: renamed from: p */
    public static xzm0 m213760p() {
        return C21485b.f196901a;
    }

    /* JADX INFO: renamed from: A */
    public C22421c<Integer> m213761A() {
        return this.f196898f.m133399i();
    }

    /* JADX INFO: renamed from: e */
    public void m213762e() {
        if (m213773q() || this.f196894b.m194033i() != 1 || this.f196894b.m194039o()) {
            return;
        }
        final f3n0 f3n0Var = this.f196896d;
        Objects.requireNonNull(f3n0Var);
        w1n0.m204454a(new pcj() { // from class: l.tzm0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return Boolean.valueOf(f3n0Var.m123755e());
            }
        }, new C21484a());
    }

    /* JADX INFO: renamed from: f */
    public void m213763f() {
        if (CoreModule.f18264c.f20343R0.f163984R.get().longValue() == -1) {
            CoreModule.f18264c.f20343R0.f163984R.put(Long.valueOf(pzi0.m174454o()));
        }
        C22421c.fromCallable(new Callable() { // from class: l.uzm0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return jpd0.m146490e();
            }
        }).compose(psd0.m173607R()).subscribe(psd0.m173597H(new y20() { // from class: l.vzm0
            @Override // p153l.y20
            public final void call(Object obj) {
                xzm0.m213758c((C22421c) obj);
            }
        }, new y20() { // from class: l.wzm0
            @Override // p153l.y20
            public final void call(Object obj) {
                xzm0.m213756a((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public void m213764g() {
        if (this.f196899g.intValue() == -1) {
            return;
        }
        CoreModule.m30933P().m143412i().mo180545u3(this.f196899g.intValue());
        this.f196899g = -1;
    }

    /* JADX INFO: renamed from: h */
    public void m213765h(final Context context, final String str, final String str2) {
        if (!m213773q()) {
            o1j0.m165649w(R$string.f21666a7);
        } else if (CoreModule.m30930K().me_().isChatJailed() && (context instanceof Act)) {
            CoreModule.m30933P().m143412i().mo180433Z2((Act) context, false);
        } else {
            w1n0.m204454a(new pcj() { // from class: l.rzm0
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f165554a.m213776t(context, str, str2);
                }
            }, new x20() { // from class: l.szm0
                @Override // p153l.x20
                public final void call() {
                    this.f171406a.m213777u();
                }
            });
        }
    }

    /* JADX INFO: renamed from: i */
    public C22421c<Integer> m213766i() {
        return this.f196894b.m194031g();
    }

    /* JADX INFO: renamed from: j */
    public String m213767j() {
        return this.f196894b.m194030f().f74160h;
    }

    /* JADX INFO: renamed from: k */
    public String m213768k() {
        return this.f196894b.m194032h();
    }

    /* JADX INFO: renamed from: l */
    public int m213769l() {
        return this.f196894b.m194033i();
    }

    /* JADX INFO: renamed from: m */
    public String m213770m() {
        return this.f196894b.m194036l();
    }

    /* JADX INFO: renamed from: n */
    public void m213771n() {
        m213772o(true);
    }

    /* JADX INFO: renamed from: o */
    public void m213772o(boolean z) {
        boolean zM213773q = m213773q();
        u1n0 u1n0Var = this.f196894b;
        if (zM213773q) {
            u1n0Var.m194042r();
            return;
        }
        int iM194033i = u1n0Var.m194033i();
        if (iM194033i == 1) {
            if (this.f196894b.m194039o()) {
                if (z) {
                    o1j0.m165649w(R$string.f21675b7);
                }
                this.f196894b.m194028d("canceled");
                return;
            } else {
                if (z) {
                    o1j0.m165649w(R$string.f21644Y1);
                }
                this.f196894b.m194028d("rejected");
                return;
            }
        }
        if (iM194033i == 2 || iM194033i == 3) {
            qzm0.m178814k(this.f196894b.m194036l(), this.f196894b.m194030f().f74160h);
            if (z) {
                o1j0.m165649w(R$string.f21641X6);
            }
            azm0 azm0Var = new azm0();
            azm0Var.f74171s = true;
            this.f196894b.m194040p(azm0Var);
            this.f196894b.m194028d("finished");
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m213773q() {
        return this.f196894b.m194038n();
    }

    /* JADX INFO: renamed from: r */
    public boolean m213774r() {
        return this.f196894b.m194039o();
    }

    /* JADX INFO: renamed from: s */
    public boolean m213775s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Boolean m213776t(Context context, String str, String str2) {
        return Boolean.valueOf(this.f196895c.m152720g(context, str, str2));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m213777u() {
        m213772o(false);
    }

    /* JADX INFO: renamed from: v */
    public void m213778v(PushMessage pushMessage, boolean z) {
        if (rum0.m183208c()) {
            if (z && this.f196893a.contains(pushMessage)) {
                return;
            }
            this.f196893a.add(pushMessage);
            String str = pushMessage.content.f39652id;
            PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
            VoiceCallStatus voiceCallStatus = VoiceCallStatus.get(pushMessageCustom.voiceStatus);
            if (TEnum.equals(voiceCallStatus, "unknown_")) {
                return;
            }
            boolean zEquals = TextUtils.equals(CoreModule.m30929H().userId(), pushMessageCustom.caller);
            PushMessageContent pushMessageContent = pushMessage.content;
            if (zEquals) {
                String str2 = pushMessageContent.f39652id;
                this.f196895c.m152723j(voiceCallStatus, pushMessageCustom);
            } else {
                String str3 = pushMessageContent.f39652id;
                this.f196896d.m123757g(voiceCallStatus, pushMessageCustom);
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public void m213779w(String str) {
        if (!m213773q() && TextUtils.equals(this.f196894b.m194036l(), str)) {
            m213772o(false);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m213780x(Integer num) {
        this.f196899g = num;
    }

    /* JADX INFO: renamed from: y */
    public void m213781y(Context context) {
        this.f196898f.mo123640g(context);
    }

    /* JADX INFO: renamed from: z */
    public void m213782z() {
        m213772o(false);
    }
}
