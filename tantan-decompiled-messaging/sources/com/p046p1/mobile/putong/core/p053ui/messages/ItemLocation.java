package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import java.util.List;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear_MaxWidth;
import p149l.c3c0;
import p149l.e30;
import p149l.ei2;
import p149l.ejj;
import p149l.knb0;
import p149l.ngm;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLocation extends LinearLayout implements InterfaceC8519a, View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public TextView f31092a;

    /* JADX INFO: renamed from: b */
    public TextView f31093b;

    /* JADX INFO: renamed from: c */
    public Message f31094c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31095d;

    /* JADX INFO: renamed from: e */
    public VImage f31096e;

    /* JADX INFO: renamed from: f */
    public VLinear_MaxWidth f31097f;

    public ItemLocation(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31094c = message;
        this.f31092a.setText(message.location.name);
        this.f31093b.setText(message.location.address);
        int i = t100.f167260i;
        this.f31095d.setHierarchy(new ejj(getResources()).m116896z(c3c0.f78788k5).m116870K(RoundingParams.m8248b(i, i, 0.0f, 0.0f)).m116872a());
        final Pair pairCreate = Pair.create(Double.valueOf(message.location.coordinates.first), Double.valueOf(message.location.coordinates.second));
        xdl0.m208353Q0(this.f31095d, new e30() { // from class: l.u5q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f174746a.m48279c(pairCreate, (int[]) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m48279c(Pair pair, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        if (i > 800) {
            i2 = (i2 * 800) / i;
            i = 800;
        }
        this.f31095d.setController(qib0.f154691G.m184718g(this.f31095d).m8204B(new C8494a()).mo121501a(Uri.parse("http://api.map.baidu.com/staticimage/v2?ak=islEGFAbydBfWxshdNB3jYeG&center=" + pair.second + Constants.SEPARATOR_COMMA + pair.first + "&width=" + i + "&height=" + i2 + "&zoom=19&mcode=93:E8:C2:C3:D3:8A:72:EC:04:85:85:70:B3:3F:E5:FB:69:31:CC:1B;com.p1.mobile.putong")).build());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        getContext().startActivity(CoreModule.m29935P().m94658i().mo158373f1(getContext(), this.f31094c.location));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(y4c0.f195958E2);
        this.f31092a = textView;
        textView.getPaint().setFakeBoldText(true);
        this.f31093b = (TextView) findViewById(y4c0.f196221t0);
        this.f31095d = (VDraweeView) findViewById(y4c0.f196187o1);
        this.f31096e = (VImage) findViewById(y4c0.f196053U1);
        VLinear_MaxWidth vLinear_MaxWidth = (VLinear_MaxWidth) findViewById(y4c0.f195941B5);
        this.f31097f = vLinear_MaxWidth;
        vLinear_MaxWidth.setMaxWidth(t100.m186890d(265.0f));
        setOnClickListener(this);
        setOnLongClickListener(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            xdl0.m208346N(this.f31096e, c3c0.f78770i5);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return ItemMessageBase.m48311R(this).onLongClick(view);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public ItemLocation(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLocation(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemLocation$a */
    public class C8494a extends ei2<ngm> {
        public C8494a() {
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: d */
        public void mo48281d(String str, Throwable th) {
            xdl0.m208345M0(ItemLocation.this.f31096e, false);
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8234e(String str, @Nullable ngm ngmVar, @Nullable Animatable animatable) {
            xdl0.m208345M0(ItemLocation.this.f31096e, true);
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo48280b(String str, @Nullable ngm ngmVar) {
        }
    }
}
