package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class sj5 extends inf {

    /* JADX INFO: renamed from: h */
    public View f164784h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f164785i;

    /* JADX INFO: renamed from: j */
    public ImageView f164786j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f164787k;

    /* JADX INFO: renamed from: l */
    public TextView f164788l;

    /* JADX INFO: renamed from: m */
    public TextView f164789m;

    /* JADX INFO: renamed from: n */
    public TextView f164790n;

    /* JADX INFO: renamed from: o */
    public Act f164791o;

    /* JADX INFO: renamed from: p */
    public cwf0 f164792p;

    /* JADX INFO: renamed from: q */
    public final C19956a f164793q;

    /* JADX INFO: renamed from: l.sj5$a */
    public static class C19956a {

        /* JADX INFO: renamed from: a */
        public Act f164794a;

        /* JADX INFO: renamed from: b */
        public String f164795b;

        /* JADX INFO: renamed from: c */
        public CharSequence f164796c;

        /* JADX INFO: renamed from: d */
        public CharSequence f164797d;

        /* JADX INFO: renamed from: e */
        public String f164798e;

        /* JADX INFO: renamed from: f */
        public View.OnClickListener f164799f;

        /* JADX INFO: renamed from: g */
        public d30 f164800g;

        /* JADX INFO: renamed from: h */
        public CharSequence f164801h;

        /* JADX INFO: renamed from: i */
        public boolean f164802i;

        /* JADX INFO: renamed from: j */
        public boolean f164803j;

        /* JADX INFO: renamed from: k */
        public int f164804k;

        /* JADX INFO: renamed from: l */
        public int f164805l;

        /* JADX INFO: renamed from: m */
        public j760[] f164806m;

        public C19956a(Act act) {
            this.f164794a = act;
        }

        /* JADX INFO: renamed from: a */
        public sj5 m184434a() {
            return new sj5(this);
        }

        /* JADX INFO: renamed from: b */
        public C19956a m184435b(boolean z) {
            this.f164803j = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C19956a m184436c(View.OnClickListener onClickListener) {
            this.f164799f = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C19956a m184437d(j760... j760VarArr) {
            this.f164806m = j760VarArr;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C19956a m184438e(String str) {
            this.f164795b = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C19956a m184439f(String str) {
            this.f164798e = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C19956a m184440g(int i, int i2) {
            this.f164804k = i;
            this.f164805l = i2;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C19956a m184441h(CharSequence charSequence) {
            this.f164801h = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C19956a m184442i(boolean z) {
            this.f164802i = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C19956a m184443j(CharSequence charSequence) {
            this.f164797d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C19956a m184444k(CharSequence charSequence) {
            this.f164796c = charSequence;
            return this;
        }
    }

    public sj5(C19956a c19956a) {
        super(c19956a.f164794a);
        this.f164793q = c19956a;
        m184424H(c19956a.f164794a);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m184419A(View view) {
    }

    /* JADX INFO: renamed from: G */
    private String m184423G() {
        return !TextUtils.isEmpty(this.f164793q.f164795b) ? this.f164793q.f164795b : sj5.class.getSimpleName();
    }

    /* JADX INFO: renamed from: H */
    private void m184424H(Context context) {
        this.f164791o = (Act) xdl0.m208326D(context);
        setContentView(m184432F(LayoutInflater.from(context), null));
        setCancelable(false);
        if (this.f164792p == null) {
            this.f164792p = i0e.m133794c(m184423G(), sj5.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: I */
    private void m184425I() {
        int i;
        this.f164788l.setText(this.f164793q.f164796c);
        boolean zIsEmpty = TextUtils.isEmpty(this.f164793q.f164797d);
        TextView textView = this.f164789m;
        if (zIsEmpty) {
            xdl0.m208344M(textView, false);
        } else {
            textView.setText(this.f164793q.f164797d);
        }
        if (!TextUtils.isEmpty(this.f164793q.f164801h)) {
            this.f164790n.setText(this.f164793q.f164801h);
        }
        if (this.f164793q.f164803j) {
            xdl0.m208329E0(this.f164785i, new View.OnClickListener() { // from class: l.nj5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    sj5.m184419A(view);
                }
            });
            xdl0.m208329E0(this.f164784h, new View.OnClickListener() { // from class: l.oj5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f144249a.m184426J(view);
                }
            });
        }
        xdl0.m208345M0(this.f164786j, !this.f164793q.f164802i);
        C19956a c19956a = this.f164793q;
        if (c19956a.f164805l != 0 && (i = c19956a.f164804k) != 0) {
            xdl0.m208327D0(i, this.f164787k);
            xdl0.m208325C0(this.f164787k, this.f164793q.f164805l);
        }
        if (TextUtils.isEmpty(this.f164793q.f164798e)) {
            xdl0.m208344M(this.f164787k, false);
        } else {
            qib0.f154691G.m102331L0(this.f164787k, this.f164793q.f164798e);
        }
        xdl0.m208329E0(this.f164790n, new View.OnClickListener() { // from class: l.pj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f149714a.m184427K(view);
            }
        });
        xdl0.m208329E0(this.f164786j, new View.OnClickListener() { // from class: l.qj5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154878a.m184428L(view);
            }
        });
        if (this.f164793q.f164800g != null) {
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.rj5
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f159652a.m184429M(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m184426J(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m184427K(View view) {
        View.OnClickListener onClickListener = this.f164793q.f164799f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m184428L(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m184429M(DialogInterface dialogInterface) {
        this.f164793q.f164800g.call();
    }

    /* JADX INFO: renamed from: F */
    public View m184432F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tj5.m189249b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m184433N(DialogInterface dialogInterface) {
        i0e.m133796e(this.f164792p);
    }

    @Override // p149l.inf, android.app.Dialog
    public void show() {
        super.show();
        j760[] j760VarArr = this.f164793q.f164806m;
        if (j760VarArr != null) {
            this.f164792p.m109040p(j760VarArr);
        }
        i0e.m133797f(this.f164792p);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mj5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f134102a.m184433N(dialogInterface);
            }
        });
        m184425I();
    }
}
