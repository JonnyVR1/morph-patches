package com.p051p1.mobile.putong.core.p058ui.toppicks;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.FragmentManager;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.toppicks.TopPicksAct;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.navigationbar.VNavigationBar;
import p153l.adc0;
import p153l.o5j0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u0003J\r\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0003R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/toppicks/TopPicksAct;", "Lcom/p1/mobile/putong/app/PutongAct;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "Z1", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "inflateView", "", "initSubscription", "r", "", "shouldSwitchToTransparentStatus", "()Z", "setTransparentStatusBar", "Landroid/widget/FrameLayout;", "c", "Landroid/widget/FrameLayout;", "get_picks_content__layout", "()Landroid/widget/FrameLayout;", "set_picks_content__layout", "(Landroid/widget/FrameLayout;)V", "_picks_content__layout", "Lv/navigationbar/VNavigationBar;", Constants.INAPP_DATA_TAG, "Lv/navigationbar/VNavigationBar;", "a2", "()Lv/navigationbar/VNavigationBar;", "set_navigation_bar", "(Lv/navigationbar/VNavigationBar;)V", "_navigation_bar", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class TopPicksAct extends PutongAct {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public FrameLayout _picks_content__layout;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VNavigationBar _navigation_bar;

    /* JADX INFO: renamed from: X1 */
    public static void m57108X1(TopPicksAct topPicksAct, Bundle bundle) {
        topPicksAct.m57112r();
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m57109Y1(TopPicksAct topPicksAct, View view) {
        topPicksAct.act.m68056e2();
    }

    @NotNull
    /* JADX INFO: renamed from: Z1 */
    public final View m57110Z1(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM166154b = o5j0.m166154b(this, inflater, parent);
        viewM166154b.getClass();
        return viewM166154b;
    }

    @NotNull
    /* JADX INFO: renamed from: a2 */
    public final VNavigationBar m57111a2() {
        VNavigationBar vNavigationBar = this._navigation_bar;
        if (vNavigationBar != null) {
            return vNavigationBar;
        }
        Intrinsics.m88391r("_navigation_bar");
        return null;
    }

    @Override // com.p051p1.mobile.android.app.Act
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM57110Z1 = m57110Z1(inflater, parent);
        setTransparentStatusBar();
        return viewM57110Z1;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.m5j0
            @Override // p153l.y20
            public final void call(Object obj) {
                TopPicksAct.m57108X1(this.f134902a, (Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m57112r() {
        FragmentManager fragmentManager = fragmentManager();
        AbstractC0428k abstractC0428kM2568m = fragmentManager.m2568m();
        abstractC0428kM2568m.getClass();
        abstractC0428kM2568m.m2812s(adc0.f70422ka, new TopPicksTabFrag()).mo2708i();
        fragmentManager.m2546e0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        m57111a2().setLeftIconOnClick(new View.OnClickListener() { // from class: l.n5j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopPicksAct.m57109Y1(this.f140369a, view);
            }
        });
        m57111a2().setBackgroundColor(Color.parseColor("#00ffffff"));
        super.setTransparentStatusBar();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }
}
