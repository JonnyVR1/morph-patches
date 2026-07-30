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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveGuardTopChatTemplateItem;
import com.p046p1.mobile.putong.live.base.data.BLiveSuperChatDetail;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder;
import java.util.List;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vti0 extends LiveMenuDialogHolder<cui0> {

    /* JADX INFO: renamed from: A */
    public VText f182948A;

    /* JADX INFO: renamed from: B */
    public int f182949B;

    /* JADX INFO: renamed from: C */
    public BLiveGuardTopChatTemplateItem f182950C;

    /* JADX INFO: renamed from: D */
    public BLiveGuardTopChatTemplateItem f182951D;

    /* JADX INFO: renamed from: k */
    public View f182952k;

    /* JADX INFO: renamed from: l */
    public ConstraintLayout f182953l;

    /* JADX INFO: renamed from: m */
    public TextView f182954m;

    /* JADX INFO: renamed from: n */
    public ImageView f182955n;

    /* JADX INFO: renamed from: o */
    public View f182956o;

    /* JADX INFO: renamed from: p */
    public View f182957p;

    /* JADX INFO: renamed from: q */
    public View f182958q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f182959r;

    /* JADX INFO: renamed from: s */
    public TextView f182960s;

    /* JADX INFO: renamed from: t */
    public TextView f182961t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f182962u;

    /* JADX INFO: renamed from: v */
    public TextView f182963v;

    /* JADX INFO: renamed from: w */
    public TextView f182964w;

    /* JADX INFO: renamed from: x */
    public TextView f182965x;

    /* JADX INFO: renamed from: y */
    public VEditText f182966y;

    /* JADX INFO: renamed from: z */
    public TextView f182967z;

    public vti0(Act act, @NonNull cui0 cui0Var) {
        super(t6c0.f168304c6, act, cui0Var);
        this.f182949B = -1;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ CharSequence m200004G(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
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

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ CharSequence m200005H(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        int length = 10 - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            lsi0.m151595y(ypv.f199497e.getString(R$string.f46695G6, 10));
            return "";
        }
        if (length >= i2 - i) {
            return null;
        }
        int i5 = length + i;
        return (Character.isHighSurrogate(charSequence.charAt(i5 + (-1))) && (i5 = i5 + (-1)) == i) ? "" : charSequence.subSequence(i, i5);
    }

    /* JADX INFO: renamed from: S */
    private void m200012S() {
        this.f182966y.setFilters(new InputFilter[]{new InputFilter() { // from class: l.rti0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return vti0.m200004G(charSequence, i, i2, spanned, i3, i4);
            }
        }, new InputFilter() { // from class: l.sti0
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return vti0.m200005H(charSequence, i, i2, spanned, i3, i4);
            }
        }});
        this.f182966y.addTextChangedListener(new C20726a());
        m200017Z(this.f182966y.getText());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m200013T(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m200014U(View view) {
        mo71838p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m200015V(View view) {
        int i;
        if (!view.isEnabled() || (i = this.f182949B) == -1) {
            return;
        }
        m200028d0((i == 1 ? this.f182950C : this.f182951D).giftId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m200016Y() {
        this.f182948A.setEnabled((this.f182966y.getText() == null || k25.m144261b(this.f182966y.getText().toString()).length() <= 0 || this.f182949B == -1) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: Z */
    public void m200017Z(Editable editable) {
        int length = editable == null ? 0 : editable.toString().length();
        this.f182967z.setText(length + "/10");
    }

    /* JADX INFO: renamed from: r */
    private void m200018r() {
        xdl0.m208329E0(this.f182952k, new View.OnClickListener() { // from class: l.oti0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f145593a.m200013T(view);
            }
        });
        m200012S();
        xdl0.m208329E0(this.f182955n, new View.OnClickListener() { // from class: l.pti0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f151166a.m200014U(view);
            }
        });
        xdl0.m208329E0(this.f182948A, new View.OnClickListener() { // from class: l.qti0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156367a.m200015V(view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: O */
    public final void m200019O(View view) {
        wti0.m205538a(this, view);
    }

    /* JADX INFO: renamed from: P */
    public View m200020P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wti0.m205539b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: R */
    public void m200022R() {
        this.f182966y.setText("");
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m200023W(View view) {
        if (this.f182950C.num > 0) {
            this.f182957p.setSelected(true);
            this.f182958q.setSelected(false);
            this.f182949B = 1;
            m200016Y();
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m200024X(View view) {
        if (this.f182951D.num > 0) {
            this.f182957p.setSelected(false);
            this.f182958q.setSelected(true);
            this.f182949B = 2;
            m200016Y();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m200025a0(List<BLiveGuardTopChatTemplateItem> list) {
        if (list.get(0) != null) {
            BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem = list.get(0);
            this.f182950C = bLiveGuardTopChatTemplateItem;
            this.f182960s.setText(bLiveGuardTopChatTemplateItem.title);
            this.f182961t.setText(w8u.m202218u(R$string.f46747Ie, Integer.valueOf(this.f182950C.num)));
            hxs.m133408u("context_livingAct", this.f182959r, this.f182950C.icon, t100.m186890d(46.0f), t100.m186890d(46.0f));
            this.f182957p.setOnClickListener(new View.OnClickListener() { // from class: l.tti0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f172030a.m200023W(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m200026b0(List<BLiveGuardTopChatTemplateItem> list) {
        if (list.get(1) != null) {
            BLiveGuardTopChatTemplateItem bLiveGuardTopChatTemplateItem = list.get(1);
            this.f182951D = bLiveGuardTopChatTemplateItem;
            this.f182963v.setText(bLiveGuardTopChatTemplateItem.title);
            this.f182964w.setText(w8u.m202218u(R$string.f46747Ie, Integer.valueOf(this.f182951D.num)));
            hxs.m133408u("context_livingAct", this.f182962u, this.f182951D.icon, t100.m186890d(46.0f), t100.m186890d(46.0f));
            this.f182958q.setOnClickListener(new View.OnClickListener() { // from class: l.uti0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178271a.m200024X(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m200027c0(BLiveSuperChatDetail bLiveSuperChatDetail) {
        List<BLiveGuardTopChatTemplateItem> list = bLiveSuperChatDetail.templates;
        if (vwb.m200296J(list) || list.size() < 2) {
            return;
        }
        m71834E();
        m200025a0(list);
        m200026b0(list);
        this.f182966y.setEnabled(bLiveSuperChatDetail.canSend);
        this.f182966y.setHint(bLiveSuperChatDetail.canSend ? "说点什么" : "已有一条聊聊消息审核中，暂无法使用");
        this.f182948A.setEnabled(bLiveSuperChatDetail.canSend);
        if (bLiveSuperChatDetail.canSend) {
            if (this.f182950C.num > 0) {
                this.f182957p.performClick();
            } else if (this.f182951D.num > 0) {
                this.f182958q.performClick();
            }
            m200016Y();
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m200028d0(int i) {
        ((cui0) this.f47757b).m108783c4(i + "", this.f182966y.getText().toString());
        this.f182948A.setEnabled(false);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder, p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m200020P(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
        super.mo71836m(view);
        m200019O(view);
        m200018r();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: w */
    public void mo71841w() {
        super.mo71841w();
        m200022R();
        View view = this.f182957p;
        if (view != null) {
            view.setSelected(false);
        }
        if (this.f182957p != null) {
            this.f182958q.setSelected(false);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.module.LiveMenuDialogHolder
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(cui0 cui0Var) {
    }

    /* JADX INFO: renamed from: l.vti0$a */
    public class C20726a implements TextWatcher {
        public C20726a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            vti0.this.m200016Y();
            vti0.this.m200017Z(editable);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
