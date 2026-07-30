package com.p000p1.mobile.putong.core.newui.newmeet.feed.weekly;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.weekly.MeetFeedSvipWeeklyItemView;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedSvipWeeklyItemData;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.SvipWeeklyReportItem;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import l.b3c0;
import l.d30;
import l.e30;
import l.j760;
import l.p1y;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.l1y;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0014J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0014J\u000f\u0010\u0019\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0019\u0010\u0014J\u001d\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0014¢\u0006\u0004\b \u0010\u0014J\u000f\u0010!\u001a\u00020\fH\u0014¢\u0006\u0004\b!\u0010\u0014R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010<\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R\"\u0010?\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010,\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R\"\u0010F\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\"\u0010I\u001a\u00020@8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010A\u001a\u0004\bG\u0010C\"\u0004\bH\u0010ER\"\u0010L\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u00104\u001a\u0004\bJ\u00106\"\u0004\bK\u00108R\"\u0010O\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u00104\u001a\u0004\bM\u00106\"\u0004\bN\u00108R\u001a\u0010S\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0018\u0010P\u001a\u0004\bQ\u0010RR\u001a\u0010U\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\b\u0017\u0010P\u001a\u0004\bT\u0010RR\u001a\u0010X\u001a\u00020\u00068\u0006X\u0086D¢\u0006\f\n\u0004\bV\u0010P\u001a\u0004\bW\u0010RR\"\u0010]\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010P\u001a\u0004\bZ\u0010R\"\u0004\b[\u0010\\R\"\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\"\u0010\u001d\u001a\u00020\u001c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010u\u001a\u00020j8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\br\u0010l\u001a\u0004\bs\u0010n\"\u0004\bt\u0010pR\"\u0010}\u001a\u00020v8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|¨\u0006~"}, d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/feed/weekly/MeetFeedSvipWeeklyItemView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", "view", "", "d", "(Landroid/view/View;)V", "Lcom/p1/mobile/android/app/Act;", "act", "g", "(Lcom/p1/mobile/android/app/Act;)V", "h", "()V", "f", "e", "k", "j", "onFinishInflate", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;", "weeklyItemData", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFragPresenter;", "presenter", "i", "(Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFragPresenter;)V", "onDetachedFromWindow", "onAttachedToWindow", "Landroid/widget/RelativeLayout;", "a", "Landroid/widget/RelativeLayout;", "get_header_container", "()Landroid/widget/RelativeLayout;", "set_header_container", "(Landroid/widget/RelativeLayout;)V", "_header_container", "Landroid/widget/ImageView;", "b", "Landroid/widget/ImageView;", "get_header_privilege_ic", "()Landroid/widget/ImageView;", "set_header_privilege_ic", "(Landroid/widget/ImageView;)V", "_header_privilege_ic", "Lv/VText;", "c", "Lv/VText;", "get_header_title", "()Lv/VText;", "set_header_title", "(Lv/VText;)V", "_header_title", "get_header_subtitle", "set_header_subtitle", "_header_subtitle", "get_header_arrow_ic", "set_header_arrow_ic", "_header_arrow_ic", "Lv/VLinear;", "Lv/VLinear;", "get_weekly_content_container", "()Lv/VLinear;", "set_weekly_content_container", "(Lv/VLinear;)V", "_weekly_content_container", "get_weekly_content_root", "set_weekly_content_root", "_weekly_content_root", "get_svip_renew_btn", "set_svip_renew_btn", "_svip_renew_btn", "get_odiamond_buy_btn", "set_odiamond_buy_btn", "_odiamond_buy_btn", "I", "getARROW_STATE_TYPE_UN_INITIALIZED", "()I", "ARROW_STATE_TYPE_UN_INITIALIZED", "getARROW_STATE_TYPE_COLLAPSE", "ARROW_STATE_TYPE_COLLAPSE", "l", "getARROW_STATE_TYPE_EXPAND", "ARROW_STATE_TYPE_EXPAND", "m", "getCurArrowState", "setCurArrowState", "(I)V", "curArrowState", "n", "Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;", "getWeeklyItemData", "()Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;", "setWeeklyItemData", "(Lcom/p1/mobile/putong/core/businessdata/meet/MeetFeedSvipWeeklyItemData;)V", "o", "Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFragPresenter;", "getPresenter", "()Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFragPresenter;", "setPresenter", "(Lcom/p1/mobile/putong/core/newui/newmeet/frag/meet/NewMeetFragPresenter;)V", "", "p", "Z", "getHasInitedWeeklyItem", "()Z", "setHasInitedWeeklyItem", "(Z)V", "hasInitedWeeklyItem", "q", "getHasReportedMv", "setHasReportedMv", "hasReportedMv", "", "r", "J", "getLastReportedMvTime", "()J", "setLastReportedMvTime", "(J)V", "lastReportedMvTime", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension
public final class MeetFeedSvipWeeklyItemView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public RelativeLayout _header_container;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ImageView _header_privilege_ic;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _header_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _header_subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ImageView _header_arrow_ic;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _weekly_content_container;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VLinear _weekly_content_root;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _svip_renew_btn;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VText _odiamond_buy_btn;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final int ARROW_STATE_TYPE_UN_INITIALIZED;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int ARROW_STATE_TYPE_COLLAPSE;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public final int ARROW_STATE_TYPE_EXPAND;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int curArrowState;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public MeetFeedSvipWeeklyItemData weeklyItemData;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public NewMeetFragPresenter presenter;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public boolean hasInitedWeeklyItem;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public boolean hasReportedMv;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public long lastReportedMvTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetFeedSvipWeeklyItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.ARROW_STATE_TYPE_COLLAPSE = 1;
        this.ARROW_STATE_TYPE_EXPAND = 2;
        this.curArrowState = this.ARROW_STATE_TYPE_UN_INITIALIZED;
    }

    /* JADX INFO: renamed from: a */
    public static void m7149a(MeetFeedSvipWeeklyItemView meetFeedSvipWeeklyItemView, View view) {
        meetFeedSvipWeeklyItemView.m7156h();
    }

    /* JADX INFO: renamed from: b */
    public static void m7150b(MeetFeedSvipWeeklyItemView meetFeedSvipWeeklyItemView, View view) {
        zvf0.r("e_svip_report_rebuy", "p_meet");
        Act act = meetFeedSvipWeeklyItemView.getPresenter().act();
        if (act != null) {
            CoreModule.P().a().pr(act, "p_meet,e_svip_report_rebuy,click", Privilege.see_who_likes_me);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m7151c(MeetFeedSvipWeeklyItemView meetFeedSvipWeeklyItemView, View view) {
        zvf0.r("e_svip_report_upgrade", "p_meet");
        Act act = meetFeedSvipWeeklyItemView.getPresenter().act();
        if (act != null) {
            CoreModule.P().g().Og(act, "p_meet,e_svip_report_upgrade,click", (e30) null, (d30) null, (d30) null, Privilege.oDiamondVisitor);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m7152d(View view) {
        p1y.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final void m7153e() {
        int i = this.curArrowState;
        int i2 = this.ARROW_STATE_TYPE_COLLAPSE;
        if (i == i2) {
            return;
        }
        this.curArrowState = i2;
        xdl0.M(get_weekly_content_container(), false);
        get_header_arrow_ic().setImageResource(b3c0.p5);
    }

    /* JADX INFO: renamed from: f */
    public final void m7154f() {
        int i = this.curArrowState;
        int i2 = this.ARROW_STATE_TYPE_EXPAND;
        if (i == i2) {
            return;
        }
        this.curArrowState = i2;
        xdl0.M(get_weekly_content_container(), true);
        get_header_arrow_ic().setImageResource(b3c0.q5);
        m7158j();
    }

    /* JADX INFO: renamed from: g */
    public final void m7155g(Act act) {
        if (act != null) {
            get_weekly_content_root().removeAllViews();
            this.hasInitedWeeklyItem = true;
            l1y l1yVar = l1y.INSTANCE;
            List<? extends MeetFeedSvipWeeklyItemData.SvipWeeklyItem> list = getWeeklyItemData().svipWeeklyItems;
            list.getClass();
            l1yVar.m17641j(act, list, get_weekly_content_root());
        }
    }

    public final int getARROW_STATE_TYPE_COLLAPSE() {
        return this.ARROW_STATE_TYPE_COLLAPSE;
    }

    public final int getARROW_STATE_TYPE_EXPAND() {
        return this.ARROW_STATE_TYPE_EXPAND;
    }

    public final int getARROW_STATE_TYPE_UN_INITIALIZED() {
        return this.ARROW_STATE_TYPE_UN_INITIALIZED;
    }

    public final int getCurArrowState() {
        return this.curArrowState;
    }

    public final boolean getHasInitedWeeklyItem() {
        return this.hasInitedWeeklyItem;
    }

    public final boolean getHasReportedMv() {
        return this.hasReportedMv;
    }

    public final long getLastReportedMvTime() {
        return this.lastReportedMvTime;
    }

    @NotNull
    public final NewMeetFragPresenter getPresenter() {
        NewMeetFragPresenter newMeetFragPresenter = this.presenter;
        if (newMeetFragPresenter != null) {
            return newMeetFragPresenter;
        }
        Intrinsics.r("presenter");
        return null;
    }

    @NotNull
    public final MeetFeedSvipWeeklyItemData getWeeklyItemData() {
        MeetFeedSvipWeeklyItemData meetFeedSvipWeeklyItemData = this.weeklyItemData;
        if (meetFeedSvipWeeklyItemData != null) {
            return meetFeedSvipWeeklyItemData;
        }
        Intrinsics.r("weeklyItemData");
        return null;
    }

    @NotNull
    public final ImageView get_header_arrow_ic() {
        ImageView imageView = this._header_arrow_ic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_header_arrow_ic");
        return null;
    }

    @NotNull
    public final RelativeLayout get_header_container() {
        RelativeLayout relativeLayout = this._header_container;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_header_container");
        return null;
    }

    @NotNull
    public final ImageView get_header_privilege_ic() {
        ImageView imageView = this._header_privilege_ic;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_header_privilege_ic");
        return null;
    }

    @NotNull
    public final VText get_header_subtitle() {
        VText vText = this._header_subtitle;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_header_subtitle");
        return null;
    }

    @NotNull
    public final VText get_header_title() {
        VText vText = this._header_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_header_title");
        return null;
    }

    @NotNull
    public final VText get_odiamond_buy_btn() {
        VText vText = this._odiamond_buy_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_odiamond_buy_btn");
        return null;
    }

    @NotNull
    public final VText get_svip_renew_btn() {
        VText vText = this._svip_renew_btn;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_svip_renew_btn");
        return null;
    }

    @NotNull
    public final VLinear get_weekly_content_container() {
        VLinear vLinear = this._weekly_content_container;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_weekly_content_container");
        return null;
    }

    @NotNull
    public final VLinear get_weekly_content_root() {
        VLinear vLinear = this._weekly_content_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.r("_weekly_content_root");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m7156h() {
        String str;
        int i = this.curArrowState;
        if (i == this.ARROW_STATE_TYPE_COLLAPSE) {
            m7154f();
            str = "open";
        } else if (i == this.ARROW_STATE_TYPE_EXPAND) {
            m7153e();
            str = "close";
        } else {
            str = "";
        }
        zvf0.u("e_svip_weekly_report", "p_meet", new j760[]{vwb.Y("action", str)});
    }

    /* JADX INFO: renamed from: i */
    public final void m7157i(@NotNull MeetFeedSvipWeeklyItemData weeklyItemData, @NotNull NewMeetFragPresenter presenter) {
        weeklyItemData.getClass();
        presenter.getClass();
        if (this.weeklyItemData != null && !Intrinsics.d(getWeeklyItemData(), weeklyItemData)) {
            this.hasInitedWeeklyItem = false;
        }
        setWeeklyItemData(weeklyItemData);
        setPresenter(presenter);
        if (!this.hasInitedWeeklyItem) {
            m7155g(getPresenter().act());
        }
        if (this.curArrowState == this.ARROW_STATE_TYPE_UN_INITIALIZED) {
            if (Intrinsics.d("svip_weekly_report", presenter.getFrom())) {
                m7154f();
            } else {
                m7153e();
            }
        }
        m7159k();
        get_header_title().setText(TextUtils.isEmpty(getWeeklyItemData().title) ? "SVIP会员周报" : getWeeklyItemData().title);
        get_header_subtitle().setText(TextUtils.isEmpty(getWeeklyItemData().subTitle) ? "尊敬的会员，你的探探周报更新啦" : getWeeklyItemData().subTitle);
        xdl0.E0(get_header_arrow_ic(), new View.OnClickListener() { // from class: l.m1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetFeedSvipWeeklyItemView.m7149a(this.f16488a, view);
            }
        });
        xdl0.E0(get_svip_renew_btn(), new View.OnClickListener() { // from class: l.n1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetFeedSvipWeeklyItemView.m7150b(this.f17197a, view);
            }
        });
        xdl0.E0(get_odiamond_buy_btn(), new View.OnClickListener() { // from class: l.o1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetFeedSvipWeeklyItemView.m7151c(this.f17802a, view);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m7158j() {
        HashMap map = new HashMap();
        List<MeetFeedSvipWeeklyItemData.SvipWeeklyItem> list = getWeeklyItemData().svipWeeklyItems;
        list.getClass();
        for (MeetFeedSvipWeeklyItemData.SvipWeeklyItem svipWeeklyItem : list) {
            String str = svipWeeklyItem.itemType;
            if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_VISITOR)) {
                map.put("report_module_see", svipWeeklyItem.numberValue);
            } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_LIKERS)) {
                map.put("report_module_like", svipWeeklyItem.numberValue);
            } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_NEW_MATCH)) {
                map.put("report_module_match", svipWeeklyItem.numberValue);
            } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_CHATWITH)) {
                map.put("report_module_friend", svipWeeklyItem.otherUserId);
            } else if (Intrinsics.d(str, SvipWeeklyReportItem.ITEM_TYPE_CARE)) {
                map.put("report_module_icare", svipWeeklyItem.otherUserId);
            }
        }
        zvf0.y("e_svip_report_module", "p_meet", map);
    }

    /* JADX INFO: renamed from: k */
    public final void m7159k() {
        String str;
        if (this.hasReportedMv) {
            return;
        }
        int i = this.curArrowState;
        if (i == this.ARROW_STATE_TYPE_COLLAPSE) {
            str = "close";
        } else {
            str = i == this.ARROW_STATE_TYPE_EXPAND ? "open" : "";
        }
        zvf0.A("e_svip_weekly_report", "p_meet", new j760[]{vwb.Y("action", str)});
        this.hasReportedMv = true;
        this.lastReportedMvTime = System.currentTimeMillis();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m7159k();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (System.currentTimeMillis() - this.lastReportedMvTime > 1000) {
            this.hasReportedMv = false;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7152d(this);
        get_header_title().getPaint().setFakeBoldText(true);
        get_svip_renew_btn().getPaint().setFakeBoldText(true);
        get_odiamond_buy_btn().getPaint().setFakeBoldText(true);
    }

    public final void setCurArrowState(int i) {
        this.curArrowState = i;
    }

    public final void setHasInitedWeeklyItem(boolean z) {
        this.hasInitedWeeklyItem = z;
    }

    public final void setHasReportedMv(boolean z) {
        this.hasReportedMv = z;
    }

    public final void setLastReportedMvTime(long j) {
        this.lastReportedMvTime = j;
    }

    public final void setPresenter(@NotNull NewMeetFragPresenter newMeetFragPresenter) {
        newMeetFragPresenter.getClass();
        this.presenter = newMeetFragPresenter;
    }

    public final void setWeeklyItemData(@NotNull MeetFeedSvipWeeklyItemData meetFeedSvipWeeklyItemData) {
        meetFeedSvipWeeklyItemData.getClass();
        this.weeklyItemData = meetFeedSvipWeeklyItemData;
    }

    public final void set_header_arrow_ic(@NotNull ImageView imageView) {
        imageView.getClass();
        this._header_arrow_ic = imageView;
    }

    public final void set_header_container(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._header_container = relativeLayout;
    }

    public final void set_header_privilege_ic(@NotNull ImageView imageView) {
        imageView.getClass();
        this._header_privilege_ic = imageView;
    }

    public final void set_header_subtitle(@NotNull VText vText) {
        vText.getClass();
        this._header_subtitle = vText;
    }

    public final void set_header_title(@NotNull VText vText) {
        vText.getClass();
        this._header_title = vText;
    }

    public final void set_odiamond_buy_btn(@NotNull VText vText) {
        vText.getClass();
        this._odiamond_buy_btn = vText;
    }

    public final void set_svip_renew_btn(@NotNull VText vText) {
        vText.getClass();
        this._svip_renew_btn = vText;
    }

    public final void set_weekly_content_container(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._weekly_content_container = vLinear;
    }

    public final void set_weekly_content_root(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._weekly_content_root = vLinear;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetFeedSvipWeeklyItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetFeedSvipWeeklyItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ MeetFeedSvipWeeklyItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
