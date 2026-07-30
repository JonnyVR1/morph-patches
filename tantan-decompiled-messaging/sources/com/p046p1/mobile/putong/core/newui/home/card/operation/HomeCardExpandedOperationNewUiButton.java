package com.p046p1.mobile.putong.core.newui.home.card.operation;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.tantan.library.svga.ResourceKey;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.data.cache.Resource;
import com.tantan.library.svga.data.request.RequestCallback;
import com.tantan.library.svga.exception.SVGAException;
import p149l.f6c0;
import p149l.j760;
import p149l.osl;
import p149l.t100;
import p149l.u4c0;
import p149l.vlf;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeCardExpandedOperationNewUiButton extends BaseHomeCardExpandedButton implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: c */
    public SVGAnimationView f22825c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f22826d;

    /* JADX INFO: renamed from: e */
    public View f22827e;

    /* JADX INFO: renamed from: f */
    public ImageView f22828f;

    /* JADX INFO: renamed from: g */
    public boolean f22829g;

    /* JADX INFO: renamed from: h */
    public String f22830h;

    /* JADX INFO: renamed from: i */
    public boolean f22831i;

    /* JADX INFO: renamed from: j */
    public C7989b f22832j;

    /* JADX INFO: renamed from: k */
    public C7989b f22833k;

    /* JADX INFO: renamed from: l */
    public String f22834l;

    /* JADX INFO: renamed from: m */
    public boolean f22835m;

    /* JADX INFO: renamed from: n */
    public boolean f22836n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton$a */
    public class C7988a implements RequestCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f22837a;

        public C7988a(String str) {
            this.f22837a = str;
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onLoadFailed(@NonNull ResourceKey resourceKey, @Nullable SVGAException sVGAException) {
            xdl0.m208344M(HomeCardExpandedOperationNewUiButton.this.f22828f, true);
            HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = HomeCardExpandedOperationNewUiButton.this;
            if (homeCardExpandedOperationNewUiButton.f22835m) {
                String unused = homeCardExpandedOperationNewUiButton.f22830h;
            }
        }

        @Override // com.tantan.library.svga.data.request.RequestCallback
        public void onResourceReady(@NonNull ResourceKey resourceKey, @NonNull Resource<?> resource) {
            xdl0.m208344M(HomeCardExpandedOperationNewUiButton.this.f22828f, false);
            HomeCardExpandedOperationNewUiButton homeCardExpandedOperationNewUiButton = HomeCardExpandedOperationNewUiButton.this;
            if (homeCardExpandedOperationNewUiButton.f22835m) {
                boolean unused = homeCardExpandedOperationNewUiButton.f22829g;
                String unused2 = HomeCardExpandedOperationNewUiButton.this.f22830h;
                HomeCardExpandedOperationNewUiButton.this.f22826d.getAlpha();
                HomeCardExpandedOperationNewUiButton.this.f22825c.getAlpha();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.card.operation.HomeCardExpandedOperationNewUiButton$b */
    public static class C7989b {

        /* JADX INFO: renamed from: a */
        public float f22839a;

        /* JADX INFO: renamed from: b */
        public float f22840b;

        /* JADX INFO: renamed from: c */
        public boolean f22841c;

        /* JADX INFO: renamed from: d */
        public float f22842d;

        /* JADX INFO: renamed from: e */
        public float f22843e;

        public C7989b() {
            this.f22839a = 1.0f;
            this.f22841c = false;
            this.f22842d = 0.0f;
            this.f22843e = 0.004761905f;
        }
    }

    public HomeCardExpandedOperationNewUiButton(Context context) {
        super(context);
        this.f22829g = false;
        this.f22831i = false;
        this.f22832j = new C7989b();
        this.f22833k = new C7989b();
        this.f22834l = null;
        this.f22835m = false;
        this.f22836n = false;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m38429e(View view) {
    }

    private float getRefreshRate() {
        if (Build.VERSION.SDK_INT <= 26) {
            return 60.0f;
        }
        return ((Act) getContext()).getWindowManager().getDefaultDisplay().getRefreshRate();
    }

    /* JADX INFO: renamed from: m */
    private boolean m38435m() {
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
    private void m38436o() {
        this.f22832j.f22841c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: p */
    private void m38437p() {
        this.f22833k.f22841c = true;
        Choreographer.getInstance().removeFrameCallback(this);
        Choreographer.getInstance().postFrameCallback(this);
    }

    /* JADX INFO: renamed from: q */
    private void m38438q() {
        if (!this.f22831i && m38435m()) {
            C7989b c7989b = this.f22832j;
            if (c7989b.f22839a == -1.0f || c7989b.f22842d == 0.0f) {
                return;
            }
            c7989b.f22843e = 1.0f / (getRefreshRate() * 0.21f);
            C7989b c7989b2 = this.f22832j;
            c7989b2.f22840b = 0.0f;
            c7989b2.f22839a = -1.0f;
            if (this.f22835m) {
                vlf.m198796a("fakeView", "reset 每次动画diff: " + this.f22832j.f22843e + " , " + this.f22832j.f22842d + " , " + this.f22832j.f22840b);
            }
            m38436o();
            if (this.f22835m) {
                vlf.m198796a("fakeView", "reset 每次动画diff done: " + this.f22832j.f22843e + " , " + this.f22832j.f22840b);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    private void m38439r() {
        if (!this.f22831i && m38435m()) {
            C7989b c7989b = this.f22832j;
            if (c7989b.f22839a == 1.0f || c7989b.f22842d == 1.0f) {
                return;
            }
            c7989b.f22843e = 1.0f / (getRefreshRate() * 0.21f);
            if (this.f22835m) {
                vlf.m198796a("fakeView", "start # 每次动画diff: " + this.f22832j.f22843e + " , " + this.f22832j.f22842d + " , " + this.f22832j.f22840b);
            }
            C7989b c7989b2 = this.f22832j;
            c7989b2.f22840b = 1.0f;
            c7989b2.f22839a = 1.0f;
            m38436o();
            if (this.f22835m) {
                vlf.m198796a("fakeView", "start # 每次动画diff: done: " + this.f22832j.f22843e + " , " + this.f22832j.f22842d + " , " + this.f22832j.f22840b);
            }
        }
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: a */
    public void mo38421a(float f, CardProgressAction cardProgressAction) {
        if (this.f22829g) {
            if (f > 0.0f) {
                if (cardProgressAction == CardProgressAction.SWIPE) {
                    m38439r();
                }
            } else if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m38438q();
            }
        }
    }

    @Override // p149l.nsl
    /* JADX INFO: renamed from: c */
    public void mo38422c(CardProgressAction cardProgressAction) {
        if (this.f22829g) {
            if (cardProgressAction == CardProgressAction.SWIPE_DONE || cardProgressAction == CardProgressAction.SWIPE) {
                m38438q();
            } else if (cardProgressAction == CardProgressAction.SWIPE_BACK_DONE) {
                m38438q();
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
        C7989b c7989b;
        float f;
        boolean z3;
        float f2;
        C7989b c7989b2;
        C7989b c7989b3;
        float f3;
        boolean z4 = true;
        if (this.f22829g && this.f22832j.f22841c) {
            this.f22825c.setAlpha(1.0f);
            this.f22826d.setAlpha(0.0f);
            C7989b c7989b4 = this.f22832j;
            float f4 = c7989b4.f22842d;
            float f5 = c7989b4.f22839a;
            float f6 = f4 + (c7989b4.f22843e * f5);
            c7989b4.f22842d = f6;
            if (f5 == 1.0f) {
                if (f6 > 1.0f) {
                    c7989b4.f22842d = 1.0f;
                    c7989b4.f22839a = 0.0f;
                    c7989b4.f22841c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else if (f5 == -1.0f) {
                if (f6 < 0.0f) {
                    c7989b4.f22842d = 0.0f;
                    c7989b4.f22839a = 0.0f;
                    c7989b4.f22841c = false;
                    z2 = true;
                    z = false;
                }
                z = true;
            } else {
                z = true;
                z2 = false;
            }
            c7989b = this.f22833k;
            if (c7989b.f22841c) {
                if (this.f22829g) {
                    this.f22826d.setAlpha(1.0f);
                    this.f22825c.setAlpha(0.0f);
                }
                C7989b c7989b5 = this.f22833k;
                c7989b5.f22842d += c7989b5.f22839a * c7989b5.f22843e;
                if (this.f22835m) {
                    vlf.m198796a("fakeView", "click anim begin " + this.f22833k.f22839a + " , " + this.f22833k.f22842d);
                }
                c7989b3 = this.f22833k;
                f3 = c7989b3.f22840b;
                if (f3 == 0.0f) {
                    if (c7989b3.f22842d <= 0.0f) {
                        c7989b3.f22842d = 0.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 != 1.0f) {
                    if (c7989b3.f22842d > 1.0f) {
                        c7989b3.f22842d = 1.0f;
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                } else if (f3 == 2.0f || c7989b3.f22842d <= 2.0f) {
                    z3 = true;
                } else {
                    c7989b3.f22842d = 0.0f;
                    z3 = false;
                }
                if (this.f22835m) {
                    vlf.m198796a("fakeView", "click anim end " + this.f22833k.f22839a + " , " + this.f22833k.f22842d + " ， " + z3 + " , " + this.f22826d.getAlpha());
                }
            } else {
                f = c7989b.f22840b;
                if ((f != 0.0f || f == 1.0f || f == 2.0f) && this.f22829g && (f == 0.0f || f == 2.0f)) {
                    this.f22826d.setAlpha(0.0f);
                    this.f22825c.setAlpha(1.0f);
                }
                if (this.f22835m) {
                    vlf.m198796a("fakeView", "click anim finish " + this.f22833k.f22839a + " , " + this.f22833k.f22842d + " ， false");
                }
                z4 = false;
                z3 = false;
            }
            if (z || z3) {
                Choreographer.getInstance().postFrameCallback(this);
            }
            if (!z3) {
                c7989b2 = this.f22833k;
                if (c7989b2.f22841c) {
                    c7989b2.f22841c = false;
                    if (c7989b2.f22840b == 2.0f && this.f22829g) {
                        this.f22826d.setAlpha(0.0f);
                        this.f22825c.setAlpha(1.0f);
                    }
                }
            }
            if (z2 && this.f22829g) {
                this.f22825c.stepToFrame(this.f22832j.f22842d, false);
            }
            if (z4) {
                SVGAnimationView sVGAnimationView = this.f22826d;
                f2 = this.f22833k.f22842d;
                if (f2 > 1.0f) {
                    f2 = 2.0f - f2;
                }
                sVGAnimationView.stepToFrame(f2, false);
            }
        }
        z = false;
        z2 = z;
        c7989b = this.f22833k;
        if (c7989b.f22841c) {
            if (this.f22829g) {
                this.f22826d.setAlpha(1.0f);
                this.f22825c.setAlpha(0.0f);
            }
            C7989b c7989b6 = this.f22833k;
            c7989b6.f22842d += c7989b6.f22839a * c7989b6.f22843e;
            if (this.f22835m) {
                vlf.m198796a("fakeView", "click anim begin " + this.f22833k.f22839a + " , " + this.f22833k.f22842d);
            }
            c7989b3 = this.f22833k;
            f3 = c7989b3.f22840b;
            if (f3 == 0.0f) {
                if (c7989b3.f22842d <= 0.0f) {
                    c7989b3.f22842d = 0.0f;
                    z3 = false;
                } else {
                    z3 = true;
                }
            } else if (f3 != 1.0f) {
                if (f3 == 2.0f) {
                }
                z3 = true;
            } else if (c7989b3.f22842d > 1.0f) {
                c7989b3.f22842d = 1.0f;
                z3 = false;
            } else {
                z3 = true;
            }
            if (this.f22835m) {
                vlf.m198796a("fakeView", "click anim end " + this.f22833k.f22839a + " , " + this.f22833k.f22842d + " ， " + z3 + " , " + this.f22826d.getAlpha());
            }
        } else {
            f = c7989b.f22840b;
            if (f != 0.0f) {
                this.f22826d.setAlpha(0.0f);
                this.f22825c.setAlpha(1.0f);
            } else {
                this.f22826d.setAlpha(0.0f);
                this.f22825c.setAlpha(1.0f);
            }
            if (this.f22835m) {
                vlf.m198796a("fakeView", "click anim finish " + this.f22833k.f22839a + " , " + this.f22833k.f22842d + " ， false");
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
            c7989b2 = this.f22833k;
            if (c7989b2.f22841c) {
                c7989b2.f22841c = false;
                if (c7989b2.f22840b == 2.0f) {
                    this.f22826d.setAlpha(0.0f);
                    this.f22825c.setAlpha(1.0f);
                }
            }
        }
        if (z2) {
            this.f22825c.stepToFrame(this.f22832j.f22842d, false);
        }
        if (z4) {
            SVGAnimationView sVGAnimationView2 = this.f22826d;
            f2 = this.f22833k.f22842d;
            if (f2 > 1.0f) {
                f2 = 2.0f - f2;
            }
            sVGAnimationView2.stepToFrame(f2, false);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m38440n(@Nullable j760<String, String> j760Var, String str) {
        if (j760Var == null) {
            return;
        }
        String str2 = j760Var.f116564a;
        String str3 = j760Var.f116565b;
        this.f22834l = str2;
        this.f22826d.setImageDrawable(null);
        this.f22825c.setImageDrawable(null);
        SVGALoader.SVGARequestBuilder sVGARequestBuilderAutoPlay = SVGALoader.with(getContext()).from(str3).loadCallback(new C7988a(str)).autoPlay(false);
        SVGAnimationView.FrameMode frameMode = SVGAnimationView.FrameMode.AFTER;
        sVGARequestBuilderAutoPlay.frameMode(frameMode).into(this.f22826d);
        if (this.f22829g) {
            SVGALoader.with(getContext()).from(str2).frameMode(frameMode).autoPlay(false).into(this.f22825c);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.f95687a4, (ViewGroup) this, false);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(54.0f), t100.m186890d(54.0f));
        layoutParams.gravity = 17;
        addView(viewInflate, layoutParams);
        this.f22825c = (SVGAnimationView) viewInflate.findViewById(u4c0.f174219e);
        this.f22826d = (SVGAnimationView) viewInflate.findViewById(u4c0.f174577z1);
        this.f22827e = viewInflate.findViewById(u4c0.f174239f2);
        this.f22828f = (ImageView) viewInflate.findViewById(u4c0.f174423q0);
        xdl0.m208329E0(this.f22827e, new View.OnClickListener() { // from class: l.v3l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeCardExpandedOperationNewUiButton.m38429e(view);
            }
        });
        setClipChildren(false);
        if (this.f22829g) {
            return;
        }
        this.f22825c.setVisibility(8);
        this.f22826d.setAlpha(1.0f);
        this.f22825c.setVisibility(0);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }

    public void setCoverDrawable(int i) {
        SVGAnimationView sVGAnimationView = this.f22826d;
        if (i == 0) {
            sVGAnimationView.setVisibility(0);
        } else {
            sVGAnimationView.setVisibility(4);
        }
        this.f22827e.setBackgroundResource(i);
        xdl0.m208344M(this.f22827e, i != 0);
    }

    public void setFlagName(String str) {
        this.f22830h = str;
    }

    public void setPlaceHolderPic(@DrawableRes int i) {
        this.f22828f.setImageResource(i);
    }

    @Override // com.p046p1.mobile.putong.core.newui.home.card.operation.BaseHomeCardExpandedButton, android.view.View
    public void setPressed(boolean z) {
        super.setPressed(z);
        this.f22833k.f22843e = 2.0f / (getRefreshRate() * 0.7f);
        if (z) {
            this.f22836n = true;
            C7989b c7989b = this.f22833k;
            c7989b.f22840b = 1.0f;
            c7989b.f22842d += 1.0E-5f;
            c7989b.f22839a = 1.0f;
            c7989b.f22841c = true;
            m38437p();
            return;
        }
        if (this.f22836n) {
            this.f22836n = false;
            C7989b c7989b2 = this.f22833k;
            c7989b2.f22840b = 2.0f;
            c7989b2.f22839a = 1.0f;
            c7989b2.f22841c = true;
            m38437p();
        }
    }

    public void setShowLog(boolean z) {
        this.f22835m = z;
    }

    public void setSwipeEnable(boolean z) {
        this.f22829g = z;
        if (z) {
            this.f22826d.setAlpha(0.0f);
            this.f22825c.setVisibility(0);
            this.f22832j.f22839a = 0.0f;
        } else {
            this.f22825c.setVisibility(8);
            this.f22826d.setAlpha(1.0f);
            this.f22825c.setVisibility(0);
        }
    }

    public HomeCardExpandedOperationNewUiButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22829g = false;
        this.f22831i = false;
        this.f22832j = new C7989b();
        this.f22833k = new C7989b();
        this.f22834l = null;
        this.f22835m = false;
        this.f22836n = false;
    }

    public HomeCardExpandedOperationNewUiButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22829g = false;
        this.f22831i = false;
        this.f22832j = new C7989b();
        this.f22833k = new C7989b();
        this.f22834l = null;
        this.f22835m = false;
        this.f22836n = false;
    }
}
