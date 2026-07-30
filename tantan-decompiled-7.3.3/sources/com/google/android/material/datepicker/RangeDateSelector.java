package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.C2489R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import p153l.pf60;
import p153l.yn80;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<pf60<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new Parcelable.Creator<RangeDateSelector>() { // from class: com.google.android.material.datepicker.RangeDateSelector.3
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.selectedStartItem = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.selectedEndItem = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @NonNull
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    };
    private String invalidRangeStartError;
    private final String invalidRangeEndError = MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;

    @Nullable
    private Long selectedStartItem = null;

    @Nullable
    private Long selectedEndItem = null;

    @Nullable
    private Long proposedTextStart = null;

    @Nullable
    private Long proposedTextEnd = null;

    private void clearInvalidRange(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.invalidRangeStartError.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError(null);
        }
        if (textInputLayout2.getError() == null || !MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR.contentEquals(textInputLayout2.getError())) {
            return;
        }
        textInputLayout2.setError(null);
    }

    private boolean isValidRange(long j, long j2) {
        return j <= j2;
    }

    private void setInvalidRange(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.invalidRangeStartError);
        textInputLayout2.setError(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateIfValidTextProposal(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull OnSelectionChangedListener<pf60<Long, Long>> onSelectionChangedListener) {
        Long l2 = this.proposedTextStart;
        if (l2 == null || this.proposedTextEnd == null) {
            clearInvalidRange(textInputLayout, textInputLayout2);
        } else {
            if (!isValidRange(l2.longValue(), this.proposedTextEnd.longValue())) {
                setInvalidRange(textInputLayout, textInputLayout2);
                return;
            }
            this.selectedStartItem = this.proposedTextStart;
            this.selectedEndItem = this.proposedTextEnd;
            onSelectionChangedListener.onSelectionChanged(getSelection());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@NonNull Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.resolveOrThrow(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C2489R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? C2489R.attr.materialCalendarTheme : C2489R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return C2489R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l2 = this.selectedStartItem;
        if (l2 != null) {
            arrayList.add(l2);
        }
        Long l3 = this.selectedEndItem;
        if (l3 != null) {
            arrayList.add(l3);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<pf60<Long, Long>> getSelectedRanges() {
        if (this.selectedStartItem == null || this.selectedEndItem == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new pf60(this.selectedStartItem, this.selectedEndItem));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public pf60<Long, Long> getSelection() {
        return new pf60<>(this.selectedStartItem, this.selectedEndItem);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l2 = this.selectedStartItem;
        if (l2 == null && this.selectedEndItem == null) {
            return resources.getString(C2489R.string.mtrl_picker_range_header_unselected);
        }
        Long l3 = this.selectedEndItem;
        if (l3 == null) {
            return resources.getString(C2489R.string.mtrl_picker_range_header_only_start_selected, DateStrings.getDateString(l2.longValue()));
        }
        if (l2 == null) {
            return resources.getString(C2489R.string.mtrl_picker_range_header_only_end_selected, DateStrings.getDateString(l3.longValue()));
        }
        pf60<String, String> dateRangeString = DateStrings.getDateRangeString(l2, l3);
        return resources.getString(C2489R.string.mtrl_picker_range_header_selected, dateRangeString.f152156a, dateRangeString.f152157b);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l2 = this.selectedStartItem;
        return (l2 == null || this.selectedEndItem == null || !isValidRange(l2.longValue(), this.selectedEndItem.longValue())) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull final OnSelectionChangedListener<pf60<Long, Long>> onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(C2489R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        final TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(C2489R.id.mtrl_picker_text_input_range_start);
        final TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(C2489R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (ManufacturerUtils.isSamsungDevice()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.invalidRangeStartError = viewInflate.getResources().getString(C2489R.string.mtrl_picker_invalid_range);
        SimpleDateFormat textInputFormat = UtcDates.getTextInputFormat();
        Long l2 = this.selectedStartItem;
        if (l2 != null) {
            editText.setText(textInputFormat.format(l2));
            this.proposedTextStart = this.selectedStartItem;
        }
        Long l3 = this.selectedEndItem;
        if (l3 != null) {
            editText2.setText(textInputFormat.format(l3));
            this.proposedTextEnd = this.selectedEndItem;
        }
        String textInputHint = UtcDates.getTextInputHint(viewInflate.getResources(), textInputFormat);
        editText.addTextChangedListener(new DateFormatTextWatcher(textInputHint, textInputFormat, textInputLayout, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.1
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                RangeDateSelector.this.proposedTextStart = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(@Nullable Long l4) {
                RangeDateSelector.this.proposedTextStart = l4;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        editText2.addTextChangedListener(new DateFormatTextWatcher(textInputHint, textInputFormat, textInputLayout2, calendarConstraints) { // from class: com.google.android.material.datepicker.RangeDateSelector.2
            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onInvalidDate() {
                RangeDateSelector.this.proposedTextEnd = null;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }

            @Override // com.google.android.material.datepicker.DateFormatTextWatcher
            public void onValidDate(@Nullable Long l4) {
                RangeDateSelector.this.proposedTextEnd = l4;
                RangeDateSelector.this.updateIfValidTextProposal(textInputLayout, textInputLayout2, onSelectionChangedListener);
            }
        });
        ViewUtils.requestFocusAndShowKeyboard(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j) {
        Long l2 = this.selectedStartItem;
        if (l2 == null) {
            this.selectedStartItem = Long.valueOf(j);
        } else if (this.selectedEndItem == null && isValidRange(l2.longValue(), j)) {
            this.selectedEndItem = Long.valueOf(j);
        } else {
            this.selectedEndItem = null;
            this.selectedStartItem = Long.valueOf(j);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@NonNull pf60<Long, Long> pf60Var) {
        Long l2 = pf60Var.f152156a;
        if (l2 != null && pf60Var.f152157b != null) {
            yn80.m216771a(isValidRange(l2.longValue(), pf60Var.f152157b.longValue()));
        }
        Long l3 = pf60Var.f152156a;
        this.selectedStartItem = l3 == null ? null : Long.valueOf(UtcDates.canonicalYearMonthDay(l3.longValue()));
        Long l4 = pf60Var.f152157b;
        this.selectedEndItem = l4 != null ? Long.valueOf(UtcDates.canonicalYearMonthDay(l4.longValue())) : null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeValue(this.selectedStartItem);
        parcel.writeValue(this.selectedEndItem);
    }
}
