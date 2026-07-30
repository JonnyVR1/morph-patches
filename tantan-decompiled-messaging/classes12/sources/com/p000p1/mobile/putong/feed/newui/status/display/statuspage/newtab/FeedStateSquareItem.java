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
import p007l.g2i;
import p007l.n0i;
import p007l.vqg;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStateSquareItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedSquareBottomStickoutView f4274d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f4275e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4276f;

    /* JADX INFO: renamed from: g */
    public Space f4277g;

    /* JADX INFO: renamed from: h */
    public View f4278h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f4279i;

    /* JADX INFO: renamed from: j */
    public VText f4280j;

    /* JADX INFO: renamed from: k */
    public VText f4281k;

    /* JADX INFO: renamed from: l */
    public View f4282l;

    /* JADX INFO: renamed from: m */
    public View f4283m;

    /* JADX INFO: renamed from: n */
    public Space f4284n;

    public FeedStateSquareItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static GradientDrawable m6736i0(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j0 */
    public static GradientDrawable m6737j0(List<String> list) {
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
    public final void m6738h0(View view) {
        g2i.m10363a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m6739k0(n0i n0iVar) {
        this.f4280j.getPaint().setFakeBoldText(true);
        BubbleInfo bubbleInfo = n0iVar.f10614b;
        if (bubbleInfo == null) {
            return;
        }
        bubbleInfo.nullCheck();
        if (!TextUtils.isEmpty(bubbleInfo.emotion.emojiUrl)) {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f4279i;
            String str = bubbleInfo.emotion.emojiUrl;
            int i = t100.n;
            bkb0Var.I0(vDraweeView, str, i, i);
        }
        this.f4280j.setText(bubbleInfo.value);
        boolean zIa = false;
        if (!vwb.J(bubbleInfo.textTheme.backgroundColor)) {
            this.f4275e.setBackgroundDrawable(m6737j0(bubbleInfo.textTheme.backgroundColor));
            try {
                this.f4274d.setContentColor(Color.parseColor(bubbleInfo.textTheme.backgroundColor.get(0)));
            } catch (Exception e) {
                this.f4274d.setContentColor(Color.parseColor("#ffffff"));
                CrashHelper.c(e);
            }
        }
        boolean zJ = vwb.J(bubbleInfo.textTheme.iconColor);
        View view = this.f4278h;
        if (zJ) {
            xdl0.M(view, false);
        } else {
            xdl0.M(view, true);
            try {
                this.f4278h.setBackgroundDrawable(m6736i0(Color.parseColor(bubbleInfo.textTheme.iconColor.get(0))));
            } catch (Exception e2) {
                this.f4278h.setBackgroundDrawable(m6736i0(Color.parseColor("#ffffff")));
                CrashHelper.c(e2);
            }
        }
        this.f4283m.setBackgroundDrawable(m6736i0(Color.parseColor("#68de48")));
        this.f4282l.setBackgroundDrawable(m6736i0(Color.parseColor("#ffffff")));
        User userM16628e8 = FeedModule.f316d.m16628e8(bubbleInfo.owner.f264id);
        StringBuilder sb = new StringBuilder();
        if (NullChecker.a(userM16628e8)) {
            bkb0 bkb0Var2 = qib0.G;
            VDraweeView vDraweeView2 = this.f4276f;
            String str2 = userM16628e8.m1042fp().profileSmall().formatted();
            int i2 = t100.A;
            bkb0Var2.I0(vDraweeView2, str2, i2, i2);
            zIa = FeedModule.m1140H().Ia(userM16628e8);
        }
        if (!TextUtils.isEmpty(n0iVar.f10616d)) {
            sb.append(n0iVar.f10616d);
        } else if (NullChecker.a(userM16628e8)) {
            sb.append(vqg.m15494R(userM16628e8, (long) bubbleInfo.createdTime, userM16628e8.getLastActiveTimeMillis()));
        }
        if (!TextUtils.isEmpty(n0iVar.f10617e)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(n0iVar.f10617e);
        }
        this.f4281k.setText(sb.toString());
        xdl0.M(this.f4283m, zIa);
        xdl0.M(this.f4282l, zIa);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6738h0(this);
    }

    public FeedStateSquareItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedStateSquareItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
