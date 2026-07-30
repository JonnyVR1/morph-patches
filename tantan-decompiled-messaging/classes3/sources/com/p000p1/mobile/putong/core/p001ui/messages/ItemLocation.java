package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import java.util.List;
import l.c3c0;
import l.ei2;
import l.ejj;
import l.knb0;
import l.ngm;
import l.qib0;
import l.t100;
import l.ura;
import l.xdl0;
import l.y4c0;
import p003l.e30;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VLinear_MaxWidth;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemLocation extends LinearLayout implements InterfaceC0102a, View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public TextView f983a;

    /* JADX INFO: renamed from: b */
    public TextView f984b;

    /* JADX INFO: renamed from: c */
    public Message f985c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f986d;

    /* JADX INFO: renamed from: e */
    public VImage f987e;

    /* JADX INFO: renamed from: f */
    public VLinear_MaxWidth f988f;

    public ItemLocation(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f985c = message;
        this.f983a.setText(message.location.name);
        this.f984b.setText(message.location.address);
        int i = t100.i;
        this.f986d.setHierarchy(new ejj(getResources()).z(c3c0.k5).K(RoundingParams.b(i, i, 0.0f, 0.0f)).a());
        final Pair pairCreate = Pair.create(Double.valueOf(message.location.coordinates.first), Double.valueOf(message.location.coordinates.second));
        xdl0.Q0(this.f986d, new e30() { // from class: l.u5q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7927a.m1362c(pairCreate, (int[]) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m1362c(Pair pair, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        if (i > 800) {
            i2 = (i2 * 800) / i;
            i = 800;
        }
        this.f986d.setController(qib0.G.g(this.f986d).B(new C0077a()).N(Uri.parse("http://api.map.baidu.com/staticimage/v2?ak=islEGFAbydBfWxshdNB3jYeG&center=" + pair.second + "," + pair.first + "&width=" + i + "&height=" + i2 + "&zoom=19&mcode=93:E8:C2:C3:D3:8A:72:EC:04:85:85:70:B3:3F:E5:FB:69:31:CC:1B;com.p1.mobile.putong")).c());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        getContext().startActivity(CoreModule.P().i().f1(getContext(), this.f985c.location));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(y4c0.E2);
        this.f983a = textView;
        textView.getPaint().setFakeBoldText(true);
        this.f984b = (TextView) findViewById(y4c0.t0);
        this.f986d = (VDraweeView) findViewById(y4c0.o1);
        this.f987e = (VImage) findViewById(y4c0.U1);
        VLinear_MaxWidth vLinear_MaxWidth = (VLinear_MaxWidth) findViewById(y4c0.B5);
        this.f988f = vLinear_MaxWidth;
        vLinear_MaxWidth.setMaxWidth(t100.d(265.0f));
        setOnClickListener(this);
        setOnLongClickListener(this);
        if (ura.e().d().I4()) {
            xdl0.N(this.f987e, c3c0.i5);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return ItemMessageBase.m1395R(this).onLongClick(view);
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
    public class C0077a extends ei2<ngm> {
        public C0077a() {
        }

        /* JADX INFO: renamed from: d */
        public void m1364d(String str, Throwable th) {
            xdl0.M0(ItemLocation.this.f987e, false);
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void m1365e(String str, @Nullable ngm ngmVar, @Nullable Animatable animatable) {
            xdl0.M0(ItemLocation.this.f987e, true);
        }

        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void m1363b(String str, @Nullable ngm ngmVar) {
        }
    }
}
