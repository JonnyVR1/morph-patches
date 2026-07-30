package cn.qqtheme.framework.wheelview;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import cn.qqtheme.framework.wheelpicker.C0797R;
import cn.qqtheme.framework.wheelview.adapter.AbstractWheelTextAdapter;
import cn.qqtheme.framework.wheelview.adapter.WheelViewAdapter;
import com.p046p1.mobile.putong.live.base.data.BLiveBottomPopupStyleTypeEnum;
import com.p069ss.bytertc.audio.device.webrtc.WebRtcAudioRecord;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public class WheelView extends View {
    private static final int DEF_VISIBLE_ITEMS = 5;
    private static final int ITEM_OFFSET_PERCENT = 30;
    private static final int PADDING = 5;
    private static final int leastScreenHeight = 1024;
    private int[] SHADOWS_COLORS;
    private GradientDrawable bottomShadow;
    private Drawable centerDrawable;
    private List<OnWheelChangedListener> changingListeners;
    private List<OnWheelClickedListener> clickingListeners;
    private int currentItem;
    private DataSetObserver dataObserver;
    private boolean drawShadows;
    private ItemsRange enableRange;
    private int firstItem;
    boolean isCyclic;
    private boolean isScrollingPerformed;
    private int itemHeight;
    private LinearLayout itemsLayout;
    private WheelRecycle recycle;
    private WheelScroller scroller;
    WheelScroller.ScrollingListener scrollingListener;
    private List<OnWheelScrollListener> scrollingListeners;
    private int scrollingOffset;
    private GradientDrawable topShadow;
    private WheelViewAdapter viewAdapter;
    private int visibleItems;
    private int wheelBackground;
    private int wheelForeground;

    public WheelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.SHADOWS_COLORS = new int[]{-1, 16777215, 16777215};
        this.currentItem = 0;
        this.visibleItems = 5;
        this.itemHeight = 0;
        this.wheelBackground = C0797R.drawable.wheel_bg;
        this.wheelForeground = C0797R.drawable.wheel_val;
        this.drawShadows = true;
        this.isCyclic = false;
        this.recycle = new WheelRecycle(this);
        this.changingListeners = new LinkedList();
        this.scrollingListeners = new LinkedList();
        this.clickingListeners = new LinkedList();
        this.scrollingListener = new WheelScroller.ScrollingListener() { // from class: cn.qqtheme.framework.wheelview.WheelView.1
            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onFinished() {
                if (WheelView.this.isScrollingPerformed) {
                    WheelView.this.notifyScrollingListenersAboutEnd();
                    WheelView.this.isScrollingPerformed = false;
                }
                WheelView.this.scrollingOffset = 0;
                WheelView.this.invalidate();
            }

            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onJustify() {
                if (Math.abs(WheelView.this.scrollingOffset) > 1) {
                    if (WheelView.this.enableRange != null) {
                        int i2 = WheelView.this.currentItem;
                        int i3 = WheelView.this.currentItem;
                        int first = WheelView.this.enableRange.getFirst();
                        WheelView wheelView = WheelView.this;
                        if (i3 < first) {
                            wheelView.scrollingOffset -= ((WheelView.this.enableRange.getFirst() - WheelView.this.currentItem) - 1) * WheelView.this.itemHeight;
                            WheelView wheelView2 = WheelView.this;
                            wheelView2.currentItem = wheelView2.enableRange.getFirst();
                        } else if (wheelView.currentItem > WheelView.this.enableRange.getLast()) {
                            WheelView.this.scrollingOffset += (WheelView.this.currentItem - WheelView.this.enableRange.getLast()) * WheelView.this.itemHeight;
                            WheelView wheelView3 = WheelView.this;
                            wheelView3.currentItem = wheelView3.enableRange.getLast();
                        }
                        if (i2 != WheelView.this.currentItem) {
                            WheelView wheelView4 = WheelView.this;
                            wheelView4.notifyChangingListeners(i2, wheelView4.currentItem);
                        }
                    }
                    WheelView.this.scroller.scroll(WheelView.this.scrollingOffset, 0);
                }
            }

            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onScroll(int i2) {
                WheelView.this.doScroll(i2);
                int height = WheelView.this.getHeight();
                int i3 = WheelView.this.scrollingOffset;
                WheelView wheelView = WheelView.this;
                if (i3 > height) {
                    wheelView.scrollingOffset = height;
                    WheelView.this.scroller.stopScrolling();
                    return;
                }
                int i4 = -height;
                if (wheelView.scrollingOffset < i4) {
                    WheelView.this.scrollingOffset = i4;
                    WheelView.this.scroller.stopScrolling();
                }
            }

            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onStarted() {
                WheelView.this.isScrollingPerformed = true;
                WheelView.this.notifyScrollingListenersAboutStart();
            }
        };
        this.dataObserver = new DataSetObserver() { // from class: cn.qqtheme.framework.wheelview.WheelView.2
            @Override // android.database.DataSetObserver
            public void onChanged() {
                WheelView.this.invalidateWheel(false);
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                WheelView.this.invalidateWheel(true);
            }
        };
        initData(context);
    }

    private boolean addViewItem(int i, boolean z) {
        View itemView = getItemView(i);
        if (itemView == null) {
            return false;
        }
        int i2 = getScreenHeight() > 1024 ? 150 : -2;
        LinearLayout linearLayout = this.itemsLayout;
        if (z) {
            linearLayout.addView(itemView, 0, new LinearLayout.LayoutParams(-2, i2));
            return true;
        }
        linearLayout.addView(itemView, new LinearLayout.LayoutParams(-2, i2));
        return true;
    }

    private void buildViewForMeasuring() {
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout != null) {
            this.recycle.recycleItems(linearLayout, this.firstItem, new ItemsRange());
        } else {
            createItemsLayout();
        }
        int i = this.visibleItems / 2;
        for (int i2 = this.currentItem + i; i2 >= this.currentItem - i; i2--) {
            if (addViewItem(i2, true)) {
                this.firstItem = i2;
            }
        }
    }

    private int calculateLayoutWidth(int i, int i2) {
        initResourcesIfNecessary();
        this.itemsLayout.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        this.itemsLayout.setHorizontalGravity(1);
        this.itemsLayout.measure(View.MeasureSpec.makeMeasureSpec(i, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = this.itemsLayout.getMeasuredWidth();
        if (i2 != 1073741824) {
            int iMax = Math.max(measuredWidth + 10, getSuggestedMinimumWidth());
            if (i2 != Integer.MIN_VALUE || i >= iMax) {
                i = iMax;
            }
        }
        this.itemsLayout.measure(View.MeasureSpec.makeMeasureSpec(i - 10, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        return i;
    }

    private void createItemsLayout() {
        if (this.itemsLayout == null) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            this.itemsLayout = linearLayout;
            linearLayout.setOrientation(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doScroll(int i) {
        this.scrollingOffset += i;
        int itemHeight = getItemHeight();
        int i2 = this.scrollingOffset / itemHeight;
        int i3 = this.currentItem - i2;
        int itemsCount = this.viewAdapter.getItemsCount();
        int i4 = this.scrollingOffset % itemHeight;
        if (Math.abs(i4) <= itemHeight / 2) {
            i4 = 0;
        }
        if (this.isCyclic && itemsCount > 0) {
            if (i4 > 0) {
                i3--;
                i2++;
            } else if (i4 < 0) {
                i3++;
                i2--;
            }
            while (i3 < 0) {
                i3 += itemsCount;
            }
            i3 %= itemsCount;
        } else if (i3 < 0) {
            i2 = this.currentItem;
            i3 = 0;
        } else if (i3 >= itemsCount) {
            i2 = (this.currentItem - itemsCount) + 1;
            i3 = itemsCount - 1;
        } else if (i3 > 0 && i4 > 0) {
            i3--;
            i2++;
        } else if (i3 < itemsCount - 1 && i4 < 0) {
            i3++;
            i2--;
        }
        int i5 = this.scrollingOffset;
        if (i3 != this.currentItem) {
            setCurrentItem(i3, false);
        } else {
            invalidate();
        }
        int i6 = i5 - (i2 * itemHeight);
        this.scrollingOffset = i6;
        if (i6 > getHeight()) {
            this.scrollingOffset = (this.scrollingOffset % getHeight()) + getHeight();
        }
    }

    private void drawCenterRect(Canvas canvas) {
        int height = getHeight() / 2;
        int itemHeight = getItemHeight() / 2;
        Paint paint = new Paint();
        paint.setColor(getResources().getColor(C0797R.color.orange));
        paint.setStrokeWidth(5.0f);
        float f = height - itemHeight;
        canvas.drawLine((getWidth() + WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_IS_NULL) / 2, f, (getWidth() + 300) / 2, f, paint);
        float f2 = height + itemHeight;
        canvas.drawLine((getWidth() + WebRtcAudioRecord.AudioRecordErrorCode.AUDIO_RECORD_START_IS_NULL) / 2, f2, (getWidth() + 300) / 2, f2, paint);
    }

    private void drawItems(Canvas canvas) {
        canvas.save();
        canvas.translate(5.0f, (-(((this.currentItem - this.firstItem) * getItemHeight()) + ((getItemHeight() - getHeight()) / 2))) + this.scrollingOffset);
        this.itemsLayout.draw(canvas);
        canvas.restore();
    }

    private void drawShadows(Canvas canvas) {
        int itemHeight = getItemHeight() * 3;
        this.topShadow.setBounds(0, 0, getWidth(), itemHeight);
        this.topShadow.draw(canvas);
        this.bottomShadow.setBounds(0, getHeight() - itemHeight, getWidth(), getHeight());
        this.bottomShadow.draw(canvas);
    }

    private int getDesiredHeight(LinearLayout linearLayout) {
        if (linearLayout != null && linearLayout.getChildAt(0) != null) {
            this.itemHeight = linearLayout.getChildAt(0).getMeasuredHeight();
        }
        int i = this.itemHeight;
        return Math.max((this.visibleItems * i) - ((i * 30) / 50), getSuggestedMinimumHeight());
    }

    private int getItemHeight() {
        int i = this.itemHeight;
        if (i != 0) {
            return i;
        }
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout == null || linearLayout.getChildAt(0) == null) {
            return getHeight() / this.visibleItems;
        }
        int height = this.itemsLayout.getChildAt(0).getHeight();
        this.itemHeight = height;
        return height;
    }

    private View getItemView(int i) {
        ItemsRange itemsRange;
        WheelViewAdapter wheelViewAdapter = this.viewAdapter;
        if (wheelViewAdapter == null || wheelViewAdapter.getItemsCount() == 0) {
            return null;
        }
        int itemsCount = this.viewAdapter.getItemsCount();
        if (!isValidItemIndex(i)) {
            return this.viewAdapter.getEmptyItem(this.recycle.getEmptyItem(), this.itemsLayout);
        }
        while (i < 0) {
            i += itemsCount;
        }
        int i2 = i % itemsCount;
        View item = this.viewAdapter.getItem(i2, this.recycle.getItem(), this.itemsLayout);
        if ((item instanceof TextView) && (itemsRange = this.enableRange) != null && (i2 < itemsRange.getFirst() || (i2 > this.enableRange.getLast() && i2 > 0))) {
            ((TextView) item).setTextColor(getContext().getResources().getColor(C0797R.color.text_gray));
            return item;
        }
        WheelViewAdapter wheelViewAdapter2 = this.viewAdapter;
        if (wheelViewAdapter2 instanceof AbstractWheelTextAdapter) {
            ((TextView) item).setTextColor(((AbstractWheelTextAdapter) wheelViewAdapter2).getTextColor());
        }
        return item;
    }

    private ItemsRange getItemsRange() {
        if (getItemHeight() == 0) {
            return null;
        }
        int i = this.currentItem;
        int iAsin = 1;
        while (getItemHeight() * iAsin < getHeight()) {
            i--;
            iAsin += 2;
        }
        int i2 = this.scrollingOffset;
        if (i2 != 0) {
            if (i2 > 0) {
                i--;
            }
            int itemHeight = i2 / getItemHeight();
            i -= itemHeight;
            iAsin = (int) (((double) (iAsin + 1)) + Math.asin(itemHeight));
        }
        return new ItemsRange(i, iAsin);
    }

    private void initData(Context context) {
        this.scroller = new WheelScroller(getContext(), this.scrollingListener);
    }

    private void initResourcesIfNecessary() {
        if (this.centerDrawable == null) {
            this.centerDrawable = getContext().getResources().getDrawable(this.wheelForeground);
        }
        if (this.topShadow == null) {
            this.topShadow = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, this.SHADOWS_COLORS);
        }
        if (this.bottomShadow == null) {
            this.bottomShadow = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, this.SHADOWS_COLORS);
        }
        setBackgroundResource(this.wheelBackground);
    }

    private boolean isValidItemIndex(int i) {
        WheelViewAdapter wheelViewAdapter = this.viewAdapter;
        if (wheelViewAdapter == null || wheelViewAdapter.getItemsCount() <= 0) {
            return false;
        }
        if (this.isCyclic) {
            return true;
        }
        return i >= 0 && i < this.viewAdapter.getItemsCount();
    }

    private void layout(int i, int i2) {
        this.itemsLayout.layout(0, 0, i - 10, i2);
    }

    private boolean rebuildItems() {
        boolean z;
        ItemsRange itemsRange = getItemsRange();
        LinearLayout linearLayout = this.itemsLayout;
        if (linearLayout != null) {
            int iRecycleItems = this.recycle.recycleItems(linearLayout, this.firstItem, itemsRange);
            z = this.firstItem != iRecycleItems;
            this.firstItem = iRecycleItems;
        } else {
            createItemsLayout();
            z = true;
        }
        if (!z) {
            z = (this.firstItem == itemsRange.getFirst() && this.itemsLayout.getChildCount() == itemsRange.getCount()) ? false : true;
        }
        if (this.firstItem <= itemsRange.getFirst() || this.firstItem > itemsRange.getLast()) {
            this.firstItem = itemsRange.getFirst();
        } else {
            for (int i = this.firstItem - 1; i >= itemsRange.getFirst() && addViewItem(i, true); i--) {
                this.firstItem = i;
            }
        }
        int i2 = this.firstItem;
        for (int childCount = this.itemsLayout.getChildCount(); childCount < itemsRange.getCount(); childCount++) {
            if (!addViewItem(this.firstItem + childCount, false) && this.itemsLayout.getChildCount() == 0) {
                i2++;
            }
        }
        this.firstItem = i2;
        return z;
    }

    private void updateView() {
        if (rebuildItems()) {
            calculateLayoutWidth(getWidth(), 1073741824);
            layout(getWidth(), getHeight());
        }
    }

    public void addChangingListener(OnWheelChangedListener onWheelChangedListener) {
        this.changingListeners.add(onWheelChangedListener);
    }

    public void addClickingListener(OnWheelClickedListener onWheelClickedListener) {
        this.clickingListeners.add(onWheelClickedListener);
    }

    public void addScrollingListener(OnWheelScrollListener onWheelScrollListener) {
        this.scrollingListeners.add(onWheelScrollListener);
    }

    public int getCurrentItem() {
        return this.currentItem;
    }

    public int getScreenHeight() {
        WindowManager windowManager = (WindowManager) getContext().getSystemService(BLiveBottomPopupStyleTypeEnum.window);
        Point point = new Point();
        windowManager.getDefaultDisplay().getSize(point);
        return point.y;
    }

    public WheelViewAdapter getViewAdapter() {
        return this.viewAdapter;
    }

    public int getVisibleItems() {
        return this.visibleItems;
    }

    public void invalidateWheel(boolean z) {
        if (z) {
            this.recycle.clearAll();
            LinearLayout linearLayout = this.itemsLayout;
            if (linearLayout != null) {
                linearLayout.removeAllViews();
            }
            this.scrollingOffset = 0;
        } else {
            LinearLayout linearLayout2 = this.itemsLayout;
            if (linearLayout2 != null) {
                this.recycle.recycleItems(linearLayout2, this.firstItem, new ItemsRange());
            }
        }
        invalidate();
    }

    public boolean isCyclic() {
        return this.isCyclic;
    }

    public void notifyChangingListeners(int i, int i2) {
        Iterator<OnWheelChangedListener> it = this.changingListeners.iterator();
        while (it.hasNext()) {
            it.next().onChanged(this, i, i2);
        }
    }

    public void notifyClickListenersAboutClick(int i) {
        Iterator<OnWheelClickedListener> it = this.clickingListeners.iterator();
        while (it.hasNext()) {
            it.next().onItemClicked(this, i);
        }
    }

    public void notifyScrollingListenersAboutEnd() {
        Iterator<OnWheelScrollListener> it = this.scrollingListeners.iterator();
        while (it.hasNext()) {
            it.next().onScrollingFinished(this);
        }
    }

    public void notifyScrollingListenersAboutStart() {
        Iterator<OnWheelScrollListener> it = this.scrollingListeners.iterator();
        while (it.hasNext()) {
            it.next().onScrollingStarted(this);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        WheelViewAdapter wheelViewAdapter = this.viewAdapter;
        if (wheelViewAdapter != null && wheelViewAdapter.getItemsCount() > 0) {
            updateView();
            drawCenterRect(canvas);
            drawItems(canvas);
        }
        if (this.drawShadows) {
            drawShadows(canvas);
        }
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        layout(i3 - i, i4 - i2);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        buildViewForMeasuring();
        int iCalculateLayoutWidth = calculateLayoutWidth(size, mode);
        if (mode2 != 1073741824) {
            int desiredHeight = getDesiredHeight(this.itemsLayout);
            size2 = mode2 == Integer.MIN_VALUE ? Math.min(desiredHeight, size2) : desiredHeight;
        }
        setMeasuredDimension(iCalculateLayoutWidth, size2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || getViewAdapter() == null) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2 && getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        } else if (!this.isScrollingPerformed) {
            int y = ((int) motionEvent.getY()) - (getHeight() / 2);
            int itemHeight = (y > 0 ? y + (getItemHeight() / 2) : y - (getItemHeight() / 2)) / getItemHeight();
            if (itemHeight != 0 && isValidItemIndex(this.currentItem + itemHeight)) {
                notifyClickListenersAboutClick(this.currentItem + itemHeight);
            }
        }
        return this.scroller.onTouchEvent(motionEvent);
    }

    public void removeChangingListener(OnWheelChangedListener onWheelChangedListener) {
        this.changingListeners.remove(onWheelChangedListener);
    }

    public void removeClickingListener(OnWheelClickedListener onWheelClickedListener) {
        this.clickingListeners.remove(onWheelClickedListener);
    }

    public void removeScrollingListener(OnWheelScrollListener onWheelScrollListener) {
        this.scrollingListeners.remove(onWheelScrollListener);
    }

    public void scroll(int i, int i2) {
        this.scroller.scroll((i * getItemHeight()) - this.scrollingOffset, i2);
    }

    public void setCurrentItem(int i, boolean z) {
        int iMin;
        WheelViewAdapter wheelViewAdapter = this.viewAdapter;
        if (wheelViewAdapter == null || wheelViewAdapter.getItemsCount() == 0) {
            return;
        }
        int itemsCount = this.viewAdapter.getItemsCount();
        if (i < 0 || i >= itemsCount) {
            if (!this.isCyclic) {
                return;
            }
            while (i < 0) {
                i += itemsCount;
            }
            i %= itemsCount;
        }
        int i2 = this.currentItem;
        if (i != i2) {
            if (z) {
                int i3 = i - i2;
                if (this.isCyclic && (iMin = (itemsCount + Math.min(i, i2)) - Math.max(i, this.currentItem)) < Math.abs(i3)) {
                    i3 = i3 < 0 ? iMin : -iMin;
                }
                scroll(i3, 0);
                return;
            }
            this.scrollingOffset = 0;
            this.currentItem = i;
            ItemsRange itemsRange = this.enableRange;
            if (itemsRange == null || i >= itemsRange.getFirst() || this.currentItem <= this.enableRange.getLast()) {
                notifyChangingListeners(i2, this.currentItem);
            }
            invalidate();
        }
    }

    public void setCyclic(boolean z) {
        this.isCyclic = z;
        invalidateWheel(false);
    }

    public void setDrawShadows(boolean z) {
        this.drawShadows = z;
    }

    public void setEnableRange(@Nullable ItemsRange itemsRange) {
        this.enableRange = itemsRange;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.scroller.setInterpolator(interpolator);
    }

    public void setShadowColor(int i, int i2, int i3) {
        this.SHADOWS_COLORS = new int[]{i, i2, i3};
    }

    public void setViewAdapter(WheelViewAdapter wheelViewAdapter) {
        WheelViewAdapter wheelViewAdapter2 = this.viewAdapter;
        if (wheelViewAdapter2 != null) {
            wheelViewAdapter2.unregisterDataSetObserver(this.dataObserver);
        }
        this.viewAdapter = wheelViewAdapter;
        if (wheelViewAdapter != null) {
            wheelViewAdapter.registerDataSetObserver(this.dataObserver);
        }
        invalidateWheel(true);
    }

    public void setVisibleItems(int i) {
        this.visibleItems = i;
    }

    public void setWheelBackground(int i) {
        this.wheelBackground = i;
        setBackgroundResource(i);
        invalidate();
    }

    public void setWheelForeground(int i) {
        this.wheelForeground = i;
        this.centerDrawable = getContext().getResources().getDrawable(this.wheelForeground);
        invalidate();
    }

    public void stopScrolling() {
        this.scroller.stopScrolling();
    }

    public boolean drawShadows() {
        return this.drawShadows;
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.SHADOWS_COLORS = new int[]{-1, 16777215, 16777215};
        this.currentItem = 0;
        this.visibleItems = 5;
        this.itemHeight = 0;
        this.wheelBackground = C0797R.drawable.wheel_bg;
        this.wheelForeground = C0797R.drawable.wheel_val;
        this.drawShadows = true;
        this.isCyclic = false;
        this.recycle = new WheelRecycle(this);
        this.changingListeners = new LinkedList();
        this.scrollingListeners = new LinkedList();
        this.clickingListeners = new LinkedList();
        this.scrollingListener = new WheelScroller.ScrollingListener() { // from class: cn.qqtheme.framework.wheelview.WheelView.1
            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onFinished() {
                if (WheelView.this.isScrollingPerformed) {
                    WheelView.this.notifyScrollingListenersAboutEnd();
                    WheelView.this.isScrollingPerformed = false;
                }
                WheelView.this.scrollingOffset = 0;
                WheelView.this.invalidate();
            }

            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onJustify() {
                if (Math.abs(WheelView.this.scrollingOffset) > 1) {
                    if (WheelView.this.enableRange != null) {
                        int i2 = WheelView.this.currentItem;
                        int i3 = WheelView.this.currentItem;
                        int first = WheelView.this.enableRange.getFirst();
                        WheelView wheelView = WheelView.this;
                        if (i3 < first) {
                            wheelView.scrollingOffset -= ((WheelView.this.enableRange.getFirst() - WheelView.this.currentItem) - 1) * WheelView.this.itemHeight;
                            WheelView wheelView2 = WheelView.this;
                            wheelView2.currentItem = wheelView2.enableRange.getFirst();
                        } else if (wheelView.currentItem > WheelView.this.enableRange.getLast()) {
                            WheelView.this.scrollingOffset += (WheelView.this.currentItem - WheelView.this.enableRange.getLast()) * WheelView.this.itemHeight;
                            WheelView wheelView3 = WheelView.this;
                            wheelView3.currentItem = wheelView3.enableRange.getLast();
                        }
                        if (i2 != WheelView.this.currentItem) {
                            WheelView wheelView4 = WheelView.this;
                            wheelView4.notifyChangingListeners(i2, wheelView4.currentItem);
                        }
                    }
                    WheelView.this.scroller.scroll(WheelView.this.scrollingOffset, 0);
                }
            }

            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onScroll(int i2) {
                WheelView.this.doScroll(i2);
                int height = WheelView.this.getHeight();
                int i3 = WheelView.this.scrollingOffset;
                WheelView wheelView = WheelView.this;
                if (i3 > height) {
                    wheelView.scrollingOffset = height;
                    WheelView.this.scroller.stopScrolling();
                    return;
                }
                int i4 = -height;
                if (wheelView.scrollingOffset < i4) {
                    WheelView.this.scrollingOffset = i4;
                    WheelView.this.scroller.stopScrolling();
                }
            }

            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onStarted() {
                WheelView.this.isScrollingPerformed = true;
                WheelView.this.notifyScrollingListenersAboutStart();
            }
        };
        this.dataObserver = new DataSetObserver() { // from class: cn.qqtheme.framework.wheelview.WheelView.2
            @Override // android.database.DataSetObserver
            public void onChanged() {
                WheelView.this.invalidateWheel(false);
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                WheelView.this.invalidateWheel(true);
            }
        };
        initData(context);
    }

    public WheelView(Context context) {
        super(context);
        this.SHADOWS_COLORS = new int[]{-1, 16777215, 16777215};
        this.currentItem = 0;
        this.visibleItems = 5;
        this.itemHeight = 0;
        this.wheelBackground = C0797R.drawable.wheel_bg;
        this.wheelForeground = C0797R.drawable.wheel_val;
        this.drawShadows = true;
        this.isCyclic = false;
        this.recycle = new WheelRecycle(this);
        this.changingListeners = new LinkedList();
        this.scrollingListeners = new LinkedList();
        this.clickingListeners = new LinkedList();
        this.scrollingListener = new WheelScroller.ScrollingListener() { // from class: cn.qqtheme.framework.wheelview.WheelView.1
            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onFinished() {
                if (WheelView.this.isScrollingPerformed) {
                    WheelView.this.notifyScrollingListenersAboutEnd();
                    WheelView.this.isScrollingPerformed = false;
                }
                WheelView.this.scrollingOffset = 0;
                WheelView.this.invalidate();
            }

            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onJustify() {
                if (Math.abs(WheelView.this.scrollingOffset) > 1) {
                    if (WheelView.this.enableRange != null) {
                        int i2 = WheelView.this.currentItem;
                        int i3 = WheelView.this.currentItem;
                        int first = WheelView.this.enableRange.getFirst();
                        WheelView wheelView = WheelView.this;
                        if (i3 < first) {
                            wheelView.scrollingOffset -= ((WheelView.this.enableRange.getFirst() - WheelView.this.currentItem) - 1) * WheelView.this.itemHeight;
                            WheelView wheelView2 = WheelView.this;
                            wheelView2.currentItem = wheelView2.enableRange.getFirst();
                        } else if (wheelView.currentItem > WheelView.this.enableRange.getLast()) {
                            WheelView.this.scrollingOffset += (WheelView.this.currentItem - WheelView.this.enableRange.getLast()) * WheelView.this.itemHeight;
                            WheelView wheelView3 = WheelView.this;
                            wheelView3.currentItem = wheelView3.enableRange.getLast();
                        }
                        if (i2 != WheelView.this.currentItem) {
                            WheelView wheelView4 = WheelView.this;
                            wheelView4.notifyChangingListeners(i2, wheelView4.currentItem);
                        }
                    }
                    WheelView.this.scroller.scroll(WheelView.this.scrollingOffset, 0);
                }
            }

            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onScroll(int i2) {
                WheelView.this.doScroll(i2);
                int height = WheelView.this.getHeight();
                int i3 = WheelView.this.scrollingOffset;
                WheelView wheelView = WheelView.this;
                if (i3 > height) {
                    wheelView.scrollingOffset = height;
                    WheelView.this.scroller.stopScrolling();
                    return;
                }
                int i4 = -height;
                if (wheelView.scrollingOffset < i4) {
                    WheelView.this.scrollingOffset = i4;
                    WheelView.this.scroller.stopScrolling();
                }
            }

            @Override // cn.qqtheme.framework.wheelview.WheelScroller.ScrollingListener
            public void onStarted() {
                WheelView.this.isScrollingPerformed = true;
                WheelView.this.notifyScrollingListenersAboutStart();
            }
        };
        this.dataObserver = new DataSetObserver() { // from class: cn.qqtheme.framework.wheelview.WheelView.2
            @Override // android.database.DataSetObserver
            public void onChanged() {
                WheelView.this.invalidateWheel(false);
            }

            @Override // android.database.DataSetObserver
            public void onInvalidated() {
                WheelView.this.invalidateWheel(true);
            }
        };
        initData(context);
    }

    public void setCurrentItem(int i) {
        setCurrentItem(i, false);
    }
}
