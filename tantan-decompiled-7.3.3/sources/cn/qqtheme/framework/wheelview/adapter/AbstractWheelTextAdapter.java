package cn.qqtheme.framework.wheelview.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p153l.yzv;

/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractWheelTextAdapter extends AbstractWheelAdapter {
    public static final int DEFAULT_TEXT_COLOR = -10987432;
    public static final int DEFAULT_TEXT_SIZE = 18;
    public static final int LABEL_COLOR = -9437072;
    protected static final int NO_RESOURCE = 0;
    public static final int TEXT_VIEW_ITEM_RESOURCE = -1;
    protected Context context;
    protected int emptyItemResourceId;
    protected LayoutInflater inflater;
    protected int itemResourceId;
    protected int itemTextResourceId;
    private int textColor;
    private int textSize;

    public AbstractWheelTextAdapter(Context context, int i, int i2) {
        this.textColor = DEFAULT_TEXT_COLOR;
        this.textSize = 18;
        this.context = context;
        this.itemResourceId = i;
        this.itemTextResourceId = i2;
        this.inflater = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void configureCurrentTextView(TextView textView) {
        textView.setTextColor(this.textColor);
        textView.setGravity(17);
        textView.setTextSize(20.0f);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
    }

    public void configureTextView(TextView textView) {
        textView.setTextColor(this.textColor);
        textView.setGravity(17);
        textView.setTextSize(this.textSize);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setLines(1);
    }

    @Override // cn.qqtheme.framework.wheelview.adapter.AbstractWheelAdapter, cn.qqtheme.framework.wheelview.adapter.WheelViewAdapter
    public View getEmptyItem(View view, ViewGroup viewGroup) {
        if (view == null) {
            view = getView(this.emptyItemResourceId, viewGroup);
        }
        if (this.emptyItemResourceId == -1 && (view instanceof TextView)) {
            configureTextView((TextView) view);
        }
        return view;
    }

    public int getEmptyItemResource() {
        return this.emptyItemResourceId;
    }

    @Override // cn.qqtheme.framework.wheelview.adapter.WheelViewAdapter
    public View getItem(int i, View view, ViewGroup viewGroup) {
        if (i < 0 || i >= getItemsCount()) {
            return null;
        }
        if (view == null) {
            view = getView(this.itemResourceId, viewGroup);
        }
        TextView textView = getTextView(view, this.itemTextResourceId);
        if (textView != null) {
            CharSequence itemText = getItemText(i);
            if (itemText == null) {
                itemText = "";
            }
            textView.setText(itemText);
            if (this.itemResourceId == -1) {
                configureTextView(textView);
            }
        }
        return view;
    }

    public int getItemResource() {
        return this.itemResourceId;
    }

    public abstract CharSequence getItemText(int i);

    public int getItemTextResource() {
        return this.itemTextResourceId;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public int getTextSize() {
        return this.textSize;
    }

    public TextView getTextView(View view, int i) {
        if (i == 0) {
            try {
                if (view instanceof TextView) {
                    return (TextView) view;
                }
            } catch (ClassCastException e) {
                Log.e("AbstractWheelAdapter", "You must supply a resource ID for a TextView");
                yzv.m218057a("AbstractWheelAdapter requires the resource ID to be a TextView", e);
            }
        }
        if (i != 0) {
            return (TextView) view.findViewById(i);
        }
        return null;
    }

    public View getView(int i, ViewGroup viewGroup) {
        if (i != -1) {
            if (i != 0) {
                return this.inflater.inflate(i, viewGroup, false);
            }
            return null;
        }
        TextView textView = new TextView(this.context);
        textView.setPadding(0, 20, 0, 20);
        return textView;
    }

    public void setEmptyItemResource(int i) {
        this.emptyItemResourceId = i;
    }

    public void setItemResource(int i) {
        this.itemResourceId = i;
    }

    public void setItemTextResource(int i) {
        this.itemTextResourceId = i;
    }

    public void setTextColor(int i) {
        this.textColor = i;
    }

    public void setTextSize(int i) {
        this.textSize = i;
    }

    public AbstractWheelTextAdapter(Context context, int i) {
        this(context, i, 0);
    }

    public AbstractWheelTextAdapter(Context context) {
        this(context, -1);
    }
}
