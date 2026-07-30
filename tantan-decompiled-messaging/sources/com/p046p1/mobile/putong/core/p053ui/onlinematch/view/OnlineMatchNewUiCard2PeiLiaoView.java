package com.p046p1.mobile.putong.core.p053ui.onlinematch.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.f30;
import p149l.fce;
import p149l.gm50;
import p149l.jjb0;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiCard2PeiLiaoView extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public OnlineMatchNewUiCard2PeiLiaoView f32700a;

    /* JADX INFO: renamed from: b */
    public PictureView f32701b;

    /* JADX INFO: renamed from: c */
    public View f32702c;

    /* JADX INFO: renamed from: d */
    public View f32703d;

    /* JADX INFO: renamed from: e */
    public LinearMeasureOrderLayout f32704e;

    /* JADX INFO: renamed from: f */
    public VText f32705f;

    /* JADX INFO: renamed from: g */
    public VLinear f32706g;

    /* JADX INFO: renamed from: h */
    public VText f32707h;

    /* JADX INFO: renamed from: i */
    public CardBottomBaseInfoView f32708i;

    /* JADX INFO: renamed from: j */
    public VText f32709j;

    /* JADX INFO: renamed from: k */
    public VText f32710k;

    public OnlineMatchNewUiCard2PeiLiaoView(@NonNull @NotNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m50330k(int[] iArr) {
        xdl0.m208344M(this.f32702c, true);
        xdl0.m208344M(this.f32703d, true);
        xdl0.m208360X(this.f32703d, this.f32701b.getMeasuredHeight());
        xdl0.m208325C0(this.f32703d, this.f32700a.getMeasuredHeight() - this.f32701b.getMeasuredHeight());
        xdl0.m208360X(this.f32702c, this.f32701b.getMeasuredHeight() - t100.m186890d(102.0f));
        xdl0.m208384k0(this.f32700a);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo50306f(QuickChatCardWrapper quickChatCardWrapper, final f30<Boolean, String> f30Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.m81303a(user)) {
            this.f32701b.m43998c0(user.media(0), false);
            this.f32705f.setBackground(CoreModule.f17544b.getDrawable(x2c0.f190002b4));
            this.f32705f.setText("限定免费");
            Drawable drawable = getResources().getDrawable(x2c0.f190034c4);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f32705f.setCompoundDrawables(drawable, null, null, null);
            StringBuilder sb = new StringBuilder("立即免费和");
            sb.append(TEnum.equals(user.gender, "male") ? "他" : "她");
            sb.append("聊");
            this.f32710k.setText(sb.toString());
            this.f32708i.m38898q(user, 0, true, true);
            xdl0.m208344M(this.f32709j, true);
            boolean zIsFemale = user.isFemale();
            VText vText = this.f32709j;
            if (zIsFemale) {
                vText.setText("她在等你聊天...");
            } else {
                vText.setText("他在等你聊天...");
            }
            if (upa.m194619C2()) {
                int i = t100.f167266o;
                Drawable drawableM120426c = fce.m120426c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
                if (IntlCountryCodeController.m28126v()) {
                    drawableM120426c = fce.m120426c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.f32703d.setBackground(drawableM120426c);
                xdl0.m208325C0(this.f32702c, t100.m186890d(103.0f));
                this.f32702c.setBackgroundResource(x2c0.f189874X1);
            } else {
                int i2 = t100.f167266o;
                this.f32703d.setBackground(fce.m120426c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2}));
            }
            if (jjb0.m141784b() && (getContext() instanceof Act)) {
                xdl0.m208344M(this.f32706g, false);
                if (this.f32706g.getChildCount() > 0) {
                    View viewFindViewById = this.f32706g.findViewById(u4c0.f174104X0);
                    if (NullChecker.m81303a(viewFindViewById)) {
                        this.f32706g.removeView(viewFindViewById);
                    }
                }
                View viewM58147f = CertificationUtil.m58147f((Act) getContext(), user, CertificationUtil.CertificationIconStyle.CARD);
                xdl0.m208344M(this.f32706g, NullChecker.m81303a(viewM58147f));
                if (NullChecker.m81303a(viewM58147f)) {
                    this.f32706g.addView(viewM58147f);
                }
            }
            xdl0.m208353Q0(this.f32701b, new e30() { // from class: l.em50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92184a.m50330k((int[]) obj);
                }
            });
            xdl0.m208329E0(this.f32710k, new View.OnClickListener() { // from class: l.fm50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f30Var.call(Boolean.FALSE, "");
                }
            });
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m50331j(View view) {
        gm50.m126933a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50331j(this);
        this.f32701b.m43984L(true, false, true, true);
    }

    public OnlineMatchNewUiCard2PeiLiaoView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchNewUiCard2PeiLiaoView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
