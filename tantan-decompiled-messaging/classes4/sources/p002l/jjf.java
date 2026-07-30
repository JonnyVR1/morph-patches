package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import l.eqh0;
import l.kjf;
import l.xdl0;
import v.VFrame_Shadow;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jjf extends hh90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f13825e;

    /* JADX INFO: renamed from: f */
    public VFrame_Shadow f13826f;

    /* JADX INFO: renamed from: g */
    public VText f13827g;

    /* JADX INFO: renamed from: h */
    public VFrame_Shadow f13828h;

    /* JADX INFO: renamed from: i */
    public VText f13829i;

    /* JADX INFO: renamed from: j */
    public VFrame_Shadow f13830j;

    /* JADX INFO: renamed from: k */
    public VText f13831k;

    /* JADX INFO: renamed from: l.jjf$a */
    public static /* synthetic */ class C0637a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13832a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f13833b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f13833b = iArr;
            try {
                iArr[LayoutDesc.ComboType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13833b[LayoutDesc.ComboType.SuperLike_VideoChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13833b[LayoutDesc.ComboType.Chat_VideoChat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f13832a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13832a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13832a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public jjf(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo12175e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f12033b.m2923a());
        int i = C0637a.f13832a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m2927b(this.f13830j);
        }
        if (i == 2) {
            return profileButton.m2927b(this.f13828h);
        }
        if (i != 3) {
            return null;
        }
        return profileButton.m2927b(this.f13826f);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: g */
    public View mo12176g() {
        return m15973m(LayoutInflater.from(this.f12034c), null);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: h */
    public void mo12177h(View view) {
        super.mo12177h(view);
        this.f13827g.setTypeface(eqh0.c(3), 1);
        this.f13829i.setTypeface(eqh0.c(3), 1);
        this.f13831k.setTypeface(eqh0.c(3), 1);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: j */
    public void mo12178j(LayoutDesc layoutDesc) {
        int i = C0637a.f13833b[layoutDesc.m2923a().ordinal()];
        if (i == 1) {
            xdl0.M(this.f13830j, true);
            xdl0.M(this.f13828h, false);
            xdl0.M(this.f13826f, false);
        } else if (i == 2) {
            xdl0.M(this.f13830j, true);
            xdl0.M(this.f13828h, false);
            xdl0.M(this.f13826f, true);
        } else {
            if (i != 3) {
                return;
            }
            xdl0.M(this.f13830j, true);
            xdl0.M(this.f13828h, true);
            xdl0.M(this.f13826f, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public View m15973m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kjf.b(this, layoutInflater, viewGroup);
    }
}
