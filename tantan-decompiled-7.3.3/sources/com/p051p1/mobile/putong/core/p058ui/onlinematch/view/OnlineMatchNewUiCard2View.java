package com.p051p1.mobile.putong.core.p058ui.onlinematch.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.label.CommonLabelView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p051p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.jde;
import p153l.nnm;
import p153l.nrb0;
import p153l.pu50;
import p153l.qa00;
import p153l.wtd0;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiCard2View extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public OnlineMatchNewUiCard2View f33559a;

    /* JADX INFO: renamed from: b */
    public PictureView f33560b;

    /* JADX INFO: renamed from: c */
    public View f33561c;

    /* JADX INFO: renamed from: d */
    public View f33562d;

    /* JADX INFO: renamed from: e */
    public LinearMeasureOrderLayout f33563e;

    /* JADX INFO: renamed from: f */
    public VText f33564f;

    /* JADX INFO: renamed from: g */
    public CommonLabelView f33565g;

    /* JADX INFO: renamed from: h */
    public VLinear f33566h;

    /* JADX INFO: renamed from: i */
    public VText f33567i;

    /* JADX INFO: renamed from: j */
    public CardBottomBaseInfoView f33568j;

    /* JADX INFO: renamed from: k */
    public VText f33569k;

    /* JADX INFO: renamed from: l */
    public CardUserContentView f33570l;

    /* JADX INFO: renamed from: m */
    public VFrame f33571m;

    /* JADX INFO: renamed from: n */
    public VText f33572n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.view.OnlineMatchNewUiCard2View$a */
    public class C8775a implements y20<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f33573a;

        public C8775a(User user) {
            this.f33573a = user;
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            OnlineMatchNewUiCard2View onlineMatchNewUiCard2View = OnlineMatchNewUiCard2View.this;
            if (zIsEmpty) {
                bnl0.m105524M(onlineMatchNewUiCard2View.f33569k, false);
                bnl0.m105524M(OnlineMatchNewUiCard2View.this.f33570l, true);
                try {
                    OnlineMatchNewUiCard2View.this.f33570l.m40126W(this.f33573a, 0, false);
                } catch (Exception e) {
                    CrashHelper.m82479c(e);
                }
            } else {
                bnl0.m105524M(onlineMatchNewUiCard2View.f33569k, true);
                bnl0.m105524M(OnlineMatchNewUiCard2View.this.f33570l, false);
                OnlineMatchNewUiCard2View.this.f33569k.setText(str);
            }
            bnl0.m105564k0(OnlineMatchNewUiCard2View.this.f33559a);
        }
    }

    public OnlineMatchNewUiCard2View(@NonNull @NotNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m51517k(int[] iArr) {
        bnl0.m105524M(this.f33561c, true);
        bnl0.m105524M(this.f33562d, true);
        View view = this.f33562d;
        int measuredHeight = this.f33560b.getMeasuredHeight();
        int i = qa00.f156319f;
        bnl0.m105540X(view, measuredHeight - i);
        bnl0.m105505C0(this.f33562d, (this.f33559a.getMeasuredHeight() - this.f33560b.getMeasuredHeight()) + i);
        bnl0.m105540X(this.f33561c, this.f33560b.getMeasuredHeight() - qa00.m175859d(103.0f));
        bnl0.m105564k0(this.f33559a);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo51489f(QuickChatCardWrapper quickChatCardWrapper, final z20<Boolean, String> z20Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.m82486a(user)) {
            this.f33560b.m45181c0(user.media(0), true);
            this.f33564f.setBackground(CoreModule.f18263b.getDrawable(dbc0.f86748Y3));
            this.f33564f.setText("闪聊匹配");
            Drawable drawable = getResources().getDrawable(dbc0.f86846b4);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f33564f.setCompoundDrawables(drawable, null, null, null);
            if (gra.m131778z()) {
                bnl0.m105524M(this.f33564f, false);
                bnl0.m105524M(this.f33565g, true);
            }
            this.f33572n.setText("立即闪聊认识".concat(TEnum.equals(user.gender, "male") ? "他" : "她"));
            bnl0.m105524M(this.f33567i, CoreModule.f18264c.f20330N0.m32968i3(user, wtd0.m207832d(user)));
            this.f33568j.m39901q(user, 0, true, true);
            if (getContext() instanceof Act) {
                nnm.m163903l((Act) getContext(), user, new C8775a(user));
            }
            if (gra.m131550C2()) {
                int i = qa00.f156328o;
                Drawable drawableM144407c = jde.m144407c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
                if (IntlCountryCodeController.m29125v()) {
                    drawableM144407c = jde.m144407c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.f33562d.setBackground(drawableM144407c);
                bnl0.m105505C0(this.f33561c, qa00.m175859d(103.0f));
                this.f33561c.setBackgroundResource(dbc0.f86746Y1);
            } else {
                int i2 = qa00.f156328o;
                this.f33562d.setBackground(jde.m144407c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2}));
            }
            if (nrb0.m164466b() && (getContext() instanceof Act)) {
                bnl0.m105524M(this.f33566h, false);
                if (this.f33566h.getChildCount() > 0) {
                    this.f33566h.removeAllViews();
                }
                View viewM59330f = CertificationUtil.m59330f((Act) getContext(), user, CertificationUtil.CertificationIconStyle.CARD);
                bnl0.m105524M(this.f33566h, NullChecker.m82486a(viewM59330f));
                if (NullChecker.m82486a(viewM59330f)) {
                    this.f33566h.addView(viewM59330f);
                }
            }
            bnl0.m105533Q0(this.f33560b, new y20() { // from class: l.nu50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f143679a.m51517k((int[]) obj);
                }
            });
            bnl0.m105509E0(this.f33571m, new View.OnClickListener() { // from class: l.ou50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z20Var.call(Boolean.FALSE, "");
                }
            });
            if (gra.m131596L3()) {
                m51520m();
            } else {
                m51519l();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m51518j(View view) {
        pu50.m173832a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m51519l() {
        this.f33571m.setBackgroundResource(dbc0.f86681W0);
        this.f33572n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f33564f.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86846b4, 0, 0, 0);
        this.f33564f.setTextColor(-1);
        this.f33564f.setBackground(CoreModule.f18263b.getDrawable(dbc0.f86748Y3));
    }

    /* JADX INFO: renamed from: m */
    public void m51520m() {
        this.f33571m.setBackgroundResource(dbc0.f87335q1);
        this.f33572n.setCompoundDrawablesWithIntrinsicBounds(gra.m131778z() ? dbc0.f86570Sh : dbc0.f86846b4, 0, 0, 0);
        this.f33564f.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86813a4, 0, 0, 0);
        this.f33564f.setTextColor(Color.parseColor("#E65B0A"));
        this.f33564f.setBackground(CoreModule.f18263b.getDrawable(dbc0.f86780Z3));
        this.f33564f.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51518j(this);
        this.f33560b.m45167L(true, false, true, true);
    }

    public OnlineMatchNewUiCard2View(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchNewUiCard2View(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
