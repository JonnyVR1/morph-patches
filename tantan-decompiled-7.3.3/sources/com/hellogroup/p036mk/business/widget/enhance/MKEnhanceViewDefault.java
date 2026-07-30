package com.hellogroup.p036mk.business.widget.enhance;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.data.Careers;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;
import p153l.bec0;
import p153l.c8c0;
import p153l.jzv;
import p153l.lpj0;
import p153l.lv0;
import p153l.pcc0;
import p153l.q4g0;
import p153l.w9c0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 (2\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\fJ\u0019\u0010\u0010\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\fJ\u0019\u0010\u0013\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0019\u0010\u0016\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0019\u0010\u0018\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010#R\u0018\u0010'\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&¨\u0006)"}, m88121d2 = {"Lcom/hellogroup/mk/business/widget/enhance/MKEnhanceViewDefault;", "Lcom/hellogroup/mk/business/widget/enhance/MKEnhanceView;", "Landroid/content/Context;", "context", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "", "isPanel", "<init>", "(Landroid/content/Context;Lcom/hellogroup/mk/business/base/ui/MKWebView;Z)V", "", "h", "()V", "a", "", "error", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)V", "b", "f", "(Landroid/content/Context;)V", "e", Constants.INAPP_DATA_TAG, "g", "c", "Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout;", "loadingView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "loadingOvertimeView", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "errorTitleTv", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "loadingImg", "Landroid/view/View;", "Landroid/view/View;", "backView", "Companion", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MKEnhanceViewDefault extends MKEnhanceView {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final LinearLayout loadingView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final ConstraintLayout loadingOvertimeView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final TextView errorTitleTv;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ImageView loadingImg;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private View backView;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.widget.enhance.MKEnhanceViewDefault$a */
    @Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, m88121d2 = {"<anonymous>", "", Careers.f39580it, "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class ViewOnClickListenerC3596a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Context f12488a;

        public ViewOnClickListenerC3596a(Context context) {
            this.f12488a = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Context context = this.f12488a;
            if (context != null) {
                ((Activity) context).finish();
            } else {
                C0799b.m4641a("null cannot be cast to non-null type android.app.Activity");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MKEnhanceViewDefault(@NotNull Context context, @NotNull MKWebView mKWebView, boolean z) {
        super(context, mKWebView, null, 0, 12, null);
        context.getClass();
        mKWebView.getClass();
        LayoutInflater.from(context).inflate(bec0.f76368h, (ViewGroup) this, true);
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        View viewFindViewById = findViewById(pcc0.f151550d);
        viewFindViewById.getClass();
        this.loadingView = (LinearLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(pcc0.f151551e);
        viewFindViewById2.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) viewFindViewById2;
        this.loadingOvertimeView = constraintLayout;
        View viewFindViewById3 = findViewById(pcc0.f151567u);
        viewFindViewById3.getClass();
        this.errorTitleTv = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(pcc0.f151549c);
        viewFindViewById4.getClass();
        this.loadingImg = (ImageView) viewFindViewById4;
        View viewFindViewById5 = findViewById(pcc0.f151548b);
        this.backView = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(new ViewOnClickListenerC3596a(context));
        }
        mo18368a();
        if (!z) {
            constraintLayout.setPadding(0, q4g0.m175215c(lv0.f133670a), 0, 0);
            return;
        }
        if (constraintLayout != null) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) (layoutParams instanceof FrameLayout.LayoutParams ? layoutParams : null);
            if (layoutParams2 != null) {
                layoutParams2.topMargin = lpj0.m155247c(100.0f);
            }
            constraintLayout.setLayoutParams(layoutParams2);
        }
    }

    @Override // com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView
    /* JADX INFO: renamed from: a */
    public void mo18368a() {
        jzv.m147732e(getTAG(), "hideLoading");
        if (this.loadingView.getVisibility() != 8) {
            this.loadingView.setVisibility(8);
        }
        this.loadingImg.clearAnimation();
    }

    @Override // com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView
    /* JADX INFO: renamed from: b */
    public void mo18369b() {
        jzv.m147732e(getTAG(), "hideWhiteScreen");
        this.loadingImg.clearAnimation();
        if (getVisibility() != 8) {
            setVisibility(8);
        }
        getMkWebView().setVisibility(0);
    }

    @Override // com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView
    /* JADX INFO: renamed from: c */
    public void mo18370c(@Nullable Context context) {
    }

    @Override // com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView
    /* JADX INFO: renamed from: d */
    public void mo18371d(@Nullable Context context) {
    }

    @Override // com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView
    /* JADX INFO: renamed from: e */
    public void mo18372e(@Nullable Context context) {
    }

    @Override // com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView
    /* JADX INFO: renamed from: f */
    public void mo18373f(@Nullable Context context) {
    }

    @Override // com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView
    /* JADX INFO: renamed from: g */
    public void mo18374g(@Nullable Context context) {
    }

    @Override // com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView
    /* JADX INFO: renamed from: h */
    public void mo18375h() {
        View view;
        jzv.m147732e(getTAG(), "showLoading");
        if (getVisibility() != 0) {
            setVisibility(0);
            setBackgroundColor(getResources().getColor(w9c0.f188001g));
        }
        View view2 = this.backView;
        if ((view2 == null || view2.getVisibility() != 8) && (view = this.backView) != null) {
            view.setVisibility(8);
        }
        if (this.loadingOvertimeView.getVisibility() != 8) {
            this.loadingOvertimeView.setVisibility(8);
        }
        if (this.loadingView.getVisibility() != 0) {
            this.loadingView.setVisibility(0);
        }
        this.loadingImg.startAnimation(AnimationUtils.loadAnimation(getContext(), c8c0.f80198d));
    }

    @Override // com.hellogroup.p036mk.business.widget.enhance.MKEnhanceView
    /* JADX INFO: renamed from: i */
    public void mo18376i(@Nullable String error) {
        View view;
        jzv.m147732e(getTAG(), "showWhiteScreen");
        View view2 = this.backView;
        if ((view2 == null || view2.getVisibility() != 0) && (view = this.backView) != null) {
            view.setVisibility(0);
        }
        mo18368a();
        if (this.loadingOvertimeView.getVisibility() != 0) {
            this.loadingOvertimeView.setVisibility(0);
        }
        if (TextUtils.isEmpty(error)) {
            error = "Oops! 出错了";
        }
        this.errorTitleTv.setText(error);
        getMkWebView().setVisibility(8);
    }
}
