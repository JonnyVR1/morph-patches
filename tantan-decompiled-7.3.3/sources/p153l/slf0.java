package p153l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.IntlProfileInfo;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001KB'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J3\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u0005H\u0002¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010(R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010H\u001a\u00020\u000f8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010J¨\u0006L"}, m88121d2 = {"Ll/slf0;", "Ll/jic0;", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "data", "", "multipleChoice", "<init>", "(Lcom/p1/mobile/android/app/Act;Ljava/util/List;Z)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "F", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "itemViewType", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/IntlProfileInfo;II)V", "J", "(I)Lcom/p1/mobile/putong/data/IntlProfileInfo;", c4s.C_ZONE, "()I", "Ll/slf0$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "L", "(Ll/slf0$a;)V", "K", "()V", "", "I", "()Ljava/util/List;", "c", "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "Ljava/util/List;", "getData", "e", "Z", "Lv/VFrame;", "f", "Lv/VFrame;", "get_config_root", "()Lv/VFrame;", "set_config_root", "(Lv/VFrame;)V", "_config_root", "Lv/VText;", "g", "Lv/VText;", "get_key_name", "()Lv/VText;", "set_key_name", "(Lv/VText;)V", "_key_name", "h", "Landroid/view/View;", "get_selected_icon", "()Landroid/view/View;", "set_selected_icon", "(Landroid/view/View;)V", "_selected_icon", RXScreenCaptureService.KEY_INDEX, "Ll/slf0$a;", "a", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class slf0 extends jic0<IntlProfileInfo> {

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
    public InterfaceC20093a listener;

    /* JADX INFO: renamed from: l.slf0$a */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, m88121d2 = {"Ll/slf0$a;", "", "", "", "selectedList", "", "a", "(Ljava/util/List;)V", "b_account_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC20093a {
        /* JADX INFO: renamed from: a */
        void mo126139a(@NotNull List<String> selectedList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public slf0(@NotNull Act act, @NotNull List<? extends IntlProfileInfo> list, boolean z) {
        act.getClass();
        list.getClass();
        this.act = act;
        this.data = list;
        this.multipleChoice = z;
    }

    /* JADX INFO: renamed from: H */
    public static final void m186565H(slf0 slf0Var, IntlProfileInfo intlProfileInfo, View view) {
        boolean z = slf0Var.multipleChoice;
        if (z || !intlProfileInfo.selected) {
            if (z && intlProfileInfo.selected && slf0Var.m186568I().size() == 1) {
                return;
            }
            if (!slf0Var.multipleChoice) {
                slf0Var.m186570K();
            }
            intlProfileInfo.selected = !intlProfileInfo.selected;
            slf0Var.notifyDataSetChanged();
            InterfaceC20093a interfaceC20093a = slf0Var.listener;
            if (interfaceC20093a != null) {
                interfaceC20093a.mo126139a(slf0Var.m186568I());
            }
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int mo29823C() {
        return this.data.size();
    }

    @Override // p153l.jic0
    @NotNull
    /* JADX INFO: renamed from: D */
    public View mo29824D(@Nullable ViewGroup parent, int itemViewType) {
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(this.act);
        layoutInflaterM171370a.getClass();
        return m186566F(layoutInflaterM171370a, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final View m186566F(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM191636b = tlf0.m191636b(this, inflater, parent);
        viewM191636b.getClass();
        return viewM191636b;
    }

    @Override // p153l.jic0
    @SuppressLint({"NotifyDataSetChanged"})
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo29822A(@Nullable View convertView, @Nullable final IntlProfileInfo item, int itemViewType, int position) {
        int i;
        if (item == null) {
            return;
        }
        VFrame vFrame = convertView instanceof VFrame ? (VFrame) convertView : null;
        TextView textView = vFrame != null ? (TextView) vFrame.findViewById(wcc0.f188406B) : null;
        if (textView == null) {
            textView = null;
        }
        if (textView != null) {
            textView.setText(mdp.INSTANCE.m157987i(item));
        }
        View viewFindViewById = vFrame != null ? vFrame.findViewById(wcc0.f188418N) : null;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        if (item.selected) {
            i = bbc0.f75824N1;
        } else {
            i = this.multipleChoice ? bbc0.f75821M1 : -1;
        }
        if (viewFindViewById != null) {
            if (i == -1) {
                bnl0.m105524M(viewFindViewById, false);
            } else {
                bnl0.m105524M(viewFindViewById, true);
                viewFindViewById.setBackgroundResource(i);
            }
        }
        ViewGroup viewGroup = vFrame != null ? (ViewGroup) vFrame.findViewById(wcc0.f188449j) : null;
        ViewGroup viewGroup2 = viewGroup != null ? viewGroup : null;
        if (viewGroup2 != null) {
            bnl0.m105509E0(viewGroup2, new View.OnClickListener() { // from class: l.rlf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    slf0.m186565H(this.f163759a, item, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final List<String> m186568I() {
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

    @Override // p153l.jic0
    @Nullable
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public IntlProfileInfo getItem(int position) {
        if (position < this.data.size()) {
            return this.data.get(position);
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    public final void m186570K() {
        for (IntlProfileInfo intlProfileInfo : this.data) {
            if (intlProfileInfo.selected) {
                intlProfileInfo.selected = false;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m186571L(@NotNull InterfaceC20093a listener) {
        listener.getClass();
        this.listener = listener;
    }
}
