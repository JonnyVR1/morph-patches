package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class gaf extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public VText f102979u;

    /* JADX INFO: renamed from: v */
    public VText f102980v;

    public gaf(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m129708U(View view) {
        m52355x().act().startActivity(WebViewAct.m81347a2(m52355x().act(), "个人信息收集清单", zwk.m221907g()));
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m129709V(View view) {
        m52355x().act().startActivity(WebViewAct.m81347a2(m52355x().act(), "第三方信息数据共享", zwk.m221911k()));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: e */
    public boolean mo52336e() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
        bnl0.m105558h0((View) view.getParent(), 0);
        bnl0.m105509E0(this.f102979u, new View.OnClickListener() { // from class: l.eaf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f92779a.m129708U(view2);
            }
        });
        bnl0.m105509E0(this.f102980v, new View.OnClickListener() { // from class: l.faf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f97979a.m129709V(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    @NonNull
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(kec0.f126095v2, (ViewGroup) null);
        this.f102979u = (VText) viewInflate.findViewById(adc0.f69976K1);
        this.f102980v = (VText) viewInflate.findViewById(adc0.f69993L1);
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
    }
}
