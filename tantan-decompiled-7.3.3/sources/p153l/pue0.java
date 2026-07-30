package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.TickleSettingInfo;
import com.p051p1.mobile.putong.core.data.TicklesStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes12.dex */
public class pue0 extends ar2<uue0> {

    /* JADX INFO: renamed from: a */
    public String f154170a;

    /* JADX INFO: renamed from: b */
    public boolean f154171b;

    /* JADX INFO: renamed from: c */
    public boolean f154172c;

    /* JADX INFO: renamed from: d */
    public String f154173d;

    /* JADX INFO: renamed from: e */
    public String f154174e;

    /* JADX INFO: renamed from: f */
    public TicklesStatus f154175f;

    /* JADX INFO: renamed from: g */
    public TicklesStatus f154176g;

    public pue0(ner nerVar) {
        super(nerVar);
        this.f154173d = "";
        this.f154174e = "";
        this.f154175f = null;
        this.f154176g = null;
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m173867i0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m173870o0(Envelope envelope) {
        String str;
        this.f154171b = true;
        ((uue0) this.viewModel).m198193w();
        ((uue0) this.viewModel).m198192v();
        List<TickleSettingInfo> list = ((CoreData) envelope.getModuleData(CoreData.class)).tickles;
        String str2 = "";
        if (jyb.m147479J(list)) {
            str = "";
        } else {
            str = "";
            for (TickleSettingInfo tickleSettingInfo : list) {
                if (TextUtils.equals(tickleSettingInfo.receiver, CoreModule.m30929H().userId()) && !TextUtils.isEmpty(tickleSettingInfo.receiverSuffix)) {
                    str2 = tickleSettingInfo.receiverSuffix;
                    this.f154175f = tickleSettingInfo.status;
                    this.f154173d = str2;
                } else if (!TextUtils.isEmpty(tickleSettingInfo.receiverSuffix)) {
                    str = tickleSettingInfo.receiverSuffix;
                    this.f154176g = tickleSettingInfo.status;
                    this.f154174e = str;
                }
            }
        }
        ((uue0) this.viewModel).m198194x(str2, this.f154175f, str, this.f154176g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p0 */
    public /* synthetic */ void m173871p0(Bundle bundle) {
        ((uue0) this.viewModel).m198189r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: Z */
    public void mo40472Z() {
        super.mo40472Z();
        String stringExtra = act().getIntent().getStringExtra("clap_user_id");
        this.f154170a = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            act().m68056e2();
        }
        act().duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f154170a).take(1)).subscribe(psd0.m173596G(new y20() { // from class: l.iue0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116922a.m173874n0((User) obj);
            }
        }));
        act().duringCreated(CoreModule.f18264c.f20384f0.m34184xg(this.f154170a)).subscribe(psd0.m173597H(new y20() { // from class: l.jue0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122706a.m173870o0((Envelope) obj);
            }
        }, new y20() { // from class: l.kue0
            @Override // p153l.y20
            public final void call(Object obj) {
                pue0.m173867i0((Throwable) obj);
            }
        }));
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.lue0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133627a.m173871p0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m173872l0() {
        return this.f154171b;
    }

    /* JADX INFO: renamed from: m0 */
    public boolean m173873m0() {
        return this.f154172c;
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ C22421c m173875q0(String str, String str2, Long l2) {
        return CoreModule.f18264c.f20384f0.m33654Fp(this.f154170a, str, str2, this.f154173d, this.f154174e);
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m173876r0(String str, String str2, uxj0 uxj0Var) {
        String str3;
        if (TextUtils.equals(this.f154173d, str) || TextUtils.equals(str2, this.f154174e)) {
            str3 = !TextUtils.equals(this.f154173d, str) ? "general_tickle" : "special_tickle";
        } else {
            str3 = "both";
        }
        sfj0.m185596c("e_finish_tickle", "p_my_tickle", sfj0.C20032a.m185615h("finish_tickle", str3));
        jxd0 jxd0Var = CoreModule.f18264c.f20373b1.f193004R;
        Boolean bool = Boolean.TRUE;
        jxd0Var.put(bool);
        CoreModule.f18264c.f20381e0.f89207d1.put(bool);
        act().progressDismiss();
        act().m68056e2();
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m173877s0(Throwable th) {
        if (!(th instanceof TantanException.Client.TantanForbidden)) {
            if (th instanceof TantanException.Client.CoreService) {
                act().progressDismiss();
                return;
            }
            return;
        }
        act().progressDismiss();
        int i = ((TantanException.Client.TantanForbidden) th).code;
        if (i == 40325) {
            o1j0.m165651y(CoreModule.f18263b.getString(R$string.f21616U5));
        } else if (i == 40399) {
            act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m173878t0(final String str, final String str2) {
        if (TextUtils.equals(this.f154173d, str) && TextUtils.equals(str2, this.f154174e)) {
            act().m68056e2();
        } else {
            act().progress(R$string.f21517I2);
            duringCreated((C22421c) C22421c.timer(500L, TimeUnit.MILLISECONDS).flatMap(new qcj() { // from class: l.mue0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f138769a.m173875q0(str, str2, (Long) obj);
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.nue0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143701a.m173876r0(str, str2, (uxj0) obj);
                }
            }, new y20() { // from class: l.oue0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f149140a.m173877s0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m173879u0(boolean z) {
        this.f154172c = z;
    }

    /* JADX INFO: renamed from: x0, reason: merged with bridge method [inline-methods] */
    public final void m173874n0(User user) {
        if (!h39.m133419H()) {
            ((uue0) this.viewModel).m198195y(user.name);
            return;
        }
        String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(user.f56859id);
        if (!TextUtils.isEmpty(strM116634y7)) {
            ((uue0) this.viewModel).m198195y(strM116634y7);
        } else if (!NullChecker.m82486a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
            ((uue0) this.viewModel).m198195y("ta");
        } else {
            ((uue0) this.viewModel).m198195y(user.name);
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
