package com.p051p1.mobile.putong.live.livingroom.common.avatar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.fn2;
import p153l.izs;
import p153l.mdc0;
import p153l.obc0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class CommonAnimMaskAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49274a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49275b;

    /* JADX INFO: renamed from: c */
    public C12881b f49276c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView$a */
    public static class C12880a {

        /* JADX INFO: renamed from: c */
        public int f49279c;

        /* JADX INFO: renamed from: d */
        public int f49280d;

        /* JADX INFO: renamed from: e */
        public boolean f49281e;

        /* JADX INFO: renamed from: g */
        public boolean f49283g;

        /* JADX INFO: renamed from: h */
        public fn2 f49284h;

        /* JADX INFO: renamed from: i */
        public String f49285i;

        /* JADX INFO: renamed from: j */
        public int f49286j;

        /* JADX INFO: renamed from: a */
        public String f49277a = "context_single_room";

        /* JADX INFO: renamed from: b */
        public String f49278b = "";

        /* JADX INFO: renamed from: f */
        public boolean f49282f = true;

        /* JADX INFO: renamed from: k */
        public int f49287k = obc0.f146082J8;

        /* JADX INFO: renamed from: a */
        public C12881b m73294a() {
            return new C12881b(this.f49278b, this.f49285i, this.f49277a, this.f49279c, this.f49280d, this.f49281e, this.f49282f, this.f49283g, this.f49286j, this.f49287k, this.f49284h);
        }

        /* JADX INFO: renamed from: b */
        public C12880a m73295b(String str) {
            this.f49285i = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12880a m73296c(String str) {
            this.f49278b = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C12880a m73297d(String str) {
            this.f49277a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C12880a m73298e(int i) {
            this.f49279c = i;
            this.f49280d = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C12880a m73299f(BLiveUserMask bLiveUserMask) {
            if (NullChecker.m82486a(bLiveUserMask)) {
                m73296c(bLiveUserMask.avatar);
                m73295b(bLiveUserMask.avatarResourceType);
            }
            return this;
        }
    }

    public CommonAnimMaskAvatarView(@NonNull Context context) {
        super(context);
        m73292b();
    }

    /* JADX INFO: renamed from: a */
    public void m73291a() {
        int i;
        int i2;
        int i3;
        int i4;
        C12881b c12881b = this.f49276c;
        if (c12881b.f49289b != 0) {
            bnl0.m105524M(this.f49274a, true);
            bnl0.m105524M(this.f49275b, false);
            this.f49274a.setActualImageResource(this.f49276c.f49289b);
            return;
        }
        int i5 = c12881b.f49292e;
        if (i5 == 0 || (i4 = c12881b.f49293f) == 0) {
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
            CrashHelper.m82479c(e);
        }
        int i7 = i;
        int i8 = i2;
        if (TextUtils.isEmpty(this.f49276c.f49288a)) {
            return;
        }
        boolean zM73293c = m73293c();
        VDraweeView vDraweeView = this.f49274a;
        if (zM73293c) {
            bnl0.m105524M(vDraweeView, false);
            bnl0.m105524M(this.f49275b, true);
            SVGALoader.with(getContext()).from(this.f49276c.f49288a).autoPlay(true).into(this.f49275b);
        } else {
            bnl0.m105524M(vDraweeView, true);
            bnl0.m105524M(this.f49275b, false);
            C12881b c12881b2 = this.f49276c;
            izs.m142871v(c12881b2.f49291d, this.f49274a, c12881b2.f49288a, i8, i7, c12881b2.f49294g, c12881b2.f49295h, c12881b2.f49296i, c12881b2.f49297j);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m73292b() {
        LayoutInflater.from(getContext()).inflate(yec0.f199082g0, (ViewGroup) this, true);
        this.f49274a = (VDraweeView) findViewById(mdc0.f136154d6);
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) findViewById(mdc0.f136279q6);
        this.f49275b = animEffectPlayer;
        bnl0.m105524M(animEffectPlayer, false);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m73293c() {
        if (TextUtils.equals(this.f49276c.f49290c, "svga")) {
            return true;
        }
        return TextUtils.isEmpty(this.f49276c.f49290c) && this.f49276c.f49288a.endsWith("svga");
    }

    public void setImageResID(int i) {
        if (this.f49276c == null) {
            this.f49276c = new C12881b();
        }
        this.f49276c.f49289b = i;
        m73291a();
    }

    public void setMaskAvatarData(C12881b c12881b) {
        this.f49276c = c12881b;
        m73291a();
    }

    public CommonAnimMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m73292b();
    }

    public CommonAnimMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m73292b();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView$b */
    public static class C12881b {

        /* JADX INFO: renamed from: a */
        public String f49288a;

        /* JADX INFO: renamed from: b */
        public int f49289b;

        /* JADX INFO: renamed from: c */
        public String f49290c;

        /* JADX INFO: renamed from: d */
        public String f49291d;

        /* JADX INFO: renamed from: e */
        public int f49292e;

        /* JADX INFO: renamed from: f */
        public int f49293f;

        /* JADX INFO: renamed from: g */
        public boolean f49294g;

        /* JADX INFO: renamed from: h */
        public boolean f49295h;

        /* JADX INFO: renamed from: i */
        public boolean f49296i;

        /* JADX INFO: renamed from: j */
        public fn2 f49297j;

        /* JADX INFO: renamed from: k */
        public int f49298k;

        public C12881b(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4, fn2 fn2Var) {
            this.f49288a = str;
            this.f49290c = str2;
            this.f49291d = str3;
            this.f49292e = i;
            this.f49293f = i2;
            this.f49294g = z;
            this.f49295h = z2;
            this.f49296i = z3;
            this.f49289b = i3;
            this.f49298k = i4;
            this.f49297j = fn2Var;
        }

        public C12881b() {
            this.f49288a = "";
            this.f49289b = 0;
            this.f49291d = "context_single_room";
            this.f49295h = true;
            this.f49298k = obc0.f146082J8;
        }
    }
}
