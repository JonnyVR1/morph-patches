package com.p046p1.mobile.putong.core.p053ui.toppicks;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p046p1.mobile.putong.core.p053ui.toppicks.TopPicksTabFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.b2s;
import p149l.kxi0;
import p149l.rxi0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103¨\u00065"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "Lcom/p1/mobile/putong/core/newui/main/NewMainContextFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "hidden", "onHiddenChanged", "(Z)V", "", "pageId", "()Ljava/lang/String;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "disableAutoPV", "()Z", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "B", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "presenter", "Ll/kxi0;", b2s.C_ZONE, "Ll/kxi0;", "viewmodel", "Ll/rxi0;", "D", "Lkotlin/Lazy;", "X4", "()Ll/rxi0;", "adapter", "Lcom/p1/mobile/putong/core/ui/toppicks/b;", "E", "Y4", "()Lcom/p1/mobile/putong/core/ui/toppicks/b;", "touchHelper", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class TopPicksTabFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public C8919a presenter;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public kxi0 viewmodel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.swi0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TopPicksTabFrag.m55936V4(this.f166698a);
        }
    });

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Lazy touchHelper = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.twi0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TopPicksTabFrag.m55937W4(this.f172396a);
        }
    });

    /* JADX INFO: renamed from: V4 */
    public static rxi0 m55936V4(TopPicksTabFrag topPicksTabFrag) {
        C8919a c8919a = topPicksTabFrag.presenter;
        if (c8919a == null) {
            Intrinsics.m87502r("presenter");
            c8919a = null;
        }
        return new rxi0(c8919a);
    }

    /* JADX INFO: renamed from: W4 */
    public static C8920b m55937W4(TopPicksTabFrag topPicksTabFrag) {
        C8919a c8919a = topPicksTabFrag.presenter;
        if (c8919a == null) {
            Intrinsics.m87502r("presenter");
            c8919a = null;
        }
        return new C8920b(c8919a);
    }

    @NotNull
    /* JADX INFO: renamed from: X4 */
    public final rxi0 m55938X4() {
        return (rxi0) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Y4 */
    public final C8920b m55939Y4() {
        return (C8920b) this.touchHelper.getValue();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.presenter = new C8919a(this);
        this.viewmodel = new kxi0(this);
        C8919a c8919a = this.presenter;
        C8919a c8919a2 = null;
        if (c8919a == null) {
            Intrinsics.m87502r("presenter");
            c8919a = null;
        }
        kxi0 kxi0Var = this.viewmodel;
        if (kxi0Var == null) {
            Intrinsics.m87502r("viewmodel");
            kxi0Var = null;
        }
        c8919a.mo51532C(kxi0Var);
        kxi0 kxi0Var2 = this.viewmodel;
        if (kxi0Var2 == null) {
            Intrinsics.m87502r("viewmodel");
            kxi0Var2 = null;
        }
        C8919a c8919a3 = this.presenter;
        if (c8919a3 == null) {
            Intrinsics.m87502r("presenter");
        } else {
            c8919a2 = c8919a3;
        }
        kxi0Var2.mo21065i1(c8919a2);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        C8919a c8919a = this.presenter;
        if (c8919a == null) {
            Intrinsics.m87502r("presenter");
            c8919a = null;
        }
        c8919a.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
        kxi0 kxi0Var = this.viewmodel;
        C8919a c8919a = null;
        if (kxi0Var == null) {
            Intrinsics.m87502r("viewmodel");
            kxi0Var = null;
        }
        kxi0Var.m147782r();
        C8919a c8919a2 = this.presenter;
        if (c8919a2 == null) {
            Intrinsics.m87502r("presenter");
        } else {
            c8919a = c8919a2;
        }
        c8919a.m55965u0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        kxi0 kxi0Var = this.viewmodel;
        if (kxi0Var == null) {
            Intrinsics.m87502r("viewmodel");
            kxi0Var = null;
        }
        return kxi0Var.inflateView(inflater, container);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        C8919a c8919a = this.presenter;
        if (c8919a == null) {
            Intrinsics.m87502r("presenter");
            c8919a = null;
        }
        if (c8919a.m55966x0(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        kxi0 kxi0Var = this.viewmodel;
        if (kxi0Var == null) {
            Intrinsics.m87502r("viewmodel");
            kxi0Var = null;
        }
        kxi0Var.m147767A(hidden);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_intl_picks_main_page";
    }
}
