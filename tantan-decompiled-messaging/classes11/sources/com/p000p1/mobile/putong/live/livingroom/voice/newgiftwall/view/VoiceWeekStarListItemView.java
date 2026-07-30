package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import com.p1.mobile.putong.live.livingroom.R;
import l.e30;
import l.g5c0;
import l.hxs;
import l.w8u;
import l.xdl0;
import p009l.x8u;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceWeekStarListItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f7403d;

    /* JADX INFO: renamed from: e */
    public VText f7404e;

    /* JADX INFO: renamed from: f */
    public VText f7405f;

    /* JADX INFO: renamed from: g */
    public VText f7406g;

    public VoiceWeekStarListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    private String m8910i0(int i) {
        if (i <= 0) {
            return "-";
        }
        return i > 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: j0 */
    public void m8911j0(final WeekStarLeaderboard weekStarLeaderboard, final e30<String> e30Var, boolean z) {
        hxs.y(this.f7403d, weekStarLeaderboard.user.avatar);
        this.f7404e.setText(m8910i0(weekStarLeaderboard.rank));
        this.f7405f.setText(weekStarLeaderboard.user.name);
        if (z) {
            int i = weekStarLeaderboard.rank;
            VText vText = this.f7406g;
            if (i == 1) {
                vText.setText(R.string.Nj);
            } else {
                vText.setText(w8u.u(R.string.Oj, x8u.m24752j(weekStarLeaderboard.gapScore)));
            }
        } else {
            this.f7406g.setText(x8u.m24752j(weekStarLeaderboard.score));
        }
        xdl0.E0(this.f7403d, new View.OnClickListener() { // from class: l.qcp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(weekStarLeaderboard.user.f7360id);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f7403d = findViewById(g5c0.t);
        this.f7404e = findViewById(g5c0.P4);
        this.f7405f = findViewById(g5c0.e4);
        this.f7406g = findViewById(g5c0.b6);
    }

    public VoiceWeekStarListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceWeekStarListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
