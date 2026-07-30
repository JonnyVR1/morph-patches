package p009l;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.group.GroupCreateDescriptionAct;
import java.util.Objects;
import l.l6c0;
import l.s7m;
import l.xdl0;
import v.VButton;
import v.VEditText;
import v.VScroll;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lck implements s7m<hck>, TextWatcher {

    /* JADX INFO: renamed from: a */
    public VScroll f16072a;

    /* JADX INFO: renamed from: b */
    public VText f16073b;

    /* JADX INFO: renamed from: c */
    public VEditText f16074c;

    /* JADX INFO: renamed from: d */
    public TextView f16075d;

    /* JADX INFO: renamed from: e */
    public VButton f16076e;

    /* JADX INFO: renamed from: f */
    public final GroupCreateDescriptionAct f16077f;

    /* JADX INFO: renamed from: g */
    public hck f16078g;

    /* JADX INFO: renamed from: l.lck$a */
    public static class C1008a {
        /* JADX INFO: renamed from: b */
        public static void m17827b(lck lckVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            lckVar.f16072a = viewGroup.getChildAt(0);
            lckVar.f16073b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            lckVar.f16074c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            lckVar.f16075d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
            lckVar.f16076e = viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m17828c(lck lckVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.i0, viewGroup, false);
            m17827b(lckVar, viewInflate);
            return viewInflate;
        }
    }

    public lck(GroupCreateDescriptionAct groupCreateDescriptionAct) {
        this.f16077f = groupCreateDescriptionAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m17819k() {
        this.f16074c.setFocusable(true);
        this.f16074c.setFocusableInTouchMode(true);
        this.f16074c.requestFocus();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17820C0() {
        return this.f16077f;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m17824l();
    }

    /* JADX INFO: renamed from: i */
    public View m17821i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C1008a.m17828c(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m17821i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m17822i1(hck hckVar) {
        this.f16078g = hckVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m17824l() {
        this.f16075d.setText("" + this.f16074c.getText().length() + "/300");
        this.f16078g.m15552t0(this.f16074c.getText().toString());
        this.f16076e.setEnabled(this.f16078g.m15545l0());
    }

    /* JADX INFO: renamed from: r */
    public void m17825r() {
        this.f16077f.setTitle("");
        this.f16074c.setMaxLength(300);
        this.f16074c.removeTextChangedListener(this);
        this.f16074c.addTextChangedListener(this);
        m17824l();
        VButton vButton = this.f16076e;
        final hck hckVar = this.f16078g;
        Objects.requireNonNull(hckVar);
        xdl0.E0(vButton, new View.OnClickListener() { // from class: l.ick
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hckVar.m15551s0(view);
            }
        });
        VEditText vEditText = this.f16074c;
        final hck hckVar2 = this.f16078g;
        Objects.requireNonNull(hckVar2);
        xdl0.E0(vEditText, new View.OnClickListener() { // from class: l.jck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hckVar2.m15546m0(view);
            }
        });
        this.f16074c.post(new Runnable() { // from class: l.kck
            @Override // java.lang.Runnable
            public final void run() {
                this.f15602a.m17819k();
            }
        });
    }

    public void destroy() {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
