package p002l;

import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.layout.expanded.view.ExpProfileOpButtonLinearRoot;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.layout.expanded.view.ExpProfileOpButtonRoot;
import com.p1.mobile.putong.core.ui.vip.widget.LetterRemainingSwitcherView;
import java.util.Iterator;
import java.util.List;
import l.eqh0;
import l.ew40;
import l.jff;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VFrame_FlipContainer;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class iff extends hh90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f13197e;

    /* JADX INFO: renamed from: f */
    public View f13198f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f13199g;

    /* JADX INFO: renamed from: h */
    public VLinear f13200h;

    /* JADX INFO: renamed from: i */
    public ExpProfileOpButtonRoot f13201i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f13202j;

    /* JADX INFO: renamed from: k */
    public VImage f13203k;

    /* JADX INFO: renamed from: l */
    public ExpProfileOpButtonRoot f13204l;

    /* JADX INFO: renamed from: m */
    public VFrame_FlipContainer f13205m;

    /* JADX INFO: renamed from: n */
    public VImage f13206n;

    /* JADX INFO: renamed from: o */
    public VText f13207o;

    /* JADX INFO: renamed from: p */
    public ExpProfileOpButtonRoot f13208p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f13209q;

    /* JADX INFO: renamed from: r */
    public VImage f13210r;

    /* JADX INFO: renamed from: s */
    public ExpProfileOpButtonRoot f13211s;

    /* JADX INFO: renamed from: t */
    public VText f13212t;

    /* JADX INFO: renamed from: u */
    public ExpProfileOpButtonLinearRoot f13213u;

    /* JADX INFO: renamed from: v */
    public LetterRemainingSwitcherView f13214v;

    /* JADX INFO: renamed from: w */
    public ExpProfileOpButtonRoot f13215w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f13216x;

    /* JADX INFO: renamed from: y */
    public VImage f13217y;

    /* JADX INFO: renamed from: z */
    public boolean f13218z;

    /* JADX INFO: renamed from: l.iff$a */
    public static /* synthetic */ class C0619a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f13219a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f13220b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f13220b = iArr;
            try {
                iArr[LayoutDesc.ComboType.Dislike_Like_SuperLike_Match.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13220b[LayoutDesc.ComboType.Like_SuperLike_Match.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13220b[LayoutDesc.ComboType.SuperLike_Match.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13220b[LayoutDesc.ComboType.Match.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13220b[LayoutDesc.ComboType.Chat_Single.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13220b[LayoutDesc.ComboType.Like_Single.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13220b[LayoutDesc.ComboType.Explore_Single.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f13219a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.Like.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13219a[ProfileButton.ProfileButtonType.Dislike.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13219a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f13219a[ProfileButton.ProfileButtonType.OneKeyMatch.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f13219a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: c */
    public View mo13303c() {
        return this.f13198f;
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo12175e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f12033b.m2923a());
        int i = C0619a.f13219a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m2927b(this.f13208p);
        }
        if (i == 2) {
            return profileButton.m2927b(this.f13201i);
        }
        if (i == 3) {
            return this.f12033b.m2923a() == LayoutDesc.ComboType.SuperLike_Match ? profileButton.m2927b(this.f13211s) : profileButton.m2927b(this.f13204l);
        }
        if (i == 4) {
            return profileButton.m2927b(this.f13213u);
        }
        if (i != 5) {
            return null;
        }
        return profileButton.m2927b(this.f13215w);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: f */
    public ProfileButton mo13304f(ProfileButton.ProfileButtonType profileButtonType, LayoutDesc.ComboType comboType) {
        if (profileButtonType != ProfileButton.ProfileButtonType.SuperLike) {
            return super.mo13304f(profileButtonType, comboType);
        }
        LayoutDesc.ComboType comboType2 = LayoutDesc.ComboType.SuperLike_Match;
        LayoutDesc layoutDesc = this.f12033b;
        return comboType == comboType2 ? new ProfileButton(profileButtonType, layoutDesc.m2923a()).m2927b(this.f13211s) : new ProfileButton(profileButtonType, layoutDesc.m2923a()).m2927b(this.f13204l);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: g */
    public View mo12176g() {
        return m15143n(LayoutInflater.from(this.f12034c), null);
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: h */
    public void mo12177h(View view) {
        super.mo12177h(view);
        this.f13212t.setTypeface(eqh0.c(3), 1);
        m14367b(this.f13208p);
        m14367b(this.f13201i);
        m14367b(this.f13204l);
        m14367b(this.f13211s);
        m14367b(this.f13215w);
        ew40.h().p();
        m15145p(vwb.f0(new String[]{"一键配对"}));
        view.post(new Runnable() { // from class: l.hff
            @Override // java.lang.Runnable
            public final void run() {
                this.f12012a.m15144o();
            }
        });
    }

    @Override // p002l.hh90
    /* JADX INFO: renamed from: j */
    public void mo12178j(LayoutDesc layoutDesc) {
        switch (C0619a.f13220b[layoutDesc.m2923a().ordinal()]) {
            case 1:
                xdl0.M(this.f13199g, true);
                xdl0.M(this.f13211s, false);
                xdl0.M(this.f13213u, true);
                xdl0.M(this.f13201i, true);
                xdl0.M(this.f13215w, false);
                break;
            case 2:
                xdl0.M(this.f13199g, true);
                xdl0.M(this.f13211s, false);
                xdl0.M(this.f13213u, true);
                xdl0.M(this.f13201i, false);
                xdl0.M(this.f13215w, false);
                break;
            case 3:
                xdl0.M(this.f13199g, false);
                xdl0.M(this.f13211s, true);
                xdl0.M(this.f13213u, true);
                xdl0.M(this.f13215w, false);
                break;
            case 4:
                xdl0.M(this.f13199g, false);
                xdl0.M(this.f13211s, false);
                xdl0.M(this.f13213u, true);
                xdl0.M(this.f13215w, false);
                break;
            case 5:
                xdl0.M(this.f13199g, false);
                xdl0.M(this.f13211s, false);
                xdl0.M(this.f13213u, false);
                xdl0.M(this.f13215w, true);
                break;
            case 6:
                xdl0.M(this.f13199g, true);
                xdl0.M(this.f13211s, false);
                xdl0.M(this.f13213u, false);
                xdl0.M(this.f13215w, false);
                xdl0.M(this.f13204l, false);
                xdl0.M(this.f13201i, false);
                xdl0.M(this.f13208p, true);
                break;
            case ExpLoopInputType.FRIEND_PURPOSE /* 7 */:
                xdl0.M(this.f13199g, false);
                xdl0.M(this.f13211s, false);
                xdl0.M(this.f13213u, false);
                xdl0.M(this.f13215w, false);
                xdl0.M(this.f13204l, false);
                xdl0.M(this.f13201i, false);
                xdl0.M(this.f13208p, false);
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    public View m15143n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jff.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m15144o() {
        if (xdl0.O0(this.f13199g) && xdl0.O0(this.f13213u) && this.f13213u.getRight() > this.f13197e.getWidth()) {
            xdl0.D0(t100.d(48.0f), new View[]{this.f13213u});
            this.f13213u.m2936Q(true);
            this.f13218z = true;
            this.f13214v.i();
            xdl0.M(this.f13214v, false);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m15145p(List<String> list) {
        if (this.f13218z) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.f(14));
        Iterator<String> it = list.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(textPaint.measureText(it.next()), fMax);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13214v.getLayoutParams();
        layoutParams.width = ((int) fMax) + t100.d(2.0f);
        this.f13214v.setLayoutParams(layoutParams);
        xdl0.M(this.f13214v, true);
        this.f13214v.i();
        this.f13214v.setTextList(list);
        this.f13214v.setOutTranslateY(0.5f);
        this.f13214v.setAnimateDirection(false);
        this.f13214v.setInOutAnimation(300L);
        this.f13214v.h();
    }
}
