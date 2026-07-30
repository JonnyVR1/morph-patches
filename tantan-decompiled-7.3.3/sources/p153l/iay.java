package p153l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedSvipWeeklyItemData;
import com.p051p1.mobile.putong.core.data.SvipWeeklyReportItem;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.visitor.MomentVisitorsAct;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialConstants;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010&J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001dH\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001dH\u0002¢\u0006\u0004\b,\u0010+¨\u0006-"}, m88121d2 = {"Ll/iay;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData$SvipWeeklyItem;", "weeklyItems", "Lv/VLinear;", "root", "", "j", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Lv/VLinear;)V", "Landroid/widget/LinearLayout;", "h", "(Lcom/p1/mobile/android/app/Act;)Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout$LayoutParams;", "g", "()Landroid/widget/LinearLayout$LayoutParams;", "svipWeeklyItem", "layoutParams", "Landroid/view/View;", "c", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData$SvipWeeklyItem;Landroid/widget/LinearLayout$LayoutParams;)Landroid/view/View;", "e", RXScreenCaptureService.KEY_INDEX, Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;)Landroid/view/View;", "", "numberValue", "unit", "Landroid/text/SpannableStringBuilder;", "f", "(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;", BLiveStormDanmakuGiftResourceType.f45292l, "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData$SvipWeeklyItem;)V", "p", "(Lcom/p1/mobile/android/app/Act;)V", "m", "n", Oauth2AccessToken.KEY_UID, "o", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "k", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class iay {

    @NotNull
    public static final iay INSTANCE = new iay();

    /* JADX INFO: renamed from: a */
    public static void m139210a(Act act, MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem, View view) {
        INSTANCE.m139221l(act, svipWeeklyItem);
    }

    /* JADX INFO: renamed from: b */
    public static void m139211b(Act act, MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem, View view) {
        INSTANCE.m139221l(act, svipWeeklyItem);
    }

    /* JADX INFO: renamed from: c */
    public final View m139212c(Act act, MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem, LinearLayout.LayoutParams layoutParams) {
        int i = svipWeeklyItem.svipWeeklyItemRenderType;
        if (i != 1) {
            return i != 2 ? new View(act) : m139218i(act, svipWeeklyItem, layoutParams);
        }
        return m139214e(act, svipWeeklyItem, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final View m139213d(Act act) {
        View view = new View(act);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(qa00.f156316c, qa00.f156328o);
        layoutParams.gravity = 16;
        view.setLayoutParams(layoutParams);
        view.setBackgroundResource(gbc0.f103418u5);
        return view;
    }

    /* JADX INFO: renamed from: e */
    public final View m139214e(final Act act, final MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem, LinearLayout.LayoutParams layoutParams) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(act);
        int i = qa00.f156332s;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = qa00.f156326m;
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(svipWeeklyItem.iconRes);
        VText vText = new VText(act);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = qa00.m175859d(13.0f);
        vText.setLayoutParams(layoutParams3);
        vText.setTextSize(10.0f);
        vText.setTextColor(Color.parseColor("#CCBB4300"));
        vText.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vText.setEllipsize(truncateAt);
        vText.getPaint().setFakeBoldText(true);
        String str = svipWeeklyItem.numberValue;
        str.getClass();
        vText.setText(m139215f(str, "人"));
        VText vText2 = new VText(act);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        layoutParams4.topMargin = qa00.m175859d(4.0f);
        vText2.setLayoutParams(layoutParams4);
        vText2.setTextSize(12.0f);
        vText2.setTextColor(Color.parseColor("#4dAB3D00"));
        vText2.setMaxLines(1);
        vText2.setEllipsize(truncateAt);
        vText2.setText(svipWeeklyItem.lable);
        linearLayout.addView(imageView);
        linearLayout.addView(vText);
        linearLayout.addView(vText2);
        bnl0.m105509E0(linearLayout, new View.OnClickListener() { // from class: l.hay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iay.m139210a(act, svipWeeklyItem, view);
            }
        });
        return linearLayout;
    }

    /* JADX INFO: renamed from: f */
    public final SpannableStringBuilder m139215f(String numberValue, String unit) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) numberValue);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(20, true), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) unit);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g */
    public final LinearLayout.LayoutParams m139216g() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, qa00.m175859d(110.0f));
        layoutParams.weight = 1.0f;
        return layoutParams;
    }

    /* JADX INFO: renamed from: h */
    public final LinearLayout m139217h(Act act) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, qa00.m175859d(110.0f)));
        return linearLayout;
    }

    /* JADX INFO: renamed from: i */
    public final View m139218i(final Act act, final MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem, LinearLayout.LayoutParams layoutParams) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        SimpleDraweeView vDraweeView = new VDraweeView(act);
        int i = qa00.f156332s;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = qa00.f156326m;
        vDraweeView.setLayoutParams(layoutParams2);
        ((wlj) vDraweeView.getHierarchy()).m207045H(RoundingParams.m8301a());
        uqb0.f180374G.m127109I0(vDraweeView, svipWeeklyItem.userImgUrl, i, i);
        VText vText = new VText(act);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = qa00.m175859d(16.0f);
        vText.setLayoutParams(layoutParams3);
        vText.setTextSize(17.0f);
        vText.setTextColor(Color.parseColor("#CCBB4300"));
        vText.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vText.setEllipsize(truncateAt);
        vText.getPaint().setFakeBoldText(true);
        vText.setText(svipWeeklyItem.userName);
        VText vText2 = new VText(act);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        layoutParams4.topMargin = qa00.m175859d(4.0f);
        vText2.setLayoutParams(layoutParams4);
        vText2.setTextSize(12.0f);
        vText2.setTextColor(Color.parseColor("#4dAB3D00"));
        vText2.setMaxLines(1);
        vText2.setEllipsize(truncateAt);
        vText2.setText(svipWeeklyItem.lable);
        linearLayout.addView(vDraweeView);
        linearLayout.addView(vText);
        linearLayout.addView(vText2);
        bnl0.m105509E0(linearLayout, new View.OnClickListener() { // from class: l.gay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                iay.m139211b(act, svipWeeklyItem, view);
            }
        });
        return linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public final void m139219j(@NotNull Act act, @NotNull List<? extends MeetFeedSvipWeeklyItemData.SvipWeeklyItem> weeklyItems, @NotNull VLinear root) {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        act.getClass();
        weeklyItems.getClass();
        root.getClass();
        int i = 0;
        LinearLayout linearLayout3 = null;
        for (Object obj : weeklyItems) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem = (MeetFeedSvipWeeklyItemData.SvipWeeklyItem) obj;
            if (i % 2 == 0) {
                iay iayVar = INSTANCE;
                LinearLayout linearLayoutM139217h = iayVar.m139217h(act);
                if (linearLayoutM139217h == null) {
                    Intrinsics.m88391r("rows");
                    linearLayout2 = null;
                } else {
                    linearLayout2 = linearLayoutM139217h;
                }
                linearLayout2.addView(iayVar.m139212c(act, svipWeeklyItem, iayVar.m139216g()));
                if (i == weeklyItems.size() - 1) {
                    View view = new View(act);
                    view.setLayoutParams(iayVar.m139216g());
                    View viewM139213d = iayVar.m139213d(act);
                    viewM139213d.setVisibility(4);
                    linearLayoutM139217h.addView(viewM139213d);
                    linearLayoutM139217h.addView(view);
                }
                root.addView(linearLayoutM139217h);
                linearLayout3 = linearLayoutM139217h;
            } else {
                if (linearLayout3 == null) {
                    Intrinsics.m88391r("rows");
                    linearLayout = null;
                } else {
                    linearLayout = linearLayout3;
                }
                iay iayVar2 = INSTANCE;
                linearLayout.addView(iayVar2.m139213d(act));
                linearLayout3.addView(iayVar2.m139212c(act, svipWeeklyItem, iayVar2.m139216g()));
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m139220k(Act act, String uid) {
        if (CoreModule.m30930K().mo31822sg(uid)) {
            act.startActivity(CoreModule.m30930K().startMessagesAct(act, uid, false, false));
        } else {
            act.startActivity(CoreModule.m30930K().getMainWithNav(act, NavigationIntent.get(NavigationIntent.menu)));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m139221l(Act act, MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem) {
        HashMap map = new HashMap();
        String str = svipWeeklyItem.itemType;
        if (Intrinsics.m88377d(str, SvipWeeklyReportItem.ITEM_TYPE_VISITOR)) {
            m139225p(act);
            map.put("report_module_see", svipWeeklyItem.numberValue);
        } else if (Intrinsics.m88377d(str, SvipWeeklyReportItem.ITEM_TYPE_LIKERS)) {
            m139222m(act);
            map.put("report_module_like", svipWeeklyItem.numberValue);
        } else if (Intrinsics.m88377d(str, SvipWeeklyReportItem.ITEM_TYPE_NEW_MATCH)) {
            m139223n(act);
            map.put("report_module_match", svipWeeklyItem.numberValue);
        } else if (Intrinsics.m88377d(str, SvipWeeklyReportItem.ITEM_TYPE_CHATWITH)) {
            String str2 = svipWeeklyItem.otherUserId;
            str2.getClass();
            m139224o(act, str2);
            map.put("report_module_friend", svipWeeklyItem.otherUserId);
        } else if (Intrinsics.m88377d(str, SvipWeeklyReportItem.ITEM_TYPE_CARE)) {
            String str3 = svipWeeklyItem.otherUserId;
            str3.getClass();
            m139220k(act, str3);
            map.put("report_module_icare", svipWeeklyItem.otherUserId);
        }
        i4g0.m138521s("e_svip_report_module", "p_meet", map);
    }

    /* JADX INFO: renamed from: m */
    public final void m139222m(Act act) {
        if (NullChecker.m82486a(CoreModule.f18264c.m32487o3()) && CoreModule.f18264c.m32487o3().likersLimit.remaining > 0) {
            act.startActivity(LikersAct.m57727Y1(act, ""));
        } else {
            CoreModule.m30930K().showSeeDialog(act, null, abb0.m96736c("p_navigation_see,card_button_pull", 1));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m139223n(Act act) {
        act.startActivity(CoreModule.m30930K().getMainWithNav(act, NavigationIntent.get(NavigationIntent.menu)));
    }

    /* JADX INFO: renamed from: o */
    public final void m139224o(Act act, String uid) {
        if (CoreModule.m30930K().mo31822sg(uid)) {
            act.startActivity(CoreModule.m30930K().startMessagesAct(act, uid, false, false));
        } else {
            act.startActivity(CoreModule.m30930K().getMainWithNav(act, NavigationIntent.get(NavigationIntent.menu)));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m139225p(Act act) {
        act.startActivity(MomentVisitorsAct.m58967Y1(act, CoreModule.f18264c.f20410n2.m121466L3(), "p_meet"));
    }
}
