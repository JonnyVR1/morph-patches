package com.p051p1.mobile.putong.live.livingroom.common.avatar;

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
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.CircularProgressView;
import com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.CrashHelper;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.fhw;
import p153l.gt0;
import p153l.i9n;
import p153l.izs;
import p153l.mdc0;
import p153l.o1j0;
import p153l.r230;
import p153l.xau;
import p153l.y6s;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class CommonMaskAvatarView extends ConstraintLayout implements IChatItemLongClickArea {

    /* JADX INFO: renamed from: n */
    public static boolean f49299n = true;

    /* JADX INFO: renamed from: o */
    public static boolean f49300o = true;

    /* JADX INFO: renamed from: p */
    public static int f49301p;

    /* JADX INFO: renamed from: d */
    public boolean f49302d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f49303e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f49304f;

    /* JADX INFO: renamed from: g */
    public AnimEffectPlayer f49305g;

    /* JADX INFO: renamed from: h */
    public MysteryAvatarView f49306h;

    /* JADX INFO: renamed from: i */
    public AnimEffectPlayer f49307i;

    /* JADX INFO: renamed from: j */
    public CircularProgressView f49308j;

    /* JADX INFO: renamed from: k */
    public Animator f49309k;

    /* JADX INFO: renamed from: l */
    public C12882a f49310l;

    /* JADX INFO: renamed from: m */
    public int f49311m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.CommonMaskAvatarView$a */
    public static class C12882a {

        /* JADX INFO: renamed from: a */
        public String f49312a;

        /* JADX INFO: renamed from: b */
        public String f49313b;

        /* JADX INFO: renamed from: c */
        public String f49314c;

        /* JADX INFO: renamed from: d */
        public String f49315d = "";

        /* JADX INFO: renamed from: e */
        public String f49316e;

        public C12882a(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.f49312a = "";
            this.f49313b = "";
            this.f49314c = "";
            if (!TextUtils.isEmpty(str)) {
                this.f49312a = str;
            }
            if (!TextUtils.isEmpty(str2)) {
                this.f49314c = str2;
            }
            if (TextUtils.isEmpty(str3)) {
                return;
            }
            this.f49313b = str3;
        }

        /* JADX INFO: renamed from: a */
        public void m73313a() {
            this.f49312a = "";
            this.f49313b = "";
            this.f49314c = "";
            this.f49315d = "";
        }
    }

    public CommonMaskAvatarView(@NonNull Context context) {
        super(context);
        this.f49309k = null;
        this.f49311m = 0;
        init();
    }

    private void init() {
        LayoutInflater.from(getContext()).inflate(yec0.f199108i0, (ViewGroup) this, true);
        this.f49303e = (VDraweeView) findViewById(mdc0.f136164e6);
        this.f49304f = (VDraweeView) findViewById(mdc0.f136209j1);
        this.f49305g = (AnimEffectPlayer) findViewById(mdc0.f136199i1);
        this.f49306h = (MysteryAvatarView) findViewById(mdc0.f136050S4);
        this.f49307i = (AnimEffectPlayer) findViewById(mdc0.f136279q6);
        this.f49308j = (CircularProgressView) findViewById(mdc0.f135992M0);
        bnl0.m105524M(this.f49303e, false);
        bnl0.m105524M(this.f49304f, false);
        bnl0.m105524M(this.f49305g, false);
        bnl0.m105524M(this.f49307i, false);
        bnl0.m105524M(this.f49308j, false);
    }

    /* JADX INFO: renamed from: o0 */
    public static void m73300o0() {
        f49301p = 0;
    }

    public static void setEnableAnimMask(boolean z) {
        if (z != f49300o) {
            f49300o = z;
        }
    }

    public static void setEnableMask(boolean z) {
        if (z != f49299n) {
            f49299n = z;
            if (z) {
                return;
            }
            o1j0.m165651y("由于房间人数较多，已关闭房间内部分头像框显示");
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @NonNull
    public View getClickTarget() {
        return this;
    }

    public CircularProgressView getCountDownProgressView() {
        return this.f49308j;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.chat.IChatItemLongClickArea
    @Nullable
    public IChatItemLongClickArea.LongClickArea getLongClickArea() {
        return IChatItemLongClickArea.LongClickArea.AVATAR;
    }

    public MysteryAvatarView getRealAvatarView() {
        return this.f49306h;
    }

    /* JADX INFO: renamed from: h0 */
    public void m73301h0() {
        CommonMaskAvatarView commonMaskAvatarView;
        int i;
        Boolean bool = y6s.f197708a;
        if (bool != null) {
            f49299n = bool.booleanValue();
        }
        int i2 = this.f49311m;
        try {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams.width > 0 && (i = layoutParams.height) > 0) {
                i2 = i;
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
        int i3 = i2;
        bnl0.m105524M(this.f49303e, (f49299n || this.f49302d) && !TextUtils.isEmpty(this.f49310l.f49312a));
        if (f49299n || this.f49302d) {
            izs.m142870u("context_livingAct", this.f49303e, this.f49310l.f49312a, i3, i3);
        }
        bnl0.m105524M(this.f49304f, ((!f49299n && !this.f49302d) || TextUtils.isEmpty(this.f49310l.f49313b) || xau.m209916z(this.f49310l.f49313b)) ? false : true);
        bnl0.m105524M(this.f49305g, (f49299n || this.f49302d) && !TextUtils.isEmpty(this.f49310l.f49313b) && xau.m209916z(this.f49310l.f49313b));
        if (!f49299n && !this.f49302d) {
            commonMaskAvatarView = this;
        } else if (xau.m209916z(this.f49310l.f49313b)) {
            boolean zM139127b = i9n.m139127b();
            AnimEffectPlayer animEffectPlayer = this.f49305g;
            if (zM139127b) {
                animEffectPlayer.mo69685l(this.f49310l.f49313b, 1, null);
            } else {
                animEffectPlayer.mo69685l(this.f49310l.f49313b, -1, null);
            }
            commonMaskAvatarView = this;
        } else {
            commonMaskAvatarView = this;
            commonMaskAvatarView.m73306m0("context_single_room", this.f49304f, this.f49310l.f49313b, i3, i3);
        }
        if (TextUtils.isEmpty(commonMaskAvatarView.f49310l.f49314c)) {
            return;
        }
        boolean zM73305l0 = commonMaskAvatarView.m73305l0();
        MysteryAvatarView mysteryAvatarView = commonMaskAvatarView.f49306h;
        if (zM73305l0) {
            bnl0.m105524M(mysteryAvatarView, false);
            bnl0.m105524M(commonMaskAvatarView.f49307i, true);
            SVGALoader.with(commonMaskAvatarView.getContext()).from(commonMaskAvatarView.f49310l.f49314c).autoPlay(true).into(commonMaskAvatarView.f49307i);
        } else {
            bnl0.m105524M(mysteryAvatarView, true);
            bnl0.m105524M(commonMaskAvatarView.f49307i, false);
            commonMaskAvatarView.f49306h.m73316w((int) (commonMaskAvatarView.f49311m * 0.75f), commonMaskAvatarView.f49310l.f49314c);
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m73302i0() {
        C12882a c12882a = this.f49310l;
        if (c12882a != null) {
            c12882a.m73313a();
        }
        bnl0.m105524M(this.f49305g, false);
        this.f49305g.m69688o();
        this.f49303e.setController(null);
        this.f49304f.setController(null);
        this.f49306h.m73315v();
    }

    /* JADX INFO: renamed from: j0 */
    public void m73303j0() {
        this.f49308j.clearAnimation();
        bnl0.m105524M(this.f49308j, false);
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m73304k0() {
        C12882a c12882a = this.f49310l;
        if (c12882a != null) {
            return (TextUtils.isEmpty(c12882a.f49313b) && TextUtils.isEmpty(this.f49310l.f49312a)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m73305l0() {
        if (TextUtils.equals(this.f49310l.f49316e, "svga")) {
            return true;
        }
        return TextUtils.isEmpty(this.f49310l.f49316e) && this.f49310l.f49314c.endsWith("svga");
    }

    /* JADX INFO: renamed from: m0 */
    public final void m73306m0(String str, VDraweeView vDraweeView, String str2, int i, int i2) {
        if (vDraweeView == null || TextUtils.isEmpty(str2)) {
            return;
        }
        r230.C19750j c19750j = new r230.C19750j(str);
        c19750j.mo179511b(str2);
        if (i != 0 && i2 != 0) {
            c19750j.m179527o(i, i2);
        }
        c19750j.m179524l(f49300o).mo179504k().m179484E(vDraweeView);
        int i3 = f49301p + 1;
        f49301p = i3;
        if (i3 >= 30) {
            r230.m179477s();
            f49301p = 0;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m73307n0(float f) {
        if (!bnl0.m105529O0(this.f49308j)) {
            bnl0.m105524M(this.f49308j, true);
        }
        this.f49308j.setProgress(f);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m73312t0();
        m73303j0();
    }

    /* JADX INFO: renamed from: p0 */
    public void m73308p0() {
        MysteryAvatarView mysteryAvatarView = this.f49306h;
        if (mysteryAvatarView != null) {
            mysteryAvatarView.getHierarchy().m207042E(null);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public void m73309q0(int i, @Nullable String str, @Nullable String str2, @Nullable String str3) {
        m73310r0(i, null, str, str2, str3);
    }

    /* JADX INFO: renamed from: r0 */
    public void m73310r0(int i, String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        fhw.m125605a("FansBoardTAG-CommonMaskAvatarView-setImageUrlData，staticCoverUrl:", str2 + ",avatarUrl:" + str3 + ",dynamicCoverUrl:" + str4 + ",suggestSize:" + i);
        if (i > 0) {
            this.f49311m = i;
        }
        C12882a c12882a = this.f49310l;
        if (c12882a != null && TextUtils.equals(c12882a.f49312a, str2) && TextUtils.equals(this.f49310l.f49314c, str3) && TextUtils.equals(this.f49310l.f49313b, str4)) {
            return;
        }
        if (this.f49310l == null) {
            this.f49310l = new C12882a(str2, str3, str4);
        }
        C12882a c12882a2 = this.f49310l;
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        c12882a2.f49312a = str2;
        C12882a c12882a3 = this.f49310l;
        if (TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        c12882a3.f49314c = str3;
        C12882a c12882a4 = this.f49310l;
        if (TextUtils.isEmpty(str4)) {
            str4 = "";
        }
        c12882a4.f49313b = str4;
        this.f49310l.f49316e = str;
        m73301h0();
    }

    /* JADX INFO: renamed from: s0 */
    public void m73311s0() {
        if (this.f49309k == null) {
            this.f49309k = gt0.m132171q(this.f49303e, BLiveGiftItem.TYPE_ROTATION, 0.0f, 30.0f, -30.0f, 0.0f).setDuration(200L);
        }
        if (this.f49309k.isRunning()) {
            return;
        }
        this.f49309k.start();
    }

    public void setLongClickArea(@Nullable IChatItemLongClickArea.LongClickArea longClickArea) {
    }

    public void setMaskUnLimit(boolean z) {
        this.f49302d = z;
    }

    /* JADX INFO: renamed from: t0 */
    public void m73312t0() {
        Animator animator = this.f49309k;
        if (animator != null && animator.isRunning()) {
            this.f49309k.cancel();
        }
        this.f49303e.setRotation(0.0f);
    }

    public CommonMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49309k = null;
        this.f49311m = 0;
        init();
    }

    public CommonMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49309k = null;
        this.f49311m = 0;
        init();
    }
}
