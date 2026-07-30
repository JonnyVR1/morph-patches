package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import java.util.List;
import p147v.VDraweeView;
import p149l.c3c0;
import p149l.e51;
import p149l.knb0;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMomentChat extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f31273a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31274b;

    /* JADX INFO: renamed from: c */
    public View f31275c;

    /* JADX INFO: renamed from: d */
    public TextView f31276d;

    /* JADX INFO: renamed from: e */
    public TextView f31277e;

    /* JADX INFO: renamed from: f */
    public ItemText f31278f;

    /* JADX INFO: renamed from: g */
    public boolean f31279g;

    public ItemMomentChat(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m48501b() {
        e51.m114766q(this.f31278f.getText().toString());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31278f.mo42388A(message);
        if (!CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment)) {
        }
        xdl0.m208344M(this.f31273a, false);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return vwb.m200324f0(vwb.m200312Z(getContext().getString(R$string.f20934c), new Runnable() { // from class: l.aaq
            @Override // java.lang.Runnable
            public final void run() {
                this.f68593a.m48501b();
            }
        }, Integer.valueOf(c3c0.f78901x1), null));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f31279g = z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31273a = (RelativeLayout) findViewById(y4c0.f196258y2);
        this.f31274b = (VDraweeView) findViewById(y4c0.f196209r2);
        this.f31275c = findViewById(y4c0.f196251x2);
        this.f31276d = (TextView) findViewById(y4c0.f196202q2);
        this.f31277e = (TextView) findViewById(y4c0.f196265z2);
        this.f31278f = (ItemText) findViewById(y4c0.f195933A4);
    }

    public ItemMomentChat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMomentChat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
