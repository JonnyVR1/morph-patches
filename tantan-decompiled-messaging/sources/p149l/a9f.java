package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class a9f extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public VText f68152u;

    /* JADX INFO: renamed from: v */
    public VText f68153v;

    public a9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m95417U(View view) {
        m51172x().act().startActivity(WebViewAct.m80164Z1(m51172x().act(), "个人信息收集清单", juk.m143325g()));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m95418V(View view) {
        m51172x().act().startActivity(WebViewAct.m80164Z1(m51172x().act(), "第三方信息数据共享", juk.m143329k()));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: e */
    public boolean mo51153e() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
        xdl0.m208378h0((View) view.getParent(), 0);
        xdl0.m208329E0(this.f68152u, new View.OnClickListener() { // from class: l.y8f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f196821a.m95417U(view2);
            }
        });
        xdl0.m208329E0(this.f68153v, new View.OnClickListener() { // from class: l.z8f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f202149a.m95418V(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.f96041v2, (ViewGroup) null);
        this.f68152u = (VText) viewInflate.findViewById(u4c0.f173888K1);
        this.f68153v = (VText) viewInflate.findViewById(u4c0.f173905L1);
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
    }
}
