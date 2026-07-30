package com.p046p1.mobile.putong.core.p053ui.onlinematch.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.label.CommonLabelView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import com.p046p1.mobile.putong.core.newui.home.views.CardBottomBaseInfoView;
import com.p046p1.mobile.putong.core.newui.home.views.CardUserContentView;
import com.p046p1.mobile.putong.core.newui.view.LinearMeasureOrderLayout;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import org.jetbrains.annotations.NotNull;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.f30;
import p149l.fce;
import p149l.jjb0;
import p149l.jm50;
import p149l.llm;
import p149l.t100;
import p149l.uld0;
import p149l.upa;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class OnlineMatchNewUiCard2View extends OnlineMatchBaseCardView {

    /* JADX INFO: renamed from: a */
    public OnlineMatchNewUiCard2View f32711a;

    /* JADX INFO: renamed from: b */
    public PictureView f32712b;

    /* JADX INFO: renamed from: c */
    public View f32713c;

    /* JADX INFO: renamed from: d */
    public View f32714d;

    /* JADX INFO: renamed from: e */
    public LinearMeasureOrderLayout f32715e;

    /* JADX INFO: renamed from: f */
    public VText f32716f;

    /* JADX INFO: renamed from: g */
    public CommonLabelView f32717g;

    /* JADX INFO: renamed from: h */
    public VLinear f32718h;

    /* JADX INFO: renamed from: i */
    public VText f32719i;

    /* JADX INFO: renamed from: j */
    public CardBottomBaseInfoView f32720j;

    /* JADX INFO: renamed from: k */
    public VText f32721k;

    /* JADX INFO: renamed from: l */
    public CardUserContentView f32722l;

    /* JADX INFO: renamed from: m */
    public VFrame f32723m;

    /* JADX INFO: renamed from: n */
    public VText f32724n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.view.OnlineMatchNewUiCard2View$a */
    public class C8612a implements e30<String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f32725a;

        public C8612a(User user) {
            this.f32725a = user;
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(String str) {
            boolean zIsEmpty = TextUtils.isEmpty(str);
            OnlineMatchNewUiCard2View onlineMatchNewUiCard2View = OnlineMatchNewUiCard2View.this;
            if (zIsEmpty) {
                xdl0.m208344M(onlineMatchNewUiCard2View.f32721k, false);
                xdl0.m208344M(OnlineMatchNewUiCard2View.this.f32722l, true);
                try {
                    OnlineMatchNewUiCard2View.this.f32722l.m39123W(this.f32725a, 0, false);
                } catch (Exception e) {
                    CrashHelper.m81296c(e);
                }
            } else {
                xdl0.m208344M(onlineMatchNewUiCard2View.f32721k, true);
                xdl0.m208344M(OnlineMatchNewUiCard2View.this.f32722l, false);
                OnlineMatchNewUiCard2View.this.f32721k.setText(str);
            }
            xdl0.m208384k0(OnlineMatchNewUiCard2View.this.f32711a);
        }
    }

    public OnlineMatchNewUiCard2View(@NonNull @NotNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m50334k(int[] iArr) {
        xdl0.m208344M(this.f32713c, true);
        xdl0.m208344M(this.f32714d, true);
        View view = this.f32714d;
        int measuredHeight = this.f32712b.getMeasuredHeight();
        int i = t100.f167257f;
        xdl0.m208360X(view, measuredHeight - i);
        xdl0.m208325C0(this.f32714d, (this.f32711a.getMeasuredHeight() - this.f32712b.getMeasuredHeight()) + i);
        xdl0.m208360X(this.f32713c, this.f32712b.getMeasuredHeight() - t100.m186890d(103.0f));
        xdl0.m208384k0(this.f32711a);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseCardView
    /* JADX INFO: renamed from: f */
    public void mo50306f(QuickChatCardWrapper quickChatCardWrapper, final f30<Boolean, String> f30Var) {
        User user = quickChatCardWrapper.getUser();
        if (NullChecker.m81303a(user)) {
            this.f32712b.m43998c0(user.media(0), true);
            this.f32716f.setBackground(CoreModule.f17544b.getDrawable(x2c0.f189876X3));
            this.f32716f.setText("闪聊匹配");
            Drawable drawable = getResources().getDrawable(x2c0.f189970a4);
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            this.f32716f.setCompoundDrawables(drawable, null, null, null);
            if (upa.m194847z()) {
                xdl0.m208344M(this.f32716f, false);
                xdl0.m208344M(this.f32717g, true);
            }
            this.f32724n.setText("立即闪聊认识".concat(TEnum.equals(user.gender, "male") ? "他" : "她"));
            xdl0.m208344M(this.f32719i, CoreModule.f17545c.f19588N0.m31965i3(user, uld0.m194219d(user)));
            this.f32720j.m38898q(user, 0, true, true);
            if (getContext() instanceof Act) {
                llm.m150525l((Act) getContext(), user, new C8612a(user));
            }
            if (upa.m194619C2()) {
                int i = t100.f167266o;
                Drawable drawableM120426c = fce.m120426c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i, i, i, i});
                if (IntlCountryCodeController.m28126v()) {
                    drawableM120426c = fce.m120426c(-16579837, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
                }
                this.f32714d.setBackground(drawableM120426c);
                xdl0.m208325C0(this.f32713c, t100.m186890d(103.0f));
                this.f32713c.setBackgroundResource(x2c0.f189874X1);
            } else {
                int i2 = t100.f167266o;
                this.f32714d.setBackground(fce.m120426c(-13816531, new float[]{0.0f, 0.0f, 0.0f, 0.0f, i2, i2, i2, i2}));
            }
            if (jjb0.m141784b() && (getContext() instanceof Act)) {
                xdl0.m208344M(this.f32718h, false);
                if (this.f32718h.getChildCount() > 0) {
                    this.f32718h.removeAllViews();
                }
                View viewM58147f = CertificationUtil.m58147f((Act) getContext(), user, CertificationUtil.CertificationIconStyle.CARD);
                xdl0.m208344M(this.f32718h, NullChecker.m81303a(viewM58147f));
                if (NullChecker.m81303a(viewM58147f)) {
                    this.f32718h.addView(viewM58147f);
                }
            }
            xdl0.m208353Q0(this.f32712b, new e30() { // from class: l.hm50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f108394a.m50334k((int[]) obj);
                }
            });
            xdl0.m208329E0(this.f32723m, new View.OnClickListener() { // from class: l.im50
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    f30Var.call(Boolean.FALSE, "");
                }
            });
            if (upa.m194665L3()) {
                m50337m();
            } else {
                m50336l();
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m50335j(View view) {
        jm50.m142171a(this, view);
    }

    /* JADX INFO: renamed from: l */
    public void m50336l() {
        this.f32723m.setBackgroundResource(x2c0.f189811V0);
        this.f32724n.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        this.f32716f.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189970a4, 0, 0, 0);
        this.f32716f.setTextColor(-1);
        this.f32716f.setBackground(CoreModule.f17544b.getDrawable(x2c0.f189876X3));
    }

    /* JADX INFO: renamed from: m */
    public void m50337m() {
        this.f32723m.setBackgroundResource(x2c0.f190444p1);
        this.f32724n.setCompoundDrawablesWithIntrinsicBounds(upa.m194847z() ? x2c0.f190110eh : x2c0.f189970a4, 0, 0, 0);
        this.f32716f.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189938Z3, 0, 0, 0);
        this.f32716f.setTextColor(Color.parseColor("#E65B0A"));
        this.f32716f.setBackground(CoreModule.f17544b.getDrawable(x2c0.f189907Y3));
        this.f32716f.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50335j(this);
        this.f32712b.m43984L(true, false, true, true);
    }

    public OnlineMatchNewUiCard2View(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchNewUiCard2View(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
