package p149l;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveUnreadTypeEnum;
import com.p046p1.mobile.putong.live.external.internal.live.square.api.LiveActivitiesEntry;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class esr {

    /* JADX INFO: renamed from: a */
    public final VText f93048a;

    /* JADX INFO: renamed from: b */
    public final VImage f93049b;

    public esr(VText vText, VImage vImage) {
        this.f93048a = vText;
        this.f93049b = vImage;
    }

    /* JADX INFO: renamed from: a */
    public void m117950a() {
        xdl0.m208344M(this.f93048a, false);
        xdl0.m208344M(this.f93049b, false);
    }

    /* JADX INFO: renamed from: b */
    public boolean m117951b() {
        return xdl0.m208349O0(this.f93048a) && !TextUtils.isEmpty(this.f93048a.getText());
    }

    /* JADX INFO: renamed from: c */
    public boolean m117952c() {
        return xdl0.m208349O0(this.f93049b);
    }

    /* JADX INFO: renamed from: d */
    public void m117953d(lqr lqrVar, LiveActivitiesEntry liveActivitiesEntry, boolean z) {
        if (liveActivitiesEntry == null || liveActivitiesEntry.getLiveActivitySummary() == null) {
            return;
        }
        int state = liveActivitiesEntry.getState();
        VText vText = this.f93048a;
        if (state == 5) {
            ViewGroup.LayoutParams layoutParams = vText.getLayoutParams();
            if (layoutParams instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams2.gravity = 53;
                layoutParams2.topMargin = t100.f167264m;
                this.f93048a.setLayoutParams(layoutParams);
            }
            ViewGroup.LayoutParams layoutParams3 = this.f93049b.getLayoutParams();
            if (layoutParams3 instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                layoutParams4.gravity = 53;
                layoutParams4.topMargin = t100.f167264m;
                this.f93049b.setLayoutParams(layoutParams3);
            }
        } else {
            ViewGroup.LayoutParams layoutParams5 = vText.getLayoutParams();
            if (layoutParams5 instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams6 = (FrameLayout.LayoutParams) layoutParams5;
                layoutParams6.gravity = 51;
                layoutParams6.topMargin = 0;
                this.f93048a.setLayoutParams(layoutParams5);
            }
            ViewGroup.LayoutParams layoutParams7 = this.f93049b.getLayoutParams();
            if (layoutParams7 instanceof FrameLayout.LayoutParams) {
                FrameLayout.LayoutParams layoutParams8 = (FrameLayout.LayoutParams) layoutParams7;
                layoutParams8.gravity = 51;
                layoutParams8.topMargin = t100.f167254c;
                this.f93049b.setLayoutParams(layoutParams7);
            }
        }
        if (liveActivitiesEntry.needShowActivitiesRedDot()) {
            m117955f(false, lqrVar, z);
            xdl0.m208344M(this.f93049b, true);
            xdl0.m208344M(this.f93048a, false);
        }
        int i = liveActivitiesEntry.getLiveActivitySummary().description.redDotNum;
        if (i == 0) {
            xdl0.m208344M(this.f93048a, false);
            xdl0.m208344M(this.f93049b, false);
            return;
        }
        BLiveConfig bLiveConfigM207019e = x4u.m207019e();
        BLiveUnreadTypeEnum bLiveUnreadTypeEnumM195937s3 = s9s.f163228b.m195937s3();
        if (bLiveConfigM207019e == null || bLiveUnreadTypeEnumM195937s3 == null) {
            return;
        }
        boolean z2 = i > 0;
        String string = bLiveUnreadTypeEnumM195937s3.toString();
        string.getClass();
        switch (string) {
            case "number":
                if (z2) {
                    m117955f(true, lqrVar, z);
                }
                xdl0.m208344M(this.f93048a, z2);
                m117954e(i);
                xdl0.m208344M(this.f93049b, false);
                break;
            case "redDot":
                if (z2) {
                    m117955f(false, lqrVar, z);
                }
                xdl0.m208344M(this.f93049b, z2);
                xdl0.m208344M(this.f93048a, false);
                break;
            case "liveIcon":
                xdl0.m208344M(this.f93048a, z2);
                if (z2) {
                    this.f93048a.setText("LIVE");
                }
                xdl0.m208344M(this.f93049b, false);
                break;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m117954e(int i) {
        GradientDrawable gradientDrawable = (GradientDrawable) this.f93048a.getBackground();
        if (i >= 0 && i <= 99) {
            boolean z = i < 10;
            gradientDrawable.setCornerRadius(z ? t100.f167261j : t100.m186890d(9.0f));
            this.f93048a.setPadding(z ? t100.m186890d(9.0f) : t100.f167259h, this.f93048a.getPaddingTop(), z ? t100.m186890d(9.0f) : t100.f167259h, this.f93048a.getPaddingBottom());
            this.f93048a.setText(String.valueOf(i));
            return;
        }
        if (i <= 99) {
            this.f93048a.setVisibility(8);
            return;
        }
        gradientDrawable.setCornerRadius(t100.m186890d(9.0f));
        VText vText = this.f93048a;
        int i2 = t100.f167259h;
        vText.setPadding(i2, vText.getPaddingTop(), i2, this.f93048a.getPaddingBottom());
        this.f93048a.setText("99+");
    }

    /* JADX INFO: renamed from: f */
    public final void m117955f(boolean z, lqr lqrVar, boolean z2) {
        if (z2) {
            boolean zM117952c = m117952c();
            boolean zM117951b = m117951b();
            boolean z3 = false;
            boolean z4 = (zM117952c || zM117951b) ? false : true;
            boolean z5 = z && !zM117951b;
            if (!z && !zM117952c) {
                z3 = true;
            }
            if (z4 || z5 || z3) {
                rdt.m179011f(lqrVar.m151074h3(), z);
            }
        }
    }
}
