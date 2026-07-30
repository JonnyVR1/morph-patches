package com.p046p1.mobile.putong.core.newui.profile.newme;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.p053ui.settings.AgeRangeSeekBar;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VText;
import p149l.o7r;
import p149l.xdl0;
import p149l.y7c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u0017J\u0015\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001e\u0010\u001dR\"\u0010%\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00101\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010(\u001a\u0004\b/\u0010*\"\u0004\b0\u0010,R\"\u00108\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010<\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b9\u0010(\u001a\u0004\b:\u0010*\"\u0004\b;\u0010,R\"\u0010@\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u00103\u001a\u0004\b>\u00105\"\u0004\b?\u00107R\"\u0010H\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010L\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010(\u001a\u0004\bJ\u0010*\"\u0004\bK\u0010,R\"\u0010P\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bM\u00103\u001a\u0004\bN\u00105\"\u0004\bO\u00107R\"\u0010X\u001a\u00020Q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010 \u001a\u0004\bZ\u0010\"\"\u0004\b[\u0010$R\"\u0010`\u001a\u00020\u001f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b]\u0010 \u001a\u0004\b^\u0010\"\"\u0004\b_\u0010$R\"\u0010d\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\ba\u0010(\u001a\u0004\bb\u0010*\"\u0004\bc\u0010,R\"\u0010h\u001a\u00020A8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\be\u0010C\u001a\u0004\bf\u0010E\"\u0004\bg\u0010GR\"\u0010l\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bi\u0010(\u001a\u0004\bj\u0010*\"\u0004\bk\u0010,R\"\u0010p\u001a\u00020\u00018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bm\u00103\u001a\u0004\bn\u00105\"\u0004\bo\u00107R\"\u0010x\u001a\u00020q8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\br\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010w¨\u0006y"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/DatingViewLayout;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "att", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "a", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "title", "", "setLocationTitle", "(Ljava/lang/String;)V", "current", "setLocationCurrent", "Landroid/view/View$OnClickListener;", "clickListener", "setLocationClick", "(Landroid/view/View$OnClickListener;)V", "setAutoDistanceClick", "Lv/VFrame;", "Lv/VFrame;", "get_my_location", "()Lv/VFrame;", "set_my_location", "(Lv/VFrame;)V", "_my_location", "Lv/VText;", "b", "Lv/VText;", "get_my_location_location_title", "()Lv/VText;", "set_my_location_location_title", "(Lv/VText;)V", "_my_location_location_title", "c", "get_my_location_current", "set_my_location_current", "_my_location_current", Constants.INAPP_DATA_TAG, "Landroid/widget/LinearLayout;", "get_ll_no_location_permission_tips", "()Landroid/widget/LinearLayout;", "set_ll_no_location_permission_tips", "(Landroid/widget/LinearLayout;)V", "_ll_no_location_permission_tips", "e", "get_ll_no_location_permission_tips_text", "set_ll_no_location_permission_tips_text", "_ll_no_location_permission_tips_text", "f", "get_base_setting", "set_base_setting", "_base_setting", "Landroid/widget/FrameLayout;", "g", "Landroid/widget/FrameLayout;", "get_distance_info_base", "()Landroid/widget/FrameLayout;", "set_distance_info_base", "(Landroid/widget/FrameLayout;)V", "_distance_info_base", "h", "get_distance_text_base", "set_distance_text_base", "_distance_text_base", RXScreenCaptureService.KEY_INDEX, "get_distance_bar_ll_base", "set_distance_bar_ll_base", "_distance_bar_ll_base", "Landroid/widget/SeekBar;", "j", "Landroid/widget/SeekBar;", "get_search_distance_base", "()Landroid/widget/SeekBar;", "set_search_distance_base", "(Landroid/widget/SeekBar;)V", "_search_distance_base", "k", "get_auto_distance_base", "set_auto_distance_base", "_auto_distance_base", BLiveStormDanmakuGiftResourceType.f44444l, "get_show_gender_base", "set_show_gender_base", "_show_gender_base", "m", "get_show_gender_base_text_base", "set_show_gender_base_text_base", "_show_gender_base_text_base", "n", "get_age_fl_base", "set_age_fl_base", "_age_fl_base", "o", "get_age_text_base", "set_age_text_base", "_age_text_base", "p", "get_age_bar_ll_base", "set_age_bar_ll_base", "_age_bar_ll_base", "Lcom/p1/mobile/putong/core/ui/settings/AgeRangeSeekBar;", "q", "Lcom/p1/mobile/putong/core/ui/settings/AgeRangeSeekBar;", "get_show_ages_base", "()Lcom/p1/mobile/putong/core/ui/settings/AgeRangeSeekBar;", "set_show_ages_base", "(Lcom/p1/mobile/putong/core/ui/settings/AgeRangeSeekBar;)V", "_show_ages_base", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class DatingViewLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VFrame _my_location;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VText _my_location_location_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _my_location_current;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public LinearLayout _ll_no_location_permission_tips;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _ll_no_location_permission_tips_text;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public LinearLayout _base_setting;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public FrameLayout _distance_info_base;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _distance_text_base;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public LinearLayout _distance_bar_ll_base;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public SeekBar _search_distance_base;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VFrame _auto_distance_base;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public VFrame _show_gender_base;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public VText _show_gender_base_text_base;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public FrameLayout _age_fl_base;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public VText _age_text_base;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public LinearLayout _age_bar_ll_base;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public AgeRangeSeekBar _show_ages_base;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DatingViewLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m43268a(layoutInflaterM163037a, this);
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final View m43268a(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM213312b = y7c.m213312b(this, inflater, parent);
        viewM213312b.getClass();
        return viewM213312b;
    }

    @NotNull
    public final LinearLayout get_age_bar_ll_base() {
        LinearLayout linearLayout = this._age_bar_ll_base;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_age_bar_ll_base");
        return null;
    }

    @NotNull
    public final FrameLayout get_age_fl_base() {
        FrameLayout frameLayout = this._age_fl_base;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_age_fl_base");
        return null;
    }

    @NotNull
    public final VText get_age_text_base() {
        VText vText = this._age_text_base;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_age_text_base");
        return null;
    }

    @NotNull
    public final VFrame get_auto_distance_base() {
        VFrame vFrame = this._auto_distance_base;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_auto_distance_base");
        return null;
    }

    @NotNull
    public final LinearLayout get_base_setting() {
        LinearLayout linearLayout = this._base_setting;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_base_setting");
        return null;
    }

    @NotNull
    public final LinearLayout get_distance_bar_ll_base() {
        LinearLayout linearLayout = this._distance_bar_ll_base;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_distance_bar_ll_base");
        return null;
    }

    @NotNull
    public final FrameLayout get_distance_info_base() {
        FrameLayout frameLayout = this._distance_info_base;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_distance_info_base");
        return null;
    }

    @NotNull
    public final VText get_distance_text_base() {
        VText vText = this._distance_text_base;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_distance_text_base");
        return null;
    }

    @NotNull
    public final LinearLayout get_ll_no_location_permission_tips() {
        LinearLayout linearLayout = this._ll_no_location_permission_tips;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_ll_no_location_permission_tips");
        return null;
    }

    @NotNull
    public final VText get_ll_no_location_permission_tips_text() {
        VText vText = this._ll_no_location_permission_tips_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_ll_no_location_permission_tips_text");
        return null;
    }

    @NotNull
    public final VFrame get_my_location() {
        VFrame vFrame = this._my_location;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_my_location");
        return null;
    }

    @NotNull
    public final VText get_my_location_current() {
        VText vText = this._my_location_current;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_my_location_current");
        return null;
    }

    @NotNull
    public final VText get_my_location_location_title() {
        VText vText = this._my_location_location_title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_my_location_location_title");
        return null;
    }

    @NotNull
    public final SeekBar get_search_distance_base() {
        SeekBar seekBar = this._search_distance_base;
        if (seekBar != null) {
            return seekBar;
        }
        Intrinsics.m87502r("_search_distance_base");
        return null;
    }

    @NotNull
    public final AgeRangeSeekBar get_show_ages_base() {
        AgeRangeSeekBar ageRangeSeekBar = this._show_ages_base;
        if (ageRangeSeekBar != null) {
            return ageRangeSeekBar;
        }
        Intrinsics.m87502r("_show_ages_base");
        return null;
    }

    @NotNull
    public final VFrame get_show_gender_base() {
        VFrame vFrame = this._show_gender_base;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_show_gender_base");
        return null;
    }

    @NotNull
    public final VText get_show_gender_base_text_base() {
        VText vText = this._show_gender_base_text_base;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_show_gender_base_text_base");
        return null;
    }

    public final void setAutoDistanceClick(@NotNull View.OnClickListener clickListener) {
        clickListener.getClass();
        get_auto_distance_base().setOnClickListener(clickListener);
    }

    public final void setLocationClick(@NotNull View.OnClickListener clickListener) {
        clickListener.getClass();
        xdl0.m208329E0(get_my_location(), clickListener);
    }

    public final void setLocationCurrent(@Nullable String current) {
        if (NullChecker.m81303a(get_my_location_current())) {
            get_my_location_current().setText(current);
        }
    }

    public final void setLocationTitle(@Nullable String title) {
        if (NullChecker.m81303a(get_my_location_location_title())) {
            get_my_location_location_title().setText(title);
        }
    }

    public final void set_age_bar_ll_base(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._age_bar_ll_base = linearLayout;
    }

    public final void set_age_fl_base(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._age_fl_base = frameLayout;
    }

    public final void set_age_text_base(@NotNull VText vText) {
        vText.getClass();
        this._age_text_base = vText;
    }

    public final void set_auto_distance_base(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._auto_distance_base = vFrame;
    }

    public final void set_base_setting(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._base_setting = linearLayout;
    }

    public final void set_distance_bar_ll_base(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._distance_bar_ll_base = linearLayout;
    }

    public final void set_distance_info_base(@NotNull FrameLayout frameLayout) {
        frameLayout.getClass();
        this._distance_info_base = frameLayout;
    }

    public final void set_distance_text_base(@NotNull VText vText) {
        vText.getClass();
        this._distance_text_base = vText;
    }

    public final void set_ll_no_location_permission_tips(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._ll_no_location_permission_tips = linearLayout;
    }

    public final void set_ll_no_location_permission_tips_text(@NotNull VText vText) {
        vText.getClass();
        this._ll_no_location_permission_tips_text = vText;
    }

    public final void set_my_location(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._my_location = vFrame;
    }

    public final void set_my_location_current(@NotNull VText vText) {
        vText.getClass();
        this._my_location_current = vText;
    }

    public final void set_my_location_location_title(@NotNull VText vText) {
        vText.getClass();
        this._my_location_location_title = vText;
    }

    public final void set_search_distance_base(@NotNull SeekBar seekBar) {
        seekBar.getClass();
        this._search_distance_base = seekBar;
    }

    public final void set_show_ages_base(@NotNull AgeRangeSeekBar ageRangeSeekBar) {
        ageRangeSeekBar.getClass();
        this._show_ages_base = ageRangeSeekBar;
    }

    public final void set_show_gender_base(@NotNull VFrame vFrame) {
        vFrame.getClass();
        this._show_gender_base = vFrame;
    }

    public final void set_show_gender_base_text_base(@NotNull VText vText) {
        vText.getClass();
        this._show_gender_base_text_base = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatingViewLayout(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatingViewLayout(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
