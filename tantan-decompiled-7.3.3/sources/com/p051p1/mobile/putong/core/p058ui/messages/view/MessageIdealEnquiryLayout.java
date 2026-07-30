package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.IdealInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.newui.messages.util.ConversationCounterTypeSp;
import com.p051p1.mobile.putong.core.p058ui.VText_Default_Bold;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowTagsView;
import com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView;
import com.p051p1.mobile.putong.data.IdealTag;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.n100;
import p153l.o1j0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.wdz;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class MessageIdealEnquiryLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText_Default_Bold f33224a;

    /* JADX INFO: renamed from: b */
    public VText f33225b;

    /* JADX INFO: renamed from: c */
    public FlowTagsView f33226c;

    /* JADX INFO: renamed from: d */
    public VText_Default_Bold f33227d;

    /* JADX INFO: renamed from: e */
    public VImage f33228e;

    /* JADX INFO: renamed from: f */
    public IdealInfo f33229f;

    /* JADX INFO: renamed from: g */
    public String f33230g;

    /* JADX INFO: renamed from: h */
    public String f33231h;

    /* JADX INFO: renamed from: i */
    public boolean f33232i;

    /* JADX INFO: renamed from: j */
    public List<View> f33233j;

    /* JADX INFO: renamed from: k */
    public List<IdealTag> f33234k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.view.MessageIdealEnquiryLayout$a */
    public class C8753a implements FlowView.InterfaceC8906a {
        public C8753a() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.FlowView.InterfaceC8906a
        /* JADX INFO: renamed from: a */
        public void mo51078a(View view, int i) {
            if (MessageIdealEnquiryLayout.this.f33232i) {
                return;
            }
            ConversationCounterTypeSp.IdealGuideMsg.set("ideal_guide_all_show_count_", 0);
            ((IdealTag) MessageIdealEnquiryLayout.this.f33234k.get(i)).hasChecked = !((IdealTag) MessageIdealEnquiryLayout.this.f33234k.get(i)).hasChecked;
            MessageIdealEnquiryLayout.this.m51069j();
        }
    }

    public MessageIdealEnquiryLayout(@NonNull Context context) {
        super(context);
        this.f33230g = null;
        this.f33231h = null;
        this.f33232i = false;
        this.f33233j = new ArrayList();
        this.f33234k = new ArrayList();
    }

    /* JADX INFO: renamed from: h */
    public final void m51067h(View view) {
        wdz.m205989a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public final Act m51068i() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: j */
    public final void m51069j() {
        int i;
        if (jyb.m147479J(this.f33233j)) {
            i = 0;
        } else {
            i = 0;
            for (int i2 = 0; i2 < this.f33233j.size(); i2++) {
                VText_Default_Bold vText_Default_Bold = (VText_Default_Bold) this.f33233j.get(i2);
                boolean z = this.f33234k.get(i2).hasChecked;
                if (z) {
                    i++;
                }
                vText_Default_Bold.setTextColor(z ? getResources().getColor(g9c0.f102825o) : getResources().getColor(g9c0.f102815e));
                vText_Default_Bold.setBackgroundResource(z ? ibc0.f113871O2 : ibc0.f113880P2);
            }
        }
        this.f33227d.setText(i <= 0 ? "添加至理想型" : "添加至理想型 (" + i + ")");
        this.f33227d.setEnabled(i > 0);
        this.f33227d.setTextColor(i > 0 ? getResources().getColor(g9c0.f102825o) : getResources().getColor(g9c0.f102810a0));
        this.f33227d.setBackgroundResource(i > 0 ? ibc0.f114093o : ibc0.f113994d);
    }

    /* JADX INFO: renamed from: k */
    public final void m51070k() {
        bnl0.m105509E0(this.f33228e, new View.OnClickListener() { // from class: l.sdz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167479a.m51071l(view);
            }
        });
        bnl0.m105509E0(this.f33227d, new View.OnClickListener() { // from class: l.tdz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173414a.m51072m(view);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m51071l(View view) {
        if (TextUtils.isEmpty(this.f33231h)) {
            return;
        }
        ConversationCounterTypeSp.IdealGuideMsg.set("ideal_guide_conv_show_flag_" + this.f33231h, 2);
        CoreModule.f18264c.f20384f0.m33777Qf(this.f33231h, jyb.m147507f0(MessageType.local_ideal_enquiry));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m51072m(View view) {
        ConversationCounterTypeSp.IdealGuideMsg.set("ideal_guide_conv_show_flag_" + this.f33231h, 2);
        ArrayList arrayList = new ArrayList();
        for (IdealTag idealTag : this.f33234k) {
            if (idealTag.hasChecked) {
                arrayList.add(idealTag);
            }
        }
        if (jyb.m147479J(arrayList)) {
            return;
        }
        this.f33227d.setText("正在保存");
        m51077r(arrayList);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m51073n(Boolean bool) {
        this.f33227d.setEnabled(true);
        o1j0.m165651y("已保存");
        if (bool.booleanValue()) {
            CoreModule.f18264c.f20405m0.m32136o8();
        }
        this.f33232i = false;
        if (TextUtils.isEmpty(this.f33231h)) {
            return;
        }
        CoreModule.f18264c.f20384f0.m33777Qf(this.f33231h, jyb.m147507f0(MessageType.local_ideal_enquiry));
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m51074o(Throwable th) {
        this.f33227d.setEnabled(true);
        this.f33232i = false;
        m51069j();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51067h(this);
        m51070k();
        this.f33226c.setMaxLines(1);
    }

    /* JADX INFO: renamed from: p */
    public void m51075p(User user, Message message, n100 n100Var) {
        this.f33231h = user.f56859id;
        if (this.f33229f == null || !TextUtils.equals(message.localExtraInfo, this.f33230g)) {
            try {
                this.f33229f = IdealInfo.JSON_ADAPTER.parse(message.localExtraInfo);
                this.f33230g = message.localExtraInfo;
                this.f33234k.clear();
                this.f33233j.clear();
            } catch (Exception unused) {
            }
        }
        if (this.f33229f == null) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this, true);
        this.f33224a.setText("如果你们聊得不错...");
        VText vText = this.f33225b;
        StringBuilder sb = new StringBuilder("喜欢");
        sb.append(user.isFemale() ? "她" : "他");
        sb.append("的哪些特质？为你推荐类似的人");
        vText.setText(sb.toString());
        m51076q(this.f33229f, n100Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m51076q(IdealInfo idealInfo, n100 n100Var) {
        if (jyb.m147479J(this.f33234k)) {
            Iterator<IdealTag> it = idealInfo.fitIdeals.iterator();
            while (it.hasNext()) {
                this.f33234k.add(it.next());
            }
            for (IdealTag idealTag : this.f33234k) {
                VText_Default_Bold vText_Default_Bold = new VText_Default_Bold(getContext());
                vText_Default_Bold.setPadding(qa00.m175859d(16.0f), 0, qa00.m175859d(16.0f), 0);
                vText_Default_Bold.setGravity(17);
                vText_Default_Bold.setTextSize(14.0f);
                vText_Default_Bold.setText(idealTag.name);
                this.f33233j.add(vText_Default_Bold);
            }
            FlowTagsView flowTagsView = this.f33226c;
            flowTagsView.f34968f = true;
            flowTagsView.setOnChildClick(new C8753a());
            this.f33226c.setTags(this.f33233j);
            Iterator<View> it2 = this.f33233j.iterator();
            while (it2.hasNext()) {
                it2.next().setLayoutParams(new ViewGroup.LayoutParams(-2, qa00.m175859d(44.0f)));
            }
            m51069j();
            i4g0.m138492A("e_save_ideal_type", OMSDialogPositon.p_chat_view, pf60.m172085a("add_ideal_timing", "chat_a_lot"), pf60.m172085a("is_first_add_ideal", Boolean.valueOf(!CoreModule.f18264c.f20381e0.m116593na().hasIdealInfo())));
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m51077r(List<IdealTag> list) {
        this.f33232i = true;
        i4g0.m138523u("e_save_ideal_type", OMSDialogPositon.p_chat_view, pf60.m172085a("add_ideal_timing", "chat_a_lot"), pf60.m172085a("is_first_add_ideal", Boolean.valueOf(true ^ CoreModule.f18264c.f20381e0.m116593na().hasIdealInfo())));
        this.f33227d.setEnabled(false);
        m51068i().duringCreated(CoreModule.f18264c.f20381e0.m116455Da(list)).subscribe(psd0.m173597H(new y20() { // from class: l.udz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178618a.m51073n((Boolean) obj);
            }
        }, new y20() { // from class: l.vdz
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183692a.m51074o((Throwable) obj);
            }
        }));
    }

    public MessageIdealEnquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33230g = null;
        this.f33231h = null;
        this.f33232i = false;
        this.f33233j = new ArrayList();
        this.f33234k = new ArrayList();
    }

    public MessageIdealEnquiryLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33230g = null;
        this.f33231h = null;
        this.f33232i = false;
        this.f33233j = new ArrayList();
        this.f33234k = new ArrayList();
    }
}
