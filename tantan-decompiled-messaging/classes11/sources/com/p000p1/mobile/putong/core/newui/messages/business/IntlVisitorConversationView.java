package com.p000p1.mobile.putong.core.newui.messages.business;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.intlmeet.IntlMeetAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.VisitorDoorInfo;
import com.p1.mobile.putong.core.view.IntlVisitorLookUpView;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.emp;
import l.j760;
import l.mcr;
import l.mkd0;
import l.qib0;
import l.vwb;
import l.wp1;
import l.xdl0;
import l.xii0;
import l.xma;
import l.zvf0;
import v.VDraweeView;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IntlVisitorConversationView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f4531d;

    /* JADX INFO: renamed from: e */
    public VText_AutoFit f4532e;

    /* JADX INFO: renamed from: f */
    public ViewStub f4533f;

    /* JADX INFO: renamed from: g */
    public VText f4534g;

    /* JADX INFO: renamed from: h */
    public VText f4535h;

    /* JADX INFO: renamed from: i */
    public IntlVisitorLookUpView f4536i;

    public IntlVisitorConversationView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m6452j0(View view) {
        emp.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m6453k0(View view) {
        zvf0.u("e_intl_message_meet_entrance", "p_messages_view", new j760[]{vwb.Y("secondary_page_type", "visitor")});
        getContext().startActivity(IntlMeetAct.m3385Y1(getContext(), "", "visitor"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l0 */
    public final void m6454l0(VisitorDoorInfo visitorDoorInfo) {
        if (visitorDoorInfo == null || TextUtils.isEmpty(visitorDoorInfo.userID)) {
            return;
        }
        User userPa = CoreModule.c.e0.Pa(visitorDoorInfo.userID);
        if (!TextUtils.isEmpty(visitorDoorInfo.title)) {
            this.f4534g.setText(xii0.a(visitorDoorInfo.title, Color.parseColor("#F86E65")));
        }
        if (!TextUtils.isEmpty(visitorDoorInfo.describe)) {
            this.f4535h.setText(visitorDoorInfo.describe);
        }
        xdl0.M(this.f4532e, false);
        if (visitorDoorInfo.unReadCount > 0) {
            xdl0.M(this.f4532e, true);
            int i = visitorDoorInfo.unReadCount;
            VText_AutoFit vText_AutoFit = this.f4532e;
            if (i <= 99) {
                xdl0.H0(vText_AutoFit, String.valueOf(i));
            } else {
                xdl0.H0(vText_AutoFit, "99+");
            }
        }
        if (xma.L3()) {
            qib0.G.L0(this.f4531d, ((Media) userPa.picture(0)).url);
        } else {
            qib0.G.O(this.f4531d, ((Media) userPa.picture(0)).url, 2, 20);
        }
        setLookUpViewVisibility(!xma.L3());
        xdl0.E0(this, new View.OnClickListener() { // from class: l.dmp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11912a.m6453k0(view);
            }
        });
    }

    /* JADX INFO: renamed from: m0 */
    public void m6455m0(mcr mcrVar, wp1<Conversation> wp1Var) {
        m6454l0(CoreModule.c.n1.F3());
        wp1Var.c(mcrVar, CoreModule.c.n1.G3()).subscribe(mkd0.G(new e30() { // from class: l.cmp
            public final void call(Object obj) {
                this.f10697a.m6454l0((VisitorDoorInfo) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.view.View*/.onAttachedToWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m6452j0(this);
        this.f4534g.setTypeface(Typeface.DEFAULT_BOLD);
        this.f4536i = this.f4533f.inflate();
    }

    public void setLookUpViewVisibility(boolean z) {
        if (NullChecker.a(this.f4533f) && (xdl0.O0(this.f4536i) ^ z)) {
            xdl0.M(this.f4536i, z);
        }
    }

    public IntlVisitorConversationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public IntlVisitorConversationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
