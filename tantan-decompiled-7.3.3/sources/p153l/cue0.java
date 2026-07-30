package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class cue0 extends ar2<gue0> {

    /* JADX INFO: renamed from: a */
    public String f83837a;

    /* JADX INFO: renamed from: b */
    public String f83838b;

    /* JADX INFO: renamed from: c */
    public String f83839c;

    public cue0(ner nerVar) {
        super(nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k0 */
    public /* synthetic */ void m112673k0(Bundle bundle) {
        ((gue0) this.viewModel).m132290r();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        creates(new y20() { // from class: l.xte0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196204a.m112673k0((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: j0 */
    public void m112674j0(String str) {
        this.f83839c = str;
        String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(str);
        this.f83838b = strM116634y7;
        this.f83837a = strM116634y7;
        ((gue0) this.viewModel).m132288i(strM116634y7);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m112676m0() {
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m112677n0(uxj0 uxj0Var) {
        act().progressDismiss();
        act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m112678o0(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: p0 */
    public void m112679p0() {
        if (NullChecker.m82486a(m112682s0(this.f83838b))) {
            return;
        }
        if (this.f83838b.equals(this.f83837a)) {
            act().lambda$debugItems$19();
        } else {
            p710.m171096c(act(), "", act().string(R$string.f21566O3), act().string(R$string.f21815r4), act().string(R$string.f21658a), new x20() { // from class: l.yte0
                @Override // p153l.x20
                public final void call() {
                    this.f201504a.m112675l0();
                }
            }, new x20() { // from class: l.zte0
                @Override // p153l.x20
                public final void call() {
                    this.f206004a.m112676m0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public void m112675l0() {
        i4g0.m138520r("e_edit_nickname_page_done_button", "p_edit_nickname_page");
        act().progress(R$string.f21517I2);
        duringCreated(CoreModule.f18264c.f20381e0.m116467Ga(this.f83839c, this.f83838b)).subscribe(psd0.m173597H(new y20() { // from class: l.aue0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73489a.m112677n0((uxj0) obj);
            }
        }, new y20() { // from class: l.bue0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78491a.m112678o0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r0 */
    public void m112681r0(String str) {
        this.f83838b = str;
        ((gue0) this.viewModel).m132289m();
    }

    /* JADX INFO: renamed from: s0 */
    public String m112682s0(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!User.NAME_PATTERN().matcher(str).matches() || User.ILLEGAL_NAME_PATTERN().matcher(str).matches()) {
            return CoreModule.f18263b.getString(com.p051p1.mobile.putong.common.R$string.f18157g2);
        }
        return null;
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
