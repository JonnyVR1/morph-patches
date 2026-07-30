package com.google.android.material.radiobutton;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import com.google.android.material.C2466R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import p149l.cs5;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialRadioButton extends AppCompatRadioButton {
    private static final int DEF_STYLE_RES = C2466R.style.Widget_MaterialComponents_CompoundButton_RadioButton;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @Nullable
    private ColorStateList materialThemeColorsTintList;
    private boolean useMaterialThemeColors;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(ThemeEnforcement.createThemedContext(context, attributeSet, i, i2), attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, C2466R.styleable.MaterialRadioButton, i, i2, new int[0]);
        this.useMaterialThemeColors = typedArrayObtainStyledAttributes.getBoolean(C2466R.styleable.MaterialRadioButton_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int color = MaterialColors.getColor(this, C2466R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, C2466R.attr.colorOnSurface);
            int color3 = MaterialColors.getColor(this, C2466R.attr.colorSurface);
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = MaterialColors.layer(color3, color, 1.0f);
            iArr2[1] = MaterialColors.layer(color3, color2, 0.54f);
            iArr2[2] = MaterialColors.layer(color3, color2, 0.38f);
            iArr2[3] = MaterialColors.layer(color3, color2, 0.38f);
            this.materialThemeColorsTintList = new ColorStateList(iArr, iArr2);
        }
        return this.materialThemeColorsTintList;
    }

    public boolean isUseMaterialThemeColors() {
        return this.useMaterialThemeColors;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.useMaterialThemeColors && cs5.m108480b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            cs5.m108481c(this, getMaterialThemeColorsTintList());
        } else {
            cs5.m108481c(this, null);
        }
    }

    public MaterialRadioButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2466R.attr.radioButtonStyle);
    }

    public MaterialRadioButton(@NonNull Context context) {
        this(context, null);
    }
}
