package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;

/* JADX INFO: loaded from: classes11.dex */
public class bme0 implements s7m<xle0> {

    /* JADX INFO: renamed from: a */
    public TextView f76274a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit f76275b;

    /* JADX INFO: renamed from: c */
    public ImageView f76276c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f76277d;

    /* JADX INFO: renamed from: e */
    public xle0 f76278e;

    /* JADX INFO: renamed from: f */
    public PutongAct f76279f;

    /* JADX INFO: renamed from: g */
    public String f76280g;

    public bme0(PutongAct putongAct) {
        this.f76279f = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m102645j() {
        this.f76275b.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m102646k(CharSequence charSequence) {
        this.f76280g = charSequence.toString();
        this.f76275b.setError(this.f76278e.m209886s0(charSequence.toString()));
        this.f76278e.m209885r0(this.f76280g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m102647l(View view) {
        this.f76278e.m209879l0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f76279f;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f76279f;
    }

    /* JADX INFO: renamed from: d */
    public View m102648d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cme0.m107615b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(xle0 xle0Var) {
        this.f76278e = xle0Var;
    }

    /* JADX INFO: renamed from: f */
    public View m102650f() {
        return this.f76275b;
    }

    /* JADX INFO: renamed from: i */
    public void m102651i(String str) {
        this.f76280g = str;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m102648d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public void m102652m() {
        this.f76277d.setActivated(this.f76275b.getError() != null);
        this.f76277d.setClickable(this.f76275b.getError() == null);
    }

    /* JADX INFO: renamed from: r */
    public void m102653r() {
        e51.m114742G(new Runnable() { // from class: l.yle0
            @Override // java.lang.Runnable
            public final void run() {
                this.f198878a.m102645j();
            }
        });
        this.f76275b.setText(this.f76280g);
        this.f76275b.setSelection(this.f76280g.length());
        this.f76275b.m223127H().subscribe(mkd0.m154955G(new e30() { // from class: l.zle0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f203628a.m102646k((CharSequence) obj);
            }
        }));
        xdl0.m208329E0(this.f76277d, new View.OnClickListener() { // from class: l.ame0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70593a.m102647l(view);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
