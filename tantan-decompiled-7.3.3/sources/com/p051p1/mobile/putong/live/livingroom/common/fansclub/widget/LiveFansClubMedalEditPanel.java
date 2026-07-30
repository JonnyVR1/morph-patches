package com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseMedalPanel;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalColor;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalEditInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalEditTemplate;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalIcon;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel;
import p151v.VEditText;
import p151v.VImage;
import p151v.VText;
import p153l.a9g0;
import p153l.bnl0;
import p153l.c0s;
import p153l.dhw;
import p153l.ebg;
import p153l.fc2;
import p153l.iam;
import p153l.jgc0;
import p153l.jyb;
import p153l.kds;
import p153l.lds;
import p153l.n3d0;
import p153l.o1j0;
import p153l.q8g0;
import p153l.qa00;
import p153l.seg;
import p153l.vag;
import p153l.xau;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveFansClubMedalEditPanel extends RelativeLayout implements iam<ebg> {

    /* JADX INFO: renamed from: F */
    public static final int f49944F = qa00.m175859d(127.0f);

    /* JADX INFO: renamed from: G */
    public static final int f49945G = qa00.m175859d(562.0f);

    /* JADX INFO: renamed from: A */
    public VText f49946A;

    /* JADX INFO: renamed from: B */
    public VText f49947B;

    /* JADX INFO: renamed from: C */
    public ebg f49948C;

    /* JADX INFO: renamed from: D */
    public DialogC12774a f49949D;

    /* JADX INFO: renamed from: E */
    public String f49950E;

    /* JADX INFO: renamed from: a */
    public LinearLayout f49951a;

    /* JADX INFO: renamed from: b */
    public View f49952b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f49953c;

    /* JADX INFO: renamed from: d */
    public VEditText f49954d;

    /* JADX INFO: renamed from: e */
    public VText f49955e;

    /* JADX INFO: renamed from: f */
    public View f49956f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f49957g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f49958h;

    /* JADX INFO: renamed from: i */
    public VImage f49959i;

    /* JADX INFO: renamed from: j */
    public VImage f49960j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f49961k;

    /* JADX INFO: renamed from: l */
    public VText f49962l;

    /* JADX INFO: renamed from: m */
    public View f49963m;

    /* JADX INFO: renamed from: n */
    public View f49964n;

    /* JADX INFO: renamed from: o */
    public View f49965o;

    /* JADX INFO: renamed from: p */
    public View f49966p;

    /* JADX INFO: renamed from: q */
    public View f49967q;

    /* JADX INFO: renamed from: r */
    public View f49968r;

    /* JADX INFO: renamed from: s */
    public View f49969s;

    /* JADX INFO: renamed from: t */
    public ScrollView f49970t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f49971u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f49972v;

    /* JADX INFO: renamed from: w */
    public VText f49973w;

    /* JADX INFO: renamed from: x */
    public VText f49974x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f49975y;

    /* JADX INFO: renamed from: z */
    public VText f49976z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel$a */
    public class C12922a implements TextWatcher {
        public C12922a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LiveFansClubMedalEditPanel.this.f49955e.setEnabled(editable.toString().trim().length() > 0);
            if (LiveFansClubMedalEditPanel.this.m74136K()) {
                if (q8g0.m175778J(editable.toString()) > 6) {
                    o1j0.m165634h(R$string.f48032d4);
                    LiveFansClubMedalEditPanel liveFansClubMedalEditPanel = LiveFansClubMedalEditPanel.this;
                    liveFansClubMedalEditPanel.f49954d.setText(editable.subSequence(0, liveFansClubMedalEditPanel.m74134I(editable) + 1));
                    VEditText vEditText = LiveFansClubMedalEditPanel.this.f49954d;
                    vEditText.setSelection(vEditText.getText().length());
                    return;
                }
                return;
            }
            char[] charArray = editable.toString().toCharArray();
            if (LiveFansClubMedalEditPanel.this.m74132F(charArray)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (char c : charArray) {
                if (!LiveFansClubMedalEditPanel.this.m74132F((sb.toString() + c).toCharArray())) {
                    o1j0.m165634h(R$string.f48032d4);
                    break;
                }
                sb.append(c);
            }
            LiveFansClubMedalEditPanel.this.f49954d.setText(sb);
            VEditText vEditText2 = LiveFansClubMedalEditPanel.this.f49954d;
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
    public class RunnableC12923b implements Runnable {
        public RunnableC12923b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveFansClubMedalEditPanel.this.f49970t.fullScroll(33);
        }
    }

    public LiveFansClubMedalEditPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: H */
    private void m74103H() {
        DialogC12774a dialogC12774a = this.f49949D;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        Act act = act();
        if (act != null) {
            act.hideInput(this.f49954d);
        }
        this.f49949D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m74104L(View view) {
        this.f49948C.m120178c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m74105M() {
        this.f49948C.m120179d4(getColor(), getIcon(), getText());
        this.f49950E = "unclickable";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m74106N(View view) {
        if (TextUtils.equals(this.f49950E, "editable")) {
            act().dialog().m21503F(getResources().getString(R$string.f47944Z3)).m21559v0(getResources().getString(R$string.f47966a4), new Runnable() { // from class: l.ids
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114521a.m74105M();
                }
            }).m21542m0(getResources().getString(R$string.f47923Y3)).m21548q(true).m21567z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m74107O(View view) {
        this.f49948C.m120169S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m74108Q(View view) {
        m74152f0();
    }

    private String getColor() {
        int childCount = this.f49971u.getChildCount();
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f49971u.getChildAt(i);
            if (medalEditItemView.m74192b()) {
                return medalEditItemView.getName();
            }
        }
        return "";
    }

    private String getIcon() {
        int childCount = this.f49972v.getChildCount();
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f49972v.getChildAt(i);
            if (medalEditItemView.m74192b()) {
                return medalEditItemView.getName();
            }
        }
        return "";
    }

    private InputFilter[] getInputFilter() {
        return new InputFilter[]{new InputFilter() { // from class: l.ucs
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return LiveFansClubMedalEditPanel.m74117k(charSequence, i, i2, spanned, i3, i4);
            }
        }};
    }

    private InputFilter[] getIntlInputFilter() {
        return new InputFilter[]{new InputFilter() { // from class: l.gds
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return LiveFansClubMedalEditPanel.m74115i(charSequence, i, i2, spanned, i3, i4);
            }
        }, new InputFilter() { // from class: l.hds
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return LiveFansClubMedalEditPanel.m74121p(charSequence, i, i2, spanned, i3, i4);
            }
        }};
    }

    private String getText() {
        CharSequence text = this.f49973w.getText();
        return text == null ? "" : text.toString();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m74115i(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        for (char c : charSequence.toString().toCharArray()) {
            if (a9g0.m96574i(c)) {
                o1j0.m165634h(R$string.f48010c4);
                return "";
            }
        }
        return null;
    }

    private void init() {
        this.f49973w.setBackground(fc2.m124971a(-394759, qa00.f156326m, false));
        bnl0.m105509E0(this.f49960j, new View.OnClickListener() { // from class: l.bds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76294a.m74104L(view);
            }
        });
        bnl0.m105509E0(this.f49975y, new View.OnClickListener() { // from class: l.cds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81262a.m74106N(view);
            }
        });
        bnl0.m105509E0(this.f49956f, new View.OnClickListener() { // from class: l.dds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87961a.m74107O(view);
            }
        });
        bnl0.m105509E0(this.f49959i, new View.OnClickListener() { // from class: l.eds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f93578a.m74137P(view);
            }
        });
        bnl0.m105509E0(this.f49973w, new View.OnClickListener() { // from class: l.fds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98500a.m74108Q(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ CharSequence m74117k(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        if (charArray.length <= 0) {
            return null;
        }
        char c = charArray[0];
        if (xau.m209902h(c) || a9g0.m96575j(String.valueOf(c)) || Character.isDigit(c)) {
            return null;
        }
        o1j0.m165634h(R$string.f47988b4);
        return "";
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ CharSequence m74121p(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        if (seg.m185533a().matcher(charSequence).matches() && !charSequence.toString().contains("ㅤ")) {
            return null;
        }
        o1j0.m165634h(R$string.f48010c4);
        return "";
    }

    private void setPreviewPanelBackground(String str) {
        if (str.startsWith("#")) {
            str = str.substring(1);
        }
        LayerDrawable layerDrawable = (LayerDrawable) this.f49961k.getBackground();
        ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(n3d0.m161283g("#0c".concat(str)));
        ((GradientDrawable) layerDrawable.getDrawable(1)).setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        ((GradientDrawable) layerDrawable.getDrawable(1)).setColors(new int[]{n3d0.m161283g("#0a".concat(str)), n3d0.m161283g("#07".concat(str))});
        ((GradientDrawable) layerDrawable.getDrawable(3)).setColor(n3d0.m161283g("#0c".concat(str)));
        this.f49961k.setBackground(layerDrawable);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ebg ebgVar) {
        this.f49948C = ebgVar;
    }

    /* JADX INFO: renamed from: B */
    public void m74129B(String str) {
        this.f49950E = str;
        str.getClass();
        switch (str) {
            case "uneditable":
                m74151e0();
                break;
            case "reviewing":
                m74149c0();
                break;
            case "editable":
                m74144X();
                break;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m74130C(String str) {
        int childCount = this.f49971u.getChildCount();
        String backgroundColor = "";
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f49971u.getChildAt(i);
            if (TextUtils.equals(str, medalEditItemView.getName())) {
                medalEditItemView.setChecked(true);
                backgroundColor = medalEditItemView.getBackgroundColor();
            } else {
                medalEditItemView.setChecked(false);
            }
        }
        m74150d0(backgroundColor);
        setPreviewPanelBackground(backgroundColor);
        int childCount2 = this.f49972v.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            ((MedalEditItemView) this.f49972v.getChildAt(i2)).setBackgroundColor(backgroundColor);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m74131E(String str) {
        int childCount = this.f49972v.getChildCount();
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f49972v.getChildAt(i);
            medalEditItemView.setChecked(TextUtils.equals(str, medalEditItemView.getName()));
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m74132F(char[] cArr) {
        boolean zM185534b = seg.m185534b();
        int i = 0;
        int i2 = 0;
        for (char c : cArr) {
            if (a9g0.m96573h(c)) {
                i2++;
            }
            if (a9g0.m96575j(String.valueOf(c)) || Character.isDigit(c)) {
                i++;
            }
        }
        if (i == cArr.length) {
            return i <= (zM185534b ? 6 : 4);
        }
        if (i2 == cArr.length) {
            return i2 <= (zM185534b ? 4 : 3);
        }
        if (zM185534b) {
            return cArr.length <= 4 || (i2 == 2 && i == 2) || (i2 == 1 && i == 4);
        }
        return cArr.length <= 3 || (i2 == 2 && i == 1) || (i2 == 1 && i == 3);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m74133G(CharSequence charSequence) {
        return q8g0.m175778J(charSequence) <= 6;
    }

    /* JADX INFO: renamed from: I */
    public final int m74134I(CharSequence charSequence) {
        int i = 6;
        for (int i2 = 0; charSequence != null && i2 < charSequence.length(); i2++) {
            i = xau.m209902h(charSequence.charAt(i2)) ? i - 2 : i - 1;
            if (i <= 0) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public final void m74135J() {
        this.f49949D = new c0s(this.f49948C, jgc0.f120700g, m74154z(act().inflater(), null));
        bnl0.m105509E0(this.f49952b, new View.OnClickListener() { // from class: l.jds
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120360a.m74138R(view);
            }
        });
        this.f49954d.addTextChangedListener(new C12922a());
        this.f49954d.setFilters(m74136K() ? getIntlInputFilter() : getInputFilter());
        this.f49955e.setOnClickListener(new View.OnClickListener() { // from class: l.vcs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183483a.m74139S(view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final boolean m74136K() {
        return (seg.m185534b() || seg.m185535c() || seg.m185536d()) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m74137P(View view) {
        this.f49948C.m120169S3();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m74138R(View view) {
        m74103H();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m74139S(View view) {
        this.f49973w.setText(this.f49954d.getText().toString());
        m74103H();
        this.f49948C.m120176a4(getColor(), getIcon());
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m74140T(BLiveMedalIcon bLiveMedalIcon, View view) {
        m74131E(bLiveMedalIcon.name);
        this.f49948C.m120176a4(getColor(), getIcon());
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m74141U(final BLiveMedalIcon bLiveMedalIcon) {
        MedalEditItemView medalEditItemView = new MedalEditItemView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(50.0f), qa00.m175859d(50.0f));
        if (this.f49972v.getChildCount() > 0) {
            layoutParams.leftMargin = qa00.m175859d(20.0f);
        }
        medalEditItemView.setIcon(bLiveMedalIcon.url);
        medalEditItemView.setName(bLiveMedalIcon.name);
        bnl0.m105509E0(medalEditItemView, new View.OnClickListener() { // from class: l.ycs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198540a.m74140T(bLiveMedalIcon, view);
            }
        });
        this.f49972v.addView(medalEditItemView, layoutParams);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m74142V(BLiveMedalColor bLiveMedalColor, View view) {
        m74130C(bLiveMedalColor.name);
        this.f49948C.m120176a4(getColor(), getIcon());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m74143W(final BLiveMedalColor bLiveMedalColor) {
        MedalEditItemView medalEditItemView = new MedalEditItemView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.m175859d(50.0f), qa00.m175859d(50.0f));
        if (this.f49971u.getChildCount() > 0) {
            layoutParams.leftMargin = qa00.m175859d(20.0f);
        }
        medalEditItemView.setBackgroundColor(bLiveMedalColor.color);
        medalEditItemView.setName(bLiveMedalColor.name);
        bnl0.m105509E0(medalEditItemView, new View.OnClickListener() { // from class: l.zcs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203822a.m74142V(bLiveMedalColor, view);
            }
        });
        this.f49971u.addView(medalEditItemView, layoutParams);
    }

    /* JADX INFO: renamed from: X */
    public final void m74144X() {
        this.f49976z.setTextColor(-1);
        this.f49946A.setTextColor(-1);
        this.f49976z.setText(R$string.f47540G3);
        this.f49975y.setBackground(fc2.m124971a(-98787, qa00.f156324k, false));
    }

    /* JADX INFO: renamed from: Y */
    public void m74145Y() {
        bnl0.m105524M(this.f49974x, false);
        bnl0.m105524M(this.f49961k, false);
        bnl0.m105524M(this.f49970t, false);
        bnl0.m105524M(this.f49975y, false);
    }

    /* JADX INFO: renamed from: Z */
    public void m74146Z(BLiveFanBaseMedalPanel bLiveFanBaseMedalPanel) {
        bnl0.m105524M(this.f49974x, false);
        bnl0.m105524M(this.f49961k, true);
        bnl0.m105524M(this.f49970t, true);
        bnl0.m105524M(this.f49975y, true);
        this.f49970t.post(new RunnableC12923b());
        BLiveMedalEditTemplate bLiveMedalEditTemplate = bLiveFanBaseMedalPanel.template;
        this.f49971u.removeAllViews();
        if (!jyb.m147479J(bLiveMedalEditTemplate.colors)) {
            jyb.m147537z(bLiveMedalEditTemplate.colors, new y20() { // from class: l.wcs
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188494a.m74143W((BLiveMedalColor) obj);
                }
            });
        }
        this.f49972v.removeAllViews();
        if (!jyb.m147479J(bLiveMedalEditTemplate.icons)) {
            jyb.m147537z(bLiveMedalEditTemplate.icons, new y20() { // from class: l.xcs
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f193400a.m74141U((BLiveMedalIcon) obj);
                }
            });
        }
        BLiveMedalEditInfo bLiveMedalEditInfo = bLiveFanBaseMedalPanel.editInfo;
        setMedalText(bLiveMedalEditInfo.text);
        if (seg.m185534b()) {
            this.f49947B.setText(bLiveMedalEditInfo.reason);
            bnl0.m105525M0(this.f49947B, true);
            bnl0.m105524M(this.f49946A, false);
        } else {
            this.f49946A.setText(bLiveMedalEditInfo.reason);
            bnl0.m105525M0(this.f49946A, true);
            bnl0.m105525M0(this.f49947B, false);
        }
        m74129B(bLiveMedalEditInfo.status);
        m74130C(bLiveMedalEditInfo.color);
        m74131E(bLiveMedalEditInfo.icon);
        this.f49948C.m120176a4(bLiveMedalEditInfo.color, bLiveMedalEditInfo.icon);
    }

    /* JADX INFO: renamed from: a0 */
    public void m74147a0() {
        bnl0.m105524M(this.f49974x, true);
        bnl0.m105524M(this.f49961k, false);
        bnl0.m105524M(this.f49970t, false);
        bnl0.m105524M(this.f49975y, false);
    }

    /* JADX INFO: renamed from: b0 */
    public void m74148b0(int i, String str, String str2) {
        final View view;
        switch (i) {
            case 1:
                view = this.f49963m;
                break;
            case 2:
                view = this.f49964n;
                break;
            case 3:
                view = this.f49965o;
                break;
            case 4:
                view = this.f49966p;
                break;
            case 5:
                view = this.f49967q;
                break;
            case 6:
                view = this.f49968r;
                break;
            case 7:
                view = this.f49969s;
                break;
            default:
                view = null;
                break;
        }
        this.f49948C.duringCreated(vag.m200518l(str, str2, getText())).subscribe(dhw.m115829h(new y20() { // from class: l.ads
            @Override // p153l.y20
            public final void call(Object obj) {
                view.setBackground((ruf0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m74149c0() {
        this.f49976z.setText(R$string.f47562H3);
        this.f49976z.setTextColor(-1);
        this.f49946A.setTextColor(-1);
        this.f49975y.setBackground(fc2.m124971a(201326592, qa00.f156324k, false));
    }

    /* JADX INFO: renamed from: d0 */
    public void m74150d0(String str) {
        this.f49962l.setTextColor(Color.parseColor(str));
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public final void m74151e0() {
        this.f49976z.setText(R$string.f47540G3);
        this.f49976z.setTextColor(-1);
        this.f49946A.setTextColor(-1);
        this.f49975y.setBackground(fc2.m124971a(201326592, qa00.f156324k, false));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m74152f0() {
        if (this.f49949D == null) {
            m74135J();
        }
        if (this.f49949D.isShowing()) {
            return;
        }
        this.f49949D.show();
        this.f49954d.setText(getText());
        if (m74136K() ? m74133G(getText()) : m74132F(getText().toCharArray())) {
            this.f49954d.setSelection(getText().length());
        }
        this.f49954d.requestFocus();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74153y(this);
        init();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = f49944F;
        int i4 = f49945G;
        int i5 = i3 + i4;
        View view = this.f49956f;
        if (size >= i5) {
            view.getLayoutParams().height = size - i4;
            this.f49957g.getLayoutParams().height = i4;
        } else {
            view.getLayoutParams().height = i3;
            this.f49957g.getLayoutParams().height = size - i3;
        }
        super.onMeasure(i, i2);
    }

    public void setMedalText(String str) {
        this.f49973w.setText(str);
    }

    /* JADX INFO: renamed from: y */
    public final void m74153y(View view) {
        kds.m149262a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public View m74154z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lds.m153788b(this, layoutInflater, viewGroup);
    }
}
