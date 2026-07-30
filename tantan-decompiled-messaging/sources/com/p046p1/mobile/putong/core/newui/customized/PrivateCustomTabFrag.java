package com.p046p1.mobile.putong.core.newui.customized;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.newui.customized.PrivateCustomTabFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.e30;
import p149l.mkd0;
import p149l.ns80;
import p149l.qs80;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001f\u0010\u0011J\u0019\u0010!\u001a\u00020\u00042\b\u0010 \u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b!\u0010\u0011R\u0014\u0010$\u001a\u00020\u00188\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u0010#R\u001b\u0010*\u001a\u00020%8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010.¨\u00060"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/customized/PrivateCustomTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "disableAutoPV", "()Z", "hidden", "onHiddenChanged", "(Z)V", "", "navigation_to", "R4", "(Ljava/lang/String;)V", "pageId", "()Ljava/lang/String;", "outState", "onSaveInstanceState", "savedInstanceState", "onViewStateRestored", BaseSei.f13932Z, "Ljava/lang/String;", "KEY_CURRENT_SHOW_POSITION", "Ll/ns80;", "A", "Lkotlin/Lazy;", "P4", "()Ll/ns80;", "presenter", "Ll/qs80;", "B", "Q4", "()Ll/qs80;", "viewModel", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        this.presenter = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.ks80
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateCustomTabFrag.m36195M4(this.f124425a);
            }
        });
        this.viewModel = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.ls80
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PrivateCustomTabFrag.m36197O4(this.f129814a);
            }
        });
    }

    /* JADX INFO: renamed from: M4 */
    public static ns80 m36195M4(PrivateCustomTabFrag privateCustomTabFrag) {
        return new ns80(privateCustomTabFrag);
    }

    /* JADX INFO: renamed from: N4 */
    public static void m36196N4(PrivateCustomTabFrag privateCustomTabFrag, boolean z) {
        if (z) {
            privateCustomTabFrag.mo29638J4().m109036l();
        } else {
            privateCustomTabFrag.mo29638J4().m109035k();
        }
    }

    /* JADX INFO: renamed from: O4 */
    public static qs80 m36197O4(PrivateCustomTabFrag privateCustomTabFrag) {
        return new qs80(privateCustomTabFrag);
    }

    /* JADX INFO: renamed from: P4 */
    private final ns80 m36198P4() {
        return (ns80) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    public final qs80 m36199Q4() {
        return (qs80) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: R4 */
    public final void m36200R4(@Nullable String navigation_to) {
        if (Intrinsics.m87488d("nearby", navigation_to)) {
            m36199Q4().m176163u();
        } else if (Intrinsics.m87488d("personalized", navigation_to)) {
            m36199Q4().m176162s();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m36198P4().mo51532C(m36199Q4());
        m36198P4().m160766i0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m36198P4().mo39470a0();
        if (m36198P4().m160767j0() > 1) {
            m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.ms80
                @Override // p149l.e30
                public final void call(Object obj) {
                    PrivateCustomTabFrag.m36196N4(this.f135456a, ((Boolean) obj).booleanValue());
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
        m36199Q4().m176161r();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m36199Q4().inflateView(inflater, container);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        m36199Q4().m176158n(hidden);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle outState) {
        outState.getClass();
        super.onSaveInstanceState(outState);
        outState.putInt(this.KEY_CURRENT_SHOW_POSITION, m36199Q4().m176152e());
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (savedInstanceState != null) {
            if (savedInstanceState.getInt(this.KEY_CURRENT_SHOW_POSITION) == 1) {
                m36199Q4().m176162s();
            } else {
                m36199Q4().m176163u();
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_home_second_page";
    }
}
