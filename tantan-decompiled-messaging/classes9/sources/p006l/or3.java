package p006l;

import android.content.Context;
import android.content.Intent;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p000p1.mobile.putong.account.R$string;
import com.p000p1.mobile.putong.account.p002ui.accountnew.loginopt.act.CCodeChooseAct;
import com.tantanapp.common.utils.NullChecker;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zqb;
import org.jetbrains.annotations.NotNull;
import v.VImage;
import v.VRecyclerView;
import v.VSearchBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class or3 extends c3f0<kr3, CCodeChooseAct> {

    /* JADX INFO: renamed from: c */
    public VRecyclerView f18335c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f18336d;

    /* JADX INFO: renamed from: e */
    public VImage f18337e;

    /* JADX INFO: renamed from: f */
    public VImage f18338f;

    /* JADX INFO: renamed from: g */
    public VText f18339g;

    /* JADX INFO: renamed from: h */
    public VText f18340h;

    /* JADX INFO: renamed from: i */
    public View f18341i;

    /* JADX INFO: renamed from: j */
    public VSearchBar f18342j;

    /* JADX INFO: renamed from: k */
    public jr3 f18343k;

    public or3(@NonNull @NotNull CCodeChooseAct cCodeChooseAct) {
        super(cCodeChooseAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m20718p(View view) {
        ((CCodeChooseAct) this.f9323a).onBackPressed();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM20719n = m20719n(layoutInflater, viewGroup);
        m20721r();
        return viewM20719n;
    }

    /* JADX INFO: renamed from: n */
    public View m20719n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pr3.m21657b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m20720q(zqb zqbVar) {
        Intent intent = new Intent();
        intent.putExtra("from", "CcodeChoose");
        intent.putExtra("ccode", zqbVar.b);
        ((CCodeChooseAct) this.f9323a).setResult(-1, intent);
        ((CCodeChooseAct) this.f9323a).finish();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [HoldAct extends com.p1.mobile.putong.app.PutongAct, android.content.Context] */
    /* JADX INFO: renamed from: r */
    public void m20721r() {
        xdl0.E0(this.f18337e, new View.OnClickListener() { // from class: l.lr3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16583a.m20718p(view);
            }
        });
        xdl0.M(this.f18338f, false);
        xdl0.M(this.f18339g, false);
        this.f18340h.setText(R$string.f71I);
        jr3 jr3Var = new jr3(this.f9323a);
        this.f18343k = jr3Var;
        jr3Var.m17786J(new jr3.InterfaceC0900a() { // from class: l.mr3
            @Override // p006l.jr3.InterfaceC0900a
            /* JADX INFO: renamed from: a */
            public final void mo17787a(zqb zqbVar) {
                this.f17191a.m20720q(zqbVar);
            }
        });
        this.f18343k.m17785I(zqb.d);
        this.f18335c.setLayoutManager(new LinearLayoutManager((Context) this.f9323a, 1, false));
        this.f18335c.setAdapter(this.f18343k);
        this.f18342j.d(new C1100a());
    }

    /* JADX INFO: renamed from: s */
    public final boolean m20722s(String str, zqb zqbVar) {
        StringBuilder sb = new StringBuilder("+");
        sb.append(zqbVar.b);
        return ((CCodeChooseAct) this.f9323a).getResources().getString(zqbVar.a).contains(str) || sb.toString().contains(str);
    }

    /* JADX INFO: renamed from: l.or3$a */
    public class C1100a implements TextWatcher {
        public C1100a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!NullChecker.a(editable)) {
                or3.this.f18343k.m17785I(zqb.d);
                return;
            }
            final String strTrim = editable.toString().trim();
            boolean zIsEmpty = TextUtils.isEmpty(strTrim);
            or3 or3Var = or3.this;
            if (zIsEmpty) {
                or3Var.f18343k.m17785I(zqb.d);
            } else {
                or3Var.f18343k.m17785I(vwb.n(zqb.d, new w9j() { // from class: l.nr3
                    public final Object call(Object obj) {
                        return this.f17812a.m20724b(strTrim, (zqb) obj);
                    }
                }));
            }
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Boolean m20724b(String str, zqb zqbVar) {
            return Boolean.valueOf(or3.this.m20722s(str, zqbVar));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
