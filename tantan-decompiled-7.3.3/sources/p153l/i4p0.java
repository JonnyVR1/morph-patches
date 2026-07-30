package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class i4p0 implements iam<jnm0> {

    /* JADX INFO: renamed from: a */
    public c4p0 f112931a;

    /* JADX INFO: renamed from: b */
    public jnm0 f112932b;

    /* JADX INFO: renamed from: d */
    private void m138575d() {
        c4p0 c4p0Var = this.f112931a;
        if (c4p0Var != null) {
            c4p0Var.m107947k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public void m138576f(final BLiveCommonViewConfig bLiveCommonViewConfig, int i) {
        jnm0 jnm0Var = this.f112932b;
        if (jnm0Var == null || bLiveCommonViewConfig == null) {
            m138575d();
            return;
        }
        if (jnm0Var.m213810E2() != 0) {
            jkp0.m145889t((jlm0) this.f112932b.m213810E2(), bLiveCommonViewConfig.type, i);
        }
        this.f112931a.m107954s(new c4p0.InterfaceC16183a() { // from class: l.h4p0
            @Override // p153l.c4p0.InterfaceC16183a
            public final void onDismiss() {
                this.f107822a.m138578e(bLiveCommonViewConfig);
            }
        });
        m138575d();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(jnm0 jnm0Var) {
        this.f112932b = jnm0Var;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m138578e(BLiveCommonViewConfig bLiveCommonViewConfig) {
        if (!TextUtils.isEmpty(bLiveCommonViewConfig.scheme) && bLiveCommonViewConfig.scheme.startsWith("tantanapp://")) {
            this.f112932b.m213811F2().SchemeHandleEvent.handleScheme().mo199273j(new bae0.C15953a(7006).m103154e(bLiveCommonViewConfig.scheme).m103152c());
        }
        String str = bLiveCommonViewConfig.type;
        str.getClass();
        switch (str) {
            case "undercover":
                this.f112932b.m146278V3();
                break;
            case "managerInvite":
                this.f112932b.m146275S3();
                break;
            case "chattingHall":
                this.f112932b.m146279W3();
                break;
            case "roomBackgroundMusic":
                this.f112932b.m146274R3();
                break;
            case "feedback":
                this.f112932b.m146280X3();
                break;
            case "exit":
                this.f112932b.m146272N3();
                break;
            case "game":
                this.f112932b.m146271M3();
                break;
            case "song":
                this.f112932b.m146270L3();
                break;
            case "share":
                this.f112932b.m146276T3();
                break;
            case "drawGuess":
                this.f112932b.m146269K3();
                break;
            case "stopRoom":
                this.f112932b.m146273P3();
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public void m138579i(List<BLiveCommonViewConfig> list) {
        if (this.f112931a == null) {
            this.f112931a = new c4p0(this.f112932b, yec0.f198810Ja, qag0.m175927h());
        }
        this.f112931a.m107953r(new z20() { // from class: l.g4p0
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f102186a.m138576f((BLiveCommonViewConfig) obj, ((Integer) obj2).intValue());
            }
        });
        this.f112931a.m107955t(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
