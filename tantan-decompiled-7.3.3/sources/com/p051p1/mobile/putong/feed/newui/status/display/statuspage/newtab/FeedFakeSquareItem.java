package com.p051p1.mobile.putong.feed.newui.status.display.statuspage.newtab;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Space;
import androidx.annotation.ColorInt;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Location;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.c2i;
import p153l.fsb0;
import p153l.jyb;
import p153l.m4h;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes13.dex */
public class FeedFakeSquareItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedSquareBottomStickoutView f43631d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f43632e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f43633f;

    /* JADX INFO: renamed from: g */
    public VText f43634g;

    /* JADX INFO: renamed from: h */
    public VText f43635h;

    /* JADX INFO: renamed from: i */
    public View f43636i;

    /* JADX INFO: renamed from: j */
    public View f43637j;

    /* JADX INFO: renamed from: k */
    public Space f43638k;

    public FeedFakeSquareItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public static GradientDrawable m66770j0(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: k0 */
    public static GradientDrawable m66771k0(List<String> list) {
        int[] iArr;
        if (!NullChecker.m82486a(list) || list.size() <= 0) {
            return null;
        }
        try {
            iArr = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                iArr[i] = Color.parseColor(list.get(i));
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            iArr = new int[]{Color.parseColor("#c9bdff"), Color.parseColor("#cdecff")};
        }
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, iArr);
        gradientDrawable.setCornerRadius(qa00.f156322i);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.RIGHT_LEFT);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m66772h0(View view) {
        m4h.m157035a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public final String m66773i0(Location location) {
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
    public void m66774l0(c2i c2iVar) {
        this.f43634g.getPaint().setFakeBoldText(true);
        BubbleInfo bubbleInfo = c2iVar.f79481b;
        if (bubbleInfo == null) {
            return;
        }
        bubbleInfo.nullCheck();
        boolean zMo31696Ia = false;
        if (!jyb.m147479J(bubbleInfo.textTheme.backgroundColor)) {
            this.f43632e.setBackgroundDrawable(m66771k0(bubbleInfo.textTheme.backgroundColor));
            try {
                this.f43631d.setContentColor(Color.parseColor(bubbleInfo.textTheme.backgroundColor.get(0)));
            } catch (Exception e) {
                this.f43631d.setContentColor(Color.parseColor("#ffffff"));
                CrashHelper.m82479c(e);
            }
        }
        this.f43637j.setBackgroundDrawable(m66770j0(Color.parseColor("#68de48")));
        this.f43636i.setBackgroundDrawable(m66770j0(Color.parseColor("#ffffff")));
        User userM145688e8 = FeedModule.f39703d.m145688e8(bubbleInfo.f39578id);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String str = "他";
        if (NullChecker.m82486a(userM145688e8)) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f43633f;
            String str2 = userM145688e8.m61308fp().profileSmall().formatted();
            int i = qa00.f156288A;
            fsb0Var.m127109I0(vDraweeView, str2, i, i);
            zMo31696Ia = FeedModule.m61406H().mo31696Ia(userM145688e8);
            str = userM145688e8.isFemale() ? "她" : "他";
            sb2.append(userM145688e8.name);
            sb2.append(" · ");
            sb2.append(userM145688e8.age);
            sb2.append("岁");
            String strM66773i0 = m66773i0(userM145688e8.location);
            if (!TextUtils.isEmpty(sb2)) {
                sb2.append(" · ");
                sb2.append(strM66773i0);
            }
        }
        sb.append(str);
        sb.append("喜欢了你，打个招呼吧");
        this.f43634g.setText(sb.toString());
        this.f43635h.setText(sb2.toString());
        bnl0.m105524M(this.f43635h, !TextUtils.isEmpty(sb2.toString()));
        bnl0.m105524M(this.f43637j, zMo31696Ia);
        bnl0.m105524M(this.f43636i, zMo31696Ia);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66772h0(this);
    }

    public FeedFakeSquareItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedFakeSquareItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
