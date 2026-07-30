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
public class ocn0 extends bs2<NormalVoiceDeputyItemView> {

    /* JADX INFO: renamed from: e */
    public LinearLayout f143056e;

    /* JADX INFO: renamed from: f */
    public TouchSwallowView f143057f;

    /* JADX INFO: renamed from: g */
    public HorizontalScrollView f143058g;

    /* JADX INFO: renamed from: h */
    public LinearLayout f143059h;

    /* JADX INFO: renamed from: i */
    public NormalVoiceDeputyItemView f143060i;

    /* JADX INFO: renamed from: j */
    public NormalVoiceDeputyItemView f143061j;

    /* JADX INFO: renamed from: k */
    public NormalVoiceDeputyItemView f143062k;

    /* JADX INFO: renamed from: l */
    public NormalVoiceDeputyItemView f143063l;

    /* JADX INFO: renamed from: m */
    public NormalVoiceDeputyItemView f143064m;

    /* JADX INFO: renamed from: n */
    public NormalVoiceDeputyItemView f143065n;

    /* JADX INFO: renamed from: o */
    public NormalVoiceDeputyItemView f143066o;

    /* JADX INFO: renamed from: p */
    public NormalVoiceDeputyItemView f143067p;

    /* JADX INFO: renamed from: q */
    public NormalVoiceDeputyItemView f143068q;

    @Override // p149l.bs2
    /* JADX INFO: renamed from: d */
    public List<NormalVoiceDeputyItemView> mo103619d() {
        return vwb.m200324f0(this.f143060i, this.f143061j, this.f143062k, this.f143063l, this.f143064m, this.f143065n, this.f143066o, this.f143067p, this.f143068q);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m163538k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m163538k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pcn0.m168361b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.bs2
    /* JADX INFO: renamed from: r */
    public void mo103624r() {
        super.mo103624r();
        this.f143057f.setSwallowTarget(this.f143058g);
        this.f143057f.setSwallowTarget(this.f143060i);
        this.f143057f.setSwallowTarget(this.f143061j);
        this.f143057f.setSwallowTarget(this.f143062k);
        this.f143057f.setSwallowTarget(this.f143063l);
        this.f143057f.setSwallowTarget(this.f143064m);
        this.f143057f.setSwallowTarget(this.f143065n);
        this.f143057f.setSwallowTarget(this.f143066o);
        this.f143057f.setSwallowTarget(this.f143067p);
        this.f143057f.setSwallowTarget(this.f143068q);
        int iM208412y0 = ((xdl0.m208412y0() - (t100.m186890d(58.0f) * 5)) - (t100.m186890d(21.0f) * 2)) / 4;
        for (int i = 1; i < mo103619d().size(); i++) {
            xdl0.m208358V(mo103619d().get(i), iM208412y0);
        }
    }
}
