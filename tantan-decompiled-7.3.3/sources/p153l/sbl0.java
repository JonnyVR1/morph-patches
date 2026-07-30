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
public class sbl0 extends lp90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f167152e;

    /* JADX INFO: renamed from: f */
    public VFrame_Shadow f167153f;

    /* JADX INFO: renamed from: g */
    public VText f167154g;

    /* JADX INFO: renamed from: h */
    public VFrame_Shadow f167155h;

    /* JADX INFO: renamed from: i */
    public VText f167156i;

    /* JADX INFO: renamed from: j */
    public VFrame_Shadow f167157j;

    /* JADX INFO: renamed from: k */
    public VText f167158k;

    /* JADX INFO: renamed from: l.sbl0$a */
    public static /* synthetic */ class C20014a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f167159a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f167160b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f167160b = iArr;
            try {
                iArr[LayoutDesc.ComboType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f167160b[LayoutDesc.ComboType.SuperLike_VideoChat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f167160b[LayoutDesc.ComboType.Chat_VideoChat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f167159a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.VideoChat.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f167159a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f167159a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public sbl0(Context context, LayoutDesc layoutDesc) {
        super(context, layoutDesc);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo112044e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f133028b.m53572a());
        int i = C20014a.f167159a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m53576b(this.f167157j);
        }
        if (i == 2) {
            return profileButton.m53576b(this.f167155h);
        }
        if (i != 3) {
            return null;
        }
        return profileButton.m53576b(this.f167153f);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: g */
    public View mo112045g() {
        return m185330m(LayoutInflater.from(this.f133029c), null);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: h */
    public void mo112046h(View view) {
        super.mo112046h(view);
        this.f167154g.setTypeface(lyh0.m156283c(3), 1);
        this.f167156i.setTypeface(lyh0.m156283c(3), 1);
        this.f167158k.setTypeface(lyh0.m156283c(3), 1);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: j */
    public void mo112047j(LayoutDesc layoutDesc) {
        int i = C20014a.f167160b[layoutDesc.m53572a().ordinal()];
        if (i == 1) {
            bnl0.m105524M(this.f167157j, true);
            bnl0.m105524M(this.f167155h, false);
            bnl0.m105524M(this.f167153f, false);
        } else if (i == 2) {
            bnl0.m105524M(this.f167157j, true);
            bnl0.m105524M(this.f167155h, false);
            bnl0.m105524M(this.f167153f, true);
        } else {
            if (i != 3) {
                return;
            }
            bnl0.m105524M(this.f167157j, true);
            bnl0.m105524M(this.f167155h, true);
            bnl0.m105524M(this.f167153f, false);
        }
    }

    /* JADX INFO: renamed from: m */
    public View m185330m(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tbl0.m190068b(this, layoutInflater, viewGroup);
    }
}
