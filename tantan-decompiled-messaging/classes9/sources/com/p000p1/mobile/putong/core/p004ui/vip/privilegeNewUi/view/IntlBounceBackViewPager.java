package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.animation.TranslateAnimation;
import androidx.viewpager.widget.ViewPager;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l.w660;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0001$B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001b¨\u0006%"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilegeNewUi/view/IntlBounceBackViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "b0", "()V", "c0", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "", "M0", "I", "currentPosition", "Landroid/graphics/Rect;", "N0", "Landroid/graphics/Rect;", "mRect", "O0", "Z", "handleDefault", "", "P0", "F", "preX", "Q0", "inTouch", "Companion", "a", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class IntlBounceBackViewPager extends ViewPager {

    /* JADX INFO: renamed from: R0 */
    public static final float f7734R0 = 0.0f;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    public int currentPosition;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    @NotNull
    public final Rect mRect;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public boolean handleDefault;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    public float preX;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    public boolean inTouch;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntlBounceBackViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.mRect = new Rect();
        this.handleDefault = true;
    }

    /* JADX INFO: renamed from: b0 */
    private final void m11166b0() {
        if (this.mRect.isEmpty()) {
            return;
        }
        m11167c0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    private final void m11167c0() {
        TranslateAnimation translateAnimation = new TranslateAnimation(getLeft(), this.mRect.left, 0.0f, 0.0f);
        translateAnimation.setDuration(300L);
        startAnimation(translateAnimation);
        Rect rect = this.mRect;
        layout(rect.left, rect.top, rect.right, rect.bottom);
        this.mRect.setEmpty();
        this.handleDefault = true;
    }

    public boolean onInterceptTouchEvent(@NotNull MotionEvent ev) {
        ev.getClass();
        if (ev.getAction() == 0) {
            this.preX = ev.getX();
            this.currentPosition = getCurrentItem();
        }
        return super.onInterceptTouchEvent(ev);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00ec  */
    /* JADX WARN: Multi-variable type inference failed */
    public boolean onTouchEvent(@NotNull MotionEvent ev) {
        ev.getClass();
        w660 adapter = getAdapter();
        if (adapter == null) {
            return super.onTouchEvent(ev);
        }
        int action = ev.getAction();
        if (action == 0) {
            this.inTouch = false;
        } else if (action == 1) {
            m11166b0();
        } else if (action == 2) {
            if (adapter.getCount() == 1) {
                float x = ev.getX();
                float f = x - this.preX;
                this.preX = x;
                float f2 = f7734R0;
                if (f <= f2 && f >= (-f2) && !this.handleDefault) {
                    int i = (int) (f * 0.0f);
                    if (getLeft() + i != this.mRect.left) {
                        layout(getLeft() + i, getTop(), getRight() + i, getBottom());
                    }
                }
            } else {
                int i2 = this.currentPosition;
                if (i2 == 0 || i2 == adapter.getCount() - 1) {
                    float x2 = ev.getX();
                    float f3 = x2 - this.preX;
                    this.preX = x2;
                    int i3 = this.currentPosition;
                    boolean z = this.inTouch;
                    if (i3 == 0) {
                        if (z || f3 <= f7734R0) {
                            if (this.handleDefault) {
                                this.inTouch = true;
                            } else {
                                int i4 = (int) (f3 * 0.0f);
                                if (getLeft() + i4 >= this.mRect.left) {
                                    layout(getLeft() + i4, getTop(), getRight() + i4, getBottom());
                                }
                            }
                        }
                    } else if (z || f3 >= (-f7734R0)) {
                        if (this.handleDefault) {
                            this.inTouch = true;
                        } else {
                            int i5 = (int) (f3 * 0.0f);
                            if (getRight() + i5 <= this.mRect.right) {
                                layout(getLeft() + i5, getTop(), getRight() + i5, getBottom());
                            }
                        }
                    }
                } else {
                    this.handleDefault = true;
                }
            }
            if (!this.handleDefault) {
                return true;
            }
        } else if (action == 3) {
            m11166b0();
        }
        return super.onTouchEvent(ev);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @JvmOverloads
    public IntlBounceBackViewPager(@NotNull Context context) {
        context.getClass();
        AttributeSet attributeSet = null;
        this(context, attributeSet, 2, attributeSet);
    }

    public /* synthetic */ IntlBounceBackViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
