package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.livingroom.view.TouchSwallowView;
import com.p046p1.mobile.putong.live.livingroom.voice.call.view.NormalVoiceDeputyItemView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class mcn0 extends bs2<NormalVoiceDeputyItemView> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f133159e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f133160f;

    /* JADX INFO: renamed from: g */
    public HorizontalScrollView f133161g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f133162h;

    /* JADX INFO: renamed from: i */
    public NormalVoiceDeputyItemView f133163i;

    /* JADX INFO: renamed from: j */
    public NormalVoiceDeputyItemView f133164j;

    /* JADX INFO: renamed from: k */
    public NormalVoiceDeputyItemView f133165k;

    /* JADX INFO: renamed from: l */
    public NormalVoiceDeputyItemView f133166l;

    /* JADX INFO: renamed from: m */
    public NormalVoiceDeputyItemView f133167m;

    /* JADX INFO: renamed from: n */
    public NormalVoiceDeputyItemView f133168n;

    /* JADX INFO: renamed from: o */
    public NormalVoiceDeputyItemView f133169o;

    /* JADX INFO: renamed from: p */
    public NormalVoiceDeputyItemView f133170p;

    @Override // p149l.bs2
    /* JADX INFO: renamed from: d */
    public List<NormalVoiceDeputyItemView> mo103619d() {
        return vwb.m200324f0(this.f133163i, this.f133164j, this.f133165k, this.f133166l, this.f133167m, this.f133168n, this.f133169o, this.f133170p);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m154020k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m154020k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ncn0.m158959b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.bs2
    /* JADX INFO: renamed from: r */
    public void mo103624r() {
        super.mo103624r();
        this.f133160f.setSwallowTarget(this.f133161g);
        this.f133160f.setSwallowTarget(this.f133163i);
        this.f133160f.setSwallowTarget(this.f133164j);
        this.f133160f.setSwallowTarget(this.f133165k);
        this.f133160f.setSwallowTarget(this.f133166l);
        this.f133160f.setSwallowTarget(this.f133167m);
        this.f133160f.setSwallowTarget(this.f133168n);
        this.f133160f.setSwallowTarget(this.f133169o);
        this.f133160f.setSwallowTarget(this.f133170p);
        int iM208412y0 = ((xdl0.m208412y0() - (t100.m186890d(58.0f) * 5)) - (t100.m186890d(21.0f) * 2)) / 4;
        for (int i = 1; i < mo103619d().size(); i++) {
            xdl0.m208358V(mo103619d().get(i), iM208412y0);
        }
    }
}
