package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.AIMessageFeedback;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemTantanTeamAnswer;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import p151v.VLinear;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.k900;
import p153l.o1j0;
import p153l.ovb0;
import p153l.xgq;
import p153l.xyd0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemTantanTeamAnswer extends VLinear implements InterfaceC8682a {

    /* JADX INFO: renamed from: c */
    public ItemTantanTeamAnswer f32355c;

    /* JADX INFO: renamed from: d */
    public ItemText f32356d;

    /* JADX INFO: renamed from: e */
    public VLinear f32357e;

    /* JADX INFO: renamed from: f */
    public VLinear f32358f;

    /* JADX INFO: renamed from: g */
    public String f32359g;

    /* JADX INFO: renamed from: h */
    public String f32360h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemTantanTeamAnswer$a */
    public static class C8674a {
        private static C8674a INSTANCE;

        /* JADX INFO: renamed from: a */
        public String f32361a;

        /* JADX INFO: renamed from: b */
        public xyd0 f32362b;

        public C8674a(String str, xyd0 xyd0Var) {
            this.f32361a = str;
            this.f32362b = xyd0Var;
        }

        /* JADX INFO: renamed from: d */
        public static C8674a m49893d(String str) {
            C8674a c8674a = INSTANCE;
            if (c8674a == null || !TextUtils.equals(c8674a.f32361a, str)) {
                INSTANCE = new C8674a(str, new xyd0("tantanteam_answer_result_set_" + CoreModule.m30929H().userId(), new HashSet()));
            }
            return INSTANCE;
        }

        /* JADX INFO: renamed from: c */
        public final void m49894c(String str) {
            HashSet<String> hashSet = this.f32362b.get();
            if (!NullChecker.m82486a(hashSet)) {
                hashSet = new HashSet<>();
            }
            hashSet.add(str);
            this.f32362b.put(hashSet);
        }

        /* JADX INFO: renamed from: e */
        public final HashSet<String> m49895e() {
            return this.f32362b.get();
        }
    }

    public ItemTantanTeamAnswer(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m49881P(View view) {
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m49884S(View view) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f32356d.mo43399A(message);
        this.f32359g = TextUtils.concat(message.f56859id, "_", Boolean.TRUE.toString()).toString();
        this.f32360h = TextUtils.concat(message.f56859id, "_", Boolean.FALSE.toString()).toString();
        HashSet hashSetM49895e = C8674a.m49893d(CoreModule.m30929H().userId()).m49895e();
        if (NullChecker.m82486a(hashSetM49895e) && (hashSetM49895e.contains(this.f32359g) || hashSetM49895e.contains(this.f32360h))) {
            m49889Y(message, hashSetM49895e.contains(this.f32359g), hashSetM49895e.contains(this.f32360h));
        } else {
            m49889Y(message, false, false);
        }
        if (k900.m148793e(message.f56859id)) {
            return;
        }
        k900.m148790b(message.f56859id);
        i4g0.m138492A("e_chat_feedback", OMSDialogPositon.p_chat_view, jyb.m147494Y("chat_feedback_answers", message.value), jyb.m147494Y(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), jyb.m147494Y("message_send_status", "1"));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final void m49885T(View view) {
        xgq.m210934a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final void m49886V(boolean z) {
        C8674a.m49893d(CoreModule.m30929H().userId()).m49894c(z ? this.f32359g : this.f32360h);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m49887W(Message message, View view) {
        m49890Z(message, AIMessageFeedback.good);
        m49889Y(message, true, false);
        m49886V(true);
        o1j0.m165620B(getContext().getString(R$string.f21478D3), true, true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m49888X(Message message, View view) {
        m49890Z(message, AIMessageFeedback.bad);
        m49889Y(message, false, true);
        m49886V(false);
        CoreModule.m30933P().m143412i().mo180316E1(getContext());
    }

    /* JADX INFO: renamed from: Y */
    public final void m49889Y(final Message message, boolean z, boolean z2) {
        boolean z3 = z || z2;
        for (int i = 0; i < this.f32358f.getChildCount(); i++) {
            View childAt = this.f32358f.getChildAt(i);
            childAt.setEnabled(!z3);
            childAt.setSelected(z);
        }
        for (int i2 = 0; i2 < this.f32357e.getChildCount(); i2++) {
            View childAt2 = this.f32357e.getChildAt(i2);
            childAt2.setEnabled(!z3);
            childAt2.setSelected(z2);
        }
        VLinear vLinear = this.f32358f;
        if (z3) {
            bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.vgq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemTantanTeamAnswer.m49884S(view);
                }
            });
            bnl0.m105509E0(this.f32357e, new View.OnClickListener() { // from class: l.wgq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemTantanTeamAnswer.m49881P(view);
                }
            });
        } else {
            bnl0.m105509E0(vLinear, new View.OnClickListener() { // from class: l.tgq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f174121a.m49887W(message, view);
                }
            });
            bnl0.m105509E0(this.f32357e, new View.OnClickListener() { // from class: l.ugq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f178924a.m49888X(message, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m49890Z(Message message, String str) {
        i4g0.m138523u("e_chat_feedback_operate", OMSDialogPositon.p_chat_view, jyb.m147494Y("chat_feedback_answers", message.value), jyb.m147494Y("chat_feedback_operate", str), jyb.m147494Y(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id), jyb.m147494Y("message_send_status", "1"));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49885T(this);
    }

    public ItemTantanTeamAnswer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTantanTeamAnswer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
