package p009l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import java.util.List;
import l.f30;
import l.fbp0;
import l.j2g0;
import l.s7m;
import l.t6c0;
import l.x1e0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class evo0 implements s7m<fem0> {

    /* JADX INFO: renamed from: a */
    public yuo0 f12699a;

    /* JADX INFO: renamed from: b */
    public fem0 f12700b;

    /* JADX INFO: renamed from: d */
    private void m14107d() {
        yuo0 yuo0Var = this.f12699a;
        if (yuo0Var != null) {
            yuo0Var.m25522k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m14108f(final BLiveCommonViewConfig bLiveCommonViewConfig, int i) {
        fem0 fem0Var = this.f12700b;
        if (fem0Var == null || bLiveCommonViewConfig == null) {
            m14107d();
            return;
        }
        if (fem0Var.E2() != null) {
            fbp0.t(this.f12700b.E2(), bLiveCommonViewConfig.type, i);
        }
        this.f12699a.m25529s(new yuo0.InterfaceC1336a() { // from class: l.dvo0
            @Override // p009l.yuo0.InterfaceC1336a
            public final void onDismiss() {
                this.f12012a.m14111e(bLiveCommonViewConfig);
            }
        });
        m14107d();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m14109C0() {
        return null;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m14113i1(fem0 fem0Var) {
        this.f12700b = fem0Var;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m14111e(BLiveCommonViewConfig bLiveCommonViewConfig) {
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.scheme) && bLiveCommonViewConfig.scheme.startsWith("tantanapp://")) {
            this.f12700b.F2().SchemeHandleEvent.handleScheme().j(new x1e0.a(7006).e(bLiveCommonViewConfig.scheme).c());
        }
        String str = bLiveCommonViewConfig.type;
        str.getClass();
        switch (str) {
            case "undercover":
                this.f12700b.m14425V3();
                break;
            case "managerInvite":
                this.f12700b.m14421S3();
                break;
            case "chattingHall":
                this.f12700b.m14426W3();
                break;
            case "roomBackgroundMusic":
                this.f12700b.m14420R3();
                break;
            case "feedback":
                this.f12700b.m14427X3();
                break;
            case "exit":
                this.f12700b.m14418N3();
                break;
            case "game":
                this.f12700b.m14417M3();
                break;
            case "song":
                this.f12700b.m14416L3();
                break;
            case "share":
                this.f12700b.m14423T3();
                break;
            case "drawGuess":
                this.f12700b.m14415K3();
                break;
            case "stopRoom":
                this.f12700b.m14419P3();
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m14112i(List<BLiveCommonViewConfig> list) {
        if (this.f12699a == null) {
            this.f12699a = new yuo0(this.f12700b, t6c0.Ja, j2g0.h());
        }
        this.f12699a.m25528r(new f30() { // from class: l.cvo0
            public final void call(Object obj, Object obj2) {
                this.f10783a.m14108f((BLiveCommonViewConfig) obj, ((Integer) obj2).intValue());
            }
        });
        this.f12699a.m25530t(list);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
