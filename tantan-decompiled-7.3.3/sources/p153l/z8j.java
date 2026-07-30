package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class z8j extends g1e {

    /* JADX INFO: renamed from: j */
    public ImageView f203373j;

    /* JADX INFO: renamed from: k */
    public ImageView f203374k;

    /* JADX INFO: renamed from: l */
    public TextView f203375l;

    /* JADX INFO: renamed from: m */
    public TextView f203376m;

    /* JADX INFO: renamed from: n */
    public TextView f203377n;

    /* JADX INFO: renamed from: o */
    public TextView f203378o;

    /* JADX INFO: renamed from: p */
    public TextView f203379p;

    /* JADX INFO: renamed from: q */
    public View f203380q;

    /* JADX INFO: renamed from: r */
    public C21778a f203381r;

    /* JADX INFO: renamed from: l.z8j$a */
    public static class C21778a {

        /* JADX INFO: renamed from: a */
        public Context f203382a;

        /* JADX INFO: renamed from: b */
        @DrawableRes
        public int f203383b = -1;

        /* JADX INFO: renamed from: c */
        @DrawableRes
        public int f203384c = -1;

        /* JADX INFO: renamed from: d */
        public String f203385d;

        /* JADX INFO: renamed from: e */
        public CharSequence f203386e;

        /* JADX INFO: renamed from: f */
        public String f203387f;

        /* JADX INFO: renamed from: g */
        public String f203388g;

        /* JADX INFO: renamed from: h */
        public String f203389h;

        /* JADX INFO: renamed from: i */
        public x20 f203390i;

        /* JADX INFO: renamed from: j */
        public x20 f203391j;

        /* JADX INFO: renamed from: k */
        public x20 f203392k;

        public C21778a(Context context) {
            this.f203382a = context;
        }

        /* JADX INFO: renamed from: l */
        public C21778a m218989l(int i) {
            this.f203383b = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C21778a m218990m(String str) {
            this.f203387f = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C21778a m218991n(String str, x20 x20Var) {
            this.f203389h = str;
            this.f203391j = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C21778a m218992o(String str, x20 x20Var) {
            this.f203388g = str;
            this.f203390i = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C21778a m218993p(x20 x20Var) {
            this.f203392k = x20Var;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C21778a m218994q(int i) {
            this.f203384c = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C21778a m218995r(CharSequence charSequence) {
            this.f203386e = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C21778a m218996s(String str) {
            this.f203385d = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public z8j m218997t() {
            z8j z8jVar = new z8j(this);
            z8jVar.show();
            return z8jVar;
        }
    }

    public z8j(C21778a c21778a) {
        super(c21778a.f203382a, false, m218972I());
        setCanceledOnTouchOutside(false);
        this.f203381r = c21778a;
    }

    /* JADX INFO: renamed from: I */
    private static int m218972I() {
        return bnl0.m105592y0() >= 1080 ? tgc0.f174064j : tgc0.f174063i;
    }

    /* JADX INFO: renamed from: J */
    private void m218973J() {
        if (this.f203381r.f203383b != -1) {
            this.f203373j.setImageResource(this.f203381r.f203383b);
        }
        if (this.f203381r.f203384c != -1) {
            this.f203374k.setImageResource(this.f203381r.f203384c);
        }
        if (!TextUtils.isEmpty(this.f203381r.f203385d)) {
            this.f203375l.setText(this.f203381r.f203385d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f203381r.f203386e);
        TextView textView = this.f203376m;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.f203381r.f203386e);
        }
        if (!TextUtils.isEmpty(this.f203381r.f203388g)) {
            this.f203377n.setText(this.f203381r.f203388g);
            this.f203377n.setOnClickListener(new View.OnClickListener() { // from class: l.w8j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f187859a.m218974K(view);
                }
            });
        }
        if (!TextUtils.isEmpty(this.f203381r.f203389h)) {
            this.f203378o.setText(this.f203381r.f203389h);
            this.f203378o.setOnClickListener(new View.OnClickListener() { // from class: l.x8j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f192852a.m218975L(view);
                }
            });
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f203381r.f203387f);
        TextView textView2 = this.f203379p;
        if (zIsEmpty2) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.f203381r.f203387f);
        }
        m128500x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.y8j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f198007a.m218976M(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m218974K(View view) {
        if (NullChecker.m82486a(this.f203381r.f203390i)) {
            this.f203381r.f203390i.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m218975L(View view) {
        if (NullChecker.m82486a(this.f203381r.f203391j)) {
            this.f203381r.f203391j.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m218976M(DialogInterface dialogInterface) {
        if (NullChecker.m82486a(this.f203381r.f203392k)) {
            this.f203381r.f203392k.call();
        }
    }

    /* JADX INFO: renamed from: H */
    public View m218977H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a9j.m96597b(this, layoutInflater, viewGroup);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM218977H = m218977H(p9r.m171370a(this.f203381r.f203382a), null);
        this.f203380q = viewM218977H;
        setContentView(viewM218977H);
        m218973J();
    }
}
