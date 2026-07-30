package com.p000p1.mobile.putong.core.newui.explore.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p000p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p000p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p000p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.views.FlowTagsView;
import com.p1.mobile.putong.core.ui.profile.views.FlowView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bof;
import l.f6c0;
import l.j760;
import l.qib0;
import l.t100;
import l.u4c0;
import l.vwb;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.i0g0;
import p009l.qm4;
import p009l.xnf;
import v.VDraweeView;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExploreCardItemView extends VRelative implements qm4 {

    /* JADX INFO: renamed from: A */
    public int f176A;

    /* JADX INFO: renamed from: d */
    public ExploreCardItemView f177d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f178e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f179f;

    /* JADX INFO: renamed from: g */
    public SwipeLikeButton f180g;

    /* JADX INFO: renamed from: h */
    public SwipeLikeButton f181h;

    /* JADX INFO: renamed from: i */
    public NewPictureContainerIndicator f182i;

    /* JADX INFO: renamed from: j */
    public VLinear f183j;

    /* JADX INFO: renamed from: k */
    public View f184k;

    /* JADX INFO: renamed from: l */
    public View f185l;

    /* JADX INFO: renamed from: m */
    public View f186m;

    /* JADX INFO: renamed from: n */
    public View f187n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f188o;

    /* JADX INFO: renamed from: p */
    public TextView f189p;

    /* JADX INFO: renamed from: q */
    public TextView f190q;

    /* JADX INFO: renamed from: r */
    public TextView f191r;

    /* JADX INFO: renamed from: s */
    public TextView f192s;

    /* JADX INFO: renamed from: t */
    public FlowTagsView f193t;

    /* JADX INFO: renamed from: u */
    public VLinear f194u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f195v;

    /* JADX INFO: renamed from: w */
    public VText f196w;

    /* JADX INFO: renamed from: x */
    public TextView f197x;

    /* JADX INFO: renamed from: y */
    public HomeExploreFrag f198y;

    /* JADX INFO: renamed from: z */
    public xnf f199z;

    public ExploreCardItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: I */
    private void m296I(boolean z, float f) {
        if (z) {
            if (f > 0.0f) {
                this.f181h.m3232z(Math.min(1.0f, f * 2.0f));
                xdl0.M0(this.f181h, true);
                xdl0.M0(this.f180g, false);
                this.f181h.setPressed(true);
                this.f180g.setPressed(false);
                return;
            }
            if (f >= 0.0f) {
                xdl0.M0(this.f181h, false);
                xdl0.M0(this.f180g, false);
                this.f181h.setPressed(false);
                this.f180g.setPressed(false);
                return;
            }
            this.f180g.m3232z(-Math.max(-1.0f, f * 2.0f));
            xdl0.M0(this.f181h, false);
            xdl0.M0(this.f180g, true);
            this.f181h.setPressed(false);
            this.f180g.setPressed(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m297S(User user, View view) {
        act().startActivity(ProfileAct.n2(act(), ((DbObject) user).id, "p_tantanx_card", true));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    private void setOwnViewOutlineCorner(String str) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(xdl0.w(20.0f));
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(xdl0.w(3.0f), Color.parseColor(str));
            this.f178e.setBackground(gradientDrawable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m301B(View view) {
        bof.a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m302H(xnf xnfVar) {
        j760 j760VarY = vwb.Y("tantanx_scene_name", this.f198y.f170C);
        User user = xnfVar.f22654b;
        zvf0.A("e_tantanx_card", "p_tantanx_card", new j760[]{j760VarY, vwb.Y("tantanx_receive_uid", user != null ? ((DbObject) user).id : null)});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public final View m303L(xnf xnfVar, String str) {
        View viewInflate = getContext().inflater().inflate(f6c0.d3, (ViewGroup) null);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.Z3);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.Y3);
        if (!TextUtils.isEmpty(xnfVar.f22656d)) {
            qib0.G.L0(vDraweeViewFindViewById, xnfVar.f22656d);
        }
        vTextFindViewById.setText(str);
        m314Z(viewInflate, !TextUtils.isEmpty(xnfVar.f22658f) ? xnfVar.f22658f : "32ffffff", 6);
        return viewInflate;
    }

    /* JADX INFO: renamed from: M */
    public List<View> m304M(xnf xnfVar) {
        if (!NullChecker.a(xnfVar)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : xnfVar.f22655c) {
            if (NullChecker.a(str)) {
                arrayList.add(m303L(xnfVar, str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public final void m305O(xnf xnfVar) {
        this.f193t.setMaxLines(1);
        this.f193t.setWidthSpace(t100.d(5.0f));
        ((FlowView) this.f193t).f = false;
        List<View> listM304M = m304M(xnfVar);
        this.f193t.setTags(listM304M);
        xdl0.M(this.f193t, !vwb.J(listM304M));
    }

    /* JADX INFO: renamed from: P */
    public final void m306P() {
        this.f181h.m3229u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        this.f180g.m3229u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        this.f184k.setOnClickListener(new View.OnClickListener() { // from class: l.ynf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23155a.m307Q(view);
            }
        });
        this.f185l.setOnClickListener(new View.OnClickListener() { // from class: l.znf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23757a.m308R(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m307Q(View view) {
        m317c0();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m308R(View view) {
        m316b0();
    }

    /* JADX INFO: renamed from: T */
    public final String m309T(User user) {
        if (user.location == null) {
            return "";
        }
        String strM310V = m310V(user);
        return !TextUtils.isEmpty(strM310V) ? strM310V.toString() : "";
    }

    /* JADX INFO: renamed from: V */
    public final String m310V(User user) {
        if (user == null) {
            return "";
        }
        return (CoreModule.c.E0.B3(user) ? "" : i0g0.m16124W(user.location)).toString();
    }

    /* JADX INFO: renamed from: W */
    public final void m311W(Media media) {
        if (NullChecker.a(media)) {
            if (media instanceof Picture) {
                if (TextUtils.isEmpty(((Media) ((Picture) media)).url)) {
                    return;
                }
                qib0.G.x0(media.url);
            } else if (media instanceof Video) {
                Video video = (Video) media;
                if (TextUtils.isEmpty(((Media) video.cover).url)) {
                    return;
                }
                qib0.G.x0(((Media) video.cover).url);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m312X(HomeExploreFrag homeExploreFrag, xnf xnfVar) {
        final User user;
        xnf xnfVar2 = this.f199z;
        if ((xnfVar2 != null && TextUtils.equals(((DbObject) xnfVar2.f22654b).id, ((DbObject) xnfVar.f22654b).id)) || xnfVar == null || (user = xnfVar.f22654b) == null) {
            return;
        }
        this.f198y = homeExploreFrag;
        this.f199z = xnfVar;
        xdl0.M(this.f182i, false);
        m314Z(this.f179f, xnfVar.f22657e, 18);
        if (!vwb.J(xnfVar.f22654b.pictures)) {
            this.f182i.setIndicatorCount(user.pictures.size());
            xdl0.M(this.f182i, user.pictures.size() > 1);
            m315a0(0, false);
            if (user.pictures.size() > 1) {
                m311W((Media) xnfVar.f22654b.pictures.get(1));
            }
        }
        xdl0.E0(this.f186m, new View.OnClickListener() { // from class: l.aof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9588a.m297S(user, view);
            }
        });
        xdl0.k(this.f191r, TEnum.equals(user.gender, "female") ? act().drawable(x2c0.A7) : act().drawable(x2c0.C7));
        this.f191r.setBackgroundResource(TEnum.equals(user.gender, "female") ? x2c0.E7 : x2c0.F7);
        TextView textView = this.f191r;
        String str = "";
        if (!CoreModule.c.E0.z3(user)) {
            str = user.age + "";
        }
        xdl0.H0(textView, str);
        xdl0.H0(this.f189p, user.name);
        xdl0.M(this.f190q, !CoreModule.c.E0.B3(user));
        xdl0.H0(this.f190q, m309T(user));
        xdl0.H0(this.f192s, i0g0.m16137j0(user.profile.zodiac));
        if (!TextUtils.isEmpty(xnfVar.f22657e) && !xnfVar.f22657e.startsWith("#")) {
            setOwnViewOutlineCorner("#" + xnfVar.f22657e);
        }
        m305O(xnfVar);
    }

    /* JADX INFO: renamed from: Y */
    public final void m313Y(int i) {
        if (vwb.J(this.f199z.f22654b.pictures) || this.f199z.f22654b.pictures.size() <= i) {
            return;
        }
        Picture picture = (Media) this.f199z.f22654b.pictures.get(i);
        if (picture instanceof Picture) {
            Picture picture2 = picture;
            if (TEnum.equals(((Media) picture2).status, "raw") || TextUtils.isEmpty(((Media) picture2).url)) {
                return;
            }
            qib0.G.L0(this.f179f, ((Media) picture2).url);
            return;
        }
        if (picture instanceof Video) {
            Video video = (Video) picture;
            if (TextUtils.isEmpty(((Media) video.cover).url)) {
                return;
            }
            qib0.G.L0(this.f179f, ((Media) video.cover).url);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m314Z(View view, String str, int i) {
        try {
            if (!TextUtils.isEmpty(str) && !str.startsWith("#")) {
                str = "#".concat(str);
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(xdl0.w(i));
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor(str));
            view.setBackground(gradientDrawable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m315a0(int i, boolean z) {
        List list = this.f199z.f22654b.pictures;
        if (list == null || vwb.J(list) || i < 0 || i > this.f199z.f22654b.pictures.size() - 1) {
            this.f176A = 0;
            NewPictureContainerIndicator newPictureContainerIndicator = this.f182i;
            if (z) {
                newPictureContainerIndicator.m922b(0);
                return;
            } else {
                newPictureContainerIndicator.setSelectedIndex(0);
                return;
            }
        }
        this.f176A = i;
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f182i;
        if (z) {
            newPictureContainerIndicator2.m922b(i);
        } else {
            newPictureContainerIndicator2.setSelectedIndex(i);
        }
        m313Y(this.f176A);
    }

    /* JADX INFO: renamed from: b0 */
    public void m316b0() {
        int size = this.f176A + 1;
        if (size > this.f199z.f22654b.pictures.size() - 1) {
            size = this.f199z.f22654b.pictures.size() - 1;
        }
        if (vwb.J(this.f199z.f22654b.pictures) || this.f176A == size) {
            return;
        }
        m313Y(size);
        m315a0(size, true);
        int i = size + 1;
        if (i < this.f199z.f22654b.pictures.size()) {
            m311W((Media) this.f199z.f22654b.pictures.get(i));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m317c0() {
        int i = this.f176A - 1;
        if (i < 0) {
            i = 0;
        }
        if (vwb.J(this.f199z.f22654b.pictures) || this.f176A == i || i > this.f199z.f22654b.pictures.size() - 1) {
            return;
        }
        m313Y(i);
        m315a0(i, true);
        int i2 = i - 1;
        if (i2 >= 0) {
            m311W((Media) this.f199z.f22654b.pictures.get(i2));
        }
    }

    @Override // p009l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo294d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        m296I(z, f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m301B(this);
        m306P();
    }

    public ExploreCardItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExploreCardItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
