package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.annotation.StringRes;
import androidx.appcompat.app.DialogInterfaceC0074a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.api.Api;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;

/* JADX INFO: loaded from: classes8.dex */
public class xh0 {

    /* JADX INFO: renamed from: a */
    public CharSequence f192806a;

    /* JADX INFO: renamed from: b */
    public CharSequence f192807b;

    /* JADX INFO: renamed from: c */
    public int f192808c;

    /* JADX INFO: renamed from: d */
    public CharSequence f192809d;

    /* JADX INFO: renamed from: e */
    public CharSequence f192810e;

    /* JADX INFO: renamed from: f */
    public boolean f192811f;

    /* JADX INFO: renamed from: g */
    public boolean f192812g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f192813h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f192814i;

    /* JADX INFO: renamed from: j */
    public DialogInterface.OnCancelListener f192815j;

    /* JADX INFO: renamed from: k */
    public DialogInterface.OnShowListener f192816k;

    /* JADX INFO: renamed from: l */
    public DialogInterface.OnDismissListener f192817l;

    /* JADX INFO: renamed from: m */
    public int f192818m;

    /* JADX INFO: renamed from: n */
    public int f192819n;

    /* JADX INFO: renamed from: o */
    public int f192820o;

    /* JADX INFO: renamed from: p */
    public boolean f192821p;

    /* JADX INFO: renamed from: q */
    public boolean f192822q;

    /* JADX INFO: renamed from: r */
    public Context f192823r;

    /* JADX INFO: renamed from: s */
    public DialogInterfaceC0074a f192824s;

    /* JADX INFO: renamed from: t */
    public VText f192825t;

    /* JADX INFO: renamed from: u */
    public VText f192826u;

    /* JADX INFO: renamed from: v */
    public VText f192827v;

    /* JADX INFO: renamed from: w */
    public VText f192828w;

    /* JADX INFO: renamed from: x */
    public View f192829x;

    /* JADX INFO: renamed from: y */
    public boolean f192830y;

    /* JADX INFO: renamed from: z */
    public MovementMethod f192831z;

    /* JADX INFO: renamed from: l.xh0$a */
    public static class C21150a {

        /* JADX INFO: renamed from: a */
        public CharSequence f192832a;

        /* JADX INFO: renamed from: b */
        public CharSequence f192833b;

        /* JADX INFO: renamed from: c */
        public int f192834c;

        /* JADX INFO: renamed from: d */
        public CharSequence f192835d;

        /* JADX INFO: renamed from: e */
        public CharSequence f192836e;

        /* JADX INFO: renamed from: h */
        public View.OnClickListener f192839h;

        /* JADX INFO: renamed from: i */
        public View.OnClickListener f192840i;

        /* JADX INFO: renamed from: j */
        public DialogInterface.OnCancelListener f192841j;

        /* JADX INFO: renamed from: k */
        public DialogInterface.OnShowListener f192842k;

        /* JADX INFO: renamed from: l */
        public DialogInterface.OnDismissListener f192843l;

        /* JADX INFO: renamed from: m */
        public int f192844m;

        /* JADX INFO: renamed from: n */
        public int f192845n;

        /* JADX INFO: renamed from: r */
        public Context f192849r;

        /* JADX INFO: renamed from: s */
        public MovementMethod f192850s;

        /* JADX INFO: renamed from: f */
        public boolean f192837f = true;

        /* JADX INFO: renamed from: g */
        public boolean f192838g = true;

        /* JADX INFO: renamed from: o */
        public int f192846o = n8c0.f137617a;

        /* JADX INFO: renamed from: p */
        public boolean f192847p = true;

        /* JADX INFO: renamed from: q */
        public boolean f192848q = false;

        public C21150a(Context context) {
            this.f192849r = context;
        }

        /* JADX INFO: renamed from: a */
        public xh0 m208722a() {
            return new xh0(this.f192832a, this.f192833b, this.f192834c, this.f192835d, this.f192836e, this.f192837f, this.f192838g, this.f192839h, this.f192840i, this.f192841j, this.f192842k, this.f192843l, this.f192844m, this.f192845n, this.f192846o, this.f192847p, this.f192848q, this.f192850s, this.f192849r);
        }

