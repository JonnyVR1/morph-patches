package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowTagsView;
import com.p000p1.mobile.putong.core.p001ui.profile.views.FlowView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.IdealInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p1.mobile.putong.core.ui.VText_Default_Bold;
import com.p1.mobile.putong.data.IdealTag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.qsz;
import l.t100;
import l.vwb;
import l.xdl0;
import l.z4z;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageIdealEnquiryLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f198a;

    /* JADX INFO: renamed from: b */
    public VText f199b;

    /* JADX INFO: renamed from: c */
    public FlowTagsView f200c;

    /* JADX INFO: renamed from: d */
    public VText_Default_Bold f201d;

    /* JADX INFO: renamed from: e */
    public VImage f202e;

    /* JADX INFO: renamed from: f */
    public IdealInfo f203f;

    /* JADX INFO: renamed from: g */
    public String f204g;

    /* JADX INFO: renamed from: h */
    public String f205h;

    /* JADX INFO: renamed from: i */
    public boolean f206i;

    /* JADX INFO: renamed from: j */
    public List<View> f207j;

    /* JADX INFO: renamed from: k */
    public List<IdealTag> f208k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageIdealEnquiryLayout$a */
    public class C0015a implements FlowView.InterfaceC0168a {
        public C0015a() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.profile.views.FlowView.InterfaceC0168a
        /* JADX INFO: renamed from: a */
        public void mo317a(View view, int i) {
            if (MessageIdealEnquiryLayout.this.f206i) {
                return;
            }
            ConversationCounterTypeSp.IdealGuideMsg.set("ideal_guide_all_show_count_", 0);
            ((IdealTag) MessageIdealEnquiryLayout.this.f208k.get(i)).hasChecked = !((IdealTag) MessageIdealEnquiryLayout.this.f208k.get(i)).hasChecked;
            MessageIdealEnquiryLayout.this.m308j();
        }
    }

    public MessageIdealEnquiryLayout(@NonNull Context context) {
        super(context);
        this.f204g = null;
        this.f205h = null;
        this.f206i = false;
        this.f207j = new ArrayList();
        this.f208k = new ArrayList();
    }

    /* JADX INFO: renamed from: h */
    public final void m306h(View view) {
        z4z.a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final Act m307i() {
        return getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m308j() {
        int i;
        if (vwb.J(this.f207j)) {
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < this.f207j.size(); i2++) {
                VText_Default_Bold vText_Default_Bold = this.f207j.get(i2);
                boolean z = this.f208k.get(i2).hasChecked;
                if (z) {
                    i++;
                }
                vText_Default_Bold.setTextColor(z ? getResources().getColor(a1c0.o) : getResources().getColor(a1c0.e));
                vText_Default_Bold.setBackgroundResource(z ? c3c0.O2 : c3c0.P2);
            }
        }
        this.f201d.setText(i <= 0 ? "添加至理想型" : "添加至理想型 (" + i + ")");
        this.f201d.setEnabled(i > 0);
        this.f201d.setTextColor(i > 0 ? getResources().getColor(a1c0.o) : getResources().getColor(a1c0.a0));
        this.f201d.setBackgroundResource(i > 0 ? c3c0.o : c3c0.d);
    }

    /* JADX INFO: renamed from: k */
    public final void m309k() {
        xdl0.E0(this.f202e, new View.OnClickListener() { // from class: l.v4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20974a.m310l(view);
            }
        });
        xdl0.E0(this.f201d, new View.OnClickListener() { // from class: l.w4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21459a.m311m(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m310l(View view) {
        if (TextUtils.isEmpty(this.f205h)) {
            return;
        }
        ConversationCounterTypeSp.IdealGuideMsg.set("ideal_guide_conv_show_flag_" + this.f205h, 2);
        CoreModule.c.f0.Qf(this.f205h, vwb.f0(new String[]{"local_ideal_enquiry"}));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m311m(View view) {
        ConversationCounterTypeSp.IdealGuideMsg.set("ideal_guide_conv_show_flag_" + this.f205h, 2);
        ArrayList arrayList = new ArrayList();
        for (IdealTag idealTag : this.f208k) {
            if (idealTag.hasChecked) {
                arrayList.add(idealTag);
            }
        }
        if (vwb.J(arrayList)) {
            return;
        }
        this.f201d.setText("正在保存");
        m316r(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m312n(Boolean bool) {
        this.f201d.setEnabled(true);
        lsi0.y("已保存");
        if (bool.booleanValue()) {
            CoreModule.c.m0.o8();
        }
        this.f206i = false;
        if (TextUtils.isEmpty(this.f205h)) {
            return;
        }
        CoreModule.c.f0.Qf(this.f205h, vwb.f0(new String[]{"local_ideal_enquiry"}));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m313o(Throwable th) {
        this.f201d.setEnabled(true);
        this.f206i = false;
        m308j();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m306h(this);
        m309k();
        this.f200c.setMaxLines(1);
    }

    /* JADX INFO: renamed from: p */
    public void m314p(User user, Message message, qsz qszVar) {
        this.f205h = ((DbObject) user).id;
        if (this.f203f == null || !TextUtils.equals(message.localExtraInfo, this.f204g)) {
            try {
                this.f203f = (IdealInfo) IdealInfo.JSON_ADAPTER.parse(message.localExtraInfo);
                this.f204g = message.localExtraInfo;
                this.f208k.clear();
                this.f207j.clear();
            } catch (Exception unused) {
            }
        }
        if (this.f203f == null) {
            xdl0.M(this, false);
            return;
        }
        xdl0.M(this, true);
        this.f198a.setText("如果你们聊得不错...");
        VText vText = this.f199b;
        StringBuilder sb = new StringBuilder("喜欢");
        sb.append(user.isFemale() ? "她" : "他");
        sb.append("的哪些特质？为你推荐类似的人");
        vText.setText(sb.toString());
        m315q(this.f203f, qszVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m315q(IdealInfo idealInfo, qsz qszVar) {
        if (vwb.J(this.f208k)) {
            Iterator it = idealInfo.fitIdeals.iterator();
            while (it.hasNext()) {
                this.f208k.add((IdealTag) it.next());
            }
            for (IdealTag idealTag : this.f208k) {
                VText_Default_Bold vText_Default_Bold = new VText_Default_Bold(getContext());
                vText_Default_Bold.setPadding(t100.d(16.0f), 0, t100.d(16.0f), 0);
                vText_Default_Bold.setGravity(17);
                vText_Default_Bold.setTextSize(14.0f);
                vText_Default_Bold.setText(idealTag.name);
                this.f207j.add(vText_Default_Bold);
            }
            FlowTagsView flowTagsView = this.f200c;
            flowTagsView.f1942f = true;
            flowTagsView.setOnChildClick(new C0015a());
            this.f200c.setTags(this.f207j);
            Iterator<View> it2 = this.f207j.iterator();
            while (it2.hasNext()) {
                it2.next().setLayoutParams(new ViewGroup.LayoutParams(-2, t100.d(44.0f)));
            }
            m308j();
            zvf0.A("e_save_ideal_type", "p_chat_view", new j760[]{j760.a("add_ideal_timing", "chat_a_lot"), j760.a("is_first_add_ideal", Boolean.valueOf(!CoreModule.c.e0.na().hasIdealInfo()))});
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m316r(List<IdealTag> list) {
        this.f206i = true;
        zvf0.u("e_save_ideal_type", "p_chat_view", new j760[]{j760.a("add_ideal_timing", "chat_a_lot"), j760.a("is_first_add_ideal", Boolean.valueOf(true ^ CoreModule.c.e0.na().hasIdealInfo()))});
        this.f201d.setEnabled(false);
        m307i().duringCreated(CoreModule.c.e0.Da(list)).subscribe(mkd0.H(new e30() { // from class: l.x4z
            public final void call(Object obj) {
                this.f22114a.m312n((Boolean) obj);
            }
        }, new e30() { // from class: l.y4z
            public final void call(Object obj) {
                this.f22661a.m313o((Throwable) obj);
            }
        }));
    }

    public MessageIdealEnquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f204g = null;
        this.f205h = null;
        this.f206i = false;
        this.f207j = new ArrayList();
        this.f208k = new ArrayList();
    }

    public MessageIdealEnquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f204g = null;
        this.f205h = null;
        this.f206i = false;
        this.f207j = new ArrayList();
        this.f208k = new ArrayList();
    }
}
