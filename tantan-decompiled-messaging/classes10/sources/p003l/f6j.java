package p003l;

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
import l.d30;
import l.n8c0;
import l.o7r;
import l.szd;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class f6j extends szd {

    /* JADX INFO: renamed from: j */
    public ImageView f4396j;

    /* JADX INFO: renamed from: k */
    public ImageView f4397k;

    /* JADX INFO: renamed from: l */
    public TextView f4398l;

    /* JADX INFO: renamed from: m */
    public TextView f4399m;

    /* JADX INFO: renamed from: n */
    public TextView f4400n;

    /* JADX INFO: renamed from: o */
    public TextView f4401o;

    /* JADX INFO: renamed from: p */
    public TextView f4402p;

    /* JADX INFO: renamed from: q */
    public View f4403q;

    /* JADX INFO: renamed from: r */
    public C3327a f4404r;

    /* JADX INFO: renamed from: l.f6j$a */
    public static class C3327a {

        /* JADX INFO: renamed from: a */
        public Context f4405a;

        /* JADX INFO: renamed from: b */
        @DrawableRes
        public int f4406b = -1;

        /* JADX INFO: renamed from: c */
        @DrawableRes
        public int f4407c = -1;

        /* JADX INFO: renamed from: d */
        public String f4408d;

        /* JADX INFO: renamed from: e */
        public CharSequence f4409e;

        /* JADX INFO: renamed from: f */
        public String f4410f;

        /* JADX INFO: renamed from: g */
        public String f4411g;

        /* JADX INFO: renamed from: h */
        public String f4412h;

        /* JADX INFO: renamed from: i */
        public d30 f4413i;

        /* JADX INFO: renamed from: j */
        public d30 f4414j;

        /* JADX INFO: renamed from: k */
        public d30 f4415k;

        public C3327a(Context context) {
            this.f4405a = context;
        }

        /* JADX INFO: renamed from: l */
        public C3327a m6411l(int i) {
            this.f4406b = i;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C3327a m6412m(String str) {
            this.f4410f = str;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C3327a m6413n(String str, d30 d30Var) {
            this.f4412h = str;
            this.f4414j = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C3327a m6414o(String str, d30 d30Var) {
            this.f4411g = str;
            this.f4413i = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C3327a m6415p(d30 d30Var) {
            this.f4415k = d30Var;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C3327a m6416q(int i) {
            this.f4407c = i;
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C3327a m6417r(CharSequence charSequence) {
            this.f4409e = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C3327a m6418s(String str) {
            this.f4408d = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public f6j m6419t() {
            f6j f6jVar = new f6j(this);
            f6jVar.show();
            return f6jVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f6j(C3327a c3327a) {
        super(c3327a.f4405a, false, m6394I());
        setCanceledOnTouchOutside(false);
        this.f4404r = c3327a;
    }

    /* JADX INFO: renamed from: I */
    private static int m6394I() {
        return xdl0.y0() >= 1080 ? n8c0.j : n8c0.i;
    }

    /* JADX INFO: renamed from: J */
    private void m6395J() {
        if (this.f4404r.f4406b != -1) {
            this.f4396j.setImageResource(this.f4404r.f4406b);
        }
        if (this.f4404r.f4407c != -1) {
            this.f4397k.setImageResource(this.f4404r.f4407c);
        }
        if (!TextUtils.isEmpty(this.f4404r.f4408d)) {
            this.f4398l.setText(this.f4404r.f4408d);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f4404r.f4409e);
        TextView textView = this.f4399m;
        if (zIsEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setText(this.f4404r.f4409e);
        }
        if (!TextUtils.isEmpty(this.f4404r.f4411g)) {
            this.f4400n.setText(this.f4404r.f4411g);
            this.f4400n.setOnClickListener(new View.OnClickListener() { // from class: l.c6j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f3979a.m6396K(view);
                }
            });
        }
        if (!TextUtils.isEmpty(this.f4404r.f4412h)) {
            this.f4401o.setText(this.f4404r.f4412h);
            this.f4401o.setOnClickListener(new View.OnClickListener() { // from class: l.d6j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4116a.m6397L(view);
                }
            });
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f4404r.f4410f);
        TextView textView2 = this.f4402p;
        if (zIsEmpty2) {
            textView2.setVisibility(8);
        } else {
            textView2.setText(this.f4404r.f4410f);
        }
        x();
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.e6j
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f4260a.m6398M(dialogInterface);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K */
    public /* synthetic */ void m6396K(View view) {
        if (NullChecker.a(this.f4404r.f4413i)) {
            this.f4404r.f4413i.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m6397L(View view) {
        if (NullChecker.a(this.f4404r.f4414j)) {
            this.f4404r.f4414j.call();
        }
        dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m6398M(DialogInterface dialogInterface) {
        if (NullChecker.a(this.f4404r.f4415k)) {
            this.f4404r.f4415k.call();
        }
    }

    /* JADX INFO: renamed from: H */
    public View m6399H(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g6j.m6606b(this, layoutInflater, viewGroup);
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        View viewM6399H = m6399H(o7r.a(this.f4404r.f4405a), null);
        this.f4403q = viewM6399H;
        setContentView(viewM6399H);
        m6395J();
    }
}
