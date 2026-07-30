package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import java.util.List;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.edc0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.ovb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMomentChat extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f32121a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f32122b;

    /* JADX INFO: renamed from: c */
    public View f32123c;

    /* JADX INFO: renamed from: d */
    public TextView f32124d;

    /* JADX INFO: renamed from: e */
    public TextView f32125e;

    /* JADX INFO: renamed from: f */
    public ItemText f32126f;

    /* JADX INFO: renamed from: g */
    public boolean f32127g;

    public ItemMomentChat(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m49684b() {
        l51.m152911q(this.f32126f.getText().toString());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32126f.mo43399A(message);
        if (!CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment)) {
        }
        bnl0.m105524M(this.f32121a, false);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return jyb.m147507f0(jyb.m147495Z(getContext().getString(R$string.f21676c), new Runnable() { // from class: l.acq
            @Override // java.lang.Runnable
            public final void run() {
                this.f69749a.m49684b();
            }
        }, Integer.valueOf(ibc0.f114176x1), null));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f32127g = z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32121a = (RelativeLayout) findViewById(edc0.f93493y2);
        this.f32122b = (VDraweeView) findViewById(edc0.f93444r2);
        this.f32123c = findViewById(edc0.f93486x2);
        this.f32124d = (TextView) findViewById(edc0.f93437q2);
        this.f32125e = (TextView) findViewById(edc0.f93500z2);
        this.f32126f = (ItemText) findViewById(edc0.f93168A4);
    }

    public ItemMomentChat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMomentChat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
