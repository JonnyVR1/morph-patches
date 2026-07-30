package com.p000p1.mobile.putong.core.p004ui.settings.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.mkd0;
import l.vwb;
import l.yij0;
import l.zfi0;
import p006l.f6c0;
import p006l.qib0;
import p006l.u4c0;
import v.VDraweeView;
import v.VLinear;
import v.VRadioButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TeamAccountSelectView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f6097a;

    /* JADX INFO: renamed from: b */
    public VText f6098b;

    /* JADX INFO: renamed from: c */
    public VRadioButton f6099c;

    /* JADX INFO: renamed from: d */
    public VLinear f6100d;

    /* JADX INFO: renamed from: e */
    public VText f6101e;

    /* JADX INFO: renamed from: f */
    public VRadioButton f6102f;

    /* JADX INFO: renamed from: g */
    public VLinear f6103g;

    /* JADX INFO: renamed from: h */
    public VLinear f6104h;

    /* JADX INFO: renamed from: i */
    public VText f6105i;

    /* JADX INFO: renamed from: j */
    public VRadioButton f6106j;

    public TeamAccountSelectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m9010e(View view) {
        zfi0.a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m9011f() {
        for (int i = 0; i < this.f6103g.getChildCount(); i++) {
            if (yij0.u((ViewGroup) this.f6103g.getChildAt(i))) {
                return;
            }
        }
        this.f6104h.performClick();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m9012g(ViewGroup viewGroup, View view) {
        this.f6106j.setChecked(false);
        this.f6099c.setChecked(false);
        yij0.t(viewGroup, !yij0.u(viewGroup));
        m9011f();
    }

    public List<String> getSelectBlockingIds() {
        ArrayList arrayList = new ArrayList();
        if (!yij0.u(this.f6097a)) {
            if (yij0.u(this.f6104h)) {
                arrayList.add("all");
                return arrayList;
            }
            for (int i = 0; i < this.f6103g.getChildCount(); i++) {
                if (!yij0.u((ViewGroup) this.f6103g.getChildAt(i))) {
                    arrayList.add((String) this.f6103g.getChildAt(i).getTag());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m9013h(Act act, List list, List list2) {
        if (vwb.J(list2)) {
            list2 = new ArrayList();
            Conversation conversationNew_ = Conversation.new_();
            ((DbObject) conversationNew_).id = "-1";
            list2.add(conversationNew_);
        }
        for (Conversation conversation : list2) {
            User userM21393Pa = CoreModule.f1534c.f3628e0.m21393Pa(((DbObject) conversation).id);
            if (userM21393Pa != null) {
                final ViewGroup viewGroup = (ViewGroup) act.inflater().inflate(f6c0.f11741Dc, (ViewGroup) this.f6103g, false);
                this.f6103g.addView(viewGroup);
                SimpleDraweeView simpleDraweeView = (VDraweeView) viewGroup.findViewById(u4c0.f22702O);
                viewGroup.setTag(((DbObject) conversation).id);
                qib0.f19782G.m12754Q0(simpleDraweeView, userM21393Pa.fp().profile128());
                viewGroup.findViewById(u4c0.f23016ge).setText(userM21393Pa.name);
                if (!vwb.J(list) && !list.contains("all")) {
                    yij0.t(viewGroup, !list.contains(((DbObject) conversation).id));
                }
                viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.yfi0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f28194a.m9012g(viewGroup, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m9014i(View view) {
        this.f6099c.setChecked(true);
        for (int i = 0; i < this.f6103g.getChildCount(); i++) {
            yij0.t((ViewGroup) this.f6103g.getChildAt(i), false);
        }
        this.f6106j.setChecked(false);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m9015j(View view) {
        this.f6106j.setChecked(true);
        this.f6099c.setChecked(false);
        for (int i = 0; i < this.f6103g.getChildCount(); i++) {
            yij0.t((ViewGroup) this.f6103g.getChildAt(i), false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m9016k(final Act act, final List<String> list) {
        act.duringCreated(CoreModule.f1534c.f3631f0.m4821Zp()).take(1).subscribe(mkd0.G(new e30() { // from class: l.vfi0
            public final void call(Object obj) {
                this.f24305a.m9013h(act, list, (List) obj);
            }
        }));
        if (vwb.J(list)) {
            this.f6099c.setChecked(true);
        } else if (list.contains("all")) {
            this.f6106j.setChecked(true);
        }
        this.f6097a.setOnClickListener(new View.OnClickListener() { // from class: l.wfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25137a.m9014i(view);
            }
        });
        this.f6104h.setOnClickListener(new View.OnClickListener() { // from class: l.xfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f27500a.m9015j(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9010e(this);
    }

    public TeamAccountSelectView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TeamAccountSelectView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
