package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.newui.messages.ConversationHeadIntlSeeItem;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessEntranceStyle;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VText;
import p151v.VText_AutoFit;
import p153l.bhe0;
import p153l.bnl0;
import p153l.psd0;
import p153l.q8g0;
import p153l.qcj;
import p153l.rbb0;
import p153l.rcj;
import p153l.vnb;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationHeadIntlSeeItem extends VFrame {

    /* JADX INFO: renamed from: a */
    public VDraweeView f25471a;

    /* JADX INFO: renamed from: b */
    public VText_AutoFit f25472b;

    /* JADX INFO: renamed from: c */
    public VText f25473c;

    /* JADX INFO: renamed from: d */
    public VText f25474d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadIntlSeeItem$a */
    public static class C8263a {
        /* JADX INFO: renamed from: b */
        public static void m41749b(ConversationHeadIntlSeeItem conversationHeadIntlSeeItem, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            conversationHeadIntlSeeItem.f25471a = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            conversationHeadIntlSeeItem.f25472b = (VText_AutoFit) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            conversationHeadIntlSeeItem.f25473c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            conversationHeadIntlSeeItem.f25474d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        }
    }

    public ConversationHeadIntlSeeItem(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m41736G(View view) {
        bhe0.m104331d(getContext(), false, BusinessEntranceStyle.SEE);
    }

    /* JADX INFO: renamed from: s */
    public static /* synthetic */ CoreLikers.C4870a m41738s(CoreLikers.C4870a c4870a, Boolean bool) {
        return c4870a;
    }

    /* JADX INFO: renamed from: E */
    public final void m41743E(View view) {
        C8263a.m41749b(this, view);
    }

    /* JADX INFO: renamed from: F */
    public PutongAct m41744F() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m41745K(CoreLikers.C4870a c4870a) {
        if (NullChecker.m82486a(c4870a)) {
            if (c4870a.f20013c > 0) {
                bnl0.m105524M(this.f25473c, true);
                bnl0.m105524M(this.f25472b, false);
                this.f25473c.setText(c4870a.f20013c > 99 ? "99+" : String.format(Locale.getDefault(), "+%d", Integer.valueOf(c4870a.f20013c)));
                this.f25474d.setText(m41744F().getString(R$string.f19407kn, Integer.valueOf(c4870a.f20013c)));
            } else {
                m41747M(c4870a.f20012b);
                this.f25474d.setText(m41744F().getString(R$string.f19075Zs));
            }
            boolean zM180744q = rbb0.m180744q();
            VDraweeView vDraweeView = this.f25471a;
            if (zM180744q) {
                vnb.m201963w1(vDraweeView, bhe0.m104329b(c4870a), bhe0.m104328a().intValue());
            } else {
                vnb.m201962v1(vDraweeView, bhe0.m104329b(c4870a), bhe0.m104328a().intValue());
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m41746L(ConversationHeadRecommendLayout.C8265b c8265b) {
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.k86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124361a.m41736G(view);
            }
        });
        c8265b.mo68557c(m41744F(), psd0.m173625r(CoreModule.f18264c.f20429u0.m31415S6(), CoreModule.f18264c.m32486n3().map(new qcj() { // from class: l.l86
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(rbb0.m180744q());
            }
        }).distinctUntilChanged(), new rcj() { // from class: l.m86
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return ConversationHeadIntlSeeItem.m41738s((CoreLikers.C4870a) obj, (Boolean) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.n86
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140653a.m41745K((CoreLikers.C4870a) obj);
            }
        }));
        this.f25474d.setBackgroundResource(0);
    }

    /* JADX INFO: renamed from: M */
    public final void m41747M(int i) {
        bnl0.m105524M(this.f25473c, false);
        bnl0.m105524M(this.f25472b, true);
        VText_AutoFit vText_AutoFit = this.f25472b;
        if (i <= 1) {
            bnl0.m105524M(vText_AutoFit, false);
        } else {
            vText_AutoFit.setText(q8g0.m175775G(i));
            bnl0.m105524M(this.f25472b, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41743E(this);
    }

    public ConversationHeadIntlSeeItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationHeadIntlSeeItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
