package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import p147v.VDraweeView;
import p147v.VText;
import p149l.e30;
import p149l.g5c0;
import p149l.hxs;
import p149l.w8u;
import p149l.x8u;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceWeekStarListItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53797d;

    /* JADX INFO: renamed from: e */
    public VText f53798e;

    /* JADX INFO: renamed from: f */
    public VText f53799f;

    /* JADX INFO: renamed from: g */
    public VText f53800g;

    public VoiceWeekStarListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    private String m78694i0(int i) {
        if (i <= 0) {
            return "-";
        }
        return i > 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: j0 */
    public void m78695j0(final WeekStarLeaderboard weekStarLeaderboard, final e30<String> e30Var, boolean z) {
        hxs.m133412y(this.f53797d, weekStarLeaderboard.user.avatar);
        this.f53798e.setText(m78694i0(weekStarLeaderboard.rank));
        this.f53799f.setText(weekStarLeaderboard.user.name);
        if (z) {
            int i = weekStarLeaderboard.rank;
            VText vText = this.f53800g;
            if (i == 1) {
                vText.setText(R$string.f46860Nj);
            } else {
                vText.setText(w8u.m202218u(R$string.f46881Oj, x8u.m207440j(weekStarLeaderboard.gapScore)));
            }
        } else {
            this.f53800g.setText(x8u.m207440j(weekStarLeaderboard.score));
        }
        xdl0.m208329E0(this.f53797d, new View.OnClickListener() { // from class: l.qcp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(weekStarLeaderboard.user.f53754id);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53797d = (VDraweeView) findViewById(g5c0.f101054t);
        this.f53798e = (VText) findViewById(g5c0.f100778P4);
        this.f53799f = (VText) findViewById(g5c0.f100917e4);
        this.f53800g = (VText) findViewById(g5c0.f100889b6);
    }

    public VoiceWeekStarListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceWeekStarListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
