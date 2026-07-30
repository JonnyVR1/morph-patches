package p149l;

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
import com.p046p1.mobile.putong.account.R$string;
import com.p046p1.mobile.putong.account.p050ui.accountnew.loginopt.act.CCodeChooseAct;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VSearchBar;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class or3 extends c3f0<kr3, CCodeChooseAct> {

    /* JADX INFO: renamed from: c */
    public VRecyclerView f145221c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f145222d;

    /* JADX INFO: renamed from: e */
    public VImage f145223e;

    /* JADX INFO: renamed from: f */
    public VImage f145224f;

    /* JADX INFO: renamed from: g */
    public VText f145225g;

    /* JADX INFO: renamed from: h */
    public VText f145226h;

    /* JADX INFO: renamed from: i */
    public View f145227i;

    /* JADX INFO: renamed from: j */
    public VSearchBar f145228j;

    /* JADX INFO: renamed from: k */
    public jr3 f145229k;

    public or3(@NonNull @NotNull CCodeChooseAct cCodeChooseAct) {
        super(cCodeChooseAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m165515p(View view) {
        ((CCodeChooseAct) this.f78941a).onBackPressed();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM165516n = m165516n(layoutInflater, viewGroup);
        m165518r();
        return viewM165516n;
    }

    /* JADX INFO: renamed from: n */
    public View m165516n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pr3.m170988b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m165517q(zqb zqbVar) {
        Intent intent = new Intent();
        intent.putExtra("from", "CcodeChoose");
        intent.putExtra("ccode", zqbVar.f204372b);
        ((CCodeChooseAct) this.f78941a).setResult(-1, intent);
        ((CCodeChooseAct) this.f78941a).m50458m2();
    }

    /* JADX INFO: renamed from: r */
    public void m165518r() {
        xdl0.m208329E0(this.f145223e, new View.OnClickListener() { // from class: l.lr3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129461a.m165515p(view);
            }
        });
        xdl0.m208344M(this.f145224f, false);
        xdl0.m208344M(this.f145225g, false);
        this.f145226h.setText(R$string.f16082I);
        jr3 jr3Var = new jr3(this.f78941a);
        this.f145229k = jr3Var;
        jr3Var.m142916J(new jr3.InterfaceC17848a() { // from class: l.mr3
            @Override // p149l.jr3.InterfaceC17848a
            /* JADX INFO: renamed from: a */
            public final void mo142917a(zqb zqbVar) {
                this.f135328a.m165517q(zqbVar);
            }
        });
        this.f145229k.m142915I(zqb.f204369d);
        this.f145221c.setLayoutManager(new LinearLayoutManager(this.f78941a, 1, false));
        this.f145221c.setAdapter(this.f145229k);
        this.f145228j.m223200d(new C19004a());
    }

    /* JADX INFO: renamed from: s */
    public final boolean m165519s(String str, zqb zqbVar) {
        StringBuilder sb = new StringBuilder(Marker.ANY_NON_NULL_MARKER);
        sb.append(zqbVar.f204372b);
        return ((CCodeChooseAct) this.f78941a).getResources().getString(zqbVar.f204371a).contains(str) || sb.toString().contains(str);
    }

    /* JADX INFO: renamed from: l.or3$a */
    public class C19004a implements TextWatcher {
        public C19004a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!NullChecker.m81303a(editable)) {
                or3.this.f145229k.m142915I(zqb.f204369d);
                return;
            }
            final String strTrim = editable.toString().trim();
            boolean zIsEmpty = TextUtils.isEmpty(strTrim);
            or3 or3Var = or3.this;
            if (zIsEmpty) {
                or3Var.f145229k.m142915I(zqb.f204369d);
            } else {
                or3Var.f145229k.m142915I(vwb.m200339n(zqb.f204369d, new w9j() { // from class: l.nr3
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f140130a.m165521b(strTrim, (zqb) obj);
                    }
                }));
            }
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Boolean m165521b(String str, zqb zqbVar) {
            return Boolean.valueOf(or3.this.m165519s(str, zqbVar));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
