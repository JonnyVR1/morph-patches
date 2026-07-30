package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p1.mobile.putong.core.data.DynamicSchemaMsgData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.bkb0;
import l.h8q;
import l.j2e0;
import l.knb0;
import l.qib0;
import l.t100;
import l.xdl0;
import l.zvf0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageMomentInspireLeft extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: j */
    public static final int f1112j = t100.d(210.0f);

    /* JADX INFO: renamed from: a */
    public ItemMessageMomentInspireLeft f1113a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1114b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f1115c;

    /* JADX INFO: renamed from: d */
    public VText f1116d;

    /* JADX INFO: renamed from: e */
    public VText f1117e;

    /* JADX INFO: renamed from: f */
    public VText f1118f;

    /* JADX INFO: renamed from: g */
    public Message f1119g;

    /* JADX INFO: renamed from: h */
    public DynamicSchemaMsgData f1120h;

    /* JADX INFO: renamed from: i */
    public boolean f1121i;

    public ItemMessageMomentInspireLeft(Context context) {
        super(context);
        this.f1121i = false;
    }

    private void setClickEvent(final DynamicSchemaMsgData dynamicSchemaMsgData) {
        xdl0.E0(this.f1117e, new View.OnClickListener() { // from class: l.f8q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3464a.m1521d(dynamicSchemaMsgData, view);
            }
        });
        xdl0.E0(this.f1118f, new View.OnClickListener() { // from class: l.g8q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3813a.m1522e(dynamicSchemaMsgData, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        if (message == null || TextUtils.isEmpty(message.msgData)) {
            return;
        }
        if (NullChecker.a(this.f1119g) && !((DbObject) this.f1119g).id.equals(((DbObject) message).id)) {
            this.f1121i = false;
        }
        this.f1119g = message;
        try {
            DynamicSchemaMsgData dynamicSchemaMsgData = (DynamicSchemaMsgData) DynamicSchemaMsgData.JSON_ADAPTER.parse(message.msgData);
            this.f1120h = dynamicSchemaMsgData;
            if (dynamicSchemaMsgData == null) {
                return;
            }
            m1524g(dynamicSchemaMsgData);
            setClickEvent(this.f1120h);
            if (this.f1121i) {
                return;
            }
            m1526i(this.f1120h);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final void m1520c(View view) {
        h8q.a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1521d(DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        m1525h(dynamicSchemaMsgData);
        if (TextUtils.isEmpty(dynamicSchemaMsgData.schema)) {
            return;
        }
        j2e0.m(xdl0.E(this.f1113a), Uri.parse(dynamicSchemaMsgData.schema));
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m1522e(DynamicSchemaMsgData dynamicSchemaMsgData, View view) {
        if (TextUtils.isEmpty(dynamicSchemaMsgData.cancelSchema)) {
            return;
        }
        j2e0.m(xdl0.E(this.f1113a), Uri.parse(dynamicSchemaMsgData.cancelSchema));
    }

    /* JADX INFO: renamed from: f */
    public final void m1523f(@NonNull MessageView messageView) {
        if (TextUtils.isEmpty(messageView.cancelText)) {
            return;
        }
        xdl0.M(this.f1118f, true);
        this.f1118f.setText(messageView.cancelText);
    }

    /* JADX INFO: renamed from: g */
    public final void m1524g(DynamicSchemaMsgData dynamicSchemaMsgData) {
        MessageView messageView = dynamicSchemaMsgData.view;
        if (messageView != null) {
            m1523f(messageView);
            if (dynamicSchemaMsgData.view.isTextOnly) {
                this.f1116d.setMaxLines(Integer.MAX_VALUE);
                this.f1116d.setText(dynamicSchemaMsgData.view.text);
                this.f1117e.setText(dynamicSchemaMsgData.view.button);
                xdl0.M(this.f1114b, false);
                return;
            }
            xdl0.M(this.f1114b, true);
            this.f1116d.setText(dynamicSchemaMsgData.view.text);
            this.f1116d.setMaxLines(3);
            this.f1117e.setText(dynamicSchemaMsgData.view.button);
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f1114b;
            String str = dynamicSchemaMsgData.view.image;
            int i = f1112j;
            bkb0Var.I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m1525h(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData.eventExtra == null) {
            return;
        }
        HashMap map = new HashMap();
        for (String str : dynamicSchemaMsgData.eventExtra.keySet()) {
            map.put(str, dynamicSchemaMsgData.eventExtra.get(str));
        }
        zvf0.s("e_boost_pop_use", "p_chat_view", map);
    }

    /* JADX INFO: renamed from: i */
    public final void m1526i(DynamicSchemaMsgData dynamicSchemaMsgData) {
        if (dynamicSchemaMsgData.eventExtra == null) {
            return;
        }
        HashMap map = new HashMap();
        for (String str : dynamicSchemaMsgData.eventExtra.keySet()) {
            map.put(str, dynamicSchemaMsgData.eventExtra.get(str));
        }
        zvf0.y("e_boost_pop_use", "p_chat_view", map);
        this.f1121i = true;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1520c(this);
        this.f1114b.getHierarchy().H(RoundingParams.b(t100.d(8.0f), t100.d(8.0f), 0.0f, 0.0f));
        this.f1116d.setTypeface(Typeface.defaultFromStyle(1));
        this.f1117e.setTypeface(Typeface.defaultFromStyle(1));
    }

    public ItemMessageMomentInspireLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1121i = false;
    }

    public ItemMessageMomentInspireLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1121i = false;
    }

    public ItemMessageMomentInspireLeft(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f1121i = false;
    }
}
