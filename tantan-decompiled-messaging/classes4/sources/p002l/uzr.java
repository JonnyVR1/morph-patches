package p002l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import l.e51;
import l.kvc0;
import l.lsi0;
import l.t0g0;
import l.xdl0;
import l.ypv;
import v.VEditText;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class uzr extends LiveMenuDialogHolder<a0s> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f20891k;

    /* JADX INFO: renamed from: l */
    public View f20892l;

    /* JADX INFO: renamed from: m */
    public View f20893m;

    /* JADX INFO: renamed from: n */
    public View f20894n;

    /* JADX INFO: renamed from: o */
    public VImage f20895o;

    /* JADX INFO: renamed from: p */
    public VText f20896p;

    /* JADX INFO: renamed from: q */
    public TextView f20897q;

    /* JADX INFO: renamed from: r */
    public View f20898r;

    /* JADX INFO: renamed from: s */
    public VEditText f20899s;

    /* JADX INFO: renamed from: t */
    public TextView f20900t;

    /* JADX INFO: renamed from: u */
    public int f20901u;

    public uzr(Act act, @NonNull a0s a0sVar) {
        super(t6c0.f19503E, d8c0.f9102g, act, a0sVar);
        this.f20901u = 15;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ CharSequence m23677G(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!t0g0.i(c)) {
                sb.append(c);
            }
        }
        if (TextUtils.isEmpty(sb)) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    private void m23684Q() {
        this.f20899s.setFilters(new InputFilter[]{new InputFilter() { // from class: l.rzr
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return uzr.m23677G(charSequence, i, i2, spanned, i3, i4);
            }
        }, new InputFilter() { // from class: l.szr
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return this.f19345a.m23692R(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        this.f20899s.addTextChangedListener(new C0857a());
        m23695X(this.f20899s.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m23685S(View view) {
        mo5216p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m23686T(View view) {
        mo5216p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m23687U(View view) {
        m23696Y(false);
        ((a0s) this.f3799b).m9260Z3(this.f20899s.getText().toString());
    }

    /* JADX INFO: renamed from: r */
    private void m23688r() {
        xdl0.E0(this.f20892l, new View.OnClickListener() { // from class: l.ozr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16921a.m23685S(view);
            }
        });
        xdl0.E0(this.f20895o, new View.OnClickListener() { // from class: l.pzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17733a.m23686T(view);
            }
        });
        m23684Q();
        xdl0.E0(this.f20897q, new View.OnClickListener() { // from class: l.qzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18294a.m23687U(view);
            }
        });
        this.f20896p.setText(ypv.k().R3());
        this.f20901u = ypv.k().S3();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return this.f20895o.getContext();
    }

    /* JADX INFO: renamed from: N */
    public final void m23689N(View view) {
        vzr.m24235a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public View m23690O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vzr.m24236b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ CharSequence m23692R(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f20901u - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            lsi0.y(ypv.e.getString(R$string.f2737G6, Integer.valueOf(this.f20901u)));
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m23693V() {
        ((a0s) this.f3799b).act().showInput(this.f20899s, 0);
    }

    /* JADX INFO: renamed from: W */
    public final void m23694W() {
        m23696Y(this.f20899s.getText() != null && k25.m16466b(this.f20899s.getText().toString()).length() > 0);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: X */
    public final void m23695X(Editable editable) {
        int length = editable == null ? 0 : editable.toString().length();
        this.f20900t.setText(length + "/" + this.f20901u);
    }

    /* JADX INFO: renamed from: Y */
    public void m23696Y(boolean z) {
        this.f20897q.setEnabled(z);
        this.f20897q.setTextColor(kvc0.a(z ? h1c0.f11814p0 : h1c0.f11808n0));
    }

    /* JADX INFO: renamed from: Z */
    public void m23697Z(BLiveSuperChatDetail bLiveSuperChatDetail) {
        m5211E();
        this.f20899s.setEnabled(bLiveSuperChatDetail.canSend);
        boolean z = bLiveSuperChatDetail.canSend;
        VEditText vEditText = this.f20899s;
        if (!z) {
            vEditText.setHint("已有一条喊话消息审核中，暂无法使用");
        } else {
            vEditText.requestFocus();
            e51.H(act(), new Runnable() { // from class: l.tzr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20439a.m23693V();
                }
            }, 200L);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m23690O(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m23689N(view);
        m23688r();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo5219w() {
        super.mo5219w();
        this.f20899s.setText("");
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(a0s a0sVar) {
    }

    /* JADX INFO: renamed from: l.uzr$a */
    public class C0857a implements TextWatcher {
        public C0857a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            uzr.this.m23694W();
            uzr.this.m23695X(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
