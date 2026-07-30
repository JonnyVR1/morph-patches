package p009l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemVirtualVoiceGroupView;
import com.p000p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p000p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.f6c0;
import l.fap;
import l.ml6;
import l.t100;
import l.u4c0;
import l.vwb;
import l.xdl0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class qj6 extends dac0<Conversation> implements p36 {

    /* JADX INFO: renamed from: c */
    public int f19341c = 0;

    /* JADX INFO: renamed from: d */
    public int f19342d = 0;

    /* JADX INFO: renamed from: e */
    public int f19343e = 0;

    /* JADX INFO: renamed from: f */
    public int f19344f = 0;

    /* JADX INFO: renamed from: g */
    public int f19345g = 0;

    /* JADX INFO: renamed from: h */
    public List<Conversation> f19346h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public List<User> f19347i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public List<Conversation> f19348j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public List<Conversation> f19349k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public List<Conversation> f19350l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public List<Message> f19351m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public List<Message> f19352n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public final ConversationSearchAct f19353o;

    /* JADX INFO: renamed from: p */
    public String f19354p;

    /* JADX INFO: renamed from: q */
    public int f19355q;

    /* JADX INFO: renamed from: r */
    public boolean f19356r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC1148a f19357s;

    /* JADX INFO: renamed from: l.qj6$a */
    public interface InterfaceC1148a {
        /* JADX INFO: renamed from: a */
        void mo13421a(boolean z);
    }

    public qj6(ConversationSearchAct conversationSearchAct, int i, boolean z, InterfaceC1148a interfaceC1148a) {
        this.f19353o = conversationSearchAct;
        this.f19355q = i;
        this.f19356r = z;
        this.f19357s = interfaceC1148a;
    }

    /* JADX INFO: renamed from: C */
    public int m21070C() {
        return this.f19346h.size();
    }

    /* JADX INFO: renamed from: D */
    public View m21071D(ViewGroup viewGroup, int i) {
        if (i != 4 && i != 6 && i != 7) {
            if (i == 9) {
                return this.f19353o.inflater().inflate(f6c0.T1, viewGroup, false);
            }
            if (i == 5 || i == 8) {
                return o7r.m19649a(this.f19353o).inflate(f6c0.B1, viewGroup, false);
            }
            return rd6.m21511Z(this.f19353o, viewGroup, i == 2);
        }
        TextView textView = new TextView(this.f19353o);
        textView.setTextSize(15.0f);
        textView.setTextColor(Color.parseColor("#66000000"));
        RecyclerView.p pVar = new RecyclerView.p(-1, -2);
        ((ViewGroup.MarginLayoutParams) pVar).topMargin = t100.o;
        ((ViewGroup.MarginLayoutParams) pVar).bottomMargin = t100.e;
        ((ViewGroup.MarginLayoutParams) pVar).leftMargin = t100.j;
        textView.setLayoutParams(pVar);
        return textView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m21069A(View view, Conversation conversation, final int i, int i2) {
        String str;
        String str2;
        int i3;
        int i4;
        if (i == 4) {
            ((TextView) view).setText(this.f19353o.getText(R.string.Z1));
            return;
        }
        if (i == 6) {
            ((TextView) view).setText("探探ID搜索");
            return;
        }
        if (i == 7) {
            ((TextView) view).setText(this.f19353o.getText(R.string.F1));
            return;
        }
        if (i == 5 || i == 8) {
            TextView textView = (TextView) view.findViewById(u4c0.w8);
            PutongMvpAct putongMvpAct = this.f19353o;
            textView.setText(i == 5 ? putongMvpAct.getText(R.string.Xi) : putongMvpAct.getText(R.string.Wi));
            xdl0.E0(view, new View.OnClickListener() { // from class: l.pj6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f18733a.m21076J(i, view2);
                }
            });
            return;
        }
        if (i == 9) {
            ((ConversationItemVirtualVoiceGroupView) view).m5149E0(this.f19353o, conversation, i2);
        }
        if (view instanceof ConversationItemView) {
            NewConversationItemView newConversationItemView = (NewConversationItemView) view;
            int i5 = (i2 - this.f19344f) - 1;
            boolean z = false;
            boolean z2 = i5 >= 0 && i5 < this.f19351m.size();
            int i6 = this.f19355q;
            String str3 = "";
            User user = null;
            double d = 0.0d;
            if (i6 == ConversationSearchAct.f4731o) {
                if (vwb.J(this.f19347i) || i2 <= (i3 = this.f19343e) || ((i4 = this.f19344f) >= 0 && i2 >= i4)) {
                    int i7 = this.f19344f;
                    if (i7 >= 0 && i2 > i7 && z2) {
                        Message message = this.f19351m.get(i5);
                        str3 = ((DbObject) message).id;
                        str = message.value;
                        str2 = message.owner;
                        d = message.createdTime;
                    }
                } else {
                    user = this.f19347i.get((i2 - i3) - 1);
                    z = true;
                }
                str = "";
                str2 = str;
            } else if (i6 == ConversationSearchAct.f4730n && z2) {
                Message message2 = this.f19351m.get(i5);
                str3 = ((DbObject) message2).id;
                str = message2.value;
                str2 = message2.owner;
                d = message2.createdTime;
            } else {
                str = "";
                str2 = str;
            }
            pi6 pi6Var = new pi6(newConversationItemView, this, conversation);
            pi6Var.f18637p = str3;
            pi6Var.f18638q = str;
            pi6Var.f18639r = str2;
            pi6Var.f18640s = d;
            String str4 = this.f19354p;
            pi6Var.f18641t = str4;
            pi6Var.f18642u = this.f19356r;
            pi6Var.f18636o = true;
            pi6Var.f18622a = conversation;
            pi6Var.f18626e = true;
            pi6Var.f18628g = i2;
            pi6Var.f18646y = str4;
            pi6Var.f18643v = z;
            pi6Var.f18623b = user;
            if (i == 0) {
                newConversationItemView.m5890i4(pi6Var);
                return;
            }
            if (i == 2) {
                newConversationItemView.m5894m4(pi6Var);
            } else if (i == 1) {
                newConversationItemView.m5901t4(pi6Var);
            } else if (i == 3) {
                newConversationItemView.m5895n4(this);
            }
        }
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return i < this.f19346h.size() ? this.f19346h.get(i) : Conversation.new_();
    }

    /* JADX INFO: renamed from: H */
    public final void m21074H(List<Conversation> list, List<User> list2, List<Conversation> list3) {
        int size;
        int i;
        m21075I();
        if (!vwb.J(list)) {
            this.f19341c = 0;
            this.f19342d = list.size() > 3 ? 4 : -1;
            for (int i2 = 0; i2 < Math.min(3, list.size()); i2++) {
                this.f19348j.add(list.get(i2));
            }
        }
        if (!vwb.J(list2)) {
            if (this.f19341c == -1) {
                i = 0;
            } else {
                int size2 = this.f19342d;
                if (size2 == -1) {
                    size2 = list.size();
                }
                i = size2 + 1;
            }
            this.f19343e = i;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                this.f19349k.add(Conversation.new_());
            }
        }
        if (vwb.J(list3)) {
            return;
        }
        int i4 = this.f19343e;
        if (i4 != -1) {
            size = i4 + list2.size() + 1;
        } else if (this.f19341c == -1) {
            size = 0;
        } else {
            int i5 = this.f19342d;
            size = i5 == -1 ? list.size() + 1 : i5 + 1;
        }
        this.f19344f = size;
        int iMin = Math.min(3, list3.size());
        this.f19345g = list3.size() > 3 ? this.f19344f + 4 : -1;
        for (int i6 = 0; i6 < iMin; i6++) {
            this.f19350l.add(list3.get(i6));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m21075I() {
        this.f19341c = -1;
        this.f19342d = -1;
        this.f19343e = -1;
        this.f19344f = -1;
        this.f19345g = -1;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m21076J(int i, View view) {
        if (NullChecker.a(this.f19357s)) {
            this.f19357s.mo13421a(i == 5);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m21077K(List<Conversation> list, List<User> list2, List<Conversation> list3, List<Message> list4) {
        this.f19346h.clear();
        this.f19348j.clear();
        this.f19349k.clear();
        this.f19350l.clear();
        this.f19351m.clear();
        this.f19351m.addAll(list4);
        int i = this.f19355q;
        if (i == ConversationSearchAct.f4731o) {
            m21074H(list, list2, list3);
            if (this.f19341c != -1) {
                this.f19346h.add(Conversation.new_());
            }
            this.f19346h.addAll(this.f19348j);
            if (this.f19342d != -1) {
                this.f19346h.add(Conversation.new_());
            }
            if (this.f19343e != -1) {
                this.f19346h.add(Conversation.new_());
            }
            this.f19347i.clear();
            if (!vwb.J(list2)) {
                this.f19347i.addAll(list2);
            }
            this.f19346h.addAll(this.f19349k);
            if (this.f19344f != -1) {
                this.f19346h.add(Conversation.new_());
            }
            this.f19346h.addAll(this.f19350l);
            if (this.f19345g != -1) {
                this.f19346h.add(Conversation.new_());
            }
        } else if (i == ConversationSearchAct.f4729m) {
            this.f19348j = list;
            if (!vwb.J(list)) {
                this.f19346h.addAll(this.f19348j);
            }
        } else if (i == ConversationSearchAct.f4730n) {
            this.f19350l = list3;
            if (!vwb.J(list3)) {
                this.f19346h.add(Conversation.new_());
                this.f19344f = 0;
                this.f19346h.addAll(this.f19350l);
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m21078L(String str) {
        this.f19354p = str;
    }

    public int getItemViewType(int i) {
        if (this.f19355q == ConversationSearchAct.f4731o) {
            if (i == this.f19341c) {
                return 4;
            }
            if (i == this.f19342d) {
                return 5;
            }
            if (i == this.f19343e) {
                return 6;
            }
            if (i == this.f19344f) {
                return 7;
            }
            if (i == this.f19345g) {
                return 8;
            }
        }
        Conversation item = getItem(i);
        if (item == null) {
            return 0;
        }
        if (TEnum.equals(item.status, "dismissed")) {
            return 1;
        }
        if (ml6.a(item)) {
            return 2;
        }
        if (fap.k(item)) {
            return 3;
        }
        return TextUtils.equals("virtualvoice", item.convType) ? 9 : 0;
    }

    @Override // p009l.p36
    /* JADX INFO: renamed from: h */
    public int mo5626h() {
        return this.f19346h.size();
    }

    @Override // p009l.p36
    /* JADX INFO: renamed from: k */
    public List<Conversation> mo5628k() {
        return this.f19346h;
    }

    @Override // p009l.p36
    /* JADX INFO: renamed from: o */
    public int mo5631o() {
        return -1;
    }

    @Override // p009l.p36
    /* JADX INFO: renamed from: q */
    public void mo5632q() {
        notifyDataSetChanged();
    }

    @Override // p009l.p36
    /* JADX INFO: renamed from: v */
    public c<Boolean> mo5633v() {
        return c.just(Boolean.TRUE);
    }
}
