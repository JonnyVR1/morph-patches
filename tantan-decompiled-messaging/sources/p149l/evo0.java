package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class evo0 implements s7m<fem0> {

    /* JADX INFO: renamed from: a */
    public yuo0 f93364a;

    /* JADX INFO: renamed from: b */
    public fem0 f93365b;

    /* JADX INFO: renamed from: d */
    private void m118303d() {
        yuo0 yuo0Var = this.f93364a;
        if (yuo0Var != null) {
            yuo0Var.m216144k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public void m118304f(final BLiveCommonViewConfig bLiveCommonViewConfig, int i) {
        fem0 fem0Var = this.f93365b;
        if (fem0Var == null || bLiveCommonViewConfig == null) {
            m118303d();
            return;
        }
        if (fem0Var.m206027E2() != 0) {
            fbp0.m120404t((fcm0) this.f93365b.m206027E2(), bLiveCommonViewConfig.type, i);
        }
        this.f93364a.m216151s(new yuo0.InterfaceC21517a() { // from class: l.dvo0
            @Override // p149l.yuo0.InterfaceC21517a
            public final void onDismiss() {
                this.f88088a.m118306e(bLiveCommonViewConfig);
            }
        });
        m118303d();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(fem0 fem0Var) {
        this.f93365b = fem0Var;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m118306e(BLiveCommonViewConfig bLiveCommonViewConfig) {
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.scheme) && bLiveCommonViewConfig.scheme.startsWith("tantanapp://")) {
            this.f93365b.m206028F2().SchemeHandleEvent.handleScheme().mo172463j(new x1e0.C21018a(7006).m206701e(bLiveCommonViewConfig.scheme).m206699c());
        }
        String str = bLiveCommonViewConfig.type;
        str.getClass();
        switch (str) {
            case "undercover":
                this.f93365b.m121056V3();
                break;
            case "managerInvite":
                this.f93365b.m121053S3();
                break;
            case "chattingHall":
                this.f93365b.m121057W3();
                break;
            case "roomBackgroundMusic":
                this.f93365b.m121052R3();
                break;
            case "feedback":
                this.f93365b.m121058X3();
                break;
            case "exit":
                this.f93365b.m121050N3();
                break;
            case "game":
                this.f93365b.m121049M3();
                break;
            case "song":
                this.f93365b.m121048L3();
                break;
            case "share":
                this.f93365b.m121054T3();
                break;
            case "drawGuess":
                this.f93365b.m121047K3();
                break;
            case "stopRoom":
                this.f93365b.m121051P3();
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m118307i(List<BLiveCommonViewConfig> list) {
        if (this.f93364a == null) {
            this.f93364a = new yuo0(this.f93365b, t6c0.f168078Ja, j2g0.m139461h());
        }
        this.f93364a.m216150r(new f30() { // from class: l.cvo0
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f82667a.m118304f((BLiveCommonViewConfig) obj, ((Integer) obj2).intValue());
            }
        });
        this.f93364a.m216152t(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
