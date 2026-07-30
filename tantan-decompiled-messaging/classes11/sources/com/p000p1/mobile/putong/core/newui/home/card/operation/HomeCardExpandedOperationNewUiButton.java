package com.p000p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
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
import com.p000p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import l.f6c0;
import l.j760;
import l.t100;
import l.u4c0;
import l.xdl0;
import p009l.osl;
import p009l.vlf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeCardExpandedOperationNewUiButton extends BaseHomeCardExpandedButton implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f1603c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f1604d;

    /* JADX INFO: renamed from: e */
    public View f1605e;

    /* JADX INFO: renamed from: f */
    public ImageView f1606f;

    /* JADX INFO: renamed from: g */
    public boolean f1607g;

    /* JADX INFO: renamed from: h */
    public String f1608h;

    /* JADX INFO: renamed from: i */
    public boolean f1609i;

    /* JADX INFO: renamed from: j */
    public C0153b f1610j;

    /* JADX INFO: renamed from: k */
    public C0153b f1611k;

    /* JADX INFO: renamed from: l */
    public String f1612l;

    /* JADX INFO: renamed from: m */
    public boolean f1613m;

    /* JADX INFO: renamed from: n */
    public boolean f1614n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton$a */
    public class C0152a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f1615a;

        public C0152a(String str) {
            this.f1615a = str;
        }

        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            xdl0.M(HomeCardExpandedOperationNewUiButton.this.f1606f, true);
            HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = HomeCardExpandedOperationNewUiButton.this;
            if (homeCardExpandedOperationNewUiButton.f1613m) {
                String unused = homeCardExpandedOperationNewUiButton.f1608h;
            }
        }

        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            xdl0.M(HomeCardExpandedOperationNewUiButton.this.f1606f, false);
            HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = HomeCardExpandedOperationNewUiButton.this;
            if (homeCardExpandedOperationNewUiButton.f1613m) {
                boolean unused = homeCardExpandedOperationNewUiButton.f1607g;
                String unused2 = HomeCardExpandedOperationNewUiButton.this.f1608h;
                HomeCardExpandedOperationNewUiButton.this.f1604d.getAlpha();
                HomeCardExpandedOperationNewUiButton.this.f1603c.getAlpha();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton$b */
    public static class C0153b {

        /* JADX INFO: renamed from: a */
        public float f1617a;

        /* JADX INFO: renamed from: b */
        public float f1618b;

        /* JADX INFO: renamed from: c */
        public boolean f1619c;

        /* JADX INFO: renamed from: d */
        public float f1620d;

        /* JADX INFO: renamed from: e */
        public float f1621e;

        public C0153b() {
            this.f1617a = 1.0f;
            this.f1619c = false;
            this.f1620d = 0.0f;
            this.f1621e = 0.004761905f;
        }
    }

    public HomeCardExpandedOperationNewUiButton(Context context) {
        super(context);
        this.f1607g = false;
        this.f1609i = false;
        this.f1610j = new C0153b();
        this.f1611k = new C0153b();
        this.f1612l = null;
        this.f1613m = false;
        this.f1614n = false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m2407e(View view) {
    }

    private float getRefreshRate() {
        if (Build.VERSION.SDK_INT <= 26) {
            return 60.0f;
        }
        return getContext().getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    /* JADX INFO: renamed from: m */
    private boolean m2413m() {
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

    /* JADX INFO: renamed from: o */
    private void m2414o() {
        this.f1610j.f1619c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: p */
    private void m2415p() {
        this.f1611k.f1619c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: q */
    private void m2416q() {
        if (!this.f1609i && m2413m()) {
            C0153b c0153b = this.f1610j;
            if (c0153b.f1617a == -1.0f || c0153b.f1620d == 0.0f) {
                return;
            }
            c0153b.f1621e = 1.0f / (getRefreshRate() * 0.21f);
            C0153b c0153b2 = this.f1610j;
            c0153b2.f1618b = 0.0f;
            c0153b2.f1617a = -1.0f;
            if (this.f1613m) {
                vlf.m23436a("fakeView", "reset 每次动画diff: " + this.f1610j.f1621e + " , " + this.f1610j.f1620d + " , " + this.f1610j.f1618b);
            }
            m2414o();
            if (this.f1613m) {
                vlf.m23436a("fakeView", "reset 每次动画diff done: " + this.f1610j.f1621e + " , " + this.f1610j.f1618b);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m2417r() {
        if (!this.f1609i && m2413m()) {
            C0153b c0153b = this.f1610j;
            if (c0153b.f1617a == 1.0f || c0153b.f1620d == 1.0f) {
                return;
            }
            c0153b.f1621e = 1.0f / (getRefreshRate() * 0.21f);
            if (this.f1613m) {
                vlf.m23436a("fakeView", "start # 每次动画diff: " + this.f1610j.f1621e + " , " + this.f1610j.f1620d + " , " + this.f1610j.f1618b);
            }
            C0153b c0153b2 = this.f1610j;
            c0153b2.f1618b = 1.0f;
            c0153b2.f1617a = 1.0f;
            m2414o();
            if (this.f1613m) {
                vlf.m23436a("fakeView", "start # 每次动画diff: done: " + this.f1610j.f1621e + " , " + this.f1610j.f1620d + " , " + this.f1610j.f1618b);
            }
        }
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: a */
    public void mo2399a(float f, CardProgressAction cardProgressAction) {
        if (this.f1607g) {
            if (f > 0.0f) {
                if (cardProgressAction == CardProgressAction.SWIPE) {
                    m2417r();
                }
            } else if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m2416q();
            }
        }
    }

    @Override // p009l.nsl
    /* JADX INFO: renamed from: c */
    public void mo2400c(CardProgressAction cardProgressAction) {
        if (this.f1607g) {
            if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m2416q();
            } else if (cardProgressAction == CardProgressAction.SWIPE_BACK_DONE) {
                m2416q();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005b  */
    /* JADX WARN: Code duplicated, block: B:25:0x005f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:64:0x0125  */
    /* JADX WARN: Code duplicated, block: B:68:0x014f  */
    /* JADX WARN: Code duplicated, block: B:70:0x0158  */
    /* JADX WARN: Code duplicated, block: B:72:0x015e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0185  */
    /* JADX WARN: Code duplicated, block: B:85:0x0190  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x0079, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00c9, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0125, please report this as an issue */
    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        boolean z;
        boolean z2;
        C0153b c0153b;
        float f;
        boolean z3;
        float f2;
        C0153b c0153b2;
        C0153b c0153b3;
        float f3;
        boolean z4 = true;
        if (this.f1607g && this.f1610j.f1619c) {
            this.f1603c.setAlpha(1.0f);
            this.f1604d.setAlpha(0.0f);
            C0153b c0153b4 = this.f1610j;
            float f4 = c0153b4.f1620d;
            float f5 = c0153b4.f1617a;
            float f6 = f4 + (c0153b4.f1621e * f5);
            c0153b4.f1620d = f6;
            if (f5 == 1.0f) {
                if (f6 > 1.0f) {
                    c0153b4.f1620d = 1.0f;
                    c0153b4.f1617a = 0.0f;
                    c0153b4.f1619c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else if (f5 == -1.0f) {
                if (f6 < 0.0f) {
                    c0153b4.f1620d = 0.0f;
                    c0153b4.f1617a = 0.0f;
                    c0153b4.f1619c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            c0153b = this.f1611k;
            if (c0153b.f1619c) {
                if (this.f1607g) {
                    this.f1604d.setAlpha(1.0f);
                    this.f1603c.setAlpha(0.0f);
                }
                C0153b c0153b5 = this.f1611k;
                c0153b5.f1620d += c0153b5.f1617a * c0153b5.f1621e;
                if (this.f1613m) {
                    vlf.m23436a("fakeView", "click anim begin " + this.f1611k.f1617a + " , " + this.f1611k.f1620d);
                }
                c0153b3 = this.f1611k;
                f3 = c0153b3.f1618b;
                if (f3 == 0.0f) {
                    if (c0153b3.f1620d <= 0.0f) {
                        c0153b3.f1620d = 0.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 != 1.0f) {
                    if (c0153b3.f1620d > 1.0f) {
                        c0153b3.f1620d = 1.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 == 2.0f || c0153b3.f1620d <= 2.0f) {
                    z3 = true;
                } else {
                    c0153b3.f1620d = 0.0f;
                    z3 = false;
                }
                if (this.f1613m) {
                    vlf.m23436a("fakeView", "click anim end " + this.f1611k.f1617a + " , " + this.f1611k.f1620d + " ， " + z3 + " , " + this.f1604d.getAlpha());
                }
            } else {
                f = c0153b.f1618b;
                if ((f != 0.0f || f == 1.0f || f == 2.0f) && this.f1607g && (f == 0.0f || f == 2.0f)) {
                    this.f1604d.setAlpha(0.0f);
                    this.f1603c.setAlpha(1.0f);
                }
                if (this.f1613m) {
                    vlf.m23436a("fakeView", "click anim finish " + this.f1611k.f1617a + " , " + this.f1611k.f1620d + " ， false");
                }
                z4 = false;
                z3 = false;
            }
            if (z || z3) {
                Choreographer.getInstance().postFrameCallback(this);
            }
            if (!z3) {
                c0153b2 = this.f1611k;
                if (c0153b2.f1619c) {
                    c0153b2.f1619c = false;
                    if (c0153b2.f1618b == 2.0f && this.f1607g) {
                        this.f1604d.setAlpha(0.0f);
                        this.f1603c.setAlpha(1.0f);
                    }
                }
            }
            if (z2 && this.f1607g) {
                this.f1603c.stepToFrame(this.f1610j.f1620d, false);
            }
            if (z4) {
                SVGAnimationView sVGAnimationView = this.f1604d;
                f2 = this.f1611k.f1620d;
                if (f2 > 1.0f) {
                    f2 = 2.0f - f2;
                }
                sVGAnimationView.stepToFrame(f2, false);
            }
        }
        z = false;
        z2 = z;
        c0153b = this.f1611k;
        if (c0153b.f1619c) {
            if (this.f1607g) {
                this.f1604d.setAlpha(1.0f);
                this.f1603c.setAlpha(0.0f);
            }
            C0153b c0153b6 = this.f1611k;
            c0153b6.f1620d += c0153b6.f1617a * c0153b6.f1621e;
            if (this.f1613m) {
                vlf.m23436a("fakeView", "click anim begin " + this.f1611k.f1617a + " , " + this.f1611k.f1620d);
            }
            c0153b3 = this.f1611k;
            f3 = c0153b3.f1618b;
            if (f3 == 0.0f) {
                if (c0153b3.f1620d <= 0.0f) {
                    c0153b3.f1620d = 0.0f;
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (f3 != 1.0f) {
                if (f3 == 2.0f) {
                }
                z3 = true;
            } else if (c0153b3.f1620d > 1.0f) {
                c0153b3.f1620d = 1.0f;
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f1613m) {
                vlf.m23436a("fakeView", "click anim end " + this.f1611k.f1617a + " , " + this.f1611k.f1620d + " ， " + z3 + " , " + this.f1604d.getAlpha());
            }
        } else {
            f = c0153b.f1618b;
            if (f != 0.0f) {
                this.f1604d.setAlpha(0.0f);
                this.f1603c.setAlpha(1.0f);
            } else {
                this.f1604d.setAlpha(0.0f);
                this.f1603c.setAlpha(1.0f);
            }
            if (this.f1613m) {
                vlf.m23436a("fakeView", "click anim finish " + this.f1611k.f1617a + " , " + this.f1611k.f1620d + " ， false");
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
            c0153b2 = this.f1611k;
            if (c0153b2.f1619c) {
                c0153b2.f1619c = false;
                if (c0153b2.f1618b == 2.0f) {
                    this.f1604d.setAlpha(0.0f);
                    this.f1603c.setAlpha(1.0f);
                }
            }
        }
        if (z2) {
            this.f1603c.stepToFrame(this.f1610j.f1620d, false);
        }
        if (z4) {
            SVGAnimationView sVGAnimationView2 = this.f1604d;
            f2 = this.f1611k.f1620d;
            if (f2 > 1.0f) {
                f2 = 2.0f - f2;
            }
            sVGAnimationView2.stepToFrame(f2, false);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m2418n(@Nullable j760<String, String> j760Var, String str) {
        if (j760Var == null) {
            return;
        }
        String str2 = (String) j760Var.a;
        String str3 = (String) j760Var.b;
        this.f1612l = str2;
        this.f1604d.setImageDrawable(null);
        this.f1603c.setImageDrawable(null);
        SVGALoader.SVGARequestBuilder sVGARequestBuilderAutoPlay = SVGALoader.with(getContext()).from(str3).loadCallback(new C0152a(str)).autoPlay(false);
        SVGAnimationView.FrameMode frameMode = SVGAnimationView.FrameMode.AFTER;
        sVGARequestBuilderAutoPlay.frameMode(frameMode).into(this.f1604d);
        if (this.f1607g) {
            SVGALoader.with(getContext()).from(str2).frameMode(frameMode).autoPlay(false).into(this.f1603c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.a4, (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(54.0f), t100.d(54.0f));
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        this.f1603c = viewInflate.findViewById(u4c0.e);
        this.f1604d = viewInflate.findViewById(u4c0.z1);
        this.f1605e = viewInflate.findViewById(u4c0.f2);
        this.f1606f = (ImageView) viewInflate.findViewById(u4c0.q0);
        xdl0.E0(this.f1605e, new View.OnClickListener() { // from class: l.v3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCardExpandedOperationNewUiButton.m2407e(view);
            }
        });
        setClipChildren(false);
        if (this.f1607g) {
            return;
        }
        this.f1603c.setVisibility(8);
        this.f1604d.setAlpha(1.0f);
        this.f1603c.setVisibility(0);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setCoverDrawable(int i) {
        SVGAnimationView sVGAnimationView = this.f1604d;
        if (i == 0) {
            sVGAnimationView.setVisibility(0);
        } else {
            sVGAnimationView.setVisibility(4);
        }
        this.f1605e.setBackgroundResource(i);
        xdl0.M(this.f1605e, i != 0);
    }

    public void setFlagName(String str) {
        this.f1608h = str;
    }

    public void setPlaceHolderPic(@DrawableRes int i) {
        this.f1606f.setImageResource(i);
    }

    @Override // com.p000p1.mobile.putong.core.newui.home.card.operation.BaseHomeCardExpandedButton, android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.f1611k.f1621e = 2.0f / (getRefreshRate() * 0.7f);
        if (z) {
            this.f1614n = true;
            C0153b c0153b = this.f1611k;
            c0153b.f1618b = 1.0f;
            c0153b.f1620d += 1.0E-5f;
            c0153b.f1617a = 1.0f;
            c0153b.f1619c = true;
            m2415p();
            return;
        }
        if (this.f1614n) {
            this.f1614n = false;
            C0153b c0153b2 = this.f1611k;
            c0153b2.f1618b = 2.0f;
            c0153b2.f1617a = 1.0f;
            c0153b2.f1619c = true;
            m2415p();
        }
    }

    public void setShowLog(boolean z) {
        this.f1613m = z;
    }

    public void setSwipeEnable(boolean z) {
        this.f1607g = z;
        if (z) {
            this.f1604d.setAlpha(0.0f);
            this.f1603c.setVisibility(0);
            this.f1610j.f1617a = 0.0f;
        } else {
            this.f1603c.setVisibility(8);
            this.f1604d.setAlpha(1.0f);
            this.f1603c.setVisibility(0);
        }
    }

    public HomeCardExpandedOperationNewUiButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1607g = false;
        this.f1609i = false;
        this.f1610j = new C0153b();
        this.f1611k = new C0153b();
        this.f1612l = null;
        this.f1613m = false;
        this.f1614n = false;
    }

    public HomeCardExpandedOperationNewUiButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1607g = false;
        this.f1609i = false;
        this.f1610j = new C0153b();
        this.f1611k = new C0153b();
        this.f1612l = null;
        this.f1613m = false;
        this.f1614n = false;
    }
}
