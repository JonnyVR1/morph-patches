package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import java.util.List;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_MaxWidth;
import p153l.bnl0;
import p153l.edc0;
import p153l.gta;
import p153l.ibc0;
import p153l.li2;
import p153l.ovb0;
import p153l.qa00;
import p153l.qim;
import p153l.uqb0;
import p153l.xlj;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLocation extends LinearLayout implements InterfaceC8682a, View.OnClickListener, View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public TextView f31940a;

    /* JADX INFO: renamed from: b */
    public TextView f31941b;

    /* JADX INFO: renamed from: c */
    public Message f31942c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31943d;

    /* JADX INFO: renamed from: e */
    public VImage f31944e;

    /* JADX INFO: renamed from: f */
    public VLinear_MaxWidth f31945f;

    public ItemLocation(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f31942c = message;
        this.f31940a.setText(message.location.name);
        this.f31941b.setText(message.location.address);
        int i = qa00.f156322i;
        this.f31943d.setHierarchy(new xlj(getResources()).m211662z(ibc0.f114063k5).m211636K(RoundingParams.m8302b(i, i, 0.0f, 0.0f)).m211638a());
        final Pair pairCreate = Pair.create(Double.valueOf(message.location.coordinates.first), Double.valueOf(message.location.coordinates.second));
        bnl0.m105533Q0(this.f31943d, new y20() { // from class: l.u7q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177929a.m49462c(pairCreate, (int[]) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m49462c(Pair pair, int[] iArr) {
        int i = iArr[0];
        int i2 = iArr[1];
        if (i > 800) {
            i2 = (i2 * 800) / i;
            i = 800;
        }
        this.f31943d.setController(uqb0.f180374G.m98791g(this.f31943d).m8258B(new C8657a()).mo155332a(Uri.parse("http://api.map.baidu.com/staticimage/v2?ak=islEGFAbydBfWxshdNB3jYeG&center=" + pair.second + Constants.SEPARATOR_COMMA + pair.first + "&width=" + i + "&height=" + i2 + "&zoom=19&mcode=93:E8:C2:C3:D3:8A:72:EC:04:85:85:70:B3:3F:E5:FB:69:31:CC:1B;com.p1.mobile.putong")).build());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        getContext().startActivity(CoreModule.m30933P().m143412i().mo180465f1(getContext(), this.f31942c.location));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(edc0.f93193E2);
        this.f31940a = textView;
        textView.getPaint().setFakeBoldText(true);
        this.f31941b = (TextView) findViewById(edc0.f93456t0);
        this.f31943d = (VDraweeView) findViewById(edc0.f93422o1);
        this.f31944e = (VImage) findViewById(edc0.f93288U1);
        VLinear_MaxWidth vLinear_MaxWidth = (VLinear_MaxWidth) findViewById(edc0.f93176B5);
        this.f31945f = vLinear_MaxWidth;
        vLinear_MaxWidth.setMaxWidth(qa00.m175859d(265.0f));
        setOnClickListener(this);
        setOnLongClickListener(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            bnl0.m105526N(this.f31944e, ibc0.f114045i5);
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        return ItemMessageBase.m49494R(this).onLongClick(view);
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
    public class C8657a extends li2<qim> {
        public C8657a() {
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: d */
        public void mo49464d(String str, Throwable th) {
            bnl0.m105525M0(ItemLocation.this.f31944e, false);
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8288e(String str, @Nullable qim qimVar, @Nullable Animatable animatable) {
            bnl0.m105525M0(ItemLocation.this.f31944e, true);
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void mo49463b(String str, @Nullable qim qimVar) {
        }
    }
}
