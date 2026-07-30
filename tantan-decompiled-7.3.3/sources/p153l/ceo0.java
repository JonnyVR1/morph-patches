package p153l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes5.dex */
public class ceo0 implements iam<ydo0> {

    /* JADX INFO: renamed from: a */
    public View f81399a;

    /* JADX INFO: renamed from: b */
    public VText f81400b;

    /* JADX INFO: renamed from: c */
    public VText f81401c;

    /* JADX INFO: renamed from: d */
    public VText f81402d;

    /* JADX INFO: renamed from: f */
    public ydo0 f81404f;

    /* JADX INFO: renamed from: e */
    public DialogC12774a f81403e = null;

    /* JADX INFO: renamed from: g */
    public boolean f81405g = false;

    /* JADX INFO: renamed from: h */
    public boolean f81406h = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public /* synthetic */ void m109441i(View view) {
        m109446f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m109442j(View view) {
        if (this.f81405g) {
            return;
        }
        this.f81404f.m215267L3();
        m109446f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m109443k(View view) {
        if (this.f81406h) {
            return;
        }
        this.f81404f.m215268M3();
        m109446f();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f81404f.act();
    }

    /* JADX INFO: renamed from: d */
    public View m109444d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return deo0.m115447b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ydo0 ydo0Var) {
        this.f81404f = ydo0Var;
    }

    /* JADX INFO: renamed from: f */
    public void m109446f() {
        if (NullChecker.m82486a(this.f81403e)) {
            this.f81403e.dismiss();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: l */
    public void m109447l(boolean z, boolean z2) {
        if (this.f81403e == null) {
            View viewM109444d = m109444d(LayoutInflater.from(this.f81404f.act()), null);
            bnl0.m105509E0(this.f81402d, new View.OnClickListener() { // from class: l.zdo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203918a.m109441i(view);
                }
            });
            bnl0.m105509E0(this.f81400b, new View.OnClickListener() { // from class: l.aeo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f70816a.m109442j(view);
                }
            });
            bnl0.m105509E0(this.f81401c, new View.OnClickListener() { // from class: l.beo0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76404a.m109443k(view);
                }
            });
            this.f81403e = new DialogC12774a(act(), viewM109444d);
        }
        this.f81405g = z;
        this.f81406h = z2;
        VText vText = this.f81400b;
        if (z) {
            vText.setTextColor(act().getResources().getColor(n9c0.f140838j1));
            this.f81400b.setText(xau.m209910t(R$string.f48003bj) + xau.m209910t(R$string.f47981aj));
        } else {
            vText.setTextColor(act().getResources().getColor(n9c0.f140823e1));
            this.f81400b.setText(xau.m209910t(R$string.f48003bj));
        }
        VText vText2 = this.f81401c;
        if (z2) {
            vText2.setTextColor(act().getResources().getColor(n9c0.f140838j1));
            this.f81401c.setText(xau.m209910t(R$string.f48025cj) + xau.m209910t(R$string.f47981aj));
        } else {
            vText2.setTextColor(act().getResources().getColor(n9c0.f140823e1));
            this.f81401c.setText(xau.m209910t(R$string.f48025cj));
        }
        this.f81403e.show();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
