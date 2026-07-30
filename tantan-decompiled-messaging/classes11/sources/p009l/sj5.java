package p009l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import l.cwf0;
import l.d30;
import l.j760;
import l.qib0;
import l.tj5;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class sj5 extends inf {

    /* JADX INFO: renamed from: h */
    public View f20286h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f20287i;

    /* JADX INFO: renamed from: j */
    public ImageView f20288j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f20289k;

    /* JADX INFO: renamed from: l */
    public TextView f20290l;

    /* JADX INFO: renamed from: m */
    public TextView f20291m;

    /* JADX INFO: renamed from: n */
    public TextView f20292n;

    /* JADX INFO: renamed from: o */
    public Act f20293o;

    /* JADX INFO: renamed from: p */
    public cwf0 f20294p;

    /* JADX INFO: renamed from: q */
    public final C1191a f20295q;

    /* JADX INFO: renamed from: l.sj5$a */
    public static class C1191a {

        /* JADX INFO: renamed from: a */
        public Act f20296a;

        /* JADX INFO: renamed from: b */
        public String f20297b;

        /* JADX INFO: renamed from: c */
        public CharSequence f20298c;

        /* JADX INFO: renamed from: d */
        public CharSequence f20299d;

        /* JADX INFO: renamed from: e */
        public String f20300e;

        /* JADX INFO: renamed from: f */
        public View.OnClickListener f20301f;

        /* JADX INFO: renamed from: g */
        public d30 f20302g;

        /* JADX INFO: renamed from: h */
        public CharSequence f20303h;

        /* JADX INFO: renamed from: i */
        public boolean f20304i;

        /* JADX INFO: renamed from: j */
        public boolean f20305j;

        /* JADX INFO: renamed from: k */
        public int f20306k;

        /* JADX INFO: renamed from: l */
        public int f20307l;

        /* JADX INFO: renamed from: m */
        public j760[] f20308m;

        public C1191a(Act act) {
            this.f20296a = act;
        }

        /* JADX INFO: renamed from: a */
        public sj5 m22217a() {
            return new sj5(this);
        }

        /* JADX INFO: renamed from: b */
        public C1191a m22218b(boolean z) {
            this.f20305j = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C1191a m22219c(View.OnClickListener onClickListener) {
            this.f20301f = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C1191a m22220d(j760... j760VarArr) {
            this.f20308m = j760VarArr;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C1191a m22221e(String str) {
            this.f20297b = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C1191a m22222f(String str) {
            this.f20300e = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C1191a m22223g(int i, int i2) {
            this.f20306k = i;
            this.f20307l = i2;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C1191a m22224h(CharSequence charSequence) {
            this.f20303h = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C1191a m22225i(boolean z) {
            this.f20304i = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C1191a m22226j(CharSequence charSequence) {
            this.f20299d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C1191a m22227k(CharSequence charSequence) {
            this.f20298c = charSequence;
            return this;
        }
    }

    public sj5(C1191a c1191a) {
        super(c1191a.f20296a);
        this.f20295q = c1191a;
        m22207H(c1191a.f20296a);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m22202A(View view) {
    }

    /* JADX INFO: renamed from: G */
    private String m22206G() {
        return !TextUtils.isEmpty(this.f20295q.f20297b) ? this.f20295q.f20297b : sj5.class.getSimpleName();
    }

    /* JADX INFO: renamed from: H */
    private void m22207H(Context context) {
        this.f20293o = xdl0.D(context);
        setContentView(m22215F(LayoutInflater.from(context), null));
        setCancelable(false);
        if (this.f20294p == null) {
            this.f20294p = i0e.m16062c(m22206G(), sj5.class.getSimpleName());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    private void m22208I() {
        int i;
        this.f20290l.setText(this.f20295q.f20298c);
        boolean zIsEmpty = TextUtils.isEmpty(this.f20295q.f20299d);
        TextView textView = this.f20291m;
        if (zIsEmpty) {
            xdl0.M(textView, false);
        } else {
            textView.setText(this.f20295q.f20299d);
        }
        if (!TextUtils.isEmpty(this.f20295q.f20303h)) {
            this.f20292n.setText(this.f20295q.f20303h);
        }
        if (this.f20295q.f20305j) {
            xdl0.E0(this.f20287i, new View.OnClickListener() { // from class: l.nj5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sj5.m22202A(view);
                }
            });
            xdl0.E0(this.f20286h, new View.OnClickListener() { // from class: l.oj5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18100a.m22209J(view);
                }
            });
        }
        xdl0.M0(this.f20288j, !this.f20295q.f20304i);
        C1191a c1191a = this.f20295q;
        if (c1191a.f20307l != 0 && (i = c1191a.f20306k) != 0) {
            xdl0.D0(i, new View[]{this.f20289k});
            xdl0.C0(this.f20289k, this.f20295q.f20307l);
        }
        if (TextUtils.isEmpty(this.f20295q.f20300e)) {
            xdl0.M(this.f20289k, false);
        } else {
            qib0.G.L0(this.f20289k, this.f20295q.f20300e);
        }
        xdl0.E0(this.f20292n, new View.OnClickListener() { // from class: l.pj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18732a.m22210K(view);
            }
        });
        xdl0.E0(this.f20288j, new View.OnClickListener() { // from class: l.qj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19340a.m22211L(view);
            }
        });
        if (this.f20295q.f20302g != null) {
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rj5
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f19862a.m22212M(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m22209J(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m22210K(View view) {
        View.OnClickListener onClickListener = this.f20295q.f20301f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m22211L(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m22212M(DialogInterface dialogInterface) {
        this.f20295q.f20302g.call();
    }

    /* JADX INFO: renamed from: F */
    public View m22215F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tj5.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m22216N(DialogInterface dialogInterface) {
        i0e.m16064e(this.f20294p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p009l.inf
    public void show() {
        super.show();
        j760[] j760VarArr = this.f20295q.f20308m;
        if (j760VarArr != null) {
            this.f20294p.p(j760VarArr);
        }
        i0e.m16065f(this.f20294p);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mj5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f16966a.m22216N(dialogInterface);
            }
        });
        m22208I();
    }
}
