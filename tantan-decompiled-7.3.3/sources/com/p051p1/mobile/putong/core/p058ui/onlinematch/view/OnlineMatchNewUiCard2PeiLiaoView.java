package com.p051p1.mobile.putong.core.p058ui.onlinematch.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p051p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p051p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p151v.VLinear;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.jde;
import p153l.mu50;
import p153l.nrb0;
import p153l.qa00;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiCard2PeiLiaoView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public OnlineMatchNewUiCard2PeiLiaoView f33548a;

    /* JADX INFO: renamed from: b */
    public PictureView f33549b;

    /* JADX INFO: renamed from: c */
    public View f33550c;

    /* JADX INFO: renamed from: d */
    public View f33551d;

    /* JADX INFO: renamed from: e */
    public LinearMeasureOrderLayout f33552e;

    /* JADX INFO: renamed from: f */
    public VText f33553f;

    /* JADX INFO: renamed from: g */
    public VLinear f33554g;

    /* JADX INFO: renamed from: h */
    public VText f33555h;

    /* JADX INFO: renamed from: i */
    public CardBottomBaseInfoView f33556i;

    /* JADX INFO: renamed from: j */
    public VText f33557j;

    /* JADX INFO: renamed from: k */
    public VText f33558k;

    public OnlineMatchNewUiCard2PeiLiaoView(@NonNull @NotNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m51513k(int[] iArr) {
        bnl0.m105524M(this.f33550c, true);
        bnl0.m105524M(this.f33551d, true);
        bnl0.m105540X(this.f33551d, this.f33549b.getMeasuredHeight());
        bnl0.m105505C0(this.f33551d, this.f33548a.getMeasuredHeight() - this.f33549b.getMeasuredHeight());
        bnl0.m105540X(this.f33550c, this.f33549b.getMeasuredHeight() - qa00.m175859d(102.0f));
        bnl0.m105564k0(this.f33548a);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo51489f(QuickChatCardWrapper quickChatCardWrapper, final z20<Boolean, String> z20Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.m82486a(user)) {
            this.f33549b.m45181c0(user.media(0), false);
            this.f33553f.setBackground(CoreModule.f18263b.getDrawable(dbc0.f86879c4));
            this.f33553f.setText("限定免费");
            Drawable drawable = getResources().getDrawable(dbc0.f86912d4);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f33553f.setCompoundDrawables(drawable, null, null, null);
            StringBuilder sb = new StringBuilder("立即免费和");
            sb.append(TEnum.equals(user.gender, "male") ? "他" : "她");
            sb.append("聊");
            this.f33558k.setText(sb.toString());
            this.f33556i.m39901q(user, 0, true, true);
            bnl0.m105524M(this.f33557j, true);
            boolean zIsFemale = user.isFemale();
            VText vText = this.f33557j;
            if (zIsFemale) {
                vText.setText("她在等你聊天...");
            } else {
                vText.setText("他在等你聊天...");
            }
            if (gra.m131550C2()) {
                int i = qa00.f156328o;
                Drawable drawableM144407c = jde.m144407c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
                if (IntlCountryCodeController.m29125v()) {
                    drawableM144407c = jde.m144407c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.f33551d.setBackground(drawableM144407c);
                bnl0.m105505C0(this.f33550c, qa00.m175859d(103.0f));
                this.f33550c.setBackgroundResource(dbc0.f86746Y1);
            } else {
                int i2 = qa00.f156328o;
                this.f33551d.setBackground(jde.m144407c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2}));
            }
            if (nrb0.m164466b() && (getContext() instanceof Act)) {
                bnl0.m105524M(this.f33554g, false);
                if (this.f33554g.getChildCount() > 0) {
                    View viewFindViewById = this.f33554g.findViewById(adc0.f70195X0);
                    if (NullChecker.m82486a(viewFindViewById)) {
                        this.f33554g.removeView(viewFindViewById);
                    }
                }
                View viewM59330f = CertificationUtil.m59330f((Act) getContext(), user, CertificationUtil.CertificationIconStyle.CARD);
                bnl0.m105524M(this.f33554g, NullChecker.m82486a(viewM59330f));
                if (NullChecker.m82486a(viewM59330f)) {
                    this.f33554g.addView(viewM59330f);
                }
            }
            bnl0.m105533Q0(this.f33549b, new y20() { // from class: l.ku50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f128816a.m51513k((int[]) obj);
                }
            });
            bnl0.m105509E0(this.f33558k, new View.OnClickListener() { // from class: l.lu50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    z20Var.call(Boolean.FALSE, "");
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m51514j(View view) {
        mu50.m160127a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51514j(this);
        this.f33549b.m45167L(true, false, true, true);
    }

    public OnlineMatchNewUiCard2PeiLiaoView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchNewUiCard2PeiLiaoView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
