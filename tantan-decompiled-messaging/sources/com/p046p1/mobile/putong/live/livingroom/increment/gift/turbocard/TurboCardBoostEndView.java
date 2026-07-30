package com.p046p1.mobile.putong.live.livingroom.increment.gift.turbocard;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VImage;
import p147v.VText;
import p149l.edj0;
import p149l.i3c0;

/* JADX INFO: loaded from: classes4.dex */
public class TurboCardBoostEndView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public View f50185d;

    /* JADX INFO: renamed from: e */
    public VImage f50186e;

    /* JADX INFO: renamed from: f */
    public VText f50187f;

    /* JADX INFO: renamed from: g */
    public VText f50188g;

    /* JADX INFO: renamed from: h */
    public VImage f50189h;

    public TurboCardBoostEndView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m74297h0(View view) {
        edj0.m115810a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m74298i0(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        String strValueOf = String.valueOf(turboCardResultNotice.getTotalAudience());
        String str = String.format(getContext().getString(R$string.f47632xd), strValueOf);
        if (LongLinkMedalMessage.CardTypeEnum.SUPER.equals(turboCardResultNotice.getType())) {
            this.f50189h.setBackground(getResources().getDrawable(i3c0.f111138q8));
            this.f50185d.setBackground(getResources().getDrawable(i3c0.f110777L7));
            this.f50187f.setText(getContext().getString(R$string.f47282he));
            str = String.format(getContext().getString(R$string.f47304ie), strValueOf);
        } else if (LongLinkMedalMessage.CardTypeEnum.SENIOR.equals(turboCardResultNotice.getType())) {
            this.f50189h.setBackground(getResources().getDrawable(i3c0.f110945a7));
            this.f50185d.setBackground(getResources().getDrawable(i3c0.f110765K7));
            this.f50187f.setText(getContext().getString(R$string.f47610wd));
        }
        SpannableString spannableString = new SpannableString(str);
        int iLastIndexOf = str.lastIndexOf(strValueOf);
        spannableString.setSpan(new ForegroundColorSpan(Color.parseColor("#ffcb20")), iLastIndexOf, strValueOf.length() + iLastIndexOf, 33);
        this.f50188g.setText(spannableString);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74297h0(this);
    }

    public TurboCardBoostEndView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
