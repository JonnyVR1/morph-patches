package com.p000p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Location;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.bkb0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.n0i;
import p007l.x2h;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedFakeSquareItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedSquareBottomStickoutView f4244d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f4245e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4246f;

    /* JADX INFO: renamed from: g */
    public VText f4247g;

    /* JADX INFO: renamed from: h */
    public VText f4248h;

    /* JADX INFO: renamed from: i */
    public View f4249i;

    /* JADX INFO: renamed from: j */
    public View f4250j;

    /* JADX INFO: renamed from: k */
    public Space f4251k;

    public FeedFakeSquareItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public static GradientDrawable m6724j0(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: k0 */
    public static GradientDrawable m6725k0(List<String> list) {
        int[] iArr;
        if (!NullChecker.a(list) || list.size() <= 0) {
            return null;
        }
        try {
            iArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = Color.parseColor(list.get(i));
            }
        } catch (Exception e) {
            CrashHelper.c(e);
            iArr = new int[]{Color.parseColor("#c9bdff"), Color.parseColor("#cdecff")};
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(t100.i);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m6726h0(View view) {
        x2h.m15999a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final String m6727i0(Location location) {
        int i = location.distance;
        if (i >= 40000) {
            if (TextUtils.isEmpty(location.region.city) || location.isHideRegionCity()) {
                return null;
            }
            return location.region.city;
        }
        if (i >= 1000) {
            return String.format("%.1f", Float.valueOf(i / 1000.0f)).concat("km");
        }
        return location.distance + "m";
    }

    /* JADX INFO: renamed from: l0 */
    public void m6728l0(n0i n0iVar) {
        this.f4247g.getPaint().setFakeBoldText(true);
        BubbleInfo bubbleInfo = n0iVar.f10614b;
        if (bubbleInfo == null) {
            return;
        }
        bubbleInfo.nullCheck();
        boolean zIa = false;
        if (!vwb.J(bubbleInfo.textTheme.backgroundColor)) {
            this.f4245e.setBackgroundDrawable(m6725k0(bubbleInfo.textTheme.backgroundColor));
            try {
                this.f4244d.setContentColor(Color.parseColor(bubbleInfo.textTheme.backgroundColor.get(0)));
            } catch (Exception e) {
                this.f4244d.setContentColor(Color.parseColor("#ffffff"));
                CrashHelper.c(e);
            }
        }
        this.f4250j.setBackgroundDrawable(m6724j0(Color.parseColor("#68de48")));
        this.f4249i.setBackgroundDrawable(m6724j0(Color.parseColor("#ffffff")));
        User userM16628e8 = FeedModule.f316d.m16628e8(bubbleInfo.f191id);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = "他";
        if (NullChecker.a(userM16628e8)) {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f4246f;
            String str2 = userM16628e8.m1042fp().profileSmall().formatted();
            int i = t100.A;
            bkb0Var.I0(vDraweeView, str2, i, i);
            zIa = FeedModule.m1140H().Ia(userM16628e8);
            str = userM16628e8.isFemale() ? "她" : "他";
            sb2.append(userM16628e8.name);
            sb2.append(" · ");
            sb2.append(userM16628e8.age);
            sb2.append("岁");
            String strM6727i0 = m6727i0(userM16628e8.location);
            if (!TextUtils.isEmpty(sb2)) {
                sb2.append(" · ");
                sb2.append(strM6727i0);
            }
        }
        sb.append(str);
        sb.append("喜欢了你，打个招呼吧");
        this.f4247g.setText(sb.toString());
        this.f4248h.setText(sb2.toString());
        xdl0.M(this.f4248h, !TextUtils.isEmpty(sb2.toString()));
        xdl0.M(this.f4250j, zIa);
        xdl0.M(this.f4249i, zIa);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6726h0(this);
    }

    public FeedFakeSquareItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedFakeSquareItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
