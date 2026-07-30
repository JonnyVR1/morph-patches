package com.p051p1.mobile.putong.core.p058ui.quicklogin;

import android.animation.Animator;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.clevertap.android.sdk.Constants;
import com.effectsar.labcv.effectsdk.EffectsSDKEffectConstants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bxi0;
import p153l.gt0;
import p153l.swi0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006)"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/quicklogin/ThirdPayQuickLoginAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "preCreateView", "(Landroid/os/Bundle;)V", "initDataOnCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/animation/Animator;", "exitAnimation", "()Landroid/animation/Animator;", "", "pageId", "()Ljava/lang/String;", "Ll/swi0;", "c", "Ll/swi0;", "X1", "()Ll/swi0;", "Z1", "(Ll/swi0;)V", "presenter", "Ll/bxi0;", Constants.INAPP_DATA_TAG, "Ll/bxi0;", "Y1", "()Ll/bxi0;", "a2", "(Ll/bxi0;)V", "viewModel", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ThirdPayQuickLoginAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public swi0 presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public bxi0 viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.quicklogin.ThirdPayQuickLoginAct$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/quicklogin/ThirdPayQuickLoginAct$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Landroid/content/Intent;", "a", "(Lcom/p1/mobile/android/app/Act;)Landroid/content/Intent;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m55805a(@NotNull Act act) {
            act.getClass();
            return new Intent(act, (Class<?>) ThirdPayQuickLoginAct.class);
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public final swi0 m55801X1() {
        swi0 swi0Var = this.presenter;
        if (swi0Var != null) {
            return swi0Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y1 */
    public final bxi0 m55802Y1() {
        bxi0 bxi0Var = this.viewModel;
        if (bxi0Var != null) {
            return bxi0Var;
        }
        Intrinsics.m88391r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m55803Z1(@NotNull swi0 swi0Var) {
        swi0Var.getClass();
        this.presenter = swi0Var;
    }

    /* JADX INFO: renamed from: a2 */
    public final void m55804a2(@NotNull bxi0 bxi0Var) {
        bxi0Var.getClass();
        this.viewModel = bxi0Var;
    }

    @Override // com.p051p1.mobile.android.app.Act
    @Nullable
    public Animator exitAnimation() {
        return gt0.m132164j(1);
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewInflateView = m55802Y1().inflateView(inflater, parent);
        m55801X1().m188324e0();
        return viewInflateView;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_intl_topup_authorization_page";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
        m55803Z1(new swi0(this));
        m55804a2(new bxi0(this));
        m55801X1().mo52715C(m55802Y1());
    }
}
