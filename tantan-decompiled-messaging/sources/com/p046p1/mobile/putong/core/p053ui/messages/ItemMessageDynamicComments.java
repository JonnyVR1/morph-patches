package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageLinearMaxWidth;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p149l.a1c0;
import p149l.c3c0;
import p149l.dml;
import p149l.knb0;
import p149l.ura;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageDynamicComments extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemText f31157a;

    /* JADX INFO: renamed from: b */
    public MessageLinearMaxWidth f31158b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f31159c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31160d;

    /* JADX INFO: renamed from: e */
    public VImage f31161e;

    /* JADX INFO: renamed from: f */
    public VLinear f31162f;

    /* JADX INFO: renamed from: g */
    public TextView f31163g;

    /* JADX INFO: renamed from: h */
    public TextView f31164h;

    /* JADX INFO: renamed from: i */
    public String f31165i;

    public ItemMessageDynamicComments(Context context) {
        super(context);
        this.f31165i = "";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(dml dmlVar, Message message, InterfaceC8519a.a aVar) {
        if (TEnum.equals(message.messageType, "moment_like")) {
            message.value = "赞了动态";
        }
        this.f31157a.mo42388A(message);
        xdl0.m208344M(this.f31158b, false);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31157a = (ItemText) findViewById(y4c0.f195933A4);
        this.f31158b = (MessageLinearMaxWidth) findViewById(y4c0.f196188o2);
        this.f31159c = (FrameLayout) findViewById(y4c0.f195936B0);
        this.f31160d = (VDraweeView) findViewById(y4c0.f195929A0);
        this.f31161e = (VImage) findViewById(y4c0.f195943C0);
        this.f31162f = (VLinear) findViewById(y4c0.f196256y0);
        this.f31163g = (TextView) findViewById(y4c0.f196263z0);
        this.f31164h = (TextView) findViewById(y4c0.f195950D0);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31163g.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31164h.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31161e.setImageResource(c3c0.f78793l1);
        }
    }

    public ItemMessageDynamicComments(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31165i = "";
    }

    public ItemMessageDynamicComments(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31165i = "";
    }
}
