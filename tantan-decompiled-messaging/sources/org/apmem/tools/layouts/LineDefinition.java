package org.apmem.tools.layouts;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class LineDefinition {
    private int lineLength;
    private int lineThickness;
    private final int maxLength;
    private final List<View> views = new ArrayList();
    private int lineStartThickness = 0;
    private int lineStartLength = 0;

    public LineDefinition(int i) {
        this.maxLength = i;
    }

    public void addView(int i, View view) {
        FlowLayout.LayoutParams layoutParams = (FlowLayout.LayoutParams) view.getLayoutParams();
        this.views.add(i, view);
        this.lineLength = this.lineLength + layoutParams.getLength() + layoutParams.getSpacingLength();
        this.lineThickness = Math.max(this.lineThickness, layoutParams.getThickness() + layoutParams.getSpacingThickness());
    }

    public boolean canFit(View view) {
        FlowLayout.LayoutParams layoutParams = (FlowLayout.LayoutParams) view.getLayoutParams();
        return (this.lineLength + layoutParams.getLength()) + layoutParams.getSpacingLength() <= this.maxLength;
    }

    public int getLineLength() {
        return this.lineLength;
    }

    public int getLineStartLength() {
        return this.lineStartLength;
    }

    public int getLineStartThickness() {
        return this.lineStartThickness;
    }

    public int getLineThickness() {
        return this.lineThickness;
    }

    public List<View> getViews() {
        return this.views;
    }

    public void setLength(int i) {
        this.lineLength = i;
    }

    public void setLineStartLength(int i) {
        this.lineStartLength = i;
    }

    public void setLineStartThickness(int i) {
        this.lineStartThickness = i;
    }

    public void setThickness(int i) {
        this.lineThickness = i;
    }

    public void addView(View view) {
        addView(this.views.size(), view);
    }
}
