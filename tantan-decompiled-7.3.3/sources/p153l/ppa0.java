package p153l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.data.IntlProfileInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VFrame;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001a\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010C\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, m88121d2 = {"Ll/ppa0;", "Ll/jic0;", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "", "data", "", "multipleChoice", "<init>", "(Ljava/util/List;Z)V", "", "K", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "F", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "itemViewType", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/IntlProfileInfo;II)V", "J", "(I)Lcom/p1/mobile/putong/data/IntlProfileInfo;", c4s.C_ZONE, "()I", "Ll/ppa0$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "L", "(Ll/ppa0$a;)V", "I", "c", "Ljava/util/List;", "getData", "()Ljava/util/List;", Constants.INAPP_DATA_TAG, "Z", "getMultipleChoice", "()Z", "Lv/VFrame;", "e", "Lv/VFrame;", "get_config_root", "()Lv/VFrame;", "set_config_root", "(Lv/VFrame;)V", "_config_root", "Lv/VText;", "f", "Lv/VText;", "get_key_name", "()Lv/VText;", "set_key_name", "(Lv/VText;)V", "_key_name", "g", "Landroid/view/View;", "get_selected_icon", "()Landroid/view/View;", "set_selected_icon", "(Landroid/view/View;)V", "_selected_icon", "h", "Ll/ppa0$a;", "a", "profile_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public final class ppa0 extends jic0<IntlProfileInfo> {

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final List<IntlProfileInfo> data;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean multipleChoice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VFrame _config_root;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _key_name;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _selected_icon;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public InterfaceC19413a listener;

    /* JADX INFO: renamed from: l.ppa0$a */
    @Metadata(m88120d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m88121d2 = {"Ll/ppa0$a;", "", "", "multipleChoice", "", "a", "(Z)V", "profile_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public interface InterfaceC19413a {
        /* JADX INFO: renamed from: a */
        void mo173187a(boolean multipleChoice);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ppa0(@NotNull List<? extends IntlProfileInfo> list, boolean z) {
        list.getClass();
        this.data = list;
        this.multipleChoice = z;
    }

    /* JADX INFO: renamed from: H */
    public static final void m173180H(ppa0 ppa0Var, IntlProfileInfo intlProfileInfo, View view) {
        if (!ppa0Var.multipleChoice) {
            ppa0Var.m173181K();
            intlProfileInfo.selected = true;
            InterfaceC19413a interfaceC19413a = ppa0Var.listener;
            if (interfaceC19413a != null) {
                interfaceC19413a.mo173187a(ppa0Var.multipleChoice);
                return;
            }
            return;
        }
        if (ppa0Var.m173184I() == 1 && intlProfileInfo.selected) {
            return;
        }
        intlProfileInfo.selected = !intlProfileInfo.selected;
        InterfaceC19413a interfaceC19413a2 = ppa0Var.listener;
        if (interfaceC19413a2 != null) {
            interfaceC19413a2.mo173187a(ppa0Var.multipleChoice);
        }
        ppa0Var.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    private final void m173181K() {
        for (IntlProfileInfo intlProfileInfo : this.data) {
            if (intlProfileInfo.selected) {
                intlProfileInfo.selected = false;
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
        LayoutInflater layoutInflaterM171370a = p9r.m171370a(parent != null ? parent.getContext() : null);
        layoutInflaterM171370a.getClass();
        return m173182F(layoutInflaterM171370a, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final View m173182F(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM177449b = qpa0.m177449b(this, inflater, parent);
        viewM177449b.getClass();
        return viewM177449b;
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
        TextView textView = vFrame != null ? (TextView) vFrame.findViewById(gdc0.f103643B) : null;
        if (textView == null) {
            textView = null;
        }
        if (textView != null) {
            textView.setText(rpa0.INSTANCE.m182517f(item));
        }
        View viewFindViewById = vFrame != null ? vFrame.findViewById(gdc0.f103658Q) : null;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        if (item.selected) {
            i = kbc0.f124874h;
        } else {
            i = this.multipleChoice ? kbc0.f124870g : -1;
        }
        if (viewFindViewById != null) {
            if (i == -1) {
                bnl0.m105524M(viewFindViewById, false);
            } else {
                bnl0.m105524M(viewFindViewById, true);
                viewFindViewById.setBackgroundResource(i);
            }
        }
        ViewGroup viewGroup = vFrame != null ? (ViewGroup) vFrame.findViewById(gdc0.f103676e) : null;
        ViewGroup viewGroup2 = viewGroup != null ? viewGroup : null;
        if (viewGroup2 != null) {
            bnl0.m105509E0(viewGroup2, new View.OnClickListener() { // from class: l.opa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ppa0.m173180H(this.f148428a, item, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m173184I() {
        Iterator<T> it = this.data.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((IntlProfileInfo) it.next()).selected) {
                i++;
            }
        }
        return i;
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

    /* JADX INFO: renamed from: L */
    public final void m173186L(@NotNull InterfaceC19413a listener) {
        listener.getClass();
        this.listener = listener;
    }
}
