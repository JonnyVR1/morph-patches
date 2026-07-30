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
public class uln0 extends rs2<NormalVoiceDeputyItemView> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f179525e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f179526f;

    /* JADX INFO: renamed from: g */
    public HorizontalScrollView f179527g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f179528h;

    /* JADX INFO: renamed from: i */
    public NormalVoiceDeputyItemView f179529i;

    /* JADX INFO: renamed from: j */
    public NormalVoiceDeputyItemView f179530j;

    /* JADX INFO: renamed from: k */
    public NormalVoiceDeputyItemView f179531k;

    /* JADX INFO: renamed from: l */
    public NormalVoiceDeputyItemView f179532l;

    /* JADX INFO: renamed from: m */
    public NormalVoiceDeputyItemView f179533m;

    /* JADX INFO: renamed from: n */
    public NormalVoiceDeputyItemView f179534n;

    /* JADX INFO: renamed from: o */
    public NormalVoiceDeputyItemView f179535o;

    /* JADX INFO: renamed from: p */
    public NormalVoiceDeputyItemView f179536p;

    /* JADX INFO: renamed from: q */
    public NormalVoiceDeputyItemView f179537q;

    /* JADX INFO: renamed from: r */
    public NormalVoiceDeputyItemView f179538r;

    @Override // p153l.rs2
    /* JADX INFO: renamed from: d */
    public List<NormalVoiceDeputyItemView> mo134610d() {
        return jyb.m147507f0(this.f179529i, this.f179530j, this.f179531k, this.f179532l, this.f179533m, this.f179534n, this.f179535o, this.f179536p, this.f179537q, this.f179538r);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m196559k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m196559k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vln0.m201652b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.rs2
    /* JADX INFO: renamed from: r */
    public void mo154019r() {
        super.mo154019r();
        this.f179526f.setSwallowTarget(this.f179527g);
        this.f179526f.setSwallowTarget(this.f179529i);
        this.f179526f.setSwallowTarget(this.f179530j);
        this.f179526f.setSwallowTarget(this.f179531k);
        this.f179526f.setSwallowTarget(this.f179532l);
        this.f179526f.setSwallowTarget(this.f179533m);
        this.f179526f.setSwallowTarget(this.f179534n);
        this.f179526f.setSwallowTarget(this.f179535o);
        this.f179526f.setSwallowTarget(this.f179536p);
        this.f179526f.setSwallowTarget(this.f179537q);
        this.f179526f.setSwallowTarget(this.f179538r);
        int iM105592y0 = ((bnl0.m105592y0() - (qa00.m175859d(58.0f) * 5)) - (qa00.m175859d(21.0f) * 2)) / 4;
        for (int i = 1; i < mo134610d().size(); i++) {
            bnl0.m105538V(mo134610d().get(i), iM105592y0);
        }
    }
}
