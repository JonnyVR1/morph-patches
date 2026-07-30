package com.p046p1.mobile.putong.core.newui.home.card.operation;

import android.content.Context;
import android.content.res.TypedArray;
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
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton;
import com.p046p1.mobile.putong.core.newui.home.card.operation.view.HomeCardButtonSvgaView;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p149l.e9c0;
import p149l.f6c0;
import p149l.osl;
import p149l.u4c0;
import p149l.vlf;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardExpandedOptButton extends BaseHomeCardExpandedButton implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: c */
    public HomeCardButtonSvgaView f22844c;

    /* JADX INFO: renamed from: d */
    public HomeCardButtonSvgaView f22845d;

    /* JADX INFO: renamed from: e */
    public View f22846e;

    /* JADX INFO: renamed from: f */
    public ImageView f22847f;

    /* JADX INFO: renamed from: g */
    public boolean f22848g;

    /* JADX INFO: renamed from: h */
    public float f22849h;

    /* JADX INFO: renamed from: i */
    public boolean f22850i;

    /* JADX INFO: renamed from: j */
    public C7991b f22851j;

    /* JADX INFO: renamed from: k */
    public C7991b f22852k;

    /* JADX INFO: renamed from: l */
    public boolean f22853l;

    /* JADX INFO: renamed from: m */
    public boolean f22854m;

    /* JADX INFO: renamed from: n */
    public boolean f22855n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton$a */
    public class C7990a implements RequestCallback {
        public C7990a() {
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            xdl0.m208344M(HomeCardExpandedOptButton.this.f22847f, true);
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            xdl0.m208344M(HomeCardExpandedOptButton.this.f22847f, HomeCardExpandedOptButton.this.f22854m);
            HomeCardExpandedOptButton.this.f22855n = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOptButton$b */
    public static class C7991b {

        /* JADX INFO: renamed from: a */
        public float f22857a;

        /* JADX INFO: renamed from: b */
        public float f22858b;

        /* JADX INFO: renamed from: c */
        public boolean f22859c;

        /* JADX INFO: renamed from: d */
        public float f22860d;

        /* JADX INFO: renamed from: e */
        public float f22861e;

        public C7991b() {
            this.f22857a = 1.0f;
            this.f22859c = false;
            this.f22860d = 0.0f;
            this.f22861e = 0.005319149f;
        }
    }

    public HomeCardExpandedOptButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22848g = false;
        this.f22849h = 1.0f;
        this.f22850i = false;
        this.f22851j = new C7991b();
        this.f22852k = new C7991b();
        this.f22853l = false;
        this.f22854m = false;
        this.f22855n = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, e9c0.f89970K0);
            this.f22849h = typedArrayObtainStyledAttributes.getFloat(e9c0.f89973L0, 1.4629f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m38441e(View view) {
    }

    private float getRefreshRate() {
        if (Build.VERSION.SDK_INT <= 26) {
            return 60.0f;
        }
        return ((Act) getContext()).getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    /* JADX INFO: renamed from: k */
    private boolean m38444k() {
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

    /* JADX INFO: renamed from: m */
    private void m38445m() {
        this.f22851j.f22859c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: n */
    private void m38446n() {
        this.f22852k.f22859c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: o */
    private void m38447o() {
        if (this.f22850i) {
            return;
        }
        m38444k();
        C7991b c7991b = this.f22851j;
        float f = c7991b.f22857a;
        if (f == -1.0f) {
            return;
        }
        if (c7991b.f22860d == 0.0f) {
            if (f == 1.0f && c7991b.f22859c) {
                c7991b.f22857a = -1.0f;
                return;
            }
            return;
        }
        c7991b.f22861e = 1.0f / (getRefreshRate() * 0.188f);
        C7991b c7991b2 = this.f22851j;
        c7991b2.f22858b = 0.0f;
        c7991b2.f22857a = -1.0f;
        if (this.f22853l) {
            vlf.m198796a("fakeView", "reset 每次动画diff: " + this.f22851j.f22861e + " , " + this.f22851j.f22860d + " , " + this.f22851j.f22858b);
        }
        m38445m();
        if (this.f22853l) {
            vlf.m198796a("fakeView", "reset 每次动画diff done: " + this.f22851j.f22861e + " , " + this.f22851j.f22858b);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m38448p() {
        if (!this.f22850i && m38444k()) {
            C7991b c7991b = this.f22851j;
            if (c7991b.f22857a == 1.0f || c7991b.f22860d == 1.0f) {
                return;
            }
            c7991b.f22861e = 1.0f / (getRefreshRate() * 0.188f);
            if (this.f22853l) {
                vlf.m198796a("fakeView", "start # 每次动画diff: " + this.f22851j.f22861e + " , " + this.f22851j.f22860d + " , " + this.f22851j.f22858b);
            }
            C7991b c7991b2 = this.f22851j;
            c7991b2.f22858b = 1.0f;
            c7991b2.f22857a = 1.0f;
            m38445m();
            if (this.f22853l) {
                vlf.m198796a("fakeView", "start # 每次动画diff: done: " + this.f22851j.f22861e + " , " + this.f22851j.f22860d + " , " + this.f22851j.f22858b);
            }
        }
    }

    private void setClickAlpha(float f) {
        this.f22845d.setAlpha(f);
        boolean z = this.f22855n;
        ImageView imageView = this.f22847f;
        if (z) {
            imageView.setAlpha(1.0f - f);
        } else {
            imageView.setAlpha(1.0f);
        }
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: a */
    public void mo38421a(float f, CardProgressAction cardProgressAction) {
        if (this.f22848g) {
            if (f > 0.0f) {
                if (cardProgressAction == CardProgressAction.SWIPE) {
                    m38448p();
                }
            } else if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m38447o();
            }
        }
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: c */
    public void mo38422c(CardProgressAction cardProgressAction) {
        if (this.f22848g) {
            if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m38447o();
            } else if (cardProgressAction == CardProgressAction.SWIPE_BACK_DONE) {
                m38447o();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:65:0x012a  */
    /* JADX WARN: Code duplicated, block: B:74:0x0144  */
    /* JADX WARN: Code duplicated, block: B:78:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:84:0x01af  */
    /* JADX WARN: Code duplicated, block: B:97:0x01da  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x0086, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x00f8, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:74:0x0144, please report this as an issue */
    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        boolean z;
        boolean z2;
        C7991b c7991b;
        float f;
        boolean z3;
        C7991b c7991b2;
        float f2;
        C7991b c7991b3;
        float f3;
        float f4;
        float f5;
        C7991b c7991b4;
        boolean z4 = true;
        if (this.f22848g && this.f22851j.f22859c) {
            this.f22844c.setAlpha(1.0f);
            setClickAlpha(0.0f);
            C7991b c7991b5 = this.f22851j;
            float f6 = c7991b5.f22860d;
            float f7 = c7991b5.f22857a;
            float f8 = f6 + (c7991b5.f22861e * f7);
            c7991b5.f22860d = f8;
            if (f7 == 1.0f) {
                if (f8 > 1.0f) {
                    c7991b5.f22860d = 1.0f;
                    c7991b5.f22857a = 0.0f;
                    c7991b5.f22859c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else if (f7 == -1.0f) {
                if (f8 < 0.0f) {
                    c7991b5.f22860d = 0.0f;
                    c7991b5.f22857a = 0.0f;
                    c7991b5.f22859c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            c7991b = this.f22852k;
            if (c7991b.f22859c) {
                if (this.f22848g) {
                    setClickAlpha(1.0f);
                    this.f22844c.setAlpha(0.0f);
                    c7991b4 = this.f22851j;
                    if (c7991b4.f22859c || c7991b4.f22860d != 0.0f) {
                        c7991b4.f22859c = false;
                        c7991b4.f22860d = 0.0f;
                        z2 = true;
                    }
                }
                C7991b c7991b6 = this.f22852k;
                c7991b6.f22860d += c7991b6.f22857a * c7991b6.f22861e;
                if (this.f22853l) {
                    vlf.m198796a("fakeView", "click anim begin " + this.f22852k.f22857a + " , " + this.f22852k.f22860d);
                }
                c7991b3 = this.f22852k;
                f3 = c7991b3.f22858b;
                if (f3 == 0.0f) {
                    if (c7991b3.f22860d <= 0.0f) {
                        c7991b3.f22860d = 0.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 == 0.5f) {
                    f4 = c7991b3.f22857a;
                    if (f4 <= 0.0f && c7991b3.f22860d > 0.5f) {
                        c7991b3.f22860d = 0.5f;
                    } else if (f4 < 0.0f || c7991b3.f22860d >= 0.5f) {
                        z3 = true;
                    } else {
                        c7991b3.f22860d = 0.5f;
                    }
                    z3 = false;
                } else if (f3 == 1.0f || c7991b3.f22860d <= 1.0f) {
                    z3 = true;
                } else {
                    c7991b3.f22860d = 0.0f;
                    z3 = false;
                }
                f5 = c7991b3.f22860d;
                if (f5 >= 0.0f || f5 > 1.0f) {
                    c7991b3.f22860d = 0.0f;
                    z3 = false;
                }
                if (this.f22853l) {
                    vlf.m198796a("fakeView", "click anim end " + this.f22852k.f22857a + " , " + this.f22852k.f22860d + " ， " + z3 + " , " + this.f22845d.getAlpha());
                }
            } else {
                f = c7991b.f22858b;
                if ((f != 0.0f || f == 1.0f) && this.f22848g) {
                    setClickAlpha(0.0f);
                    this.f22844c.setAlpha(1.0f);
                }
                if (this.f22853l) {
                    vlf.m198796a("fakeView", "click anim finish " + this.f22852k.f22857a + " , " + this.f22852k.f22860d + " ， " + this.f22852k.f22858b + " ， swipe: " + this.f22851j.f22857a + " , " + this.f22851j.f22860d + Constants.SEPARATOR_COMMA + this.f22851j.f22858b + ",false");
                }
                z4 = false;
                z3 = false;
            }
            if (z || z3) {
                Choreographer.getInstance().postFrameCallback(this);
            }
            if (!z3) {
                c7991b2 = this.f22852k;
                if (c7991b2.f22859c) {
                    if (c7991b2.f22858b == 1.0f) {
                        c7991b2.f22858b = 0.0f;
                    }
                    c7991b2.f22859c = false;
                    f2 = c7991b2.f22858b;
                    if ((f2 != 0.0f || f2 == 1.0f) && this.f22848g) {
                        setClickAlpha(0.0f);
                        this.f22844c.setAlpha(1.0f);
                    }
                }
            }
            if (z2 && this.f22848g) {
                this.f22844c.stepToFrame(this.f22851j.f22860d, false);
            }
            if (z4) {
                this.f22845d.stepToFrame(this.f22852k.f22860d % 1.0f, false);
            }
        }
        z = false;
        z2 = z;
        c7991b = this.f22852k;
        if (c7991b.f22859c) {
            if (this.f22848g) {
                setClickAlpha(1.0f);
                this.f22844c.setAlpha(0.0f);
                c7991b4 = this.f22851j;
                if (c7991b4.f22859c) {
                    c7991b4.f22859c = false;
                    c7991b4.f22860d = 0.0f;
                    z2 = true;
                } else {
                    c7991b4.f22859c = false;
                    c7991b4.f22860d = 0.0f;
                    z2 = true;
                }
            }
            C7991b c7991b7 = this.f22852k;
            c7991b7.f22860d += c7991b7.f22857a * c7991b7.f22861e;
            if (this.f22853l) {
                vlf.m198796a("fakeView", "click anim begin " + this.f22852k.f22857a + " , " + this.f22852k.f22860d);
            }
            c7991b3 = this.f22852k;
            f3 = c7991b3.f22858b;
            if (f3 == 0.0f) {
                if (c7991b3.f22860d <= 0.0f) {
                    c7991b3.f22860d = 0.0f;
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (f3 == 0.5f) {
                f4 = c7991b3.f22857a;
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
            f5 = c7991b3.f22860d;
            if (f5 >= 0.0f) {
                c7991b3.f22860d = 0.0f;
                z3 = false;
            } else {
                c7991b3.f22860d = 0.0f;
                z3 = false;
            }
            if (this.f22853l) {
                vlf.m198796a("fakeView", "click anim end " + this.f22852k.f22857a + " , " + this.f22852k.f22860d + " ， " + z3 + " , " + this.f22845d.getAlpha());
            }
        } else {
            f = c7991b.f22858b;
            if (f != 0.0f) {
                setClickAlpha(0.0f);
                this.f22844c.setAlpha(1.0f);
            } else {
                setClickAlpha(0.0f);
                this.f22844c.setAlpha(1.0f);
            }
            if (this.f22853l) {
                vlf.m198796a("fakeView", "click anim finish " + this.f22852k.f22857a + " , " + this.f22852k.f22860d + " ， " + this.f22852k.f22858b + " ， swipe: " + this.f22851j.f22857a + " , " + this.f22851j.f22860d + Constants.SEPARATOR_COMMA + this.f22851j.f22858b + ",false");
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
            c7991b2 = this.f22852k;
            if (c7991b2.f22859c) {
                if (c7991b2.f22858b == 1.0f) {
                    c7991b2.f22858b = 0.0f;
                }
                c7991b2.f22859c = false;
                f2 = c7991b2.f22858b;
                if (f2 != 0.0f) {
                    setClickAlpha(0.0f);
                    this.f22844c.setAlpha(1.0f);
                } else {
                    setClickAlpha(0.0f);
                    this.f22844c.setAlpha(1.0f);
                }
            }
        }
        if (z2) {
            this.f22844c.stepToFrame(this.f22851j.f22860d, false);
        }
        if (z4) {
            this.f22845d.stepToFrame(this.f22852k.f22860d % 1.0f, false);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m38449h(boolean z) {
        if (this.f22854m) {
            boolean z2 = this.f22855n;
            ImageView imageView = this.f22847f;
            if (z2) {
                imageView.setAlpha(0.0f);
            } else {
                imageView.setAlpha(1.0f);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public void m38450l(String str, String str2) {
        this.f22845d.setImageDrawable(null);
        this.f22844c.setImageDrawable(null);
        this.f22847f.setAlpha(1.0f);
        this.f22855n = false;
        this.f22845d.stepToFrame(0.0f, false);
        this.f22844c.stepToFrame(0.0f, false);
        SVGALoader.SVGARequestBuilder sVGARequestBuilderAutoPlay = SVGALoader.with(getContext()).from(str2).loadCallback(new C7990a()).autoPlay(false);
        SVGAnimationView.FrameMode frameMode = SVGAnimationView.FrameMode.AFTER;
        sVGARequestBuilderAutoPlay.frameMode(frameMode).into(this.f22845d);
        if (this.f22848g) {
            SVGALoader.with(getContext()).from(str).frameMode(frameMode).autoPlay(false).into(this.f22844c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.f95704b4, (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        this.f22844c = (HomeCardButtonSvgaView) viewInflate.findViewById(u4c0.f174219e);
        this.f22845d = (HomeCardButtonSvgaView) viewInflate.findViewById(u4c0.f174577z1);
        this.f22846e = viewInflate.findViewById(u4c0.f174239f2);
        this.f22844c.setLayoutScale(this.f22849h);
        this.f22845d.setLayoutScale(this.f22849h);
        this.f22847f = (ImageView) viewInflate.findViewById(u4c0.f174423q0);
        xdl0.m208329E0(this.f22846e, new View.OnClickListener() { // from class: l.x3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCardExpandedOptButton.m38441e(view);
            }
        });
        setClipChildren(false);
        if (this.f22848g) {
            return;
        }
        this.f22844c.setVisibility(8);
        setClickAlpha(1.0f);
        this.f22844c.setVisibility(0);
    }

    @Override // android.view.View
    public void onVisibilityChanged(@NonNull View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            setPressed(false);
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setBgAllShow(boolean z) {
        this.f22854m = z;
        if (z) {
            xdl0.m208344M(this.f22847f, true);
            this.f22847f.setAlpha(1.0f);
        }
    }

    public void setCoverDrawable(int i) {
        HomeCardButtonSvgaView homeCardButtonSvgaView = this.f22845d;
        if (i == 0) {
            homeCardButtonSvgaView.setVisibility(0);
        } else {
            homeCardButtonSvgaView.setVisibility(4);
        }
        this.f22846e.setBackgroundResource(i);
        xdl0.m208344M(this.f22846e, i != 0);
    }

    public void setPlaceHolderPic(@DrawableRes int i) {
        this.f22847f.setImageResource(i);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.operation.BaseHomeCardExpandedButton, android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        if (!this.f22848g) {
            m38449h(z);
        }
        this.f22852k.f22861e = 0.5f / (getRefreshRate() * 0.165f);
        C7991b c7991b = this.f22852k;
        if (z) {
            float f = c7991b.f22860d;
            if (f >= 0.5f) {
                c7991b.f22858b = 0.5f;
                c7991b.f22857a = -1.0f;
                c7991b.f22859c = true;
                m38446n();
                return;
            }
            c7991b.f22858b = 0.5f;
            c7991b.f22860d = f + 1.0E-5f;
            c7991b.f22857a = 1.0f;
            c7991b.f22859c = true;
            m38446n();
            return;
        }
        float f2 = c7991b.f22860d;
        if (f2 == 0.0f) {
            return;
        }
        if (f2 >= 0.5f) {
            c7991b.f22858b = 1.0f;
            c7991b.f22857a = 1.0f;
            c7991b.f22859c = true;
            m38446n();
            return;
        }
        c7991b.f22858b = 1.0f;
        c7991b.f22857a = 1.0f;
        c7991b.f22859c = true;
        m38446n();
    }

    public void setShowLog(boolean z) {
        this.f22853l = z;
    }

    public void setSwipeEnable(boolean z) {
        this.f22848g = z;
        if (z) {
            setClickAlpha(0.0f);
            this.f22844c.setVisibility(0);
            this.f22851j.f22857a = 0.0f;
        } else {
            this.f22844c.setVisibility(8);
            setClickAlpha(1.0f);
            this.f22844c.setVisibility(0);
        }
    }

    public HomeCardExpandedOptButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HomeCardExpandedOptButton(@NonNull Context context) {
        this(context, null);
    }
}
