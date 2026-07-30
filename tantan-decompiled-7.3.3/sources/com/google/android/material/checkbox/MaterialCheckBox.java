package com.google.android.material.checkbox;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.google.android.material.C2489R;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import p153l.gt5;

/* JADX INFO: loaded from: classes7.dex */
public class MaterialCheckBox extends AppCompatCheckBox {
    private static final int DEF_STYLE_RES = C2489R.style.Widget_MaterialComponents_CompoundButton_CheckBox;
    private static final int[][] ENABLED_CHECKED_STATES = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    @Nullable
    private ColorStateList materialThemeColorsTintList;
    private boolean useMaterialThemeColors;

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet, int i) {
        int i2 = DEF_STYLE_RES;
        super(ThemeEnforcement.createThemedContext(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, C2489R.styleable.MaterialCheckBox, i, i2, new int[0]);
        if (typedArrayObtainStyledAttributes.hasValue(C2489R.styleable.MaterialCheckBox_buttonTint)) {
            gt5.m132203c(this, MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, C2489R.styleable.MaterialCheckBox_buttonTint));
        }
        this.useMaterialThemeColors = typedArrayObtainStyledAttributes.getBoolean(C2489R.styleable.MaterialCheckBox_useMaterialThemeColors, false);
        typedArrayObtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.materialThemeColorsTintList == null) {
            int[][] iArr = ENABLED_CHECKED_STATES;
            int[] iArr2 = new int[iArr.length];
            int color = MaterialColors.getColor(this, C2489R.attr.colorControlActivated);
            int color2 = MaterialColors.getColor(this, C2489R.attr.colorSurface);
            int color3 = MaterialColors.getColor(this, C2489R.attr.colorOnSurface);
            iArr2[0] = MaterialColors.layer(color2, color, 1.0f);
            iArr2[1] = MaterialColors.layer(color2, color3, 0.54f);
            iArr2[2] = MaterialColors.layer(color2, color3, 0.38f);
            iArr2[3] = MaterialColors.layer(color2, color3, 0.38f);
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
        if (this.useMaterialThemeColors && gt5.m132202b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.useMaterialThemeColors = z;
        if (z) {
            gt5.m132203c(this, getMaterialThemeColorsTintList());
        } else {
            gt5.m132203c(this, null);
        }
    }

    public MaterialCheckBox(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, C2489R.attr.checkboxStyle);
    }

    public MaterialCheckBox(Context context) {
        this(context, null);
    }
}
