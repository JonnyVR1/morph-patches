package p153l;

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
import com.p051p1.mobile.putong.account.R$string;
import com.p051p1.mobile.putong.account.p055ui.accountnew.loginopt.act.CCodeChooseAct;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Marker;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VSearchBar;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class ns3 extends jbf0<js3, CCodeChooseAct> {

    /* JADX INFO: renamed from: c */
    public VRecyclerView f143457c;

    /* JADX INFO: renamed from: d */
    public ConstraintLayout f143458d;

    /* JADX INFO: renamed from: e */
    public VImage f143459e;

    /* JADX INFO: renamed from: f */
    public VImage f143460f;

    /* JADX INFO: renamed from: g */
    public VText f143461g;

    /* JADX INFO: renamed from: h */
    public VText f143462h;

    /* JADX INFO: renamed from: i */
    public View f143463i;

    /* JADX INFO: renamed from: j */
    public VSearchBar f143464j;

    /* JADX INFO: renamed from: k */
    public is3 f143465k;

    public ns3(@NonNull @NotNull CCodeChooseAct cCodeChooseAct) {
        super(cCodeChooseAct);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m164546p(View view) {
        ((CCodeChooseAct) this.f119872a).onBackPressed();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM164547n = m164547n(layoutInflater, viewGroup);
        m164549r();
        return viewM164547n;
    }

    /* JADX INFO: renamed from: n */
    public View m164547n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return os3.m168958b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m164548q(nsb nsbVar) {
        Intent intent = new Intent();
        intent.putExtra("from", "CcodeChoose");
        intent.putExtra("ccode", nsbVar.f143479b);
        ((CCodeChooseAct) this.f119872a).setResult(-1, intent);
        ((CCodeChooseAct) this.f119872a).m51642n2();
    }

    /* JADX INFO: renamed from: r */
    public void m164549r() {
        bnl0.m105509E0(this.f143459e, new View.OnClickListener() { // from class: l.ks3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128525a.m164546p(view);
            }
        });
        bnl0.m105524M(this.f143460f, false);
        bnl0.m105524M(this.f143461g, false);
        this.f143462h.setText(R$string.f16801I);
        is3 is3Var = new is3(this.f119872a);
        this.f143465k = is3Var;
        is3Var.m141861J(new is3.InterfaceC17788a() { // from class: l.ls3
            @Override // p153l.is3.InterfaceC17788a
            /* JADX INFO: renamed from: a */
            public final void mo141862a(nsb nsbVar) {
                this.f133387a.m164548q(nsbVar);
            }
        });
        this.f143465k.m141860I(nsb.f143476d);
        this.f143457c.setLayoutManager(new LinearLayoutManager(this.f119872a, 1, false));
        this.f143457c.setAdapter(this.f143465k);
        this.f143464j.m224446d(new C18937a());
    }

    /* JADX INFO: renamed from: s */
    public final boolean m164550s(String str, nsb nsbVar) {
        StringBuilder sb = new StringBuilder(Marker.ANY_NON_NULL_MARKER);
        sb.append(nsbVar.f143479b);
        return ((CCodeChooseAct) this.f119872a).getResources().getString(nsbVar.f143478a).contains(str) || sb.toString().contains(str);
    }

    /* JADX INFO: renamed from: l.ns3$a */
    public class C18937a implements TextWatcher {
        public C18937a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            if (!NullChecker.m82486a(editable)) {
                ns3.this.f143465k.m141860I(nsb.f143476d);
                return;
            }
            final String strTrim = editable.toString().trim();
            boolean zIsEmpty = TextUtils.isEmpty(strTrim);
            ns3 ns3Var = ns3.this;
            if (zIsEmpty) {
                ns3Var.f143465k.m141860I(nsb.f143476d);
            } else {
                ns3Var.f143465k.m141860I(jyb.m147522n(nsb.f143476d, new qcj() { // from class: l.ms3
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f138440a.m164552b(strTrim, (nsb) obj);
                    }
                }));
            }
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Boolean m164552b(String str, nsb nsbVar) {
            return Boolean.valueOf(ns3.this.m164550s(str, nsbVar));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
