package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemFeedStates;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageLinearMaxWidth;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.dox;
import p153l.edc0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.ovb0;
import p153l.pf60;
import p153l.pol;
import p153l.psd0;
import p153l.qa00;
import p153l.r1j0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemFeedStates extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: j */
    public static int f31791j;

    /* JADX INFO: renamed from: a */
    public ItemFeedStates f31792a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f31793b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f31794c;

    /* JADX INFO: renamed from: d */
    public MessageLinearMaxWidth f31795d;

    /* JADX INFO: renamed from: e */
    public MessageLinearMaxWidth f31796e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f31797f;

    /* JADX INFO: renamed from: g */
    public VText f31798g;

    /* JADX INFO: renamed from: h */
    public VText f31799h;

    /* JADX INFO: renamed from: i */
    public ItemText f31800i;

    public ItemFeedStates(@NonNull Context context) {
        super(context);
        onFinishInflate();
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ boolean m49323e(View view) {
        return false;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ boolean m49324f(InterfaceC8682a.a aVar, View view) {
        aVar.mo49534a();
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m49325g(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m49326k(Message message, View view) {
        m49334q(message);
        r1j0.m179420g("状态已结束");
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return jyb.m147507f0(jyb.m147495Z(getContext().getString(R$string.f21676c), new Runnable() { // from class: l.y4q
            @Override // java.lang.Runnable
            public final void run() {
                this.f197511a.m49328i();
            }
        }, Integer.valueOf(ibc0.f114176x1), null));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(pol polVar, Message message, final InterfaceC8682a.a aVar) {
        this.f31800i.mo49313y(message, aVar);
        this.f31800i.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.z4q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemFeedStates.m49324f(aVar, view);
            }
        });
        this.f31793b.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.a5q
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ItemFeedStates.m49323e(view);
            }
        });
        m49331n(polVar, message);
    }

    /* JADX INFO: renamed from: h */
    public final boolean m49327h(BubbleInfo bubbleInfo) {
        return NullChecker.m82486a(bubbleInfo) && !TextUtils.isEmpty(bubbleInfo.f39578id) && bubbleInfo.createdTime + 8.64E7d > ((double) System.currentTimeMillis());
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m49328i() {
        l51.m152911q(this.f31800i.getText().toString());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m49329j(Message message, BubbleInfo bubbleInfo, View view) {
        m49334q(message);
        if (!message.isMe()) {
            CoreModule.m30932N().mo61454Dk((Act) getContext(), CoreModule.m30930K().me_().f56859id, bubbleInfo.f39578id, OMSDialogPositon.p_messages_view);
        } else if (((Act) getContext()) instanceof MessagesAct) {
            CoreModule.m30932N().mo61501Sg((Act) getContext(), bubbleInfo.f39578id, bubbleInfo.owner.f39651id, true, OMSDialogPositon.p_messages_view);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m49330l(final Message message, final BubbleInfo bubbleInfo) {
        if (!NullChecker.m82486a(bubbleInfo) || !m49327h(bubbleInfo)) {
            m49335r(true);
            this.f31796e.setOnClickListener(new View.OnClickListener() { // from class: l.e5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f92227a.m49326k(message, view);
                }
            });
        } else {
            m49335r(false);
            m49333p(bubbleInfo);
            m49332o(bubbleInfo);
            this.f31795d.setOnClickListener(new View.OnClickListener() { // from class: l.d5q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85182a.m49329j(message, bubbleInfo, view);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX INFO: renamed from: n */
    public void m49331n(pol polVar, final Message message) {
        if (TEnum.equals(message.messageType, MessageType.state_like)) {
            message.value = "赞了你的状态";
        }
        this.f31800i.mo43399A(message);
        polVar.mo68557c((Act) getContext(), CoreModule.f18264c.f20418q1.m34277v3(message.isMe() ? message.cid : CoreModule.f18264c.f20381e0.m116600p9().f56859id, message.referenceMsgId).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.b5q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75085a.m49330l(message, (BubbleInfo) obj);
            }
        }, new y20() { // from class: l.c5q
            @Override // p153l.y20
            public final void call(Object obj) {
                ItemFeedStates.m49325g((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public final void m49332o(@NonNull BubbleInfo bubbleInfo) {
        boolean zIsEmpty = TextUtils.isEmpty(bubbleInfo.value);
        VText vText = this.f31799h;
        if (zIsEmpty) {
            bnl0.m105524M(vText, false);
            ViewGroup.LayoutParams layoutParams = this.f31797f.getLayoutParams();
            int i = qa00.f156337x;
            layoutParams.width = i;
            layoutParams.height = i;
            this.f31797f.setLayoutParams(layoutParams);
            this.f31798g.setTextSize(2, 16.0f);
            this.f31798g.setTextColor(Color.parseColor(Constants.BLACK));
            return;
        }
        bnl0.m105524M(vText, true);
        ViewGroup.LayoutParams layoutParams2 = this.f31797f.getLayoutParams();
        int i2 = qa00.f156288A;
        layoutParams2.width = i2;
        layoutParams2.height = i2;
        this.f31797f.setLayoutParams(layoutParams2);
        this.f31798g.setTextSize(2, 13.0f);
        this.f31798g.setTextColor(Color.parseColor("#4c000000"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31792a = (ItemFeedStates) findViewById(edc0.f93316Z);
        this.f31793b = (FrameLayout) findViewById(edc0.f93376h4);
        this.f31794c = (FrameLayout) findViewById(edc0.f93251O0);
        this.f31795d = (MessageLinearMaxWidth) findViewById(edc0.f93383i4);
        this.f31796e = (MessageLinearMaxWidth) findViewById(edc0.f93390j4);
        this.f31797f = (VDraweeView) findViewById(edc0.f93203G0);
        this.f31798g = (VText) findViewById(edc0.f93239M0);
        this.f31799h = (VText) findViewById(edc0.f93442r0);
        this.f31800i = (ItemText) findViewById(edc0.f93168A4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iM117366d = dox.m117366d(i);
        f31791j = iM117366d;
        this.f31795d.setMaxWidth(iM117366d);
        this.f31796e.setMaxWidth(f31791j);
        super.onMeasure(i, i2);
    }

    /* JADX INFO: renamed from: p */
    public void m49333p(@NonNull BubbleInfo bubbleInfo) {
        uqb0.f180374G.m127119N0(this.f31797f, bubbleInfo.emotion.emojiUrl, false);
        bnl0.m105515H0(this.f31798g, bubbleInfo.emotion.text);
        bnl0.m105515H0(this.f31799h, bubbleInfo.value);
    }

    /* JADX INFO: renamed from: q */
    public final void m49334q(Message message) {
        i4g0.m138523u("e_other_state", OMSDialogPositon.p_chat_view, new pf60("state_id", message.referenceMsgId), new pf60("owner_id", message.owner));
    }

    /* JADX INFO: renamed from: r */
    public final void m49335r(boolean z) {
        FrameLayout frameLayout = this.f31793b;
        if (z) {
            frameLayout.setVisibility(8);
            this.f31794c.setVisibility(0);
        } else {
            frameLayout.setVisibility(0);
            this.f31794c.setVisibility(8);
        }
    }

    public ItemFeedStates(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemFeedStates(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
