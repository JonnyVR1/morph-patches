package p149l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import org.jetbrains.annotations.NotNull;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class egg extends LiveMenuDialogHolder<jgg> {

    /* JADX INFO: renamed from: k */
    public VText f90938k;

    /* JADX INFO: renamed from: l */
    public VEditText f90939l;

    /* JADX INFO: renamed from: m */
    public VText f90940m;

    /* JADX INFO: renamed from: n */
    public boolean f90941n;

    public egg(Act act, @NonNull @NotNull jgg jggVar) {
        super(t6c0.f168558w0, act, jggVar, j2g0.m139460g());
        m71832B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m116276I(View view) {
        T t = this.f47757b;
        if (t != 0) {
            ((jgg) t).m141286V3(this.f90939l.getText().toString());
            this.f90939l.setText("");
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((jgg) this.f47757b).m104249C0();
    }

    /* JADX INFO: renamed from: G */
    public final void m116277G(View view) {
        fgg.m121245a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m116279J() {
        if (this.f90939l == null) {
            return;
        }
        new uqd0("live_fans_recall_content" + qib0.f154713b0.f139230a.userId(), "").put(this.f90939l.getText().toString());
    }

    /* JADX INFO: renamed from: K */
    public void m116280K(boolean z) {
        this.f90941n = z;
        m116281L();
    }

    /* JADX INFO: renamed from: L */
    public final void m116281L() {
        VText vText = this.f90940m;
        if (vText == null || this.f90938k == null) {
            return;
        }
        vText.setText(this.f90941n ? R$string.f46788Kb : R$string.f46810Lb);
        this.f90938k.setText(this.f90941n ? R$string.f47293i3 : R$string.f47314j3);
        uqd0 uqd0Var = new uqd0("live_fans_recall_content" + qib0.f154713b0.f139230a.userId(), "");
        if (TextUtils.isEmpty(uqd0Var.get())) {
            this.f90940m.setEnabled(false);
        } else {
            this.f90939l.setText(uqd0Var.get());
            this.f90940m.setEnabled(true);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m116277G(view);
        m71831A(17);
        m116281L();
        this.f90939l.addTextChangedListener(new C16592a());
        xdl0.m208329E0(this.f90940m, new View.OnClickListener() { // from class: l.dgg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f86080a.m116276I(view2);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jgg jggVar) {
    }

    /* JADX INFO: renamed from: l.egg$a */
    public class C16592a implements TextWatcher {
        public C16592a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() >= 100) {
                lsi0.m151593w(R$string.f46717H6);
            }
            if (editable.length() > 100) {
                editable.delete(100, editable.length());
            }
            int length = editable.length();
            egg eggVar = egg.this;
            if (length != 0) {
                eggVar.f90940m.setEnabled(true);
            } else {
                eggVar.f90940m.setEnabled(false);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
