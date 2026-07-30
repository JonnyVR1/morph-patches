package com.p046p1.mobile.putong.core.p053ui.lovebuzz;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d30;
import p149l.j760;
import p149l.j8w;
import p149l.nn3;
import p149l.vwb;
import p149l.zn3;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00170\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0004¢\u0006\u0004\b\u001e\u0010\u0003J\r\u0010\u001f\u001a\u00020\u0004¢\u0006\u0004\b\u001f\u0010\u0003R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/BuzzComboFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "onResume", "", "hidden", "onHiddenChanged", "(Z)V", "", "Ll/j760;", "", "Ll/d30;", "C4", "()Ljava/util/Collection;", "pageId", "()Ljava/lang/String;", "N4", "M4", "Ll/nn3;", BaseSei.f13932Z, "Ll/nn3;", "presenter", "Ll/zn3;", "A", "Ll/zn3;", "viewmodel", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class BuzzComboFrag extends PutongFrag {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public zn3 viewmodel;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public nn3 presenter;

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    @NotNull
    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> mo29633C4() {
        ArrayList arrayListM200324f0 = vwb.m200324f0(new j760[0]);
        arrayListM200324f0.getClass();
        nn3 nn3Var = this.presenter;
        if (nn3Var == null) {
            Intrinsics.m87502r("presenter");
            nn3Var = null;
        }
        arrayListM200324f0.addAll(nn3Var.m160184m0());
        return arrayListM200324f0;
    }

    /* JADX INFO: renamed from: M4 */
    public final void m46894M4() {
        zn3 zn3Var = this.viewmodel;
        if (zn3Var == null) {
            Intrinsics.m87502r("viewmodel");
            zn3Var = null;
        }
        zn3Var.m219434X(this.pageHelper);
    }

    /* JADX INFO: renamed from: N4 */
    public final void m46895N4() {
        zn3 zn3Var = this.viewmodel;
        if (zn3Var == null) {
            Intrinsics.m87502r("viewmodel");
            zn3Var = null;
        }
        zn3Var.m219435Y(this.pageHelper);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.presenter = new nn3(this);
        Act act = act();
        act.getClass();
        this.viewmodel = new zn3(act);
        nn3 nn3Var = this.presenter;
        nn3 nn3Var2 = null;
        if (nn3Var == null) {
            Intrinsics.m87502r("presenter");
            nn3Var = null;
        }
        zn3 zn3Var = this.viewmodel;
        if (zn3Var == null) {
            Intrinsics.m87502r("viewmodel");
            zn3Var = null;
        }
        nn3Var.mo51532C(zn3Var);
        zn3 zn3Var2 = this.viewmodel;
        if (zn3Var2 == null) {
            Intrinsics.m87502r("viewmodel");
            zn3Var2 = null;
        }
        nn3 nn3Var3 = this.presenter;
        if (nn3Var3 == null) {
            Intrinsics.m87502r("presenter");
        } else {
            nn3Var2 = nn3Var3;
        }
        zn3Var2.mo21065i1(nn3Var2);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
        zn3 zn3Var = this.viewmodel;
        nn3 nn3Var = null;
        if (zn3Var == null) {
            Intrinsics.m87502r("viewmodel");
            zn3Var = null;
        }
        zn3Var.m219439r();
        nn3 nn3Var2 = this.presenter;
        if (nn3Var2 == null) {
            Intrinsics.m87502r("presenter");
        } else {
            nn3Var = nn3Var2;
        }
        nn3Var.m160185q0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        zn3 zn3Var = this.viewmodel;
        if (zn3Var == null) {
            Intrinsics.m87502r("viewmodel");
            zn3Var = null;
        }
        return zn3Var.inflateView(inflater, container);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        zn3 zn3Var = this.viewmodel;
        nn3 nn3Var = null;
        if (zn3Var == null) {
            Intrinsics.m87502r("viewmodel");
            zn3Var = null;
        }
        zn3Var.m219428R(hidden);
        nn3 nn3Var2 = this.presenter;
        if (nn3Var2 == null) {
            Intrinsics.m87502r("presenter");
        } else {
            nn3Var = nn3Var2;
        }
        nn3Var.m160186r0(hidden);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        j8w.INSTANCE.m140473a().m140470x0(act());
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    @NotNull
    public String pageId() {
        return "p_buzz_sum";
    }
}
