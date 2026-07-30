package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.mainland;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.thl;
import v.VImage;
import v.VMarqueeText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00105\u001a\u00020\"8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u0010$\u001a\u0004\b3\u0010&\"\u0004\b4\u0010(¨\u00066"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardTopNoticeView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;", "leaderBoard", "", "i0", "(Lcom/p1/mobile/putong/live/base/data/BLiveHourLeaderBoard;)Z", "", "Lcom/p1/mobile/putong/live/base/data/BLiveCurrentHourNotices;", "noticesList", "j0", "(Ljava/util/List;)Z", "Landroid/view/View;", "view", "h0", "(Landroid/view/View;)V", "d", "Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardTopNoticeView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardTopNoticeView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/increment/leaderboard/hourleaderboard/mainland/HourBoardTopNoticeView;)V", "_root", "Lv/VImage;", "e", "Lv/VImage;", "get_left_icon", "()Lv/VImage;", "set_left_icon", "(Lv/VImage;)V", "_left_icon", "Lv/VMarqueeText;", "f", "Lv/VMarqueeText;", "get_marqueeText", "()Lv/VMarqueeText;", "set_marqueeText", "(Lv/VMarqueeText;)V", "_marqueeText", "g", "get_right_icon", "set_right_icon", "_right_icon", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class HourBoardTopNoticeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public HourBoardTopNoticeView _root;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _left_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VMarqueeText _marqueeText;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VImage _right_icon;

    public /* synthetic */ HourBoardTopNoticeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @NotNull
    public final VImage get_left_icon() {
        VImage vImage = this._left_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_left_icon");
        return null;
    }

    @NotNull
    public final VMarqueeText get_marqueeText() {
        VMarqueeText vMarqueeText = this._marqueeText;
        if (vMarqueeText != null) {
            return vMarqueeText;
        }
        Intrinsics.r("_marqueeText");
        return null;
    }

    @NotNull
    public final VImage get_right_icon() {
        VImage vImage = this._right_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_right_icon");
        return null;
    }

    @NotNull
    public final HourBoardTopNoticeView get_root() {
        HourBoardTopNoticeView hourBoardTopNoticeView = this._root;
        if (hourBoardTopNoticeView != null) {
            return hourBoardTopNoticeView;
        }
        Intrinsics.r("_root");
        return null;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8487h0(View view) {
        thl.m22962a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public final boolean m8488i0(@Nullable BLiveHourLeaderBoard leaderBoard) {
        if (leaderBoard != null) {
            if (leaderBoard.notices.size() > 0) {
                xdl0.M(this, true);
                get_marqueeText().setText(((BLiveCurrentHourNotices) leaderBoard.notices.get(0)).content);
                get_marqueeText().setSingleLine(true);
                get_marqueeText().setEllipsize(TextUtils.TruncateAt.MARQUEE);
                get_marqueeText().setHorizontallyScrolling(true);
                get_marqueeText().setMarqueeRepeatLimit(-1);
                return true;
            }
            xdl0.M(this, false);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final boolean m8489j0(@NotNull List<BLiveCurrentHourNotices> noticesList) {
        noticesList.getClass();
        if (vwb.J(noticesList)) {
            xdl0.M(this, false);
            return false;
        }
        xdl0.M(this, true);
        get_marqueeText().setText(noticesList.get(0).content);
        get_marqueeText().setSingleLine(true);
        get_marqueeText().setEllipsize(TextUtils.TruncateAt.MARQUEE);
        get_marqueeText().setHorizontallyScrolling(true);
        get_marqueeText().setMarqueeRepeatLimit(-1);
        get_marqueeText().setGravity(17);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8487h0(this);
    }

    public final void set_left_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._left_icon = vImage;
    }

    public final void set_marqueeText(@NotNull VMarqueeText vMarqueeText) {
        vMarqueeText.getClass();
        this._marqueeText = vMarqueeText;
    }

    public final void set_right_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._right_icon = vImage;
    }

    public final void set_root(@NotNull HourBoardTopNoticeView hourBoardTopNoticeView) {
        hourBoardTopNoticeView.getClass();
        this._root = hourBoardTopNoticeView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardTopNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardTopNoticeView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HourBoardTopNoticeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
