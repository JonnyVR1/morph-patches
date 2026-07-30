package p153l;

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputBaseEditView;

/* JADX INFO: loaded from: classes3.dex */
public class bek {

    /* JADX INFO: renamed from: l.bek$a */
    public class C15975a implements kqk.InterfaceC18243d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageInputBaseEditView f76382a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f76383b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f76384c;

        public C15975a(MessageInputBaseEditView messageInputBaseEditView, int i, int i2) {
            this.f76382a = messageInputBaseEditView;
            this.f76383b = i;
            this.f76384c = i2;
        }

        @Override // p153l.kqk.InterfaceC18243d
        /* JADX INFO: renamed from: a */
        public void mo103709a(dek dekVar) {
            String str = dekVar.f88037b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            MessageInputBaseEditView messageInputBaseEditView = this.f76382a;
            String str2 = dekVar.f88036a;
            int i = this.f76383b;
            int i2 = this.f76384c;
            messageInputBaseEditView.m51103p(str2, (i + i2) - 1, i + i2 + str.length());
            this.f76382a.getText().insert(this.f76383b + this.f76384c, str);
            if (this.f76382a.getContext() instanceof PutongAct) {
                this.f76382a.requestFocus();
                Context context = this.f76382a.getContext();
                final MessageInputBaseEditView messageInputBaseEditView2 = this.f76382a;
                l51.m152888H(context, new Runnable() { // from class: l.zdk
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageInputBaseEditView messageInputBaseEditView3 = messageInputBaseEditView2;
                        ((PutongAct) messageInputBaseEditView3.getContext()).showInput(messageInputBaseEditView3, 0);
                    }
                }, 100L);
            }
        }

        @Override // p153l.kqk.InterfaceC18243d
        public void onCancel() {
            if (this.f76382a.getContext() instanceof PutongAct) {
                this.f76382a.requestFocus();
                Context context = this.f76382a.getContext();
                final MessageInputBaseEditView messageInputBaseEditView = this.f76382a;
                l51.m152888H(context, new Runnable() { // from class: l.aek
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageInputBaseEditView messageInputBaseEditView2 = messageInputBaseEditView;
                        ((PutongAct) messageInputBaseEditView2.getContext()).showInput(messageInputBaseEditView2, 0);
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m103705a(MessageInputBaseEditView messageInputBaseEditView, CharSequence charSequence, int i, int i2, int i3) {
        if (!charSequence.toString().contains("@") || i3 <= 0) {
            return;
        }
        String string = charSequence.subSequence(i, i + i3).toString();
        if (TextUtils.isEmpty(string) || !string.endsWith("@")) {
            return;
        }
        m103706b(messageInputBaseEditView.getContext(), new C15975a(messageInputBaseEditView, i, i3));
    }

    /* JADX INFO: renamed from: b */
    public static void m103706b(Context context, kqk.InterfaceC18243d interfaceC18243d) {
        if (context instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) context;
            new kqk(messagesAct, cgc0.f81645a).m150911C(interfaceC18243d, messagesAct.f32488f.mo111034r3());
        }
    }
}
