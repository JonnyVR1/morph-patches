package p149l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.IntlProfileInfo;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0005H\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, m87232d2 = {"Ll/ldf0;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "data", "", "multipleChoice", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "F", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "itemViewType", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/IntlProfileInfo;II)V", "J", "(I)Lcom/p1/mobile/putong/data/IntlProfileInfo;", b2s.C_ZONE, "()I", "Ll/ldf0$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "L", "(Ll/ldf0$a;)V", "K", "()V", "", "I", "()Ljava/util/List;", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "getData", "e", "Z", "Lv/VFrame;", "f", "Lv/VFrame;", "get_config_root", "()Lv/VFrame;", "set_config_root", "(Lv/VFrame;)V", "_config_root", "Lv/VText;", "g", "Lv/VText;", "get_key_name", "()Lv/VText;", "set_key_name", "(Lv/VText;)V", "_key_name", "h", "Landroid/view/View;", "get_selected_icon", "()Landroid/view/View;", "set_selected_icon", "(Landroid/view/View;)V", "_selected_icon", RXScreenCaptureService.KEY_INDEX, "Ll/ldf0$a;", "a", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class ldf0 extends dac0<IntlProfileInfo> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final List<IntlProfileInfo> data;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean multipleChoice;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VFrame _config_root;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _key_name;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public View _selected_icon;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    public InterfaceC18197a listener;

    /* JADX INFO: renamed from: l.ldf0$a */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m87232d2 = {"Ll/ldf0$a;", "", "", "", "selectedList", "", "a", "(Ljava/util/List;)V", "b_account_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC18197a {
        /* JADX INFO: renamed from: a */
        void mo149441a(@NotNull List<String> selectedList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ldf0(@NotNull Act act, @NotNull List<? extends IntlProfileInfo> list, boolean z) {
        act.getClass();
        list.getClass();
        this.act = act;
        this.data = list;
        this.multipleChoice = z;
    }

    /* JADX INFO: renamed from: H */
    public static final void m149434H(ldf0 ldf0Var, IntlProfileInfo intlProfileInfo, View view) {
        boolean z = ldf0Var.multipleChoice;
        if (z || !intlProfileInfo.selected) {
            if (z && intlProfileInfo.selected && ldf0Var.m149437I().size() == 1) {
                return;
            }
            if (!ldf0Var.multipleChoice) {
                ldf0Var.m149439K();
            }
            intlProfileInfo.selected = !intlProfileInfo.selected;
            ldf0Var.notifyDataSetChanged();
            InterfaceC18197a interfaceC18197a = ldf0Var.listener;
            if (interfaceC18197a != null) {
                interfaceC18197a.mo149441a(ldf0Var.m149437I());
            }
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int mo28824C() {
        return this.data.size();
    }

    @Override // p149l.dac0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo28825D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(this.act);
        layoutInflaterM163037a.getClass();
        return m149435F(layoutInflaterM163037a, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final View m149435F(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM154060b = mdf0.m154060b(this, inflater, parent);
        viewM154060b.getClass();
        return viewM154060b;
    }

    @Override // p149l.dac0
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo28823A(@Nullable View convertView, @Nullable final IntlProfileInfo item, int itemViewType, int position) {
        int i;
        if (item == null) {
            return;
        }
        VFrame vFrame = convertView instanceof VFrame ? (VFrame) convertView : null;
        TextView textView = vFrame != null ? (TextView) vFrame.findViewById(q4c0.f152558B) : null;
        if (textView == null) {
            textView = null;
        }
        if (textView != null) {
            textView.setText(mbp.INSTANCE.m153970i(item));
        }
        View viewFindViewById = vFrame != null ? vFrame.findViewById(q4c0.f152570N) : null;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        if (item.selected) {
            i = v2c0.f179418N1;
        } else {
            i = this.multipleChoice ? v2c0.f179415M1 : -1;
        }
        if (viewFindViewById != null) {
            if (i == -1) {
                xdl0.m208344M(viewFindViewById, false);
            } else {
                xdl0.m208344M(viewFindViewById, true);
                viewFindViewById.setBackgroundResource(i);
            }
        }
        ViewGroup viewGroup = vFrame != null ? (ViewGroup) vFrame.findViewById(q4c0.f152601j) : null;
        ViewGroup viewGroup2 = viewGroup != null ? viewGroup : null;
        if (viewGroup2 != null) {
            xdl0.m208329E0(viewGroup2, new View.OnClickListener() { // from class: l.kdf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ldf0.m149434H(this.f122555a, item, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final List<String> m149437I() {
        List<IntlProfileInfo> list = this.data;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((IntlProfileInfo) obj).selected) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((IntlProfileInfo) it.next()).key);
        }
        return arrayList2;
    }

    @Override // p149l.dac0
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public IntlProfileInfo getItem(int position) {
        if (position < this.data.size()) {
            return this.data.get(position);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m149439K() {
        for (IntlProfileInfo intlProfileInfo : this.data) {
            if (intlProfileInfo.selected) {
                intlProfileInfo.selected = false;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m149440L(@NotNull InterfaceC18197a listener) {
        listener.getClass();
        this.listener = listener;
    }
}
