package com.p046p1.mobile.putong.core.p053ui.purchase.mediator;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8765d;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.C8778c;
import com.p046p1.mobile.putong.core.p053ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p147v.VImage;
import p147v.VScroll_Fill_BottomAligned;
import p149l.AbstractC18623n5;
import p149l.aab0;
import p149l.b2s;
import p149l.bi60;
import p149l.cwf0;
import p149l.d1m;
import p149l.d30;
import p149l.d3c0;
import p149l.dab0;
import p149l.e30;
import p149l.ef60;
import p149l.er2;
import p149l.fy80;
import p149l.g30;
import p149l.g6a;
import p149l.hab0;
import p149l.i0e;
import p149l.iab0;
import p149l.j5b0;
import p149l.l2b0;
import p149l.m6c0;
import p149l.mmd0;
import p149l.o7r;
import p149l.p2b0;
import p149l.p6b0;
import p149l.q0b0;
import p149l.r0m;
import p149l.s4e;
import p149l.sab0;
import p149l.svq;
import p149l.t6b0;
import p149l.u0b0;
import p149l.vwb;
import p149l.w2b0;
import p149l.w9j;
import p149l.wx80;
import p149l.x5b0;
import p149l.xdl0;
import p149l.xma;
import p149l.y7c0;
import p149l.z9b0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001;B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u0010J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u0010J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001f¢\u0006\u0004\b&\u0010\"J\u001d\u0010)\u001a\u00020\f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0016¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010-¢\u0006\u0004\b2\u00100J\u0017\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010-¢\u0006\u0004\b4\u00100J+\u00107\u001a\u00020\f2\u001c\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010-¢\u0006\u0004\b:\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010X\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010K\u001a\u0004\bV\u0010M\"\u0004\bW\u0010OR\"\u0010_\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010K\u001a\u0004\ba\u0010M\"\u0004\bb\u0010OR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010s\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010v\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010uR\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010xR\u0016\u0010%\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010rR\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010oR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010zR\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010@R\u0018\u0010|\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010{R\u0018\u00103\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010{R,\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010~R\u0018\u0010\u007f\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010{R\u001b\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010\u0081\u0001R\u0017\u0010\u0083\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010rR(\u0010\u0088\u0001\u001a\u0014\u0012\u000f\u0012\r \u0086\u0001*\u0005\u0018\u00010\u0085\u00010\u0085\u00010\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0087\u0001¨\u0006\u0089\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/c;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "h", "(Landroid/view/View;)V", "n", "()V", BaseSei.f13932Z, "o", "()Landroid/view/View;", BaseSei.f13930X, BaseSei.f13931Y, "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "p", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "A", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "", "dismissCallback", "J", "(Z)V", "K", "q", "renew", "I", "Ll/wx80;", "privilegeDescriptions", "H", "otherUser", "G", "(Ljava/lang/String;)V", "Ll/d30;", "onCloseCallback", "B", "(Ll/d30;)V", "touchOutsideListener", "F", "onKeyBackCallback", "D", "Ll/g30;", "onPaymentSuccess", "E", "(Ll/g30;)V", SysnotifListener.ACTION_DISMISS, b2s.C_ZONE, "a", "Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "Lv/VScroll_Fill_BottomAligned;", Constants.INAPP_DATA_TAG, "Lv/VScroll_Fill_BottomAligned;", Constants.KEY_T, "()Lv/VScroll_Fill_BottomAligned;", "set_content", "(Lv/VScroll_Fill_BottomAligned;)V", "_content", "Landroid/widget/FrameLayout;", "e", "Landroid/widget/FrameLayout;", ResourceDirection.f38808v, "()Landroid/widget/FrameLayout;", "set_privilege", "(Landroid/widget/FrameLayout;)V", "_privilege", "f", "w", "set_showcase", "_showcase", "g", "u", "set_payment", "_payment", "Lv/VImage;", "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f44446s, "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", RXScreenCaptureService.KEY_INDEX, "r", "set_agreements", "_agreements", "Ll/r0m;", "j", "Ll/r0m;", "privilegeComponent", "Ll/j5b0;", "k", "Ll/j5b0;", "mediator", "", "Ll/d1m;", BLiveStormDanmakuGiftResourceType.f44444l, "Ljava/util/List;", "purchaseComponentsList", "m", "Z", "isDialogShow", "Ll/hab0;", "Ll/hab0;", "purchasePageTrack", "Ll/cwf0;", "Ll/cwf0;", "statisticsPageHelper", "Lcom/p1/mobile/putong/core/data/Privilege;", "Ll/d30;", "onCloseClick", "onTouchOutsideCallback", "Ll/g30;", "onDismiss", "Lcom/p1/mobile/android/app/Dialog;", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "shouldDismissCallback", "Ll/e30;", "", "kotlin.jvm.PlatformType", "Ll/e30;", "dialogStateAction", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class C8778c {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final e30<Integer> dialogStateAction;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final PurchaseType purchaseType;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public final String from;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VScroll_Fill_BottomAligned _content;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public FrameLayout _privilege;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public FrameLayout _showcase;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public FrameLayout _payment;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _close;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public FrameLayout _agreements;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public r0m privilegeComponent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public j5b0 mediator;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public List<d1m> purchaseComponentsList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isDialogShow;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public hab0 purchasePageTrack;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final cwf0 statisticsPageHelper;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean renew;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public List<? extends wx80> privilegeDescriptions;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Privilege firstPrivilege;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public String otherUser;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public d30 onCloseClick;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public d30 onTouchOutsideCallback;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public d30 onKeyBackCallback;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public g30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public d30 onDismiss;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public Dialog dialog;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public boolean shouldDismissCallback;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$a */
    @Metadata(m87231d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u0016J+\u0010\u001d\u001a\u00020\u00002\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010\u0016J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00100R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0018\u00107\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R,\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00106¨\u0006?"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "a", "(Lcom/p1/mobile/putong/core/data/Privilege;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "", "Ll/wx80;", "privilegeDescriptions", "g", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "Ll/d30;", "onCloseCallback", "b", "(Ll/d30;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "touchOutsideListener", "f", "onKeyBackCallback", Constants.INAPP_DATA_TAG, "Ll/g30;", "onPaymentSuccess", "e", "(Ll/g30;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", SysnotifListener.ACTION_DISMISS, "c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/c;", "h", "()Lcom/p1/mobile/putong/core/ui/purchase/mediator/c;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "", "Z", "renew", "Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "otherUser", "Ll/d30;", "onCloseClick", RXScreenCaptureService.KEY_INDEX, "onTouchOutsideCallback", "j", "k", "Ll/g30;", BLiveStormDanmakuGiftResourceType.f44444l, "onDismiss", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public final Act act;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        @NotNull
        public final PurchaseType purchaseType;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @Nullable
        public String from;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public boolean renew;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public List<? extends wx80> privilegeDescriptions;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public Privilege firstPrivilege;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public String otherUser;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public d30 onCloseClick;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public d30 onTouchOutsideCallback;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public d30 onKeyBackCallback;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public g30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public d30 onDismiss;

        public a(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
            act.getClass();
            purchaseType.getClass();
            this.act = act;
            this.purchaseType = purchaseType;
            this.from = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m54088a(@Nullable Privilege privilege) {
            this.firstPrivilege = privilege;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m54089b(@Nullable d30 onCloseCallback) {
            this.onCloseClick = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m54090c(@Nullable d30 dismiss) {
            this.onDismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m54091d(@Nullable d30 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a m54092e(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final a m54093f(@Nullable d30 touchOutsideListener) {
            this.onTouchOutsideCallback = touchOutsideListener;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final a m54094g(@Nullable List<? extends wx80> privilegeDescriptions) {
            this.privilegeDescriptions = privilegeDescriptions;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C8778c m54095h() {
            C8778c c8778c = new C8778c(this.act, this.purchaseType, this.from);
            c8778c.m54071I(this.renew);
            c8778c.m54063A(this.firstPrivilege);
            if (vwb.m200296J(this.privilegeDescriptions)) {
                this.privilegeDescriptions = fy80.m123718n(this.purchaseType, this.firstPrivilege, this.renew);
            }
            c8778c.m54070H(this.privilegeDescriptions);
            c8778c.m54069G(this.otherUser);
            c8778c.m54064B(this.onCloseClick);
            c8778c.m54068F(this.onTouchOutsideCallback);
            c8778c.m54066D(this.onKeyBackCallback);
            c8778c.m54067E(this.onPaymentSuccess);
            c8778c.m54065C(this.onDismiss);
            c8778c.m54073K();
            return c8778c;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$b */
    @Metadata(m87231d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class b implements AbstractC8776a.e {
        public b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.e
        /* JADX INFO: renamed from: a */
        public void mo53996a(List<? extends C8765d> sections) {
            sections.getClass();
            hab0 hab0Var = C8778c.this.purchasePageTrack;
            if (hab0Var != null) {
                hab0Var.m130100C(sections);
            }
            if (C8778c.this.isDialogShow) {
                return;
            }
            C8778c.this.isDialogShow = true;
            C8778c.this.m54077p(sections);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$c */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class c implements AbstractC8776a.d {
        public c() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.d
        /* JADX INFO: renamed from: a */
        public void mo53997a(C8765d section, boolean scroll, boolean isClick, C8765d sectionSource) {
            hab0 hab0Var;
            section.getClass();
            if (!isClick || (hab0Var = C8778c.this.purchasePageTrack) == null) {
                return;
            }
            hab0Var.m130099B(section);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$d */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class d implements AbstractC8776a.b {
        public d() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.purchase.mediator.AbstractC8776a.b
        /* JADX INFO: renamed from: a */
        public void mo53998a(ef60 paymentHandlerData, PurchaseType purchaseType) {
            bi60 paymentTextResponseData;
            hab0 hab0Var;
            paymentHandlerData.getClass();
            purchaseType.getClass();
            Integer paymentTrackSource = paymentHandlerData.getPaymentTrackSource();
            if ((paymentTrackSource != null && paymentTrackSource.intValue() == 4) || (paymentTrackSource != null && paymentTrackSource.intValue() == 3)) {
                hab0 hab0Var2 = C8778c.this.purchasePageTrack;
                if (hab0Var2 != null) {
                    hab0Var2.m130120s(paymentHandlerData, purchaseType);
                    return;
                }
                return;
            }
            if (paymentTrackSource != null && paymentTrackSource.intValue() == 2) {
                hab0 hab0Var3 = C8778c.this.purchasePageTrack;
                if (hab0Var3 != null) {
                    hab0.m130097u(hab0Var3, paymentHandlerData, purchaseType, false, 4, null);
                    return;
                }
                return;
            }
            hab0 hab0Var4 = C8778c.this.purchasePageTrack;
            if (hab0Var4 != null) {
                hab0Var4.m130124x(paymentHandlerData, purchaseType);
            }
            if (!g6a.m124571t() || (paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData()) == null || !paymentTextResponseData.getNeedTrackSticker() || (hab0Var = C8778c.this.purchasePageTrack) == null) {
                return;
            }
            hab0Var.m130125y(paymentHandlerData, purchaseType);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$e */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m87232d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$e", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class e extends er2 {
        @Override // p149l.n3m
        public String pageId() {
            return "p_purchase_page";
        }
    }

    public C8778c(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.purchaseComponentsList = new ArrayList();
        this.statisticsPageHelper = new cwf0(new e());
        this.shouldDismissCallback = true;
        this.dialogStateAction = new e30() { // from class: l.w9b0
            @Override // p149l.e30
            public final void call(Object obj) {
                C8778c.m54053c(this.f185331a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m54051a(C8778c c8778c, View view) {
        c8778c.dialogStateAction.call(0);
        d30 d30Var = c8778c.onCloseClick;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m54052b(C8778c c8778c, DialogInterface dialogInterface) {
        c8778c.m54087z();
    }

    /* JADX INFO: renamed from: c */
    public static void m54053c(C8778c c8778c, int i) {
        if (NullChecker.m81303a(c8778c.dialog)) {
            if (i == -1) {
                Dialog dialog = c8778c.dialog;
                if (dialog != null) {
                    dialog.hide();
                    return;
                }
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    Dialog dialog2 = c8778c.dialog;
                    if (dialog2 != null) {
                        dialog2.show();
                        return;
                    }
                    return;
                }
                if (i != 2) {
                    return;
                }
            }
            if (i == 2) {
                c8778c.m54072J(false);
            }
            Dialog dialog3 = c8778c.dialog;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m54054d(C8778c c8778c, DialogInterface dialogInterface) {
        d30 d30Var;
        CoreModule.m29935P().m94651a().mo33308E9();
        c8778c.m54087z();
        if (c8778c.isDialogShow) {
            i0e.m133796e(c8778c.statisticsPageHelper);
        }
        if (!c8778c.shouldDismissCallback || (d30Var = c8778c.onDismiss) == null) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m54055e(C8765d c8765d) {
        return Boolean.valueOf(c8765d.m53528j());
    }

    /* JADX INFO: renamed from: f */
    public static void m54056f(C8778c c8778c, Dialog dialog) {
        c8778c.dialogStateAction.call(0);
        d30 d30Var = c8778c.onTouchOutsideCallback;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m54057g(C8778c c8778c, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && i == 4) {
            c8778c.dialogStateAction.call(0);
            d30 d30Var = c8778c.onKeyBackCallback;
            if (d30Var != null) {
                d30Var.call();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m54063A(Privilege firstPrivilege) {
        this.firstPrivilege = firstPrivilege;
    }

    /* JADX INFO: renamed from: B */
    public final void m54064B(@Nullable d30 onCloseCallback) {
        this.onCloseClick = onCloseCallback;
    }

    /* JADX INFO: renamed from: C */
    public final void m54065C(@Nullable d30 dismiss) {
        this.onDismiss = dismiss;
    }

    /* JADX INFO: renamed from: D */
    public final void m54066D(@Nullable d30 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: E */
    public final void m54067E(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: F */
    public final void m54068F(@Nullable d30 touchOutsideListener) {
        this.onTouchOutsideCallback = touchOutsideListener;
    }

    /* JADX INFO: renamed from: G */
    public final void m54069G(@Nullable String otherUser) {
        this.otherUser = otherUser;
    }

    /* JADX INFO: renamed from: H */
    public final void m54070H(@Nullable List<? extends wx80> privilegeDescriptions) {
        this.privilegeDescriptions = privilegeDescriptions;
    }

    /* JADX INFO: renamed from: I */
    public final void m54071I(boolean renew) {
        this.renew = renew;
    }

    /* JADX INFO: renamed from: J */
    public final void m54072J(boolean dismissCallback) {
        this.shouldDismissCallback = dismissCallback;
    }

    /* JADX INFO: renamed from: K */
    public final void m54073K() {
        if (this.act.isFinishing()) {
            return;
        }
        ProductCategory productCategory = this.purchaseType.productCategory();
        productCategory.getClass();
        this.purchasePageTrack = new x5b0(productCategory, PurchaseTrackPageType.pop_one, this.from);
        j5b0 j5b0Var = new j5b0(this.act, this.purchaseType, this.from);
        this.mediator = j5b0Var;
        j5b0Var.m54018P(this.purchasePageTrack);
        m54075n();
        m54085x();
    }

    /* JADX INFO: renamed from: h */
    public final void m54074h(View view) {
        z9b0.m217666a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final void m54075n() {
        Dialog dialogM20567z = this.act.dialog().m20520P(m54076o(), false).m20516L(y7c0.f196699i).m20559v().m20494A(new DialogInterface.OnCancelListener() { // from class: l.s9b0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C8778c.m54052b(this.f163165a, dialogInterface);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.t9b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C8778c.m54054d(this.f169006a, dialogInterface);
            }
        }).m20539i0(new DialogInterface.OnKeyListener() { // from class: l.u9b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return C8778c.m54057g(this.f175210a, dialogInterface, i, keyEvent);
            }
        }).m20515K0(new Dialog.InterfaceC4313i() { // from class: l.v9b0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4313i
            /* JADX INFO: renamed from: a */
            public final void mo20570a(Dialog dialog) {
                C8778c.m54056f(this.f180621a, dialog);
            }
        }).m20566y0(s4e.f162375a).m20567z();
        this.dialog = dialogM20567z;
        if (dialogM20567z != null) {
            dialogM20567z.show();
        }
        hab0 hab0Var = this.purchasePageTrack;
        if (hab0Var != null) {
            ProductCategory productCategory = this.purchaseType.productCategory();
            productCategory.getClass();
            hab0Var.m130122v(productCategory);
        }
    }

    /* JADX INFO: renamed from: o */
    public final View m54076o() {
        int i;
        View viewInflate = o7r.m163037a(this.act).inflate(m6c0.f131491I1, (ViewGroup) null);
        viewInflate.getClass();
        m54074h(viewInflate);
        if (sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) {
            i = d3c0.f84014m4;
        } else if (sab0.m182887e(this.purchaseType) || sab0.m182885c(this.purchaseType)) {
            i = d3c0.f83613J;
        } else if (sab0.m182897o(this.purchaseType)) {
            i = d3c0.f83703P5;
        } else if (sab0.m182889g(this.purchaseType)) {
            i = d3c0.f83797W7;
        } else {
            i = sab0.m182906x(this.purchaseType) ? d3c0.f83810X7 : d3c0.f83623J9;
        }
        m54081t().setBackgroundResource(i);
        m54080s().setImageResource((sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) ? d3c0.f83787Va : d3c0.f83774Ua);
        xdl0.m208344M(m54080s(), true);
        xdl0.m208329E0(m54080s(), new View.OnClickListener() { // from class: l.x9b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8778c.m54051a(this.f191587a, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: p */
    public final void m54077p(List<? extends C8765d> sections) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.m201088b(this.from));
            ProductCategory productCategory = this.purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", vwb.m200307U(iab0.m135149j(sections), Constants.SEPARATOR_COMMA));
            jSONObject.put("default_product", productCategory.toString());
            jSONObject.put("default_duration", p2b0.m167133h().m167147p(productCategory));
            boolean zM81303a = NullChecker.m81303a(vwb.m200346r(sections, new w9j() { // from class: l.y9b0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return C8778c.m54055e((C8765d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zM81303a ? "yes" : "no");
            jSONObject.put("if_discount", zM81303a);
            boolean z = false;
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", iab0.m135145f(this.firstPrivilege, this.from));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m29935P().m94651a().mo33425U() && CoreModule.f17545c.f19591O0.m30088w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            if (CoreModule.m29935P().m94658i().mo158272N()) {
                if (CoreModule.f17545c.f19639e0.m169464Z7() && !CoreModule.f17545c.f19639e0.m169452W7() && !CoreModule.f17545c.f19639e0.m169506k8()) {
                    z = true;
                }
                jSONObject.put("is_fakeunreal", z);
            }
        } catch (JSONException e2) {
            CrashHelper.m81296c(e2);
        }
        this.statisticsPageHelper.m109039o(jSONObject);
        i0e.m133797f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: q */
    public final void m54078q() {
        Dialog dialog = this.dialog;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final FrameLayout m54079r() {
        FrameLayout frameLayout = this._agreements;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_agreements");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VImage m54080s() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final VScroll_Fill_BottomAligned m54081t() {
        VScroll_Fill_BottomAligned vScroll_Fill_BottomAligned = this._content;
        if (vScroll_Fill_BottomAligned != null) {
            return vScroll_Fill_BottomAligned;
        }
        Intrinsics.m87502r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final FrameLayout m54082u() {
        FrameLayout frameLayout = this._payment;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_payment");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final FrameLayout m54083v() {
        FrameLayout frameLayout = this._privilege;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final FrameLayout m54084w() {
        FrameLayout frameLayout = this._showcase;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_showcase");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m54085x() {
        r0m r0mVarM148277b = l2b0.m148277b(this.act, this.purchaseType, this.from, false, true);
        this.privilegeComponent = r0mVarM148277b;
        View viewMo155367a = r0mVarM148277b != null ? r0mVarM148277b.mo155367a(m54083v(), false) : null;
        r0m r0mVar = this.privilegeComponent;
        if (r0mVar != 0) {
            r0mVar.mo155369c(this.privilegeDescriptions);
        }
        m54083v().addView(viewMo155367a, new LinearLayout.LayoutParams(-1, -2));
        r0m r0mVar2 = this.privilegeComponent;
        mmd0 mmd0Var = r0mVar2 instanceof mmd0 ? (mmd0) r0mVar2 : null;
        if (mmd0Var != null) {
            mmd0Var.m155371g();
        }
        if (sab0.m182891i(this.purchaseType) || sab0.m182898p(this.purchaseType) || sab0.m182892j(this.purchaseType)) {
            ViewGroup.LayoutParams layoutParams = m54084w().getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int iM186103c = svq.m186103c(1);
            layoutParams2.leftMargin = iM186103c;
            layoutParams2.rightMargin = iM186103c;
            m54084w().setLayoutParams(layoutParams2);
        }
        d1m dab0Var = p2b0.m167133h().m167157z() ? new dab0(this.act, this.purchaseType, this.from, this.mediator) : new aab0(this.act, this.purchaseType, this.from, this.mediator);
        m54084w().addView(dab0Var.mo95244a(m54084w()));
        dab0Var.register();
        this.purchaseComponentsList.add(dab0Var);
        AbstractC18623n5 p6b0Var = (sab0.m182887e(this.purchaseType) || !(!sab0.m182885c(this.purchaseType) || CoreModule.f17554l.m94656g().mo35078v9() || xma.m210047L3())) ? new p6b0(this.act, this.purchaseType, this.from, this.mediator) : new t6b0(this.act, this.purchaseType, this.from, this.mediator);
        m54082u().addView(p6b0Var.mo95244a(m54082u()));
        p6b0Var.m157941Q(this.onPaymentSuccess);
        p6b0Var.m157940P(this.firstPrivilege);
        p6b0Var.m157939O(this.dialogStateAction);
        p6b0Var.register();
        this.purchaseComponentsList.add(p6b0Var);
        if (sab0.m182886d(this.purchaseType)) {
            xdl0.m208344M(m54079r(), true);
            boolean zM167157z = p2b0.m167133h().m167157z();
            Act act = this.act;
            d1m u0b0Var = zM167157z ? new u0b0(act, this.purchaseType, this.from, this.mediator) : new q0b0(act, this.purchaseType, this.from, this.mediator);
            m54079r().addView(u0b0Var.mo95244a(m54079r()));
            u0b0Var.register();
            this.purchaseComponentsList.add(u0b0Var);
        }
        m54086y();
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.mo54040w();
        }
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().mo100278b();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m54086y() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54012J(new b());
            j5b0Var.m54011I(new c());
            j5b0Var.m54009G(new d());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m54087z() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m54013K();
        }
        r0m r0mVar = this.privilegeComponent;
        if (r0mVar != null) {
            r0mVar.release();
        }
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }
}
