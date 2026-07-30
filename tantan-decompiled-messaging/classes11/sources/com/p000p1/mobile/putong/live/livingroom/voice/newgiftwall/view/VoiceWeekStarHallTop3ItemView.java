package com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import com.p1.mobile.putong.live.livingroom.R;
import l.g5c0;
import l.hce;
import l.hxs;
import l.i3c0;
import l.t100;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceWeekStarHallTop3ItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f7399d;

    /* JADX INFO: renamed from: e */
    public VImage f7400e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f7401f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f7402g;

    public VoiceWeekStarHallTop3ItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m8906h0(WeekStarLeaderboard weekStarLeaderboard) {
        int i = weekStarLeaderboard.rank;
        if (i == 1) {
            this.f7400e.setImageResource(i3c0.t3);
        } else if (i == 2) {
            this.f7400e.setImageResource(i3c0.u3);
        } else if (i == 3) {
            this.f7400e.setImageResource(i3c0.v3);
        }
        hxs.y(this.f7401f, weekStarLeaderboard.user.avatar);
        this.f7399d.setText(weekStarLeaderboard.user.name);
    }

    /* JADX INFO: renamed from: i0 */
    public void m8907i0(int i, String str) {
        hxs.s("context_single_room", this.f7402g, str);
        if (i != 1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f7401f.getLayoutParams();
            marginLayoutParams.topMargin = t100.d(30.0f);
            marginLayoutParams.height = t100.d(55.0f);
            marginLayoutParams.width = t100.d(55.0f);
            this.f7401f.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f7400e.getLayoutParams();
            marginLayoutParams2.height = t100.d(84.0f);
            marginLayoutParams2.width = t100.d(84.0f);
            this.f7400e.setLayoutParams(marginLayoutParams2);
        }
        if (i == 1) {
            this.f7400e.setImageResource(i3c0.t3);
        } else if (i == 2) {
            this.f7400e.setImageResource(i3c0.u3);
        } else if (i == 3) {
            this.f7400e.setImageResource(i3c0.v3);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m8908j0() {
        this.f7401f.setController((hce) null);
        this.f7399d.setText(R.string.Wd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        this.f7402g = findViewById(g5c0.I);
        this.f7401f = findViewById(g5c0.t);
        this.f7400e = findViewById(g5c0.V0);
        this.f7399d = findViewById(g5c0.e4);
    }

    public VoiceWeekStarHallTop3ItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceWeekStarHallTop3ItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
