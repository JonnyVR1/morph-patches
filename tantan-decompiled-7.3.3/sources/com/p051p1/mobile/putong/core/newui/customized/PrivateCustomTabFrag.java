package com.p051p1.mobile.putong.core.newui.customized;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.newui.customized.PrivateCustomTabFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.psd0;
import p153l.r090;
import p153l.u090;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J\u0019\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b!\u0010\u0011R\u0014\u0010$\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.¨\u00060"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "disableAutoPV", "()Z", "hidden", "onHiddenChanged", "(Z)V", "", "navigation_to", "R4", "(Ljava/lang/String;)V", "pageId", "()Ljava/lang/String;", "outState", "onSaveInstanceState", "savedInstanceState", "onViewStateRestored", BaseSei.f14626Z, "Ljava/lang/String;", "KEY_CURRENT_SHOW_POSITION", "Ll/r090;", "A", "Lkotlin/Lazy;", "P4", "()Ll/r090;", "presenter", "Ll/u090;", "B", "Q4", "()Ll/u090;", "viewModel", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PrivateCustomTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy presenter;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final String KEY_CURRENT_SHOW_POSITION = "key_current_show_position";

    public PrivateCustomTabFrag() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.presenter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.o090
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateCustomTabFrag.m37198M4(this.f144504a);
            }
        });
        this.viewModel = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.p090
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateCustomTabFrag.m37200O4(this.f150019a);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public static r090 m37198M4(PrivateCustomTabFrag privateCustomTabFrag) {
        return new r090(privateCustomTabFrag);
    }

    /* JADX INFO: renamed from: N4 */
    public static void m37199N4(PrivateCustomTabFrag privateCustomTabFrag, boolean z) {
        if (z) {
            privateCustomTabFrag.mo30636J4().m152777l();
        } else {
            privateCustomTabFrag.mo30636J4().m152776k();
        }
    }

    /* JADX INFO: renamed from: O4 */
    public static u090 m37200O4(PrivateCustomTabFrag privateCustomTabFrag) {
        return new u090(privateCustomTabFrag);
    }

    /* JADX INFO: renamed from: P4 */
    private final r090 m37201P4() {
        return (r090) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    public final u090 m37202Q4() {
        return (u090) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: R4 */
    public final void m37203R4(@Nullable String navigation_to) {
        if (Intrinsics.m88377d("nearby", navigation_to)) {
            m37202Q4().m193808u();
        } else if (Intrinsics.m88377d("personalized", navigation_to)) {
            m37202Q4().m193807s();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m37201P4().mo52715C(m37202Q4());
        m37201P4().m179214i0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m37201P4().mo40473a0();
        if (m37201P4().m179215j0() > 1) {
            m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.q090
                @Override // p153l.y20
                public final void call(Object obj) {
                    PrivateCustomTabFrag.m37199N4(this.f155035a, ((Boolean) obj).booleanValue());
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
        m37202Q4().m193806r();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m37202Q4().inflateView(inflater, container);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        m37202Q4().m193803n(hidden);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        super.onSaveInstanceState(outState);
        outState.putInt(this.KEY_CURRENT_SHOW_POSITION, m37202Q4().m193797e());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            if (savedInstanceState.getInt(this.KEY_CURRENT_SHOW_POSITION) == 1) {
                m37202Q4().m193807s();
            } else {
                m37202Q4().m193808u();
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_home_second_page";
    }
}
