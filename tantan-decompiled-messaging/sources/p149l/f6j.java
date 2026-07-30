package p149l;

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

/* JADX INFO: loaded from: classes10.dex */
public class f6j extends szd {

    /* JADX INFO: renamed from: j */
    public ImageView f96130j;

    /* JADX INFO: renamed from: k */
    public ImageView f96131k;

    /* JADX INFO: renamed from: l */
    public TextView f96132l;

    /* JADX INFO: renamed from: m */
    public TextView f96133m;

    /* JADX INFO: renamed from: n */
    public TextView f96134n;

    /* JADX INFO: renamed from: o */
    public TextView f96135o;

    /* JADX INFO: renamed from: p */
    public TextView f96136p;

    /* JADX INFO: renamed from: q */
    public View f96137q;

    /* JADX INFO: renamed from: r */
    public C16767a f96138r;

    /* JADX INFO: renamed from: l.f6j$a */
    public static class C16767a {

        /* JADX INFO: renamed from: a */
        public Context f96139a;

        /* JADX INFO: renamed from: b */
        @DrawableRes
        public int f96140b = -1;

        /* JADX INFO: renamed from: c */
        @DrawableRes
        public int f96141c = -1;

        /* JADX INFO: renamed from: d */
        public String f96142d;

        /* JADX INFO: renamed from: e */
        public CharSequence f96143e;

        /* JADX INFO: renamed from: f */
        public String f96144f;

        /* JADX INFO: renamed from: g */
        public String f96145g;

        /* JADX INFO: renamed from: h */
        public String f96146h;

        /* JADX INFO: renamed from: i */
        public d30 f96147i;

        /* JADX INFO: renamed from: j */
        public d30 f96148j;

        /* JADX INFO: renamed from: k */
        public d30 f96149k;

        public C16767a(Context context) {
            this.f96139a = context;
        }

        /* JADX INFO: renamed from: l */
        public C16767a m119610l(int i) {
            this.f96140b = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C16767a m119611m(String str) {
            this.f96144f = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C16767a m119612n(String str, d30 d30Var) {
            this.f96146h = str;
            this.f96148j = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C16767a m119613o(String str, d30 d30Var) {
            this.f96145g = str;
            this.f96147i = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C16767a m119614p(d30 d30Var) {
            this.f96149k = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C16767a m119615q(int i) {
            this.f96141c = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C16767a m119616r(CharSequence charSequence) {
            this.f96143e = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C16767a m119617s(String str) {
            this.f96142d = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public f6j m119618t() {
            f6j f6jVar = new f6j(this);
            f6jVar.show();
            return f6jVar;
        }
    }

    public f6j(C16767a c16767a) {
        super(c16767a.f96139a, false, m119593I());
        setCanceledOnTouchOutside(false);
        this.f96138r = c16767a;
    }

    /* JADX INFO: renamed from: I */
    private static int m119593I() {
        return xdl0.m208412y0() >= 1080 ? n8c0.f137626j : n8c0.f137625i;
    }

    /* JADX INFO: renamed from: J */
    private void m119594J() {
        if (this.f96138r.f96140b != -1) {
            this.f96130j.setImageResource(this.f96138r.f96140b);
        }
        if (this.f96138r.f96141c != -1) {
            this.f96131k.setImageResource(this.f96138r.f96141c);
        }
        if (!TextUtils.isEmpty(this.f96138r.f96142d)) {
            this.f96132l.setText(this.f96138r.f96142d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f96138r.f96143e);
        TextView textView = this.f96133m;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.f96138r.f96143e);
        }
        if (!TextUtils.isEmpty(this.f96138r.f96145g)) {
            this.f96134n.setText(this.f96138r.f96145g);
            this.f96134n.setOnClickListener(new View.OnClickListener() { // from class: l.c6j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79552a.m119595K(view);
                }
            });
        }
        if (!TextUtils.isEmpty(this.f96138r.f96146h)) {
            this.f96135o.setText(this.f96138r.f96146h);
            this.f96135o.setOnClickListener(new View.OnClickListener() { // from class: l.d6j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84628a.m119596L(view);
                }
            });
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f96138r.f96144f);
        TextView textView2 = this.f96136p;
        if (zIsEmpty2) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.f96138r.f96144f);
        }
        m186758x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.e6j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f89586a.m119597M(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m119595K(View view) {
        if (NullChecker.m81303a(this.f96138r.f96147i)) {
            this.f96138r.f96147i.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m119596L(View view) {
        if (NullChecker.m81303a(this.f96138r.f96148j)) {
            this.f96138r.f96148j.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m119597M(DialogInterface dialogInterface) {
        if (NullChecker.m81303a(this.f96138r.f96149k)) {
            this.f96138r.f96149k.call();
        }
    }

    /* JADX INFO: renamed from: H */
    public View m119598H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g6j.m124596b(this, layoutInflater, viewGroup);
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        View viewM119598H = m119598H(o7r.m163037a(this.f96138r.f96139a), null);
        this.f96137q = viewM119598H;
        setContentView(viewM119598H);
        m119594J();
    }
}
