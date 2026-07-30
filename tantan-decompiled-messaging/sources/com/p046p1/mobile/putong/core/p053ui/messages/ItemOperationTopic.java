package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.OperationTopicInfo;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.ftd0;
import p149l.knb0;
import p149l.lsi0;
import p149l.o6j0;
import p149l.qib0;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemOperationTopic extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f31333a;

    /* JADX INFO: renamed from: b */
    public TextView f31334b;

    /* JADX INFO: renamed from: c */
    public VText f31335c;

    public ItemOperationTopic(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        final OperationTopicInfo operationTopicInfo = message.getOperationTopicInfo();
        if (operationTopicInfo == null) {
            xdl0.m208344M(this, false);
            return;
        }
        xdl0.m208344M(this, true);
        this.f31333a.getHierarchy().m112076w(ftd0.f99185i);
        qib0.f154691G.m102331L0(this.f31333a, operationTopicInfo.coverPicture.url);
        String str = operationTopicInfo.title;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(operationTopicInfo.subtitle)) {
            str = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + operationTopicInfo.subtitle;
        }
        this.f31334b.setText(str);
        this.f31335c.setOnClickListener(new View.OnClickListener() { // from class: l.zaq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f202386a.m48545b(operationTopicInfo, view);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m48545b(OperationTopicInfo operationTopicInfo, View view) {
        if (TextUtils.isEmpty(operationTopicInfo.url)) {
            return;
        }
        o6j0.m162859c("e_assistant_operation_message", OMSDialogPositon.p_chat_view, o6j0.C18854a.m162878h("operation_id", operationTopicInfo.operationId));
        if (operationTopicInfo.url.startsWith("http://") || operationTopicInfo.url.startsWith("https://")) {
            getContext().startActivity(AccessTokenWebViewAct.m80150Z1(getContext(), "", operationTopicInfo.url));
        } else if (operationTopicInfo.url.startsWith("tantan")) {
            CoreModule.m29935P().m94658i().mo158334Y(xdl0.m208328E(this), Uri.parse(operationTopicInfo.url));
        } else {
            lsi0.m151588r("跳转链接需要http开头或tantan开头");
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31333a = (VDraweeView) findViewById(y4c0.f196091a3);
        this.f31334b = (TextView) findViewById(y4c0.f196032Q4);
        this.f31335c = (VText) findViewById(y4c0.f195942C);
        this.f31334b.setTypeface(Typeface.defaultFromStyle(1));
    }

    public ItemOperationTopic(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemOperationTopic(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
