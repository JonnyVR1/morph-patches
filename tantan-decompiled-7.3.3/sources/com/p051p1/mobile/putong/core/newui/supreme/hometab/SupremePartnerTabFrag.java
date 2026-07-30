package com.p051p1.mobile.putong.core.newui.supreme.hometab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.r9h0;
import p153l.rs9;
import p153l.t9h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001a¨\u00060"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "n4", "(Landroid/os/Bundle;)V", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "g4", "", "hidden", "onHiddenChanged", "(Z)V", "", "navigation_to", "Q4", "(Ljava/lang/String;)V", "savedInstanceState", "onViewStateRestored", "Ll/t9h0;", BaseSei.f14626Z, "Lkotlin/Lazy;", "O4", "()Ll/t9h0;", "presenter", "Ll/r9h0;", "A", "P4", "()Ll/r9h0;", "viewModel", "B", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "from", "Companion", "a", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
        this.presenter = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.n9h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupremePartnerTabFrag.m44867N4(this.f140891a);
            }
        });
        this.viewModel = LazyKt__LazyJVMKt.m88117a(lazyThreadSafetyMode, new Function0() { // from class: l.o9h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupremePartnerTabFrag.m44866M4(this.f145578a);
            }
        });
        this.from = "";
    }

    /* JADX INFO: renamed from: M4 */
    public static r9h0 m44866M4(SupremePartnerTabFrag supremePartnerTabFrag) {
        return new r9h0(supremePartnerTabFrag);
    }

    /* JADX INFO: renamed from: N4 */
    public static t9h0 m44867N4(SupremePartnerTabFrag supremePartnerTabFrag) {
        return new t9h0(supremePartnerTabFrag);
    }

    /* JADX INFO: renamed from: O4 */
    private final t9h0 m44868O4() {
        return (t9h0) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    public final r9h0 m44869P4() {
        return (r9h0) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m44870Q4(@Nullable String navigation_to) {
        if (Intrinsics.m88377d("nearby_people", navigation_to)) {
            m44869P4().m180584i().m4252j(0, false);
            if (m44869P4().m180589n().getTabCount() > 0) {
                m44869P4().m180589n().selectTab(m44869P4().m180589n().getTabAt(0));
                return;
            }
            return;
        }
        if (!Intrinsics.m88377d("online_zone", navigation_to) || m44869P4().m180589n().getTabCount() <= 1) {
            return;
        }
        m44869P4().m180584i().m4252j(1, false);
        m44869P4().m180589n().selectTab(m44869P4().m180589n().getTabAt(1));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m44868O4().mo52715C(m44869P4());
        m44869P4().mo22064i1(m44868O4());
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m44868O4().mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
        m44869P4().m180590r();
        m44868O4().m189756g0();
        if (Intrinsics.m88377d("from_nearby_act", this.from)) {
            m44870Q4("online_zone");
        }
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m44869P4().inflateView(inflater, container);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(@Nullable Bundle sis) {
        String string;
        super.mo21593n4(sis);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("from", "")) != null) {
            str = string;
        }
        this.from = str;
        m44869P4().m180595x(Intrinsics.m88377d("from_nearby_act", this.from));
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        m44869P4().m180591s(hidden);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (rs9.INSTANCE.m182943c()) {
            if (Intrinsics.m88377d("from_nearby_act", this.from)) {
                m44870Q4("online_zone");
            } else {
                m44870Q4("nearby_people");
            }
        }
    }
}
