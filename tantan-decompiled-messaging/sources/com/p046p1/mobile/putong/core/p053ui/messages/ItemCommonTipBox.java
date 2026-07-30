package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CommonTipBox;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemCommonTipBox;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.e30;
import p149l.eqh0;
import p149l.j000;
import p149l.j2e0;
import p149l.lsi0;
import p149l.m2q;
import p149l.mkd0;
import p149l.o6j0;
import p149l.qib0;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemCommonTipBox extends VLinear {

    /* JADX INFO: renamed from: c */
    public ItemCommonTipBox f30894c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f30895d;

    /* JADX INFO: renamed from: e */
    public VText f30896e;

    /* JADX INFO: renamed from: f */
    public VText f30897f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f30898g;

    public ItemCommonTipBox(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m48102P(boolean z, CommonTipBox commonTipBox, Act act, View view) {
        if (!CoreModule.m29935P().m94651a().mo33614w()) {
            lsi0.m151595y("功能已下线");
            return;
        }
        o6j0.m162859c("e_chat_complete_profile", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("is_profile_complete", z ? "false" : "true"));
        if (z && !TextUtils.isEmpty(commonTipBox.schema)) {
            j2e0.m139446m(act, Uri.parse(commonTipBox.schema));
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m48104R(View view) {
        m2q.m152701a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m48105S(final CommonTipBox commonTipBox, final Act act, User user) {
        boolean zMo33715Kq = ura.m195053e().m195057d().mo33715Kq(user);
        final boolean z = !zMo33715Kq;
        String str = !zMo33715Kq ? commonTipBox.button : commonTipBox.disabledButton;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText_Bold vText_Bold = this.f30898g;
        if (zIsEmpty) {
            xdl0.m208344M(vText_Bold, false);
        } else {
            vText_Bold.setText(str);
            VText_Bold vText_Bold2 = this.f30898g;
            if (zMo33715Kq) {
                vText_Bold2.setTextColor(Color.parseColor("#33000000"));
            } else {
                vText_Bold2.setTextColor(Color.parseColor("#FE7E1D"));
            }
            xdl0.m208344M(this.f30898g, true);
        }
        o6j0.m162864h("e_chat_complete_profile", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("is_profile_complete", !zMo33715Kq ? "false" : "true"));
        xdl0.m208329E0(this.f30898g, new View.OnClickListener() { // from class: l.j2q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemCommonTipBox.m48102P(z, commonTipBox, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m48106T(final Act act, j000 j000Var, Message message) {
        this.f30896e.setTypeface(eqh0.m117752c(3), 1);
        if (!NullChecker.m81303a(message) || !NullChecker.m81303a(message.additionalData) || !NullChecker.m81303a(message.additionalData.commonTipBox)) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this, true);
        final CommonTipBox commonTipBox = message.additionalData.commonTipBox;
        if (!TextUtils.isEmpty(commonTipBox.iconUrl)) {
            qib0.f154691G.m102331L0(this.f30895d, commonTipBox.iconUrl);
        }
        if (!TextUtils.isEmpty(commonTipBox.title)) {
            this.f30896e.setText(commonTipBox.title);
        }
        if (!TextUtils.isEmpty(commonTipBox.subtitle)) {
            this.f30897f.setText(commonTipBox.subtitle);
        }
        j000Var.mo67374c(act, CoreModule.f17545c.f19639e0.m169410Ka(CoreModule.m29931H().userId())).subscribe(mkd0.m154955G(new e30() { // from class: l.i2q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110574a.m48105S(commonTipBox, act, (User) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48104R(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30896e.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f30898g.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemCommonTipBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCommonTipBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
