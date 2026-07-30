package p153l;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p051p1.mobile.putong.live.external.internal.live.square.api.LiveActivitiesEntry;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class fur {

    /* JADX INFO: renamed from: a */
    public final VText f100937a;

    /* JADX INFO: renamed from: b */
    public final VImage f100938b;

    public fur(VText vText, VImage vImage) {
        this.f100937a = vText;
        this.f100938b = vImage;
    }

    /* JADX INFO: renamed from: a */
    public void m127534a() {
        bnl0.m105524M(this.f100937a, false);
        bnl0.m105524M(this.f100938b, false);
    }

    /* JADX INFO: renamed from: b */
    public boolean m127535b() {
        return bnl0.m105529O0(this.f100937a) && !TextUtils.isEmpty(this.f100937a.getText());
    }

    /* JADX INFO: renamed from: c */
    public boolean m127536c() {
        return bnl0.m105529O0(this.f100938b);
    }

    /* JADX INFO: renamed from: d */
    public void m127537d(msr msrVar, LiveActivitiesEntry liveActivitiesEntry, boolean z) {
        if (liveActivitiesEntry == null || liveActivitiesEntry.getLiveActivitySummary() == null) {
            return;
        }
        int state = liveActivitiesEntry.getState();
        VText vText = this.f100937a;
        if (state == 5) {
            ViewGroup.LayoutParams layoutParams = vText.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 53;
                layoutParams2.topMargin = qa00.f156326m;
                this.f100937a.setLayoutParams(layoutParams);
            }
            ViewGroup.LayoutParams layoutParams3 = this.f100938b.getLayoutParams();
            if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = 53;
                layoutParams4.topMargin = qa00.f156326m;
                this.f100938b.setLayoutParams(layoutParams3);
            }
        } else {
            ViewGroup.LayoutParams layoutParams5 = vText.getLayoutParams();
            if (layoutParams5 instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                layoutParams6.gravity = 51;
                layoutParams6.topMargin = 0;
                this.f100937a.setLayoutParams(layoutParams5);
            }
            ViewGroup.LayoutParams layoutParams7 = this.f100938b.getLayoutParams();
            if (layoutParams7 instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                layoutParams8.gravity = 51;
                layoutParams8.topMargin = qa00.f156316c;
                this.f100938b.setLayoutParams(layoutParams7);
            }
        }
        if (liveActivitiesEntry.needShowActivitiesRedDot()) {
            m127539f(false, msrVar, z);
            bnl0.m105524M(this.f100938b, true);
            bnl0.m105524M(this.f100937a, false);
        }
        int i = liveActivitiesEntry.getLiveActivitySummary().description.redDotNum;
        if (i == 0) {
            bnl0.m105524M(this.f100937a, false);
            bnl0.m105524M(this.f100938b, false);
            return;
        }
        BLiveConfig bLiveConfigM214501e = y6u.m214501e();
        BLiveUnreadTypeEnum bLiveUnreadTypeEnumM203724s3 = tbs.f172989b.m203724s3();
        if (bLiveConfigM214501e == null || bLiveUnreadTypeEnumM203724s3 == null) {
            return;
        }
        boolean z2 = i > 0;
        String string = bLiveUnreadTypeEnumM203724s3.toString();
        string.getClass();
        switch (string) {
            case "number":
                if (z2) {
                    m127539f(true, msrVar, z);
                }
                bnl0.m105524M(this.f100937a, z2);
                m127538e(i);
                bnl0.m105524M(this.f100938b, false);
                break;
            case "redDot":
                if (z2) {
                    m127539f(false, msrVar, z);
                }
                bnl0.m105524M(this.f100938b, z2);
                bnl0.m105524M(this.f100937a, false);
                break;
            case "liveIcon":
                bnl0.m105524M(this.f100937a, z2);
                if (z2) {
                    this.f100937a.setText("LIVE");
                }
                bnl0.m105524M(this.f100938b, false);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m127538e(int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.f100937a.getBackground();
        if (i >= 0 && i <= 99) {
            boolean z = i < 10;
            gradientDrawable.setCornerRadius(z ? qa00.f156323j : qa00.m175859d(9.0f));
            this.f100937a.setPadding(z ? qa00.m175859d(9.0f) : qa00.f156321h, this.f100937a.getPaddingTop(), z ? qa00.m175859d(9.0f) : qa00.f156321h, this.f100937a.getPaddingBottom());
            this.f100937a.setText(String.valueOf(i));
            return;
        }
        if (i <= 99) {
            this.f100937a.setVisibility(8);
            return;
        }
        gradientDrawable.setCornerRadius(qa00.m175859d(9.0f));
        VText vText = this.f100937a;
        int i2 = qa00.f156321h;
        vText.setPadding(i2, vText.getPaddingTop(), i2, this.f100937a.getPaddingBottom());
        this.f100937a.setText("99+");
    }

    /* JADX INFO: renamed from: f */
    public final void m127539f(boolean z, msr msrVar, boolean z2) {
        if (z2) {
            boolean zM127536c = m127536c();
            boolean zM127535b = m127535b();
            boolean z3 = false;
            boolean z4 = (zM127536c || zM127535b) ? false : true;
            boolean z5 = z && !zM127535b;
            if (!z && !zM127536c) {
                z3 = true;
            }
            if (z4 || z5 || z3) {
                sft.m185668f(msrVar.m159916h3(), z);
            }
        }
    }
}
