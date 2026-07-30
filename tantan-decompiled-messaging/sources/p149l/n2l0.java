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
public class n2l0 extends hh90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f136850e;

    /* JADX INFO: renamed from: f */
    public VFrame_Shadow f136851f;

    /* JADX INFO: renamed from: g */
    public VText f136852g;

    /* JADX INFO: renamed from: h */
    public VFrame_Shadow f136853h;

    /* JADX INFO: renamed from: i */
    public VText f136854i;

    /* JADX INFO: renamed from: j */
    public VFrame_Shadow f136855j;

    /* JADX INFO: renamed from: k */
    public VText f136856k;

    /* JADX INFO: renamed from: l.n2l0$a */
    public static /* synthetic */ class C18615a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f136857a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f136858b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f136858b = iArr;
            try {
                iArr[LayoutDesc.ComboType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f136858b[LayoutDesc.ComboType.SuperLike_VideoChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f136858b[LayoutDesc.ComboType.Chat_VideoChat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f136857a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f136857a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f136857a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public n2l0(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo114662e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f107690b.m52389a());
        int i = C18615a.f136857a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m52393b(this.f136855j);
        }
        if (i == 2) {
            return profileButton.m52393b(this.f136853h);
        }
        if (i != 3) {
            return null;
        }
        return profileButton.m52393b(this.f136851f);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: g */
    public View mo114663g() {
        return m157672m(LayoutInflater.from(this.f107691c), null);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: h */
    public void mo114664h(View view) {
        super.mo114664h(view);
        this.f136852g.setTypeface(eqh0.m117752c(3), 1);
        this.f136854i.setTypeface(eqh0.m117752c(3), 1);
        this.f136856k.setTypeface(eqh0.m117752c(3), 1);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: j */
    public void mo114665j(LayoutDesc layoutDesc) {
        int i = C18615a.f136858b[layoutDesc.m52389a().ordinal()];
        if (i == 1) {
            xdl0.m208344M(this.f136855j, true);
            xdl0.m208344M(this.f136853h, false);
            xdl0.m208344M(this.f136851f, false);
        } else if (i == 2) {
            xdl0.m208344M(this.f136855j, true);
            xdl0.m208344M(this.f136853h, false);
            xdl0.m208344M(this.f136851f, true);
        } else {
            if (i != 3) {
                return;
            }
            xdl0.m208344M(this.f136855j, true);
            xdl0.m208344M(this.f136853h, true);
            xdl0.m208344M(this.f136851f, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public View m157672m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o2l0.m162304b(this, layoutInflater, viewGroup);
    }
}
