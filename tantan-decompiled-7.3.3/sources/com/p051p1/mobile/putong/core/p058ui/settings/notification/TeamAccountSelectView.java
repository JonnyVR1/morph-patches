package com.p051p1.mobile.putong.core.p058ui.settings.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRadioButton;
import p151v.VText;
import p153l.adc0;
import p153l.bsj0;
import p153l.jyb;
import p153l.kec0;
import p153l.psd0;
import p153l.uqb0;
import p153l.y20;
import p153l.zoi0;

/* JADX INFO: loaded from: classes12.dex */
public class TeamAccountSelectView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f37164a;

    /* JADX INFO: renamed from: b */
    public VText f37165b;

    /* JADX INFO: renamed from: c */
    public VRadioButton f37166c;

    /* JADX INFO: renamed from: d */
    public VLinear f37167d;

    /* JADX INFO: renamed from: e */
    public VText f37168e;

    /* JADX INFO: renamed from: f */
    public VRadioButton f37169f;

    /* JADX INFO: renamed from: g */
    public VLinear f37170g;

    /* JADX INFO: renamed from: h */
    public VLinear f37171h;

    /* JADX INFO: renamed from: i */
    public VText f37172i;

    /* JADX INFO: renamed from: j */
    public VRadioButton f37173j;

    public TeamAccountSelectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m56798e(View view) {
        zoi0.m220778a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m56799f() {
        for (int i = 0; i < this.f37170g.getChildCount(); i++) {
            if (bsj0.m106285u((ViewGroup) this.f37170g.getChildAt(i))) {
                return;
            }
        }
        this.f37171h.performClick();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m56800g(ViewGroup viewGroup, View view) {
        this.f37173j.setChecked(false);
        this.f37166c.setChecked(false);
        bsj0.m106284t(viewGroup, !bsj0.m106285u(viewGroup));
        m56799f();
    }

    public List<String> getSelectBlockingIds() {
        ArrayList arrayList = new ArrayList();
        if (!bsj0.m106285u(this.f37164a)) {
            if (bsj0.m106285u(this.f37171h)) {
                arrayList.add("all");
                return arrayList;
            }
            for (int i = 0; i < this.f37170g.getChildCount(); i++) {
                if (!bsj0.m106285u((ViewGroup) this.f37170g.getChildAt(i))) {
                    arrayList.add((String) this.f37170g.getChildAt(i).getTag());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m56801h(Act act, List list, List list2) {
        if (jyb.m147479J(list2)) {
            list2 = new ArrayList();
            Conversation conversationNew_ = Conversation.new_();
            conversationNew_.f56859id = User.ID_TEAM_ACCOUNT;
            list2.add(conversationNew_);
        }
        for (Conversation conversation : list2) {
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(conversation.f56859id);
            if (userM116503Pa != null) {
                final ViewGroup viewGroup = (ViewGroup) act.inflater().inflate(kec0.f125493Kc, (ViewGroup) this.f37170g, false);
                this.f37170g.addView(viewGroup);
                VDraweeView vDraweeView = (VDraweeView) viewGroup.findViewById(adc0.f70042O);
                viewGroup.setTag(conversation.f56859id);
                uqb0.f180374G.m127125Q0(vDraweeView, userM116503Pa.m61308fp().profile128());
                ((VText) viewGroup.findViewById(adc0.f70409je)).setText(userM116503Pa.name);
                if (!jyb.m147479J(list) && !list.contains("all")) {
                    bsj0.m106284t(viewGroup, !list.contains(conversation.f56859id));
                }
                viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.yoi0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f200983a.m56800g(viewGroup, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m56802i(View view) {
        this.f37166c.setChecked(true);
        for (int i = 0; i < this.f37170g.getChildCount(); i++) {
            bsj0.m106284t((ViewGroup) this.f37170g.getChildAt(i), false);
        }
        this.f37173j.setChecked(false);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m56803j(View view) {
        this.f37173j.setChecked(true);
        this.f37166c.setChecked(false);
        for (int i = 0; i < this.f37170g.getChildCount(); i++) {
            bsj0.m106284t((ViewGroup) this.f37170g.getChildAt(i), false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m56804k(final Act act, final List<String> list) {
        act.duringCreated(CoreModule.f18264c.f20384f0.m33894Zp()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.voi0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185051a.m56801h(act, list, (List) obj);
            }
        }));
        if (jyb.m147479J(list)) {
            this.f37166c.setChecked(true);
        } else if (list.contains("all")) {
            this.f37173j.setChecked(true);
        }
        this.f37164a.setOnClickListener(new View.OnClickListener() { // from class: l.woi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f190046a.m56802i(view);
            }
        });
        this.f37171h.setOnClickListener(new View.OnClickListener() { // from class: l.xoi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f195579a.m56803j(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56798e(this);
    }

    public TeamAccountSelectView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TeamAccountSelectView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
