package com.p046p1.mobile.putong.core.newui.greet;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.NotificationStatus;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetListItemView;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.data.Audio;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.ahe;
import p149l.c3c0;
import p149l.fxq;
import p149l.j760;
import p149l.l6c0;
import p149l.mqi0;
import p149l.qib0;
import p149l.szb0;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class DynamicGreetListItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f21488a;

    /* JADX INFO: renamed from: b */
    public VLinear f21489b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f21490c;

    /* JADX INFO: renamed from: d */
    public VText f21491d;

    /* JADX INFO: renamed from: e */
    public VText f21492e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f21493f;

    /* JADX INFO: renamed from: g */
    public VImage f21494g;

    /* JADX INFO: renamed from: h */
    public VText f21495h;

    /* JADX INFO: renamed from: i */
    public VText f21496i;

    /* JADX INFO: renamed from: j */
    public VFrame f21497j;

    /* JADX INFO: renamed from: k */
    public VText f21498k;

    /* JADX INFO: renamed from: l */
    public final VDraweeView[] f21499l;

    public DynamicGreetListItemView(Context context) {
        super(context);
        this.f21499l = new VDraweeView[4];
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m36461a(fxq fxqVar, DynamicGreetListAct dynamicGreetListAct, View view) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(fxqVar.m123668p());
        if (NullChecker.m81303a(userM169430Pa)) {
            if (vwb.m200296J(userM169430Pa.pictures)) {
                return;
            }
            if (userM169430Pa.pictures.size() == 1 && TextUtils.isEmpty(userM169430Pa.picture(0).url) && (userM169430Pa.picture(0).size.width == 0 || userM169430Pa.picture(0).size.height == 0)) {
                return;
            }
        }
        dynamicGreetListAct.startActivity(CoreModule.m29935P().m94658i().mo158203A5(dynamicGreetListAct, fxqVar.m123668p(), "kankan_reply", false, false, false));
        dynamicGreetListAct.overridePendingTransition(szb0.f167030e, 0);
        zvf0.m220399u("e_kankan_stranger_message_pic", "p_kankan_stranger_message", new j760("user_id", fxqVar.m123668p()));
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m36462b(DynamicGreetListAct dynamicGreetListAct, fxq fxqVar, View view) {
        C8360d.m45900i(dynamicGreetListAct, fxqVar.m123659b(), dynamicGreetListAct.m36456Y1() ? "meet" : NotificationStatus.undefined);
        dynamicGreetListAct.overridePendingTransition(szb0.f167030e, szb0.f167029d);
        zvf0.m220399u("e_kankan_stranger_message_item", "p_kankan_stranger_message", new j760("user_id", fxqVar.m123668p()), new j760("is_red_dot", Integer.valueOf(fxqVar.m123667o() > 0 ? 1 : 0)));
        if (dynamicGreetListAct.m36456Y1()) {
            zvf0.m220399u("e_meet_message_box_item", dynamicGreetListAct.pageId(), new j760("user_id", fxqVar.m123668p()));
        }
        fxqVar.m123653M(0);
        dynamicGreetListAct.m36460c2().mo136192d();
    }

    /* JADX INFO: renamed from: c */
    public final void m36463c(View view) {
        ahe.m96445a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public DynamicGreetListAct m36464d() {
        return (DynamicGreetListAct) getContext();
    }

    @SuppressLint({"MissingInflatedId"})
    /* JADX INFO: renamed from: e */
    public void m36465e(int i) {
        int i2 = l6c0.f126262B;
        switch (i) {
            case 1:
                i2 = l6c0.f126255A;
                break;
            case 2:
                i2 = l6c0.f126276D;
                break;
            case 3:
                i2 = l6c0.f126269C;
                break;
            case 4:
                i2 = l6c0.f126606z;
                break;
            case 5:
                i2 = l6c0.f126283E;
                break;
            case 6:
                i2 = l6c0.f126599y;
                break;
        }
        View viewInflate = m36464d().inflater().inflate(i2, (ViewGroup) this.f21497j, false);
        this.f21498k = (VText) viewInflate.findViewById(y4c0.f195933A4);
        this.f21499l[0] = (VDraweeView) viewInflate.findViewById(y4c0.f196229u1);
        this.f21499l[1] = (VDraweeView) viewInflate.findViewById(y4c0.f196250x1);
        this.f21499l[2] = (VDraweeView) viewInflate.findViewById(y4c0.f196243w1);
        this.f21499l[3] = (VDraweeView) viewInflate.findViewById(y4c0.f196215s1);
        this.f21497j.addView(viewInflate, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m36466f(final fxq fxqVar, final DynamicGreetListAct dynamicGreetListAct, int i) {
        xdl0.m208329E0(this.f21490c, new View.OnClickListener() { // from class: l.yge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DynamicGreetListItemView.m36461a(fxqVar, dynamicGreetListAct, view);
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.zge
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DynamicGreetListItemView.m36462b(dynamicGreetListAct, fxqVar, view);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final void m36467g(fxq fxqVar, int i) {
        xdl0.m208344M(this.f21497j, true);
        if (i == 0) {
            boolean zIsEmpty = TextUtils.isEmpty(fxqVar.m123661g());
            if (zIsEmpty && !m36468h(fxqVar)) {
                xdl0.m208344M(this.f21497j, false);
            }
            this.f21498k.setText(!zIsEmpty ? fxqVar.m123661g() : "动态已删除");
            xdl0.m208344M(this.f21498k, !TextUtils.isEmpty(fxqVar.m123661g()));
            return;
        }
        if (i == 6 && NullChecker.m81303a(fxqVar)) {
            this.f21498k.setText(String.format("%s''", Integer.valueOf(Math.round(((Audio) fxqVar.m123662h().get(0)).duration))));
            return;
        }
        if (i == 5) {
            i = 1;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (fxqVar == null) {
                qib0.f154691G.m184725o(this.f21499l[i2]);
            } else {
                Media media = fxqVar.m123662h().get(i2);
                Picture picture = media instanceof Video ? ((Video) media).cover : media instanceof Picture ? (Picture) media : null;
                if (NullChecker.m81304b(picture)) {
                    qib0.f154691G.m102341Q0(this.f21499l[i2], picture.momentPictureSmall());
                } else {
                    qib0.f154691G.m184725o(this.f21499l[i2]);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m36468h(fxq fxqVar) {
        if (fxqVar == null || fxqVar.m123659b() == null || fxqVar.m123659b().moment == null) {
            return false;
        }
        return !TextUtils.isEmpty(fxqVar.m123659b().moment.f38759id);
    }

    /* JADX INFO: renamed from: i */
    public final void m36469i(int i) {
        String str;
        VText vText = this.f21491d;
        if (i <= 0) {
            vText.setVisibility(8);
            return;
        }
        vText.setVisibility(0);
        VText vText2 = this.f21491d;
        if (i > 99) {
            str = "99+";
        } else {
            str = i + "";
        }
        vText2.setText(str);
    }

    /* JADX INFO: renamed from: j */
    public void m36470j(DynamicGreetListAct dynamicGreetListAct, fxq fxqVar, int i, int i2) {
        qib0.f154691G.m102331L0(this.f21490c, fxqVar.m123664j());
        this.f21492e.setText(fxqVar.m123669q());
        m36469i(fxqVar.m123667o());
        if (dynamicGreetListAct.m36456Y1()) {
            m36471k(TextUtils.equals(fxqVar.m123659b().actorUserId, CoreModule.f17545c.f19639e0.m169527p9().f56011id));
        } else {
            m36472l(fxqVar.m123666n());
        }
        this.f21495h.setText(fxqVar.m123663i());
        if (fxqVar.m123670r()) {
            this.f21494g.setBackgroundResource(CoreModule.m29935P().m94658i().mo158396j2());
            xdl0.m208344M(this.f21494g, true);
        } else {
            boolean zM123672t = fxqVar.m123672t();
            VImage vImage = this.f21494g;
            if (zM123672t) {
                vImage.setBackgroundResource(c3c0.f78563K5);
                xdl0.m208344M(this.f21494g, true);
            } else {
                xdl0.m208344M(vImage, false);
            }
        }
        xdl0.m208344M(this.f21493f, fxqVar.m123672t());
        m36467g(fxqVar, i);
        m36466f(fxqVar, dynamicGreetListAct, i2);
        zvf0.m220368A("e_kankan_stranger_message_pic", "p_kankan_stranger_message", new j760("user_id", fxqVar.m123668p()));
        zvf0.m220368A("e_kankan_stranger_message_item", "p_kankan_stranger_message", new j760("user_id", fxqVar.m123668p()), new j760("is_red_dot", Integer.valueOf(fxqVar.m123667o() > 0 ? 1 : 0)));
    }

    /* JADX INFO: renamed from: k */
    public final void m36471k(boolean z) {
        VText vText = this.f21496i;
        if (z) {
            vText.setText("我发出的");
        } else {
            vText.setText("我收到的");
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m36472l(double d) {
        this.f21496i.setText(mqi0.m155932G(d));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36463c(this);
    }

    public DynamicGreetListItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f21499l = new VDraweeView[4];
    }

    public DynamicGreetListItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f21499l = new VDraweeView[4];
    }
}
