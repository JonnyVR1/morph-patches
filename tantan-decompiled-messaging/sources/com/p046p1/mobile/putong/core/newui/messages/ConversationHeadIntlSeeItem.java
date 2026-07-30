package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.newui.messages.ConversationHeadIntlSeeItem;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VText;
import p147v.VText_AutoFit;
import p149l.e30;
import p149l.hmb;
import p149l.i0g0;
import p149l.mkd0;
import p149l.n3b0;
import p149l.w8e0;
import p149l.w9j;
import p149l.x9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationHeadIntlSeeItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f24729a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f24730b;

    /* JADX INFO: renamed from: c */
    public VText f24731c;

    /* JADX INFO: renamed from: d */
    public VText f24732d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadIntlSeeItem$a */
    public static class C8112a {
        /* JADX INFO: renamed from: b */
        public static void m40738b(ConversationHeadIntlSeeItem conversationHeadIntlSeeItem, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            conversationHeadIntlSeeItem.f24729a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            conversationHeadIntlSeeItem.f24730b = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            conversationHeadIntlSeeItem.f24731c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            conversationHeadIntlSeeItem.f24732d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }
    }

    public ConversationHeadIntlSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m40725G(View view) {
        w8e0.m202166d(getContext(), false, BusinessEntranceStyle.SEE);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ CoreLikers.C4719a m40727s(CoreLikers.C4719a c4719a, Boolean bool) {
        return c4719a;
    }

    /* JADX INFO: renamed from: E */
    public final void m40732E(View view) {
        C8112a.m40738b(this, view);
    }

    /* JADX INFO: renamed from: F */
    public PutongAct m40733F() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m40734K(CoreLikers.C4719a c4719a) {
        if (NullChecker.m81303a(c4719a)) {
            if (c4719a.f19271c > 0) {
                xdl0.m208344M(this.f24731c, true);
                xdl0.m208344M(this.f24730b, false);
                this.f24731c.setText(c4719a.f19271c > 99 ? "99+" : String.format(Locale.getDefault(), "+%d", Integer.valueOf(c4719a.f19271c)));
                this.f24732d.setText(m40733F().getString(R$string.f18009Om, Integer.valueOf(c4719a.f19271c)));
            } else {
                m40736M(c4719a.f19270b);
                this.f24732d.setText(m40733F().getString(R$string.f17685Ds));
            }
            boolean zM157742q = n3b0.m157742q();
            VDraweeView vDraweeView = this.f24729a;
            if (zM157742q) {
                hmb.m131718w1(vDraweeView, w8e0.m202164b(c4719a), w8e0.m202163a().intValue());
            } else {
                hmb.m131717v1(vDraweeView, w8e0.m202164b(c4719a), w8e0.m202163a().intValue());
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m40735L(ConversationHeadRecommendLayout.C8114b c8114b) {
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.f76
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96201a.m40725G(view);
            }
        });
        c8114b.mo67374c(m40733F(), mkd0.m154984r(CoreModule.f17545c.f19687u0.m30405O6(), CoreModule.f17545c.m31483n3().map(new w9j() { // from class: l.g76
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(n3b0.m157742q());
            }
        }).distinctUntilChanged(), new x9j() { // from class: l.h76
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return ConversationHeadIntlSeeItem.m40727s((CoreLikers.C4719a) obj, (Boolean) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.i76
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111833a.m40734K((CoreLikers.C4719a) obj);
            }
        }));
        this.f24732d.setBackgroundResource(0);
    }

    /* JADX INFO: renamed from: M */
    public final void m40736M(int i) {
        xdl0.m208344M(this.f24731c, false);
        xdl0.m208344M(this.f24730b, true);
        VText_AutoFit vText_AutoFit = this.f24730b;
        if (i <= 1) {
            xdl0.m208344M(vText_AutoFit, false);
        } else {
            vText_AutoFit.setText(i0g0.m133840G(i));
            xdl0.m208344M(this.f24730b, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40732E(this);
    }

    public ConversationHeadIntlSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationHeadIntlSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
