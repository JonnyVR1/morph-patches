package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p1.mobile.putong.live.base.data.BLiveClarity;
import java.util.Iterator;
import java.util.List;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r01 implements s7m<x01> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f18298a;

    /* JADX INFO: renamed from: b */
    public View f18299b;

    /* JADX INFO: renamed from: c */
    public View f18300c;

    /* JADX INFO: renamed from: d */
    public TextView f18301d;

    /* JADX INFO: renamed from: e */
    public VLinear f18302e;

    /* JADX INFO: renamed from: f */
    public x01 f18303f;

    /* JADX INFO: renamed from: g */
    public C0200a f18304g;

    /* JADX WARN: Type inference failed for: r1v2, types: [android.app.Dialog, com.p1.mobile.putong.live.livingroom.archi.dialogcenter.a, l.byr] */
    /* JADX INFO: renamed from: i */
    private void m21650i() {
        ?? byrVar = new byr(this.f18303f, m21654c(act().inflater(), this.f18303f.m25570N3()));
        this.f18304g = byrVar;
        byrVar.setCanceledOnTouchOutside(true);
        this.f18304g.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m21651k(View view) {
        m21657f();
    }

    /* JADX INFO: renamed from: l */
    private void m21652l() {
        this.f18299b.setOnClickListener(new View.OnClickListener() { // from class: l.p01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16944a.m21651k(view);
            }
        });
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m21653C0() {
        return this.f18303f.act();
    }

    /* JADX INFO: renamed from: c */
    public View m21654c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s01.m22183b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m21658i1(x01 x01Var) {
        this.f18303f = x01Var;
    }

    public void destroy() {
        VLinear vLinear = this.f18302e;
        if (vLinear != null) {
            vLinear.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: e */
    public final VText m21656e(BLiveClarity bLiveClarity) {
        VText vText = new VText(this.f18303f.C0());
        vText.setText(bLiveClarity.text);
        vText.setTag(bLiveClarity);
        vText.setBackgroundResource(i3c0.f12981v6);
        vText.setGravity(17);
        vText.setTextColor(vText.getResources().getColor(h1c0.f11779d1));
        vText.setTextSize(2, 12.0f);
        vText.setSelected(bLiveClarity.selected);
        xdl0.E0(vText, new View.OnClickListener() { // from class: l.q01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17736a.m21659j(view);
            }
        });
        return vText;
    }

    /* JADX INFO: renamed from: f */
    public void m21657f() {
        a aVar = this.f18304g;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f18304g.dismiss();
        this.f18304g = null;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m21659j(View view) {
        this.f18303f.m25572R3((BLiveClarity) view.getTag());
    }

    /* JADX INFO: renamed from: m */
    public final void m21660m(List<BLiveClarity> list) {
        if (list.isEmpty() || this.f18303f == null) {
            m21657f();
            return;
        }
        this.f18302e.removeAllViews();
        Iterator<BLiveClarity> it = list.iterator();
        while (it.hasNext()) {
            View viewM21656e = m21656e(it.next());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.H, t100.y);
            layoutParams.leftMargin = t100.o;
            this.f18302e.addView(viewM21656e, layoutParams);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m21661n(List<BLiveClarity> list) {
        m21650i();
        m21652l();
        m21660m(list);
    }
}
