package com.p000p1.mobile.putong.core.newui.supreme.hometab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import com.p1.mobile.putong.app.PutongFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import l.gr9;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.j1h0;
import p009l.l1h0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001a¨\u00060"}, d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "n4", "(Landroid/os/Bundle;)V", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "g4", "", "hidden", "onHiddenChanged", "(Z)V", "", "navigation_to", "Q4", "(Ljava/lang/String;)V", "savedInstanceState", "onViewStateRestored", "Ll/l1h0;", "z", "Lkotlin/Lazy;", "O4", "()Ll/l1h0;", "presenter", "Ll/j1h0;", "A", "P4", "()Ll/j1h0;", "viewModel", "B", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "from", "Companion", "a", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SupremePartnerTabFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final Lazy viewModel;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    public String from;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final Lazy presenter;

    public SupremePartnerTabFrag() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.presenter = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.f1h0
            public final Object invoke() {
                return SupremePartnerTabFrag.m7941N4(this.f12750a);
            }
        });
        this.viewModel = LazyKt__LazyJVMKt.a(lazyThreadSafetyMode, new Function0() { // from class: l.g1h0
            public final Object invoke() {
                return SupremePartnerTabFrag.m7940M4(this.f13262a);
            }
        });
        this.from = "";
    }

    /* JADX INFO: renamed from: M4 */
    public static j1h0 m7940M4(SupremePartnerTabFrag supremePartnerTabFrag) {
        return new j1h0(supremePartnerTabFrag);
    }

    /* JADX INFO: renamed from: N4 */
    public static l1h0 m7941N4(SupremePartnerTabFrag supremePartnerTabFrag) {
        return new l1h0(supremePartnerTabFrag);
    }

    /* JADX INFO: renamed from: O4 */
    private final l1h0 m7942O4() {
        return (l1h0) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    public final j1h0 m7943P4() {
        return (j1h0) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m7944Q4(@Nullable String navigation_to) {
        if (Intrinsics.d("nearby_people", navigation_to)) {
            m7943P4().m16841i().j(0, false);
            if (m7943P4().m16847n().getTabCount() > 0) {
                m7943P4().m16847n().selectTab(m7943P4().m16847n().getTabAt(0));
                return;
            }
            return;
        }
        if (!Intrinsics.d("online_zone", navigation_to) || m7943P4().m16847n().getTabCount() <= 1) {
            return;
        }
        m7943P4().m16841i().j(1, false);
        m7943P4().m16847n().selectTab(m7943P4().m16847n().getTabAt(1));
    }

    /* JADX INFO: renamed from: d4 */
    public void m7945d4() {
        super.d4();
        m7942O4().C(m7943P4());
        m7943P4().m16842i1(m7942O4());
    }

    /* JADX INFO: renamed from: f4 */
    public void m7946f4() {
        super.f4();
        m7942O4().a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m7947g4(@Nullable Bundle sis) {
        super/*com.p1.mobile.android.app.Frag*/.g4(sis);
        m7943P4().m16848r();
        m7942O4().m17631g0();
        if (Intrinsics.d("from_nearby_act", this.from)) {
            m7944Q4("online_zone");
        }
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m7943P4().inflateView(inflater, container);
    }

    /* JADX INFO: renamed from: n4 */
    public void m7948n4(@Nullable Bundle sis) {
        String string;
        super/*com.p1.mobile.android.app.Frag*/.n4(sis);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("from", "")) != null) {
            str = string;
        }
        this.from = str;
        m7943P4().m16853x(Intrinsics.d("from_nearby_act", this.from));
    }

    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        m7943P4().m16849s(hidden);
    }

    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super/*androidx.fragment.app.Fragment*/.onViewStateRestored(savedInstanceState);
        if (gr9.Companion.c()) {
            if (Intrinsics.d("from_nearby_act", this.from)) {
                m7944Q4("online_zone");
            } else {
                m7944Q4("nearby_people");
            }
        }
    }
}
