package com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity;

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
import com.p051p1.mobile.putong.core.data.IntlCampingEnvelope;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.f6n;
import p153l.gt0;
import p153l.x5n;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 (2\u00020\u0001:\u0001)B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006*"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/campingactivity/IntlCampingAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "preCreateView", "(Landroid/os/Bundle;)V", "initDataOnCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/animation/Animator;", "exitAnimation", "()Landroid/animation/Animator;", "", "isAnonymousMode", "()Z", "shouldSwitchToTransparentStatus", "Ll/x5n;", "c", "Ll/x5n;", "X1", "()Ll/x5n;", "Z1", "(Ll/x5n;)V", "presenter", "Ll/f6n;", Constants.INAPP_DATA_TAG, "Ll/f6n;", "Y1", "()Ll/f6n;", "a2", "(Ll/f6n;)V", "viewModel", "Companion", "a", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class IntlCampingAct extends PutongAct {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public x5n presenter;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public f6n viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intloperation.campingactivity.IntlCampingAct$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/intloperation/campingactivity/IntlCampingAct$a;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;", "data", "Landroid/content/Intent;", "a", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/IntlCampingEnvelope;)Landroid/content/Intent;", "", "RESULT_DATA", "Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Intent m47431b(Companion companion, Act act, IntlCampingEnvelope intlCampingEnvelope, int i, Object obj) {
            if ((i & 2) != 0) {
                intlCampingEnvelope = null;
            }
            return companion.m47432a(act, intlCampingEnvelope);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final Intent m47432a(@NotNull Act act, @Nullable IntlCampingEnvelope data) {
            act.getClass();
            Intent intent = new Intent(act, (Class<?>) IntlCampingAct.class);
            intent.putExtra("result_data", data);
            return intent;
        }

        public Companion() {
        }
    }

    @NotNull
    /* JADX INFO: renamed from: X1 */
    public final x5n m47427X1() {
        x5n x5nVar = this.presenter;
        if (x5nVar != null) {
            return x5nVar;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Y1 */
    public final f6n m47428Y1() {
        f6n f6nVar = this.viewModel;
        if (f6nVar != null) {
            return f6nVar;
        }
        Intrinsics.m88391r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: Z1 */
    public final void m47429Z1(@NotNull x5n x5nVar) {
        x5nVar.getClass();
        this.presenter = x5nVar;
    }

    /* JADX INFO: renamed from: a2 */
    public final void m47430a2(@NotNull f6n f6nVar) {
        f6nVar.getClass();
        this.viewModel = f6nVar;
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
        View viewInflateView = m47428Y1().inflateView(inflater, parent);
        m47427X1().m209404h0();
        m47427X1().m209403f0();
        return viewInflateView;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        getWindow().getDecorView().setSystemUiVisibility(EffectsSDKEffectConstants.FaceSegmentConfig.BEFF_MOBILE_FACE_REST_MASK);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(@Nullable Bundle sis) {
        super.preCreateView(sis);
        IntlCampingEnvelope intlCampingEnvelope = (IntlCampingEnvelope) this.act.getIntent().getSerializableExtra("result_data");
        m47429Z1(new x5n(this));
        m47430a2(new f6n(this, intlCampingEnvelope));
        m47427X1().mo52715C(m47428Y1());
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
