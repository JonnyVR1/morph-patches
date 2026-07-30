package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CommonTipBox;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemCommonTipBox;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.g900;
import p153l.g9c0;
import p153l.gta;
import p153l.lyh0;
import p153l.m4q;
import p153l.nae0;
import p153l.o1j0;
import p153l.psd0;
import p153l.sfj0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemCommonTipBox extends VLinear {

    /* JADX INFO: renamed from: c */
    public ItemCommonTipBox f31742c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31743d;

    /* JADX INFO: renamed from: e */
    public VText f31744e;

    /* JADX INFO: renamed from: f */
    public VText f31745f;

    /* JADX INFO: renamed from: g */
    public VText_Bold f31746g;

    public ItemCommonTipBox(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m49285P(boolean z, CommonTipBox commonTipBox, Act act, View view) {
        if (!CoreModule.m30933P().m143405a().mo34617w()) {
            o1j0.m165651y("功能已下线");
            return;
        }
        sfj0.m185596c("e_chat_complete_profile", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("is_profile_complete", z ? "false" : "true"));
        if (z && !TextUtils.isEmpty(commonTipBox.schema)) {
            nae0.m162083m(act, Uri.parse(commonTipBox.schema));
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m49287R(View view) {
        m4q.m157050a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m49288S(final CommonTipBox commonTipBox, final Act act, User user) {
        boolean zMo34718Kq = gta.m132210e().m132214d().mo34718Kq(user);
        final boolean z = !zMo34718Kq;
        String str = !zMo34718Kq ? commonTipBox.button : commonTipBox.disabledButton;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        VText_Bold vText_Bold = this.f31746g;
        if (zIsEmpty) {
            bnl0.m105524M(vText_Bold, false);
        } else {
            vText_Bold.setText(str);
            VText_Bold vText_Bold2 = this.f31746g;
            if (zMo34718Kq) {
                vText_Bold2.setTextColor(Color.parseColor("#33000000"));
            } else {
                vText_Bold2.setTextColor(Color.parseColor("#FE7E1D"));
            }
            bnl0.m105524M(this.f31746g, true);
        }
        sfj0.m185601h("e_chat_complete_profile", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("is_profile_complete", !zMo34718Kq ? "false" : "true"));
        bnl0.m105509E0(this.f31746g, new View.OnClickListener() { // from class: l.j4q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ItemCommonTipBox.m49285P(z, commonTipBox, act, view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m49289T(final Act act, g900 g900Var, Message message) {
        this.f31744e.setTypeface(lyh0.m156283c(3), 1);
        if (!NullChecker.m82486a(message) || !NullChecker.m82486a(message.additionalData) || !NullChecker.m82486a(message.additionalData.commonTipBox)) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this, true);
        final CommonTipBox commonTipBox = message.additionalData.commonTipBox;
        if (!TextUtils.isEmpty(commonTipBox.iconUrl)) {
            uqb0.f180374G.m127115L0(this.f31743d, commonTipBox.iconUrl);
        }
        if (!TextUtils.isEmpty(commonTipBox.title)) {
            this.f31744e.setText(commonTipBox.title);
        }
        if (!TextUtils.isEmpty(commonTipBox.subtitle)) {
            this.f31745f.setText(commonTipBox.subtitle);
        }
        g900Var.mo68557c(act, CoreModule.f18264c.f20381e0.m116483Ka(CoreModule.m30929H().userId())).subscribe(psd0.m173596G(new y20() { // from class: l.i4q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112933a.m49288S(commonTipBox, act, (User) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49287R(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31744e.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f31746g.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemCommonTipBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemCommonTipBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
