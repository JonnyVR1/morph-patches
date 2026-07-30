package com.p051p1.mobile.putong.core.p058ui.purchase.page;

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
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.ExplodeLayout;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.QuickChatPrivilegeAnimView;
import com.p051p1.mobile.putong.core.p058ui.purchase.privilege.SvipDlgSeeAnimLayout;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VText;
import p153l.c17;
import p153l.h9c0;
import p153l.hge0;
import p153l.jor;
import p153l.jyb;
import p153l.kgb0;
import p153l.lyh0;
import p153l.p9r;
import p153l.pf60;
import p153l.q8g0;
import p153l.qa00;
import p153l.rbb0;
import p153l.rec0;
import p153l.s7a;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u001f\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010&\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/core/data/Privilege;Lcom/p1/mobile/putong/core/data/PurchaseType;)V", "", "c", "()Ljava/lang/CharSequence;", "Landroid/widget/FrameLayout;", "get_container", "()Landroid/widget/FrameLayout;", "set_container", "(Landroid/widget/FrameLayout;)V", "_container", "Lv/VText;", "Lv/VText;", "get_description", "()Lv/VText;", "set_description", "(Lv/VText;)V", "_description", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class PurchasePrivilegeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public FrameLayout _container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _description;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeView$a */
    @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final /* synthetic */ class C8952a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35829a;

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
            f35829a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePrivilegeView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m55384a(View view) {
        kgb0.m149743a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m55385b(@NotNull PurchaseType purchaseType, @Nullable Privilege privilege) {
        purchaseType.getClass();
        m55387d(privilege, purchaseType);
        switch (privilege == null ? -1 : C8952a.f35829a[privilege.ordinal()]) {
            case 1:
            case 2:
                View viewInflate = p9r.m171370a(getContext()).inflate(rec0.f162583n1, (ViewGroup) get_container(), false);
                viewInflate.getClass();
                PurchasePrivilegeBadgeView purchasePrivilegeBadgeView = (PurchasePrivilegeBadgeView) viewInflate;
                purchasePrivilegeBadgeView.m55362b(privilege);
                get_container().addView(purchasePrivilegeBadgeView);
                break;
            case 3:
                View viewInflate2 = p9r.m171370a(getContext()).inflate(rec0.f162619w1, (ViewGroup) get_container(), false);
                viewInflate2.getClass();
                PurchasePrivilegeUndoView purchasePrivilegeUndoView = (PurchasePrivilegeUndoView) viewInflate2;
                purchasePrivilegeUndoView.m55383b();
                get_container().addView(purchasePrivilegeUndoView);
                break;
            case 4:
            case 5:
            case 6:
                if (s7a.m184979h() && wib0.m206579w(purchaseType)) {
                    View viewInflate3 = p9r.m171370a(getContext()).inflate(rec0.f162599r1, (ViewGroup) get_container(), false);
                    viewInflate3.getClass();
                    PurchasePrivilegeImageContainerView purchasePrivilegeImageContainerView = (PurchasePrivilegeImageContainerView) viewInflate3;
                    purchasePrivilegeImageContainerView.m55372d(purchaseType, privilege);
                    get_container().addView(purchasePrivilegeImageContainerView);
                } else if (!wib0.m206565i(purchaseType)) {
                    View viewInflate4 = p9r.m171370a(getContext()).inflate(rec0.f162611u1, (ViewGroup) get_container(), false);
                    viewInflate4.getClass();
                    PurchasePrivilegeSuperLikeView purchasePrivilegeSuperLikeView = (PurchasePrivilegeSuperLikeView) viewInflate4;
                    purchasePrivilegeSuperLikeView.m55381b();
                    get_container().addView(purchasePrivilegeSuperLikeView);
                } else {
                    View viewInflate5 = p9r.m171370a(getContext()).inflate(rec0.f162587o1, (ViewGroup) get_container(), false);
                    viewInflate5.getClass();
                    PurchasePrivilegeCommonStyleView purchasePrivilegeCommonStyleView = (PurchasePrivilegeCommonStyleView) viewInflate5;
                    purchasePrivilegeCommonStyleView.m55364b(privilege);
                    get_container().addView(purchasePrivilegeCommonStyleView);
                }
                break;
            case 7:
                if (s7a.m184979h() && wib0.m206573q(purchaseType)) {
                    View viewInflate6 = p9r.m171370a(getContext()).inflate(rec0.f162615v1, (ViewGroup) get_container(), false);
                    viewInflate6.getClass();
                    PurchasePrivilegeSVGAContainerView purchasePrivilegeSVGAContainerView = (PurchasePrivilegeSVGAContainerView) viewInflate6;
                    purchasePrivilegeSVGAContainerView.m55377c(purchaseType, privilege);
                    get_container().addView(purchasePrivilegeSVGAContainerView);
                } else if (CoreModule.m30933P().m143405a().mo34438W9() && NullChecker.m82486a(rbb0.m180734f())) {
                    View viewInflate7 = p9r.m171370a(getContext()).inflate(rec0.f162512X2, (ViewGroup) get_container(), false);
                    viewInflate7.getClass();
                    SvipDlgSeeAnimLayout svipDlgSeeAnimLayout = (SvipDlgSeeAnimLayout) viewInflate7;
                    svipDlgSeeAnimLayout.setScaleX(0.75f);
                    svipDlgSeeAnimLayout.setScaleY(0.75f);
                    svipDlgSeeAnimLayout.m55503d(rbb0.m180734f());
                    svipDlgSeeAnimLayout.m55506l0();
                    get_container().addView(svipDlgSeeAnimLayout);
                    m55386c();
                } else {
                    View viewInflate8 = p9r.m171370a(getContext()).inflate(rec0.f162464L2, (ViewGroup) get_container(), false);
                    viewInflate8.getClass();
                    ExplodeLayout explodeLayout = (ExplodeLayout) viewInflate8;
                    explodeLayout.setScale(0.55f);
                    get_container().addView(explodeLayout);
                    explodeLayout.m55410k();
                }
                break;
            case 8:
                if (s7a.m184979h() && wib0.m206573q(purchaseType)) {
                    View viewInflate9 = p9r.m171370a(getContext()).inflate(rec0.f162599r1, (ViewGroup) get_container(), false);
                    viewInflate9.getClass();
                    PurchasePrivilegeImageContainerView purchasePrivilegeImageContainerView2 = (PurchasePrivilegeImageContainerView) viewInflate9;
                    purchasePrivilegeImageContainerView2.m55371c(purchaseType, privilege);
                    get_container().addView(purchasePrivilegeImageContainerView2);
                } else if (!wib0.m206565i(purchaseType)) {
                    QuickChatPrivilegeAnimView quickChatPrivilegeAnimView = new QuickChatPrivilegeAnimView(getContext());
                    quickChatPrivilegeAnimView.setScaleX(0.75f);
                    quickChatPrivilegeAnimView.setScaleY(0.75f);
                    get_container().addView(quickChatPrivilegeAnimView);
                    quickChatPrivilegeAnimView.m55492t0();
                } else {
                    View viewInflate10 = p9r.m171370a(getContext()).inflate(rec0.f162587o1, (ViewGroup) get_container(), false);
                    viewInflate10.getClass();
                    PurchasePrivilegeCommonStyleView purchasePrivilegeCommonStyleView2 = (PurchasePrivilegeCommonStyleView) viewInflate10;
                    purchasePrivilegeCommonStyleView2.m55364b(privilege);
                    get_container().addView(purchasePrivilegeCommonStyleView2);
                }
                break;
            case 9:
                View viewInflate11 = p9r.m171370a(getContext()).inflate(rec0.f162419A1, (ViewGroup) get_container(), false);
                viewInflate11.getClass();
                PurchasePrivilegeVoiceView purchasePrivilegeVoiceView = (PurchasePrivilegeVoiceView) viewInflate11;
                get_container().addView(purchasePrivilegeVoiceView);
                purchasePrivilegeVoiceView.m55393k0();
                break;
            case 10:
                View viewInflate12 = LayoutInflater.from(getContext()).inflate(rec0.f162607t1, (ViewGroup) get_container(), false);
                viewInflate12.getClass();
                PurchasePrivilegeSayHiView purchasePrivilegeSayHiView = (PurchasePrivilegeSayHiView) viewInflate12;
                purchasePrivilegeSayHiView.m55379b();
                get_container().addView(purchasePrivilegeSayHiView);
                break;
            case 11:
                View viewInflate13 = p9r.m171370a(getContext()).inflate(rec0.f162591p1, (ViewGroup) get_container(), false);
                viewInflate13.getClass();
                PurchasePrivilegeCustomService purchasePrivilegeCustomService = (PurchasePrivilegeCustomService) viewInflate13;
                purchasePrivilegeCustomService.m55366b();
                get_container().addView(purchasePrivilegeCustomService);
                break;
            case 12:
                View viewInflate14 = p9r.m171370a(getContext()).inflate(rec0.f162587o1, (ViewGroup) get_container(), false);
                viewInflate14.getClass();
                PurchasePrivilegeCommonStyleView purchasePrivilegeCommonStyleView3 = (PurchasePrivilegeCommonStyleView) viewInflate14;
                purchasePrivilegeCommonStyleView3.m55364b(privilege);
                get_container().addView(purchasePrivilegeCommonStyleView3);
                break;
            case 13:
                View viewInflate15 = p9r.m171370a(getContext()).inflate(rec0.f162603s1, (ViewGroup) get_container(), false);
                viewInflate15.getClass();
                PurchasePrivilegeOdiamondSkinView purchasePrivilegeOdiamondSkinView = (PurchasePrivilegeOdiamondSkinView) viewInflate15;
                purchasePrivilegeOdiamondSkinView.m55374b();
                get_container().addView(purchasePrivilegeOdiamondSkinView);
                break;
            case 14:
                View viewInflate16 = p9r.m171370a(getContext()).inflate(rec0.f162627y1, (ViewGroup) get_container(), false);
                viewInflate16.getClass();
                PurchasePrivilegeVisitorHideFootPrintView purchasePrivilegeVisitorHideFootPrintView = (PurchasePrivilegeVisitorHideFootPrintView) viewInflate16;
                purchasePrivilegeVisitorHideFootPrintView.m55389b();
                get_container().addView(purchasePrivilegeVisitorHideFootPrintView);
                break;
            case 15:
                if (s7a.m184979h() && wib0.m206565i(purchaseType)) {
                    View viewInflate17 = p9r.m171370a(getContext()).inflate(rec0.f162615v1, (ViewGroup) get_container(), false);
                    viewInflate17.getClass();
                    PurchasePrivilegeSVGAContainerView purchasePrivilegeSVGAContainerView2 = (PurchasePrivilegeSVGAContainerView) viewInflate17;
                    purchasePrivilegeSVGAContainerView2.m55376b(purchaseType, privilege);
                    get_container().addView(purchasePrivilegeSVGAContainerView2);
                } else {
                    View viewInflate18 = p9r.m171370a(getContext()).inflate(rec0.f162599r1, (ViewGroup) get_container(), false);
                    viewInflate18.getClass();
                    PurchasePrivilegeImageContainerView purchasePrivilegeImageContainerView3 = (PurchasePrivilegeImageContainerView) viewInflate18;
                    purchasePrivilegeImageContainerView3.m55370b(purchaseType, privilege);
                    get_container().addView(purchasePrivilegeImageContainerView3);
                }
                break;
            case 16:
                View viewInflate19 = p9r.m171370a(getContext()).inflate(rec0.f162595q1, (ViewGroup) get_container(), false);
                viewInflate19.getClass();
                PurchasePrivilegeHideMeFromNearbyView purchasePrivilegeHideMeFromNearbyView = (PurchasePrivilegeHideMeFromNearbyView) viewInflate19;
                purchasePrivilegeHideMeFromNearbyView.m55368b();
                get_container().addView(purchasePrivilegeHideMeFromNearbyView);
                break;
            default:
                View viewInflate20 = p9r.m171370a(getContext()).inflate(rec0.f162599r1, (ViewGroup) get_container(), false);
                viewInflate20.getClass();
                PurchasePrivilegeImageContainerView purchasePrivilegeImageContainerView4 = (PurchasePrivilegeImageContainerView) viewInflate20;
                purchasePrivilegeImageContainerView4.m55370b(purchaseType, privilege);
                get_container().addView(purchasePrivilegeImageContainerView4);
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final CharSequence m55386c() {
        Object obj;
        User userM180734f = rbb0.m180734f();
        if (!NullChecker.m82486a(userM180734f)) {
            CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
            return hge0.m134921e(c4870aM31479t5 != null ? c4870aM31479t5.f20012b : 0);
        }
        Context context = getContext();
        int i = R$string.f28364l7;
        userM180734f.getClass();
        if (userM180734f.age.intValue() > 30) {
            obj = "30+";
        } else {
            obj = userM180734f.age;
            obj.getClass();
        }
        String string = context.getString(i, obj);
        string.getClass();
        pf60<String, String> pf60VarMo34560oi = CoreModule.m30933P().m143405a().mo34560oi(userM180734f.location.distance);
        String str = pf60VarMo34560oi.f152156a;
        String str2 = pf60VarMo34560oi.f152157b;
        StringBuilder sb = new StringBuilder();
        sb.append((Object) str);
        sb.append((Object) str2);
        String string2 = sb.toString();
        String string3 = getContext().getString(userM180734f.isFemale() ? R$string.f28435r7 : R$string.f28424q7, string, string2);
        string3.getClass();
        SpannableString spannableString = new SpannableString(string3);
        CoreModule.m30933P().m143405a().mo34367Lp(spannableString, string3, string, String.valueOf(userM180734f.age.intValue()).length(), qa00.m175861f(13), qa00.m175861f(13), Color.parseColor("#ffe8aa"));
        CoreBusinessService coreBusinessServiceM143405a = CoreModule.m30933P().m143405a();
        String str3 = pf60VarMo34560oi.f152156a;
        coreBusinessServiceM143405a.mo34367Lp(spannableString, string3, string2, str3 != null ? str3.length() : 0, qa00.m175861f(13), qa00.m175861f(13), Color.parseColor("#ffe8aa"));
        return spannableString;
    }

    /* JADX INFO: renamed from: d */
    public final void m55387d(Privilege privilege, PurchaseType purchaseType) {
        Pair pairCreate;
        boolean zM107528u0;
        boolean zM107528u1;
        switch (privilege == null ? -1 : C8952a.f35829a[privilege.ordinal()]) {
            case 1:
                pairCreate = Pair.create("VIP会员专属标识，彰显你的\n会员身份", new ArrayList());
                break;
            case 2:
                pairCreate = Pair.create("尊享SVIP身份标识，突出尊贵身份，\n帮你提升2.5倍配对成功率", CollectionsKt.arrayListOf("2.5倍"));
                break;
            case 3:
                String str = c17.m107528u0() ? "他" : "她";
                pairCreate = !CoreModule.m30933P().m143405a().mo34436Vf() ? Pair.create("手滑了？你可以撤回上一张卡片，\n找回错过的".concat(str), CollectionsKt.arrayListOf("撤回上一张")) : Pair.create("手滑啦？使用反悔特权，重新喜欢" + str + "！", CollectionsKt.arrayListOf("反悔特权"));
                break;
            case 4:
            case 6:
                if (!wib0.m206565i(purchaseType)) {
                    if (NullChecker.m82486a(rbb0.m180737j())) {
                        User userM180737j = rbb0.m180737j();
                        zM107528u0 = Intrinsics.m88377d(userM180737j != null ? userM180737j.gender : null, Gender.get("male"));
                    } else {
                        zM107528u0 = c17.m107528u0();
                    }
                    pairCreate = Pair.create("超级喜欢" + (zM107528u0 ? "他" : "她") + "？使用后让你的\n喜欢脱颖而出！", CollectionsKt.arrayListOf("脱颖而出"));
                } else {
                    pairCreate = Pair.create("无限次超级喜欢，使用后让你的\n喜欢脱颖而出！", CollectionsKt.arrayListOf("无限次", "脱颖而出"));
                }
                break;
            case 5:
                pairCreate = Pair.create("超级喜欢他？使用后让你的\n喜欢脱颖而出", CollectionsKt.arrayListOf("脱颖而出"));
                break;
            case 7:
                if (CoreModule.m30933P().m143405a().mo34438W9() && NullChecker.m82486a(rbb0.m180734f())) {
                    CharSequence charSequenceM55386c = m55386c();
                    pairCreate = Pair.create(charSequenceM55386c != null ? charSequenceM55386c : "", new ArrayList());
                } else {
                    CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
                    User userM31491x5 = CoreModule.f18264c.f20429u0.m31491x5();
                    pairCreate = Pair.create(CoreModule.m30933P().m143405a().mo34611vb(userM31491x5, c4870aM31479t5) ? CoreModule.m30933P().m143405a().mo34633yl(userM31491x5) : hge0.m134921e(c4870aM31479t5 != null ? c4870aM31479t5.f20012b : 0), new ArrayList());
                }
                break;
            case 8:
                pairCreate = !wib0.m206565i(purchaseType) ? Pair.create("每天3次匹配附近在线用户\n立即开聊！", CollectionsKt.arrayListOf("立即开聊")) : Pair.create("无限次闪聊机会，无需配对\n立即开聊！", CollectionsKt.arrayListOf("立即开聊"));
                break;
            case 9:
                pairCreate = Pair.create("每天1次语音连线，立即与\n附近在线的用户畅聊！", CollectionsKt.arrayListOf("立即", "附近在线"));
                break;
            case 10:
                pairCreate = Pair.create("主动打招呼，表达你的心意，获取\n" + (c17.m107528u0() ? "他" : "她") + "的关注", CollectionsKt.arrayListOf("主动"));
                break;
            case 11:
                pairCreate = Pair.create("一对一专属客服，为你的\n体验保驾护航", CollectionsKt.arrayListOf("一对一"));
                break;
            case 12:
                pairCreate = Pair.create("主动打招呼，表达你的心意，获取\n" + (c17.m107528u0() ? "他" : "她") + "的关注", CollectionsKt.arrayListOf(""));
                break;
            case 13:
                pairCreate = Pair.create("解锁黑金专属皮肤，随时\n彰显与众不同", CollectionsKt.arrayListOf(""));
                break;
            case 14:
                int iMo35979Xm = CoreModule.m30933P().m143408e().mo35979Xm();
                pairCreate = Pair.create("每月" + iMo35979Xm + "次机会，开启后访问其他人，\n对方将不会看到你的访问记录", CollectionsKt.arrayListOf(iMo35979Xm + "次"));
                break;
            case 15:
                pairCreate = Pair.create("一键开聊，无需等待，每天3次\n开挂体验！", CollectionsKt.arrayListOf("无需等待"));
                break;
            case 16:
                pairCreate = Pair.create("不让距离太近的人看到我，随时\n保护隐私", CollectionsKt.arrayListOf("保护隐私"));
                break;
            case 17:
                if (NullChecker.m82486a(rbb0.m180741n())) {
                    User userM180741n = rbb0.m180741n();
                    zM107528u1 = Intrinsics.m88377d(userM180741n != null ? userM180741n.gender : null, Gender.get("male"));
                } else {
                    zM107528u1 = c17.m107528u0();
                }
                pairCreate = Pair.create("尽情右滑、突破右滑上限、不错过\n任何你喜欢的".concat(zM107528u1 ? "他" : "她"), CollectionsKt.arrayListOf("突破右滑上限"));
                break;
            case 18:
                pairCreate = Pair.create("任意切换定位，与各地\n好友畅聊", CollectionsKt.arrayListOf("任意切换"));
                break;
            case 19:
                pairCreate = Pair.create("每天2个专属免费礼物，给" + (c17.m107528u0() ? "他" : "她") + "\n一份小惊喜！", CollectionsKt.arrayListOf("专属"));
                break;
            case 20:
                pairCreate = Pair.create("发送超级喜欢或使用一键配对，再次\n打动你喜欢的人！", new ArrayList());
                break;
            case 21:
                pairCreate = !wib0.m206565i(purchaseType) ? Pair.create("30分钟内让你在所处地区中\n成为最热门的人", CollectionsKt.arrayListOf("最热门")) : Pair.create("全天让你在所处的地区中，成为\n成为最热门的人", CollectionsKt.arrayListOf("全天"));
                break;
            case 22:
                pairCreate = Pair.create("通过偏好设置，为你推荐符合\n条件的用户", CollectionsKt.arrayListOf(""));
                break;
            case 23:
                pairCreate = Pair.create("第一时间知道你的消息\n对方是否已读", CollectionsKt.arrayListOf("第一时间"));
                break;
            case 24:
                if (!wib0.m206563g(purchaseType)) {
                    pairCreate = !CoreModule.m30933P().m143412i().mo180364N() ? Pair.create("选择是否展示你的位置、年龄、\n活跃时间等隐私信息", CollectionsKt.arrayListOf("位置、年龄、\n活跃时间")) : Pair.create("只让你右滑的人看到你\n还可隐藏年龄、位置等信息", CollectionsKt.arrayListOf("隐藏年龄、位置"));
                } else {
                    pairCreate = Pair.create("一键开启冻结活跃时间\n和隐藏距离位置功能", CollectionsKt.arrayListOf("冻结活跃时间", "隐藏距离位置"));
                }
                break;
            case 25:
                pairCreate = Pair.create("找回你解除的配对\n恢复和" + (c17.m107528u0() ? "他" : "她") + "的聊天", CollectionsKt.arrayListOf("恢复"));
                break;
            case 26:
                pairCreate = Pair.create("让" + (c17.m107528u0() ? "他" : "她") + "第一时间看到你，配对\n几率提升3倍", CollectionsKt.arrayListOf(""));
                break;
            case 27:
                pairCreate = !wib0.m206565i(purchaseType) ? Pair.create("动态智能精准投放，收获\n大量浏览互动", CollectionsKt.arrayListOf("")) : Pair.create("发布动态全程开启超级曝光，收获\n大量点赞互动", CollectionsKt.arrayListOf(""));
                break;
            case 28:
                pairCreate = Pair.create("解密谁看过我，不错过任何\n一个默默关心我的人", CollectionsKt.arrayListOf("不错过"));
                break;
            case 29:
                pairCreate = Pair.create("专属徽章和入场特效，成为全场\n最闪亮的星", CollectionsKt.arrayListOf("专属"));
                break;
            case 30:
                pairCreate = Pair.create("每日触达16位平台优质认证用户，\n尊享高质量交友体验", CollectionsKt.arrayListOf("优质认证"));
                break;
            case 31:
                pairCreate = Pair.create("根据您的地理位置，为您精确搜索\n附近3公里内的用户", CollectionsKt.arrayListOf("精确"));
                break;
            case 32:
                pairCreate = Pair.create("帮你直接拦截骚扰词，\n聊天更安心", CollectionsKt.arrayListOf("拦截骚扰词"));
                break;
            case 33:
                pairCreate = Pair.create("一键关闭开屏广告，\n高效社交无需等待", CollectionsKt.arrayListOf("关闭开屏广告"));
                break;
            case 34:
                String str2 = wib0.m206573q(purchaseType) ? c17.m107528u0() ? "他" : "她" : "他";
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                pairCreate = Pair.create(String.format("了解%s的性格，\n看%s是否和你合拍", Arrays.copyOf(new Object[]{str2, str2}, 2)), CollectionsKt.arrayListOf(String.format("%s的性格", Arrays.copyOf(new Object[]{str2}, 1)), "和你合拍"));
                break;
            case 35:
                pairCreate = Pair.create("帮你通过真人认证，真实头像，\n举报记录等信息评估男性用户", CollectionsKt.arrayListOf("真人认证，真实头像，", "举报记录"));
                break;
            case 36:
                pairCreate = Pair.create("前往学校附近、旅行目的地\n或任意地方交友", CollectionsKt.arrayListOf("学校附近、旅行目的地"));
                break;
            case 37:
                pairCreate = Pair.create("直接和你心仪的对象发起私聊\n邀约无需等待", CollectionsKt.arrayListOf("心仪的对象", "私聊"));
                break;
            case 38:
                pairCreate = Pair.create("开启惊喜盲盒对象\n认识有趣的新朋友", CollectionsKt.arrayListOf("盲盒对象"));
                break;
            case 39:
                pairCreate = Pair.create("第一时间知道你的消息\n对方是否已读", CollectionsKt.arrayListOf("第一时间"));
                break;
            default:
                pairCreate = Pair.create("", CollectionsKt.arrayListOf(""));
                break;
        }
        get_description().setTextColor(wib0.m206565i(purchaseType) ? Color.parseColor("#E8CA8A") : CoreModule.f18263b.getResources().getColor(h9c0.f108369g));
        if (jyb.m147479J((Collection) pairCreate.second)) {
            get_description().setText((CharSequence) pairCreate.first);
            return;
        }
        CharSequence charSequence = (CharSequence) pairCreate.first;
        ArrayList arrayList = (ArrayList) pairCreate.second;
        if (wib0.m206565i(purchaseType)) {
            SpannableString spannableString = new SpannableString(charSequence);
            Iterator it = arrayList.iterator();
            it.getClass();
            while (it.hasNext()) {
                Object next = it.next();
                next.getClass();
                String str3 = (String) next;
                spannableString.setSpan(new RelativeSizeSpan(1.1111112f), StringsKt.m94327c0(spannableString, str3, 0, false, 6, null), StringsKt.m94327c0(spannableString, str3, 0, false, 6, null) + str3.length(), 33);
                spannableString.setSpan(new jor(Color.parseColor("#FFD233"), Color.parseColor("#FF7C03"), true), StringsKt.m94327c0(spannableString, str3, 0, false, 6, null), StringsKt.m94327c0(spannableString, str3, 0, false, 6, null) + str3.length(), 33);
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
            arrayList2.add(Integer.valueOf(wib0.m206580x(purchaseType) ? Color.parseColor("#6AA631") : wib0.m206563g(purchaseType) ? Color.parseColor("#FF67C5") : Color.parseColor("#FE611D")));
        }
        get_description().setText(q8g0.m175798d0(charSequence.toString(), arrayList, arrayList2, Typeface.create(lyh0.m156283c(2), 1), qa00.m175861f(20)));
    }

    @NotNull
    public final FrameLayout get_container() {
        FrameLayout frameLayout = this._container;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m88391r("_container");
        return null;
    }

    @NotNull
    public final VText get_description() {
        VText vText = this._description;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_description");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55384a(this);
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
