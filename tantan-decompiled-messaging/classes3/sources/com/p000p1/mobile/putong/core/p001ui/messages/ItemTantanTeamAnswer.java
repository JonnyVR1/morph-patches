package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemTantanTeamAnswer;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashSet;
import java.util.List;
import l.j760;
import l.knb0;
import l.lsi0;
import l.vqd0;
import l.vwb;
import l.xdl0;
import l.xeq;
import l.zvf0;
import p003l.n000;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemTantanTeamAnswer extends VLinear implements InterfaceC0102a {

    /* JADX INFO: renamed from: c */
    public ItemTantanTeamAnswer f1398c;

    /* JADX INFO: renamed from: d */
    public ItemText f1399d;

    /* JADX INFO: renamed from: e */
    public VLinear f1400e;

    /* JADX INFO: renamed from: f */
    public VLinear f1401f;

    /* JADX INFO: renamed from: g */
    public String f1402g;

    /* JADX INFO: renamed from: h */
    public String f1403h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemTantanTeamAnswer$a */
    public static class C0094a {
        private static C0094a INSTANCE;

        /* JADX INFO: renamed from: a */
        public String f1404a;

        /* JADX INFO: renamed from: b */
        public vqd0 f1405b;

        public C0094a(String str, vqd0 vqd0Var) {
            this.f1404a = str;
            this.f1405b = vqd0Var;
        }

        /* JADX INFO: renamed from: d */
        public static C0094a m1794d(String str) {
            C0094a c0094a = INSTANCE;
            if (c0094a == null || !TextUtils.equals(c0094a.f1404a, str)) {
                INSTANCE = new C0094a(str, new vqd0("tantanteam_answer_result_set_" + CoreModule.H().userId(), new HashSet()));
            }
            return INSTANCE;
        }

        /* JADX INFO: renamed from: c */
        public final void m1795c(String str) {
            HashSet hashSet = (HashSet) this.f1405b.get();
            if (!NullChecker.a(hashSet)) {
                hashSet = new HashSet();
            }
            hashSet.add(str);
            this.f1405b.put(hashSet);
        }

        /* JADX INFO: renamed from: e */
        public final HashSet<String> m1796e() {
            return (HashSet) this.f1405b.get();
        }
    }

    public ItemTantanTeamAnswer(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m1782P(View view) {
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m1785S(View view) {
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(Message message) {
        this.f1399d.mo1056A(message);
        this.f1402g = TextUtils.concat(((DbObject) message).id, "_", Boolean.TRUE.toString()).toString();
        this.f1403h = TextUtils.concat(((DbObject) message).id, "_", Boolean.FALSE.toString()).toString();
        HashSet hashSetM1796e = C0094a.m1794d(CoreModule.H().userId()).m1796e();
        if (NullChecker.a(hashSetM1796e) && (hashSetM1796e.contains(this.f1402g) || hashSetM1796e.contains(this.f1403h))) {
            m1790Y(message, hashSetM1796e.contains(this.f1402g), hashSetM1796e.contains(this.f1403h));
        } else {
            m1790Y(message, false, false);
        }
        if (n000.m6520e(((DbObject) message).id)) {
            return;
        }
        n000.m6517b(((DbObject) message).id);
        zvf0.A("e_chat_feedback", "p_chat_view", new j760[]{vwb.Y("chat_feedback_answers", message.value), vwb.Y("message_id", ((DbObject) message).id), vwb.Y("message_send_status", "1")});
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: T */
    public final void m1786T(View view) {
        xeq.a(this, view);
    }

    /* JADX INFO: renamed from: V */
    public final void m1787V(boolean z) {
        C0094a.m1794d(CoreModule.H().userId()).m1795c(z ? this.f1402g : this.f1403h);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m1788W(Message message, View view) {
        m1791Z(message, "good");
        m1790Y(message, true, false);
        m1787V(true);
        lsi0.B(getContext().getString(R.string.D3), true, true);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m1789X(Message message, View view) {
        m1791Z(message, "bad");
        m1790Y(message, false, true);
        m1787V(false);
        CoreModule.P().i().E1(getContext());
    }

    /* JADX INFO: renamed from: Y */
    public final void m1790Y(final Message message, boolean z, boolean z2) {
        boolean z3 = z || z2;
        for (int i = 0; i < this.f1401f.getChildCount(); i++) {
            View childAt = this.f1401f.getChildAt(i);
            childAt.setEnabled(!z3);
            childAt.setSelected(z);
        }
        for (int i2 = 0; i2 < this.f1400e.getChildCount(); i2++) {
            View childAt2 = this.f1400e.getChildAt(i2);
            childAt2.setEnabled(!z3);
            childAt2.setSelected(z2);
        }
        VLinear vLinear = this.f1401f;
        if (z3) {
            xdl0.E0(vLinear, new View.OnClickListener() { // from class: l.veq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemTantanTeamAnswer.m1785S(view);
                }
            });
            xdl0.E0(this.f1400e, new View.OnClickListener() { // from class: l.weq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemTantanTeamAnswer.m1782P(view);
                }
            });
        } else {
            xdl0.E0(vLinear, new View.OnClickListener() { // from class: l.teq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7458a.m1788W(message, view);
                }
            });
            xdl0.E0(this.f1400e, new View.OnClickListener() { // from class: l.ueq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7971a.m1789X(message, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m1791Z(Message message, String str) {
        zvf0.u("e_chat_feedback_operate", "p_chat_view", new j760[]{vwb.Y("chat_feedback_answers", message.value), vwb.Y("chat_feedback_operate", str), vwb.Y("message_id", ((DbObject) message).id), vwb.Y("message_send_status", "1")});
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1786T(this);
    }

    public ItemTantanTeamAnswer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTantanTeamAnswer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
