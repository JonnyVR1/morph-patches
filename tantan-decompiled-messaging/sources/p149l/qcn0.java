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
public class qcn0 extends bs2<NormalVoiceDeputyItemView> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f153767e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f153768f;

    /* JADX INFO: renamed from: g */
    public HorizontalScrollView f153769g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f153770h;

    /* JADX INFO: renamed from: i */
    public NormalVoiceDeputyItemView f153771i;

    /* JADX INFO: renamed from: j */
    public NormalVoiceDeputyItemView f153772j;

    /* JADX INFO: renamed from: k */
    public NormalVoiceDeputyItemView f153773k;

    /* JADX INFO: renamed from: l */
    public NormalVoiceDeputyItemView f153774l;

    /* JADX INFO: renamed from: m */
    public NormalVoiceDeputyItemView f153775m;

    /* JADX INFO: renamed from: n */
    public NormalVoiceDeputyItemView f153776n;

    /* JADX INFO: renamed from: o */
    public NormalVoiceDeputyItemView f153777o;

    /* JADX INFO: renamed from: p */
    public NormalVoiceDeputyItemView f153778p;

    /* JADX INFO: renamed from: q */
    public NormalVoiceDeputyItemView f153779q;

    /* JADX INFO: renamed from: r */
    public NormalVoiceDeputyItemView f153780r;

    @Override // p149l.bs2
    /* JADX INFO: renamed from: d */
    public List<NormalVoiceDeputyItemView> mo103619d() {
        return vwb.m200324f0(this.f153771i, this.f153772j, this.f153773k, this.f153774l, this.f153775m, this.f153776n, this.f153777o, this.f153778p, this.f153779q, this.f153780r);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m173892k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m173892k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return rcn0.m178810b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.bs2
    /* JADX INFO: renamed from: r */
    public void mo103624r() {
        super.mo103624r();
        this.f153768f.setSwallowTarget(this.f153769g);
        this.f153768f.setSwallowTarget(this.f153771i);
        this.f153768f.setSwallowTarget(this.f153772j);
        this.f153768f.setSwallowTarget(this.f153773k);
        this.f153768f.setSwallowTarget(this.f153774l);
        this.f153768f.setSwallowTarget(this.f153775m);
        this.f153768f.setSwallowTarget(this.f153776n);
        this.f153768f.setSwallowTarget(this.f153777o);
        this.f153768f.setSwallowTarget(this.f153778p);
        this.f153768f.setSwallowTarget(this.f153779q);
        this.f153768f.setSwallowTarget(this.f153780r);
        int iM208412y0 = ((xdl0.m208412y0() - (t100.m186890d(58.0f) * 5)) - (t100.m186890d(21.0f) * 2)) / 4;
        for (int i = 1; i < mo103619d().size(); i++) {
            xdl0.m208358V(mo103619d().get(i), iM208412y0);
        }
    }
}
