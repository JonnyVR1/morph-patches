package com.p046p1.mobile.putong.core.newui.explore.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.explore.HomeExploreFrag;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.home.opt.CardProgressAction;
import com.p046p1.mobile.putong.core.newui.home.views.SwipeLikeButton;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.bof;
import p149l.f6c0;
import p149l.i0g0;
import p149l.j760;
import p149l.qib0;
import p149l.qm4;
import p149l.t100;
import p149l.u4c0;
import p149l.vwb;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xnf;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ExploreCardItemView extends VRelative implements qm4 {

    /* JADX INFO: renamed from: A */
    public int f21398A;

    /* JADX INFO: renamed from: d */
    public ExploreCardItemView f21399d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f21400e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f21401f;

    /* JADX INFO: renamed from: g */
    public SwipeLikeButton f21402g;

    /* JADX INFO: renamed from: h */
    public SwipeLikeButton f21403h;

    /* JADX INFO: renamed from: i */
    public NewPictureContainerIndicator f21404i;

    /* JADX INFO: renamed from: j */
    public VLinear f21405j;

    /* JADX INFO: renamed from: k */
    public View f21406k;

    /* JADX INFO: renamed from: l */
    public View f21407l;

    /* JADX INFO: renamed from: m */
    public View f21408m;

    /* JADX INFO: renamed from: n */
    public View f21409n;

    /* JADX INFO: renamed from: o */
    public RelativeLayout f21410o;

    /* JADX INFO: renamed from: p */
    public TextView f21411p;

    /* JADX INFO: renamed from: q */
    public TextView f21412q;

    /* JADX INFO: renamed from: r */
    public TextView f21413r;

    /* JADX INFO: renamed from: s */
    public TextView f21414s;

    /* JADX INFO: renamed from: t */
    public FlowTagsView f21415t;

    /* JADX INFO: renamed from: u */
    public VLinear f21416u;

    /* JADX INFO: renamed from: v */
    public VDraweeView f21417v;

    /* JADX INFO: renamed from: w */
    public VText f21418w;

    /* JADX INFO: renamed from: x */
    public TextView f21419x;

    /* JADX INFO: renamed from: y */
    public HomeExploreFrag f21420y;

    /* JADX INFO: renamed from: z */
    public xnf f21421z;

    public ExploreCardItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: I */
    private void m36367I(boolean z, float f) {
        if (z) {
            if (f > 0.0f) {
                this.f21403h.m39214z(Math.min(1.0f, f * 2.0f));
                xdl0.m208345M0(this.f21403h, true);
                xdl0.m208345M0(this.f21402g, false);
                this.f21403h.setPressed(true);
                this.f21402g.setPressed(false);
                return;
            }
            if (f >= 0.0f) {
                xdl0.m208345M0(this.f21403h, false);
                xdl0.m208345M0(this.f21402g, false);
                this.f21403h.setPressed(false);
                this.f21402g.setPressed(false);
                return;
            }
            this.f21402g.m39214z(-Math.max(-1.0f, f * 2.0f));
            xdl0.m208345M0(this.f21403h, false);
            xdl0.m208345M0(this.f21402g, true);
            this.f21403h.setPressed(false);
            this.f21402g.setPressed(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m36368S(User user, View view) {
        act().startActivity(ProfileAct.m50736n2(act(), user.f56011id, "p_tantanx_card", true));
    }

    private Act act() {
        return (Act) getContext();
    }

    private void setOwnViewOutlineCorner(String str) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(xdl0.m208407w(20.0f));
            gradientDrawable.setShape(0);
            gradientDrawable.setStroke(xdl0.m208407w(3.0f), Color.parseColor(str));
            this.f21400e.setBackground(gradientDrawable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: B */
    public final void m36372B(View view) {
        bof.m102943a(this, view);
    }

    /* JADX INFO: renamed from: H */
    public void m36373H(xnf xnfVar) {
        j760 j760VarM200311Y = vwb.m200311Y("tantanx_scene_name", this.f21420y.f21392C);
        User user = xnfVar.f193672b;
        zvf0.m220368A("e_tantanx_card", "p_tantanx_card", j760VarM200311Y, vwb.m200311Y("tantanx_receive_uid", user != null ? user.f56011id : null));
    }

    /* JADX INFO: renamed from: L */
    public final View m36374L(xnf xnfVar, String str) {
        View viewInflate = ((PutongAct) getContext()).inflater().inflate(f6c0.f95737d3, (ViewGroup) null);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f174139Z3);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174123Y3);
        if (!TextUtils.isEmpty(xnfVar.f193674d)) {
            qib0.f154691G.m102331L0(vDraweeView, xnfVar.f193674d);
        }
        vText.setText(str);
        m36385Z(viewInflate, !TextUtils.isEmpty(xnfVar.f193676f) ? xnfVar.f193676f : "32ffffff", 6);
        return viewInflate;
    }

    /* JADX INFO: renamed from: M */
    public List<View> m36375M(xnf xnfVar) {
        if (!NullChecker.m81303a(xnfVar)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : xnfVar.f193673c) {
            if (NullChecker.m81303a(str)) {
                arrayList.add(m36374L(xnfVar, str));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O */
    public final void m36376O(xnf xnfVar) {
        this.f21415t.setMaxLines(1);
        this.f21415t.setWidthSpace(t100.m186890d(5.0f));
        this.f21415t.f34120f = false;
        List<View> listM36375M = m36375M(xnfVar);
        this.f21415t.setTags(listM36375M);
        xdl0.m208344M(this.f21415t, !vwb.m200296J(listM36375M));
    }

    /* JADX INFO: renamed from: P */
    public final void m36377P() {
        this.f21403h.m39211u("https://auto.tancdn.com/v1/raw/a982f15f-30aa-47be-9b7e-50ec88482f5311.so");
        this.f21402g.m39211u("https://auto.tancdn.com/v1/raw/da3d1a53-b937-41f8-883c-c16c842ca35e11.so");
        this.f21406k.setOnClickListener(new View.OnClickListener() { // from class: l.ynf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199155a.m36378Q(view);
            }
        });
        this.f21407l.setOnClickListener(new View.OnClickListener() { // from class: l.znf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203979a.m36379R(view);
            }
        });
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m36378Q(View view) {
        m36388c0();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m36379R(View view) {
        m36387b0();
    }

    /* JADX INFO: renamed from: T */
    public final String m36380T(User user) {
        if (user.location == null) {
            return "";
        }
        String strM36381V = m36381V(user);
        return !TextUtils.isEmpty(strM36381V) ? strM36381V.toString() : "";
    }

    /* JADX INFO: renamed from: V */
    public final String m36381V(User user) {
        if (user == null) {
            return "";
        }
        return (CoreModule.f17545c.f19561E0.m203772B3(user) ? "" : i0g0.m133856W(user.location)).toString();
    }

    /* JADX INFO: renamed from: W */
    public final void m36382W(Media media) {
        if (NullChecker.m81303a(media)) {
            if (media instanceof Picture) {
                if (TextUtils.isEmpty(((Picture) media).url)) {
                    return;
                }
                qib0.f154691G.m102377x0(media.url);
            } else if (media instanceof Video) {
                Video video = (Video) media;
                if (TextUtils.isEmpty(video.cover.url)) {
                    return;
                }
                qib0.f154691G.m102377x0(video.cover.url);
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m36383X(HomeExploreFrag homeExploreFrag, xnf xnfVar) {
        final User user;
        xnf xnfVar2 = this.f21421z;
        if ((xnfVar2 != null && TextUtils.equals(xnfVar2.f193672b.f56011id, xnfVar.f193672b.f56011id)) || xnfVar == null || (user = xnfVar.f193672b) == null) {
            return;
        }
        this.f21420y = homeExploreFrag;
        this.f21421z = xnfVar;
        xdl0.m208344M(this.f21404i, false);
        m36385Z(this.f21401f, xnfVar.f193675e, 18);
        if (!vwb.m200296J(xnfVar.f193672b.pictures)) {
            this.f21404i.setIndicatorCount(user.pictures.size());
            xdl0.m208344M(this.f21404i, user.pictures.size() > 1);
            m36386a0(0, false);
            if (user.pictures.size() > 1) {
                m36382W(xnfVar.f193672b.pictures.get(1));
            }
        }
        xdl0.m208329E0(this.f21408m, new View.OnClickListener() { // from class: l.aof
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70857a.m36368S(user, view);
            }
        });
        xdl0.m208383k(this.f21413r, TEnum.equals(user.gender, "female") ? act().drawable(x2c0.f189161A7) : act().drawable(x2c0.f189225C7));
        this.f21413r.setBackgroundResource(TEnum.equals(user.gender, "female") ? x2c0.f189289E7 : x2c0.f189321F7);
        TextView textView = this.f21413r;
        String str = "";
        if (!CoreModule.f17545c.f19561E0.m203803z3(user)) {
            str = user.age + "";
        }
        xdl0.m208335H0(textView, str);
        xdl0.m208335H0(this.f21411p, user.name);
        xdl0.m208344M(this.f21412q, !CoreModule.f17545c.f19561E0.m203772B3(user));
        xdl0.m208335H0(this.f21412q, m36380T(user));
        xdl0.m208335H0(this.f21414s, i0g0.m133869j0(user.profile.zodiac));
        if (!TextUtils.isEmpty(xnfVar.f193675e) && !xnfVar.f193675e.startsWith("#")) {
            setOwnViewOutlineCorner("#" + xnfVar.f193675e);
        }
        m36376O(xnfVar);
    }

    /* JADX INFO: renamed from: Y */
    public final void m36384Y(int i) {
        if (vwb.m200296J(this.f21421z.f193672b.pictures) || this.f21421z.f193672b.pictures.size() <= i) {
            return;
        }
        Media media = this.f21421z.f193672b.pictures.get(i);
        if (media instanceof Picture) {
            Picture picture = (Picture) media;
            if (TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
                return;
            }
            qib0.f154691G.m102331L0(this.f21401f, picture.url);
            return;
        }
        if (media instanceof Video) {
            Video video = (Video) media;
            if (TextUtils.isEmpty(video.cover.url)) {
                return;
            }
            qib0.f154691G.m102331L0(this.f21401f, video.cover.url);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m36385Z(View view, String str, int i) {
        try {
            if (!TextUtils.isEmpty(str) && !str.startsWith("#")) {
                str = "#".concat(str);
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(xdl0.m208407w(i));
            gradientDrawable.setShape(0);
            gradientDrawable.setColor(Color.parseColor(str));
            view.setBackground(gradientDrawable);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m36386a0(int i, boolean z) {
        List<Media> list = this.f21421z.f193672b.pictures;
        if (list == null || vwb.m200296J(list) || i < 0 || i > this.f21421z.f193672b.pictures.size() - 1) {
            this.f21398A = 0;
            NewPictureContainerIndicator newPictureContainerIndicator = this.f21404i;
            if (z) {
                newPictureContainerIndicator.m36955b(0);
                return;
            } else {
                newPictureContainerIndicator.setSelectedIndex(0);
                return;
            }
        }
        this.f21398A = i;
        NewPictureContainerIndicator newPictureContainerIndicator2 = this.f21404i;
        if (z) {
            newPictureContainerIndicator2.m36955b(i);
        } else {
            newPictureContainerIndicator2.setSelectedIndex(i);
        }
        m36384Y(this.f21398A);
    }

    /* JADX INFO: renamed from: b0 */
    public void m36387b0() {
        int size = this.f21398A + 1;
        if (size > this.f21421z.f193672b.pictures.size() - 1) {
            size = this.f21421z.f193672b.pictures.size() - 1;
        }
        if (vwb.m200296J(this.f21421z.f193672b.pictures) || this.f21398A == size) {
            return;
        }
        m36384Y(size);
        m36386a0(size, true);
        int i = size + 1;
        if (i < this.f21421z.f193672b.pictures.size()) {
            m36382W(this.f21421z.f193672b.pictures.get(i));
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m36388c0() {
        int i = this.f21398A - 1;
        if (i < 0) {
            i = 0;
        }
        if (vwb.m200296J(this.f21421z.f193672b.pictures) || this.f21398A == i || i > this.f21421z.f193672b.pictures.size() - 1) {
            return;
        }
        m36384Y(i);
        m36386a0(i, true);
        int i2 = i - 1;
        if (i2 >= 0) {
            m36382W(this.f21421z.f193672b.pictures.get(i2));
        }
    }

    @Override // p149l.qm4
    /* JADX INFO: renamed from: d0 */
    public void mo36365d0(float f, float f2, float f3, CardProgressAction cardProgressAction) {
        if (f != 0.0f) {
            f2 = -f;
        }
        float fMin = Math.min(1.0f, Math.max(-1.0f, f2));
        boolean z = f3 == 0.0f;
        if (f3 == 0.0f) {
            f3 = fMin;
        }
        m36367I(z, f3);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36372B(this);
        m36377P();
    }

    public ExploreCardItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ExploreCardItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
