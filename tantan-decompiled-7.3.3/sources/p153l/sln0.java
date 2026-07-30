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
public class sln0 extends rs2<NormalVoiceDeputyItemView> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f169396e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f169397f;

    /* JADX INFO: renamed from: g */
    public HorizontalScrollView f169398g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f169399h;

    /* JADX INFO: renamed from: i */
    public NormalVoiceDeputyItemView f169400i;

    /* JADX INFO: renamed from: j */
    public NormalVoiceDeputyItemView f169401j;

    /* JADX INFO: renamed from: k */
    public NormalVoiceDeputyItemView f169402k;

    /* JADX INFO: renamed from: l */
    public NormalVoiceDeputyItemView f169403l;

    /* JADX INFO: renamed from: m */
    public NormalVoiceDeputyItemView f169404m;

    /* JADX INFO: renamed from: n */
    public NormalVoiceDeputyItemView f169405n;

    /* JADX INFO: renamed from: o */
    public NormalVoiceDeputyItemView f169406o;

    /* JADX INFO: renamed from: p */
    public NormalVoiceDeputyItemView f169407p;

    /* JADX INFO: renamed from: q */
    public NormalVoiceDeputyItemView f169408q;

    @Override // p153l.rs2
    /* JADX INFO: renamed from: d */
    public List<NormalVoiceDeputyItemView> mo134610d() {
        return jyb.m147507f0(this.f169400i, this.f169401j, this.f169402k, this.f169403l, this.f169404m, this.f169405n, this.f169406o, this.f169407p, this.f169408q);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m186600k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m186600k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tln0.m191657b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.rs2
    /* JADX INFO: renamed from: r */
    public void mo154019r() {
        super.mo154019r();
        this.f169397f.setSwallowTarget(this.f169398g);
        this.f169397f.setSwallowTarget(this.f169400i);
        this.f169397f.setSwallowTarget(this.f169401j);
        this.f169397f.setSwallowTarget(this.f169402k);
        this.f169397f.setSwallowTarget(this.f169403l);
        this.f169397f.setSwallowTarget(this.f169404m);
        this.f169397f.setSwallowTarget(this.f169405n);
        this.f169397f.setSwallowTarget(this.f169406o);
        this.f169397f.setSwallowTarget(this.f169407p);
        this.f169397f.setSwallowTarget(this.f169408q);
        int iM105592y0 = ((bnl0.m105592y0() - (qa00.m175859d(58.0f) * 5)) - (qa00.m175859d(21.0f) * 2)) / 4;
        for (int i = 1; i < mo134610d().size(); i++) {
            bnl0.m105538V(mo134610d().get(i), iM105592y0);
        }
    }
}
