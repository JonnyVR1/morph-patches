package p153l;

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
import androidx.appcompat.app.DialogInterfaceC0075a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.api.Api;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;

/* JADX INFO: loaded from: classes8.dex */
public class th0 {

    /* JADX INFO: renamed from: a */
    public CharSequence f174178a;

    /* JADX INFO: renamed from: b */
    public CharSequence f174179b;

    /* JADX INFO: renamed from: c */
    public int f174180c;

    /* JADX INFO: renamed from: d */
    public CharSequence f174181d;

    /* JADX INFO: renamed from: e */
    public CharSequence f174182e;

    /* JADX INFO: renamed from: f */
    public boolean f174183f;

    /* JADX INFO: renamed from: g */
    public boolean f174184g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f174185h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f174186i;

    /* JADX INFO: renamed from: j */
    public DialogInterface.OnCancelListener f174187j;

    /* JADX INFO: renamed from: k */
    public DialogInterface.OnShowListener f174188k;

    /* JADX INFO: renamed from: l */
    public DialogInterface.OnDismissListener f174189l;

    /* JADX INFO: renamed from: m */
    public int f174190m;

    /* JADX INFO: renamed from: n */
    public int f174191n;

    /* JADX INFO: renamed from: o */
    public int f174192o;

    /* JADX INFO: renamed from: p */
    public boolean f174193p;

    /* JADX INFO: renamed from: q */
    public boolean f174194q;

    /* JADX INFO: renamed from: r */
    public Context f174195r;

    /* JADX INFO: renamed from: s */
    public DialogInterfaceC0075a f174196s;

    /* JADX INFO: renamed from: t */
    public VText f174197t;

    /* JADX INFO: renamed from: u */
    public VText f174198u;

    /* JADX INFO: renamed from: v */
    public VText f174199v;

    /* JADX INFO: renamed from: w */
    public VText f174200w;

    /* JADX INFO: renamed from: x */
    public View f174201x;

    /* JADX INFO: renamed from: y */
    public boolean f174202y;

    /* JADX INFO: renamed from: z */
    public MovementMethod f174203z;

    /* JADX INFO: renamed from: l.th0$a */
    public static class C20312a {

        /* JADX INFO: renamed from: a */
        public CharSequence f174204a;

        /* JADX INFO: renamed from: b */
        public CharSequence f174205b;

        /* JADX INFO: renamed from: c */
        public int f174206c;

        /* JADX INFO: renamed from: d */
        public CharSequence f174207d;

        /* JADX INFO: renamed from: e */
        public CharSequence f174208e;

        /* JADX INFO: renamed from: h */
        public View.OnClickListener f174211h;

        /* JADX INFO: renamed from: i */
        public View.OnClickListener f174212i;

        /* JADX INFO: renamed from: j */
        public DialogInterface.OnCancelListener f174213j;

        /* JADX INFO: renamed from: k */
        public DialogInterface.OnShowListener f174214k;

        /* JADX INFO: renamed from: l */
        public DialogInterface.OnDismissListener f174215l;

        /* JADX INFO: renamed from: m */
        public int f174216m;

        /* JADX INFO: renamed from: n */
        public int f174217n;

        /* JADX INFO: renamed from: r */
        public Context f174221r;

        /* JADX INFO: renamed from: s */
        public MovementMethod f174222s;

        /* JADX INFO: renamed from: f */
        public boolean f174209f = true;

        /* JADX INFO: renamed from: g */
        public boolean f174210g = true;

        /* JADX INFO: renamed from: o */
        public int f174218o = tgc0.f174055a;

        /* JADX INFO: renamed from: p */
        public boolean f174219p = true;

        /* JADX INFO: renamed from: q */
        public boolean f174220q = false;

        public C20312a(Context context) {
            this.f174221r = context;
        }

        /* JADX INFO: renamed from: a */
        public th0 m191142a() {
            return new th0(this.f174204a, this.f174205b, this.f174206c, this.f174207d, this.f174208e, this.f174209f, this.f174210g, this.f174211h, this.f174212i, this.f174213j, this.f174214k, this.f174215l, this.f174216m, this.f174217n, this.f174218o, this.f174219p, this.f174220q, this.f174222s, this.f174221r);
        }

