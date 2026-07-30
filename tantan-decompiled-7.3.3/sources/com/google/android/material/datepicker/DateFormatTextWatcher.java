package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.google.android.material.C2489R;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* JADX INFO: loaded from: classes7.dex */
abstract class DateFormatTextWatcher implements TextWatcher {
    private final CalendarConstraints constraints;
    private final DateFormat dateFormat;
    private final String formatHint;
    private final String outOfRange;

    @NonNull
    private final TextInputLayout textInputLayout;

    public DateFormatTextWatcher(String str, DateFormat dateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.formatHint = str;
        this.dateFormat = dateFormat;
        this.textInputLayout = textInputLayout;
        this.constraints = calendarConstraints;
        this.outOfRange = textInputLayout.getContext().getString(C2489R.string.mtrl_picker_out_of_range);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onInvalidDate() {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(@NonNull CharSequence charSequence, int i, int i2, int i3) {
        if (TextUtils.isEmpty(charSequence)) {
            this.textInputLayout.setError(null);
            onValidDate(null);
            return;
        }
        try {
            Date date = this.dateFormat.parse(charSequence.toString());
            this.textInputLayout.setError(null);
            long time = date.getTime();
            if (this.constraints.getDateValidator().isValid(time) && this.constraints.isWithinBounds(time)) {
                onValidDate(Long.valueOf(date.getTime()));
            } else {
                this.textInputLayout.setError(String.format(this.outOfRange, DateStrings.getDateString(time)));
                onInvalidDate();
            }
        } catch (ParseException unused) {
            String string = this.textInputLayout.getContext().getString(C2489R.string.mtrl_picker_invalid_format);
            String str = String.format(this.textInputLayout.getContext().getString(C2489R.string.mtrl_picker_invalid_format_use), this.formatHint);
            String str2 = String.format(this.textInputLayout.getContext().getString(C2489R.string.mtrl_picker_invalid_format_example), this.dateFormat.format(new Date(UtcDates.getTodayCalendar().getTimeInMillis())));
            this.textInputLayout.setError(string + SignParameters.NEW_LINE + str + SignParameters.NEW_LINE + str2);
            onInvalidDate();
        }
    }

    public abstract void onValidDate(@Nullable Long l2);
}
