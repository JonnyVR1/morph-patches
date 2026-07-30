package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.IdealInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p046p1.mobile.putong.core.p053ui.VText_Default_Bold;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowTagsView;
import com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView;
import com.p046p1.mobile.putong.data.IdealTag;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.j760;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qsz;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.z4z;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class MessageIdealEnquiryLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f32376a;

    /* JADX INFO: renamed from: b */
    public VText f32377b;

    /* JADX INFO: renamed from: c */
    public FlowTagsView f32378c;

    /* JADX INFO: renamed from: d */
    public VText_Default_Bold f32379d;

    /* JADX INFO: renamed from: e */
    public VImage f32380e;

    /* JADX INFO: renamed from: f */
    public IdealInfo f32381f;

    /* JADX INFO: renamed from: g */
    public String f32382g;

    /* JADX INFO: renamed from: h */
    public String f32383h;

    /* JADX INFO: renamed from: i */
    public boolean f32384i;

    /* JADX INFO: renamed from: j */
    public List<View> f32385j;

    /* JADX INFO: renamed from: k */
    public List<IdealTag> f32386k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageIdealEnquiryLayout$a */
    public class C8590a implements FlowView.InterfaceC8743a {
        public C8590a() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.FlowView.InterfaceC8743a
        /* JADX INFO: renamed from: a */
        public void mo49895a(View view, int i) {
            if (MessageIdealEnquiryLayout.this.f32384i) {
                return;
            }
            ConversationCounterTypeSp.IdealGuideMsg.set("ideal_guide_all_show_count_", 0);
            ((IdealTag) MessageIdealEnquiryLayout.this.f32386k.get(i)).hasChecked = !((IdealTag) MessageIdealEnquiryLayout.this.f32386k.get(i)).hasChecked;
            MessageIdealEnquiryLayout.this.m49886j();
        }
    }

    public MessageIdealEnquiryLayout(@NonNull Context context) {
        super(context);
        this.f32382g = null;
        this.f32383h = null;
        this.f32384i = false;
        this.f32385j = new ArrayList();
        this.f32386k = new ArrayList();
    }

    /* JADX INFO: renamed from: h */
    public final void m49884h(View view) {
        z4z.m217247a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final Act m49885i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m49886j() {
        int i;
        if (vwb.m200296J(this.f32385j)) {
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < this.f32385j.size(); i2++) {
                VText_Default_Bold vText_Default_Bold = (VText_Default_Bold) this.f32385j.get(i2);
                boolean z = this.f32386k.get(i2).hasChecked;
                if (z) {
                    i++;
                }
                vText_Default_Bold.setTextColor(z ? getResources().getColor(a1c0.f67161o) : getResources().getColor(a1c0.f67151e));
                vText_Default_Bold.setBackgroundResource(z ? c3c0.f78596O2 : c3c0.f78605P2);
            }
        }
        this.f32379d.setText(i <= 0 ? "添加至理想型" : "添加至理想型 (" + i + ")");
        this.f32379d.setEnabled(i > 0);
        this.f32379d.setTextColor(i > 0 ? getResources().getColor(a1c0.f67161o) : getResources().getColor(a1c0.f67146a0));
        this.f32379d.setBackgroundResource(i > 0 ? c3c0.f78818o : c3c0.f78719d);
    }

    /* JADX INFO: renamed from: k */
    public final void m49887k() {
        xdl0.m208329E0(this.f32380e, new View.OnClickListener() { // from class: l.v4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f179981a.m49888l(view);
            }
        });
        xdl0.m208329E0(this.f32379d, new View.OnClickListener() { // from class: l.w4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f184626a.m49889m(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m49888l(View view) {
        if (TextUtils.isEmpty(this.f32383h)) {
            return;
        }
        ConversationCounterTypeSp.IdealGuideMsg.set("ideal_guide_conv_show_flag_" + this.f32383h, 2);
        CoreModule.f17545c.f19642f0.m32774Qf(this.f32383h, vwb.m200324f0(MessageType.local_ideal_enquiry));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m49889m(View view) {
        ConversationCounterTypeSp.IdealGuideMsg.set("ideal_guide_conv_show_flag_" + this.f32383h, 2);
        ArrayList arrayList = new ArrayList();
        for (IdealTag idealTag : this.f32386k) {
            if (idealTag.hasChecked) {
                arrayList.add(idealTag);
            }
        }
        if (vwb.m200296J(arrayList)) {
            return;
        }
        this.f32379d.setText("正在保存");
        m49894r(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m49890n(Boolean bool) {
        this.f32379d.setEnabled(true);
        lsi0.m151595y("已保存");
        if (bool.booleanValue()) {
            CoreModule.f17545c.f19663m0.m31133o8();
        }
        this.f32384i = false;
        if (TextUtils.isEmpty(this.f32383h)) {
            return;
        }
        CoreModule.f17545c.f19642f0.m32774Qf(this.f32383h, vwb.m200324f0(MessageType.local_ideal_enquiry));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m49891o(Throwable th) {
        this.f32379d.setEnabled(true);
        this.f32384i = false;
        m49886j();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49884h(this);
        m49887k();
        this.f32378c.setMaxLines(1);
    }

    /* JADX INFO: renamed from: p */
    public void m49892p(User user, Message message, qsz qszVar) {
        this.f32383h = user.f56011id;
        if (this.f32381f == null || !TextUtils.equals(message.localExtraInfo, this.f32382g)) {
            try {
                this.f32381f = IdealInfo.JSON_ADAPTER.parse(message.localExtraInfo);
                this.f32382g = message.localExtraInfo;
                this.f32386k.clear();
                this.f32385j.clear();
            } catch (Exception unused) {
            }
        }
        if (this.f32381f == null) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this, true);
        this.f32376a.setText("如果你们聊得不错...");
        VText vText = this.f32377b;
        StringBuilder sb = new StringBuilder("喜欢");
        sb.append(user.isFemale() ? "她" : "他");
        sb.append("的哪些特质？为你推荐类似的人");
        vText.setText(sb.toString());
        m49893q(this.f32381f, qszVar);
    }

    /* JADX INFO: renamed from: q */
    public final void m49893q(IdealInfo idealInfo, qsz qszVar) {
        if (vwb.m200296J(this.f32386k)) {
            Iterator<IdealTag> it = idealInfo.fitIdeals.iterator();
            while (it.hasNext()) {
                this.f32386k.add(it.next());
            }
            for (IdealTag idealTag : this.f32386k) {
                VText_Default_Bold vText_Default_Bold = new VText_Default_Bold(getContext());
                vText_Default_Bold.setPadding(t100.m186890d(16.0f), 0, t100.m186890d(16.0f), 0);
                vText_Default_Bold.setGravity(17);
                vText_Default_Bold.setTextSize(14.0f);
                vText_Default_Bold.setText(idealTag.name);
                this.f32385j.add(vText_Default_Bold);
            }
            FlowTagsView flowTagsView = this.f32378c;
            flowTagsView.f34120f = true;
            flowTagsView.setOnChildClick(new C8590a());
            this.f32378c.setTags(this.f32385j);
            Iterator<View> it2 = this.f32385j.iterator();
            while (it2.hasNext()) {
                it2.next().setLayoutParams(new ViewGroup.LayoutParams(-2, t100.m186890d(44.0f)));
            }
            m49886j();
            zvf0.m220368A("e_save_ideal_type", OMSDialogPositon.p_chat_view, j760.m140076a("add_ideal_timing", "chat_a_lot"), j760.m140076a("is_first_add_ideal", Boolean.valueOf(!CoreModule.f17545c.f19639e0.m169520na().hasIdealInfo())));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m49894r(List<IdealTag> list) {
        this.f32384i = true;
        zvf0.m220399u("e_save_ideal_type", OMSDialogPositon.p_chat_view, j760.m140076a("add_ideal_timing", "chat_a_lot"), j760.m140076a("is_first_add_ideal", Boolean.valueOf(true ^ CoreModule.f17545c.f19639e0.m169520na().hasIdealInfo())));
        this.f32379d.setEnabled(false);
        m49885i().duringCreated(CoreModule.f17545c.f19639e0.m169382Da(list)).subscribe(mkd0.m154956H(new e30() { // from class: l.x4z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191071a.m49890n((Boolean) obj);
            }
        }, new e30() { // from class: l.y4z
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f196367a.m49891o((Throwable) obj);
            }
        }));
    }

    public MessageIdealEnquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32382g = null;
        this.f32383h = null;
        this.f32384i = false;
        this.f32385j = new ArrayList();
        this.f32386k = new ArrayList();
    }

    public MessageIdealEnquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32382g = null;
        this.f32383h = null;
        this.f32384i = false;
        this.f32385j = new ArrayList();
        this.f32386k = new ArrayList();
    }
}
