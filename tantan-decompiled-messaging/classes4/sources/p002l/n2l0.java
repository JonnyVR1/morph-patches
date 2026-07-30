package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import l.eqh0;
import l.o2l0;
import l.xdl0;
import v.VFrame_Shadow;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class n2l0 extends hh90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f15799e;

    /* JADX INFO: renamed from: f */
    public VFrame_Shadow f15800f;

    /* JADX INFO: renamed from: g */
    public VText f15801g;

    /* JADX INFO: renamed from: h */
    public VFrame_Shadow f15802h;

    /* JADX INFO: renamed from: i */
    public VText f15803i;

    /* JADX INFO: renamed from: j */
    public VFrame_Shadow f15804j;

    /* JADX INFO: renamed from: k */
    public VText f15805k;

    /* JADX INFO: renamed from: l.n2l0$a */
    public static /* synthetic */ class C0693a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f15806a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f15807b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f15807b = iArr;
            try {
                iArr[LayoutDesc.ComboType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15807b[LayoutDesc.ComboType.SuperLike_VideoChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15807b[LayoutDesc.ComboType.Chat_VideoChat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f15806a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15806a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15806a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public n2l0(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo12175e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f12033b.m2923a());
        int i = C0693a.f15806a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m2927b(this.f15804j);
        }
        if (i == 2) {
            return profileButton.m2927b(this.f15802h);
        }
        if (i != 3) {
            return null;
        }
        return profileButton.m2927b(this.f15800f);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: g */
    public View mo12176g() {
        return m18471m(LayoutInflater.from(this.f12034c), null);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: h */
    public void mo12177h(View view) {
        super.mo12177h(view);
        this.f15801g.setTypeface(eqh0.c(3), 1);
        this.f15803i.setTypeface(eqh0.c(3), 1);
        this.f15805k.setTypeface(eqh0.c(3), 1);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: j */
    public void mo12178j(LayoutDesc layoutDesc) {
        int i = C0693a.f15807b[layoutDesc.m2923a().ordinal()];
        if (i == 1) {
            xdl0.M(this.f15804j, true);
            xdl0.M(this.f15802h, false);
            xdl0.M(this.f15800f, false);
        } else if (i == 2) {
            xdl0.M(this.f15804j, true);
            xdl0.M(this.f15802h, false);
            xdl0.M(this.f15800f, true);
        } else {
            if (i != 3) {
                return;
            }
            xdl0.M(this.f15804j, true);
            xdl0.M(this.f15802h, true);
            xdl0.M(this.f15800f, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public View m18471m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o2l0.b(this, layoutInflater, viewGroup);
    }
}
