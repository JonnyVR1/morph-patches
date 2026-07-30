package com.p051p1.mobile.putong.core.p058ui.toppicks;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksTabFrag;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.c4s;
import p153l.o6j0;
import p153l.v6j0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0003J!\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010)\u001a\u00020&8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b'\u0010(R\u001b\u0010/\u001a\u00020*8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u00103¨\u00065"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksTabFrag;", "Lcom/p1/mobile/putong/core/newui/main/NewMainContextFrag;", "<init>", "()V", "", "d4", "f4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "", "hidden", "onHiddenChanged", "(Z)V", "", "pageId", "()Ljava/lang/String;", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "disableAutoPV", "()Z", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "B", "Lcom/p1/mobile/putong/core/ui/toppicks/a;", "presenter", "Ll/o6j0;", c4s.C_ZONE, "Ll/o6j0;", "viewmodel", "Ll/v6j0;", "D", "Lkotlin/Lazy;", "X4", "()Ll/v6j0;", "adapter", "Lcom/p1/mobile/putong/core/ui/toppicks/b;", "E", "Y4", "()Lcom/p1/mobile/putong/core/ui/toppicks/b;", "touchHelper", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class TopPicksTabFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    public C9082a presenter;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    public o6j0 viewmodel;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    public final Lazy adapter = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.w5j0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TopPicksTabFrag.m57119V4(this.f187534a);
        }
    });

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final Lazy touchHelper = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.x5j0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return TopPicksTabFrag.m57120W4(this.f192500a);
        }
    });

    /* JADX INFO: renamed from: V4 */
    public static v6j0 m57119V4(TopPicksTabFrag topPicksTabFrag) {
        C9082a c9082a = topPicksTabFrag.presenter;
        if (c9082a == null) {
            Intrinsics.m88391r("presenter");
            c9082a = null;
        }
        return new v6j0(c9082a);
    }

    /* JADX INFO: renamed from: W4 */
    public static C9083b m57120W4(TopPicksTabFrag topPicksTabFrag) {
        C9082a c9082a = topPicksTabFrag.presenter;
        if (c9082a == null) {
            Intrinsics.m88391r("presenter");
            c9082a = null;
        }
        return new C9083b(c9082a);
    }

    @NotNull
    /* JADX INFO: renamed from: X4 */
    public final v6j0 m57121X4() {
        return (v6j0) this.adapter.getValue();
    }

    @NotNull
    /* JADX INFO: renamed from: Y4 */
    public final C9083b m57122Y4() {
        return (C9083b) this.touchHelper.getValue();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.presenter = new C9082a(this);
        this.viewmodel = new o6j0(this);
        C9082a c9082a = this.presenter;
        C9082a c9082a2 = null;
        if (c9082a == null) {
            Intrinsics.m88391r("presenter");
            c9082a = null;
        }
        o6j0 o6j0Var = this.viewmodel;
        if (o6j0Var == null) {
            Intrinsics.m88391r("viewmodel");
            o6j0Var = null;
        }
        c9082a.mo52715C(o6j0Var);
        o6j0 o6j0Var2 = this.viewmodel;
        if (o6j0Var2 == null) {
            Intrinsics.m88391r("viewmodel");
            o6j0Var2 = null;
        }
        C9082a c9082a3 = this.presenter;
        if (c9082a3 == null) {
            Intrinsics.m88391r("presenter");
        } else {
            c9082a2 = c9082a3;
        }
        o6j0Var2.mo22064i1(c9082a2);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        C9082a c9082a = this.presenter;
        if (c9082a == null) {
            Intrinsics.m88391r("presenter");
            c9082a = null;
        }
        c9082a.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
        o6j0 o6j0Var = this.viewmodel;
        C9082a c9082a = null;
        if (o6j0Var == null) {
            Intrinsics.m88391r("viewmodel");
            o6j0Var = null;
        }
        o6j0Var.m166252r();
        C9082a c9082a2 = this.presenter;
        if (c9082a2 == null) {
            Intrinsics.m88391r("presenter");
        } else {
            c9082a = c9082a2;
        }
        c9082a.m57148u0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        o6j0 o6j0Var = this.viewmodel;
        if (o6j0Var == null) {
            Intrinsics.m88391r("viewmodel");
            o6j0Var = null;
        }
        return o6j0Var.inflateView(inflater, container);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        C9082a c9082a = this.presenter;
        if (c9082a == null) {
            Intrinsics.m88391r("presenter");
            c9082a = null;
        }
        if (c9082a.m57149x0(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        o6j0 o6j0Var = this.viewmodel;
        if (o6j0Var == null) {
            Intrinsics.m88391r("viewmodel");
            o6j0Var = null;
        }
        o6j0Var.m166237A(hidden);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_intl_picks_main_page";
    }
}
