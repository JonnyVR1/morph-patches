package com.p046p1.mobile.putong.core.p053ui.verification.remind.result;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import p147v.VLinear;
import p147v.VText;
import p149l.bz6;
import p149l.g2m;
import p149l.i0g0;
import p149l.qib0;
import p149l.upa;
import p149l.vwb;

/* JADX INFO: loaded from: classes9.dex */
public class CoreAvatarVerificationFailLayout extends VLinear implements g2m {

    /* JADX INFO: renamed from: c */
    public SimpleDraweeView f36686c;

    /* JADX INFO: renamed from: d */
    public SimpleDraweeView f36687d;

    /* JADX INFO: renamed from: e */
    public VText f36688e;

    /* JADX INFO: renamed from: f */
    public VText_Default_Bold f36689f;

    public CoreAvatarVerificationFailLayout(Context context) {
        super(context);
    }

    @Override // p149l.g2m
    /* JADX INFO: renamed from: L */
    public void mo56087L(int i, int i2) {
        if (i == 1) {
            this.f36688e.setText(i0g0.m133861b0("主头像使用本人 五官清晰的正面照，选择 光线明亮 的场景进行面部采集", vwb.m200324f0("五官清晰的正面照", "光线明亮"), Color.parseColor(upa.m194847z() ? Constants.BLACK : "#99000000"), Typeface.DEFAULT_BOLD));
        } else if (i2 == 2) {
            this.f36688e.setText(i0g0.m133861b0("确认输入的身份信息准确无误，选择光线明亮的场景进行面部采集", vwb.m200324f0("身份信息准确", "光线明亮"), Color.parseColor(upa.m194847z() ? Constants.BLACK : "#99000000"), Typeface.DEFAULT_BOLD));
        } else if (i2 == 3) {
            this.f36688e.setText(i0g0.m133861b0("主头像使用本人 五官清晰的正面照，选择 光线明亮 的场景进行面部采集", vwb.m200324f0("五官清晰的正面照", "光线明亮"), Color.parseColor(upa.m194847z() ? Constants.BLACK : "#99000000"), Typeface.DEFAULT_BOLD));
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m56088P(View view) {
        bz6.m104560a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56088P(this);
        if (CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            qib0.f154691G.m102331L0(this.f36686c, "https://auto.tancdn.com/v1/images/eyJpZCI6IjRURkdWNlgzS1o2V01RMlBXWDQ3RVZLUUw1NEw3RjE0IiwidyI6MTU2LCJoIjoxOTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjE5NTM4MTc4NjM3NzE0NzcxfQ.png");
            qib0.f154691G.m102331L0(this.f36687d, "https://auto.tancdn.com/v1/images/eyJpZCI6IjMyNTRER05GQTVLQklQM0RGQ0lXRU9aS1FGN09RUjE0IiwidyI6MTU2LCJoIjoxOTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MDA1MTY2NTUzNjYzOTQ5NDIyfQ.png");
        } else {
            qib0.f154691G.m102331L0(this.f36686c, "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZRUpXVU9XR0pVVDRQQjVXNE4yNk9ZWkwyNDJQTDE0IiwidyI6MTU2LCJoIjoxOTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTAyMDQ4Nzk1MzA1NzU3MjAzfQ.png");
            qib0.f154691G.m102331L0(this.f36687d, "https://auto.tancdn.com/v1/images/eyJpZCI6IkFDUEtRNlJZWUZTV0ZFV01OVlhRTENaWkhIVU4zWTE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTE1NzYyMTE3MDIyOTkxNzM2Nn0.png");
        }
    }

    public CoreAvatarVerificationFailLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreAvatarVerificationFailLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
