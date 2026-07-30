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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveGuardTopChatTemplateItem;
import com.p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import java.util.List;
import l.hxs;
import l.lsi0;
import l.t0g0;
import l.t100;
import l.vwb;
import l.w8u;
import l.xdl0;
import l.ypv;
import v.VDraweeView;
import v.VEditText;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vti0 extends LiveMenuDialogHolder<cui0> {

    /* JADX INFO: renamed from: A */
    public VText f21298A;

    /* JADX INFO: renamed from: B */
    public int f21299B;

    /* JADX INFO: renamed from: C */
    public BLiveGuardTopChatTemplateItem f21300C;

    /* JADX INFO: renamed from: D */
    public BLiveGuardTopChatTemplateItem f21301D;

    /* JADX INFO: renamed from: k */
    public View f21302k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f21303l;

    /* JADX INFO: renamed from: m */
    public TextView f21304m;

    /* JADX INFO: renamed from: n */
    public ImageView f21305n;

    /* JADX INFO: renamed from: o */
    public View f21306o;

    /* JADX INFO: renamed from: p */
    public View f21307p;

    /* JADX INFO: renamed from: q */
    public View f21308q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f21309r;

    /* JADX INFO: renamed from: s */
    public TextView f21310s;

    /* JADX INFO: renamed from: t */
    public TextView f21311t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f21312u;

    /* JADX INFO: renamed from: v */
    public TextView f21313v;

    /* JADX INFO: renamed from: w */
    public TextView f21314w;

    /* JADX INFO: renamed from: x */
    public TextView f21315x;

    /* JADX INFO: renamed from: y */
    public VEditText f21316y;

    /* JADX INFO: renamed from: z */
    public TextView f21317z;

    public vti0(Act act, @NonNull cui0 cui0Var) {
        super(t6c0.f19800c6, act, cui0Var);
        this.f21299B = -1;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ CharSequence m24133G(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
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

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ CharSequence m24134H(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = 10 - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            lsi0.y(ypv.e.getString(R$string.f2737G6, 10));
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }

    /* JADX INFO: renamed from: S */
    private void m24141S() {
        this.f21316y.setFilters(new InputFilter[]{new InputFilter() { // from class: l.rti0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return vti0.m24133G(charSequence, i, i2, spanned, i3, i4);
            }
        }, new InputFilter() { // from class: l.sti0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return vti0.m24134H(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        this.f21316y.addTextChangedListener(new C0866a());
        m24146Z(this.f21316y.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m24142T(View view) {
        mo5216p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m24143U(View view) {
        mo5216p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m24144V(View view) {
        int i;
        if (!view.isEnabled() || (i = this.f21299B) == -1) {
            return;
        }
        m24157d0((i == 1 ? this.f21300C : this.f21301D).giftId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m24145Y() {
        this.f21298A.setEnabled((this.f21316y.getText() == null || k25.m16466b(this.f21316y.getText().toString()).length() <= 0 || this.f21299B == -1) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Z */
    public void m24146Z(Editable editable) {
        int length = editable == null ? 0 : editable.toString().length();
        this.f21317z.setText(length + "/10");
    }

    /* JADX INFO: renamed from: r */
    private void m24147r() {
        xdl0.E0(this.f21302k, new View.OnClickListener() { // from class: l.oti0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16785a.m24142T(view);
            }
        });
        m24141S();
        xdl0.E0(this.f21305n, new View.OnClickListener() { // from class: l.pti0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17643a.m24143U(view);
            }
        });
        xdl0.E0(this.f21298A, new View.OnClickListener() { // from class: l.qti0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f18222a.m24144V(view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return mo5210C0();
    }

    /* JADX INFO: renamed from: O */
    public final void m24148O(View view) {
        wti0.m25478a(this, view);
    }

    /* JADX INFO: renamed from: P */
    public View m24149P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wti0.m25479b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public void m24151R() {
        this.f21316y.setText("");
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m24152W(View view) {
        if (this.f21300C.num > 0) {
            this.f21307p.setSelected(true);
            this.f21308q.setSelected(false);
            this.f21299B = 1;
            m24145Y();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m24153X(View view) {
        if (this.f21301D.num > 0) {
            this.f21307p.setSelected(false);
            this.f21308q.setSelected(true);
            this.f21299B = 2;
            m24145Y();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m24154a0(List<BLiveGuardTopChatTemplateItem> list) {
        if (list.get(0) != null) {
            BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem = list.get(0);
            this.f21300C = bLiveGuardTopChatTemplateItem;
            this.f21310s.setText(bLiveGuardTopChatTemplateItem.title);
            this.f21311t.setText(w8u.u(R$string.f2789Ie, Integer.valueOf(this.f21300C.num)));
            hxs.u("context_livingAct", this.f21309r, this.f21300C.icon, t100.d(46.0f), t100.d(46.0f));
            this.f21307p.setOnClickListener(new View.OnClickListener() { // from class: l.tti0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20375a.m24152W(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m24155b0(List<BLiveGuardTopChatTemplateItem> list) {
        if (list.get(1) != null) {
            BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem = list.get(1);
            this.f21301D = bLiveGuardTopChatTemplateItem;
            this.f21313v.setText(bLiveGuardTopChatTemplateItem.title);
            this.f21314w.setText(w8u.u(R$string.f2789Ie, Integer.valueOf(this.f21301D.num)));
            hxs.u("context_livingAct", this.f21312u, this.f21301D.icon, t100.d(46.0f), t100.d(46.0f));
            this.f21308q.setOnClickListener(new View.OnClickListener() { // from class: l.uti0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20793a.m24153X(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m24156c0(BLiveSuperChatDetail bLiveSuperChatDetail) {
        List<BLiveGuardTopChatTemplateItem> list = bLiveSuperChatDetail.templates;
        if (vwb.J(list) || list.size() < 2) {
            return;
        }
        m5211E();
        m24154a0(list);
        m24155b0(list);
        this.f21316y.setEnabled(bLiveSuperChatDetail.canSend);
        this.f21316y.setHint(bLiveSuperChatDetail.canSend ? "说点什么" : "已有一条聊聊消息审核中，暂无法使用");
        this.f21298A.setEnabled(bLiveSuperChatDetail.canSend);
        if (bLiveSuperChatDetail.canSend) {
            if (this.f21300C.num > 0) {
                this.f21307p.performClick();
            } else if (this.f21301D.num > 0) {
                this.f21308q.performClick();
            }
            m24145Y();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m24157d0(int i) {
        ((cui0) this.f3799b).m11377c4(i + "", this.f21316y.getText().toString());
        this.f21298A.setEnabled(false);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m24149P(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
        super.mo5214m(view);
        m24148O(view);
        m24147r();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo5219w() {
        super.mo5219w();
        m24151R();
        View view = this.f21307p;
        if (view != null) {
            view.setSelected(false);
        }
        if (this.f21307p != null) {
            this.f21308q.setSelected(false);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(cui0 cui0Var) {
    }

    /* JADX INFO: renamed from: l.vti0$a */
    public class C0866a implements TextWatcher {
        public C0866a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            vti0.this.m24145Y();
            vti0.this.m24146Z(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
