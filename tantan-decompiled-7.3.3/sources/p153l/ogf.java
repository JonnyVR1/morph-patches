package p153l;

import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.layout.expanded.view.ExpProfileOpButtonLinearRoot;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.layout.expanded.view.ExpProfileOpButtonRoot;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.LetterRemainingSwitcherView;
import java.util.Iterator;
import java.util.List;
import p151v.VFrame_FlipContainer;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ogf extends lp90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f147231e;

    /* JADX INFO: renamed from: f */
    public View f147232f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f147233g;

    /* JADX INFO: renamed from: h */
    public VLinear f147234h;

    /* JADX INFO: renamed from: i */
    public ExpProfileOpButtonRoot f147235i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f147236j;

    /* JADX INFO: renamed from: k */
    public VImage f147237k;

    /* JADX INFO: renamed from: l */
    public ExpProfileOpButtonRoot f147238l;

    /* JADX INFO: renamed from: m */
    public VFrame_FlipContainer f147239m;

    /* JADX INFO: renamed from: n */
    public VImage f147240n;

    /* JADX INFO: renamed from: o */
    public VText f147241o;

    /* JADX INFO: renamed from: p */
    public ExpProfileOpButtonRoot f147242p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f147243q;

    /* JADX INFO: renamed from: r */
    public VImage f147244r;

    /* JADX INFO: renamed from: s */
    public ExpProfileOpButtonRoot f147245s;

    /* JADX INFO: renamed from: t */
    public VText f147246t;

    /* JADX INFO: renamed from: u */
    public ExpProfileOpButtonLinearRoot f147247u;

    /* JADX INFO: renamed from: v */
    public LetterRemainingSwitcherView f147248v;

    /* JADX INFO: renamed from: w */
    public ExpProfileOpButtonRoot f147249w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f147250x;

    /* JADX INFO: renamed from: y */
    public VImage f147251y;

    /* JADX INFO: renamed from: z */
    public boolean f147252z;

    /* JADX INFO: renamed from: l.ogf$a */
    public static /* synthetic */ class C19130a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f147253a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f147254b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f147254b = iArr;
            try {
                iArr[LayoutDesc.ComboType.Dislike_Like_SuperLike_Match.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f147254b[LayoutDesc.ComboType.Like_SuperLike_Match.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f147254b[LayoutDesc.ComboType.SuperLike_Match.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f147254b[LayoutDesc.ComboType.Match.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f147254b[LayoutDesc.ComboType.Chat_Single.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f147254b[LayoutDesc.ComboType.Like_Single.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f147254b[LayoutDesc.ComboType.Explore_Single.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f147253a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.Like.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f147253a[ProfileButton.ProfileButtonType.Dislike.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f147253a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f147253a[ProfileButton.ProfileButtonType.OneKeyMatch.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f147253a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: c */
    public View mo155165c() {
        return this.f147232f;
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo112044e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f133028b.m53572a());
        int i = C19130a.f147253a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m53576b(this.f147242p);
        }
        if (i == 2) {
            return profileButton.m53576b(this.f147235i);
        }
        if (i == 3) {
            return this.f133028b.m53572a() == LayoutDesc.ComboType.SuperLike_Match ? profileButton.m53576b(this.f147245s) : profileButton.m53576b(this.f147238l);
        }
        if (i == 4) {
            return profileButton.m53576b(this.f147247u);
        }
        if (i != 5) {
            return null;
        }
        return profileButton.m53576b(this.f147249w);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: f */
    public ProfileButton mo155167f(ProfileButton.ProfileButtonType profileButtonType, LayoutDesc.ComboType comboType) {
        if (profileButtonType != ProfileButton.ProfileButtonType.SuperLike) {
            return super.mo155167f(profileButtonType, comboType);
        }
        LayoutDesc.ComboType comboType2 = LayoutDesc.ComboType.SuperLike_Match;
        LayoutDesc layoutDesc = this.f133028b;
        return comboType == comboType2 ? new ProfileButton(profileButtonType, layoutDesc.m53572a()).m53576b(this.f147245s) : new ProfileButton(profileButtonType, layoutDesc.m53572a()).m53576b(this.f147238l);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: g */
    public View mo112045g() {
        return m167597n(LayoutInflater.from(this.f133029c), null);
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: h */
    public void mo112046h(View view) {
        super.mo112046h(view);
        this.f147246t.setTypeface(lyh0.m156283c(3), 1);
        m155164b(this.f147242p);
        m155164b(this.f147235i);
        m155164b(this.f147238l);
        m155164b(this.f147245s);
        m155164b(this.f147249w);
        t450.m189174h().m189189p();
        m167599p(jyb.m147507f0("一键配对"));
        view.post(new Runnable() { // from class: l.ngf
            @Override // java.lang.Runnable
            public final void run() {
                this.f141813a.m167598o();
            }
        });
    }

    @Override // p153l.lp90
    /* JADX INFO: renamed from: j */
    public void mo112047j(LayoutDesc layoutDesc) {
        switch (C19130a.f147254b[layoutDesc.m53572a().ordinal()]) {
            case 1:
                bnl0.m105524M(this.f147233g, true);
                bnl0.m105524M(this.f147245s, false);
                bnl0.m105524M(this.f147247u, true);
                bnl0.m105524M(this.f147235i, true);
                bnl0.m105524M(this.f147249w, false);
                break;
            case 2:
                bnl0.m105524M(this.f147233g, true);
                bnl0.m105524M(this.f147245s, false);
                bnl0.m105524M(this.f147247u, true);
                bnl0.m105524M(this.f147235i, false);
                bnl0.m105524M(this.f147249w, false);
                break;
            case 3:
                bnl0.m105524M(this.f147233g, false);
                bnl0.m105524M(this.f147245s, true);
                bnl0.m105524M(this.f147247u, true);
                bnl0.m105524M(this.f147249w, false);
                break;
            case 4:
                bnl0.m105524M(this.f147233g, false);
                bnl0.m105524M(this.f147245s, false);
                bnl0.m105524M(this.f147247u, true);
                bnl0.m105524M(this.f147249w, false);
                break;
            case 5:
                bnl0.m105524M(this.f147233g, false);
                bnl0.m105524M(this.f147245s, false);
                bnl0.m105524M(this.f147247u, false);
                bnl0.m105524M(this.f147249w, true);
                break;
            case 6:
                bnl0.m105524M(this.f147233g, true);
                bnl0.m105524M(this.f147245s, false);
                bnl0.m105524M(this.f147247u, false);
                bnl0.m105524M(this.f147249w, false);
                bnl0.m105524M(this.f147238l, false);
                bnl0.m105524M(this.f147235i, false);
                bnl0.m105524M(this.f147242p, true);
                break;
            case 7:
                bnl0.m105524M(this.f147233g, false);
                bnl0.m105524M(this.f147245s, false);
                bnl0.m105524M(this.f147247u, false);
                bnl0.m105524M(this.f147249w, false);
                bnl0.m105524M(this.f147238l, false);
                bnl0.m105524M(this.f147235i, false);
                bnl0.m105524M(this.f147242p, false);
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    public View m167597n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pgf.m172227b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m167598o() {
        if (bnl0.m105529O0(this.f147233g) && bnl0.m105529O0(this.f147247u) && this.f147247u.getRight() > this.f147231e.getWidth()) {
            bnl0.m105507D0(qa00.m175859d(48.0f), this.f147247u);
            this.f147247u.m53585Q(true);
            this.f147252z = true;
            this.f147248v.m58909i();
            bnl0.m105524M(this.f147248v, false);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m167599p(List<String> list) {
        if (this.f147252z) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(qa00.m175861f(14));
        Iterator<String> it = list.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(textPaint.measureText(it.next()), fMax);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f147248v.getLayoutParams();
        layoutParams.width = ((int) fMax) + qa00.m175859d(2.0f);
        this.f147248v.setLayoutParams(layoutParams);
        bnl0.m105524M(this.f147248v, true);
        this.f147248v.m58909i();
        this.f147248v.setTextList(list);
        this.f147248v.setOutTranslateY(0.5f);
        this.f147248v.setAnimateDirection(false);
        this.f147248v.setInOutAnimation(300L);
        this.f147248v.m58908h();
    }
}
