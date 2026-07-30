package p149l;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.data.IntlProfileInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001FB\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001a\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0019\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0000¢\u0006\u0004\b$\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\"\u0010C\u001a\u00020\u00108\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010E¨\u0006G"}, m87232d2 = {"Ll/lha0;", "Ll/dac0;", "Lcom/p1/mobile/putong/data/IntlProfileInfo;", "", "data", "", "multipleChoice", "<init>", "(Ljava/util/List;Z)V", "", "K", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "F", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "", "itemViewType", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "G", "(Landroid/view/View;Lcom/p1/mobile/putong/data/IntlProfileInfo;II)V", "J", "(I)Lcom/p1/mobile/putong/data/IntlProfileInfo;", b2s.C_ZONE, "()I", "Ll/lha0$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "L", "(Ll/lha0$a;)V", "I", "c", "Ljava/util/List;", "getData", "()Ljava/util/List;", Constants.INAPP_DATA_TAG, "Z", "getMultipleChoice", "()Z", "Lv/VFrame;", "e", "Lv/VFrame;", "get_config_root", "()Lv/VFrame;", "set_config_root", "(Lv/VFrame;)V", "_config_root", "Lv/VText;", "f", "Lv/VText;", "get_key_name", "()Lv/VText;", "set_key_name", "(Lv/VText;)V", "_key_name", "g", "Landroid/view/View;", "get_selected_icon", "()Landroid/view/View;", "set_selected_icon", "(Landroid/view/View;)V", "_selected_icon", "h", "Ll/lha0$a;", "a", "profile_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class lha0 extends dac0<IntlProfileInfo> {

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
    public InterfaceC18222a listener;

    /* JADX INFO: renamed from: l.lha0$a */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m87232d2 = {"Ll/lha0$a;", "", "", "multipleChoice", "", "a", "(Z)V", "profile_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC18222a {
        /* JADX INFO: renamed from: a */
        void mo149840a(boolean multipleChoice);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public lha0(@NotNull List<? extends IntlProfileInfo> list, boolean z) {
        list.getClass();
        this.data = list;
        this.multipleChoice = z;
    }

    /* JADX INFO: renamed from: H */
    public static final void m149833H(lha0 lha0Var, IntlProfileInfo intlProfileInfo, View view) {
        if (!lha0Var.multipleChoice) {
            lha0Var.m149834K();
            intlProfileInfo.selected = true;
            InterfaceC18222a interfaceC18222a = lha0Var.listener;
            if (interfaceC18222a != null) {
                interfaceC18222a.mo149840a(lha0Var.multipleChoice);
                return;
            }
            return;
        }
        if (lha0Var.m149837I() == 1 && intlProfileInfo.selected) {
            return;
        }
        intlProfileInfo.selected = !intlProfileInfo.selected;
        InterfaceC18222a interfaceC18222a2 = lha0Var.listener;
        if (interfaceC18222a2 != null) {
            interfaceC18222a2.mo149840a(lha0Var.multipleChoice);
        }
        lha0Var.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    private final void m149834K() {
        for (IntlProfileInfo intlProfileInfo : this.data) {
            if (intlProfileInfo.selected) {
                intlProfileInfo.selected = false;
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
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(parent != null ? parent.getContext() : null);
        layoutInflaterM163037a.getClass();
        return m149835F(layoutInflaterM163037a, parent);
    }

    @NotNull
    /* JADX INFO: renamed from: F */
    public final View m149835F(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM154614b = mha0.m154614b(this, inflater, parent);
        viewM154614b.getClass();
        return viewM154614b;
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
        TextView textView = vFrame != null ? (TextView) vFrame.findViewById(a5c0.f67648B) : null;
        if (textView == null) {
            textView = null;
        }
        if (textView != null) {
            textView.setText(nha0.INSTANCE.m159391f(item));
        }
        View viewFindViewById = vFrame != null ? vFrame.findViewById(a5c0.f67663Q) : null;
        if (viewFindViewById == null) {
            viewFindViewById = null;
        }
        if (item.selected) {
            i = e3c0.f89111h;
        } else {
            i = this.multipleChoice ? e3c0.f89107g : -1;
        }
        if (viewFindViewById != null) {
            if (i == -1) {
                xdl0.m208344M(viewFindViewById, false);
            } else {
                xdl0.m208344M(viewFindViewById, true);
                viewFindViewById.setBackgroundResource(i);
            }
        }
        ViewGroup viewGroup = vFrame != null ? (ViewGroup) vFrame.findViewById(a5c0.f67681e) : null;
        ViewGroup viewGroup2 = viewGroup != null ? viewGroup : null;
        if (viewGroup2 != null) {
            xdl0.m208329E0(viewGroup2, new View.OnClickListener() { // from class: l.kha0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    lha0.m149833H(this.f123126a, item, view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I */
    public final int m149837I() {
        Iterator<T> it = this.data.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((IntlProfileInfo) it.next()).selected) {
                i++;
            }
        }
        return i;
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

    /* JADX INFO: renamed from: L */
    public final void m149839L(@NotNull InterfaceC18222a listener) {
        listener.getClass();
        this.listener = listener;
    }
}
