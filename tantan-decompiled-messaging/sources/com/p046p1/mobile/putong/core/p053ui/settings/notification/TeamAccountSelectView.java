package com.p046p1.mobile.putong.core.p053ui.settings.notification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRadioButton;
import p147v.VText;
import p149l.e30;
import p149l.f6c0;
import p149l.mkd0;
import p149l.qib0;
import p149l.u4c0;
import p149l.vwb;
import p149l.yij0;
import p149l.zfi0;

/* JADX INFO: loaded from: classes9.dex */
public class TeamAccountSelectView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VLinear f36316a;

    /* JADX INFO: renamed from: b */
    public VText f36317b;

    /* JADX INFO: renamed from: c */
    public VRadioButton f36318c;

    /* JADX INFO: renamed from: d */
    public VLinear f36319d;

    /* JADX INFO: renamed from: e */
    public VText f36320e;

    /* JADX INFO: renamed from: f */
    public VRadioButton f36321f;

    /* JADX INFO: renamed from: g */
    public VLinear f36322g;

    /* JADX INFO: renamed from: h */
    public VLinear f36323h;

    /* JADX INFO: renamed from: i */
    public VText f36324i;

    /* JADX INFO: renamed from: j */
    public VRadioButton f36325j;

    public TeamAccountSelectView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m55615e(View view) {
        zfi0.m218482a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public final void m55616f() {
        for (int i = 0; i < this.f36322g.getChildCount(); i++) {
            if (yij0.m214965u((ViewGroup) this.f36322g.getChildAt(i))) {
                return;
            }
        }
        this.f36323h.performClick();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m55617g(ViewGroup viewGroup, View view) {
        this.f36325j.setChecked(false);
        this.f36318c.setChecked(false);
        yij0.m214964t(viewGroup, !yij0.m214965u(viewGroup));
        m55616f();
    }

    public List<String> getSelectBlockingIds() {
        ArrayList arrayList = new ArrayList();
        if (!yij0.m214965u(this.f36316a)) {
            if (yij0.m214965u(this.f36323h)) {
                arrayList.add("all");
                return arrayList;
            }
            for (int i = 0; i < this.f36322g.getChildCount(); i++) {
                if (!yij0.m214965u((ViewGroup) this.f36322g.getChildAt(i))) {
                    arrayList.add((String) this.f36322g.getChildAt(i).getTag());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m55618h(Act act, List list, List list2) {
        if (vwb.m200296J(list2)) {
            list2 = new ArrayList();
            Conversation conversationNew_ = Conversation.new_();
            conversationNew_.f56011id = User.ID_TEAM_ACCOUNT;
            list2.add(conversationNew_);
        }
        for (Conversation conversation : list2) {
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(conversation.f56011id);
            if (userM169430Pa != null) {
                final ViewGroup viewGroup = (ViewGroup) act.inflater().inflate(f6c0.f95327Dc, (ViewGroup) this.f36322g, false);
                this.f36322g.addView(viewGroup);
                VDraweeView vDraweeView = (VDraweeView) viewGroup.findViewById(u4c0.f173954O);
                viewGroup.setTag(conversation.f56011id);
                qib0.f154691G.m102341Q0(vDraweeView, userM169430Pa.m60124fp().profile128());
                ((VText) viewGroup.findViewById(u4c0.f174268ge)).setText(userM169430Pa.name);
                if (!vwb.m200296J(list) && !list.contains("all")) {
                    yij0.m214964t(viewGroup, !list.contains(conversation.f56011id));
                }
                viewGroup.setOnClickListener(new View.OnClickListener() { // from class: l.yfi0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f198070a.m55617g(viewGroup, view);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m55619i(View view) {
        this.f36318c.setChecked(true);
        for (int i = 0; i < this.f36322g.getChildCount(); i++) {
            yij0.m214964t((ViewGroup) this.f36322g.getChildAt(i), false);
        }
        this.f36325j.setChecked(false);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m55620j(View view) {
        this.f36325j.setChecked(true);
        this.f36318c.setChecked(false);
        for (int i = 0; i < this.f36322g.getChildCount(); i++) {
            yij0.m214964t((ViewGroup) this.f36322g.getChildAt(i), false);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m55621k(final Act act, final List<String> list) {
        act.duringCreated(CoreModule.f17545c.f19642f0.m32891Zp()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.vfi0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181276a.m55618h(act, list, (List) obj);
            }
        }));
        if (vwb.m200296J(list)) {
            this.f36318c.setChecked(true);
        } else if (list.contains("all")) {
            this.f36325j.setChecked(true);
        }
        this.f36316a.setOnClickListener(new View.OnClickListener() { // from class: l.wfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186085a.m55619i(view);
            }
        });
        this.f36323h.setOnClickListener(new View.OnClickListener() { // from class: l.xfi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192689a.m55620j(view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55615e(this);
    }

    public TeamAccountSelectView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public TeamAccountSelectView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
