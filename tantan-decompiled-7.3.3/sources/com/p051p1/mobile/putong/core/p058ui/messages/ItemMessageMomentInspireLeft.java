package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.google.android.gms.common.api.Api;
import com.p051p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.fsb0;
import p153l.haq;
import p153l.i4g0;
import p153l.nae0;
import p153l.ovb0;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageMomentInspireLeft extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: j */
    public static final int f32069j = qa00.m175859d(210.0f);

    /* JADX INFO: renamed from: a */
    public ItemMessageMomentInspireLeft f32070a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f32071b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f32072c;

    /* JADX INFO: renamed from: d */
    public VText f32073d;

    /* JADX INFO: renamed from: e */
    public VText f32074e;

    /* JADX INFO: renamed from: f */
    public VText f32075f;

    /* JADX INFO: renamed from: g */
    public Message f32076g;

    /* JADX INFO: renamed from: h */
    public DynamicSchemaMsgData f32077h;

    /* JADX INFO: renamed from: i */
    public boolean f32078i;

    public ItemMessageMomentInspireLeft(Context context) {
        super(context);
        this.f32078i = false;
    }

    private void setClickEvent(final DynamicSchemaMsgData dynamicSchemaMsgData) {
        bnl0.m105509E0(this.f32074e, new View.OnClickListener() { // from class: l.faq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98000a.m49620d(dynamicSchemaMsgData, view);
            }
        });
        bnl0.m105509E0(this.f32075f, new View.OnClickListener() { // from class: l.gaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103018a.m49621e(dynamicSchemaMsgData, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        if (message == null || TextUtils.isEmpty(message.msgData)) {
            return;
        }
        if (NullChecker.m82486a(this.f32076g) && !this.f32076g.f56859id.equals(message.f56859id)) {
            this.f32078i = false;
        }
        this.f32076g = message;
        try {
            DynamicSchemaMsgData dynamicSchemaMsgData = DynamicSchemaMsgData.JSON_ADAPTER.parse(message.msgData);
            this.f32077h = dynamicSchemaMsgData;
            if (dynamicSchemaMsgData == null) {
                return;
            }
            m49623g(dynamicSchemaMsgData);
            setClickEvent(this.f32077h);
            if (this.f32078i) {
                return;
            }
            m49625i(this.f32077h);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m49619c(View view) {
        haq.m134192a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m49620d(DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        m49624h(dynamicSchemaMsgData);
        if (TextUtils.isEmpty(dynamicSchemaMsgData.schema)) {
            return;
        }
        nae0.m162083m(bnl0.m105508E(this.f32070a), Uri.parse(dynamicSchemaMsgData.schema));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m49621e(DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        if (TextUtils.isEmpty(dynamicSchemaMsgData.cancelSchema)) {
            return;
        }
        nae0.m162083m(bnl0.m105508E(this.f32070a), Uri.parse(dynamicSchemaMsgData.cancelSchema));
    }

    /* JADX INFO: renamed from: f */
    public final void m49622f(@NonNull MessageView messageView) {
        if (TextUtils.isEmpty(messageView.cancelText)) {
            return;
        }
        bnl0.m105524M(this.f32075f, true);
        this.f32075f.setText(messageView.cancelText);
    }

    /* JADX INFO: renamed from: g */
    public final void m49623g(DynamicSchemaMsgData dynamicSchemaMsgData) {
        MessageView messageView = dynamicSchemaMsgData.view;
        if (messageView != null) {
            m49622f(messageView);
            if (dynamicSchemaMsgData.view.isTextOnly) {
                this.f32073d.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                this.f32073d.setText(dynamicSchemaMsgData.view.text);
                this.f32074e.setText(dynamicSchemaMsgData.view.button);
                bnl0.m105524M(this.f32071b, false);
                return;
            }
            bnl0.m105524M(this.f32071b, true);
            this.f32073d.setText(dynamicSchemaMsgData.view.text);
            this.f32073d.setMaxLines(3);
            this.f32074e.setText(dynamicSchemaMsgData.view.button);
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f32071b;
            String str = dynamicSchemaMsgData.view.image;
            int i = f32069j;
            fsb0Var.m127109I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m49624h(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData.eventExtra == null) {
            return;
        }
        HashMap map = new HashMap();
        for (String str : dynamicSchemaMsgData.eventExtra.keySet()) {
            map.put(str, dynamicSchemaMsgData.eventExtra.get(str));
        }
        i4g0.m138521s("e_boost_pop_use", OMSDialogPositon.p_chat_view, map);
    }

    /* JADX INFO: renamed from: i */
    public final void m49625i(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData.eventExtra == null) {
            return;
        }
        HashMap map = new HashMap();
        for (String str : dynamicSchemaMsgData.eventExtra.keySet()) {
            map.put(str, dynamicSchemaMsgData.eventExtra.get(str));
        }
        i4g0.m138527y("e_boost_pop_use", OMSDialogPositon.p_chat_view, map);
        this.f32078i = true;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49619c(this);
        this.f32071b.getHierarchy().m207045H(RoundingParams.m8302b(qa00.m175859d(8.0f), qa00.m175859d(8.0f), 0.0f, 0.0f));
        this.f32073d.setTypeface(Typeface.defaultFromStyle(1));
        this.f32074e.setTypeface(Typeface.defaultFromStyle(1));
    }

    public ItemMessageMomentInspireLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32078i = false;
    }

    public ItemMessageMomentInspireLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32078i = false;
    }

    public ItemMessageMomentInspireLeft(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f32078i = false;
    }
}
