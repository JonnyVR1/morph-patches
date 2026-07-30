package p149l;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.newui.group.GroupCreateDescriptionAct;
import java.util.Objects;
import p147v.VButton;
import p147v.VEditText;
import p147v.VScroll;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class lck implements s7m<hck>, TextWatcher {

    /* JADX INFO: renamed from: a */
    public VScroll f127421a;

    /* JADX INFO: renamed from: b */
    public VText f127422b;

    /* JADX INFO: renamed from: c */
    public VEditText f127423c;

    /* JADX INFO: renamed from: d */
    public TextView f127424d;

    /* JADX INFO: renamed from: e */
    public VButton f127425e;

    /* JADX INFO: renamed from: f */
    public final GroupCreateDescriptionAct f127426f;

    /* JADX INFO: renamed from: g */
    public hck f127427g;

    /* JADX INFO: renamed from: l.lck$a */
    public static class C18188a {
        /* JADX INFO: renamed from: b */
        public static void m149319b(lck lckVar, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            lckVar.f127421a = (VScroll) viewGroup.getChildAt(0);
            lckVar.f127422b = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            lckVar.f127423c = (VEditText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
            lckVar.f127424d = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(3);
            lckVar.f127425e = (VButton) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m149320c(lck lckVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126488i0, viewGroup, false);
            m149319b(lckVar, viewInflate);
            return viewInflate;
        }
    }

    public lck(GroupCreateDescriptionAct groupCreateDescriptionAct) {
        this.f127426f = groupCreateDescriptionAct;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m149313k() {
        this.f127423c.setFocusable(true);
        this.f127423c.setFocusableInTouchMode(true);
        this.f127423c.requestFocus();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f127426f;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        m149316l();
    }

    /* JADX INFO: renamed from: i */
    public View m149314i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18188a.m149320c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m149314i(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(hck hckVar) {
        this.f127427g = hckVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m149316l() {
        this.f127424d.setText("" + this.f127423c.getText().length() + "/300");
        this.f127427g.m130442t0(this.f127423c.getText().toString());
        this.f127425e.setEnabled(this.f127427g.m130435l0());
    }

    /* JADX INFO: renamed from: r */
    public void m149317r() {
        this.f127426f.setTitle("");
        this.f127423c.setMaxLength(300);
        this.f127423c.removeTextChangedListener(this);
        this.f127423c.addTextChangedListener(this);
        m149316l();
        VButton vButton = this.f127425e;
        final hck hckVar = this.f127427g;
        Objects.requireNonNull(hckVar);
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.ick
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hckVar.m130441s0(view);
            }
        });
        VEditText vEditText = this.f127423c;
        final hck hckVar2 = this.f127427g;
        Objects.requireNonNull(hckVar2);
        xdl0.m208329E0(vEditText, new View.OnClickListener() { // from class: l.jck
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                hckVar2.m130436m0(view);
            }
        });
        this.f127423c.post(new Runnable() { // from class: l.kck
            @Override // java.lang.Runnable
            public final void run() {
                this.f122392a.m149313k();
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
