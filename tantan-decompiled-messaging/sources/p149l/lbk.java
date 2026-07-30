package p149l;

import android.content.Context;
import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputBaseEditView;

/* JADX INFO: loaded from: classes3.dex */
public class lbk {

    /* JADX INFO: renamed from: l.lbk$a */
    public class C18185a implements unk.InterfaceC20465d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessageInputBaseEditView f127300a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f127301b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f127302c;

        public C18185a(MessageInputBaseEditView messageInputBaseEditView, int i, int i2) {
            this.f127300a = messageInputBaseEditView;
            this.f127301b = i;
            this.f127302c = i2;
        }

        @Override // p149l.unk.InterfaceC20465d
        /* JADX INFO: renamed from: a */
        public void mo149234a(nbk nbkVar) {
            String str = nbkVar.f138039b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR;
            MessageInputBaseEditView messageInputBaseEditView = this.f127300a;
            String str2 = nbkVar.f138038a;
            int i = this.f127301b;
            int i2 = this.f127302c;
            messageInputBaseEditView.m49920p(str2, (i + i2) - 1, i + i2 + str.length());
            this.f127300a.getText().insert(this.f127301b + this.f127302c, str);
            if (this.f127300a.getContext() instanceof PutongAct) {
                this.f127300a.requestFocus();
                Context context = this.f127300a.getContext();
                final MessageInputBaseEditView messageInputBaseEditView2 = this.f127300a;
                e51.m114743H(context, new Runnable() { // from class: l.jbk
                    @Override // java.lang.Runnable
                    public final void run() {
                        MessageInputBaseEditView messageInputBaseEditView3 = messageInputBaseEditView2;
                        ((PutongAct) messageInputBaseEditView3.getContext()).showInput(messageInputBaseEditView3, 0);
                    }
                }, 100L);
            }
        }

        @Override // p149l.unk.InterfaceC20465d
        public void onCancel() {
            if (this.f127300a.getContext() instanceof PutongAct) {
                this.f127300a.requestFocus();
                Context context = this.f127300a.getContext();
                final MessageInputBaseEditView messageInputBaseEditView = this.f127300a;
                e51.m114743H(context, new Runnable() { // from class: l.kbk
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
    public static void m149230a(MessageInputBaseEditView messageInputBaseEditView, CharSequence charSequence, int i, int i2, int i3) {
        if (!charSequence.toString().contains("@") || i3 <= 0) {
            return;
        }
        String string = charSequence.subSequence(i, i + i3).toString();
        if (TextUtils.isEmpty(string) || !string.endsWith("@")) {
            return;
        }
        m149231b(messageInputBaseEditView.getContext(), new C18185a(messageInputBaseEditView, i, i3));
    }

    /* JADX INFO: renamed from: b */
    public static void m149231b(Context context, unk.InterfaceC20465d interfaceC20465d) {
        if (context instanceof MessagesAct) {
            MessagesAct messagesAct = (MessagesAct) context;
            new unk(messagesAct, x7c0.f191332a).m194443C(interfaceC20465d, messagesAct.f31640f.mo120828r3());
        }
    }
}
