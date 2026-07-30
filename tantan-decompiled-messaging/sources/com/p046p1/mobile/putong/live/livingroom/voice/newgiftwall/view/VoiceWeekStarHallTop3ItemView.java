package com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.g5c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceWeekStarHallTop3ItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f53793d;

    /* JADX INFO: renamed from: e */
    public VImage f53794e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53795f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f53796g;

    public VoiceWeekStarHallTop3ItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m78690h0(WeekStarLeaderboard weekStarLeaderboard) {
        int i = weekStarLeaderboard.rank;
        if (i == 1) {
            this.f53794e.setImageResource(i3c0.f111169t3);
        } else if (i == 2) {
            this.f53794e.setImageResource(i3c0.f111181u3);
        } else if (i == 3) {
            this.f53794e.setImageResource(i3c0.f111193v3);
        }
        hxs.m133412y(this.f53795f, weekStarLeaderboard.user.avatar);
        this.f53793d.setText(weekStarLeaderboard.user.name);
    }

    /* JADX INFO: renamed from: i0 */
    public void m78691i0(int i, String str) {
        hxs.m133406s("context_single_room", this.f53796g, str);
        if (i != 1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f53795f.getLayoutParams();
            marginLayoutParams.topMargin = t100.m186890d(30.0f);
            marginLayoutParams.height = t100.m186890d(55.0f);
            marginLayoutParams.width = t100.m186890d(55.0f);
            this.f53795f.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f53794e.getLayoutParams();
            marginLayoutParams2.height = t100.m186890d(84.0f);
            marginLayoutParams2.width = t100.m186890d(84.0f);
            this.f53794e.setLayoutParams(marginLayoutParams2);
        }
        if (i == 1) {
            this.f53794e.setImageResource(i3c0.f111169t3);
        } else if (i == 2) {
            this.f53794e.setImageResource(i3c0.f111181u3);
        } else if (i == 3) {
            this.f53794e.setImageResource(i3c0.f111193v3);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m78692j0() {
        this.f53795f.setController(null);
        this.f53793d.setText(R$string.f47043Wd);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f53796g = (VDraweeView) findViewById(g5c0.f100710I);
        this.f53795f = (VDraweeView) findViewById(g5c0.f101054t);
        this.f53794e = (VImage) findViewById(g5c0.f100828V0);
        this.f53793d = (VText) findViewById(g5c0.f100917e4);
    }

    public VoiceWeekStarHallTop3ItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceWeekStarHallTop3ItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
