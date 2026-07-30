package com.p000p1.mobile.putong.core.p004ui.toppicks;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p004ui.toppicks.TopPicksTabFrag;
import com.p1.mobile.putong.core.newui.main.NewMainContextFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.kxi0;
import p006l.rxi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "Lcom/p1/mobile/putong/core/newui/main/NewMainContextFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "hidden", "onHiddenChanged", "(Z)V", "", "pageId", "()Ljava/lang/String;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "disableAutoPV", "()Z", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "B", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "presenter", "Ll/kxi0;", "C", "Ll/kxi0;", "viewmodel", "Ll/rxi0;", "D", "Lkotlin/Lazy;", "X4", "()Ll/rxi0;", "adapter", "Lcom/p1/mobile/putong/core/ui/toppicks/b;", "E", "Y4", "()Lcom/p1/mobile/putong/core/ui/toppicks/b;", "touchHelper", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopPicksTabFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public C0355a presenter;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public kxi0 viewmodel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.swi0
        public final Object invoke() {
            return TopPicksTabFrag.m9338V4(this.f21731a);
        }
    });

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Lazy touchHelper = LazyKt__LazyJVMKt.b(new Function0() { // from class: l.twi0
        public final Object invoke() {
            return TopPicksTabFrag.m9339W4(this.f22312a);
        }
    });

    /* JADX INFO: renamed from: V4 */
    public static rxi0 m9338V4(TopPicksTabFrag topPicksTabFrag) {
        C0355a c0355a = topPicksTabFrag.presenter;
        if (c0355a == null) {
            Intrinsics.r("presenter");
            c0355a = null;
        }
        return new rxi0(c0355a);
    }

    /* JADX INFO: renamed from: W4 */
    public static C0356b m9339W4(TopPicksTabFrag topPicksTabFrag) {
        C0355a c0355a = topPicksTabFrag.presenter;
        if (c0355a == null) {
            Intrinsics.r("presenter");
            c0355a = null;
        }
        return new C0356b(c0355a);
    }

    @NotNull
    /* JADX INFO: renamed from: X4 */
    public final rxi0 m9340X4() {
        return (rxi0) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Y4 */
    public final C0356b m9341Y4() {
        return (C0356b) this.touchHelper.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d4 */
    public void m9342d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.mo1548d4();
        this.presenter = new C0355a(this);
        this.viewmodel = new kxi0(this);
        C0355a c0355a = this.presenter;
        C0355a c0355a2 = null;
        if (c0355a == null) {
            Intrinsics.r("presenter");
            c0355a = null;
        }
        kxi0 kxi0Var = this.viewmodel;
        if (kxi0Var == null) {
            Intrinsics.r("viewmodel");
            kxi0Var = null;
        }
        c0355a.C(kxi0Var);
        kxi0 kxi0Var2 = this.viewmodel;
        if (kxi0Var2 == null) {
            Intrinsics.r("viewmodel");
            kxi0Var2 = null;
        }
        C0355a c0355a3 = this.presenter;
        if (c0355a3 == null) {
            Intrinsics.r("presenter");
        } else {
            c0355a2 = c0355a3;
        }
        kxi0Var2.m18334i1(c0355a2);
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public void m9343f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.mo1549f4();
        C0355a c0355a = this.presenter;
        if (c0355a == null) {
            Intrinsics.r("presenter");
            c0355a = null;
        }
        c0355a.m9367a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m9344g4(@Nullable Bundle sis) {
        super/*com.p1.mobile.android.app.Frag*/.g4(sis);
        kxi0 kxi0Var = this.viewmodel;
        C0355a c0355a = null;
        if (kxi0Var == null) {
            Intrinsics.r("viewmodel");
            kxi0Var = null;
        }
        kxi0Var.m18342r();
        C0355a c0355a2 = this.presenter;
        if (c0355a2 == null) {
            Intrinsics.r("presenter");
        } else {
            c0355a = c0355a2;
        }
        c0355a.m9372u0();
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        kxi0 kxi0Var = this.viewmodel;
        if (kxi0Var == null) {
            Intrinsics.r("viewmodel");
            kxi0Var = null;
        }
        return kxi0Var.inflateView(inflater, container);
    }

    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        C0355a c0355a = this.presenter;
        if (c0355a == null) {
            Intrinsics.r("presenter");
            c0355a = null;
        }
        if (c0355a.m9373x0(requestCode, resultCode, data)) {
            return;
        }
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(requestCode, resultCode, data);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onHiddenChanged(boolean hidden) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(hidden);
        kxi0 kxi0Var = this.viewmodel;
        if (kxi0Var == null) {
            Intrinsics.r("viewmodel");
            kxi0Var = null;
        }
        kxi0Var.m18325A(hidden);
    }

    @NotNull
    public String pageId() {
        return "p_intl_picks_main_page";
    }
}
