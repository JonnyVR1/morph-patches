package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveClarity;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import java.util.Iterator;
import java.util.List;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class y01 implements iam<e11> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f196937a;

    /* JADX INFO: renamed from: b */
    public View f196938b;

    /* JADX INFO: renamed from: c */
    public View f196939c;

    /* JADX INFO: renamed from: d */
    public TextView f196940d;

    /* JADX INFO: renamed from: e */
    public VLinear f196941e;

    /* JADX INFO: renamed from: f */
    public e11 f196942f;

    /* JADX INFO: renamed from: g */
    public DialogC12774a f196943g;

    /* JADX INFO: renamed from: i */
    private void m213829i() {
        c0s c0sVar = new c0s(this.f196942f, m213832c(act().inflater(), this.f196942f.m118934N3()));
        this.f196943g = c0sVar;
        c0sVar.setCanceledOnTouchOutside(true);
        this.f196943g.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m213830k(View view) {
        m213835f();
    }

    /* JADX INFO: renamed from: l */
    private void m213831l() {
        this.f196938b.setOnClickListener(new View.OnClickListener() { // from class: l.w01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186531a.m213830k(view);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f196942f.act();
    }

    /* JADX INFO: renamed from: c */
    public View m213832c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z01.m218100b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(e11 e11Var) {
        this.f196942f = e11Var;
    }

    @Override // p153l.iam
    public void destroy() {
        VLinear vLinear = this.f196941e;
        if (vLinear != null) {
            vLinear.removeAllViews();
        }
    }

    /* JADX INFO: renamed from: e */
    public final VText m213834e(BLiveClarity bLiveClarity) {
        VText vText = new VText(this.f196942f.m113230C0());
        vText.setText(bLiveClarity.text);
        vText.setTag(bLiveClarity);
        vText.setBackgroundResource(obc0.f146524v6);
        vText.setGravity(17);
        vText.setTextColor(vText.getResources().getColor(n9c0.f140820d1));
        vText.setTextSize(2, 12.0f);
        vText.setSelected(bLiveClarity.selected);
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.x01
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191862a.m213836j(view);
            }
        });
        return vText;
    }

    /* JADX INFO: renamed from: f */
    public void m213835f() {
        DialogC12774a dialogC12774a = this.f196943g;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f196943g.dismiss();
        this.f196943g = null;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m213836j(View view) {
        this.f196942f.m118936R3((BLiveClarity) view.getTag());
    }

    /* JADX INFO: renamed from: m */
    public final void m213837m(List<BLiveClarity> list) {
        if (list.isEmpty() || this.f196942f == null) {
            m213835f();
            return;
        }
        this.f196941e.removeAllViews();
        Iterator<BLiveClarity> it = list.iterator();
        while (it.hasNext()) {
            VText vTextM213834e = m213834e(it.next());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.f156295H, qa00.f156338y);
            layoutParams.leftMargin = qa00.f156328o;
            this.f196941e.addView(vTextM213834e, layoutParams);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m213838n(List<BLiveClarity> list) {
        m213829i();
        m213831l();
        m213837m(list);
    }
}
