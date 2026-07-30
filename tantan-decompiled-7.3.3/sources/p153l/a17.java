package p153l;

import android.os.Build;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.ConversationCounter;
import com.p051p1.mobile.putong.data.Counter;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class a17 implements vc2.InterfaceC20805a {

    /* JADX INFO: renamed from: k */
    public static final Object f67787k = new Object();

    /* JADX INFO: renamed from: l */
    public static a17 f67788l;

    /* JADX INFO: renamed from: a */
    public int f67789a;

    /* JADX INFO: renamed from: b */
    public boolean f67790b = false;

    /* JADX INFO: renamed from: c */
    public boolean f67791c = false;

    /* JADX INFO: renamed from: d */
    public int f67792d = 0;

    /* JADX INFO: renamed from: e */
    public int f67793e = 0;

    /* JADX INFO: renamed from: f */
    public int f67794f = 0;

    /* JADX INFO: renamed from: g */
    public boolean f67795g = false;

    /* JADX INFO: renamed from: h */
    public boolean f67796h = false;

    /* JADX INFO: renamed from: i */
    public C22507a<uxj0> f67797i;

    /* JADX INFO: renamed from: j */
    public kcg0 f67798j;

    public a17() {
        C22507a<uxj0> c22507aM222758b = C22507a.m222758b();
        this.f67797i = c22507aM222758b;
        this.f67798j = null;
        c22507aM222758b.subscribe(psd0.m173597H(new y20() { // from class: l.t07
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171469a.m95460k((uxj0) obj);
            }
        }, Act.EMPTY_ON_ERROR));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m95450a(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static a17 m95457h() {
        if (f67788l == null) {
            synchronized (f67787k) {
                try {
                    if (f67788l == null) {
                        f67788l = new a17();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f67788l;
    }

    @Override // p153l.vc2.InterfaceC20805a
    public int getCount() {
        return this.f67789a;
    }

    /* JADX INFO: renamed from: i */
    public void m95458i(boolean z) {
        this.f67790b = z;
        this.f67797i.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: j */
    public void m95459j() {
        vc2.m200753b().m200755d(this);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m95460k(uxj0 uxj0Var) {
        if (CoreModule.m30929H().signedIn_() && !this.f67795g) {
            this.f67796h = true;
            return;
        }
        int i = this.f67793e;
        if (!HardwareEarMonitorUtils.MANUFACTURER_VIVO.equalsIgnoreCase(Build.BRAND) && !ive0.m142299m() && !CoreModule.m30930K().mo31808pe()) {
            i += this.f67794f;
        }
        this.f67789a = i + CoreModule.m30934Q().mo68463r9().mo108370d().m222761e().intValue();
        vc2.m200753b().m200756e();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m95461l(ConversationCounter conversationCounter) {
        this.f67793e = gta.m132210e().m132214d().mo34680E7(conversationCounter.conversations) + conversationCounter.messages.unread;
        this.f67795g = true;
        this.f67797i.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m95462m(Counter counter) {
        this.f67794f = counter.activities.unread;
        this.f67797i.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m95463n(Throwable th) {
        if (this.f67796h) {
            this.f67796h = false;
            this.f67795g = true;
            this.f67797i.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m95464o() {
        this.f67793e = 0;
        this.f67795g = false;
        this.f67797i.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m95465p(Integer num) {
        this.f67797i.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: q */
    public kcg0 m95466q() {
        kcg0 kcg0Var = this.f67798j;
        if (kcg0Var != null && !kcg0Var.isUnsubscribed()) {
            this.f67798j.unsubscribe();
        }
        ft5 ft5VarM171650c = pcg0.m171650c(CoreModule.f18264c.f20384f0.m33776Qe().subscribe(psd0.m173597H(new y20() { // from class: l.u07
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176852a.m95461l((ConversationCounter) obj);
            }
        }, Act.EMPTY_ON_ERROR)), CoreModule.f18264c.m32486n3().subscribe(psd0.m173597H(new y20() { // from class: l.v07
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181838a.m95462m((Counter) obj);
            }
        }, new y20() { // from class: l.w07
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186544a.m95463n((Throwable) obj);
            }
        })), pcg0.m171648a(new x20() { // from class: l.x07
            @Override // p153l.x20
            public final void call() {
                this.f191871a.m95464o();
            }
        }), CoreModule.m30934Q().mo68463r9().mo108370d().onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.y07
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196949a.m95465p((Integer) obj);
            }
        }, new y20() { // from class: l.z07
            @Override // p153l.y20
            public final void call(Object obj) {
                a17.m95450a((Throwable) obj);
            }
        })));
        this.f67798j = ft5VarM171650c;
        return ft5VarM171650c;
    }
}
