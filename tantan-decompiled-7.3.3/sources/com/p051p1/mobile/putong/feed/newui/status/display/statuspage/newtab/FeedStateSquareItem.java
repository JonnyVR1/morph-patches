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
import p153l.ksg;
import p153l.qa00;
import p153l.uqb0;
import p153l.v3i;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStateSquareItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public FeedSquareBottomStickoutView f43661d;

    /* JADX INFO: renamed from: e */
    public ConstraintLayout f43662e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f43663f;

    /* JADX INFO: renamed from: g */
    public Space f43664g;

    /* JADX INFO: renamed from: h */
    public View f43665h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f43666i;

    /* JADX INFO: renamed from: j */
    public VText f43667j;

    /* JADX INFO: renamed from: k */
    public VText f43668k;

    /* JADX INFO: renamed from: l */
    public View f43669l;

    /* JADX INFO: renamed from: m */
    public View f43670m;

    /* JADX INFO: renamed from: n */
    public Space f43671n;

    public FeedStateSquareItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public static GradientDrawable m66782i0(@ColorInt int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(1);
        return gradientDrawable;
    }

    /* JADX INFO: renamed from: j0 */
    public static GradientDrawable m66783j0(List<String> list) {
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
    public final void m66784h0(View view) {
        v3i.m199279a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m66785k0(c2i c2iVar) {
        this.f43667j.getPaint().setFakeBoldText(true);
        BubbleInfo bubbleInfo = c2iVar.f79481b;
        if (bubbleInfo == null) {
            return;
        }
        bubbleInfo.nullCheck();
        if (!TextUtils.isEmpty(bubbleInfo.emotion.emojiUrl)) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f43666i;
            String str = bubbleInfo.emotion.emojiUrl;
            int i = qa00.f156327n;
            fsb0Var.m127109I0(vDraweeView, str, i, i);
        }
        this.f43667j.setText(bubbleInfo.value);
        boolean zMo31696Ia = false;
        if (!jyb.m147479J(bubbleInfo.textTheme.backgroundColor)) {
            this.f43662e.setBackgroundDrawable(m66783j0(bubbleInfo.textTheme.backgroundColor));
            try {
                this.f43661d.setContentColor(Color.parseColor(bubbleInfo.textTheme.backgroundColor.get(0)));
            } catch (Exception e) {
                this.f43661d.setContentColor(Color.parseColor("#ffffff"));
                CrashHelper.m82479c(e);
            }
        }
        boolean zM147479J = jyb.m147479J(bubbleInfo.textTheme.iconColor);
        View view = this.f43665h;
        if (zM147479J) {
            bnl0.m105524M(view, false);
        } else {
            bnl0.m105524M(view, true);
            try {
                this.f43665h.setBackgroundDrawable(m66782i0(Color.parseColor(bubbleInfo.textTheme.iconColor.get(0))));
            } catch (Exception e2) {
                this.f43665h.setBackgroundDrawable(m66782i0(Color.parseColor("#ffffff")));
                CrashHelper.m82479c(e2);
            }
        }
        this.f43670m.setBackgroundDrawable(m66782i0(Color.parseColor("#68de48")));
        this.f43669l.setBackgroundDrawable(m66782i0(Color.parseColor("#ffffff")));
        User userM145688e8 = FeedModule.f39703d.m145688e8(bubbleInfo.owner.f39651id);
        StringBuilder sb = new StringBuilder();
        if (NullChecker.m82486a(userM145688e8)) {
            fsb0 fsb0Var2 = uqb0.f180374G;
            VDraweeView vDraweeView2 = this.f43663f;
            String str2 = userM145688e8.m61308fp().profileSmall().formatted();
            int i2 = qa00.f156288A;
            fsb0Var2.m127109I0(vDraweeView2, str2, i2, i2);
            zMo31696Ia = FeedModule.m61406H().mo31696Ia(userM145688e8);
        }
        if (!TextUtils.isEmpty(c2iVar.f79483d)) {
            sb.append(c2iVar.f79483d);
        } else if (NullChecker.m82486a(userM145688e8)) {
            sb.append(ksg.m151183R(userM145688e8, (long) bubbleInfo.createdTime, userM145688e8.getLastActiveTimeMillis()));
        }
        if (!TextUtils.isEmpty(c2iVar.f79484e)) {
            if (!TextUtils.isEmpty(sb.toString())) {
                sb.append("·");
            }
            sb.append(c2iVar.f79484e);
        }
        this.f43668k.setText(sb.toString());
        bnl0.m105524M(this.f43670m, zMo31696Ia);
        bnl0.m105524M(this.f43669l, zMo31696Ia);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m66784h0(this);
    }

    public FeedStateSquareItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedStateSquareItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
