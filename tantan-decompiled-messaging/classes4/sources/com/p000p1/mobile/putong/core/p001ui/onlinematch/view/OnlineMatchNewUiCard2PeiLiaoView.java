package com.p000p1.mobile.putong.core.p001ui.onlinematch.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f30;
import l.fce;
import l.gm50;
import l.jjb0;
import l.t100;
import l.u4c0;
import l.upa;
import l.x2c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class OnlineMatchNewUiCard2PeiLiaoView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public OnlineMatchNewUiCard2PeiLiaoView f522a;

    /* JADX INFO: renamed from: b */
    public PictureView f523b;

    /* JADX INFO: renamed from: c */
    public View f524c;

    /* JADX INFO: renamed from: d */
    public View f525d;

    /* JADX INFO: renamed from: e */
    public LinearMeasureOrderLayout f526e;

    /* JADX INFO: renamed from: f */
    public VText f527f;

    /* JADX INFO: renamed from: g */
    public VLinear f528g;

    /* JADX INFO: renamed from: h */
    public VText f529h;

    /* JADX INFO: renamed from: i */
    public CardBottomBaseInfoView f530i;

    /* JADX INFO: renamed from: j */
    public VText f531j;

    /* JADX INFO: renamed from: k */
    public VText f532k;

    public OnlineMatchNewUiCard2PeiLiaoView(@NonNull @NotNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m761k(int[] iArr) {
        xdl0.M(this.f524c, true);
        xdl0.M(this.f525d, true);
        xdl0.X(this.f525d, this.f523b.getMeasuredHeight());
        xdl0.C0(this.f525d, this.f522a.getMeasuredHeight() - this.f523b.getMeasuredHeight());
        xdl0.X(this.f524c, this.f523b.getMeasuredHeight() - t100.d(102.0f));
        xdl0.k0(this.f522a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo737f(QuickChatCardWrapper quickChatCardWrapper, final f30<Boolean, String> f30Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.a(user)) {
            this.f523b.c0(user.media(0), false);
            this.f527f.setBackground(CoreModule.b.getDrawable(x2c0.b4));
            this.f527f.setText("限定免费");
            Drawable drawable = getResources().getDrawable(x2c0.c4);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f527f.setCompoundDrawables(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
            StringBuilder sb = new StringBuilder("立即免费和");
            sb.append(TEnum.equals(user.gender, "male") ? "他" : "她");
            sb.append("聊");
            this.f532k.setText(sb.toString());
            this.f530i.q(user, 0, true, true);
            xdl0.M(this.f531j, true);
            boolean zIsFemale = user.isFemale();
            VText vText = this.f531j;
            if (zIsFemale) {
                vText.setText("她在等你聊天...");
            } else {
                vText.setText("他在等你聊天...");
            }
            if (upa.C2()) {
                int i = t100.o;
                Drawable drawableC = fce.c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
                if (IntlCountryCodeController.v()) {
                    drawableC = fce.c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.f525d.setBackground(drawableC);
                xdl0.C0(this.f524c, t100.d(103.0f));
                this.f524c.setBackgroundResource(x2c0.X1);
            } else {
                int i2 = t100.o;
                this.f525d.setBackground(fce.c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2}));
            }
            if (jjb0.b() && (getContext() instanceof Act)) {
                xdl0.M(this.f528g, false);
                if (this.f528g.getChildCount() > 0) {
                    View viewFindViewById = this.f528g.findViewById(u4c0.X0);
                    if (NullChecker.a(viewFindViewById)) {
                        this.f528g.removeView(viewFindViewById);
                    }
                }
                View viewF = CertificationUtil.f(getContext(), user, CertificationUtil.CertificationIconStyle.CARD);
                xdl0.M(this.f528g, NullChecker.a(viewF));
                if (NullChecker.a(viewF)) {
                    this.f528g.addView(viewF);
                }
            }
            xdl0.Q0(this.f523b, new e30() { // from class: l.em50
                public final void call(Object obj) {
                    this.f9868a.m761k((int[]) obj);
                }
            });
            xdl0.E0(this.f532k, new View.OnClickListener() { // from class: l.fm50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f30Var.call(Boolean.FALSE, "");
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m762j(View view) {
        gm50.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m762j(this);
        this.f523b.L(true, false, true, true);
    }

    public OnlineMatchNewUiCard2PeiLiaoView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchNewUiCard2PeiLiaoView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
