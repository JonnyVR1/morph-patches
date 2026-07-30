package com.clevertap.android.sdk.inapp.fragment;

import android.content.Context;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.inapp.media.NoOpMediaHandler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.qqm;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b \u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004J\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u000f\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBasePartialFragment;", "Lcom/clevertap/android/sdk/inapp/fragment/CTInAppBaseFragment;", "Ll/qqm;", "<init>", "()V", "", "u4", "v4", "onStart", "onStop", "V3", "a4", "Ljava/util/concurrent/atomic/AtomicBoolean;", "H", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isCleanedUp", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public abstract class CTInAppBasePartialFragment extends CTInAppBaseFragment implements qqm {

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    @NotNull
    private final AtomicBoolean isCleanedUp = new AtomicBoolean();

    /* JADX INFO: renamed from: u4 */
    private final void m6485u4() {
        Context context = getContext();
        if (context != null) {
            CleverTapAPI.m5814U(context, m6446d4()).m5847H().getInAppController().m6319Y(this);
        }
    }

    /* JADX INFO: renamed from: v4 */
    private final void m6486v4() {
        Context context = getContext();
        if (context != null) {
            CleverTapAPI.m5814U(context, m6446d4()).m5847H().getInAppController().m6324f0();
        }
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    /* JADX INFO: renamed from: V3 */
    public void mo6439V3() {
        if (!(m6450h4() instanceof NoOpMediaHandler)) {
            getLifecycle().mo2970d(m6450h4());
            m6450h4().cleanup();
        }
        FragmentActivity activity = getActivity();
        if (activity == null || Utils.m5979v(activity) || !this.isCleanedUp.compareAndSet(false, true)) {
            return;
        }
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        supportFragmentManager.getClass();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        abstractC0428kM2568m.getClass();
        try {
            abstractC0428kM2568m.mo2716r(this).mo2708i();
        } catch (IllegalStateException unused) {
            supportFragmentManager.m2568m().mo2716r(this).mo2709j();
        }
    }

    @Override // com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment
    /* JADX INFO: renamed from: a4 */
    public void mo6443a4() {
        m6459r4(CleverTapAPI.m5814U(requireContext(), m6446d4()).m5847H().getInAppController());
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.isCleanedUp.get()) {
            mo6439V3();
        }
        m6485u4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m6486v4();
    }
}
