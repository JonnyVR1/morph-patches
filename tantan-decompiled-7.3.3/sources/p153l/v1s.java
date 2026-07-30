package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class v1s extends LiveMenuDialogHolder<b2s> {

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f182003k;

    /* JADX INFO: renamed from: l */
    public View f182004l;

    /* JADX INFO: renamed from: m */
    public View f182005m;

    /* JADX INFO: renamed from: n */
    public View f182006n;

    /* JADX INFO: renamed from: o */
    public VImage f182007o;

    /* JADX INFO: renamed from: p */
    public VText f182008p;

    /* JADX INFO: renamed from: q */
    public TextView f182009q;

    /* JADX INFO: renamed from: r */
    public View f182010r;

    /* JADX INFO: renamed from: s */
    public VEditText f182011s;

    /* JADX INFO: renamed from: t */
    public TextView f182012t;

    /* JADX INFO: renamed from: u */
    public int f182013u;

    public v1s(Act act, @NonNull b2s b2sVar) {
        super(yec0.f198739E, jgc0.f120700g, act, b2sVar);
        this.f182013u = 15;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ CharSequence m199062G(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char c : charArray) {
            if (!a9g0.m96574i(c)) {
                sb.append(c);
            }
        }
        if (TextUtils.isEmpty(sb)) {
            return "";
        }
        return null;
    }

    /* JADX INFO: renamed from: Q */
    private void m199069Q() {
        this.f182011s.setFilters(new InputFilter[]{new InputFilter() { // from class: l.s1s
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return v1s.m199062G(charSequence, i, i2, spanned, i3, i4);
            }
        }, new InputFilter() { // from class: l.t1s
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return this.f171691a.m199077R(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        this.f182011s.addTextChangedListener(new C20721a());
        m199080X(this.f182011s.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m199070S(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m199071T(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m199072U(View view) {
        m199081Y(false);
        ((b2s) this.f48605b).m102246Z3(this.f182011s.getText().toString());
    }

    /* JADX INFO: renamed from: r */
    private void m199073r() {
        bnl0.m105509E0(this.f182004l, new View.OnClickListener() { // from class: l.p1s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150193a.m199070S(view);
            }
        });
        bnl0.m105509E0(this.f182007o, new View.OnClickListener() { // from class: l.q1s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155220a.m199071T(view);
            }
        });
        m199069Q();
        bnl0.m105509E0(this.f182009q, new View.OnClickListener() { // from class: l.r1s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160850a.m199072U(view);
            }
        });
        this.f182008p.setText(zrv.m221193k().m203506R3());
        this.f182013u = zrv.m221193k().m203514S3();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f182007o.getContext();
    }

    /* JADX INFO: renamed from: N */
    public final void m199074N(View view) {
        w1s.m204470a(this, view);
    }

    /* JADX INFO: renamed from: O */
    public View m199075O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w1s.m204471b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ CharSequence m199077R(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = this.f182013u - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47543G6, Integer.valueOf(this.f182013u)));
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m199078V() {
        ((b2s) this.f48605b).act().showInput(this.f182011s, 0);
    }

    /* JADX INFO: renamed from: W */
    public final void m199079W() {
        m199081Y(this.f182011s.getText() != null && j35.m143317b(this.f182011s.getText().toString()).length() > 0);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: X */
    public final void m199080X(Editable editable) {
        int length = editable == null ? 0 : editable.toString().length();
        this.f182012t.setText(length + "/" + this.f182013u);
    }

    /* JADX INFO: renamed from: Y */
    public void m199081Y(boolean z) {
        this.f182009q.setEnabled(z);
        this.f182009q.setTextColor(n3d0.m161277a(z ? n9c0.f140855p0 : n9c0.f140849n0));
    }

    /* JADX INFO: renamed from: Z */
    public void m199082Z(BLiveSuperChatDetail bLiveSuperChatDetail) {
        m73017E();
        this.f182011s.setEnabled(bLiveSuperChatDetail.canSend);
        boolean z = bLiveSuperChatDetail.canSend;
        VEditText vEditText = this.f182011s;
        if (!z) {
            vEditText.setHint("已有一条喊话消息审核中，暂无法使用");
        } else {
            vEditText.requestFocus();
            l51.m152888H(act(), new Runnable() { // from class: l.u1s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177131a.m199078V();
                }
            }, 200L);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m199075O(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m199074N(view);
        m199073r();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        this.f182011s.setText("");
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b2s b2sVar) {
    }

    /* JADX INFO: renamed from: l.v1s$a */
    public class C20721a implements TextWatcher {
        public C20721a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            v1s.this.m199079W();
            v1s.this.m199080X(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
