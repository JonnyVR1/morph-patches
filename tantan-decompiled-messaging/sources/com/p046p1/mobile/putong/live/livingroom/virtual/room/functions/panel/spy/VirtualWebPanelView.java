package com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.spy;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualSpyPanelViewBindings;
import com.p046p1.mobile.putong.live.livingroom.virtual.room.functions.panel.spy.VirtualWebPanelView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p149l.bt0;
import p149l.dt0;
import p149l.edv;
import p149l.i3c0;
import p149l.izb;
import p149l.jkp0;
import p149l.mep0;
import p149l.p4s;
import p149l.sip0;
import p149l.t100;
import p149l.x7n0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\t¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u000bJ\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\r\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u000bR\u0016\u0010\u001c\u001a\u00020\u00198\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b(\u0010%¨\u0006*"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/room/functions/panel/spy/VirtualWebPanelView;", "Lcom/p1/mobile/putong/live/livingroom/binding/LiveVirtualSpyPanelViewBindings;", "Ll/sip0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "n0", "()V", "r", "", "isCollapse", "m0", "(Z)V", "", "accessToken", "url", "o0", "(Ljava/lang/String;Ljava/lang/String;)V", "destroy", "q0", "p0", "Ll/izb;", "h", "Ll/izb;", "helper", "Limmomo/com/mklibrary/core/base/ui/MKWebView;", RXScreenCaptureService.KEY_INDEX, "Limmomo/com/mklibrary/core/base/ui/MKWebView;", "_webView", "Landroid/animation/Animator;", "j", "Lkotlin/Lazy;", "getExpandAnim", "()Landroid/animation/Animator;", "expandAnim", "k", "getCollapseAnim", "collapseAnim", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class VirtualWebPanelView extends LiveVirtualSpyPanelViewBindings<sip0> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public izb helper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public MKWebView _webView;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Lazy expandAnim;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy collapseAnim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VirtualWebPanelView(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        this.expandAnim = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.m5m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirtualWebPanelView.m77380k0(this.f131407a);
            }
        });
        this.collapseAnim = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.n5m0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return VirtualWebPanelView.m77378i0(this.f137220a);
            }
        });
    }

    private final Animator getCollapseAnim() {
        Object value = this.collapseAnim.getValue();
        value.getClass();
        return (Animator) value;
    }

    private final Animator getExpandAnim() {
        Object value = this.expandAnim.getValue();
        value.getClass();
        return (Animator) value;
    }

    /* JADX INFO: renamed from: i0 */
    public static Animator m77378i0(VirtualWebPanelView virtualWebPanelView) {
        return bt0.m103741n(virtualWebPanelView.f48088g, View.ALPHA, 1.0f, 0.0f).setDuration(300L);
    }

    /* JADX INFO: renamed from: j0 */
    public static void m77379j0(VirtualWebPanelView virtualWebPanelView) {
        xdl0.m208345M0(virtualWebPanelView.f48087f, true);
    }

    /* JADX INFO: renamed from: k0 */
    public static Animator m77380k0(VirtualWebPanelView virtualWebPanelView) {
        return bt0.m103753z(bt0.m103744q(virtualWebPanelView.f48088g, "translationY", t100.m186890d(-10.0f), 0.0f), bt0.m103741n(virtualWebPanelView.f48088g, View.ALPHA, 0.0f, 1.0f)).setDuration(400L);
    }

    /* JADX INFO: renamed from: l0 */
    public static void m77381l0(VirtualWebPanelView virtualWebPanelView) {
        xdl0.m208345M0(virtualWebPanelView.f48087f, false);
    }

    /* JADX INFO: renamed from: n0 */
    private final void m77382n0() {
        izb izbVar = new izb();
        this.helper = izbVar;
        T t = this.f48085d;
        t.getClass();
        Act act = ((sip0) t).act();
        MKWebView mKWebView = this._webView;
        MKWebView mKWebView2 = null;
        if (mKWebView == null) {
            Intrinsics.m87502r("_webView");
            mKWebView = null;
        }
        izbVar.m87118q(act, mKWebView);
        izb izbVar2 = this.helper;
        if (izbVar2 == null) {
            Intrinsics.m87502r("helper");
            izbVar2 = null;
        }
        Context context = getContext();
        context.getClass();
        PutongAct putongAct = (PutongAct) context;
        MKWebView mKWebView3 = this._webView;
        if (mKWebView3 == null) {
            Intrinsics.m87502r("_webView");
            mKWebView3 = null;
        }
        izbVar2.m139034A(putongAct, "", mKWebView3, "");
        MKWebView mKWebView4 = this._webView;
        if (mKWebView4 == null) {
            Intrinsics.m87502r("_webView");
            mKWebView4 = null;
        }
        mKWebView4.setBackgroundColor(0);
        MKWebView mKWebView5 = this._webView;
        if (mKWebView5 == null) {
            Intrinsics.m87502r("_webView");
        } else {
            mKWebView2 = mKWebView5;
        }
        mKWebView2.getSettings().setCacheMode(-1);
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.binding.LiveVirtualSpyPanelViewBindings, p149l.s7m
    public void destroy() {
        super.destroy();
        MKWebView mKWebView = this._webView;
        izb izbVar = null;
        if (mKWebView == null) {
            Intrinsics.m87502r("_webView");
            mKWebView = null;
        }
        izb izbVar2 = this.helper;
        if (izbVar2 == null) {
            Intrinsics.m87502r("helper");
        } else {
            izbVar = izbVar2;
        }
        edv.m115835b(mKWebView, izbVar);
        dt0.m113503C(getExpandAnim());
        dt0.m113503C(getCollapseAnim());
    }

    /* JADX INFO: renamed from: m0 */
    public final void m77383m0(boolean isCollapse) {
        dt0.m113503C(getExpandAnim());
        dt0.m113503C(getCollapseAnim());
        if (isCollapse) {
            bt0.m103733f(getCollapseAnim(), new Runnable() { // from class: l.o5m0
                @Override // java.lang.Runnable
                public final void run() {
                    VirtualWebPanelView.m77379j0(this.f141918a);
                }
            });
            getCollapseAnim().start();
        } else {
            bt0.m103749v(getExpandAnim(), new Runnable() { // from class: l.p5m0
                @Override // java.lang.Runnable
                public final void run() {
                    VirtualWebPanelView.m77381l0(this.f147311a);
                }
            });
            getExpandAnim().start();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m77384o0(@NotNull String accessToken, @NotNull String url) {
        accessToken.getClass();
        url.getClass();
        HashMap map = new HashMap();
        if (jkp0.m141904d(url)) {
            map.put("H5-Authorization", accessToken);
        }
        MKWebView mKWebView = this._webView;
        if (mKWebView == null) {
            Intrinsics.m87502r("_webView");
            mKWebView = null;
        }
        mKWebView.loadUrl(url, map);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m77385p0() {
        izb izbVar = this.helper;
        if (izbVar == null) {
            Intrinsics.m87502r("helper");
            izbVar = null;
        }
        izbVar.mo87116m();
    }

    /* JADX INFO: renamed from: q0 */
    public final void m77386q0() {
        izb izbVar = this.helper;
        if (izbVar == null) {
            Intrinsics.m87502r("helper");
            izbVar = null;
        }
        izbVar.mo87117n();
    }

    /* JADX INFO: renamed from: r */
    public final void m77387r() {
        xdl0.m208372e0(this.f48087f, t100.f167276y);
        int iM207301a = x7n0.m207301a();
        ViewGroup.LayoutParams layoutParams = this.f48088g.getLayoutParams();
        layoutParams.width = iM207301a;
        layoutParams.height = (int) ((iM207301a * 345) / 258.0f);
        this.f48088g.setLayoutParams(layoutParams);
        this.f48087f.m77593c(new p4s(false, "res://drawable/" + i3c0.f111044ia, "谁是卧底，一起头脑风暴", false, 9, null));
        this._webView = new MKWebView(getContext());
        this.f48088g.removeAllViews();
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams.width, layoutParams.height);
        FrameLayout frameLayout = this.f48088g;
        MKWebView mKWebView = this._webView;
        if (mKWebView == null) {
            Intrinsics.m87502r("_webView");
            mKWebView = null;
        }
        frameLayout.addView(mKWebView, layoutParams2);
        this.f48087f.setBackgroundResource(i3c0.f110904X);
        mep0.m154302d1(this, t100.m186890d(16.0f));
        m77382n0();
    }
}
