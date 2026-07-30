package com.p046p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Location;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bkb0;
import p149l.n0i;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.x2h;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedFakeSquareItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedSquareBottomStickoutView f42783d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f42784e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f42785f;

    /* JADX INFO: renamed from: g */
    public VText f42786g;

    /* JADX INFO: renamed from: h */
    public VText f42787h;

    /* JADX INFO: renamed from: i */
    public View f42788i;

    /* JADX INFO: renamed from: j */
    public View f42789j;

    /* JADX INFO: renamed from: k */
    public Space f42790k;

    public FeedFakeSquareItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public static GradientDrawable m65587j0(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: k0 */
    public static GradientDrawable m65588k0(List<String> list) {
        int[] iArr;
        if (!NullChecker.m81303a(list) || list.size() <= 0) {
            return null;
        }
        try {
            iArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = Color.parseColor(list.get(i));
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            iArr = new int[]{Color.parseColor("#c9bdff"), Color.parseColor("#cdecff")};
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(t100.f167260i);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m65589h0(View view) {
        x2h.m206853a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final String m65590i0(Location location) {
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
    public void m65591l0(n0i n0iVar) {
        this.f42786g.getPaint().setFakeBoldText(true);
        BubbleInfo bubbleInfo = n0iVar.f136558b;
        if (bubbleInfo == null) {
            return;
        }
        bubbleInfo.nullCheck();
        boolean zMo30693Ia = false;
        if (!vwb.m200296J(bubbleInfo.textTheme.backgroundColor)) {
            this.f42784e.setBackgroundDrawable(m65588k0(bubbleInfo.textTheme.backgroundColor));
            try {
                this.f42783d.setContentColor(Color.parseColor(bubbleInfo.textTheme.backgroundColor.get(0)));
            } catch (Exception e) {
                this.f42783d.setContentColor(Color.parseColor("#ffffff"));
                CrashHelper.m81296c(e);
            }
        }
        this.f42789j.setBackgroundDrawable(m65587j0(Color.parseColor("#68de48")));
        this.f42788i.setBackgroundDrawable(m65587j0(Color.parseColor("#ffffff")));
        User userM209447e8 = FeedModule.f38855d.m209447e8(bubbleInfo.f38730id);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = "他";
        if (NullChecker.m81303a(userM209447e8)) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f42785f;
            String str2 = userM209447e8.m60124fp().profileSmall().formatted();
            int i = t100.f167226A;
            bkb0Var.m102325I0(vDraweeView, str2, i, i);
            zMo30693Ia = FeedModule.m60222H().mo30693Ia(userM209447e8);
            str = userM209447e8.isFemale() ? "她" : "他";
            sb2.append(userM209447e8.name);
            sb2.append(" · ");
            sb2.append(userM209447e8.age);
            sb2.append("岁");
            String strM65590i0 = m65590i0(userM209447e8.location);
            if (!TextUtils.isEmpty(sb2)) {
                sb2.append(" · ");
                sb2.append(strM65590i0);
            }
        }
        sb.append(str);
        sb.append("喜欢了你，打个招呼吧");
        this.f42786g.setText(sb.toString());
        this.f42787h.setText(sb2.toString());
        xdl0.m208344M(this.f42787h, !TextUtils.isEmpty(sb2.toString()));
        xdl0.m208344M(this.f42789j, zMo30693Ia);
        xdl0.m208344M(this.f42788i, zMo30693Ia);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65589h0(this);
    }

    public FeedFakeSquareItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedFakeSquareItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
