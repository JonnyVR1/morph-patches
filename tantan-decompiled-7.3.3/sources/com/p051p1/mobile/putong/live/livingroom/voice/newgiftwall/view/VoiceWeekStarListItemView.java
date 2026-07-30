package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.mdc0;
import p153l.xau;
import p153l.y20;
import p153l.yau;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceWeekStarListItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f54645d;

    /* JADX INFO: renamed from: e */
    public VText f54646e;

    /* JADX INFO: renamed from: f */
    public VText f54647f;

    /* JADX INFO: renamed from: g */
    public VText f54648g;

    public VoiceWeekStarListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    private String m79877i0(int i) {
        if (i <= 0) {
            return "-";
        }
        return i > 99 ? "99+" : String.valueOf(i);
    }

    /* JADX INFO: renamed from: j0 */
    public void m79878j0(final WeekStarLeaderboard weekStarLeaderboard, final y20<String> y20Var, boolean z) {
        izs.m142874y(this.f54645d, weekStarLeaderboard.user.avatar);
        this.f54646e.setText(m79877i0(weekStarLeaderboard.rank));
        this.f54647f.setText(weekStarLeaderboard.user.name);
        if (z) {
            int i = weekStarLeaderboard.rank;
            VText vText = this.f54648g;
            if (i == 1) {
                vText.setText(R$string.f47708Nj);
            } else {
                vText.setText(xau.m209911u(R$string.f47729Oj, yau.m214942j(weekStarLeaderboard.gapScore)));
            }
        } else {
            this.f54648g.setText(yau.m214942j(weekStarLeaderboard.score));
        }
        bnl0.m105509E0(this.f54645d, new View.OnClickListener() { // from class: l.ulp0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(weekStarLeaderboard.user.f54602id);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54645d = (VDraweeView) findViewById(mdc0.f136299t);
        this.f54646e = (VText) findViewById(mdc0.f136023P4);
        this.f54647f = (VText) findViewById(mdc0.f136162e4);
        this.f54648g = (VText) findViewById(mdc0.f136134b6);
    }

    public VoiceWeekStarListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceWeekStarListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
