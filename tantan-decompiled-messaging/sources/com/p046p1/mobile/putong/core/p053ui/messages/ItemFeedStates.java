package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemFeedStates;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageLinearMaxWidth;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VText;
import p149l.c3c0;
import p149l.dml;
import p149l.e30;
import p149l.e51;
import p149l.ffx;
import p149l.j760;
import p149l.knb0;
import p149l.mkd0;
import p149l.osi0;
import p149l.qib0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemFeedStates extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: j */
    public static int f30943j;

    /* JADX INFO: renamed from: a */
    public ItemFeedStates f30944a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f30945b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f30946c;

    /* JADX INFO: renamed from: d */
    public MessageLinearMaxWidth f30947d;

    /* JADX INFO: renamed from: e */
    public MessageLinearMaxWidth f30948e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f30949f;

    /* JADX INFO: renamed from: g */
    public VText f30950g;

    /* JADX INFO: renamed from: h */
    public VText f30951h;

    /* JADX INFO: renamed from: i */
    public ItemText f30952i;

    public ItemFeedStates(@NonNull Context context) {
        super(context);
        onFinishInflate();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m48140e(View view) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m48141f(InterfaceC8519a.a aVar, View view) {
        aVar.mo48351a();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m48142g(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m48143k(Message message, View view) {
        m48151q(message);
        osi0.m165783g("状态已结束");
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return vwb.m200324f0(vwb.m200312Z(getContext().getString(R$string.f20934c), new Runnable() { // from class: l.y2q
            @Override // java.lang.Runnable
            public final void run() {
                this.f195662a.m48145i();
            }
        }, Integer.valueOf(c3c0.f78901x1), null));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(dml dmlVar, Message message, final InterfaceC8519a.a aVar) {
        this.f30952i.mo48130y(message, aVar);
        this.f30952i.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.z2q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemFeedStates.m48141f(aVar, view);
            }
        });
        this.f30945b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.a3q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemFeedStates.m48140e(view);
            }
        });
        m48148n(dmlVar, message);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m48144h(BubbleInfo bubbleInfo) {
        return NullChecker.m81303a(bubbleInfo) && !TextUtils.isEmpty(bubbleInfo.f38730id) && bubbleInfo.createdTime + 8.64E7d > ((double) System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m48145i() {
        e51.m114766q(this.f30952i.getText().toString());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m48146j(Message message, BubbleInfo bubbleInfo, View view) {
        m48151q(message);
        if (!message.isMe()) {
            CoreModule.m29934N().mo60270Dk((Act) getContext(), CoreModule.m29932K().me_().f56011id, bubbleInfo.f38730id, OMSDialogPositon.p_messages_view);
        } else if (((Act) getContext()) instanceof MessagesAct) {
            CoreModule.m29934N().mo60317Sg((Act) getContext(), bubbleInfo.f38730id, bubbleInfo.owner.f38803id, true, OMSDialogPositon.p_messages_view);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m48147l(final Message message, final BubbleInfo bubbleInfo) {
        if (!NullChecker.m81303a(bubbleInfo) || !m48144h(bubbleInfo)) {
            m48152r(true);
            this.f30948e.setOnClickListener(new View.OnClickListener() { // from class: l.e3q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f89204a.m48143k(message, view);
                }
            });
        } else {
            m48152r(false);
            m48150p(bubbleInfo);
            m48149o(bubbleInfo);
            this.f30947d.setOnClickListener(new View.OnClickListener() { // from class: l.d3q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f84247a.m48146j(message, bubbleInfo, view);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public void m48148n(dml dmlVar, final Message message) {
        if (TEnum.equals(message.messageType, MessageType.state_like)) {
            message.value = "赞了你的状态";
        }
        this.f30952i.mo42388A(message);
        dmlVar.mo67374c((Act) getContext(), CoreModule.f17545c.f19676q1.m33274v3(message.isMe() ? message.cid : CoreModule.f17545c.f19639e0.m169527p9().f56011id, message.referenceMsgId).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.b3q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73249a.m48147l(message, (BubbleInfo) obj);
            }
        }, new e30() { // from class: l.c3q
            @Override // p149l.e30
            public final void call(Object obj) {
                ItemFeedStates.m48142g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final void m48149o(@NonNull BubbleInfo bubbleInfo) {
        boolean zIsEmpty = TextUtils.isEmpty(bubbleInfo.value);
        VText vText = this.f30951h;
        if (zIsEmpty) {
            xdl0.m208344M(vText, false);
            ViewGroup.LayoutParams layoutParams = this.f30949f.getLayoutParams();
            int i = t100.f167275x;
            layoutParams.width = i;
            layoutParams.height = i;
            this.f30949f.setLayoutParams(layoutParams);
            this.f30950g.setTextSize(2, 16.0f);
            this.f30950g.setTextColor(Color.parseColor(Constants.BLACK));
            return;
        }
        xdl0.m208344M(vText, true);
        ViewGroup.LayoutParams layoutParams2 = this.f30949f.getLayoutParams();
        int i2 = t100.f167226A;
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        this.f30949f.setLayoutParams(layoutParams2);
        this.f30950g.setTextSize(2, 13.0f);
        this.f30950g.setTextColor(Color.parseColor("#4c000000"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30944a = (ItemFeedStates) findViewById(y4c0.f196081Z);
        this.f30945b = (FrameLayout) findViewById(y4c0.f196141h4);
        this.f30946c = (FrameLayout) findViewById(y4c0.f196016O0);
        this.f30947d = (MessageLinearMaxWidth) findViewById(y4c0.f196148i4);
        this.f30948e = (MessageLinearMaxWidth) findViewById(y4c0.f196155j4);
        this.f30949f = (VDraweeView) findViewById(y4c0.f195968G0);
        this.f30950g = (VText) findViewById(y4c0.f196004M0);
        this.f30951h = (VText) findViewById(y4c0.f196207r0);
        this.f30952i = (ItemText) findViewById(y4c0.f195933A4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM121201d = ffx.m121201d(i);
        f30943j = iM121201d;
        this.f30947d.setMaxWidth(iM121201d);
        this.f30948e.setMaxWidth(f30943j);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p */
    public void m48150p(@NonNull BubbleInfo bubbleInfo) {
        qib0.f154691G.m102335N0(this.f30949f, bubbleInfo.emotion.emojiUrl, false);
        xdl0.m208335H0(this.f30950g, bubbleInfo.emotion.text);
        xdl0.m208335H0(this.f30951h, bubbleInfo.value);
    }

    /* JADX INFO: renamed from: q */
    public final void m48151q(Message message) {
        zvf0.m220399u("e_other_state", OMSDialogPositon.p_chat_view, new j760("state_id", message.referenceMsgId), new j760("owner_id", message.owner));
    }

    /* JADX INFO: renamed from: r */
    public final void m48152r(boolean z) {
        FrameLayout frameLayout = this.f30945b;
        if (z) {
            frameLayout.setVisibility(8);
            this.f30946c.setVisibility(0);
        } else {
            frameLayout.setVisibility(0);
            this.f30946c.setVisibility(8);
        }
    }

    public ItemFeedStates(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFeedStates(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
