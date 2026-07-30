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
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bkb0;
import p149l.g2i;
import p149l.n0i;
import p149l.qib0;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStateSquareItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedSquareBottomStickoutView f42813d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f42814e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f42815f;

    /* JADX INFO: renamed from: g */
    public Space f42816g;

    /* JADX INFO: renamed from: h */
    public View f42817h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f42818i;

    /* JADX INFO: renamed from: j */
    public VText f42819j;

    /* JADX INFO: renamed from: k */
    public VText f42820k;

    /* JADX INFO: renamed from: l */
    public View f42821l;

    /* JADX INFO: renamed from: m */
    public View f42822m;

    /* JADX INFO: renamed from: n */
    public Space f42823n;

    public FeedStateSquareItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static GradientDrawable m65599i0(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j0 */
    public static GradientDrawable m65600j0(List<String> list) {
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
    public final void m65601h0(View view) {
        g2i.m124159a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m65602k0(n0i n0iVar) {
        this.f42819j.getPaint().setFakeBoldText(true);
        BubbleInfo bubbleInfo = n0iVar.f136558b;
        if (bubbleInfo == null) {
            return;
        }
        bubbleInfo.nullCheck();
        if (!TextUtils.isEmpty(bubbleInfo.emotion.emojiUrl)) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f42818i;
            String str = bubbleInfo.emotion.emojiUrl;
            int i = t100.f167265n;
            bkb0Var.m102325I0(vDraweeView, str, i, i);
        }
        this.f42819j.setText(bubbleInfo.value);
        boolean zMo30693Ia = false;
        if (!vwb.m200296J(bubbleInfo.textTheme.backgroundColor)) {
            this.f42814e.setBackgroundDrawable(m65600j0(bubbleInfo.textTheme.backgroundColor));
            try {
                this.f42813d.setContentColor(Color.parseColor(bubbleInfo.textTheme.backgroundColor.get(0)));
            } catch (Exception e) {
                this.f42813d.setContentColor(Color.parseColor("#ffffff"));
                CrashHelper.m81296c(e);
            }
        }
        boolean zM200296J = vwb.m200296J(bubbleInfo.textTheme.iconColor);
        View view = this.f42817h;
        if (zM200296J) {
            xdl0.m208344M(view, false);
        } else {
            xdl0.m208344M(view, true);
            try {
                this.f42817h.setBackgroundDrawable(m65599i0(Color.parseColor(bubbleInfo.textTheme.iconColor.get(0))));
            } catch (Exception e2) {
                this.f42817h.setBackgroundDrawable(m65599i0(Color.parseColor("#ffffff")));
                CrashHelper.m81296c(e2);
            }
        }
        this.f42822m.setBackgroundDrawable(m65599i0(Color.parseColor("#68de48")));
        this.f42821l.setBackgroundDrawable(m65599i0(Color.parseColor("#ffffff")));
        User userM209447e8 = FeedModule.f38855d.m209447e8(bubbleInfo.owner.f38803id);
        StringBuilder sb = new StringBuilder();
        if (NullChecker.m81303a(userM209447e8)) {
            bkb0 bkb0Var2 = qib0.f154691G;
            VDraweeView vDraweeView2 = this.f42815f;
            String str2 = userM209447e8.m60124fp().profileSmall().formatted();
            int i2 = t100.f167226A;
            bkb0Var2.m102325I0(vDraweeView2, str2, i2, i2);
            zMo30693Ia = FeedModule.m60222H().mo30693Ia(userM209447e8);
        }
        if (!TextUtils.isEmpty(n0iVar.f136560d)) {
            sb.append(n0iVar.f136560d);
        } else if (NullChecker.m81303a(userM209447e8)) {
            sb.append(vqg.m199524R(userM209447e8, (long) bubbleInfo.createdTime, userM209447e8.getLastActiveTimeMillis()));
        }
        if (!TextUtils.isEmpty(n0iVar.f136561e)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(n0iVar.f136561e);
        }
        this.f42820k.setText(sb.toString());
        xdl0.m208344M(this.f42822m, zMo30693Ia);
        xdl0.m208344M(this.f42821l, zMo30693Ia);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65601h0(this);
    }

    public FeedStateSquareItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedStateSquareItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
