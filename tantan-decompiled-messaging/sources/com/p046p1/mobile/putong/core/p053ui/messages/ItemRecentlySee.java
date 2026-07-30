package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemRecentlySee;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageLinearMaxWidth;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.dml;
import p149l.e30;
import p149l.e51;
import p149l.ffx;
import p149l.knb0;
import p149l.mkd0;
import p149l.qib0;
import p149l.ura;
import p149l.vwb;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemRecentlySee extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: g */
    public static int f31448g;

    /* JADX INFO: renamed from: a */
    public ItemRecentlySee f31449a;

    /* JADX INFO: renamed from: b */
    public MessageLinearMaxWidth f31450b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f31451c;

    /* JADX INFO: renamed from: d */
    public VText f31452d;

    /* JADX INFO: renamed from: e */
    public VText f31453e;

    /* JADX INFO: renamed from: f */
    public ItemText f31454f;

    public ItemRecentlySee(@NonNull Context context) {
        super(context);
        onFinishInflate();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m48630a(InterfaceC8519a.a aVar, View view) {
        aVar.mo48351a();
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m48631b(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m48634e(View view) {
        return false;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31454f.mo42388A(message);
        if (getContext() instanceof Act) {
            ((Act) getContext()).duringCreated(CoreModule.f17545c.f19682s1.m34368r3(message.referenceMsgId)).subscribe(mkd0.m154956H(new e30() { // from class: l.idq
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f112671a.m48636g((CoreData) obj);
                }
            }, new e30() { // from class: l.jdq
                @Override // p149l.e30
                public final void call(Object obj) {
                    ItemRecentlySee.m48631b((Throwable) obj);
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return vwb.m200324f0(vwb.m200312Z(getContext().getString(R$string.f20934c), new Runnable() { // from class: l.fdq
            @Override // java.lang.Runnable
            public final void run() {
                this.f97066a.m48635f();
            }
        }, Integer.valueOf(c3c0.f78901x1), null));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(dml dmlVar, Message message, final InterfaceC8519a.a aVar) {
        this.f31454f.mo48130y(message, aVar);
        this.f31454f.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.gdq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemRecentlySee.m48630a(aVar, view);
            }
        });
        this.f31450b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.hdq
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemRecentlySee.m48634e(view);
            }
        });
        mo42388A(message);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m48635f() {
        e51.m114766q(this.f31454f.getText().toString());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48636g(CoreData coreData) {
        List<Literatures> list = coreData.literatures;
        if (vwb.m200296J(list)) {
            return;
        }
        Literatures literatures = list.get(0);
        qib0.f154691G.m102335N0(this.f31451c, literatures.headUrl, false);
        this.f31452d.setText(literatures.title);
        String strMo158435q5 = CoreModule.m29935P().m94658i().mo158435q5(literatures);
        boolean zIsEmpty = TextUtils.isEmpty(strMo158435q5);
        VText vText = this.f31453e;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f31453e.setText(strMo158435q5);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31449a = (ItemRecentlySee) findViewById(y4c0.f196081Z);
        this.f31450b = (MessageLinearMaxWidth) findViewById(y4c0.f196017O1);
        this.f31451c = (VDraweeView) findViewById(y4c0.f196137h0);
        this.f31452d = (VText) findViewById(y4c0.f196032Q4);
        this.f31453e = (VText) findViewById(y4c0.f196207r0);
        this.f31454f = (ItemText) findViewById(y4c0.f195933A4);
        this.f31452d.setTypeface(Typeface.defaultFromStyle(1));
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31452d.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31453e.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM121201d = ffx.m121201d(i);
        f31448g = iM121201d;
        this.f31450b.setMaxWidth(iM121201d);
        super.onMeasure(i, i2);
    }

    public ItemRecentlySee(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRecentlySee(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
