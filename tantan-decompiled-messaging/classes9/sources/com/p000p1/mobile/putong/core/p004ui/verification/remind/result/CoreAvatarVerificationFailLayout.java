package com.p000p1.mobile.putong.core.p004ui.verification.remind.result;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import l.bz6;
import l.i0g0;
import l.vwb;
import p006l.g2m;
import p006l.qib0;
import p006l.upa;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreAvatarVerificationFailLayout extends VLinear implements g2m {

    /* JADX INFO: renamed from: c */
    public SimpleDraweeView f6467c;

    /* JADX INFO: renamed from: d */
    public SimpleDraweeView f6468d;

    /* JADX INFO: renamed from: e */
    public VText f6469e;

    /* JADX INFO: renamed from: f */
    public VText_Default_Bold f6470f;

    public CoreAvatarVerificationFailLayout(Context context) {
        super(context);
    }

    @Override // p006l.g2m
    /* JADX INFO: renamed from: L */
    public void mo9512L(int i, int i2) {
        if (i == 1) {
            this.f6469e.setText(i0g0.b0("主头像使用本人 五官清晰的正面照，选择 光线明亮 的场景进行面部采集", vwb.f0(new String[]{"五官清晰的正面照", "光线明亮"}), Color.parseColor(upa.m25545z() ? "#000000" : "#99000000"), Typeface.DEFAULT_BOLD));
        } else if (i2 == 2) {
            this.f6469e.setText(i0g0.b0("确认输入的身份信息准确无误，选择光线明亮的场景进行面部采集", vwb.f0(new String[]{"身份信息准确", "光线明亮"}), Color.parseColor(upa.m25545z() ? "#000000" : "#99000000"), Typeface.DEFAULT_BOLD));
        } else if (i2 == 3) {
            this.f6469e.setText(i0g0.b0("主头像使用本人 五官清晰的正面照，选择 光线明亮 的场景进行面部采集", vwb.f0(new String[]{"五官清晰的正面照", "光线明亮"}), Color.parseColor(upa.m25545z() ? "#000000" : "#99000000"), Typeface.DEFAULT_BOLD));
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m9513P(View view) {
        bz6.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9513P(this);
        if (CoreModule.f1534c.f3628e0.m21490p9().isFemale()) {
            qib0.f19782G.m12744L0(this.f6467c, "https://auto.tancdn.com/v1/images/eyJpZCI6IjRURkdWNlgzS1o2V01RMlBXWDQ3RVZLUUw1NEw3RjE0IiwidyI6MTU2LCJoIjoxOTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjE5NTM4MTc4NjM3NzE0NzcxfQ.png");
            qib0.f19782G.m12744L0(this.f6468d, "https://auto.tancdn.com/v1/images/eyJpZCI6IjMyNTRER05GQTVLQklQM0RGQ0lXRU9aS1FGN09RUjE0IiwidyI6MTU2LCJoIjoxOTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MDA1MTY2NTUzNjYzOTQ5NDIyfQ.png");
        } else {
            qib0.f19782G.m12744L0(this.f6467c, "https://auto.tancdn.com/v1/images/eyJpZCI6IkNZRUpXVU9XR0pVVDRQQjVXNE4yNk9ZWkwyNDJQTDE0IiwidyI6MTU2LCJoIjoxOTIsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozOTAyMDQ4Nzk1MzA1NzU3MjAzfQ.png");
            qib0.f19782G.m12744L0(this.f6468d, "https://auto.tancdn.com/v1/images/eyJpZCI6IkFDUEtRNlJZWUZTV0ZFV01OVlhRTENaWkhIVU4zWTE0IiwidyI6MjM0LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTE1NzYyMTE3MDIyOTkxNzM2Nn0.png");
        }
    }

    public CoreAvatarVerificationFailLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreAvatarVerificationFailLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
