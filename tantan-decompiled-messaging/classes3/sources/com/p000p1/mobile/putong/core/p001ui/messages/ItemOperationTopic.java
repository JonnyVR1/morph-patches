package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.OperationTopicInfo;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import java.util.List;
import l.ftd0;
import l.knb0;
import l.lsi0;
import l.o6j0;
import l.qib0;
import l.xdl0;
import l.y4c0;
import p028v.VDraweeView;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemOperationTopic extends LinearLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1224a;

    /* JADX INFO: renamed from: b */
    public TextView f1225b;

    /* JADX INFO: renamed from: c */
    public VText f1226c;

    public ItemOperationTopic(Context context) {
        super(context);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        final OperationTopicInfo operationTopicInfo = message.getOperationTopicInfo();
        if (operationTopicInfo == null) {
            xdl0.M(this, false);
            return;
        }
        xdl0.M(this, true);
        this.f1224a.getHierarchy().w(ftd0.i);
        qib0.G.L0(this.f1224a, operationTopicInfo.coverPicture.url);
        String str = operationTopicInfo.title;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(operationTopicInfo.subtitle)) {
            str = str + " " + operationTopicInfo.subtitle;
        }
        this.f1225b.setText(str);
        this.f1226c.setOnClickListener(new View.OnClickListener() { // from class: l.zaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9280a.m1629b(operationTopicInfo, view);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m1629b(OperationTopicInfo operationTopicInfo, View view) {
        if (TextUtils.isEmpty(operationTopicInfo.url)) {
            return;
        }
        o6j0.c("e_assistant_operation_message", "p_chat_view", new o6j0.a[]{o6j0.a.h("operation_id", operationTopicInfo.operationId)});
        if (operationTopicInfo.url.startsWith("http://") || operationTopicInfo.url.startsWith("https://")) {
            getContext().startActivity(AccessTokenWebViewAct.Z1(getContext(), "", operationTopicInfo.url));
        } else if (operationTopicInfo.url.startsWith("tantan")) {
            CoreModule.P().i().Y(xdl0.E(this), Uri.parse(operationTopicInfo.url));
        } else {
            lsi0.r("跳转链接需要http开头或tantan开头");
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1224a = (VDraweeView) findViewById(y4c0.a3);
        this.f1225b = (TextView) findViewById(y4c0.Q4);
        this.f1226c = (VText) findViewById(y4c0.C);
        this.f1225b.setTypeface(Typeface.defaultFromStyle(1));
    }

    public ItemOperationTopic(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemOperationTopic(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
