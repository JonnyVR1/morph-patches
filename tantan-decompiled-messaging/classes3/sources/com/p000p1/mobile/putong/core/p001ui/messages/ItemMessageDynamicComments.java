package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.messages.view.MessageLinearMaxWidth;
import com.p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.knb0;
import l.ura;
import l.xdl0;
import l.y4c0;
import p003l.dml;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageDynamicComments extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public ItemText f1048a;

    /* JADX INFO: renamed from: b */
    public MessageLinearMaxWidth f1049b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f1050c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f1051d;

    /* JADX INFO: renamed from: e */
    public VImage f1052e;

    /* JADX INFO: renamed from: f */
    public VLinear f1053f;

    /* JADX INFO: renamed from: g */
    public TextView f1054g;

    /* JADX INFO: renamed from: h */
    public TextView f1055h;

    /* JADX INFO: renamed from: i */
    public String f1056i;

    public ItemMessageDynamicComments(Context context) {
        super(context);
        this.f1056i = "";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: U */
    public void mo1068U(dml dmlVar, Message message, InterfaceC0102a.a aVar) {
        if (TEnum.equals(message.messageType, "moment_like")) {
            message.value = "赞了动态";
        }
        this.f1048a.mo1056A(message);
        xdl0.M(this.f1049b, false);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1048a = (ItemText) findViewById(y4c0.A4);
        this.f1049b = findViewById(y4c0.o2);
        this.f1050c = (FrameLayout) findViewById(y4c0.B0);
        this.f1051d = (VDraweeView) findViewById(y4c0.A0);
        this.f1052e = (VImage) findViewById(y4c0.C0);
        this.f1053f = (VLinear) findViewById(y4c0.y0);
        this.f1054g = (TextView) findViewById(y4c0.z0);
        this.f1055h = (TextView) findViewById(y4c0.D0);
        if (ura.e().d().I4()) {
            this.f1054g.setTextColor(getResources().getColor(a1c0.g));
            this.f1055h.setTextColor(getResources().getColor(a1c0.i));
            this.f1052e.setImageResource(c3c0.l1);
        }
    }

    public ItemMessageDynamicComments(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1056i = "";
    }

    public ItemMessageDynamicComments(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1056i = "";
    }
}
