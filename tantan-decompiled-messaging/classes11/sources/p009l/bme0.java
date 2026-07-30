package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import l.cme0;
import l.e30;
import l.e51;
import l.mkd0;
import l.s7m;
import l.xdl0;
import v.VButton_FakeShadow;
import v.VMaterialEdit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class bme0 implements s7m<xle0> {

    /* JADX INFO: renamed from: a */
    public TextView f10187a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit f10188b;

    /* JADX INFO: renamed from: c */
    public ImageView f10189c;

    /* JADX INFO: renamed from: d */
    public VButton_FakeShadow f10190d;

    /* JADX INFO: renamed from: e */
    public xle0 f10191e;

    /* JADX INFO: renamed from: f */
    public PutongAct f10192f;

    /* JADX INFO: renamed from: g */
    public String f10193g;

    public bme0(PutongAct putongAct) {
        this.f10192f = putongAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m12129j() {
        this.f10188b.requestFocus();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m12130k(CharSequence charSequence) {
        this.f10193g = charSequence.toString();
        this.f10188b.setError(this.f10191e.m24944s0(charSequence.toString()));
        this.f10191e.m24943r0(this.f10193g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m12131l(View view) {
        this.f10191e.m24937l0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12132C0() {
        return this.f10192f;
    }

    @Nullable
    public Act act() {
        return this.f10192f;
    }

    /* JADX INFO: renamed from: d */
    public View m12133d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cme0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void m12137i1(xle0 xle0Var) {
        this.f10191e = xle0Var;
    }

    /* JADX INFO: renamed from: f */
    public View m12135f() {
        return this.f10188b;
    }

    /* JADX INFO: renamed from: i */
    public void m12136i(String str) {
        this.f10193g = str;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m12133d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m */
    public void m12138m() {
        this.f10190d.setActivated(this.f10188b.getError() != null);
        this.f10190d.setClickable(this.f10188b.getError() == null);
    }

    /* JADX INFO: renamed from: r */
    public void m12139r() {
        e51.G(new Runnable() { // from class: l.yle0
            @Override // java.lang.Runnable
            public final void run() {
                this.f23137a.m12129j();
            }
        });
        this.f10188b.setText(this.f10193g);
        this.f10188b.setSelection(this.f10193g.length());
        this.f10188b.H().subscribe(mkd0.G(new e30() { // from class: l.zle0
            public final void call(Object obj) {
                this.f23730a.m12130k((CharSequence) obj);
            }
        }));
        xdl0.E0(this.f10190d, new View.OnClickListener() { // from class: l.ame0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9575a.m12131l(view);
            }
        });
    }

    public void destroy() {
    }
}
