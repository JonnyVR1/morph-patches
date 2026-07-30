package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import p147v.VFrame_Shadow;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jjf extends hh90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f118283e;

    /* JADX INFO: renamed from: f */
    public VFrame_Shadow f118284f;

    /* JADX INFO: renamed from: g */
    public VText f118285g;

    /* JADX INFO: renamed from: h */
    public VFrame_Shadow f118286h;

    /* JADX INFO: renamed from: i */
    public VText f118287i;

    /* JADX INFO: renamed from: j */
    public VFrame_Shadow f118288j;

    /* JADX INFO: renamed from: k */
    public VText f118289k;

    /* JADX INFO: renamed from: l.jjf$a */
    public static /* synthetic */ class C17801a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f118290a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f118291b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f118291b = iArr;
            try {
                iArr[LayoutDesc.ComboType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f118291b[LayoutDesc.ComboType.SuperLike_VideoChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f118291b[LayoutDesc.ComboType.Chat_VideoChat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f118290a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f118290a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f118290a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public jjf(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo114662e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f107690b.m52389a());
        int i = C17801a.f118290a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m52393b(this.f118288j);
        }
        if (i == 2) {
            return profileButton.m52393b(this.f118286h);
        }
        if (i != 3) {
            return null;
        }
        return profileButton.m52393b(this.f118284f);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: g */
    public View mo114663g() {
        return m141801m(LayoutInflater.from(this.f107691c), null);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: h */
    public void mo114664h(View view) {
        super.mo114664h(view);
        this.f118285g.setTypeface(eqh0.m117752c(3), 1);
        this.f118287i.setTypeface(eqh0.m117752c(3), 1);
        this.f118289k.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: j */
    public void mo114665j(LayoutDesc layoutDesc) {
        int i = C17801a.f118291b[layoutDesc.m52389a().ordinal()];
        if (i == 1) {
            xdl0.m208344M(this.f118288j, true);
            xdl0.m208344M(this.f118286h, false);
            xdl0.m208344M(this.f118284f, false);
        } else if (i == 2) {
            xdl0.m208344M(this.f118288j, true);
            xdl0.m208344M(this.f118286h, false);
            xdl0.m208344M(this.f118284f, true);
        } else {
            if (i != 3) {
                return;
            }
            xdl0.m208344M(this.f118288j, true);
            xdl0.m208344M(this.f118286h, true);
            xdl0.m208344M(this.f118284f, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public View m141801m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kjf.m146229b(this, layoutInflater, viewGroup);
    }
}
