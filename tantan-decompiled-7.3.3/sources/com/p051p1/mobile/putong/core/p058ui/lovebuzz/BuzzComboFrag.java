package com.p051p1.mobile.putong.core.p058ui.lovebuzz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.haw;
import p153l.jyb;
import p153l.no3;
import p153l.pf60;
import p153l.x20;
import p153l.zo3;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003J\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0003R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/BuzzComboFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "onResume", "", "hidden", "onHiddenChanged", "(Z)V", "", "Ll/pf60;", "", "Ll/x20;", "C4", "()Ljava/util/Collection;", "pageId", "()Ljava/lang/String;", "N4", "M4", "Ll/no3;", BaseSei.f14626Z, "Ll/no3;", "presenter", "Ll/zo3;", "A", "Ll/zo3;", "viewmodel", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class BuzzComboFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public zo3 viewmodel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public no3 presenter;

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    @NotNull
    /* JADX INFO: renamed from: C4 */
    public Collection<? extends pf60<String, x20>> mo30631C4() {
        ArrayList arrayListM147507f0 = jyb.m147507f0(new pf60[0]);
        arrayListM147507f0.getClass();
        no3 no3Var = this.presenter;
        if (no3Var == null) {
            Intrinsics.m88391r("presenter");
            no3Var = null;
        }
        arrayListM147507f0.addAll(no3Var.m164035m0());
        return arrayListM147507f0;
    }

    /* JADX INFO: renamed from: M4 */
    public final void m48077M4() {
        zo3 zo3Var = this.viewmodel;
        if (zo3Var == null) {
            Intrinsics.m88391r("viewmodel");
            zo3Var = null;
        }
        zo3Var.m220720X(this.pageHelper);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m48078N4() {
        zo3 zo3Var = this.viewmodel;
        if (zo3Var == null) {
            Intrinsics.m88391r("viewmodel");
            zo3Var = null;
        }
        zo3Var.m220721Y(this.pageHelper);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.presenter = new no3(this);
        Act act = act();
        act.getClass();
        this.viewmodel = new zo3(act);
        no3 no3Var = this.presenter;
        no3 no3Var2 = null;
        if (no3Var == null) {
            Intrinsics.m88391r("presenter");
            no3Var = null;
        }
        zo3 zo3Var = this.viewmodel;
        if (zo3Var == null) {
            Intrinsics.m88391r("viewmodel");
            zo3Var = null;
        }
        no3Var.mo52715C(zo3Var);
        zo3 zo3Var2 = this.viewmodel;
        if (zo3Var2 == null) {
            Intrinsics.m88391r("viewmodel");
            zo3Var2 = null;
        }
        no3 no3Var3 = this.presenter;
        if (no3Var3 == null) {
            Intrinsics.m88391r("presenter");
        } else {
            no3Var2 = no3Var3;
        }
        zo3Var2.mo22064i1(no3Var2);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
        zo3 zo3Var = this.viewmodel;
        no3 no3Var = null;
        if (zo3Var == null) {
            Intrinsics.m88391r("viewmodel");
            zo3Var = null;
        }
        zo3Var.m220725r();
        no3 no3Var2 = this.presenter;
        if (no3Var2 == null) {
            Intrinsics.m88391r("presenter");
        } else {
            no3Var = no3Var2;
        }
        no3Var.m164036q0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        zo3 zo3Var = this.viewmodel;
        if (zo3Var == null) {
            Intrinsics.m88391r("viewmodel");
            zo3Var = null;
        }
        return zo3Var.inflateView(inflater, container);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        zo3 zo3Var = this.viewmodel;
        no3 no3Var = null;
        if (zo3Var == null) {
            Intrinsics.m88391r("viewmodel");
            zo3Var = null;
        }
        zo3Var.m220714R(hidden);
        no3 no3Var2 = this.presenter;
        if (no3Var2 == null) {
            Intrinsics.m88391r("presenter");
        } else {
            no3Var = no3Var2;
        }
        no3Var.m164037r0(hidden);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        haw.INSTANCE.m134320a().m134317x0(act());
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    @NotNull
    public String pageId() {
        return "p_buzz_sum";
    }
}
