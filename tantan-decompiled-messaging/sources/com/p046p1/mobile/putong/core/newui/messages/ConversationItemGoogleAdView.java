package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.newui.admob.GoogleAdAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemGoogleAdView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import p147v.VImage;
import p147v.VText;
import p149l.o86;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemGoogleAdView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f24816a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f24817b;

    /* JADX INFO: renamed from: c */
    public VText f24818c;

    /* JADX INFO: renamed from: d */
    public VText f24819d;

    /* JADX INFO: renamed from: e */
    public TextView f24820e;

    public ConversationItemGoogleAdView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m40823a(boolean z, PutongAct putongAct, View view) {
        zvf0.m220396r(z ? "e_messages_match_list_ad" : "e_messages_message_list_ad", OMSDialogPositon.p_messages_view);
        putongAct.startActivity(GoogleAdAct.m36137Z1(putongAct));
    }

    /* JADX INFO: renamed from: b */
    public final void m40824b(View view) {
        o86.m163109a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m40825c(final PutongAct putongAct, final boolean z) {
        zvf0.m220402x(z ? "e_messages_match_list_ad" : "e_messages_message_list_ad", OMSDialogPositon.p_messages_view);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.n86
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemGoogleAdView.m40823a(z, putongAct, view);
            }
        });
        xdl0.m208344M(this.f24820e, true);
        xdl0.m208344M(this.f24818c, true);
        xdl0.m208344M(this.f24819d, false);
        this.f24816a.setImageResource(x2c0.f190708x9);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40824b(this);
    }

    public ConversationItemGoogleAdView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemGoogleAdView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
