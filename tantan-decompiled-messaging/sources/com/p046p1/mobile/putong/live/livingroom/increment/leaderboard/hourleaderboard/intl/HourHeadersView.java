package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p046p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p046p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VMarqueeText;
import p149l.dfl;
import p149l.vwb;
import p149l.whl;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class HourHeadersView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public HourHeadersView f50601d;

    /* JADX INFO: renamed from: e */
    public HourHeaderItemView f50602e;

    /* JADX INFO: renamed from: f */
    public HourHeaderItemView f50603f;

    /* JADX INFO: renamed from: g */
    public HourHeaderItemView f50604g;

    /* JADX INFO: renamed from: h */
    public ConstraintLayout f50605h;

    /* JADX INFO: renamed from: i */
    public VImage f50606i;

    /* JADX INFO: renamed from: j */
    public LiveTextRollView f50607j;

    /* JADX INFO: renamed from: k */
    public VMarqueeText f50608k;

    public HourHeadersView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74807h0(View view) {
        whl.m203221a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74808i0(List<BLiveHourLeaderBoardItem> list, dfl dflVar, @Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        m74809j0(bLiveHourLeaderBoard);
        if (vwb.m200296J(list)) {
            this.f50603f.m74804c(1);
            this.f50602e.m74804c(2);
            this.f50604g.m74804c(3);
            return;
        }
        if (list.size() == 3) {
            this.f50603f.m74806e(list.get(0), dflVar);
            this.f50602e.m74806e(list.get(1), dflVar);
            this.f50604g.m74806e(list.get(2), dflVar);
        } else if (list.size() == 2) {
            this.f50603f.m74806e(list.get(0), dflVar);
            this.f50602e.m74806e(list.get(1), dflVar);
            this.f50604g.m74804c(3);
        } else if (list.size() == 1) {
            this.f50603f.m74806e(list.get(0), dflVar);
            this.f50602e.m74804c(2);
            this.f50604g.m74804c(3);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74809j0(@Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        if (!NullChecker.m81303a(bLiveHourLeaderBoard) || bLiveHourLeaderBoard.notices.size() <= 0) {
            xdl0.m208344M(this.f50605h, false);
            return;
        }
        xdl0.m208344M(this.f50605h, true);
        this.f50608k.setText(bLiveHourLeaderBoard.notices.get(0).content);
        this.f50608k.setSingleLine(true);
        this.f50608k.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f50608k.setHorizontallyScrolling(true);
        this.f50608k.setMarqueeRepeatLimit(-1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74807h0(this);
    }

    public HourHeadersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourHeadersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
