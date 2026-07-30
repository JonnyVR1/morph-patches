package com.wdullaer.materialdatetimepicker.date;

import android.view.ViewGroup;
import android.widget.TextView;
import p149l.f2c0;
import p149l.k1c0;
import p149l.nek0;

/* JADX INFO: loaded from: classes2.dex */
public class CustomizeDatePickerDialog extends DatePickerDialog {
    @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog
    /* JADX INFO: renamed from: W3 */
    public void mo85071W3() {
        TextView textView = this.f61194F;
        if (textView != null) {
            textView.setGravity(3);
            this.f61194F.setTextSize(0, getContext().getResources().getDimensionPixelSize(f2c0.f94166d));
            this.f61194F.setTextColor(getContext().getResources().getColor(k1c0.f120578u));
            this.f61194F.setPadding(nek0.m159112b(getContext(), 14.0f), nek0.m159112b(getContext(), 18.0f), nek0.m159112b(getContext(), 25.0f), 0);
            this.f61194F.setBackgroundColor(this.f61225Y);
            ViewGroup.LayoutParams layoutParams = this.f61194F.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
            this.f61194F.setLayoutParams(layoutParams);
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog
    /* JADX INFO: renamed from: Y3 */
    public CharSequence mo85072Y3(String str) {
        return str;
    }
}
