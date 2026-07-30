package com.p000p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import l.f6c0;
import l.t100;
import l.u4c0;
import l.xdl0;
import p009l.osl;
import p009l.vlf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeCardExpandedOperationButton extends BaseHomeCardExpandedButton implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f1586c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f1587d;

    /* JADX INFO: renamed from: e */
    public View f1588e;

    /* JADX INFO: renamed from: f */
    public ImageView f1589f;

    /* JADX INFO: renamed from: g */
    public boolean f1590g;

    /* JADX INFO: renamed from: h */
    public boolean f1591h;

    /* JADX INFO: renamed from: i */
    public C0151c f1592i;

    /* JADX INFO: renamed from: j */
    public C0151c f1593j;

    /* JADX INFO: renamed from: k */
    public String f1594k;

    /* JADX INFO: renamed from: l */
    public boolean f1595l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton$a */
    public class C0149a implements RequestCallback {
        public C0149a() {
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            HomeCardExpandedOperationButton.this.f1586c.stepToFrame(0.0f, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton$b */
    public class C0150b implements RequestCallback {
        public C0150b() {
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            xdl0.M(HomeCardExpandedOperationButton.this.f1589f, true);
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            HomeCardExpandedOperationButton.this.f1587d.stepToFrame(0.0f, false);
            xdl0.M(HomeCardExpandedOperationButton.this.f1589f, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton$c */
    public static class C0151c {

        /* JADX INFO: renamed from: a */
        public float f1598a;

        /* JADX INFO: renamed from: b */
        public float f1599b;

        /* JADX INFO: renamed from: c */
        public boolean f1600c;

        /* JADX INFO: renamed from: d */
        public float f1601d;

        /* JADX INFO: renamed from: e */
        public float f1602e;

        public C0151c() {
            this.f1598a = 1.0f;
            this.f1600c = false;
            this.f1601d = 0.0f;
            this.f1602e = 0.005319149f;
        }
    }

    public HomeCardExpandedOperationButton(Context context) {
        super(context);
        this.f1590g = false;
        this.f1591h = false;
        this.f1592i = new C0151c();
        this.f1593j = new C0151c();
        this.f1594k = null;
        this.f1595l = false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2395e(View view) {
    }

    private float getRefreshRate() {
        if (Build.VERSION.SDK_INT <= 26) {
            return 60.0f;
        }
        return getContext().getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: a */
    public void mo2399a(float f, CardProgressAction cardProgressAction) {
        if (this.f1590g) {
            if (f > 0.0f) {
                if (cardProgressAction == CardProgressAction.SWIPE) {
                    m2406p();
                }
            } else if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m2405o();
            }
        }
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: c */
    public void mo2400c(CardProgressAction cardProgressAction) {
        if (this.f1590g) {
            if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m2405o();
            } else if (cardProgressAction == CardProgressAction.SWIPE_BACK_DONE) {
                m2405o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:44:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0139  */
    /* JADX WARN: Code duplicated, block: B:74:0x0163  */
    /* JADX WARN: Code duplicated, block: B:76:0x016c  */
    /* JADX WARN: Code duplicated, block: B:78:0x0172  */
    /* JADX WARN: Code duplicated, block: B:80:0x0178  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0077, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:60:0x00e9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:70:0x0139, please report this as an issue */
    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        boolean z;
        boolean z2;
        C0151c c0151c;
        float f;
        boolean z3;
        C0151c c0151c2;
        float f2;
        C0151c c0151c3;
        float f3;
        float f4;
        float f5;
        boolean z4 = true;
        if (this.f1590g && this.f1592i.f1600c) {
            this.f1586c.setAlpha(1.0f);
            this.f1587d.setAlpha(0.0f);
            C0151c c0151c4 = this.f1592i;
            float f6 = c0151c4.f1601d;
            float f7 = c0151c4.f1598a;
            float f8 = f6 + (c0151c4.f1602e * f7);
            c0151c4.f1601d = f8;
            if (f7 == 1.0f) {
                if (f8 > 1.0f) {
                    c0151c4.f1601d = 1.0f;
                    c0151c4.f1598a = 0.0f;
                    c0151c4.f1600c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else if (f7 == -1.0f) {
                if (f8 < 0.0f) {
                    c0151c4.f1601d = 0.0f;
                    c0151c4.f1598a = 0.0f;
                    c0151c4.f1600c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            c0151c = this.f1593j;
            if (c0151c.f1600c) {
                if (this.f1590g) {
                    this.f1587d.setAlpha(1.0f);
                    this.f1586c.setAlpha(0.0f);
                }
                C0151c c0151c5 = this.f1593j;
                c0151c5.f1601d += c0151c5.f1598a * c0151c5.f1602e;
                if (this.f1595l) {
                    vlf.m23436a("fakeView", "click anim begin " + this.f1593j.f1598a + " , " + this.f1593j.f1601d);
                }
                c0151c3 = this.f1593j;
                f3 = c0151c3.f1599b;
                if (f3 == 0.0f) {
                    if (c0151c3.f1601d <= 0.0f) {
                        c0151c3.f1601d = 0.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 == 0.5f) {
                    f4 = c0151c3.f1598a;
                    if (f4 <= 0.0f && c0151c3.f1601d > 0.5f) {
                        c0151c3.f1601d = 0.5f;
                    } else if (f4 < 0.0f || c0151c3.f1601d >= 0.5f) {
                        z3 = true;
                    } else {
                        c0151c3.f1601d = 0.5f;
                    }
                    z3 = false;
                } else if (f3 == 1.0f || c0151c3.f1601d <= 1.0f) {
                    z3 = true;
                } else {
                    c0151c3.f1601d = 0.0f;
                    z3 = false;
                }
                f5 = c0151c3.f1601d;
                if (f5 >= 0.0f || f5 > 1.0f) {
                    c0151c3.f1601d = 0.0f;
                    z3 = false;
                }
                if (this.f1595l) {
                    vlf.m23436a("fakeView", "click anim end " + this.f1593j.f1598a + " , " + this.f1593j.f1601d + " ， " + z3 + " , " + this.f1587d.getAlpha());
                }
            } else {
                f = c0151c.f1599b;
                if ((f != 0.0f || f == 1.0f) && this.f1590g) {
                    this.f1587d.setAlpha(0.0f);
                    this.f1586c.setAlpha(1.0f);
                }
                if (this.f1595l) {
                    vlf.m23436a("fakeView", "click anim finish " + this.f1593j.f1598a + " , " + this.f1593j.f1601d + " ， false");
                }
                z4 = false;
                z3 = false;
            }
            if (z || z3) {
                Choreographer.getInstance().postFrameCallback(this);
            }
            if (!z3) {
                c0151c2 = this.f1593j;
                if (c0151c2.f1600c) {
                    if (c0151c2.f1599b == 1.0f) {
                        c0151c2.f1599b = 0.0f;
                    }
                    c0151c2.f1600c = false;
                    f2 = c0151c2.f1599b;
                    if ((f2 != 0.0f || f2 == 1.0f) && this.f1590g) {
                        this.f1587d.setAlpha(0.0f);
                        this.f1586c.setAlpha(1.0f);
                    }
                }
            }
            if (z2 && this.f1590g) {
                this.f1586c.stepToFrame(this.f1592i.f1601d, false);
            }
            if (z4) {
                this.f1587d.stepToFrame(this.f1593j.f1601d % 1.0f, false);
            }
        }
        z = false;
        z2 = z;
        c0151c = this.f1593j;
        if (c0151c.f1600c) {
            if (this.f1590g) {
                this.f1587d.setAlpha(1.0f);
                this.f1586c.setAlpha(0.0f);
            }
            C0151c c0151c6 = this.f1593j;
            c0151c6.f1601d += c0151c6.f1598a * c0151c6.f1602e;
            if (this.f1595l) {
                vlf.m23436a("fakeView", "click anim begin " + this.f1593j.f1598a + " , " + this.f1593j.f1601d);
            }
            c0151c3 = this.f1593j;
            f3 = c0151c3.f1599b;
            if (f3 == 0.0f) {
                if (c0151c3.f1601d <= 0.0f) {
                    c0151c3.f1601d = 0.0f;
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (f3 == 0.5f) {
                f4 = c0151c3.f1598a;
                if (f4 <= 0.0f) {
                    if (f4 < 0.0f) {
                    }
                    z3 = true;
                } else {
                    if (f4 < 0.0f) {
                    }
                    z3 = true;
                }
            } else {
                if (f3 == 1.0f) {
                }
                z3 = true;
            }
            f5 = c0151c3.f1601d;
            if (f5 >= 0.0f) {
                c0151c3.f1601d = 0.0f;
                z3 = false;
            } else {
                c0151c3.f1601d = 0.0f;
                z3 = false;
            }
            if (this.f1595l) {
                vlf.m23436a("fakeView", "click anim end " + this.f1593j.f1598a + " , " + this.f1593j.f1601d + " ， " + z3 + " , " + this.f1587d.getAlpha());
            }
        } else {
            f = c0151c.f1599b;
            if (f != 0.0f) {
                this.f1587d.setAlpha(0.0f);
                this.f1586c.setAlpha(1.0f);
            } else {
                this.f1587d.setAlpha(0.0f);
                this.f1586c.setAlpha(1.0f);
            }
            if (this.f1595l) {
                vlf.m23436a("fakeView", "click anim finish " + this.f1593j.f1598a + " , " + this.f1593j.f1601d + " ， false");
            }
            z4 = false;
            z3 = false;
        }
        if (z) {
            Choreographer.getInstance().postFrameCallback(this);
        } else {
            Choreographer.getInstance().postFrameCallback(this);
        }
        if (!z3) {
            c0151c2 = this.f1593j;
            if (c0151c2.f1600c) {
                if (c0151c2.f1599b == 1.0f) {
                    c0151c2.f1599b = 0.0f;
                }
                c0151c2.f1600c = false;
                f2 = c0151c2.f1599b;
                if (f2 != 0.0f) {
                    this.f1587d.setAlpha(0.0f);
                    this.f1586c.setAlpha(1.0f);
                } else {
                    this.f1587d.setAlpha(0.0f);
                    this.f1586c.setAlpha(1.0f);
                }
            }
        }
        if (z2) {
            this.f1586c.stepToFrame(this.f1592i.f1601d, false);
        }
        if (z4) {
            this.f1587d.stepToFrame(this.f1593j.f1601d % 1.0f, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m2401k() {
        ViewParent parent = getParent();
        while (parent != null) {
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (viewGroup.getVisibility() == 8) {
                    return false;
                }
                if (parent instanceof osl) {
                    return true;
                }
                parent = viewGroup.getParent();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: l */
    public void m2402l(String str, String str2) {
        boolean zEquals = TextUtils.equals(str, this.f1594k);
        this.f1594k = str;
        if (this.f1590g) {
            SVGALoader.with(getContext()).from(str).isCacheable(zEquals).loadCallback(new C0149a()).autoPlay(false).into(this.f1586c);
        }
        SVGALoader.with(getContext()).from(str2).loadCallback(new C0150b()).autoPlay(false).into(this.f1587d);
    }

    /* JADX INFO: renamed from: m */
    public final void m2403m() {
        this.f1592i.f1600c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m2404n() {
        this.f1593j.f1600c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m2405o() {
        if (!this.f1591h && m2401k()) {
            C0151c c0151c = this.f1592i;
            if (c0151c.f1598a == -1.0f || c0151c.f1601d == 0.0f) {
                return;
            }
            c0151c.f1602e = 1.0f / (getRefreshRate() * 0.188f);
            C0151c c0151c2 = this.f1592i;
            c0151c2.f1599b = 0.0f;
            c0151c2.f1598a = -1.0f;
            if (this.f1595l) {
                vlf.m23436a("fakeView", "reset 每次动画diff: " + this.f1592i.f1602e + " , " + this.f1592i.f1601d + " , " + this.f1592i.f1599b);
            }
            m2403m();
            if (this.f1595l) {
                vlf.m23436a("fakeView", "reset 每次动画diff done: " + this.f1592i.f1602e + " , " + this.f1592i.f1599b);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.Z3, (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(54.0f), t100.d(54.0f));
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        this.f1586c = viewInflate.findViewById(u4c0.e);
        this.f1587d = viewInflate.findViewById(u4c0.z1);
        this.f1588e = viewInflate.findViewById(u4c0.f2);
        this.f1589f = (ImageView) viewInflate.findViewById(u4c0.q0);
        xdl0.E0(this.f1588e, new View.OnClickListener() { // from class: l.t3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCardExpandedOperationButton.m2395e(view);
            }
        });
        setClipChildren(false);
        if (this.f1590g) {
            return;
        }
        this.f1586c.setVisibility(8);
        this.f1587d.setAlpha(1.0f);
        this.f1586c.setVisibility(0);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: p */
    public final void m2406p() {
        if (!this.f1591h && m2401k()) {
            C0151c c0151c = this.f1592i;
            if (c0151c.f1598a == 1.0f || c0151c.f1601d == 1.0f) {
                return;
            }
            c0151c.f1602e = 1.0f / (getRefreshRate() * 0.188f);
            if (this.f1595l) {
                vlf.m23436a("fakeView", "start # 每次动画diff: " + this.f1592i.f1602e + " , " + this.f1592i.f1601d + " , " + this.f1592i.f1599b);
            }
            C0151c c0151c2 = this.f1592i;
            c0151c2.f1599b = 1.0f;
            c0151c2.f1598a = 1.0f;
            m2403m();
            if (this.f1595l) {
                vlf.m23436a("fakeView", "start # 每次动画diff: done: " + this.f1592i.f1602e + " , " + this.f1592i.f1601d + " , " + this.f1592i.f1599b);
            }
        }
    }

    public void setCoverDrawable(int i) {
        SVGAnimationView sVGAnimationView = this.f1587d;
        if (i == 0) {
            sVGAnimationView.setVisibility(0);
        } else {
            sVGAnimationView.setVisibility(4);
        }
        this.f1588e.setBackgroundResource(i);
        xdl0.M(this.f1588e, i != 0);
    }

    public void setPlaceHolderPic(@DrawableRes int i) {
        this.f1589f.setImageResource(i);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.operation.BaseHomeCardExpandedButton, android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.f1593j.f1602e = 0.5f / (getRefreshRate() * 0.165f);
        C0151c c0151c = this.f1593j;
        if (z) {
            float f = c0151c.f1601d;
            if (f >= 0.5f) {
                c0151c.f1599b = 0.5f;
                c0151c.f1598a = -1.0f;
                c0151c.f1600c = true;
                m2404n();
                return;
            }
            c0151c.f1599b = 0.5f;
            c0151c.f1601d = f + 1.0E-5f;
            c0151c.f1598a = 1.0f;
            c0151c.f1600c = true;
            m2404n();
            return;
        }
        float f2 = c0151c.f1601d;
        if (f2 == 0.0f) {
            return;
        }
        if (f2 >= 0.5f) {
            c0151c.f1599b = 1.0f;
            c0151c.f1598a = 1.0f;
            c0151c.f1600c = true;
            m2404n();
            return;
        }
        c0151c.f1599b = 1.0f;
        c0151c.f1598a = 1.0f;
        c0151c.f1600c = true;
        m2404n();
    }

    public void setShowLog(boolean z) {
        this.f1595l = z;
    }

    public void setSwipeEnable(boolean z) {
        this.f1590g = z;
        if (z) {
            this.f1587d.setAlpha(0.0f);
            this.f1586c.setVisibility(0);
            this.f1592i.f1598a = 0.0f;
        } else {
            this.f1586c.setVisibility(8);
            this.f1587d.setAlpha(1.0f);
            this.f1586c.setVisibility(0);
        }
    }

    public HomeCardExpandedOperationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1590g = false;
        this.f1591h = false;
        this.f1592i = new C0151c();
        this.f1593j = new C0151c();
        this.f1594k = null;
        this.f1595l = false;
    }

    public HomeCardExpandedOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1590g = false;
        this.f1591h = false;
        this.f1592i = new C0151c();
        this.f1593j = new C0151c();
        this.f1594k = null;
        this.f1595l = false;
    }
}
