package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemRecentlySee;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageLinearMaxWidth;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.dox;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.ovb0;
import p153l.pol;
import p153l.psd0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemRecentlySee extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: g */
    public static int f32296g;

    /* JADX INFO: renamed from: a */
    public ItemRecentlySee f32297a;

    /* JADX INFO: renamed from: b */
    public MessageLinearMaxWidth f32298b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f32299c;

    /* JADX INFO: renamed from: d */
    public VText f32300d;

    /* JADX INFO: renamed from: e */
    public VText f32301e;

    /* JADX INFO: renamed from: f */
    public ItemText f32302f;

    public ItemRecentlySee(@NonNull Context context) {
        super(context);
        onFinishInflate();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m49813a(InterfaceC8682a.a aVar, View view) {
        aVar.mo49534a();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49814b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m49817e(View view) {
        return false;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32302f.mo43399A(message);
        if (getContext() instanceof Act) {
            ((Act) getContext()).duringCreated(CoreModule.f18264c.f20424s1.m35371r3(message.referenceMsgId)).subscribe(psd0.m173597H(new y20() { // from class: l.ifq
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f114684a.m49819g((CoreData) obj);
                }
            }, new y20() { // from class: l.jfq
                @Override // p153l.y20
                public final void call(Object obj) {
                    ItemRecentlySee.m49814b((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return jyb.m147507f0(jyb.m147495Z(getContext().getString(R$string.f21676c), new Runnable() { // from class: l.ffq
            @Override // java.lang.Runnable
            public final void run() {
                this.f98819a.m49818f();
            }
        }, Integer.valueOf(ibc0.f114176x1), null));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(pol polVar, Message message, final InterfaceC8682a.a aVar) {
        this.f32302f.mo49313y(message, aVar);
        this.f32302f.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.gfq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemRecentlySee.m49813a(aVar, view);
            }
        });
        this.f32298b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hfq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemRecentlySee.m49817e(view);
            }
        });
        mo43399A(message);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m49818f() {
        l51.m152911q(this.f32302f.getText().toString());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49819g(CoreData coreData) {
        List<Literatures> list = coreData.literatures;
        if (jyb.m147479J(list)) {
            return;
        }
        Literatures literatures = list.get(0);
        uqb0.f180374G.m127119N0(this.f32299c, literatures.headUrl, false);
        this.f32300d.setText(literatures.title);
        String strMo180527q5 = CoreModule.m30933P().m143412i().mo180527q5(literatures);
        boolean zIsEmpty = TextUtils.isEmpty(strMo180527q5);
        VText vText = this.f32301e;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f32301e.setText(strMo180527q5);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32297a = (ItemRecentlySee) findViewById(edc0.f93316Z);
        this.f32298b = (MessageLinearMaxWidth) findViewById(edc0.f93252O1);
        this.f32299c = (VDraweeView) findViewById(edc0.f93372h0);
        this.f32300d = (VText) findViewById(edc0.f93267Q4);
        this.f32301e = (VText) findViewById(edc0.f93442r0);
        this.f32302f = (ItemText) findViewById(edc0.f93168A4);
        this.f32300d.setTypeface(Typeface.defaultFromStyle(1));
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32300d.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32301e.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM117366d = dox.m117366d(i);
        f32296g = iM117366d;
        this.f32298b.setMaxWidth(iM117366d);
        super.onMeasure(i, i2);
    }

    public ItemRecentlySee(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRecentlySee(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
