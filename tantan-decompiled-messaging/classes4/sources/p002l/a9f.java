package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import l.f6c0;
import l.juk;
import l.mcr;
import l.u4c0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class a9f extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public VText f7455u;

    /* JADX INFO: renamed from: v */
    public VText f7456v;

    public a9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m9454U(View view) {
        m1624x().act().startActivity(WebViewAct.Z1(m1624x().act(), "个人信息收集清单", juk.g()));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m9455V(View view) {
        m1624x().act().startActivity(WebViewAct.Z1(m1624x().act(), "第三方信息数据共享", juk.k()));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: e */
    public boolean mo1605e() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
        xdl0.h0((View) view.getParent(), 0);
        xdl0.E0(this.f7455u, new View.OnClickListener() { // from class: l.y8f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f22738a.m9454U(view2);
            }
        });
        xdl0.E0(this.f7456v, new View.OnClickListener() { // from class: l.z8f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f23304a.m9455V(view2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.v2, (ViewGroup) null);
        this.f7455u = viewInflate.findViewById(u4c0.K1);
        this.f7456v = viewInflate.findViewById(u4c0.L1);
        return viewInflate;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
    }
}
