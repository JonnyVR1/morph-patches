package com.p000p1.mobile.putong.core.newui.customized;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.customized.PrivateCustomTabFrag;
import com.p1.mobile.putong.app.PutongFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.mkd0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.ns80;
import p009l.qs80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J\u0019\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b!\u0010\u0011R\u0014\u0010$\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "disableAutoPV", "()Z", "hidden", "onHiddenChanged", "(Z)V", "", "navigation_to", "R4", "(Ljava/lang/String;)V", "pageId", "()Ljava/lang/String;", "outState", "onSaveInstanceState", "savedInstanceState", "onViewStateRestored", "z", "Ljava/lang/String;", "KEY_CURRENT_SHOW_POSITION", "Ll/ns80;", "A", "Lkotlin/Lazy;", "P4", "()Ll/ns80;", "presenter", "Ll/qs80;", "B", "Q4", "()Ll/qs80;", "viewModel", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        this.presenter = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.ks80
            public final Object invoke() {
                return PrivateCustomTabFrag.m97M4(this.f15832a);
            }
        });
        this.viewModel = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.ls80
            public final Object invoke() {
                return PrivateCustomTabFrag.m99O4(this.f16390a);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public static ns80 m97M4(PrivateCustomTabFrag privateCustomTabFrag) {
        return new ns80(privateCustomTabFrag);
    }

    /* JADX INFO: renamed from: N4 */
    public static void m98N4(PrivateCustomTabFrag privateCustomTabFrag, boolean z) {
        if (z) {
            privateCustomTabFrag.J4().l();
        } else {
            privateCustomTabFrag.J4().k();
        }
    }

    /* JADX INFO: renamed from: O4 */
    public static qs80 m99O4(PrivateCustomTabFrag privateCustomTabFrag) {
        return new qs80(privateCustomTabFrag);
    }

    /* JADX INFO: renamed from: P4 */
    private final ns80 m100P4() {
        return (ns80) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    public final qs80 m101Q4() {
        return (qs80) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: R4 */
    public final void m102R4(@Nullable String navigation_to) {
        if (Intrinsics.d("nearby", navigation_to)) {
            m101Q4().m21233u();
        } else if (Intrinsics.d("personalized", navigation_to)) {
            m101Q4().m21232s();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m103d4() {
        super.d4();
        m100P4().C(m101Q4());
        m100P4().m19047i0();
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: f4 */
    public void m104f4() {
        super.f4();
        m100P4().a0();
        if (m100P4().m19048j0() > 1) {
            L4().subscribe(mkd0.G(new e30() { // from class: l.ms80
                public final void call(Object obj) {
                    PrivateCustomTabFrag.m98N4(this.f17061a, ((Boolean) obj).booleanValue());
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m105g4(@Nullable Bundle sis) {
        super/*com.p1.mobile.android.app.Frag*/.g4(sis);
        m101Q4().m21231r();
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m101Q4().inflateView(inflater, container);
    }

    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        m101Q4().m21228n(hidden);
    }

    public void onSaveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(outState);
        outState.putInt(this.KEY_CURRENT_SHOW_POSITION, m101Q4().m21221e());
    }

    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super/*androidx.fragment.app.Fragment*/.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            if (savedInstanceState.getInt(this.KEY_CURRENT_SHOW_POSITION) == 1) {
                m101Q4().m21232s();
            } else {
                m101Q4().m21233u();
            }
        }
    }

    @NotNull
    public String pageId() {
        return "p_home_second_page";
    }
}
