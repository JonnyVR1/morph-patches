package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGiftInfoExtra;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetAct;
import com.p046p1.mobile.putong.core.p053ui.greet.GreetingItemRootLayout;
import com.p046p1.mobile.putong.core.p053ui.greet.ItemDynamicGreetAgreeMatch;
import com.p046p1.mobile.putong.core.p053ui.greet.ItemGreetAgreeMatch;
import com.p046p1.mobile.putong.core.p053ui.greet.ItemGreetRecalled;
import com.p046p1.mobile.putong.core.p053ui.greet.ItemGreetingTip;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemBase;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class tak extends AbstractC15503a<Message> {

    /* JADX INFO: renamed from: d */
    public GreetAct f169122d;

    /* JADX INFO: renamed from: e */
    public ListView f169123e;

    /* JADX INFO: renamed from: c */
    public List<Message> f169121c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f169124f = false;

    /* JADX INFO: renamed from: g */
    public rdm f169125g = new rdm();

    public tak(GreetAct greetAct, ListView listView) {
        this.f169122d = greetAct;
        this.f169123e = listView;
    }

    /* JADX INFO: renamed from: t */
    private int m187725t(Message message, int i) {
        return m187726w(message, i);
    }

    /* JADX INFO: renamed from: w */
    private int m187726w(Message message, int i) {
        Boolean bool = message.recalled;
        if (bool != null && bool.booleanValue()) {
            return 19;
        }
        if (TEnum.equals(message.messageType, MessageType.local_meet_reply)) {
            return 15;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_reply)) {
            return 12;
        }
        if (TEnum.equals(message.messageType, MessageType.local_send_agreematch_notice)) {
            return 13;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_agree_match)) {
            return 14;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greet_send_notice)) {
            return 16;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greet_receive_match_tip)) {
            return 17;
        }
        if (TEnum.equals(message.messageType(), MessageType.local_break_ice)) {
            return 19;
        }
        if (TEnum.equals(message.messageType, MessageType.local_dynamic_greeting_agree_match)) {
            return 20;
        }
        if (message.isOtherUser()) {
            if (!TEnum.equals(message.messageType, MessageType.chat_gift)) {
                return TEnum.equals(message.messageType, MessageType.state_like) ? 3 : 0;
            }
            ChatGiftInfoExtra chatGiftInfoExtraM174047c = qdm.m174047c(message);
            return (CoreModule.m29935P().m94658i().mo158399k0() && NullChecker.m81303a(chatGiftInfoExtraM174047c) && chatGiftInfoExtraM174047c.needOpen) ? 2 : 1;
        }
        if (!TEnum.equals(message.messageType(), MessageType.chat_gift)) {
            return TEnum.equals(message.messageType, MessageType.state_like) ? 9 : 6;
        }
        ChatGiftInfoExtra chatGiftInfoExtraM174047c2 = qdm.m174047c(message);
        return (CoreModule.m29935P().m94658i().mo158399k0() && NullChecker.m81303a(chatGiftInfoExtraM174047c2) && chatGiftInfoExtraM174047c2.needOpen) ? 8 : 7;
    }

    /* JADX INFO: renamed from: z */
    private View m187727z(ViewGroup viewGroup, int i) {
        if (i == 12 || i == 13 || i == 15 || i == 16 || i == 17) {
            return o7r.m163037a(this.f169122d).inflate(l6c0.f126439b0, (ViewGroup) null);
        }
        if (i == 14) {
            return o7r.m163037a(this.f169122d).inflate(l6c0.f126381S, (ViewGroup) null);
        }
        if (i == 19) {
            return o7r.m163037a(this.f169122d).inflate(l6c0.f126425Z, viewGroup, false);
        }
        return i == 20 ? o7r.m163037a(this.f169122d).inflate(l6c0.f126585w, (ViewGroup) null) : m187730y(viewGroup, i);
    }

    /* JADX INFO: renamed from: A */
    public void m187728A(List<Message> list) {
        this.f169121c.clear();
        this.f169121c.addAll(list);
        notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i) {
        return m187725t(getItem(i), i);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 21;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: m */
    public View mo20403m(ViewGroup viewGroup, int i) {
        GreetingItemRootLayout greetingItemRootLayout = (GreetingItemRootLayout) o7r.m163037a(this.f169122d).inflate(l6c0.f126432a0, (ViewGroup) null);
        greetingItemRootLayout.addView(m187727z(greetingItemRootLayout, i), 0, new LinearLayout.LayoutParams(-1, -2));
        return greetingItemRootLayout;
    }

    @Override // p149l.AbstractC15503a
    /* JADX INFO: renamed from: p */
    public List<Message> mo20404p() {
        return this.f169121c;
    }

    @Override // p149l.wp1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo20402j(View view, Message message, int i, int i2) {
        if (view instanceof GreetingItemRootLayout) {
            GreetingItemRootLayout greetingItemRootLayout = (GreetingItemRootLayout) view;
            greetingItemRootLayout.m45768m(message, i2, this, this.f169125g);
            View realRenderView = greetingItemRootLayout.getRealRenderView();
            if (i == 19) {
                ((ItemGreetRecalled) realRenderView).m45809a(message);
                return;
            }
            if (i == 12 || i == 13 || i == 15 || i == 16 || i == 17) {
                ((ItemGreetingTip) realRenderView).mo42388A(message);
                return;
            }
            if (i == 14) {
                ((ItemGreetAgreeMatch) realRenderView).mo42388A(message);
            } else if (i != 20) {
                ((ItemBase) realRenderView).mo48034g(this, message, i2 == 0 ? null : getItem(i2 - 1), i2 != getCount() - 1 ? getItem(i2 + 1) : null);
            } else {
                ((ItemDynamicGreetAgreeMatch) realRenderView).m45777z(message, this.f169122d, !this.f169124f);
                this.f169124f = true;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public View m187730y(ViewGroup viewGroup, int i) {
        boolean z = i >= 6;
        ItemMessageBase itemMessageBase = (ItemMessageBase) this.f169122d.inflater().inflate(z ? l6c0.f126493i5 : l6c0.f126486h5, viewGroup, false);
        int i2 = l6c0.f126338L5;
        if (i == 0) {
            i2 = l6c0.f126331K5;
        } else if (i == 1) {
            i2 = l6c0.f126601y1;
        } else if (i == 7) {
            i2 = l6c0.f126608z1;
        } else if (i == 2) {
            i2 = l6c0.f126257A1;
        } else if (i == 8) {
            i2 = l6c0.f126264B1;
        } else if (i == 3) {
            i2 = l6c0.f126410W2;
        } else if (i == 9) {
            i2 = l6c0.f126416X2;
        } else if (i == 4) {
            i2 = l6c0.f126398U2;
        } else if (i == 10) {
            i2 = l6c0.f126404V2;
        } else if (i == 5) {
            i2 = l6c0.f126472f5;
        } else if (i == 11) {
            i2 = l6c0.f126479g5;
        }
        itemMessageBase.mo48346U(i2, this.f169123e, 0, z);
        return itemMessageBase;
    }
}
