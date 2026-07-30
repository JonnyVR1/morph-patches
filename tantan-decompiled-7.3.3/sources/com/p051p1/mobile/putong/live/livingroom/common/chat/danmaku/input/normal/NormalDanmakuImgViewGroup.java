package com.p051p1.mobile.putong.live.livingroom.common.chat.danmaku.input.normal;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.ResourceDirection;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.view.RectangleLayout;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.bnl0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0014¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001c\u0010\u001aR*\u0010%\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R*\u0010)\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u00100\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R*\u00104\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010+\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/R*\u00108\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010 \u001a\u0004\b6\u0010\"\"\u0004\b7\u0010$R\"\u0010<\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010+\u001a\u0004\b:\u0010-\"\u0004\b;\u0010/R\"\u0010?\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010F\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010 \u001a\u0004\bD\u0010\"\"\u0004\bE\u0010$R\"\u0010J\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010 \u001a\u0004\bH\u0010\"\"\u0004\bI\u0010$R\"\u0010N\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010+\u001a\u0004\bL\u0010-\"\u0004\bM\u0010/R\"\u0010R\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010+\u001a\u0004\bP\u0010-\"\u0004\bQ\u0010/R\u0017\u0010X\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR\"\u0010\\\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010+\u001a\u0004\bZ\u0010-\"\u0004\b[\u0010/R\u0016\u0010^\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010+R\u0016\u0010`\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010+R\u0016\u0010b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010+R\u0016\u0010d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010+¨\u0006e"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/common/chat/danmaku/input/normal/NormalDanmakuImgViewGroup;", "Lcom/p1/mobile/putong/live/base/view/RectangleLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "", "changed", "left1", "top1", "right1", "bottom1", "onLayout", "(ZIIII)V", "Landroid/view/MotionEvent;", NotificationCompat.CATEGORY_EVENT, "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "ev", "onInterceptTouchEvent", "", "value", "g", "F", "getHeightProgress", "()F", "setHeightProgress", "(F)V", "heightProgress", "h", "getEditHeight", "setEditHeight", "editHeight", RXScreenCaptureService.KEY_INDEX, "I", "getSelfHeight", "()I", "setSelfHeight", "(I)V", "selfHeight", "j", "getJumpAnimProgressIndex", "setJumpAnimProgressIndex", "jumpAnimProgressIndex", "k", "getAlpProgress", "setAlpProgress", "alpProgress", BLiveStormDanmakuGiftResourceType.f45292l, "getFixRight", "setFixRight", "fixRight", "m", "Z", "isAnimMode", "()Z", "setAnimMode", "(Z)V", "n", "getDownX", "setDownX", "downX", "o", "getIntDownX", "setIntDownX", "intDownX", "p", "getRemainWidth", "setRemainWidth", "remainWidth", "q", "getTranX", "setTranX", "tranX", "Landroid/graphics/Rect;", "r", "Landroid/graphics/Rect;", "getClipRect", "()Landroid/graphics/Rect;", "clipRect", BLiveStormDanmakuGiftResourceType.f45294s, "getDivideLeft", "setDivideLeft", "divideLeft", Constants.KEY_T, "mLastX", "u", "mLastY", ResourceDirection.f39656v, "mLastXIntercept", "w", "mLastYIntercept", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class NormalDanmakuImgViewGroup extends RectangleLayout {

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public float heightProgress;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public float editHeight;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int selfHeight;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int jumpAnimProgressIndex;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public float alpProgress;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int fixRight;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean isAnimMode;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public float downX;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public float intDownX;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int remainWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int tranX;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public final Rect clipRect;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    public int divideLeft;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int mLastX;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int mLastY;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public int mLastXIntercept;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    public int mLastYIntercept;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NormalDanmakuImgViewGroup(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.selfHeight = bnl0.m105587w(44.0f);
        this.clipRect = new Rect();
    }

    public final float getAlpProgress() {
        return this.alpProgress;
    }

    @NotNull
    public final Rect getClipRect() {
        return this.clipRect;
    }

    public final int getDivideLeft() {
        return this.divideLeft;
    }

    public final float getDownX() {
        return this.downX;
    }

    public final float getEditHeight() {
        return this.editHeight;
    }

    public final int getFixRight() {
        return this.fixRight;
    }

    public final float getHeightProgress() {
        return this.heightProgress;
    }

    public final float getIntDownX() {
        return this.intDownX;
    }

    public final int getJumpAnimProgressIndex() {
        return this.jumpAnimProgressIndex;
    }

    public final int getRemainWidth() {
        return this.remainWidth;
    }

    public final int getSelfHeight() {
        return this.selfHeight;
    }

    public final int getTranX() {
        return this.tranX;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ev.getClass();
        if (this.isAnimMode) {
            return super.onInterceptTouchEvent(ev);
        }
        int x = (int) ev.getX();
        int y = (int) ev.getY();
        int action = ev.getAction();
        if (action == 0) {
            this.intDownX = ev.getX();
        } else if (action == 2) {
            if (this.intDownX < this.divideLeft) {
                return super.onInterceptTouchEvent(ev);
            }
            if (Math.abs(x - this.mLastXIntercept) > Math.abs(y - this.mLastYIntercept)) {
                return true;
            }
        }
        this.mLastX = x;
        this.mLastY = y;
        this.mLastXIntercept = x;
        this.mLastYIntercept = y;
        return super.onInterceptTouchEvent(ev);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0229  */
    /* JADX WARN: Code duplicated, block: B:76:0x0231  */
    /* JADX WARN: Code duplicated, block: B:79:0x023e  */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean changed, int left1, int top1, int right1, int bottom1) {
        int iM105587w;
        float f;
        float f2;
        float f3;
        int iM105587w2;
        float f4 = 12.0f;
        int iM105587w3 = bnl0.m105587w(12.0f);
        float f5 = 10.0f;
        int iM105587w4 = bnl0.m105587w(10.0f);
        Rect rect = null;
        float f6 = 17.0f;
        if (!this.isAnimMode) {
            int childCount = getChildCount();
            int i = 0;
            while (i < childCount) {
                View childAt = getChildAt(i);
                childAt.setAlpha(1.0f);
                if (childAt instanceof NormalDanmakuListShadowItem) {
                    NormalDanmakuListShadowItem normalDanmakuListShadowItem = (NormalDanmakuListShadowItem) childAt;
                    normalDanmakuListShadowItem.layout(getMeasuredWidth() - normalDanmakuListShadowItem.getMeasuredWidth(), 0, getMeasuredWidth(), getMeasuredHeight());
                } else {
                    boolean z = childAt instanceof NormalDanmakuListDivideItem;
                    if (z) {
                        NormalDanmakuListDivideItem normalDanmakuListDivideItem = (NormalDanmakuListDivideItem) childAt;
                        normalDanmakuListDivideItem.layout(iM105587w3, bnl0.m105587w(17.0f), normalDanmakuListDivideItem.getMeasuredWidth() + iM105587w3, bnl0.m105587w(17.0f) + normalDanmakuListDivideItem.getMeasuredHeight());
                    } else if (childAt instanceof NormalDanmakuListFixItem) {
                        NormalDanmakuListFixItem normalDanmakuListFixItem = (NormalDanmakuListFixItem) childAt;
                        normalDanmakuListFixItem.layout(iM105587w3, iM105587w4, normalDanmakuListFixItem.getMeasuredWidth() + iM105587w3, normalDanmakuListFixItem.getMeasuredHeight() + iM105587w4);
                    } else {
                        if (this.remainWidth > 0) {
                            int measuredWidth = childAt.getMeasuredWidth() + iM105587w3;
                            int i2 = this.tranX;
                            if (measuredWidth - i2 > this.divideLeft) {
                                childAt.layout(iM105587w3 - i2, iM105587w4, (iM105587w3 - i2) + childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + iM105587w4);
                                if (((childAt.getMeasuredWidth() + iM105587w3) - this.tranX) - this.divideLeft < childAt.getMeasuredWidth()) {
                                    this.clipRect.set(childAt.getMeasuredWidth() - (childAt.getMeasuredWidth() + ((iM105587w3 - this.tranX) - this.divideLeft)), 0, childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
                                    childAt.setClipBounds(this.clipRect);
                                } else {
                                    childAt.setClipBounds(null);
                                }
                            } else {
                                childAt.layout(-bnl0.m105587w(500.0f), iM105587w4, (-bnl0.m105587w(500.0f)) + childAt.getMeasuredWidth(), childAt.getMeasuredHeight() + iM105587w4);
                            }
                        } else {
                            childAt.layout(iM105587w3, iM105587w4, childAt.getMeasuredWidth() + iM105587w3, childAt.getMeasuredHeight() + iM105587w4);
                        }
                        iM105587w3 += childAt.getMeasuredWidth();
                        if (!(childAt instanceof NormalDanmakuListFixItem) || (childAt instanceof NormalDanmakuListItem)) {
                            int i3 = i + 1;
                            iM105587w = ((i3 < getChildCount() || !(getChildAt(i3) instanceof NormalDanmakuListDivideItem)) && i != getChildCount() + (-1)) ? bnl0.m105587w(10.0f) : bnl0.m105587w(12.0f);
                        } else if (z) {
                            iM105587w = bnl0.m105587w(12.0f);
                        }
                        iM105587w3 += iM105587w;
                    }
                    iM105587w3 += childAt.getMeasuredWidth();
                    if (childAt instanceof NormalDanmakuListFixItem) {
                        int i4 = i + 1;
                        if (i4 < getChildCount()) {
                        }
                        iM105587w3 += iM105587w;
                    } else {
                        int i5 = i + 1;
                        if (i5 < getChildCount()) {
                        }
                        iM105587w3 += iM105587w;
                    }
                }
                i++;
            }
            return;
        }
        this.tranX = 0;
        int childCount2 = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (i6 < childCount2) {
            View childAt2 = getChildAt(i6);
            childAt2.setClipBounds(rect);
            if (childAt2 instanceof NormalDanmakuListShadowItem) {
                NormalDanmakuListShadowItem normalDanmakuListShadowItem2 = (NormalDanmakuListShadowItem) childAt2;
                normalDanmakuListShadowItem2.setAlpha(1.0f);
                normalDanmakuListShadowItem2.layout(getMeasuredWidth() - normalDanmakuListShadowItem2.getMeasuredWidth(), 0, getMeasuredWidth(), getMeasuredHeight());
                f = f4;
                f2 = f5;
                f3 = f6;
            } else {
                boolean z2 = childAt2 instanceof NormalDanmakuListDivideItem;
                if (z2) {
                    NormalDanmakuListDivideItem normalDanmakuListDivideItem2 = (NormalDanmakuListDivideItem) childAt2;
                    f = f4;
                    normalDanmakuListDivideItem2.layout(iM105587w3, bnl0.m105587w(f6), normalDanmakuListDivideItem2.getMeasuredWidth() + iM105587w3, bnl0.m105587w(f6) + normalDanmakuListDivideItem2.getMeasuredHeight());
                    normalDanmakuListDivideItem2.setAlpha(1.0f);
                    f2 = f5;
                    f3 = f6;
                    i7 = i6;
                } else {
                    f = f4;
                    int i8 = i6 > i7 ? i6 - 1 : i6;
                    int i9 = this.jumpAnimProgressIndex;
                    float f7 = i8 * 20.0f;
                    f2 = f5;
                    if (i9 - f7 >= 0.0f) {
                        float f8 = (i9 - f7) / 240.0f;
                        if (f8 > 1.0f) {
                            f8 = 1.0f;
                        } else if (f8 < 0.0f) {
                            f8 = 0.0f;
                        }
                        float f9 = 1.0f - f8;
                        f3 = f6;
                        childAt2.layout(iM105587w3, (int) (iM105587w4 + (this.editHeight * f9)), childAt2.getMeasuredWidth() + iM105587w3, (int) (iM105587w4 + childAt2.getMeasuredHeight() + (this.editHeight * f9)));
                        if (f8 >= 0.5d) {
                            childAt2.setAlpha((f8 - 0.5f) * 2.0f);
                        } else {
                            childAt2.setAlpha(0.0f);
                        }
                    } else {
                        f3 = f6;
                        childAt2.layout(iM105587w3, (int) (iM105587w4 + this.editHeight), childAt2.getMeasuredWidth() + iM105587w3, (int) (childAt2.getMeasuredHeight() + iM105587w4 + this.editHeight));
                    }
                }
                iM105587w3 += childAt2.getMeasuredWidth();
                if ((childAt2 instanceof NormalDanmakuListFixItem) || (childAt2 instanceof NormalDanmakuListItem)) {
                    int i10 = i6 + 1;
                    iM105587w2 = (i10 >= getChildCount() || !(getChildAt(i10) instanceof NormalDanmakuListDivideItem)) ? bnl0.m105587w(f2) : bnl0.m105587w(f);
                } else if (z2) {
                    this.fixRight = iM105587w3;
                    iM105587w2 = bnl0.m105587w(f);
                }
                iM105587w3 += iM105587w2;
            }
            i6++;
            f4 = f;
            f5 = f2;
            f6 = f3;
            rect = null;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (this.selfHeight + (this.editHeight * this.heightProgress)), 1073741824);
        int iM105587w = bnl0.m105587w(12.0f);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int childCount = getChildCount();
        int i = 0;
        while (i < childCount) {
            View childAt = this.getChildAt(i);
            NormalDanmakuImgViewGroup normalDanmakuImgViewGroup = this;
            int i2 = widthMeasureSpec;
            normalDanmakuImgViewGroup.measureChildWithMargins(childAt, i2, 0, iMakeMeasureSpec, 0);
            if (!(childAt instanceof NormalDanmakuListShadowItem)) {
                iM105587w += childAt.getMeasuredWidth();
                if ((childAt instanceof NormalDanmakuListFixItem) || (childAt instanceof NormalDanmakuListItem)) {
                    int i3 = i + 1;
                    int iM105587w2 = ((i3 >= normalDanmakuImgViewGroup.getChildCount() || !(normalDanmakuImgViewGroup.getChildAt(i3) instanceof NormalDanmakuListDivideItem)) && i != normalDanmakuImgViewGroup.getChildCount() + (-1)) ? bnl0.m105587w(10.0f) : bnl0.m105587w(12.0f);
                    iM105587w += iM105587w2;
                } else if (childAt instanceof NormalDanmakuListDivideItem) {
                    iM105587w += bnl0.m105587w(12.0f);
                    normalDanmakuImgViewGroup.divideLeft = iM105587w;
                }
            }
            i++;
            this = normalDanmakuImgViewGroup;
            widthMeasureSpec = i2;
        }
        NormalDanmakuImgViewGroup normalDanmakuImgViewGroup2 = this;
        normalDanmakuImgViewGroup2.remainWidth = iM105587w - size;
        normalDanmakuImgViewGroup2.setMeasuredDimension(widthMeasureSpec, iMakeMeasureSpec);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NotNull MotionEvent event) {
        event.getClass();
        if (this.isAnimMode) {
            return super.onTouchEvent(event);
        }
        int x = (int) event.getX();
        int action = event.getAction();
        if (action == 0) {
            float x2 = event.getX();
            this.downX = x2;
            if (x2 < this.divideLeft) {
                return super.onTouchEvent(event);
            }
        } else if (action == 2) {
            int i = this.tranX - (x - this.mLastX);
            this.tranX = i;
            int i2 = this.remainWidth;
            if (i > i2) {
                this.tranX = i2;
            } else if (i < 0) {
                this.tranX = 0;
            }
            requestLayout();
        }
        this.mLastX = x;
        return true;
    }

    public final void setAlpProgress(float f) {
        this.alpProgress = f;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setAlpha(f);
        }
    }

    public final void setAnimMode(boolean z) {
        this.isAnimMode = z;
    }

    public final void setDivideLeft(int i) {
        this.divideLeft = i;
    }

    public final void setDownX(float f) {
        this.downX = f;
    }

    public final void setEditHeight(float f) {
        this.editHeight = f;
        requestLayout();
    }

    public final void setFixRight(int i) {
        this.fixRight = i;
    }

    public final void setHeightProgress(float f) {
        this.heightProgress = f;
        requestLayout();
    }

    public final void setIntDownX(float f) {
        this.intDownX = f;
    }

    public final void setJumpAnimProgressIndex(int i) {
        this.jumpAnimProgressIndex = i;
        requestLayout();
    }

    public final void setRemainWidth(int i) {
        this.remainWidth = i;
    }

    public final void setSelfHeight(int i) {
        this.selfHeight = i;
    }

    public final void setTranX(int i) {
        this.tranX = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NormalDanmakuImgViewGroup(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
