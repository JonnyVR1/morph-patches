package com.p051p1.mobile.putong.core.newui.messages.business;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.VisitorDoorInfo;
import com.p051p1.mobile.putong.core.newui.intlmeet.IntlMeetAct;
import com.p051p1.mobile.putong.core.view.IntlVisitorLookUpView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Visitor;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p151v.VText_AutoFit;
import p153l.bnl0;
import p153l.dq1;
import p153l.eop;
import p153l.i4g0;
import p153l.joa;
import p153l.jyb;
import p153l.ner;
import p153l.psd0;
import p153l.uqb0;
import p153l.xri0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class IntlVisitorConversationView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f26495d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f26496e;

    /* JADX INFO: renamed from: f */
    public ViewStub f26497f;

    /* JADX INFO: renamed from: g */
    public VText f26498g;

    /* JADX INFO: renamed from: h */
    public VText f26499h;

    /* JADX INFO: renamed from: i */
    public IntlVisitorLookUpView f26500i;

    public IntlVisitorConversationView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m43311j0(View view) {
        eop.m121756a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m43312k0(View view) {
        i4g0.m138523u("e_intl_message_meet_entrance", OMSDialogPositon.p_messages_view, jyb.m147494Y("secondary_page_type", Visitor.TYPE));
        getContext().startActivity(IntlMeetAct.m40356Z1(getContext(), "", Visitor.TYPE));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m43313l0(VisitorDoorInfo visitorDoorInfo) {
        if (visitorDoorInfo == null || TextUtils.isEmpty(visitorDoorInfo.userID)) {
            return;
        }
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(visitorDoorInfo.userID);
        if (!TextUtils.isEmpty(visitorDoorInfo.title)) {
            this.f26498g.setText(xri0.m212837a(visitorDoorInfo.title, Color.parseColor("#F86E65")));
        }
        if (!TextUtils.isEmpty(visitorDoorInfo.describe)) {
            this.f26499h.setText(visitorDoorInfo.describe);
        }
        bnl0.m105524M(this.f26496e, false);
        if (visitorDoorInfo.unReadCount > 0) {
            bnl0.m105524M(this.f26496e, true);
            int i = visitorDoorInfo.unReadCount;
            VText_AutoFit vText_AutoFit = this.f26496e;
            if (i <= 99) {
                bnl0.m105515H0(vText_AutoFit, String.valueOf(i));
            } else {
                bnl0.m105515H0(vText_AutoFit, "99+");
            }
        }
        if (joa.m146361M3()) {
            uqb0.f180374G.m127115L0(this.f26495d, userM116503Pa.picture(0).url);
        } else {
            uqb0.f180374G.m127120O(this.f26495d, userM116503Pa.picture(0).url, 2, 20);
        }
        setLookUpViewVisibility(!joa.m146361M3());
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.dop
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89994a.m43312k0(view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public void m43314m0(ner nerVar, dq1<Conversation> dq1Var) {
        m43313l0(CoreModule.f18264c.f20409n1.m35270F3());
        dq1Var.mo68557c(nerVar, CoreModule.f18264c.f20409n1.m35271G3()).subscribe(psd0.m173596G(new y20() { // from class: l.cop
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f82903a.m43313l0((VisitorDoorInfo) obj);
            }
        }));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43311j0(this);
        this.f26498g.setTypeface(Typeface.DEFAULT_BOLD);
        this.f26500i = (IntlVisitorLookUpView) this.f26497f.inflate();
    }

    public void setLookUpViewVisibility(boolean z) {
        if (NullChecker.m82486a(this.f26497f) && (bnl0.m105529O0(this.f26500i) ^ z)) {
            bnl0.m105524M(this.f26500i, z);
        }
    }

    public IntlVisitorConversationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlVisitorConversationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
