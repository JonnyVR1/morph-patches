package com.p000p1.mobile.putong.core.newui.greet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.greet.DynamicGreetListItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.ahe;
import l.c3c0;
import l.j760;
import l.l6c0;
import l.qib0;
import l.szb0;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p009l.fxq;
import p009l.mqi0;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DynamicGreetListItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f266a;

    /* JADX INFO: renamed from: b */
    public VLinear f267b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f268c;

    /* JADX INFO: renamed from: d */
    public VText f269d;

    /* JADX INFO: renamed from: e */
    public VText f270e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f271f;

    /* JADX INFO: renamed from: g */
    public VImage f272g;

    /* JADX INFO: renamed from: h */
    public VText f273h;

    /* JADX INFO: renamed from: i */
    public VText f274i;

    /* JADX INFO: renamed from: j */
    public VFrame f275j;

    /* JADX INFO: renamed from: k */
    public VText f276k;

    /* JADX INFO: renamed from: l */
    public final VDraweeView[] f277l;

    public DynamicGreetListItemView(Context context) {
        super(context);
        this.f277l = new VDraweeView[4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m390a(fxq fxqVar, DynamicGreetListAct dynamicGreetListAct, View view) {
        User userPa = CoreModule.c.e0.Pa(fxqVar.m14621p());
        if (NullChecker.a(userPa)) {
            if (vwb.J(userPa.pictures)) {
                return;
            }
            if (userPa.pictures.size() == 1 && TextUtils.isEmpty(((Media) userPa.picture(0)).url) && (userPa.picture(0).size.width == 0 || userPa.picture(0).size.height == 0)) {
                return;
            }
        }
        dynamicGreetListAct.startActivity(CoreModule.P().i().A5(dynamicGreetListAct, fxqVar.m14621p(), "kankan_reply", false, false, false));
        dynamicGreetListAct.overridePendingTransition(szb0.e, 0);
        zvf0.u("e_kankan_stranger_message_pic", "p_kankan_stranger_message", new j760[]{new j760("user_id", fxqVar.m14621p())});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m391b(DynamicGreetListAct dynamicGreetListAct, fxq fxqVar, View view) {
        d.i(dynamicGreetListAct, fxqVar.m14612b(), dynamicGreetListAct.m385Y1() ? "meet" : "undefined");
        dynamicGreetListAct.overridePendingTransition(szb0.e, szb0.d);
        zvf0.u("e_kankan_stranger_message_item", "p_kankan_stranger_message", new j760[]{new j760("user_id", fxqVar.m14621p()), new j760("is_red_dot", Integer.valueOf(fxqVar.m14620o() > 0 ? 1 : 0))});
        if (dynamicGreetListAct.m385Y1()) {
            zvf0.u("e_meet_message_box_item", dynamicGreetListAct.pageId(), new j760[]{new j760("user_id", fxqVar.m14621p())});
        }
        fxqVar.m14606M(0);
        dynamicGreetListAct.m389c2().mo16549d();
    }

    /* JADX INFO: renamed from: c */
    public final void m392c(View view) {
        ahe.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public DynamicGreetListAct m393d() {
        return (DynamicGreetListAct) getContext();
    }

    @SuppressLint({"MissingInflatedId"})
    /* JADX INFO: renamed from: e */
    public void m394e(int i) {
        int i2 = l6c0.B;
        switch (i) {
            case 1:
                i2 = l6c0.A;
                break;
            case 2:
                i2 = l6c0.D;
                break;
            case 3:
                i2 = l6c0.C;
                break;
            case 4:
                i2 = l6c0.z;
                break;
            case 5:
                i2 = l6c0.E;
                break;
            case 6:
                i2 = l6c0.y;
                break;
        }
        View viewInflate = m393d().inflater().inflate(i2, (ViewGroup) this.f275j, false);
        this.f276k = viewInflate.findViewById(y4c0.A4);
        this.f277l[0] = (VDraweeView) viewInflate.findViewById(y4c0.u1);
        this.f277l[1] = (VDraweeView) viewInflate.findViewById(y4c0.x1);
        this.f277l[2] = (VDraweeView) viewInflate.findViewById(y4c0.w1);
        this.f277l[3] = (VDraweeView) viewInflate.findViewById(y4c0.s1);
        this.f275j.addView(viewInflate, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m395f(final fxq fxqVar, final DynamicGreetListAct dynamicGreetListAct, int i) {
        xdl0.E0(this.f268c, new View.OnClickListener() { // from class: l.yge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DynamicGreetListItemView.m390a(fxqVar, dynamicGreetListAct, view);
            }
        });
        xdl0.E0(this, new View.OnClickListener() { // from class: l.zge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DynamicGreetListItemView.m391b(dynamicGreetListAct, fxqVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m396g(fxq fxqVar, int i) {
        xdl0.M(this.f275j, true);
        if (i == 0) {
            boolean zIsEmpty = TextUtils.isEmpty(fxqVar.m14614g());
            if (zIsEmpty && !m397h(fxqVar)) {
                xdl0.M(this.f275j, false);
            }
            this.f276k.setText(!zIsEmpty ? fxqVar.m14614g() : "动态已删除");
            xdl0.M(this.f276k, !TextUtils.isEmpty(fxqVar.m14614g()));
            return;
        }
        if (i == 6 && NullChecker.a(fxqVar)) {
            this.f276k.setText(String.format("%s''", Integer.valueOf(Math.round(fxqVar.m14615h().get(0).duration))));
            return;
        }
        if (i == 5) {
            i = 1;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (fxqVar == null) {
                qib0.G.o(this.f277l[i2]);
            } else {
                Video video = (Media) fxqVar.m14615h().get(i2);
                Picture picture = video instanceof Video ? video.cover : video instanceof Picture ? (Picture) video : null;
                if (NullChecker.b(picture)) {
                    qib0.G.Q0(this.f277l[i2], picture.momentPictureSmall());
                } else {
                    qib0.G.o(this.f277l[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m397h(fxq fxqVar) {
        if (fxqVar == null || fxqVar.m14612b() == null || fxqVar.m14612b().moment == null) {
            return false;
        }
        return !TextUtils.isEmpty(fxqVar.m14612b().moment.id);
    }

    /* JADX INFO: renamed from: i */
    public final void m398i(int i) {
        String str;
        VText vText = this.f269d;
        if (i <= 0) {
            vText.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        VText vText2 = this.f269d;
        if (i > 99) {
            str = "99+";
        } else {
            str = i + "";
        }
        vText2.setText(str);
    }

    /* JADX INFO: renamed from: j */
    public void m399j(DynamicGreetListAct dynamicGreetListAct, fxq fxqVar, int i, int i2) {
        qib0.G.L0(this.f268c, fxqVar.m14617j());
        this.f270e.setText(fxqVar.m14622q());
        m398i(fxqVar.m14620o());
        if (dynamicGreetListAct.m385Y1()) {
            m400k(TextUtils.equals(fxqVar.m14612b().actorUserId, ((DbObject) CoreModule.c.e0.p9()).id));
        } else {
            m401l(fxqVar.m14619n());
        }
        this.f273h.setText(fxqVar.m14616i());
        if (fxqVar.m14623r()) {
            this.f272g.setBackgroundResource(CoreModule.P().i().j2());
            xdl0.M(this.f272g, true);
        } else {
            boolean zM14625t = fxqVar.m14625t();
            VImage vImage = this.f272g;
            if (zM14625t) {
                vImage.setBackgroundResource(c3c0.K5);
                xdl0.M(this.f272g, true);
            } else {
                xdl0.M(vImage, false);
            }
        }
        xdl0.M(this.f271f, fxqVar.m14625t());
        m396g(fxqVar, i);
        m395f(fxqVar, dynamicGreetListAct, i2);
        zvf0.A("e_kankan_stranger_message_pic", "p_kankan_stranger_message", new j760[]{new j760("user_id", fxqVar.m14621p())});
        zvf0.A("e_kankan_stranger_message_item", "p_kankan_stranger_message", new j760[]{new j760("user_id", fxqVar.m14621p()), new j760("is_red_dot", Integer.valueOf(fxqVar.m14620o() > 0 ? 1 : 0))});
    }

    /* JADX INFO: renamed from: k */
    public final void m400k(boolean z) {
        VText vText = this.f274i;
        if (z) {
            vText.setText("我发出的");
        } else {
            vText.setText("我收到的");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m401l(double d) {
        this.f274i.setText(mqi0.m18538G(d));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m392c(this);
    }

    public DynamicGreetListItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f277l = new VDraweeView[4];
    }

    public DynamicGreetListItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f277l = new VDraweeView[4];
    }
}
