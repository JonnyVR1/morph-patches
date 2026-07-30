package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemVirtualVoiceGroupView;
import com.p046p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p046p1.mobile.putong.core.newui.messages.search.ConversationSearchAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class qj6 extends dac0<Conversation> implements p36 {

    /* JADX INFO: renamed from: c */
    public int f154881c = 0;

    /* JADX INFO: renamed from: d */
    public int f154882d = 0;

    /* JADX INFO: renamed from: e */
    public int f154883e = 0;

    /* JADX INFO: renamed from: f */
    public int f154884f = 0;

    /* JADX INFO: renamed from: g */
    public int f154885g = 0;

    /* JADX INFO: renamed from: h */
    public List<Conversation> f154886h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public List<User> f154887i = new ArrayList();

    /* JADX INFO: renamed from: j */
    public List<Conversation> f154888j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public List<Conversation> f154889k = new ArrayList();

    /* JADX INFO: renamed from: l */
    public List<Conversation> f154890l = new ArrayList();

    /* JADX INFO: renamed from: m */
    public List<Message> f154891m = new ArrayList();

    /* JADX INFO: renamed from: n */
    public List<Message> f154892n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public final ConversationSearchAct f154893o;

    /* JADX INFO: renamed from: p */
    public String f154894p;

    /* JADX INFO: renamed from: q */
    public int f154895q;

    /* JADX INFO: renamed from: r */
    public boolean f154896r;

    /* JADX INFO: renamed from: s */
    public final InterfaceC19517a f154897s;

    /* JADX INFO: renamed from: l.qj6$a */
    public interface InterfaceC19517a {
        /* JADX INFO: renamed from: a */
        void mo112185a(boolean z);
    }

    public qj6(ConversationSearchAct conversationSearchAct, int i, boolean z, InterfaceC19517a interfaceC19517a) {
        this.f154893o = conversationSearchAct;
        this.f154895q = i;
        this.f154896r = z;
        this.f154897s = interfaceC19517a;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f154886h.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i != 4 && i != 6 && i != 7) {
            if (i == 9) {
                return this.f154893o.inflater().inflate(f6c0.f95572T1, viewGroup, false);
            }
            if (i == 5 || i == 8) {
                return o7r.m163037a(this.f154893o).inflate(f6c0.f95284B1, viewGroup, false);
            }
            return rd6.m178870Z(this.f154893o, viewGroup, i == 2);
        }
        TextView textView = new TextView(this.f154893o);
        textView.setTextSize(15.0f);
        textView.setTextColor(Color.parseColor("#66000000"));
        RecyclerView.C0578p c0578p = new RecyclerView.C0578p(-1, -2);
        ((ViewGroup.MarginLayoutParams) c0578p).topMargin = t100.f167266o;
        ((ViewGroup.MarginLayoutParams) c0578p).bottomMargin = t100.f167256e;
        ((ViewGroup.MarginLayoutParams) c0578p).leftMargin = t100.f167261j;
        textView.setLayoutParams(c0578p);
        return textView;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Conversation conversation, final int i, int i2) {
        String str;
        String str2;
        int i3;
        int i4;
        if (i == 4) {
            ((TextView) view).setText(this.f154893o.getText(R$string.f18318Z1));
            return;
        }
        if (i == 6) {
            ((TextView) view).setText("探探ID搜索");
            return;
        }
        if (i == 7) {
            ((TextView) view).setText(this.f154893o.getText(R$string.f17718F1));
            return;
        }
        if (i == 5 || i == 8) {
            TextView textView = (TextView) view.findViewById(u4c0.f174533w8);
            ConversationSearchAct conversationSearchAct = this.f154893o;
            textView.setText(i == 5 ? conversationSearchAct.getText(R$string.f18275Xi) : conversationSearchAct.getText(R$string.f18245Wi));
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.pj6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f149715a.m174977J(i, view2);
                }
            });
            return;
        }
        if (i == 9) {
            ((ConversationItemVirtualVoiceGroupView) view).m41047E0(this.f154893o, conversation, i2);
        }
        if (view instanceof ConversationItemView) {
            NewConversationItemView newConversationItemView = (NewConversationItemView) view;
            int i5 = (i2 - this.f154884f) - 1;
            boolean z = false;
            boolean z2 = i5 >= 0 && i5 < this.f154891m.size();
            int i6 = this.f154895q;
            int i7 = ConversationSearchAct.f25953o;
            String str3 = "";
            User user = null;
            double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (i6 == i7) {
                if (vwb.m200296J(this.f154887i) || i2 <= (i3 = this.f154883e) || ((i4 = this.f154884f) >= 0 && i2 >= i4)) {
                    int i8 = this.f154884f;
                    if (i8 >= 0 && i2 > i8 && z2) {
                        Message message = this.f154891m.get(i5);
                        str3 = message.f56011id;
                        str = message.value;
                        str2 = message.owner;
                        d = message.createdTime;
                    }
                } else {
                    user = this.f154887i.get((i2 - i3) - 1);
                    z = true;
                }
                str = "";
                str2 = str;
            } else if (i6 == ConversationSearchAct.f25952n && z2) {
                Message message2 = this.f154891m.get(i5);
                str3 = message2.f56011id;
                str = message2.value;
                str2 = message2.owner;
                d = message2.createdTime;
            } else {
                str = "";
                str2 = str;
            }
            pi6 pi6Var = new pi6(newConversationItemView, this, conversation);
            pi6Var.f149116p = str3;
            pi6Var.f149117q = str;
            pi6Var.f149118r = str2;
            pi6Var.f149119s = d;
            String str4 = this.f154894p;
            pi6Var.f149120t = str4;
            pi6Var.f149121u = this.f154896r;
            pi6Var.f149115o = true;
            pi6Var.f149101a = conversation;
            pi6Var.f149105e = true;
            pi6Var.f149107g = i2;
            pi6Var.f149125y = str4;
            pi6Var.f149122v = z;
            pi6Var.f149102b = user;
            if (i == 0) {
                newConversationItemView.m41766i4(pi6Var);
                return;
            }
            if (i == 2) {
                newConversationItemView.m41770m4(pi6Var);
            } else if (i == 1) {
                newConversationItemView.m41777t4(pi6Var);
            } else if (i == 3) {
                newConversationItemView.m41771n4(this);
            }
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return i < this.f154886h.size() ? this.f154886h.get(i) : Conversation.new_();
    }

    /* JADX INFO: renamed from: H */
    public final void m174975H(List<Conversation> list, List<User> list2, List<Conversation> list3) {
        int size;
        int i;
        m174976I();
        if (!vwb.m200296J(list)) {
            this.f154881c = 0;
            this.f154882d = list.size() > 3 ? 4 : -1;
            for (int i2 = 0; i2 < Math.min(3, list.size()); i2++) {
                this.f154888j.add(list.get(i2));
            }
        }
        if (!vwb.m200296J(list2)) {
            if (this.f154881c == -1) {
                i = 0;
            } else {
                int size2 = this.f154882d;
                if (size2 == -1) {
                    size2 = list.size();
                }
                i = size2 + 1;
            }
            this.f154883e = i;
            for (int i3 = 0; i3 < list2.size(); i3++) {
                this.f154889k.add(Conversation.new_());
            }
        }
        if (vwb.m200296J(list3)) {
            return;
        }
        int i4 = this.f154883e;
        if (i4 != -1) {
            size = i4 + list2.size() + 1;
        } else if (this.f154881c == -1) {
            size = 0;
        } else {
            int i5 = this.f154882d;
            size = i5 == -1 ? list.size() + 1 : i5 + 1;
        }
        this.f154884f = size;
        int iMin = Math.min(3, list3.size());
        this.f154885g = list3.size() > 3 ? this.f154884f + 4 : -1;
        for (int i6 = 0; i6 < iMin; i6++) {
            this.f154890l.add(list3.get(i6));
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m174976I() {
        this.f154881c = -1;
        this.f154882d = -1;
        this.f154883e = -1;
        this.f154884f = -1;
        this.f154885g = -1;
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m174977J(int i, View view) {
        if (NullChecker.m81303a(this.f154897s)) {
            this.f154897s.mo112185a(i == 5);
        }
    }

    /* JADX INFO: renamed from: K */
    public void m174978K(List<Conversation> list, List<User> list2, List<Conversation> list3, List<Message> list4) {
        this.f154886h.clear();
        this.f154888j.clear();
        this.f154889k.clear();
        this.f154890l.clear();
        this.f154891m.clear();
        this.f154891m.addAll(list4);
        int i = this.f154895q;
        if (i == ConversationSearchAct.f25953o) {
            m174975H(list, list2, list3);
            if (this.f154881c != -1) {
                this.f154886h.add(Conversation.new_());
            }
            this.f154886h.addAll(this.f154888j);
            if (this.f154882d != -1) {
                this.f154886h.add(Conversation.new_());
            }
            if (this.f154883e != -1) {
                this.f154886h.add(Conversation.new_());
            }
            this.f154887i.clear();
            if (!vwb.m200296J(list2)) {
                this.f154887i.addAll(list2);
            }
            this.f154886h.addAll(this.f154889k);
            if (this.f154884f != -1) {
                this.f154886h.add(Conversation.new_());
            }
            this.f154886h.addAll(this.f154890l);
            if (this.f154885g != -1) {
                this.f154886h.add(Conversation.new_());
            }
        } else if (i == ConversationSearchAct.f25951m) {
            this.f154888j = list;
            if (!vwb.m200296J(list)) {
                this.f154886h.addAll(this.f154888j);
            }
        } else if (i == ConversationSearchAct.f25952n) {
            this.f154890l = list3;
            if (!vwb.m200296J(list3)) {
                this.f154886h.add(Conversation.new_());
                this.f154884f = 0;
                this.f154886h.addAll(this.f154890l);
            }
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: L */
    public void m174979L(String str) {
        this.f154894p = str;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f154895q == ConversationSearchAct.f25953o) {
            if (i == this.f154881c) {
                return 4;
            }
            if (i == this.f154882d) {
                return 5;
            }
            if (i == this.f154883e) {
                return 6;
            }
            if (i == this.f154884f) {
                return 7;
            }
            if (i == this.f154885g) {
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
        if (ml6.m155116a(item)) {
            return 2;
        }
        if (fap.m120257k(item)) {
            return 3;
        }
        return TextUtils.equals(ConversationType.virtualvoice, item.convType) ? 9 : 0;
    }

    @Override // p149l.p36
    /* JADX INFO: renamed from: h */
    public int mo41519h() {
        return this.f154886h.size();
    }

    @Override // p149l.p36
    /* JADX INFO: renamed from: k */
    public List<Conversation> mo41520k() {
        return this.f154886h;
    }

    @Override // p149l.p36
    /* JADX INFO: renamed from: o */
    public int mo41522o() {
        return -1;
    }

    @Override // p149l.p36
    /* JADX INFO: renamed from: q */
    public void mo41523q() {
        notifyDataSetChanged();
    }

    @Override // p149l.p36
    /* JADX INFO: renamed from: v */
    public C22306c<Boolean> mo41524v() {
        return C22306c.just(Boolean.TRUE);
    }
}
