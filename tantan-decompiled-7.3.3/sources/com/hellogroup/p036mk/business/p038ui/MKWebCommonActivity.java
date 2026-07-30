package com.hellogroup.p036mk.business.p038ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.hellogroup.p036mk.business.MKConfigSetter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bec0;
import p153l.c2j0;
import p153l.d2f;
import p153l.ojw;
import p153l.pcc0;
import p153l.vjw;
import p153l.wam;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J+\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010\u0003J\u000f\u0010 \u001a\u00020\u0006H\u0014¢\u0006\u0004\b \u0010\u0003J\u000f\u0010!\u001a\u00020\u0006H\u0014¢\u0006\u0004\b!\u0010\u0003J\u000f\u0010\"\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\"\u0010\u0003J\u000f\u0010#\u001a\u00020\u0006H\u0014¢\u0006\u0004\b#\u0010\u0003R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.¨\u00062"}, m88121d2 = {"Lcom/hellogroup/mk/business/ui/MKWebCommonActivity;", "Lcom/hellogroup/mk/business/ui/BaseMKProxyActivity;", "<init>", "()V", "", "startUrl", "", "R2", "(Ljava/lang/String;)V", "", "G1", "()I", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "Q2", "()Z", "Ll/wam;", "M1", "()Ll/wam;", "show", "B2", "(Z)V", "isShow", "failingUrl", "errorStr", "I2", "(ZLjava/lang/String;Ljava/lang/String;)V", "C2", "onStart", "onResume", "onPause", "onStop", "onDestroy", "Ll/d2f;", "Z", "Ll/d2f;", "loadingViewManager", "Landroid/widget/FrameLayout;", "k0", "Landroid/widget/FrameLayout;", "toolbarContainer", "Landroid/view/ViewGroup;", "p0", "Landroid/view/ViewGroup;", "curToolbarView", "Companion", "a", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class MKWebCommonActivity extends BaseMKProxyActivity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private d2f loadingViewManager;

    /* JADX INFO: renamed from: k0, reason: from kotlin metadata */
    private FrameLayout toolbarContainer;

    /* JADX INFO: renamed from: p0, reason: from kotlin metadata */
    private ViewGroup curToolbarView;

    /* JADX INFO: renamed from: R2 */
    private final void m18150R2(String startUrl) {
        c2j0 c2j0Var;
        vjw vjwVar = vjw.INSTANCE;
        this.loadingViewManager = vjw.m201553c(vjwVar, m17784U0(), startUrl, this.f12181G, this.f12202h, this.f12204j, Boolean.FALSE, false, 64, null);
        View viewFindViewById = findViewById(pcc0.f151564r);
        if (!(viewFindViewById instanceof FrameLayout)) {
            viewFindViewById = null;
        }
        this.toolbarContainer = (FrameLayout) viewFindViewById;
        ViewGroup viewGroupM201554a = vjwVar.m201554a(m17784U0(), startUrl, this.f12183I, this.toolbarContainer, this.f12204j);
        this.curToolbarView = viewGroupM201554a;
        if (viewGroupM201554a == null || (c2j0Var = this.f12005c) == null) {
            return;
        }
        c2j0Var.m107696h();
    }

    @JvmStatic
    /* JADX INFO: renamed from: S2 */
    public static final void m18151S2(@NotNull Context context, @Nullable String str) {
        INSTANCE.m18152a(context, str);
    }

    @Override // com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity
    /* JADX INFO: renamed from: B2 */
    public void mo18091B2(boolean show) {
        ViewGroup viewGroup = this.curToolbarView;
        if (viewGroup != null) {
            viewGroup.setVisibility(show ? 0 : 8);
        } else {
            super.mo18091B2(show);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity
    /* JADX INFO: renamed from: C2 */
    public void mo18092C2(boolean isShow) {
        d2f d2fVar;
        if (this.f12180F || (d2fVar = this.loadingViewManager) == null) {
            return;
        }
        d2fVar.m113696g(isShow);
    }

    @Override // com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity
    /* JADX INFO: renamed from: G1 */
    public int mo18096G1() {
        return bec0.f76361a;
    }

    @Override // com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity
    /* JADX INFO: renamed from: I2 */
    public void mo18100I2(boolean isShow, @Nullable String failingUrl, @Nullable String errorStr) {
        d2f d2fVar = this.loadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113697h(isShow, failingUrl, errorStr);
        } else {
            super.mo18100I2(isShow, failingUrl, errorStr);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity
    @Nullable
    /* JADX INFO: renamed from: M1 */
    public wam mo18102M1() {
        wam wamVarM17771n = MKConfigSetter.INSTANCE.m17771n(this);
        return wamVarM17771n != null ? wamVarM17771n : super.mo18102M1();
    }

    @Override // com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity
    /* JADX INFO: renamed from: Q2 */
    public boolean mo18105Q2() {
        return true;
    }

    @Override // com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        m18150R2(this.f12218x);
    }

    @Override // com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        d2f d2fVar = this.loadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113691b(this);
        }
    }

    @Override // com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        d2f d2fVar = this.loadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113692c(this);
        }
    }

    @Override // com.hellogroup.p036mk.business.p038ui.BaseMKProxyActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        d2f d2fVar = this.loadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113693d(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        d2f d2fVar = this.loadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113694e(this);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        d2f d2fVar = this.loadingViewManager;
        if (d2fVar != null) {
            d2fVar.m113695f(this);
        }
    }

    /* JADX INFO: renamed from: com.hellogroup.mk.business.ui.MKWebCommonActivity$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"Lcom/hellogroup/mk/business/ui/MKWebCommonActivity$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "url", "", "a", "(Landroid/content/Context;Ljava/lang/String;)V", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        /* JADX INFO: renamed from: a */
        public final void m18152a(@NotNull Context context, @Nullable String url) {
            context.getClass();
            if (BaseMKProxyActivity.m18089v1(url)) {
                MKCommonWebPanelActivity.Companion.m18143b(MKCommonWebPanelActivity.INSTANCE, context, url, null, 4, null);
                return;
            }
            ojw ojwVarM17763b = MKConfigSetter.INSTANCE.m17763b();
            Class<? extends BaseMKProxyActivity> clsM167946e = ojwVarM17763b != null ? ojwVarM17763b.m167946e() : null;
            if (clsM167946e == null) {
                clsM167946e = MKWebCommonActivity.class;
            }
            BaseMKProxyActivity.m18050K2(clsM167946e, context, url);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
