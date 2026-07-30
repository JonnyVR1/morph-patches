package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p051p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class qln0 extends rs2<NormalVoiceDeputyItemView> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f158244e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f158245f;

    /* JADX INFO: renamed from: g */
    public HorizontalScrollView f158246g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f158247h;

    /* JADX INFO: renamed from: i */
    public NormalVoiceDeputyItemView f158248i;

    /* JADX INFO: renamed from: j */
    public NormalVoiceDeputyItemView f158249j;

    /* JADX INFO: renamed from: k */
    public NormalVoiceDeputyItemView f158250k;

    /* JADX INFO: renamed from: l */
    public NormalVoiceDeputyItemView f158251l;

    /* JADX INFO: renamed from: m */
    public NormalVoiceDeputyItemView f158252m;

    /* JADX INFO: renamed from: n */
    public NormalVoiceDeputyItemView f158253n;

    /* JADX INFO: renamed from: o */
    public NormalVoiceDeputyItemView f158254o;

    /* JADX INFO: renamed from: p */
    public NormalVoiceDeputyItemView f158255p;

    @Override // p153l.rs2
    /* JADX INFO: renamed from: d */
    public List<NormalVoiceDeputyItemView> mo134610d() {
        return jyb.m147507f0(this.f158248i, this.f158249j, this.f158250k, this.f158251l, this.f158252m, this.f158253n, this.f158254o, this.f158255p);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m177006k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m177006k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rln0.m182022b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.rs2
    /* JADX INFO: renamed from: r */
    public void mo154019r() {
        super.mo154019r();
        this.f158245f.setSwallowTarget(this.f158246g);
        this.f158245f.setSwallowTarget(this.f158248i);
        this.f158245f.setSwallowTarget(this.f158249j);
        this.f158245f.setSwallowTarget(this.f158250k);
        this.f158245f.setSwallowTarget(this.f158251l);
        this.f158245f.setSwallowTarget(this.f158252m);
        this.f158245f.setSwallowTarget(this.f158253n);
        this.f158245f.setSwallowTarget(this.f158254o);
        this.f158245f.setSwallowTarget(this.f158255p);
        int iM105592y0 = ((bnl0.m105592y0() - (qa00.m175859d(58.0f) * 5)) - (qa00.m175859d(21.0f) * 2)) / 4;
        for (int i = 1; i < mo134610d().size(); i++) {
            bnl0.m105538V(mo134610d().get(i), iM105592y0);
        }
    }
}
