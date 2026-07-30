package com.p046p1.mobile.putong.core.newui.supreme.hometab;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.newui.supreme.hometab.SupremePartnerTabFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.gr9;
import p149l.j1h0;
import p149l.l1h0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 .2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010\u001a¨\u00060"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/hometab/SupremePartnerTabFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "Landroid/os/Bundle;", "sis", "", "n4", "(Landroid/os/Bundle;)V", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "g4", "", "hidden", "onHiddenChanged", "(Z)V", "", "navigation_to", "Q4", "(Ljava/lang/String;)V", "savedInstanceState", "onViewStateRestored", "Ll/l1h0;", BaseSei.f13932Z, "Lkotlin/Lazy;", "O4", "()Ll/l1h0;", "presenter", "Ll/j1h0;", "A", "P4", "()Ll/j1h0;", "viewModel", "B", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "from", "Companion", "a", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
        this.presenter = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.f1h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupremePartnerTabFrag.m43681N4(this.f94097a);
            }
        });
        this.viewModel = LazyKt__LazyJVMKt.m87228a(lazyThreadSafetyMode, new Function0() { // from class: l.g1h0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SupremePartnerTabFrag.m43680M4(this.f100179a);
            }
        });
        this.from = "";
    }

    /* JADX INFO: renamed from: M4 */
    public static j1h0 m43680M4(SupremePartnerTabFrag supremePartnerTabFrag) {
        return new j1h0(supremePartnerTabFrag);
    }

    /* JADX INFO: renamed from: N4 */
    public static l1h0 m43681N4(SupremePartnerTabFrag supremePartnerTabFrag) {
        return new l1h0(supremePartnerTabFrag);
    }

    /* JADX INFO: renamed from: O4 */
    private final l1h0 m43682O4() {
        return (l1h0) this.presenter.getValue();
    }

    /* JADX INFO: renamed from: P4 */
    public final j1h0 m43683P4() {
        return (j1h0) this.viewModel.getValue();
    }

    /* JADX INFO: renamed from: Q4 */
    public final void m43684Q4(@Nullable String navigation_to) {
        if (Intrinsics.m87488d("nearby_people", navigation_to)) {
            m43683P4().m139311i().m4250j(0, false);
            if (m43683P4().m139316n().getTabCount() > 0) {
                m43683P4().m139316n().selectTab(m43683P4().m139316n().getTabAt(0));
                return;
            }
            return;
        }
        if (!Intrinsics.m87488d("online_zone", navigation_to) || m43683P4().m139316n().getTabCount() <= 1) {
            return;
        }
        m43683P4().m139311i().m4250j(1, false);
        m43683P4().m139316n().selectTab(m43683P4().m139316n().getTabAt(1));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m43682O4().mo51532C(m43683P4());
        m43683P4().mo21065i1(m43682O4());
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m43682O4().mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
        m43683P4().m139317r();
        m43682O4().m148180g0();
        if (Intrinsics.m87488d("from_nearby_act", this.from)) {
            m43684Q4("online_zone");
        }
    }

    @NotNull
    public final String getFrom() {
        return this.from;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m43683P4().inflateView(inflater, container);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(@Nullable Bundle sis) {
        String string;
        super.mo20594n4(sis);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments != null && (string = arguments.getString("from", "")) != null) {
            str = string;
        }
        this.from = str;
        m43683P4().m139322x(Intrinsics.m87488d("from_nearby_act", this.from));
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        m43683P4().m139318s(hidden);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle savedInstanceState) {
        super.onViewStateRestored(savedInstanceState);
        if (gr9.INSTANCE.m127687c()) {
            if (Intrinsics.m87488d("from_nearby_act", this.from)) {
                m43684Q4("online_zone");
            } else {
                m43684Q4("nearby_people");
            }
        }
    }
}
