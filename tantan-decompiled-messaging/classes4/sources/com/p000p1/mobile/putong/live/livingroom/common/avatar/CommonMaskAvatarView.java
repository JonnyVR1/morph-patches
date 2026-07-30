package com.p000p1.mobile.putong.live.livingroom.common.avatar;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.base.view.CircularProgressView;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.CrashHelper;
import l.ap0;
import l.bt0;
import l.hce;
import l.hfw;
import l.hu20;
import l.hxs;
import l.i7n;
import l.lsi0;
import l.w8u;
import l.x4s;
import l.xdl0;
import p002l.g5c0;
import p002l.t6c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CommonMaskAvatarView extends ConstraintLayout implements IChatItemLongClickArea {

    /* JADX INFO: renamed from: n */
    public static boolean f4493n = true;

    /* JADX INFO: renamed from: o */
    public static boolean f4494o = true;

    /* JADX INFO: renamed from: p */
    public static int f4495p;

    /* JADX INFO: renamed from: d */
    public boolean f4496d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f4497e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f4498f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f4499g;

    /* JADX INFO: renamed from: h */
    public MysteryAvatarView f4500h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f4501i;

    /* JADX INFO: renamed from: j */
    public CircularProgressView f4502j;

    /* JADX INFO: renamed from: k */
    public Animator f4503k;

    /* JADX INFO: renamed from: l */
    public C0308a f4504l;

    /* JADX INFO: renamed from: m */
    public int f4505m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView$a */
    public static class C0308a {

        /* JADX INFO: renamed from: a */
        public String f4506a;

        /* JADX INFO: renamed from: b */
        public String f4507b;

        /* JADX INFO: renamed from: c */
        public String f4508c;

        /* JADX INFO: renamed from: d */
        public String f4509d = "";

        /* JADX INFO: renamed from: e */
        public String f4510e;

        public C0308a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f4506a = "";
            this.f4507b = "";
            this.f4508c = "";
            if (!TextUtils.isEmpty(str)) {
                this.f4506a = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f4508c = str2;
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            this.f4507b = str3;
        }

        /* JADX INFO: renamed from: a */
        public void m5603a() {
            this.f4506a = "";
            this.f4507b = "";
            this.f4508c = "";
            this.f4509d = "";
        }
    }

    public CommonMaskAvatarView(@NonNull Context context) {
        super(context);
        this.f4503k = null;
        this.f4505m = 0;
        init();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void init() {
        LayoutInflater.from(getContext()).inflate(t6c0.f19872i0, (ViewGroup) this, true);
        this.f4497e = findViewById(g5c0.f11069e6);
        this.f4498f = findViewById(g5c0.f11114j1);
        this.f4499g = findViewById(g5c0.f11104i1);
        this.f4500h = (MysteryAvatarView) findViewById(g5c0.f10955S4);
        this.f4501i = findViewById(g5c0.f11184q6);
        this.f4502j = findViewById(g5c0.f10897M0);
        xdl0.M(this.f4497e, false);
        xdl0.M(this.f4498f, false);
        xdl0.M(this.f4499g, false);
        xdl0.M(this.f4501i, false);
        xdl0.M(this.f4502j, false);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m5590o0() {
        f4495p = 0;
    }

    public static void setEnableAnimMask(boolean z) {
        if (z != f4494o) {
            f4494o = z;
        }
    }

    public static void setEnableMask(boolean z) {
        if (z != f4493n) {
            f4493n = z;
            if (z) {
                return;
            }
            lsi0.y("由于房间人数较多，已关闭房间内部分头像框显示");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p000p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @NonNull
    public View getClickTarget() {
        return this;
    }

    public CircularProgressView getCountDownProgressView() {
        return this.f4502j;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @Nullable
    public IChatItemLongClickArea.LongClickArea getLongClickArea() {
        return IChatItemLongClickArea.LongClickArea.AVATAR;
    }

    public MysteryAvatarView getRealAvatarView() {
        return this.f4500h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View, com.p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX INFO: renamed from: h0 */
    public void m5591h0() {
        ?? r2;
        int i;
        Boolean bool = x4s.a;
        if (bool != null) {
            f4493n = bool.booleanValue();
        }
        int i2 = this.f4505m;
        try {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams.width > 0 && (i = layoutParams.height) > 0) {
                i2 = i;
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        int i3 = i2;
        xdl0.M(this.f4497e, (f4493n || this.f4496d) && !TextUtils.isEmpty(this.f4504l.f4506a));
        if (f4493n || this.f4496d) {
            hxs.u("context_livingAct", this.f4497e, this.f4504l.f4506a, i3, i3);
        }
        xdl0.M(this.f4498f, ((!f4493n && !this.f4496d) || TextUtils.isEmpty(this.f4504l.f4507b) || w8u.z(this.f4504l.f4507b)) ? false : true);
        xdl0.M(this.f4499g, (f4493n || this.f4496d) && !TextUtils.isEmpty(this.f4504l.f4507b) && w8u.z(this.f4504l.f4507b));
        if (!f4493n && !this.f4496d) {
            r2 = this;
        } else if (w8u.z(this.f4504l.f4507b)) {
            boolean zB = i7n.b();
            AnimEffectPlayer animEffectPlayer = this.f4499g;
            if (zB) {
                animEffectPlayer.l(this.f4504l.f4507b, 1, (ap0) null);
            } else {
                animEffectPlayer.l(this.f4504l.f4507b, -1, (ap0) null);
            }
            r2 = this;
        } else {
            CommonMaskAvatarView commonMaskAvatarView = this;
            commonMaskAvatarView.m5596m0("context_single_room", this.f4498f, this.f4504l.f4507b, i3, i3);
            r2 = commonMaskAvatarView;
        }
        if (TextUtils.isEmpty(r2.f4504l.f4508c)) {
            return;
        }
        boolean zM5595l0 = r2.m5595l0();
        VDraweeView vDraweeView = r2.f4500h;
        if (zM5595l0) {
            xdl0.M(vDraweeView, false);
            xdl0.M(r2.f4501i, true);
            SVGALoader.with(r2.getContext()).from(r2.f4504l.f4508c).autoPlay(true).into(r2.f4501i);
        } else {
            xdl0.M(vDraweeView, true);
            xdl0.M(r2.f4501i, false);
            r2.f4500h.m5606w((int) (r2.f4505m * 0.75f), r2.f4504l.f4508c);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m5592i0() {
        C0308a c0308a = this.f4504l;
        if (c0308a != null) {
            c0308a.m5603a();
        }
        xdl0.M(this.f4499g, false);
        this.f4499g.o();
        this.f4497e.setController((hce) null);
        this.f4498f.setController((hce) null);
        this.f4500h.m5605v();
    }

    /* JADX INFO: renamed from: j0 */
    public void m5593j0() {
        this.f4502j.clearAnimation();
        xdl0.M(this.f4502j, false);
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m5594k0() {
        C0308a c0308a = this.f4504l;
        if (c0308a != null) {
            return (TextUtils.isEmpty(c0308a.f4507b) && TextUtils.isEmpty(this.f4504l.f4506a)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m5595l0() {
        if (TextUtils.equals(this.f4504l.f4510e, "svga")) {
            return true;
        }
        return TextUtils.isEmpty(this.f4504l.f4510e) && this.f4504l.f4508c.endsWith("svga");
    }

    /* JADX INFO: renamed from: m0 */
    public final void m5596m0(String str, VDraweeView vDraweeView, String str2, int i, int i2) {
        if (vDraweeView == null || TextUtils.isEmpty(str2)) {
            return;
        }
        hu20.j jVar = new hu20.j(str);
        jVar.b(str2);
        if (i != 0 && i2 != 0) {
            jVar.o(i, i2);
        }
        jVar.l(f4494o).k().E(vDraweeView);
        int i3 = f4495p + 1;
        f4495p = i3;
        if (i3 >= 30) {
            hu20.s();
            f4495p = 0;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m5597n0(float f) {
        if (!xdl0.O0(this.f4502j)) {
            xdl0.M(this.f4502j, true);
        }
        this.f4502j.setProgress(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        m5602t0();
        m5593j0();
    }

    /* JADX INFO: renamed from: p0 */
    public void m5598p0() {
        MysteryAvatarView mysteryAvatarView = this.f4500h;
        if (mysteryAvatarView != null) {
            mysteryAvatarView.getHierarchy().E((Drawable) null);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m5599q0(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        m5600r0(i, null, str, str2, str3);
    }

    /* JADX INFO: renamed from: r0 */
    public void m5600r0(int i, String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        hfw.a("FansBoardTAG-CommonMaskAvatarView-setImageUrlData，staticCoverUrl:", str2 + ",avatarUrl:" + str3 + ",dynamicCoverUrl:" + str4 + ",suggestSize:" + i);
        if (i > 0) {
            this.f4505m = i;
        }
        C0308a c0308a = this.f4504l;
        if (c0308a != null && TextUtils.equals(c0308a.f4506a, str2) && TextUtils.equals(this.f4504l.f4508c, str3) && TextUtils.equals(this.f4504l.f4507b, str4)) {
            return;
        }
        if (this.f4504l == null) {
            this.f4504l = new C0308a(str2, str3, str4);
        }
        C0308a c0308a2 = this.f4504l;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        c0308a2.f4506a = str2;
        C0308a c0308a3 = this.f4504l;
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        c0308a3.f4508c = str3;
        C0308a c0308a4 = this.f4504l;
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        c0308a4.f4507b = str4;
        this.f4504l.f4510e = str;
        m5591h0();
    }

    /* JADX INFO: renamed from: s0 */
    public void m5601s0() {
        if (this.f4503k == null) {
            this.f4503k = bt0.q(this.f4497e, "rotation", new float[]{0.0f, 30.0f, -30.0f, 0.0f}).setDuration(200L);
        }
        if (this.f4503k.isRunning()) {
            return;
        }
        this.f4503k.start();
    }

    public void setLongClickArea(@Nullable IChatItemLongClickArea.LongClickArea longClickArea) {
    }

    public void setMaskUnLimit(boolean z) {
        this.f4496d = z;
    }

    /* JADX INFO: renamed from: t0 */
    public void m5602t0() {
        Animator animator = this.f4503k;
        if (animator != null && animator.isRunning()) {
            this.f4503k.cancel();
        }
        this.f4497e.setRotation(0.0f);
    }

    public CommonMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4503k = null;
        this.f4505m = 0;
        init();
    }

    public CommonMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4503k = null;
        this.f4505m = 0;
        init();
    }
}
