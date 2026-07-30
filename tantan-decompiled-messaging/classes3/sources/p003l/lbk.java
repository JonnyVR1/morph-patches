package p003l;

import android.content.Context;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView;
import l.e51;
import l.x7c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class lbk {

    /* JADX INFO: renamed from: l.lbk$a */
    public class C0403a implements unk.InterfaceC0580d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageInputBaseEditView f5240a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f5241b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f5242c;

        public C0403a(MessageInputBaseEditView messageInputBaseEditView, int i, int i2) {
            this.f5240a = messageInputBaseEditView;
            this.f5241b = i;
            this.f5242c = i2;
        }

        @Override // p003l.unk.InterfaceC0580d
        /* JADX INFO: renamed from: a */
        public void mo5998a(nbk nbkVar) {
            String str = nbkVar.f5859b + " ";
            MessageInputBaseEditView messageInputBaseEditView = this.f5240a;
            String str2 = nbkVar.f5858a;
            int i = this.f5241b;
            int i2 = this.f5242c;
            messageInputBaseEditView.p(str2, (i + i2) - 1, i + i2 + str.length());
            this.f5240a.getText().insert(this.f5241b + this.f5242c, str);
            if (this.f5240a.getContext() instanceof PutongAct) {
                this.f5240a.requestFocus();
                Context context = this.f5240a.getContext();
                final MessageInputBaseEditView messageInputBaseEditView2 = this.f5240a;
                e51.H(context, new Runnable() { // from class: l.jbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageInputBaseEditView messageInputBaseEditView3 = messageInputBaseEditView2;
                        messageInputBaseEditView3.getContext().showInput(messageInputBaseEditView3, 0);
                    }
                }, 100L);
            }
        }

        @Override // p003l.unk.InterfaceC0580d
        public void onCancel() {
            if (this.f5240a.getContext() instanceof PutongAct) {
                this.f5240a.requestFocus();
                Context context = this.f5240a.getContext();
                final MessageInputBaseEditView messageInputBaseEditView = this.f5240a;
                e51.H(context, new Runnable() { // from class: l.kbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageInputBaseEditView messageInputBaseEditView2 = messageInputBaseEditView;
                        messageInputBaseEditView2.getContext().showInput(messageInputBaseEditView2, 0);
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m5994a(MessageInputBaseEditView messageInputBaseEditView, CharSequence charSequence, int i, int i2, int i3) {
        if (!charSequence.toString().contains("@") || i3 <= 0) {
            return;
        }
        String string = charSequence.subSequence(i, i + i3).toString();
        if (TextUtils.isEmpty(string) || !string.endsWith("@")) {
            return;
        }
        m5995b(messageInputBaseEditView.getContext(), new C0403a(messageInputBaseEditView, i, i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    public static void m5995b(Context context, unk.InterfaceC0580d interfaceC0580d) {
        if (context instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) context;
            new unk(messagesAct, x7c0.a).m8173C(interfaceC0580d, messagesAct.f1531f.m4295r3());
        }
    }
}
