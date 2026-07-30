package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import java.util.List;
import l.c3c0;
import l.e51;
import l.knb0;
import l.vwb;
import l.xdl0;
import l.y4c0;
import p028v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMomentChat extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f1164a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1165b;

    /* JADX INFO: renamed from: c */
    public View f1166c;

    /* JADX INFO: renamed from: d */
    public TextView f1167d;

    /* JADX INFO: renamed from: e */
    public TextView f1168e;

    /* JADX INFO: renamed from: f */
    public ItemText f1169f;

    /* JADX INFO: renamed from: g */
    public boolean f1170g;

    public ItemMomentChat(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m1585b() {
        e51.q(this.f1169f.getText().toString());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1169f.mo1056A(message);
        if (!CoreMomentInfo.LOCAL_ID_INVALID.equals(message.moment)) {
            CoreModule.N().Mh(message.moment, CoreMomentInfo.JSON_ADAPTER);
        }
        xdl0.M(this.f1164a, false);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return vwb.f0(new knb0[]{vwb.Z(getContext().getString(R.string.c), new Runnable() { // from class: l.aaq
            @Override // java.lang.Runnable
            public final void run() {
                this.f2101a.m1585b();
            }
        }, Integer.valueOf(c3c0.x1), (Object) null)});
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f1170g = z;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1164a = (RelativeLayout) findViewById(y4c0.y2);
        this.f1165b = (VDraweeView) findViewById(y4c0.r2);
        this.f1166c = findViewById(y4c0.x2);
        this.f1167d = (TextView) findViewById(y4c0.q2);
        this.f1168e = (TextView) findViewById(y4c0.z2);
        this.f1169f = (ItemText) findViewById(y4c0.A4);
    }

    public ItemMomentChat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemMomentChat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