        /* JADX INFO: renamed from: b */
        public C20312a m191143b(boolean z) {
            this.f174219p = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C20312a m191144c(View.OnClickListener onClickListener) {
            this.f174212i = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C20312a m191145d(int i) {
            this.f174217n = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C20312a m191146e(@StringRes int i) {
            this.f174208e = this.f174221r.getResources().getString(i);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C20312a m191147f(CharSequence charSequence) {
            this.f174208e = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C20312a m191148g(boolean z) {
            this.f174209f = z;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C20312a m191149h(boolean z) {
            this.f174210g = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C20312a m191150i(@StringRes int i) {
            this.f174205b = this.f174221r.getResources().getString(i);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C20312a m191151j(CharSequence charSequence) {
            this.f174205b = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C20312a m191152k(int i) {
            this.f174206c = i;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C20312a m191153l(DialogInterface.OnCancelListener onCancelListener) {
            this.f174213j = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C20312a m191154m(DialogInterface.OnDismissListener onDismissListener) {
            this.f174215l = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C20312a m191155n(DialogInterface.OnShowListener onShowListener) {
            this.f174214k = onShowListener;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C20312a m191156o(View.OnClickListener onClickListener) {
            this.f174211h = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C20312a m191157p(int i) {
            this.f174216m = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C20312a m191158q(@StringRes int i) {
            this.f174207d = this.f174221r.getResources().getString(i);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C20312a m191159r(CharSequence charSequence) {
            this.f174207d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C20312a m191160s(String str) {
            this.f174204a = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C20312a m191161t(boolean z) {
            this.f174220q = z;
            return this;
        }
    }

    public th0(CharSequence charSequence, CharSequence charSequence2, int i, CharSequence charSequence3, CharSequence charSequence4, boolean z, boolean z2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener, int i2, int i3, int i4, boolean z3, boolean z4, MovementMethod movementMethod, Context context) {
        this.f174178a = charSequence;
        this.f174179b = charSequence2;
        this.f174180c = i;
        this.f174181d = charSequence3;
        this.f174182e = charSequence4;
        this.f174183f = z;
        this.f174184g = z2;
        this.f174185h = onClickListener;
        this.f174186i = onClickListener2;
        this.f174187j = onCancelListener;
        this.f174188k = onShowListener;
        this.f174189l = onDismissListener;
        this.f174190m = i2;
        this.f174191n = i3;
        this.f174192o = i4;
        this.f174193p = z3;
        this.f174194q = z4;
        this.f174203z = movementMethod;
        this.f174195r = context;
    }

    /* JADX INFO: renamed from: c */
    public void m191137c() {
        DialogInterfaceC0075a dialogInterfaceC0075a = this.f174196s;
        if (dialogInterfaceC0075a != null && dialogInterfaceC0075a.isShowing()) {
            this.f174196s.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m191138d() {
        DialogInterfaceC0075a dialogInterfaceC0075a = this.f174196s;
        if (dialogInterfaceC0075a == null) {
            return false;
        }
        return dialogInterfaceC0075a.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m191139e(View view) {
        if (this.f174202y) {
            return;
        }
        this.f174202y = true;
        if (this.f174193p) {
            this.f174196s.dismiss();
        }
        View.OnClickListener onClickListener = this.f174185h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m191140f(View view) {
        if (this.f174202y) {
            return;
        }
        this.f174202y = true;
        this.f174196s.dismiss();
        View.OnClickListener onClickListener = this.f174186i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m191141g() {
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        View viewInflate = LayoutInflater.from(this.f174195r).inflate(gec0.f103794g, (ViewGroup) null);
        DialogInterfaceC0075a dialogInterfaceC0075aCreate = new DialogInterfaceC0075a.a(this.f174195r, this.f174192o).setView(viewInflate).create();
        this.f174196s = dialogInterfaceC0075aCreate;
        Window window = dialogInterfaceC0075aCreate.getWindow();
        window.setDimAmount(0.3f);
        this.f174196s.setCancelable(this.f174183f);
        this.f174196s.setCanceledOnTouchOutside(this.f174184g);
        VText vText = (VText) viewInflate.findViewById(vcc0.f183412e);
        this.f174197t = vText;
        vText.setTypeface(lyh0.m156283c(3));
        VText vText2 = (VText) viewInflate.findViewById(vcc0.f183406b);
        this.f174198u = vText2;
        vText2.setTypeface(vText2.getTypeface(), 0);
        VText vText3 = (VText) viewInflate.findViewById(vcc0.f183410d);
        this.f174199v = vText3;
        vText3.setTypeface(lyh0.m156283c(3));
        VText vText4 = (VText) viewInflate.findViewById(vcc0.f183408c);
        this.f174200w = vText4;
        vText4.setTypeface(lyh0.m156283c(3));
        this.f174201x = viewInflate.findViewById(vcc0.f183365F);
        boolean z2 = this.f174194q;
        VText vText5 = this.f174197t;
        boolean z3 = true;
        if (z2) {
            vText5.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            vText5.setMaxLines(1);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f174178a);
        VText vText6 = this.f174197t;
        if (zIsEmpty) {
            vText6.setVisibility(8);
            z = false;
        } else {
            vText6.setVisibility(0);
            this.f174197t.setText(this.f174178a);
            z = true;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f174179b);
        VText vText7 = this.f174198u;
        if (zIsEmpty2) {
            vText7.setVisibility(8);
            z3 = false;
        } else {
            vText7.setVisibility(0);
            this.f174198u.setText(this.f174179b);
            this.f174198u.setGravity(this.f174180c);
        }
        if (z) {
            if (!z3) {
                azk0.m101074a("Title and Content must be set simultaneously");
                return;
            }
            this.f174197t.setTextColor(this.f174195r.getResources().getColor(z8c0.f203342c));
            this.f174197t.setTextSize(18.0f);
            this.f174198u.setTextColor(this.f174195r.getResources().getColor(z8c0.f203341b));
            this.f174198u.setTextSize(14.0f);
            ConstraintLayout.C0221a c0221a = (ConstraintLayout.C0221a) this.f174197t.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0221a).topMargin = qa00.f156335v;
            ((ViewGroup.MarginLayoutParams) c0221a).bottomMargin = qa00.f156323j;
            ((ViewGroup.MarginLayoutParams) ((ConstraintLayout.C0221a) this.f174198u.getLayoutParams())).bottomMargin = qa00.f156327n;
        } else {
            if (!z3) {
                azk0.m101074a("Title and Content are empty");
                return;
            }
            this.f174198u.setMinimumHeight(qa00.m175859d(52.0f));
            this.f174198u.setTextSize(16.0f);
            this.f174198u.setTextColor(this.f174195r.getResources().getColor(z8c0.f203342c));
            ConstraintLayout.C0221a c0221a2 = (ConstraintLayout.C0221a) this.f174198u.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c0221a2).topMargin = qa00.f156335v;
            ((ViewGroup.MarginLayoutParams) c0221a2).bottomMargin = qa00.f156327n;
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(this.f174181d);
        VText vText8 = this.f174199v;
        if (zIsEmpty3) {
            vText8.setVisibility(8);
        } else {
            vText8.setVisibility(0);
            this.f174199v.setText(this.f174181d);
        }
        boolean zIsEmpty4 = TextUtils.isEmpty(this.f174182e);
        VText vText9 = this.f174200w;
        if (zIsEmpty4) {
            vText9.setVisibility(8);
        } else {
            vText9.setVisibility(0);
            this.f174200w.setText(this.f174182e);
        }
        if (TextUtils.isEmpty(this.f174181d) || TextUtils.isEmpty(this.f174182e)) {
            this.f174201x.setVisibility(8);
        } else {
            this.f174201x.setVisibility(0);
        }
        if (this.f174190m > 0 && (colorStateList2 = this.f174195r.getResources().getColorStateList(this.f174190m)) != null) {
            this.f174199v.setTextColor(colorStateList2);
        }
        if (this.f174191n > 0 && (colorStateList = this.f174195r.getResources().getColorStateList(this.f174191n)) != null) {
            this.f174200w.setTextColor(colorStateList);
        }
        DialogInterface.OnCancelListener onCancelListener = this.f174187j;
        if (onCancelListener != null) {
            this.f174196s.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnShowListener onShowListener = this.f174188k;
        if (onShowListener != null) {
            this.f174196s.setOnShowListener(onShowListener);
        }
        DialogInterface.OnDismissListener onDismissListener = this.f174189l;
        if (onDismissListener != null) {
            this.f174196s.setOnDismissListener(onDismissListener);
        }
        this.f174199v.setOnClickListener(new View.OnClickListener() { // from class: l.rh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163068a.m191139e(view);
            }
        });
        this.f174200w.setOnClickListener(new View.OnClickListener() { // from class: l.sh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f168572a.m191140f(view);
            }
        });
        if (NullChecker.m82486a(this.f174203z)) {
            this.f174198u.setMovementMethod(this.f174203z);
        }
        this.f174196s.show();
        window.setLayout(qa00.m175859d(279.0f), -2);
    }
}
