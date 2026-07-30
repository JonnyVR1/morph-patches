package com.p051p1.mobile.putong.core.p058ui.verification.remind.result;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import p151v.VLinear;
import p151v.VText;
import p153l.e07;
import p153l.gra;
import p153l.jyb;
import p153l.q8g0;
import p153l.uqb0;
import p153l.z4m;

/* JADX INFO: loaded from: classes12.dex */
public class CoreAvatarVerificationFailLayout extends VLinear implements z4m {

    /* JADX INFO: renamed from: c */
    public SimpleDraweeView f37534c;

    /* JADX INFO: renamed from: d */
    public SimpleDraweeView f37535d;

    /* JADX INFO: renamed from: e */
    public VText f37536e;

    /* JADX INFO: renamed from: f */
    public VText_Default_Bold f37537f;

    public CoreAvatarVerificationFailLayout(Context context) {
        super(context);
    }

    @Override // p153l.z4m
    /* JADX INFO: renamed from: L */
    public void mo57270L(int i, int i2) {
        if (i == 1) {
            this.f37536e.setText(q8g0.m175796b0("主头像使用本人 五官清晰的正面照，选择 光线明亮 的场景进行面部采集", jyb.m147507f0("五官清晰的正面照", "光线明亮"), Color.parseColor(gra.m131778z() ? Constants.BLACK : "#99000000"), Typeface.DEFAULT_BOLD));
        } else if (i2 == 2) {
            this.f37536e.setText(q8g0.m175796b0("确认输入的身份信息准确无误，选择光线明亮的场景进行面部采集", jyb.m147507f0("身份信息准确", "光线明亮"), Color.parseColor(gra.m131778z() ? Constants.BLACK : "#99000000"), Typeface.DEFAULT_BOLD));
        } else if (i2 == 3) {
            this.f37536e.setText(q8g0.m175796b0("主头像使用本人 五官清晰的正面照，选择 光线明亮 的场景进行面部采集", jyb.m147507f0("五官清晰的正面照", "光线明亮"), Color.parseColor(gra.m131778z() ? Constants.BLACK : "#99000000"), Typeface.DEFAULT_BOLD));
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m57271P(View view) {
        e07.m118787a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57271P(this);
        if (CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            uqb0.f180374G.m127115L0(this.f37534c, "https://auto.tancdn.com/v1/images/eyJpZCI6IjRURkdWNlgzS1o2V01RMlBXWDQ3RVZLUUw1NEw3RjE0IiwidyI6MTU2LCJoIjoxOTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjE5NTM4MTc4NjM3NzE0NzcxfQ.png");
            uqb0.f180374G.m127115L0(this.f37535d, "https://auto.tancdn.com/v1/images/eyJpZCI6IjMyNTRER05GQTVLQklQM0RGQ0lXRU9aS1FGN09RUjE0IiwidyI6MTU2LCJoIjoxOTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MDA1MTY2NTUzNjYzOTQ5NDIyfQ.png");
        } else {
            uqb0.f180374G.m127115L0(this.f37534c, "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZRUpXVU9XR0pVVDRQQjVXNE4yNk9ZWkwyNDJQTDE0IiwidyI6MTU2LCJoIjoxOTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTAyMDQ4Nzk1MzA1NzU3MjAzfQ.png");
            uqb0.f180374G.m127115L0(this.f37535d, "https://auto.tancdn.com/v1/images/eyJpZCI6IkFDUEtRNlJZWUZTV0ZFV01OVlhRTENaWkhIVU4zWTE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTE1NzYyMTE3MDIyOTkxNzM2Nn0.png");
        }
    }

    public CoreAvatarVerificationFailLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreAvatarVerificationFailLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
