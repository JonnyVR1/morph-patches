package com.p046p1.mobile.putong.live.livingroom.common.avatar;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.tantan.library.svga.SVGALoader;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p149l.g5c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.t6c0;
import p149l.xdl0;
import p149l.ym2;

/* JADX INFO: loaded from: classes4.dex */
public class CommonAnimMaskAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f48426a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f48427b;

    /* JADX INFO: renamed from: c */
    public C12718b f48428c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView$a */
    public static class C12717a {

        /* JADX INFO: renamed from: c */
        public int f48431c;

        /* JADX INFO: renamed from: d */
        public int f48432d;

        /* JADX INFO: renamed from: e */
        public boolean f48433e;

        /* JADX INFO: renamed from: g */
        public boolean f48435g;

        /* JADX INFO: renamed from: h */
        public ym2 f48436h;

        /* JADX INFO: renamed from: i */
        public String f48437i;

        /* JADX INFO: renamed from: j */
        public int f48438j;

        /* JADX INFO: renamed from: a */
        public String f48429a = "context_single_room";

        /* JADX INFO: renamed from: b */
        public String f48430b = "";

        /* JADX INFO: renamed from: f */
        public boolean f48434f = true;

        /* JADX INFO: renamed from: k */
        public int f48439k = i3c0.f110754J8;

        /* JADX INFO: renamed from: a */
        public C12718b m72111a() {
            return new C12718b(this.f48430b, this.f48437i, this.f48429a, this.f48431c, this.f48432d, this.f48433e, this.f48434f, this.f48435g, this.f48438j, this.f48439k, this.f48436h);
        }

        /* JADX INFO: renamed from: b */
        public C12717a m72112b(String str) {
            this.f48437i = str;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C12717a m72113c(String str) {
            this.f48430b = str;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C12717a m72114d(String str) {
            this.f48429a = str;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C12717a m72115e(int i) {
            this.f48431c = i;
            this.f48432d = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C12717a m72116f(BLiveUserMask bLiveUserMask) {
            if (NullChecker.m81303a(bLiveUserMask)) {
                m72113c(bLiveUserMask.avatar);
                m72112b(bLiveUserMask.avatarResourceType);
            }
            return this;
        }
    }

    public CommonAnimMaskAvatarView(@NonNull Context context) {
        super(context);
        m72109b();
    }

    /* JADX INFO: renamed from: a */
    public void m72108a() {
        int i;
        int i2;
        int i3;
        int i4;
        C12718b c12718b = this.f48428c;
        if (c12718b.f48441b != 0) {
            xdl0.m208344M(this.f48426a, true);
            xdl0.m208344M(this.f48427b, false);
            this.f48426a.setActualImageResource(this.f48428c.f48441b);
            return;
        }
        int i5 = c12718b.f48444e;
        if (i5 == 0 || (i4 = c12718b.f48445f) == 0) {
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
            CrashHelper.m81296c(e);
        }
        int i7 = i;
        int i8 = i2;
        if (TextUtils.isEmpty(this.f48428c.f48440a)) {
            return;
        }
        boolean zM72110c = m72110c();
        VDraweeView vDraweeView = this.f48426a;
        if (zM72110c) {
            xdl0.m208344M(vDraweeView, false);
            xdl0.m208344M(this.f48427b, true);
            SVGALoader.with(getContext()).from(this.f48428c.f48440a).autoPlay(true).into(this.f48427b);
        } else {
            xdl0.m208344M(vDraweeView, true);
            xdl0.m208344M(this.f48427b, false);
            C12718b c12718b2 = this.f48428c;
            hxs.m133409v(c12718b2.f48443d, this.f48426a, c12718b2.f48440a, i8, i7, c12718b2.f48446g, c12718b2.f48447h, c12718b2.f48448i, c12718b2.f48449j);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m72109b() {
        LayoutInflater.from(getContext()).inflate(t6c0.f168350g0, (ViewGroup) this, true);
        this.f48426a = (VDraweeView) findViewById(g5c0.f100909d6);
        AnimEffectPlayer animEffectPlayer = (AnimEffectPlayer) findViewById(g5c0.f101034q6);
        this.f48427b = animEffectPlayer;
        xdl0.m208344M(animEffectPlayer, false);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m72110c() {
        if (TextUtils.equals(this.f48428c.f48442c, "svga")) {
            return true;
        }
        return TextUtils.isEmpty(this.f48428c.f48442c) && this.f48428c.f48440a.endsWith("svga");
    }

    public void setImageResID(int i) {
        if (this.f48428c == null) {
            this.f48428c = new C12718b();
        }
        this.f48428c.f48441b = i;
        m72108a();
    }

    public void setMaskAvatarData(C12718b c12718b) {
        this.f48428c = c12718b;
        m72108a();
    }

    public CommonAnimMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m72109b();
    }

    public CommonAnimMaskAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m72109b();
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.avatar.CommonAnimMaskAvatarView$b */
    public static class C12718b {

        /* JADX INFO: renamed from: a */
        public String f48440a;

        /* JADX INFO: renamed from: b */
        public int f48441b;

        /* JADX INFO: renamed from: c */
        public String f48442c;

        /* JADX INFO: renamed from: d */
        public String f48443d;

        /* JADX INFO: renamed from: e */
        public int f48444e;

        /* JADX INFO: renamed from: f */
        public int f48445f;

        /* JADX INFO: renamed from: g */
        public boolean f48446g;

        /* JADX INFO: renamed from: h */
        public boolean f48447h;

        /* JADX INFO: renamed from: i */
        public boolean f48448i;

        /* JADX INFO: renamed from: j */
        public ym2 f48449j;

        /* JADX INFO: renamed from: k */
        public int f48450k;

        public C12718b(String str, String str2, String str3, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4, ym2 ym2Var) {
            this.f48440a = str;
            this.f48442c = str2;
            this.f48443d = str3;
            this.f48444e = i;
            this.f48445f = i2;
            this.f48446g = z;
            this.f48447h = z2;
            this.f48448i = z3;
            this.f48441b = i3;
            this.f48450k = i4;
            this.f48449j = ym2Var;
        }

        public C12718b() {
            this.f48440a = "";
            this.f48441b = 0;
            this.f48443d = "context_single_room";
            this.f48447h = true;
            this.f48450k = i3c0.f110754J8;
        }
    }
}
