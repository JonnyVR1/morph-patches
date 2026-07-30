package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p1.mobile.putong.live.base.data.BLiveCurrentHourNotices;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.vwb;
import l.xdl0;
import org.jetbrains.annotations.Nullable;
import p002l.dfl;
import p002l.whl;
import v.VImage;
import v.VMarqueeText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HourHeadersView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public HourHeadersView f6643d;

    /* JADX INFO: renamed from: e */
    public HourHeaderItemView f6644e;

    /* JADX INFO: renamed from: f */
    public HourHeaderItemView f6645f;

    /* JADX INFO: renamed from: g */
    public HourHeaderItemView f6646g;

    /* JADX INFO: renamed from: h */
    public ConstraintLayout f6647h;

    /* JADX INFO: renamed from: i */
    public VImage f6648i;

    /* JADX INFO: renamed from: j */
    public LiveTextRollView f6649j;

    /* JADX INFO: renamed from: k */
    public VMarqueeText f6650k;

    public HourHeadersView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m8405h0(View view) {
        whl.m24663a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m8406i0(List<BLiveHourLeaderBoardItem> list, dfl dflVar, @Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        m8407j0(bLiveHourLeaderBoard);
        if (vwb.J(list)) {
            this.f6645f.m8402c(1);
            this.f6644e.m8402c(2);
            this.f6646g.m8402c(3);
            return;
        }
        if (list.size() == 3) {
            this.f6645f.m8404e(list.get(0), dflVar);
            this.f6644e.m8404e(list.get(1), dflVar);
            this.f6646g.m8404e(list.get(2), dflVar);
        } else if (list.size() == 2) {
            this.f6645f.m8404e(list.get(0), dflVar);
            this.f6644e.m8404e(list.get(1), dflVar);
            this.f6646g.m8402c(3);
        } else if (list.size() == 1) {
            this.f6645f.m8404e(list.get(0), dflVar);
            this.f6644e.m8402c(2);
            this.f6646g.m8402c(3);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8407j0(@Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        if (!NullChecker.a(bLiveHourLeaderBoard) || bLiveHourLeaderBoard.notices.size() <= 0) {
            xdl0.M(this.f6647h, false);
            return;
        }
        xdl0.M(this.f6647h, true);
        this.f6650k.setText(((BLiveCurrentHourNotices) bLiveHourLeaderBoard.notices.get(0)).content);
        this.f6650k.setSingleLine(true);
        this.f6650k.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f6650k.setHorizontallyScrolling(true);
        this.f6650k.setMarqueeRepeatLimit(-1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8405h0(this);
    }

    public HourHeadersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourHeadersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
