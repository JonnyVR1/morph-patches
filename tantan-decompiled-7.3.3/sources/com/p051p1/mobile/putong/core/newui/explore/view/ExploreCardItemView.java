package com.p051p1.mobile.putong.core.newui.explore.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p051p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.adc0;
import p153l.bnl0;
import p153l.dbc0;
import p153l.epf;
import p153l.i4g0;
import p153l.ipf;
import p153l.jyb;
import p153l.kec0;
import p153l.pf60;
import p153l.pn4;
import p153l.q8g0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class ExploreCardItemView extends VRelative implements pn4 {

    /* JADX INFO: renamed from: A */
    public int f22140A;

    /* JADX INFO: renamed from: d */
    public ExploreCardItemView f22141d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f22142e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f22143f;

    /* JADX INFO: renamed from: g */
    public SwipeLikeButton f22144g;

    /* JADX INFO: renamed from: h */
    public SwipeLikeButton f22145h;

    /* JADX INFO: renamed from: i */
    public NewPictureContainerIndicator f22146i;

    /* JADX INFO: renamed from: j */
    public VLinear f22147j;

    /* JADX INFO: renamed from: k */
    public View f22148k;

    /* JADX INFO: renamed from: l */
    public View f22149l;

    /* JADX INFO: renamed from: m */
    public View f22150m;

    /* JADX INFO: renamed from: n */
    public View f22151n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f22152o;

    /* JADX INFO: renamed from: p */
    public TextView f22153p;

    /* JADX INFO: renamed from: q */
    public TextView f22154q;

    /* JADX INFO: renamed from: r */
    public TextView f22155r;

    /* JADX INFO: renamed from: s */
    public TextView f22156s;

    /* JADX INFO: renamed from: t */
    public FlowTagsView f22157t;

    /* JADX INFO: renamed from: u */
    public VLinear f22158u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f22159v;

    /* JADX INFO: renamed from: w */
    public VText f22160w;

    /* JADX INFO: renamed from: x */
    public TextView f22161x;

    /* JADX INFO: renamed from: y */
    public HomeExploreFrag f22162y;

    /* JADX INFO: renamed from: z */
    public epf f22163z;

    public ExploreCardItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: I */
    private void m37370I(boolean z, float f) {
        if (z) {
            if (f > 0.0f) {
                this.f22145h.m40217z(Math.min(1.0f, f * 2.0f));
                bnl0.m105525M0(this.f22145h, true);
                bnl0.m105525M0(this.f22144g, false);
                this.f22145h.setPressed(true);
                this.f22144g.setPressed(false);
                return;
            }
            if (f >= 0.0f) {
                bnl0.m105525M0(this.f22145h, false);
                bnl0.m105525M0(this.f22144g, false);
                this.f22145h.setPressed(false);
                this.f22144g.setPressed(false);
                return;
            }
            this.f22144g.m40217z(-Math.max(-1.0f, f * 2.0f));
            bnl0.m105525M0(this.f22145h, false);
            bnl0.m105525M0(this.f22144g, true);
            this.f22145h.setPressed(false);
            this.f22144g.setPressed(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m37371S(User user, View view) {
        act().startActivity(ProfileAct.m51920o2(act(), user.f56859id, "p_tantanx_card", true));
    }

    private Act act() {
        return (Act) getContext();
    }

    private void setOwnViewOutlineCorner(String str) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(bnl0.m105587w(20.0f));
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(bnl0.m105587w(3.0f), Color.parseColor(str));
            this.f22142e.setBackground(gradientDrawable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m37375B(View view) {
        ipf.m141453a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m37376H(epf epfVar) {
        pf60 pf60VarM147494Y = jyb.m147494Y("tantanx_scene_name", this.f22162y.f22134C);
        User user = epfVar.f95241b;
        i4g0.m138492A("e_tantanx_card", "p_tantanx_card", pf60VarM147494Y, jyb.m147494Y("tantanx_receive_uid", user != null ? user.f56859id : null));
    }

    /* JADX INFO: renamed from: L */
    public final View m37377L(epf epfVar, String str) {
        View viewInflate = ((PutongAct) getContext()).inflater().inflate(kec0.f125791d3, (ViewGroup) null);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70264b4);
        VText vText = (VText) viewInflate.findViewById(adc0.f70247a4);
        if (!TextUtils.isEmpty(epfVar.f95243d)) {
            uqb0.f180374G.m127115L0(vDraweeView, epfVar.f95243d);
        }
        vText.setText(str);
        m37388Z(viewInflate, !TextUtils.isEmpty(epfVar.f95245f) ? epfVar.f95245f : "32ffffff", 6);
        return viewInflate;
    }

    /* JADX INFO: renamed from: M */
    public List<View> m37378M(epf epfVar) {
        if (!NullChecker.m82486a(epfVar)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : epfVar.f95242c) {
            if (NullChecker.m82486a(str)) {
                arrayList.add(m37377L(epfVar, str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public final void m37379O(epf epfVar) {
        this.f22157t.setMaxLines(1);
        this.f22157t.setWidthSpace(qa00.m175859d(5.0f));
        this.f22157t.f34968f = false;
        List<View> listM37378M = m37378M(epfVar);
        this.f22157t.setTags(listM37378M);
        bnl0.m105524M(this.f22157t, !jyb.m147479J(listM37378M));
    }

    /* JADX INFO: renamed from: P */
    public final void m37380P() {
        this.f22145h.m40214u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        this.f22144g.m40214u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        this.f22148k.setOnClickListener(new View.OnClickListener() { // from class: l.fpf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100127a.m37381Q(view);
            }
        });
        this.f22149l.setOnClickListener(new View.OnClickListener() { // from class: l.gpf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105461a.m37382R(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m37381Q(View view) {
        m37391c0();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m37382R(View view) {
        m37390b0();
    }

    /* JADX INFO: renamed from: T */
    public final String m37383T(User user) {
        if (user.location == null) {
            return "";
        }
        String strM37384V = m37384V(user);
        return !TextUtils.isEmpty(strM37384V) ? strM37384V.toString() : "";
    }

    /* JADX INFO: renamed from: V */
    public final String m37384V(User user) {
        if (user == null) {
            return "";
        }
        return (CoreModule.f18264c.f20303E0.m141060B3(user) ? "" : q8g0.m175791W(user.location)).toString();
    }

    /* JADX INFO: renamed from: W */
    public final void m37385W(Media media) {
        if (NullChecker.m82486a(media)) {
            if (media instanceof Picture) {
                if (TextUtils.isEmpty(((Picture) media).url)) {
                    return;
                }
                uqb0.f180374G.m127160x0(media.url);
            } else if (media instanceof Video) {
                Video video = (Video) media;
                if (TextUtils.isEmpty(video.cover.url)) {
                    return;
                }
                uqb0.f180374G.m127160x0(video.cover.url);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m37386X(HomeExploreFrag homeExploreFrag, epf epfVar) {
        final User user;
        epf epfVar2 = this.f22163z;
        if ((epfVar2 != null && TextUtils.equals(epfVar2.f95241b.f56859id, epfVar.f95241b.f56859id)) || epfVar == null || (user = epfVar.f95241b) == null) {
            return;
        }
        this.f22162y = homeExploreFrag;
        this.f22163z = epfVar;
        bnl0.m105524M(this.f22146i, false);
        m37388Z(this.f22143f, epfVar.f95244e, 18);
        if (!jyb.m147479J(epfVar.f95241b.pictures)) {
            this.f22146i.setIndicatorCount(user.pictures.size());
            bnl0.m105524M(this.f22146i, user.pictures.size() > 1);
            m37389a0(0, false);
            if (user.pictures.size() > 1) {
                m37385W(epfVar.f95241b.pictures.get(1));
            }
        }
        bnl0.m105509E0(this.f22150m, new View.OnClickListener() { // from class: l.hpf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111021a.m37371S(user, view);
            }
        });
        bnl0.m105563k(this.f22155r, TEnum.equals(user.gender, "female") ? act().drawable(dbc0.f86016B7) : act().drawable(dbc0.f86080D7));
        this.f22155r.setBackgroundResource(TEnum.equals(user.gender, "female") ? dbc0.f86144F7 : dbc0.f86176G7);
        TextView textView = this.f22155r;
        String str = "";
        if (!CoreModule.f18264c.f20303E0.m141091z3(user)) {
            str = user.age + "";
        }
        bnl0.m105515H0(textView, str);
        bnl0.m105515H0(this.f22153p, user.name);
        bnl0.m105524M(this.f22154q, !CoreModule.f18264c.f20303E0.m141060B3(user));
        bnl0.m105515H0(this.f22154q, m37383T(user));
        bnl0.m105515H0(this.f22156s, q8g0.m175804j0(user.profile.zodiac));
        if (!TextUtils.isEmpty(epfVar.f95244e) && !epfVar.f95244e.startsWith("#")) {
            setOwnViewOutlineCorner("#" + epfVar.f95244e);
        }
        m37379O(epfVar);
    }

    /* JADX INFO: renamed from: Y */
    public final void m37387Y(int i) {
        if (jyb.m147479J(this.f22163z.f95241b.pictures) || this.f22163z.f95241b.pictures.size() <= i) {
            return;
        }
        Media media = this.f22163z.f95241b.pictures.get(i);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            if (TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
                return;
            }
            uqb0.f180374G.m127115L0(this.f22143f, picture.url);
            return;
        }
        if (media instanceof Video) {
            Video video = (Video) media;
            if (TextUtils.isEmpty(video.cover.url)) {
                return;
            }
            uqb0.f180374G.m127115L0(this.f22143f, video.cover.url);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m37388Z(View view, String str, int i) {
        try {
            if (!TextUtils.isEmpty(str) && !str.startsWith("#")) {
                str = "#".concat(str);
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(bnl0.m105587w(i));
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor(str));
            view.setBackground(gradientDrawable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m37389a0(int i, boolean z) {
        List<Media> list = this.f22163z.f95241b.pictures;
        if (list == null || jyb.m147479J(list) || i < 0 || i > this.f22163z.f95241b.pictures.size() - 1) {
            this.f22140A = 0;
            NewPictureContainerIndicator newPictureContainerIndicator = this.f22146i;
            if (z) {
                newPictureContainerIndicator.m37958b(0);
                return;
            } else {
                newPictureContainerIndicator.setSelectedIndex(0);
                return;
            }
        }
        this.f22140A = i;
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f22146i;
        if (z) {
            newPictureContainerIndicator2.m37958b(i);
        } else {
            newPictureContainerIndicator2.setSelectedIndex(i);
        }
        m37387Y(this.f22140A);
    }

    /* JADX INFO: renamed from: b0 */
    public void m37390b0() {
        int size = this.f22140A + 1;
        if (size > this.f22163z.f95241b.pictures.size() - 1) {
            size = this.f22163z.f95241b.pictures.size() - 1;
        }
        if (jyb.m147479J(this.f22163z.f95241b.pictures) || this.f22140A == size) {
            return;
        }
        m37387Y(size);
        m37389a0(size, true);
        int i = size + 1;
        if (i < this.f22163z.f95241b.pictures.size()) {
            m37385W(this.f22163z.f95241b.pictures.get(i));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m37391c0() {
        int i = this.f22140A - 1;
        if (i < 0) {
            i = 0;
        }
        if (jyb.m147479J(this.f22163z.f95241b.pictures) || this.f22140A == i || i > this.f22163z.f95241b.pictures.size() - 1) {
            return;
        }
        m37387Y(i);
        m37389a0(i, true);
        int i2 = i - 1;
        if (i2 >= 0) {
            m37385W(this.f22163z.f95241b.pictures.get(i2));
        }
    }

    @Override // p153l.pn4
    /* JADX INFO: renamed from: d0 */
    public void mo37368d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        m37370I(z, f3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37375B(this);
        m37380P();
    }

    public ExploreCardItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExploreCardItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
