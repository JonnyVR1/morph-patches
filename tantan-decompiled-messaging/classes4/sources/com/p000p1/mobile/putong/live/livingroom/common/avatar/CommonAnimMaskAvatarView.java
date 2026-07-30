package com.p000p1.mobile.putong.live.livingroom.common.avatar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import l.hxs;
import l.xdl0;
import l.ym2;
import p002l.g5c0;
import p002l.i3c0;
import p002l.t6c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class CommonAnimMaskAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f4468a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f4469b;

    /* JADX INFO: renamed from: c */
    public C0307b f4470c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView$a */
    public static class C0306a {

        /* JADX INFO: renamed from: c */
        public int f4473c;

        /* JADX INFO: renamed from: d */
        public int f4474d;

        /* JADX INFO: renamed from: e */
        public boolean f4475e;

        /* JADX INFO: renamed from: g */
        public boolean f4477g;

        /* JADX INFO: renamed from: h */
        public ym2 f4478h;

        /* JADX INFO: renamed from: i */
        public String f4479i;

        /* JADX INFO: renamed from: j */
        public int f4480j;

        /* JADX INFO: renamed from: a */
        public String f4471a = "context_single_room";

        /* JADX INFO: renamed from: b */
        public String f4472b = "";

        /* JADX INFO: renamed from: f */
        public boolean f4476f = true;

        /* JADX INFO: renamed from: k */
        public int f4481k = i3c0.f12539J8;

        /* JADX INFO: renamed from: a */
        public C0307b m5584a() {
            return new C0307b(this.f4472b, this.f4479i, this.f4471a, this.f4473c, this.f4474d, this.f4475e, this.f4476f, this.f4477g, this.f4480j, this.f4481k, this.f4478h);
        }

        /* JADX INFO: renamed from: b */
        public C0306a m5585b(String str) {
            this.f4479i = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0306a m5586c(String str) {
            this.f4472b = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0306a m5587d(String str) {
            this.f4471a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0306a m5588e(int i) {
            this.f4473c = i;
            this.f4474d = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0306a m5589f(BLiveUserMask bLiveUserMask) {
            if (NullChecker.a(bLiveUserMask)) {
                m5586c(bLiveUserMask.avatar);
                m5585b(bLiveUserMask.avatarResourceType);
            }
            return this;
        }
    }

    public CommonAnimMaskAvatarView(@NonNull Context context) {
        super(context);
        m5582b();
    }

    /* JADX INFO: renamed from: a */
    public void m5581a() {
        int i;
        int i2;
        int i3;
        int i4;
        C0307b c0307b = this.f4470c;
        if (c0307b.f4483b != 0) {
            xdl0.M(this.f4468a, true);
            xdl0.M(this.f4469b, false);
            this.f4468a.setActualImageResource(this.f4470c.f4483b);
            return;
        }
        int i5 = c0307b.f4486e;
        if (i5 == 0 || (i4 = c0307b.f4487f) == 0) {
            i = 0;
            i2 = 0;
        } else {
            i2 = i5;
            i = i4;
        }
        try {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            int i6 = layoutParams.width;
            if (i6 > 0 && (i3 = layoutParams.height) > 0) {
                i = i3;
                i2 = i6;
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
        int i7 = i;
        int i8 = i2;
        if (TextUtils.isEmpty(this.f4470c.f4482a)) {
            return;
        }
        boolean zM5583c = m5583c();
        VDraweeView vDraweeView = this.f4468a;
        if (zM5583c) {
            xdl0.M(vDraweeView, false);
            xdl0.M(this.f4469b, true);
            SVGALoader.with(getContext()).from(this.f4470c.f4482a).autoPlay(true).into(this.f4469b);
        } else {
            xdl0.M(vDraweeView, true);
            xdl0.M(this.f4469b, false);
            C0307b c0307b2 = this.f4470c;
            hxs.v(c0307b2.f4485d, this.f4468a, c0307b2.f4482a, i8, i7, c0307b2.f4488g, c0307b2.f4489h, c0307b2.f4490i, c0307b2.f4491j);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5582b() {
        LayoutInflater.from(getContext()).inflate(t6c0.f19846g0, (ViewGroup) this, true);
        this.f4468a = findViewById(g5c0.f11059d6);
        AnimEffectPlayer animEffectPlayerFindViewById = findViewById(g5c0.f11184q6);
        this.f4469b = animEffectPlayerFindViewById;
        xdl0.M(animEffectPlayerFindViewById, false);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m5583c() {
        if (TextUtils.equals(this.f4470c.f4484c, "svga")) {
            return true;
        }
        return TextUtils.isEmpty(this.f4470c.f4484c) && this.f4470c.f4482a.endsWith("svga");
    }

    public void setImageResID(int i) {
        if (this.f4470c == null) {
            this.f4470c = new C0307b();
        }
        this.f4470c.f4483b = i;
        m5581a();
    }

    public void setMaskAvatarData(C0307b c0307b) {
        this.f4470c = c0307b;
        m5581a();
    }

    public CommonAnimMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m5582b();
    }

    public CommonAnimMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m5582b();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView$b */
    public static class C0307b {

        /* JADX INFO: renamed from: a */
        public String f4482a;

        /* JADX INFO: renamed from: b */
        public int f4483b;

        /* JADX INFO: renamed from: c */
        public String f4484c;

        /* JADX INFO: renamed from: d */
        public String f4485d;

        /* JADX INFO: renamed from: e */
        public int f4486e;

        /* JADX INFO: renamed from: f */
        public int f4487f;

        /* JADX INFO: renamed from: g */
        public boolean f4488g;

        /* JADX INFO: renamed from: h */
        public boolean f4489h;

        /* JADX INFO: renamed from: i */
        public boolean f4490i;

        /* JADX INFO: renamed from: j */
        public ym2 f4491j;

        /* JADX INFO: renamed from: k */
        public int f4492k;

        public C0307b(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4, ym2 ym2Var) {
            this.f4482a = str;
            this.f4484c = str2;
            this.f4485d = str3;
            this.f4486e = i;
            this.f4487f = i2;
            this.f4488g = z;
            this.f4489h = z2;
            this.f4490i = z3;
            this.f4483b = i3;
            this.f4492k = i4;
            this.f4491j = ym2Var;
        }

        public C0307b() {
            this.f4482a = "";
            this.f4483b = 0;
            this.f4485d = "context_single_room";
            this.f4489h = true;
            this.f4492k = i3c0.f12539J8;
        }
    }
}
