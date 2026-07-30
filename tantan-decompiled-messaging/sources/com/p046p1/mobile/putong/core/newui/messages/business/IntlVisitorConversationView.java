package com.p046p1.mobile.putong.core.newui.messages.business;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.VisitorDoorInfo;
import com.p046p1.mobile.putong.core.newui.intlmeet.IntlMeetAct;
import com.p046p1.mobile.putong.core.view.IntlVisitorLookUpView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Visitor;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VText;
import p147v.VText_AutoFit;
import p149l.e30;
import p149l.emp;
import p149l.mcr;
import p149l.mkd0;
import p149l.qib0;
import p149l.vwb;
import p149l.wp1;
import p149l.xdl0;
import p149l.xii0;
import p149l.xma;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class IntlVisitorConversationView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f25753d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f25754e;

    /* JADX INFO: renamed from: f */
    public ViewStub f25755f;

    /* JADX INFO: renamed from: g */
    public VText f25756g;

    /* JADX INFO: renamed from: h */
    public VText f25757h;

    /* JADX INFO: renamed from: i */
    public IntlVisitorLookUpView f25758i;

    public IntlVisitorConversationView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m42300j0(View view) {
        emp.m117214a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m42301k0(View view) {
        zvf0.m220399u("e_intl_message_meet_entrance", OMSDialogPositon.p_messages_view, vwb.m200311Y("secondary_page_type", Visitor.TYPE));
        getContext().startActivity(IntlMeetAct.m39353Y1(getContext(), "", Visitor.TYPE));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m42302l0(VisitorDoorInfo visitorDoorInfo) {
        if (visitorDoorInfo == null || TextUtils.isEmpty(visitorDoorInfo.userID)) {
            return;
        }
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(visitorDoorInfo.userID);
        if (!TextUtils.isEmpty(visitorDoorInfo.title)) {
            this.f25756g.setText(xii0.m209653a(visitorDoorInfo.title, Color.parseColor("#F86E65")));
        }
        if (!TextUtils.isEmpty(visitorDoorInfo.describe)) {
            this.f25757h.setText(visitorDoorInfo.describe);
        }
        xdl0.m208344M(this.f25754e, false);
        if (visitorDoorInfo.unReadCount > 0) {
            xdl0.m208344M(this.f25754e, true);
            int i = visitorDoorInfo.unReadCount;
            VText_AutoFit vText_AutoFit = this.f25754e;
            if (i <= 99) {
                xdl0.m208335H0(vText_AutoFit, String.valueOf(i));
            } else {
                xdl0.m208335H0(vText_AutoFit, "99+");
            }
        }
        if (xma.m210047L3()) {
            qib0.f154691G.m102331L0(this.f25753d, userM169430Pa.picture(0).url);
        } else {
            qib0.f154691G.m102336O(this.f25753d, userM169430Pa.picture(0).url, 2, 20);
        }
        setLookUpViewVisibility(!xma.m210047L3());
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.dmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f86981a.m42301k0(view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public void m42303m0(mcr mcrVar, wp1<Conversation> wp1Var) {
        m42302l0(CoreModule.f17545c.f19667n1.m34267F3());
        wp1Var.mo67374c(mcrVar, CoreModule.f17545c.f19667n1.m34268G3()).subscribe(mkd0.m154955G(new e30() { // from class: l.cmp
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81597a.m42302l0((VisitorDoorInfo) obj);
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
        m42300j0(this);
        this.f25756g.setTypeface(Typeface.DEFAULT_BOLD);
        this.f25758i = (IntlVisitorLookUpView) this.f25755f.inflate();
    }

    public void setLookUpViewVisibility(boolean z) {
        if (NullChecker.m81303a(this.f25755f) && (xdl0.m208349O0(this.f25758i) ^ z)) {
            xdl0.m208344M(this.f25758i, z);
        }
    }

    public IntlVisitorConversationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlVisitorConversationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
