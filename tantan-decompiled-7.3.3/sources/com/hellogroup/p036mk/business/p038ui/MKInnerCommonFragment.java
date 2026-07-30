package com.hellogroup.p036mk.business.p038ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.hellogroup.p036mk.business.base.fragment.BaseMkFragment;
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.putong.core.data.Permissions;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bec0;
import p153l.jzv;
import p153l.pcc0;
import p153l.x0c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 72\u00020\u0001:\u00018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001b\u0010\u0003J\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u0003J\u000f\u0010\u001d\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001d\u0010\tJ\u000f\u0010\u001e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u0003J)\u0010#\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010!H\u0014¢\u0006\u0004\b#\u0010$J/\u0010)\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u00042\u000e\u0010&\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00100%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\fH\u0016¢\u0006\u0004\b+\u0010\u0003R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00069"}, m88121d2 = {"Lcom/hellogroup/mk/business/ui/MKInnerCommonFragment;", "Lcom/hellogroup/mk/business/base/fragment/BaseMkFragment;", "<init>", "()V", "", "b4", "()I", "", "i4", "()Z", "Landroid/view/View;", "contentView", "", "f4", "(Landroid/view/View;)V", "m4", "", "u4", "()Ljava/lang/String;", "Lcom/hellogroup/mk/business/base/ui/MKWebView;", "mkWebView", "Ll/x0c;", "webViewHelper", "v4", "(Lcom/hellogroup/mk/business/base/ui/MKWebView;Ll/x0c;)V", "onStart", "onResume", "l4", "onPause", "w4", "onStop", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "k4", "(IILandroid/content/Intent;)V", "", Permissions.TYPE, "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "onDestroyView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "W", "Landroidx/constraintlayout/widget/ConstraintLayout;", "containerMK", "Lcom/hellogroup/mk/business/ui/MKWebViewWrapper;", "X", "Lcom/hellogroup/mk/business/ui/MKWebViewWrapper;", "mkWebWrapper", "Y", "Ljava/lang/String;", "mkUrl", "Companion", "a", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class MKInnerCommonFragment extends BaseMkFragment {

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private ConstraintLayout containerMK;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private MKWebViewWrapper mkWebWrapper;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private String mkUrl = "";

    /* JADX INFO: renamed from: Z */
    private HashMap f12237Z;

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment
    /* JADX INFO: renamed from: b4 */
    public int mo17792b4() {
        return bec0.f76364d;
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment
    /* JADX INFO: renamed from: f4 */
    public void mo17796f4(@Nullable View contentView) {
        String strM18147u4;
        Bundle arguments = getArguments();
        if (arguments == null || (strM18147u4 = arguments.getString("param_start_url")) == null) {
            strM18147u4 = m18147u4();
        }
        if (strM18147u4 == null) {
            strM18147u4 = "";
        }
        this.mkUrl = strM18147u4;
        this.containerMK = contentView != null ? (ConstraintLayout) contentView.findViewById(pcc0.f151553g) : null;
        MKWebViewWrapper mKWebViewWrapper = contentView != null ? (MKWebViewWrapper) contentView.findViewById(pcc0.f151558l) : null;
        this.mkWebWrapper = mKWebViewWrapper;
        if (mKWebViewWrapper != null) {
            MKWebViewWrapper.m18166v0(mKWebViewWrapper, null, false, this.mkUrl, false, null, null, null, null, new Function1<MKWebView, Unit>() { // from class: com.hellogroup.mk.business.ui.MKInnerCommonFragment$initViews$1
                {
                    super(1);
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MKWebView mKWebView) {
                    mKWebView.getClass();
                    MKInnerCommonFragment mKInnerCommonFragment = this.this$0;
                    MKWebViewWrapper mKWebViewWrapper2 = mKInnerCommonFragment.mkWebWrapper;
                    MKWebView mkWebView = mKWebViewWrapper2 != null ? mKWebViewWrapper2.getMkWebView() : null;
                    MKWebViewWrapper mKWebViewWrapper3 = this.this$0.mkWebWrapper;
                    mKInnerCommonFragment.m18148v4(mkWebView, mKWebViewWrapper3 != null ? mKWebViewWrapper3.getCustomWebViewHelper() : null);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MKWebView mKWebView) {
                    invoke2(mKWebView);
                    return Unit.INSTANCE;
                }
            }, 251, null);
        }
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment
    /* JADX INFO: renamed from: i4 */
    public boolean mo17799i4() {
        return true;
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment
    /* JADX INFO: renamed from: k4 */
    public void mo17801k4(int requestCode, int resultCode, @Nullable Intent data) {
        super.mo17801k4(requestCode, resultCode, data);
        MKWebViewWrapper mKWebViewWrapper = this.mkWebWrapper;
        if (mKWebViewWrapper != null) {
            mKWebViewWrapper.m18178z0(requestCode, resultCode, data);
        }
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment
    /* JADX INFO: renamed from: l4 */
    public void mo17802l4() {
        MKWebViewWrapper mKWebViewWrapper;
        jzv.m147732e(this.f12030z, "onFragmentResume");
        super.mo17802l4();
        if (!m18149w4() || (mKWebViewWrapper = this.mkWebWrapper) == null) {
            return;
        }
        mKWebViewWrapper.m18171G0();
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment
    /* JADX INFO: renamed from: m4 */
    public void mo17803m4() {
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        MKWebViewWrapper mKWebViewWrapper = this.mkWebWrapper;
        if (mKWebViewWrapper != null) {
            mKWebViewWrapper.onDestroy();
        }
        m18146s4();
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment, androidx.fragment.app.Fragment
    public void onPause() {
        MKWebViewWrapper mKWebViewWrapper;
        super.onPause();
        jzv.m147732e(this.f12030z, "onPause");
        if (m18149w4() || (mKWebViewWrapper = this.mkWebWrapper) == null) {
            return;
        }
        mKWebViewWrapper.m18169D0();
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment, androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        permissions.getClass();
        grantResults.getClass();
        MKWebViewWrapper mKWebViewWrapper = this.mkWebWrapper;
        if (mKWebViewWrapper != null) {
            mKWebViewWrapper.m18170E0(requestCode, permissions, grantResults);
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment, androidx.fragment.app.Fragment
    public void onResume() {
        MKWebViewWrapper mKWebViewWrapper;
        super.onResume();
        jzv.m147732e(this.f12030z, "onResume");
        if (m18149w4() || (mKWebViewWrapper = this.mkWebWrapper) == null) {
            return;
        }
        mKWebViewWrapper.m18171G0();
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        jzv.m147732e(this.f12030z, "onStart");
        MKWebViewWrapper mKWebViewWrapper = this.mkWebWrapper;
        if (mKWebViewWrapper != null) {
            mKWebViewWrapper.m18172H0();
        }
    }

    @Override // com.hellogroup.p036mk.business.base.fragment.BaseMkFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        jzv.m147732e(this.f12030z, "onStop");
        MKWebViewWrapper mKWebViewWrapper = this.mkWebWrapper;
        if (mKWebViewWrapper != null) {
            mKWebViewWrapper.m18173I0();
        }
    }

    /* JADX INFO: renamed from: s4 */
    public void m18146s4() {
        HashMap map = this.f12237Z;
        if (map != null) {
            map.clear();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: u4 */
    public String m18147u4() {
        return null;
    }

    /* JADX INFO: renamed from: w4 */
    public boolean m18149w4() {
        return false;
    }

    /* JADX INFO: renamed from: v4 */
    public void m18148v4(@Nullable MKWebView mkWebView, @Nullable x0c webViewHelper) {
    }
}
