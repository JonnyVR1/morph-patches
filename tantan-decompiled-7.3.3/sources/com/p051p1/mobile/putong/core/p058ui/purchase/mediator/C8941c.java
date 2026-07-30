package com.p051p1.mobile.putong.core.p058ui.purchase.mediator;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8928d;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.C8941c;
import com.p051p1.mobile.putong.core.p058ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p151v.VImage;
import p151v.VScroll_Fill_BottomAligned;
import p153l.AbstractC18347l5;
import p153l.a30;
import p153l.a690;
import p153l.abb0;
import p153l.beb0;
import p153l.bnl0;
import p153l.c4s;
import p153l.dgc0;
import p153l.dib0;
import p153l.eib0;
import p153l.g6e;
import p153l.gq60;
import p153l.hib0;
import p153l.j690;
import p153l.jbc0;
import p153l.jn60;
import p153l.joa;
import p153l.jyb;
import p153l.l3m;
import p153l.l4g0;
import p153l.lib0;
import p153l.mib0;
import p153l.ndb0;
import p153l.oud0;
import p153l.p9r;
import p153l.pab0;
import p153l.qcj;
import p153l.rec0;
import p153l.s7a;
import p153l.tab0;
import p153l.teb0;
import p153l.txq;
import p153l.u8b0;
import p153l.ur2;
import p153l.w1e;
import p153l.w3m;
import p153l.wib0;
import p153l.x20;
import p153l.xeb0;
import p153l.y20;
import p153l.y8b0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001;B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u0010J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u0010J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001f¢\u0006\u0004\b&\u0010\"J\u001d\u0010)\u001a\u00020\f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0016¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010-¢\u0006\u0004\b2\u00100J\u0017\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010-¢\u0006\u0004\b4\u00100J+\u00107\u001a\u00020\f2\u001c\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010-¢\u0006\u0004\b:\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010X\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010K\u001a\u0004\bV\u0010M\"\u0004\bW\u0010OR\"\u0010_\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010K\u001a\u0004\ba\u0010M\"\u0004\bb\u0010OR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010s\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010v\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010uR\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010xR\u0016\u0010%\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010rR\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010oR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010zR\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010@R\u0018\u0010|\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010{R\u0018\u00103\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010{R,\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010~R\u0018\u0010\u007f\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010{R\u001b\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010\u0081\u0001R\u0017\u0010\u0083\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010rR(\u0010\u0088\u0001\u001a\u0014\u0012\u000f\u0012\r \u0086\u0001*\u0005\u0018\u00010\u0085\u00010\u0085\u00010\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0087\u0001¨\u0006\u0089\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/c;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "h", "(Landroid/view/View;)V", "n", "()V", BaseSei.f14626Z, "o", "()Landroid/view/View;", BaseSei.f14624X, BaseSei.f14625Y, "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "p", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "A", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "", "dismissCallback", "J", "(Z)V", "K", "q", "renew", "I", "Ll/a690;", "privilegeDescriptions", "H", "otherUser", "G", "(Ljava/lang/String;)V", "Ll/x20;", "onCloseCallback", "B", "(Ll/x20;)V", "touchOutsideListener", "F", "onKeyBackCallback", "D", "Ll/a30;", "onPaymentSuccess", "E", "(Ll/a30;)V", SysnotifListener.ACTION_DISMISS, c4s.C_ZONE, "a", "Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "Lv/VScroll_Fill_BottomAligned;", Constants.INAPP_DATA_TAG, "Lv/VScroll_Fill_BottomAligned;", Constants.KEY_T, "()Lv/VScroll_Fill_BottomAligned;", "set_content", "(Lv/VScroll_Fill_BottomAligned;)V", "_content", "Landroid/widget/FrameLayout;", "e", "Landroid/widget/FrameLayout;", ResourceDirection.f39656v, "()Landroid/widget/FrameLayout;", "set_privilege", "(Landroid/widget/FrameLayout;)V", "_privilege", "f", "w", "set_showcase", "_showcase", "g", "u", "set_payment", "_payment", "Lv/VImage;", "Lv/VImage;", BLiveStormDanmakuGiftResourceType.f45294s, "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", RXScreenCaptureService.KEY_INDEX, "r", "set_agreements", "_agreements", "Ll/l3m;", "j", "Ll/l3m;", "privilegeComponent", "Ll/ndb0;", "k", "Ll/ndb0;", "mediator", "", "Ll/w3m;", BLiveStormDanmakuGiftResourceType.f45292l, "Ljava/util/List;", "purchaseComponentsList", "m", "Z", "isDialogShow", "Ll/lib0;", "Ll/lib0;", "purchasePageTrack", "Ll/l4g0;", "Ll/l4g0;", "statisticsPageHelper", "Lcom/p1/mobile/putong/core/data/Privilege;", "Ll/x20;", "onCloseClick", "onTouchOutsideCallback", "Ll/a30;", "onDismiss", "Lcom/p1/mobile/android/app/Dialog;", "Lcom/p1/mobile/android/app/Dialog;", OMSTemplateType.dialog, "shouldDismissCallback", "Ll/y20;", "", "kotlin.jvm.PlatformType", "Ll/y20;", "dialogStateAction", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class C8941c {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final y20<Integer> dialogStateAction;

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
    public l3m privilegeComponent;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public ndb0 mediator;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public List<w3m> purchaseComponentsList;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isDialogShow;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public lib0 purchasePageTrack;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final l4g0 statisticsPageHelper;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean renew;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public List<? extends a690> privilegeDescriptions;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Privilege firstPrivilege;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public String otherUser;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    @Nullable
    public x20 onCloseClick;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    @Nullable
    public x20 onTouchOutsideCallback;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    @Nullable
    public x20 onKeyBackCallback;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @Nullable
    public a30<PurchaseType, Act, String> onPaymentSuccess;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    public x20 onDismiss;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @Nullable
    public Dialog dialog;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public boolean shouldDismissCallback;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$a */
    @Metadata(m88120d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u0016J+\u0010\u001d\u001a\u00020\u00002\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010\u0016J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00100R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0018\u00107\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R,\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00106¨\u0006?"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "a", "(Lcom/p1/mobile/putong/core/data/Privilege;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "", "Ll/a690;", "privilegeDescriptions", "g", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "Ll/x20;", "onCloseCallback", "b", "(Ll/x20;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "touchOutsideListener", "f", "onKeyBackCallback", Constants.INAPP_DATA_TAG, "Ll/a30;", "onPaymentSuccess", "e", "(Ll/a30;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", SysnotifListener.ACTION_DISMISS, "c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/c;", "h", "()Lcom/p1/mobile/putong/core/ui/purchase/mediator/c;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "", "Z", "renew", "Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "otherUser", "Ll/x20;", "onCloseClick", RXScreenCaptureService.KEY_INDEX, "onTouchOutsideCallback", "j", "k", "Ll/a30;", BLiveStormDanmakuGiftResourceType.f45292l, "onDismiss", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
        public List<? extends a690> privilegeDescriptions;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        @Nullable
        public Privilege firstPrivilege;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        @Nullable
        public String otherUser;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        @Nullable
        public x20 onCloseClick;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        @Nullable
        public x20 onTouchOutsideCallback;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        @Nullable
        public x20 onKeyBackCallback;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @Nullable
        public a30<PurchaseType, Act, String> onPaymentSuccess;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        @Nullable
        public x20 onDismiss;

        public a(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
            act.getClass();
            purchaseType.getClass();
            this.act = act;
            this.purchaseType = purchaseType;
            this.from = str;
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final a m55271a(@Nullable Privilege privilege) {
            this.firstPrivilege = privilege;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m55272b(@Nullable x20 onCloseCallback) {
            this.onCloseClick = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m55273c(@Nullable x20 dismiss) {
            this.onDismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m55274d(@Nullable x20 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a m55275e(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final a m55276f(@Nullable x20 touchOutsideListener) {
            this.onTouchOutsideCallback = touchOutsideListener;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final a m55277g(@Nullable List<? extends a690> privilegeDescriptions) {
            this.privilegeDescriptions = privilegeDescriptions;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C8941c m55278h() {
            C8941c c8941c = new C8941c(this.act, this.purchaseType, this.from);
            c8941c.m55254I(this.renew);
            c8941c.m55246A(this.firstPrivilege);
            if (jyb.m147479J(this.privilegeDescriptions)) {
                this.privilegeDescriptions = j690.m143622n(this.purchaseType, this.firstPrivilege, this.renew);
            }
            c8941c.m55253H(this.privilegeDescriptions);
            c8941c.m55252G(this.otherUser);
            c8941c.m55247B(this.onCloseClick);
            c8941c.m55251F(this.onTouchOutsideCallback);
            c8941c.m55249D(this.onKeyBackCallback);
            c8941c.m55250E(this.onPaymentSuccess);
            c8941c.m55248C(this.onDismiss);
            c8941c.m55256K();
            return c8941c;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$b */
    @Metadata(m88120d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class b implements AbstractC8939a.e {
        public b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.e
        /* JADX INFO: renamed from: a */
        public void mo55179a(List<? extends C8928d> sections) {
            sections.getClass();
            lib0 lib0Var = C8941c.this.purchasePageTrack;
            if (lib0Var != null) {
                lib0Var.m154334C(sections);
            }
            if (C8941c.this.isDialogShow) {
                return;
            }
            C8941c.this.isDialogShow = true;
            C8941c.this.m55260p(sections);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$c */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class c implements AbstractC8939a.d {
        public c() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.d
        /* JADX INFO: renamed from: a */
        public void mo55180a(C8928d section, boolean scroll, boolean isClick, C8928d sectionSource) {
            lib0 lib0Var;
            section.getClass();
            if (!isClick || (lib0Var = C8941c.this.purchasePageTrack) == null) {
                return;
            }
            lib0Var.m154333B(section);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$d */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/jn60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/jn60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class d implements AbstractC8939a.b {
        public d() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.purchase.mediator.AbstractC8939a.b
        /* JADX INFO: renamed from: a */
        public void mo55181a(jn60 paymentHandlerData, PurchaseType purchaseType) {
            gq60 paymentTextResponseData;
            lib0 lib0Var;
            paymentHandlerData.getClass();
            purchaseType.getClass();
            Integer paymentTrackSource = paymentHandlerData.getPaymentTrackSource();
            if ((paymentTrackSource != null && paymentTrackSource.intValue() == 4) || (paymentTrackSource != null && paymentTrackSource.intValue() == 3)) {
                lib0 lib0Var2 = C8941c.this.purchasePageTrack;
                if (lib0Var2 != null) {
                    lib0Var2.m154342s(paymentHandlerData, purchaseType);
                    return;
                }
                return;
            }
            if (paymentTrackSource != null && paymentTrackSource.intValue() == 2) {
                lib0 lib0Var3 = C8941c.this.purchasePageTrack;
                if (lib0Var3 != null) {
                    lib0.m154331u(lib0Var3, paymentHandlerData, purchaseType, false, 4, null);
                    return;
                }
                return;
            }
            lib0 lib0Var4 = C8941c.this.purchasePageTrack;
            if (lib0Var4 != null) {
                lib0Var4.m154346x(paymentHandlerData, purchaseType);
            }
            if (!s7a.m184991t() || (paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData()) == null || !paymentTextResponseData.getNeedTrackSticker() || (lib0Var = C8941c.this.purchasePageTrack) == null) {
                return;
            }
            lib0Var.m154347y(paymentHandlerData, purchaseType);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$e */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$e", "Ll/ur2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class e extends ur2 {
        @Override // p153l.e6m
        public String pageId() {
            return "p_purchase_page";
        }
    }

    public C8941c(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.purchaseComponentsList = new ArrayList();
        this.statisticsPageHelper = new l4g0(new e());
        this.shouldDismissCallback = true;
        this.dialogStateAction = new y20() { // from class: l.aib0
            @Override // p153l.y20
            public final void call(Object obj) {
                C8941c.m55236c(this.f71478a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m55234a(C8941c c8941c, View view) {
        c8941c.dialogStateAction.call(0);
        x20 x20Var = c8941c.onCloseClick;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m55235b(C8941c c8941c, DialogInterface dialogInterface) {
        c8941c.m55270z();
    }

    /* JADX INFO: renamed from: c */
    public static void m55236c(C8941c c8941c, int i) {
        if (NullChecker.m82486a(c8941c.dialog)) {
            if (i == -1) {
                Dialog dialog = c8941c.dialog;
                if (dialog != null) {
                    dialog.hide();
                    return;
                }
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    Dialog dialog2 = c8941c.dialog;
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
                c8941c.m55255J(false);
            }
            Dialog dialog3 = c8941c.dialog;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m55237d(C8941c c8941c, DialogInterface dialogInterface) {
        x20 x20Var;
        CoreModule.m30933P().m143405a().mo34311E9();
        c8941c.m55270z();
        if (c8941c.isDialogShow) {
            w1e.m204401e(c8941c.statisticsPageHelper);
        }
        if (!c8941c.shouldDismissCallback || (x20Var = c8941c.onDismiss) == null) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m55238e(C8928d c8928d) {
        return Boolean.valueOf(c8928d.m54711j());
    }

    /* JADX INFO: renamed from: f */
    public static void m55239f(C8941c c8941c, Dialog dialog) {
        c8941c.dialogStateAction.call(0);
        x20 x20Var = c8941c.onTouchOutsideCallback;
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m55240g(C8941c c8941c, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && i == 4) {
            c8941c.dialogStateAction.call(0);
            x20 x20Var = c8941c.onKeyBackCallback;
            if (x20Var != null) {
                x20Var.call();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m55246A(Privilege firstPrivilege) {
        this.firstPrivilege = firstPrivilege;
    }

    /* JADX INFO: renamed from: B */
    public final void m55247B(@Nullable x20 onCloseCallback) {
        this.onCloseClick = onCloseCallback;
    }

    /* JADX INFO: renamed from: C */
    public final void m55248C(@Nullable x20 dismiss) {
        this.onDismiss = dismiss;
    }

    /* JADX INFO: renamed from: D */
    public final void m55249D(@Nullable x20 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: E */
    public final void m55250E(@Nullable a30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: F */
    public final void m55251F(@Nullable x20 touchOutsideListener) {
        this.onTouchOutsideCallback = touchOutsideListener;
    }

    /* JADX INFO: renamed from: G */
    public final void m55252G(@Nullable String otherUser) {
        this.otherUser = otherUser;
    }

    /* JADX INFO: renamed from: H */
    public final void m55253H(@Nullable List<? extends a690> privilegeDescriptions) {
        this.privilegeDescriptions = privilegeDescriptions;
    }

    /* JADX INFO: renamed from: I */
    public final void m55254I(boolean renew) {
        this.renew = renew;
    }

    /* JADX INFO: renamed from: J */
    public final void m55255J(boolean dismissCallback) {
        this.shouldDismissCallback = dismissCallback;
    }

    /* JADX INFO: renamed from: K */
    public final void m55256K() {
        if (this.act.isFinishing()) {
            return;
        }
        ProductCategory productCategory = this.purchaseType.productCategory();
        productCategory.getClass();
        this.purchasePageTrack = new beb0(productCategory, PurchaseTrackPageType.pop_one, this.from);
        ndb0 ndb0Var = new ndb0(this.act, this.purchaseType, this.from);
        this.mediator = ndb0Var;
        ndb0Var.m55201P(this.purchasePageTrack);
        m55258n();
        m55268x();
    }

    /* JADX INFO: renamed from: h */
    public final void m55257h(View view) {
        dib0.m115871a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final void m55258n() {
        Dialog dialogM21566z = this.act.dialog().m21519P(m55259o(), false).m21515L(dgc0.f88285j).m21558v().m21493A(new DialogInterface.OnCancelListener() { // from class: l.whb0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C8941c.m55235b(this.f189109a, dialogInterface);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.xhb0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C8941c.m55237d(this.f194291a, dialogInterface);
            }
        }).m21538i0(new DialogInterface.OnKeyListener() { // from class: l.yhb0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return C8941c.m55240g(this.f199920a, dialogInterface, i, keyEvent);
            }
        }).m21514K0(new Dialog.InterfaceC4464i() { // from class: l.zhb0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4464i
            /* JADX INFO: renamed from: a */
            public final void mo21569a(Dialog dialog) {
                C8941c.m55239f(this.f204392a, dialog);
            }
        }).m21565y0(g6e.f102427a).m21566z();
        this.dialog = dialogM21566z;
        if (dialogM21566z != null) {
            dialogM21566z.show();
        }
        lib0 lib0Var = this.purchasePageTrack;
        if (lib0Var != null) {
            ProductCategory productCategory = this.purchaseType.productCategory();
            productCategory.getClass();
            lib0Var.m154344v(productCategory);
        }
    }

    /* JADX INFO: renamed from: o */
    public final View m55259o() {
        int i;
        View viewInflate = p9r.m171370a(this.act).inflate(rec0.f162451I1, (ViewGroup) null);
        viewInflate.getClass();
        m55257h(viewInflate);
        if (wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) {
            i = jbc0.f119669m4;
        } else if (wib0.m206561e(this.purchaseType) || wib0.m206559c(this.purchaseType)) {
            i = jbc0.f119268J;
        } else if (wib0.m206571o(this.purchaseType)) {
            i = jbc0.f119358P5;
        } else if (wib0.m206563g(this.purchaseType)) {
            i = jbc0.f119452W7;
        } else {
            i = wib0.m206580x(this.purchaseType) ? jbc0.f119465X7 : jbc0.f119278J9;
        }
        m55264t().setBackgroundResource(i);
        m55263s().setImageResource((wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) ? jbc0.f119442Va : jbc0.f119429Ua);
        bnl0.m105524M(m55263s(), true);
        bnl0.m105509E0(m55263s(), new View.OnClickListener() { // from class: l.bib0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C8941c.m55234a(this.f76853a, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: p */
    public final void m55260p(List<? extends C8928d> sections) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", abb0.m96735b(this.from));
            ProductCategory productCategory = this.purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", jyb.m147490U(mib0.m158481j(sections), Constants.SEPARATOR_COMMA));
            jSONObject.put("default_product", productCategory.toString());
            jSONObject.put("default_duration", tab0.m189811h().m189825p(productCategory));
            boolean zM82486a = NullChecker.m82486a(jyb.m147529r(sections, new qcj() { // from class: l.cib0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return C8941c.m55238e((C8928d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zM82486a ? "yes" : "no");
            jSONObject.put("if_discount", zM82486a);
            boolean z = false;
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", mib0.m158477f(this.firstPrivilege, this.from));
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", FirebaseAnalytics.Event.PURCHASE);
            if (CoreModule.m30933P().m143405a().mo34428U() && CoreModule.f18264c.f20333O0.m31086w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            if (CoreModule.m30933P().m143412i().mo180364N()) {
                if (CoreModule.f18264c.f20381e0.m116537Z7() && !CoreModule.f18264c.f20381e0.m116525W7() && !CoreModule.f18264c.f20381e0.m116579k8()) {
                    z = true;
                }
                jSONObject.put("is_fakeunreal", z);
            }
        } catch (JSONException e2) {
            CrashHelper.m82479c(e2);
        }
        this.statisticsPageHelper.m152780o(jSONObject);
        w1e.m204402f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: q */
    public final void m55261q() {
        Dialog dialog = this.dialog;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final FrameLayout m55262r() {
        FrameLayout frameLayout = this._agreements;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_agreements");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VImage m55263s() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final VScroll_Fill_BottomAligned m55264t() {
        VScroll_Fill_BottomAligned vScroll_Fill_BottomAligned = this._content;
        if (vScroll_Fill_BottomAligned != null) {
            return vScroll_Fill_BottomAligned;
        }
        Intrinsics.m88391r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final FrameLayout m55265u() {
        FrameLayout frameLayout = this._payment;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_payment");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final FrameLayout m55266v() {
        FrameLayout frameLayout = this._privilege;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final FrameLayout m55267w() {
        FrameLayout frameLayout = this._showcase;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_showcase");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m55268x() {
        l3m l3mVarM171416b = pab0.m171416b(this.act, this.purchaseType, this.from, false, true);
        this.privilegeComponent = l3mVarM171416b;
        View viewMo116073a = l3mVarM171416b != null ? l3mVarM171416b.mo116073a(m55266v(), false) : null;
        l3m l3mVar = this.privilegeComponent;
        if (l3mVar != 0) {
            l3mVar.mo116075c(this.privilegeDescriptions);
        }
        m55266v().addView(viewMo116073a, new LinearLayout.LayoutParams(-1, -2));
        l3m l3mVar2 = this.privilegeComponent;
        oud0 oud0Var = l3mVar2 instanceof oud0 ? (oud0) l3mVar2 : null;
        if (oud0Var != null) {
            oud0Var.m169291g();
        }
        if (wib0.m206565i(this.purchaseType) || wib0.m206572p(this.purchaseType) || wib0.m206566j(this.purchaseType)) {
            ViewGroup.LayoutParams layoutParams = m55267w().getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int iM193530c = txq.m193530c(1);
            layoutParams2.leftMargin = iM193530c;
            layoutParams2.rightMargin = iM193530c;
            m55267w().setLayoutParams(layoutParams2);
        }
        w3m hib0Var = tab0.m189811h().m189835z() ? new hib0(this.act, this.purchaseType, this.from, this.mediator) : new eib0(this.act, this.purchaseType, this.from, this.mediator);
        m55267w().addView(hib0Var.mo96551a(m55267w()));
        hib0Var.register();
        this.purchaseComponentsList.add(hib0Var);
        AbstractC18347l5 teb0Var = (wib0.m206561e(this.purchaseType) || !(!wib0.m206559c(this.purchaseType) || CoreModule.f18273l.m143410g().mo36081v9() || joa.m146361M3())) ? new teb0(this.act, this.purchaseType, this.from, this.mediator) : new xeb0(this.act, this.purchaseType, this.from, this.mediator);
        m55265u().addView(teb0Var.mo96551a(m55265u()));
        teb0Var.m152862Q(this.onPaymentSuccess);
        teb0Var.m152861P(this.firstPrivilege);
        teb0Var.m152860O(this.dialogStateAction);
        teb0Var.register();
        this.purchaseComponentsList.add(teb0Var);
        if (wib0.m206560d(this.purchaseType)) {
            bnl0.m105524M(m55262r(), true);
            boolean zM189835z = tab0.m189811h().m189835z();
            Act act = this.act;
            w3m y8b0Var = zM189835z ? new y8b0(act, this.purchaseType, this.from, this.mediator) : new u8b0(act, this.purchaseType, this.from, this.mediator);
            m55262r().addView(y8b0Var.mo96551a(m55262r()));
            y8b0Var.register();
            this.purchaseComponentsList.add(y8b0Var);
        }
        m55269y();
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.mo55223w();
        }
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().mo152867b();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m55269y() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55195J(new b());
            ndb0Var.m55194I(new c());
            ndb0Var.m55192G(new d());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m55270z() {
        ndb0 ndb0Var = this.mediator;
        if (ndb0Var != null) {
            ndb0Var.m55196K();
        }
        l3m l3mVar = this.privilegeComponent;
        if (l3mVar != null) {
            l3mVar.release();
        }
        Iterator<w3m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().release();
        }
    }
}
