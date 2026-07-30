package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class uzr extends LiveMenuDialogHolder<a0s> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f179017k;

    /* JADX INFO: renamed from: l */
    public View f179018l;

    /* JADX INFO: renamed from: m */
    public View f179019m;

    /* JADX INFO: renamed from: n */
    public View f179020n;

    /* JADX INFO: renamed from: o */
    public VImage f179021o;

    /* JADX INFO: renamed from: p */
    public VText f179022p;

    /* JADX INFO: renamed from: q */
    public TextView f179023q;

    /* JADX INFO: renamed from: r */
    public View f179024r;

    /* JADX INFO: renamed from: s */
    public VEditText f179025s;

    /* JADX INFO: renamed from: t */
    public TextView f179026t;

    /* JADX INFO: renamed from: u */
    public int f179027u;

    public uzr(Act act, @NonNull a0s a0sVar) {
        super(t6c0.f168007E, d8c0.f84852g, act, a0sVar);
        this.f179027u = 15;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ CharSequence m196434G(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!t0g0.m186868i(c)) {
                sb.append(c);
            }
        }
        if (TextUtils.isEmpty(sb)) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    private void m196441Q() {
        this.f179025s.setFilters(new InputFilter[]{new InputFilter() { // from class: l.rzr
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return uzr.m196434G(charSequence, i, i2, spanned, i3, i4);
            }
        }, new InputFilter() { // from class: l.szr
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return this.f167073a.m196449R(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        this.f179025s.addTextChangedListener(new C20548a());
        m196452X(this.f179025s.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m196442S(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m196443T(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m196444U(View view) {
        m196453Y(false);
        ((a0s) this.f47757b).m94475Z3(this.f179025s.getText().toString());
    }

    /* JADX INFO: renamed from: r */
    private void m196445r() {
        xdl0.m208329E0(this.f179018l, new View.OnClickListener() { // from class: l.ozr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146494a.m196442S(view);
            }
        });
        xdl0.m208329E0(this.f179021o, new View.OnClickListener() { // from class: l.pzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151970a.m196443T(view);
            }
        });
        m196441Q();
        xdl0.m208329E0(this.f179023q, new View.OnClickListener() { // from class: l.qzr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157090a.m196444U(view);
            }
        });
        this.f179022p.setText(ypv.m215672k().m195719R3());
        this.f179027u = ypv.m215672k().m195727S3();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f179021o.getContext();
    }

    /* JADX INFO: renamed from: N */
    public final void m196446N(View view) {
        vzr.m200778a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public View m196447O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vzr.m200779b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ CharSequence m196449R(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f179027u - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46695G6, Integer.valueOf(this.f179027u)));
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m196450V() {
        ((a0s) this.f47757b).act().showInput(this.f179025s, 0);
    }

    /* JADX INFO: renamed from: W */
    public final void m196451W() {
        m196453Y(this.f179025s.getText() != null && k25.m144261b(this.f179025s.getText().toString()).length() > 0);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: X */
    public final void m196452X(Editable editable) {
        int length = editable == null ? 0 : editable.toString().length();
        this.f179026t.setText(length + "/" + this.f179027u);
    }

    /* JADX INFO: renamed from: Y */
    public void m196453Y(boolean z) {
        this.f179023q.setEnabled(z);
        this.f179023q.setTextColor(kvc0.m147352a(z ? h1c0.f105394p0 : h1c0.f105388n0));
    }

    /* JADX INFO: renamed from: Z */
    public void m196454Z(BLiveSuperChatDetail bLiveSuperChatDetail) {
        m71834E();
        this.f179025s.setEnabled(bLiveSuperChatDetail.canSend);
        boolean z = bLiveSuperChatDetail.canSend;
        VEditText vEditText = this.f179025s;
        if (!z) {
            vEditText.setHint("已有一条喊话消息审核中，暂无法使用");
        } else {
            vEditText.requestFocus();
            e51.m114743H(act(), new Runnable() { // from class: l.tzr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f172751a.m196450V();
                }
            }, 200L);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m196447O(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m196446N(view);
        m196445r();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        this.f179025s.setText("");
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(a0s a0sVar) {
    }

    /* JADX INFO: renamed from: l.uzr$a */
    public class C20548a implements TextWatcher {
        public C20548a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            uzr.this.m196451W();
            uzr.this.m196452X(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
