package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.IntlGreetAct;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.item.IntlItemGreetingTip;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemBase;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010!\n\u0002\b\u0005\u0018\u0000 -2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001.B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\u001d\u0010\u0012\u001a\u00020\u00112\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001c\u001a\u00020\n¢\u0006\u0004\b\u001d\u0010\u001bJ/\u0010 \u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006/"}, m88121d2 = {"Ll/oon;", "Ll/a;", "Lcom/p1/mobile/putong/core/data/Message;", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", SocialConstants.PARAM_ACT, "Landroid/widget/ListView;", "listView", "<init>", "(Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;Landroid/widget/ListView;)V", "message", "", "position", Constants.KEY_T, "(Lcom/p1/mobile/putong/core/data/Message;I)I", "w", "", "messages", "", BaseSei.f14626Z, "(Ljava/util/List;)V", "p", "()Ljava/util/List;", "Landroid/view/ViewGroup;", "parent", "itemViewType", "Landroid/view/View;", "m", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "type", BaseSei.f14625Y, "convertView", Item.TYPE, BLiveStormDanmakuGiftResourceType.f45294s, "(Landroid/view/View;Lcom/p1/mobile/putong/core/data/Message;II)V", "getViewTypeCount", "()I", "getItemViewType", "(I)I", "c", "Lcom/p1/mobile/putong/core/ui/intl/greet/IntlGreetAct;", Constants.INAPP_DATA_TAG, "Landroid/widget/ListView;", "", "e", "Ljava/util/List;", "Companion", "a", "message_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class oon extends AbstractC15610a<Message> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final IntlGreetAct act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final ListView listView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final List<Message> messages;

    public oon(@NotNull IntlGreetAct intlGreetAct, @NotNull ListView listView) {
        intlGreetAct.getClass();
        listView.getClass();
        this.act = intlGreetAct;
        this.listView = listView;
        this.messages = new ArrayList();
    }

    /* JADX INFO: renamed from: t */
    private final int m168594t(Message message, int position) {
        return m168595w(message, position);
    }

    /* JADX INFO: renamed from: w */
    private final int m168595w(Message message, int position) {
        if (TEnum.equals(message.messageType, MessageType.local_meet_reply)) {
            return 2;
        }
        if (TEnum.equals(message.messageType, MessageType.local_greeting_agree_match)) {
            return 3;
        }
        return !message.isOtherUser() ? 1 : 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int position) {
        Message item = getItem(position);
        item.getClass();
        return m168594t(item, position);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 4;
    }

    @Override // p153l.dq1
    @NotNull
    /* JADX INFO: renamed from: m */
    public View mo21402m(@NotNull ViewGroup parent, int itemViewType) {
        parent.getClass();
        if (itemViewType != 2 && itemViewType != 3) {
            return m168597y(parent, itemViewType);
        }
        View viewInflate = LayoutInflater.from(this.act).inflate(qec0.f156924Q0, (ViewGroup) null);
        viewInflate.getClass();
        return viewInflate;
    }

    @Override // p153l.AbstractC15610a
    @NotNull
    /* JADX INFO: renamed from: p */
    public List<Message> mo21403p() {
        return this.messages;
    }

    @Override // p153l.dq1
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public void mo21401j(@NotNull View convertView, @NotNull Message item, int itemViewType, int position) {
        convertView.getClass();
        item.getClass();
        if (itemViewType == 2 || itemViewType == 3) {
            ((IntlItemGreetingTip) convertView).mo43399A(item);
        } else {
            ((ItemBase) convertView).mo49217g(this, item, position == 0 ? null : getItem(position - 1), position != getCount() + (-1) ? getItem(position + 1) : null);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final View m168597y(@Nullable ViewGroup parent, int type) {
        boolean z = type >= 1;
        View viewInflate = this.act.inflater().inflate(z ? qec0.f157049i5 : qec0.f157042h5, parent, false);
        viewInflate.getClass();
        ItemMessageBase itemMessageBase = (ItemMessageBase) viewInflate;
        int i = qec0.f156894L5;
        if (type == 0) {
            i = qec0.f156887K5;
        }
        itemMessageBase.mo49529U(i, this.listView, 0, z);
        return itemMessageBase;
    }

    /* JADX INFO: renamed from: z */
    public final void m168598z(@Nullable List<? extends Message> messages) {
        this.messages.clear();
        List<Message> list = this.messages;
        messages.getClass();
        list.addAll(messages);
        notifyDataSetChanged();
    }
}
