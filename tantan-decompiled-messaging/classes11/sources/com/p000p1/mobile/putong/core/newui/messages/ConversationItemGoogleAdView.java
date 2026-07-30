package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.admob.GoogleAdAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemGoogleAdView;
import com.p1.mobile.putong.app.PutongAct;
import l.o86;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemGoogleAdView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f3594a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f3595b;

    /* JADX INFO: renamed from: c */
    public VText f3596c;

    /* JADX INFO: renamed from: d */
    public VText f3597d;

    /* JADX INFO: renamed from: e */
    public TextView f3598e;

    public ConversationItemGoogleAdView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m4921a(boolean z, PutongAct putongAct, View view) {
        zvf0.r(z ? "e_messages_match_list_ad" : "e_messages_message_list_ad", "p_messages_view");
        putongAct.startActivity(GoogleAdAct.m34Z1(putongAct));
    }

    /* JADX INFO: renamed from: b */
    public final void m4922b(View view) {
        o86.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m4923c(final PutongAct putongAct, final boolean z) {
        zvf0.x(z ? "e_messages_match_list_ad" : "e_messages_message_list_ad", "p_messages_view");
        xdl0.E0(this, new View.OnClickListener() { // from class: l.n86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemGoogleAdView.m4921a(z, putongAct, view);
            }
        });
        xdl0.M(this.f3598e, true);
        xdl0.M(this.f3596c, true);
        xdl0.M(this.f3597d, false);
        this.f3594a.setImageResource(x2c0.x9);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4922b(this);
    }

    public ConversationItemGoogleAdView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemGoogleAdView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
