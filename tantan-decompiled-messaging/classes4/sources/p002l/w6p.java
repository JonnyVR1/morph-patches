package p002l;

import android.app.Application;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p000p1.mobile.putong.core.p001ui.purchase.intlpage.IntlPurchasePageTabsContainerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.core.ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.d3c0;
import l.e30;
import l.g30;
import l.mkd0;
import l.qib0;
import l.sab0;
import l.szd;
import l.u9p;
import l.vwb;
import l.x5b0;
import l.x6p;
import l.xdl0;
import l.y7c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VImage;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 ¬\u00012\u00020\u0001:\u0004\u00ad\u0001®\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\rJ\u0019\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001a\u001a\u00020\u000b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b \u0010\u001eJ\u000f\u0010!\u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\rJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\"\u0010\u001eJ\u000f\u0010#\u001a\u00020\u000bH\u0002¢\u0006\u0004\b#\u0010\rJ\u001f\u0010&\u001a\u00020\u000b2\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u0004H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020(2\b\u0010+\u001a\u0004\u0018\u00010*¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u000b2\b\u00100\u001a\u0004\u0018\u00010/H\u0014¢\u0006\u0004\b1\u00102J\u0019\u00105\u001a\u00020\u000b2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J+\u00109\u001a\u00020\u000b2\u001c\u00108\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u000107¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u000b2\u0006\u0010;\u001a\u00020\u0011¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u000b2\b\u0010>\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u000b2\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020\u000b2\b\u0010E\u001a\u0004\u0018\u00010A¢\u0006\u0004\bF\u0010DJ\u0017\u0010H\u001a\u00020\u000b2\b\u0010G\u001a\u0004\u0018\u00010A¢\u0006\u0004\bH\u0010DJ\u0015\u0010K\u001a\u00020\u000b2\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u0011¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\"\u0010\\\u001a\u00020U8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bV\u0010W\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010l\u001a\u00020e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR\"\u0010p\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u0010_\u001a\u0004\bn\u0010a\"\u0004\bo\u0010cR\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010|\u001a\u00020]8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\by\u0010_\u001a\u0004\bz\u0010a\"\u0004\b{\u0010cR'\u0010\u0084\u0001\u001a\u00020}8\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0004\b~\u0010\u007f\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u0006\b\u0082\u0001\u0010\u0083\u0001R*\u0010\u008c\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0086.¢\u0006\u0018\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010RR\u001a\u0010G\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001a\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010TR\u0017\u0010;\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010nR\u0018\u0010J\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R.\u00108\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R-\u0010\u009c\u0001\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009a\u0001R\u001a\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0093\u0001R\u001a\u0010E\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0093\u0001R)\u0010\u001f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0006\b¡\u0001\u0010¢\u0001\"\u0005\b£\u0001\u0010\u001eR&\u0010¥\u0001\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u0010n\u001a\u0005\b¥\u0001\u0010N\"\u0005\b¦\u0001\u0010=R'\u0010«\u0001\u001a\u0012\u0012\r\u0012\u000b ¨\u0001*\u0004\u0018\u00010I0I0§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001¨\u0006¯\u0001"}, d2 = {"Ll/w6p;", "Ll/szd;", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseTypes", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Ljava/lang/String;)V", "", "x0", "()V", "p0", "h0", "f0", "", "isFromPayFail", "y0", "(Z)Z", "isUltra", "A0", "(ZZ)Z", "Lcom/p1/mobile/putong/data/User;", "it", "v0", "(Lcom/p1/mobile/putong/data/User;Z)V", "purchaseType", "m0", "(Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "currentPurchaseType", "l0", "g0", "k0", "j0", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "u0", "(Ljava/util/List;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "R", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/DialogInterface;", "dialog", "onShow", "(Landroid/content/DialogInterface;)V", "Ll/g30;", "onPaymentSuccess", "t0", "(Ll/g30;)V", "autoPay", "n0", "(Z)V", "duration", "o0", "(Ljava/lang/String;)V", "Ll/d30;", "onKeyBackCallback", "s0", "(Ll/d30;)V", "onCloseCallback", "q0", SysnotifListener.ACTION_DISMISS, "r0", "", "selectedIdx", "w0", "(I)V", "i0", "()Z", "j", "Lcom/p1/mobile/android/app/Act;", "k", "Ljava/util/List;", "l", "Ljava/lang/String;", "Landroid/widget/FrameLayout;", "m", "Landroid/widget/FrameLayout;", "get_layoutrootview", "()Landroid/widget/FrameLayout;", "set_layoutrootview", "(Landroid/widget/FrameLayout;)V", "_layoutrootview", "Lv/VImage;", "n", "Lv/VImage;", "Y", "()Lv/VImage;", "set_bg", "(Lv/VImage;)V", "_bg", "Landroid/widget/LinearLayout;", "o", "Landroid/widget/LinearLayout;", "a0", "()Landroid/widget/LinearLayout;", "set_content", "(Landroid/widget/LinearLayout;)V", "_content", "p", "Z", "set_close", "_close", "Lv/VText;", "q", "Lv/VText;", "d0", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "r", "e0", "set_title_img", "_title_img", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView;", "s", "Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView;", "c0", "()Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView;", "set_tabs_container", "(Lcom/p1/mobile/putong/core/ui/purchase/intlpage/IntlPurchasePageTabsContainerView;)V", "_tabs_container", "Lv/VPager;", "t", "Lv/VPager;", "b0", "()Lv/VPager;", "set_pager", "(Lv/VPager;)V", "_pager", "Ll/y6p;", "u", "Ll/y6p;", "purchasePageNewAdapter", "v", "w", "Ll/d30;", "x", "defaultSkuDuration", "y", "z", "I", "A", "Ll/g30;", "B", "onPaymentFailedAction", "C", "D", "E", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getCurrentPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "setCurrentPurchaseType", "F", "isSelectUpgrade", "setSelectUpgrade", "Ll/e30;", "kotlin.jvm.PlatformType", "G", "Ll/e30;", "dialogStateAction", "Companion", "b", "a", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w6p extends szd {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentFailedAction;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public d30 onKeyBackCallback;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @Nullable
    public d30 onCloseCallback;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    public PurchaseType currentPurchaseType;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public boolean isSelectUpgrade;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final List<PurchaseType> purchaseTypes;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public FrameLayout _layoutrootview;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public VImage _bg;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public LinearLayout _content;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public VImage _title_img;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public IntlPurchasePageTabsContainerView _tabs_container;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public VPager _pager;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public y6p purchasePageNewAdapter;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public List<? extends Privilege> privileges;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public d30 dismiss;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public String defaultSkuDuration;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public boolean autoPay;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public int selectedIdx;

    /* JADX INFO: renamed from: l.w6p$a */
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\u000b\u001a\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0016\u0010\u0010J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001d\u001a\u00020\u00002\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b$\u0010\"J\u0017\u0010&\u001a\u00020\u00002\b\u0010%\u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b&\u0010\"J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)J\r\u0010+\u001a\u00020*¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010-R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010.R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010.R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010/R\u0018\u0010%\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00100R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00101R,\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00102R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00100R\u0018\u00103\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010/R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u00104R\u0018\u0010#\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00100¨\u00065"}, d2 = {"Ll/w6p$a;", "", "Lcom/p1/mobile/android/app/Act;", "act", "<init>", "(Lcom/p1/mobile/android/app/Act;)V", "", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "types", "Lcom/p1/mobile/putong/core/data/Privilege;", "privileges", "i", "(Ljava/util/List;Ljava/util/List;)Ll/w6p$a;", "", "from", "d", "(Ljava/lang/String;)Ll/w6p$a;", "", "selectedIdx", "j", "(I)Ll/w6p$a;", "duration", "c", "", "autoPay", "b", "(Z)Ll/w6p$a;", "Ll/g30;", "onPaymentSuccess", "h", "(Ll/g30;)Ll/w6p$a;", "Ll/d30;", "onKeyBackCallback", "g", "(Ll/d30;)Ll/w6p$a;", "onCloseCallback", "e", SysnotifListener.ACTION_DISMISS, "f", "Ll/w6p;", "a", "()Ll/w6p;", "", "k", "()V", "Lcom/p1/mobile/android/app/Act;", "Ljava/util/List;", "Ljava/lang/String;", "Ll/d30;", "I", "Ll/g30;", "defaultSkuDuration", "Z", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0875a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public List<? extends PurchaseType> types;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public List<? extends Privilege> privileges;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public d30 dismiss;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public int selectedIdx;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public g30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public d30 onKeyBackCallback;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public String defaultSkuDuration;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public boolean autoPay;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public d30 onCloseCallback;

        public C0875a(@NotNull Act act) {
            act.getClass();
            this.act = act;
            this.types = CollectionsKt.emptyList();
            this.privileges = CollectionsKt.emptyList();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final w6p m24414a() {
            w6p w6pVar = new w6p(this.act, this.types, this.from);
            w6pVar.m24390u0(this.privileges);
            w6pVar.m24410t0(this.onPaymentSuccess);
            w6pVar.m24409s0(this.onKeyBackCallback);
            w6pVar.m24407q0(this.onCloseCallback);
            w6pVar.m24408r0(this.dismiss);
            w6pVar.m24411w0(this.selectedIdx);
            w6pVar.m24406o0(this.defaultSkuDuration);
            w6pVar.m24405n0(this.autoPay);
            return w6pVar;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final C0875a m24415b(boolean autoPay) {
            this.autoPay = autoPay;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final C0875a m24416c(@Nullable String duration) {
            this.defaultSkuDuration = duration;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final C0875a m24417d(@Nullable String from) {
            this.from = from;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final C0875a m24418e(@Nullable d30 onCloseCallback) {
            this.onCloseCallback = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final C0875a m24419f(@Nullable d30 dismiss) {
            this.dismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final C0875a m24420g(@Nullable d30 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C0875a m24421h(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: i */
        public final C0875a m24422i(@NotNull List<? extends PurchaseType> types, @NotNull List<? extends Privilege> privileges) {
            types.getClass();
            privileges.getClass();
            this.types = types;
            this.privileges = privileges;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: j */
        public final C0875a m24423j(int selectedIdx) {
            this.selectedIdx = selectedIdx;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public final void m24424k() {
            m24414a().show();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w6p(@NotNull Act act, @NotNull List<? extends PurchaseType> list, @Nullable String str) {
        super(act, false, y7c0.b);
        act.getClass();
        list.getClass();
        this.act = act;
        this.purchaseTypes = list;
        this.from = str;
        this.dialogStateAction = new e30() { // from class: l.j6p
            public final void call(Object obj) {
                w6p.m24369H(this.f13611a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A0 */
    private final boolean m24365A0(boolean isFromPayFail, final boolean isUltra) {
        return isUltra ? u9p.INSTANCE.D(this.act, new e30() { // from class: l.s6p
            public final void call(Object obj) {
                w6p.m24367F(this.f18807a, isUltra, (User) obj);
            }
        }, new e30() { // from class: l.t6p
            public final void call(Object obj) {
                w6p.m24368G(this.f20111a, isUltra, (User) obj);
            }
        }, new e30() { // from class: l.u6p
            public final void call(Object obj) {
                w6p.m24370I(this.f20508a, isUltra, (User) obj);
            }
        }, isFromPayFail, this.from, this, (Act) null) : u9p.INSTANCE.C(this.act, new Runnable() { // from class: l.v6p
            @Override // java.lang.Runnable
            public final void run() {
                w6p.m24377P(this.f21019a, isUltra);
            }
        }, new e30() { // from class: l.k6p
            public final void call(Object obj) {
                w6p.m24373L(this.f14221a, isUltra, (User) obj);
            }
        }, new e30() { // from class: l.l6p
            public final void call(Object obj) {
                w6p.m24366E(this.f14690a, isUltra, (User) obj);
            }
        }, new e30() { // from class: l.m6p
            public final void call(Object obj) {
                w6p.m24371J(this.f15255a, isUltra, (User) obj);
            }
        }, isFromPayFail, this.from, this, (Act) null);
    }

    /* JADX INFO: renamed from: E */
    public static void m24366E(w6p w6pVar, boolean z, User user) {
        w6pVar.m24391v0(user, z);
        u9p.a = "liked";
    }

    /* JADX INFO: renamed from: F */
    public static void m24367F(w6p w6pVar, boolean z, User user) {
        w6pVar.m24391v0(user, z);
        u9p.a = user == null ? "" : "oneMath";
    }

    /* JADX INFO: renamed from: G */
    public static void m24368G(w6p w6pVar, boolean z, User user) {
        w6pVar.m24391v0(user, z);
        u9p.a = "oneMath";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    public static void m24369H(w6p w6pVar, int i) {
        if (i == -1) {
            w6pVar.hide();
            return;
        }
        if (i != 0) {
            if (i == 1) {
                w6pVar.show();
                return;
            } else if (i != 2) {
                if (i != 5) {
                    return;
                }
                w6pVar.m24413y0(true);
                return;
            }
        }
        w6pVar.m24412x0();
        w6pVar.dismiss();
    }

    /* JADX INFO: renamed from: I */
    public static void m24370I(w6p w6pVar, boolean z, User user) {
        w6pVar.m24391v0(user, z);
        u9p.a = "seeProfile";
    }

    /* JADX INFO: renamed from: J */
    public static void m24371J(w6p w6pVar, boolean z, User user) {
        w6pVar.m24391v0(user, z);
        u9p.a = "seeProfile";
    }

    /* JADX INFO: renamed from: K */
    public static boolean m24372K(w6p w6pVar, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (i != 4 || keyEvent.getRepeatCount() != 0 || keyEvent.getAction() != 0) {
            return false;
        }
        if (!m24392z0(w6pVar, false, 1, null)) {
            w6pVar.dialogStateAction.call(0);
            d30 d30Var = w6pVar.onKeyBackCallback;
            if (d30Var != null) {
                d30Var.call();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: L */
    public static void m24373L(w6p w6pVar, boolean z, User user) {
        w6pVar.m24391v0(user, z);
        u9p.a = "superLiked";
    }

    /* JADX INFO: renamed from: M */
    public static void m24374M(w6p w6pVar, DialogInterface dialogInterface) {
        CoreModule.P().a().E9();
        int iMin = Math.min(w6pVar.m24397b0().getCurrentItem(), w6pVar.purchaseTypes.size() - 1);
        y6p y6pVar = w6pVar.purchasePageNewAdapter;
        if (y6pVar != null) {
            y6pVar.m26404r(iMin);
        }
        w6pVar.m24388j0();
        d30 d30Var = w6pVar.dismiss;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: N */
    public static void m24375N(w6p w6pVar, DialogInterface dialogInterface) {
        w6pVar.m24388j0();
    }

    /* JADX INFO: renamed from: O */
    public static void m24376O(w6p w6pVar, View view) {
        if (m24392z0(w6pVar, false, 1, null)) {
            return;
        }
        d30 d30Var = w6pVar.onCloseCallback;
        if (d30Var != null) {
            d30Var.call();
        }
        w6pVar.dialogStateAction.call(0);
        w6pVar.dismiss();
    }

    /* JADX INFO: renamed from: P */
    public static void m24377P(w6p w6pVar, boolean z) {
        w6pVar.m24391v0(null, z);
        u9p.a = "";
    }

    /* JADX INFO: renamed from: Q */
    public static void m24378Q(w6p w6pVar, boolean z) {
        w6pVar.isSelectUpgrade = z;
        PurchaseType purchaseType = w6pVar.currentPurchaseType;
        purchaseType.getClass();
        w6pVar.m24403l0(purchaseType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    private final void m24385f0() {
        y();
        x();
        setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.o6p
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return w6p.m24372K(this.f16400a, dialogInterface, i, keyEvent);
            }
        });
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l.p6p
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                w6p.m24375N(this.f17025a, dialogInterface);
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.q6p
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w6p.m24374M(this.f17825a, dialogInterface);
            }
        });
        m24395Z().setOnClickListener(new View.OnClickListener() { // from class: l.r6p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w6p.m24376O(this.f18396a, view);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    private final void m24386g0() {
        if (u9p.INSTANCE.t()) {
            CoreModule.c.H2.j3();
        }
        duringCreated(CoreModule.c.G2.S).subscribe(mkd0.G(new e30() { // from class: l.n6p
            public final void call(Object obj) {
                w6p.m24378Q(this.f15846a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    private final void m24387h0() {
        ViewGroup.LayoutParams layoutParams = m24396a0().getLayoutParams();
        layoutParams.getClass();
        ((FrameLayout.LayoutParams) layoutParams).topMargin = xdl0.F0();
        PurchaseTrackPageType purchaseTrackPageType = PurchaseTrackPageType.page_fullscreen_one;
        if (this.purchaseTypes.size() > 1) {
            purchaseTrackPageType = PurchaseTrackPageType.page_fullscreen_two;
            xdl0.M(m24398c0(), true);
        } else {
            xdl0.M(m24398c0(), false);
        }
        m24398c0().m4503c(this.purchaseTypes);
        int iMin = Math.min(this.selectedIdx, this.purchaseTypes.size() - 1);
        ProductCategory productCategory = this.purchaseTypes.get(iMin).productCategory();
        productCategory.getClass();
        x5b0 x5b0Var = new x5b0(productCategory, purchaseTrackPageType, this.from);
        y6p y6pVar = new y6p(this.act, this.purchaseTypes, this.privileges, this.from, x5b0Var);
        this.purchasePageNewAdapter = y6pVar;
        y6pVar.m26409w(this.dialogStateAction);
        y6pVar.m26412z(this.onPaymentSuccess);
        y6pVar.m26411y(this.onPaymentFailedAction);
        if (iMin == 0) {
            ProductCategory productCategory2 = this.purchaseTypes.get(iMin).productCategory();
            productCategory2.getClass();
            x5b0Var.v(productCategory2);
        }
        y6pVar.m26410x(iMin);
        y6pVar.m26408v(this.defaultSkuDuration);
        y6pVar.m26407u(this.autoPay);
        m24397b0().setAdapter(this.purchasePageNewAdapter);
        m24397b0().setScrollble(false);
        m24397b0().d(new C0877c());
        int iMin2 = Math.min(this.selectedIdx, this.purchaseTypes.size() - 1);
        PurchaseType purchaseType = this.purchaseTypes.get(iMin2);
        m24398c0().setupWithViewPager(m24397b0());
        m24397b0().setCurrentItem(iMin2);
        m24403l0(purchaseType);
        m24404m0(purchaseType);
        m24402k0(purchaseType);
        m24398c0().m4502b(purchaseType);
    }

    /* JADX INFO: renamed from: j0 */
    private final void m24388j0() {
        y6p y6pVar = this.purchasePageNewAdapter;
        if (y6pVar != null) {
            y6pVar.m26406t();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p0 */
    private final void m24389p0() {
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setStatusBarColor(0);
        }
        PutongAct.setLightStatusBar(getWindow(), 1280);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u0 */
    public final void m24390u0(List<? extends Privilege> privileges) {
        this.privileges = privileges;
    }

    /* JADX INFO: renamed from: v0 */
    private final void m24391v0(User it, boolean isUltra) {
        y6p y6pVar = this.purchasePageNewAdapter;
        if (y6pVar != null) {
            PurchaseType purchaseType = this.currentPurchaseType;
            purchaseType.getClass();
            y6pVar.m26405s(purchaseType);
        }
        u9p.INSTANCE.A(it);
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ boolean m24392z0(w6p w6pVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return w6pVar.m24413y0(z);
    }

    @NotNull
    /* JADX INFO: renamed from: R */
    public final View m24393R(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewB = x6p.b(this, inflater, parent);
        viewB.getClass();
        return viewB;
    }

    @NotNull
    /* JADX INFO: renamed from: Y */
    public final VImage m24394Y() {
        VImage vImage = this._bg;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_bg");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Z */
    public final VImage m24395Z() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: a0 */
    public final LinearLayout m24396a0() {
        LinearLayout linearLayout = this._content;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: b0 */
    public final VPager m24397b0() {
        VPager vPager = this._pager;
        if (vPager != null) {
            return vPager;
        }
        Intrinsics.r("_pager");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: c0 */
    public final IntlPurchasePageTabsContainerView m24398c0() {
        IntlPurchasePageTabsContainerView intlPurchasePageTabsContainerView = this._tabs_container;
        if (intlPurchasePageTabsContainerView != null) {
            return intlPurchasePageTabsContainerView;
        }
        Intrinsics.r("_tabs_container");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: d0 */
    public final VText m24399d0() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_title");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: e0 */
    public final VImage m24400e0() {
        VImage vImage = this._title_img;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_title_img");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m24401i0() {
        if (vwb.J(this.purchaseTypes)) {
            return false;
        }
        if (CoreModule.c.j0.T4() && (this.purchaseTypes.get(0) == PurchaseType.TYPE_GET_VIP || this.purchaseTypes.get(0) == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE)) {
            return false;
        }
        if ((this.purchaseTypes.get(0) == PurchaseType.TYPE_GET_VIP || this.purchaseTypes.get(0) == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) && (CoreModule.c.j0.B4() || CoreModule.c.j0.y4())) {
            return true;
        }
        return this.purchaseTypes.get(0) == PurchaseType.TYPE_GET_LIKERS && CoreModule.c.j0.A4();
    }

    /* JADX INFO: renamed from: k0 */
    public final void m24402k0(PurchaseType currentPurchaseType) {
        int i;
        VImage vImageM24395Z = m24395Z();
        Application application = CoreModule.b;
        if (sab0.q(currentPurchaseType)) {
            i = d3c0.t2;
        } else {
            i = sab0.v(currentPurchaseType) ? d3c0.y2 : d3c0.V2;
        }
        vImageM24395Z.setImageDrawable(application.getDrawable(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final void m24403l0(PurchaseType currentPurchaseType) {
        String string;
        int color;
        this.currentPurchaseType = currentPurchaseType;
        if (currentPurchaseType == PurchaseType.TYPE_GET_VIP) {
            xdl0.M(m24400e0(), true);
            xdl0.M(m24399d0(), false);
        } else {
            xdl0.M(m24400e0(), false);
            xdl0.M(m24399d0(), true);
            m24399d0().setTypeface(Typeface.defaultFromStyle(1));
            VText vTextM24399d0 = m24399d0();
            if (sab0.q(currentPurchaseType)) {
                string = this.isSelectUpgrade ? getContext().getString(R.string.y3) : getContext().getString(R.string.O4);
            } else if (currentPurchaseType == PurchaseType.TYPE_GET_LIKERS) {
                string = getContext().getString(R.string.Q4);
            } else if (sab0.v(currentPurchaseType)) {
                string = this.isSelectUpgrade ? getContext().getString(R.string.A3) : getContext().getString(R.string.U4);
            } else {
                string = getContext().getString(R.string.G5);
            }
            vTextM24399d0.setText(string);
            if (sab0.q(currentPurchaseType)) {
                color = Color.parseColor("#EDD6A3");
            } else if (sab0.v(currentPurchaseType)) {
                color = Color.parseColor("#F9E7FF");
            } else {
                color = currentPurchaseType == PurchaseType.TYPE_GET_LIKERS ? Color.parseColor("#cc000000") : Color.parseColor("#cc000000");
            }
            m24399d0().setTextColor(color);
        }
        e1b0.INSTANCE.m12105a(currentPurchaseType);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m24404m0(PurchaseType purchaseType) {
        String str;
        if (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IldLWktPQlpEVkJXTVhBRTU3SUVQWE9aTzczV1lGWjE0IiwidyI6MTEyNSwiaCI6MjQzNiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjExNTI5MzU2MDU5NjY4MTYwNTUxfQ.png";
        } else if (purchaseType == PurchaseType.TYPE_GET_LIKERS) {
            str = "https://auto.tancdn.com/v1/images/eyJpZCI6IllCSjdWREtCWkZLRFNBVDZZM1BYU09WV04zTEFOWDE0IiwidyI6MTEyNSwiaCI6MjQzNiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjQ2Mjk3MDA2OTE4MTUzMDEyNDh9.png";
        } else {
            str = sab0.v(purchaseType) ? "https://auto.tancdn.com/v1/images/eyJpZCI6IllBSzNZV0RJT1hMWVNLQVdQSEJCM0MzTVlPRkdCNzE0IiwidyI6NzUwLCJoIjoxNjI0LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTEzNTgxMjg0ODY4MDE1OH0.png" : "https://auto.tancdn.com/v1/images/eyJpZCI6IjNVNFdQSVA3UVI1WjdOQVU1N0JIMjRTSEpaVElLWDE0IiwidyI6MTEyNSwiaCI6MjQzNiwiZCI6MCwibXQiOiJpbWFnZS9qcGVnIiwiZGgiOjE2MjIwMDIzMDIwNzQzODg0OH0.png";
        }
        qib0.G.D(m24394Y(), str);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m24405n0(boolean autoPay) {
        this.autoPay = autoPay;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m24406o0(@Nullable String duration) {
        this.defaultSkuDuration = duration;
    }

    public void onCreate(@Nullable Bundle savedInstanceState) {
        super/*androidx.appcompat.app.a*/.onCreate(savedInstanceState);
        LayoutInflater layoutInflater = this.act.getLayoutInflater();
        layoutInflater.getClass();
        View viewM24393R = m24393R(layoutInflater, null);
        m24386g0();
        m24387h0();
        setContentView(viewM24393R);
        m24389p0();
        m24385f0();
    }

    public void onShow(@Nullable DialogInterface dialog) {
        super.onShow(dialog);
    }

    /* JADX INFO: renamed from: q0 */
    public final void m24407q0(@Nullable d30 onCloseCallback) {
        this.onCloseCallback = onCloseCallback;
    }

    /* JADX INFO: renamed from: r0 */
    public final void m24408r0(@Nullable d30 dismiss) {
        this.dismiss = dismiss;
    }

    /* JADX INFO: renamed from: s0 */
    public final void m24409s0(@Nullable d30 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m24410t0(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: w0 */
    public final void m24411w0(int selectedIdx) {
        this.selectedIdx = selectedIdx;
    }

    /* JADX INFO: renamed from: x0 */
    public final void m24412x0() {
        if (m24401i0()) {
            Intent intentA2 = WebViewAct.a2(this.act, CoreModule.c.j0.C4().titleText, CoreModule.c.j0.C4().promotionUrl, true);
            intentA2.putExtra("hideNavigationBar", true);
            this.act.startActivity(intentA2);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m24413y0(boolean isFromPayFail) {
        PurchaseType purchaseType = this.currentPurchaseType;
        PurchaseType purchaseType2 = PurchaseType.TYPE_ULTRA_PREMIUM;
        if (purchaseType == purchaseType2 || (purchaseType == PurchaseType.TYPE_GET_PRIVILEGE_PACKAGE && !m24401i0())) {
            if (m24365A0(isFromPayFail, this.currentPurchaseType == purchaseType2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: l.w6p$c */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"l/w6p$c", "Landroidx/viewpager/widget/ViewPager$j;", "", "position", "", "positionOffset", "positionOffsetPixels", "", "onPageScrolled", "(IFI)V", "onPageSelected", "(I)V", "state", "onPageScrollStateChanged", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0877c implements ViewPager.j {
        public C0877c() {
        }

        public void onPageSelected(int position) {
            PurchaseType purchaseType = (PurchaseType) w6p.this.purchaseTypes.get(position);
            w6p.this.m24403l0(purchaseType);
            w6p.this.m24404m0(purchaseType);
            w6p.this.m24402k0(purchaseType);
            w6p.this.m24398c0().m4502b(purchaseType);
            y6p y6pVar = w6p.this.purchasePageNewAdapter;
            if (y6pVar != null) {
                y6pVar.m26403q(purchaseType);
            }
        }

        public void onPageScrollStateChanged(int state) {
        }

        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        }
    }
}
