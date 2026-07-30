package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.messages.ConversationHeadIntlSeeItem;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.e30;
import l.hmb;
import l.mkd0;
import l.n3b0;
import l.w9j;
import l.x9j;
import l.xdl0;
import p009l.i0g0;
import p009l.w8e0;
import v.VDraweeView;
import v.VFrame;
import v.VText;
import v.VText_AutoFit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationHeadIntlSeeItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f3507a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f3508b;

    /* JADX INFO: renamed from: c */
    public VText f3509c;

    /* JADX INFO: renamed from: d */
    public VText f3510d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadIntlSeeItem$a */
    public static class C0276a {
        /* JADX INFO: renamed from: b */
        public static void m4833b(ConversationHeadIntlSeeItem conversationHeadIntlSeeItem, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            conversationHeadIntlSeeItem.f3507a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            conversationHeadIntlSeeItem.f3508b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            conversationHeadIntlSeeItem.f3509c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            conversationHeadIntlSeeItem.f3510d = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }
    }

    public ConversationHeadIntlSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m4820G(View view) {
        w8e0.m24007d(getContext(), false, BusinessEntranceStyle.SEE);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ CoreLikers.a m4822s(CoreLikers.a aVar, Boolean bool) {
        return aVar;
    }

    /* JADX INFO: renamed from: E */
    public final void m4827E(View view) {
        C0276a.m4833b(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: F */
    public PutongAct m4828F() {
        return getContext();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m4829K(CoreLikers.a aVar) {
        if (NullChecker.a(aVar)) {
            if (aVar.c > 0) {
                xdl0.M(this.f3509c, true);
                xdl0.M(this.f3508b, false);
                this.f3509c.setText(aVar.c > 99 ? "99+" : String.format(Locale.getDefault(), "+%d", Integer.valueOf(aVar.c)));
                this.f3510d.setText(m4828F().getString(R.string.Om, Integer.valueOf(aVar.c)));
            } else {
                m4831M(aVar.b);
                this.f3510d.setText(m4828F().getString(R.string.Ds));
            }
            boolean zQ = n3b0.q();
            VDraweeView vDraweeView = this.f3507a;
            if (zQ) {
                hmb.w1(vDraweeView, w8e0.m24005b(aVar), w8e0.m24004a().intValue());
            } else {
                hmb.v1(vDraweeView, w8e0.m24005b(aVar), w8e0.m24004a().intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L */
    public void m4830L(ConversationHeadRecommendLayout.C0278b c0278b) {
        xdl0.E0(this, new View.OnClickListener() { // from class: l.f76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12842a.m4820G(view);
            }
        });
        c0278b.c(m4828F(), mkd0.r(CoreModule.c.u0.O6(), CoreModule.c.n3().map(new w9j() { // from class: l.g76
            public final Object call(Object obj) {
                return Boolean.valueOf(n3b0.q());
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.h76
            public final Object call(Object obj, Object obj2) {
                return ConversationHeadIntlSeeItem.m4822s((CoreLikers.a) obj, (Boolean) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.i76
            public final void call(Object obj) {
                this.f14416a.m4829K((CoreLikers.a) obj);
            }
        }));
        this.f3510d.setBackgroundResource(0);
    }

    /* JADX INFO: renamed from: M */
    public final void m4831M(int i) {
        xdl0.M(this.f3509c, false);
        xdl0.M(this.f3508b, true);
        VText_AutoFit vText_AutoFit = this.f3508b;
        if (i <= 1) {
            xdl0.M(vText_AutoFit, false);
        } else {
            vText_AutoFit.setText(i0g0.m16108G(i));
            xdl0.M(this.f3508b, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4827E(this);
    }

    public ConversationHeadIntlSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationHeadIntlSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
