package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.AIMessageFeedback;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemTantanTeamAnswer;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import p147v.VLinear;
import p149l.knb0;
import p149l.lsi0;
import p149l.n000;
import p149l.vqd0;
import p149l.vwb;
import p149l.xdl0;
import p149l.xeq;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemTantanTeamAnswer extends VLinear implements InterfaceC8519a {

    /* JADX INFO: renamed from: c */
    public ItemTantanTeamAnswer f31507c;

    /* JADX INFO: renamed from: d */
    public ItemText f31508d;

    /* JADX INFO: renamed from: e */
    public VLinear f31509e;

    /* JADX INFO: renamed from: f */
    public VLinear f31510f;

    /* JADX INFO: renamed from: g */
    public String f31511g;

    /* JADX INFO: renamed from: h */
    public String f31512h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemTantanTeamAnswer$a */
    public static class C8511a {
        private static C8511a INSTANCE;

        /* JADX INFO: renamed from: a */
        public String f31513a;

        /* JADX INFO: renamed from: b */
        public vqd0 f31514b;

        public C8511a(String str, vqd0 vqd0Var) {
            this.f31513a = str;
            this.f31514b = vqd0Var;
        }

        /* JADX INFO: renamed from: d */
        public static C8511a m48710d(String str) {
            C8511a c8511a = INSTANCE;
            if (c8511a == null || !TextUtils.equals(c8511a.f31513a, str)) {
                INSTANCE = new C8511a(str, new vqd0("tantanteam_answer_result_set_" + CoreModule.m29931H().userId(), new HashSet()));
            }
            return INSTANCE;
        }

        /* JADX INFO: renamed from: c */
        public final void m48711c(String str) {
            HashSet<String> hashSet = this.f31514b.get();
            if (!NullChecker.m81303a(hashSet)) {
                hashSet = new HashSet<>();
            }
            hashSet.add(str);
            this.f31514b.put(hashSet);
        }

        /* JADX INFO: renamed from: e */
        public final HashSet<String> m48712e() {
            return this.f31514b.get();
        }
    }

    public ItemTantanTeamAnswer(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m48698P(View view) {
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m48701S(View view) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31508d.mo42388A(message);
        this.f31511g = TextUtils.concat(message.f56011id, "_", Boolean.TRUE.toString()).toString();
        this.f31512h = TextUtils.concat(message.f56011id, "_", Boolean.FALSE.toString()).toString();
        HashSet hashSetM48712e = C8511a.m48710d(CoreModule.m29931H().userId()).m48712e();
        if (NullChecker.m81303a(hashSetM48712e) && (hashSetM48712e.contains(this.f31511g) || hashSetM48712e.contains(this.f31512h))) {
            m48706Y(message, hashSetM48712e.contains(this.f31511g), hashSetM48712e.contains(this.f31512h));
        } else {
            m48706Y(message, false, false);
        }
        if (n000.m157186e(message.f56011id)) {
            return;
        }
        n000.m157183b(message.f56011id);
        zvf0.m220368A("e_chat_feedback", OMSDialogPositon.p_chat_view, vwb.m200311Y("chat_feedback_answers", message.value), vwb.m200311Y(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), vwb.m200311Y("message_send_status", "1"));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final void m48702T(View view) {
        xeq.m208587a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final void m48703V(boolean z) {
        C8511a.m48710d(CoreModule.m29931H().userId()).m48711c(z ? this.f31511g : this.f31512h);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m48704W(Message message, View view) {
        m48707Z(message, AIMessageFeedback.good);
        m48706Y(message, true, false);
        m48703V(true);
        lsi0.m151564B(getContext().getString(R$string.f20736D3), true, true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m48705X(Message message, View view) {
        m48707Z(message, AIMessageFeedback.bad);
        m48706Y(message, false, true);
        m48703V(false);
        CoreModule.m29935P().m94658i().mo158224E1(getContext());
    }

    /* JADX INFO: renamed from: Y */
    public final void m48706Y(final Message message, boolean z, boolean z2) {
        boolean z3 = z || z2;
        for (int i = 0; i < this.f31510f.getChildCount(); i++) {
            View childAt = this.f31510f.getChildAt(i);
            childAt.setEnabled(!z3);
            childAt.setSelected(z);
        }
        for (int i2 = 0; i2 < this.f31509e.getChildCount(); i2++) {
            View childAt2 = this.f31509e.getChildAt(i2);
            childAt2.setEnabled(!z3);
            childAt2.setSelected(z2);
        }
        VLinear vLinear = this.f31510f;
        if (z3) {
            xdl0.m208329E0(vLinear, new View.OnClickListener() { // from class: l.veq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemTantanTeamAnswer.m48701S(view);
                }
            });
            xdl0.m208329E0(this.f31509e, new View.OnClickListener() { // from class: l.weq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemTantanTeamAnswer.m48698P(view);
                }
            });
        } else {
            xdl0.m208329E0(vLinear, new View.OnClickListener() { // from class: l.teq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f169876a.m48704W(message, view);
                }
            });
            xdl0.m208329E0(this.f31509e, new View.OnClickListener() { // from class: l.ueq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f176067a.m48705X(message, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m48707Z(Message message, String str) {
        zvf0.m220399u("e_chat_feedback_operate", OMSDialogPositon.p_chat_view, vwb.m200311Y("chat_feedback_answers", message.value), vwb.m200311Y("chat_feedback_operate", str), vwb.m200311Y(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id), vwb.m200311Y("message_send_status", "1"));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48702T(this);
    }

    public ItemTantanTeamAnswer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTantanTeamAnswer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
