package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.core.p058ui.messages.view.ItemLoveLetterMessage;
import com.p051p1.mobile.putong.core.view.LetterTextView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.dox;
import p153l.i4g0;
import p153l.i8q;
import p153l.jyb;
import p153l.ovb0;
import p153l.pol;
import p153l.x20;

/* JADX INFO: loaded from: classes4.dex */
public class ItemLoveLetterMessage extends FrameLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemLoveLetterMessage f33187a;

    /* JADX INFO: renamed from: b */
    public LoveLetterView f33188b;

    /* JADX INFO: renamed from: c */
    public VLinear f33189c;

    /* JADX INFO: renamed from: d */
    public VText f33190d;

    /* JADX INFO: renamed from: e */
    public LetterTextView f33191e;

    /* JADX INFO: renamed from: f */
    public VText f33192f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f33193g;

    public ItemLoveLetterMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m50996a(Message message, View view) {
        CoreModule.f18264c.f20384f0.m33774Po(message.f56859id, false);
        i4g0.m138523u("e_thanks_mind", OMSDialogPositon.p_chat_view, jyb.m147494Y("to_uid", CoreModule.m30929H().userId()));
    }

    /* JADX INFO: renamed from: f */
    private Act m51000f() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m51001h(final Message message, View view) {
        i4g0.m138523u("e_open_letter", OMSDialogPositon.p_chat_view, jyb.m147494Y("to_uid", CoreModule.m30929H().userId()));
        CoreModule.m30933P().m143405a().mo180319E4(m51000f(), CoreModule.f18264c.f20381e0.m116503Pa(message.owner), new x20() { // from class: l.h8q
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20384f0.m33774Po(message.f56859id, true);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: U */
    public void mo49173U(pol polVar, final Message message, InterfaceC8682a.a aVar) {
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || messageAdditionalData.loveLetterInfo == null) {
            bnl0.m105509E0(this.f33188b, new View.OnClickListener() { // from class: l.g8q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Message message2 = message;
                    CoreModule.f18264c.f20384f0.m33713Kn(message2.cid, message2.f56859id);
                }
            });
            return;
        }
        if (message.isOtherUser()) {
            boolean zEquals = TEnum.equals(message.additionalData.loveLetterInfo.state, "default");
            LoveLetterView loveLetterView = this.f33188b;
            if (zEquals) {
                bnl0.m105524M(loveLetterView, true);
                bnl0.m105524M(this.f33189c, false);
                bnl0.m105509E0(this.f33188b, new View.OnClickListener() { // from class: l.e8q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f92555a.m51001h(message, view);
                    }
                });
            } else {
                bnl0.m105524M(loveLetterView, false);
                bnl0.m105524M(this.f33189c, true);
                this.f33191e.setText(message.value);
                m51004i(CoreModule.f18264c.f20381e0.m116503Pa(message.owner).name, CoreModule.f18264c.f20381e0.m116600p9().name);
                if (TextUtils.equals(message.owner, CoreModule.m30929H().userId()) || TEnum.equals(message.additionalData.loveLetterInfo.state, LoveLetterMessageState.replied)) {
                    bnl0.m105524M(this.f33193g, false);
                } else {
                    this.f33193g.setText(String.format("感谢%s的心意", CoreModule.f18264c.f20381e0.m116503Pa(message.owner).getPronoun()));
                    bnl0.m105524M(this.f33193g, true);
                    i4g0.m138492A("e_thanks_mind", OMSDialogPositon.p_chat_view, jyb.m147494Y("to_uid", CoreModule.m30929H().userId()));
                    bnl0.m105509E0(this.f33193g, new View.OnClickListener() { // from class: l.f8q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ItemLoveLetterMessage.m50996a(message, view);
                        }
                    });
                }
            }
        } else {
            bnl0.m105524M(this.f33188b, false);
            bnl0.m105524M(this.f33189c, true);
            bnl0.m105524M(this.f33193g, false);
            this.f33191e.setText(message.value);
            m51004i(CoreModule.f18264c.f20381e0.m116600p9().name, CoreModule.f18264c.f20381e0.m116503Pa(message.cid).name);
        }
        i4g0.m138492A("e_letter_message", OMSDialogPositon.p_chat_view, jyb.m147494Y("to_uid", message.isOtherUser() ? CoreModule.m30929H().userId() : message.cid));
    }

    /* JADX INFO: renamed from: e */
    public final void m51002e(View view) {
        i8q.m139021a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m51003g(String str) {
        return str.length() <= 6 ? str : str.substring(0, 6).concat("...");
    }

    /* JADX INFO: renamed from: i */
    public final void m51004i(String str, String str2) {
        this.f33190d.setText(String.format("To（   %s   ）", m51003g(str2)));
        this.f33192f.setText(String.format("By（   %s   ）", m51003g(str)));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m51002e(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(dox.m117366d(i), 1073741824), i2);
    }

    public ItemLoveLetterMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLoveLetterMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
