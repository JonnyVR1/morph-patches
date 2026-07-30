package p149l;

import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.layout.expanded.view.ExpProfileOpButtonLinearRoot;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.layout.expanded.view.ExpProfileOpButtonRoot;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.LetterRemainingSwitcherView;
import java.util.Iterator;
import java.util.List;
import p147v.VFrame_FlipContainer;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class iff extends hh90 {

    /* JADX INFO: renamed from: e */
    public FrameLayout f112991e;

    /* JADX INFO: renamed from: f */
    public View f112992f;

    /* JADX INFO: renamed from: g */
    public RelativeLayout f112993g;

    /* JADX INFO: renamed from: h */
    public VLinear f112994h;

    /* JADX INFO: renamed from: i */
    public ExpProfileOpButtonRoot f112995i;

    /* JADX INFO: renamed from: j */
    public RelativeLayout f112996j;

    /* JADX INFO: renamed from: k */
    public VImage f112997k;

    /* JADX INFO: renamed from: l */
    public ExpProfileOpButtonRoot f112998l;

    /* JADX INFO: renamed from: m */
    public VFrame_FlipContainer f112999m;

    /* JADX INFO: renamed from: n */
    public VImage f113000n;

    /* JADX INFO: renamed from: o */
    public VText f113001o;

    /* JADX INFO: renamed from: p */
    public ExpProfileOpButtonRoot f113002p;

    /* JADX INFO: renamed from: q */
    public RelativeLayout f113003q;

    /* JADX INFO: renamed from: r */
    public VImage f113004r;

    /* JADX INFO: renamed from: s */
    public ExpProfileOpButtonRoot f113005s;

    /* JADX INFO: renamed from: t */
    public VText f113006t;

    /* JADX INFO: renamed from: u */
    public ExpProfileOpButtonLinearRoot f113007u;

    /* JADX INFO: renamed from: v */
    public LetterRemainingSwitcherView f113008v;

    /* JADX INFO: renamed from: w */
    public ExpProfileOpButtonRoot f113009w;

    /* JADX INFO: renamed from: x */
    public RelativeLayout f113010x;

    /* JADX INFO: renamed from: y */
    public VImage f113011y;

    /* JADX INFO: renamed from: z */
    public boolean f113012z;

    /* JADX INFO: renamed from: l.iff$a */
    public static /* synthetic */ class C17539a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f113013a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f113014b;

        static {
            int[] iArr = new int[LayoutDesc.ComboType.values().length];
            f113014b = iArr;
            try {
                iArr[LayoutDesc.ComboType.Dislike_Like_SuperLike_Match.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f113014b[LayoutDesc.ComboType.Like_SuperLike_Match.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f113014b[LayoutDesc.ComboType.SuperLike_Match.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f113014b[LayoutDesc.ComboType.Match.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f113014b[LayoutDesc.ComboType.Chat_Single.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f113014b[LayoutDesc.ComboType.Like_Single.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f113014b[LayoutDesc.ComboType.Explore_Single.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[ProfileButton.ProfileButtonType.values().length];
            f113013a = iArr2;
            try {
                iArr2[ProfileButton.ProfileButtonType.Like.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f113013a[ProfileButton.ProfileButtonType.Dislike.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f113013a[ProfileButton.ProfileButtonType.SuperLike.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f113013a[ProfileButton.ProfileButtonType.OneKeyMatch.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f113013a[ProfileButton.ProfileButtonType.Chat.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: c */
    public View mo122154c() {
        return this.f112992f;
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: e */
    public ProfileButton mo114662e(ProfileButton.ProfileButtonType profileButtonType) {
        ProfileButton profileButton = new ProfileButton(profileButtonType, this.f107690b.m52389a());
        int i = C17539a.f113013a[profileButtonType.ordinal()];
        if (i == 1) {
            return profileButton.m52393b(this.f113002p);
        }
        if (i == 2) {
            return profileButton.m52393b(this.f112995i);
        }
        if (i == 3) {
            return this.f107690b.m52389a() == LayoutDesc.ComboType.SuperLike_Match ? profileButton.m52393b(this.f113005s) : profileButton.m52393b(this.f112998l);
        }
        if (i == 4) {
            return profileButton.m52393b(this.f113007u);
        }
        if (i != 5) {
            return null;
        }
        return profileButton.m52393b(this.f113009w);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: f */
    public ProfileButton mo122155f(ProfileButton.ProfileButtonType profileButtonType, LayoutDesc.ComboType comboType) {
        if (profileButtonType != ProfileButton.ProfileButtonType.SuperLike) {
            return super.mo122155f(profileButtonType, comboType);
        }
        LayoutDesc.ComboType comboType2 = LayoutDesc.ComboType.SuperLike_Match;
        LayoutDesc layoutDesc = this.f107690b;
        return comboType == comboType2 ? new ProfileButton(profileButtonType, layoutDesc.m52389a()).m52393b(this.f113005s) : new ProfileButton(profileButtonType, layoutDesc.m52389a()).m52393b(this.f112998l);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: g */
    public View mo114663g() {
        return m135918n(LayoutInflater.from(this.f107691c), null);
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: h */
    public void mo114664h(View view) {
        super.mo114664h(view);
        this.f113006t.setTypeface(eqh0.m117752c(3), 1);
        m130941b(this.f113002p);
        m130941b(this.f112995i);
        m130941b(this.f112998l);
        m130941b(this.f113005s);
        m130941b(this.f113009w);
        ew40.m118397h().m118412p();
        m135920p(vwb.m200324f0("一键配对"));
        view.post(new Runnable() { // from class: l.hff
            @Override // java.lang.Runnable
            public final void run() {
                this.f107471a.m135919o();
            }
        });
    }

    @Override // p149l.hh90
    /* JADX INFO: renamed from: j */
    public void mo114665j(LayoutDesc layoutDesc) {
        switch (C17539a.f113014b[layoutDesc.m52389a().ordinal()]) {
            case 1:
                xdl0.m208344M(this.f112993g, true);
                xdl0.m208344M(this.f113005s, false);
                xdl0.m208344M(this.f113007u, true);
                xdl0.m208344M(this.f112995i, true);
                xdl0.m208344M(this.f113009w, false);
                break;
            case 2:
                xdl0.m208344M(this.f112993g, true);
                xdl0.m208344M(this.f113005s, false);
                xdl0.m208344M(this.f113007u, true);
                xdl0.m208344M(this.f112995i, false);
                xdl0.m208344M(this.f113009w, false);
                break;
            case 3:
                xdl0.m208344M(this.f112993g, false);
                xdl0.m208344M(this.f113005s, true);
                xdl0.m208344M(this.f113007u, true);
                xdl0.m208344M(this.f113009w, false);
                break;
            case 4:
                xdl0.m208344M(this.f112993g, false);
                xdl0.m208344M(this.f113005s, false);
                xdl0.m208344M(this.f113007u, true);
                xdl0.m208344M(this.f113009w, false);
                break;
            case 5:
                xdl0.m208344M(this.f112993g, false);
                xdl0.m208344M(this.f113005s, false);
                xdl0.m208344M(this.f113007u, false);
                xdl0.m208344M(this.f113009w, true);
                break;
            case 6:
                xdl0.m208344M(this.f112993g, true);
                xdl0.m208344M(this.f113005s, false);
                xdl0.m208344M(this.f113007u, false);
                xdl0.m208344M(this.f113009w, false);
                xdl0.m208344M(this.f112998l, false);
                xdl0.m208344M(this.f112995i, false);
                xdl0.m208344M(this.f113002p, true);
                break;
            case 7:
                xdl0.m208344M(this.f112993g, false);
                xdl0.m208344M(this.f113005s, false);
                xdl0.m208344M(this.f113007u, false);
                xdl0.m208344M(this.f113009w, false);
                xdl0.m208344M(this.f112998l, false);
                xdl0.m208344M(this.f112995i, false);
                xdl0.m208344M(this.f113002p, false);
                break;
        }
    }

    /* JADX INFO: renamed from: n */
    public View m135918n(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jff.m141178b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m135919o() {
        if (xdl0.m208349O0(this.f112993g) && xdl0.m208349O0(this.f113007u) && this.f113007u.getRight() > this.f112991e.getWidth()) {
            xdl0.m208327D0(t100.m186890d(48.0f), this.f113007u);
            this.f113007u.m52402Q(true);
            this.f113012z = true;
            this.f113008v.m57726i();
            xdl0.m208344M(this.f113008v, false);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m135920p(List<String> list) {
        if (this.f113012z) {
            return;
        }
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(t100.m186892f(14));
        Iterator<String> it = list.iterator();
        float fMax = 0.0f;
        while (it.hasNext()) {
            fMax = Math.max(textPaint.measureText(it.next()), fMax);
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f113008v.getLayoutParams();
        layoutParams.width = ((int) fMax) + t100.m186890d(2.0f);
        this.f113008v.setLayoutParams(layoutParams);
        xdl0.m208344M(this.f113008v, true);
        this.f113008v.m57726i();
        this.f113008v.setTextList(list);
        this.f113008v.setOutTranslateY(0.5f);
        this.f113008v.setAnimateDirection(false);
        this.f113008v.setInOutAnimation(300L);
        this.f113008v.m57725h();
    }
}
