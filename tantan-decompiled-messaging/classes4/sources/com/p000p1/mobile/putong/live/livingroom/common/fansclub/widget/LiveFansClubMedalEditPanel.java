package com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget;

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
import androidx.appcompat.app.a;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseMedalPanel;
import com.p1.mobile.putong.live.base.data.BLiveMedalColor;
import com.p1.mobile.putong.live.base.data.BLiveMedalEditInfo;
import com.p1.mobile.putong.live.base.data.BLiveMedalEditTemplate;
import com.p1.mobile.putong.live.base.data.BLiveMedalIcon;
import l.e30;
import l.ffw;
import l.i0g0;
import l.imf0;
import l.kvc0;
import l.lsi0;
import l.s7m;
import l.t0g0;
import l.t100;
import l.vwb;
import l.w8u;
import l.xdl0;
import l.yb2;
import p002l.byr;
import p002l.d8c0;
import p002l.edg;
import p002l.h9g;
import p002l.jbs;
import p002l.kbs;
import p002l.q9g;
import v.VEditText;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveFansClubMedalEditPanel extends RelativeLayout implements s7m<q9g> {

    /* JADX INFO: renamed from: F */
    public static final int f5138F = t100.d(127.0f);

    /* JADX INFO: renamed from: G */
    public static final int f5139G = t100.d(562.0f);

    /* JADX INFO: renamed from: A */
    public VText f5140A;

    /* JADX INFO: renamed from: B */
    public VText f5141B;

    /* JADX INFO: renamed from: C */
    public q9g f5142C;

    /* JADX INFO: renamed from: D */
    public C0200a f5143D;

    /* JADX INFO: renamed from: E */
    public String f5144E;

    /* JADX INFO: renamed from: a */
    public LinearLayout f5145a;

    /* JADX INFO: renamed from: b */
    public View f5146b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f5147c;

    /* JADX INFO: renamed from: d */
    public VEditText f5148d;

    /* JADX INFO: renamed from: e */
    public VText f5149e;

    /* JADX INFO: renamed from: f */
    public View f5150f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f5151g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f5152h;

    /* JADX INFO: renamed from: i */
    public VImage f5153i;

    /* JADX INFO: renamed from: j */
    public VImage f5154j;

    /* JADX INFO: renamed from: k */
    public ConstraintLayout f5155k;

    /* JADX INFO: renamed from: l */
    public VText f5156l;

    /* JADX INFO: renamed from: m */
    public View f5157m;

    /* JADX INFO: renamed from: n */
    public View f5158n;

    /* JADX INFO: renamed from: o */
    public View f5159o;

    /* JADX INFO: renamed from: p */
    public View f5160p;

    /* JADX INFO: renamed from: q */
    public View f5161q;

    /* JADX INFO: renamed from: r */
    public View f5162r;

    /* JADX INFO: renamed from: s */
    public View f5163s;

    /* JADX INFO: renamed from: t */
    public ScrollView f5164t;

    /* JADX INFO: renamed from: u */
    public LinearLayout f5165u;

    /* JADX INFO: renamed from: v */
    public LinearLayout f5166v;

    /* JADX INFO: renamed from: w */
    public VText f5167w;

    /* JADX INFO: renamed from: x */
    public VText f5168x;

    /* JADX INFO: renamed from: y */
    public LinearLayout f5169y;

    /* JADX INFO: renamed from: z */
    public VText f5170z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel$a */
    public class C0348a implements TextWatcher {
        public C0348a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            LiveFansClubMedalEditPanel.this.f5149e.setEnabled(editable.toString().trim().length() > 0);
            if (LiveFansClubMedalEditPanel.this.m6473K()) {
                if (i0g0.J(editable.toString()) > 6) {
                    lsi0.h(R$string.f3226d4);
                    LiveFansClubMedalEditPanel liveFansClubMedalEditPanel = LiveFansClubMedalEditPanel.this;
                    liveFansClubMedalEditPanel.f5148d.setText(editable.subSequence(0, liveFansClubMedalEditPanel.m6471I(editable) + 1));
                    VEditText vEditText = LiveFansClubMedalEditPanel.this.f5148d;
                    vEditText.setSelection(vEditText.getText().length());
                    return;
                }
                return;
            }
            char[] charArray = editable.toString().toCharArray();
            if (LiveFansClubMedalEditPanel.this.m6469F(charArray)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for (char c : charArray) {
                if (!LiveFansClubMedalEditPanel.this.m6469F((sb.toString() + c).toCharArray())) {
                    lsi0.h(R$string.f3226d4);
                    break;
                }
                sb.append(c);
            }
            LiveFansClubMedalEditPanel.this.f5148d.setText(sb);
            VEditText vEditText2 = LiveFansClubMedalEditPanel.this.f5148d;
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
    public class RunnableC0349b implements Runnable {
        public RunnableC0349b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LiveFansClubMedalEditPanel.this.f5164t.fullScroll(33);
        }
    }

    public LiveFansClubMedalEditPanel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: H */
    private void m6439H() {
        a aVar = this.f5143D;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        Act act = act();
        if (act != null) {
            act.hideInput(this.f5148d);
        }
        this.f5143D.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public /* synthetic */ void m6440L(View view) {
        this.f5142C.m21132c4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public /* synthetic */ void m6441M() {
        this.f5142C.m21133d4(getColor(), getIcon(), getText());
        this.f5144E = "unclickable";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m6442N(View view) {
        if (TextUtils.equals(this.f5144E, "editable")) {
            act().dialog().F(getResources().getString(R$string.f3138Z3)).v0(getResources().getString(R$string.f3160a4), new Runnable() { // from class: l.hbs
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11963a.m6441M();
                }
            }).m0(getResources().getString(R$string.f3117Y3)).q(true).z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m6443O(View view) {
        this.f5142C.m21123S3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public /* synthetic */ void m6444Q(View view) {
        m6489f0();
    }

    private String getColor() {
        int childCount = this.f5165u.getChildCount();
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f5165u.getChildAt(i);
            if (medalEditItemView.m6532b()) {
                return medalEditItemView.getName();
            }
        }
        return "";
    }

    private String getIcon() {
        int childCount = this.f5166v.getChildCount();
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f5166v.getChildAt(i);
            if (medalEditItemView.m6532b()) {
                return medalEditItemView.getName();
            }
        }
        return "";
    }

    private InputFilter[] getInputFilter() {
        return new InputFilter[]{new InputFilter() { // from class: l.tas
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return LiveFansClubMedalEditPanel.m6453k(charSequence, i, i2, spanned, i3, i4);
            }
        }};
    }

    private InputFilter[] getIntlInputFilter() {
        return new InputFilter[]{new InputFilter() { // from class: l.fbs
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return LiveFansClubMedalEditPanel.m6451i(charSequence, i, i2, spanned, i3, i4);
            }
        }, new InputFilter() { // from class: l.gbs
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return LiveFansClubMedalEditPanel.m6457p(charSequence, i, i2, spanned, i3, i4);
            }
        }};
    }

    private String getText() {
        CharSequence text = this.f5167w.getText();
        return text == null ? "" : text.toString();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ CharSequence m6451i(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        for (char c : charSequence.toString().toCharArray()) {
            if (t0g0.i(c)) {
                lsi0.h(R$string.f3204c4);
                return "";
            }
        }
        return null;
    }

    private void init() {
        this.f5167w.setBackground(yb2.a(-394759, t100.m, false));
        xdl0.E0(this.f5154j, new View.OnClickListener() { // from class: l.abs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7490a.m6440L(view);
            }
        });
        xdl0.E0(this.f5169y, new View.OnClickListener() { // from class: l.bbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8065a.m6442N(view);
            }
        });
        xdl0.E0(this.f5150f, new View.OnClickListener() { // from class: l.cbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8582a.m6443O(view);
            }
        });
        xdl0.E0(this.f5153i, new View.OnClickListener() { // from class: l.dbs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9157a.m6474P(view);
            }
        });
        xdl0.E0(this.f5167w, new View.OnClickListener() { // from class: l.ebs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9662a.m6444Q(view);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ CharSequence m6453k(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        char[] charArray = charSequence.toString().toCharArray();
        if (charArray.length <= 0) {
            return null;
        }
        char c = charArray[0];
        if (w8u.h(c) || t0g0.j(String.valueOf(c)) || Character.isDigit(c)) {
            return null;
        }
        lsi0.h(R$string.f3182b4);
        return "";
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ CharSequence m6457p(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        if (TextUtils.isEmpty(charSequence)) {
            return null;
        }
        if (edg.m12317a().matcher(charSequence).matches() && !charSequence.toString().contains("ㅤ")) {
            return null;
        }
        lsi0.h(R$string.f3204c4);
        return "";
    }

    private void setPreviewPanelBackground(String str) {
        if (str.startsWith("#")) {
            str = str.substring(1);
        }
        LayerDrawable layerDrawable = (LayerDrawable) this.f5155k.getBackground();
        ((GradientDrawable) layerDrawable.getDrawable(0)).setColor(kvc0.g("#0c".concat(str)));
        ((GradientDrawable) layerDrawable.getDrawable(1)).setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        ((GradientDrawable) layerDrawable.getDrawable(1)).setColors(new int[]{kvc0.g("#0a".concat(str)), kvc0.g("#07".concat(str))});
        ((GradientDrawable) layerDrawable.getDrawable(3)).setColor(kvc0.g("#0c".concat(str)));
        this.f5155k.setBackground(layerDrawable);
    }

    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public void m6490i1(q9g q9gVar) {
        this.f5142C = q9gVar;
    }

    /* JADX INFO: renamed from: B */
    public void m6465B(String str) {
        this.f5144E = str;
        str.getClass();
        switch (str) {
            case "uneditable":
                m6488e0();
                break;
            case "reviewing":
                m6486c0();
                break;
            case "editable":
                m6481X();
                break;
        }
    }

    /* JADX INFO: renamed from: C */
    public final void m6466C(String str) {
        int childCount = this.f5165u.getChildCount();
        String backgroundColor = "";
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f5165u.getChildAt(i);
            if (TextUtils.equals(str, medalEditItemView.getName())) {
                medalEditItemView.setChecked(true);
                backgroundColor = medalEditItemView.getBackgroundColor();
            } else {
                medalEditItemView.setChecked(false);
            }
        }
        m6487d0(backgroundColor);
        setPreviewPanelBackground(backgroundColor);
        int childCount2 = this.f5166v.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            ((MedalEditItemView) this.f5166v.getChildAt(i2)).setBackgroundColor(backgroundColor);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m6467C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m6468E(String str) {
        int childCount = this.f5166v.getChildCount();
        for (int i = 0; i < childCount; i++) {
            MedalEditItemView medalEditItemView = (MedalEditItemView) this.f5166v.getChildAt(i);
            medalEditItemView.setChecked(TextUtils.equals(str, medalEditItemView.getName()));
        }
    }

    /* JADX INFO: renamed from: F */
    public final boolean m6469F(char[] cArr) {
        boolean zM12318b = edg.m12318b();
        int i = 0;
        int i2 = 0;
        for (char c : cArr) {
            if (t0g0.h(c)) {
                i2++;
            }
            if (t0g0.j(String.valueOf(c)) || Character.isDigit(c)) {
                i++;
            }
        }
        if (i == cArr.length) {
            return i <= (zM12318b ? 6 : 4);
        }
        if (i2 == cArr.length) {
            return i2 <= (zM12318b ? 4 : 3);
        }
        if (zM12318b) {
            return cArr.length <= 4 || (i2 == 2 && i == 2) || (i2 == 1 && i == 4);
        }
        return cArr.length <= 3 || (i2 == 2 && i == 1) || (i2 == 1 && i == 3);
    }

    /* JADX INFO: renamed from: G */
    public final boolean m6470G(CharSequence charSequence) {
        return i0g0.J(charSequence) <= 6;
    }

    /* JADX INFO: renamed from: I */
    public final int m6471I(CharSequence charSequence) {
        int i = 6;
        for (int i2 = 0; charSequence != null && i2 < charSequence.length(); i2++) {
            i = w8u.h(charSequence.charAt(i2)) ? i - 2 : i - 1;
            if (i <= 0) {
                return i2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: J */
    public final void m6472J() {
        this.f5143D = new byr(this.f5142C, d8c0.f9102g, m6492z(act().inflater(), null));
        xdl0.E0(this.f5146b, new View.OnClickListener() { // from class: l.ibs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13132a.m6475R(view);
            }
        });
        this.f5148d.addTextChangedListener(new C0348a());
        this.f5148d.setFilters(m6473K() ? getIntlInputFilter() : getInputFilter());
        this.f5149e.setOnClickListener(new View.OnClickListener() { // from class: l.uas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20569a.m6476S(view);
            }
        });
    }

    /* JADX INFO: renamed from: K */
    public final boolean m6473K() {
        return (edg.m12318b() || edg.m12319c() || edg.m12320d()) ? false : true;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m6474P(View view) {
        this.f5142C.m21123S3();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m6475R(View view) {
        m6439H();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m6476S(View view) {
        this.f5167w.setText(this.f5148d.getText().toString());
        m6439H();
        this.f5142C.m21130a4(getColor(), getIcon());
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m6477T(BLiveMedalIcon bLiveMedalIcon, View view) {
        m6468E(bLiveMedalIcon.name);
        this.f5142C.m21130a4(getColor(), getIcon());
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m6478U(final BLiveMedalIcon bLiveMedalIcon) {
        MedalEditItemView medalEditItemView = new MedalEditItemView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.d(50.0f), t100.d(50.0f));
        if (this.f5166v.getChildCount() > 0) {
            layoutParams.leftMargin = t100.d(20.0f);
        }
        medalEditItemView.setIcon(bLiveMedalIcon.url);
        medalEditItemView.setName(bLiveMedalIcon.name);
        xdl0.E0(medalEditItemView, new View.OnClickListener() { // from class: l.xas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22202a.m6477T(bLiveMedalIcon, view);
            }
        });
        this.f5166v.addView(medalEditItemView, layoutParams);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m6479V(BLiveMedalColor bLiveMedalColor, View view) {
        m6466C(bLiveMedalColor.name);
        this.f5142C.m21130a4(getColor(), getIcon());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m6480W(final BLiveMedalColor bLiveMedalColor) {
        MedalEditItemView medalEditItemView = new MedalEditItemView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.d(50.0f), t100.d(50.0f));
        if (this.f5165u.getChildCount() > 0) {
            layoutParams.leftMargin = t100.d(20.0f);
        }
        medalEditItemView.setBackgroundColor(bLiveMedalColor.color);
        medalEditItemView.setName(bLiveMedalColor.name);
        xdl0.E0(medalEditItemView, new View.OnClickListener() { // from class: l.yas
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22778a.m6479V(bLiveMedalColor, view);
            }
        });
        this.f5165u.addView(medalEditItemView, layoutParams);
    }

    /* JADX INFO: renamed from: X */
    public final void m6481X() {
        this.f5170z.setTextColor(-1);
        this.f5140A.setTextColor(-1);
        this.f5170z.setText(R$string.f2734G3);
        this.f5169y.setBackground(yb2.a(-98787, t100.k, false));
    }

    /* JADX INFO: renamed from: Y */
    public void m6482Y() {
        xdl0.M(this.f5168x, false);
        xdl0.M(this.f5155k, false);
        xdl0.M(this.f5164t, false);
        xdl0.M(this.f5169y, false);
    }

    /* JADX INFO: renamed from: Z */
    public void m6483Z(BLiveFanBaseMedalPanel bLiveFanBaseMedalPanel) {
        xdl0.M(this.f5168x, false);
        xdl0.M(this.f5155k, true);
        xdl0.M(this.f5164t, true);
        xdl0.M(this.f5169y, true);
        this.f5164t.post(new RunnableC0349b());
        BLiveMedalEditTemplate bLiveMedalEditTemplate = bLiveFanBaseMedalPanel.template;
        this.f5165u.removeAllViews();
        if (!vwb.J(bLiveMedalEditTemplate.colors)) {
            vwb.z(bLiveMedalEditTemplate.colors, new e30() { // from class: l.vas
                public final void call(Object obj) {
                    this.f21053a.m6480W((BLiveMedalColor) obj);
                }
            });
        }
        this.f5166v.removeAllViews();
        if (!vwb.J(bLiveMedalEditTemplate.icons)) {
            vwb.z(bLiveMedalEditTemplate.icons, new e30() { // from class: l.was
                public final void call(Object obj) {
                    this.f21592a.m6478U((BLiveMedalIcon) obj);
                }
            });
        }
        BLiveMedalEditInfo bLiveMedalEditInfo = bLiveFanBaseMedalPanel.editInfo;
        setMedalText(bLiveMedalEditInfo.text);
        if (edg.m12318b()) {
            this.f5141B.setText(bLiveMedalEditInfo.reason);
            xdl0.M0(this.f5141B, true);
            xdl0.M(this.f5140A, false);
        } else {
            this.f5140A.setText(bLiveMedalEditInfo.reason);
            xdl0.M0(this.f5140A, true);
            xdl0.M0(this.f5141B, false);
        }
        m6465B(bLiveMedalEditInfo.status);
        m6466C(bLiveMedalEditInfo.color);
        m6468E(bLiveMedalEditInfo.icon);
        this.f5142C.m21130a4(bLiveMedalEditInfo.color, bLiveMedalEditInfo.icon);
    }

    /* JADX INFO: renamed from: a0 */
    public void m6484a0() {
        xdl0.M(this.f5168x, true);
        xdl0.M(this.f5155k, false);
        xdl0.M(this.f5164t, false);
        xdl0.M(this.f5169y, false);
    }

    /* JADX INFO: renamed from: b0 */
    public void m6485b0(int i, String str, String str2) {
        final View view;
        switch (i) {
            case 1:
                view = this.f5157m;
                break;
            case 2:
                view = this.f5158n;
                break;
            case 3:
                view = this.f5159o;
                break;
            case 4:
                view = this.f5160p;
                break;
            case 5:
                view = this.f5161q;
                break;
            case 6:
                view = this.f5162r;
                break;
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                view = this.f5163s;
                break;
            default:
                view = null;
                break;
        }
        this.f5142C.duringCreated(h9g.m14302l(str, str2, getText())).subscribe(ffw.h(new e30() { // from class: l.zas
            public final void call(Object obj) {
                view.setBackground((imf0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c0 */
    public final void m6486c0() {
        this.f5170z.setText(R$string.f2756H3);
        this.f5170z.setTextColor(-1);
        this.f5140A.setTextColor(-1);
        this.f5169y.setBackground(yb2.a(201326592, t100.k, false));
    }

    /* JADX INFO: renamed from: d0 */
    public void m6487d0(String str) {
        this.f5156l.setTextColor(Color.parseColor(str));
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e0 */
    public final void m6488e0() {
        this.f5170z.setText(R$string.f2734G3);
        this.f5170z.setTextColor(-1);
        this.f5140A.setTextColor(-1);
        this.f5169y.setBackground(yb2.a(201326592, t100.k, false));
    }

    /* JADX INFO: renamed from: f0 */
    public final void m6489f0() {
        if (this.f5143D == null) {
            m6472J();
        }
        if (this.f5143D.isShowing()) {
            return;
        }
        this.f5143D.show();
        this.f5148d.setText(getText());
        if (m6473K() ? m6470G(getText()) : m6469F(getText().toCharArray())) {
            this.f5148d.setSelection(getText().length());
        }
        this.f5148d.requestFocus();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6491y(this);
        init();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = f5138F;
        int i4 = f5139G;
        int i5 = i3 + i4;
        View view = this.f5150f;
        if (size >= i5) {
            view.getLayoutParams().height = size - i4;
            this.f5151g.getLayoutParams().height = i4;
        } else {
            view.getLayoutParams().height = i3;
            this.f5151g.getLayoutParams().height = size - i3;
        }
        super.onMeasure(i, i2);
    }

    public void setMedalText(String str) {
        this.f5167w.setText(str);
    }

    /* JADX INFO: renamed from: y */
    public final void m6491y(View view) {
        jbs.m15827a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public View m6492z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kbs.m16597b(this, layoutInflater, viewGroup);
    }
}
