package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageLinearMaxWidth;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.ovb0;
import p153l.pol;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageDynamicComments extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemText f32005a;

    /* JADX INFO: renamed from: b */
    public MessageLinearMaxWidth f32006b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f32007c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f32008d;

    /* JADX INFO: renamed from: e */
    public VImage f32009e;

    /* JADX INFO: renamed from: f */
    public VLinear f32010f;

    /* JADX INFO: renamed from: g */
    public TextView f32011g;

    /* JADX INFO: renamed from: h */
    public TextView f32012h;

    /* JADX INFO: renamed from: i */
    public String f32013i;

    public ItemMessageDynamicComments(Context context) {
        super(context);
        this.f32013i = "";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(pol polVar, Message message, InterfaceC8682a.a aVar) {
        if (TEnum.equals(message.messageType, "moment_like")) {
            message.value = "赞了动态";
        }
        this.f32005a.mo43399A(message);
        bnl0.m105524M(this.f32006b, false);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32005a = (ItemText) findViewById(edc0.f93168A4);
        this.f32006b = (MessageLinearMaxWidth) findViewById(edc0.f93423o2);
        this.f32007c = (FrameLayout) findViewById(edc0.f93171B0);
        this.f32008d = (VDraweeView) findViewById(edc0.f93164A0);
        this.f32009e = (VImage) findViewById(edc0.f93178C0);
        this.f32010f = (VLinear) findViewById(edc0.f93491y0);
        this.f32011g = (TextView) findViewById(edc0.f93498z0);
        this.f32012h = (TextView) findViewById(edc0.f93185D0);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32011g.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32012h.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32009e.setImageResource(ibc0.f114068l1);
        }
    }

    public ItemMessageDynamicComments(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32013i = "";
    }

    public ItemMessageDynamicComments(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32013i = "";
    }
}
