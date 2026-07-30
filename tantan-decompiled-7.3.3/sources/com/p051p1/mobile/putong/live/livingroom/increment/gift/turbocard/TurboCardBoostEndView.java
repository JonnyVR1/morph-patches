package com.p051p1.mobile.putong.live.livingroom.increment.gift.turbocard;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VImage;
import p151v.VText;
import p153l.imj0;
import p153l.obc0;

/* JADX INFO: loaded from: classes4.dex */
public class TurboCardBoostEndView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f51033d;

    /* JADX INFO: renamed from: e */
    public VImage f51034e;

    /* JADX INFO: renamed from: f */
    public VText f51035f;

    /* JADX INFO: renamed from: g */
    public VText f51036g;

    /* JADX INFO: renamed from: h */
    public VImage f51037h;

    public TurboCardBoostEndView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m75480h0(View view) {
        imj0.m140934a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m75481i0(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        String strValueOf = String.valueOf(turboCardResultNotice.getTotalAudience());
        String str = String.format(getContext().getString(R$string.f48480xd), strValueOf);
        if (LongLinkMedalMessage.CardTypeEnum.SUPER.equals(turboCardResultNotice.getType())) {
            this.f51037h.setBackground(getResources().getDrawable(obc0.f146466q8));
            this.f51033d.setBackground(getResources().getDrawable(obc0.f146105L7));
            this.f51035f.setText(getContext().getString(R$string.f48130he));
            str = String.format(getContext().getString(R$string.f48152ie), strValueOf);
        } else if (LongLinkMedalMessage.CardTypeEnum.SENIOR.equals(turboCardResultNotice.getType())) {
            this.f51037h.setBackground(getResources().getDrawable(obc0.f146273a7));
            this.f51033d.setBackground(getResources().getDrawable(obc0.f146093K7));
            this.f51035f.setText(getContext().getString(R$string.f48458wd));
        }
        SpannableString spannableString = new SpannableString(str);
        int iLastIndexOf = str.lastIndexOf(strValueOf);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffcb20")), iLastIndexOf, strValueOf.length() + iLastIndexOf, 33);
        this.f51036g.setText(spannableString);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75480h0(this);
    }

    public TurboCardBoostEndView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
