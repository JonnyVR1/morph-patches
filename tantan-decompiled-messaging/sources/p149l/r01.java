package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveClarity;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import java.util.Iterator;
import java.util.List;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class r01 implements s7m<x01> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f157126a;

    /* JADX INFO: renamed from: b */
    public View f157127b;

    /* JADX INFO: renamed from: c */
    public View f157128c;

    /* JADX INFO: renamed from: d */
    public TextView f157129d;

    /* JADX INFO: renamed from: e */
    public VLinear f157130e;

    /* JADX INFO: renamed from: f */
    public x01 f157131f;

    /* JADX INFO: renamed from: g */
    public DialogC12611a f157132g;

    /* JADX INFO: renamed from: i */
    private void m177317i() {
        byr byrVar = new byr(this.f157131f, m177320c(act().inflater(), this.f157131f.m206530N3()));
        this.f157132g = byrVar;
        byrVar.setCanceledOnTouchOutside(true);
        this.f157132g.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m177318k(View view) {
        m177323f();
    }

    /* JADX INFO: renamed from: l */
    private void m177319l() {
        this.f157127b.setOnClickListener(new View.OnClickListener() { // from class: l.p01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146535a.m177318k(view);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f157131f.act();
    }

    /* JADX INFO: renamed from: c */
    public View m177320c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s01.m181812b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x01 x01Var) {
        this.f157131f = x01Var;
    }

    @Override // p149l.s7m
    public void destroy() {
        VLinear vLinear = this.f157130e;
        if (vLinear != null) {
            vLinear.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: e */
    public final VText m177322e(BLiveClarity bLiveClarity) {
        VText vText = new VText(this.f157131f.m104249C0());
        vText.setText(bLiveClarity.text);
        vText.setTag(bLiveClarity);
        vText.setBackgroundResource(i3c0.f111196v6);
        vText.setGravity(17);
        vText.setTextColor(vText.getResources().getColor(h1c0.f105359d1));
        vText.setTextSize(2, 12.0f);
        vText.setSelected(bLiveClarity.selected);
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.q01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151992a.m177324j(view);
            }
        });
        return vText;
    }

    /* JADX INFO: renamed from: f */
    public void m177323f() {
        DialogC12611a dialogC12611a = this.f157132g;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f157132g.dismiss();
        this.f157132g = null;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m177324j(View view) {
        this.f157131f.m206532R3((BLiveClarity) view.getTag());
    }

    /* JADX INFO: renamed from: m */
    public final void m177325m(List<BLiveClarity> list) {
        if (list.isEmpty() || this.f157131f == null) {
            m177323f();
            return;
        }
        this.f157130e.removeAllViews();
        Iterator<BLiveClarity> it = list.iterator();
        while (it.hasNext()) {
            VText vTextM177322e = m177322e(it.next());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.f167233H, t100.f167276y);
            layoutParams.leftMargin = t100.f167266o;
            this.f157130e.addView(vTextM177322e, layoutParams);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m177326n(List<BLiveClarity> list) {
        m177317i();
        m177319l();
        m177325m(list);
    }
}