        /* JADX INFO: renamed from: b */
        public C21150a m208723b(boolean z) {
            this.f192847p = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C21150a m208724c(View.OnClickListener onClickListener) {
            this.f192840i = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C21150a m208725d(int i) {
            this.f192845n = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C21150a m208726e(@StringRes int i) {
            this.f192836e = this.f192849r.getResources().getString(i);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C21150a m208727f(CharSequence charSequence) {
            this.f192836e = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C21150a m208728g(boolean z) {
            this.f192837f = z;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C21150a m208729h(boolean z) {
            this.f192838g = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C21150a m208730i(@StringRes int i) {
            this.f192833b = this.f192849r.getResources().getString(i);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C21150a m208731j(CharSequence charSequence) {
            this.f192833b = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C21150a m208732k(int i) {
            this.f192834c = i;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C21150a m208733l(DialogInterface.OnCancelListener onCancelListener) {
            this.f192841j = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C21150a m208734m(DialogInterface.OnDismissListener onDismissListener) {
            this.f192843l = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C21150a m208735n(DialogInterface.OnShowListener onShowListener) {
            this.f192842k = onShowListener;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C21150a m208736o(View.OnClickListener onClickListener) {
            this.f192839h = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C21150a m208737p(int i) {
            this.f192844m = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C21150a m208738q(@StringRes int i) {
            this.f192835d = this.f192849r.getResources().getString(i);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C21150a m208739r(CharSequence charSequence) {
            this.f192835d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C21150a m208740s(String str) {
            this.f192832a = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C21150a m208741t(boolean z) {
            this.f192848q = z;
            return this;
        }
    }

    public xh0(CharSequence charSequence, CharSequence charSequence2, int i, CharSequence charSequence3, CharSequence charSequence4, boolean z, boolean z2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener, int i2, int i3, int i4, boolean z3, boolean z4, MovementMethod movementMethod, Context context) {
        this.f192806a = charSequence;
        this.f192807b = charSequence2;
        this.f192808c = i;
        this.f192809d = charSequence3;
        this.f192810e = charSequence4;
        this.f192811f = z;
        this.f192812g = z2;
        this.f192813h = onClickListener;
        this.f192814i = onClickListener2;
        this.f192815j = onCancelListener;
        this.f192816k = onShowListener;
        this.f192817l = onDismissListener;
        this.f192818m = i2;
        this.f192819n = i3;
        this.f192820o = i4;
        this.f192821p = z3;
        this.f192822q = z4;
        this.f192831z = movementMethod;
        this.f192823r = context;
    }

    /* JADX INFO: renamed from: c */
    public void m208717c() {
        DialogInterfaceC0074a dialogInterfaceC0074a = this.f192824s;
        if (dialogInterfaceC0074a != null && dialogInterfaceC0074a.isShowing()) {
            this.f192824s.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m208718d() {
        DialogInterfaceC0074a dialogInterfaceC0074a = this.f192824s;
        if (dialogInterfaceC0074a == null) {
            return false;
        }
        return dialogInterfaceC0074a.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m208719e(View view) {
        if (this.f192830y) {
            return;
        }
        this.f192830y = true;
        if (this.f192821p) {
            this.f192824s.dismiss();
        }
        View.OnClickListener onClickListener = this.f192813h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m208720f(View view) {
        if (this.f192830y) {
            return;
        }
        this.f192830y = true;
        this.f192824s.dismiss();
        View.OnClickListener onClickListener = this.f192814i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m208721g() {
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        View viewInflate = LayoutInflater.from(this.f192823r).inflate(b6c0.f73781g, (ViewGroup) null);
        DialogInterfaceC0074a dialogInterfaceC0074aCreate = new DialogInterfaceC0074a.a(this.f192823r, this.f192820o).setView(viewInflate).create();
        this.f192824s = dialogInterfaceC0074aCreate;
        Window window = dialogInterfaceC0074aCreate.getWindow();
        window.setDimAmount(0.3f);
        this.f192824s.setCancelable(this.f192811f);
        this.f192824s.setCanceledOnTouchOutside(this.f192812g);
        VText vText = (VText) viewInflate.findViewById(p4c0.f147112e);
        this.f192825t = vText;
        vText.setTypeface(eqh0.m117752c(3));
        VText vText2 = (VText) viewInflate.findViewById(p4c0.f147106b);
        this.f192826u = vText2;
        vText2.setTypeface(vText2.getTypeface(), 0);
        VText vText3 = (VText) viewInflate.findViewById(p4c0.f147110d);
        this.f192827v = vText3;
        vText3.setTypeface(eqh0.m117752c(3));
        VText vText4 = (VText) viewInflate.findViewById(p4c0.f147108c);
        this.f192828w = vText4;
        vText4.setTypeface(eqh0.m117752c(3));
        this.f192829x = viewInflate.findViewById(p4c0.f147065F);
        boolean z2 = this.f192822q;
        VText vText5 = this.f192825t;
        boolean z3 = true;
        if (z2) {
            vText5.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            vText5.setMaxLines(1);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f192806a);
        VText vText6 = this.f192825t;
        if (zIsEmpty) {
            vText6.setVisibility(8);
            z = false;
        } else {
            vText6.setVisibility(0);
            this.f192825t.setText(this.f192806a);
            z = true;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f192807b);
        VText vText7 = this.f192826u;
        if (zIsEmpty2) {
            vText7.setVisibility(8);
            z3 = false;
        } else {
            vText7.setVisibility(0);
            this.f192826u.setText(this.f192807b);
            this.f192826u.setGravity(this.f192808c);
        }
        if (z) {
            if (!z3) {
                upk0.m194883a("Title and Content must be set simultaneously");
                return;
            }
            this.f192825t.setTextColor(this.f192823r.getResources().getColor(t0c0.f167151c));
            this.f192825t.setTextSize(18.0f);
            this.f192826u.setTextColor(this.f192823r.getResources().getColor(t0c0.f167150b));
            this.f192826u.setTextSize(14.0f);
            ConstraintLayout.C0220a c0220a = (ConstraintLayout.C0220a) this.f192825t.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0220a).topMargin = t100.f167273v;
            ((ViewGroup.MarginLayoutParams) c0220a).bottomMargin = t100.f167261j;
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0220a) this.f192826u.getLayoutParams())).bottomMargin = t100.f167265n;
        } else {
            if (!z3) {
                upk0.m194883a("Title and Content are empty");
                return;
            }
            this.f192826u.setMinimumHeight(t100.m186890d(52.0f));
            this.f192826u.setTextSize(16.0f);
            this.f192826u.setTextColor(this.f192823r.getResources().getColor(t0c0.f167151c));
            ConstraintLayout.C0220a c0220a2 = (ConstraintLayout.C0220a) this.f192826u.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0220a2).topMargin = t100.f167273v;
            ((ViewGroup.MarginLayoutParams) c0220a2).bottomMargin = t100.f167265n;
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(this.f192809d);
        VText vText8 = this.f192827v;
        if (zIsEmpty3) {
            vText8.setVisibility(8);
        } else {
            vText8.setVisibility(0);
            this.f192827v.setText(this.f192809d);
        }
        boolean zIsEmpty4 = TextUtils.isEmpty(this.f192810e);
        VText vText9 = this.f192828w;
        if (zIsEmpty4) {
            vText9.setVisibility(8);
        } else {
            vText9.setVisibility(0);
            this.f192828w.setText(this.f192810e);
        }
        if (TextUtils.isEmpty(this.f192809d) || TextUtils.isEmpty(this.f192810e)) {
            this.f192829x.setVisibility(8);
        } else {
            this.f192829x.setVisibility(0);
        }
        if (this.f192818m > 0 && (colorStateList2 = this.f192823r.getResources().getColorStateList(this.f192818m)) != null) {
            this.f192827v.setTextColor(colorStateList2);
        }
        if (this.f192819n > 0 && (colorStateList = this.f192823r.getResources().getColorStateList(this.f192819n)) != null) {
            this.f192828w.setTextColor(colorStateList);
        }
        DialogInterface.OnCancelListener onCancelListener = this.f192815j;
        if (onCancelListener != null) {
            this.f192824s.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnShowListener onShowListener = this.f192816k;
        if (onShowListener != null) {
            this.f192824s.setOnShowListener(onShowListener);
        }
        DialogInterface.OnDismissListener onDismissListener = this.f192817l;
        if (onDismissListener != null) {
            this.f192824s.setOnDismissListener(onDismissListener);
        }
        this.f192827v.setOnClickListener(new View.OnClickListener() { // from class: l.vh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181462a.m208719e(view);
            }
        });
        this.f192828w.setOnClickListener(new View.OnClickListener() { // from class: l.wh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186351a.m208720f(view);
            }
        });
        if (NullChecker.m81303a(this.f192831z)) {
            this.f192826u.setMovementMethod(this.f192831z);
        }
        this.f192824s.show();
        window.setLayout(t100.m186890d(279.0f), -2);
    }
}
