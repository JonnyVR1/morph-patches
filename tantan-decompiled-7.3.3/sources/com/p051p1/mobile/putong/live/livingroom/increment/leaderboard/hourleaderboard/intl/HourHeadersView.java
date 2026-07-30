package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoard;
import com.p051p1.mobile.putong.live.base.data.BLiveHourLeaderBoardItem;
import com.p051p1.mobile.putong.live.livingroom.view.rollview.LiveTextRollView;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VMarqueeText;
import p153l.bnl0;
import p153l.jyb;
import p153l.nkl;
import p153l.uhl;

/* JADX INFO: loaded from: classes4.dex */
public class HourHeadersView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public HourHeadersView f51449d;

    /* JADX INFO: renamed from: e */
    public HourHeaderItemView f51450e;

    /* JADX INFO: renamed from: f */
    public HourHeaderItemView f51451f;

    /* JADX INFO: renamed from: g */
    public HourHeaderItemView f51452g;

    /* JADX INFO: renamed from: h */
    public ConstraintLayout f51453h;

    /* JADX INFO: renamed from: i */
    public VImage f51454i;

    /* JADX INFO: renamed from: j */
    public LiveTextRollView f51455j;

    /* JADX INFO: renamed from: k */
    public VMarqueeText f51456k;

    public HourHeadersView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75990h0(View view) {
        nkl.m163638a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m75991i0(List<BLiveHourLeaderBoardItem> list, uhl uhlVar, @Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        m75992j0(bLiveHourLeaderBoard);
        if (jyb.m147479J(list)) {
            this.f51451f.m75987c(1);
            this.f51450e.m75987c(2);
            this.f51452g.m75987c(3);
            return;
        }
        if (list.size() == 3) {
            this.f51451f.m75989e(list.get(0), uhlVar);
            this.f51450e.m75989e(list.get(1), uhlVar);
            this.f51452g.m75989e(list.get(2), uhlVar);
        } else if (list.size() == 2) {
            this.f51451f.m75989e(list.get(0), uhlVar);
            this.f51450e.m75989e(list.get(1), uhlVar);
            this.f51452g.m75987c(3);
        } else if (list.size() == 1) {
            this.f51451f.m75989e(list.get(0), uhlVar);
            this.f51450e.m75987c(2);
            this.f51452g.m75987c(3);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75992j0(@Nullable BLiveHourLeaderBoard bLiveHourLeaderBoard) {
        if (!NullChecker.m82486a(bLiveHourLeaderBoard) || bLiveHourLeaderBoard.notices.size() <= 0) {
            bnl0.m105524M(this.f51453h, false);
            return;
        }
        bnl0.m105524M(this.f51453h, true);
        this.f51456k.setText(bLiveHourLeaderBoard.notices.get(0).content);
        this.f51456k.setSingleLine(true);
        this.f51456k.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f51456k.setHorizontallyScrolling(true);
        this.f51456k.setMarqueeRepeatLimit(-1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75990h0(this);
    }

    public HourHeadersView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public HourHeadersView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
