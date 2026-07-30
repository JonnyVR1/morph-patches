package p007l;

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
import androidx.appcompat.app.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.t100;
import l.upk0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class xh0 {

    /* JADX INFO: renamed from: a */
    public CharSequence f5290a;

    /* JADX INFO: renamed from: b */
    public CharSequence f5291b;

    /* JADX INFO: renamed from: c */
    public int f5292c;

    /* JADX INFO: renamed from: d */
    public CharSequence f5293d;

    /* JADX INFO: renamed from: e */
    public CharSequence f5294e;

    /* JADX INFO: renamed from: f */
    public boolean f5295f;

    /* JADX INFO: renamed from: g */
    public boolean f5296g;

    /* JADX INFO: renamed from: h */
    public View.OnClickListener f5297h;

    /* JADX INFO: renamed from: i */
    public View.OnClickListener f5298i;

    /* JADX INFO: renamed from: j */
    public DialogInterface.OnCancelListener f5299j;

    /* JADX INFO: renamed from: k */
    public DialogInterface.OnShowListener f5300k;

    /* JADX INFO: renamed from: l */
    public DialogInterface.OnDismissListener f5301l;

    /* JADX INFO: renamed from: m */
    public int f5302m;

    /* JADX INFO: renamed from: n */
    public int f5303n;

    /* JADX INFO: renamed from: o */
    public int f5304o;

    /* JADX INFO: renamed from: p */
    public boolean f5305p;

    /* JADX INFO: renamed from: q */
    public boolean f5306q;

    /* JADX INFO: renamed from: r */
    public Context f5307r;

    /* JADX INFO: renamed from: s */
    public a f5308s;

    /* JADX INFO: renamed from: t */
    public VText f5309t;

    /* JADX INFO: renamed from: u */
    public VText f5310u;

    /* JADX INFO: renamed from: v */
    public VText f5311v;

    /* JADX INFO: renamed from: w */
    public VText f5312w;

    /* JADX INFO: renamed from: x */
    public View f5313x;

    /* JADX INFO: renamed from: y */
    public boolean f5314y;

    /* JADX INFO: renamed from: z */
    public MovementMethod f5315z;

    /* JADX INFO: renamed from: l.xh0$a */
    public static class C0776a {

        /* JADX INFO: renamed from: a */
        public CharSequence f5316a;

        /* JADX INFO: renamed from: b */
        public CharSequence f5317b;

        /* JADX INFO: renamed from: c */
        public int f5318c;

        /* JADX INFO: renamed from: d */
        public CharSequence f5319d;

        /* JADX INFO: renamed from: e */
        public CharSequence f5320e;

        /* JADX INFO: renamed from: h */
        public View.OnClickListener f5323h;

        /* JADX INFO: renamed from: i */
        public View.OnClickListener f5324i;

        /* JADX INFO: renamed from: j */
        public DialogInterface.OnCancelListener f5325j;

        /* JADX INFO: renamed from: k */
        public DialogInterface.OnShowListener f5326k;

        /* JADX INFO: renamed from: l */
        public DialogInterface.OnDismissListener f5327l;

        /* JADX INFO: renamed from: m */
        public int f5328m;

        /* JADX INFO: renamed from: n */
        public int f5329n;

        /* JADX INFO: renamed from: r */
        public Context f5333r;

        /* JADX INFO: renamed from: s */
        public MovementMethod f5334s;

        /* JADX INFO: renamed from: f */
        public boolean f5321f = true;

        /* JADX INFO: renamed from: g */
        public boolean f5322g = true;

        /* JADX INFO: renamed from: o */
        public int f5330o = n8c0.f3362a;

        /* JADX INFO: renamed from: p */
        public boolean f5331p = true;

        /* JADX INFO: renamed from: q */
        public boolean f5332q = false;

        public C0776a(Context context) {
            this.f5333r = context;
        }

        /* JADX INFO: renamed from: a */
        public xh0 m11802a() {
            return new xh0(this.f5316a, this.f5317b, this.f5318c, this.f5319d, this.f5320e, this.f5321f, this.f5322g, this.f5323h, this.f5324i, this.f5325j, this.f5326k, this.f5327l, this.f5328m, this.f5329n, this.f5330o, this.f5331p, this.f5332q, this.f5334s, this.f5333r);
        }

        /* JADX INFO: renamed from: b */
        public C0776a m11803b(boolean z) {
            this.f5331p = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0776a m11804c(View.OnClickListener onClickListener) {
            this.f5324i = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0776a m11805d(int i) {
            this.f5329n = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0776a m11806e(@StringRes int i) {
            this.f5320e = this.f5333r.getResources().getString(i);
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0776a m11807f(CharSequence charSequence) {
            this.f5320e = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0776a m11808g(boolean z) {
            this.f5321f = z;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0776a m11809h(boolean z) {
            this.f5322g = z;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0776a m11810i(@StringRes int i) {
            this.f5317b = this.f5333r.getResources().getString(i);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public C0776a m11811j(CharSequence charSequence) {
            this.f5317b = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public C0776a m11812k(int i) {
            this.f5318c = i;
            return this;
        }

        /* JADX INFO: renamed from: l */
        public C0776a m11813l(DialogInterface.OnCancelListener onCancelListener) {
            this.f5325j = onCancelListener;
            return this;
        }

        /* JADX INFO: renamed from: m */
        public C0776a m11814m(DialogInterface.OnDismissListener onDismissListener) {
            this.f5327l = onDismissListener;
            return this;
        }

        /* JADX INFO: renamed from: n */
        public C0776a m11815n(DialogInterface.OnShowListener onShowListener) {
            this.f5326k = onShowListener;
            return this;
        }

        /* JADX INFO: renamed from: o */
        public C0776a m11816o(View.OnClickListener onClickListener) {
            this.f5323h = onClickListener;
            return this;
        }

        /* JADX INFO: renamed from: p */
        public C0776a m11817p(int i) {
            this.f5328m = i;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public C0776a m11818q(@StringRes int i) {
            this.f5319d = this.f5333r.getResources().getString(i);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public C0776a m11819r(CharSequence charSequence) {
            this.f5319d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: s */
        public C0776a m11820s(String str) {
            this.f5316a = str;
            return this;
        }

        /* JADX INFO: renamed from: t */
        public C0776a m11821t(boolean z) {
            this.f5332q = z;
            return this;
        }
    }

    public xh0(CharSequence charSequence, CharSequence charSequence2, int i, CharSequence charSequence3, CharSequence charSequence4, boolean z, boolean z2, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnShowListener onShowListener, DialogInterface.OnDismissListener onDismissListener, int i2, int i3, int i4, boolean z3, boolean z4, MovementMethod movementMethod, Context context) {
        this.f5290a = charSequence;
        this.f5291b = charSequence2;
        this.f5292c = i;
        this.f5293d = charSequence3;
        this.f5294e = charSequence4;
        this.f5295f = z;
        this.f5296g = z2;
        this.f5297h = onClickListener;
        this.f5298i = onClickListener2;
        this.f5299j = onCancelListener;
        this.f5300k = onShowListener;
        this.f5301l = onDismissListener;
        this.f5302m = i2;
        this.f5303n = i3;
        this.f5304o = i4;
        this.f5305p = z3;
        this.f5306q = z4;
        this.f5315z = movementMethod;
        this.f5307r = context;
    }

    /* JADX INFO: renamed from: c */
    public void m11797c() {
        a aVar = this.f5308s;
        if (aVar != null && aVar.isShowing()) {
            this.f5308s.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public boolean m11798d() {
        a aVar = this.f5308s;
        if (aVar == null) {
            return false;
        }
        return aVar.isShowing();
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m11799e(View view) {
        if (this.f5314y) {
            return;
        }
        this.f5314y = true;
        if (this.f5305p) {
            this.f5308s.dismiss();
        }
        View.OnClickListener onClickListener = this.f5297h;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m11800f(View view) {
        if (this.f5314y) {
            return;
        }
        this.f5314y = true;
        this.f5308s.dismiss();
        View.OnClickListener onClickListener = this.f5298i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m11801g() {
        boolean z;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        View viewInflate = LayoutInflater.from(this.f5307r).inflate(b6c0.f1921g, (ViewGroup) null);
        a aVarCreate = new a.a(this.f5307r, this.f5304o).setView(viewInflate).create();
        this.f5308s = aVarCreate;
        Window window = aVarCreate.getWindow();
        window.setDimAmount(0.3f);
        this.f5308s.setCancelable(this.f5295f);
        this.f5308s.setCanceledOnTouchOutside(this.f5296g);
        VText vTextFindViewById = viewInflate.findViewById(p4c0.f3660e);
        this.f5309t = vTextFindViewById;
        vTextFindViewById.setTypeface(eqh0.c(3));
        VText vTextFindViewById2 = viewInflate.findViewById(p4c0.f3654b);
        this.f5310u = vTextFindViewById2;
        vTextFindViewById2.setTypeface(vTextFindViewById2.getTypeface(), 0);
        VText vTextFindViewById3 = viewInflate.findViewById(p4c0.f3658d);
        this.f5311v = vTextFindViewById3;
        vTextFindViewById3.setTypeface(eqh0.c(3));
        VText vTextFindViewById4 = viewInflate.findViewById(p4c0.f3656c);
        this.f5312w = vTextFindViewById4;
        vTextFindViewById4.setTypeface(eqh0.c(3));
        this.f5313x = viewInflate.findViewById(p4c0.f3613F);
        boolean z2 = this.f5306q;
        VText vText = this.f5309t;
        boolean z3 = true;
        if (z2) {
            vText.setMaxLines(Integer.MAX_VALUE);
        } else {
            vText.setMaxLines(1);
        }
        boolean zIsEmpty = TextUtils.isEmpty(this.f5290a);
        VText vText2 = this.f5309t;
        if (zIsEmpty) {
            vText2.setVisibility(8);
            z = false;
        } else {
            vText2.setVisibility(0);
            this.f5309t.setText(this.f5290a);
            z = true;
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f5291b);
        VText vText3 = this.f5310u;
        if (zIsEmpty2) {
            vText3.setVisibility(8);
            z3 = false;
        } else {
            vText3.setVisibility(0);
            this.f5310u.setText(this.f5291b);
            this.f5310u.setGravity(this.f5292c);
        }
        if (z) {
            if (!z3) {
                upk0.a("Title and Content must be set simultaneously");
                return;
            }
            this.f5309t.setTextColor(this.f5307r.getResources().getColor(t0c0.f4219c));
            this.f5309t.setTextSize(18.0f);
            this.f5310u.setTextColor(this.f5307r.getResources().getColor(t0c0.f4218b));
            this.f5310u.setTextSize(14.0f);
            ConstraintLayout.a layoutParams = this.f5309t.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = t100.v;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = t100.j;
            ((ViewGroup.MarginLayoutParams) this.f5310u.getLayoutParams()).bottomMargin = t100.n;
        } else {
            if (!z3) {
                upk0.a("Title and Content are empty");
                return;
            }
            this.f5310u.setMinimumHeight(t100.d(52.0f));
            this.f5310u.setTextSize(16.0f);
            this.f5310u.setTextColor(this.f5307r.getResources().getColor(t0c0.f4219c));
            ConstraintLayout.a layoutParams2 = this.f5310u.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = t100.v;
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = t100.n;
        }
        boolean zIsEmpty3 = TextUtils.isEmpty(this.f5293d);
        VText vText4 = this.f5311v;
        if (zIsEmpty3) {
            vText4.setVisibility(8);
        } else {
            vText4.setVisibility(0);
            this.f5311v.setText(this.f5293d);
        }
        boolean zIsEmpty4 = TextUtils.isEmpty(this.f5294e);
        VText vText5 = this.f5312w;
        if (zIsEmpty4) {
            vText5.setVisibility(8);
        } else {
            vText5.setVisibility(0);
            this.f5312w.setText(this.f5294e);
        }
        if (TextUtils.isEmpty(this.f5293d) || TextUtils.isEmpty(this.f5294e)) {
            this.f5313x.setVisibility(8);
        } else {
            this.f5313x.setVisibility(0);
        }
        if (this.f5302m > 0 && (colorStateList2 = this.f5307r.getResources().getColorStateList(this.f5302m)) != null) {
            this.f5311v.setTextColor(colorStateList2);
        }
        if (this.f5303n > 0 && (colorStateList = this.f5307r.getResources().getColorStateList(this.f5303n)) != null) {
            this.f5312w.setTextColor(colorStateList);
        }
        DialogInterface.OnCancelListener onCancelListener = this.f5299j;
        if (onCancelListener != null) {
            this.f5308s.setOnCancelListener(onCancelListener);
        }
        DialogInterface.OnShowListener onShowListener = this.f5300k;
        if (onShowListener != null) {
            this.f5308s.setOnShowListener(onShowListener);
        }
        DialogInterface.OnDismissListener onDismissListener = this.f5301l;
        if (onDismissListener != null) {
            this.f5308s.setOnDismissListener(onDismissListener);
        }
        this.f5311v.setOnClickListener(new View.OnClickListener() { // from class: l.vh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4975a.m11799e(view);
            }
        });
        this.f5312w.setOnClickListener(new View.OnClickListener() { // from class: l.wh0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f5040a.m11800f(view);
            }
        });
        if (NullChecker.a(this.f5315z)) {
            this.f5310u.setMovementMethod(this.f5315z);
        }
        this.f5308s.show();
        window.setLayout(t100.d(279.0f), -2);
    }
}
