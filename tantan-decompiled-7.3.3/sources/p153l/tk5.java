package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes11.dex */
public class tk5 extends oof {

    /* JADX INFO: renamed from: h */
    public View f174652h;

    /* JADX INFO: renamed from: i */
    public LinearLayout f174653i;

    /* JADX INFO: renamed from: j */
    public ImageView f174654j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f174655k;

    /* JADX INFO: renamed from: l */
    public TextView f174656l;

    /* JADX INFO: renamed from: m */
    public TextView f174657m;

    /* JADX INFO: renamed from: n */
    public TextView f174658n;

    /* JADX INFO: renamed from: o */
    public Act f174659o;

    /* JADX INFO: renamed from: p */
    public l4g0 f174660p;

    /* JADX INFO: renamed from: q */
    public final C20336a f174661q;

    /* JADX INFO: renamed from: l.tk5$a */
    public static class C20336a {

        /* JADX INFO: renamed from: a */
        public Act f174662a;

        /* JADX INFO: renamed from: b */
        public String f174663b;

        /* JADX INFO: renamed from: c */
        public CharSequence f174664c;

        /* JADX INFO: renamed from: d */
        public CharSequence f174665d;

        /* JADX INFO: renamed from: e */
        public String f174666e;

        /* JADX INFO: renamed from: f */
        public View.OnClickListener f174667f;

        /* JADX INFO: renamed from: g */
        public x20 f174668g;

        /* JADX INFO: renamed from: h */
        public CharSequence f174669h;

        /* JADX INFO: renamed from: i */
        public boolean f174670i;

        /* JADX INFO: renamed from: j */
        public boolean f174671j;

        /* JADX INFO: renamed from: k */
        public int f174672k;

        /* JADX INFO: renamed from: l */
        public int f174673l;

        /* JADX INFO: renamed from: m */
        public pf60[] f174674m;

        public C20336a(Act act) {
            this.f174662a = act;
        }

        /* JADX INFO: renamed from: a */
        public tk5 m191519a() {
            return new tk5(this);
        }

        /* JADX INFO: renamed from: b */
        public C20336a m191520b(boolean z) {
            this.f174671j = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20336a m191521c(View.OnClickListener onClickListener) {
            this.f174667f = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20336a m191522d(pf60... pf60VarArr) {
            this.f174674m = pf60VarArr;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20336a m191523e(String str) {
            this.f174663b = str;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C20336a m191524f(String str) {
            this.f174666e = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C20336a m191525g(int i, int i2) {
            this.f174672k = i;
            this.f174673l = i2;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C20336a m191526h(CharSequence charSequence) {
            this.f174669h = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C20336a m191527i(boolean z) {
            this.f174670i = z;
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C20336a m191528j(CharSequence charSequence) {
            this.f174665d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C20336a m191529k(CharSequence charSequence) {
            this.f174664c = charSequence;
            return this;
        }
    }

    public tk5(C20336a c20336a) {
        super(c20336a.f174662a);
        this.f174661q = c20336a;
        m191509H(c20336a.f174662a);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m191504A(View view) {
    }

    /* JADX INFO: renamed from: G */
    private String m191508G() {
        return !TextUtils.isEmpty(this.f174661q.f174663b) ? this.f174661q.f174663b : tk5.class.getSimpleName();
    }

    /* JADX INFO: renamed from: H */
    private void m191509H(Context context) {
        this.f174659o = (Act) bnl0.m105506D(context);
        setContentView(m191517F(LayoutInflater.from(context), null));
        setCancelable(false);
        if (this.f174660p == null) {
            this.f174660p = w1e.m204399c(m191508G(), tk5.class.getSimpleName());
        }
    }

    /* JADX INFO: renamed from: I */
    private void m191510I() {
        int i;
        this.f174656l.setText(this.f174661q.f174664c);
        boolean zIsEmpty = TextUtils.isEmpty(this.f174661q.f174665d);
        TextView textView = this.f174657m;
        if (zIsEmpty) {
            bnl0.m105524M(textView, false);
        } else {
            textView.setText(this.f174661q.f174665d);
        }
        if (!TextUtils.isEmpty(this.f174661q.f174669h)) {
            this.f174658n.setText(this.f174661q.f174669h);
        }
        if (this.f174661q.f174671j) {
            bnl0.m105509E0(this.f174653i, new View.OnClickListener() { // from class: l.ok5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    tk5.m191504A(view);
                }
            });
            bnl0.m105509E0(this.f174652h, new View.OnClickListener() { // from class: l.pk5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f152790a.m191511J(view);
                }
            });
        }
        bnl0.m105525M0(this.f174654j, !this.f174661q.f174670i);
        C20336a c20336a = this.f174661q;
        if (c20336a.f174673l != 0 && (i = c20336a.f174672k) != 0) {
            bnl0.m105507D0(i, this.f174655k);
            bnl0.m105505C0(this.f174655k, this.f174661q.f174673l);
        }
        if (TextUtils.isEmpty(this.f174661q.f174666e)) {
            bnl0.m105524M(this.f174655k, false);
        } else {
            uqb0.f180374G.m127115L0(this.f174655k, this.f174661q.f174666e);
        }
        bnl0.m105509E0(this.f174658n, new View.OnClickListener() { // from class: l.qk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f158097a.m191512K(view);
            }
        });
        bnl0.m105509E0(this.f174654j, new View.OnClickListener() { // from class: l.rk5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163542a.m191513L(view);
            }
        });
        if (this.f174661q.f174668g != null) {
            setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.sk5
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f169230a.m191514M(dialogInterface);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m191511J(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m191512K(View view) {
        View.OnClickListener onClickListener = this.f174661q.f174667f;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m191513L(View view) {
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m191514M(DialogInterface dialogInterface) {
        this.f174661q.f174668g.call();
    }

    /* JADX INFO: renamed from: F */
    public View m191517F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uk5.m196471b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m191518N(DialogInterface dialogInterface) {
        w1e.m204401e(this.f174660p);
    }

    @Override // p153l.oof, android.app.Dialog
    public void show() {
        super.show();
        pf60[] pf60VarArr = this.f174661q.f174674m;
        if (pf60VarArr != null) {
            this.f174660p.m152781p(pf60VarArr);
        }
        w1e.m204402f(this.f174660p);
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.nk5
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f142432a.m191518N(dialogInterface);
            }
        });
        m191510I();
    }
}
