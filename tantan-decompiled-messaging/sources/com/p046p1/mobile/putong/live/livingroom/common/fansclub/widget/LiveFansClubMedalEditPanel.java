package com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseMedalPanel;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalColor;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalEditInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalEditTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalIcon;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel;
import p147v.VEditText;
import p147v.VImage;
import p147v.VText;
import p149l.byr;
import p149l.d8c0;
import p149l.e30;
import p149l.edg;
import p149l.ffw;
import p149l.h9g;
import p149l.i0g0;
import p149l.jbs;
import p149l.kbs;
import p149l.kvc0;
import p149l.lsi0;
import p149l.q9g;
import p149l.s7m;
import p149l.t0g0;
import p149l.t100;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;
import p149l.yb2;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubMedalEditPanel extends RelativeLayout implements s7m<q9g> {

    /* JADX INFO: renamed from: F */
    public static final int f49096F = t100.m186890d(127.0f);

    /* JADX INFO: renamed from: G */
    public static final int f49097G = t100.m186890d(562.0f);

    /* JADX INFO: renamed from: A */
    public VText f49098A;

    /* JADX INFO: renamed from: B */
    public VText f49099B;

    /* JADX INFO: renamed from: C */
    public q9g f49100C;

    /* JADX INFO: renamed from: D */
    public DialogC12611a f49101D;

    /* JADX INFO: renamed from: E */
    public String f49102E;

    /* JADX INFO: renamed from: a */
    public LinearLayout f49103a;

    /* JADX INFO: renamed from: b */
    public View f49104b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f49105c;

    /* JADX INFO: renamed from: d */
    public VEditText f49106d;

    /* JADX INFO: renamed from: e */
    public VText f49107e;

    /* JADX INFO: renamed from: f */
    public View f49108f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f49109g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f49110h;

    /* JADX INFO: renamed from: i */
    public VImage f49111i;

    /* JADX INFO: renamed from: j */
    public VImage f49112j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f49113k;

    /* JADX INFO: renamed from: l */
    public VText f49114l;

    /* JADX INFO: renamed from: m */
    public View f49115m;

    /* JADX INFO: renamed from: n */
    public View f49116n;

    /* JADX INFO: renamed from: o */
    public View f49117o;

    /* JADX INFO: renamed from: p */
    public View f49118p;

    /* JADX INFO: renamed from: q */
    public View f49119q;

    /* JADX INFO: renamed from: r */
    public View f49120r;

    /* JADX INFO: renamed from: s */
    public View f49121s;

    /* JADX INFO: renamed from: t */
    public ScrollView f49122t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f49123u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f49124v;

    /* JADX INFO: renamed from: w */
    public VText f49125w;

    /* JADX INFO: renamed from: x */
    public VText f49126x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f49127y;

    /* JADX INFO: renamed from: z */
    public VText f49128z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel$a */
    public class C12759a implements TextWatcher {
        public C12759a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LiveFansClubMedalEditPanel.this.f49107e.setEnabled(editable.toString().trim().length() > 0);
            if (LiveFansClubMedalEditPanel.this.m72953K()) {
                if (i0g0.m133843J(editable.toString()) > 6) {
                    lsi0.m151578h(R$string.f47184d4);
                    LiveFansClubMedalEditPanel liveFansClubMedalEditPanel = LiveFansClubMedalEditPanel.this;
                    liveFansClubMedalEditPanel.f49106d.setText(editable.subSequence(0, liveFansClubMedalEditPanel.m72951I(editable) + 1));
                    VEditText vEditText = LiveFansClubMedalEditPanel.this.f49106d;
                    vEditText.setSelection(vEditText.getText().length());
                    return;
                }
                return;
            }
            char[] charArray = editable.toString().toCharArray();
            if (LiveFansClubMedalEditPanel.this.m72949F(charArray)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (char c : charArray) {
                if (!LiveFansClubMedalEditPanel.this.m72949F((sb.toString() + c).toCharArray())) {
                    lsi0.m151578h(R$string.f47184d4);
                    break;
                }
                sb.append(c);
            }
            LiveFansClubMedalEditPanel.this.f49106d.setText(sb);
            VEditText vEditText2 = LiveFansClubMedalEditPanel.this.f49106d;
            vEditText2.setSelection(vEditText2.getText().length());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel$b */
    public class RunnableC12760b implements Runnable {
        public RunnableC12760b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveFansClubMedalEditPanel.this.f49122t.fullScroll(33);
        }
    }

    public LiveFansClubMedalEditPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: H */
    private void m72920H() {
        DialogC12611a dialogC12611a = this.f49101D;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        Act act = act();
        if (act != null) {
            act.hideInput(this.f49106d);
        }
        this.f49101D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m72921L(View view) {
        this.f49100C.m173624c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m72922M() {
        this.f49100C.m173625d4(getColor(), getIcon(), getText());
        this.f49102E = "unclickable";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m72923N(View view) {
        if (TextUtils.equals(this.f49102E, "editable")) {
            act().dialog().m20504F(getResources().getString(R$string.f47096Z3)).m20560v0(getResources().getString(R$string.f47118a4), new Runnable() { // from class: l.hbs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106960a.m72922M();
                }
            }).m20543m0(getResources().getString(R$string.f47075Y3)).m20549q(true).m20568z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m72924O(View view) {
        this.f49100C.m173615S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m72925Q(View view) {
        m72969f0();
    }

    private String getColor() {
        int childCount = this.f49123u.getChildCount();
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f49123u.getChildAt(i);
            if (medalEditItemView.m73009b()) {
                return medalEditItemView.getName();
            }
        }
        return "";
    }

    private String getIcon() {
        int childCount = this.f49124v.getChildCount();
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f49124v.getChildAt(i);
            if (medalEditItemView.m73009b()) {
                return medalEditItemView.getName();
            }
        }
        return "";
    }

    private InputFilter[] getInputFilter() {
        return new InputFilter[]{new InputFilter() { // from class: l.tas
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return LiveFansClubMedalEditPanel.m72934k(charSequence, i, i2, spanned, i3, i4);
            }
        }};
    }

    private InputFilter[] getIntlInputFilter() {
        return new InputFilter[]{new InputFilter() { // from class: l.fbs
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return LiveFansClubMedalEditPanel.m72932i(charSequence, i, i2, spanned, i3, i4);
            }
        }, new InputFilter() { // from class: l.gbs
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return LiveFansClubMedalEditPanel.m72938p(charSequence, i, i2, spanned, i3, i4);
            }
        }};
    }

    private String getText() {
        CharSequence text = this.f49125w.getText();
        return text == null ? "" : text.toString();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m72932i(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        for (char c : charSequence.toString().toCharArray()) {
            if (t0g0.m186868i(c)) {
                lsi0.m151578h(R$string.f47162c4);
                return "";
            }
        }
        return null;
    }

    private void init() {
        this.f49125w.setBackground(yb2.m213876a(-394759, t100.f167264m, false));
        xdl0.m208329E0(this.f49112j, new View.OnClickListener() { // from class: l.abs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68744a.m72921L(view);
            }
        });
        xdl0.m208329E0(this.f49127y, new View.OnClickListener() { // from class: l.bbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f74875a.m72923N(view);
            }
        });
        xdl0.m208329E0(this.f49108f, new View.OnClickListener() { // from class: l.cbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f80179a.m72924O(view);
            }
        });
        xdl0.m208329E0(this.f49111i, new View.OnClickListener() { // from class: l.dbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f85338a.m72954P(view);
            }
        });
        xdl0.m208329E0(this.f49125w, new View.OnClickListener() { // from class: l.ebs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90376a.m72925Q(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ CharSequence m72934k(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        if (charArray.length <= 0) {
            return null;
        }
        char c = charArray[0];
        if (w8u.m202209h(c) || t0g0.m186869j(String.valueOf(c)) || Character.isDigit(c)) {
            return null;
        }
        lsi0.m151578h(R$string.f47140b4);
        return "";
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ CharSequence m72938p(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        if (edg.m115796a().matcher(charSequence).matches() && !charSequence.toString().contains("ㅤ")) {
            return null;
        }
        lsi0.m151578h(R$string.f47162c4);
        return "";
    }

    private void setPreviewPanelBackground(String str) {
        if (str.startsWith("#")) {
            str = str.substring(1);
        }
        LayerDrawable layerDrawable = (LayerDrawable) this.f49113k.getBackground();
        ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(kvc0.m147358g("#0c".concat(str)));
        ((GradientDrawable) layerDrawable.getDrawable(1)).setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        ((GradientDrawable) layerDrawable.getDrawable(1)).setColors(new int[]{kvc0.m147358g("#0a".concat(str)), kvc0.m147358g("#07".concat(str))});
        ((GradientDrawable) layerDrawable.getDrawable(3)).setColor(kvc0.m147358g("#0c".concat(str)));
        this.f49113k.setBackground(layerDrawable);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(q9g q9gVar) {
        this.f49100C = q9gVar;
    }

    /* JADX INFO: renamed from: B */
    public void m72946B(String str) {
        this.f49102E = str;
        str.getClass();
        switch (str) {
            case "uneditable":
                m72968e0();
                break;
            case "reviewing":
                m72966c0();
                break;
            case "editable":
                m72961X();
                break;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m72947C(String str) {
        int childCount = this.f49123u.getChildCount();
        String backgroundColor = "";
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f49123u.getChildAt(i);
            if (TextUtils.equals(str, medalEditItemView.getName())) {
                medalEditItemView.setChecked(true);
                backgroundColor = medalEditItemView.getBackgroundColor();
            } else {
                medalEditItemView.setChecked(false);
            }
        }
        m72967d0(backgroundColor);
        setPreviewPanelBackground(backgroundColor);
        int childCount2 = this.f49124v.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            ((MedalEditItemView) this.f49124v.getChildAt(i2)).setBackgroundColor(backgroundColor);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m72948E(String str) {
        int childCount = this.f49124v.getChildCount();
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f49124v.getChildAt(i);
            medalEditItemView.setChecked(TextUtils.equals(str, medalEditItemView.getName()));
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m72949F(char[] cArr) {
        boolean zM115797b = edg.m115797b();
        int i = 0;
        int i2 = 0;
        for (char c : cArr) {
            if (t0g0.m186867h(c)) {
                i2++;
            }
            if (t0g0.m186869j(String.valueOf(c)) || Character.isDigit(c)) {
                i++;
            }
        }
        if (i == cArr.length) {
            return i <= (zM115797b ? 6 : 4);
        }
        if (i2 == cArr.length) {
            return i2 <= (zM115797b ? 4 : 3);
        }
        if (zM115797b) {
            return cArr.length <= 4 || (i2 == 2 && i == 2) || (i2 == 1 && i == 4);
        }
        return cArr.length <= 3 || (i2 == 2 && i == 1) || (i2 == 1 && i == 3);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m72950G(CharSequence charSequence) {
        return i0g0.m133843J(charSequence) <= 6;
    }

    /* JADX INFO: renamed from: I */
    public final int m72951I(CharSequence charSequence) {
        int i = 6;
        for (int i2 = 0; charSequence != null && i2 < charSequence.length(); i2++) {
            i = w8u.m202209h(charSequence.charAt(i2)) ? i - 2 : i - 1;
            if (i <= 0) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public final void m72952J() {
        this.f49101D = new byr(this.f49100C, d8c0.f84852g, m72971z(act().inflater(), null));
        xdl0.m208329E0(this.f49104b, new View.OnClickListener() { // from class: l.ibs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112377a.m72955R(view);
            }
        });
        this.f49106d.addTextChangedListener(new C12759a());
        this.f49106d.setFilters(m72953K() ? getIntlInputFilter() : getInputFilter());
        this.f49107e.setOnClickListener(new View.OnClickListener() { // from class: l.uas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f175631a.m72956S(view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final boolean m72953K() {
        return (edg.m115797b() || edg.m115798c() || edg.m115799d()) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m72954P(View view) {
        this.f49100C.m173615S3();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m72955R(View view) {
        m72920H();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m72956S(View view) {
        this.f49125w.setText(this.f49106d.getText().toString());
        m72920H();
        this.f49100C.m173622a4(getColor(), getIcon());
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m72957T(BLiveMedalIcon bLiveMedalIcon, View view) {
        m72948E(bLiveMedalIcon.name);
        this.f49100C.m173622a4(getColor(), getIcon());
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m72958U(final BLiveMedalIcon bLiveMedalIcon) {
        MedalEditItemView medalEditItemView = new MedalEditItemView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(50.0f), t100.m186890d(50.0f));
        if (this.f49124v.getChildCount() > 0) {
            layoutParams.leftMargin = t100.m186890d(20.0f);
        }
        medalEditItemView.setIcon(bLiveMedalIcon.url);
        medalEditItemView.setName(bLiveMedalIcon.name);
        xdl0.m208329E0(medalEditItemView, new View.OnClickListener() { // from class: l.xas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191802a.m72957T(bLiveMedalIcon, view);
            }
        });
        this.f49124v.addView(medalEditItemView, layoutParams);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m72959V(BLiveMedalColor bLiveMedalColor, View view) {
        m72947C(bLiveMedalColor.name);
        this.f49100C.m173622a4(getColor(), getIcon());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m72960W(final BLiveMedalColor bLiveMedalColor) {
        MedalEditItemView medalEditItemView = new MedalEditItemView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.m186890d(50.0f), t100.m186890d(50.0f));
        if (this.f49123u.getChildCount() > 0) {
            layoutParams.leftMargin = t100.m186890d(20.0f);
        }
        medalEditItemView.setBackgroundColor(bLiveMedalColor.color);
        medalEditItemView.setName(bLiveMedalColor.name);
        xdl0.m208329E0(medalEditItemView, new View.OnClickListener() { // from class: l.yas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197237a.m72959V(bLiveMedalColor, view);
            }
        });
        this.f49123u.addView(medalEditItemView, layoutParams);
    }

    /* JADX INFO: renamed from: X */
    public final void m72961X() {
        this.f49128z.setTextColor(-1);
        this.f49098A.setTextColor(-1);
        this.f49128z.setText(R$string.f46692G3);
        this.f49127y.setBackground(yb2.m213876a(-98787, t100.f167262k, false));
    }

    /* JADX INFO: renamed from: Y */
    public void m72962Y() {
        xdl0.m208344M(this.f49126x, false);
        xdl0.m208344M(this.f49113k, false);
        xdl0.m208344M(this.f49122t, false);
        xdl0.m208344M(this.f49127y, false);
    }

    /* JADX INFO: renamed from: Z */
    public void m72963Z(BLiveFanBaseMedalPanel bLiveFanBaseMedalPanel) {
        xdl0.m208344M(this.f49126x, false);
        xdl0.m208344M(this.f49113k, true);
        xdl0.m208344M(this.f49122t, true);
        xdl0.m208344M(this.f49127y, true);
        this.f49122t.post(new RunnableC12760b());
        BLiveMedalEditTemplate bLiveMedalEditTemplate = bLiveFanBaseMedalPanel.template;
        this.f49123u.removeAllViews();
        if (!vwb.m200296J(bLiveMedalEditTemplate.colors)) {
            vwb.m200354z(bLiveMedalEditTemplate.colors, new e30() { // from class: l.vas
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f180779a.m72960W((BLiveMedalColor) obj);
                }
            });
        }
        this.f49124v.removeAllViews();
        if (!vwb.m200296J(bLiveMedalEditTemplate.icons)) {
            vwb.m200354z(bLiveMedalEditTemplate.icons, new e30() { // from class: l.was
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f185503a.m72958U((BLiveMedalIcon) obj);
                }
            });
        }
        BLiveMedalEditInfo bLiveMedalEditInfo = bLiveFanBaseMedalPanel.editInfo;
        setMedalText(bLiveMedalEditInfo.text);
        if (edg.m115797b()) {
            this.f49099B.setText(bLiveMedalEditInfo.reason);
            xdl0.m208345M0(this.f49099B, true);
            xdl0.m208344M(this.f49098A, false);
        } else {
            this.f49098A.setText(bLiveMedalEditInfo.reason);
            xdl0.m208345M0(this.f49098A, true);
            xdl0.m208345M0(this.f49099B, false);
        }
        m72946B(bLiveMedalEditInfo.status);
        m72947C(bLiveMedalEditInfo.color);
        m72948E(bLiveMedalEditInfo.icon);
        this.f49100C.m173622a4(bLiveMedalEditInfo.color, bLiveMedalEditInfo.icon);
    }

    /* JADX INFO: renamed from: a0 */
    public void m72964a0() {
        xdl0.m208344M(this.f49126x, true);
        xdl0.m208344M(this.f49113k, false);
        xdl0.m208344M(this.f49122t, false);
        xdl0.m208344M(this.f49127y, false);
    }

    /* JADX INFO: renamed from: b0 */
    public void m72965b0(int i, String str, String str2) {
        final View view;
        switch (i) {
            case 1:
                view = this.f49115m;
                break;
            case 2:
                view = this.f49116n;
                break;
            case 3:
                view = this.f49117o;
                break;
            case 4:
                view = this.f49118p;
                break;
            case 5:
                view = this.f49119q;
                break;
            case 6:
                view = this.f49120r;
                break;
            case 7:
                view = this.f49121s;
                break;
            default:
                view = null;
                break;
        }
        this.f49100C.duringCreated(h9g.m130003l(str, str2, getText())).subscribe(ffw.m121197h(new e30() { // from class: l.zas
            @Override // p149l.e30
            public final void call(Object obj) {
                view.setBackground((imf0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m72966c0() {
        this.f49128z.setText(R$string.f46714H3);
        this.f49128z.setTextColor(-1);
        this.f49098A.setTextColor(-1);
        this.f49127y.setBackground(yb2.m213876a(201326592, t100.f167262k, false));
    }

    /* JADX INFO: renamed from: d0 */
    public void m72967d0(String str) {
        this.f49114l.setTextColor(Color.parseColor(str));
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public final void m72968e0() {
        this.f49128z.setText(R$string.f46692G3);
        this.f49128z.setTextColor(-1);
        this.f49098A.setTextColor(-1);
        this.f49127y.setBackground(yb2.m213876a(201326592, t100.f167262k, false));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m72969f0() {
        if (this.f49101D == null) {
            m72952J();
        }
        if (this.f49101D.isShowing()) {
            return;
        }
        this.f49101D.show();
        this.f49106d.setText(getText());
        if (m72953K() ? m72950G(getText()) : m72949F(getText().toCharArray())) {
            this.f49106d.setSelection(getText().length());
        }
        this.f49106d.requestFocus();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m72970y(this);
        init();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = f49096F;
        int i4 = f49097G;
        int i5 = i3 + i4;
        View view = this.f49108f;
        if (size >= i5) {
            view.getLayoutParams().height = size - i4;
            this.f49109g.getLayoutParams().height = i4;
        } else {
            view.getLayoutParams().height = i3;
            this.f49109g.getLayoutParams().height = size - i3;
        }
        super.onMeasure(i, i2);
    }

    public void setMedalText(String str) {
        this.f49125w.setText(str);
    }

    /* JADX INFO: renamed from: y */
    public final void m72970y(View view) {
        jbs.m140805a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public View m72971z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kbs.m145321b(this, layoutInflater, viewGroup);
    }
}
