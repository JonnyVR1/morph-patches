package com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.newgiftwall.bean.WeekStarLeaderboard;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.izs;
import p153l.mdc0;
import p153l.obc0;
import p153l.qa00;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceWeekStarHallTop3ItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f54641d;

    /* JADX INFO: renamed from: e */
    public VImage f54642e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f54643f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f54644g;

    public VoiceWeekStarHallTop3ItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public void m79873h0(WeekStarLeaderboard weekStarLeaderboard) {
        int i = weekStarLeaderboard.rank;
        if (i == 1) {
            this.f54642e.setImageResource(obc0.f146497t3);
        } else if (i == 2) {
            this.f54642e.setImageResource(obc0.f146509u3);
        } else if (i == 3) {
            this.f54642e.setImageResource(obc0.f146521v3);
        }
        izs.m142874y(this.f54643f, weekStarLeaderboard.user.avatar);
        this.f54641d.setText(weekStarLeaderboard.user.name);
    }

    /* JADX INFO: renamed from: i0 */
    public void m79874i0(int i, String str) {
        izs.m142868s("context_single_room", this.f54644g, str);
        if (i != 1) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f54643f.getLayoutParams();
            marginLayoutParams.topMargin = qa00.m175859d(30.0f);
            marginLayoutParams.height = qa00.m175859d(55.0f);
            marginLayoutParams.width = qa00.m175859d(55.0f);
            this.f54643f.setLayoutParams(marginLayoutParams);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.f54642e.getLayoutParams();
            marginLayoutParams2.height = qa00.m175859d(84.0f);
            marginLayoutParams2.width = qa00.m175859d(84.0f);
            this.f54642e.setLayoutParams(marginLayoutParams2);
        }
        if (i == 1) {
            this.f54642e.setImageResource(obc0.f146497t3);
        } else if (i == 2) {
            this.f54642e.setImageResource(obc0.f146509u3);
        } else if (i == 3) {
            this.f54642e.setImageResource(obc0.f146521v3);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m79875j0() {
        this.f54643f.setController(null);
        this.f54641d.setText(R$string.f47891Wd);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f54644g = (VDraweeView) findViewById(mdc0.f135955I);
        this.f54643f = (VDraweeView) findViewById(mdc0.f136299t);
        this.f54642e = (VImage) findViewById(mdc0.f136073V0);
        this.f54641d = (VText) findViewById(mdc0.f136162e4);
    }

    public VoiceWeekStarHallTop3ItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceWeekStarHallTop3ItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
