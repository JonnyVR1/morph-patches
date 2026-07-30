package cn.qqtheme.framework.wheelview.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class NumericWheelAdapter extends AbstractWheelTextAdapter {
    public static final int DEFAULT_MAX_VALUE = 9;
    private static final int DEFAULT_MIN_VALUE = 0;
    private ArrayList<View> arrayList;
    private String format;
    private String label;
    private int maxValue;
    private int minValue;
    private int position;

    public NumericWheelAdapter(Context context, int i, int i2, String str) {
        super(context);
        this.label = "";
        this.arrayList = new ArrayList<>();
        this.minValue = i;
        this.maxValue = i2;
        this.format = str;
    }

    @Override // cn.qqtheme.framework.wheelview.adapter.AbstractWheelTextAdapter, cn.qqtheme.framework.wheelview.adapter.WheelViewAdapter
    public View getItem(int i, View view, ViewGroup viewGroup) {
        if (i < 0 || i >= getItemsCount()) {
            return null;
        }
        if (view == null) {
            view = getView(this.itemResourceId, viewGroup);
        }
        TextView textView = getTextView(view, this.itemTextResourceId);
        if (!this.arrayList.contains(textView)) {
            this.arrayList.add(textView);
        }
        if (textView != null) {
            CharSequence itemText = getItemText(i);
            if (itemText == null) {
                itemText = "";
            }
            textView.setText(((Object) itemText) + this.label);
            if (this.itemResourceId == -1) {
                if (i == this.position) {
                    configureCurrentTextView(textView);
                    return view;
                }
                configureTextView(textView);
            }
        }
        return view;
    }

    @Override // cn.qqtheme.framework.wheelview.adapter.AbstractWheelTextAdapter
    public CharSequence getItemText(int i) {
        if (i < 0 || i >= getItemsCount()) {
            return null;
        }
        int i2 = this.minValue + i;
        String str = this.format;
        return str != null ? String.format(str, Integer.valueOf(i2)) : Integer.toString(i2);
    }

    @Override // cn.qqtheme.framework.wheelview.adapter.WheelViewAdapter
    public int getItemsCount() {
        return (this.maxValue - this.minValue) + 1;
    }

    public ArrayList<View> getTestViews() {
        return this.arrayList;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public void setPosition(int i) {
        this.position = i;
    }

    public NumericWheelAdapter(Context context, int i, int i2) {
        this(context, i, i2, null);
    }

    public NumericWheelAdapter(Context context) {
        this(context, 0, 9);
    }
}
