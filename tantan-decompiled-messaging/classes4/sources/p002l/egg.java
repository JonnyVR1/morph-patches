package p002l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import l.lsi0;
import l.qib0;
import l.uqd0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class egg extends LiveMenuDialogHolder<jgg> {

    /* JADX INFO: renamed from: k */
    public VText f9762k;

    /* JADX INFO: renamed from: l */
    public VEditText f9763l;

    /* JADX INFO: renamed from: m */
    public VText f9764m;

    /* JADX INFO: renamed from: n */
    public boolean f9765n;

    public egg(Act act, @NonNull @NotNull jgg jggVar) {
        super(t6c0.f20054w0, act, jggVar, j2g0.m15581g());
        m5208B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m12512I(View view) {
        T t = this.f3799b;
        if (t != 0) {
            ((jgg) t).m15905V3(this.f9763l.getText().toString());
            this.f9763l.setText("");
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return ((jgg) this.f3799b).C0();
    }

    /* JADX INFO: renamed from: G */
    public final void m12513G(View view) {
        fgg.m13171a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m12515J() {
        if (this.f9763l == null) {
            return;
        }
        new uqd0("live_fans_recall_content" + qib0.b0.a.userId(), "").put(this.f9763l.getText().toString());
    }

    /* JADX INFO: renamed from: K */
    public void m12516K(boolean z) {
        this.f9765n = z;
        m12517L();
    }

    /* JADX INFO: renamed from: L */
    public final void m12517L() {
        VText vText = this.f9764m;
        if (vText == null || this.f9762k == null) {
            return;
        }
        vText.setText(this.f9765n ? R$string.f2830Kb : R$string.f2852Lb);
        this.f9762k.setText(this.f9765n ? R$string.f3335i3 : R$string.f3356j3);
        uqd0 uqd0Var = new uqd0("live_fans_recall_content" + qib0.b0.a.userId(), "");
        if (TextUtils.isEmpty((CharSequence) uqd0Var.get())) {
            this.f9764m.setEnabled(false);
        } else {
            this.f9763l.setText((CharSequence) uqd0Var.get());
            this.f9764m.setEnabled(true);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m12513G(view);
        m5207A(17);
        m12517L();
        this.f9763l.addTextChangedListener(new C0544a());
        xdl0.E0(this.f9764m, new View.OnClickListener() { // from class: l.dgg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9221a.m12512I(view2);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(jgg jggVar) {
    }

    /* JADX INFO: renamed from: l.egg$a */
    public class C0544a implements TextWatcher {
        public C0544a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() >= 100) {
                lsi0.w(R$string.f2759H6);
            }
            if (editable.length() > 100) {
                editable.delete(100, editable.length());
            }
            int length = editable.length();
            egg eggVar = egg.this;
            if (length != 0) {
                eggVar.f9764m.setEnabled(true);
            } else {
                eggVar.f9764m.setEnabled(false);
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
