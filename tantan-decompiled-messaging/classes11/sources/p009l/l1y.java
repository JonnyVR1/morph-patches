package p009l;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedSvipWeeklyItemData;
import com.p1.mobile.putong.core.data.SvipWeeklyReportItem;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.core.ui.visitor.MomentVisitorsAct;
import com.p1.mobile.putong.data.NavigationIntent;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.b3c0;
import l.d30;
import l.qib0;
import l.t100;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J'\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010#\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b'\u0010&J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010&J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001dH\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001dH\u0002¢\u0006\u0004\b,\u0010+¨\u0006-"}, d2 = {"Ll/l1y;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData$SvipWeeklyItem;", "weeklyItems", "Lv/VLinear;", "root", "", "j", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Lv/VLinear;)V", "Landroid/widget/LinearLayout;", "h", "(Lcom/p1/mobile/android/app/Act;)Landroid/widget/LinearLayout;", "Landroid/widget/LinearLayout$LayoutParams;", "g", "()Landroid/widget/LinearLayout$LayoutParams;", "svipWeeklyItem", "layoutParams", "Landroid/view/View;", "c", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData$SvipWeeklyItem;Landroid/widget/LinearLayout$LayoutParams;)Landroid/view/View;", "e", "i", "d", "(Lcom/p1/mobile/android/app/Act;)Landroid/view/View;", "", "numberValue", "unit", "Landroid/text/SpannableStringBuilder;", "f", "(Ljava/lang/String;Ljava/lang/String;)Landroid/text/SpannableStringBuilder;", "l", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData$SvipWeeklyItem;)V", "p", "(Lcom/p1/mobile/android/app/Act;)V", "m", "n", Oauth2AccessToken.KEY_UID, "o", "(Lcom/p1/mobile/android/app/Act;Ljava/lang/String;)V", "k", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class l1y {

    @NotNull
    public static final l1y INSTANCE = new l1y();

    /* JADX INFO: renamed from: a */
    public static void m17632a(Act act, MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem, View view) {
        INSTANCE.m17643l(act, svipWeeklyItem);
    }

    /* JADX INFO: renamed from: b */
    public static void m17633b(Act act, MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem, View view) {
        INSTANCE.m17643l(act, svipWeeklyItem);
    }

    /* JADX INFO: renamed from: c */
    public final View m17634c(Act act, MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem, LinearLayout.LayoutParams layoutParams) {
        int i = svipWeeklyItem.svipWeeklyItemRenderType;
        if (i != 1) {
            return i != 2 ? new View(act) : m17640i(act, svipWeeklyItem, layoutParams);
        }
        return m17636e(act, svipWeeklyItem, layoutParams);
    }

    /* JADX INFO: renamed from: d */
    public final View m17635d(Act act) {
        View view = new View(act);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(t100.c, t100.o);
        layoutParams.gravity = 16;
        view.setLayoutParams(layoutParams);
        view.setBackgroundResource(b3c0.u5);
        return view;
    }

    /* JADX INFO: renamed from: e */
    public final View m17636e(final Act act, final MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem, LinearLayout.LayoutParams layoutParams) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        ImageView imageView = new ImageView(act);
        int i = t100.s;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = t100.m;
        imageView.setLayoutParams(layoutParams2);
        imageView.setImageResource(svipWeeklyItem.iconRes);
        VText vText = new VText(act);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = t100.d(13.0f);
        vText.setLayoutParams(layoutParams3);
        vText.setTextSize(10.0f);
        vText.setTextColor(Color.parseColor("#CCBB4300"));
        vText.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        vText.setEllipsize(truncateAt);
        vText.getPaint().setFakeBoldText(true);
        String str = svipWeeklyItem.numberValue;
        str.getClass();
        vText.setText(m17637f(str, "人"));
        VText vText2 = new VText(act);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.gravity = 1;
        layoutParams4.topMargin = t100.d(4.0f);
        vText2.setLayoutParams(layoutParams4);
        vText2.setTextSize(12.0f);
        vText2.setTextColor(Color.parseColor("#4dAB3D00"));
        vText2.setMaxLines(1);
        vText2.setEllipsize(truncateAt);
        vText2.setText(svipWeeklyItem.lable);
        linearLayout.addView(imageView);
        linearLayout.addView(vText);
        linearLayout.addView(vText2);
        xdl0.E0(linearLayout, new View.OnClickListener() { // from class: l.k1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l1y.m17632a(act, svipWeeklyItem, view);
            }
        });
        return linearLayout;
    }

    /* JADX INFO: renamed from: f */
    public final SpannableStringBuilder m17637f(String numberValue, String unit) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) numberValue);
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(20, true), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) unit);
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: g */
    public final LinearLayout.LayoutParams m17638g() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, t100.d(110.0f));
        layoutParams.weight = 1.0f;
        return layoutParams;
    }

    /* JADX INFO: renamed from: h */
    public final LinearLayout m17639h(Act act) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, t100.d(110.0f)));
        return linearLayout;
    }

    /* JADX INFO: renamed from: i */
    public final View m17640i(final Act act, final MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem, LinearLayout.LayoutParams layoutParams) {
        LinearLayout linearLayout = new LinearLayout(act);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(layoutParams);
        View vDraweeView = new VDraweeView(act);
        int i = t100.s;
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i, i);
        layoutParams2.gravity = 1;
        layoutParams2.topMargin = t100.m;
        vDraweeView.setLayoutParams(layoutParams2);
        vDraweeView.getHierarchy().H(RoundingParams.a());
        qib0.G.I0(vDraweeView, svipWeeklyItem.userImgUrl, i, i);
        VText vText = new VText(act);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 1;
        layoutParams3.topMargin = t100.d(16.0f);
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
        layoutParams4.topMargin = t100.d(4.0f);
        vText2.setLayoutParams(layoutParams4);
        vText2.setTextSize(12.0f);
        vText2.setTextColor(Color.parseColor("#4dAB3D00"));
        vText2.setMaxLines(1);
        vText2.setEllipsize(truncateAt);
        vText2.setText(svipWeeklyItem.lable);
        linearLayout.addView(vDraweeView);
        linearLayout.addView(vText);
        linearLayout.addView(vText2);
        xdl0.E0(linearLayout, new View.OnClickListener() { // from class: l.j1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                l1y.m17633b(act, svipWeeklyItem, view);
            }
        });
        return linearLayout;
    }

    /* JADX INFO: renamed from: j */
    public final void m17641j(@NotNull Act act, @NotNull List<? extends MeetFeedSvipWeeklyItemData.SvipWeeklyItem> weeklyItems, @NotNull VLinear root) {
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
                l1y l1yVar = INSTANCE;
                LinearLayout linearLayoutM17639h = l1yVar.m17639h(act);
                if (linearLayoutM17639h == null) {
                    Intrinsics.r("rows");
                    linearLayout2 = null;
                } else {
                    linearLayout2 = linearLayoutM17639h;
                }
                linearLayout2.addView(l1yVar.m17634c(act, svipWeeklyItem, l1yVar.m17638g()));
                if (i == weeklyItems.size() - 1) {
                    View view = new View(act);
                    view.setLayoutParams(l1yVar.m17638g());
                    View viewM17635d = l1yVar.m17635d(act);
                    viewM17635d.setVisibility(4);
                    linearLayoutM17639h.addView(viewM17635d);
                    linearLayoutM17639h.addView(view);
                }
                root.addView(linearLayoutM17639h);
                linearLayout3 = linearLayoutM17639h;
            } else {
                if (linearLayout3 == null) {
                    Intrinsics.r("rows");
                    linearLayout = null;
                } else {
                    linearLayout = linearLayout3;
                }
                l1y l1yVar2 = INSTANCE;
                linearLayout.addView(l1yVar2.m17635d(act));
                linearLayout3.addView(l1yVar2.m17634c(act, svipWeeklyItem, l1yVar2.m17638g()));
            }
            i = i2;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m17642k(Act act, String uid) {
        if (CoreModule.K().sg(uid)) {
            act.startActivity(CoreModule.K().startMessagesAct(act, uid, false, false));
        } else {
            act.startActivity(CoreModule.K().getMainWithNav(act, NavigationIntent.get("menu")));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m17643l(Act act, MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem) {
        HashMap map = new HashMap();
        String str = svipWeeklyItem.itemType;
        if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_VISITOR)) {
            m17647p(act);
            map.put("report_module_see", svipWeeklyItem.numberValue);
        } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_LIKERS)) {
            m17644m(act);
            map.put("report_module_like", svipWeeklyItem.numberValue);
        } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_NEW_MATCH)) {
            m17645n(act);
            map.put("report_module_match", svipWeeklyItem.numberValue);
        } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_CHATWITH)) {
            String str2 = svipWeeklyItem.otherUserId;
            str2.getClass();
            m17646o(act, str2);
            map.put("report_module_friend", svipWeeklyItem.otherUserId);
        } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_CARE)) {
            String str3 = svipWeeklyItem.otherUserId;
            str3.getClass();
            m17642k(act, str3);
            map.put("report_module_icare", svipWeeklyItem.otherUserId);
        }
        zvf0.s("e_svip_report_module", "p_meet", map);
    }

    /* JADX INFO: renamed from: m */
    public final void m17644m(Act act) {
        if (NullChecker.a(CoreModule.c.o3()) && CoreModule.c.o3().likersLimit.remaining > 0) {
            act.startActivity(LikersAct.X1(act, ""));
        } else {
            CoreModule.K().showSeeDialog(act, (d30) null, w2b0.m23782c("p_navigation_see,card_button_pull", 1));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m17645n(Act act) {
        act.startActivity(CoreModule.K().getMainWithNav(act, NavigationIntent.get("menu")));
    }

    /* JADX INFO: renamed from: o */
    public final void m17646o(Act act, String uid) {
        if (CoreModule.K().sg(uid)) {
            act.startActivity(CoreModule.K().startMessagesAct(act, uid, false, false));
        } else {
            act.startActivity(CoreModule.K().getMainWithNav(act, NavigationIntent.get("menu")));
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m17647p(Act act) {
        act.startActivity(MomentVisitorsAct.X1(act, CoreModule.c.n2.L3(), "p_meet"));
    }
}
