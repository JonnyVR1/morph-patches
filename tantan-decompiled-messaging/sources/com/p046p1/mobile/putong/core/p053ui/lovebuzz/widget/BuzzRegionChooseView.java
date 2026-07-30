package com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.buzz.R$string;
import com.p046p1.mobile.putong.core.data.Item;
import com.p046p1.mobile.putong.core.data.LoveBuzzData;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzRegionChooseView;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.tencent.open.SocialConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VCheckBox;
import p147v.VFrame;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.b2s;
import p149l.dac0;
import p149l.fp3;
import p149l.g9w;
import p149l.gp3;
import p149l.h6c0;
import p149l.hvc0;
import p149l.j8w;
import p149l.o7r;
import p149l.p9w;
import p149l.qhy;
import p149l.t49;
import p149l.v4c0;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001:\u0002\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010)\u001a\u00020#8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010,\u001a\u00020\u001b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b*\u0010\u001f\"\u0004\b+\u0010!¨\u0006-"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "b", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/qhy;", OMSTemplateType.dialog, "", "c", "(Lcom/p1/mobile/android/app/Act;Ll/qhy;)V", Constants.INAPP_DATA_TAG, "()V", "Lv/VText;", "a", "Lv/VText;", "get_desc", "()Lv/VText;", "set_desc", "(Lv/VText;)V", "_desc", "Lv/VRecyclerView;", "Lv/VRecyclerView;", "get_recycler_view", "()Lv/VRecyclerView;", "set_recycler_view", "(Lv/VRecyclerView;)V", "_recycler_view", "get_set_up", "set_set_up", "_set_up", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class BuzzRegionChooseView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VText _desc;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRecyclerView _recycler_view;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _set_up;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzRegionChooseView$a */
    @Metadata(m87231d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$a;", "", "Ll/gp3;", Item.TYPE, "", "a", "(Ll/gp3;)Z", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public interface InterfaceC8429a {
        /* JADX INFO: renamed from: a */
        boolean mo47173a(@Nullable gp3 item);
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzRegionChooseView$b */
    @Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001d\u0010\u001cR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b!\u0010\u001c\"\u0004\b\"\u0010#R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$b;", "Ll/dac0;", "Ll/gp3;", "", "mData", "", "selectMCC", "<init>", "(Ljava/util/List;I)V", "Landroid/view/ViewGroup;", "parent", "itemViewType", "Landroid/view/View;", "D", "(Landroid/view/ViewGroup;I)Landroid/view/View;", "convertView", Item.TYPE, "position", "", "F", "(Landroid/view/View;Ll/gp3;II)V", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "J", "(Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$a;)V", "H", "(I)Ll/gp3;", b2s.C_ZONE, "()I", "getItemCount", "c", "Ljava/util/List;", Constants.INAPP_DATA_TAG, "I", "setSelectMCC", "(I)V", "e", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$a;", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8430b extends dac0<gp3> {

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        @NotNull
        public List<gp3> mData;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public int selectMCC;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @Nullable
        public InterfaceC8429a listener;

        public C8430b(@NotNull List<gp3> list, int i) {
            list.getClass();
            this.mData = list;
            this.selectMCC = i;
        }

        /* JADX INFO: renamed from: G */
        public static final void m47175G(C8430b c8430b, gp3 gp3Var, View view) {
            InterfaceC8429a interfaceC8429a = c8430b.listener;
            if (Intrinsics.m87488d(interfaceC8429a != null ? Boolean.valueOf(interfaceC8429a.mo47173a(gp3Var)) : null, Boolean.TRUE)) {
                c8430b.selectMCC = gp3Var != null ? gp3Var.getMcc() : -1;
                c8430b.notifyDataSetChanged();
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            return this.mData.size();
        }

        @Override // p149l.dac0
        @NotNull
        /* JADX INFO: renamed from: D */
        public View mo28825D(@NotNull ViewGroup parent, int itemViewType) {
            parent.getClass();
            View viewInflate = o7r.m163037a(parent.getContext()).inflate(h6c0.f106045v, parent, false);
            viewInflate.getClass();
            return viewInflate;
        }

        @Override // p149l.dac0
        @SuppressLint({"NotifyDataSetChanged"})
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(@NotNull View convertView, @Nullable final gp3 item, int itemViewType, int position) {
            convertView.getClass();
            VFrame vFrame = convertView instanceof VFrame ? (VFrame) convertView : null;
            TextView textView = vFrame != null ? (TextView) vFrame.findViewById(v4c0.f179902i) : null;
            if (textView == null) {
                textView = null;
            }
            if (textView != null) {
                textView.setText(item != null ? item.getRegionName() : null);
            }
            VCheckBox vCheckBox = vFrame != null ? (VCheckBox) vFrame.findViewById(v4c0.f179901h) : null;
            VCheckBox vCheckBox2 = vCheckBox != null ? vCheckBox : null;
            if (vCheckBox2 != null) {
                boolean z = false;
                if (item != null && item.getMcc() == this.selectMCC) {
                    z = true;
                }
                vCheckBox2.setChecked(z);
            }
            if (vFrame != null) {
                xdl0.m208329E0(vFrame, new View.OnClickListener() { // from class: l.ep3
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        BuzzRegionChooseView.C8430b.m47175G(this.f92534a, item, view);
                    }
                });
            }
        }

        @Override // p149l.dac0
        @Nullable
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public gp3 getItem(int position) {
            if (position >= this.mData.size()) {
                return null;
            }
            return this.mData.get(position);
        }

        /* JADX INFO: renamed from: I, reason: from getter */
        public final int getSelectMCC() {
            return this.selectMCC;
        }

        /* JADX INFO: renamed from: J */
        public final void m47179J(@NotNull InterfaceC8429a listener) {
            listener.getClass();
            this.listener = listener;
        }

        @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mData.size();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.widget.BuzzRegionChooseView$c */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m87232d2 = {"com/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$c", "Lcom/p1/mobile/putong/core/ui/lovebuzz/widget/BuzzRegionChooseView$a;", "Ll/gp3;", Item.TYPE, "", "a", "(Ll/gp3;)Z", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8431c implements InterfaceC8429a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qhy f30207a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f30208b;

        public C8431c(qhy qhyVar, Act act) {
            this.f30207a = qhyVar;
            this.f30208b = act;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.BuzzRegionChooseView.InterfaceC8429a
        /* JADX INFO: renamed from: a */
        public boolean mo47173a(gp3 item) {
            p9w.INSTANCE.m167945n0();
            if (item == null) {
                return false;
            }
            if (item.getMcc() == -1 || item.getMcc() == -1 || !t49.m187150d() || !xma.m210071e4()) {
                return true;
            }
            qhy qhyVar = this.f30207a;
            if (qhyVar != null && qhyVar.m174611d()) {
                this.f30207a.m174609b();
            }
            CoreModule.f17554l.m94651a().mo33572qm(this.f30208b, "p_buzz_area_screening_popup,e_buzz_region_choose,click", Privilege.loveBuzz, null);
            return false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BuzzRegionChooseView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        LayoutInflater layoutInflaterM163037a = o7r.m163037a(getContext());
        layoutInflaterM163037a.getClass();
        m47170b(layoutInflaterM163037a, this);
    }

    /* JADX INFO: renamed from: a */
    public static void m47169a(C8430b c8430b, qhy qhyVar, View view) {
        p9w.INSTANCE.m167954s0();
        j8w.INSTANCE.m140473a().m140425J0(c8430b.getSelectMCC());
        if (qhyVar == null || !qhyVar.m174611d()) {
            return;
        }
        qhyVar.m174609b();
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final View m47170b(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM122556b = fp3.m122556b(this, inflater, parent);
        viewM122556b.getClass();
        return viewM122556b;
    }

    /* JADX INFO: renamed from: c */
    public final void m47171c(@NotNull Act act, @Nullable final qhy dialog) {
        act.getClass();
        setOrientation(1);
        j8w.Companion companion = j8w.INSTANCE;
        LoveBuzzData loveBuzzDataM140468v0 = companion.m140473a().m140468v0();
        final C8430b c8430b = new C8430b(g9w.INSTANCE.m124856g(loveBuzzDataM140468v0 != null ? loveBuzzDataM140468v0.allowedMCCSwitchList : null), companion.m140473a().m140467u0());
        get_recycler_view().setAdapter(c8430b);
        m47172d();
        c8430b.m47179J(new C8431c(dialog, act));
        xdl0.m208329E0(get_set_up(), new View.OnClickListener() { // from class: l.dp3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BuzzRegionChooseView.m47169a(c8430b, dialog, view);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public final void m47172d() {
        LoveBuzzData loveBuzzDataM140468v0 = j8w.INSTANCE.m140473a().m140468v0();
        if (loveBuzzDataM140468v0 == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : loveBuzzDataM140468v0.enabledBuzz) {
            if (TextUtils.equals(str, "voiceBuzz")) {
                sb.append(hvc0.m133156c(R$string.f20180O));
                sb.append("/");
            } else if (TextUtils.equals(str, "videoBuzz")) {
                sb.append(hvc0.m133156c(R$string.f20184Q));
                sb.append("/");
            } else if (TextUtils.equals(str, "memojiBuzz")) {
                sb.append(hvc0.m133156c(R$string.f20182P));
                sb.append("/");
            }
        }
        int iLastIndexOf = sb.lastIndexOf("/");
        if (iLastIndexOf > 0) {
            String strSubstring = sb.substring(0, iLastIndexOf);
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            VText vText = get_desc();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strM133156c = hvc0.m133156c(R$string.f20178N);
            strM133156c.getClass();
            vText.setText(String.format(strM133156c, Arrays.copyOf(new Object[]{strSubstring}, 1)));
        }
    }

    @NotNull
    public final VText get_desc() {
        VText vText = this._desc;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_desc");
        return null;
    }

    @NotNull
    public final VRecyclerView get_recycler_view() {
        VRecyclerView vRecyclerView = this._recycler_view;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_recycler_view");
        return null;
    }

    @NotNull
    public final VText get_set_up() {
        VText vText = this._set_up;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_set_up");
        return null;
    }

    public final void set_desc(@NotNull VText vText) {
        vText.getClass();
        this._desc = vText;
    }

    public final void set_recycler_view(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._recycler_view = vRecyclerView;
    }

    public final void set_set_up(@NotNull VText vText) {
        vText.getClass();
        this._set_up = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BuzzRegionChooseView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }
}
