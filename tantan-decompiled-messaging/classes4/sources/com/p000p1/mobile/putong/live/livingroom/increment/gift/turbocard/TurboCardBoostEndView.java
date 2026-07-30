package com.p000p1.mobile.putong.live.livingroom.increment.gift.turbocard;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import p002l.edj0;
import p002l.i3c0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TurboCardBoostEndView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f6227d;

    /* JADX INFO: renamed from: e */
    public VImage f6228e;

    /* JADX INFO: renamed from: f */
    public VText f6229f;

    /* JADX INFO: renamed from: g */
    public VText f6230g;

    /* JADX INFO: renamed from: h */
    public VImage f6231h;

    public TurboCardBoostEndView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7878h0(View view) {
        edj0.m12328a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i0 */
    public void m7879i0(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        String strValueOf = String.valueOf(turboCardResultNotice.getTotalAudience());
        String str = String.format(getContext().getString(R$string.f3674xd), strValueOf);
        if (LongLinkMedalMessage.CardTypeEnum.SUPER.equals(turboCardResultNotice.getType())) {
            this.f6231h.setBackground(getResources().getDrawable(i3c0.f12923q8));
            this.f6227d.setBackground(getResources().getDrawable(i3c0.f12562L7));
            this.f6229f.setText(getContext().getString(R$string.f3324he));
            str = String.format(getContext().getString(R$string.f3346ie), strValueOf);
        } else if (LongLinkMedalMessage.CardTypeEnum.SENIOR.equals(turboCardResultNotice.getType())) {
            this.f6231h.setBackground(getResources().getDrawable(i3c0.f12730a7));
            this.f6227d.setBackground(getResources().getDrawable(i3c0.f12550K7));
            this.f6229f.setText(getContext().getString(R$string.f3652wd));
        }
        SpannableString spannableString = new SpannableString(str);
        int iLastIndexOf = str.lastIndexOf(strValueOf);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffcb20")), iLastIndexOf, strValueOf.length() + iLastIndexOf, 33);
        this.f6230g.setText(spannableString);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7878h0(this);
    }

    public TurboCardBoostEndView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
