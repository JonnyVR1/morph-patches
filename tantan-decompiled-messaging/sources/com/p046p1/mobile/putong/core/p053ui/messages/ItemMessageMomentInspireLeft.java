package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bkb0;
import p149l.h8q;
import p149l.j2e0;
import p149l.knb0;
import p149l.qib0;
import p149l.t100;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageMomentInspireLeft extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: j */
    public static final int f31221j = t100.m186890d(210.0f);

    /* JADX INFO: renamed from: a */
    public ItemMessageMomentInspireLeft f31222a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31223b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f31224c;

    /* JADX INFO: renamed from: d */
    public VText f31225d;

    /* JADX INFO: renamed from: e */
    public VText f31226e;

    /* JADX INFO: renamed from: f */
    public VText f31227f;

    /* JADX INFO: renamed from: g */
    public Message f31228g;

    /* JADX INFO: renamed from: h */
    public DynamicSchemaMsgData f31229h;

    /* JADX INFO: renamed from: i */
    public boolean f31230i;

    public ItemMessageMomentInspireLeft(Context context) {
        super(context);
        this.f31230i = false;
    }

    private void setClickEvent(final DynamicSchemaMsgData dynamicSchemaMsgData) {
        xdl0.m208329E0(this.f31226e, new View.OnClickListener() { // from class: l.f8q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96395a.m48437d(dynamicSchemaMsgData, view);
            }
        });
        xdl0.m208329E0(this.f31227f, new View.OnClickListener() { // from class: l.g8q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101513a.m48438e(dynamicSchemaMsgData, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        if (message == null || TextUtils.isEmpty(message.msgData)) {
            return;
        }
        if (NullChecker.m81303a(this.f31228g) && !this.f31228g.f56011id.equals(message.f56011id)) {
            this.f31230i = false;
        }
        this.f31228g = message;
        try {
            DynamicSchemaMsgData dynamicSchemaMsgData = DynamicSchemaMsgData.JSON_ADAPTER.parse(message.msgData);
            this.f31229h = dynamicSchemaMsgData;
            if (dynamicSchemaMsgData == null) {
                return;
            }
            m48440g(dynamicSchemaMsgData);
            setClickEvent(this.f31229h);
            if (this.f31230i) {
                return;
            }
            m48442i(this.f31229h);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m48436c(View view) {
        h8q.m129894a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m48437d(DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        m48441h(dynamicSchemaMsgData);
        if (TextUtils.isEmpty(dynamicSchemaMsgData.schema)) {
            return;
        }
        j2e0.m139446m(xdl0.m208328E(this.f31222a), Uri.parse(dynamicSchemaMsgData.schema));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m48438e(DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        if (TextUtils.isEmpty(dynamicSchemaMsgData.cancelSchema)) {
            return;
        }
        j2e0.m139446m(xdl0.m208328E(this.f31222a), Uri.parse(dynamicSchemaMsgData.cancelSchema));
    }

    /* JADX INFO: renamed from: f */
    public final void m48439f(@NonNull MessageView messageView) {
        if (TextUtils.isEmpty(messageView.cancelText)) {
            return;
        }
        xdl0.m208344M(this.f31227f, true);
        this.f31227f.setText(messageView.cancelText);
    }

    /* JADX INFO: renamed from: g */
    public final void m48440g(DynamicSchemaMsgData dynamicSchemaMsgData) {
        MessageView messageView = dynamicSchemaMsgData.view;
        if (messageView != null) {
            m48439f(messageView);
            if (dynamicSchemaMsgData.view.isTextOnly) {
                this.f31225d.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
                this.f31225d.setText(dynamicSchemaMsgData.view.text);
                this.f31226e.setText(dynamicSchemaMsgData.view.button);
                xdl0.m208344M(this.f31223b, false);
                return;
            }
            xdl0.m208344M(this.f31223b, true);
            this.f31225d.setText(dynamicSchemaMsgData.view.text);
            this.f31225d.setMaxLines(3);
            this.f31226e.setText(dynamicSchemaMsgData.view.button);
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f31223b;
            String str = dynamicSchemaMsgData.view.image;
            int i = f31221j;
            bkb0Var.m102325I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m48441h(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData.eventExtra == null) {
            return;
        }
        HashMap map = new HashMap();
        for (String str : dynamicSchemaMsgData.eventExtra.keySet()) {
            map.put(str, dynamicSchemaMsgData.eventExtra.get(str));
        }
        zvf0.m220397s("e_boost_pop_use", OMSDialogPositon.p_chat_view, map);
    }

    /* JADX INFO: renamed from: i */
    public final void m48442i(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData.eventExtra == null) {
            return;
        }
        HashMap map = new HashMap();
        for (String str : dynamicSchemaMsgData.eventExtra.keySet()) {
            map.put(str, dynamicSchemaMsgData.eventExtra.get(str));
        }
        zvf0.m220403y("e_boost_pop_use", OMSDialogPositon.p_chat_view, map);
        this.f31230i = true;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48436c(this);
        this.f31223b.getHierarchy().m112053H(RoundingParams.m8248b(t100.m186890d(8.0f), t100.m186890d(8.0f), 0.0f, 0.0f));
        this.f31225d.setTypeface(Typeface.defaultFromStyle(1));
        this.f31226e.setTypeface(Typeface.defaultFromStyle(1));
    }

    public ItemMessageMomentInspireLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31230i = false;
    }

    public ItemMessageMomentInspireLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31230i = false;
    }

    public ItemMessageMomentInspireLeft(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f31230i = false;
    }
}
