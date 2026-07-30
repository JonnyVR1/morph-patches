package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;

/* JADX INFO: loaded from: classes11.dex */
public class gue0 implements iam<cue0> {

    /* JADX INFO: renamed from: a */
    public TextView f106488a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit f106489b;

    /* JADX INFO: renamed from: c */
    public ImageView f106490c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f106491d;

    /* JADX INFO: renamed from: e */
    public cue0 f106492e;

    /* JADX INFO: renamed from: f */
    public PutongAct f106493f;

    /* JADX INFO: renamed from: g */
    public String f106494g;

    public gue0(PutongAct putongAct) {
        this.f106493f = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m132282j() {
        this.f106489b.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m132283k(CharSequence charSequence) {
        this.f106494g = charSequence.toString();
        this.f106489b.setError(this.f106492e.m112682s0(charSequence.toString()));
        this.f106492e.m112681r0(this.f106494g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m132284l(View view) {
        this.f106492e.m112675l0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f106493f;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f106493f;
    }

    /* JADX INFO: renamed from: d */
    public View m132285d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hue0.m137170b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cue0 cue0Var) {
        this.f106492e = cue0Var;
    }

    /* JADX INFO: renamed from: f */
    public View m132287f() {
        return this.f106489b;
    }

    /* JADX INFO: renamed from: i */
    public void m132288i(String str) {
        this.f106494g = str;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m132285d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public void m132289m() {
        this.f106491d.setActivated(this.f106489b.getError() != null);
        this.f106491d.setClickable(this.f106489b.getError() == null);
    }

    /* JADX INFO: renamed from: r */
    public void m132290r() {
        l51.m152887G(new Runnable() { // from class: l.due0
            @Override // java.lang.Runnable
            public final void run() {
                this.f90791a.m132282j();
            }
        });
        this.f106489b.setText(this.f106494g);
        this.f106489b.setSelection(this.f106494g.length());
        this.f106489b.m224373H().subscribe(psd0.m173596G(new y20() { // from class: l.eue0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95858a.m132283k((CharSequence) obj);
            }
        }));
        bnl0.m105509E0(this.f106491d, new View.OnClickListener() { // from class: l.fue0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100903a.m132284l(view);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
