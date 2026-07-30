package com.p000p1.mobile.putong.core.p001ui.onlinematch.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.label.CommonLabelView;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f30;
import l.fce;
import l.jjb0;
import l.jm50;
import l.llm;
import l.t100;
import l.uld0;
import l.upa;
import l.x2c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnlineMatchNewUiCard2View extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public OnlineMatchNewUiCard2View f533a;

    /* JADX INFO: renamed from: b */
    public PictureView f534b;

    /* JADX INFO: renamed from: c */
    public View f535c;

    /* JADX INFO: renamed from: d */
    public View f536d;

    /* JADX INFO: renamed from: e */
    public LinearMeasureOrderLayout f537e;

    /* JADX INFO: renamed from: f */
    public VText f538f;

    /* JADX INFO: renamed from: g */
    public CommonLabelView f539g;

    /* JADX INFO: renamed from: h */
    public VLinear f540h;

    /* JADX INFO: renamed from: i */
    public VText f541i;

    /* JADX INFO: renamed from: j */
    public CardBottomBaseInfoView f542j;

    /* JADX INFO: renamed from: k */
    public VText f543k;

    /* JADX INFO: renamed from: l */
    public CardUserContentView f544l;

    /* JADX INFO: renamed from: m */
    public VFrame f545m;

    /* JADX INFO: renamed from: n */
    public VText f546n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.view.OnlineMatchNewUiCard2View$a */
    public class C0037a implements e30<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f547a;

        public C0037a(User user) {
            this.f547a = user;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            OnlineMatchNewUiCard2View onlineMatchNewUiCard2View = OnlineMatchNewUiCard2View.this;
            if (zIsEmpty) {
                xdl0.M(onlineMatchNewUiCard2View.f543k, false);
                xdl0.M(OnlineMatchNewUiCard2View.this.f544l, true);
                try {
                    OnlineMatchNewUiCard2View.this.f544l.W(this.f547a, 0, false);
                } catch (Exception e) {
                    CrashHelper.c(e);
                }
            } else {
                xdl0.M(onlineMatchNewUiCard2View.f543k, true);
                xdl0.M(OnlineMatchNewUiCard2View.this.f544l, false);
                OnlineMatchNewUiCard2View.this.f543k.setText(str);
            }
            xdl0.k0(OnlineMatchNewUiCard2View.this.f533a);
        }
    }

    public OnlineMatchNewUiCard2View(@NonNull @NotNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m765k(int[] iArr) {
        xdl0.M(this.f535c, true);
        xdl0.M(this.f536d, true);
        View view = this.f536d;
        int measuredHeight = this.f534b.getMeasuredHeight();
        int i = t100.f;
        xdl0.X(view, measuredHeight - i);
        xdl0.C0(this.f536d, (this.f533a.getMeasuredHeight() - this.f534b.getMeasuredHeight()) + i);
        xdl0.X(this.f535c, this.f534b.getMeasuredHeight() - t100.d(103.0f));
        xdl0.k0(this.f533a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo737f(QuickChatCardWrapper quickChatCardWrapper, final f30<Boolean, String> f30Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.a(user)) {
            this.f534b.c0(user.media(0), true);
            this.f538f.setBackground(CoreModule.b.getDrawable(x2c0.X3));
            this.f538f.setText("闪聊匹配");
            Drawable drawable = getResources().getDrawable(x2c0.a4);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f538f.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            if (upa.z()) {
                xdl0.M(this.f538f, false);
                xdl0.M(this.f539g, true);
            }
            this.f546n.setText("立即闪聊认识".concat(TEnum.equals(user.gender, "male") ? "他" : "她"));
            xdl0.M(this.f541i, CoreModule.c.N0.i3(user, uld0.d(user)));
            this.f542j.q(user, 0, true, true);
            if (getContext() instanceof Act) {
                llm.l(getContext(), user, new C0037a(user));
            }
            if (upa.C2()) {
                int i = t100.o;
                Drawable drawableC = fce.c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
                if (IntlCountryCodeController.v()) {
                    drawableC = fce.c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.f536d.setBackground(drawableC);
                xdl0.C0(this.f535c, t100.d(103.0f));
                this.f535c.setBackgroundResource(x2c0.X1);
            } else {
                int i2 = t100.o;
                this.f536d.setBackground(fce.c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2}));
            }
            if (jjb0.b() && (getContext() instanceof Act)) {
                xdl0.M(this.f540h, false);
                if (this.f540h.getChildCount() > 0) {
                    this.f540h.removeAllViews();
                }
                View viewF = CertificationUtil.f(getContext(), user, CertificationUtil.CertificationIconStyle.CARD);
                xdl0.M(this.f540h, NullChecker.a(viewF));
                if (NullChecker.a(viewF)) {
                    this.f540h.addView(viewF);
                }
            }
            xdl0.Q0(this.f534b, new e30() { // from class: l.hm50
                public final void call(Object obj) {
                    this.f12108a.m765k((int[]) obj);
                }
            });
            xdl0.E0(this.f545m, new View.OnClickListener() { // from class: l.im50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f30Var.call(Boolean.FALSE, "");
                }
            });
            if (upa.L3()) {
                m768m();
            } else {
                m767l();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m766j(View view) {
        jm50.a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m767l() {
        this.f545m.setBackgroundResource(x2c0.V0);
        this.f546n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f538f.setCompoundDrawablesWithIntrinsicBounds(x2c0.a4, 0, 0, 0);
        this.f538f.setTextColor(-1);
        this.f538f.setBackground(CoreModule.b.getDrawable(x2c0.X3));
    }

    /* JADX INFO: renamed from: m */
    public void m768m() {
        this.f545m.setBackgroundResource(x2c0.p1);
        this.f546n.setCompoundDrawablesWithIntrinsicBounds(upa.z() ? x2c0.eh : x2c0.a4, 0, 0, 0);
        this.f538f.setCompoundDrawablesWithIntrinsicBounds(x2c0.Z3, 0, 0, 0);
        this.f538f.setTextColor(Color.parseColor("#E65B0A"));
        this.f538f.setBackground(CoreModule.b.getDrawable(x2c0.Y3));
        this.f538f.setTypeface(Typeface.DEFAULT_BOLD);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m766j(this);
        this.f534b.L(true, false, true, true);
    }

    public OnlineMatchNewUiCard2View(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchNewUiCard2View(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
