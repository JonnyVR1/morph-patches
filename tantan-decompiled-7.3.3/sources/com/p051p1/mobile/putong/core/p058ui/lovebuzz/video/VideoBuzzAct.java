package com.p051p1.mobile.putong.core.p058ui.lovebuzz.video;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseBuzzSearchFrag;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseMediaBuzzAct;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.video.call.VideoBuzzCallFrag;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bdc0;
import p153l.d9c0;
import p153l.pf60;
import p153l.qn3;
import p153l.ual0;
import p153l.x20;
import p153l.xal0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J!\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00061"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/video/VideoBuzzAct;", "Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseMediaBuzzAct;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "preCreateView", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "pageType", "X1", "(Ljava/lang/String;)V", "", "full", "Landroid/view/SurfaceView;", "a2", "(Z)Landroid/view/SurfaceView;", "onBackPressed", "Ljava/util/ArrayList;", "Ll/pf60;", "Ll/x20;", "debugItems", "()Ljava/util/ArrayList;", "Ll/ual0;", "c", "Ll/ual0;", "Y1", "()Ll/ual0;", "c2", "(Ll/ual0;)V", "presenter", "Ll/xal0;", Constants.INAPP_DATA_TAG, "Ll/xal0;", "Z1", "()Ll/xal0;", "d2", "(Ll/xal0;)V", "viewModel", "Companion", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class VideoBuzzAct extends BaseMediaBuzzAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public ual0 presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public xal0 viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.video.VideoBuzzAct$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ'\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000f¨\u0006\u0015"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/video/VideoBuzzAct$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "pageType", "Landroid/content/Intent;", "a", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)Landroid/content/Intent;", "modeType", "b", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "TAG", "Ljava/lang/String;", "SEARCH_VIDEO", "VIDEO_CALL", "MODE_TYPE", "PAGE_TYPE", "FROM", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m48255a(@NotNull Act act, @NotNull String pageType) {
            act.getClass();
            pageType.getClass();
            return m48256b(act, pageType, Active.TYPE);
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final Intent m48256b(@NotNull Act act, @NotNull String pageType, @NotNull String modeType) {
            act.getClass();
            pageType.getClass();
            modeType.getClass();
            Intent intent = new Intent(act, (Class<?>) VideoBuzzAct.class);
            intent.putExtra("page_type", pageType);
            intent.putExtra("MODE_TYPE", modeType);
            return intent;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: b2 */
    public static /* synthetic */ SurfaceView m48249b2(VideoBuzzAct videoBuzzAct, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return videoBuzzAct.m48252a2(z);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.lovebuzz.common.BaseMediaBuzzAct
    /* JADX INFO: renamed from: X1 */
    public void mo48105X1(@NotNull String pageType) {
        pageType.getClass();
        super.mo48105X1(pageType);
        m48251Z1().m209878i(pageType);
    }

    @NotNull
    /* JADX INFO: renamed from: Y1 */
    public final ual0 m48250Y1() {
        ual0 ual0Var = this.presenter;
        if (ual0Var != null) {
            return ual0Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z1 */
    public final xal0 m48251Z1() {
        xal0 xal0Var = this.viewModel;
        if (xal0Var != null) {
            return xal0Var;
        }
        Intrinsics.m88391r("viewModel");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a2 */
    public final SurfaceView m48252a2(boolean full) {
        return m48251Z1().m209883v(full);
    }

    /* JADX INFO: renamed from: c2 */
    public final void m48253c2(@NotNull ual0 ual0Var) {
        ual0Var.getClass();
        this.presenter = ual0Var;
    }

    /* JADX INFO: renamed from: d2 */
    public final void m48254d2(@NotNull xal0 xal0Var) {
        xal0Var.getClass();
        this.viewModel = xal0Var;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    @NotNull
    public ArrayList<pf60<String, x20>> debugItems() {
        FragmentManager supportFragmentManager = this.act.getSupportFragmentManager();
        supportFragmentManager.getClass();
        Fragment fragmentM2555h0 = supportFragmentManager.m2555h0(bdc0.f76256m);
        if (fragmentM2555h0 instanceof BaseBuzzSearchFrag) {
            return ((BaseBuzzSearchFrag) fragmentM2555h0).mo30631C4();
        }
        ArrayList<pf60<String, x20>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.getClass();
        return arrayListDebugItems;
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflateView = m48251Z1().inflateView(inflater, parent);
        m48251Z1().m209882r();
        m48250Y1().m195178h0();
        return viewInflateView;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (getSupportFragmentManager().m2555h0(bdc0.f76255l) instanceof VideoBuzzCallFrag) {
            return;
        }
        Fragment fragmentM2555h0 = getSupportFragmentManager().m2555h0(bdc0.f76256m);
        if (fragmentM2555h0 instanceof BaseBuzzSearchFrag) {
            ((BaseBuzzSearchFrag) fragmentM2555h0).m48102o();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
        setStatusBarColorResId(d9c0.f85757n);
        Act act = this.act;
        if (act != null) {
            act.setSwipeBackEnable(false);
        }
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
        m48253c2(new ual0(this));
        m48254d2(new xal0(this));
        qn3.INSTANCE.m177203y();
        m48250Y1().mo52715C(m48251Z1());
    }
}
