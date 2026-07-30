package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.LoveLetterMessageState;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.core.p053ui.messages.view.ItemLoveLetterMessage;
import com.p046p1.mobile.putong.core.view.LetterTextView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import java.util.List;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.dml;
import p149l.ffx;
import p149l.i6q;
import p149l.knb0;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ItemLoveLetterMessage extends FrameLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemLoveLetterMessage f32339a;

    /* JADX INFO: renamed from: b */
    public LoveLetterView f32340b;

    /* JADX INFO: renamed from: c */
    public VLinear f32341c;

    /* JADX INFO: renamed from: d */
    public VText f32342d;

    /* JADX INFO: renamed from: e */
    public LetterTextView f32343e;

    /* JADX INFO: renamed from: f */
    public VText f32344f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f32345g;

    public ItemLoveLetterMessage(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49813a(Message message, View view) {
        CoreModule.f17545c.f19642f0.m32771Po(message.f56011id, false);
        zvf0.m220399u("e_thanks_mind", OMSDialogPositon.p_chat_view, vwb.m200311Y("to_uid", CoreModule.m29931H().userId()));
    }

    /* JADX INFO: renamed from: f */
    private Act m49817f() {
        return (Act) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public /* synthetic */ void m49818h(final Message message, View view) {
        zvf0.m220399u("e_open_letter", OMSDialogPositon.p_chat_view, vwb.m200311Y("to_uid", CoreModule.m29931H().userId()));
        CoreModule.m29935P().m94651a().mo158227E4(m49817f(), CoreModule.f17545c.f19639e0.m169430Pa(message.owner), new d30() { // from class: l.h6q
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19642f0.m32771Po(message.f56011id, true);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: U */
    public void mo47990U(dml dmlVar, final Message message, InterfaceC8519a.a aVar) {
        MessageAdditionalData messageAdditionalData = message.additionalData;
        if (messageAdditionalData == null || messageAdditionalData.loveLetterInfo == null) {
            xdl0.m208329E0(this.f32340b, new View.OnClickListener() { // from class: l.g6q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Message message2 = message;
                    CoreModule.f17545c.f19642f0.m32710Kn(message2.cid, message2.f56011id);
                }
            });
            return;
        }
        if (message.isOtherUser()) {
            boolean zEquals = TEnum.equals(message.additionalData.loveLetterInfo.state, "default");
            LoveLetterView loveLetterView = this.f32340b;
            if (zEquals) {
                xdl0.m208344M(loveLetterView, true);
                xdl0.m208344M(this.f32341c, false);
                xdl0.m208329E0(this.f32340b, new View.OnClickListener() { // from class: l.e6q
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f89630a.m49818h(message, view);
                    }
                });
            } else {
                xdl0.m208344M(loveLetterView, false);
                xdl0.m208344M(this.f32341c, true);
                this.f32343e.setText(message.value);
                m49821i(CoreModule.f17545c.f19639e0.m169430Pa(message.owner).name, CoreModule.f17545c.f19639e0.m169527p9().name);
                if (TextUtils.equals(message.owner, CoreModule.m29931H().userId()) || TEnum.equals(message.additionalData.loveLetterInfo.state, LoveLetterMessageState.replied)) {
                    xdl0.m208344M(this.f32345g, false);
                } else {
                    this.f32345g.setText(String.format("感谢%s的心意", CoreModule.f17545c.f19639e0.m169430Pa(message.owner).getPronoun()));
                    xdl0.m208344M(this.f32345g, true);
                    zvf0.m220368A("e_thanks_mind", OMSDialogPositon.p_chat_view, vwb.m200311Y("to_uid", CoreModule.m29931H().userId()));
                    xdl0.m208329E0(this.f32345g, new View.OnClickListener() { // from class: l.f6q
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ItemLoveLetterMessage.m49813a(message, view);
                        }
                    });
                }
            }
        } else {
            xdl0.m208344M(this.f32340b, false);
            xdl0.m208344M(this.f32341c, true);
            xdl0.m208344M(this.f32345g, false);
            this.f32343e.setText(message.value);
            m49821i(CoreModule.f17545c.f19639e0.m169527p9().name, CoreModule.f17545c.f19639e0.m169430Pa(message.cid).name);
        }
        zvf0.m220368A("e_letter_message", OMSDialogPositon.p_chat_view, vwb.m200311Y("to_uid", message.isOtherUser() ? CoreModule.m29931H().userId() : message.cid));
    }

    /* JADX INFO: renamed from: e */
    public final void m49819e(View view) {
        i6q.m134629a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m49820g(String str) {
        return str.length() <= 6 ? str : str.substring(0, 6).concat("...");
    }

    /* JADX INFO: renamed from: i */
    public final void m49821i(String str, String str2) {
        this.f32342d.setText(String.format("To（   %s   ）", m49820g(str2)));
        this.f32344f.setText(String.format("By（   %s   ）", m49820g(str)));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49819e(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(ffx.m121201d(i), 1073741824), i2);
    }

    public ItemLoveLetterMessage(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLoveLetterMessage(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
