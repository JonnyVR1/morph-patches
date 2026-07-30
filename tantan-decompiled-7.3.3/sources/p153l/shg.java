package p153l;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import org.jetbrains.annotations.NotNull;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class shg extends LiveMenuDialogHolder<xhg> {

    /* JADX INFO: renamed from: k */
    public VText f168702k;

    /* JADX INFO: renamed from: l */
    public VEditText f168703l;

    /* JADX INFO: renamed from: m */
    public VText f168704m;

    /* JADX INFO: renamed from: n */
    public boolean f168705n;

    public shg(Act act, @NonNull @NotNull xhg xhgVar) {
        super(yec0.f199290w0, act, xhgVar, qag0.m175926g());
        m73015B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m185863I(View view) {
        T t = this.f48605b;
        if (t != 0) {
            ((xhg) t).m211039V3(this.f168703l.getText().toString());
            this.f168703l.setText("");
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return ((xhg) this.f48605b).m113230C0();
    }

    /* JADX INFO: renamed from: G */
    public final void m185864G(View view) {
        thg.m191239a(this, view);
    }

    /* JADX INFO: renamed from: J */
    public void m185866J() {
        if (this.f168703l == null) {
            return;
        }
        new wyd0("live_fans_recall_content" + uqb0.f180396b0.f170324a.userId(), "").put(this.f168703l.getText().toString());
    }

    /* JADX INFO: renamed from: K */
    public void m185867K(boolean z) {
        this.f168705n = z;
        m185868L();
    }

    /* JADX INFO: renamed from: L */
    public final void m185868L() {
        VText vText = this.f168704m;
        if (vText == null || this.f168702k == null) {
            return;
        }
        vText.setText(this.f168705n ? R$string.f47636Kb : R$string.f47658Lb);
        this.f168702k.setText(this.f168705n ? R$string.f48141i3 : R$string.f48162j3);
        wyd0 wyd0Var = new wyd0("live_fans_recall_content" + uqb0.f180396b0.f170324a.userId(), "");
        if (TextUtils.isEmpty(wyd0Var.get())) {
            this.f168704m.setEnabled(false);
        } else {
            this.f168703l.setText(wyd0Var.get());
            this.f168704m.setEnabled(true);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m185864G(view);
        m73014A(17);
        m185868L();
        this.f168703l.addTextChangedListener(new C20045a());
        bnl0.m105509E0(this.f168704m, new View.OnClickListener() { // from class: l.rhg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f163162a.m185863I(view2);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xhg xhgVar) {
    }

    /* JADX INFO: renamed from: l.shg$a */
    public class C20045a implements TextWatcher {
        public C20045a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (editable.length() >= 100) {
                o1j0.m165649w(R$string.f47565H6);
            }
            if (editable.length() > 100) {
                editable.delete(100, editable.length());
            }
            int length = editable.length();
            shg shgVar = shg.this;
            if (length != 0) {
                shgVar.f168704m.setEnabled(true);
            } else {
                shgVar.f168704m.setEnabled(false);
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
