package com.p046p1.mobile.putong.core.p053ui.purchase.page;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VIcon;
import p147v.VText;
import p149l.b1c0;
import p149l.d3b0;
import p149l.d3c0;
import p149l.sab0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchaseExclusivePrivilegeItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "purchaseType", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "c", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)Ljava/lang/CharSequence;", "Lv/VIcon;", "Lv/VIcon;", "get_icon", "()Lv/VIcon;", "set_icon", "(Lv/VIcon;)V", "_icon", "Lv/VText;", "Lv/VText;", "get_privilege", "()Lv/VText;", "set_privilege", "(Lv/VText;)V", "_privilege", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PurchaseExclusivePrivilegeItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VIcon _icon;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _privilege;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.page.PurchaseExclusivePrivilegeItemView$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8780a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34898a;

        static {
            int[] iArr = new int[Privilege.values().length];
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Privilege.vip_super_like.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Privilege.vip_undo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Privilege.vip_location.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Privilege.vip_badge.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Privilege.see_who_likes_me.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Privilege.online_match_tickets.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Privilege.boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Privilege.liked_user.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Privilege.voice_quick_chat.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Privilege.say_hi_pkg.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Privilege.advanced_filter.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Privilege.privacy_membership.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Privilege.recover_unmatches.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Privilege.message_read_state.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Privilege.greet.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Privilege.svip_badge.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Privilege.leave_message.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Privilege.moment_boost.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Privilege.immediately_match.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Privilege.oDiamondVisitor.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Privilege.oDiamondSvipSkin.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Privilege.customer_service.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Privilege.picksMembership.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Privilege.oDiamondGreetings.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Privilege.live_entry_animation.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Privilege.oDiamondSvipExtra.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Privilege.visitor_hide_footprint.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[Privilege.nearby_people.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[Privilege.block_harassing_words.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[Privilege.ads_not_disturb.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[Privilege.unlock_learn_about_him_module.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[Privilege.pick_tantan_credits_users.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[Privilege.youth_roaming.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[Privilege.youth_find_partner.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[Privilege.youth_blind_box.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[Privilege.youth_superlike.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[Privilege.youth_message_read.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[Privilege.hide_me_from_nearby.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            f34898a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchaseExclusivePrivilegeItemView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m54136a(View view) {
        d3b0.m109902a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final CharSequence m54137b(PurchaseType purchaseType, Privilege privilege) {
        switch (C8780a.f34898a[privilege.ordinal()]) {
            case 1:
                return "无限右滑";
            case 2:
                if (sab0.m182891i(purchaseType)) {
                    return "无限次超级喜欢";
                }
                String string = CoreModule.f17544b.getString(R$string.f27450g1);
                string.getClass();
                return string;
            case 3:
                return CoreModule.m29935P().m94651a().mo33433Vf() ? "反悔特权" : "滑错反悔";
            case 4:
                return "修改定位";
            case 5:
                return "会员标识";
            case 6:
                return "解密谁喜欢我";
            case 7:
                return sab0.m182891i(purchaseType) ? "无限次在线闪聊" : "闪聊配对";
            case 8:
                return sab0.m182891i(purchaseType) ? "全程优先推荐" : "每月3次优先推荐";
            case 9:
                return "解锁我喜欢过的人";
            case 10:
                return "语音闪聊";
            case 11:
                return "每天3次打招呼";
            case 12:
                return "高级筛选";
            case 13:
                return "隐私保护";
            case 14:
                return "找回我解除的配对";
            case 15:
                return "查看消息是否已读";
            case 16:
                return "专属礼物";
            case 17:
                return "可控身份标识";
            case 18:
                return "每天5条\"资料留言\"";
            case 19:
                return sab0.m182891i(purchaseType) ? "全程动态超级曝光" : String.format("每月%s次动态超级曝光", Integer.valueOf(CoreModule.m29934N().mo60355h8()));
            case 20:
                return "一键配对";
            case 21:
                return "我的访客";
            case 22:
                return "黑金专属皮肤";
            case 23:
                return "专属客服";
            case 24:
                return "每日心动";
            case 25:
                return "无限打招呼";
            case 26:
                return "直播间徽章 入场特效";
            case 27:
                return "探探SVIP会员所有权益";
            case 28:
                return "隐藏我的访问足迹";
            case 29:
                return "附近的人";
            case 30:
                return "直接屏蔽骚扰词";
            case 31:
                return "广告免打扰";
            case 32:
                boolean zM182899q = sab0.m182899q(purchaseType);
                String str = "他";
                if (zM182899q && !zz6.m221004u0()) {
                    str = "她";
                }
                return String.format("解锁更了解%s模块", str);
            case 33:
                return "精选展示男性用户探探信用分";
            case 34:
                return "任意修改定位";
            case 35:
                return String.format("每天%s次免费找搭子特权", Integer.valueOf(CoreModule.f17545c.f19598Q1.f20117R.m34755I()));
            case 36:
                return String.format("每天%s次额外免费盲盒", Integer.valueOf(CoreModule.f17545c.f19598Q1.f20117R.m34754H()));
            case 37:
                return "每天1个超级喜欢";
            case 38:
                return "查看消息是否已读";
            case 39:
                return "不让距离太近的人看到我";
            default:
                return "";
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m54138c(@NotNull PurchaseType purchaseType, @NotNull Privilege privilege) {
        purchaseType.getClass();
        privilege.getClass();
        if (sab0.m182891i(purchaseType)) {
            get_icon().setImageResource(d3c0.f83849a7);
            get_privilege().setTextColor(Color.parseColor("#CCFFDEA2"));
        } else {
            get_icon().setImageResource(d3c0.f83835Z6);
            get_privilege().setTextColor(getResources().getColor(b1c0.f72549g));
        }
        get_privilege().setText(m54137b(purchaseType, privilege));
    }

    @NotNull
    public final VIcon get_icon() {
        VIcon vIcon = this._icon;
        if (vIcon != null) {
            return vIcon;
        }
        Intrinsics.m87502r("_icon");
        return null;
    }

    @NotNull
    public final VText get_privilege() {
        VText vText = this._privilege;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_privilege");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54136a(this);
    }

    public final void set_icon(@NotNull VIcon vIcon) {
        vIcon.getClass();
        this._icon = vIcon;
    }

    public final void set_privilege(@NotNull VText vText) {
        vText.getClass();
        this._privilege = vText;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchaseExclusivePrivilegeItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchaseExclusivePrivilegeItemView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
