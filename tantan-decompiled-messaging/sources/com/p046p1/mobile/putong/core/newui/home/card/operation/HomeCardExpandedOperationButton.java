package com.p046p1.mobile.putong.core.newui.home.card.operation;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p149l.f6c0;
import p149l.osl;
import p149l.t100;
import p149l.u4c0;
import p149l.vlf;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardExpandedOperationButton extends BaseHomeCardExpandedButton implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f22808c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f22809d;

    /* JADX INFO: renamed from: e */
    public View f22810e;

    /* JADX INFO: renamed from: f */
    public ImageView f22811f;

    /* JADX INFO: renamed from: g */
    public boolean f22812g;

    /* JADX INFO: renamed from: h */
    public boolean f22813h;

    /* JADX INFO: renamed from: i */
    public C7987c f22814i;

    /* JADX INFO: renamed from: j */
    public C7987c f22815j;

    /* JADX INFO: renamed from: k */
    public String f22816k;

    /* JADX INFO: renamed from: l */
    public boolean f22817l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton$a */
    public class C7985a implements RequestCallback {
        public C7985a() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            HomeCardExpandedOperationButton.this.f22808c.stepToFrame(0.0f, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton$b */
    public class C7986b implements RequestCallback {
        public C7986b() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            xdl0.m208344M(HomeCardExpandedOperationButton.this.f22811f, true);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            HomeCardExpandedOperationButton.this.f22809d.stepToFrame(0.0f, false);
            xdl0.m208344M(HomeCardExpandedOperationButton.this.f22811f, false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationButton$c */
    public static class C7987c {

        /* JADX INFO: renamed from: a */
        public float f22820a;

        /* JADX INFO: renamed from: b */
        public float f22821b;

        /* JADX INFO: renamed from: c */
        public boolean f22822c;

        /* JADX INFO: renamed from: d */
        public float f22823d;

        /* JADX INFO: renamed from: e */
        public float f22824e;

        public C7987c() {
            this.f22820a = 1.0f;
            this.f22822c = false;
            this.f22823d = 0.0f;
            this.f22824e = 0.005319149f;
        }
    }

    public HomeCardExpandedOperationButton(Context context) {
        super(context);
        this.f22812g = false;
        this.f22813h = false;
        this.f22814i = new C7987c();
        this.f22815j = new C7987c();
        this.f22816k = null;
        this.f22817l = false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m38417e(View view) {
    }

    private float getRefreshRate() {
        if (Build.VERSION.SDK_INT <= 26) {
            return 60.0f;
        }
        return ((Act) getContext()).getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: a */
    public void mo38421a(float f, CardProgressAction cardProgressAction) {
        if (this.f22812g) {
            if (f > 0.0f) {
                if (cardProgressAction == CardProgressAction.SWIPE) {
                    m38428p();
                }
            } else if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m38427o();
            }
        }
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: c */
    public void mo38422c(CardProgressAction cardProgressAction) {
        if (this.f22812g) {
            if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m38427o();
            } else if (cardProgressAction == CardProgressAction.SWIPE_BACK_DONE) {
                m38427o();
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
        C7987c c7987c;
        float f;
        boolean z3;
        C7987c c7987c2;
        float f2;
        C7987c c7987c3;
        float f3;
        float f4;
        float f5;
        boolean z4 = true;
        if (this.f22812g && this.f22814i.f22822c) {
            this.f22808c.setAlpha(1.0f);
            this.f22809d.setAlpha(0.0f);
            C7987c c7987c4 = this.f22814i;
            float f6 = c7987c4.f22823d;
            float f7 = c7987c4.f22820a;
            float f8 = f6 + (c7987c4.f22824e * f7);
            c7987c4.f22823d = f8;
            if (f7 == 1.0f) {
                if (f8 > 1.0f) {
                    c7987c4.f22823d = 1.0f;
                    c7987c4.f22820a = 0.0f;
                    c7987c4.f22822c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else if (f7 == -1.0f) {
                if (f8 < 0.0f) {
                    c7987c4.f22823d = 0.0f;
                    c7987c4.f22820a = 0.0f;
                    c7987c4.f22822c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            c7987c = this.f22815j;
            if (c7987c.f22822c) {
                if (this.f22812g) {
                    this.f22809d.setAlpha(1.0f);
                    this.f22808c.setAlpha(0.0f);
                }
                C7987c c7987c5 = this.f22815j;
                c7987c5.f22823d += c7987c5.f22820a * c7987c5.f22824e;
                if (this.f22817l) {
                    vlf.m198796a("fakeView", "click anim begin " + this.f22815j.f22820a + " , " + this.f22815j.f22823d);
                }
                c7987c3 = this.f22815j;
                f3 = c7987c3.f22821b;
                if (f3 == 0.0f) {
                    if (c7987c3.f22823d <= 0.0f) {
                        c7987c3.f22823d = 0.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 == 0.5f) {
                    f4 = c7987c3.f22820a;
                    if (f4 <= 0.0f && c7987c3.f22823d > 0.5f) {
                        c7987c3.f22823d = 0.5f;
                    } else if (f4 < 0.0f || c7987c3.f22823d >= 0.5f) {
                        z3 = true;
                    } else {
                        c7987c3.f22823d = 0.5f;
                    }
                    z3 = false;
                } else if (f3 == 1.0f || c7987c3.f22823d <= 1.0f) {
                    z3 = true;
                } else {
                    c7987c3.f22823d = 0.0f;
                    z3 = false;
                }
                f5 = c7987c3.f22823d;
                if (f5 >= 0.0f || f5 > 1.0f) {
                    c7987c3.f22823d = 0.0f;
                    z3 = false;
                }
                if (this.f22817l) {
                    vlf.m198796a("fakeView", "click anim end " + this.f22815j.f22820a + " , " + this.f22815j.f22823d + " ， " + z3 + " , " + this.f22809d.getAlpha());
                }
            } else {
                f = c7987c.f22821b;
                if ((f != 0.0f || f == 1.0f) && this.f22812g) {
                    this.f22809d.setAlpha(0.0f);
                    this.f22808c.setAlpha(1.0f);
                }
                if (this.f22817l) {
                    vlf.m198796a("fakeView", "click anim finish " + this.f22815j.f22820a + " , " + this.f22815j.f22823d + " ， false");
                }
                z4 = false;
                z3 = false;
            }
            if (z || z3) {
                Choreographer.getInstance().postFrameCallback(this);
            }
            if (!z3) {
                c7987c2 = this.f22815j;
                if (c7987c2.f22822c) {
                    if (c7987c2.f22821b == 1.0f) {
                        c7987c2.f22821b = 0.0f;
                    }
                    c7987c2.f22822c = false;
                    f2 = c7987c2.f22821b;
                    if ((f2 != 0.0f || f2 == 1.0f) && this.f22812g) {
                        this.f22809d.setAlpha(0.0f);
                        this.f22808c.setAlpha(1.0f);
                    }
                }
            }
            if (z2 && this.f22812g) {
                this.f22808c.stepToFrame(this.f22814i.f22823d, false);
            }
            if (z4) {
                this.f22809d.stepToFrame(this.f22815j.f22823d % 1.0f, false);
            }
        }
        z = false;
        z2 = z;
        c7987c = this.f22815j;
        if (c7987c.f22822c) {
            if (this.f22812g) {
                this.f22809d.setAlpha(1.0f);
                this.f22808c.setAlpha(0.0f);
            }
            C7987c c7987c6 = this.f22815j;
            c7987c6.f22823d += c7987c6.f22820a * c7987c6.f22824e;
            if (this.f22817l) {
                vlf.m198796a("fakeView", "click anim begin " + this.f22815j.f22820a + " , " + this.f22815j.f22823d);
            }
            c7987c3 = this.f22815j;
            f3 = c7987c3.f22821b;
            if (f3 == 0.0f) {
                if (c7987c3.f22823d <= 0.0f) {
                    c7987c3.f22823d = 0.0f;
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (f3 == 0.5f) {
                f4 = c7987c3.f22820a;
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
            f5 = c7987c3.f22823d;
            if (f5 >= 0.0f) {
                c7987c3.f22823d = 0.0f;
                z3 = false;
            } else {
                c7987c3.f22823d = 0.0f;
                z3 = false;
            }
            if (this.f22817l) {
                vlf.m198796a("fakeView", "click anim end " + this.f22815j.f22820a + " , " + this.f22815j.f22823d + " ， " + z3 + " , " + this.f22809d.getAlpha());
            }
        } else {
            f = c7987c.f22821b;
            if (f != 0.0f) {
                this.f22809d.setAlpha(0.0f);
                this.f22808c.setAlpha(1.0f);
            } else {
                this.f22809d.setAlpha(0.0f);
                this.f22808c.setAlpha(1.0f);
            }
            if (this.f22817l) {
                vlf.m198796a("fakeView", "click anim finish " + this.f22815j.f22820a + " , " + this.f22815j.f22823d + " ， false");
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
            c7987c2 = this.f22815j;
            if (c7987c2.f22822c) {
                if (c7987c2.f22821b == 1.0f) {
                    c7987c2.f22821b = 0.0f;
                }
                c7987c2.f22822c = false;
                f2 = c7987c2.f22821b;
                if (f2 != 0.0f) {
                    this.f22809d.setAlpha(0.0f);
                    this.f22808c.setAlpha(1.0f);
                } else {
                    this.f22809d.setAlpha(0.0f);
                    this.f22808c.setAlpha(1.0f);
                }
            }
        }
        if (z2) {
            this.f22808c.stepToFrame(this.f22814i.f22823d, false);
        }
        if (z4) {
            this.f22809d.stepToFrame(this.f22815j.f22823d % 1.0f, false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m38423k() {
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
    public void m38424l(String str, String str2) {
        boolean zEquals = TextUtils.equals(str, this.f22816k);
        this.f22816k = str;
        if (this.f22812g) {
            SVGALoader.with(getContext()).from(str).isCacheable(zEquals).loadCallback(new C7985a()).autoPlay(false).into(this.f22808c);
        }
        SVGALoader.with(getContext()).from(str2).loadCallback(new C7986b()).autoPlay(false).into(this.f22809d);
    }

    /* JADX INFO: renamed from: m */
    public final void m38425m() {
        this.f22814i.f22822c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: n */
    public final void m38426n() {
        this.f22815j.f22822c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: o */
    public final void m38427o() {
        if (!this.f22813h && m38423k()) {
            C7987c c7987c = this.f22814i;
            if (c7987c.f22820a == -1.0f || c7987c.f22823d == 0.0f) {
                return;
            }
            c7987c.f22824e = 1.0f / (getRefreshRate() * 0.188f);
            C7987c c7987c2 = this.f22814i;
            c7987c2.f22821b = 0.0f;
            c7987c2.f22820a = -1.0f;
            if (this.f22817l) {
                vlf.m198796a("fakeView", "reset 每次动画diff: " + this.f22814i.f22824e + " , " + this.f22814i.f22823d + " , " + this.f22814i.f22821b);
            }
            m38425m();
            if (this.f22817l) {
                vlf.m198796a("fakeView", "reset 每次动画diff done: " + this.f22814i.f22824e + " , " + this.f22814i.f22821b);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.f95670Z3, (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(54.0f), t100.m186890d(54.0f));
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        this.f22808c = (SVGAnimationView) viewInflate.findViewById(u4c0.f174219e);
        this.f22809d = (SVGAnimationView) viewInflate.findViewById(u4c0.f174577z1);
        this.f22810e = viewInflate.findViewById(u4c0.f174239f2);
        this.f22811f = (ImageView) viewInflate.findViewById(u4c0.f174423q0);
        xdl0.m208329E0(this.f22810e, new View.OnClickListener() { // from class: l.t3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCardExpandedOperationButton.m38417e(view);
            }
        });
        setClipChildren(false);
        if (this.f22812g) {
            return;
        }
        this.f22808c.setVisibility(8);
        this.f22809d.setAlpha(1.0f);
        this.f22808c.setVisibility(0);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    /* JADX INFO: renamed from: p */
    public final void m38428p() {
        if (!this.f22813h && m38423k()) {
            C7987c c7987c = this.f22814i;
            if (c7987c.f22820a == 1.0f || c7987c.f22823d == 1.0f) {
                return;
            }
            c7987c.f22824e = 1.0f / (getRefreshRate() * 0.188f);
            if (this.f22817l) {
                vlf.m198796a("fakeView", "start # 每次动画diff: " + this.f22814i.f22824e + " , " + this.f22814i.f22823d + " , " + this.f22814i.f22821b);
            }
            C7987c c7987c2 = this.f22814i;
            c7987c2.f22821b = 1.0f;
            c7987c2.f22820a = 1.0f;
            m38425m();
            if (this.f22817l) {
                vlf.m198796a("fakeView", "start # 每次动画diff: done: " + this.f22814i.f22824e + " , " + this.f22814i.f22823d + " , " + this.f22814i.f22821b);
            }
        }
    }

    public void setCoverDrawable(int i) {
        SVGAnimationView sVGAnimationView = this.f22809d;
        if (i == 0) {
            sVGAnimationView.setVisibility(0);
        } else {
            sVGAnimationView.setVisibility(4);
        }
        this.f22810e.setBackgroundResource(i);
        xdl0.m208344M(this.f22810e, i != 0);
    }

    public void setPlaceHolderPic(@DrawableRes int i) {
        this.f22811f.setImageResource(i);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.operation.BaseHomeCardExpandedButton, android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.f22815j.f22824e = 0.5f / (getRefreshRate() * 0.165f);
        C7987c c7987c = this.f22815j;
        if (z) {
            float f = c7987c.f22823d;
            if (f >= 0.5f) {
                c7987c.f22821b = 0.5f;
                c7987c.f22820a = -1.0f;
                c7987c.f22822c = true;
                m38426n();
                return;
            }
            c7987c.f22821b = 0.5f;
            c7987c.f22823d = f + 1.0E-5f;
            c7987c.f22820a = 1.0f;
            c7987c.f22822c = true;
            m38426n();
            return;
        }
        float f2 = c7987c.f22823d;
        if (f2 == 0.0f) {
            return;
        }
        if (f2 >= 0.5f) {
            c7987c.f22821b = 1.0f;
            c7987c.f22820a = 1.0f;
            c7987c.f22822c = true;
            m38426n();
            return;
        }
        c7987c.f22821b = 1.0f;
        c7987c.f22820a = 1.0f;
        c7987c.f22822c = true;
        m38426n();
    }

    public void setShowLog(boolean z) {
        this.f22817l = z;
    }

    public void setSwipeEnable(boolean z) {
        this.f22812g = z;
        if (z) {
            this.f22809d.setAlpha(0.0f);
            this.f22808c.setVisibility(0);
            this.f22814i.f22820a = 0.0f;
        } else {
            this.f22808c.setVisibility(8);
            this.f22809d.setAlpha(1.0f);
            this.f22808c.setVisibility(0);
        }
    }

    public HomeCardExpandedOperationButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22812g = false;
        this.f22813h = false;
        this.f22814i = new C7987c();
        this.f22815j = new C7987c();
        this.f22816k = null;
        this.f22817l = false;
    }

    public HomeCardExpandedOperationButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22812g = false;
        this.f22813h = false;
        this.f22814i = new C7987c();
        this.f22815j = new C7987c();
        this.f22816k = null;
        this.f22817l = false;
    }
}
