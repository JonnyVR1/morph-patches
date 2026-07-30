package com.wdullaer.materialdatetimepicker.date;

import android.view.ViewGroup;
import android.widget.TextView;
import p153l.mac0;
import p153l.q9c0;
import p153l.tnk0;

/* JADX INFO: loaded from: classes2.dex */
public class CustomizeDatePickerDialog extends DatePickerDialog {
    @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog
    /* JADX INFO: renamed from: W3 */
    public void mo86242W3() {
        TextView textView = this.f62041F;
        if (textView != null) {
            textView.setGravity(3);
            this.f62041F.setTextSize(0, getContext().getResources().getDimensionPixelSize(mac0.f135503d));
            this.f62041F.setTextColor(getContext().getResources().getColor(q9c0.f156236u));
            this.f62041F.setPadding(tnk0.m191942b(getContext(), 14.0f), tnk0.m191942b(getContext(), 18.0f), tnk0.m191942b(getContext(), 25.0f), 0);
            this.f62041F.setBackgroundColor(this.f62072Y);
            ViewGroup.LayoutParams layoutParams = this.f62041F.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-1, -2);
            } else {
                layoutParams.width = -1;
                layoutParams.height = -2;
            }
            this.f62041F.setLayoutParams(layoutParams);
        }
    }

    @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog
    /* JADX INFO: renamed from: Y3 */
    public CharSequence mo86243Y3(String str) {
        return str;
    }
}
