package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.newui.admob.GoogleAdAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemGoogleAdView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.t96;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemGoogleAdView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f25558a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f25559b;

    /* JADX INFO: renamed from: c */
    public VText f25560c;

    /* JADX INFO: renamed from: d */
    public VText f25561d;

    /* JADX INFO: renamed from: e */
    public TextView f25562e;

    public ConversationItemGoogleAdView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m41834a(boolean z, PutongAct putongAct, View view) {
        i4g0.m138520r(z ? "e_messages_match_list_ad" : "e_messages_message_list_ad", OMSDialogPositon.p_messages_view);
        putongAct.startActivity(GoogleAdAct.m37140a2(putongAct));
    }

    /* JADX INFO: renamed from: b */
    public final void m41835b(View view) {
        t96.m189736a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m41836c(final PutongAct putongAct, final boolean z) {
        i4g0.m138526x(z ? "e_messages_match_list_ad" : "e_messages_message_list_ad", OMSDialogPositon.p_messages_view);
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.s96
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemGoogleAdView.m41834a(z, putongAct, view);
            }
        });
        bnl0.m105524M(this.f25562e, true);
        bnl0.m105524M(this.f25560c, true);
        bnl0.m105524M(this.f25561d, false);
        this.f25558a.setImageResource(dbc0.f87603y9);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41835b(this);
    }

    public ConversationItemGoogleAdView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemGoogleAdView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
