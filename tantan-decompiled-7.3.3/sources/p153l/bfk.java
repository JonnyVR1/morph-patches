package p153l;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.group.GroupCreateDescriptionAct;
import java.util.Objects;
import p151v.VButton;
import p151v.VEditText;
import p151v.VScroll;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class bfk implements iam<xek>, TextWatcher {

    /* JADX INFO: renamed from: a */
    public VScroll f76513a;

    /* JADX INFO: renamed from: b */
    public VText f76514b;

    /* JADX INFO: renamed from: c */
    public VEditText f76515c;

    /* JADX INFO: renamed from: d */
    public TextView f76516d;

    /* JADX INFO: renamed from: e */
    public VButton f76517e;

    /* JADX INFO: renamed from: f */
    public final GroupCreateDescriptionAct f76518f;

    /* JADX INFO: renamed from: g */
    public xek f76519g;

    /* JADX INFO: renamed from: l.bfk$a */
    public static class C15979a {
        /* JADX INFO: renamed from: b */
        public static void m103925b(bfk bfkVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            bfkVar.f76513a = (VScroll) viewGroup.getChildAt(0);
            bfkVar.f76514b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            bfkVar.f76515c = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            bfkVar.f76516d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
            bfkVar.f76517e = (VButton) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m103926c(bfk bfkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157044i0, viewGroup, false);
            m103925b(bfkVar, viewInflate);
            return viewInflate;
        }
    }

    public bfk(GroupCreateDescriptionAct groupCreateDescriptionAct) {
        this.f76518f = groupCreateDescriptionAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m103919k() {
        this.f76515c.setFocusable(true);
        this.f76515c.setFocusableInTouchMode(true);
        this.f76515c.requestFocus();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f76518f;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m103922l();
    }

    /* JADX INFO: renamed from: i */
    public View m103920i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C15979a.m103926c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m103920i(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xek xekVar) {
        this.f76519g = xekVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m103922l() {
        this.f76516d.setText("" + this.f76515c.getText().length() + "/300");
        this.f76519g.m210722t0(this.f76515c.getText().toString());
        this.f76517e.setEnabled(this.f76519g.m210715l0());
    }

    /* JADX INFO: renamed from: r */
    public void m103923r() {
        this.f76518f.setTitle("");
        this.f76515c.setMaxLength(300);
        this.f76515c.removeTextChangedListener(this);
        this.f76515c.addTextChangedListener(this);
        m103922l();
        VButton vButton = this.f76517e;
        final xek xekVar = this.f76519g;
        Objects.requireNonNull(xekVar);
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.yek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xekVar.m210721s0(view);
            }
        });
        VEditText vEditText = this.f76515c;
        final xek xekVar2 = this.f76519g;
        Objects.requireNonNull(xekVar2);
        bnl0.m105509E0(vEditText, new View.OnClickListener() { // from class: l.zek
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xekVar2.m210716m0(view);
            }
        });
        this.f76515c.post(new Runnable() { // from class: l.afk
            @Override // java.lang.Runnable
            public final void run() {
                this.f70919a.m103919k();
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
