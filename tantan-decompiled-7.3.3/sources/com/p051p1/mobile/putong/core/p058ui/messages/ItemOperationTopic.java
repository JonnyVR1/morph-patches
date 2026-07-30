package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.OperationTopicInfo;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.h1e0;
import p153l.o1j0;
import p153l.ovb0;
import p153l.sfj0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemOperationTopic extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public VDraweeView f32181a;

    /* JADX INFO: renamed from: b */
    public TextView f32182b;

    /* JADX INFO: renamed from: c */
    public VText f32183c;

    public ItemOperationTopic(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        final OperationTopicInfo operationTopicInfo = message.getOperationTopicInfo();
        if (operationTopicInfo == null) {
            bnl0.m105524M(this, false);
            return;
        }
        bnl0.m105524M(this, true);
        this.f32181a.getHierarchy().m207062w(h1e0.f107452i);
        uqb0.f180374G.m127115L0(this.f32181a, operationTopicInfo.coverPicture.url);
        String str = operationTopicInfo.title;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(operationTopicInfo.subtitle)) {
            str = str + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + operationTopicInfo.subtitle;
        }
        this.f32182b.setText(str);
        this.f32183c.setOnClickListener(new View.OnClickListener() { // from class: l.zcq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203818a.m49728b(operationTopicInfo, view);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m49728b(OperationTopicInfo operationTopicInfo, View view) {
        if (TextUtils.isEmpty(operationTopicInfo.url)) {
            return;
        }
        sfj0.m185596c("e_assistant_operation_message", OMSDialogPositon.p_chat_view, sfj0.C20032a.m185615h("operation_id", operationTopicInfo.operationId));
        if (operationTopicInfo.url.startsWith("http://") || operationTopicInfo.url.startsWith("https://")) {
            getContext().startActivity(AccessTokenWebViewAct.m81333a2(getContext(), "", operationTopicInfo.url));
        } else if (operationTopicInfo.url.startsWith("tantan")) {
            CoreModule.m30933P().m143412i().mo180426Y(bnl0.m105508E(this), Uri.parse(operationTopicInfo.url));
        } else {
            o1j0.m165644r("跳转链接需要http开头或tantan开头");
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32181a = (VDraweeView) findViewById(edc0.f93326a3);
        this.f32182b = (TextView) findViewById(edc0.f93267Q4);
        this.f32183c = (VText) findViewById(edc0.f93177C);
        this.f32182b.setTypeface(Typeface.defaultFromStyle(1));
    }

    public ItemOperationTopic(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemOperationTopic(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
