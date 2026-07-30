package com.p000p1.mobile.putong.core.p004ui.purchase.page;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p000p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.ExplodeLayout;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.QuickChatPrivilegeAnimView;
import com.p000p1.mobile.putong.core.p004ui.purchase.privilege.SvipDlgSeeAnimLayout;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import l.b1c0;
import l.eqh0;
import l.g8b0;
import l.i0g0;
import l.imr;
import l.j760;
import l.m6c0;
import l.n3b0;
import l.o7r;
import l.sab0;
import l.t100;
import l.vwb;
import l.zz6;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.c8e0;
import p006l.g6a;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "d", "(Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "c", "()Ljava/lang/CharSequence;", "Landroid/widget/FrameLayout;", "get_container", "()Landroid/widget/FrameLayout;", "set_container", "(Landroid/widget/FrameLayout;)V", "_container", "Lv/VText;", "Lv/VText;", "get_description", "()Lv/VText;", "set_description", "(Lv/VText;)V", "_description", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PurchasePrivilegeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _description;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeView$a */
    @Metadata(k = CameraSticker.STATE_COMPLETE, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C0225a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4762a;

        static {
            int[] iArr = new int[Privilege.values().length];
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Privilege.svip_badge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Privilege.vip_super_like.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Privilege.youth_superlike.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Privilege.vip_independent_super_like.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Privilege.see_who_likes_me.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Privilege.online_match_tickets.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Privilege.voice_quick_chat.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Privilege.say_hi_pkg.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Privilege.customer_service.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Privilege.oDiamondGreetings.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Privilege.oDiamondSvipSkin.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Privilege.visitor_hide_footprint.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Privilege.immediately_match.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Privilege.hide_me_from_nearby.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Privilege.vip_location.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Privilege.greet.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Privilege.liked_user.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Privilege.boost.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Privilege.advanced_filter.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Privilege.message_read_state.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Privilege.privacy_membership.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Privilege.recover_unmatches.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Privilege.leave_message.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Privilege.moment_boost.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Privilege.oDiamondVisitor.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[Privilege.live_entry_animation.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[Privilege.picksMembership.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[Privilege.nearby_people.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[Privilege.block_harassing_words.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[Privilege.ads_not_disturb.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[Privilege.unlock_learn_about_him_module.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[Privilege.pick_tantan_credits_users.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[Privilege.youth_roaming.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[Privilege.youth_find_partner.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[Privilege.youth_blind_box.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[Privilege.youth_message_read.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            f4762a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public PurchasePrivilegeView(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m7536a(View view) {
        g8b0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v30, types: [android.view.View, com.p1.mobile.putong.core.ui.purchase.privilege.SvipDlgSeeAnimLayout] */
    /* JADX WARN: Type inference failed for: r5v32, types: [android.view.View, com.p1.mobile.putong.core.ui.purchase.privilege.QuickChatPrivilegeAnimView] */
    /* JADX WARN: Type inference failed for: r5v40, types: [android.view.View, com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeVoiceView] */
    /* JADX INFO: renamed from: b */
    public final void m7537b(@NotNull PurchaseType purchaseType, @Nullable Privilege privilege) {
        purchaseType.getClass();
        m7539d(privilege, purchaseType);
        switch (privilege == null ? -1 : C0225a.f4762a[privilege.ordinal()]) {
            case 1:
            case 2:
                View viewInflate = o7r.a(getContext()).inflate(m6c0.n1, (ViewGroup) get_container(), false);
                viewInflate.getClass();
                PurchasePrivilegeBadgeView purchasePrivilegeBadgeView = (PurchasePrivilegeBadgeView) viewInflate;
                purchasePrivilegeBadgeView.m7514b(privilege);
                get_container().addView(purchasePrivilegeBadgeView);
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                View viewInflate2 = o7r.a(getContext()).inflate(m6c0.w1, (ViewGroup) get_container(), false);
                viewInflate2.getClass();
                PurchasePrivilegeUndoView purchasePrivilegeUndoView = (PurchasePrivilegeUndoView) viewInflate2;
                purchasePrivilegeUndoView.m7535b();
                get_container().addView(purchasePrivilegeUndoView);
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
            case 5:
            case 6:
                if (g6a.m15585h() && sab0.w(purchaseType)) {
                    View viewInflate3 = o7r.a(getContext()).inflate(m6c0.r1, (ViewGroup) get_container(), false);
                    viewInflate3.getClass();
                    PurchasePrivilegeImageContainerView purchasePrivilegeImageContainerView = (PurchasePrivilegeImageContainerView) viewInflate3;
                    purchasePrivilegeImageContainerView.m7524d(purchaseType, privilege);
                    get_container().addView(purchasePrivilegeImageContainerView);
                } else if (!sab0.i(purchaseType)) {
                    View viewInflate4 = o7r.a(getContext()).inflate(m6c0.u1, (ViewGroup) get_container(), false);
                    viewInflate4.getClass();
                    PurchasePrivilegeSuperLikeView purchasePrivilegeSuperLikeView = (PurchasePrivilegeSuperLikeView) viewInflate4;
                    purchasePrivilegeSuperLikeView.m7533b();
                    get_container().addView(purchasePrivilegeSuperLikeView);
                } else {
                    View viewInflate5 = o7r.a(getContext()).inflate(m6c0.o1, (ViewGroup) get_container(), false);
                    viewInflate5.getClass();
                    PurchasePrivilegeCommonStyleView purchasePrivilegeCommonStyleView = (PurchasePrivilegeCommonStyleView) viewInflate5;
                    purchasePrivilegeCommonStyleView.m7516b(privilege);
                    get_container().addView(purchasePrivilegeCommonStyleView);
                }
                break;
            case 7:
                if (g6a.m15585h() && sab0.q(purchaseType)) {
                    View viewInflate6 = o7r.a(getContext()).inflate(m6c0.v1, (ViewGroup) get_container(), false);
                    viewInflate6.getClass();
                    PurchasePrivilegeSVGAContainerView purchasePrivilegeSVGAContainerView = (PurchasePrivilegeSVGAContainerView) viewInflate6;
                    purchasePrivilegeSVGAContainerView.m7529c(purchaseType, privilege);
                    get_container().addView(purchasePrivilegeSVGAContainerView);
                } else if (CoreModule.m1854P().m11706a().m5372W9() && NullChecker.a(n3b0.f())) {
                    Object objInflate = o7r.a(getContext()).inflate(m6c0.X2, (ViewGroup) get_container(), false);
                    objInflate.getClass();
                    ?? r5 = (SvipDlgSeeAnimLayout) objInflate;
                    r5.setScaleX(0.75f);
                    r5.setScaleY(0.75f);
                    r5.m7655d(n3b0.f());
                    r5.m7658l0();
                    get_container().addView(r5);
                    m7538c();
                } else {
                    View viewInflate7 = o7r.a(getContext()).inflate(m6c0.L2, (ViewGroup) get_container(), false);
                    viewInflate7.getClass();
                    ExplodeLayout explodeLayout = (ExplodeLayout) viewInflate7;
                    explodeLayout.setScale(0.55f);
                    get_container().addView(explodeLayout);
                    explodeLayout.m7562k();
                }
                break;
            case 8:
                if (g6a.m15585h() && sab0.q(purchaseType)) {
                    View viewInflate8 = o7r.a(getContext()).inflate(m6c0.r1, (ViewGroup) get_container(), false);
                    viewInflate8.getClass();
                    PurchasePrivilegeImageContainerView purchasePrivilegeImageContainerView2 = (PurchasePrivilegeImageContainerView) viewInflate8;
                    purchasePrivilegeImageContainerView2.m7523c(purchaseType, privilege);
                    get_container().addView(purchasePrivilegeImageContainerView2);
                } else if (!sab0.i(purchaseType)) {
                    ?? quickChatPrivilegeAnimView = new QuickChatPrivilegeAnimView(getContext());
                    quickChatPrivilegeAnimView.setScaleX(0.75f);
                    quickChatPrivilegeAnimView.setScaleY(0.75f);
                    get_container().addView(quickChatPrivilegeAnimView);
                    quickChatPrivilegeAnimView.m7644t0();
                } else {
                    View viewInflate9 = o7r.a(getContext()).inflate(m6c0.o1, (ViewGroup) get_container(), false);
                    viewInflate9.getClass();
                    PurchasePrivilegeCommonStyleView purchasePrivilegeCommonStyleView2 = (PurchasePrivilegeCommonStyleView) viewInflate9;
                    purchasePrivilegeCommonStyleView2.m7516b(privilege);
                    get_container().addView(purchasePrivilegeCommonStyleView2);
                }
                break;
            case 9:
                Object objInflate2 = o7r.a(getContext()).inflate(m6c0.A1, (ViewGroup) get_container(), false);
                objInflate2.getClass();
                ?? r6 = (PurchasePrivilegeVoiceView) objInflate2;
                get_container().addView(r6);
                r6.m7545k0();
                break;
            case 10:
                View viewInflate10 = LayoutInflater.from(getContext()).inflate(m6c0.t1, (ViewGroup) get_container(), false);
                viewInflate10.getClass();
                PurchasePrivilegeSayHiView purchasePrivilegeSayHiView = (PurchasePrivilegeSayHiView) viewInflate10;
                purchasePrivilegeSayHiView.m7531b();
                get_container().addView(purchasePrivilegeSayHiView);
                break;
            case 11:
                View viewInflate11 = o7r.a(getContext()).inflate(m6c0.p1, (ViewGroup) get_container(), false);
                viewInflate11.getClass();
                PurchasePrivilegeCustomService purchasePrivilegeCustomService = (PurchasePrivilegeCustomService) viewInflate11;
                purchasePrivilegeCustomService.m7518b();
                get_container().addView(purchasePrivilegeCustomService);
                break;
            case 12:
                View viewInflate12 = o7r.a(getContext()).inflate(m6c0.o1, (ViewGroup) get_container(), false);
                viewInflate12.getClass();
                PurchasePrivilegeCommonStyleView purchasePrivilegeCommonStyleView3 = (PurchasePrivilegeCommonStyleView) viewInflate12;
                purchasePrivilegeCommonStyleView3.m7516b(privilege);
                get_container().addView(purchasePrivilegeCommonStyleView3);
                break;
            case 13:
                View viewInflate13 = o7r.a(getContext()).inflate(m6c0.s1, (ViewGroup) get_container(), false);
                viewInflate13.getClass();
                PurchasePrivilegeOdiamondSkinView purchasePrivilegeOdiamondSkinView = (PurchasePrivilegeOdiamondSkinView) viewInflate13;
                purchasePrivilegeOdiamondSkinView.m7526b();
                get_container().addView(purchasePrivilegeOdiamondSkinView);
                break;
            case 14:
                View viewInflate14 = o7r.a(getContext()).inflate(m6c0.y1, (ViewGroup) get_container(), false);
                viewInflate14.getClass();
                PurchasePrivilegeVisitorHideFootPrintView purchasePrivilegeVisitorHideFootPrintView = (PurchasePrivilegeVisitorHideFootPrintView) viewInflate14;
                purchasePrivilegeVisitorHideFootPrintView.m7541b();
                get_container().addView(purchasePrivilegeVisitorHideFootPrintView);
                break;
            case 15:
                if (g6a.m15585h() && sab0.i(purchaseType)) {
                    View viewInflate15 = o7r.a(getContext()).inflate(m6c0.v1, (ViewGroup) get_container(), false);
                    viewInflate15.getClass();
                    PurchasePrivilegeSVGAContainerView purchasePrivilegeSVGAContainerView2 = (PurchasePrivilegeSVGAContainerView) viewInflate15;
                    purchasePrivilegeSVGAContainerView2.m7528b(purchaseType, privilege);
                    get_container().addView(purchasePrivilegeSVGAContainerView2);
                } else {
                    View viewInflate16 = o7r.a(getContext()).inflate(m6c0.r1, (ViewGroup) get_container(), false);
                    viewInflate16.getClass();
                    PurchasePrivilegeImageContainerView purchasePrivilegeImageContainerView3 = (PurchasePrivilegeImageContainerView) viewInflate16;
                    purchasePrivilegeImageContainerView3.m7522b(purchaseType, privilege);
                    get_container().addView(purchasePrivilegeImageContainerView3);
                }
                break;
            case 16:
                View viewInflate17 = o7r.a(getContext()).inflate(m6c0.q1, (ViewGroup) get_container(), false);
                viewInflate17.getClass();
                PurchasePrivilegeHideMeFromNearbyView purchasePrivilegeHideMeFromNearbyView = (PurchasePrivilegeHideMeFromNearbyView) viewInflate17;
                purchasePrivilegeHideMeFromNearbyView.m7520b();
                get_container().addView(purchasePrivilegeHideMeFromNearbyView);
                break;
            default:
                View viewInflate18 = o7r.a(getContext()).inflate(m6c0.r1, (ViewGroup) get_container(), false);
                viewInflate18.getClass();
                PurchasePrivilegeImageContainerView purchasePrivilegeImageContainerView4 = (PurchasePrivilegeImageContainerView) viewInflate18;
                purchasePrivilegeImageContainerView4.m7522b(purchaseType, privilege);
                get_container().addView(purchasePrivilegeImageContainerView4);
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m7538c() {
        Object obj;
        User userF = n3b0.f();
        if (!NullChecker.a(userF)) {
            CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
            return c8e0.m13312e(c0145aM2399r5 != null ? c0145aM2399r5.f3259b : 0);
        }
        Context context = getContext();
        int i = R.string.l7;
        userF.getClass();
        if (userF.age.intValue() > 30) {
            obj = "30+";
        } else {
            obj = userF.age;
            obj.getClass();
        }
        String string = context.getString(i, obj);
        string.getClass();
        j760<String, String> j760VarM5494oi = CoreModule.m1854P().m11706a().m5494oi(userF.location.distance);
        Object obj2 = j760VarM5494oi.a;
        Object obj3 = j760VarM5494oi.b;
        StringBuilder sb = new StringBuilder();
        sb.append(obj2);
        sb.append(obj3);
        String string2 = sb.toString();
        String string3 = getContext().getString(userF.isFemale() ? R.string.r7 : R.string.q7, string, string2);
        string3.getClass();
        SpannableString spannableString = new SpannableString(string3);
        CoreModule.m1854P().m11706a().m5301Lp(spannableString, string3, string, String.valueOf(userF.age.intValue()).length(), t100.f(13), t100.f(13), Color.parseColor("#ffe8aa"));
        CoreBusinessService coreBusinessServiceM11706a = CoreModule.m1854P().m11706a();
        String str = (String) j760VarM5494oi.a;
        coreBusinessServiceM11706a.m5301Lp(spannableString, string3, string2, str != null ? str.length() : 0, t100.f(13), t100.f(13), Color.parseColor("#ffe8aa"));
        return spannableString;
    }

    /* JADX INFO: renamed from: d */
    public final void m7539d(Privilege privilege, PurchaseType purchaseType) {
        Pair pairCreate;
        boolean zU0;
        boolean zU1;
        switch (privilege == null ? -1 : C0225a.f4762a[privilege.ordinal()]) {
            case 1:
                pairCreate = Pair.create("VIP会员专属标识，彰显你的\n会员身份", new ArrayList());
                break;
            case 2:
                pairCreate = Pair.create("尊享SVIP身份标识，突出尊贵身份，\n帮你提升2.5倍配对成功率", CollectionsKt.arrayListOf(new String[]{"2.5倍"}));
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                String str = zz6.u0() ? "他" : "她";
                pairCreate = !CoreModule.m1854P().m11706a().m5370Vf() ? Pair.create("手滑了？你可以撤回上一张卡片，\n找回错过的".concat(str), CollectionsKt.arrayListOf(new String[]{"撤回上一张"})) : Pair.create("手滑啦？使用反悔特权，重新喜欢" + str + "！", CollectionsKt.arrayListOf(new String[]{"反悔特权"}));
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
            case 6:
                if (!sab0.i(purchaseType)) {
                    if (NullChecker.a(n3b0.j())) {
                        User userJ = n3b0.j();
                        zU0 = Intrinsics.d(userJ != null ? userJ.gender : null, Gender.get("male"));
                    } else {
                        zU0 = zz6.u0();
                    }
                    pairCreate = Pair.create("超级喜欢" + (zU0 ? "他" : "她") + "？使用后让你的\n喜欢脱颖而出！", CollectionsKt.arrayListOf(new String[]{"脱颖而出"}));
                } else {
                    pairCreate = Pair.create("无限次超级喜欢，使用后让你的\n喜欢脱颖而出！", CollectionsKt.arrayListOf(new String[]{"无限次", "脱颖而出"}));
                }
                break;
            case 5:
                pairCreate = Pair.create("超级喜欢他？使用后让你的\n喜欢脱颖而出", CollectionsKt.arrayListOf(new String[]{"脱颖而出"}));
                break;
            case 7:
                if (CoreModule.m1854P().m11706a().m5372W9() && NullChecker.a(n3b0.f())) {
                    CharSequence charSequenceM7538c = m7538c();
                    pairCreate = Pair.create(charSequenceM7538c != null ? charSequenceM7538c : "", new ArrayList());
                } else {
                    CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
                    User userM2411v5 = CoreModule.f1534c.f3676u0.m2411v5();
                    pairCreate = Pair.create(CoreModule.m1854P().m11706a().m5545vb(userM2411v5, c0145aM2399r5) ? CoreModule.m1854P().m11706a().m5567yl(userM2411v5) : c8e0.m13312e(c0145aM2399r5 != null ? c0145aM2399r5.f3259b : 0), new ArrayList());
                }
                break;
            case 8:
                pairCreate = !sab0.i(purchaseType) ? Pair.create("每天3次匹配附近在线用户\n立即开聊！", CollectionsKt.arrayListOf(new String[]{"立即开聊"})) : Pair.create("无限次闪聊机会，无需配对\n立即开聊！", CollectionsKt.arrayListOf(new String[]{"立即开聊"}));
                break;
            case 9:
                pairCreate = Pair.create("每天1次语音连线，立即与\n附近在线的用户畅聊！", CollectionsKt.arrayListOf(new String[]{"立即", "附近在线"}));
                break;
            case 10:
                pairCreate = Pair.create("主动打招呼，表达你的心意，获取\n" + (zz6.u0() ? "他" : "她") + "的关注", CollectionsKt.arrayListOf(new String[]{"主动"}));
                break;
            case 11:
                pairCreate = Pair.create("一对一专属客服，为你的\n体验保驾护航", CollectionsKt.arrayListOf(new String[]{"一对一"}));
                break;
            case 12:
                pairCreate = Pair.create("主动打招呼，表达你的心意，获取\n" + (zz6.u0() ? "他" : "她") + "的关注", CollectionsKt.arrayListOf(new String[]{""}));
                break;
            case 13:
                pairCreate = Pair.create("解锁黑金专属皮肤，随时\n彰显与众不同", CollectionsKt.arrayListOf(new String[]{""}));
                break;
            case 14:
                int iM6913Xm = CoreModule.m1854P().m11709e().m6913Xm();
                pairCreate = Pair.create("每月" + iM6913Xm + "次机会，开启后访问其他人，\n对方将不会看到你的访问记录", CollectionsKt.arrayListOf(new String[]{iM6913Xm + "次"}));
                break;
            case 15:
                pairCreate = Pair.create("一键开聊，无需等待，每天3次\n开挂体验！", CollectionsKt.arrayListOf(new String[]{"无需等待"}));
                break;
            case 16:
                pairCreate = Pair.create("不让距离太近的人看到我，随时\n保护隐私", CollectionsKt.arrayListOf(new String[]{"保护隐私"}));
                break;
            case 17:
                if (NullChecker.a(n3b0.n())) {
                    User userN = n3b0.n();
                    zU1 = Intrinsics.d(userN != null ? userN.gender : null, Gender.get("male"));
                } else {
                    zU1 = zz6.u0();
                }
                pairCreate = Pair.create("尽情右滑、突破右滑上限、不错过\n任何你喜欢的".concat(zU1 ? "他" : "她"), CollectionsKt.arrayListOf(new String[]{"突破右滑上限"}));
                break;
            case 18:
                pairCreate = Pair.create("任意切换定位，与各地\n好友畅聊", CollectionsKt.arrayListOf(new String[]{"任意切换"}));
                break;
            case 19:
                pairCreate = Pair.create("每天2个专属免费礼物，给" + (zz6.u0() ? "他" : "她") + "\n一份小惊喜！", CollectionsKt.arrayListOf(new String[]{"专属"}));
                break;
            case 20:
                pairCreate = Pair.create("发送超级喜欢或使用一键配对，再次\n打动你喜欢的人！", new ArrayList());
                break;
            case 21:
                pairCreate = !sab0.i(purchaseType) ? Pair.create("30分钟内让你在所处地区中\n成为最热门的人", CollectionsKt.arrayListOf(new String[]{"最热门"})) : Pair.create("全天让你在所处的地区中，成为\n成为最热门的人", CollectionsKt.arrayListOf(new String[]{"全天"}));
                break;
            case 22:
                pairCreate = Pair.create("通过偏好设置，为你推荐符合\n条件的用户", CollectionsKt.arrayListOf(new String[]{""}));
                break;
            case 23:
                pairCreate = Pair.create("第一时间知道你的消息\n对方是否已读", CollectionsKt.arrayListOf(new String[]{"第一时间"}));
                break;
            case 24:
                if (!sab0.g(purchaseType)) {
                    pairCreate = !CoreModule.m1854P().m11713i().m19779N() ? Pair.create("选择是否展示你的位置、年龄、\n活跃时间等隐私信息", CollectionsKt.arrayListOf(new String[]{"位置、年龄、\n活跃时间"})) : Pair.create("只让你右滑的人看到你\n还可隐藏年龄、位置等信息", CollectionsKt.arrayListOf(new String[]{"隐藏年龄、位置"}));
                } else {
                    pairCreate = Pair.create("一键开启冻结活跃时间\n和隐藏距离位置功能", CollectionsKt.arrayListOf(new String[]{"冻结活跃时间", "隐藏距离位置"}));
                }
                break;
            case 25:
                pairCreate = Pair.create("找回你解除的配对\n恢复和" + (zz6.u0() ? "他" : "她") + "的聊天", CollectionsKt.arrayListOf(new String[]{"恢复"}));
                break;
            case 26:
                pairCreate = Pair.create("让" + (zz6.u0() ? "他" : "她") + "第一时间看到你，配对\n几率提升3倍", CollectionsKt.arrayListOf(new String[]{""}));
                break;
            case 27:
                pairCreate = !sab0.i(purchaseType) ? Pair.create("动态智能精准投放，收获\n大量浏览互动", CollectionsKt.arrayListOf(new String[]{""})) : Pair.create("发布动态全程开启超级曝光，收获\n大量点赞互动", CollectionsKt.arrayListOf(new String[]{""}));
                break;
            case 28:
                pairCreate = Pair.create("解密谁看过我，不错过任何\n一个默默关心我的人", CollectionsKt.arrayListOf(new String[]{"不错过"}));
                break;
            case 29:
                pairCreate = Pair.create("专属徽章和入场特效，成为全场\n最闪亮的星", CollectionsKt.arrayListOf(new String[]{"专属"}));
                break;
            case 30:
                pairCreate = Pair.create("每日触达16位平台优质认证用户，\n尊享高质量交友体验", CollectionsKt.arrayListOf(new String[]{"优质认证"}));
                break;
            case 31:
                pairCreate = Pair.create("根据您的地理位置，为您精确搜索\n附近3公里内的用户", CollectionsKt.arrayListOf(new String[]{"精确"}));
                break;
            case 32:
                pairCreate = Pair.create("帮你直接拦截骚扰词，\n聊天更安心", CollectionsKt.arrayListOf(new String[]{"拦截骚扰词"}));
                break;
            case 33:
                pairCreate = Pair.create("一键关闭开屏广告，\n高效社交无需等待", CollectionsKt.arrayListOf(new String[]{"关闭开屏广告"}));
                break;
            case 34:
                String str2 = sab0.q(purchaseType) ? zz6.u0() ? "他" : "她" : "他";
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                pairCreate = Pair.create(String.format("了解%s的性格，\n看%s是否和你合拍", Arrays.copyOf(new Object[]{str2, str2}, 2)), CollectionsKt.arrayListOf(new String[]{String.format("%s的性格", Arrays.copyOf(new Object[]{str2}, 1)), "和你合拍"}));
                break;
            case 35:
                pairCreate = Pair.create("帮你通过真人认证，真实头像，\n举报记录等信息评估男性用户", CollectionsKt.arrayListOf(new String[]{"真人认证，真实头像，", "举报记录"}));
                break;
            case 36:
                pairCreate = Pair.create("前往学校附近、旅行目的地\n或任意地方交友", CollectionsKt.arrayListOf(new String[]{"学校附近、旅行目的地"}));
                break;
            case 37:
                pairCreate = Pair.create("直接和你心仪的对象发起私聊\n邀约无需等待", CollectionsKt.arrayListOf(new String[]{"心仪的对象", "私聊"}));
                break;
            case 38:
                pairCreate = Pair.create("开启惊喜盲盒对象\n认识有趣的新朋友", CollectionsKt.arrayListOf(new String[]{"盲盒对象"}));
                break;
            case 39:
                pairCreate = Pair.create("第一时间知道你的消息\n对方是否已读", CollectionsKt.arrayListOf(new String[]{"第一时间"}));
                break;
            default:
                pairCreate = Pair.create("", CollectionsKt.arrayListOf(new String[]{""}));
                break;
        }
        get_description().setTextColor(sab0.i(purchaseType) ? Color.parseColor("#E8CA8A") : CoreModule.f1533b.getResources().getColor(b1c0.g));
        if (vwb.J((Collection) pairCreate.second)) {
            get_description().setText((CharSequence) pairCreate.first);
            return;
        }
        CharSequence charSequence = (CharSequence) pairCreate.first;
        ArrayList arrayList = (ArrayList) pairCreate.second;
        if (sab0.i(purchaseType)) {
            SpannableString spannableString = new SpannableString(charSequence);
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                String str3 = (String) next;
                spannableString.setSpan(new RelativeSizeSpan(1.1111112f), StringsKt.c0(spannableString, str3, 0, false, 6, (Object) null), StringsKt.c0(spannableString, str3, 0, false, 6, (Object) null) + str3.length(), 33);
                spannableString.setSpan(new imr(Color.parseColor("#FFD233"), Color.parseColor("#FF7C03"), true), StringsKt.c0(spannableString, str3, 0, false, 6, (Object) null), StringsKt.c0(spannableString, str3, 0, false, 6, (Object) null) + str3.length(), 33);
            }
            get_description().setText(spannableString);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        it2.getClass();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            next2.getClass();
            arrayList2.add(Integer.valueOf(sab0.x(purchaseType) ? Color.parseColor("#6AA631") : sab0.g(purchaseType) ? Color.parseColor("#FF67C5") : Color.parseColor("#FE611D")));
        }
        get_description().setText(i0g0.d0(charSequence.toString(), arrayList, arrayList2, Typeface.create(eqh0.c(2), 1), t100.f(20)));
    }

    @NotNull
    public final FrameLayout get_container() {
        FrameLayout frameLayout = this._container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.r("_container");
        return null;
    }

    @NotNull
    public final VText get_description() {
        VText vText = this._description;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_description");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7536a(this);
    }

    public final void set_container(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._container = frameLayout;
    }

    public final void set_description(@NotNull VText vText) {
        vText.getClass();
        this._description = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
