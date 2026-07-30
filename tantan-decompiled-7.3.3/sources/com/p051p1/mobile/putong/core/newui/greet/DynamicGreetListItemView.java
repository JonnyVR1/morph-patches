package com.p051p1.mobile.putong.core.newui.greet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.NotificationStatus;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetListItemView;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.data.Audio;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.eie;
import p153l.fzq;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.pf60;
import p153l.pzi0;
import p153l.qec0;
import p153l.uqb0;
import p153l.y7c0;

/* JADX INFO: loaded from: classes11.dex */
public class DynamicGreetListItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f22230a;

    /* JADX INFO: renamed from: b */
    public VLinear f22231b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f22232c;

    /* JADX INFO: renamed from: d */
    public VText f22233d;

    /* JADX INFO: renamed from: e */
    public VText f22234e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f22235f;

    /* JADX INFO: renamed from: g */
    public VImage f22236g;

    /* JADX INFO: renamed from: h */
    public VText f22237h;

    /* JADX INFO: renamed from: i */
    public VText f22238i;

    /* JADX INFO: renamed from: j */
    public VFrame f22239j;

    /* JADX INFO: renamed from: k */
    public VText f22240k;

    /* JADX INFO: renamed from: l */
    public final VDraweeView[] f22241l;

    public DynamicGreetListItemView(Context context) {
        super(context);
        this.f22241l = new VDraweeView[4];
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m37464a(fzq fzqVar, DynamicGreetListAct dynamicGreetListAct, View view) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(fzqVar.m128224p());
        if (NullChecker.m82486a(userM116503Pa)) {
            if (jyb.m147479J(userM116503Pa.pictures)) {
                return;
            }
            if (userM116503Pa.pictures.size() == 1 && TextUtils.isEmpty(userM116503Pa.picture(0).url) && (userM116503Pa.picture(0).size.width == 0 || userM116503Pa.picture(0).size.height == 0)) {
                return;
            }
        }
        dynamicGreetListAct.startActivity(CoreModule.m30933P().m143412i().mo180295A5(dynamicGreetListAct, fzqVar.m128224p(), "kankan_reply", false, false, false));
        dynamicGreetListAct.overridePendingTransition(y7c0.f197767e, 0);
        i4g0.m138523u("e_kankan_stranger_message_pic", "p_kankan_stranger_message", new pf60("user_id", fzqVar.m128224p()));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m37465b(DynamicGreetListAct dynamicGreetListAct, fzq fzqVar, View view) {
        C8523d.m47083i(dynamicGreetListAct, fzqVar.m128215b(), dynamicGreetListAct.m37459Z1() ? "meet" : NotificationStatus.undefined);
        dynamicGreetListAct.overridePendingTransition(y7c0.f197767e, y7c0.f197766d);
        i4g0.m138523u("e_kankan_stranger_message_item", "p_kankan_stranger_message", new pf60("user_id", fzqVar.m128224p()), new pf60("is_red_dot", Integer.valueOf(fzqVar.m128223o() > 0 ? 1 : 0)));
        if (dynamicGreetListAct.m37459Z1()) {
            i4g0.m138523u("e_meet_message_box_item", dynamicGreetListAct.pageId(), new pf60("user_id", fzqVar.m128224p()));
        }
        fzqVar.m128209M(0);
        dynamicGreetListAct.m37463d2().mo158501d();
    }

    /* JADX INFO: renamed from: c */
    public final void m37466c(View view) {
        eie.m120890a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public DynamicGreetListAct m37467d() {
        return (DynamicGreetListAct) getContext();
    }

    @SuppressLint({"MissingInflatedId"})
    /* JADX INFO: renamed from: e */
    public void m37468e(int i) {
        int i2 = qec0.f156818B;
        switch (i) {
            case 1:
                i2 = qec0.f156811A;
                break;
            case 2:
                i2 = qec0.f156832D;
                break;
            case 3:
                i2 = qec0.f156825C;
                break;
            case 4:
                i2 = qec0.f157162z;
                break;
            case 5:
                i2 = qec0.f156839E;
                break;
            case 6:
                i2 = qec0.f157155y;
                break;
        }
        View viewInflate = m37467d().inflater().inflate(i2, (ViewGroup) this.f22239j, false);
        this.f22240k = (VText) viewInflate.findViewById(edc0.f93168A4);
        this.f22241l[0] = (VDraweeView) viewInflate.findViewById(edc0.f93464u1);
        this.f22241l[1] = (VDraweeView) viewInflate.findViewById(edc0.f93485x1);
        this.f22241l[2] = (VDraweeView) viewInflate.findViewById(edc0.f93478w1);
        this.f22241l[3] = (VDraweeView) viewInflate.findViewById(edc0.f93450s1);
        this.f22239j.addView(viewInflate, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m37469f(final fzq fzqVar, final DynamicGreetListAct dynamicGreetListAct, int i) {
        bnl0.m105509E0(this.f22232c, new View.OnClickListener() { // from class: l.cie
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DynamicGreetListItemView.m37464a(fzqVar, dynamicGreetListAct, view);
            }
        });
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.die
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DynamicGreetListItemView.m37465b(dynamicGreetListAct, fzqVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m37470g(fzq fzqVar, int i) {
        bnl0.m105524M(this.f22239j, true);
        if (i == 0) {
            boolean zIsEmpty = TextUtils.isEmpty(fzqVar.m128217g());
            if (zIsEmpty && !m37471h(fzqVar)) {
                bnl0.m105524M(this.f22239j, false);
            }
            this.f22240k.setText(!zIsEmpty ? fzqVar.m128217g() : "动态已删除");
            bnl0.m105524M(this.f22240k, !TextUtils.isEmpty(fzqVar.m128217g()));
            return;
        }
        if (i == 6 && NullChecker.m82486a(fzqVar)) {
            this.f22240k.setText(String.format("%s''", Integer.valueOf(Math.round(((Audio) fzqVar.m128218h().get(0)).duration))));
            return;
        }
        if (i == 5) {
            i = 1;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (fzqVar == null) {
                uqb0.f180374G.m98798o(this.f22241l[i2]);
            } else {
                Media media = fzqVar.m128218h().get(i2);
                Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
                if (NullChecker.m82487b(picture)) {
                    uqb0.f180374G.m127125Q0(this.f22241l[i2], picture.momentPictureSmall());
                } else {
                    uqb0.f180374G.m98798o(this.f22241l[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m37471h(fzq fzqVar) {
        if (fzqVar == null || fzqVar.m128215b() == null || fzqVar.m128215b().moment == null) {
            return false;
        }
        return !TextUtils.isEmpty(fzqVar.m128215b().moment.f39607id);
    }

    /* JADX INFO: renamed from: i */
    public final void m37472i(int i) {
        String str;
        VText vText = this.f22233d;
        if (i <= 0) {
            vText.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        VText vText2 = this.f22233d;
        if (i > 99) {
            str = "99+";
        } else {
            str = i + "";
        }
        vText2.setText(str);
    }

    /* JADX INFO: renamed from: j */
    public void m37473j(DynamicGreetListAct dynamicGreetListAct, fzq fzqVar, int i, int i2) {
        uqb0.f180374G.m127115L0(this.f22232c, fzqVar.m128220j());
        this.f22234e.setText(fzqVar.m128225q());
        m37472i(fzqVar.m128223o());
        if (dynamicGreetListAct.m37459Z1()) {
            m37474k(TextUtils.equals(fzqVar.m128215b().actorUserId, CoreModule.f18264c.f20381e0.m116600p9().f56859id));
        } else {
            m37475l(fzqVar.m128222n());
        }
        this.f22237h.setText(fzqVar.m128219i());
        if (fzqVar.m128226r()) {
            this.f22236g.setBackgroundResource(CoreModule.m30933P().m143412i().mo180488j2());
            bnl0.m105524M(this.f22236g, true);
        } else {
            boolean zM128228t = fzqVar.m128228t();
            VImage vImage = this.f22236g;
            if (zM128228t) {
                vImage.setBackgroundResource(ibc0.f113838K5);
                bnl0.m105524M(this.f22236g, true);
            } else {
                bnl0.m105524M(vImage, false);
            }
        }
        bnl0.m105524M(this.f22235f, fzqVar.m128228t());
        m37470g(fzqVar, i);
        m37469f(fzqVar, dynamicGreetListAct, i2);
        i4g0.m138492A("e_kankan_stranger_message_pic", "p_kankan_stranger_message", new pf60("user_id", fzqVar.m128224p()));
        i4g0.m138492A("e_kankan_stranger_message_item", "p_kankan_stranger_message", new pf60("user_id", fzqVar.m128224p()), new pf60("is_red_dot", Integer.valueOf(fzqVar.m128223o() > 0 ? 1 : 0)));
    }

    /* JADX INFO: renamed from: k */
    public final void m37474k(boolean z) {
        VText vText = this.f22238i;
        if (z) {
            vText.setText("我发出的");
        } else {
            vText.setText("我收到的");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m37475l(double d) {
        this.f22238i.setText(pzi0.m174442G(d));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37466c(this);
    }

    public DynamicGreetListItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22241l = new VDraweeView[4];
    }

    public DynamicGreetListItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22241l = new VDraweeView[4];
    }
}
