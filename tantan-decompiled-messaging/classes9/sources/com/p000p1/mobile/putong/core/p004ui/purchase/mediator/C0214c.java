package com.p000p1.mobile.putong.core.p004ui.purchase.mediator;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.C0214c;
import com.p000p1.mobile.putong.core.p004ui.purchase.mediator.track.PurchaseTrackPageType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.ui.purchase.d;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l.cwf0;
import l.d30;
import l.d3c0;
import l.e30;
import l.er2;
import l.fy80;
import l.g30;
import l.i0e;
import l.l2b0;
import l.m6c0;
import l.o7r;
import l.p2b0;
import l.s4e;
import l.sab0;
import l.svq;
import l.vwb;
import l.w2b0;
import l.w9j;
import l.xdl0;
import l.y7c0;
import l.z9b0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.AbstractC1040n5;
import p006l.aab0;
import p006l.bi60;
import p006l.d1m;
import p006l.dab0;
import p006l.ef60;
import p006l.g6a;
import p006l.hab0;
import p006l.iab0;
import p006l.j5b0;
import p006l.mmd0;
import p006l.p6b0;
import p006l.q0b0;
import p006l.r0m;
import p006l.t6b0;
import p006l.u0b0;
import p006l.wx80;
import p006l.x5b0;
import p006l.xma;
import v.VImage;
import v.VScroll_Fill_BottomAligned;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001;B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\f¢\u0006\u0004\b#\u0010\u0010J\r\u0010$\u001a\u00020\f¢\u0006\u0004\b$\u0010\u0010J\u0015\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001f¢\u0006\u0004\b&\u0010\"J\u001d\u0010)\u001a\u00020\f2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u0016¢\u0006\u0004\b)\u0010\u001aJ\u0017\u0010+\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\f2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020\f2\b\u00101\u001a\u0004\u0018\u00010-¢\u0006\u0004\b2\u00100J\u0017\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u00010-¢\u0006\u0004\b4\u00100J+\u00107\u001a\u00020\f2\u001c\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\f2\b\u00109\u001a\u0004\u0018\u00010-¢\u0006\u0004\b:\u00100R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010P\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010T\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010K\u001a\u0004\bR\u0010M\"\u0004\bS\u0010OR\"\u0010X\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bU\u0010K\u001a\u0004\bV\u0010M\"\u0004\bW\u0010OR\"\u0010_\u001a\u00020Y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\"\u0010c\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b`\u0010K\u001a\u0004\ba\u0010M\"\u0004\bb\u0010OR\u0018\u0010g\u001a\u0004\u0018\u00010d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0018\u0010k\u001a\u0004\u0018\u00010h8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u001c\u0010p\u001a\b\u0012\u0004\u0012\u00020m0l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010s\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010rR\u0018\u0010v\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010uR\u0014\u0010y\u001a\u00020w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010xR\u0016\u0010%\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010rR\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010oR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010zR\u0018\u0010*\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010@R\u0018\u0010|\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u0010{R\u0018\u00103\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010{R,\u00106\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010~R\u0018\u0010\u007f\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010{R\u001b\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010\u0081\u0001R\u0017\u0010\u0083\u0001\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010rR(\u0010\u0088\u0001\u001a\u0014\u0012\u000f\u0012\r \u0086\u0001*\u0005\u0018\u00010\u0085\u00010\u0085\u00010\u0084\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0087\u0001¨\u0006\u0089\u0001"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/c;", "", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Landroid/view/View;", "view", "", "h", "(Landroid/view/View;)V", "n", "()V", "z", "o", "()Landroid/view/View;", "x", "y", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "p", "(Ljava/util/List;)V", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "A", "(Lcom/p1/mobile/putong/core/data/Privilege;)V", "", "dismissCallback", "J", "(Z)V", "K", "q", "renew", "I", "Ll/wx80;", "privilegeDescriptions", "H", "otherUser", "G", "(Ljava/lang/String;)V", "Ll/d30;", "onCloseCallback", "B", "(Ll/d30;)V", "touchOutsideListener", "F", "onKeyBackCallback", "D", "Ll/g30;", "onPaymentSuccess", "E", "(Ll/g30;)V", "dismiss", "C", "a", "Lcom/p1/mobile/android/app/Act;", "b", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "c", "Ljava/lang/String;", "Lv/VScroll_Fill_BottomAligned;", "d", "Lv/VScroll_Fill_BottomAligned;", "t", "()Lv/VScroll_Fill_BottomAligned;", "set_content", "(Lv/VScroll_Fill_BottomAligned;)V", "_content", "Landroid/widget/FrameLayout;", "e", "Landroid/widget/FrameLayout;", "v", "()Landroid/widget/FrameLayout;", "set_privilege", "(Landroid/widget/FrameLayout;)V", "_privilege", "f", "w", "set_showcase", "_showcase", "g", "u", "set_payment", "_payment", "Lv/VImage;", "Lv/VImage;", "s", "()Lv/VImage;", "set_close", "(Lv/VImage;)V", "_close", "i", "r", "set_agreements", "_agreements", "Ll/r0m;", "j", "Ll/r0m;", "privilegeComponent", "Ll/j5b0;", "k", "Ll/j5b0;", "mediator", "", "Ll/d1m;", "l", "Ljava/util/List;", "purchaseComponentsList", "m", "Z", "isDialogShow", "Ll/hab0;", "Ll/hab0;", "purchasePageTrack", "Ll/cwf0;", "Ll/cwf0;", "statisticsPageHelper", "Lcom/p1/mobile/putong/core/data/Privilege;", "Ll/d30;", "onCloseClick", "onTouchOutsideCallback", "Ll/g30;", "onDismiss", "Lcom/p1/mobile/android/app/Dialog;", "Lcom/p1/mobile/android/app/Dialog;", "dialog", "shouldDismissCallback", "Ll/e30;", "", "kotlin.jvm.PlatformType", "Ll/e30;", "dialogStateAction", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0214c {

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
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u00002\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u0016J+\u0010\u001d\u001a\u00020\u00002\u001c\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u00002\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010\u0016J\r\u0010\"\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010'\u001a\u0004\b(\u0010)R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00101\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00100R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u00102R\u0018\u00104\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u0018\u00105\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010*R\u0018\u00107\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u00106R\u0018\u00109\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00106R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00106R,\u0010\u001c\u001a\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010>\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u00106¨\u0006?"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "from", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/data/PurchaseType;Ljava/lang/String;)V", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "a", "(Lcom/p1/mobile/putong/core/data/Privilege;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "", "Ll/wx80;", "privilegeDescriptions", "g", "(Ljava/util/List;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "Ll/d30;", "onCloseCallback", "b", "(Ll/d30;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "touchOutsideListener", "f", "onKeyBackCallback", "d", "Ll/g30;", "onPaymentSuccess", "e", "(Ll/g30;)Lcom/p1/mobile/putong/core/ui/purchase/mediator/c$a;", "dismiss", "c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/c;", "h", "()Lcom/p1/mobile/putong/core/ui/purchase/mediator/c;", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "getPurchaseType", "()Lcom/p1/mobile/putong/core/data/PurchaseType;", "Ljava/lang/String;", "getFrom", "()Ljava/lang/String;", "setFrom", "(Ljava/lang/String;)V", "", "Z", "renew", "Ljava/util/List;", "Lcom/p1/mobile/putong/core/data/Privilege;", "firstPrivilege", "otherUser", "Ll/d30;", "onCloseClick", "i", "onTouchOutsideCallback", "j", "k", "Ll/g30;", "l", "onDismiss", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
        public final a m7423a(@Nullable Privilege privilege) {
            this.firstPrivilege = privilege;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final a m7424b(@Nullable d30 onCloseCallback) {
            this.onCloseClick = onCloseCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: c */
        public final a m7425c(@Nullable d30 dismiss) {
            this.onDismiss = dismiss;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: d */
        public final a m7426d(@Nullable d30 onKeyBackCallback) {
            this.onKeyBackCallback = onKeyBackCallback;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: e */
        public final a m7427e(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
            this.onPaymentSuccess = onPaymentSuccess;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: f */
        public final a m7428f(@Nullable d30 touchOutsideListener) {
            this.onTouchOutsideCallback = touchOutsideListener;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: g */
        public final a m7429g(@Nullable List<? extends wx80> privilegeDescriptions) {
            this.privilegeDescriptions = privilegeDescriptions;
            return this;
        }

        @NotNull
        /* JADX INFO: renamed from: h */
        public final C0214c m7430h() {
            C0214c c0214c = new C0214c(this.act, this.purchaseType, this.from);
            c0214c.m7406I(this.renew);
            c0214c.m7398A(this.firstPrivilege);
            if (vwb.J(this.privilegeDescriptions)) {
                this.privilegeDescriptions = fy80.n(this.purchaseType, this.firstPrivilege, this.renew);
            }
            c0214c.m7405H(this.privilegeDescriptions);
            c0214c.m7404G(this.otherUser);
            c0214c.m7399B(this.onCloseClick);
            c0214c.m7403F(this.onTouchOutsideCallback);
            c0214c.m7401D(this.onKeyBackCallback);
            c0214c.m7402E(this.onPaymentSuccess);
            c0214c.m7400C(this.onDismiss);
            c0214c.m7408K();
            return c0214c;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$b */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$b", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$e;", "", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "sections", "", "a", "(Ljava/util/List;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements AbstractC0212a.e {
        public b() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.e
        /* JADX INFO: renamed from: a */
        public void mo7331a(List<? extends com.p1.mobile.putong.core.ui.purchase.d> sections) {
            sections.getClass();
            hab0 hab0Var = C0214c.this.purchasePageTrack;
            if (hab0Var != null) {
                hab0Var.m16107C(sections);
            }
            if (C0214c.this.isDialogShow) {
                return;
            }
            C0214c.this.isDialogShow = true;
            C0214c.this.m7412p(sections);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$c */
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$c", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$d;", "Lcom/p1/mobile/putong/core/ui/purchase/d;", "section", "", "scroll", "isClick", "sectionSource", "", "a", "(Lcom/p1/mobile/putong/core/ui/purchase/d;ZZLcom/p1/mobile/putong/core/ui/purchase/d;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements AbstractC0212a.d {
        public c() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.d
        /* JADX INFO: renamed from: a */
        public void mo7332a(com.p1.mobile.putong.core.ui.purchase.d section, boolean scroll, boolean isClick, com.p1.mobile.putong.core.ui.purchase.d sectionSource) {
            hab0 hab0Var;
            section.getClass();
            if (!isClick || (hab0Var = C0214c.this.purchasePageTrack) == null) {
                return;
            }
            hab0Var.m16106B(section);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$d */
    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$d", "Lcom/p1/mobile/putong/core/ui/purchase/mediator/a$b;", "Ll/ef60;", "paymentHandlerData", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "", "a", "(Ll/ef60;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements AbstractC0212a.b {
        public d() {
        }

        @Override // com.p000p1.mobile.putong.core.p004ui.purchase.mediator.AbstractC0212a.b
        /* JADX INFO: renamed from: a */
        public void mo7333a(ef60 paymentHandlerData, PurchaseType purchaseType) {
            bi60 paymentTextResponseData;
            hab0 hab0Var;
            paymentHandlerData.getClass();
            purchaseType.getClass();
            Integer paymentTrackSource = paymentHandlerData.getPaymentTrackSource();
            if ((paymentTrackSource != null && paymentTrackSource.intValue() == 4) || (paymentTrackSource != null && paymentTrackSource.intValue() == 3)) {
                hab0 hab0Var2 = C0214c.this.purchasePageTrack;
                if (hab0Var2 != null) {
                    hab0Var2.m16127s(paymentHandlerData, purchaseType);
                    return;
                }
                return;
            }
            if (paymentTrackSource != null && paymentTrackSource.intValue() == 2) {
                hab0 hab0Var3 = C0214c.this.purchasePageTrack;
                if (hab0Var3 != null) {
                    hab0.m16104u(hab0Var3, paymentHandlerData, purchaseType, false, 4, null);
                    return;
                }
                return;
            }
            hab0 hab0Var4 = C0214c.this.purchasePageTrack;
            if (hab0Var4 != null) {
                hab0Var4.m16131x(paymentHandlerData, purchaseType);
            }
            if (!g6a.m15597t() || (paymentTextResponseData = paymentHandlerData.getPaymentTextResponseData()) == null || !paymentTextResponseData.getNeedTrackSticker() || (hab0Var = C0214c.this.purchasePageTrack) == null) {
                return;
            }
            hab0Var.m16132y(paymentHandlerData, purchaseType);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.mediator.c$e */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/p1/mobile/putong/core/ui/purchase/mediator/c$e", "Ll/er2;", "", "pageId", "()Ljava/lang/String;", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends er2 {
        public String pageId() {
            return "p_purchase_page";
        }
    }

    public C0214c(@NotNull Act act, @NotNull PurchaseType purchaseType, @Nullable String str) {
        act.getClass();
        purchaseType.getClass();
        this.act = act;
        this.purchaseType = purchaseType;
        this.from = str;
        this.purchaseComponentsList = new ArrayList();
        this.statisticsPageHelper = new cwf0(new e());
        this.shouldDismissCallback = true;
        this.dialogStateAction = new e30() { // from class: l.w9b0
            public final void call(Object obj) {
                C0214c.m7388c(this.f25050a, ((Integer) obj).intValue());
            }
        };
    }

    /* JADX INFO: renamed from: a */
    public static void m7386a(C0214c c0214c, View view) {
        c0214c.dialogStateAction.call(0);
        d30 d30Var = c0214c.onCloseClick;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m7387b(C0214c c0214c, DialogInterface dialogInterface) {
        c0214c.m7422z();
    }

    /* JADX INFO: renamed from: c */
    public static void m7388c(C0214c c0214c, int i) {
        if (NullChecker.a(c0214c.dialog)) {
            if (i == -1) {
                Dialog dialog = c0214c.dialog;
                if (dialog != null) {
                    dialog.hide();
                    return;
                }
                return;
            }
            if (i != 0) {
                if (i == 1) {
                    Dialog dialog2 = c0214c.dialog;
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
                c0214c.m7407J(false);
            }
            Dialog dialog3 = c0214c.dialog;
            if (dialog3 != null) {
                dialog3.dismiss();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m7389d(C0214c c0214c, DialogInterface dialogInterface) {
        d30 d30Var;
        CoreModule.m1854P().m11706a().m5245E9();
        c0214c.m7422z();
        if (c0214c.isDialogShow) {
            i0e.e(c0214c.statisticsPageHelper);
        }
        if (!c0214c.shouldDismissCallback || (d30Var = c0214c.onDismiss) == null) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: e */
    public static Boolean m7390e(com.p1.mobile.putong.core.ui.purchase.d dVar) {
        return Boolean.valueOf(dVar.j());
    }

    /* JADX INFO: renamed from: f */
    public static void m7391f(C0214c c0214c, Dialog dialog) {
        c0214c.dialogStateAction.call(0);
        d30 d30Var = c0214c.onTouchOutsideCallback;
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7392g(C0214c c0214c, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        keyEvent.getClass();
        if (keyEvent.getAction() == 0 && i == 4) {
            c0214c.dialogStateAction.call(0);
            d30 d30Var = c0214c.onKeyBackCallback;
            if (d30Var != null) {
                d30Var.call();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: A */
    public final void m7398A(Privilege firstPrivilege) {
        this.firstPrivilege = firstPrivilege;
    }

    /* JADX INFO: renamed from: B */
    public final void m7399B(@Nullable d30 onCloseCallback) {
        this.onCloseClick = onCloseCallback;
    }

    /* JADX INFO: renamed from: C */
    public final void m7400C(@Nullable d30 dismiss) {
        this.onDismiss = dismiss;
    }

    /* JADX INFO: renamed from: D */
    public final void m7401D(@Nullable d30 onKeyBackCallback) {
        this.onKeyBackCallback = onKeyBackCallback;
    }

    /* JADX INFO: renamed from: E */
    public final void m7402E(@Nullable g30<PurchaseType, Act, String> onPaymentSuccess) {
        this.onPaymentSuccess = onPaymentSuccess;
    }

    /* JADX INFO: renamed from: F */
    public final void m7403F(@Nullable d30 touchOutsideListener) {
        this.onTouchOutsideCallback = touchOutsideListener;
    }

    /* JADX INFO: renamed from: G */
    public final void m7404G(@Nullable String otherUser) {
        this.otherUser = otherUser;
    }

    /* JADX INFO: renamed from: H */
    public final void m7405H(@Nullable List<? extends wx80> privilegeDescriptions) {
        this.privilegeDescriptions = privilegeDescriptions;
    }

    /* JADX INFO: renamed from: I */
    public final void m7406I(boolean renew) {
        this.renew = renew;
    }

    /* JADX INFO: renamed from: J */
    public final void m7407J(boolean dismissCallback) {
        this.shouldDismissCallback = dismissCallback;
    }

    /* JADX INFO: renamed from: K */
    public final void m7408K() {
        if (this.act.isFinishing()) {
            return;
        }
        ProductCategory productCategory = this.purchaseType.productCategory();
        productCategory.getClass();
        this.purchasePageTrack = new x5b0(productCategory, PurchaseTrackPageType.pop_one, this.from);
        j5b0 j5b0Var = new j5b0(this.act, this.purchaseType, this.from);
        this.mediator = j5b0Var;
        j5b0Var.m7353P(this.purchasePageTrack);
        m7410n();
        m7420x();
    }

    /* JADX INFO: renamed from: h */
    public final void m7409h(View view) {
        z9b0.a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public final void m7410n() {
        Dialog dialogZ = this.act.dialog().P(m7411o(), false).L(y7c0.i).v().A(new DialogInterface.OnCancelListener() { // from class: l.s9b0
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C0214c.m7387b(this.f21157a, dialogInterface);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.t9b0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                C0214c.m7389d(this.f21968a, dialogInterface);
            }
        }).i0(new DialogInterface.OnKeyListener() { // from class: l.u9b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return C0214c.m7392g(this.f23440a, dialogInterface, i, keyEvent);
            }
        }).K0(new Dialog.i() { // from class: l.v9b0
            /* JADX INFO: renamed from: a */
            public final void m25771a(Dialog dialog) {
                C0214c.m7391f(this.f24225a, dialog);
            }
        }).y0(s4e.a).z();
        this.dialog = dialogZ;
        if (dialogZ != null) {
            dialogZ.show();
        }
        hab0 hab0Var = this.purchasePageTrack;
        if (hab0Var != null) {
            ProductCategory productCategory = this.purchaseType.productCategory();
            productCategory.getClass();
            hab0Var.m16129v(productCategory);
        }
    }

    /* JADX INFO: renamed from: o */
    public final View m7411o() {
        int i;
        View viewInflate = o7r.a(this.act).inflate(m6c0.I1, (ViewGroup) null);
        viewInflate.getClass();
        m7409h(viewInflate);
        if (sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) {
            i = d3c0.m4;
        } else if (sab0.e(this.purchaseType) || sab0.c(this.purchaseType)) {
            i = d3c0.J;
        } else if (sab0.o(this.purchaseType)) {
            i = d3c0.P5;
        } else if (sab0.g(this.purchaseType)) {
            i = d3c0.W7;
        } else {
            i = sab0.x(this.purchaseType) ? d3c0.X7 : d3c0.J9;
        }
        m7416t().setBackgroundResource(i);
        m7415s().setImageResource((sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) ? d3c0.Va : d3c0.Ua);
        xdl0.M(m7415s(), true);
        xdl0.E0(m7415s(), new View.OnClickListener() { // from class: l.x9b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0214c.m7386a(this.f27397a, view);
            }
        });
        return viewInflate;
    }

    /* JADX INFO: renamed from: p */
    public final void m7412p(List<? extends com.p1.mobile.putong.core.ui.purchase.d> sections) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("purchaseShowFrom", w2b0.b(this.from));
            ProductCategory productCategory = this.purchaseType.productCategory();
            jSONObject.put("productType", productCategory.name());
            jSONObject.put("skuGroup", vwb.U(iab0.m16583j(sections), ","));
            jSONObject.put("default_product", productCategory.toString());
            jSONObject.put("default_duration", p2b0.h().p(productCategory));
            boolean zA = NullChecker.a(vwb.r(sections, new w9j() { // from class: l.y9b0
                public final Object call(Object obj) {
                    return C0214c.m7390e((d) obj);
                }
            }));
            String str = "no";
            jSONObject.put("if_sale", zA ? "yes" : "no");
            jSONObject.put("if_discount", zA);
            boolean z = false;
            jSONObject.put("if_double_tab", false);
            jSONObject.put("function_type", iab0.m16579f(this.firstPrivilege, this.from));
            jSONObject.put("tooltips_trigger_mode", "active");
            jSONObject.put("tooltips_type_ui", "alert_self_definition_business_a");
            jSONObject.put("tooltips_trigger_module", "purchase_button");
            jSONObject.put("tooltips_trigger_page", "anywhere");
            jSONObject.put("tooltips_type", "alert");
            jSONObject.put("tooltips_trigger_reason", "purchase");
            if (CoreModule.m1854P().m11706a().m5362U() && CoreModule.f1534c.f3580O0.m2016w3()) {
                str = "yes";
            }
            jSONObject.put("no_secret_payment", str);
            jSONObject.put("user_secret_staus", str);
            if (CoreModule.m1854P().m11713i().m19779N()) {
                if (CoreModule.f1534c.f3628e0.m21427Z7() && !CoreModule.f1534c.f3628e0.m21415W7() && !CoreModule.f1534c.f3628e0.m21469k8()) {
                    z = true;
                }
                jSONObject.put("is_fakeunreal", z);
            }
        } catch (JSONException e2) {
            CrashHelper.c(e2);
        }
        this.statisticsPageHelper.o(jSONObject);
        i0e.f(this.statisticsPageHelper);
    }

    /* JADX INFO: renamed from: q */
    public final void m7413q() {
        Dialog dialog = this.dialog;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public final FrameLayout m7414r() {
        FrameLayout frameLayout = this._agreements;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_agreements");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final VImage m7415s() {
        VImage vImage = this._close;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_close");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: t */
    public final VScroll_Fill_BottomAligned m7416t() {
        VScroll_Fill_BottomAligned vScroll_Fill_BottomAligned = this._content;
        if (vScroll_Fill_BottomAligned != null) {
            return vScroll_Fill_BottomAligned;
        }
        Intrinsics.r("_content");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final FrameLayout m7417u() {
        FrameLayout frameLayout = this._payment;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_payment");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final FrameLayout m7418v() {
        FrameLayout frameLayout = this._privilege;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final FrameLayout m7419w() {
        FrameLayout frameLayout = this._showcase;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_showcase");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m7420x() {
        r0m r0mVarB = l2b0.b(this.act, this.purchaseType, this.from, false, true);
        this.privilegeComponent = r0mVarB;
        View viewMo19384a = r0mVarB != null ? r0mVarB.mo19384a(m7418v(), false) : null;
        r0m r0mVar = this.privilegeComponent;
        if (r0mVar != 0) {
            r0mVar.mo19386c(this.privilegeDescriptions);
        }
        m7418v().addView(viewMo19384a, new LinearLayout.LayoutParams(-1, -2));
        r0m r0mVar2 = this.privilegeComponent;
        mmd0 mmd0Var = r0mVar2 instanceof mmd0 ? (mmd0) r0mVar2 : null;
        if (mmd0Var != null) {
            mmd0Var.m19388g();
        }
        if (sab0.i(this.purchaseType) || sab0.p(this.purchaseType) || sab0.j(this.purchaseType)) {
            ViewGroup.LayoutParams layoutParams = m7419w().getLayoutParams();
            layoutParams.getClass();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            int iC = svq.c(1);
            layoutParams2.leftMargin = iC;
            layoutParams2.rightMargin = iC;
            m7419w().setLayoutParams(layoutParams2);
        }
        d1m dab0Var = p2b0.h().z() ? new dab0(this.act, this.purchaseType, this.from, this.mediator) : new aab0(this.act, this.purchaseType, this.from, this.mediator);
        m7419w().addView(dab0Var.mo11783a(m7419w()));
        dab0Var.register();
        this.purchaseComponentsList.add(dab0Var);
        AbstractC1040n5 p6b0Var = (sab0.e(this.purchaseType) || !(!sab0.c(this.purchaseType) || CoreModule.f1543l.m11711g().m7015v9() || xma.m27355L3())) ? new p6b0(this.act, this.purchaseType, this.from, this.mediator) : new t6b0(this.act, this.purchaseType, this.from, this.mediator);
        m7417u().addView(p6b0Var.mo11783a(m7417u()));
        p6b0Var.m19668Q(this.onPaymentSuccess);
        p6b0Var.m19667P(this.firstPrivilege);
        p6b0Var.m19666O(this.dialogStateAction);
        p6b0Var.register();
        this.purchaseComponentsList.add(p6b0Var);
        if (sab0.d(this.purchaseType)) {
            xdl0.M(m7414r(), true);
            boolean z = p2b0.h().z();
            Act act = this.act;
            d1m u0b0Var = z ? new u0b0(act, this.purchaseType, this.from, this.mediator) : new q0b0(act, this.purchaseType, this.from, this.mediator);
            m7414r().addView(u0b0Var.mo11783a(m7414r()));
            u0b0Var.register();
            this.purchaseComponentsList.add(u0b0Var);
        }
        m7421y();
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.mo7375w();
        }
        Iterator<d1m> it = this.purchaseComponentsList.iterator();
        while (it.hasNext()) {
            it.next().mo12554b();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m7421y() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m7347J(new b());
            j5b0Var.m7346I(new c());
            j5b0Var.m7344G(new d());
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m7422z() {
        j5b0 j5b0Var = this.mediator;
        if (j5b0Var != null) {
            j5b0Var.m7348K();
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
