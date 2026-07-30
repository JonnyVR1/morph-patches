package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import p151v.VFrame_Shadow;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pkf extends lp90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f152828e;

    /* JADX INFO: renamed from: f */
    public VFrame_Shadow f152829f;

    /* JADX INFO: renamed from: g */
    public VText f152830g;

    /* JADX INFO: renamed from: h */
    public VFrame_Shadow f152831h;

    /* JADX INFO: renamed from: i */
    public VText f152832i;

    /* JADX INFO: renamed from: j */
    public VFrame_Shadow f152833j;

    /* JADX INFO: renamed from: k */
    public VText f152834k;

    /* JADX INFO: renamed from: l.pkf$a */
    public static /* synthetic */ class C19383a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f152835a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f152836b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f152836b = iArr;
            try {
                iArr[LayoutDesc.ComboType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f152836b[LayoutDesc.ComboType.SuperLike_VideoChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f152836b[LayoutDesc.ComboType.Chat_VideoChat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f152835a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f152835a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f152835a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public pkf(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo112044e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f133028b.m53572a());
        int i = C19383a.f152835a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m53576b(this.f152833j);
        }
        if (i == 2) {
            return profileButton.m53576b(this.f152831h);
        }
        if (i != 3) {
            return null;
        }
        return profileButton.m53576b(this.f152829f);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: g */
    public View mo112045g() {
        return m172597m(LayoutInflater.from(this.f133029c), null);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: h */
    public void mo112046h(View view) {
        super.mo112046h(view);
        this.f152830g.setTypeface(lyh0.m156283c(3), 1);
        this.f152832i.setTypeface(lyh0.m156283c(3), 1);
        this.f152834k.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: j */
    public void mo112047j(LayoutDesc layoutDesc) {
        int i = C19383a.f152836b[layoutDesc.m53572a().ordinal()];
        if (i == 1) {
            bnl0.m105524M(this.f152833j, true);
            bnl0.m105524M(this.f152831h, false);
            bnl0.m105524M(this.f152829f, false);
        } else if (i == 2) {
            bnl0.m105524M(this.f152833j, true);
            bnl0.m105524M(this.f152831h, false);
            bnl0.m105524M(this.f152829f, true);
        } else {
            if (i != 3) {
                return;
            }
            bnl0.m105524M(this.f152833j, true);
            bnl0.m105524M(this.f152831h, true);
            bnl0.m105524M(this.f152829f, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public View m172597m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qkf.m176951b(this, layoutInflater, viewGroup);
    }
}
