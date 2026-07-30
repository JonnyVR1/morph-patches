package com.p000p1.mobile.putong.core.p004ui.toppicks;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.p004ui.toppicks.TopPicksAct;
import com.p1.mobile.android.app.Act;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.e30;
import l.kwi0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.u4c0;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "Y1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "", "initSubscription", "r", "", "shouldSwitchToTransparentStatus", "()Z", "setTransparentStatusBar", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "get_picks_content__layout", "()Landroid/widget/FrameLayout;", "set_picks_content__layout", "(Landroid/widget/FrameLayout;)V", "_picks_content__layout", "Lv/navigationbar/VNavigationBar;", "d", "Lv/navigationbar/VNavigationBar;", "Z1", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TopPicksAct extends PutongAct {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _picks_content__layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: V1 */
    public static void m9327V1(TopPicksAct topPicksAct, Bundle bundle) {
        topPicksAct.m9331r();
    }

    /* JADX INFO: renamed from: X1 */
    public static void m9328X1(TopPicksAct topPicksAct, View view) {
        ((Act) topPicksAct).act.finish();
    }

    @NotNull
    /* JADX INFO: renamed from: Y1 */
    public final View m9329Y1(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = kwi0.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: Z1 */
    public final VNavigationBar m9330Z1() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.r("_navigation_bar");
        return null;
    }

    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM9329Y1 = m9329Y1(inflater, parent);
        setTransparentStatusBar();
        return viewM9329Y1;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.iwi0
            public final void call(Object obj) {
                TopPicksAct.m9327V1(this.f14851a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m9331r() {
        FragmentManager fragmentManager = fragmentManager();
        k kVarM = fragmentManager.m();
        kVarM.getClass();
        kVarM.s(u4c0.f23046ia, new TopPicksTabFrag()).i();
        fragmentManager.e0();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        m9330Z1().setLeftIconOnClick(new View.OnClickListener() { // from class: l.jwi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopPicksAct.m9328X1(this.f15472a, view);
            }
        });
        m9330Z1().setBackgroundColor(Color.parseColor("#00ffffff"));
        super.setTransparentStatusBar();
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
