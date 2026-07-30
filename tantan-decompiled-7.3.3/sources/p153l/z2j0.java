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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveGuardTopChatTemplateItem;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import p151v.VDraweeView;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class z2j0 extends LiveMenuDialogHolder<g3j0> {

    /* JADX INFO: renamed from: A */
    public VText f202689A;

    /* JADX INFO: renamed from: B */
    public int f202690B;

    /* JADX INFO: renamed from: C */
    public BLiveGuardTopChatTemplateItem f202691C;

    /* JADX INFO: renamed from: D */
    public BLiveGuardTopChatTemplateItem f202692D;

    /* JADX INFO: renamed from: k */
    public View f202693k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f202694l;

    /* JADX INFO: renamed from: m */
    public TextView f202695m;

    /* JADX INFO: renamed from: n */
    public ImageView f202696n;

    /* JADX INFO: renamed from: o */
    public View f202697o;

    /* JADX INFO: renamed from: p */
    public View f202698p;

    /* JADX INFO: renamed from: q */
    public View f202699q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f202700r;

    /* JADX INFO: renamed from: s */
    public TextView f202701s;

    /* JADX INFO: renamed from: t */
    public TextView f202702t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f202703u;

    /* JADX INFO: renamed from: v */
    public TextView f202704v;

    /* JADX INFO: renamed from: w */
    public TextView f202705w;

    /* JADX INFO: renamed from: x */
    public TextView f202706x;

    /* JADX INFO: renamed from: y */
    public VEditText f202707y;

    /* JADX INFO: renamed from: z */
    public TextView f202708z;

    public z2j0(Act act, @NonNull g3j0 g3j0Var) {
        super(yec0.f199036c6, act, g3j0Var);
        this.f202690B = -1;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ CharSequence m218421G(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
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

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ CharSequence m218422H(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = 10 - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            o1j0.m165651y(zrv.f205803e.getString(R$string.f47543G6, 10));
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }

    /* JADX INFO: renamed from: S */
    private void m218429S() {
        this.f202707y.setFilters(new InputFilter[]{new InputFilter() { // from class: l.v2j0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return z2j0.m218421G(charSequence, i, i2, spanned, i3, i4);
            }
        }, new InputFilter() { // from class: l.w2j0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return z2j0.m218422H(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        this.f202707y.addTextChangedListener(new C21750a());
        m218434Z(this.f202707y.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m218430T(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m218431U(View view) {
        mo73021p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m218432V(View view) {
        int i;
        if (!view.isEnabled() || (i = this.f202690B) == -1) {
            return;
        }
        m218445d0((i == 1 ? this.f202691C : this.f202692D).giftId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m218433Y() {
        this.f202689A.setEnabled((this.f202707y.getText() == null || j35.m143317b(this.f202707y.getText().toString()).length() <= 0 || this.f202690B == -1) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Z */
    public void m218434Z(Editable editable) {
        int length = editable == null ? 0 : editable.toString().length();
        this.f202708z.setText(length + "/10");
    }

    /* JADX INFO: renamed from: r */
    private void m218435r() {
        bnl0.m105509E0(this.f202693k, new View.OnClickListener() { // from class: l.s2j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165901a.m218430T(view);
            }
        });
        m218429S();
        bnl0.m105509E0(this.f202696n, new View.OnClickListener() { // from class: l.t2j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171770a.m218431U(view);
            }
        });
        bnl0.m105509E0(this.f202689A, new View.OnClickListener() { // from class: l.u2j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177218a.m218432V(view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: O */
    public final void m218436O(View view) {
        a3j0.m95803a(this, view);
    }

    /* JADX INFO: renamed from: P */
    public View m218437P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a3j0.m95804b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public void m218439R() {
        this.f202707y.setText("");
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m218440W(View view) {
        if (this.f202691C.num > 0) {
            this.f202698p.setSelected(true);
            this.f202699q.setSelected(false);
            this.f202690B = 1;
            m218433Y();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m218441X(View view) {
        if (this.f202692D.num > 0) {
            this.f202698p.setSelected(false);
            this.f202699q.setSelected(true);
            this.f202690B = 2;
            m218433Y();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m218442a0(List<BLiveGuardTopChatTemplateItem> list) {
        if (list.get(0) != null) {
            BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem = list.get(0);
            this.f202691C = bLiveGuardTopChatTemplateItem;
            this.f202701s.setText(bLiveGuardTopChatTemplateItem.title);
            this.f202702t.setText(xau.m209911u(R$string.f47595Ie, Integer.valueOf(this.f202691C.num)));
            izs.m142870u("context_livingAct", this.f202700r, this.f202691C.icon, qa00.m175859d(46.0f), qa00.m175859d(46.0f));
            this.f202698p.setOnClickListener(new View.OnClickListener() { // from class: l.x2j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f192156a.m218440W(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m218443b0(List<BLiveGuardTopChatTemplateItem> list) {
        if (list.get(1) != null) {
            BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem = list.get(1);
            this.f202692D = bLiveGuardTopChatTemplateItem;
            this.f202704v.setText(bLiveGuardTopChatTemplateItem.title);
            this.f202705w.setText(xau.m209911u(R$string.f47595Ie, Integer.valueOf(this.f202692D.num)));
            izs.m142870u("context_livingAct", this.f202703u, this.f202692D.icon, qa00.m175859d(46.0f), qa00.m175859d(46.0f));
            this.f202699q.setOnClickListener(new View.OnClickListener() { // from class: l.y2j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197263a.m218441X(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m218444c0(BLiveSuperChatDetail bLiveSuperChatDetail) {
        List<BLiveGuardTopChatTemplateItem> list = bLiveSuperChatDetail.templates;
        if (jyb.m147479J(list) || list.size() < 2) {
            return;
        }
        m73017E();
        m218442a0(list);
        m218443b0(list);
        this.f202707y.setEnabled(bLiveSuperChatDetail.canSend);
        this.f202707y.setHint(bLiveSuperChatDetail.canSend ? "说点什么" : "已有一条聊聊消息审核中，暂无法使用");
        this.f202689A.setEnabled(bLiveSuperChatDetail.canSend);
        if (bLiveSuperChatDetail.canSend) {
            if (this.f202691C.num > 0) {
                this.f202698p.performClick();
            } else if (this.f202692D.num > 0) {
                this.f202699q.performClick();
            }
            m218433Y();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m218445d0(int i) {
        ((g3j0) this.f48605b).m128742c4(i + "", this.f202707y.getText().toString());
        this.f202689A.setEnabled(false);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m218437P(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
        super.mo73019m(view);
        m218436O(view);
        m218435r();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo73024w() {
        super.mo73024w();
        m218439R();
        View view = this.f202698p;
        if (view != null) {
            view.setSelected(false);
        }
        if (this.f202698p != null) {
            this.f202699q.setSelected(false);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(g3j0 g3j0Var) {
    }

    /* JADX INFO: renamed from: l.z2j0$a */
    public class C21750a implements TextWatcher {
        public C21750a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            z2j0.this.m218433Y();
            z2j0.this.m218434Z(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
