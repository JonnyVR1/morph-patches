package com.p046p1.mobile.putong.live.livingroom.common.avatar;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.CircularProgressView;
import com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.CrashHelper;
import p147v.VDraweeView;
import p149l.bt0;
import p149l.g5c0;
import p149l.hfw;
import p149l.hu20;
import p149l.hxs;
import p149l.i7n;
import p149l.lsi0;
import p149l.t6c0;
import p149l.w8u;
import p149l.x4s;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class CommonMaskAvatarView extends ConstraintLayout implements IChatItemLongClickArea {

    /* JADX INFO: renamed from: n */
    public static boolean f48451n = true;

    /* JADX INFO: renamed from: o */
    public static boolean f48452o = true;

    /* JADX INFO: renamed from: p */
    public static int f48453p;

    /* JADX INFO: renamed from: d */
    public boolean f48454d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f48455e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f48456f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f48457g;

    /* JADX INFO: renamed from: h */
    public MysteryAvatarView f48458h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f48459i;

    /* JADX INFO: renamed from: j */
    public CircularProgressView f48460j;

    /* JADX INFO: renamed from: k */
    public Animator f48461k;

    /* JADX INFO: renamed from: l */
    public C12719a f48462l;

    /* JADX INFO: renamed from: m */
    public int f48463m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView$a */
    public static class C12719a {

        /* JADX INFO: renamed from: a */
        public String f48464a;

        /* JADX INFO: renamed from: b */
        public String f48465b;

        /* JADX INFO: renamed from: c */
        public String f48466c;

        /* JADX INFO: renamed from: d */
        public String f48467d = "";

        /* JADX INFO: renamed from: e */
        public String f48468e;

        public C12719a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f48464a = "";
            this.f48465b = "";
            this.f48466c = "";
            if (!TextUtils.isEmpty(str)) {
                this.f48464a = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f48466c = str2;
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            this.f48465b = str3;
        }

        /* JADX INFO: renamed from: a */
        public void m72130a() {
            this.f48464a = "";
            this.f48465b = "";
            this.f48466c = "";
            this.f48467d = "";
        }
    }

    public CommonMaskAvatarView(@NonNull Context context) {
        super(context);
        this.f48461k = null;
        this.f48463m = 0;
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(t6c0.f168376i0, (ViewGroup) this, true);
        this.f48455e = (VDraweeView) findViewById(g5c0.f100919e6);
        this.f48456f = (VDraweeView) findViewById(g5c0.f100964j1);
        this.f48457g = (AnimEffectPlayer) findViewById(g5c0.f100954i1);
        this.f48458h = (MysteryAvatarView) findViewById(g5c0.f100805S4);
        this.f48459i = (AnimEffectPlayer) findViewById(g5c0.f101034q6);
        this.f48460j = (CircularProgressView) findViewById(g5c0.f100747M0);
        xdl0.m208344M(this.f48455e, false);
        xdl0.m208344M(this.f48456f, false);
        xdl0.m208344M(this.f48457g, false);
        xdl0.m208344M(this.f48459i, false);
        xdl0.m208344M(this.f48460j, false);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m72117o0() {
        f48453p = 0;
    }

    public static void setEnableAnimMask(boolean z) {
        if (z != f48452o) {
            f48452o = z;
        }
    }

    public static void setEnableMask(boolean z) {
        if (z != f48451n) {
            f48451n = z;
            if (z) {
                return;
            }
            lsi0.m151595y("由于房间人数较多，已关闭房间内部分头像框显示");
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @NonNull
    public View getClickTarget() {
        return this;
    }

    public CircularProgressView getCountDownProgressView() {
        return this.f48460j;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @Nullable
    public IChatItemLongClickArea.LongClickArea getLongClickArea() {
        return IChatItemLongClickArea.LongClickArea.AVATAR;
    }

    public MysteryAvatarView getRealAvatarView() {
        return this.f48458h;
    }

    /* JADX INFO: renamed from: h0 */
    public void m72118h0() {
        CommonMaskAvatarView commonMaskAvatarView;
        int i;
        Boolean bool = x4s.f191053a;
        if (bool != null) {
            f48451n = bool.booleanValue();
        }
        int i2 = this.f48463m;
        try {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams.width > 0 && (i = layoutParams.height) > 0) {
                i2 = i;
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
        int i3 = i2;
        xdl0.m208344M(this.f48455e, (f48451n || this.f48454d) && !TextUtils.isEmpty(this.f48462l.f48464a));
        if (f48451n || this.f48454d) {
            hxs.m133408u("context_livingAct", this.f48455e, this.f48462l.f48464a, i3, i3);
        }
        xdl0.m208344M(this.f48456f, ((!f48451n && !this.f48454d) || TextUtils.isEmpty(this.f48462l.f48465b) || w8u.m202223z(this.f48462l.f48465b)) ? false : true);
        xdl0.m208344M(this.f48457g, (f48451n || this.f48454d) && !TextUtils.isEmpty(this.f48462l.f48465b) && w8u.m202223z(this.f48462l.f48465b));
        if (!f48451n && !this.f48454d) {
            commonMaskAvatarView = this;
        } else if (w8u.m202223z(this.f48462l.f48465b)) {
            boolean zM134916b = i7n.m134916b();
            AnimEffectPlayer animEffectPlayer = this.f48457g;
            if (zM134916b) {
                animEffectPlayer.mo68502l(this.f48462l.f48465b, 1, null);
            } else {
                animEffectPlayer.mo68502l(this.f48462l.f48465b, -1, null);
            }
            commonMaskAvatarView = this;
        } else {
            commonMaskAvatarView = this;
            commonMaskAvatarView.m72123m0("context_single_room", this.f48456f, this.f48462l.f48465b, i3, i3);
        }
        if (TextUtils.isEmpty(commonMaskAvatarView.f48462l.f48466c)) {
            return;
        }
        boolean zM72122l0 = commonMaskAvatarView.m72122l0();
        MysteryAvatarView mysteryAvatarView = commonMaskAvatarView.f48458h;
        if (zM72122l0) {
            xdl0.m208344M(mysteryAvatarView, false);
            xdl0.m208344M(commonMaskAvatarView.f48459i, true);
            SVGALoader.with(commonMaskAvatarView.getContext()).from(commonMaskAvatarView.f48462l.f48466c).autoPlay(true).into(commonMaskAvatarView.f48459i);
        } else {
            xdl0.m208344M(mysteryAvatarView, true);
            xdl0.m208344M(commonMaskAvatarView.f48459i, false);
            commonMaskAvatarView.f48458h.m72133w((int) (commonMaskAvatarView.f48463m * 0.75f), commonMaskAvatarView.f48462l.f48466c);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m72119i0() {
        C12719a c12719a = this.f48462l;
        if (c12719a != null) {
            c12719a.m72130a();
        }
        xdl0.m208344M(this.f48457g, false);
        this.f48457g.m68505o();
        this.f48455e.setController(null);
        this.f48456f.setController(null);
        this.f48458h.m72132v();
    }

    /* JADX INFO: renamed from: j0 */
    public void m72120j0() {
        this.f48460j.clearAnimation();
        xdl0.m208344M(this.f48460j, false);
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m72121k0() {
        C12719a c12719a = this.f48462l;
        if (c12719a != null) {
            return (TextUtils.isEmpty(c12719a.f48465b) && TextUtils.isEmpty(this.f48462l.f48464a)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m72122l0() {
        if (TextUtils.equals(this.f48462l.f48468e, "svga")) {
            return true;
        }
        return TextUtils.isEmpty(this.f48462l.f48468e) && this.f48462l.f48466c.endsWith("svga");
    }

    /* JADX INFO: renamed from: m0 */
    public final void m72123m0(String str, VDraweeView vDraweeView, String str2, int i, int i2) {
        if (vDraweeView == null || TextUtils.isEmpty(str2)) {
            return;
        }
        hu20.C17405j c17405j = new hu20.C17405j(str);
        c17405j.mo133006b(str2);
        if (i != 0 && i2 != 0) {
            c17405j.m133022o(i, i2);
        }
        c17405j.m133019l(f48452o).mo132999k().m132979E(vDraweeView);
        int i3 = f48453p + 1;
        f48453p = i3;
        if (i3 >= 30) {
            hu20.m132972s();
            f48453p = 0;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m72124n0(float f) {
        if (!xdl0.m208349O0(this.f48460j)) {
            xdl0.m208344M(this.f48460j, true);
        }
        this.f48460j.setProgress(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m72129t0();
        m72120j0();
    }

    /* JADX INFO: renamed from: p0 */
    public void m72125p0() {
        MysteryAvatarView mysteryAvatarView = this.f48458h;
        if (mysteryAvatarView != null) {
            mysteryAvatarView.getHierarchy().m112050E(null);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m72126q0(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        m72127r0(i, null, str, str2, str3);
    }

    /* JADX INFO: renamed from: r0 */
    public void m72127r0(int i, String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        hfw.m130790a("FansBoardTAG-CommonMaskAvatarView-setImageUrlData，staticCoverUrl:", str2 + ",avatarUrl:" + str3 + ",dynamicCoverUrl:" + str4 + ",suggestSize:" + i);
        if (i > 0) {
            this.f48463m = i;
        }
        C12719a c12719a = this.f48462l;
        if (c12719a != null && TextUtils.equals(c12719a.f48464a, str2) && TextUtils.equals(this.f48462l.f48466c, str3) && TextUtils.equals(this.f48462l.f48465b, str4)) {
            return;
        }
        if (this.f48462l == null) {
            this.f48462l = new C12719a(str2, str3, str4);
        }
        C12719a c12719a2 = this.f48462l;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        c12719a2.f48464a = str2;
        C12719a c12719a3 = this.f48462l;
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        c12719a3.f48466c = str3;
        C12719a c12719a4 = this.f48462l;
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        c12719a4.f48465b = str4;
        this.f48462l.f48468e = str;
        m72118h0();
    }

    /* JADX INFO: renamed from: s0 */
    public void m72128s0() {
        if (this.f48461k == null) {
            this.f48461k = bt0.m103744q(this.f48455e, BLiveGiftItem.TYPE_ROTATION, 0.0f, 30.0f, -30.0f, 0.0f).setDuration(200L);
        }
        if (this.f48461k.isRunning()) {
            return;
        }
        this.f48461k.start();
    }

    public void setLongClickArea(@Nullable IChatItemLongClickArea.LongClickArea longClickArea) {
    }

    public void setMaskUnLimit(boolean z) {
        this.f48454d = z;
    }

    /* JADX INFO: renamed from: t0 */
    public void m72129t0() {
        Animator animator = this.f48461k;
        if (animator != null && animator.isRunning()) {
            this.f48461k.cancel();
        }
        this.f48455e.setRotation(0.0f);
    }

    public CommonMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f48461k = null;
        this.f48463m = 0;
        init();
    }

    public CommonMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f48461k = null;
        this.f48463m = 0;
        init();
    }
}
